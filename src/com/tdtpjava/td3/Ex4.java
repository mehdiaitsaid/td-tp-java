package com.tdtpjava.td3;

public class Ex4 {
    public static void main(String[] args) {
        Temps t = new Temps(3,10,10);
        System.out.println(t.toString());
        t.ajouterMinutes(180);
        System.out.println(t);
        t.ajouterSecondes(3660);
        System.out.println(t);
    }
}

class Temps{
    private int heures, minutes, seconds;

    public Temps() {

    }

    public Temps(int heures) {
        this.heures = heures;
    }

    public Temps(int heures, int minutes) {
        this(heures);
        this.minutes = minutes;
    }

    public Temps(int heures, int minutes, int seconds) {
        this(heures, minutes);
        this.seconds = seconds;
    }

    public Temps(Temps temps) {
        this.heures = temps.getHeures();
        this.minutes = temps.getMinutes();
        this.seconds = temps.getSeconds();
    }

    public void ajouterHeures(int h) {
        this.heures += h;
        if (heures > 23) {
            this.heures %= 24;
        }
    }


    public void ajouterMinutes(int m) {
        this.minutes += m;
        if (minutes > 59) {
            ajouterHeures(minutes / 60);
            this.minutes %= 60;

        }
    }

    public void ajouterSecondes(int s) {
        this.seconds += s;
        if (seconds > 59) {
            ajouterMinutes(seconds / 60);
            this.seconds %= 60;

        }
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
