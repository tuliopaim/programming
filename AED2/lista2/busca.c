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
int verify(tree * root, int key);

int main() {

  int key, temp;
  scanf("%d", &key);

  tree * root = tree_start();
  while (scanf("%d", &temp)!=EOF)
    tree_inserir(root, temp);

  printf((verify(root,key) == 1) ? "V\n" : "I\n");

  return 0;
}

//nova arvore
tree * tree_start(){
  tree * new = (tree*)malloc(sizeof(tree));
  *new = NULL;
  return new;
}

//novo nó
node * node_start(int value){
  node * new = (node*)malloc(sizeof(node));
  new->value = value;
  new->right = NULL;
  new->left = NULL;
  return new;
}

//inserir
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

int verify(tree * root, int key){
  if((*root)== NULL || ((*root)->left!=NULL && (*root)->right !=NULL)){
    //printf("Parou em %d\n", (*root)->value);
    return 0;
  }
  if((*root)->value == key)
  return 1;
  if(key < (*root)->value)
    verify(&(*root)->left, key);
  else if(key > (*root)->value)
    verify(&(*root)->right, key);
}
