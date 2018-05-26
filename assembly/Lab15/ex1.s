.data
	formatString: .string "%d/%d/%d"
	showString: .string "Nome: %s, nascido %s\n"
	ern: .string "Ernesto"

.text
.global main, show, format, sprintf
format:
	pushq %rbp
	movq %rsp, %rbp

	movq %rsi, %r10				/*endereço struct*/

	movq $formatString, %rsi	/*segundo argumento "%d/.."*/
							
							/* dia */
	movsbl 5(%r10), %edx

							/* mes*/
	movsbl 4(%r10), %ecx

	movl (%r10), %r8d		/* ano*/
	movl $0, %eax
	call sprintf

	leave
	ret

show:
	pushq %rbp
	movq %rsp, %rbp

	subq $48, %rsp

	movq (%rdi), %r9
	movq %r9, -24(%rbp) /* estrutura*/

	/* parametros */
	leaq 8(%rdi), %rsi
	leaq -11(%rbp), %rdi

	call format

	/* parametros */
	movq $showString, %rdi
	movq -24(%rbp), %rsi
	leaq -11(%rbp), %rdx
	movl $0, %eax

	call printf

	leave
	ret 

main:
	
	pushq %rbp
	movq %rsp, %rbp

	subq $16, %rsp

	movq $ern, -16(%rbp)

	movl $2002 ,-8(%rbp)
	movb $3, -4(%rbp)
	movb $15, -3(%rbp)

	leaq -16(%rbp), %rdi
	call show

	movl $0, %eax

	leave
	ret
