import java.util.ArrayList;
public class hw {
    public static void main(String[] args) {
        ArrayList<Integer> myarraylist = new ArrayList<Integer>();
        myarraylist.add(4);
        myarraylist.add(45);
        myarraylist.add(76);
        myarraylist.get(0);
        System.out.println(myarraylist);
        for(Integer x:myarraylist){
            System.out.println(x);
        }
    }
}
