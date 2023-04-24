@FunctionalInterface
interface Adder<T> {
    T add(T first, T second);
}

@FunctionalInterface
interface StringTransformer<T> {
    T transform(String initialString);
}

@FunctionalInterface
interface TypeConverter<T, R> {
    R convert(T input);
}

public class Main {
    public static <T> T addNumbers(Adder<T> adder, T firstNumber, T secondNumber) {
        return adder.add(firstNumber, secondNumber);
    }

    public static <T> T transformString(StringTransformer<T> stringTransformer, String initialString) {
        return stringTransformer.transform(initialString);
    }

    public static <T, R> R convertValue(TypeConverter<T, R> converter, T input) {
        return converter.convert(input);
    }

    public static void main(String[] args) {
        Adder<Integer> integerAdder = (a, b) -> a + b;
        int result1 = addNumbers(integerAdder, 10, 20);
        System.out.println(result1);

        Adder<Double> doubleAdder = (a, b) -> a + b;
        double result2 = addNumbers(doubleAdder, 10.5, 20.5);
        System.out.println(result2);

        StringTransformer<Integer> stringLength = new StringTransformer<Integer>() {
            @Override
            public Integer transform(String inputString) {
                return inputString.length();
            }
        };

        int stringLengthResult = transformString(stringLength, "Hello");
        System.out.println(stringLengthResult);

        StringTransformer<String> toUpperCase = new StringTransformer<String>() {
            @Override
            public String transform(String inputString) {
                return inputString.toUpperCase();
            }
        };

        String upperCasedString = transformString(toUpperCase, "hello");
        System.out.println(upperCasedString);

        TypeConverter<Integer, String> intToStringConverter = new TypeConverter<Integer, String>() {
            @Override
            public String convert(Integer input) {
                return Integer.toString(input);
            }
        };

        String stringValue = convertValue(intToStringConverter, 123);
        System.out.println(stringValue);
    }
}
