public class Student {

   String first_name, middle_name, last_name, suffix, full_name;
   
   public Student() {}
   
   public String getFirstName() {
      return first_name;
   }
   
   public String getMiddleName() {
      return middle_name;
   }
   
   public String getLastName() {
      return last_name;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
   public String getFullName() {
      return first_name + " " + middle_name + " " + last_name + " " + suffix;
   }
   
   public void setFirstName(String fn) {
      first_name = fn;
   }
   public void setMiddleName(String mn) {
      middle_name = mn;
   }
   public void setLastName(String ln) {
      last_name = ln;
   }
   public void setSuffix(String s) {
      suffix = s;
   }
}