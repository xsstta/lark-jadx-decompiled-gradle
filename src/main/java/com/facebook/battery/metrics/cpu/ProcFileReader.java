package com.facebook.battery.metrics.cpu;

class ProcFileReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str) {
            super(str);
        }
    }
}
