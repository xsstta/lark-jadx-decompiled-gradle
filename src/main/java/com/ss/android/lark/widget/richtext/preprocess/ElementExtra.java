package com.ss.android.lark.widget.richtext.preprocess;

import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext2.entity.C59067a;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ElementExtra implements Serializable {
    private static final long serialVersionUID = -47929645870592732L;
    private String elementId;
    private FloorInfo floorInfo = new FloorInfo();
    private boolean isFromMe;
    private boolean isIgnore;
    private boolean isInList;
    private boolean isNeedSpacing;
    private Map<String, Integer> localStyle = new ConcurrentHashMap();
    private String parentId;
    private Map<String, String> remoteStyle = new ConcurrentHashMap();

    public class FloorInfo implements Serializable {
        private static final long serialVersionUID = -6809914802218215075L;
        public int floor = -1;
        private RichTextElement.RichTextProperty floorProperty;
        public int index = -1;
        public boolean isNeedDrawPrefix = true;

        public RichTextElement.RichTextProperty getFloorProperty() {
            return this.floorProperty;
        }

        public boolean isEnabled() {
            if (this.floor <= -1 || this.index <= -1 || this.floorProperty == null) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "FloorInfo{floor=" + this.floor + ", index=" + this.index + ", isNeedDrawPrefix=" + this.isNeedDrawPrefix + ", floorProperty=" + this.floorProperty + '}';
        }

        public FloorInfo() {
        }

        public void setFloorProperty(RichTextElement.RichTextProperty richTextProperty) {
            if ((richTextProperty instanceof RichTextElement.OLProperty) || (richTextProperty instanceof RichTextElement.ULProperty)) {
                this.floorProperty = richTextProperty;
            }
        }
    }

    public String getElementId() {
        return this.elementId;
    }

    public FloorInfo getFloorInfo() {
        return this.floorInfo;
    }

    public Map<String, Integer> getLocalStyle() {
        return this.localStyle;
    }

    public String getParentId() {
        return this.parentId;
    }

    public Map<String, String> getRemoteStyle() {
        return this.remoteStyle;
    }

    public boolean isFromMe() {
        return this.isFromMe;
    }

    public boolean isIgnore() {
        return this.isIgnore;
    }

    public boolean isInList() {
        return this.isInList;
    }

    public boolean isNeedSpacing() {
        return this.isNeedSpacing;
    }

    private void filter() {
        for (Map.Entry<String, String> entry : this.remoteStyle.entrySet()) {
            String key = entry.getKey();
            if (!C59067a.f146426a.contains(key)) {
                this.remoteStyle.remove(key);
            }
        }
    }

    public void setElementId(String str) {
        this.elementId = str;
    }

    public void setFromMe(boolean z) {
        this.isFromMe = z;
    }

    public void setIgnore(boolean z) {
        this.isIgnore = z;
    }

    public void setInList(boolean z) {
        this.isInList = z;
    }

    public void setNeedSpacing(boolean z) {
        this.isNeedSpacing = z;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void appendLocalStyle(Map<String, Integer> map) {
        if (map != null) {
            this.localStyle.putAll(map);
        }
    }

    public void appendRemoteStyle(Map<String, String> map) {
        if (map != null) {
            this.remoteStyle.putAll(map);
            filter();
        }
    }

    public void appendLocalStyle(String str, int i) {
        this.localStyle.put(str, Integer.valueOf(i));
    }
}
