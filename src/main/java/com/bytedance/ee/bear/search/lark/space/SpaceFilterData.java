package com.bytedance.ee.bear.search.lark.space;

import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.ss.android.lark.widget.searchfilter.FilterData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/search/lark/space/SpaceFilterData;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "chatInfoList", "", "Lcom/bytedance/ee/bear/search/model/ChatInfo;", "getChatInfoList", "()Ljava/util/List;", "folder", "Lcom/bytedance/ee/bear/search/model/SearchRecord$Folder;", "getFolder", "()Lcom/bytedance/ee/bear/search/model/SearchRecord$Folder;", "setFolder", "(Lcom/bytedance/ee/bear/search/model/SearchRecord$Folder;)V", "ownerInfoList", "Lcom/bytedance/ee/bear/search/model/OwnerInfo;", "getOwnerInfoList", "typeItem", "Lcom/bytedance/ee/bear/search/adapter/SearchByTypeAdapter$TypeItem;", "getTypeItem", "()Lcom/bytedance/ee/bear/search/adapter/SearchByTypeAdapter$TypeItem;", "setTypeItem", "(Lcom/bytedance/ee/bear/search/adapter/SearchByTypeAdapter$TypeItem;)V", "search-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.search.lark.space.a */
public final class SpaceFilterData extends FilterData {

    /* renamed from: a */
    private SearchByTypeAdapter.TypeItem f29163a;

    /* renamed from: b */
    private final List<OwnerInfo> f29164b = new ArrayList();

    /* renamed from: c */
    private final List<ChatInfo> f29165c = new ArrayList();

    /* renamed from: d */
    private SearchRecord.Folder f29166d;

    /* renamed from: a */
    public final SearchByTypeAdapter.TypeItem mo41012a() {
        return this.f29163a;
    }

    /* renamed from: b */
    public final List<OwnerInfo> mo41015b() {
        return this.f29164b;
    }

    /* renamed from: c */
    public final List<ChatInfo> mo41016c() {
        return this.f29165c;
    }

    /* renamed from: d */
    public final SearchRecord.Folder mo41017d() {
        return this.f29166d;
    }

    /* renamed from: a */
    public final void mo41013a(SearchByTypeAdapter.TypeItem typeItem) {
        this.f29163a = typeItem;
    }

    /* renamed from: a */
    public final void mo41014a(SearchRecord.Folder folder) {
        this.f29166d = folder;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceFilterData(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
