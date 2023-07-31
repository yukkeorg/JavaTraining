package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.s_giken.training.webapp.model.Charge;
import com.s_giken.training.webapp.model.ChargeSearchCondition;
import com.s_giken.training.webapp.repository.ChargeRepository;

/**
 * 課金情報サービスクラス
 */
@Service
public class ChargeServiceImpl implements ChargeService {
    private ChargeRepository chargeRepository;

    /**
     * 課金情報サービスクラスのコンストラクタ
     * 
     * @param chargeRepository 課金情報リポジトリクラス(SpringのDIコンテナから渡される)
     */
    public ChargeServiceImpl(ChargeRepository chargeRepository) {
        this.chargeRepository = chargeRepository;
    }

    /**
     * 課金情報を全件取得する
     * 
     * @return 全課金情報
     */
    @Override
    public List<Charge> findAll() {
        return chargeRepository.findAll();
    }

    /**
     * 課金情報を1件取得する
     * 
     * @param chargeId 課金情報ID
     * @return 課金情報IDに一致した課金情報
     */
    @Override
    public Optional<Charge> findById(int chargeId) {
        return chargeRepository.findById(chargeId);
    }

    /**
     * 課金情報を条件検索する
     * 
     * @param condition 課金情報検索条件
     * @return 条件に一致した課金情報
     */
    @Override
    public List<Charge> findByCondition(ChargeSearchCondition condition) {
        List<Charge> result = null;
        if (condition.getName() == null || condition.getName().isEmpty()) {
            result = chargeRepository.findAll();
        } else {
            result = chargeRepository.findByNameLike("%" + condition.getName() + "%");
        }
        return result;
    }

    /**
     * 課金情報を保存する
     * 
     * @param charge 課金情報
     */
    @Override
    @Transactional
    public void save(Charge charge) {
        var c = chargeRepository.findById(charge.getChargeId());
        if (c.isPresent()) {

        }
        chargeRepository.save(charge);
    }

    /**
     * 課金情報を削除する
     * 
     * @param chargeId 課金情報ID
     */
    @Override
    public void deleteById(int chargeId) {
        chargeRepository.deleteById(chargeId);
    }
}
