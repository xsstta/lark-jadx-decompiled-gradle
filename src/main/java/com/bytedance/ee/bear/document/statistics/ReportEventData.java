package com.bytedance.ee.bear.document.statistics;

import java.io.Serializable;
import java.util.Map;

public class ReportEventData implements Serializable {
    public Map<String, Object> data;
    public String event_name;
    public boolean noPrefix;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{ event_name = ");
        sb.append(this.event_name);
        sb.append(", noPrefix = ");
        sb.append(this.noPrefix);
        sb.append(", data = ");
        Map<String, Object> map = this.data;
        if (map != null) {
            str = map.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
