package core.basesyntax.basesyntax.dao;

public interface FruitDao {
    void add(String fruitName, Integer quantity);

    int get(String fruitName);
}
