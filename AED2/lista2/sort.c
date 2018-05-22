#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
  int key;
  int matricula;
  struct Node * left;
  struct Node * right;
}node;

typedef node * tree;

node * node_start(int key, int matricula);
tree * tree_start();
void tree_inserir(tree * root, int key, int matricula);
void tree_inOrdem(tree * root);

int main(){

  int n, key, matricula;
  int i;
  tree * root = tree_start();

  scanf("%d", &n);

  for(i=0; i<n; i++){
    scanf("%d", &key);
    scanf("%d", &matricula);
    //printf("K: %d \t M: %d\n", key, matricula);
    tree_inserir(root,key,matricula);
  }

  tree_inOrdem(root);

  return 0;
}

node * node_start(int key, int matricula){
  node * new = (node*)malloc(sizeof(node));
  new->key = key;
  new->matricula = matricula;
  new->left = NULL;
  new->right = NULL;
  return new;
}

tree * tree_start(){
    tree * new = (tree*)malloc(sizeof(tree));
    (*new) = NULL;
    return new;
}

void tree_inserir(tree * root, int key, int matricula){
  if((*root) == NULL){
      node * new = node_start(key, matricula);
      (*root) = new;
      //printf("%d adicionado!\n",(*root)->key );
      return ;
  }
  else if(key < (*root)->key){
      tree_inserir((&(*root)->left), key, matricula);
  }else if(key > (*root)->key){
      tree_inserir((&(*root)->right), key, matricula);
  }
}

void tree_inOrdem(tree * root){
  if(*(root)!=NULL){
    tree_inOrdem(&(*root)->left);
    printf("%d\n", (*root)->matricula);
    tree_inOrdem(&(*root)->right);
  }
}
