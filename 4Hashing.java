 public static int getHashKey(String word){


 int total = 0;
 for(int i=0; i<word.length();i++){

total=total+modMult((int)word.charAt(i),modPow(128,i,size),size);
//raise each letter to successive powers of 128
//this will create a unique value for every possible string because there are only 127 ASCII characters
 }
 return total%size;


 }


 public static int getDoubleHashKey(String word){
	
 int total = 0;
 for(int i=0; i<word.length();i++){
 total=total+(int)word.charAt(i);

 }

 int maxjump = 113;
 return (maxjump - (total % maxjump));
 }