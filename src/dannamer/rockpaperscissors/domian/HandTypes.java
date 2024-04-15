package dannamer.rockpaperscissors.domian;

import org.reflections.Reflections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandTypes {
    private static List<Class<? extends HandType>> subTypesList;

    public List<Class<? extends HandType>> getSubTypesList() {
        return new ArrayList<>(subTypesList);
    }
    public static int getHandSize() {
        return subTypesList.size();
    }
    public HandTypes() {
        Reflections reflections = new Reflections("dannamer.rockpaperscissors.domian");
        Set<Class<? extends HandType>> subTypesSet = reflections.getSubTypesOf(HandType.class);
        subTypesList = new ArrayList<>(subTypesSet);
    }

    public void printHandTypes() {
        // Собираем названия всех рук в одну строку
        StringBuilder gameTitle = new StringBuilder("Игра '");
        for (int i = 0; i < subTypesList.size(); i++) {
            gameTitle.append(subTypesList.get(i).getSimpleName());
            if (i < subTypesList.size() - 1) {
                gameTitle.append(", "); // Добавляем запятую между названиями, кроме последнего
            }
        }
        gameTitle.append("'");

        // Выводим сформированный заголовок игры
        System.out.println(gameTitle.toString());

        // Выводим доступные варианты выбора с индексами
        for (int i = 0; i < subTypesList.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + subTypesList.get(i).getSimpleName());
        }
    }

}

interface HandType {
    HandType getHand();
}
//Камень
class Rock implements HandType {
    @Override
    public HandType getHand() {
        return this;
    }
}
//Ножницы
class Paper implements HandType {
    @Override
    public HandType getHand() {
        return this;
    }
}
//Бумага
class Scissors implements HandType {
    @Override
    public HandType getHand() {
        return this;
    }
}
//
//class lolita implements HandType {
//    @Override
//    public HandType getHand() {
//        return this;
//    }
//}
//
//class Scot implements HandType {
//    @Override
//    public HandType getHand() {
//        return this;
//    }
//}