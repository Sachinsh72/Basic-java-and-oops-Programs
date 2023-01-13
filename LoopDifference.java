public class LoopDifference {
    public static void main(String[] args) {

        //Two type of loop
        // 1.Entry control loop - For loop & while loop
        // 2.Exit control loop - do while loop

        //for loop
        //executes until condition false
        for(int i=0;i<2;i++)
        {
            System.out.println("For loop");
        }

        //while loop
        //check condition and executes until condition false
        int n=1;
        while(n<3){
            System.out.println("while loop");
            n++;
        }

        //do-while loop
        //first execute and condition check
        int a=0;
        int sum=0;
        do{
            sum=sum+a;
            a++;
            System.out.println(sum);
        }while (a<10);
        System.out.println("last digit is "+sum);


        /* difference between for, while and do while

        for : first initialization, condition and increment at one place
              secondly execute until condition false

        for(int i=0;i<2;i++){           -initialization, condition, increment
            System.out.println(i);      -loop body
        }

        while : first initialization, secondly condition then third increment
               first check condition then executes until false
            int b=0;                    //initialization
            while(b<10);{               //condition
                System.out.println(b);  //loop body
                b++;                    // increment decrement
            }

        //do-while : initialization,increment then  condition
                  executes minimum one time

        do{
            sum=sum+n;   //loop body
            n++;        // increment decrement
        }while(n<1);    //condition

         */
    }
}
