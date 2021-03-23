package com.komalnayangalla_c0779428;

import  javax.swing.*;
import java.util.ArrayList;
/*
 * @Author : Komal Nayan Galla
 * @Author Roll No : C0779428
 */
class FeelLikeTemp
{
    int windSpeed; //speed of wind in miles per hour
    int temperature; //temperature in Celsius
    int feelLikeTemp; //unknown degrees
    String day; //day of the week

    public FeelLikeTemp(int windSpeed, int temperature, String day) {
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.day = day.toUpperCase();
        calcFeelLikeTemp();
    }

    public void calcFeelLikeTemp()
    {
        feelLikeTemp = temperature * windSpeed;
    }

    @Override
    public String toString() {
        //to print Object
        StringBuilder sb= new StringBuilder();
        sb.append("Today is "+day);
        sb.append("\nWind Speed : "+windSpeed+" mph");
        sb.append("\nTemperature : "+temperature+" Celsius");
        sb.append("\nFeels Like Temperature : "+feelLikeTemp);
        return new String(sb);
    }
}

public class FeelLikeTempCalc {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to Feels Like Temperature Calculator!");
        String inp = JOptionPane.showInputDialog("Enter the day, temperature and wind speed separated by spaces..");
        ArrayList<String> inpValues = new ArrayList<String>(); //using ArrayList
        for(String s: inp.split(" ")) //inp.split(" ") returns an array of Strings
            inpValues.add(s);
        String day = inpValues.get(0).toLowerCase();
        int temperature = Integer.parseInt(inpValues.get(1));
        int windSpeed = Integer.parseInt(inpValues.get(2));
        FeelLikeTemp flt = new FeelLikeTemp(windSpeed,temperature,day);
        JOptionPane.showMessageDialog(null,flt);
    }
}
