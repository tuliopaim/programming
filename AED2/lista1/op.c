#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
  int num;
  struct Node * left;
  struct Node * right;
}node;

typedef node * tree;

tree * tree_start();
node * node_start(int num);
void tree_insert(tree * root, int num);
void tree_inOrdem(tree * root, int * numeros);
void tree_remove(tree * root, int num);
node * menorNo(tree * root);


/*=====================MAIN========================*/

int main(){

  int i=0, temp, numeros[10000], cont = 0;
  char op;

  tree * root = tree_start();

  while(1){
    scanf(" %c", &op);
    //printf("Lido %c\n",op );
    if(op == 'S') break;
    else if(op == 'I'){
      scanf("%d", &temp);
      tree_insert(root, temp);
    }
    else if(op == 'R'){
      scanf("%d", &temp);
      tree_remove(root, temp);
    }
    else if(op == 'M'){
      tree_inOrdem(root, numeros);
      printf("\n");
    }
    else if(op == 'S') break;
  }

  return 0;
}
/*=================================================*/

tree * tree_start(){
  tree * new = (tree*)malloc(sizeof(tree));
  *new = NULL;
  return new;
}

node * node_start(int num){
  node * new = (node*)malloc(sizeof(node));
  new->num = num;
  new->left = NULL;
  new->right = NULL;
  return new;
}

void tree_insert(tree * root, int num){
  if(*root == NULL){
    node * new = node_start(num);
    *root = new;
    //printf("%d inserido!\n",(*root)->num );
    return ;
  }
  else if(num < (*root)->num){
    tree_insert(&(*root)->left, num);
  }else if(num > (*root)->num){
    tree_insert(&(*root)->right, num);
  }
}

void tree_inOrdem(tree * root, int * numeros){
  if((*root)!=NULL){
    tree_inOrdem(&(*root)->left, numeros);
    printf("%d ", (*root)->num);
    tree_inOrdem(&(*root)->right, numeros);
  }
}

void tree_remove(tree * root, int num){
  if(*root == NULL) return ;
  else if(num < (*root)->num)
    tree_remove(&(*root)->left,num);
  else if(num > (*root)->num)
    tree_remove(&(*root)->right,num);
  else{
    node * aux = (*root);
    //SEM FILHOS
    if((*root)->left == NULL && (*root)->right == NULL){
      free(aux);
      (*root) = NULL;
    }
    //FILHO ESQUERDO
    else if((*root)->left!=NULL && (*root)->right == NULL){
      (*root) = aux->left;
      aux->left = NULL;
      free(aux);
      aux = NULL;
    }
    //FILHO DIREITA
    else if((*root)->left == NULL && (*root)->right!=NULL){
      (*root) = aux->right;
      aux->right = NULL;
      free(aux);
      aux = NULL;
    }
    else{
      //MENOR NÓ DA DIREITA
      (*root) = menorNo(&(*root)->right);
      (*root)->left = aux->left;
      (*root)->right = aux->right;
      aux->left = aux->right = NULL;
      free(aux);
      aux = NULL;
    }

  }
}

node * menorNo(tree * root){
  if((*root)->left != NULL)
    menorNo(&(*root)->left);
  else{
    node * aux = (*root);
    if((*root)->right != NULL){
      (*root) = (*root)->right;
    }else
      (*root) = NULL;
    return aux;
  }
}
