//selection sort

class YT47
{
    public static void main(String[] args) 
    {
        int number[]={110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033};
        int l=number.length;
        int temp=0;

        System.out.println("Unsorted Array");               //unsorted array
        for(int i=0; i<l; i++)
        {
            System.out.print(number[i]+" ");
        }
        
        
        for(int i=0; i<l; i++)                                 //sorting technique
        {
            for(int j=i+1; j<l; j++)
            {
                if(number[i]>number[j])
                {
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted Array");                 //print of sorted array
        for(int i=0; i<l; i++)
        {
            System.out.print(number[i]+" ");
        }
    }
}