import java.util.Arrays;
public class Sticks{

 public static void main (String[] args){

 double montecarlo = 100000;
 double triangle = 0;
 for (int i = 0; i< montecarlo; i++){

 double stick = 1;
 double firstbit = snap(stick);
 double secondbit = stick - firstbit;
 double thirdbit=0;
 if(Math.random()>0.5){
 thirdbit=snap(firstbit);
 firstbit-=thirdbit;
 }else{
 thirdbit=snap(secondbit);
 secondbit-=thirdbit;
 }
 double[] array = {firstbit, secondbit, thirdbit};
 Arrays.sort(array);
 if(array[2]<array[1]+array[0]){
 triangle++;
 }
 }
 System.out.println("The probability is
"+triangle/montecarlo+"%");
 }

 public static double snap(double stick){
 double firstbit = Math.random()*stick;
 return firstbit;
 }
}