.data
	String: .string "val1: %d\nval2: %ld\n"

.global swap, main
swap:
	pushq %rbp
	movq %rsp, %rbp
	subq $16, %rsp

						/*rdi = &struct*/
	movq 8(%rdi), %r8	/*r8 == temp*/
	movb (%rdi), %r9b	/*r9 = *v->val1*/
	movsbq %r9b, %r10	/*v->val2 = r9*/
	movq %r10, 8(%rdi)
	movb %r8b , (%rdi)	/*v->val1 = val2*/

	leave 
	ret
main:
	pushq %rbp
	movq %rsp, %rbp
	subq $48, %rsp

	/*salvar*/
	movq %r12, -8(%rbp)
	movq %r13, -16(%rbp)

	/*struct*/

	/*
	char val1 -32
	long val2 -24
	*/
	
	movb $12, -32(%rbp)		/* byte */
	movq $1245, -24(%rbp)	/* long */

	leaq -32(%rbp), %rdi
	call swap	

	leaq -32(%rbp), %r13

	/*printf*/
	movq $String, %rdi
	movsbl (%r13), %esi
	movq 8(%r13), %rdx
	movl $0, %eax
	call printf	

	/*recuperar*/
	movq -8(%rbp), %r12
	movq -16(%rbp), %r13

	leave
	ret
