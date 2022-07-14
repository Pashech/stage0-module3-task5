package lang.print.gaps.task5;

public class NumberDivider {

    void divide(int toBeDivided) {
        System.out.println(toBeDivided / 5.0);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(19);
    }
}
