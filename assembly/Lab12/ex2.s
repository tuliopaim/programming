.data
	CARNE: 	.word 1
	LEITE: 	.word 2
	OVO: 	.word 3
	LEN: 	.int  3

	.align 8
	Produto:
		/*produtos[0]*/
		.word 0	/* +0 short produto*/
		.zero 6	/* padding */
		.quad 0	/* +8 long preco*/
		/*produtos[1]*/
		.word 0	/* +16 short produto*/
		.zero 6	/* padding */
		.quad 0	/* +24 long preco*/
		/*produtos[2]*/
		.word 0	/* +32 short produto*/
		.zero 6	/* padding */
		.quad 0	/* +40 long preco*/

	String_carne: 	.string "Carne é a mais cara\n"
	String_leite: 	.string "Leite é o mais caro\n"
	String_ovo: 	.string "Ovo é o mais caro\n"
	Teste:	.string "%d\n"

.text
.global mais_caro, main

mais_caro:
	pushq 	%rbp
	movq 	%rsp, %rbp	

	movl 	$0, %r9d	/*int i = 0;*/
	movq	$-1, %r10	/*long preco = -1;*/
	movw	$0, %r11w	/*short produto = 0;*/


	while:
	cmpl %esi, %r9d		/* while(i < size) */
	jge	fim_while

	cmpq	%r10, 8(%rdi)	/* if (ptr->preco > preco) */
	jle else

	movq	8(%rdi), %r10	/* preco = ptr->preco; */
	movw	(%rdi),%r11w	/* produto = ptr->produto; */

	else:
	
	addq $16, %rdi	/* ptr++ */
	incl %r9d		/* i++; */
	jmp while

	fim_while:

	movw %r11w, %ax

	leave
	ret

main:
	pushq %rbp
	movq %rsp, %rbp

	movq $Produto, %r12
	
	/*
	produtos[0].produto = CARNE;
	produtos[0].preco   = 100;
	*/
	
	movw CARNE, %bx
	movw %bx, (%r12)
	movq $100, 8(%r12)

	/*
	produtos[1].produto = LEITE;
	produtos[1].preco   = 150;
	*/
	
	movw LEITE, %bx
	movw %bx, 16(%r12)
	movq $150, 24(%r12)

	/*
	produtos[1].produto = OVO;
	produtos[1].preco   = 70;
	*/
	
	movw OVO, %bx
	movw %bx, 32(%r12)
	movq $70, 40(%r12)

	movq %r12, %rdi
	movl LEN, %esi

	call mais_caro

	movw %ax, %r13w

	/*if (p == CARNE) printf("Carne é a mais cara\n");*/
	cmpw %r13w, CARNE
	jne else2

	movq $String_carne, %rdi
	movl $0, %eax
	call printf
	jmp fim

	else2:
 	/*if (p == LEITE) printf("Leite é o mais caro\n");*/
 	cmpw %r13w, LEITE
	jne else3

	movq $String_leite, %rdi
	movl $0, %eax
	call printf
	jmp fim

	else3:
  	/*if (p == OVO)   printf("Ovo é o mais caro\n");*/
  	cmpw %r13w, OVO
	jne fim

	movq $String_ovo, %rdi
	movl $0, %eax
	call printf

	fim:

	leave
	ret
