class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException, IllegalOperationException {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int result = 0;
        try {
            if (operation.equals("+")) {
                result = operand1 + operand2;
            } else if (operation.equals("*")) {
                result = operand1 * operand2;
            } else if (operation.equals("/")) {
                result = operand1 / operand2;
            } else {
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return operand1 + " " + operation + " " + operand2 +  " = " + result;
    }

}
