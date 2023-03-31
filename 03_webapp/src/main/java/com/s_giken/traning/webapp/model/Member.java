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
@Table(name = "T_MEMBER")   // 対応するデータベーステーブル名
@Data                       // メンバー変数に対するゲッター・セッターを自動生成
@NoArgsConstructor          // 引数のないコンストラクタを自動生成
@AllArgsConstructor         // 全てのメンバ変数に対する引数を持つコンストラクタを自動生成
public class Member {
    @Id
    @Column(name = "member_id")
    private int memberId;

    @Column(name = "mail")
    private String mail;
    
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