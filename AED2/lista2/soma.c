#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
  int value;
  struct Node * left;
  struct Node * right;
}node;

typedef node * tree;

node * node_start(int value);
tree * tree_start();
void tree_inserir(tree * root, int value);
int contaFolha(tree * root);
int contaInterno(tree * root);


int main(){

  int temp;
  tree * root = tree_start();

  while(scanf("%d", &temp)!=EOF){
    //printf("%d lido\n", temp);
    tree_inserir(root, temp);
  }

  printf("%d ", contaFolha(root));
  printf("%d\n", contaInterno(root));
  return 0;
}

node * node_start(int value){
  node * new = (node*)malloc(sizeof(node));
  new->value = value;
  new->left = NULL;
  new->right = NULL;
  return new;
}

tree * tree_start(){
    tree * new = (tree*)malloc(sizeof(tree));
    (*new) = NULL;
    return new;
}

void tree_inserir(tree * root, int value){
  if((*root) == NULL){
      node * new = node_start(value);
      (*root) = new;
      //printf("%d adicionado!\n",(*root)->value );
      return ;
  }
  else if(value < (*root)->value){
      tree_inserir((&(*root)->left), value);
  }else if(value > (*root)->value){
      tree_inserir((&(*root)->right), value);
  }
}

int contaFolha(tree * root){
  if((*root)==NULL) return 0;
  if((*root)->left == NULL && (*root)->right == NULL){
    return (*root)->value;
  }
  int cont = 0;
  cont+=contaFolha(&(*root)->left);
  cont+=contaFolha(&(*root)->right);
  return cont;
}

int contaInterno(tree * root){
  if((*root)==NULL || ((*root)->left == NULL && (*root)->right == NULL)){
    //printf("%d descartado\n", (*root)->value);
    return 0;
  }
  int cont = (*root)->value;;
  //printf("Cont += %d\n", (*root)->value);
  cont+=contaInterno(&(*root)->left);
  cont+=contaInterno(&(*root)->right);
  return cont;
}
