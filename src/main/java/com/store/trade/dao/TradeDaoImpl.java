package com.store.trade.dao;

import com.store.trade.model.Trade;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TradeDaoImpl implements StoreTradeDao{
    @Override
    public void save(Trade trade) {
        trade.setCreatedDate(LocalDate.now());
        tradeMap.put(trade.getTradeId(),trade);
    }

    @Override
    public List<Trade> findAll() {
         return tradeMap.values().stream().
                 collect(Collectors.toList());
    }

    @Override
    public Trade findTrade(String tradeId) {
        return tradeMap.get(tradeId);
    }
}
