package com.project.repository;

import com.project.model.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<MyOrder, Integer> {


    public List<MyOrder> findAll();

}
