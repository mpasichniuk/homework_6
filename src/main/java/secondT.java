import org.junit.Test;

public class secondT {
    @Test public void task2 () {
        int []inputArr = {1,4,1,4,4,1,4};
        int[] b = {1,2,3,2,5};
        boolean one = false;
        boolean four = false;
        for (int a : inputArr) {
            if (a != 1 && a !=4)
                System.out.println("false");
            if (a == 1)
                one = true;
            if (a == 4)
                four = true;
        }
        System.out.println(one && four);;
    }
}

