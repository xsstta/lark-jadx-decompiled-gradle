package com.ss.android.appcenter.business.net.dto;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.p1265a.C27575d;
import com.ss.android.appcenter.business.p1265a.C27577f;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.common.util.C28184h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemInfo implements Serializable {
    public static int index;
    @SerializedName("appId")
    private String appId;
    private String badgeInfo;
    @Expose(deserialize = false, serialize = false)
    private List<AppBadgeNode> badgeNodes;
    public String bizAppScene;
    @SerializedName("block")
    private BlockitInfo block;
    @SerializedName("botId")
    private String botId;
    @SerializedName("desc")
    private String description;
    @SerializedName("iconKey")
    private String iconKey;
    private boolean isBlock;
    @SerializedName("isNew")
    private boolean isNew;
    private boolean isWidget;
    @SerializedName("itemId")
    private String itemId;
    @SerializedName("itemType")
    private int itemType;
    @SerializedName("url")
    private ItemUrl itemUrl;
    @SerializedName("mobileDefaultAbility")
    private int mobileDefaultAbility;
    @SerializedName("name")
    private String name;
    @SerializedName("nativeAppKey")
    private String nativeAppKey;

    public ItemInfo() {
    }

    public List<AppBadgeNode> badgeNodes() {
        return this.badgeNodes;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBadgeInfo() {
        return this.badgeInfo;
    }

    public BlockitInfo getBlock() {
        return this.block;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIconKey() {
        return this.iconKey;
    }

    public String getItemId() {
        return this.itemId;
    }

    public int getMobileDefaultAbility() {
        return this.mobileDefaultAbility;
    }

    public String getName() {
        return this.name;
    }

    public String getNativeAppKey() {
        return this.nativeAppKey;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public boolean isWidget() {
        return this.isWidget;
    }

    public boolean isNormalApp() {
        if (this.itemType == 1) {
            return true;
        }
        return false;
    }

    public ItemUrl getItemUrl() {
        if (this.itemUrl == null) {
            this.itemUrl = new ItemUrl();
        }
        return this.itemUrl;
    }

    public boolean isBookmark() {
        if (this.itemType == 3) {
            return true;
        }
        return false;
    }

    public boolean isCreatedBlock() {
        if (this.itemType == 5) {
            return true;
        }
        return false;
    }

    public boolean isNative() {
        if (this.itemType == 4) {
            return true;
        }
        return false;
    }

    private void updateBadgeInfo() {
        if (this.badgeNodes == null) {
            this.badgeInfo = null;
        }
        this.badgeInfo = C27579g.f68797a.toJson(this.badgeNodes);
    }

    public boolean isSingleBot() {
        if (!getItemUrl().isAllUrlEmpty() || TextUtils.isEmpty(this.botId)) {
            return false;
        }
        return true;
    }

    public AppBadgeNode badgeNode() {
        List<AppBadgeNode> list = this.badgeNodes;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (AppBadgeNode appBadgeNode : this.badgeNodes) {
            if (appBadgeNode.appAbility == getMobileDefaultAbility()) {
                return appBadgeNode;
            }
        }
        return null;
    }

    public int badgeNum() {
        List<AppBadgeNode> list = this.badgeNodes;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int mobileDefaultAbility2 = getMobileDefaultAbility();
        AppBadgeNode appBadgeNode = null;
        Iterator<AppBadgeNode> it = this.badgeNodes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AppBadgeNode next = it.next();
            if (next.appAbility == mobileDefaultAbility2) {
                appBadgeNode = next;
                break;
            }
        }
        if (appBadgeNode != null && appBadgeNode.needShow) {
            return appBadgeNode.badgeNum;
        }
        return 0;
    }

    public void parseBadgeInfo() {
        if (this.badgeInfo != null) {
            try {
                this.badgeNodes = (List) C27579g.f68797a.fromJson(this.badgeInfo, new TypeToken<List<AppBadgeNode>>() {
                    /* class com.ss.android.appcenter.business.net.dto.ItemInfo.C277361 */
                }.getType());
            } catch (JsonSyntaxException e) {
                this.badgeNodes = null;
                C28184h.m103248b("ItemInfo", "parse badge info json failed," + e.toString());
            }
        }
    }

    public String toString() {
        return "ItemInfo{" + "itemId=" + this.itemId + ", iconKey='" + this.iconKey + '\'' + ", name='" + this.name + '\'' + ", description='" + this.description + '\'' + ", appId='" + this.appId + '\'' + ", botId='" + this.botId + '\'' + ", itemType=" + this.itemType + ", nativeAppKey='" + this.nativeAppKey + '\'' + ", itemUrl=" + this.itemUrl + '\'' + ", badgeInfo=" + this.badgeInfo + ", isBlock=" + this.isBlock + ", block=" + this.block + '}';
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setBadgeInfo(String str) {
        this.badgeInfo = str;
    }

    public void setBlock(BlockitInfo blockitInfo) {
        this.block = blockitInfo;
    }

    public void setBotId(String str) {
        this.botId = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public void setWidget(boolean z) {
        this.isWidget = z;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void updateBadgeNode(AppBadgeNode appBadgeNode) {
        if (appBadgeNode != null) {
            List<AppBadgeNode> list = this.badgeNodes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.badgeNodes = arrayList;
                arrayList.add(appBadgeNode);
                updateBadgeInfo();
                return;
            }
            AppBadgeNode appBadgeNode2 = null;
            for (AppBadgeNode appBadgeNode3 : list) {
                if (appBadgeNode3.appAbility == appBadgeNode.appAbility) {
                    appBadgeNode2 = appBadgeNode3;
                }
            }
            this.badgeNodes.remove(appBadgeNode2);
            this.badgeNodes.add(appBadgeNode);
            updateBadgeInfo();
        }
    }

    public AppBadgeNode badgeNode(int i) {
        List<AppBadgeNode> list = this.badgeNodes;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (AppBadgeNode appBadgeNode : this.badgeNodes) {
            if (appBadgeNode.appAbility == i) {
                return appBadgeNode;
            }
        }
        return null;
    }

    public void onClick(Context context) {
        C28184h.m103250d("ItemInfo", "click app: " + this);
        C27577f.m100655a(context, this);
        C27710b.m101264a(getName(), getAppId(), C27575d.m100643a(this), null, C27575d.m100644a(getItemUrl().getMobileAppLink()), null, badgeNum());
        C27710b.m101259a(getAppId(), getItemId());
    }

    public ItemInfo(String str, String str2) {
        this.itemId = str;
        this.iconKey = str2;
    }
}
