package com.bytedance.ee.bear.doc.blockeditpanel.model;

import java.util.HashMap;
import java.util.Map;

public enum EMenuPanelId {
    blockMenuPanel("blockMenuPanel"),
    toolBarMenuPanel("toolBarMenuPanel"),
    highlightPanel("highlightPanel"),
    alignMenuPanel("alignMenuPanel"),
    visionMenuPanel("visionMenuPanel"),
    reactionPanel("reactionPanel");
    
    private static Map<String, EMenuPanelId> sMenuPanelIdMap = new HashMap();
    String id;

    static {
        EMenuPanelId[] values = values();
        for (EMenuPanelId eMenuPanelId : values) {
            sMenuPanelIdMap.put(eMenuPanelId.id, eMenuPanelId);
        }
    }

    public static EMenuPanelId getEnumMenuPanelIdByPanelId(String str) {
        return sMenuPanelIdMap.get(str);
    }

    private EMenuPanelId(String str) {
        this.id = str;
    }
}
