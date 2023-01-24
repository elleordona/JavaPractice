public class Results {

    // initializing properties
    String name;
    int physics;
    int chemistry;
    int biology;
    int total;

    // getting results
    public Results(String name, int physics, int chemistry, int biology) {
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.total = physics + chemistry + biology;
    }

    // finding individual and total scores
    public void getScore(){
        System.out.println("Exam scores for " + this.name);
        System.out.println("Your physics score is: " + this.physics);
        System.out.println("Your chemistry score is: " + this.chemistry);
        System.out.println("Your biology score is: " + this.biology);
        System.out.println("Your total score is: " + this.total);
    }

    // finding the percentage of scores
    public void getPercentage() {
        System.out.println("Exam Percentages for " + this.name);

        double physicsPercentage = (double) physics / 150 * 100;
        double chemistryPercentage = (double) chemistry / 150 * 100;
        double biologyPercentage = (double) biology / 150 * 100;
        double totalPercentage = (double) total / 450 * 100;

        System.out.println("Your physics percentage is: " + physicsPercentage + "%");
        System.out.println("Your chemistry percentage is: " + chemistryPercentage + "%");
        System.out.println("Your biology percentage is: " + biologyPercentage + "%");
        System.out.println("Your total percentage is: " + totalPercentage + "%");
    }

    public static void main(String[] args) {
        Results student = new Results("John", 75, 140, 90);
        student.getScore();
        student.getPercentage();
    }

}
