package com.lark.falcon.engine.bridge;

import java.util.ArrayList;

public interface ReadableArray {
    ReadableArray getArray(int i);

    boolean getBoolean(int i);

    byte getByte(int i);

    byte[] getByteArray(int i);

    char getChar(int i);

    double getDouble(int i);

    AbstractC23967a getDynamic(int i);

    int getInt(int i);

    long getLong(int i);

    ReadableMap getMap(int i);

    NativeHostObject getNativeHostObject(int i);

    short getShort(int i);

    String getString(int i);

    ReadableType getType(int i);

    boolean isNull(int i);

    int size();

    ArrayList<Object> toArrayList();
}
