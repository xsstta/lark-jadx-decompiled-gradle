package com.ss.android.lark.search.redesign;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.search.v1.Scene;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53329a;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53636d;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.redesign.filter.ChatFilterData;
import com.ss.android.lark.search.redesign.filter.SearchFilterDialog;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectData;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectView;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.searchfilter.FilterData;
import com.ss.android.lark.widget.searchfilter.FilterView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\r\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015H\u0002J\"\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020\u0013J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0006H\u0016J\b\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020*H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u00068"}, d2 = {"Lcom/ss/android/lark/search/redesign/ChatFragment;", "Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "()V", "mChatIncludeMemberWording", "", "mChatMemberList", "", "mChatTypeList", "Lcom/ss/android/lark/searchcommon/service/entity/ChatType;", "mChatTypeWording", "mFilterView", "Lcom/ss/android/lark/widget/searchfilter/FilterView;", "onResetClick", "com/ss/android/lark/search/redesign/ChatFragment$onResetClick$1", "Lcom/ss/android/lark/search/redesign/ChatFragment$onResetClick$1;", "appendHistoryFilter", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "history", "attachInfoForReport", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "checkFilterUsable", "", "emptyHintIv", "", "emptyHintTv", "enablePullCommonRecommend", "filterStatusRpt", "getChatTypeSelectDataList", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectData;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onFilterByChatMember", "onFilterByChatType", "onHistoryUpdate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "recommendCacheKey", "recommendSectionList", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "sceneType", "Lcom/bytedance/lark/pb/search/v1/Scene$Type;", "showDialog", "typeSelectView", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.e */
public final class ChatFragment extends BaseSearchTabFragment {

    /* renamed from: s */
    public static final Companion f132673s = new Companion(null);

    /* renamed from: o */
    public FilterView f132674o;

    /* renamed from: p */
    public final List<ChatType> f132675p = new ArrayList();

    /* renamed from: q */
    public final List<String> f132676q = new ArrayList();

    /* renamed from: r */
    public String f132677r;

    /* renamed from: t */
    private final C53747g f132678t = new C53747g(this);

    /* renamed from: u */
    private String f132679u;

    /* renamed from: v */
    private HashMap f132680v;

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public String mo183078a() {
        return "recommend.group.cache.key";
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: e */
    public int mo183082e() {
        return R.drawable.illustration_empty_neutral_no_content;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: f */
    public int mo183083f() {
        return R.string.Lark_Search_SearchGroupPlaceholder;
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132680v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/redesign/ChatFragment$Companion;", "", "()V", "REQUEST_ID_SEARCH_CHAT_FILTER_PICK_CHATTER", "", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$a */
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
        return Scene.Type.SEARCH_CHATS;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$e */
    static final class C53745e<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132685a;

        /* renamed from: b */
        final /* synthetic */ List f132686b;

        C53745e(ChatFragment eVar, List list) {
            this.f132685a = eVar;
            this.f132686b = list;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            return this.f132685a.mo183132R().mo182951a(this.f132686b);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public List<SectionEntityType> mo183079b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.GROUP_CHAT)));
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: d */
    public boolean mo183081d() {
        if (!super.mo183081d() || !C53258a.m205939a().mo181745a("lark.search.common.recommend.group")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$b */
    public static final class C53742b<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132681a;

        C53742b(ChatFragment eVar) {
            this.f132681a = eVar;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            List<String> list;
            LinkedHashMap<String, String> b;
            Set<String> keySet;
            C53636d R = this.f132681a.mo183132R();
            ChatFilterData b2 = this.f132681a.mo183156n().getChatMemberFilterData().mo5927b();
            if (b2 == null || (b = b2.mo183341b()) == null || (keySet = b.keySet()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) keySet);
            }
            return R.mo182951a(list);
        }
    }

    /* renamed from: T */
    public final void mo183324T() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        TypeSelectView typeSelectView = new TypeSelectView(context);
        typeSelectView.mo183380a(m208079V());
        typeSelectView.setMOnTypeFilterClick(new C53744d(typeSelectView, this));
        m208081a(typeSelectView);
    }

    /* renamed from: U */
    public final void mo183325U() {
        LinkedHashMap<String, String> b;
        ChatFilterData b2 = mo183156n().getChatMemberFilterData().mo5927b();
        if (b2 == null || (b = b2.mo183341b()) == null || !b.isEmpty()) {
            C57865c.m224574a(new C53742b(this), new C53743c(this));
        } else {
            mo183138a(new ArrayList(), 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/search/redesign/ChatFragment$onResetClick$1", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnResetClick;", "onResetClick", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$g */
    public static final class C53747g implements FilterView.IOnResetClick {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132688a;

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnResetClick
        /* renamed from: a */
        public void mo41008a() {
            C1177w<ChatFilterData> chatTypeFilterData = this.f132688a.mo183156n().getChatTypeFilterData();
            ChatFilterData b = this.f132688a.mo183156n().getChatTypeFilterData().mo5927b();
            ChatFilterData aVar = null;
            if (b != null) {
                b.mo183340a().clear();
            } else {
                b = null;
            }
            chatTypeFilterData.mo5929b(b);
            C1177w<ChatFilterData> chatMemberFilterData = this.f132688a.mo183156n().getChatMemberFilterData();
            ChatFilterData b2 = this.f132688a.mo183156n().getChatMemberFilterData().mo5927b();
            if (b2 != null) {
                b2.mo183341b().clear();
                aVar = b2;
            }
            chatMemberFilterData.mo5929b(aVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53747g(ChatFragment eVar) {
            this.f132688a = eVar;
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: D */
    public String mo183118D() {
        StringBuilder sb = new StringBuilder();
        ChatFilterData b = mo183156n().getChatTypeFilterData().mo5927b();
        if (!(b == null || !b.mo183342c() || mo183156n().getChatTypeFilterData().mo5927b() == null)) {
            sb.append("chatTypes,");
        }
        ChatFilterData b2 = mo183156n().getChatMemberFilterData().mo5927b();
        if (b2 != null && b2.mo183342c()) {
            sb.append("chatMemberIds,");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply {\n…   }\n        }.toString()");
        return sb2;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: w */
    public boolean mo183165w() {
        ChatFilterData b;
        ChatFilterData b2 = mo183156n().getChatTypeFilterData().mo5927b();
        boolean z = true;
        if ((b2 == null || !b2.mo183342c()) && ((b = mo183156n().getChatMemberFilterData().mo5927b()) == null || !b.mo183342c())) {
            z = false;
        }
        if (z) {
            FilterView filterView = this.f132674o;
            if (filterView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
            }
            filterView.mo200822b();
        } else {
            FilterView filterView2 = this.f132674o;
            if (filterView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
            }
            filterView2.mo200819a();
        }
        return z;
    }

    /* renamed from: V */
    private final List<TypeSelectData> m208079V() {
        List<ChatType> a;
        ArrayList<TypeSelectData> arrayList = new ArrayList();
        TypeSelectData bVar = new TypeSelectData(ChatType.PRIVATE.getNumber());
        String string = getString(R.string.Lark_Search_GroupTypePrivateGroup);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_…ch_GroupTypePrivateGroup)");
        bVar.mo183394a(string);
        bVar.mo183395a(false);
        arrayList.add(bVar);
        TypeSelectData bVar2 = new TypeSelectData(ChatType.OUTER.getNumber());
        String string2 = getString(R.string.Lark_Search_GroupTypeExternalGroup);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_…h_GroupTypeExternalGroup)");
        bVar2.mo183394a(string2);
        bVar2.mo183395a(false);
        arrayList.add(bVar2);
        TypeSelectData bVar3 = new TypeSelectData(ChatType.PUBLIC_JOIN.getNumber());
        String string3 = getString(R.string.Lark_Search_GroupTypeJoinedPublicGroup);
        Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.Lark_…oupTypeJoinedPublicGroup)");
        bVar3.mo183394a(string3);
        bVar3.mo183395a(false);
        arrayList.add(bVar3);
        TypeSelectData bVar4 = new TypeSelectData(ChatType.PUBLIC_ABSENT.getNumber());
        String string4 = getString(R.string.Lark_Search_GroupTypeUnjoinedPublicGroup);
        Intrinsics.checkExpressionValueIsNotNull(string4, "getString(R.string.Lark_…pTypeUnjoinedPublicGroup)");
        bVar4.mo183394a(string4);
        bVar4.mo183395a(false);
        arrayList.add(bVar4);
        for (TypeSelectData bVar5 : arrayList) {
            ChatFilterData b = mo183156n().getChatTypeFilterData().mo5927b();
            if (!(b == null || (a = b.mo183340a()) == null || !a.contains(ChatType.forNumber(bVar5.mo183397c())))) {
                bVar5.mo183395a(true);
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/ChatFragment$onViewCreated$3$1", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "onFilterItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$h */
    public static final class C53748h implements FilterView.IOnFilterItemClick {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132689a;

        C53748h(ChatFragment eVar) {
            this.f132689a = eVar;
        }

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnFilterItemClick
        /* renamed from: a */
        public void mo41007a(FilterData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!(bVar instanceof ChatFilterData)) {
                return;
            }
            if (Intrinsics.areEqual(bVar.mo200849h(), "chat/type")) {
                this.f132689a.mo183324T();
            } else if (Intrinsics.areEqual(bVar.mo200849h(), "chat/member")) {
                this.f132689a.mo183325U();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$k */
    public static final class View$OnClickListenerC53752k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterDialog f132694a;

        View$OnClickListenerC53752k(SearchFilterDialog searchFilterDialog) {
            this.f132694a = searchFilterDialog;
        }

        public final void onClick(View view) {
            this.f132694a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$c */
    public static final class C53743c<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132682a;

        C53743c(ChatFragment eVar) {
            this.f132682a = eVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.f132682a.mo183138a(list, 1);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FilterView m208080a(ChatFragment eVar) {
        FilterView filterView = eVar.f132674o;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
        }
        return filterView;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m208082b(ChatFragment eVar) {
        String str = eVar.f132677r;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatTypeWording");
        }
        return str;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public void mo183137a(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        super.mo183137a(list);
        for (SearchBaseInfo searchBaseInfo : list) {
            searchBaseInfo.setSearchLocation("groups");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/ChatFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$j */
    public static final class C53750j<T> implements AbstractC1178x<ChatFilterData> {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132691a;

        C53750j(ChatFragment eVar) {
            this.f132691a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/ChatFragment$onViewCreated$5$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmaps", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.e$j$a */
        public static final class C53751a implements IGetDataCallback<List<? extends Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ ChatFilterData f132692a;

            /* renamed from: b */
            final /* synthetic */ C53750j f132693b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                Intrinsics.checkParameterIsNotNull(list, "bitmaps");
                this.f132692a.mo200848g().clear();
                this.f132692a.mo200848g().addAll(list);
                this.f132692a.mo200844b(true);
                FilterView a = ChatFragment.m208080a(this.f132693b.f132691a);
                ChatFilterData aVar = this.f132692a;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "this@apply");
                a.mo200820a(aVar);
            }

            C53751a(ChatFilterData aVar, C53750j jVar) {
                this.f132692a = aVar;
                this.f132693b = jVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(ChatFilterData aVar) {
            ChatFilterData b = this.f132691a.mo183156n().getChatMemberFilterData().mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            ChatFilterData aVar2 = b;
            this.f132691a.f132676q.clear();
            if (aVar2.mo183341b().size() > 0) {
                List<String> list = this.f132691a.f132676q;
                Set<String> keySet = aVar2.mo183341b().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "memberId2AvatarMap.keys");
                list.addAll(CollectionsKt.toMutableList((Collection) keySet));
                Collection<String> values = aVar2.mo183341b().values();
                Intrinsics.checkExpressionValueIsNotNull(values, "memberId2AvatarMap.values");
                List<String> mutableList = CollectionsKt.toMutableList((Collection) values);
                if (aVar2.mo183341b().size() > 3) {
                    mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 3));
                }
                ISearchModuleDependency.AbstractC53327m S = this.f132691a.mo183133S();
                Set<String> keySet2 = aVar2.mo183341b().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet2, "memberId2AvatarMap.keys");
                S.mo181807a(mutableList, new ArrayList(CollectionsKt.toMutableList((Collection) keySet2)), UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new C53751a(aVar2, this));
            } else {
                aVar2.mo200848g().clear();
                aVar2.mo200844b(false);
                FilterView a = ChatFragment.m208080a(this.f132691a);
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "this");
                a.mo200820a(aVar2);
            }
            ChatFragment eVar = this.f132691a;
            eVar.mo183139a(eVar.mo183165w());
        }
    }

    /* renamed from: a */
    private final void m208081a(View view) {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        SearchFilterDialog searchFilterDialog = new SearchFilterDialog(context);
        C53258a.m205939a().mo181735a(searchFilterDialog);
        String string = UIHelper.getString(R.string.Lark_Search_SearchGroupByGroupType);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…h_SearchGroupByGroupType)");
        searchFilterDialog.mo183337a(string);
        searchFilterDialog.mo183336a(view);
        searchFilterDialog.mo183338b().setOnClickListener(new View$OnClickListenerC53752k(searchFilterDialog));
        KeyboardUtils.hideKeyboard(this.mContext);
        searchFilterDialog.show();
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public SearchInfoHistory mo183141b(SearchInfoHistory searchInfoHistory) {
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        searchInfoHistory.setFilter(NetSearchRequest.Filter.newBuilder().mo184518a(NetSearchRequest.ChatFilter.newBuilder().mo184513b(this.f132676q).mo184511a(this.f132675p).mo184512a()).mo184522a());
        return searchInfoHistory;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$f */
    static final class C53746f<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132687a;

        C53746f(ChatFragment eVar) {
            this.f132687a = eVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            C1177w<ChatFilterData> chatMemberFilterData = this.f132687a.mo183156n().getChatMemberFilterData();
            ChatFilterData b = this.f132687a.mo183156n().getChatMemberFilterData().mo5927b();
            if (b != null) {
                b.mo183341b().clear();
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "pickViewData");
                    String id = t.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "pickViewData.id");
                    String imageKey = t.getImageKey();
                    Intrinsics.checkExpressionValueIsNotNull(imageKey, "pickViewData.imageKey");
                    b.mo183341b().put(id, imageKey);
                }
            } else {
                b = null;
            }
            chatMemberFilterData.mo5929b(b);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        SearchContext a = super.mo183077a(str);
        a.mo184445u().clear();
        a.mo184445u().addAll(this.f132675p);
        a.mo184446v().clear();
        a.mo184446v().addAll(this.f132676q);
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/ChatFragment$onFilterByChatType$1$1", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$d */
    public static final class C53744d implements TypeSelectAdapter.IOnTypeFilterClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectView f132683a;

        /* renamed from: b */
        final /* synthetic */ ChatFragment f132684b;

        @Override // com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter.IOnTypeFilterClickListener
        /* renamed from: a */
        public void mo183328a(int i) {
            TypeSelectData bVar = this.f132683a.getItems().get(i);
            ChatFilterData aVar = null;
            if (bVar.mo183396b()) {
                C1177w<ChatFilterData> chatTypeFilterData = this.f132684b.mo183156n().getChatTypeFilterData();
                ChatFilterData b = this.f132684b.mo183156n().getChatTypeFilterData().mo5927b();
                if (b != null) {
                    b.mo183340a().remove(ChatType.forNumber(bVar.mo183397c()));
                    aVar = b;
                }
                chatTypeFilterData.mo5929b(aVar);
            } else {
                C1177w<ChatFilterData> chatTypeFilterData2 = this.f132684b.mo183156n().getChatTypeFilterData();
                ChatFilterData b2 = this.f132684b.mo183156n().getChatTypeFilterData().mo5927b();
                if (b2 != null) {
                    List<ChatType> a = b2.mo183340a();
                    ChatType forNumber = ChatType.forNumber(bVar.mo183397c());
                    Intrinsics.checkExpressionValueIsNotNull(forNumber, "ChatType.forNumber(data.id)");
                    a.add(forNumber);
                    aVar = b2;
                }
                chatTypeFilterData2.mo5929b(aVar);
            }
            bVar.mo183395a(!bVar.mo183396b());
        }

        C53744d(TypeSelectView typeSelectView, ChatFragment eVar) {
            this.f132683a = typeSelectView;
            this.f132684b = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/ChatFilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.e$i */
    static final class C53749i<T> implements AbstractC1178x<ChatFilterData> {

        /* renamed from: a */
        final /* synthetic */ ChatFragment f132690a;

        C53749i(ChatFragment eVar) {
            this.f132690a = eVar;
        }

        /* renamed from: a */
        public final void onChanged(ChatFilterData aVar) {
            FilterView a = ChatFragment.m208080a(this.f132690a);
            ChatFilterData b = this.f132690a.mo183156n().getChatTypeFilterData().mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            ChatFilterData aVar2 = b;
            aVar2.mo200843a(ChatFragment.m208082b(this.f132690a));
            if (aVar2.mo183340a().size() > 0) {
                String f = aVar2.mo200847f();
                aVar2.mo200843a(f + '(' + aVar2.mo183340a().size() + ')');
                aVar2.mo200844b(true);
            } else {
                aVar2.mo200844b(false);
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…          }\n            }");
            a.mo200820a(b);
            this.f132690a.f132675p.clear();
            this.f132690a.f132675p.addAll(aVar.mo183340a());
            ChatFragment eVar = this.f132690a;
            eVar.mo183139a(eVar.mo183165w());
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public void mo183136a(SearchInfoHistory searchInfoHistory) {
        List<String> list;
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        this.f132678t.mo41008a();
        C1177w<ChatFilterData> chatTypeFilterData = mo183156n().getChatTypeFilterData();
        ChatFilterData b = mo183156n().getChatTypeFilterData().mo5927b();
        if (b != null) {
            b.mo183340a().clear();
            List<ChatType> a = b.mo183340a();
            NetSearchRequest.ChatFilter chatFilter = searchInfoHistory.getFilter().chatFilter;
            if (chatFilter == null || (arrayList = chatFilter.chatTypes) == null) {
                arrayList = new ArrayList();
            }
            a.addAll(arrayList);
        } else {
            b = null;
        }
        chatTypeFilterData.mo5929b(b);
        NetSearchRequest.ChatFilter chatFilter2 = searchInfoHistory.getFilter().chatFilter;
        if (chatFilter2 != null && (list = chatFilter2.chatMemberIds) != null) {
            Intrinsics.checkExpressionValueIsNotNull(list, "history.filter.chatFilter?.chatMemberIds ?: return");
            if (!list.isEmpty()) {
                C57865c.m224574a(new C53745e(this, list), new C53746f(this));
            }
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo183157o().setVisibility(0);
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        this.f132674o = new FilterView(context);
        if (!C53329a.m206412b()) {
            FrameLayout o = mo183157o();
            FilterView filterView = this.f132674o;
            if (filterView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
            }
            o.addView(filterView);
        }
        String string = getString(R.string.Lark_Search_SearchGroupByGroupType);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_…h_SearchGroupByGroupType)");
        this.f132677r = string;
        String string2 = getString(R.string.Lark_Search_SearchGroupByIncludedMembers);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_…chGroupByIncludedMembers)");
        this.f132679u = string2;
        C1177w<ChatFilterData> chatTypeFilterData = mo183156n().getChatTypeFilterData();
        ChatFilterData aVar = new ChatFilterData("chat/type");
        String str = this.f132677r;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatTypeWording");
        }
        aVar.mo200843a(str);
        chatTypeFilterData.mo5929b(aVar);
        C1177w<ChatFilterData> chatMemberFilterData = mo183156n().getChatMemberFilterData();
        ChatFilterData aVar2 = new ChatFilterData("chat/member");
        String str2 = this.f132679u;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatIncludeMemberWording");
        }
        aVar2.mo200843a(str2);
        chatMemberFilterData.mo5929b(aVar2);
        FilterView filterView2 = this.f132674o;
        if (filterView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
        }
        ChatFilterData[] aVarArr = new ChatFilterData[2];
        ChatFilterData b = mo183156n().getChatTypeFilterData().mo5927b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        aVarArr[0] = b;
        ChatFilterData b2 = mo183156n().getChatMemberFilterData().mo5927b();
        if (b2 == null) {
            Intrinsics.throwNpe();
        }
        aVarArr[1] = b2;
        filterView2.mo200821a(CollectionsKt.listOf((Object[]) aVarArr));
        filterView2.setOnResetClick(this.f132678t);
        filterView2.setOnFilterItemClick(new C53748h(this));
        mo183156n().getChatTypeFilterData().mo5923a(getViewLifecycleOwner(), new C53749i(this));
        mo183156n().getChatMemberFilterData().mo5923a(getViewLifecycleOwner(), new C53750j(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m165379d("LarkSearch.Search.V2.ChatFragment", "onActivityResult(), requestCode = " + i);
        boolean z = true;
        if (i == 1 && intent != null) {
            Bundle extras = intent.getExtras();
            ChatFilterData aVar = null;
            Object obj = extras != null ? extras.get("message/filter/picked_chatter") : null;
            if (!(obj instanceof List)) {
                obj = null;
            }
            List<BasePickViewData> list = (List) obj;
            if (list != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(it.next() instanceof BasePickViewData)) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!z || !(list instanceof List)) {
                    list = null;
                }
                if (list != null) {
                    C1177w<ChatFilterData> chatMemberFilterData = mo183156n().getChatMemberFilterData();
                    ChatFilterData b = mo183156n().getChatMemberFilterData().mo5927b();
                    if (b != null) {
                        b.mo183341b().clear();
                        for (BasePickViewData basePickViewData : list) {
                            String id = basePickViewData.getId();
                            Intrinsics.checkExpressionValueIsNotNull(id, "chatter.id");
                            String imageKey = basePickViewData.getImageKey();
                            Intrinsics.checkExpressionValueIsNotNull(imageKey, "chatter.imageKey");
                            b.mo183341b().put(id, imageKey);
                        }
                        aVar = b;
                    }
                    chatMemberFilterData.mo5929b(aVar);
                }
            }
        }
    }
}
