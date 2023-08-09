package com.s_giken.training.webapp.model;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 課金情報エンティティ
 */
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "T_CHARGE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Charge {
    @Id
    @Column(name = "charge_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chargeId;

    @Column(name = "name")
    @Size(max = 128, message = "128文字以内で入力してください。")
    @NotNull
    @NotBlank
    private String name;

    @Column(name = "amount")
    @Min(value = 0)
    @Max(value = 999999)
    @NotNull
    private Integer amount;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date startDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    @CreatedDate
    @Column(name = "created_at")
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
