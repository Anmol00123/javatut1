package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,3,4);

        List<Integer> square= number.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names =
        Arrays.asList("Anmol","Rohit","Devansh");
        List<String> result = names.stream().filter(s->s.startsWith("A")).
                          collect(Collectors.toList());
        System.out.println(result);


        List<String> show =
            names.stream().sorted().collect(Collectors.toList());
         System.out.println(show);

         List<Integer> numbers = Arrays.asList(2,3,4,5,2);

         number.stream().map(x->x*x).forEach(y->System.out.println(y));

         int even =
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
        System.out.println(even);

    }
    
}
