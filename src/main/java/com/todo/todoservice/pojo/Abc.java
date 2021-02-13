package com.todo.todoservice.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "abc")
@Data
public class Abc implements Serializable {
    @Id
    @Column(name = "id")
    Integer id;
}
