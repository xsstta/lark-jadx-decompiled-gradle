package com.bytedance.ee.bear.lark.entityword;

import com.bytedance.ee.util.io.NonProguard;

/* access modifiers changed from: package-private */
public class EntityWordsData implements NonProguard {
    private String abbrId;
    private String clientArgs;
    private String query;
    private TriggerInfo triggerInfo;

    private static class TriggerInfo implements NonProguard {
        private double height;
        private double width;

        /* renamed from: x */
        private int f21528x;

        /* renamed from: y */
        private int f21529y;

        private TriggerInfo() {
        }

        public double getHeight() {
            return this.height;
        }

        public double getWidth() {
            return this.width;
        }

        public int getX() {
            return this.f21528x;
        }

        public int getY() {
            return this.f21529y;
        }

        public void setHeight(double d) {
            this.height = d;
        }

        public void setWidth(double d) {
            this.width = d;
        }

        public void setX(int i) {
            this.f21528x = i;
        }

        public void setY(int i) {
            this.f21529y = i;
        }
    }

    EntityWordsData() {
    }

    public String getAbbrId() {
        return this.abbrId;
    }

    public String getClientArgs() {
        return this.clientArgs;
    }

    public String getQuery() {
        return this.query;
    }

    public TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    public void setAbbrId(String str) {
        this.abbrId = str;
    }

    public void setClientArgs(String str) {
        this.clientArgs = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setTriggerInfo(TriggerInfo triggerInfo2) {
        this.triggerInfo = triggerInfo2;
    }
}
