.global fat
fat:
	
	pushq 	%rbp
	movq 	%rsp,  %rbp	
	subq $16, %rsp


	cmpl $0, %edi
	je RETORNA

	movq %rdi, -8(%rbp)
	decl %edi

	call fat

	movq -8(%rbp), %rdi
	imull %edi, %eax

	jmp FIM

	RETORNA:
	movl $1, %eax
	
	FIM:

	leave
	ret
