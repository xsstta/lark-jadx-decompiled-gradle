package com.ss.android.lark.searchcommon.dto.info;

import android.text.TextUtils;
import com.bytedance.lark.pb.search.v2.ExplanationTag;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.pb.urecommend.IconStyle;
import com.ss.android.lark.searchcommon.dto.Scene;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SearchBaseInfo implements Serializable {
    private static final long serialVersionUID = -2947780791814807881L;
    private String avatarKey;
    private IconStyle avatarStyle = IconStyle.CIRCLE;
    private List<ExplanationTag> explanationTags;
    private Map<String, Object> extraParams;
    private String extraTitle;
    private List<String> extraTitleHitTerms;
    private String filterStatus;
    private boolean hasMore;
    private int headerId = Integer.MIN_VALUE;
    private String headerLabel;
    private Icon icon;
    private String id;
    private String imageUrl;
    private String imprId = "";
    private boolean isChatInsideShow;
    private boolean isCrossTenant;
    private boolean isCrossWithKa;
    private boolean isPickerShow;
    private boolean isRemind;
    private boolean mIsRequired;
    private boolean mIsSelected;
    private int newMsgCount;
    private String ownedCardTitle = "";
    private String query;
    private String requestId;
    private Scene.Type scene;
    private String searchLocation = "";
    private String session;
    private boolean showBadge;
    private String subTitle;
    private List<String> subTitleHitTerms;
    private final List<C53894a> subTitleRenderInfoList = new ArrayList();
    private String title;
    private List<String> titleHitTerms;
    protected int type;

    public String getResultTypeForReport() {
        return "none";
    }

    public void resetDefaultValue() {
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public IconStyle getAvatarStyle() {
        return this.avatarStyle;
    }

    public List<ExplanationTag> getExplanationTags() {
        return this.explanationTags;
    }

    public Map<String, Object> getExtraParams() {
        return this.extraParams;
    }

    public String getExtraTitle() {
        return this.extraTitle;
    }

    public List<String> getExtraTitleHitTerms() {
        return this.extraTitleHitTerms;
    }

    public String getFilterStatus() {
        return this.filterStatus;
    }

    public int getHeaderId() {
        return this.headerId;
    }

    public String getHeaderLabel() {
        return this.headerLabel;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getImprId() {
        return this.imprId;
    }

    public int getNewMsgCount() {
        return this.newMsgCount;
    }

    public String getOwnedCardTitle() {
        return this.ownedCardTitle;
    }

    public String getQuery() {
        return this.query;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Scene.Type getScene() {
        return this.scene;
    }

    public String getSearchLocation() {
        return this.searchLocation;
    }

    public String getSession() {
        return this.session;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public List<String> getSubTitleHitTerms() {
        return this.subTitleHitTerms;
    }

    public List<C53894a> getSubTitleRenderInfo() {
        return this.subTitleRenderInfoList;
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getTitleHitTerms() {
        return this.titleHitTerms;
    }

    public int getType() {
        return this.type;
    }

    public boolean isChatInsideShow() {
        return this.isChatInsideShow;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isCrossWithKa() {
        return this.isCrossWithKa;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isPickerShow() {
        return this.isPickerShow;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    public boolean isRequired() {
        return this.mIsRequired;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public boolean isShowBadge() {
        return this.showBadge;
    }

    public int hashCode() {
        return Objects.hash(this.id, Integer.valueOf(this.type));
    }

    public String getTagForReport() {
        StringBuilder sb = new StringBuilder();
        int i = this.type;
        if (i == 13) {
            sb.append("link,");
        } else if (i == 10) {
            sb.append("helpdesk,");
        }
        if (this.scene == Scene.Type.SMART_SEARCH) {
            sb.append("guess,");
        }
        if (!TextUtils.isEmpty(this.ownedCardTitle)) {
            sb.append(this.ownedCardTitle);
        }
        return sb.toString();
    }

    public void required(boolean z) {
        this.mIsRequired = z;
    }

    public void selected(boolean z) {
        this.mIsSelected = z;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarStyle(IconStyle iconStyle) {
        this.avatarStyle = iconStyle;
    }

    public void setChatInsideShow(boolean z) {
        this.isChatInsideShow = z;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCrossWithKa(boolean z) {
        this.isCrossWithKa = z;
    }

    public void setExplanationTags(List<ExplanationTag> list) {
        this.explanationTags = list;
    }

    public void setExtraParams(Map<String, Object> map) {
        this.extraParams = map;
    }

    public void setExtraTitle(String str) {
        this.extraTitle = str;
    }

    public void setExtraTitleHitTerms(List<String> list) {
        this.extraTitleHitTerms = list;
    }

    public void setFilterStatus(String str) {
        this.filterStatus = str;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHeaderId(int i) {
        this.headerId = i;
    }

    public void setHeaderLabel(String str) {
        this.headerLabel = str;
    }

    public void setIcon(Icon icon2) {
        this.icon = icon2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setImprId(String str) {
        this.imprId = str;
    }

    public void setNewMsgCount(int i) {
        this.newMsgCount = i;
    }

    public void setOwnedCardTitle(String str) {
        this.ownedCardTitle = str;
    }

    public void setPickerShow(boolean z) {
        this.isPickerShow = z;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setScene(Scene.Type type2) {
        this.scene = type2;
    }

    public void setSearchLocation(String str) {
        this.searchLocation = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setShowBadge(boolean z) {
        this.showBadge = z;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setSubTitleHitTerms(List<String> list) {
        this.subTitleHitTerms = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleHitTerms(List<String> list) {
        this.titleHitTerms = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setSubTitleRenderInfo(List<C53894a> list) {
        this.subTitleRenderInfoList.clear();
        this.subTitleRenderInfoList.addAll(list);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) obj;
        String str = this.id;
        if (str != null) {
            z = str.equals(searchBaseInfo.id);
        } else if (searchBaseInfo.id == null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.headerId;
        if (i2 == Integer.MIN_VALUE || (i = searchBaseInfo.headerId) == Integer.MIN_VALUE || i2 == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || this.type != searchBaseInfo.type || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo$a */
    public static class C53894a {

        /* renamed from: a */
        public String f133184a;

        /* renamed from: b */
        public int f133185b;

        /* renamed from: c */
        public int f133186c;

        public C53894a(String str, int i, int i2) {
            this.f133184a = str;
            this.f133185b = i;
            this.f133186c = i2;
        }
    }
}
