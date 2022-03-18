package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabListItemChangeEvent implements Serializable {
    private EventType eventType;
    private List<VCTabListItem> vcTabListItems;

    public enum EventType {
        INSERT_TOP(0),
        UPDATE(1),
        DELETE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static EventType valueOf(int i) {
            return forNumber(i);
        }

        public static EventType forNumber(int i) {
            if (i == 0) {
                return INSERT_TOP;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i != 2) {
                return null;
            }
            return DELETE;
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public List<VCTabListItem> getVcTabListItems() {
        return this.vcTabListItems;
    }

    public void setEventType(EventType eventType2) {
        this.eventType = eventType2;
    }

    public void setVcTabListItems(List<VCTabListItem> list) {
        this.vcTabListItems = list;
    }
}
