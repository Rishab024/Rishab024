//import java.util.Arrays;
public class non_repeated {

    //public static void main(String args[]) {
      //  int array[] = {1 , 18, 20, 1 , 14 , 16 , 18 , 9 , 0 };
       // System.out.println("");
        //Creating the count array
    public static int ar(int [] array)
    {
        int value = 0;
        int countArray[] = new int[array.length];
        for(int i=0; i<array.length; i++)
        {
            countArray[i] = 0;
        }
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length;j++)
            {
                if(i!=j && array[i]==array[j])
                {
                    countArray[i]++;
                }
            }
        }

        //First non-repeating element in the array
        for(int i=0; i<array.length; i++)
        {
            if(countArray[i]==0)
            {
                //System.out.println(array[i]);

                        value=array[i];
                break;
            }
        }
        return  value ;
    }
}
