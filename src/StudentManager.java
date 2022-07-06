public class StudentManager extends UserManager{

   public String studentSave(Student student){
       if (!String.valueOf(student.getOgrenciNo()).isEmpty()){
          return student.getOgrenciNo() + " numaralı öğrenci kaydedildi";
       }
       else {
          return " öğrenci numaranızı girin";
       }

   }
}
