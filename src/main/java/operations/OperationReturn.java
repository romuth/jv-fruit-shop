package operations;

public class OperationReturn implements Operation {
    @Override
    public int calculate(int first, int second) {
        return first + second;
    }
}
