package com.ss.android.lark.search.redesign;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.search.v1.Scene;
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
import com.ss.android.lark.search.impl.func.pick.p2623a.C53636d;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53637e;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.search.redesign.filter.MessageChatFilter;
import com.ss.android.lark.search.redesign.filter.MessageChatterFilter;
import com.ss.android.lark.search.redesign.filter.MessageHideBotFilter;
import com.ss.android.lark.search.redesign.filter.MessageSceneFilter;
import com.ss.android.lark.search.redesign.filter.MessageTimeFilter;
import com.ss.android.lark.search.redesign.filter.SearchFilterDialog;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectData;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectView;
import com.ss.android.lark.searchcommon.dto.Scene;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020 H\u0002J\u0006\u0010'\u001a\u00020 J\u0006\u0010(\u001a\u00020 J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\b\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020.H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006="}, d2 = {"Lcom/ss/android/lark/search/redesign/MessageFragment;", "Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "()V", "mChatWording", "", "mChatterSendWording", "mFilterDialog", "Lcom/ss/android/lark/search/redesign/filter/SearchFilterDialog;", "mFilterView", "Lcom/ss/android/lark/widget/searchfilter/FilterView;", "mMessageHideBotWording", "mMessageTypeWording", "mTimeWording", "onResetClick", "com/ss/android/lark/search/redesign/MessageFragment$onResetClick$1", "Lcom/ss/android/lark/search/redesign/MessageFragment$onResetClick$1;", "appendHistoryFilter", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "history", "checkFilterUsable", "", "emptyHintIv", "", "emptyHintTv", "enablePullCommonRecommend", "filterStatusRpt", "getChatListFromLiveData", "", "getChatTypeSelectDataList", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectData;", "getChatterListFromLiveData", "initFilter", "", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onFilterByChat", "onFilterByChatter", "onFilterByMessageType", "onFilterByTime", "onHideBot", "onHistoryUpdate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "recommendCacheKey", "recommendSectionList", "", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "sceneType", "Lcom/bytedance/lark/pb/search/v1/Scene$Type;", "showDialog", "typeSelectView", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.i */
public final class MessageFragment extends BaseSearchTabFragment {

    /* renamed from: s */
    public static final Companion f132797s = new Companion(null);

    /* renamed from: o */
    public String f132798o;

    /* renamed from: p */
    public String f132799p;

    /* renamed from: q */
    public SearchFilterDialog f132800q;

    /* renamed from: r */
    public FilterView f132801r;

    /* renamed from: t */
    private String f132802t;

    /* renamed from: u */
    private String f132803u;

    /* renamed from: v */
    private String f132804v;

    /* renamed from: w */
    private final C53807s f132805w = new C53807s(this);

