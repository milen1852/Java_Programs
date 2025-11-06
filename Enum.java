enum Status {
    Running, Failed,Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s);
        System.out.println(s.ordinal());

        System.out.println();
        Status[] ss = Status.values();
        for(Status s1 : ss){
            System.out.println(s1 + " : " + s1.ordinal());
        }
    }
}
