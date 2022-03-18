package com.ss.android.vc.entity.follow;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class FollowStrategy implements Serializable {
    private static final long serialVersionUID = 1;
    private List<String> androidResourceIds;
    private boolean canBeReactivated;
    private String id;
    private boolean keepOrder;
    private boolean receivingDataWhenNotFollowing;
    private ResourceInjectTiming resourceInjectTiming;
    private Map<String, String> resourceVersions;
    private String settings;
    private UseDeviceIdScope useDeviceIdScope;
    private boolean useUserCard;

    public enum ResourceInjectTiming {
        UNKNOWN(0),
        BEFORE_LOAD(1),
        ON_LOAD(2),
        DOM_READY(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ResourceInjectTiming valueOf(int i) {
            return forNumber(i);
        }

        public static ResourceInjectTiming forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BEFORE_LOAD;
            }
            if (i == 2) {
                return ON_LOAD;
            }
            if (i != 3) {
                return null;
            }
            return DOM_READY;
        }

        private ResourceInjectTiming(int i) {
            this.value = i;
        }
    }

    public enum UseDeviceIdScope {
        NONE(0),
        ALL(1),
        STATE(2),
        PATCH(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static UseDeviceIdScope valueOf(int i) {
            return forNumber(i);
        }

        public static UseDeviceIdScope forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return ALL;
            }
            if (i == 2) {
                return STATE;
            }
            if (i != 3) {
                return null;
            }
            return PATCH;
        }

        private UseDeviceIdScope(int i) {
            this.value = i;
        }
    }

    public List<String> getAndroidResourceIds() {
        return this.androidResourceIds;
    }

    public String getId() {
        return this.id;
    }

    public ResourceInjectTiming getResourceInjectTiming() {
        return this.resourceInjectTiming;
    }

    public Map<String, String> getResourceVersions() {
        return this.resourceVersions;
    }

    public String getSettings() {
        return this.settings;
    }

    public UseDeviceIdScope getUseDeviceIdScope() {
        return this.useDeviceIdScope;
    }

    public boolean isCanBeReactivated() {
        return this.canBeReactivated;
    }

    public boolean isKeepOrder() {
        return this.keepOrder;
    }

    public boolean isReceivingDataWhenNotFollowing() {
        return this.receivingDataWhenNotFollowing;
    }

    public boolean isUseUserCard() {
        return this.useUserCard;
    }

    public String toString() {
        return "FollowStrategy{id='" + this.id + '\'' + ", androidResourceIds=" + this.androidResourceIds + ", resourceVersions=" + this.resourceVersions + ", useDeviceIdScope=" + this.useDeviceIdScope + ", useUserCard=" + this.useUserCard + ", settings='" + this.settings + '\'' + ", resourceInjectTiming=" + this.resourceInjectTiming + ", keepOrder=" + this.keepOrder + ", receivingDataWhenNotFollowing=" + this.receivingDataWhenNotFollowing + ", canBeReactivated=" + this.canBeReactivated + '}';
    }

    public void setAndroidResourceIds(List<String> list) {
        this.androidResourceIds = list;
    }

    public void setCanBeReactivated(boolean z) {
        this.canBeReactivated = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setKeepOrder(boolean z) {
        this.keepOrder = z;
    }

    public void setReceivingDataWhenNotFollowing(boolean z) {
        this.receivingDataWhenNotFollowing = z;
    }

    public void setResourceInjectTiming(ResourceInjectTiming resourceInjectTiming2) {
        this.resourceInjectTiming = resourceInjectTiming2;
    }

    public void setResourceVersions(Map<String, String> map) {
        this.resourceVersions = map;
    }

    public void setSettings(String str) {
        this.settings = str;
    }

    public void setUseDeviceIdScope(UseDeviceIdScope useDeviceIdScope2) {
        this.useDeviceIdScope = useDeviceIdScope2;
    }

    public void setUseUserCard(boolean z) {
        this.useUserCard = z;
    }
}
