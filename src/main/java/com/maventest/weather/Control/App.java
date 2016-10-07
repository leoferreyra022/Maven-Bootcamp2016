package com.maventest.weather.Control;
import com.maventest.weather.DAO.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.sql.Time;
import java.util.Scanner;
import java.util.Date;
/**
 * Created by Leo on 03/10/2016.
 */
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        //System.out.println("Ingrese una fecha (DD/MM/YYYY");
        //String fecha1 = sc.nextLine();
        System.out.println(c.get(Calendar.DAY_OF_WEEK)-1);

        try {
            singletonConnection con = singletonConnection.getInstance();
        }
        catch (SQLException e){
            System.out.println("Error al intentar conectar"+e.getMessage());
        }

    }
}
