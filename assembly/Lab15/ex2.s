.data
	String: .string "%s nasceu no mesmo dia de %s\n"
	ern: .string "Ernesto"
	bor: .string "Borges"
	cec: .string "Cecilia"
	debug: .string "ano: %d\n"

.text
.global main, compare

main:

	pushq %rbp
	movq %rsp, %rbp
	subq $80, %rsp

	/* ponteiro pros structs == r12 */
	leaq -48(%rbp), %r12

	/*
	pessoa_t p[0]

	p->nome -48
	p->ano 	-40
	p->mes 	-36
	p->dia	-35
	lixo 	-34
	*/

	movq $ern, 	-48(%rbp)
	movl $2002, -40(%rbp)
	movb $3,	-36(%rbp)
	movb $15,	-35(%rbp)

	/*
	pessoa_t p[1]

	p->nome -32
	p->ano 	-24
	p->mes 	-20
	p->dia	-19
	lixo 	-18
	*/

	movq $cec, 	-32(%rbp)
	movl $2001, -24(%rbp)
	movb $8,	-20(%rbp)
	movb $2,	-19(%rbp)



	/*
	pessoa_t p[2]

	p->nome -16
	p->ano 	-8
	p->mes 	-4
	p->dia	-3
	lixo 	-2
	*/

	movq $bor, 	-16(%rbp)
	movl $2002, -8(%rbp)
	movb $3,	-4(%rbp)
	movb $15,	-3(%rbp)



	/*for's*/	
	movq $0, %r14		/* i 	*/
	movq $0, %r15		/* j 	*/	

	for_i:
	cmp $3, %r14
	jge	fim_for_i

	for_j:
	cmp $3, %r15
	jge fim_for_j

	/* if (i == j) */
	cmp %r14, %r15
	je continue

	/* calcula indice i*/

	movq %r14, %r11		/* addr i 	*/
	imulq $16, %r11
	addq %r12, %r11

	movq %r11, %r8		/* p[i]	*/

	addq $8, %r11

	movq %r11, %rdi	/* passa pro primeiro parametro */

	/* calcula indice j*/

	movq %r15, %r13		/* addr j 	*/
	imulq $16, %r13
	addq %r12, %r13

	movq %r13, %r9		/* p[j]	*/

	addq $8, %r13

	movq %r13, %rsi	/* passa pro segundo parametro */

	/*if (compare(&p[i].nascimento, &p[j].nascimento)) */

	/*salvar r8,r9,r11*/
	movq %r8, -80(%rbp)
	movq %r9, -72(%rbp)
	movq %r11, -64(%rbp)

	call compare

	/*recuperar r8,r9,r11*/
	movq -80(%rbp), %r8
	movq -72(%rbp), %r9
	movq -64(%rbp), %r11

	cmp $0, %eax
	je continue


	movq $String, %rdi
	movq %r8, %rsi
	movq %r9, %rdx
	movl $0, %eax
	call printf

	continue:

	addq $1, %r15	/* j++ 	*/
	jmp for_j
	fim_for_j:
	
	addq $1, %r14	/* i++	*/
	jmp for_i

	fim_for_i:


	movl $0, %eax

	leave
	ret

compare:

	pushq %rbp
	movq %rsp, %rbp

	subq $32, %rsp

	/*salvar r12, r13, r14, r15*/
	movq %r12, -80(%rbp)
	movq %r13, -72(%rbp)
	movq %r14, -64(%rbp)
	movq %r15, -56(%rbp)


	/*d1->dia == d2->dia*/

	/* r12 = d1.dia*/
	movb 5(%rdi), %r12b

	/* r13 = d2.dia*/
	movb 5(%rsi), %r13b

	cmp %r12b, %r13b
	jne else

	/*d1->mes == d2->mes*/

	/* r12 = d1.mes*/
	movb 4(%rdi), %r12b

	/* r13 = d2.mes*/
	movb 4(%rsi), %r13b

	cmpb %r12b, %r13b
	jne else

	/*d1->ano == d2->ano*/

	/* r12 = d1.ano*/
	movl 4(%rdi), %r12d

	/* r13 = d2.ano*/
	movl 4(%rsi), %r13d

	cmpl %r12d, %r13d
	jne else


	movl $1, %eax		/* resp = 0 */	
	jmp fim

	else:
	movl $0, %eax		/* resp = 0 */
	
	fim:

	/*recuperar r12, r13, r14, r15*/
	movq -80(%rbp), %r12
	movq -72(%rbp), %r13
	movq -64(%rbp), %r14
	movq -56(%rbp), %r15


	leave
	ret
