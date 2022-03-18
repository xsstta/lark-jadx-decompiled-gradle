package com.lark.falcon.engine.bridge;

public interface ReadableMapKeySetIterator {
    boolean hasNextKey();

    String nextKey();
}
