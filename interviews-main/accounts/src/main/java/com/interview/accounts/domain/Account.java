package com.interview.accounts.domain;

import lombok.*;

import javax.persistence.*;

@Table(name = "accounts")
@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "number")
    private int number;
    @Column(name = "name")
    private String name;
    @Column(name = "balance")
    private double balance;


}
