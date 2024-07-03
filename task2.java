import java.util.*;
public class StudentGradeCalculator {

    public static void Subject(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> t_mark = new ArrayList<>();
        System.out.println("\nEnter number of subjects -");
        int NumOfSubj=sc.nextInt();
        for(int i =0; i<NumOfSubj;i++){
            System.out.println("Enter marks in subject "+(i+1)+" out of 100 - ");
            int mark = sc.nextInt();
            t_mark.add(mark);
        }
        TotalMarks(t_mark,NumOfSubj);
    }
    public static void TotalMarks(ArrayList<Integer> t_mark,int NumOfSubj){
        double full = 100.00*NumOfSubj;
        double sum = 0.0;
        for(int j =0;j<NumOfSubj;j++) {
            sum += t_mark.get(j);
        }
        System.out.println("\nTOTAL MARKS - "+sum+"/"+full);
        double avg = sum / full;
        double perc = avg*100;
        System.out.println("\nAVERAGE PERCENTAGE - "+perc+"%");
        Grade(perc);
    }
    public static void Grade(double perc){
        String grade;
        if(perc>=90.00 && perc <=100.00){
            grade = "S";
        }
        else if(perc>=80.00 && perc <90.00){
            grade = "A";
        }
        else if(perc>=70.00 && perc <80.00){
            grade = "B";
        }
        else if(perc>=60.00 && perc <70.00){
            grade = "C";
        }
        else if(perc>=50.00 && perc <60.00){
            grade = "D";
        }
        else if(perc>=40.00 && perc <50.00){
            grade = "D";
        }
        else{
            grade = "Fail";
        }

        System.out.println("\nGRADE - "+grade+"\nOur grading policy - [ (S- >=90 or <=100)  (A- >=80 or <90)  (B- >=70 or <80)  (C- >=60 or <70)  (D- >=50 or <60)  (E- >=40 or <50)  (F- <40[FAIL])]");
    }

    public static void main(String args[]){
        System.out.println("\nWelcome to Student's Smart Calculator");
        Subject();

    }
}
