package com.bytedance.frameworks.baselib.network.http.util;

import com.bytedance.common.utility.StringUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UrlBuilder {
    private final Map<String, List<String>> mParamMap;
    private String mUrl;

    public Map<String, List<String>> getParamsWithValueList() {
        return this.mParamMap;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String toString() {
        return build();
    }

    public UrlBuilder() {
        this.mParamMap = new LinkedHashMap();
        this.mUrl = null;
    }

    public String build() {
        if (this.mParamMap.isEmpty()) {
            return this.mUrl;
        }
        String format = UrlUtils.format(this.mParamMap, "UTF-8");
        String str = this.mUrl;
        if (str == null || str.length() == 0) {
            return format;
        }
        if (this.mUrl.indexOf(63) >= 0) {
            return this.mUrl + ContainerUtils.FIELD_DELIMITER + format;
        }
        return this.mUrl + "?" + format;
    }

    public Map<String, String> getParams() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, List<String>> map = this.mParamMap;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : this.mParamMap.entrySet()) {
                String key = entry.getKey();
                if (!StringUtils.isEmpty(key)) {
                    List<String> value = entry.getValue();
                    if (value == null || value.size() <= 0) {
                        str = "";
                    } else {
                        str = value.get(0);
                    }
                    linkedHashMap.put(key, str);
                }
            }
        }
        return linkedHashMap;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public UrlBuilder(String str) {
        this.mParamMap = new LinkedHashMap();
        this.mUrl = str;
    }

    public void addParam(String str, double d) {
        List<String> list = this.mParamMap.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(d));
        this.mParamMap.put(str, list);
    }

    public void addParam(String str, int i) {
        List<String> list = this.mParamMap.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(i));
        this.mParamMap.put(str, list);
    }

    public void addParam(String str, long j) {
        List<String> list = this.mParamMap.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(j));
        this.mParamMap.put(str, list);
    }

    public void addParam(String str, String str2) {
        List<String> list = this.mParamMap.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(str2));
        this.mParamMap.put(str, list);
    }
}
