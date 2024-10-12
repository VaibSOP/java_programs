
import java.util.*;


public class linear search{



    public static int LinearSearch(int number[],int key[]){


        for(int i=0;i<numbers.length;i++){
            if (number[i]==key){

                return i;
            }


        }


        return -i;
    }
    public static void main(String []args){


        int numbers[]={2,4,6,8,10,12,14,16};

        int key=10;

        int i=linear search(numbers,key);

        if(index==-i){


            System.out.println("not found");

        }

            else{

                System.out.println("key is at index:"+ index);
            }
        


    }
    
}
