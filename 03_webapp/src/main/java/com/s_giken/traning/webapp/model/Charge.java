package com.s_giken.traning.webapp.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "T_CHARGE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Charge extends AbstractEntity {
    @Id
    @Column(name = "charge_id")
    @NotNull
    private int chargeId;

    @Column(name = "name")
    @Size(max = 128, message = "128文字以内で入力してください。")
    @NotNull
    @NotBlank
    private String name;

    @Column(name = "chage_type")
    @Min(1)
    @Max(2)
    @NotNull
    private int chargeType;

    @Column(name = "amount")
    @Min(value = 0, message = "0以上の整数を入力して下さい")
    @Max(value = 999999, message = "999999以下の整数を入力してください")
    @NotNull
    private int amount;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date startDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    @Override
    public Integer getId() {
        return chargeId;
    }
}
