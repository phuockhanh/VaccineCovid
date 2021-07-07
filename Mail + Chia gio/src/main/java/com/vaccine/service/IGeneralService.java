package com.vaccine.service;


import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);

    List<T> getUserListIsDone();

    Integer  countMaxTimeInDay();

    String getMaxDayFromData();

    String getMaxTimeFromData();

    int  countMaxDayToNext();
}