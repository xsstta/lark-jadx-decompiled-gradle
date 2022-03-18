package com.ss.android.lark.search.redesign;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.search.v1.Scene;
import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53636d;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53637e;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.search.redesign.filter.DocCategoryFilterData;
import com.ss.android.lark.search.redesign.filter.DocFormatFilterData;
import com.ss.android.lark.search.redesign.filter.DocInChatFilterData;
import com.ss.android.lark.search.redesign.filter.DocMyOwnFilterData;
import com.ss.android.lark.search.redesign.filter.DocOwnerFilterData;
import com.ss.android.lark.search.redesign.filter.DocSearchContentTypeFilterData;
import com.ss.android.lark.search.redesign.filter.DocSharerFilterData;
import com.ss.android.lark.search.redesign.filter.DocTimeFilterData;
import com.ss.android.lark.search.redesign.filter.SearchFilterDialog;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectData;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectView;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.searchfilter.FilterData;
import com.ss.android.lark.widget.searchfilter.FilterView;
import com.ss.android.lark.widget.timepicker.TimeSelectDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0016\u0018\u0000 W2\u00020\u0001:\u0002WXB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\u001c\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001c\u0010)\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0016J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\bH\u0016J\b\u0010.\u001a\u00020\bH\u0016J\n\u0010/\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060%H\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u0002020%H\u0002J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002020%H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002020%H\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060%H\u0002J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060%H\u0002J\b\u00107\u001a\u00020\"H\u0002J\b\u00108\u001a\u00020\bH\u0016J\"\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020+2\b\u0010'\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020\"H\u0002J\b\u0010>\u001a\u00020\"H\u0002J\b\u0010?\u001a\u00020\"H\u0002J\b\u0010@\u001a\u00020\"H\u0002J\b\u0010A\u001a\u00020\"H\u0002J\b\u0010B\u001a\u00020\"H\u0002J\b\u0010C\u001a\u00020\"H\u0002J\b\u0010D\u001a\u00020\"H\u0002J\u0010\u0010E\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001a\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020\u0006H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0010H\u0016J\b\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020HH\u0002J\u0010\u0010R\u001a\u00020\"2\u0006\u0010Q\u001a\u00020HH\u0002J\u0010\u0010S\u001a\u00020\"2\u0006\u0010Q\u001a\u00020HH\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/search/redesign/DocFragment;", "Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "()V", "categoryFilterDialog", "Lcom/ss/android/lark/search/redesign/filter/SearchFilterDialog;", "categoryWording", "", "customRecommendCanLoadMore", "", "getCustomRecommendCanLoadMore", "()Z", "setCustomRecommendCanLoadMore", "(Z)V", "filterView", "Lcom/ss/android/lark/widget/searchfilter/FilterView;", "formatList", "", "Lcom/bytedance/lark/pb/basic/v1/Doc$Type;", "formatWording", "inChatWording", "myOwnWording", "onResetClick", "com/ss/android/lark/search/redesign/DocFragment$onResetClick$1", "Lcom/ss/android/lark/search/redesign/DocFragment$onResetClick$1;", "ownerWording", "searchContentTypeFilterDialog", "searchContentTypeWording", "sharerWording", "timeWording", "appendHistoryFilter", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "history", "checkFilterUsable", "customRecommend", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "customRecommendLoadMore", "emptyHintIv", "", "emptyHintTv", "enablePullCommonRecommend", "enablePullCustomRecommend", "filterStatusRpt", "getChatListFromLiveData", "getDocCategorySelectDataList", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectData;", "getDocFormatSelectDataList", "getDocSearchContentTypeSelectDataList", "getOwnerChatterListFromLiveData", "getSharerChatterListFromLiveData", "initFilter", "needEraseRecommendPadding", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onFilterByTime", "onFilterCategory", "onFilterFormat", "onFilterInChat", "onFilterMyOwn", "onFilterOwner", "onFilterSearchContentType", "onFilterSharer", "onHistoryUpdate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "recommendCacheKey", "recommendSectionList", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "sceneType", "Lcom/bytedance/lark/pb/search/v1/Scene$Type;", "showCategoryFilterDialog", "typeSelectView", "showFormatFilterDialog", "showSearchContentTypeFilterDialog", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "Companion", "Response2ListCallback", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.g */
public final class DocFragment extends BaseSearchTabFragment {

    /* renamed from: w */
    public static final Companion f132733w = new Companion(null);

    /* renamed from: A */
    private String f132734A;

    /* renamed from: B */
    private String f132735B;

    /* renamed from: C */
    private boolean f132736C;

    /* renamed from: D */
    private HashMap f132737D;

    /* renamed from: o */
    public FilterView f132738o;

    /* renamed from: p */
    public String f132739p;

    /* renamed from: q */
    public String f132740q;

    /* renamed from: r */
    public String f132741r;

    /* renamed from: s */
    public String f132742s;

    /* renamed from: t */
    public SearchFilterDialog f132743t;

    /* renamed from: u */
    public final List<Doc.Type> f132744u = new ArrayList();

    /* renamed from: v */
    public SearchFilterDialog f132745v;

    /* renamed from: x */
    private final C53756aa f132746x = new C53756aa(this);

    /* renamed from: y */
    private String f132747y;

