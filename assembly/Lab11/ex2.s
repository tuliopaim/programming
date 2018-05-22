.global calc

calc:
	pushq %rbp
	movq %rsp, %rbp
	subq $48, %rsp

	movq %r12, -8(%rbp)
	movq %r13, -16(%rbp)
	movq %r14, -24(%rbp)
	movq %r15, -32(%rbp)

	movl %edi, %r12d  	/*r12 = a*/
	movl %esi, %r13d	/*r13 = b*/
	movl %edx, %r14d	/*r14 = c*/
	movl %ecx, %r15d 	/*r15 = d*/


	/*CHAMAR A PRIMEIRA*/
	addl $1, %edi
	addl $2, %edx
	call sum

	movl %eax, %r9d

	/*CHAMAR A SEGUNDA*/

	movl %r9d, -40(%rbp)/*salvar soma*/
	call sum
	movl -40(%rbp), %r9d

	addl %eax, %r9d

	/*CHAMAR A TERCEIRA*/
	movl %r12d ,%edi
	subl $1, %edi		/*a--*/

	movl %r13d, %esi	/* b */

	movl %r14d, %edx	/*c-2*/
	subl $2, %edx

	movl %r15d, %ecx	/* d */

	movl %r9d, -40(%rbp)	/*salvar soma*/
	call sum
	movl -40(%rbp), %r9d

	addl %eax, %r9d
	movl %r9d, %eax

	movq -32(%rbp), %r15
	movq -24(%rbp), %r14
	movq -16(%rbp), %r13
	movq -8(%rbp), %r12

	leave
	ret
