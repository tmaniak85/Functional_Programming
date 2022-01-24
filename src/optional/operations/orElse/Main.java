package optional.operations.orElse;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String text = null;

        Optional<String> optional = Optional.ofNullable(text);
        System.out.println(optional.orElse(optional.orElse(defaultValue())));
//        orElse może być przydatna do domyślnych wartości, bo możemy wstawić po prostu orElse("Hi")
//        przy orElse(defaultValue()) metoda zostanie zawze wywołana niezależnie od tego czy null czy nie, bo
//        nie ma leniwego wywołania jak w przypadku orElseGet(Supplier...)
    }

    private static String defaultValue() {
        System.out.println("Wywołanie defaultValue");
        return "Hi";
    }
}
