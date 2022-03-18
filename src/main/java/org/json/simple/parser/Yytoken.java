package org.json.simple.parser;

public class Yytoken {
    public int type;
    public Object value;

    public Yytoken(int i, Object obj) {
        this.type = i;
        this.value = obj;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.type) {
            case -1:
                str = "END OF FILE";
                stringBuffer.append(str);
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.value);
                str = ")";
                stringBuffer.append(str);
                break;
            case 1:
                str = "LEFT BRACE({)";
                stringBuffer.append(str);
                break;
            case 2:
                str = "RIGHT BRACE(})";
                stringBuffer.append(str);
                break;
            case 3:
                str = "LEFT SQUARE([)";
                stringBuffer.append(str);
                break;
            case 4:
                str = "RIGHT SQUARE(])";
                stringBuffer.append(str);
                break;
            case 5:
                str = "COMMA(,)";
                stringBuffer.append(str);
                break;
            case 6:
                str = "COLON(:)";
                stringBuffer.append(str);
                break;
        }
        return stringBuffer.toString();
    }
}
