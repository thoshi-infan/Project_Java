import java.util.*;
public class PythagoreanTriplet {
    private final int a, b, c;
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet object = (PythagoreanTriplet) obj;
        return a == object.a && b == object.b && c == object.c;
    }
    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    public static class PythagoreanTripletBuilder {
        private int limit, sum;
        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit) {
            this.limit = limit;
            return this;
        }
        public PythagoreanTripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> list = new ArrayList<>();
            for (int a = 1; a < limit/3; a++) {
                for (int b = a+1; b < limit/2 ; b++) {
                    int c = sum - (a + b);
                    if (a*a + b*b == c*c) {
                        list.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return list;
        }
    }
}
