package ru.otus;

import com.google.common.base.Splitter;

public class HelloOtus {
    public void fromHelloOtus(){
        Iterable<String> container = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("Hello!, Otus!");
        for (String string : container) {
            System.out.println(string);
        }
    }
}