    /* renamed from: x */
    private HashMap f132806x;

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public String mo183078a() {
        return "recommend.message.cache.key";
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: e */
    public int mo183082e() {
        return R.drawable.illustration_empty_neutral_no_message_logging;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: f */
    public int mo183083f() {
        return R.string.Lark_Search_SearchMessagePlaceholder;
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132806x;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/search/redesign/MessageFragment$Companion;", "", "()V", "SEARCH_MESSAGE_FILTER_PICK_CHATTER_REQUEST_ID", "", "SEARCH_MESSAGE_FILTER_PICK_CHAT_REQUEST_ID", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$a */
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
        return Scene.Type.SEARCH_MESSAGES;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$q */
    static final class C53805q<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ SearchInfoHistory f132828a;

        C53805q(SearchInfoHistory searchInfoHistory) {
            this.f132828a = searchInfoHistory;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            return C53637e.m207639b(this.f132828a.getFilter().chatIds);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$o */
    static final class C53803o<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132825a;

        /* renamed from: b */
        final /* synthetic */ SearchInfoHistory f132826b;

        C53803o(MessageFragment iVar, SearchInfoHistory searchInfoHistory) {
            this.f132825a = iVar;
            this.f132826b = searchInfoHistory;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            return this.f132825a.mo183132R().mo182951a(this.f132826b.getFilter().messageCreatorIds);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public List<SectionEntityType> mo183079b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.MESSAGE)));
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: d */
    public boolean mo183081d() {
        if (!super.mo183081d() || !C53258a.m205939a().mo181745a("lark.search.common.recommend.message")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$e */
    public static final class RunnableC53793e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132814a;

        RunnableC53793e(MessageFragment iVar) {
            this.f132814a = iVar;
        }

        public final void run() {
            FilterView a = MessageFragment.m208244a(this.f132814a);
            MessageChatterFilter b = this.f132814a.mo183156n().getMessageChatterFilterData().mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…ChatterFilterData.value!!");
            a.mo200820a(b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$i */
    public static final class C53797i<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132818a;

        C53797i(MessageFragment iVar) {
            this.f132818a = iVar;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            List list;
            List<String> b;
            MessageChatFilter b2 = this.f132818a.mo183156n().getMessageChatFilterData().mo5927b();
            if (b2 == null || (b = b2.mo183366b()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) b);
            }
            return C53637e.m207639b(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$k */
    public static final class C53799k<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132820a;

        C53799k(MessageFragment iVar) {
            this.f132820a = iVar;
        }

        /* renamed from: a */
        public final List<BasePickViewData> produce() {
            List<String> list;
            LinkedHashMap<String, String> a;
            Set<String> keySet;
            C53636d R = this.f132820a.mo183132R();
            MessageChatterFilter b = this.f132820a.mo183156n().getMessageChatterFilterData().mo5927b();
            if (b == null || (a = b.mo183369a()) == null || (keySet = a.keySet()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) keySet);
            }
            return R.mo182951a(list);
        }
    }

    private final List<String> aa() {
        List<String> b;
        List<String> list;
        MessageChatFilter b2 = mo183156n().getMessageChatFilterData().mo5927b();
        if (b2 == null || (b = b2.mo183366b()) == null || (list = CollectionsKt.toList(b)) == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    private final List<String> ab() {
        LinkedHashMap<String, String> a;
        Set<String> keySet;
        List<String> list;
        MessageChatterFilter b = mo183156n().getMessageChatterFilterData().mo5927b();
        if (b == null || (a = b.mo183369a()) == null || (keySet = a.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    /* renamed from: U */
    public final void mo183434U() {
        LinkedHashMap<String, String> a;
        MessageChatterFilter b = mo183156n().getMessageChatterFilterData().mo5927b();
        if (b == null || (a = b.mo183369a()) == null || !a.isEmpty()) {
            C57865c.m224574a(new C53799k(this), new C53800l(this));
        } else {
            mo183138a(new ArrayList(), 1);
        }
    }

    /* renamed from: V */
    public final void mo183435V() {
        C1177w<MessageHideBotFilter> messageHideBotFilterData = mo183156n().getMessageHideBotFilterData();
        MessageHideBotFilter b = mo183156n().getMessageHideBotFilterData().mo5927b();
        if (b != null) {
            b.mo183371a(!b.mo183372a());
        } else {
            b = null;
        }
        messageHideBotFilterData.mo5929b(b);
    }

    /* renamed from: W */
    public final void mo183436W() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        TypeSelectView typeSelectView = new TypeSelectView(context, true);
        typeSelectView.mo183380a(m208243Z());
        typeSelectView.setMOnTypeFilterClick(new C53801m(typeSelectView, this));
        m208245a(typeSelectView);
    }

    /* renamed from: X */
    public final void mo183437X() {
        LinkedHashMap<String, String> a;
        MessageChatFilter b = mo183156n().getMessageChatFilterData().mo5927b();
        if (b == null || (a = b.mo183365a()) == null || !a.isEmpty()) {
            C57865c.m224574a(new C53797i(this), new C53798j(this));
        } else {
            mo183144b(new ArrayList(), 2);
        }
    }

    /* renamed from: T */
    public final void mo183433T() {
        Pair<Date, Date> pair;
        TimeSelectDialog timeSelectDialog = new TimeSelectDialog(this.mContext);
        C53258a.m205939a().mo181735a(timeSelectDialog);
        timeSelectDialog.mo201294a(new C53802n(this));
        MessageTimeFilter b = mo183156n().getMessageTimeFilterData().mo5927b();
        if (b != null) {
            pair = b.mo183377a();
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/search/redesign/MessageFragment$onResetClick$1", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnResetClick;", "onResetClick", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$s */
    public static final class C53807s implements FilterView.IOnResetClick {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132830a;

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnResetClick
        /* renamed from: a */
        public void mo41008a() {
            C1177w<MessageChatFilter> messageChatFilterData = this.f132830a.mo183156n().getMessageChatFilterData();
            MessageChatFilter b = this.f132830a.mo183156n().getMessageChatFilterData().mo5927b();
            MessageChatterFilter kVar = null;
            if (b != null) {
                b.mo183368d();
            } else {
                b = null;
            }
            messageChatFilterData.mo5929b(b);
            C1177w<MessageTimeFilter> messageTimeFilterData = this.f132830a.mo183156n().getMessageTimeFilterData();
            MessageTimeFilter b2 = this.f132830a.mo183156n().getMessageTimeFilterData().mo5927b();
            if (b2 != null) {
                b2.mo183378a((Pair<Date, Date>) null);
            } else {
                b2 = null;
            }
            messageTimeFilterData.mo5929b(b2);
            C1177w<MessageHideBotFilter> messageHideBotFilterData = this.f132830a.mo183156n().getMessageHideBotFilterData();
            MessageHideBotFilter b3 = this.f132830a.mo183156n().getMessageHideBotFilterData().mo5927b();
            if (b3 != null) {
                b3.mo183371a(false);
            } else {
                b3 = null;
            }
            messageHideBotFilterData.mo5929b(b3);
            C1177w<MessageSceneFilter> messageTypeFilterData = this.f132830a.mo183156n().getMessageTypeFilterData();
            MessageSceneFilter b4 = this.f132830a.mo183156n().getMessageTypeFilterData().mo5927b();
            if (b4 != null) {
                b4.mo183375a(Scene.Type.SEARCH_MESSAGES);
            } else {
                b4 = null;
            }
            messageTypeFilterData.mo5929b(b4);
            C1177w<MessageChatterFilter> messageChatterFilterData = this.f132830a.mo183156n().getMessageChatterFilterData();
            MessageChatterFilter b5 = this.f132830a.mo183156n().getMessageChatterFilterData().mo5927b();
            if (b5 != null) {
                b5.mo183369a().clear();
                kVar = b5;
            }
            messageChatterFilterData.mo5929b(kVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53807s(MessageFragment iVar) {
            this.f132830a = iVar;
        }
    }

    /* renamed from: Z */
    private final List<TypeSelectData> m208243Z() {
        Scene.Type type;
        boolean z;
        ArrayList arrayList = new ArrayList();
        TypeSelectData bVar = new TypeSelectData(Scene.Type.SEARCH_LINK.getNumber());
        String string = getString(R.string.Lark_Search_Link);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_Search_Link)");
        bVar.mo183394a(string);
        MessageSceneFilter b = mo183156n().getMessageTypeFilterData().mo5927b();
        Scene.Type type2 = null;
        if (b != null) {
            type = b.mo183374a();
        } else {
            type = null;
        }
        boolean z2 = true;
        if (type == Scene.Type.SEARCH_LINK) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo183395a(z);
        arrayList.add(bVar);
        TypeSelectData bVar2 = new TypeSelectData(Scene.Type.SEARCH_FILE.getNumber());
        String string2 = getString(R.string.Lark_Legacy_FileFragmentTitle);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_Legacy_FileFragmentTitle)");
        bVar2.mo183394a(string2);
        MessageSceneFilter b2 = mo183156n().getMessageTypeFilterData().mo5927b();
        if (b2 != null) {
            type2 = b2.mo183374a();
        }
        if (type2 != Scene.Type.SEARCH_FILE) {
            z2 = false;
        }
        bVar2.mo183395a(z2);
        arrayList.add(bVar2);
        return arrayList;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: D */
    public String mo183118D() {
        MessageTimeFilter b;
        Date date;
        StringBuilder sb = new StringBuilder();
        MessageSceneFilter b2 = mo183156n().getMessageTypeFilterData().mo5927b();
        if (b2 != null && b2.mo183376b()) {
            sb.append("messageTypes,");
        }
        MessageChatterFilter b3 = mo183156n().getMessageChatterFilterData().mo5927b();
        if (b3 != null && b3.mo183370b()) {
            sb.append("fromIds,");
        }
        MessageChatFilter b4 = mo183156n().getMessageChatFilterData().mo5927b();
        if (b4 != null && b4.mo183367c()) {
            sb.append("chatIds,");
        }
        MessageTimeFilter b5 = mo183156n().getMessageTimeFilterData().mo5927b();
        if (!(b5 == null || !b5.mo183379b() || (b = mo183156n().getMessageTimeFilterData().mo5927b()) == null)) {
            Pair<Date, Date> a = b.mo183377a();
            Date date2 = null;
            if (a != null) {
                date = (Date) a.first;
            } else {
                date = null;
            }
            if (date != null) {
                sb.append("startTime,");
            }
            Pair<Date, Date> a2 = b.mo183377a();
            if (a2 != null) {
                date2 = (Date) a2.second;
            }
            if (date2 != null) {
                sb.append("endTime,");
            }
        }
        MessageHideBotFilter b6 = mo183156n().getMessageHideBotFilterData().mo5927b();
        if (b6 != null && b6.mo183373b()) {
            sb.append("mustNotFromTypes,");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply {\n…   }\n        }.toString()");
        return sb2;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: w */
    public boolean mo183165w() {
        MessageChatterFilter b;
        MessageChatFilter b2;
        MessageTimeFilter b3;
        MessageHideBotFilter b4;
        MessageSceneFilter b5 = mo183156n().getMessageTypeFilterData().mo5927b();
        boolean z = true;
        if ((b5 == null || !b5.mo183376b()) && (((b = mo183156n().getMessageChatterFilterData().mo5927b()) == null || !b.mo183370b()) && (((b2 = mo183156n().getMessageChatFilterData().mo5927b()) == null || !b2.mo183367c()) && (((b3 = mo183156n().getMessageTimeFilterData().mo5927b()) == null || !b3.mo183379b()) && ((b4 = mo183156n().getMessageHideBotFilterData().mo5927b()) == null || !b4.mo183373b()))))) {
            z = false;
        }
        if (z) {
            FilterView filterView = this.f132801r;
            if (filterView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
            }
            filterView.mo200822b();
        } else {
            FilterView filterView2 = this.f132801r;
            if (filterView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
            }
            filterView2.mo200819a();
        }
        return z;
    }

    /* renamed from: Y */
    private final void m208242Y() {
        C1177w<MessageChatterFilter> messageChatterFilterData = mo183156n().getMessageChatterFilterData();
        MessageChatterFilter kVar = new MessageChatterFilter("message/chatter");
        String str = this.f132802t;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatterSendWording");
        }
        kVar.mo200843a(str);
        messageChatterFilterData.mo5929b(kVar);
        C1177w<MessageChatFilter> messageChatFilterData = mo183156n().getMessageChatFilterData();
        MessageChatFilter jVar = new MessageChatFilter("message/chat");
        String str2 = this.f132803u;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatWording");
        }
        jVar.mo200843a(str2);
        messageChatFilterData.mo5929b(jVar);
        C1177w<MessageTimeFilter> messageTimeFilterData = mo183156n().getMessageTimeFilterData();
        MessageTimeFilter nVar = new MessageTimeFilter("message/time");
        String str3 = this.f132798o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeWording");
        }
        nVar.mo200843a(str3);
        messageTimeFilterData.mo5929b(nVar);
        C1177w<MessageHideBotFilter> messageHideBotFilterData = mo183156n().getMessageHideBotFilterData();
        MessageHideBotFilter lVar = new MessageHideBotFilter("message/hide_bot");
        String str4 = this.f132804v;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMessageHideBotWording");
        }
        lVar.mo200843a(str4);
        messageHideBotFilterData.mo5929b(lVar);
        C1177w<MessageSceneFilter> messageTypeFilterData = mo183156n().getMessageTypeFilterData();
        MessageSceneFilter mVar = new MessageSceneFilter("message/type");
        String str5 = this.f132799p;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMessageTypeWording");
        }
        mVar.mo200843a(str5);
        messageTypeFilterData.mo5929b(mVar);
        FilterView filterView = this.f132801r;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
        }
        FilterData[] bVarArr = new FilterData[5];
        MessageChatterFilter b = mo183156n().getMessageChatterFilterData().mo5927b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…ChatterFilterData.value!!");
        bVarArr[0] = b;
        MessageChatFilter b2 = mo183156n().getMessageChatFilterData().mo5927b();
        if (b2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b2, "mBaseSearchTabFragmentVi…ageChatFilterData.value!!");
        bVarArr[1] = b2;
        MessageTimeFilter b3 = mo183156n().getMessageTimeFilterData().mo5927b();
        if (b3 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b3, "mBaseSearchTabFragmentVi…ageTimeFilterData.value!!");
        bVarArr[2] = b3;
        MessageHideBotFilter b4 = mo183156n().getMessageHideBotFilterData().mo5927b();
        if (b4 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b4, "mBaseSearchTabFragmentVi…HideBotFilterData.value!!");
        bVarArr[3] = b4;
        MessageSceneFilter b5 = mo183156n().getMessageTypeFilterData().mo5927b();
        if (b5 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(b5, "mBaseSearchTabFragmentVi…ageTypeFilterData.value!!");
        bVarArr[4] = b5;
        filterView.mo200821a(CollectionsKt.listOf((Object[]) bVarArr));
        filterView.setOnResetClick(this.f132805w);
        filterView.setOnFilterItemClick(new C53788b(this));
        mo183156n().getMessageTimeFilterData().mo5923a(getViewLifecycleOwner(), new C53794f(this));
        mo183156n().getMessageTypeFilterData().mo5923a(getViewLifecycleOwner(), new C53795g(this));
        mo183156n().getMessageHideBotFilterData().mo5923a(getViewLifecycleOwner(), new C53796h(this));
        mo183156n().getMessageChatterFilterData().mo5923a(getViewLifecycleOwner(), new C53789c(this));
        mo183156n().getMessageChatFilterData().mo5923a(getViewLifecycleOwner(), new C53791d(this));
        FilterView filterView2 = this.f132801r;
        if (filterView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
        }
        filterView2.post(new RunnableC53793e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/MessageFragment$initFilter$6$1", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "onFilterItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$b */
    public static final class C53788b implements FilterView.IOnFilterItemClick {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132807a;

        C53788b(MessageFragment iVar) {
            this.f132807a = iVar;
        }

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnFilterItemClick
        /* renamed from: a */
        public void mo41007a(FilterData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String h = bVar.mo200849h();
            switch (h.hashCode()) {
                case -1330917280:
                    if (h.equals("message/chat")) {
                        this.f132807a.mo183437X();
                        return;
                    }
                    return;
                case -1330409515:
                    if (h.equals("message/time")) {
                        this.f132807a.mo183433T();
                        return;
                    }
                    return;
                case -1330394046:
                    if (h.equals("message/type")) {
                        this.f132807a.mo183436W();
                        return;
                    }
                    return;
                case 475042386:
                    if (h.equals("message/hide_bot")) {
                        this.f132807a.mo183435V();
                        return;
                    }
                    return;
                case 1781502913:
                    if (h.equals("message/chatter")) {
                        this.f132807a.mo183434U();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$j */
    public static final class C53798j<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132819a;

        C53798j(MessageFragment iVar) {
            this.f132819a = iVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.f132819a.mo183144b(list, 2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$l */
    public static final class C53800l<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132821a;

        C53800l(MessageFragment iVar) {
            this.f132821a = iVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.f132821a.mo183138a(list, 1);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FilterView m208244a(MessageFragment iVar) {
        FilterView filterView = iVar.f132801r;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
        }
        return filterView;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m208246b(MessageFragment iVar) {
        String str = iVar.f132798o;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeWording");
        }
        return str;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m208247c(MessageFragment iVar) {
        String str = iVar.f132799p;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMessageTypeWording");
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/MessageChatterFilter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$c */
    public static final class C53789c<T> implements AbstractC1178x<MessageChatterFilter> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132808a;

        C53789c(MessageFragment iVar) {
            this.f132808a = iVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/MessageFragment$initFilter$10$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmaps", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.i$c$a */
        public static final class C53790a implements IGetDataCallback<List<? extends Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ MessageChatterFilter f132809a;

            /* renamed from: b */
            final /* synthetic */ C53789c f132810b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                Intrinsics.checkParameterIsNotNull(list, "bitmaps");
                this.f132809a.mo200848g().clear();
                this.f132809a.mo200848g().addAll(list);
                this.f132809a.mo200844b(true);
                FilterView a = MessageFragment.m208244a(this.f132810b.f132808a);
                MessageChatterFilter kVar = this.f132809a;
                Intrinsics.checkExpressionValueIsNotNull(kVar, "this@apply");
                a.mo200820a(kVar);
            }

            C53790a(MessageChatterFilter kVar, C53789c cVar) {
                this.f132809a = kVar;
                this.f132810b = cVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(MessageChatterFilter kVar) {
            if (kVar.mo183369a().size() > 0) {
                Collection<String> values = kVar.mo183369a().values();
                Intrinsics.checkExpressionValueIsNotNull(values, "chatterId2AvatarMap.values");
                List<String> mutableList = CollectionsKt.toMutableList((Collection) values);
                if (kVar.mo183369a().size() > 3) {
                    mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 3));
                }
                ISearchModuleDependency.AbstractC53327m S = this.f132808a.mo183133S();
                Set<String> keySet = kVar.mo183369a().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "chatterId2AvatarMap.keys");
                S.mo181807a(mutableList, new ArrayList(CollectionsKt.toMutableList((Collection) keySet)), UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new C53790a(kVar, this));
            } else {
                kVar.mo200848g().clear();
                kVar.mo200844b(false);
                FilterView a = MessageFragment.m208244a(this.f132808a);
                Intrinsics.checkExpressionValueIsNotNull(kVar, "this");
                a.mo200820a(kVar);
            }
            MessageFragment iVar = this.f132808a;
            iVar.mo183139a(iVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/MessageChatFilter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$d */
    public static final class C53791d<T> implements AbstractC1178x<MessageChatFilter> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132811a;

        C53791d(MessageFragment iVar) {
            this.f132811a = iVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/MessageFragment$initFilter$11$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmaps", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.i$d$a */
        public static final class C53792a implements IGetDataCallback<List<? extends Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ MessageChatFilter f132812a;

            /* renamed from: b */
            final /* synthetic */ C53791d f132813b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                Intrinsics.checkParameterIsNotNull(list, "bitmaps");
                this.f132812a.mo200848g().clear();
                this.f132812a.mo200848g().addAll(list);
                this.f132812a.mo200844b(true);
                FilterView a = MessageFragment.m208244a(this.f132813b.f132811a);
                MessageChatFilter jVar = this.f132812a;
                Intrinsics.checkExpressionValueIsNotNull(jVar, "this@apply");
                a.mo200820a(jVar);
            }

            C53792a(MessageChatFilter jVar, C53791d dVar) {
                this.f132812a = jVar;
                this.f132813b = dVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(MessageChatFilter jVar) {
            if (jVar.mo183365a().size() > 0) {
                Collection<String> values = jVar.mo183365a().values();
                Intrinsics.checkExpressionValueIsNotNull(values, "id2AvatarMap.values");
                List<String> mutableList = CollectionsKt.toMutableList((Collection) values);
                Set<String> keySet = jVar.mo183365a().keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "id2AvatarMap.keys");
                List<String> mutableList2 = CollectionsKt.toMutableList((Collection) keySet);
                if (jVar.mo183365a().size() > 3) {
                    mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 3));
                    mutableList2 = CollectionsKt.toMutableList((Collection) mutableList2.subList(0, 3));
                }
                this.f132811a.mo183133S().mo181807a(mutableList, mutableList2, UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new C53792a(jVar, this));
            } else {
                jVar.mo200848g().clear();
                jVar.mo200844b(false);
                FilterView a = MessageFragment.m208244a(this.f132811a);
                Intrinsics.checkExpressionValueIsNotNull(jVar, "this");
                a.mo200820a(jVar);
            }
            MessageFragment iVar = this.f132811a;
            iVar.mo183139a(iVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/MessageHideBotFilter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$h */
    public static final class C53796h<T> implements AbstractC1178x<MessageHideBotFilter> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132817a;

        C53796h(MessageFragment iVar) {
            this.f132817a = iVar;
        }

        /* renamed from: a */
        public final void onChanged(MessageHideBotFilter lVar) {
            FilterView a = MessageFragment.m208244a(this.f132817a);
            lVar.mo200844b(lVar.mo183372a());
            Intrinsics.checkExpressionValueIsNotNull(lVar, "it.apply {\n             …hideBot\n                }");
            a.mo200820a(lVar);
            MessageFragment iVar = this.f132817a;
            iVar.mo183139a(iVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/search/redesign/MessageFragment$showDialog$1$1$1", "com/ss/android/lark/search/redesign/MessageFragment$$special$$inlined$run$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$t */
    public static final class View$OnClickListenerC53808t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterDialog f132831a;

        /* renamed from: b */
        final /* synthetic */ MessageFragment f132832b;

        /* renamed from: c */
        final /* synthetic */ View f132833c;

        View$OnClickListenerC53808t(SearchFilterDialog searchFilterDialog, MessageFragment iVar, View view) {
            this.f132831a = searchFilterDialog;
            this.f132832b = iVar;
            this.f132833c = view;
        }

        public final void onClick(View view) {
            C1177w<MessageSceneFilter> messageTypeFilterData = this.f132832b.mo183156n().getMessageTypeFilterData();
            MessageSceneFilter b = this.f132832b.mo183156n().getMessageTypeFilterData().mo5927b();
            if (b != null) {
                b.mo183375a(Scene.Type.SEARCH_MESSAGES);
            } else {
                b = null;
            }
            messageTypeFilterData.mo5929b(b);
            this.f132831a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/MessageTimeFilter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$f */
    public static final class C53794f<T> implements AbstractC1178x<MessageTimeFilter> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132815a;

        C53794f(MessageFragment iVar) {
            this.f132815a = iVar;
        }

        /* renamed from: a */
        public final void onChanged(MessageTimeFilter nVar) {
            FilterView a = MessageFragment.m208244a(this.f132815a);
            if (nVar.mo183377a() != null) {
                Pair<Date, Date> a2 = nVar.mo183377a();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                Date date = (Date) a2.first;
                Pair<Date, Date> a3 = nVar.mo183377a();
                if (a3 == null) {
                    Intrinsics.throwNpe();
                }
                String a4 = C53345b.m206461a(date, (Date) a3.second);
                Intrinsics.checkExpressionValueIsNotNull(a4, "SearchUtils.getFilterTim…st, it.timePair!!.second)");
                nVar.mo200843a(a4);
                nVar.mo200844b(true);
            } else {
                nVar.mo200843a(MessageFragment.m208246b(this.f132815a));
                nVar.mo200844b(false);
            }
            Intrinsics.checkExpressionValueIsNotNull(nVar, "it.apply {\n             …      }\n                }");
            a.mo200820a(nVar);
            MessageFragment iVar = this.f132815a;
            iVar.mo183139a(iVar.mo183165w());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/filter/MessageSceneFilter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$g */
    public static final class C53795g<T> implements AbstractC1178x<MessageSceneFilter> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132816a;

        C53795g(MessageFragment iVar) {
            this.f132816a = iVar;
        }

        /* renamed from: a */
        public final void onChanged(MessageSceneFilter mVar) {
            String str;
            FilterView a = MessageFragment.m208244a(this.f132816a);
            int i = C53809j.f132834a[mVar.mo183374a().ordinal()];
            boolean z = true;
            if (i == 1) {
                str = MessageFragment.m208247c(this.f132816a);
            } else if (i == 2) {
                str = this.f132816a.getString(R.string.Lark_Legacy_FileFragmentTitle);
                Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Legacy_FileFragmentTitle)");
            } else if (i != 3) {
                str = MessageFragment.m208247c(this.f132816a);
            } else {
                str = this.f132816a.getString(R.string.Lark_Search_Link);
                Intrinsics.checkExpressionValueIsNotNull(str, "getString(R.string.Lark_Search_Link)");
            }
            mVar.mo200843a(str);
            if (mVar.mo183374a() == Scene.Type.SEARCH_MESSAGES) {
                z = false;
            }
            mVar.mo200844b(z);
            Intrinsics.checkExpressionValueIsNotNull(mVar, "it.apply {\n             …ESSAGES\n                }");
            a.mo200820a(mVar);
            MessageFragment iVar = this.f132816a;
            iVar.mo183139a(iVar.mo183165w());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/MessageFragment$onFilterByMessageType$1$1", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$m */
    public static final class C53801m implements TypeSelectAdapter.IOnTypeFilterClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectView f132822a;

        /* renamed from: b */
        final /* synthetic */ MessageFragment f132823b;

        @Override // com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter.IOnTypeFilterClickListener
        /* renamed from: a */
        public void mo183328a(int i) {
            TypeSelectData bVar = this.f132822a.getItems().get(i);
            C1177w<MessageSceneFilter> messageTypeFilterData = this.f132823b.mo183156n().getMessageTypeFilterData();
            MessageSceneFilter b = this.f132823b.mo183156n().getMessageTypeFilterData().mo5927b();
            if (b != null) {
                b.mo183375a(Scene.Type.Companion.mo183841a(bVar.mo183397c()));
            } else {
                b = null;
            }
            messageTypeFilterData.mo5929b(b);
            SearchFilterDialog searchFilterDialog = this.f132823b.f132800q;
            if (searchFilterDialog != null) {
                searchFilterDialog.dismiss();
            }
        }

        C53801m(TypeSelectView typeSelectView, MessageFragment iVar) {
            this.f132822a = typeSelectView;
            this.f132823b = iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$p */
    static final class C53804p<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132827a;

        C53804p(MessageFragment iVar) {
            this.f132827a = iVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            C1177w<MessageChatterFilter> messageChatterFilterData = this.f132827a.mo183156n().getMessageChatterFilterData();
            MessageChatterFilter b = this.f132827a.mo183156n().getMessageChatterFilterData().mo5927b();
            if (b != null) {
                b.mo183369a().clear();
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "pickViewData");
                    String id = t.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "pickViewData.id");
                    String imageKey = t.getImageKey();
                    Intrinsics.checkExpressionValueIsNotNull(imageKey, "pickViewData.imageKey");
                    b.mo183369a().put(id, imageKey);
                }
            } else {
                b = null;
            }
            messageChatterFilterData.mo5929b(b);
        }
    }

    /* renamed from: a */
    private final void m208245a(View view) {
        Scene.Type type;
        boolean z;
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        SearchFilterDialog searchFilterDialog = new SearchFilterDialog(context);
        C53258a.m205939a().mo181735a(searchFilterDialog);
        String string = UIHelper.getString(R.string.Lark_Search_MessageType);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str….Lark_Search_MessageType)");
        searchFilterDialog.mo183337a(string);
        searchFilterDialog.mo183336a(view);
        TextView b = searchFilterDialog.mo183338b();
        MessageSceneFilter b2 = mo183156n().getMessageTypeFilterData().mo5927b();
        if (b2 != null) {
            type = b2.mo183374a();
        } else {
            type = null;
        }
        if (type != Scene.Type.SEARCH_MESSAGES) {
            z = true;
        } else {
            z = false;
        }
        b.setEnabled(z);
        b.setText(R.string.Lark_Chat_ClearText);
        b.setOnClickListener(new View$OnClickListenerC53808t(searchFilterDialog, this, view));
        KeyboardUtils.hideKeyboard(this.mContext);
        searchFilterDialog.show();
        this.f132800q = searchFilterDialog;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$r */
    static final class C53806r<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132829a;

        C53806r(MessageFragment iVar) {
            this.f132829a = iVar;
        }

        /* renamed from: a */
        public final void consume(List<BasePickViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            C1177w<MessageChatFilter> messageChatFilterData = this.f132829a.mo183156n().getMessageChatFilterData();
            MessageChatFilter b = this.f132829a.mo183156n().getMessageChatFilterData().mo5927b();
            if (b != null) {
                b.mo183368d();
                for (T t : list) {
                    if (t instanceof PickChatViewData) {
                        T t2 = t;
                        if (t2.getChatType() == Chat.Type.P2P) {
                            String p2pChatterId = t2.getP2pChatterId();
                            Intrinsics.checkExpressionValueIsNotNull(p2pChatterId, "pickViewData.p2pChatterId");
                            String imageKey = t2.getImageKey();
                            Intrinsics.checkExpressionValueIsNotNull(imageKey, "pickViewData.imageKey");
                            b.mo183365a().put(p2pChatterId, imageKey);
                        } else {
                            String id = t2.getId();
                            Intrinsics.checkExpressionValueIsNotNull(id, "pickViewData.id");
                            String imageKey2 = t2.getImageKey();
                            Intrinsics.checkExpressionValueIsNotNull(imageKey2, "pickViewData.imageKey");
                            b.mo183365a().put(id, imageKey2);
                        }
                        List<String> b2 = b.mo183366b();
                        String id2 = t2.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id2, "pickViewData.id");
                        b2.add(id2);
                    }
                }
            } else {
                b = null;
            }
            messageChatFilterData.mo5929b(b);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        Scene.Type type;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        SearchContext a = super.mo183077a(str);
        List<String> w = a.mo184447w();
        if (w != null) {
            w.clear();
        }
        List<String> w2 = a.mo184447w();
        if (w2 != null) {
            w2.addAll(aa());
        }
        List<String> x = a.mo184448x();
        if (x != null) {
            x.clear();
        }
        List<String> x2 = a.mo184448x();
        if (x2 != null) {
            x2.addAll(ab());
        }
        MessageSceneFilter b = mo183156n().getMessageTypeFilterData().mo5927b();
        Pair<Date, Date> pair = null;
        if (b != null) {
            type = b.mo183374a();
        } else {
            type = null;
        }
        a.mo184400b(type);
        MessageTimeFilter b2 = mo183156n().getMessageTimeFilterData().mo5927b();
        if (b2 != null) {
            pair = b2.mo183377a();
        }
        a.mo184390a(pair);
        MessageHideBotFilter b3 = mo183156n().getMessageHideBotFilterData().mo5927b();
        if (b3 != null) {
            z = b3.mo183372a();
        } else {
            z = false;
        }
        a.mo184435o(z);
        return a;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public SearchInfoHistory mo183141b(SearchInfoHistory searchInfoHistory) {
        Pair<Date, Date> pair;
        Scene.Type type;
        long j;
        SearchInfoHistory.MessageSubSource messageSubSource;
        Date date;
        Date date2;
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        MessageTimeFilter b = mo183156n().getMessageTimeFilterData().mo5927b();
        if (b != null) {
            pair = b.mo183377a();
        } else {
            pair = null;
        }
        MessageSceneFilter b2 = mo183156n().getMessageTypeFilterData().mo5927b();
        if (b2 == null || (type = b2.mo183374a()) == null) {
            type = Scene.Type.SEARCH_MESSAGES;
        }
        NetSearchRequest.Filter.C53951a d = NetSearchRequest.Filter.newBuilder().mo184520a(aa()).mo184529d(ab());
        long j2 = 0;
        if (pair == null || (date2 = (Date) pair.first) == null) {
            j = 0;
        } else {
            j = date2.getTime();
        }
        NetSearchRequest.Filter.C53951a a = d.mo184516a(j / 1000);
        if (!(pair == null || (date = (Date) pair.second) == null)) {
            j2 = date.getTime();
        }
        searchInfoHistory.setFilter(a.mo184523b(j2 / 1000).mo184522a());
        int i = C53809j.f132835b[type.ordinal()];
        if (i == 1) {
            messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL);
        } else if (i == 2) {
            messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.FILE);
        } else if (i != 3) {
            messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL);
        } else {
            messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.LINK);
        }
        searchInfoHistory.setMessageSubSource(messageSubSource);
        return searchInfoHistory;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public void mo183136a(SearchInfoHistory searchInfoHistory) {
        Boolean bool;
        Boolean bool2;
        Date date;
        Scene.Type type;
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        this.f132805w.mo41008a();
        List<String> list = searchInfoHistory.getFilter().messageCreatorIds;
        MessageTimeFilter nVar = null;
        if (list != null) {
            bool = Boolean.valueOf(!list.isEmpty());
        } else {
            bool = null;
        }
        if (bool.booleanValue()) {
            C57865c.m224574a(new C53803o(this, searchInfoHistory), new C53804p(this));
        }
        List<String> list2 = searchInfoHistory.getFilter().chatIds;
        if (list2 != null) {
            bool2 = Boolean.valueOf(!list2.isEmpty());
        } else {
            bool2 = null;
        }
        if (bool2.booleanValue()) {
            C57865c.m224574a(new C53805q(searchInfoHistory), new C53806r(this));
        }
        C1177w<MessageSceneFilter> messageTypeFilterData = mo183156n().getMessageTypeFilterData();
        MessageSceneFilter b = mo183156n().getMessageTypeFilterData().mo5927b();
        if (b != null) {
            SearchInfoHistory.MessageSubSource messageSubSource = searchInfoHistory.getMessageSubSource();
            if (messageSubSource == null) {
                messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL);
            }
            SearchInfoHistory.MessageSubSource.Type type2 = messageSubSource.getType();
            if (type2 == null) {
                type = Scene.Type.SEARCH_MESSAGES;
            } else {
                int i = C53809j.f132836c[type2.ordinal()];
                if (i == 1) {
                    type = Scene.Type.SEARCH_MESSAGES;
                } else if (i == 2) {
                    type = Scene.Type.SEARCH_FILE;
                } else if (i == 3) {
                    type = Scene.Type.SEARCH_LINK;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            b.mo183375a(type);
        } else {
            b = null;
        }
        messageTypeFilterData.mo5929b(b);
        if (searchInfoHistory.getFilter().messageEndTime != 0) {
            long j = (long) 1000;
            Date date2 = new Date(searchInfoHistory.getFilter().messageEndTime * j);
            if (searchInfoHistory.getFilter().messageStartTime != 0) {
                date = new Date(searchInfoHistory.getFilter().messageStartTime * j);
            } else {
                date = null;
            }
            C1177w<MessageTimeFilter> messageTimeFilterData = mo183156n().getMessageTimeFilterData();
            MessageTimeFilter b2 = mo183156n().getMessageTimeFilterData().mo5927b();
            if (b2 != null) {
                b2.mo183378a(Pair.create(date, date2));
                nVar = b2;
            }
            messageTimeFilterData.mo5929b(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "startTime", "Ljava/util/Date;", "endTime", "onTimeSelect"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.i$n */
    public static final class C53802n implements TimeSelectDialog.AbstractC59218a {

        /* renamed from: a */
        final /* synthetic */ MessageFragment f132824a;

        C53802n(MessageFragment iVar) {
            this.f132824a = iVar;
        }

        @Override // com.ss.android.lark.widget.timepicker.TimeSelectDialog.AbstractC59218a
        /* renamed from: a */
        public final void mo182573a(Date date, Date date2) {
            Intrinsics.checkParameterIsNotNull(date2, "endTime");
            C1177w<MessageTimeFilter> messageTimeFilterData = this.f132824a.mo183156n().getMessageTimeFilterData();
            MessageTimeFilter b = this.f132824a.mo183156n().getMessageTimeFilterData().mo5927b();
            if (b != null) {
                b.mo183378a(Pair.create(date, date2));
            } else {
                b = null;
            }
            messageTimeFilterData.mo5929b(b);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        String string = getString(R.string.Lark_Search_SearchPeopleFilter);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Lark_Search_SearchPeopleFilter)");
        this.f132802t = string;
        String string2 = getString(R.string.Lark_Search_SearchChatFilter);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Lark_Search_SearchChatFilter)");
        this.f132803u = string2;
        String string3 = getString(R.string.Lark_Search_MobileSearchTimeFilter);
        Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.Lark_…h_MobileSearchTimeFilter)");
        this.f132798o = string3;
        String string4 = getString(R.string.Search_Filter_Message_Hidebot);
        Intrinsics.checkExpressionValueIsNotNull(string4, "getString(R.string.Search_Filter_Message_Hidebot)");
        this.f132804v = string4;
        String string5 = getString(R.string.Lark_Search_MessageType);
        Intrinsics.checkExpressionValueIsNotNull(string5, "getString(R.string.Lark_Search_MessageType)");
        this.f132799p = string5;
        mo183157o().setVisibility(0);
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        this.f132801r = new FilterView(context);
        FrameLayout o = mo183157o();
        FilterView filterView = this.f132801r;
        if (filterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterView");
        }
        o.addView(filterView);
        m208242Y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v16, resolved type: com.ss.android.lark.search.redesign.filter.k */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m165379d("LarkSearch.Search.V2.MessageFragment", "onActivityResult(), requestCode = " + i);
        boolean z = false;
        MessageChatFilter jVar = null;
        if (i == 1) {
            if (intent != null) {
                Bundle extras = intent.getExtras();
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
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (!z || !(list instanceof List)) {
                        list = null;
                    }
                    if (list != null) {
                        C1177w<MessageChatterFilter> messageChatterFilterData = mo183156n().getMessageChatterFilterData();
                        MessageChatterFilter b = mo183156n().getMessageChatterFilterData().mo5927b();
                        if (b != 0) {
                            b.mo183369a().clear();
                            for (BasePickViewData basePickViewData : list) {
                                String id = basePickViewData.getId();
                                Intrinsics.checkExpressionValueIsNotNull(id, "chatter.id");
                                String imageKey = basePickViewData.getImageKey();
                                Intrinsics.checkExpressionValueIsNotNull(imageKey, "chatter.imageKey");
                                b.mo183369a().put(id, imageKey);
                            }
                            jVar = b;
                        }
                        messageChatterFilterData.mo5929b((MessageChatterFilter) jVar);
                    }
                }
            }
        } else if (i == 2 && intent != null) {
            Bundle extras2 = intent.getExtras();
            Object obj2 = extras2 != null ? extras2.get("message/filter/picked_chat") : null;
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            List<BasePickViewData> list3 = (List) obj2;
            if (list3 != null) {
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!(it2.next() instanceof BasePickViewData)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                if (!z || !(list3 instanceof List)) {
                    list3 = null;
                }
                if (list3 != null) {
                    C1177w<MessageChatFilter> messageChatFilterData = mo183156n().getMessageChatFilterData();
                    MessageChatFilter b2 = mo183156n().getMessageChatFilterData().mo5927b();
                    if (b2 != null) {
                        b2.mo183368d();
                        for (BasePickViewData basePickViewData2 : list3) {
                            if (basePickViewData2 instanceof PickChatViewData) {
                                PickChatViewData pickChatViewData = (PickChatViewData) basePickViewData2;
                                if (pickChatViewData.getChatType() == Chat.Type.P2P) {
                                    String p2pChatterId = pickChatViewData.getP2pChatterId();
                                    Intrinsics.checkExpressionValueIsNotNull(p2pChatterId, "pickViewData.p2pChatterId");
                                    String imageKey2 = pickChatViewData.getImageKey();
                                    Intrinsics.checkExpressionValueIsNotNull(imageKey2, "pickViewData.imageKey");
                                    b2.mo183365a().put(p2pChatterId, imageKey2);
                                } else {
                                    String id2 = pickChatViewData.getId();
                                    Intrinsics.checkExpressionValueIsNotNull(id2, "pickViewData.id");
                                    String imageKey3 = pickChatViewData.getImageKey();
                                    Intrinsics.checkExpressionValueIsNotNull(imageKey3, "pickViewData.imageKey");
                                    b2.mo183365a().put(id2, imageKey3);
                                }
                                List<String> b3 = b2.mo183366b();
                                String id3 = pickChatViewData.getId();
                                Intrinsics.checkExpressionValueIsNotNull(id3, "pickViewData.id");
                                b3.add(id3);
                            } else if (basePickViewData2 instanceof PickChatterViewData) {
                                List<String> b4 = b2.mo183366b();
                                PickChatterViewData pickChatterViewData = (PickChatterViewData) basePickViewData2;
                                String p2pChatId = pickChatterViewData.getP2pChatId();
                                Intrinsics.checkExpressionValueIsNotNull(p2pChatId, "pickViewData.p2pChatId");
                                b4.add(p2pChatId);
                                String id4 = pickChatterViewData.getId();
                                Intrinsics.checkExpressionValueIsNotNull(id4, "pickViewData.id");
                                String imageKey4 = pickChatterViewData.getImageKey();
                                Intrinsics.checkExpressionValueIsNotNull(imageKey4, "pickViewData.imageKey");
                                b2.mo183365a().put(id4, imageKey4);
                            }
                        }
                        jVar = b2;
                    }
                    messageChatFilterData.mo5929b(jVar);
                }
            }
        }
    }
}
