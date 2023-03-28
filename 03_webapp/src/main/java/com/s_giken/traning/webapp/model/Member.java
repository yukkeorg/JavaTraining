package com.s_giken.traning.webapp.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data   // auto-generate a getter and setter to each member variables.
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_MEMBER")
public class Member {
    @Id
    @Column(name = "member_id")
    private int memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "payment_method")
    private int paymentMethod;
}