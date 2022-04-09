package CalorieTrackerFP.person;

public class Person {
    private int age;
    private String goal;
    private String gender;
    private double height;
    private double weight;
    private double neckMeasurement;
    private double waistMeasurement;
    private double hipMeasurement;

    public void setGoal(String goal){
        //method to ask for changing goal
        this.goal = goal;
    }

    public String getGoal(){
        return goal;
    }

    public String getGender() {
        return gender;
    }
    // setting the gender of the user (either man or woman)
    public void setGender(String gender){
        this.gender = gender;
    }
    // setting the age of the user in years
    public void setAge(int AgeYr){
        age = AgeYr;
    }
    // do function to receive the age of the user
    public int getAge(){
        return age;
    }
    public void setHeight(double height){
        //do function to ask for new height
        this.height = height;
    }
    public double getHeight(){
        //do function to get height
        return height;
    }
    public void setWeight(double weight){
        //do function to ask for new weight. In kg
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    /**
     * Below are the setters and getters for the Neck, Waist and Hip measurements for the current user. They all work in the same way and return a double of the
     * selected measurement in cm
     */
    public double getNeckMeasurement(){
        return neckMeasurement;
    }

    public void setNeckMeasurement(double neckCm){
        neckMeasurement = neckCm;
    }

    public double getWaistMeasurement(){
        return waistMeasurement;
    }

    public void setWaistMeasurement(double waistCm){
        waistMeasurement = waistCm;
    }

    public double getHipMeasurement() {
        return hipMeasurement;
    }

    public void setHipMeasurement(double hipMeasurement) {
        this.hipMeasurement = hipMeasurement;
    }

    /**
     * To string method that prints out all of the users measurements. Will only include neck waist and hip measurements if they are entered into the program
     * @return returns the string form of all of this information to print to the terminal
     */
    @Override
    public String toString() {
        String output = "";
        output += "Your measurements: \n";
        output += "Age: " + age + "\n";
        output += "Goal: " + goal + "\n";
        output += "Weight: " + weight + "\n";
        output += "Height: " + height + "\n";
        if (neckMeasurement > 0.0) {
            output += "Neck measurement: " + neckMeasurement + "\n";
        }
        if (waistMeasurement > 0.0) {
            output += "Waist measurement: " + waistMeasurement + "\n";
        }
        if (hipMeasurement > 0.0) {
            output += "Hip measurement: " + hipMeasurement + "\n";
        }
        return output;
    }

}
