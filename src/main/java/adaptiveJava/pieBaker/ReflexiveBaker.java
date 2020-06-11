package adaptiveJava.pieBaker;

public class ReflexiveBaker {
    /**
     * Create bakery of the provided class.
     *
     * @param order class of bakery to create
     * @return bakery object
     */

    public <T extends Object> T bake(Class<T> order) throws Exception {
        if (order.equals(getClass())) {
            System.out.println("Well done!");
        }
        return order.getDeclaredConstructor().newInstance();
    }


    public static void main(String[] args) throws Exception {
        ReflexiveBaker baker = new ReflexiveBaker();
        baker.bake(ReflexiveBaker.class);
    }
}
