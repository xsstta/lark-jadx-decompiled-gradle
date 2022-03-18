package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.p943f.p944a.AbstractC20966c;
import com.p943f.p944a.AbstractC20975h;
import com.p943f.p944a.AbstractC20979j;
import com.p943f.p944a.C20967d;
import com.p943f.p944a.C20972g;
import com.p943f.p944a.C20981l;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.general.feedfilter.callback.TranslationZDragCallback;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedTabInfoList;
import com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedMessageFilterHeaderItem;
import com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedMessageFilterItemDecoration;
import com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem;
import com.ss.android.lark.setting.page.statistics.SettingHitPointNew;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010/\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0)H\u0002J\u0016\u00100\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0)H\u0002J\b\u00101\u001a\u00020\u000bH\u0002J\u0006\u00102\u001a\u00020\rJ\f\u00103\u001a\b\u0012\u0004\u0012\u0002040)J\b\u00105\u001a\u00020\u0001H\u0016J\u000e\u00106\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$J\u000e\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u000fJ\u001c\u00109\u001a\u00020\u001a2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\"\u0010;\u001a\u00020\u001a2\u001a\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cJ\u0018\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u000b2\b\b\u0002\u0010>\u001a\u00020\rJ\b\u0010?\u001a\u00020\u001aH\u0002J\f\u0010@\u001a\u00020\r*\u00020AH\u0002J\f\u0010B\u001a\u00020\u001a*\u00020\"H\u0002J\u001a\u0010C\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020'0)*\b\u0012\u0004\u0012\u00020E0DH\u0002J\"\u0010I\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R<\u0010%\u001a&\u0012\f\u0012\n (*\u0004\u0018\u00010'0' (*\u0012\u0012\f\u0012\n (*\u0004\u0018\u00010'0'\u0018\u00010)0&*\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020'*\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006M"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter;", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/callback/RoundableLayoutContainer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editorTabInfoList", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfoList;", "hasHighlighted", "", "highlightedFilter", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilter;", "isInitialized", "moreFiltersItemsSection", "Lcom/xwray/groupie/Section;", "myFiltersItemsSection", "getMyFiltersItemsSection", "()Lcom/xwray/groupie/Section;", "setMyFiltersItemsSection", "(Lcom/xwray/groupie/Section;)V", "onEditCanceled", "Lkotlin/Function1;", "", "onEditFinished", "Lkotlin/Function2;", "onMainTabMaxReached", "Lkotlin/Function0;", "onMainTabMinReached", "previewHeight", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "switchButton", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "children", "", "Lcom/xwray/groupie/Group;", "kotlin.jvm.PlatformType", "", "getChildren", "(Lcom/xwray/groupie/Section;)Ljava/util/List;", "header", "getHeader", "(Lcom/xwray/groupie/Section;)Lcom/xwray/groupie/Group;", "buildMoreFiltersItemsSection", "buildMyFiltersItemsSection", "collectResults", "feedListInitialized", "getMyFiltersSelections", "", "provide", "setCorrespondingSwitchButton", "setHighlightFilter", "feedFilter", "setOnEditCanceledListener", "action", "setOnEditFinishedListener", "setupTabs", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "showHighlight", "updateSwitchButtonStatus", "hasHighlight", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfo;", "initialize", "moveItemToTheEndOfAnotherGroup", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "item", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem;", "retrieveAllGroups", "update", "mainTabItemsSection", "navTabItemsSection", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedTypeFilter extends LKUIRoundableLayout {

    /* renamed from: h */
    public static final Companion f134696h = new Companion(null);

    /* renamed from: c */
    public final Function0<Unit> f134697c;

    /* renamed from: d */
    public final Function0<Unit> f134698d;

    /* renamed from: e */
    public FeedTabInfoList f134699e;

    /* renamed from: f */
    public C20981l f134700f;

    /* renamed from: g */
    public boolean f134701g;

    /* renamed from: i */
    private final int f134702i;

    /* renamed from: j */
    private RecyclerView f134703j;

    /* renamed from: k */
    private UDSwitch f134704k;

    /* renamed from: l */
    private FeedFilter f134705l;

    /* renamed from: m */
    private Function2<? super FeedTypeFilter, ? super FeedTabInfoList, Unit> f134706m;

    /* renamed from: n */
    private Function1<? super FeedTypeFilter, Unit> f134707n;

    /* renamed from: o */
    private C20981l f134708o;

    /* renamed from: p */
    private boolean f134709p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$b */
    static final class View$OnClickListenerC54481b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC54481b f134711a = new View$OnClickListenerC54481b();

        View$OnClickListenerC54481b() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$h */
    static final class C54487h extends Lambda implements Function0<Unit> {
        public static final C54487h INSTANCE = new C54487h();

        C54487h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$i */
    static final class C54488i extends Lambda implements Function0<Unit> {
        public static final C54488i INSTANCE = new C54488i();

        C54488i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    public FeedTypeFilter(Context context) {
        this(context, null, 0, 6, null);
    }

    public FeedTypeFilter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\b\u001a\u00020\u0004*\u00020\u0004J&\u0010\t\u001a\u00020\n*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bJ&\u0010\u0010\u001a\u00020\u0011*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bJ&\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bJ&\u0010\u0014\u001a\u00020\u0015*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bJ&\u0010\u0016\u001a\u00020\u0017*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter$Companion;", "", "()V", "MAIN_TAB_MAX_COUNT", "", "MAIN_TAB_MIN_COUNT", "TAG", "", "dp", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/ViewGroup;", "initializer", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "linearLayout", "Landroid/widget/LinearLayout;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "space", "Landroid/widget/Space;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo186220a(int i) {
            return C57582a.m223600a(i);
        }
    }

    /* renamed from: b */
    public final boolean mo186210b() {
        return this.f134709p;
    }

    /* renamed from: a */
    public final void mo186206a(FeedTabInfoList dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f134699e = dVar;
        C54489j jVar = new C54489j(this, z);
        List<FeedTabInfo> a = dVar.mo186326a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(jVar.invoke((Object) it.next()));
        }
        ArrayList<FeedTabItem> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (FeedTabItem cVar : arrayList2) {
            arrayList3.add(cVar.mo186248f());
        }
        this.f134700f = mo186203a(arrayList3);
        List<FeedTabInfo> b = dVar.mo186327b();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it2 = b.iterator();
        while (it2.hasNext()) {
            arrayList4.add(jVar.invoke((Object) it2.next()));
        }
        this.f134708o = mo186208b(arrayList4);
        if (this.f134709p) {
            RecyclerView recyclerView = this.f134703j;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C20967d)) {
                adapter = null;
            }
            C20967d<C20972g> dVar2 = (C20967d) adapter;
            if (dVar2 != null) {
                C20981l lVar = this.f134700f;
                if (lVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("myFiltersItemsSection");
                }
                C20981l lVar2 = this.f134708o;
                if (lVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moreFiltersItemsSection");
                }
                mo186204a(dVar2, lVar, lVar2);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f134703j;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        m211405a(recyclerView2);
    }

    /* renamed from: a */
    public final boolean mo186207a(FeedTabInfo cVar) {
        return Intrinsics.areEqual(cVar.mo186317a(), String.valueOf(this.f134705l.getValue()));
    }

    /* renamed from: a */
    public final void mo186205a(C20967d<C20972g> dVar, FeedTabItem cVar) {
        try {
            AbstractC20966c b = dVar.mo71022b((AbstractC20975h) cVar);
            if (b != null) {
                C20981l lVar = (C20981l) b;
                int a = dVar.mo71009a(lVar);
                C20981l lVar2 = lVar;
                AbstractC20966c b2 = dVar.mo71021b(((a + mo186209b(lVar2).size()) + 1) % dVar.getItemCount());
                if (b2 != null) {
                    C20981l lVar3 = (C20981l) b2;
                    List<AbstractC20966c> b3 = mo186209b(lVar2);
                    CollectionsKt.removeAll((List) b3, (Function1) new C54486g(cVar));
                    List<AbstractC20966c> b4 = mo186209b(lVar3);
                    b4.add(cVar.mo186248f());
                    C20981l lVar4 = this.f134700f;
                    if (lVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("myFiltersItemsSection");
                    }
                    List<AbstractC20966c> list = Intrinsics.areEqual(lVar3, lVar4) ? b4 : b3;
                    C20981l lVar5 = this.f134700f;
                    if (lVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("myFiltersItemsSection");
                    }
                    if (!Intrinsics.areEqual(lVar3, lVar5)) {
                        b3 = b4;
                    }
                    if (list.size() > 99) {
                        this.f134697c.invoke();
                    } else if (list.size() < 0) {
                        this.f134698d.invoke();
                    } else {
                        Intrinsics.checkExpressionValueIsNotNull(list, "mainTabSection");
                        C20981l a2 = mo186203a(list);
                        Intrinsics.checkExpressionValueIsNotNull(b3, "navTabSection");
                        mo186204a(dVar, a2, mo186208b(b3));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
            }
        } catch (IndexOutOfBoundsException e) {
            Log.m165383e("FeedMessageFilterView", "moveItemToTheEndOfAnotherGroup failed: " + cVar + ", " + e.getMessage());
        }
    }

    public final C20981l getMyFiltersItemsSection() {
        C20981l lVar = this.f134700f;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myFiltersItemsSection");
        }
        return lVar;
    }

    public final List<String> getMyFiltersSelections() {
        List<FeedTabInfo> a = m211407c().mo186326a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo186317a());
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter$initialize$itemTouchHelper$1", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/callback/TranslationZDragCallback;", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "", "target", "onSelectedChanged", "actionState", "", "onSwiped", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$f */
    public static final class C54484f extends TranslationZDragCallback {

        /* renamed from: a */
        final /* synthetic */ FeedTypeFilter f134714a;

        /* renamed from: b */
        final /* synthetic */ C20967d f134715b;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: a */
        public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$f$a */
        static final class RunnableC54485a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C54484f f134716a;

            /* renamed from: b */
            final /* synthetic */ C20981l f134717b;

            /* renamed from: c */
            final /* synthetic */ FeedTabItem f134718c;

            RunnableC54485a(C54484f fVar, C20981l lVar, FeedTabItem cVar) {
                this.f134716a = fVar;
                this.f134717b = lVar;
                this.f134718c = cVar;
            }

            public final void run() {
                FeedTabItem cVar;
                C20981l lVar = this.f134717b;
                List<AbstractC20966c> b = this.f134716a.f134714a.mo186209b(this.f134717b);
                int indexOf = b.indexOf(this.f134718c);
                if (Intrinsics.areEqual(this.f134716a.f134714a.mo186202a(this.f134717b), this.f134716a.f134714a.mo186202a(this.f134716a.f134714a.getMyFiltersItemsSection()))) {
                    cVar = this.f134718c.mo186245d();
                } else {
                    cVar = this.f134718c.mo186246e();
                }
                b.set(indexOf, cVar);
                lVar.mo71078c(b);
            }
        }

        C54484f(FeedTypeFilter feedTypeFilter, C20967d dVar) {
            this.f134714a = feedTypeFilter;
            this.f134715b = dVar;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: b */
        public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
            super.mo6584b(viewHolder, i);
            if (i == 2 && viewHolder != null) {
                AbstractC20975h a = this.f134715b.mo71012a(viewHolder.getAdapterPosition());
                if (a != null) {
                    ((FeedTabItem) a).mo186241a((FeedTabItem.ViewHolder) viewHolder);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
            }
        }

        @Override // com.ss.android.lark.setting.page.content.general.feedfilter.callback.TranslationZDragCallback, androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: e */
        public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
            super.mo6591e(recyclerView, viewHolder);
            AbstractC20966c b = this.f134715b.mo71021b(viewHolder.getAdapterPosition());
            if (b != null) {
                C20981l lVar = (C20981l) b;
                AbstractC20975h a = this.f134715b.mo71012a(viewHolder.getAdapterPosition());
                if (a != null) {
                    FeedTabItem cVar = (FeedTabItem) a;
                    cVar.mo186244b((FeedTabItem.ViewHolder) viewHolder);
                    if (!cVar.mo186254k()) {
                        recyclerView.postDelayed(new RunnableC54485a(this, lVar, cVar), 200);
                        this.f134714a.mo157511a();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: b */
        public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            int i;
            C20981l lVar;
            int i2;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
            Intrinsics.checkParameterIsNotNull(viewHolder2, "target");
            if (viewHolder2.getAdapterPosition() == 0) {
                return false;
            }
            AbstractC20975h a = this.f134715b.mo71012a(viewHolder.getAdapterPosition());
            Intrinsics.checkExpressionValueIsNotNull(a, "groupAdapter.getItem(viewHolder.adapterPosition)");
            AbstractC20966c b = this.f134715b.mo71022b(a);
            if (b != null) {
                C20981l lVar2 = (C20981l) b;
                int c = lVar2.mo71007c(a);
                AbstractC20975h a2 = this.f134715b.mo71012a(viewHolder2.getAdapterPosition());
                Intrinsics.checkExpressionValueIsNotNull(a2, "groupAdapter.getItem(target.adapterPosition)");
                if (a2 instanceof FeedMessageFilterHeaderItem) {
                    if (viewHolder.getAdapterPosition() > viewHolder2.getAdapterPosition()) {
                        AbstractC20966c b2 = this.f134715b.mo71021b(viewHolder2.getAdapterPosition() - 1);
                        if (b2 != null) {
                            lVar = (C20981l) b2;
                            i2 = this.f134714a.mo186209b(lVar).size();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                        }
                    } else {
                        AbstractC20966c b3 = this.f134715b.mo71021b(viewHolder2.getAdapterPosition());
                        if (b3 != null) {
                            lVar = (C20981l) b3;
                            i2 = lVar.mo71007c(a2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                        }
                    }
                    i = i2 + 1;
                } else if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
                } else if (((FeedTabItem) a2).mo186253j()) {
                    return false;
                } else {
                    AbstractC20966c b4 = this.f134715b.mo71021b(viewHolder2.getAdapterPosition());
                    if (b4 != null) {
                        lVar = (C20981l) b4;
                        i = lVar.mo71007c(a2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                    }
                }
                if (!Intrinsics.areEqual(lVar2, lVar)) {
                    boolean z = a instanceof FeedTabItem;
                    if (z && ((FeedTabItem) a).mo186254k()) {
                        return false;
                    }
                    C20981l lVar3 = lVar;
                    AbstractC20966c a3 = this.f134714a.mo186202a(lVar3);
                    FeedTypeFilter feedTypeFilter = this.f134714a;
                    if (Intrinsics.areEqual(a3, feedTypeFilter.mo186202a(feedTypeFilter.getMyFiltersItemsSection()))) {
                        if (lVar3.mo71008u() >= 100) {
                            this.f134714a.f134697c.invoke();
                            return false;
                        }
                    } else if (lVar2.mo71008u() <= 1) {
                        this.f134714a.f134698d.invoke();
                        return false;
                    } else if (z && ((FeedTabItem) a).mo186255l()) {
                        return false;
                    }
                    List<AbstractC20966c> b5 = this.f134714a.mo186209b(lVar2);
                    b5.remove(a);
                    List<AbstractC20966c> b6 = this.f134714a.mo186209b(lVar3);
                    b6.add(i - 1, a);
                    AbstractC20966c a4 = this.f134714a.mo186202a(lVar2);
                    FeedTypeFilter feedTypeFilter2 = this.f134714a;
                    if (Intrinsics.areEqual(a4, feedTypeFilter2.mo186202a(feedTypeFilter2.getMyFiltersItemsSection()))) {
                        FeedTypeFilter feedTypeFilter3 = this.f134714a;
                        C20967d<C20972g> dVar = this.f134715b;
                        Intrinsics.checkExpressionValueIsNotNull(b5, "newSourceItemGroupChildren");
                        C20981l a5 = feedTypeFilter3.mo186203a(b5);
                        FeedTypeFilter feedTypeFilter4 = this.f134714a;
                        Intrinsics.checkExpressionValueIsNotNull(b6, "newTargetItemGroupChildren");
                        feedTypeFilter3.mo186204a(dVar, a5, feedTypeFilter4.mo186208b(b6));
                    } else {
                        FeedTypeFilter feedTypeFilter5 = this.f134714a;
                        C20967d<C20972g> dVar2 = this.f134715b;
                        Intrinsics.checkExpressionValueIsNotNull(b6, "newTargetItemGroupChildren");
                        C20981l a6 = feedTypeFilter5.mo186203a(b6);
                        FeedTypeFilter feedTypeFilter6 = this.f134714a;
                        Intrinsics.checkExpressionValueIsNotNull(b5, "newSourceItemGroupChildren");
                        feedTypeFilter5.mo186204a(dVar2, a6, feedTypeFilter6.mo186208b(b5));
                    }
                } else if (c == i) {
                    return false;
                } else {
                    C20981l lVar4 = lVar;
                    List<AbstractC20966c> b7 = this.f134714a.mo186209b(lVar4);
                    b7.add(i - 1, b7.remove(c - 1));
                    lVar4.mo71078c(b7);
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }
    }

    /* renamed from: c */
    private final FeedTabInfoList m211407c() {
        RecyclerView recyclerView = this.f134703j;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        if (adapter != null) {
            List<AbstractC20966c> a = m211404a((C20967d) adapter);
            C54482d dVar = C54482d.INSTANCE;
            AbstractC20966c cVar = a.get(0);
            if (cVar != null) {
                List<AbstractC20966c> b = mo186209b((C20981l) cVar);
                Intrinsics.checkExpressionValueIsNotNull(b, "(allGroups[0] as Section).children");
                List<AbstractC20966c> list = b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (T t : list) {
                    if (t != null) {
                        arrayList.add(t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
                    }
                }
                ArrayList<Object> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (Object obj : arrayList2) {
                    arrayList3.add(dVar.invoke(obj));
                }
                ArrayList arrayList4 = arrayList3;
                AbstractC20966c cVar2 = a.get(1);
                if (cVar2 != null) {
                    List<AbstractC20966c> b2 = mo186209b((C20981l) cVar2);
                    Intrinsics.checkExpressionValueIsNotNull(b2, "(allGroups[1] as Section).children");
                    List<AbstractC20966c> list2 = b2;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (T t2 : list2) {
                        if (t2 != null) {
                            arrayList5.add(t2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
                        }
                    }
                    ArrayList<Object> arrayList6 = arrayList5;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                    for (Object obj2 : arrayList6) {
                        arrayList7.add(dVar.invoke(obj2));
                    }
                    return new FeedTabInfoList(arrayList4, arrayList7);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder>");
    }

    /* renamed from: a */
    public final void mo157511a() {
        AbstractC20966c b;
        UDSwitch uDSwitch = this.f134704k;
        if (uDSwitch != null) {
            RecyclerView recyclerView = this.f134703j;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Integer num = null;
            if (!(adapter instanceof C20967d)) {
                adapter = null;
            }
            C20967d dVar = (C20967d) adapter;
            boolean z = false;
            if (!(dVar == null || (b = dVar.mo71021b(0)) == null)) {
                num = Integer.valueOf(b.mo71008u());
            }
            if (num != null && num.intValue() > 2) {
                z = true;
            }
            uDSwitch.setChecked(z);
        }
    }

    public final void setOnEditCanceledListener(Function1<? super FeedTypeFilter, Unit> function1) {
        this.f134707n = function1;
    }

    public final void setOnEditFinishedListener(Function2<? super FeedTypeFilter, ? super FeedTabInfoList, Unit> kVar) {
        this.f134706m = kVar;
    }

    /* renamed from: b */
    public final List<AbstractC20966c> mo186209b(C20981l lVar) {
        return lVar.mo71077b();
    }

    public final void setCorrespondingSwitchButton(UDSwitch uDSwitch) {
        Intrinsics.checkParameterIsNotNull(uDSwitch, "switchButton");
        this.f134704k = uDSwitch;
    }

    public final void setHighlightFilter(FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "feedFilter");
        this.f134705l = feedFilter;
    }

    public final void setMyFiltersItemsSection(C20981l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "<set-?>");
        this.f134700f = lVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/xwray/groupie/Group;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter$moveItemToTheEndOfAnotherGroup$newThisGroupItems$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$g */
    public static final class C54486g extends Lambda implements Function1<AbstractC20966c, Boolean> {
        final /* synthetic */ FeedTabItem $item$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54486g(FeedTabItem cVar) {
            super(1);
            this.$item$inlined = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(AbstractC20966c cVar) {
            return Boolean.valueOf(invoke(cVar));
        }

        public final boolean invoke(AbstractC20966c cVar) {
            if (cVar != null) {
                return Intrinsics.areEqual(((FeedTabItem) cVar).mo186250h(), this.$item$inlined.mo186250h());
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FeedTabInfoList m211403a(FeedTypeFilter feedTypeFilter) {
        FeedTabInfoList dVar = feedTypeFilter.f134699e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editorTabInfoList");
        }
        return dVar;
    }

    /* renamed from: a */
    private final List<AbstractC20966c> m211404a(C20967d<C20972g> dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int itemCount = dVar.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            linkedHashSet.add(dVar.mo71021b(i));
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    /* renamed from: b */
    public final C20981l mo186208b(List<? extends AbstractC20966c> list) {
        String string = UIHelper.getString(R.string.Lark_Feed_MoreFilters);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Feed_MoreFilters)");
        return new FeedTabSection(new FeedMessageFilterHeaderItem(string), list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfo;", "it", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$d */
    public static final class C54482d extends Lambda implements Function1<FeedTabItem, FeedTabInfo> {
        public static final C54482d INSTANCE = new C54482d();

        C54482d() {
            super(1);
        }

        public final FeedTabInfo invoke(FeedTabItem cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            String g = cVar.mo186249g();
            String h = cVar.mo186250h();
            ColorDrawable i = cVar.mo186252i();
            if (i == null) {
                i = new ColorDrawable(-1);
            }
            return new FeedTabInfo(g, h, i, cVar.mo186253j(), cVar.mo186254k(), cVar.mo186255l());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem;", "tabInfo", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$j */
    public static final class C54489j extends Lambda implements Function1<FeedTabInfo, FeedTabItem> {
        final /* synthetic */ boolean $showHighlight;
        final /* synthetic */ FeedTypeFilter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54489j(FeedTypeFilter feedTypeFilter, boolean z) {
            super(1);
            this.this$0 = feedTypeFilter;
            this.$showHighlight = z;
        }

        public final FeedTabItem invoke(FeedTabInfo cVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(cVar, "tabInfo");
            FeedTabItem cVar2 = new FeedTabItem(cVar.mo186317a(), cVar.mo186318b(), cVar.mo186319c(), cVar.mo186320d(), cVar.mo186323f(), cVar.mo186321e(), false, false, 192, null);
            if (this.$showHighlight) {
                z = this.this$0.mo186207a(cVar);
            } else {
                z = false;
            }
            cVar2.mo186243a(z);
            return cVar2;
        }
    }

    /* renamed from: a */
    private final void m211405a(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        C20967d dVar = new C20967d();
        C20981l lVar = this.f134700f;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myFiltersItemsSection");
        }
        dVar.mo71023b(lVar);
        C20981l lVar2 = this.f134708o;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreFiltersItemsSection");
        }
        dVar.mo71023b(lVar2);
        recyclerView.setAdapter(dVar);
        new ItemTouchHelper(new C54484f(this, dVar)).attachToRecyclerView(recyclerView);
        int a = f134696h.mo186220a(16);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        recyclerView.addItemDecoration(new FeedMessageFilterItemDecoration(context, a));
        dVar.mo71018a(new C54483e(this, dVar));
        this.f134709p = true;
    }

    /* renamed from: a */
    public final AbstractC20966c mo186202a(C20981l lVar) {
        AbstractC20966c c = lVar.mo71065c(0);
        Intrinsics.checkExpressionValueIsNotNull(c, "getGroup(0)");
        return c;
    }

    /* renamed from: a */
    public final C20981l mo186203a(List<? extends AbstractC20966c> list) {
        String string = UIHelper.getString(R.string.Lark_Feed_MyFilters);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Feed_MyFilters)");
        return new FeedTabSection(new FeedMessageFilterHeaderItem(string), list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch", "com/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter$1$1$2$1", "com/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter$$special$$inlined$recyclerView$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$a */
    static final class View$OnTouchListenerC54480a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ FeedTypeFilter f134710a;

        View$OnTouchListenerC54480a(FeedTypeFilter feedTypeFilter) {
            this.f134710a = feedTypeFilter;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f134710a.f134701g && this.f134710a.f134699e != null) {
                FeedTypeFilter feedTypeFilter = this.f134710a;
                feedTypeFilter.mo186206a(FeedTypeFilter.m211403a(feedTypeFilter), false);
                this.f134710a.f134701g = true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "item", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/GroupieViewHolder;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedTypeFilter$e */
    public static final class C54483e implements AbstractC20979j {

        /* renamed from: a */
        final /* synthetic */ FeedTypeFilter f134712a;

        /* renamed from: b */
        final /* synthetic */ C20967d f134713b;

        C54483e(FeedTypeFilter feedTypeFilter, C20967d dVar) {
            this.f134712a = feedTypeFilter;
            this.f134713b = dVar;
        }

        @Override // com.p943f.p944a.AbstractC20979j
        /* renamed from: a */
        public final void mo71073a(AbstractC20975h<C20972g> hVar, View view) {
            SettingHitPointNew.FeedGroupingEditClickParam feedGroupingEditClickParam;
            Intrinsics.checkParameterIsNotNull(hVar, "item");
            Intrinsics.checkParameterIsNotNull(view, "<anonymous parameter 1>");
            this.f134712a.f134701g = true;
            if (hVar instanceof FeedTabItem) {
                FeedTabItem cVar = (FeedTabItem) hVar;
                if (!cVar.mo186254k() && !cVar.mo186253j() && !cVar.mo186255l()) {
                    this.f134712a.mo186205a(this.f134713b, cVar);
                    this.f134712a.mo157511a();
                    SettingHitPointNew settingHitPointNew = SettingHitPointNew.f134850a;
                    if (cVar.mo186256m()) {
                        feedGroupingEditClickParam = SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_MINUS;
                    } else {
                        feedGroupingEditClickParam = SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_PLUS;
                    }
                    settingHitPointNew.mo186384a(feedGroupingEditClickParam);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedTypeFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f134702i = f134696h.mo186220a(16);
        this.f134705l = FeedFilter.UNKNOWN;
        this.f134697c = C54487h.INSTANCE;
        this.f134698d = C54488i.INSTANCE;
        setBackgroundResource(R.color.bg_float_base);
        FeedTypeFilter feedTypeFilter = this;
        FeedTypeFilter feedTypeFilter2 = feedTypeFilter;
        LinearLayout linearLayout = new LinearLayout(feedTypeFilter2.getContext());
        linearLayout.setOnClickListener(View$OnClickListenerC54481b.f134711a);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = linearLayout;
        RecyclerView recyclerView = new RecyclerView(linearLayout2.getContext());
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setPaddingRelative(0, 0, 0, feedTypeFilter.f134702i);
        recyclerView.setOnTouchListener(new View$OnTouchListenerC54480a(feedTypeFilter));
        linearLayout2.addView(recyclerView);
        feedTypeFilter.f134703j = recyclerView;
        feedTypeFilter2.addView(linearLayout);
    }

    /* renamed from: a */
    public final void mo186204a(C20967d<C20972g> dVar, C20981l lVar, C20981l lVar2) {
        dVar.mo71019a(CollectionsKt.listOf((Object[]) new C20981l[]{lVar, lVar2}));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedTypeFilter(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m211406a(FeedTypeFilter feedTypeFilter, FeedTabInfoList dVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        feedTypeFilter.mo186206a(dVar, z);
    }
}
