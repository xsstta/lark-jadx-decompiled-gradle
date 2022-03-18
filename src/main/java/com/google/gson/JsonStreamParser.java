package com.google.gson;

import com.google.gson.internal.C23022j;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        boolean z;
        synchronized (this.lock) {
            try {
                if (this.parser.peek() != JsonToken.END_DOCUMENT) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        if (hasNext()) {
            try {
                return C23022j.m83503a(this.parser);
            } catch (StackOverflowError e) {
                throw new JsonParseException("Failed parsing JSON source to Json", e);
            } catch (OutOfMemoryError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            } catch (JsonParseException e3) {
                if (e3.getCause() instanceof EOFException) {
                    throw new NoSuchElementException();
                }
                throw e3;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setLenient(true);
        this.lock = new Object();
    }
}
