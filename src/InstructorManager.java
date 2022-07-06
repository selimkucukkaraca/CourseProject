public class InstructorManager extends UserManager {

    public String getInstructorInfo(Instructor instructor) {
        if (instructor.isMedeniHal()) {
            return "evli " + instructor.getMaas();
        } else {
            return "bekar " + instructor.getMaas();
        }
    }
}
