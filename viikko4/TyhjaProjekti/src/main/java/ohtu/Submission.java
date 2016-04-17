package ohtu;

public class Submission {
    private String student_number;
    private String week;
    private int exercisesDone;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getExercisesDone() {
        return exercisesDone;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Viikko "+ week +  ": tunteja käytetty " + hours +", tehdyt tehtävät: " +countExercises() + ", tehtäviä tehty yhteensä: " + exercisesDone ;
    }

    private String countExercises() {
        exercisesDone = 0;
        StringBuilder exerciseString= new StringBuilder();
        if (a1) {
            exerciseString.append("1 ");
            exercisesDone++;
        }
        if (a2) {
            exerciseString.append("2 ");
            exercisesDone++;
        }
        if (a3){
            exerciseString.append("3 ");
            exercisesDone++;
        }
        if (a4){
            exerciseString.append("4 ");
            exercisesDone++;
        }
        if (a5) {
            exerciseString.append("5 ");
            exercisesDone++;
        }
        if (a6){
            exerciseString.append("6 ");
            exercisesDone++;
        }
        if (a7){
            exerciseString.append("7 ");
            exercisesDone++;
        }
        if (a8) {
            exerciseString.append("8 ");
            exercisesDone++;
        }
        if (a9) {
            exerciseString.append("9 ");
            exercisesDone++;
        }
        if (a10) {
            exerciseString.append("10 ");
            exercisesDone++;
        }
        if (a11) {
            exerciseString.append("11 ");
            exercisesDone++;
        }
        if (a12) {
            exerciseString.append("12 ");
            exercisesDone++;
        }
        if (a13) {
            exerciseString.append("13 ");
            exercisesDone++;
        }
        if (a14) {
            exerciseString.append("14 ");
            exercisesDone++;
        }
        if (a15){
            exerciseString.append("15 ");
            exercisesDone++;
        }
        if (a16){
            exerciseString.append("16 ");
            exercisesDone++;
        }
        if (a17){
            exerciseString.append("17 ");
            exercisesDone++;
        }
        if (a18){
            exerciseString.append("18 ");
            exercisesDone++;
        }
        if (a19) {
            exerciseString.append("19 ");
            exercisesDone++;
        }
        if (a20) {
            exerciseString.append("20 ");
            exercisesDone++;
        }
        if (a21){
            exerciseString.append("21 ");
            exercisesDone++;
        }
        return exerciseString.toString();
    }
    
}