package adaptiveJava.composingPredicates;

import java.util.List;
import java.util.function.IntPredicate;

public class App {
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        IntPredicate predicate = predicates.get(0);
        for(int i = 1; i < predicates.size(); i++){
            predicate = predicate.or(predicates.get(i));
        }
        return predicate;
    }
}
