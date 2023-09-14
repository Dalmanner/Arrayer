public class Main {
    public static void main(String[] args) {

        int[] numbers = { 3, 5, 6, 9};
        String[] allnames = {"David", "Susan", "Luis", "Laura"};
        String[] moreNames = new String[25];


        String name1 = allnames[1];
        System.out.println(name1);

        for (int i = 0; i < allnames.length; i++) {
            System.out.println(allnames[i]);
        }

        for (String name : allnames) {
            System.out.println(name);
        }

        boolean found = contains( "Per", allnames);
        System.out.println(found);

    }

    static boolean contains( String name, String[] namesArray) {
        for(String str : namesArray) {
            if(str.equals(name)) {
                return true;
            }
        }

        return false;
    }
}