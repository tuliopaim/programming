.data

.Lfmt03:  .string "%d\n"

.text

.globl print_eax_as_int
.globl  main
main:

/********************************************************/
/* Não mexa!                                            */
/* mantenha este trecho aqui - incializacao da main     */
  pushq   %rbp
  movq    %rsp, %rbp
  subq    $16, %rsp
  movq    %rbx, -8(%rbp)  /* guarda rbx */
  movq    %r12, -16(%rbp)  /* guarda r12 */
/********************************************************/

movl $0, %r13d
movl $1, %r14d

INICIO_FOR:

cmpl $10, %r13d
jge FIM_FOR

movl %r14d, %r15d     /* r15d = r14d*/

imull %r15d, %r15d    /* r15d = r15d * r15d*/
movl %r15d, %eax

call print_eax_as_int

addl $1, %r13d
addl $1, %r14d
jmp INICIO_FOR

FIM_FOR:

movl $4, %r12d
movl $3, %r13d
cmpl %r13d, %r12d
jl PRINT

movl %r13d, %eax
call print_eax_as_int
jmp FIM

PRINT:
movl %r12d, %eax
call print_eax_as_int

FIM:

/*************************************************************/
/* Não mexa!                                                 */
/* mantenha este trecho aqui - finalizacao da main           */
  movq  $0, %rax              /* rax = 0  (valor de retorno) */
  movq    -16(%rbp), %r12     /* recupera r12                */
  movq    -8(%rbp), %rbx      /* recupera rbx                */
  leave
  ret
/*************************************************************/

print_eax_as_int:
   subq  $128, %rsp

   movq %rax,  8(%rsp)
   movq %rcx, 16(%rsp)
   movq %rdx, 24(%rsp)
   movq  %r8, 32(%rsp)
   movq  %r9, 40(%rsp)
   movq %r10, 48(%rsp)
   movq %r11, 56(%rsp)
   movq %rdi, 64(%rsp)
   movq %rsi, 72(%rsp)

   movq $.Lfmt03, %rdi
   movl   %eax, %esi
   movl     $0, %eax
   call printf

   movq  8(%rsp), %rax
   movq 16(%rsp), %rcx
   movq 24(%rsp), %rdx
   movq 32(%rsp), %r8
   movq 40(%rsp), %r9
   movq 48(%rsp), %r10
   movq 56(%rsp), %r11
   movq 64(%rsp), %rdi
   movq 72(%rsp), %rsi

   addq $128, %rsp
   ret
