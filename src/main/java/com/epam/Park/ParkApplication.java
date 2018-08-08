package com.epam.Park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.epam.Park.service.Tree;
import com.epam.Park.service.repository.ParkDAO_Impl;

@SpringBootApplication
public class ParkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ParkApplication.class, args);
        ParkDAO_Impl parkDAO = applicationContext.getBean(ParkDAO_Impl.class);

        parkDAO.plantTree(new Tree(0, "Bereza"));
        parkDAO.plantTree(new Tree(1, "Osina"));
        parkDAO.plantTree(new Tree(2, "Lipa"));
        parkDAO.findAllTrees();

        parkDAO.cutTreeByID(0);
        parkDAO.findAllTrees();

        parkDAO.paintTree(1, "white");
        parkDAO.findTreeByID(1);


    }



}
