package com.epam.Park.service.repository;

import com.epam.Park.service.entitiesDto.Request;

import java.util.ArrayList;
import java.util.List;

public interface RequestDAO {
    List<Request> requests = new ArrayList<>();

    void addRequest(Request request);

    void editRequest(int id, Request request);

    void deleteRequest(int Id);

}
