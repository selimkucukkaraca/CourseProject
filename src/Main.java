 //User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
 //UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Admin admin = new Admin("selim", "123");
         UserManager userManager = new UserManager();

         String operation = "1. Öğrenci işlemleri\n" +
                 "2. Eğitmen işlemleri\n" +
                 "3. çıkış 'q' ";

         while (true) {
             System.out.println("kullanıcı adını gir :");
             String userName = scanner.nextLine();
             System.out.println("şifre gir : ");
             String password = scanner.nextLine();
             while (true) {

                 if (userManager.login(new User(userName, password), admin)) {
                     System.out.println(operation);
                     System.out.println("yapmak istediğiniz işlemi seçiniz : ");

                     int inputOperation = scanner.nextInt();

                     if (inputOperation == 1) {
                         System.out.println("öğrenci işlerine giriş yapıldı");
                         System.out.println("işlemler\n" +
                                 "4. öğrenci kaydetme");
                         System.out.println("yapmak istediğiniz işlem : ");

                     } else if (inputOperation == 2) {
                         System.out.println("eğitmen işlerine giriş yapıldı");


                     } else if (inputOperation == 3) {
                         System.out.println("çıkış yapılıyor");
                         break;

                     } else {
                         System.out.println("geçersiz işlem");
                     }


                 }

             }

         }
     }
 }
