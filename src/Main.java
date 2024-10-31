import java.util.*;
import java.util.stream.Collectors;

class StreamFilter
{
    public static void main(String arg[])
    {
        List<Integer>marks = Arrays.asList(50,20,15,35,20,55,60);


        List<Integer>Passed = marks.stream().filter(i->i > 35).collect(Collectors.toList());

        System.out.println(Passed);
    }
}