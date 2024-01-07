package ru.hh.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//TODO: оформите entity
@Entity
public class Area {
  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
