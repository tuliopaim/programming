#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
  int num;
  struct Node * left;
  struct Node * right;
}node;

typedef node * tree;

//tree_start

tree * tree_start();
node * node_start(int num);
void tree_insert(tree * root, int num);
int tree_height(tree * root);
int maior(int a, int b);
void sort(int * array, int size);
void balancear(tree * root, int * nums, int start, int end);

/*
*/

int main(){

  int nums[100000],i=0;
  int size, temp;
  tree * root = tree_start();

  while(1){
    scanf("%d", &temp);
    if(temp == 0) break;
    nums[i++] = temp;
  }
  size = i-1;

  sort(nums, size);

  balancear(root, nums, 0, size);
  printf("%d\n",tree_height(root));

  return 0;
}

/*
*/

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
  if((*root)==NULL){
    node * new = node_start(num);
    *root = new;
    return ;
  }else if(num < (*root)->num)
    tree_insert(&(*root)->left, num);
  else if(num > (*root)->num)
    tree_insert(&(*root)->right, num);

}

int tree_height(tree * root){
  if((*root)==NULL || ((*root)->left == NULL && (*root)->right == NULL))
    return 1;
  else
    return 1 + maior(tree_height(&(*root)->left), tree_height(&(*root)->right));
}

int maior(int a, int b){
  return (a > b) ? a : b;
}

void sort(int * array, int size){
  int aux;
  int i, j;
  for(i = 0; i <= size; i++){
    for(j = i+1; j <= size; j++){
      if(array[i] > array[j]){
        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
      }
    }
  }
}

void balancear(tree * root, int * nums, int start, int end){
  if(start >= end) return ;
  else if(end - start == 1){
    tree_insert(root, nums[start]);
    tree_insert(root, nums[end]);
    return ;
  }

  float pos = (((end - start) / 2)+ 0.5);

  tree_insert(root, nums[start + (int)pos]);

  balancear(root, nums, start,(int)pos + start);
  balancear(root, nums, ((int)pos + start +1), end);
}
