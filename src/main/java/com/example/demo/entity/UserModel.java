package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

  @Id
  private String id;

  private String name;
}
