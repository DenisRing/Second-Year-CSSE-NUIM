PriorityQueue < Tree > PQ = new PriorityQueue < Tree >() ;
//make a priority queue to hold the forest of trees


 for(int i=0; i<array.length; i++){
//go through frequency array
 if(array[i]>0){
//print out non-zero frequencies - cast to a char
 System.out.println("'"+(char)i+"' appeared "+array[i]+((array[i] == 1)
? " time" : " times"));
 Tree myTree = new Tree(); //create a new Tree
 myTree.frequency = array[i]; //set the cumulative frequency of Tree
 myTree.root=new Node(); //insert the letter as the root node
 myTree.root.letter = (char)i;//insert the letter as the root node
 PQ.add(myTree);
//add the Tree into the PQ
 }
 }


 while(PQ.size()>1){
//while there are two or more Trees left in the forest
 Tree firstTree = PQ.poll();
//get the two trees
 Tree secondTree = PQ.poll();
 Tree comboTree = new Tree();
//combine them into a new tree
 comboTree.frequency=firstTree.frequency+secondTree.frequency;
//add the cumulative frequency of both trees
 comboTree.root=new Node();
//insert a default root node (or else you get a null pointer exception)

//insert a default root node (or else you get a null pointer exception)
 comboTree.root.leftChild=firstTree.root;
//the two trees are the left and right children of the combo tree
 comboTree.root.rightChild=secondTree.root;
 PQ.add(comboTree);
//add the combo tree back into the PQ
 }

 Tree HuffmanTree = PQ.poll();
//now there's only one tree left - get its codes
 int totalLength=0;
//keeps track of the length of the new compressed version
 String theCode;
 for(int i=0; i<sentence.length(); i++){
 theCode=HuffmanTree.getCode(sentence.charAt(i));
 System.out.print(theCode+" ");
//get the code for the letter
 totalLength+=theCode.length();
//track the length of the solution
 }
 //print out all the info
 System.out.println("\nCompressed size is "+totalLength+" bits /
"+sentence.length()*7+" bits = "+(int)((totalLength*100)/(sentence.length()*7))+"
%\n");