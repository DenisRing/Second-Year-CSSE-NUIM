private void inOrder(Node localRoot, char letter, String path){ //the path
variable tracks the current search path
 if(localRoot != null){ //if root is null we've gone off the edge of the
tree - back up
 if(localRoot.letter==letter){
 this.path=path; //if we've found the letter, note the path -
final path = current search path
 }else{
 inOrder(localRoot.leftChild, letter, path+"0"); //go left and add
"0" to the current search path
 inOrder(localRoot.rightChild, letter, path+"1"); //go right
and add "1" to the current search path
 }
 }
 return; //quit searching this branch of the tree
 }