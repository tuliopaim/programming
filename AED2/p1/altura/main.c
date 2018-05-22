#include <stdio.h>
#include <stdlib.h>

//------------------------------------------------------
//STRUCTS

struct Node{
    int data;
    struct Node * right;
    struct Node * left;
};

typedef struct Node node;
typedef node * tree;

/*DECLARAÇÕES*/
//iniciar
tree * tree_start();
node * node_start();
//operações em arvores
void tree_inserir(tree * root, int data);
int tree_altura(tree * root);
int larguraLvl(node * root, int level);
int tree_largura(node * root);
void tree_free(tree * root);
//percurso
void tree_inOrdem(tree * root);
//AUXILIARES
int maior(int a, int b);

int main(){

  FILE *fp;
  fp = fopen ("testes.txt","r");
  if (fp==NULL) printf("Arquivo errado!\n");

  tree * new;

  int n, temp, i;
  fscanf(fp, "%d", &n);
  for(i=0;i<n;i++){
    new = tree_start();
    while(1){
      fscanf(fp,"%d", &temp);
      if(temp == -1) break;
      tree_inserir(new,temp);
    }
    printf("Arvore %d\n", i+1);
    tree_inOrdem(new);printf("\n");
    printf("Altura: %d\n", tree_altura(new));
    printf("Largura: %d\n\n", tree_largura(*new));
    tree_free(new);
  }

  return 0;
}

//------------------------------------------------------
//INICIADORES

//nova arvore
tree * tree_start(){
  tree * new = (tree*)malloc(sizeof(tree));
  *new = NULL;
  return new;
}

//novo nó
node * node_start(){
  node * new = (node*)malloc(sizeof(node));
  new->right = NULL;
  new->left = NULL;
  return new;
}

//-----------------------------------------------------
//FUNÇÕES

//Inserir em ordem

void tree_inserir(tree * root, int data){
  if((*root) == NULL){
      node * new = node_start();
      new->data = data;
      (*root) = new;
      //printf("%d adicionado!\n",(*root)->data );
      return ;
  }
  else if(data < (*root)->data){
      tree_inserir((&(*root)->left), data);
  }else if(data > (*root)->data){
      tree_inserir((&(*root)->right), data);
  }
}

//IN-ORDEM

void tree_inOrdem(tree * root){
  if((*root)!=NULL){
    tree_inOrdem(&(*root)->left);
    printf("%d ",(*root)->data);
    tree_inOrdem(&(*root)->right);
  }
}

int maior(int a, int b){
  return (a > b) ? a : b;
}

int tree_altura(tree * root){
  if(*root == NULL) return 0;
  else{
    return 1 + maior(tree_altura(&(*root)->left), tree_altura(&(*root)->right));
  }
}

//FREE
//LIBERAR MEMORIA ALOCADA

void tree_free(tree * root){
  if(*root != NULL){
    tree_free(&(*root)->left);
    tree_free(&(*root)->right);
    free(*root);
  }
}

//LARGURA
int larguraLevel(node * root, int level){
  if(root == NULL) return 0;
  if(level == 1) return 1;
  else{
    return(larguraLevel(root->left, level-1) + larguraLevel(root->right, level-1));
  }
}

int tree_largura(node * root){
  int i, largura = 0;
  int h = tree_altura(&root);

  for(i=1;i<=h;i++){
    int temp = larguraLevel(root, i);
    //printf("Largura lvl %d: %d\n", i, temp);
    largura = maior(largura, temp);
  }
  return largura;
}
