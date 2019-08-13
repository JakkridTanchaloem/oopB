public class Student {
    String studentId;
    String studentName;
    String facuty;
    String branch;
   
    void enrollment(){
    System.out.println("ลงทะเบียนแล้ว");} 
    
    void payment(){
    System.out.println("จ่ายตังแล้ว");} 
    void addCourse(){System.out.println("เพิ่มรายวิชาแล้ว");} 
    void dropCourse(){System.out.println("ถอนรายวิชาแล้ว");} 
    
    public static void main(String[] args) {
        Student Koch = new Student();
        System.out.println(">>" + Koch );
       Koch.enrollment();
       Koch.addCourse();
       Koch.dropCourse();
       Koch.payment();
        
}
                       
}//end
