package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    private final List<JsonElement> elements;

    public int hashCode() {
        return this.elements.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.elements.iterator();
    }

    public int size() {
        return this.elements.size();
    }

    public JsonArray() {
        this.elements = new ArrayList();
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsBigDecimal();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsBigInteger();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsBoolean();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsByte();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsCharacter();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsDouble();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsFloat();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsInt();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsLong();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsNumber();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsShort();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        if (this.elements.size() == 1) {
            return this.elements.get(0).getAsString();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        if (this.elements.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(this.elements.size());
        for (JsonElement jsonElement : this.elements) {
            jsonArray.add(jsonElement.deepCopy());
        }
        return jsonArray;
    }

    public void addAll(JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.elements.add(jsonElement);
    }

    public JsonElement get(int i) {
        return this.elements.get(i);
    }

    public JsonElement remove(int i) {
        return this.elements.remove(i);
    }

    public JsonArray(int i) {
        this.elements = new ArrayList(i);
    }

    public void add(Boolean bool) {
        JsonElement jsonElement;
        List<JsonElement> list = this.elements;
        if (bool == null) {
            jsonElement = JsonNull.INSTANCE;
        } else {
            jsonElement = new JsonPrimitive(bool);
        }
        list.add(jsonElement);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements))) {
            return true;
        }
        return false;
    }

    public void add(Character ch) {
        JsonElement jsonElement;
        List<JsonElement> list = this.elements;
        if (ch == null) {
            jsonElement = JsonNull.INSTANCE;
        } else {
            jsonElement = new JsonPrimitive(ch);
        }
        list.add(jsonElement);
    }

    public void add(Number number) {
        JsonElement jsonElement;
        List<JsonElement> list = this.elements;
        if (number == null) {
            jsonElement = JsonNull.INSTANCE;
        } else {
            jsonElement = new JsonPrimitive(number);
        }
        list.add(jsonElement);
    }

    public void add(String str) {
        JsonElement jsonElement;
        List<JsonElement> list = this.elements;
        if (str == null) {
            jsonElement = JsonNull.INSTANCE;
        } else {
            jsonElement = new JsonPrimitive(str);
        }
        list.add(jsonElement);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        return this.elements.set(i, jsonElement);
    }
}
