package com.ss.android.lark.search.redesign.customtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.p943f.p944a.AbstractC20966c;
import com.p943f.p944a.AbstractC20975h;
import com.p943f.p944a.AbstractC20979j;
import com.p943f.p944a.C20967d;
import com.p943f.p944a.C20972g;
import com.p943f.p944a.C20981l;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.redesign.customtab.BaseTabItem;
import com.ss.android.lark.search.redesign.customtab.TabItem;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 3*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u00013B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0002J\u0016\u0010'\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0002J\u0016\u0010(\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0002J\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\"\u0010*\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\f\u0010,\u001a\u00020\u0011*\u00020\u0015H\u0002J\u001e\u0010-\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020/0.2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f*\b\u0012\u0004\u0012\u00020/0.H\u0002J,\u00102\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020/0.2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR<\u0010\u001b\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001f0\u001c*\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020\u001d*\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/CustomTabView;", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isInitialized", "", "moreItemsSection", "Lcom/xwray/groupie/Section;", "onMainTabMaxReached", "Lkotlin/Function0;", "", "onMainTabMinReached", "previewHeight", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "selectedItemsSection", "getSelectedItemsSection", "()Lcom/xwray/groupie/Section;", "setSelectedItemsSection", "(Lcom/xwray/groupie/Section;)V", "children", "", "Lcom/xwray/groupie/Group;", "kotlin.jvm.PlatformType", "", "getChildren", "(Lcom/xwray/groupie/Section;)Ljava/util/List;", "header", "getHeader", "(Lcom/xwray/groupie/Section;)Lcom/xwray/groupie/Group;", "attachRadiusType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "buildMoreItemsSection", "buildSelectedItemsSection", "getMyFiltersSelections", "setupTabs", "moreData", "initialize", "moveItemToTheEndOfAnotherGroup", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "item", "retrieveAllGroups", "update", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CustomTabView<T extends BaseTabItem<?>> extends LKUIRoundableLayout {

    /* renamed from: f */
    public static final Companion f132598f = new Companion(null);

    /* renamed from: c */
    public final Function0<Unit> f132599c;

    /* renamed from: d */
    public final Function0<Unit> f132600d;

    /* renamed from: e */
    public C20981l f132601e;

    /* renamed from: g */
    private final int f132602g;

    /* renamed from: h */
    private RecyclerView f132603h;

    /* renamed from: i */
    private C20981l f132604i;

    /* renamed from: j */
    private boolean f132605j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$a */
    static final class View$OnClickListenerC53725a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC53725a f132606a = new View$OnClickListenerC53725a();

        View$OnClickListenerC53725a() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$f */
    static final class C53730f extends Lambda implements Function0<Unit> {
        public static final C53730f INSTANCE = new C53730f();

        C53730f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$g */
    static final class C53731g extends Lambda implements Function0<Unit> {
        public static final C53731g INSTANCE = new C53731g();

        C53731g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    public CustomTabView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CustomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\b\u001a\u00020\u0004*\u00020\u0004J&\u0010\t\u001a\u00020\n*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bJ&\u0010\u0010\u001a\u00020\u0011*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/CustomTabView$Companion;", "", "()V", "MAIN_TAB_MAX_COUNT", "", "MAIN_TAB_MIN_COUNT", "TAG", "", "dp", "linearLayout", "Landroid/widget/LinearLayout;", "Landroid/view/ViewGroup;", "initializer", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo183236a(int i) {
            return C57582a.m223600a(i);
        }
    }

    public final C20981l getSelectedItemsSection() {
        C20981l lVar = this.f132601e;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedItemsSection");
        }
        return lVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J@\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/search/redesign/customtab/CustomTabView$initialize$itemTouchHelper$1", "Lcom/ss/android/lark/search/redesign/customtab/TranslationZDragCallback;", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "", "target", "onMoved", "fromPos", "", "toPos", "x", "y", "onSwiped", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$d */
    public static final class C53727d extends TranslationZDragCallback {

        /* renamed from: a */
        final /* synthetic */ CustomTabView f132609a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f132610b;

        /* renamed from: c */
        final /* synthetic */ C20967d f132611c;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: a */
        public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$d$a */
        static final class RunnableC53728a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53727d f132612a;

            /* renamed from: b */
            final /* synthetic */ C20981l f132613b;

            /* renamed from: c */
            final /* synthetic */ BaseTabItem f132614c;

            RunnableC53728a(C53727d dVar, C20981l lVar, BaseTabItem aVar) {
                this.f132612a = dVar;
                this.f132613b = lVar;
                this.f132614c = aVar;
            }

            public final void run() {
                BaseTabItem aVar;
                C20981l lVar = this.f132613b;
                List<AbstractC20966c> b = this.f132612a.f132609a.mo183231b(this.f132613b);
                int indexOf = b.indexOf(this.f132614c);
                if (Intrinsics.areEqual(this.f132612a.f132609a.mo183227a(this.f132613b), this.f132612a.f132609a.mo183227a(this.f132612a.f132609a.getSelectedItemsSection()))) {
                    aVar = this.f132614c.mo183243d();
                } else {
                    aVar = this.f132614c.mo183244e();
                }
                b.set(indexOf, aVar);
                lVar.mo71078c(b);
            }
        }

        @Override // com.ss.android.lark.search.redesign.customtab.TranslationZDragCallback, androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: e */
        public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
            super.mo6591e(recyclerView, viewHolder);
            if (viewHolder.getAdapterPosition() != -1) {
                AbstractC20966c b = this.f132611c.mo71021b(viewHolder.getAdapterPosition());
                if (b != null) {
                    C20981l lVar = (C20981l) b;
                    AbstractC20975h a = this.f132611c.mo71012a(viewHolder.getAdapterPosition());
                    if (a != null) {
                        BaseTabItem aVar = (BaseTabItem) a;
                        RecyclerView.Adapter adapter = this.f132610b.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        if (!aVar.mo183276h()) {
                            recyclerView.postDelayed(new RunnableC53728a(this, lVar, aVar), 200);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.redesign.customtab.BaseTabItem<com.xwray.groupie.GroupieViewHolder!>");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
            }
        }

        C53727d(CustomTabView customTabView, RecyclerView recyclerView, C20967d dVar) {
            this.f132609a = customTabView;
            this.f132610b = recyclerView;
            this.f132611c = dVar;
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
            AbstractC20975h a = this.f132611c.mo71012a(viewHolder.getAdapterPosition());
            Intrinsics.checkExpressionValueIsNotNull(a, "groupAdapter.getItem(viewHolder.adapterPosition)");
            AbstractC20966c b = this.f132611c.mo71022b(a);
            if (b != null) {
                C20981l lVar2 = (C20981l) b;
                int c = lVar2.mo71007c(a);
                AbstractC20975h a2 = this.f132611c.mo71012a(viewHolder2.getAdapterPosition());
                Intrinsics.checkExpressionValueIsNotNull(a2, "groupAdapter.getItem(target.adapterPosition)");
                if (a2 instanceof HeaderItem) {
                    if (viewHolder.getAdapterPosition() > viewHolder2.getAdapterPosition()) {
                        AbstractC20966c b2 = this.f132611c.mo71021b(viewHolder2.getAdapterPosition() - 1);
                        if (b2 != null) {
                            lVar = (C20981l) b2;
                            i2 = this.f132609a.mo183231b(lVar).size();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                        }
                    } else {
                        AbstractC20966c b3 = this.f132611c.mo71021b(viewHolder2.getAdapterPosition());
                        if (b3 != null) {
                            lVar = (C20981l) b3;
                            i2 = lVar.mo71007c(a2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                        }
                    }
                    i = i2 + 1;
                } else if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.redesign.customtab.BaseTabItem<com.xwray.groupie.GroupieViewHolder!>");
                } else if (((BaseTabItem) a2).mo183275g()) {
                    return false;
                } else {
                    AbstractC20966c b4 = this.f132611c.mo71021b(viewHolder2.getAdapterPosition());
                    if (b4 != null) {
                        lVar = (C20981l) b4;
                        i = lVar.mo71007c(a2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                    }
                }
                if (Intrinsics.areEqual(lVar2, lVar)) {
                    if (c == i) {
                        return false;
                    }
                    C20981l lVar3 = lVar;
                    List<AbstractC20966c> b5 = this.f132609a.mo183231b(lVar3);
                    b5.add(i - 1, b5.remove(c - 1));
                    lVar3.mo71078c(b5);
                } else if ((a instanceof BaseTabItem) && ((BaseTabItem) a).mo183276h()) {
                    return false;
                } else {
                    C20981l lVar4 = lVar;
                    AbstractC20966c a3 = this.f132609a.mo183227a(lVar4);
                    CustomTabView customTabView = this.f132609a;
                    if (Intrinsics.areEqual(a3, customTabView.mo183227a(customTabView.getSelectedItemsSection()))) {
                        if (lVar4.mo71008u() >= 100) {
                            this.f132609a.f132599c.invoke();
                            return false;
                        }
                    } else if (lVar2.mo71008u() <= 1) {
                        this.f132609a.f132600d.invoke();
                        return false;
                    }
                    List<AbstractC20966c> b6 = this.f132609a.mo183231b(lVar2);
                    b6.remove(a);
                    List<AbstractC20966c> b7 = this.f132609a.mo183231b(lVar4);
                    b7.add(i - 1, a);
                    AbstractC20966c a4 = this.f132609a.mo183227a(lVar2);
                    CustomTabView customTabView2 = this.f132609a;
                    if (Intrinsics.areEqual(a4, customTabView2.mo183227a(customTabView2.getSelectedItemsSection()))) {
                        CustomTabView customTabView3 = this.f132609a;
                        C20967d<C20972g> dVar = this.f132611c;
                        Intrinsics.checkExpressionValueIsNotNull(b6, "newSourceItemGroupChildren");
                        Intrinsics.checkExpressionValueIsNotNull(b7, "newTargetItemGroupChildren");
                        customTabView3.mo183229a(dVar, b6, b7);
                    } else {
                        CustomTabView customTabView4 = this.f132609a;
                        C20967d<C20972g> dVar2 = this.f132611c;
                        Intrinsics.checkExpressionValueIsNotNull(b7, "newTargetItemGroupChildren");
                        Intrinsics.checkExpressionValueIsNotNull(b6, "newSourceItemGroupChildren");
                        customTabView4.mo183229a(dVar2, b7, b6);
                    }
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: a */
        public void mo6576a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            AbstractC20975h hVar;
            AbstractC20975h hVar2;
            TabItem.RadiusType radiusType;
            boolean z;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
            Intrinsics.checkParameterIsNotNull(viewHolder2, "target");
            super.mo6576a(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
            TabItem.RadiusType radiusType2 = null;
            if (!(viewHolder instanceof TabItem.ViewHolder)) {
                viewHolder = null;
            }
            TabItem.ViewHolder aVar = (TabItem.ViewHolder) viewHolder;
            if (aVar != null) {
                hVar = aVar.mo71035l();
            } else {
                hVar = null;
            }
            if (!(hVar instanceof SearchTabItem)) {
                hVar = null;
            }
            SearchTabItem dVar = (SearchTabItem) hVar;
            if (!(viewHolder2 instanceof TabItem.ViewHolder)) {
                viewHolder2 = null;
            }
            TabItem.ViewHolder aVar2 = (TabItem.ViewHolder) viewHolder2;
            if (aVar2 != null) {
                hVar2 = aVar2.mo71035l();
            } else {
                hVar2 = null;
            }
            if (!(hVar2 instanceof SearchTabItem)) {
                hVar2 = null;
            }
            SearchTabItem dVar2 = (SearchTabItem) hVar2;
            StringBuilder sb = new StringBuilder();
            sb.append("from: ");
            sb.append(i);
            sb.append(" to: ");
            sb.append(i2);
            sb.append(" radius type: ");
            if (dVar != null) {
                radiusType = dVar.mo183253p();
            } else {
                radiusType = null;
            }
            sb.append(radiusType);
            sb.append(" to ");
            if (dVar2 != null) {
                radiusType2 = dVar2.mo183253p();
            }
            sb.append(radiusType2);
            Log.m165379d("CustomTabView", sb.toString());
            if (dVar == null) {
                Log.m165383e("CustomTabView", "from is null!");
            } else if (dVar2 != null && dVar.mo183253p() != dVar2.mo183253p()) {
                TabItem.RadiusType p = dVar.mo183253p();
                dVar.mo183240a(dVar2.mo183253p());
                dVar2.mo183240a(p);
                boolean z2 = true;
                if (dVar.mo183253p() != TabItem.RadiusType.FOOTER) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo183242a(z);
                if (dVar2.mo183253p() == TabItem.RadiusType.FOOTER) {
                    z2 = false;
                }
                dVar2.mo183242a(z2);
                Log.m165379d("CustomTabView", "result from: " + i + ' ' + dVar.mo183253p() + " to: " + i2 + ' ' + dVar2.mo183253p());
            }
        }
    }

    public final List<T> getMyFiltersSelections() {
        RecyclerView recyclerView = this.f132603h;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        if (recyclerView.getAdapter() == null) {
            return CollectionsKt.emptyList();
        }
        RecyclerView recyclerView2 = this.f132603h;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        RecyclerView.Adapter adapter = recyclerView2.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        if (adapter != null) {
            AbstractC20966c cVar = m207992a((C20967d) adapter).get(0);
            if (cVar != null) {
                List<AbstractC20966c> b = mo183231b((C20981l) cVar);
                Intrinsics.checkExpressionValueIsNotNull(b, "(allGroups[0] as Section).children");
                List<AbstractC20966c> list = b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (T t : list) {
                    if (t != null) {
                        arrayList.add(t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                }
                return arrayList;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder>");
    }

    /* renamed from: b */
    public final List<AbstractC20966c> mo183231b(C20981l lVar) {
        return lVar.mo71077b();
    }

    public final void setSelectedItemsSection(C20981l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "<set-?>");
        this.f132601e = lVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "it", "Lcom/xwray/groupie/Group;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/lark/search/redesign/customtab/CustomTabView$moveItemToTheEndOfAnotherGroup$newThisGroupItems$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$e */
    public static final class C53729e extends Lambda implements Function1<AbstractC20966c, Boolean> {
        final /* synthetic */ BaseTabItem $item$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53729e(BaseTabItem aVar) {
            super(1);
            this.$item$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(AbstractC20966c cVar) {
            return Boolean.valueOf(invoke(cVar));
        }

        public final boolean invoke(AbstractC20966c cVar) {
            if (cVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type T");
            } else if (((BaseTabItem) cVar).mo71055z() == this.$item$inlined.mo71055z()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public final AbstractC20966c mo183227a(C20981l lVar) {
        AbstractC20966c c = lVar.mo71065c(0);
        Intrinsics.checkExpressionValueIsNotNull(c, "getGroup(0)");
        return c;
    }

    /* renamed from: a */
    private final C20981l m207991a(List<? extends AbstractC20966c> list) {
        String string = UIHelper.getString(R.string.Lark_Search_MyCategory);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Search_MyCategory)");
        return new TabSection(new HeaderItem(string), list);
    }

    /* renamed from: b */
    private final C20981l m207994b(List<? extends AbstractC20966c> list) {
        String string = UIHelper.getString(R.string.Lark_Search_MoreCategory);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Lark_Search_MoreCategory)");
        return new TabSection(new HeaderItem(string), list);
    }

    /* renamed from: a */
    private final List<AbstractC20966c> m207992a(C20967d<C20972g> dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int itemCount = dVar.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            linkedHashSet.add(dVar.mo71021b(i));
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    /* renamed from: a */
    private final void m207993a(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        C20967d dVar = new C20967d();
        recyclerView.setAdapter(dVar);
        recyclerView.setOverScrollMode(2);
        new ItemTouchHelper(new C53727d(this, recyclerView, dVar)).attachToRecyclerView(recyclerView);
        dVar.mo71018a(new C53726c(this, dVar));
        this.f132605j = true;
    }

    /* renamed from: c */
    private final void m207995c(List<? extends AbstractC20966c> list) {
        for (T t : list) {
            if (t instanceof SearchTabItem) {
                T t2 = t;
                t2.mo183240a(TabItem.RadiusType.NONE);
                t2.mo183242a(true);
            }
        }
        AbstractC20966c cVar = (AbstractC20966c) CollectionsKt.firstOrNull((List) list);
        AbstractC20966c cVar2 = (AbstractC20966c) CollectionsKt.lastOrNull((List) list);
        if (!Intrinsics.areEqual(cVar, cVar2)) {
            if (cVar instanceof SearchTabItem) {
                ((SearchTabItem) cVar).mo183240a(TabItem.RadiusType.HEADER);
            }
            if (cVar2 instanceof SearchTabItem) {
                SearchTabItem dVar = (SearchTabItem) cVar2;
                dVar.mo183240a(TabItem.RadiusType.FOOTER);
                dVar.mo183242a(false);
            }
        } else if ((cVar instanceof SearchTabItem) && (cVar2 instanceof SearchTabItem)) {
            SearchTabItem dVar2 = (SearchTabItem) cVar;
            dVar2.mo183240a(TabItem.RadiusType.ALL);
            dVar2.mo183242a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032$\u0010\u0004\u001a \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\t\u0012\u0002\b\u00030\u0005¨\u0006\u00010\u0005¨\u0006\u00012\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "item", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/GroupieViewHolder;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.CustomTabView$c */
    public static final class C53726c implements AbstractC20979j {

        /* renamed from: a */
        final /* synthetic */ CustomTabView f132607a;

        /* renamed from: b */
        final /* synthetic */ C20967d f132608b;

        C53726c(CustomTabView customTabView, C20967d dVar) {
            this.f132607a = customTabView;
            this.f132608b = dVar;
        }

        @Override // com.p943f.p944a.AbstractC20979j
        /* renamed from: a */
        public final void mo71073a(AbstractC20975h<C20972g> hVar, View view) {
            Intrinsics.checkParameterIsNotNull(hVar, "item");
            Intrinsics.checkParameterIsNotNull(view, "<anonymous parameter 1>");
            if (hVar instanceof BaseTabItem) {
                BaseTabItem<?> aVar = (BaseTabItem) hVar;
                if (!aVar.mo183276h() && !aVar.mo183275g()) {
                    this.f132607a.mo183228a(this.f132608b, aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo183228a(C20967d<C20972g> dVar, BaseTabItem<?> aVar) {
        List<AbstractC20966c> list;
        int i;
        int i2;
        try {
            AbstractC20966c b = dVar.mo71022b((AbstractC20975h) aVar);
            if (b != null) {
                C20981l lVar = (C20981l) b;
                int a = dVar.mo71009a(lVar);
                C20981l lVar2 = lVar;
                AbstractC20966c b2 = dVar.mo71021b(((a + mo183231b(lVar2).size()) + 1) % dVar.getItemCount());
                if (b2 != null) {
                    C20981l lVar3 = (C20981l) b2;
                    int a2 = dVar.mo71010a((AbstractC20975h) aVar);
                    List<AbstractC20966c> b3 = mo183231b(lVar2);
                    CollectionsKt.removeAll((List) b3, (Function1) new C53729e(aVar));
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    List<AbstractC20966c> b4 = mo183231b(lVar3);
                    objectRef.element = (T) aVar.mo183246f();
                    b4.add(objectRef.element);
                    C20981l lVar4 = this.f132601e;
                    if (lVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedItemsSection");
                    }
                    if (Intrinsics.areEqual(lVar3, lVar4)) {
                        list = b4;
                    } else {
                        list = b3;
                    }
                    C20981l lVar5 = this.f132601e;
                    if (lVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedItemsSection");
                    }
                    if (!Intrinsics.areEqual(lVar3, lVar5)) {
                        b3 = b4;
                    }
                    if (list.size() > 99) {
                        this.f132599c.invoke();
                    } else if (list.size() < 0) {
                        this.f132600d.invoke();
                    } else {
                        Intrinsics.checkExpressionValueIsNotNull(list, "mainTabSection");
                        Intrinsics.checkExpressionValueIsNotNull(b3, "navTabSection");
                        mo183229a(dVar, list, b3);
                        T t = objectRef.element;
                        TabItem.RadiusType radiusType = null;
                        if (!(t instanceof SearchTabItem)) {
                            t = null;
                        }
                        T t2 = t;
                        if (t2 != null) {
                            radiusType = t2.mo183253p();
                        }
                        int i3 = 0;
                        if (radiusType == TabItem.RadiusType.FOOTER) {
                            int a3 = dVar.mo71010a((AbstractC20975h) objectRef.element);
                            RecyclerView recyclerView = this.f132603h;
                            if (recyclerView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemChanged(a3);
                            }
                            int i4 = a3 - 1;
                            if (i4 >= 0) {
                                RecyclerView recyclerView2 = this.f132603h;
                                if (recyclerView2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                                }
                                RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
                                if (adapter2 != null) {
                                    i2 = adapter2.getItemCount();
                                } else {
                                    i2 = 0;
                                }
                                if (i4 < i2) {
                                    RecyclerView recyclerView3 = this.f132603h;
                                    if (recyclerView3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                                    }
                                    RecyclerView.Adapter adapter3 = recyclerView3.getAdapter();
                                    if (adapter3 != null) {
                                        adapter3.notifyItemChanged(i4);
                                    }
                                }
                            }
                        }
                        RecyclerView recyclerView4 = this.f132603h;
                        if (recyclerView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        }
                        RecyclerView.Adapter adapter4 = recyclerView4.getAdapter();
                        if (adapter4 != null) {
                            adapter4.notifyItemChanged(a2);
                        }
                        int i5 = a2 - 1;
                        if (i5 >= 0) {
                            RecyclerView recyclerView5 = this.f132603h;
                            if (recyclerView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                            }
                            RecyclerView.Adapter adapter5 = recyclerView5.getAdapter();
                            if (adapter5 != null) {
                                i = adapter5.getItemCount();
                            } else {
                                i = 0;
                            }
                            if (i5 < i) {
                                RecyclerView recyclerView6 = this.f132603h;
                                if (recyclerView6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                                }
                                RecyclerView.Adapter adapter6 = recyclerView6.getAdapter();
                                if (adapter6 != null) {
                                    adapter6.notifyItemChanged(i5);
                                }
                            }
                        }
                        int i6 = a2 + 1;
                        if (i6 >= 0) {
                            RecyclerView recyclerView7 = this.f132603h;
                            if (recyclerView7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                            }
                            RecyclerView.Adapter adapter7 = recyclerView7.getAdapter();
                            if (adapter7 != null) {
                                i3 = adapter7.getItemCount();
                            }
                            if (i6 < i3) {
                                RecyclerView recyclerView8 = this.f132603h;
                                if (recyclerView8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                                }
                                RecyclerView.Adapter adapter8 = recyclerView8.getAdapter();
                                if (adapter8 != null) {
                                    adapter8.notifyItemChanged(i6);
                                }
                            }
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
            }
        } catch (IndexOutOfBoundsException e) {
            Log.m165383e("CustomTabView", "moveItemToTheEndOfAnotherGroup failed: " + aVar + ", " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo183230a(List<? extends T> list, List<? extends T> list2) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(list2, "moreData");
        this.f132601e = m207991a(list);
        this.f132604i = m207994b(list2);
        if (!this.f132605j) {
            RecyclerView recyclerView = this.f132603h;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            m207993a(recyclerView);
        }
        RecyclerView recyclerView2 = this.f132603h;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        RecyclerView.Adapter adapter = recyclerView2.getAdapter();
        if (!(adapter instanceof C20967d)) {
            adapter = null;
        }
        C20967d<C20972g> dVar = (C20967d) adapter;
        if (dVar != null) {
            mo183229a(dVar, list, list2);
            dVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f132602g = f132598f.mo183236a(16);
        this.f132599c = C53730f.INSTANCE;
        this.f132600d = C53731g.INSTANCE;
        setBackgroundColor(C57582a.m223616d(context, R.color.bg_float_base));
        CustomTabView<T> customTabView = this;
        CustomTabView<T> customTabView2 = customTabView;
        LinearLayout linearLayout = new LinearLayout(customTabView2.getContext());
        linearLayout.setOnClickListener(View$OnClickListenerC53725a.f132606a);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = linearLayout;
        RecyclerView recyclerView = new RecyclerView(linearLayout2.getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setPaddingRelative(0, 0, 0, customTabView.f132602g);
        linearLayout2.addView(recyclerView);
        customTabView.f132603h = recyclerView;
        customTabView2.addView(linearLayout);
    }

    /* renamed from: a */
    public final void mo183229a(C20967d<C20972g> dVar, List<? extends AbstractC20966c> list, List<? extends AbstractC20966c> list2) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$update");
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(list2, "moreData");
        m207995c(list);
        m207995c(list2);
        C20981l a = m207991a(list);
        C20981l b = m207994b(list2);
        List mutableListOf = CollectionsKt.mutableListOf(a);
        mutableListOf.add(b);
        dVar.mo71019a(mutableListOf);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
