package com.ss.android.lark.search.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.search.widget.params.BasePickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporter;
import com.ss.android.lark.search.widget.reporter.PickerReporterConstants;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.search.widget.selectedview.C53873a;
import com.ss.android.lark.search.widget.selectedview.SelectedMoreActivity;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.reporter.SafeReporter;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.ICustomBinder;
import com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class BasePicker<P extends BasePickerParams, PK extends BasePicker<P, PK>> extends FrameLayout {

    /* renamed from: w */
    public static final List<SearchBaseInfo> f132956w = new ArrayList();

    /* renamed from: x */
    public static final Companion f132957x = new Companion(null);

    /* renamed from: A */
    private ISearchLifecycleObserver f132958A;

    /* renamed from: B */
    private boolean f132959B;

    /* renamed from: C */
    private boolean f132960C;

    /* renamed from: D */
    private List<IOnPickNotify> f132961D;

    /* renamed from: E */
    private IViewDependency f132962E;

    /* renamed from: F */
    private OnPickerParamsLoader<P> f132963F;

    /* renamed from: G */
    private PickerUsePage f132964G;

    /* renamed from: H */
    private PickerUseCategory f132965H;

    /* renamed from: I */
    private boolean f132966I;

    /* renamed from: J */
    private final ViewTreeObserver.OnGlobalLayoutListener f132967J;

    /* renamed from: K */
    private String f132968K;

    /* renamed from: a */
    private Context f132969a;

    /* renamed from: b */
    private FrameLayout f132970b;

    /* renamed from: c */
    private View f132971c;

    /* renamed from: d */
    private FrameLayout f132972d;

    /* renamed from: e */
    private CommonRecyclerView f132973e;

    /* renamed from: f */
    private View f132974f;

    /* renamed from: g */
    private TextView f132975g;

    /* renamed from: h */
    private IGetDataCallback<SearchResponse> f132976h;

    /* renamed from: i */
    private SearchResultView.IOnLoadMore f132977i;

    /* renamed from: j */
    private boolean f132978j;

    /* renamed from: k */
    private boolean f132979k;

    /* renamed from: l */
    protected SearchInputView f132980l;

    /* renamed from: m */
    protected SearchResultView f132981m;

    /* renamed from: n */
    protected FrameLayout f132982n;

    /* renamed from: o */
    public View f132983o;

    /* renamed from: p */
    public C53873a f132984p;

    /* renamed from: q */
    public boolean f132985q;

    /* renamed from: r */
    public String f132986r;

    /* renamed from: s */
    public P f132987s;

    /* renamed from: t */
    public List<SearchBaseInfo> f132988t;

    /* renamed from: u */
    public boolean f132989u;

    /* renamed from: v */
    public String f132990v;

    /* renamed from: y */
    private PickerReporterDelegate f132991y;

    /* renamed from: z */
    private SearchResultView.IOnBusinessConsumeItem f132992z;

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$b */
    public static abstract class IOnPickNotify {
        /* renamed from: a */
        public abstract void mo110050a(String str, SearchBaseInfo searchBaseInfo);

        /* renamed from: a */
        public abstract void mo110051a(List<String> list, List<SearchBaseInfo> list2);

        /* renamed from: b */
        public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$c */
    public interface IViewDependency {
        /* renamed from: b */
        Activity mo110056b();

        /* renamed from: c */
        FragmentManager mo110057c();
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$d */
    public interface OnPickerParamsLoader<P> {
        P onLoadPickerParams();
    }

    /* renamed from: a */
    public abstract SearchContext mo183481a(SearchContext searchContext, P p);

    /* renamed from: a */
    public abstract void mo183487a(List<SearchBaseInfo> list);

    /* renamed from: d */
    public void mo183576d(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
    }

    /* renamed from: e */
    public void mo183499e() {
    }

    /* renamed from: e */
    public boolean mo183578e(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        return false;
    }

    /* renamed from: i */
    public void mo183598i() {
    }

    /* renamed from: m */
    public final PK mo183602m() {
        return this;
    }

    /* renamed from: s */
    public final void mo183607s(boolean z) {
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final List<SearchBaseInfo> mo183625a() {
            return BasePicker.f132956w;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final IViewDependency getMDependency() {
        return this.f132962E;
    }

    public final boolean getMIsMultiple() {
        return this.f132978j;
    }

    public final boolean getMIsSearch() {
        return this.f132979k;
    }

    public final SearchResultView.IOnBusinessConsumeItem getMOnBusinessConsumeItem() {
        return this.f132992z;
    }

    public final List<IOnPickNotify> getMOnPickNotifyList() {
        return this.f132961D;
    }

    public final OnPickerParamsLoader<P> getMOnPickerParamsLoader() {
        return this.f132963F;
    }

    public final PickerUseCategory getMPickerUseCategory() {
        return this.f132965H;
    }

    public final PickerUsePage getMPickerUsePage() {
        return this.f132964G;
    }

    public final PickerReporterDelegate getMReporterDelegate() {
        return this.f132991y;
    }

    public final boolean getMSoftInputInitPopup() {
        return this.f132966I;
    }

    public final String getScene() {
        return this.f132968K;
    }

    /* renamed from: a */
    public void mo183483a() {
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.mo184614a(this.f132978j);
        View view = this.f132983o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedView");
        }
        view.setVisibility((!this.f132978j || !(this.f132988t.isEmpty() ^ true)) ? 8 : 0);
        post(new RunnableC53846e(this));
    }

    /* renamed from: a */
    public final void mo183567a(BaseFragment baseFragment) {
        FragmentManager c;
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        IViewDependency cVar = this.f132962E;
        FragmentTransaction beginTransaction = (cVar == null || (c = cVar.mo110057c()) == null) ? null : c.beginTransaction();
        if (beginTransaction != null) {
            beginTransaction.replace(R.id.picker_default_view_container, baseFragment);
        }
        if (beginTransaction != null) {
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public final List<String> mo183566a(int i) {
        ArrayList arrayList = new ArrayList();
        for (T t : this.f132988t) {
            if (t.getType() == i) {
                arrayList.add(t);
            }
        }
        ArrayList<SearchBaseInfo> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (SearchBaseInfo searchBaseInfo : arrayList2) {
            arrayList3.add(searchBaseInfo.getId());
        }
        return arrayList3;
    }

    /* renamed from: a */
    public final void mo183569a(SearchBaseInfo searchBaseInfo, boolean z) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (this.f132978j) {
            if (z) {
                if (!this.f132988t.contains(searchBaseInfo)) {
                    this.f132988t.add(searchBaseInfo);
                    CommonRecyclerView commonRecyclerView = this.f132973e;
                    if (commonRecyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSelectedRV");
                    }
                    commonRecyclerView.smoothScrollToPosition(this.f132988t.size());
                    List<IOnPickNotify> list = this.f132961D;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            String id = searchBaseInfo.getId();
                            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
                            it.next().mo110050a(id, searchBaseInfo);
                        }
                    }
                } else {
                    return;
                }
            } else if (this.f132988t.contains(searchBaseInfo)) {
                this.f132988t.remove(searchBaseInfo);
                List<IOnPickNotify> list2 = this.f132961D;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String id2 = searchBaseInfo.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id2, "data.id");
                        it2.next().mo110052b(id2, searchBaseInfo);
                    }
                }
            } else {
                return;
            }
            List<IOnPickNotify> list3 = this.f132961D;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    it3.next().mo110051a(getSelectedIds(), this.f132988t);
                }
            }
        } else if (z) {
            List<IOnPickNotify> list4 = this.f132961D;
            if (list4 != null) {
                for (T t : list4) {
                    String id3 = searchBaseInfo.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id3, "data.id");
                    t.mo110050a(id3, searchBaseInfo);
                    t.mo110051a(CollectionsKt.mutableListOf(searchBaseInfo.getId()), CollectionsKt.mutableListOf(searchBaseInfo));
                }
            }
        } else {
            Log.m165383e("LarkSearch.SearchWidget.BasePicker", "single select, deselect is unreasonable!");
        }
        mo183495c();
    }

    /* renamed from: a */
    public final PK mo183564a(PickerReporterDelegate cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "reporterDelegate");
        this.f132991y = cVar;
        return mo183602m();
    }

    /* renamed from: a */
    public final PK mo183565a(SearchResultView.IOnBusinessConsumeItem cVar) {
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.setOnBusinessConsumeItem(cVar);
        this.f132992z = cVar;
        return mo183602m();
    }

    /* renamed from: a */
    public final PK mo183563a(PickerUsePage pickerUsePage) {
        Intrinsics.checkParameterIsNotNull(pickerUsePage, "usePage");
        this.f132964G = pickerUsePage;
        return mo183602m();
    }

    /* renamed from: a */
    public final void mo183568a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f132988t.add(searchBaseInfo);
        mo183495c();
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$i */
    public static final class C53850i implements SearchResultView.IOnLoadMore {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132997a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnLoadMore
        /* renamed from: a */
        public boolean mo182494a() {
            return this.f132997a.f132985q;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnLoadMore
        /* renamed from: b */
        public void mo182495b() {
            this.f132997a.getMSearchInputView().clearFocus();
            this.f132997a.mo183597h();
        }

        C53850i(BasePicker basePicker) {
            this.f132997a = basePicker;
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$f */
    public static final class RunnableC53847f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132994a;

        RunnableC53847f(BasePicker basePicker) {
            this.f132994a = basePicker;
        }

        public final void run() {
            this.f132994a.getMSearchResultView().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$j */
    public static final class C53851j implements SearchResultView.IOnResultScroll {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132998a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnResultScroll
        /* renamed from: a */
        public void mo182496a() {
            this.f132998a.getMSearchInputView().clearFocus();
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnResultScroll
        /* renamed from: a */
        public void mo182497a(int i) {
            SearchResultView.IOnResultScroll.C53967a.m209314a(this, i);
        }

        C53851j(BasePicker basePicker) {
            this.f132998a = basePicker;
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$k */
    public static final class C53852k implements SearchResultView.IOnClickEmptyView {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132999a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnClickEmptyView
        /* renamed from: a */
        public void mo182498a() {
            this.f132999a.getMSearchInputView().clearFocus();
        }

        C53852k(BasePicker basePicker) {
            this.f132999a = basePicker;
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$p */
    public static final class C53859p implements IOnProfileClickListener {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133007a;

        @Override // com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener
        /* renamed from: a */
        public void mo183633a() {
            PickerReporter.f133096a.mo183767b(this.f133007a.getScene());
        }

        C53859p(BasePicker basePicker) {
            this.f133007a = basePicker;
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$r */
    public static final class RunnableC53861r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133009a;

        RunnableC53861r(BasePicker basePicker) {
            this.f133009a = basePicker;
        }

        public final void run() {
            BasePicker.m208422b(this.f133009a).diff(this.f133009a.f132988t);
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$s */
    public static final class RunnableC53862s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133010a;

        RunnableC53862s(BasePicker basePicker) {
            this.f133010a = basePicker;
        }

        public final void run() {
            BasePicker.m208424c(this.f133010a).setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void mo183497d() {
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.mo184620c(this.f132988t);
    }

    public final FrameLayout getMDefaultViewContainer() {
        FrameLayout frameLayout = this.f132982n;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        return frameLayout;
    }

    public final SearchInputView getMSearchInputView() {
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        return searchInputView;
    }

    public final SearchResultView getMSearchResultView() {
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        return searchResultView;
    }

    public final String getQuery() {
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        return searchInputView.getQuery();
    }

    public final List<SearchBaseInfo> getSelectedList() {
        return CollectionsKt.toMutableList((Collection) this.f132988t);
    }

    /* renamed from: j */
    public final void mo183599j() {
        mo183495c();
        mo183497d();
        mo183499e();
    }

    /* renamed from: n */
    public final void mo183603n() {
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        searchInputView.mo184580a();
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$e */
    public static final class RunnableC53846e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132993a;

        RunnableC53846e(BasePicker basePicker) {
            this.f132993a = basePicker;
        }

        public final void run() {
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", this.f132993a.getScene());
            dVar.mo183813a("public_picker_select_view", jSONObject);
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$h */
    public static final class C53849h implements SearchInputView.IOnQueryClear {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132996a;

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnQueryClear
        /* renamed from: a */
        public void mo162384a() {
            this.f132996a.f132986r = "";
            BasePicker.m208421a(this.f132996a, false, 1, null);
            PickerReporterDelegate mReporterDelegate = this.f132996a.getMReporterDelegate();
            if (mReporterDelegate != null) {
                mReporterDelegate.mo132343a();
            }
        }

        C53849h(BasePicker basePicker) {
            this.f132996a = basePicker;
        }
    }

    /* renamed from: f */
    private final void mo183501f() {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", String.valueOf(this.f132988t.size()));
        TextView textView = this.f132975g;
        if (textView != null) {
            textView.setText(mustacheFormat);
        }
    }

    /* renamed from: h */
    public final void mo183597h() {
        this.f132989u = false;
        String a = C53234a.m205877a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
        this.f132986r = a;
        ISearchLifecycleObserver aVar = this.f132958A;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        aVar.mo181872a(a);
    }

    /* renamed from: l */
    public void mo183601l() {
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        searchInputView.mo184583b();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f132967J);
        f132956w.clear();
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$m */
    public static final class C53854m implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133001a;

        /* renamed from: com.ss.android.lark.search.widget.BasePicker$m$a */
        public static final class RunnableC53855a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53854m f133002a;

            RunnableC53855a(C53854m mVar) {
                this.f133002a = mVar;
            }

            public final void run() {
                this.f133002a.f133001a.mo183598i();
                if (this.f133002a.f133001a.f132989u) {
                    this.f133002a.f133001a.getMSearchResultView().mo184612a(this.f133002a.f133001a.f132990v);
                }
            }
        }

        /* renamed from: com.ss.android.lark.search.widget.BasePicker$m$b */
        public static final class RunnableC53856b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53854m f133003a;

            /* renamed from: b */
            final /* synthetic */ SearchResponse f133004b;

            RunnableC53856b(C53854m mVar, SearchResponse searchResponse) {
                this.f133003a = mVar;
                this.f133004b = searchResponse;
            }

            public final void run() {
                SearchResponse searchResponse = this.f133004b;
                String str = null;
                if ((searchResponse != null ? searchResponse.getAbnormalNotice() : null) == SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                    Log.m165397w("LarkSearch.SearchWidget.BasePicker", "request canceled, now: " + BasePicker.m208420a(this.f133003a.f133001a) + " ret: " + this.f133004b.getRequestId());
                    return;
                }
                SearchResponse searchResponse2 = this.f133004b;
                String requestId = searchResponse2 != null ? searchResponse2.getRequestId() : null;
                if (!Intrinsics.areEqual(requestId, BasePicker.m208420a(this.f133003a.f133001a))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("not same request, now: ");
                    sb.append(BasePicker.m208420a(this.f133003a.f133001a));
                    sb.append(" ret: ");
                    SearchResponse searchResponse3 = this.f133004b;
                    if (searchResponse3 != null) {
                        str = searchResponse3.getRequestId();
                    }
                    sb.append(str);
                    Log.m165397w("LarkSearch.SearchWidget.BasePicker", sb.toString());
                    return;
                }
                SearchResponse searchResponse4 = this.f133004b;
                if (!searchResponse4.isEmpty() || !this.f133003a.f133001a.f132989u) {
                    this.f133003a.f133001a.f132985q = searchResponse4.isHasMore();
                    BasePicker basePicker = this.f133003a.f133001a;
                    List<SearchBaseInfo> infoList = searchResponse4.getInfoList();
                    Intrinsics.checkExpressionValueIsNotNull(infoList, "infoList");
                    basePicker.mo183487a(infoList);
                    if (!this.f133003a.f133001a.f132988t.isEmpty()) {
                        List<SearchBaseInfo> infoList2 = searchResponse4.getInfoList();
                        Intrinsics.checkExpressionValueIsNotNull(infoList2, "infoList");
                        for (T t : infoList2) {
                            t.selected(this.f133003a.f133001a.f132988t.contains(t));
                        }
                    }
                    P p = this.f133003a.f133001a.f132987s;
                    if (p != null && (!p.mo183655b().isEmpty())) {
                        List<SearchBaseInfo> infoList3 = searchResponse4.getInfoList();
                        Intrinsics.checkExpressionValueIsNotNull(infoList3, "infoList");
                        for (T t2 : infoList3) {
                            List<String> b = p.mo183655b();
                            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                            t2.required(b.contains(t2.getId()));
                        }
                    }
                    Log.m165389i("LarkSearch.SearchWidget.BasePicker", "request " + BasePicker.m208420a(this.f133003a.f133001a) + " on screen, size: " + searchResponse4.getInfoList().size() + ", " + "hasMore: " + this.f133003a.f133001a.f132985q);
                    if (this.f133003a.f133001a.f132989u) {
                        SearchResultView mSearchResultView = this.f133003a.f133001a.getMSearchResultView();
                        List<SearchBaseInfo> infoList4 = searchResponse4.getInfoList();
                        Intrinsics.checkExpressionValueIsNotNull(infoList4, "infoList");
                        mSearchResultView.mo184617b(infoList4);
                        return;
                    }
                    SearchResultView mSearchResultView2 = this.f133003a.f133001a.getMSearchResultView();
                    List<SearchBaseInfo> infoList5 = searchResponse4.getInfoList();
                    Intrinsics.checkExpressionValueIsNotNull(infoList5, "infoList");
                    mSearchResultView2.mo184613a(infoList5);
                    return;
                }
                Log.m165389i("LarkSearch.SearchWidget.BasePicker", "request " + BasePicker.m208420a(this.f133003a.f133001a) + " is empty!");
                BasePicker basePicker2 = this.f133003a.f133001a;
                String query = searchResponse4.getQuery();
                Intrinsics.checkExpressionValueIsNotNull(query, SearchIntents.EXTRA_QUERY);
                if (!basePicker2.mo183578e(query)) {
                    SearchResultView mSearchResultView3 = this.f133003a.f133001a.getMSearchResultView();
                    String query2 = searchResponse4.getQuery();
                    Intrinsics.checkExpressionValueIsNotNull(query2, SearchIntents.EXTRA_QUERY);
                    mSearchResultView3.mo184612a(query2);
                }
            }
        }

        C53854m(BasePicker basePicker) {
            this.f133001a = basePicker;
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            UICallbackExecutor.execute(new RunnableC53856b(this, searchResponse));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC53855a(this));
        }
    }

    public final List<String> getSelectedIds() {
        List<SearchBaseInfo> list = this.f132988t;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getId());
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void mo183495c() {
        mo183501f();
        if (!this.f132988t.isEmpty()) {
            View view = this.f132983o;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedView");
            }
            if (view.getVisibility() == 8) {
                View view2 = this.f132983o;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSelectedView");
                }
                view2.setVisibility(0);
                post(new RunnableC53861r(this));
                return;
            }
            C53873a aVar = this.f132984p;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedAdapter");
            }
            aVar.diff(this.f132988t);
            return;
        }
        View view3 = this.f132983o;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedView");
        }
        if (view3.getVisibility() == 0) {
            C53873a aVar2 = this.f132984p;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedAdapter");
            }
            aVar2.diff(this.f132988t);
            post(new RunnableC53862s(this));
        }
    }

    /* renamed from: k */
    public final void mo183600k() {
        this.f132979k = true;
        if (this.f132959B) {
            FrameLayout frameLayout = this.f132970b;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchCenterContainer");
            }
            frameLayout.setVisibility(8);
        }
        if (this.f132960C) {
            View view = this.f132971c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchTopContainer");
            }
            view.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.f132982n;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        frameLayout2.setVisibility(8);
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.setVisibility(0);
        SearchResultView searchResultView2 = this.f132981m;
        if (searchResultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView2.mo184609a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.search.widget.BasePicker$q */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC53860q implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133008a;

        ViewTreeObserver$OnGlobalLayoutListenerC53860q(BasePicker basePicker) {
            this.f133008a = basePicker;
        }

        public final void onGlobalLayout() {
            Log.m165379d("LarkSearch.SearchWidget.BasePicker", "onGlobalLayout");
            if (!BasePicker.f132957x.mo183625a().isEmpty()) {
                Log.m165389i("LarkSearch.SearchWidget.BasePicker", "removed data, deal with!!! size: " + BasePicker.f132957x.mo183625a().size());
                this.f133008a.f132988t.removeAll(BasePicker.f132957x.mo183625a());
                List<IOnPickNotify> mOnPickNotifyList = this.f133008a.getMOnPickNotifyList();
                if (mOnPickNotifyList != null) {
                    for (T t : mOnPickNotifyList) {
                        for (T t2 : BasePicker.f132957x.mo183625a()) {
                            String id = t2.getId();
                            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
                            t.mo110052b(id, t2);
                            PickerReporter.f133096a.mo183766a(this.f133008a.getScene());
                        }
                        t.mo110051a(this.f133008a.getSelectedIds(), this.f133008a.f132988t);
                    }
                }
                BasePicker.f132957x.mo183625a().clear();
                this.f133008a.mo183599j();
            }
        }
    }

    /* renamed from: b */
    private final void mo183493b() {
        View findViewById = findViewById(R.id.picker_search_input);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.picker_search_input)");
        this.f132980l = (SearchInputView) findViewById;
        View findViewById2 = findViewById(R.id.picker_center_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.picker_center_container)");
        this.f132970b = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.picker_top_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.picker_top_container)");
        this.f132971c = findViewById3;
        View findViewById4 = findViewById(R.id.picker_top_container_fl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.picker_top_container_fl)");
        this.f132972d = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.picker_search_result);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.picker_search_result)");
        this.f132981m = (SearchResultView) findViewById5;
        View findViewById6 = findViewById(R.id.picker_default_view_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.picker_default_view_container)");
        this.f132982n = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(R.id.picker_selected_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.picker_selected_view)");
        this.f132983o = findViewById7;
        View findViewById8 = findViewById(R.id.picker_selected_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.picker_selected_rv)");
        this.f132973e = (CommonRecyclerView) findViewById8;
        View findViewById9 = findViewById(R.id.picker_selected_more);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.picker_selected_more)");
        this.f132974f = findViewById9;
        this.f132975g = (TextView) findViewById(R.id.selected_count);
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        searchInputView.setOnSearch(new C53848g(this));
        searchInputView.setOnQueryClear(new C53849h(this));
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.mo184622e();
        C53850i iVar = new C53850i(this);
        this.f132977i = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnLoadMore");
        }
        searchResultView.setOnLoadMore(iVar);
        searchResultView.setOnResultScroll(new C53851j(this));
        searchResultView.setOnClickEmptyView(new C53852k(this));
        searchResultView.setClickHandler(new C53853l(this));
        this.f132976h = new C53854m(this);
        this.f132984p = new C53873a(this.f132969a);
        CommonRecyclerView commonRecyclerView = this.f132973e;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedRV");
        }
        C53873a aVar = this.f132984p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedAdapter");
        }
        commonRecyclerView.setAdapter(aVar);
        CommonRecyclerView commonRecyclerView2 = this.f132973e;
        if (commonRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedRV");
        }
        commonRecyclerView2.setLayoutManager(new LinearLayoutManager(this.f132969a, DesktopUtil.m144307b() ? 1 : 0, false));
        CommonRecyclerView commonRecyclerView3 = this.f132973e;
        if (commonRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedRV");
        }
        RecyclerView.ItemAnimator itemAnimator = commonRecyclerView3.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        C53873a aVar2 = this.f132984p;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedAdapter");
        }
        aVar2.mo183782a(new C53857n(this));
        View view = this.f132974f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedMore");
        }
        view.setOnClickListener(new View$OnClickListenerC53858o(this));
        SearchResultView searchResultView2 = this.f132981m;
        if (searchResultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView2.setProfileClickListener(new C53859p(this));
    }

    public final void setMDependency(IViewDependency cVar) {
        this.f132962E = cVar;
    }

    public final void setMIsMultiple(boolean z) {
        this.f132978j = z;
    }

    public final void setMIsSearch(boolean z) {
        this.f132979k = z;
    }

    public final void setMOnBusinessConsumeItem(SearchResultView.IOnBusinessConsumeItem cVar) {
        this.f132992z = cVar;
    }

    public final void setMOnPickNotifyList(List<IOnPickNotify> list) {
        this.f132961D = list;
    }

    public final void setMOnPickerParamsLoader(OnPickerParamsLoader<P> dVar) {
        this.f132963F = dVar;
    }

    public final void setMReporterDelegate(PickerReporterDelegate cVar) {
        this.f132991y = cVar;
    }

    public final void setMSoftInputInitPopup(boolean z) {
        this.f132966I = z;
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$g */
    public static final class C53848g implements SearchInputView.IOnSearch {

        /* renamed from: a */
        final /* synthetic */ BasePicker f132995a;

        C53848g(BasePicker basePicker) {
            this.f132995a = basePicker;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnSearch
        /* renamed from: a */
        public void mo162383a(String str) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            this.f132995a.mo183574c(str);
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "search_bar");
            jSONObject.put("target", "public_picker_select_search_member_view");
            jSONObject.put("scene", this.f132995a.getScene());
            dVar.mo183813a("public_picker_select_click", jSONObject);
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$l */
    public static final class C53853l implements SearchResultViewAdapter.IOnItemClickHandler {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133000a;

        C53853l(BasePicker basePicker) {
            this.f133000a = basePicker;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
        /* renamed from: a */
        public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("click", "select");
                jSONObject.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183770a(searchBaseInfo));
                jSONObject.put("list_number", i + 1);
            } else {
                jSONObject.put("click", "remove");
            }
            jSONObject.put("target", "public_picker_select_search_member_view");
            dVar.mo183813a("public_picker_select_search_member_click", jSONObject);
            this.f133000a.mo183569a(searchBaseInfo, z);
            BasePicker.m208421a(this.f133000a, false, 1, null);
        }
    }

    /* renamed from: p */
    public final PK mo183604p(boolean z) {
        this.f132978j = z;
        return mo183602m();
    }

    public final void setMDefaultViewContainer(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "<set-?>");
        this.f132982n = frameLayout;
    }

    public final void setMPickerUseCategory(PickerUseCategory pickerUseCategory) {
        Intrinsics.checkParameterIsNotNull(pickerUseCategory, "<set-?>");
        this.f132965H = pickerUseCategory;
    }

    public final void setMPickerUsePage(PickerUsePage pickerUsePage) {
        Intrinsics.checkParameterIsNotNull(pickerUsePage, "<set-?>");
        this.f132964G = pickerUsePage;
    }

    public final void setMSearchInputView(SearchInputView searchInputView) {
        Intrinsics.checkParameterIsNotNull(searchInputView, "<set-?>");
        this.f132980l = searchInputView;
    }

    public final void setMSearchResultView(SearchResultView searchResultView) {
        Intrinsics.checkParameterIsNotNull(searchResultView, "<set-?>");
        this.f132981m = searchResultView;
    }

    public final void setScene(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f132968K = str;
    }

    /* renamed from: t */
    public final PK mo183624t(boolean z) {
        this.f132966I = z;
        return mo183602m();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BasePicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final SearchContext mo183485a(String str) {
        SearchContext searchContext = new SearchContext();
        searchContext.mo184394a(str);
        mo183481a(searchContext, this.f132987s);
        return searchContext;
    }

    /* renamed from: b */
    public static final /* synthetic */ C53873a m208422b(BasePicker basePicker) {
        C53873a aVar = basePicker.f132984p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedAdapter");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m208424c(BasePicker basePicker) {
        View view = basePicker.f132983o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedView");
        }
        return view;
    }

    /* renamed from: f */
    public final PK mo183579f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
        this.f132968K = str;
        return this;
    }

    /* renamed from: r */
    public final void mo183606r(boolean z) {
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.mo184618b(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m208420a(BasePicker basePicker) {
        String str = basePicker.f132986r;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        return str;
    }

    /* renamed from: b */
    public final PK mo183570b(int i) {
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        searchInputView.setHint(i);
        return mo183602m();
    }

    public final void setCustomBinder(ICustomBinder nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "customBinder");
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.setCustomBinder(nVar);
    }

    public final void setHeadCustomView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "customView");
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.setHeadCustomView(view);
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$o */
    public static final class View$OnClickListenerC53858o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133006a;

        View$OnClickListenerC53858o(BasePicker basePicker) {
            this.f133006a = basePicker;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f133006a.getContext(), SelectedMoreActivity.class);
            Object[] array = this.f133006a.f132988t.toArray(new SearchBaseInfo[0]);
            if (array != null) {
                intent.putExtra("selected.data", (Serializable) array);
                Context context = this.f133006a.getContext();
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    activity.startActivityForResult(intent, 1);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: b */
    public final PK mo183571b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "topView");
        this.f132960C = true;
        View view2 = this.f132971c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchTopContainer");
        }
        view2.setVisibility(0);
        FrameLayout frameLayout = this.f132972d;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchTopContainerFl");
        }
        frameLayout.addView(view);
        return this;
    }

    /* renamed from: c */
    public final void mo183574c(String str) {
        P p;
        this.f132989u = true;
        this.f132990v = str;
        mo183600k();
        String a = C53234a.m205877a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
        this.f132986r = a;
        OnPickerParamsLoader<P> dVar = this.f132963F;
        if (dVar != null) {
            p = dVar.onLoadPickerParams();
        } else {
            p = null;
        }
        this.f132987s = p;
        ISearchLifecycleObserver aVar = this.f132958A;
        String str2 = this.f132986r;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        SearchContext a2 = mo183485a(str);
        IGetDataCallback<SearchResponse> iGetDataCallback = this.f132976h;
        if (iGetDataCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallback");
        }
        aVar.mo181873a(str2, a2, iGetDataCallback);
        mo183576d(str);
    }

    /* renamed from: d */
    public final void mo183577d(List<? extends SearchBaseInfo> list) {
        if (list != null) {
            for (T t : list) {
                if (!this.f132988t.contains(t)) {
                    this.f132988t.add(t);
                }
            }
            mo183599j();
        }
    }

    /* renamed from: com.ss.android.lark.search.widget.BasePicker$n */
    public static final class C53857n implements C53873a.AbstractC53875a {

        /* renamed from: a */
        final /* synthetic */ BasePicker f133005a;

        C53857n(BasePicker basePicker) {
            this.f133005a = basePicker;
        }

        @Override // com.ss.android.lark.search.widget.selectedview.C53873a.AbstractC53875a
        /* renamed from: a */
        public final void mo183631a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "item");
            if (this.f133005a.f132988t.contains(searchBaseInfo)) {
                this.f133005a.f132988t.remove(searchBaseInfo);
                List<IOnPickNotify> mOnPickNotifyList = this.f133005a.getMOnPickNotifyList();
                if (mOnPickNotifyList != null) {
                    Iterator<T> it = mOnPickNotifyList.iterator();
                    while (it.hasNext()) {
                        String id = searchBaseInfo.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "item.id");
                        it.next().mo110052b(id, searchBaseInfo);
                        PickerReporter.f133096a.mo183766a(this.f133005a.getScene());
                    }
                }
            }
            List<IOnPickNotify> mOnPickNotifyList2 = this.f133005a.getMOnPickNotifyList();
            if (mOnPickNotifyList2 != null) {
                Iterator<T> it2 = mOnPickNotifyList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo110051a(this.f133005a.getSelectedIds(), this.f133005a.f132988t);
                }
            }
            this.f133005a.mo183599j();
        }
    }

    /* renamed from: a */
    public final PK mo183558a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "centerView");
        this.f132959B = true;
        FrameLayout frameLayout = this.f132970b;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchCenterContainer");
        }
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f132970b;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchCenterContainer");
        }
        frameLayout2.addView(view);
        return this;
    }

    /* renamed from: b */
    public final void mo183572b(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f132988t.remove(searchBaseInfo);
        mo183495c();
    }

    /* renamed from: g */
    public void mo183503g(boolean z) {
        int i;
        if (!this.f132978j || !(!this.f132988t.isEmpty())) {
            this.f132978j = z;
            SearchResultView searchResultView = this.f132981m;
            if (searchResultView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
            }
            searchResultView.mo184614a(this.f132978j);
            View view = this.f132983o;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedView");
            }
            if (!this.f132978j || !(!this.f132988t.isEmpty())) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            return;
        }
        Log.m165383e("LarkSearch.SearchWidget.BasePicker", "not support this action!!!");
    }

    /* renamed from: q */
    public final void mo183605q(boolean z) {
        this.f132979k = false;
        if (this.f132959B) {
            FrameLayout frameLayout = this.f132970b;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchCenterContainer");
            }
            frameLayout.setVisibility(0);
        }
        if (this.f132960C) {
            View view = this.f132971c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchTopContainer");
            }
            view.setVisibility(0);
        }
        FrameLayout frameLayout2 = this.f132982n;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        frameLayout2.setVisibility(0);
        SearchResultView searchResultView = this.f132981m;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.mo184621d();
        post(new RunnableC53847f(this));
        mo183499e();
        SearchInputView searchInputView = this.f132980l;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        searchInputView.mo184582a(z);
    }

    /* renamed from: a */
    public final PK mo183559a(IOnPickNotify bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onPickNotify");
        if (this.f132961D == null) {
            this.f132961D = new ArrayList();
        }
        List<IOnPickNotify> list = this.f132961D;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (!list.contains(bVar)) {
            List<IOnPickNotify> list2 = this.f132961D;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.add(bVar);
        }
        return mo183602m();
    }

    /* renamed from: b */
    public final void mo183573b(List<? extends SearchBaseInfo> list) {
        this.f132988t.clear();
        if (list != null) {
            List<? extends SearchBaseInfo> list2 = list;
            if (!list2.isEmpty()) {
                this.f132988t.addAll(list2);
            }
        }
        mo183599j();
    }

    /* renamed from: c */
    public final void mo183575c(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "removeData");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f132988t.remove(it.next());
        }
        mo183599j();
    }

    /* renamed from: a */
    public final PK mo183560a(IViewDependency cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dependency");
        this.f132962E = cVar;
        return mo183602m();
    }

    /* renamed from: a */
    public final PK mo183561a(OnPickerParamsLoader<P> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "onPickerParamsLoader");
        this.f132963F = dVar;
        return mo183602m();
    }

    /* renamed from: a */
    public final PK mo183562a(PickerUseCategory pickerUseCategory) {
        Intrinsics.checkParameterIsNotNull(pickerUseCategory, "useCategory");
        this.f132965H = pickerUseCategory;
        return mo183602m();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f132988t = new ArrayList();
        this.f132989u = true;
        this.f132990v = "";
        this.f132964G = PickerUsePage.UNKNOWN;
        this.f132965H = PickerUseCategory.UNKNOWN;
        ViewTreeObserver$OnGlobalLayoutListenerC53860q qVar = new ViewTreeObserver$OnGlobalLayoutListenerC53860q(this);
        this.f132967J = qVar;
        this.f132968K = "others";
        Log.m165379d("LarkSearch.SearchWidget.BasePicker", "constructor, BasePicker.");
        this.f132969a = context;
        LayoutInflater from = LayoutInflater.from(context);
        if (DesktopUtil.m144307b()) {
            i = R.layout.view_picker_desktop;
        } else {
            i = R.layout.view_picker;
        }
        from.inflate(i, (ViewGroup) this, true);
        mo183493b();
        this.f132958A = SearchWidgetModuleDependency.m208511a().mo102925a();
        getViewTreeObserver().addOnGlobalLayoutListener(qVar);
        f132956w.clear();
    }

    /* renamed from: a */
    public static /* synthetic */ void m208421a(BasePicker basePicker, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            basePicker.mo183605q(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultMode");
    }
}
