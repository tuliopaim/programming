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
void tree_inOrdem(tree * root);

int main(){

  int i=0;
  int temp;
  tree * root = tree_start();

  while(1){
    scanf("%d", &temp);
    if(temp == 0) break;
    tree_insert(root,temp);
  }
  tree_inOrdem(root);
  printf("\n");

  return 0;
}

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
    return ;
  }
  else if(num < (*root)->num){
    tree_insert(&(*root)->left, num);
  }else if(num > (*root)->num){
    tree_insert(&(*root)->right, num);
  }
}

void tree_inOrdem(tree * root){
  if((*root)!=NULL){
    tree_inOrdem(&(*root)->left);
    printf("%d ",(*root)->num);
    tree_inOrdem(&(*root)->right);
  }
}
