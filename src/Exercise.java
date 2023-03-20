import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Exercise {

    // Exe 1
    public void arrayInt(){
        System.out.println("Exe 1");
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + ", ");
        }
        Arrays.sort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }

    //Exe 2
    public void ArrayString(){
        System.out.println("Exe 2");
        String[] countries = { "Egypt", "Switzerland", "Argentina", "Spain", "Portugal", "Luxembourg","Bangladesh", "USA"};
        for (int i = 0; i < countries.length;i++){
            System.out.print(countries[i] + ", ");
        }
        Arrays.sort(countries);
        System.out.print("\n" + Arrays.toString(countries) +"\n");
    }

    // Exe 3a
    public void ArrayListInt(){
        System.out.println("Exe 3");
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 20;i++){
            arr.add((int)(Math.random()* 100));
        }
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        arr.add(0,100);
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);
    }

    // Exe 3b
    public void ArrayListString(){
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Egypt");
        countries.add("Switzerland");
        countries.add("Argentina");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Luxembourg");
        countries.add("Bangladesh");
        countries.add("USA");

        System.out.println(countries);

        Collections.sort(countries);
        System.out.println(countries);

        countries.add(0,"Saudi Arabia");
        System.out.println(countries);

        Collections.sort(countries);
        System.out.println(countries);
    }

    public static void main(String[] args) {
        Exercise exe = new Exercise();
        //exe 1
        exe.arrayInt();
        //exe 2
        exe.ArrayString();
        //exe 3
        exe.ArrayListInt();
        exe.ArrayListString();
    }
}
