package com.ss.android.lark.searchcommon.dto.info;

import com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u0018H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016¨\u0006."}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchCardInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "()V", "value", "", "columnLimit", "getColumnLimit", "()I", "setColumnLimit", "(I)V", "defaultExpand", "", "getDefaultExpand", "()Z", "setDefaultExpand", "(Z)V", "expand", "getExpand", "setExpand", "infoList", "", "getInfoList", "()Ljava/util/List;", "location", "", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "nonTopRowList", "getNonTopRowList", "onMoreClickListener", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "getOnMoreClickListener", "()Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "setOnMoreClickListener", "(Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;)V", "rowLimit", "getRowLimit", "setRowLimit", "topRowList", "getTopRowList", "resetDefaultValue", "", "setSession", "session", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchCardInfo extends SearchBaseInfo {
    private int columnLimit = 4;
    private boolean defaultExpand;
    private boolean expand;
    private final List<SearchBaseInfo> infoList = new ArrayList();
    private String location;
    private final List<SearchBaseInfo> nonTopRowList = new ArrayList();
    private IOnMoreClickListener onMoreClickListener;
    private int rowLimit = 3;
    private final List<SearchBaseInfo> topRowList = new ArrayList();

    public final int getColumnLimit() {
        return this.columnLimit;
    }

    public final boolean getDefaultExpand() {
        return this.defaultExpand;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final List<SearchBaseInfo> getInfoList() {
        return this.infoList;
    }

    public final String getLocation() {
        return this.location;
    }

    public final List<SearchBaseInfo> getNonTopRowList() {
        return this.nonTopRowList;
    }

    public final IOnMoreClickListener getOnMoreClickListener() {
        return this.onMoreClickListener;
    }

    public final int getRowLimit() {
        return this.rowLimit;
    }

    public final List<SearchBaseInfo> getTopRowList() {
        return this.topRowList;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public void resetDefaultValue() {
        super.resetDefaultValue();
        this.expand = this.defaultExpand;
    }

    public SearchCardInfo() {
        this.type = 100000017;
    }

    public final void setDefaultExpand(boolean z) {
        this.defaultExpand = z;
    }

    public final void setExpand(boolean z) {
        this.expand = z;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setOnMoreClickListener(IOnMoreClickListener bVar) {
        this.onMoreClickListener = bVar;
    }

    public final void setColumnLimit(int i) {
        if (i <= 0) {
            i = 4;
        }
        this.columnLimit = i;
    }

    public final void setRowLimit(int i) {
        if (i <= 0) {
            i = 3;
        }
        this.rowLimit = i;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public void setSession(String str) {
        super.setSession(str);
        for (SearchBaseInfo searchBaseInfo : this.infoList) {
            searchBaseInfo.setSession(str);
        }
    }
}
