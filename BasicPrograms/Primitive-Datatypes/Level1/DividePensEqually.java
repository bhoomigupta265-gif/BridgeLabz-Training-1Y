public class DividePensEqually {
    public static void main(String[]args){
        int pens = 14;
        int students = 3;

        int penperstudent = pens/students;
        int remaningpen = pens%students;

        System.out.println("The Pen Per Student is "+penperstudent+" and the remaining pen not distributed is "+remaningpen);
    }
}
