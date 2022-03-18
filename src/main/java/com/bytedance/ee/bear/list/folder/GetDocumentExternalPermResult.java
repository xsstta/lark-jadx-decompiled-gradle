package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.contract.NetService;
import java.util.HashMap;

public class GetDocumentExternalPermResult extends NetService.Result {
    private HashMap<String, Boolean> permMap;

    public HashMap<String, Boolean> getPermMap() {
        return this.permMap;
    }

    public void setPermMap(HashMap<String, Boolean> hashMap) {
        this.permMap = hashMap;
    }
}
