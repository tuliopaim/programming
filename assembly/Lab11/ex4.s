.data
P: .string "Pos: %d\n"
N: .string "Neg: %d\n"

Nums: .int 4,-9,3,-7,1,-10,-11,15

Placar:
	.int 0 /* pos */
	.int 0 /* neg */


.global main, is_positivo

is_positivo:
	pushq %rbp
	movq %rsp, %rbp

	cmpl $0, %edi
	jg MAIOR

	movl $0, %eax
	jmp FIM

	MAIOR:

	movl $1, %eax

	FIM:

	leave
	ret

main:
	pushq %rbp
	movq %rsp, %rbp

	subq $48, %rsp

	/*salvar registradores*/
	movq %r12, -8(%rbp)
	movq %r13, -16(%rbp)
	movq %r14, -24(%rbp)
	movq %r15, -32(%rbp)

	movl $0, %r12d 				/*i = 0*/
	movq $0, %r13				/*addrs*/
	movq $Nums ,%r14			/*r14 = &nums*/
	movq $Placar, %r15		/*ponteiro placar*/

	FOR:
	cmpl $8, %r12d
	jge FIM_FOR

	/*calcular addrs*/
	movq %r12, %r13
	imulq $4, %r13
	addq %r14, %r13

	IF:
	movq (%r13), %rdi

	call is_positivo

	cmpl $0, %eax		/*se for 0 o numero é negativo*/
	je ELSE

	addl $1, (%r15)
	jmp FIM_IF

	ELSE:
	addl $1, 4(%r15)	/*aumenta 1 nos negativos*/

	FIM_IF:
	addl $1, %r12d
	jmp FOR

	FIM_FOR:

	/*printf pos*/

	movq $P, %rdi
	movl (%r15), %esi
	movl $0, %eax
	call printf

	/*printf neg*/

	movq $N, %rdi
	movl 4(%r15), %esi
	movl $0, %eax
	call printf

	/*recuperar registradores*/
	movq -8(%rbp), %r12
	movq -16(%rbp), %r13
	movq -24(%rbp), %r14
	movq -32(%rbp), %r15

	leave
	ret
