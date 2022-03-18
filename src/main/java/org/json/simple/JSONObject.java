package org.json.simple;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class JSONObject extends HashMap implements Map, JSONAware, JSONStreamAware {
    private static final long serialVersionUID = -503443796854799292L;

    public static String escape(String str) {
        return JSONValue.escape(str);
    }

    private static String toJSONString(String str, Object obj, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (str == null) {
            stringBuffer.append("null");
        } else {
            JSONValue.escape(str, stringBuffer);
        }
        stringBuffer.append('\"');
        stringBuffer.append(':');
        stringBuffer.append(JSONValue.toJSONString(obj));
        return stringBuffer.toString();
    }

    public static String toJSONString(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        stringBuffer.append('{');
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            toJSONString(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public static String toString(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        toJSONString(str, obj, stringBuffer);
        return stringBuffer.toString();
    }

    public static void writeJSONString(Map map, Writer writer) throws IOException {
        if (map == null) {
            writer.write("null");
            return;
        }
        boolean z = true;
        writer.write(SmActions.ACTION_CALLING_ENTRY);
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(escape(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            JSONValue.writeJSONString(entry.getValue(), writer);
        }
        writer.write(SmActions.ACTION_RINGING_ENTRY);
    }

    @Override // org.json.simple.JSONAware
    public String toJSONString() {
        return toJSONString(this);
    }

    public String toString() {
        return toJSONString();
    }

    @Override // org.json.simple.JSONStreamAware
    public void writeJSONString(Writer writer) throws IOException {
        writeJSONString(this, writer);
    }
}
