package com.samskivert.mustache;

public class MustacheException extends RuntimeException {
    public MustacheException(String str) {
        super(str);
    }

    public MustacheException(Throwable th) {
        super(th);
    }

    public MustacheException(String str, Throwable th) {
        super(str, th);
    }

    public static class Context extends MustacheException {
        public final String key;
        public final int lineNo;

        public Context(String str, String str2, int i) {
            super(str);
            this.key = str2;
            this.lineNo = i;
        }

        public Context(String str, String str2, int i, Throwable th) {
            super(str, th);
            this.key = str2;
            this.lineNo = i;
        }
    }
}
