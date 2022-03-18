package com.bytedance.ee.bear.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocAppUserConfig implements Serializable {
    private List<String> docDomains = new ArrayList();
    private Map<Integer, String> urlRegex = new HashMap();

    public List<String> getDocDomains() {
        return this.docDomains;
    }

    public Map<Integer, String> getUrlRegex() {
        return this.urlRegex;
    }

    public DocAppUserConfig() {
    }

    public void setDocDomains(List<String> list) {
        this.docDomains = list;
    }

    public void setUrlRegex(Map<Integer, String> map) {
        this.urlRegex = map;
    }

    public DocAppUserConfig(List<String> list, Map<Integer, String> map) {
        this.docDomains = list;
        this.urlRegex = map;
    }
}
