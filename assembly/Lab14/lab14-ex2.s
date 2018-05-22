.data
	String:
		.string "sum: %ld\n"

.global main
sum:
	pushq %rbp
	movq %rsp, %rbp

	movq $0, %r8 		/*r8 = temp = 0*/

	while:
	cmp $0, %esi	
	je fim_while

	subl $1, %esi		/* --size*/
	movslq %esi, %r9
	imulq $8, %r9
	addq %rdi, %r9		/*r9 = [--size]*/

	addq (%r9), %r8

	jmp while
	fim_while:	

	movq %r8, %rax

	leave
	ret

main:
	pushq %rbp
	movq %rsp, %rbp

	subq $48, %rsp

	/*struct*/

	movl $5, -48(%rbp)
	movq $4, -40(%rbp)
	movq $3, -32(%rbp)
	movq $3, -24(%rbp)
	movq $2, -16(%rbp)
	movq $2, -8(%rbp)

	leaq -40(%rbp), %rdi
	movl -48(%rbp), %esi
	call sum

	/*printf*/
	movq $String, %rdi
	movq %rax, %rsi 
	movl $0, %eax
	call printf



	leave
	ret

