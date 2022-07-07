 //User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
 //UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Admin admin = new Admin("selim", "123");
         UserManager userManager = new UserManager();
         StudentManager studentManager = new StudentManager();

         String operation = "1. Öğrenci işlemleri\n" +
                 "2. Eğitmen işlemleri\n" +
                 "3. çıkış 'q' ";

         while (true) {
             System.out.println("kullanıcı adını gir :");
             String userName = scanner.nextLine();
             System.out.println("şifre gir : ");
             String password = scanner.nextLine();


             if (userManager.login(new User(userName, password), admin)) {
                 while (true) {
                     System.out.println(operation);
                     System.out.println("yapmak istediğiniz işlemi seçiniz : ");

                     int inputOperation = scanner.nextInt();

                     if (inputOperation == 1) {
                         System.out.println("öğrenci işlerine giriş yapıldı");
                         System.out.println("işlemler\n" +
                                 "4. öğrenci kaydetme\n");
                         System.out.println("işlem seçiniz : ");
                         int studentOperation = scanner.nextInt();
                         if (studentOperation == 4) {
                             System.out.println("öğrenci numarası : ");
                             int ogrNo = scanner.nextInt();
                             System.out.println("öğrenci sınıf : ");
                             int sinif = scanner.nextInt();
                             System.out.println(studentManager.studentSave(new Student(ogrNo, sinif)));
                         }
                     }
                     else if (inputOperation == 2) {

                     }
                     else if (inputOperation == 3) {
                         System.out.println("çıkış yapılıyor");
                         break;
                     }
                     else {
                         System.out.println("geçersiz işlem");
                     }

                 }
             }
             else {
                 System.out.println("kullanıcı adı ve şifre hatalı");
             }
         }
     }
}
