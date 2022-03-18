package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = -1098539356985888851L;
    private String entityId;
    private Type entityType;
    private long id;
    private boolean isHidden;
    private String nameWeight;
    private long orderWeight;
    private long parentId;
    private long version;

    public enum Type {
        UNKNOWN(0),
        CHAT(1),
        TEAM(2);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return CHAT;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return TEAM;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public String getEntityId() {
        return this.entityId;
    }

    public Type getEntityType() {
        return this.entityType;
    }

    public long getId() {
        return this.id;
    }

    public String getNameWeight() {
        return this.nameWeight;
    }

    public long getOrderWeight() {
        return this.orderWeight;
    }

    public long getParentId() {
        return this.parentId;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isHidden() {
        return this.isHidden;
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setEntityType(Type type) {
        this.entityType = type;
    }

    public void setHidden(boolean z) {
        this.isHidden = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setNameWeight(String str) {
        this.nameWeight = str;
    }

    public void setOrderWeight(long j) {
        this.orderWeight = j;
    }

    public void setParentId(long j) {
        this.parentId = j;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
