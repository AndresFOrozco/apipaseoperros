package com.umanizales.apipaseoperros.controller;

import com.umanizales.apipaseoperros.model.Empleado;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/capacitacion")
@Validated

public class CapacitacionController
{
    @GetMapping
    public Empleado getEmployee()
    {
        Empleado orozco= new Empleado("Andres Orozco","1053808595",3500000);
        return orozco;
    }

    @GetMapping(path = "/Empleados")
    public Empleado[] getAllEmployees()
    {

    }


}
