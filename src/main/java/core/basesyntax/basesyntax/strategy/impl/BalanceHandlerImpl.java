package core.basesyntax.basesyntax.strategy.impl;

import core.basesyntax.basesyntax.dao.FruitDao;
import core.basesyntax.basesyntax.dao.FruitDaoImpl;
import core.basesyntax.basesyntax.model.FruitTransaction;
import core.basesyntax.basesyntax.strategy.OperationHandler;

public class BalanceHandlerImpl implements OperationHandler {
    private FruitDao fruitDao = new FruitDaoImpl();

    @Override
    public void apply(FruitTransaction transaction) {
        fruitDao.add(transaction.getFruit(), transaction.getQuantity());
    }
}
