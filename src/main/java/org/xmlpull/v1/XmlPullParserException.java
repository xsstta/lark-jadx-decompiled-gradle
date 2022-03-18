package org.xmlpull.v1;

import java.io.PrintStream;

public class XmlPullParserException extends Exception {
    protected int column;
    protected Throwable detail;
    protected int row;

    public int getColumnNumber() {
        return this.column;
    }

    public Throwable getDetail() {
        return this.detail;
    }

    public int getLineNumber() {
        return this.row;
    }

    public void printStackTrace() {
        if (this.detail == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.detail.printStackTrace();
        }
    }

    public XmlPullParserException(String str) {
        super(str);
        this.row = -1;
        this.column = -1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XmlPullParserException(java.lang.String r4, org.xmlpull.v1.XmlPullParser r5, java.lang.Throwable r6) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.v1.XmlPullParserException.<init>(java.lang.String, org.xmlpull.v1.XmlPullParser, java.lang.Throwable):void");
    }
}
