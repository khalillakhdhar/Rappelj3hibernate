package com.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ref {
@Id
private int id;
private String titre;

@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "userid", referencedColumnName = "id")
private Users users;

}
