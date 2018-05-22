let form = document.getElementById('input');
let items = document.querySelector('.tasks');

//ADICIONAR
form.addEventListener('submit',addItem);
//REMOVER
items.addEventListener('click', delItem);

//ADD ITEM
function addItem(e){
  e.preventDefault();
  //PEGAR O VALOR DIGITADO
  let content = document.getElementById('content').value;

  //PEGAR UL
  let lista = document.querySelector('.tasks');

  //CRIAR NOVA LI
  let novaLi = document.createElement('li');

  //CRIAR DOIS SPANS
  let text = document.createElement('span');
  let deleteBtn = document.createElement('span');
  //DEFINIR AS CLASSES
  text.className = 'text';
  deleteBtn.className ='delete';
  //ADICIONAR O TEXTO
  text.appendChild(document.createTextNode(content));
  deleteBtn.appendChild(document.createTextNode('x'));

  novaLi.appendChild(text);
  novaLi.appendChild(deleteBtn);

  lista.appendChild(novaLi);

}

function delItem(e) {
  if(e.target.classList.contains('delete')){
    let item = e.target.parentElement;
    items.removeChild(item);
  }
}
