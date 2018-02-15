package functionalJava.functionsAreObjects;

/**
 * Created by Vladimir Glinskikh on 30.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class NumberGenerator {
    private final GenerationStrategy strategy;

    public NumberGenerator(GenerationStrategy strategy) {
        this.strategy = strategy;
    }


    public GenerationStrategy getStrategy() {
        return strategy;
    }

    public String generate() {
        return strategy.generate();
    }
}
