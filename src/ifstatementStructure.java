public class ifstatementStructure {

    public static void main(String[] args) {

        int salary = 25000;

        if(salary > 15000) {
            if (salary > 20000) {
                System.out.println("you got promotion and bonus too");
            } else {
                System.out.println("you got promotion only");
            }
        }
        else
        {
            System.out.println("you need to work hard");
        }

    }
}
