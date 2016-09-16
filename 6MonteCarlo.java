public class DiceRolling{
public static void main(String[] args){

double total=0;
int montecarlo=100000;
for(int i=0;i<montecarlo;){
int sneeze=0;
int counter=0;
int dice=0;
do{
counter++;
dice = (int)(Math.random()*6)+1;
if((int)(Math.random()*1000)+1==1000){
sneeze++;
}
}while(dice!=6);
if(sneeze==1){
total+=counter;
i++;
System.out.println(counter+" "+total/i);
}
}
System.out.println(total/montecarlo);
}
}