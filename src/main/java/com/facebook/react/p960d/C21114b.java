package com.facebook.react.p960d;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.react.d.b */
public class C21114b {

    /* renamed from: a */
    private static final Pattern f51502a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* renamed from: a */
    private static String m76745a(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f51502a.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }

    /* renamed from: a */
    public static String m76746a(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString("methodName"));
            sb.append("@");
            sb.append(m76745a(map));
            if (!map.hasKey("lineNumber") || map.isNull("lineNumber") || map.getType("lineNumber") != ReadableType.Number) {
                sb.append(-1);
            } else {
                sb.append(map.getInt("lineNumber"));
            }
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt("column"));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
