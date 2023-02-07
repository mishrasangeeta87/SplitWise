package com.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class GroupExpense extends BaseModel{

    @ManyToOne
    private Group group;

    //1 GE => 1 E
    // 1 E => 1 E
    @OneToOne
    private Expense expense;
}
