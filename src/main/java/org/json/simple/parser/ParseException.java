package org.json.simple.parser;

public class ParseException extends Exception {
    private static final long serialVersionUID = -7880698968187728548L;
    private int errorType;
    private int position;
    private Object unexpectedObject;

    public ParseException(int i) {
        this(-1, i, null);
    }

    public ParseException(int i, int i2, Object obj) {
        this.position = i;
        this.errorType = i2;
        this.unexpectedObject = obj;
    }

    public ParseException(int i, Object obj) {
        this(-1, i, obj);
    }

    public int getErrorType() {
        return this.errorType;
    }

    public int getPosition() {
        return this.position;
    }

    public Object getUnexpectedObject() {
        return this.unexpectedObject;
    }

    public void setErrorType(int i) {
        this.errorType = i;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setUnexpectedObject(Object obj) {
        this.unexpectedObject = obj;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.errorType;
        if (i == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.unexpectedObject);
            str = ") at position ";
        } else if (i == 1) {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.unexpectedObject);
            str = " at position ";
        } else if (i != 2) {
            str = "Unkown error at position ";
        } else {
            stringBuffer.append("Unexpected exception at position ");
            stringBuffer.append(this.position);
            stringBuffer.append(": ");
            stringBuffer.append(this.unexpectedObject);
            return stringBuffer.toString();
        }
        stringBuffer.append(str);
        stringBuffer.append(this.position);
        stringBuffer.append(".");
        return stringBuffer.toString();
    }
}
