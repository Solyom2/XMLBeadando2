package hu.iit.me;

import hu.iit.me.service.XMLManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        XMLManager xmlManager = new XMLManager();

        do {
            System.out.println("0. Kilépés");
            System.out.println("1. Konvojok listázása");
            System.out.println("2. Kereskedelmi hajók listázása");
            System.out.println("3. Szövetséges hadihajók listázása");
            System.out.println("4. U-boatok listázása");
            System.out.println("5. Parancsnokok listázása");
            System.out.println("6. Országok listázása");
            System.out.println("Kérem válasszon egy menüpontot: ");

            switch (scanner.nextInt()) {
                case 0: exit = true;
                        break;
                default: System.out.println("Nincs ilyen menüpont");
            }

        }while (!exit);

    }
}
