import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CofeeMachineDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        File file = new File("C:\\Users\\Public\\Downloads\\CoffeeMachineDesign\\src\\main\\java");

        List l = findClasses( file,"Coffee");
        System.out.println("hello");
        for(Object o : l)
        {
            System.out.println(o.toString());
        }
        while(true)
        {
            System.out.println("****COFFEE WENDING MACHINE****");
            System.out.println("WHAT DO YOU NEED" + "ENTER 1 FOR COFEE AND 2 FOR SUGAR");
            Scanner scanner = new Scanner(System.in);
            String firstOption = "";
            try {
                firstOption = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("bad request");
            }
            if (Integer.parseInt(firstOption) == 1) {
                System.out.println("**You have selected coffee***");
                System.out.println("**here are the coffee available");

            }
        }

    }
    private static List findClasses(File directory, String packageName) throws ClassNotFoundException {
        List classes = new ArrayList();
        if (!directory.exists()) {
            System.out.println("is this the case");
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.println("file is"+file.toString());
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                System.out.println("something is happening");
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

}
