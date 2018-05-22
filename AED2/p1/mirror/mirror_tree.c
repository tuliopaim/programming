#include <stdio.h>
#include <stdlib.h>

//------------------------------------------------------
//STRUCTS

struct Node{
    int value;
    struct Node * right;
    struct Node * left;
};

typedef struct Node node;
typedef node * tree;

tree * tree_start();
node * node_start(int value);
void tree_inserir(tree * root, int value);
void tree_inOrdem(tree * root);
void mirrorNew(tree * old, tree * new);
void mirrorSelf(tree * root);

int main(){

  int temp, n, i;
  FILE *fp;
  fp = fopen ("testes.txt","r");
  if (fp==NULL){
    printf("Arquivo não existe\n");
    fclose (fp);
  }

  fscanf(fp,"%d", &n);
  for(i=0;i<n;i++){
    tree * t = tree_start();
    tree * tMirror = tree_start();
    //ler
    while(1){
      fscanf(fp,"%d", &temp);
      if(temp == -1) break;
      tree_inserir(t, temp);
    }
    //MIRROR EM OUTRA ARVORE
    printf("Arvore %d\n", i+1);
    printf("Arvore normal: ");tree_inOrdem(t); printf("\n");
    mirrorNew(t,tMirror);
    printf("Arvore espelhada: ");tree_inOrdem(tMirror); printf("\n");

    printf("Arvore normal: ");tree_inOrdem(t); printf("\n");
    mirrorSelf(t);
    printf("Arvore espelhada: ");tree_inOrdem(t); printf("\n");

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
node * node_start(int value){
  node * new = (node*)malloc(sizeof(node));
  new->value = value;
  new->right = NULL;
  new->left = NULL;
  return new;
}

//-----------------------------------------------------
//FUNÇÕES

//Inserir em ordem

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

//IN-ORDEM
void tree_inOrdem(tree * root){
  if((*root)!=NULL){
    tree_inOrdem(&(*root)->left);
    printf("%d ",(*root)->value);
    tree_inOrdem(&(*root)->right);
  }
}


void mirrorNew(tree * old, tree * new){
  if(*old != NULL){
    *new = node_start((*old)->value);
    mirrorNew(&(*old)->left, &(*new)->right);
    mirrorNew(&(*old)->right, &(*new)->left);
  }else return ;
}

void mirrorSelf(tree * root){
  if(*root != NULL){
    node * aux = (*root)->left;
    (*root)->left = (*root)->right;
    (*root)->right = aux;
    mirrorSelf(&(*root)->left);
    mirrorSelf(&(*root)->right);
  }

}
