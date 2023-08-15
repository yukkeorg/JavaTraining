package com.s_giken.training.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 会員情報検索条件エンティティ
 */
@Data // メンバー変数に対するゲッター・セッターを自動生成
@NoArgsConstructor // 引数のないコンストラクタを自動生成
@AllArgsConstructor // 全てのメンバ変数に対する引数を持つコンストラクタを自動生成
public class MemberSearchCondition {
    // メールアドレス検索用
    private String mail;
    // 氏名検索用
    private String name;
    // 有効な加入者
    private Boolean isAvailable;
    private String radioAvailable;
    private String selectAvailable;

}
