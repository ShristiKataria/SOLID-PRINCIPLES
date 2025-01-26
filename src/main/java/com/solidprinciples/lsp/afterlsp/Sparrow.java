package com.solidprinciples.lsp.afterlsp;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("This sparrow can fly.");
    }
}
