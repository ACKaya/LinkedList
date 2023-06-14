import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Ayi Bogan Reco");
        list.add("Resul");
        list.add("Yahya");
        list.add("Reis");
        list.add(2,"Su Aygiri");
        Iterator<String>itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
