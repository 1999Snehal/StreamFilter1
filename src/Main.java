import java.util.*;

 class StreamFilter
{
    public static void main(String arg[])
    {
        List<Integer>list = Arrays.asList(5,10,15,35,20);

        List<Integer>filteredList = list.stream().filter(i->i%2==0).toList();

        System.out.println(filteredList);
    }
}