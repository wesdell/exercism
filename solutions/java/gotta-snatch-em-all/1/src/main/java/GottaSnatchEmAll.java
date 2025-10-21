import java.util.List;
import java.util.HashSet;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<>(cards);
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> theirCollectionTemp = new HashSet<>(theirCollection);
        theirCollectionTemp.removeAll(myCollection);
        Set<String> myCollectionTemp = new HashSet<>(myCollection);
        myCollectionTemp.removeAll(theirCollection);
        return !myCollectionTemp.containsAll(theirCollectionTemp) && !myCollectionTemp.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> cards = new HashSet<>();
        for (Set<String> collection : collections) {
            cards.addAll(collection);
        }
        return cards;
    }

}
