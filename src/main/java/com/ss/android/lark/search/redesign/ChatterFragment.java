package com.ss.android.lark.search.redesign;

import com.bytedance.lark.pb.search.v1.Scene;
import com.larksuite.suite.R;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/search/redesign/ChatterFragment;", "Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "()V", "attachInfoForReport", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "emptyHintIv", "", "emptyHintTv", "enablePullCommonRecommend", "", "recommendCacheKey", "", "recommendSectionList", "", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "sceneType", "Lcom/bytedance/lark/pb/search/v1/Scene$Type;", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.f */
public final class ChatterFragment extends BaseSearchTabFragment {

    /* renamed from: o */
    private HashMap f132695o;

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public String mo183078a() {
        return "recommend.contact.cache.key";
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: e */
    public int mo183082e() {
        return R.drawable.illustration_empty_neutral_no_contact;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: f */
    public int mo183083f() {
        return R.string.Lark_Search_SearchContactsPlaceholder;
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132695o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: c */
    public Scene.Type mo183080c() {
        return Scene.Type.SEARCH_CHATTERS;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public List<SectionEntityType> mo183079b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.USER)));
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: d */
    public boolean mo183081d() {
        if (!super.mo183081d() || !C53258a.m205939a().mo181745a("lark.search.common.recommend.contact")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        SearchContext a = super.mo183077a(str);
        a.mo184428l(true);
        a.mo184430m(false);
        a.mo184407c(true);
        a.mo184438q(true);
        a.mo184440r(true);
        return a;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public void mo183137a(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        super.mo183137a(list);
        for (SearchBaseInfo searchBaseInfo : list) {
            searchBaseInfo.setSearchLocation("contacts");
        }
    }
}
