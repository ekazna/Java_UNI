import java.util.Random;


// генерирует массив, где каждое из чисел первого списка повторяется столько раз сколько оно весит во втором
// из этого массива рандомно выбираем число
public class Mass {

    int[] newArray;
    int [] numbers;
    int [] weights;
    int count = 0;
    int count2 = 0;

    public Mass(int[] numbers, int[] weights){
        this.numbers = numbers;
        this.weights = weights;

        for (int i = 0; i < this.weights.length; i++) {
            count += this.weights[i];
        }
        newArray = new int[count];


        for (int i = 0; i < this.numbers.length; i++) {
            for (int j = 0; j < this.weights[i]; j++) {
                newArray[count2] = this.numbers[i];
                count2++;
            }
        }
    }
    public int returnByWeight(){
        Random random = new Random();
        int randI = random.nextInt(newArray.length);
        return newArray[randI];
    }

}
