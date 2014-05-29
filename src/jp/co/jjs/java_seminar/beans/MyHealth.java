package jp.co.jjs.java_seminar.beans;

public class MyHealth {
    private int id;
    private String date;
    private double height;
    private double weight;
    private double bmi;
    private double sleepTime;

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            セットする id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     *            セットする date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height
     *            セットする height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight
     *            セットする weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return bmi
     */
    public double getBmi() {
        return bmi;
    }

    /**
     * @param bmi
     *            セットする bmi
     */
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    /**
     * @return sleepTime
     */
    public double getSleepTime() {
        return sleepTime;
    }

    /**
     * @param sleepTime
     *            セットする sleepTime
     */
    public void setSleepTime(double sleepTime) {
        this.sleepTime = sleepTime;
    }

}
