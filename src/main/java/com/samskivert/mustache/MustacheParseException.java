package com.samskivert.mustache;

public class MustacheParseException extends MustacheException {
    public MustacheParseException(String str) {
        super(str);
    }

    public MustacheParseException(String str, int i) {
        super(str + " @ line " + i);
    }
}
