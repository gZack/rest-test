package com.zack.resttest.repository;

import com.zack.resttest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Min;
import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUserByName(String name);
    List<User> findUserByAge(int age);
}
