package com.ss.android.lark.search.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.search.widget.params.ChatPickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporter;
import com.ss.android.lark.search.widget.reporter.PickerReporterConstants;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller;
import com.ss.android.lark.searchcommon.reporter.SafeReporter;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener;
import com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nJ\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/search/widget/ChatPicker;", "Lcom/ss/android/lark/search/widget/BasePicker;", "Lcom/ss/android/lark/search/widget/params/ChatPickerParams;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDataPuller", "Lcom/ss/android/lark/searchcommon/recommend/IRecommendPageDataPuller;", "mIsLightStyle", "", "mRecommendView", "Lcom/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView;", "attachChatCountStyle", "isLightStyle", "attachComplete", "", "attachDataPuller", "dataPuller", "initDefaultRecommendView", "onBackPressed", "onSearchSuccess", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "refreshDefault", "switchMultipleStatus", "isMultiple", "transformByPickerParams", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "searchContext", "pickerParams", "Companion", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatPicker extends BasePicker<ChatPickerParams, ChatPicker> {

    /* renamed from: a */
    public static final Companion f133017a = new Companion(null);

    /* renamed from: b */
    private final DefaultRecommendView f133018b;

    /* renamed from: c */
    private IRecommendPageDataPuller f133019c;

    /* renamed from: d */
    private boolean f133020d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/widget/ChatPicker$Companion;", "", "()V", "TAG", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.ChatPicker$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/widget/ChatPicker$initDefaultRecommendView$1$1", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "onProfileClick", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.ChatPicker$b */
    public static final class C53865b implements IOnProfileClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatPicker f133021a;

        @Override // com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener
        /* renamed from: a */
        public void mo183633a() {
            PickerReporter.f133096a.mo183767b(this.f133021a.getScene());
        }

        C53865b(ChatPicker chatPicker) {
            this.f133021a = chatPicker;
        }
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: e */
    public void mo183499e() {
        this.f133018b.mo185000d(getSelectedList());
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: a */
    public void mo183483a() {
        super.mo183483a();
        m208494b();
        mo183605q(getMSoftInputInitPopup());
    }

    /* renamed from: b */
    private final void m208494b() {
        DefaultRecommendView defaultRecommendView = this.f133018b;
        if (defaultRecommendView.getParent() == null) {
            defaultRecommendView.mo184997c();
            getMDefaultViewContainer().addView(defaultRecommendView);
            defaultRecommendView.setDataPuller(this.f133019c);
            defaultRecommendView.mo184993a(getMIsMultiple());
            defaultRecommendView.setOnBusinessConsumeItem(getMOnBusinessConsumeItem());
            defaultRecommendView.setProfileClickListener(new C53865b(this));
            defaultRecommendView.setClickHandler(new C53866c(this));
            defaultRecommendView.mo184991a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/widget/ChatPicker$initDefaultRecommendView$1$2", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.ChatPicker$c */
    public static final class C53866c implements SearchResultViewAdapter.IOnItemClickHandler {

        /* renamed from: a */
        final /* synthetic */ ChatPicker f133022a;

        C53866c(ChatPicker chatPicker) {
            this.f133022a = chatPicker;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
        /* renamed from: a */
        public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (z) {
                SafeReporter dVar = SafeReporter.f133151a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("click", "select");
                jSONObject.put("target", "public_picker_select_view");
                jSONObject.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183770a(searchBaseInfo));
                jSONObject.put("list_number", i + 1);
                jSONObject.put("scene", this.f133022a.getScene());
                dVar.mo183813a("public_picker_select_click", jSONObject);
            } else {
                PickerReporter.f133096a.mo183766a(this.f133022a.getScene());
            }
            this.f133022a.mo183569a(searchBaseInfo, z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatPicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final ChatPicker mo183641a(IRecommendPageDataPuller aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dataPuller");
        this.f133019c = aVar;
        return (ChatPicker) mo183602m();
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: g */
    public void mo183503g(boolean z) {
        if (z != getMIsMultiple()) {
            mo183573b((List<? extends SearchBaseInfo>) null);
        }
        super.mo183503g(z);
        this.f133018b.mo184993a(z);
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: a */
    public void mo183487a(List<SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        for (T t : list) {
            if (t instanceof SearchChatterInfo) {
                T t2 = t;
                t2.customer(Intrinsics.areEqual("0", t2.getTenantId()));
                t2.zenMode(SearchWidgetModuleDependency.m208511a().mo102928a(t2.getZenModeEndTime()));
            } else if (t instanceof SearchChatInfo) {
                t.setCountLightStyle(this.f133020d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        DefaultRecommendView defaultRecommendView = new DefaultRecommendView(context2);
        defaultRecommendView.mo185001e();
        this.f133018b = defaultRecommendView;
    }

    /* renamed from: a */
    public SearchContext mo183481a(SearchContext searchContext, ChatPickerParams cVar) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(searchContext, "searchContext");
        searchContext.mo184391a(Scene.Type.TRANSMIT_MESSAGES);
        boolean z4 = false;
        if (cVar != null) {
            z = cVar.mo183683c();
        } else {
            z = false;
        }
        searchContext.mo184407c(z);
        boolean z5 = true;
        if (cVar != null) {
            z2 = cVar.mo183685d();
        } else {
            z2 = true;
        }
        searchContext.mo184396a(z2);
        searchContext.mo184444t().clear();
        List<ChatFilterParam.ChatMode> t = searchContext.mo184444t();
        if (cVar == null || (arrayList = cVar.mo183687e()) == null) {
            arrayList = new ArrayList();
        }
        t.addAll(arrayList);
        if (cVar != null) {
            z3 = cVar.mo183688f();
        } else {
            z3 = true;
        }
        searchContext.mo184438q(z3);
        if (cVar != null) {
            z5 = cVar.mo183689g();
        }
        searchContext.mo184440r(z5);
        if (cVar != null) {
            z4 = cVar.mo183690h();
        }
        searchContext.mo184442s(z4);
        return searchContext;
    }
}
