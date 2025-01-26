package com.solidprinciples.lsp.beforelsp;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }

    /*
    Why It Violates LSP:

The subclass Penguin cannot perform the fly() behavior defined in the superclass Bird.
This breaks the expectation that all Bird objects can fly.
     */
}
