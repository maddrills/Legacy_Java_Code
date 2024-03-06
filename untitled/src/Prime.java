public class Prime {
    private int numbers;
    public String toString(){
        return "number is " + numbers;
    }
    //prime check
    public Prime(int numbers) {
        int counter =2;
        if (numbers == 0 || numbers ==1){
        }
        else{
            //check
                while(true){
                    //continue the check
                    if(numbers % counter == 0){
                        this.numbers = numbers;
                    }
                    else{
                        this.numbers = numbers;
                        }

                    counter+=counter;
                    if(counter < numbers){
                        break;
                    }
                }

            }
        }
    }
