package org.json.simple;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONValue {
    public static String escape(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        escape(str, stringBuffer);
        return stringBuffer.toString();
    }

    static void escape(String str, StringBuffer stringBuffer) {
        String str2;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                str2 = "\\f";
            } else if (charAt == '\r') {
                str2 = "\\r";
            } else if (charAt == '\"') {
                str2 = "\\\"";
            } else if (charAt == '/') {
                str2 = "\\/";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        str2 = "\\b";
                        break;
                    case '\t':
                        str2 = "\\t";
                        break;
                    case '\n':
                        str2 = "\\n";
                        break;
                    default:
                        if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                stringBuffer.append('0');
                            }
                            str2 = hexString.toUpperCase();
                            break;
                        } else {
                            stringBuffer.append(charAt);
                            continue;
                        }
                        break;
                }
            } else {
                str2 = "\\\\";
            }
            stringBuffer.append(str2);
        }
    }

    public static Object parse(Reader reader) {
        try {
            return new JSONParser().parse(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parse(String str) {
        return parse(new StringReader(str));
    }

    public static Object parseWithException(Reader reader) throws IOException, ParseException {
        return new JSONParser().parse(reader);
    }

    public static Object parseWithException(String str) throws ParseException {
        return new JSONParser().parse(str);
    }

    public static String toJSONString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\"");
            stringBuffer.append(escape((String) obj));
            stringBuffer.append("\"");
            return stringBuffer.toString();
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            return (d.isInfinite() || d.isNaN()) ? "null" : obj.toString();
        } else if (!(obj instanceof Float)) {
            return obj instanceof Number ? obj.toString() : obj instanceof Boolean ? obj.toString() : obj instanceof JSONAware ? ((JSONAware) obj).toJSONString() : obj instanceof Map ? JSONObject.toJSONString((Map) obj) : obj instanceof List ? JSONArray.toJSONString((List) obj) : obj.toString();
        } else {
            Float f = (Float) obj;
            return (f.isInfinite() || f.isNaN()) ? "null" : obj.toString();
        }
    }

    public static void writeJSONString(Object obj, Writer writer) throws IOException {
        if (obj == null) {
            writer.write("null");
        } else if (obj instanceof String) {
            writer.write(34);
            writer.write(escape((String) obj));
            writer.write(34);
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Number) {
            writer.write(obj.toString());
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof JSONStreamAware) {
            ((JSONStreamAware) obj).writeJSONString(writer);
        } else if (obj instanceof JSONAware) {
            writer.write(((JSONAware) obj).toJSONString());
        } else if (obj instanceof Map) {
            JSONObject.writeJSONString((Map) obj, writer);
        } else if (obj instanceof List) {
            JSONArray.writeJSONString((List) obj, writer);
        } else {
            writer.write(obj.toString());
        }
    }
}
