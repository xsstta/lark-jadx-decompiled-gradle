package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.image.ImageSet;
import java.io.Serializable;
import java.util.List;

public class ImageHistoryResponse implements Serializable {
    private boolean hasMoreAfter;
    private boolean hasMoreBefore;
    private List<ImageSet> imageSetList;

    public enum Direction {
        UNKNOWN(0),
        BEFORE(1),
        AFTER(2),
        BIDIRECT(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Direction valueOf(int i) {
            return forNumber(i);
        }

        public static Direction forNumber(int i) {
            if (i == 1) {
                return BEFORE;
            }
            if (i == 2) {
                return AFTER;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return BIDIRECT;
        }

        private Direction(int i) {
            this.value = i;
        }
    }

    public enum ResourceType {
        UNKNOWN(0),
        IMAGE(1),
        VIDEO(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ResourceType valueOf(int i) {
            return forNumber(i);
        }

        public static ResourceType forNumber(int i) {
            if (i == 1) {
                return IMAGE;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return VIDEO;
        }

        private ResourceType(int i) {
            this.value = i;
        }
    }

    public List<ImageSet> getImageSetList() {
        return this.imageSetList;
    }

    public boolean isHasMoreAfter() {
        return this.hasMoreAfter;
    }

    public boolean isHasMoreBefore() {
        return this.hasMoreBefore;
    }

    public void setHasMoreAfter(boolean z) {
        this.hasMoreAfter = z;
    }

    public void setHasMoreBefore(boolean z) {
        this.hasMoreBefore = z;
    }

    public void setImageSetList(List<ImageSet> list) {
        this.imageSetList = list;
    }
}
