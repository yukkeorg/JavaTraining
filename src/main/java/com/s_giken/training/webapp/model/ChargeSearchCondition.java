package com.s_giken.training.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 課金情報検索条件エンティティ
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeSearchCondition {
    private String name;

    private Boolean isShownId = true;
    private Boolean isShownName = true;
    private Boolean isShownAmount = true;
    private Boolean isShownStartDate = true;
    private Boolean isShownEndDate = true;

    private String sortColName = "";
    private String sortOrder = "";
}
