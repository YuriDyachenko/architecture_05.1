package kurs;

import kurs.chain.ChainExample;
import kurs.command.CommandExample;

public class Main {

    public static void main(String[] args) {
        //пример использования Chain of Responsibility
        new ChainExample().run();
        //пример использования Command
        new CommandExample().run();
    }
}
