.data
Sf: .string "%d\n"

.align 8
s1:
	.int 0		/*x*/
	.int 0		/*y*/
	.int 0		/*r*/
	.byte 0		/*filled*/
	.zero 3		/*padding*/
	.quad 0		/*color*/


.global main
main:
	pushq %rbp
	movq %rsp, %rbp
	subq $16, %rsp		/*alocar*/

	movq %r12, -8(%rbp)		/*salvar r12*/


	movq $s1, %r12		/*r12 = &s1*/
	movl $10, (%r12)	/*x = 10*/
	movl $20, 4(%r12)	/*y = 20*/
	movl 4(%r12), %eax
	imull $2, %eax	
	movl %eax, 8(%r12)	/*r = 2y*/

	IF:
	cmpl $30, 8(%r12)
	jle ELSE			/*if r <= 30*/

	movq $2, 12(%r12) 	/*color = 2*/
	jmp FIM_IF

	ELSE:
	movq $1, 12(%r12)	/*color = 1*/

	FIM_IF:

	/*PRINTF*/
	movq $Sf, %rdi
	movq 12(%r12), %rsi
	movl $0, %eax
	call printf

	movq -8(%rbp), %r12		/*devolver r12*/

  	leave
  	ret
