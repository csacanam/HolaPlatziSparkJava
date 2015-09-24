/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peewah.holaplatzi;

import static spark.Spark.*;

/**
 *
 * @author csacanam
 */
public class HolaPlatzi
{

    public static void main(String[] args)
    {
        get("/hello", (req, res) -> "Hola Platzi. Saludos desde Peewah.");
    }
}
