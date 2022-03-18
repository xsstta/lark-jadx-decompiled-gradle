package com.bytedance.ee.bear.document.statistics;

import java.io.Serializable;
import java.util.Map;

public class SendEventData implements Serializable {
    public Map<String, String> data;
    public int event_type;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("SendEventData{event_type=");
        sb.append(this.event_type);
        sb.append(", data=");
        Map<String, String> map = this.data;
        if (map != null) {
            str = map.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