    /* renamed from: z */
    private String f132748z;

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: M */
    public boolean mo183127M() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: O */
    public boolean mo183129O() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public String mo183078a() {
        return "recommend.doc.cache.key";
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: e */
    public int mo183082e() {
        return R.drawable.illustration_empty_neutral_no_cloud_document;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: f */
    public int mo183083f() {
        return R.string.Lark_Search_SearchSpacePlaceholder;
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132737D;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/redesign/DocFragment$Companion;", "", "()V", "SEARCH_DOC_FILTER_PICK_CHAT_REQUEST_ID", "", "SEARCH_DOC_FILTER_PICK_OWNER_CHATTER_REQUEST_ID", "SEARCH_DOC_FILTER_PICK_SHARER_CHATTER_REQUEST_ID", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: c */
    public Scene.Type mo183080c() {
        return Scene.Type.SEARCH_DOC;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$w */
    static final class C53783w<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ SearchInfoHistory f132789a;

        C53783w(SearchInfoHistory searchInfoHistory) {
            this.f132789a = searchInfoHistory;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            return C53637e.m207639b(this.f132789a.getFilter().chatIds);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$y */
    static final class C53785y<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132791a;

        /* renamed from: b */
        final /* synthetic */ SearchInfoHistory f132792b;

        C53785y(DocFragment gVar, SearchInfoHistory searchInfoHistory) {
            this.f132791a = gVar;
            this.f132792b = searchInfoHistory;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            return this.f132791a.mo183132R().mo182951a(this.f132792b.getFilter().docCreatorIds);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public List<SectionEntityType> mo183079b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.DOC)));
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: d */
    public boolean mo183081d() {
        if (!super.mo183081d() || !C53258a.m205939a().mo181745a("lark.search.common.recommend.doc")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$l */
    public static final class RunnableC53772l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132775a;

        RunnableC53772l(DocFragment gVar) {
            this.f132775a = gVar;
        }

        public final void run() {
            FilterView a = DocFragment.m208181a(this.f132775a);
            DocMyOwnFilterData b = this.f132775a.mo183156n().getDocMyOwnFilterData().mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…ocMyOwnFilterData.value!!");
            a.mo200820a(b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$p */
    public static final class C53776p<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132781a;

        C53776p(DocFragment gVar) {
            this.f132781a = gVar;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            List list;
            List<String> b;
            DocInChatFilterData b2 = this.f132781a.mo183156n().getDocInChatFilterDate().mo5927b();
            if (b2 == null || (b = b2.mo183349b()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) b);
            }
            return C53637e.m207639b(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$r */
    public static final class C53778r<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132783a;

        C53778r(DocFragment gVar) {
            this.f132783a = gVar;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            List<String> list;
            LinkedHashMap<String, String> a;
            Set<String> keySet;
            C53636d R = this.f132783a.mo183132R();
            DocOwnerFilterData b = this.f132783a.mo183156n().getDocOwnerFilterData().mo5927b();
            if (b == null || (a = b.mo183355a()) == null || (keySet = a.keySet()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) keySet);
            }
            return R.mo182951a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$u */
    public static final class C53781u<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132787a;

        C53781u(DocFragment gVar) {
            this.f132787a = gVar;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            List<String> list;
            LinkedHashMap<String, String> a;
            Set<String> keySet;
            C53636d R = this.f132787a.mo183132R();
            DocSharerFilterData b = this.f132787a.mo183156n().getDocSharerFilterData().mo5927b();
            if (b == null || (a = b.mo183360a()) == null || (keySet = a.keySet()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) keySet);
            }
            return R.mo182951a(list);
        }
    }

    private final List<String> af() {
        LinkedHashMap<String, String> a;
        Set<String> keySet;
        List<String> list;
        DocOwnerFilterData b = mo183156n().getDocOwnerFilterData().mo5927b();
        if (b == null || (a = b.mo183355a()) == null || (keySet = a.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    private final List<String> ag() {
        LinkedHashMap<String, String> a;
        Set<String> keySet;
        List<String> list;
        DocSharerFilterData b = mo183156n().getDocSharerFilterData().mo5927b();
        if (b == null || (a = b.mo183360a()) == null || (keySet = a.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    private final List<String> ah() {
        List<String> b;
        List<String> list;
        DocInChatFilterData b2 = mo183156n().getDocInChatFilterDate().mo5927b();
        if (b2 == null || (b = b2.mo183349b()) == null || (list = CollectionsKt.toList(b)) == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    /* renamed from: T */
    public final void mo183398T() {
        C1177w<DocMyOwnFilterData> docMyOwnFilterData = mo183156n().getDocMyOwnFilterData();
        DocMyOwnFilterData b = mo183156n().getDocMyOwnFilterData().mo5927b();
        if (b != null) {
            b.mo183352a(!b.mo183353a());
        } else {
            b = null;
        }
        docMyOwnFilterData.mo5929b(b);
    }

    /* renamed from: U */
    public final void mo183399U() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        TypeSelectView typeSelectView = new TypeSelectView(context, true);
        typeSelectView.mo183380a(ac());
        typeSelectView.setMOnTypeFilterClick(new C53774n(typeSelectView, this));
        m208182a(typeSelectView);
    }

    /* renamed from: V */
    public final void mo183400V() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        TypeSelectView typeSelectView = new TypeSelectView(context);
        typeSelectView.mo183380a(ad());
        typeSelectView.setMOnTypeFilterClick(new C53775o(typeSelectView, this));
        m208184b(typeSelectView);
    }

    /* renamed from: W */
    public final void mo183401W() {
        LinkedHashMap<String, String> a;
        DocOwnerFilterData b = mo183156n().getDocOwnerFilterData().mo5927b();
        if (b == null || (a = b.mo183355a()) == null || !a.isEmpty()) {
            C57865c.m224574a(new C53778r(this), new C53779s(this));
        } else {
            mo183138a(new ArrayList(), 1);
        }
    }

    /* renamed from: X */
    public final void mo183402X() {
        LinkedHashMap<String, String> a;
        DocSharerFilterData b = mo183156n().getDocSharerFilterData().mo5927b();
        if (b == null || (a = b.mo183360a()) == null || !a.isEmpty()) {
            C57865c.m224574a(new C53781u(this), new C53782v(this));
        } else {
            mo183138a(new ArrayList(), 2);
        }
    }

    /* renamed from: Y */
    public final void mo183403Y() {
        LinkedHashMap<String, String> a;
        DocInChatFilterData b = mo183156n().getDocInChatFilterDate().mo5927b();
        if (b == null || (a = b.mo183348a()) == null || !a.isEmpty()) {
            C57865c.m224574a(new C53776p(this), new C53777q(this));
        } else {
            mo183144b(new ArrayList(), 3);
        }
    }

    public final void aa() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        TypeSelectView typeSelectView = new TypeSelectView(context, true);
        typeSelectView.mo183380a(ae());
        typeSelectView.setMOnTypeFilterClick(new C53780t(typeSelectView, this));
        m208186c(typeSelectView);
    }

    /* renamed from: Z */
    public final void mo183404Z() {
        Pair<Date, Date> pair;
        TimeSelectDialog timeSelectDialog = new TimeSelectDialog(this.mContext);
        C53258a.m205939a().mo181735a(timeSelectDialog);
        timeSelectDialog.mo201294a(new C53773m(this));
        DocTimeFilterData b = mo183156n().getDocTimeFilterData().mo5927b();
        if (b != null) {
            pair = b.mo183362a();
        } else {
            pair = null;
        }
        if (pair != null) {
            timeSelectDialog.mo201293a(pair);
        }
        if (UIUtils.isActivityRunning(getActivity())) {
            timeSelectDialog.show();
        }
    }

    private final List<TypeSelectData> ac() {
        SearchContext.DocCategory docCategory;
        boolean z;
        ArrayList arrayList = new ArrayList();
        TypeSelectData bVar = new TypeSelectData(SearchContext.DocCategory.DOC.ordinal());
        String string = getString(R.string.Lark_Search_SearchDoc);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_Search_SearchDoc)");
        bVar.mo183394a(string);
        DocCategoryFilterData b = mo183156n().getDocCategoryFilterData().mo5927b();
        SearchContext.DocCategory docCategory2 = null;
        if (b != null) {
            docCategory = b.mo183343a();
        } else {
            docCategory = null;
        }
        boolean z2 = true;
        if (docCategory == SearchContext.DocCategory.DOC) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo183395a(z);
        arrayList.add(bVar);
        TypeSelectData bVar2 = new TypeSelectData(SearchContext.DocCategory.WIKI.ordinal());
        String string2 = getString(R.string.Lark_Search_SearchWiki);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_Search_SearchWiki)");
        bVar2.mo183394a(string2);
        DocCategoryFilterData b2 = mo183156n().getDocCategoryFilterData().mo5927b();
        if (b2 != null) {
            docCategory2 = b2.mo183343a();
        }
        if (docCategory2 != SearchContext.DocCategory.WIKI) {
            z2 = false;
        }
        bVar2.mo183395a(z2);
        arrayList.add(bVar2);
        return arrayList;
    }

    private final List<TypeSelectData> ae() {
        SearchContext.DocSearchContentType docSearchContentType;
        boolean z;
        ArrayList arrayList = new ArrayList();
        TypeSelectData bVar = new TypeSelectData(SearchContext.DocSearchContentType.ONLY_MATCH_TITLE.ordinal());
        String string = getString(R.string.Search_Filter_Doc_OnlyTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Search_Filter_Doc_OnlyTitle)");
        bVar.mo183394a(string);
        DocSearchContentTypeFilterData b = mo183156n().getDocSearchContentTypeData().mo5927b();
        SearchContext.DocSearchContentType docSearchContentType2 = null;
        if (b != null) {
            docSearchContentType = b.mo183357a();
        } else {
            docSearchContentType = null;
        }
        boolean z2 = true;
        if (docSearchContentType == SearchContext.DocSearchContentType.ONLY_MATCH_TITLE) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo183395a(z);
        arrayList.add(bVar);
        TypeSelectData bVar2 = new TypeSelectData(SearchContext.DocSearchContentType.ONLY_MATCH_COMMENT.ordinal());
        String string2 = getString(R.string.Lark_Search_FilterMatchComment);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_Search_FilterMatchComment)");
        bVar2.mo183394a(string2);
        DocSearchContentTypeFilterData b2 = mo183156n().getDocSearchContentTypeData().mo5927b();
        if (b2 != null) {
            docSearchContentType2 = b2.mo183357a();
        }
        if (docSearchContentType2 != SearchContext.DocSearchContentType.ONLY_MATCH_COMMENT) {
            z2 = false;
        }
        bVar2.mo183395a(z2);
        arrayList.add(bVar2);
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: w */
    public boolean mo183165w() {
        DocCategoryFilterData b;
        DocFormatFilterData b2;
        DocOwnerFilterData b3;
        DocSharerFilterData b4;
        DocInChatFilterData b5;
        DocTimeFilterData b6;
        DocSearchContentTypeFilterData b7;
        DocMyOwnFilterData b8 = mo183156n().getDocMyOwnFilterData().mo5927b();
        boolean z = true;
        if ((b8 == null || !b8.mo183354b()) && (((b = mo183156n().getDocCategoryFilterData().mo5927b()) == null || !b.mo183345b()) && (((b2 = mo183156n().getDocFormatFilterData().mo5927b()) == null || !b2.mo183347b()) && (((b3 = mo183156n().getDocOwnerFilterData().mo5927b()) == null || !b3.mo183356b()) && (((b4 = mo183156n().getDocSharerFilterData().mo5927b()) == null || !b4.mo183361b()) && (((b5 = mo183156n().getDocInChatFilterDate().mo5927b()) == null || !b5.mo183350c()) && (((b6 = mo183156n().getDocTimeFilterData().mo5927b()) == null || !b6.mo183364b()) && ((b7 = mo183156n().getDocSearchContentTypeData().mo5927b()) == null || !b7.mo183359b())))))))) {
            z = false;
        }
        if (z) {
            FilterView filterView = this.f132738o;
            if (filterView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            filterView.mo200822b();
        } else {
            FilterView filterView2 = this.f132738o;
            if (filterView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            filterView2.mo200819a();
        }
        return z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$onResetClick$1", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnResetClick;", "onResetClick", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$aa */
    public static final class C53756aa implements FilterView.IOnResetClick {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132749a;

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnResetClick
        /* renamed from: a */
        public void mo41008a() {
            C1177w<DocCategoryFilterData> docCategoryFilterData = this.f132749a.mo183156n().getDocCategoryFilterData();
            DocCategoryFilterData b = this.f132749a.mo183156n().getDocCategoryFilterData().mo5927b();
            DocMyOwnFilterData eVar = null;
            if (b != null) {
                b.mo183344a(SearchContext.DocCategory.ALL);
            } else {
                b = null;
            }
            docCategoryFilterData.mo5929b(b);
            C1177w<DocFormatFilterData> docFormatFilterData = this.f132749a.mo183156n().getDocFormatFilterData();
            DocFormatFilterData b2 = this.f132749a.mo183156n().getDocFormatFilterData().mo5927b();
            if (b2 != null) {
                b2.mo183346a().clear();
            } else {
                b2 = null;
            }
            docFormatFilterData.mo5929b(b2);
            C1177w<DocOwnerFilterData> docOwnerFilterData = this.f132749a.mo183156n().getDocOwnerFilterData();
            DocOwnerFilterData b3 = this.f132749a.mo183156n().getDocOwnerFilterData().mo5927b();
            if (b3 != null) {
                b3.mo183355a().clear();
            } else {
                b3 = null;
            }
            docOwnerFilterData.mo5929b(b3);
            C1177w<DocSharerFilterData> docSharerFilterData = this.f132749a.mo183156n().getDocSharerFilterData();
            DocSharerFilterData b4 = this.f132749a.mo183156n().getDocSharerFilterData().mo5927b();
            if (b4 != null) {
                b4.mo183360a().clear();
            } else {
                b4 = null;
            }
            docSharerFilterData.mo5929b(b4);
            C1177w<DocInChatFilterData> docInChatFilterDate = this.f132749a.mo183156n().getDocInChatFilterDate();
            DocInChatFilterData b5 = this.f132749a.mo183156n().getDocInChatFilterDate().mo5927b();
            if (b5 != null) {
                b5.mo183351d();
            } else {
                b5 = null;
            }
            docInChatFilterDate.mo5929b(b5);
            C1177w<DocTimeFilterData> docTimeFilterData = this.f132749a.mo183156n().getDocTimeFilterData();
            DocTimeFilterData b6 = this.f132749a.mo183156n().getDocTimeFilterData().mo5927b();
            if (b6 != null) {
                b6.mo183363a((Pair<Date, Date>) null);
            } else {
                b6 = null;
            }
            docTimeFilterData.mo5929b(b6);
            C1177w<DocSearchContentTypeFilterData> docSearchContentTypeData = this.f132749a.mo183156n().getDocSearchContentTypeData();
            DocSearchContentTypeFilterData b7 = this.f132749a.mo183156n().getDocSearchContentTypeData().mo5927b();
            if (b7 != null) {
                b7.mo183358a(SearchContext.DocSearchContentType.ALL);
            } else {
                b7 = null;
            }
            docSearchContentTypeData.mo5929b(b7);
            C1177w<DocMyOwnFilterData> docMyOwnFilterData = this.f132749a.mo183156n().getDocMyOwnFilterData();
            DocMyOwnFilterData b8 = this.f132749a.mo183156n().getDocMyOwnFilterData().mo5927b();
            if (b8 != null) {
                b8.mo183352a(false);
                eVar = b8;
            }
            docMyOwnFilterData.mo5929b(eVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53756aa(DocFragment gVar) {
            this.f132749a = gVar;
        }
    }

    private final List<TypeSelectData> ad() {
        List<Doc.Type> a;
        ArrayList<TypeSelectData> arrayList = new ArrayList();
        TypeSelectData bVar = new TypeSelectData(Doc.Type.DOC.ordinal());
        String string = getString(R.string.Lark_Search_DocSearchFilter);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_Search_DocSearchFilter)");
        bVar.mo183394a(string);
        bVar.mo183395a(false);
        arrayList.add(bVar);
        TypeSelectData bVar2 = new TypeSelectData(Doc.Type.SHEET.ordinal());
        String string2 = getString(R.string.Lark_Legacy_Sheets);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_Legacy_Sheets)");
        bVar2.mo183394a(string2);
        bVar2.mo183395a(false);
        arrayList.add(bVar2);
        if (C53339b.m206450j()) {
            TypeSelectData bVar3 = new TypeSelectData(Doc.Type.SLIDE.ordinal());
            String string3 = getString(R.string.Lark_Search_SlideSearchFilter);
            Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.Lark_Search_SlideSearchFilter)");
            bVar3.mo183394a(string3);
            bVar3.mo183395a(false);
            arrayList.add(bVar3);
        }
        if (C53339b.m206451k()) {
            TypeSelectData bVar4 = new TypeSelectData(Doc.Type.MINDNOTE.ordinal());
            String string4 = getString(R.string.Lark_Search_MindNoteSearchFilter);
            Intrinsics.checkExpressionValueIsNotNull(string4, "getString(R.string.Lark_…rch_MindNoteSearchFilter)");
            bVar4.mo183394a(string4);
            bVar4.mo183395a(false);
            arrayList.add(bVar4);
        }
        if (C53339b.m206452l()) {
            TypeSelectData bVar5 = new TypeSelectData(Doc.Type.BITABLE.ordinal());
            String string5 = getString(R.string.Lark_Search_BitableSearchFilter);
            Intrinsics.checkExpressionValueIsNotNull(string5, "getString(R.string.Lark_…arch_BitableSearchFilter)");
            bVar5.mo183394a(string5);
            bVar5.mo183395a(false);
            arrayList.add(bVar5);
        }
        TypeSelectData bVar6 = new TypeSelectData(Doc.Type.FILE.ordinal());
        String string6 = getString(R.string.Lark_Search_FileSearchFilter);
        Intrinsics.checkExpressionValueIsNotNull(string6, "getString(R.string.Lark_Search_FileSearchFilter)");
        bVar6.mo183394a(string6);
        bVar6.mo183395a(false);
        arrayList.add(bVar6);
        for (TypeSelectData bVar7 : arrayList) {
            DocFormatFilterData b = mo183156n().getDocFormatFilterData().mo5927b();
            if (!(b == null || (a = b.mo183346a()) == null || !a.contains(Doc.Type.fromValue(bVar7.mo183397c())))) {
                bVar7.mo183395a(true);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: D */
    public String mo183118D() {
        DocTimeFilterData b;
        Date date;
        StringBuilder sb = new StringBuilder();
        DocMyOwnFilterData b2 = mo183156n().getDocMyOwnFilterData().mo5927b();
        if (b2 != null && b2.mo183354b()) {
            sb.append("docMyown,");
        }
        DocCategoryFilterData b3 = mo183156n().getDocCategoryFilterData().mo5927b();
        if (b3 != null && b3.mo183345b()) {
            sb.append("wikiDocType,");
        }
        DocFormatFilterData b4 = mo183156n().getDocFormatFilterData().mo5927b();
        if (b4 != null && b4.mo183347b()) {
            sb.append("docTypes,");
        }
        DocOwnerFilterData b5 = mo183156n().getDocOwnerFilterData().mo5927b();
        if (b5 != null && b5.mo183356b()) {
            sb.append("docsAuthor,");
        }
        DocSharerFilterData b6 = mo183156n().getDocSharerFilterData().mo5927b();
        if (b6 != null && b6.mo183361b()) {
            sb.append("docShares,");
        }
        DocInChatFilterData b7 = mo183156n().getDocInChatFilterDate().mo5927b();
        if (b7 != null && b7.mo183350c()) {
            sb.append("docsChatIds,");
        }
        DocTimeFilterData b8 = mo183156n().getDocTimeFilterData().mo5927b();
        if (!(b8 == null || !b8.mo183364b() || (b = mo183156n().getDocTimeFilterData().mo5927b()) == null)) {
            Pair<Date, Date> a = b.mo183362a();
            Date date2 = null;
            if (a != null) {
                date = (Date) a.first;
            } else {
                date = null;
            }
            if (date != null) {
                sb.append("startTime,");
            }
            Pair<Date, Date> a2 = b.mo183362a();
            if (a2 != null) {
                date2 = (Date) a2.second;
            }
            if (date2 != null) {
                sb.append("endTime,");
            }
        }
        DocSearchContentTypeFilterData b9 = mo183156n().getDocSearchContentTypeData().mo5927b();
        if (b9 != null && b9.mo183359b()) {
            sb.append("docSearchType,");
        }
        return sb.toString();
    }

    private final void ab() {
        C1177w<DocMyOwnFilterData> docMyOwnFilterData = mo183156n().getDocMyOwnFilterData();
        DocMyOwnFilterData eVar = new DocMyOwnFilterData("doc/my_own");
        String str = this.f132747y;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myOwnWording");
        }
        eVar.mo200843a(str);
        docMyOwnFilterData.mo5929b(eVar);
        C1177w<DocCategoryFilterData> docCategoryFilterData = mo183156n().getDocCategoryFilterData();
        DocCategoryFilterData bVar = new DocCategoryFilterData("doc/type");
        String str2 = this.f132739p;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryWording");
        }
        bVar.mo200843a(str2);
        docCategoryFilterData.mo5929b(bVar);
        C1177w<DocFormatFilterData> docFormatFilterData = mo183156n().getDocFormatFilterData();
        DocFormatFilterData cVar = new DocFormatFilterData("doc/format");
        String str3 = this.f132740q;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("formatWording");
        }
        cVar.mo200843a(str3);
        docFormatFilterData.mo5929b(cVar);
        C1177w<DocOwnerFilterData> docOwnerFilterData = mo183156n().getDocOwnerFilterData();
        DocOwnerFilterData fVar = new DocOwnerFilterData("doc/owner");
        String str4 = this.f132748z;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerWording");
        }
        fVar.mo200843a(str4);
        docOwnerFilterData.mo5929b(fVar);
        C1177w<DocSharerFilterData> docSharerFilterData = mo183156n().getDocSharerFilterData();
        DocSharerFilterData hVar = new DocSharerFilterData("doc/sharer");
        String str5 = this.f132734A;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharerWording");
        }
        hVar.mo200843a(str5);
        docSharerFilterData.mo5929b(hVar);
        C1177w<DocInChatFilterData> docInChatFilterDate = mo183156n().getDocInChatFilterDate();
        DocInChatFilterData dVar = new DocInChatFilterData("doc/in/chat");
        String str6 = this.f132735B;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inChatWording");
        }
        dVar.mo200843a(str6);
        docInChatFilterDate.mo5929b(dVar);
        C1177w<DocTimeFilterData> docTimeFilterData = mo183156n().getDocTimeFilterData();
        DocTimeFilterData iVar = new DocTimeFilterData("doc/time");
        String str7 = this.f132741r;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeWording");
        }
        iVar.mo200843a(str7);
        docTimeFilterData.mo5929b(iVar);
        C1177w<DocSearchContentTypeFilterData> docSearchContentTypeData = mo183156n().getDocSearchContentTypeData();
        DocSearchContentTypeFilterData gVar = new DocSearchContentTypeFilterData("doc/content/type");
        String str8 = this.f132741r;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeWording");
        }
        gVar.mo200843a(str8);
        docSearchContentTypeData.mo5929b(gVar);
        FilterView filterView = this.f132738o;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        ArrayList arrayList = new ArrayList();
        DocMyOwnFilterData b = mo183156n().getDocMyOwnFilterData().mo5927b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…ocMyOwnFilterData.value!!");
        arrayList.add(b);
        if (C53339b.m206454n()) {
            DocCategoryFilterData b2 = mo183156n().getDocCategoryFilterData().mo5927b();
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(b2, "mBaseSearchTabFragmentVi…ategoryFilterData.value!!");
            arrayList.add(b2);
        }
        DocFormatFilterData b3 = mo183156n().getDocFormatFilterData().mo5927b();
        if (b3 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b3, "mBaseSearchTabFragmentVi…cFormatFilterData.value!!");
        arrayList.add(b3);
        DocOwnerFilterData b4 = mo183156n().getDocOwnerFilterData().mo5927b();
        if (b4 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b4, "mBaseSearchTabFragmentVi…ocOwnerFilterData.value!!");
        arrayList.add(b4);
        if (C53339b.m206453m()) {
            DocSharerFilterData b5 = mo183156n().getDocSharerFilterData().mo5927b();
            if (b5 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(b5, "mBaseSearchTabFragmentVi…cSharerFilterData.value!!");
            arrayList.add(b5);
        }
        FilterData[] bVarArr = new FilterData[3];
        DocInChatFilterData b6 = mo183156n().getDocInChatFilterDate().mo5927b();
        if (b6 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b6, "mBaseSearchTabFragmentVi…cInChatFilterDate.value!!");
        bVarArr[0] = b6;
        DocTimeFilterData b7 = mo183156n().getDocTimeFilterData().mo5927b();
        if (b7 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b7, "mBaseSearchTabFragmentVi…docTimeFilterData.value!!");
        bVarArr[1] = b7;
        DocSearchContentTypeFilterData b8 = mo183156n().getDocSearchContentTypeData().mo5927b();
        if (b8 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b8, "mBaseSearchTabFragmentVi…chContentTypeData.value!!");
        bVarArr[2] = b8;
        arrayList.addAll(CollectionsKt.listOf((Object[]) bVarArr));
        filterView.mo200821a(arrayList);
        filterView.setOnResetClick(this.f132746x);
        filterView.setOnFilterItemClick(new C53760c(this));
        mo183156n().getDocMyOwnFilterData().mo5923a(getViewLifecycleOwner(), new C53761d(this));
        mo183156n().getDocCategoryFilterData().mo5923a(getViewLifecycleOwner(), new C53762e(this));
        mo183156n().getDocFormatFilterData().mo5923a(getViewLifecycleOwner(), new C53763f(this));
        mo183156n().getDocOwnerFilterData().mo5923a(getViewLifecycleOwner(), new C53764g(this));
        mo183156n().getDocSharerFilterData().mo5923a(getViewLifecycleOwner(), new C53766h(this));
        mo183156n().getDocInChatFilterDate().mo5923a(getViewLifecycleOwner(), new C53768i(this));
        mo183156n().getDocTimeFilterData().mo5923a(getViewLifecycleOwner(), new C53770j(this));
        mo183156n().getDocSearchContentTypeData().mo5923a(getViewLifecycleOwner(), new C53771k(this));
        FilterView filterView2 = this.f132738o;
        if (filterView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        filterView2.post(new RunnableC53772l(this));
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public boolean mo183146b(SearchResponse searchResponse) {
        return this.f132736C;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$ac */
    public static final class View$OnClickListenerC53758ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterDialog f132753a;

        View$OnClickListenerC53758ac(SearchFilterDialog searchFilterDialog) {
            this.f132753a = searchFilterDialog;
        }

        public final void onClick(View view) {
            this.f132753a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$initFilter$9$2", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "onFilterItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$c */
    public static final class C53760c implements FilterView.IOnFilterItemClick {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132760a;

        C53760c(DocFragment gVar) {
            this.f132760a = gVar;
        }

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnFilterItemClick
        /* renamed from: a */
        public void mo41007a(FilterData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String h = bVar.mo200849h();
            switch (h.hashCode()) {
                case -1058114788:
                    if (h.equals("doc/owner")) {
                        this.f132760a.mo183401W();
                        return;
                    }
                    return;
                case -287027157:
                    if (h.equals("doc/in/chat")) {
                        this.f132760a.mo183403Y();
                        return;
                    }
                    return;
                case 797286724:
                    if (h.equals("doc/time")) {
                        this.f132760a.mo183404Z();
                        return;
                    }
                    return;
                case 797302193:
                    if (h.equals("doc/type")) {
                        this.f132760a.mo183399U();
                        return;
                    }
                    return;
                case 1293255854:
                    if (h.equals("doc/format")) {
                        this.f132760a.mo183400V();
                        return;
                    }
                    return;
                case 1502331690:
                    if (h.equals("doc/my_own")) {
                        this.f132760a.mo183398T();
                        return;
                    }
                    return;
                case 1658468650:
                    if (h.equals("doc/sharer")) {
                        this.f132760a.mo183402X();
                        return;
                    }
                    return;
                case 1692497543:
                    if (h.equals("doc/content/type")) {
                        this.f132760a.aa();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    public final void mo183406c(boolean z) {
        this.f132736C = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$q */
    public static final class C53777q<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132782a;

        C53777q(DocFragment gVar) {
            this.f132782a = gVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.f132782a.mo183144b(list, 3);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$s */
    public static final class C53779s<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132784a;

        C53779s(DocFragment gVar) {
            this.f132784a = gVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.f132784a.mo183138a(list, 1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$v */
    public static final class C53782v<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132788a;

        C53782v(DocFragment gVar) {
            this.f132788a = gVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.f132788a.mo183138a(list, 2);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FilterView m208181a(DocFragment gVar) {
        FilterView filterView = gVar.f132738o;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        return filterView;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m208183b(DocFragment gVar) {
        String str = gVar.f132739p;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryWording");
        }
        return str;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m208185c(DocFragment gVar) {
        String str = gVar.f132740q;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("formatWording");
        }
        return str;
    }

    /* renamed from: d */
    public static final /* synthetic */ String m208187d(DocFragment gVar) {
        String str = gVar.f132741r;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeWording");
        }
        return str;
    }

    /* renamed from: e */
    public static final /* synthetic */ String m208188e(DocFragment gVar) {
        String str = gVar.f132742s;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchContentTypeWording");
        }
        return str;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: c */
    public void mo183147c(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo183159q().mo181874b("", null, new Response2ListCallback(this, iGetDataCallback, true));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocOwnerFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$g */
    public static final class C53764g<T> implements AbstractC1178x<DocOwnerFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132764a;

        C53764g(DocFragment gVar) {
            this.f132764a = gVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$initFilter$13$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmaps", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.g$g$a */
        public static final class C53765a implements IGetDataCallback<List<? extends Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ DocOwnerFilterData f132765a;

            /* renamed from: b */
            final /* synthetic */ C53764g f132766b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                Intrinsics.checkParameterIsNotNull(list, "bitmaps");
                this.f132765a.mo200848g().clear();
                this.f132765a.mo200848g().addAll(list);
                this.f132765a.mo200844b(true);
                FilterView a = DocFragment.m208181a(this.f132766b.f132764a);
                DocOwnerFilterData fVar = this.f132765a;
                Intrinsics.checkExpressionValueIsNotNull(fVar, "this@apply");
                a.mo200820a(fVar);
            }

            C53765a(DocOwnerFilterData fVar, C53764g gVar) {
                this.f132765a = fVar;
                this.f132766b = gVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(DocOwnerFilterData fVar) {
            if (fVar.mo183355a().size() > 0) {
                Collection<String> values = fVar.mo183355a().values();
                Intrinsics.checkExpressionValueIsNotNull(values, "ownerId2AvatarMap.values");
                List<String> mutableList = CollectionsKt.toMutableList((Collection) values);
                if (fVar.mo183355a().size() > 3) {
                    mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 3));
                }
                ISearchModuleDependency.AbstractC53327m S = this.f132764a.mo183133S();
                Set<String> keySet = fVar.mo183355a().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "ownerId2AvatarMap.keys");
                S.mo181807a(mutableList, new ArrayList(CollectionsKt.toMutableList((Collection) keySet)), UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new C53765a(fVar, this));
            } else {
                fVar.mo200848g().clear();
                fVar.mo200844b(false);
                FilterView a = DocFragment.m208181a(this.f132764a);
                Intrinsics.checkExpressionValueIsNotNull(fVar, "this");
                a.mo200820a(fVar);
            }
            DocFragment gVar = this.f132764a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocSharerFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$h */
    public static final class C53766h<T> implements AbstractC1178x<DocSharerFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132767a;

        C53766h(DocFragment gVar) {
            this.f132767a = gVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$initFilter$14$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmaps", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.g$h$a */
        public static final class C53767a implements IGetDataCallback<List<? extends Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ DocSharerFilterData f132768a;

            /* renamed from: b */
            final /* synthetic */ C53766h f132769b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                Intrinsics.checkParameterIsNotNull(list, "bitmaps");
                this.f132768a.mo200848g().clear();
                this.f132768a.mo200848g().addAll(list);
                this.f132768a.mo200844b(true);
                FilterView a = DocFragment.m208181a(this.f132769b.f132767a);
                DocSharerFilterData hVar = this.f132768a;
                Intrinsics.checkExpressionValueIsNotNull(hVar, "this@apply");
                a.mo200820a(hVar);
            }

            C53767a(DocSharerFilterData hVar, C53766h hVar2) {
                this.f132768a = hVar;
                this.f132769b = hVar2;
            }
        }

        /* renamed from: a */
        public final void onChanged(DocSharerFilterData hVar) {
            if (hVar.mo183360a().size() > 0) {
                Collection<String> values = hVar.mo183360a().values();
                Intrinsics.checkExpressionValueIsNotNull(values, "sharerId2AvatarMap.values");
                List<String> mutableList = CollectionsKt.toMutableList((Collection) values);
                if (hVar.mo183360a().size() > 3) {
                    mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 3));
                }
                ISearchModuleDependency.AbstractC53327m S = this.f132767a.mo183133S();
                Set<String> keySet = hVar.mo183360a().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "sharerId2AvatarMap.keys");
                S.mo181807a(mutableList, new ArrayList(CollectionsKt.toMutableList((Collection) keySet)), UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new C53767a(hVar, this));
            } else {
                hVar.mo200848g().clear();
                hVar.mo200844b(false);
                FilterView a = DocFragment.m208181a(this.f132767a);
                Intrinsics.checkExpressionValueIsNotNull(hVar, "this");
                a.mo200820a(hVar);
            }
            DocFragment gVar = this.f132767a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocInChatFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$i */
    public static final class C53768i<T> implements AbstractC1178x<DocInChatFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132770a;

        C53768i(DocFragment gVar) {
            this.f132770a = gVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$initFilter$15$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmaps", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.g$i$a */
        public static final class C53769a implements IGetDataCallback<List<? extends Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ DocInChatFilterData f132771a;

            /* renamed from: b */
            final /* synthetic */ C53768i f132772b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                Intrinsics.checkParameterIsNotNull(list, "bitmaps");
                this.f132771a.mo200848g().clear();
                this.f132771a.mo200848g().addAll(list);
                this.f132771a.mo200844b(true);
                FilterView a = DocFragment.m208181a(this.f132772b.f132770a);
                DocInChatFilterData dVar = this.f132771a;
                Intrinsics.checkExpressionValueIsNotNull(dVar, "this@apply");
                a.mo200820a(dVar);
            }

            C53769a(DocInChatFilterData dVar, C53768i iVar) {
                this.f132771a = dVar;
                this.f132772b = iVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(DocInChatFilterData dVar) {
            if (dVar.mo183348a().size() > 0) {
                Collection<String> values = dVar.mo183348a().values();
                Intrinsics.checkExpressionValueIsNotNull(values, "id2AvatarMap.values");
                List<String> mutableList = CollectionsKt.toMutableList((Collection) values);
                Set<String> keySet = dVar.mo183348a().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "id2AvatarMap.keys");
                List<String> mutableList2 = CollectionsKt.toMutableList((Collection) keySet);
                if (dVar.mo183348a().size() > 3) {
                    mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 3));
                    mutableList2 = CollectionsKt.toMutableList((Collection) mutableList2.subList(0, 3));
                }
                this.f132770a.mo183133S().mo181807a(mutableList, mutableList2, UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new C53769a(dVar, this));
            } else {
                dVar.mo200848g().clear();
                dVar.mo200844b(false);
                FilterView a = DocFragment.m208181a(this.f132770a);
                Intrinsics.checkExpressionValueIsNotNull(dVar, "this");
                a.mo200820a(dVar);
            }
            DocFragment gVar = this.f132770a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/search/redesign/DocFragment$showCategoryFilterDialog$1$1$1", "com/ss/android/lark/search/redesign/DocFragment$$special$$inlined$run$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$ab */
    public static final class View$OnClickListenerC53757ab implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterDialog f132750a;

        /* renamed from: b */
        final /* synthetic */ DocFragment f132751b;

        /* renamed from: c */
        final /* synthetic */ View f132752c;

        View$OnClickListenerC53757ab(SearchFilterDialog searchFilterDialog, DocFragment gVar, View view) {
            this.f132750a = searchFilterDialog;
            this.f132751b = gVar;
            this.f132752c = view;
        }

        public final void onClick(View view) {
            C1177w<DocCategoryFilterData> docCategoryFilterData = this.f132751b.mo183156n().getDocCategoryFilterData();
            DocCategoryFilterData b = this.f132751b.mo183156n().getDocCategoryFilterData().mo5927b();
            if (b != null) {
                b.mo183344a(SearchContext.DocCategory.ALL);
            } else {
                b = null;
            }
            docCategoryFilterData.mo5929b(b);
            this.f132750a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/search/redesign/DocFragment$showSearchContentTypeFilterDialog$1$1$1", "com/ss/android/lark/search/redesign/DocFragment$$special$$inlined$run$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$ad */
    public static final class View$OnClickListenerC53759ad implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterDialog f132754a;

        /* renamed from: b */
        final /* synthetic */ DocFragment f132755b;

        /* renamed from: c */
        final /* synthetic */ View f132756c;

        View$OnClickListenerC53759ad(SearchFilterDialog searchFilterDialog, DocFragment gVar, View view) {
            this.f132754a = searchFilterDialog;
            this.f132755b = gVar;
            this.f132756c = view;
        }

        public final void onClick(View view) {
            C1177w<DocSearchContentTypeFilterData> docSearchContentTypeData = this.f132755b.mo183156n().getDocSearchContentTypeData();
            DocSearchContentTypeFilterData b = this.f132755b.mo183156n().getDocSearchContentTypeData().mo5927b();
            if (b != null) {
                b.mo183358a(SearchContext.DocSearchContentType.ALL);
            } else {
                b = null;
            }
            docSearchContentTypeData.mo5929b(b);
            this.f132754a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/redesign/DocFragment$Response2ListCallback;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "callback", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isLoadMore", "", "(Lcom/ss/android/lark/search/redesign/DocFragment;Lcom/larksuite/framework/callback/IGetDataCallback;Z)V", "getCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "()Z", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$b */
    public final class Response2ListCallback implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132757a;

        /* renamed from: b */
        private final IGetDataCallback<List<SearchBaseInfo>> f132758b;

        /* renamed from: c */
        private final boolean f132759c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String str = this.f132757a.TAG;
            Log.m165379d(str, "onError, msg: " + errorResult.getDisplayMsg());
            this.f132758b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            SearchCommonResponseHeader.InvokeAbnormalNotice invokeAbnormalNotice;
            List<SearchBaseInfo> infoList;
            if (searchResponse != null) {
                invokeAbnormalNotice = searchResponse.getAbnormalNotice();
            } else {
                invokeAbnormalNotice = null;
            }
            boolean z = false;
            if (invokeAbnormalNotice != SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                DocFragment gVar = this.f132757a;
                if (searchResponse != null) {
                    z = searchResponse.isHasMore();
                }
                gVar.mo183406c(z);
                ArrayList arrayList = new ArrayList();
                if (!(searchResponse == null || (infoList = searchResponse.getInfoList()) == null)) {
                    for (T t : infoList) {
                        if ((t instanceof SearchSpaceInfo) || (t instanceof SearchWikiInfo)) {
                            arrayList.add(t);
                        }
                    }
                }
                this.f132758b.onSuccess(arrayList);
            } else if (!this.f132759c) {
                this.f132757a.mo183145b(false);
            }
        }

        public Response2ListCallback(DocFragment gVar, IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback, boolean z) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f132757a = gVar;
            this.f132758b = iGetDataCallback;
            this.f132759c = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocMyOwnFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$d */
    public static final class C53761d<T> implements AbstractC1178x<DocMyOwnFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132761a;

        C53761d(DocFragment gVar) {
            this.f132761a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(DocMyOwnFilterData eVar) {
            FilterView a = DocFragment.m208181a(this.f132761a);
            eVar.mo200844b(eVar.mo183353a());
            Intrinsics.checkExpressionValueIsNotNull(eVar, "it.apply {\n             …yOwnDoc\n                }");
            a.mo200820a(eVar);
            DocFragment gVar = this.f132761a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    /* renamed from: b */
    private final void m208184b(View view) {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        SearchFilterDialog searchFilterDialog = new SearchFilterDialog(context);
        C53258a.m205939a().mo181735a(searchFilterDialog);
        String str = this.f132740q;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("formatWording");
        }
        searchFilterDialog.mo183337a(str);
        searchFilterDialog.mo183336a(view);
        searchFilterDialog.mo183338b().setOnClickListener(new View$OnClickListenerC53758ac(searchFilterDialog));
        KeyboardUtils.hideKeyboard(this.mContext);
        searchFilterDialog.show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocCategoryFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$e */
    public static final class C53762e<T> implements AbstractC1178x<DocCategoryFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132762a;

        C53762e(DocFragment gVar) {
            this.f132762a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(DocCategoryFilterData bVar) {
            String str;
            FilterView a = DocFragment.m208181a(this.f132762a);
            int i = C53787h.f132794a[bVar.mo183343a().ordinal()];
            boolean z = true;
            if (i == 1) {
                str = this.f132762a.getString(R.string.Lark_Search_SearchDoc);
                Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Search_SearchDoc)");
            } else if (i == 2) {
                str = this.f132762a.getString(R.string.Lark_Search_SearchWiki);
                Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Search_SearchWiki)");
            } else if (i == 3) {
                str = DocFragment.m208183b(this.f132762a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            bVar.mo200843a(str);
            if (bVar.mo183343a() == SearchContext.DocCategory.ALL) {
                z = false;
            }
            bVar.mo200844b(z);
            Intrinsics.checkExpressionValueIsNotNull(bVar, "it.apply {\n             … != ALL\n                }");
            a.mo200820a(bVar);
            DocFragment gVar = this.f132762a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocTimeFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$j */
    public static final class C53770j<T> implements AbstractC1178x<DocTimeFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132773a;

        C53770j(DocFragment gVar) {
            this.f132773a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(DocTimeFilterData iVar) {
            FilterView a = DocFragment.m208181a(this.f132773a);
            if (iVar.mo183362a() != null) {
                Pair<Date, Date> a2 = iVar.mo183362a();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                Date date = (Date) a2.first;
                Pair<Date, Date> a3 = iVar.mo183362a();
                if (a3 == null) {
                    Intrinsics.throwNpe();
                }
                String a4 = C53345b.m206461a(date, (Date) a3.second);
                Intrinsics.checkExpressionValueIsNotNull(a4, "SearchUtils.getFilterTim…st, it.timePair!!.second)");
                iVar.mo200843a(a4);
                iVar.mo200844b(true);
            } else {
                iVar.mo200843a(DocFragment.m208187d(this.f132773a));
                iVar.mo200844b(false);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "it.apply {\n             …      }\n                }");
            a.mo200820a(iVar);
            DocFragment gVar = this.f132773a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocSearchContentTypeFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$k */
    public static final class C53771k<T> implements AbstractC1178x<DocSearchContentTypeFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132774a;

        C53771k(DocFragment gVar) {
            this.f132774a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(DocSearchContentTypeFilterData gVar) {
            String str;
            FilterView a = DocFragment.m208181a(this.f132774a);
            int i = C53787h.f132795b[gVar.mo183357a().ordinal()];
            boolean z = true;
            if (i == 1) {
                str = DocFragment.m208188e(this.f132774a);
            } else if (i == 2) {
                str = this.f132774a.getString(R.string.Search_Filter_Doc_OnlyTitle);
                Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Search_Filter_Doc_OnlyTitle)");
            } else if (i == 3) {
                str = this.f132774a.getString(R.string.Lark_Search_FilterMatchComment);
                Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Search_FilterMatchComment)");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            gVar.mo200843a(str);
            if (gVar.mo183357a() == SearchContext.DocSearchContentType.ALL) {
                z = false;
            }
            gVar.mo200844b(z);
            Intrinsics.checkExpressionValueIsNotNull(gVar, "it.apply {\n             …ype.ALL\n                }");
            a.mo200820a(gVar);
            DocFragment gVar2 = this.f132774a;
            gVar2.mo183139a(gVar2.mo183165w());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$onFilterCategory$1$1", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$n */
    public static final class C53774n implements TypeSelectAdapter.IOnTypeFilterClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectView f132777a;

        /* renamed from: b */
        final /* synthetic */ DocFragment f132778b;

        @Override // com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter.IOnTypeFilterClickListener
        /* renamed from: a */
        public void mo183328a(int i) {
            TypeSelectData bVar = this.f132777a.getItems().get(i);
            C1177w<DocCategoryFilterData> docCategoryFilterData = this.f132778b.mo183156n().getDocCategoryFilterData();
            DocCategoryFilterData b = this.f132778b.mo183156n().getDocCategoryFilterData().mo5927b();
            if (b != null) {
                b.mo183344a(SearchContext.DocCategory.Companion.mo184451a(bVar.mo183397c()));
            } else {
                b = null;
            }
            docCategoryFilterData.mo5929b(b);
            SearchFilterDialog searchFilterDialog = this.f132778b.f132743t;
            if (searchFilterDialog != null) {
                searchFilterDialog.dismiss();
            }
        }

        C53774n(TypeSelectView typeSelectView, DocFragment gVar) {
            this.f132777a = typeSelectView;
            this.f132778b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$onFilterSearchContentType$1$1", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$t */
    public static final class C53780t implements TypeSelectAdapter.IOnTypeFilterClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectView f132785a;

        /* renamed from: b */
        final /* synthetic */ DocFragment f132786b;

        @Override // com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter.IOnTypeFilterClickListener
        /* renamed from: a */
        public void mo183328a(int i) {
            TypeSelectData bVar = this.f132785a.getItems().get(i);
            C1177w<DocSearchContentTypeFilterData> docSearchContentTypeData = this.f132786b.mo183156n().getDocSearchContentTypeData();
            DocSearchContentTypeFilterData b = this.f132786b.mo183156n().getDocSearchContentTypeData().mo5927b();
            if (b != null) {
                b.mo183358a(SearchContext.DocSearchContentType.Companion.mo184452a(bVar.mo183397c()));
            } else {
                b = null;
            }
            docSearchContentTypeData.mo5929b(b);
            SearchFilterDialog searchFilterDialog = this.f132786b.f132745v;
            if (searchFilterDialog != null) {
                searchFilterDialog.dismiss();
            }
        }

        C53780t(TypeSelectView typeSelectView, DocFragment gVar) {
            this.f132785a = typeSelectView;
            this.f132786b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$z */
    static final class C53786z<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132793a;

        C53786z(DocFragment gVar) {
            this.f132793a = gVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            C1177w<DocOwnerFilterData> docOwnerFilterData = this.f132793a.mo183156n().getDocOwnerFilterData();
            DocOwnerFilterData b = this.f132793a.mo183156n().getDocOwnerFilterData().mo5927b();
            if (b != null) {
                b.mo183355a().clear();
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "pickViewData");
                    String id = t.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "pickViewData.id");
                    String imageKey = t.getImageKey();
                    Intrinsics.checkExpressionValueIsNotNull(imageKey, "pickViewData.imageKey");
                    b.mo183355a().put(id, imageKey);
                }
            } else {
                b = null;
            }
            docOwnerFilterData.mo5929b(b);
        }
    }

    /* renamed from: a */
    private final void m208182a(View view) {
        SearchContext.DocCategory docCategory;
        boolean z;
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        SearchFilterDialog searchFilterDialog = new SearchFilterDialog(context);
        C53258a.m205939a().mo181735a(searchFilterDialog);
        String str = this.f132739p;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryWording");
        }
        searchFilterDialog.mo183337a(str);
        searchFilterDialog.mo183336a(view);
        TextView b = searchFilterDialog.mo183338b();
        DocCategoryFilterData b2 = mo183156n().getDocCategoryFilterData().mo5927b();
        if (b2 != null) {
            docCategory = b2.mo183343a();
        } else {
            docCategory = null;
        }
        if (docCategory != SearchContext.DocCategory.ALL) {
            z = true;
        } else {
            z = false;
        }
        b.setEnabled(z);
        b.setText(R.string.Lark_Chat_ClearText);
        b.setOnClickListener(new View$OnClickListenerC53757ab(searchFilterDialog, this, view));
        KeyboardUtils.hideKeyboard(this.mContext);
        searchFilterDialog.show();
        this.f132743t = searchFilterDialog;
    }

    /* renamed from: c */
    private final void m208186c(View view) {
        SearchContext.DocSearchContentType docSearchContentType;
        boolean z;
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        SearchFilterDialog searchFilterDialog = new SearchFilterDialog(context);
        C53258a.m205939a().mo181735a(searchFilterDialog);
        String str = this.f132742s;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchContentTypeWording");
        }
        searchFilterDialog.mo183337a(str);
        searchFilterDialog.mo183336a(view);
        TextView b = searchFilterDialog.mo183338b();
        DocSearchContentTypeFilterData b2 = mo183156n().getDocSearchContentTypeData().mo5927b();
        if (b2 != null) {
            docSearchContentType = b2.mo183357a();
        } else {
            docSearchContentType = null;
        }
        if (docSearchContentType != SearchContext.DocSearchContentType.ALL) {
            z = true;
        } else {
            z = false;
        }
        b.setEnabled(z);
        b.setText(R.string.Lark_Chat_ClearText);
        b.setOnClickListener(new View$OnClickListenerC53759ad(searchFilterDialog, this, view));
        KeyboardUtils.hideKeyboard(this.mContext);
        searchFilterDialog.show();
        this.f132745v = searchFilterDialog;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public void mo183142b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo183159q().mo181873a("", mo183077a(""), new Response2ListCallback(this, iGetDataCallback, false));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/DocFormatFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$f */
    public static final class C53763f<T> implements AbstractC1178x<DocFormatFilterData> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132763a;

        C53763f(DocFragment gVar) {
            this.f132763a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(DocFormatFilterData cVar) {
            FilterView a = DocFragment.m208181a(this.f132763a);
            DocFormatFilterData b = this.f132763a.mo183156n().getDocFormatFilterData().mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            DocFormatFilterData cVar2 = b;
            cVar2.mo200843a(DocFragment.m208185c(this.f132763a));
            if (cVar2.mo183346a().size() > 0) {
                String f = cVar2.mo200847f();
                cVar2.mo200843a(f + '(' + cVar2.mo183346a().size() + ')');
                cVar2.mo200844b(true);
            } else {
                cVar2.mo200844b(false);
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…      }\n                }");
            a.mo200820a(b);
            this.f132763a.f132744u.clear();
            this.f132763a.f132744u.addAll(cVar.mo183346a());
            DocFragment gVar = this.f132763a;
            gVar.mo183139a(gVar.mo183165w());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/DocFragment$onFilterFormat$1$1", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$o */
    public static final class C53775o implements TypeSelectAdapter.IOnTypeFilterClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectView f132779a;

        /* renamed from: b */
        final /* synthetic */ DocFragment f132780b;

        @Override // com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter.IOnTypeFilterClickListener
        /* renamed from: a */
        public void mo183328a(int i) {
            TypeSelectData bVar = this.f132779a.getItems().get(i);
            DocFormatFilterData cVar = null;
            if (bVar.mo183396b()) {
                C1177w<DocFormatFilterData> docFormatFilterData = this.f132780b.mo183156n().getDocFormatFilterData();
                DocFormatFilterData b = this.f132780b.mo183156n().getDocFormatFilterData().mo5927b();
                if (b != null) {
                    b.mo183346a().remove(Doc.Type.fromValue(bVar.mo183397c()));
                    cVar = b;
                }
                docFormatFilterData.mo5929b(cVar);
            } else {
                C1177w<DocFormatFilterData> docFormatFilterData2 = this.f132780b.mo183156n().getDocFormatFilterData();
                DocFormatFilterData b2 = this.f132780b.mo183156n().getDocFormatFilterData().mo5927b();
                if (b2 != null) {
                    List<Doc.Type> a = b2.mo183346a();
                    Doc.Type fromValue = Doc.Type.fromValue(bVar.mo183397c());
                    Intrinsics.checkExpressionValueIsNotNull(fromValue, "Doc.Type.fromValue(data.id)");
                    a.add(fromValue);
                    cVar = b2;
                }
                docFormatFilterData2.mo5929b(cVar);
            }
            bVar.mo183395a(!bVar.mo183396b());
        }

        C53775o(TypeSelectView typeSelectView, DocFragment gVar) {
            this.f132779a = typeSelectView;
            this.f132780b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$x */
    static final class C53784x<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132790a;

        C53784x(DocFragment gVar) {
            this.f132790a = gVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            C1177w<DocInChatFilterData> docInChatFilterDate = this.f132790a.mo183156n().getDocInChatFilterDate();
            DocInChatFilterData b = this.f132790a.mo183156n().getDocInChatFilterDate().mo5927b();
            if (b != null) {
                b.mo183351d();
                for (T t : list) {
                    if (t instanceof PickChatViewData) {
                        T t2 = t;
                        if (t2.getChatType() == Chat.Type.P2P) {
                            String p2pChatterId = t2.getP2pChatterId();
                            Intrinsics.checkExpressionValueIsNotNull(p2pChatterId, "pickViewData.p2pChatterId");
                            String imageKey = t2.getImageKey();
                            Intrinsics.checkExpressionValueIsNotNull(imageKey, "pickViewData.imageKey");
                            b.mo183348a().put(p2pChatterId, imageKey);
                        } else {
                            String id = t2.getId();
                            Intrinsics.checkExpressionValueIsNotNull(id, "pickViewData.id");
                            String imageKey2 = t2.getImageKey();
                            Intrinsics.checkExpressionValueIsNotNull(imageKey2, "pickViewData.imageKey");
                            b.mo183348a().put(id, imageKey2);
                        }
                        List<String> b2 = b.mo183349b();
                        String id2 = t2.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id2, "pickViewData.id");
                        b2.add(id2);
                    }
                }
            } else {
                b = null;
            }
            docInChatFilterDate.mo5929b(b);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        boolean z;
        SearchContext.DocCategory docCategory;
        Pair<Date, Date> pair;
        SearchContext.DocSearchContentType docSearchContentType;
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        SearchContext a = super.mo183077a(str);
        DocMyOwnFilterData b = mo183156n().getDocMyOwnFilterData().mo5927b();
        if (b != null) {
            z = b.mo183353a();
        } else {
            z = false;
        }
        a.mo184436p(z);
        DocCategoryFilterData b2 = mo183156n().getDocCategoryFilterData().mo5927b();
        if (b2 == null || (docCategory = b2.mo183343a()) == null) {
            docCategory = SearchContext.DocCategory.ALL;
        }
        a.mo184392a(docCategory);
        List<Doc.Type> I = a.mo184376I();
        if (I != null) {
            I.clear();
        }
        List<Doc.Type> I2 = a.mo184376I();
        if (I2 != null) {
            I2.addAll(this.f132744u);
        }
        List<String> H = a.mo184375H();
        if (H != null) {
            H.clear();
        }
        List<String> H2 = a.mo184375H();
        if (H2 != null) {
            H2.addAll(af());
        }
        List<String> L = a.mo184379L();
        if (L != null) {
            L.clear();
        }
        List<String> L2 = a.mo184379L();
        if (L2 != null) {
            L2.addAll(ag());
        }
        List<String> M = a.mo184380M();
        if (M != null) {
            M.clear();
        }
        List<String> M2 = a.mo184380M();
        if (M2 != null) {
            M2.addAll(ah());
        }
        DocTimeFilterData b3 = mo183156n().getDocTimeFilterData().mo5927b();
        if (b3 != null) {
            pair = b3.mo183362a();
        } else {
            pair = null;
        }
        a.mo184399b(pair);
        DocSearchContentTypeFilterData b4 = mo183156n().getDocSearchContentTypeData().mo5927b();
        if (b4 == null || (docSearchContentType = b4.mo183357a()) == null) {
            docSearchContentType = SearchContext.DocSearchContentType.ALL;
        }
        a.mo184393a(docSearchContentType);
        return a;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public SearchInfoHistory mo183141b(SearchInfoHistory searchInfoHistory) {
        Pair<Date, Date> pair;
        String str;
        long j;
        Date date;
        Date date2;
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        DocTimeFilterData b = mo183156n().getDocTimeFilterData().mo5927b();
        SearchContext.DocCategory docCategory = null;
        if (b != null) {
            pair = b.mo183362a();
        } else {
            pair = null;
        }
        NetSearchRequest.Filter.C53951a e = NetSearchRequest.Filter.newBuilder().mo184520a(ah()).mo184530e(af());
        ArrayList arrayList = new ArrayList();
        DocCategoryFilterData b2 = mo183156n().getDocCategoryFilterData().mo5927b();
        if (b2 != null) {
            docCategory = b2.mo183343a();
        }
        if (docCategory != null) {
            int i = C53787h.f132796c[docCategory.ordinal()];
            if (i == 1) {
                str = SearchContext.DocCategory.DOC.toString();
            } else if (i == 2) {
                str = SearchContext.DocCategory.WIKI.toString();
            }
            arrayList.add(str);
            NetSearchRequest.Filter.C53951a c = e.mo184527c(arrayList);
            long j2 = 0;
            if (pair != null || (date2 = (Date) pair.first) == null) {
                j = 0;
            } else {
                j = date2.getTime();
            }
            NetSearchRequest.Filter.C53951a a = c.mo184516a(j / 1000);
            if (!(pair == null || (date = (Date) pair.second) == null)) {
                j2 = date.getTime();
            }
            searchInfoHistory.setFilter(a.mo184523b(j2 / 1000).mo184522a());
            return searchInfoHistory;
        }
        str = SearchContext.DocCategory.ALL.toString();
        arrayList.add(str);
        NetSearchRequest.Filter.C53951a c2 = e.mo184527c(arrayList);
        long j22 = 0;
        if (pair != null) {
        }
        j = 0;
        NetSearchRequest.Filter.C53951a a2 = c2.mo184516a(j / 1000);
        j22 = date.getTime();
        searchInfoHistory.setFilter(a2.mo184523b(j22 / 1000).mo184522a());
        return searchInfoHistory;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public void mo183136a(SearchInfoHistory searchInfoHistory) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Date date;
        SearchContext.DocCategory docCategory;
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        this.f132746x.mo41008a();
        List<String> list = searchInfoHistory.getFilter().chatIds;
        DocTimeFilterData iVar = null;
        if (list != null) {
            bool = Boolean.valueOf(!list.isEmpty());
        } else {
            bool = null;
        }
        if (bool.booleanValue()) {
            C57865c.m224574a(new C53783w(searchInfoHistory), new C53784x(this));
        }
        List<String> list2 = searchInfoHistory.getFilter().docCreatorIds;
        if (list2 != null) {
            bool2 = Boolean.valueOf(!list2.isEmpty());
        } else {
            bool2 = null;
        }
        if (bool2.booleanValue()) {
            C57865c.m224574a(new C53785y(this, searchInfoHistory), new C53786z(this));
        }
        List<String> list3 = searchInfoHistory.getFilter().docTypes;
        if (list3 != null) {
            bool3 = Boolean.valueOf(!list3.isEmpty());
        } else {
            bool3 = null;
        }
        if (bool3.booleanValue()) {
            C1177w<DocCategoryFilterData> docCategoryFilterData = mo183156n().getDocCategoryFilterData();
            DocCategoryFilterData b = mo183156n().getDocCategoryFilterData().mo5927b();
            if (b != null) {
                String str = searchInfoHistory.getFilter().docTypes.get(0);
                if (Intrinsics.areEqual(str, SearchContext.DocCategory.DOC.toString())) {
                    docCategory = SearchContext.DocCategory.DOC;
                } else if (Intrinsics.areEqual(str, SearchContext.DocCategory.WIKI.toString())) {
                    docCategory = SearchContext.DocCategory.WIKI;
                } else {
                    docCategory = SearchContext.DocCategory.ALL;
                }
                b.mo183344a(docCategory);
            } else {
                b = null;
            }
            docCategoryFilterData.mo5929b(b);
        }
        if (searchInfoHistory.getFilter().messageEndTime != 0) {
            long j = (long) 1000;
            Date date2 = new Date(searchInfoHistory.getFilter().messageEndTime * j);
            if (searchInfoHistory.getFilter().messageStartTime != 0) {
                date = new Date(searchInfoHistory.getFilter().messageStartTime * j);
            } else {
                date = null;
            }
            C1177w<DocTimeFilterData> docTimeFilterData = mo183156n().getDocTimeFilterData();
            DocTimeFilterData b2 = mo183156n().getDocTimeFilterData().mo5927b();
            if (b2 != null) {
                b2.mo183363a(Pair.create(date, date2));
                iVar = b2;
            }
            docTimeFilterData.mo5929b(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "startTime", "Ljava/util/Date;", "endTime", "onTimeSelect"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.g$m */
    public static final class C53773m implements TimeSelectDialog.AbstractC59218a {

        /* renamed from: a */
        final /* synthetic */ DocFragment f132776a;

        C53773m(DocFragment gVar) {
            this.f132776a = gVar;
        }

        @Override // com.ss.android.lark.widget.timepicker.TimeSelectDialog.AbstractC59218a
        /* renamed from: a */
        public final void mo182573a(Date date, Date date2) {
            Intrinsics.checkParameterIsNotNull(date2, "endTime");
            C1177w<DocTimeFilterData> docTimeFilterData = this.f132776a.mo183156n().getDocTimeFilterData();
            DocTimeFilterData b = this.f132776a.mo183156n().getDocTimeFilterData().mo5927b();
            if (b != null) {
                b.mo183363a(Pair.create(date, date2));
            } else {
                b = null;
            }
            docTimeFilterData.mo5929b(b);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo183157o().setVisibility(0);
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        this.f132738o = new FilterView(context);
        FrameLayout o = mo183157o();
        FilterView filterView = this.f132738o;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        o.addView(filterView);
        String string = getString(R.string.Lark_Search_DocsOwnedByMeFilter_Option);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_…csOwnedByMeFilter_Option)");
        this.f132747y = string;
        String string2 = getString(R.string.Lark_Search_DocTypeFilter);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_Search_DocTypeFilter)");
        this.f132739p = string2;
        if (C53339b.m206454n()) {
            str = getString(R.string.Lark_Search_DocFormat);
            Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Search_DocFormat)");
        } else {
            str = getString(R.string.Lark_Search_DocTypeFilter);
            Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Search_DocTypeFilter)");
        }
        this.f132740q = str;
        String string3 = getString(R.string.Lark_Search_DocOwnerFilter);
        Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.Lark_Search_DocOwnerFilter)");
        this.f132748z = string3;
        String string4 = getString(R.string.Lark_Search_ResultTagShared);
        Intrinsics.checkExpressionValueIsNotNull(string4, "getString(R.string.Lark_Search_ResultTagShared)");
        this.f132734A = string4;
        String string5 = getString(R.string.Lark_Search_SearchSpaceSharedIn);
        Intrinsics.checkExpressionValueIsNotNull(string5, "getString(R.string.Lark_…arch_SearchSpaceSharedIn)");
        this.f132735B = string5;
        String string6 = getString(R.string.Lark_Search_ViewedTimeFilter);
        Intrinsics.checkExpressionValueIsNotNull(string6, "getString(R.string.Lark_Search_ViewedTimeFilter)");
        this.f132741r = string6;
        String string7 = getString(R.string.Search_Filter_Doc_Moreoptions);
        Intrinsics.checkExpressionValueIsNotNull(string7, "getString(R.string.Search_Filter_Doc_Moreoptions)");
        this.f132742s = string7;
        ab();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: com.ss.android.lark.search.redesign.filter.h */
    /* JADX DEBUG: Multi-variable search result rejected for r9v19, resolved type: com.ss.android.lark.search.redesign.filter.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.redesign.DocFragment.onActivityResult(int, int, android.content.Intent):void");
    }
}
