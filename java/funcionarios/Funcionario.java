class Funcionario{
   String cpf;
   int matricula;
   String nome;
   String cargo;
   double salario;
   String departamento;
   Endereco endereco;

   Funcionario(String nome,String cpf,int matricula){
     this.nome = nome;
     this.cpf = cpf;
     this.matricula = matricula;
   }

   void aumentaSalario(double percent){
     this.salario *= (1+(percent/100));
   }

   String getCpf(){
     return this.cpf;
   }

   void setCpf(String cpf){
     this.cpf = cpf;
   }

   int getMatricula(){
     return this.matricula;
   }

   void setMatricula(int matricula){
     this.matricula = matricula;
   }

   String getNome(){
     return this.nome;
   }

   void setNome(String nome){
     this.nome = nome;
   }

   String getCargo(){
     return this.cargo;
   }

   double getSalario(){
     return this.salario;
   }

   String getDepartamento(){
     return this.departamento;
   }

   Endereco getEndereco(){
     return this.endereco;
   }

   void setCargo(String cargo){
     this.cargo = cargo;
   }

   void setSalario(double salario){
     this.salario = salario;
   }

   void setDepartamento(String departamento){
     this.departamento = departamento;
   }

   void setEndereco(Endereco endereco){
     this.endereco = endereco;
   }

   //6
   void mostrarDados(){
     System.out.println(String.format("%04d", this.matricula)+" - "+this.cpf+" - "+this.nome
     +" - Departamento: "+this.departamento+" - Cargo: "+this.cargo);
   }

}
