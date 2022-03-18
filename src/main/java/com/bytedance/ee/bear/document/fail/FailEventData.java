package com.bytedance.ee.bear.document.fail;

import java.io.Serializable;
import java.util.Map;

public class FailEventData implements Serializable {
    public Map<String, Object> data;
    public int result_code;
    public String result_key;

    public String toString() {
        return "FailEventData{result_key='" + this.result_key + '\'' + ", result_code=" + this.result_code + ", data=" + this.data + '}';
    }
}
