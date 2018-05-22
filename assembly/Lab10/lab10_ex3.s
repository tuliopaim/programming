.global foo
foo:
	pushq %rbp
	movq %rsp, %rbp
	subq $16, %rsp

	movq %r13, -8(%rbp) 	/* int i*/
	movq %r14, -16(%rbp)	/* int s*/

	movl $0, %r13d			/*i = 0*/
	movl $0, %r14d			/*s = 0*/

INICIO_FOR:

	cmpl %esi, %r13d
	jge FIM_FOR

	movl %r13d, %eax
	imull $4, %eax
	addq %rdi, %rax 		/*rax = &a[i]*/

	addl (%rax), %r14d		/*s += a[i]  */	


	cmpl $0, (%rax)
	jne ELSE

	movl %r14d, (%rax)		/*a[i] = s   */
	movl $0, %r14d

	ELSE:


	addl $1, %r13d			/* i++ */
	jmp INICIO_FOR

FIM_FOR:

	movq -8(%rbp), %r13
	movq -16(%rbp), %r14

	leave
	ret

