package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.C1363f;
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
import com.ss.android.lark.main.app.tab.EditorTabItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
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
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002<=B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0016\u0010%\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010&\u001a\u00020\rH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u0001H\u0016J\b\u0010)\u001a\u00020\u001cH\u0002J\u001c\u0010*\u001a\u00020\u001c2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bJ\"\u0010,\u001a\u00020\u001c2\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001eJ\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\rJ\u0016\u0010/\u001a\u00020\u001c2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010#H\u0002J\f\u00102\u001a\u00020\u001c*\u000203H\u0002J\f\u00104\u001a\u00020\u001c*\u00020\u0016H\u0002J\u001a\u00105\u001a\u00020\u001c*\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020$0#*\b\u0012\u0004\u0012\u00020706H\u0002J\"\u0010;\u001a\u00020\u001c*\b\u0012\u0004\u0012\u000207062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabEditorView;", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "Lcom/ss/android/lark/main/app/tab/RoundableLayoutContainer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callbackHolder", "Lcom/ss/android/lark/main/app/tab/NavigationTabEditorView$CallbackHolder;", "editorTabInfoList", "Lcom/ss/android/lark/main/app/tab/EditorTabInfoList;", "horizontalPadding", "mainTabItemsSection", "Lcom/xwray/groupie/Section;", "getMainTabItemsSection", "()Lcom/xwray/groupie/Section;", "setMainTabItemsSection", "(Lcom/xwray/groupie/Section;)V", "mainTabPreview", "Landroidx/recyclerview/widget/RecyclerView;", "navTabItemsSection", "getNavTabItemsSection", "setNavTabItemsSection", "onEditCanceled", "Lkotlin/Function1;", "", "onEditFinished", "Lkotlin/Function2;", "recyclerView", "tipTopMargin", "buildMainTabItemsSection", "children", "", "Lcom/xwray/groupie/Group;", "buildNavTabItemsSection", "collectResults", "createMainTabPreviewRecyclerView", "provide", "setInitialMainTabPreviewItems", "setOnEditCanceledListener", "action", "setOnEditFinishedListener", "setupTabs", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "syncMainTabPreview", "newPreviewList", "Lcom/ss/android/lark/main/app/tab/EditorTabInfo;", "createSpace", "Landroid/view/ViewGroup;", "initialize", "moveItemToTheEndOfAnotherGroup", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "item", "Lcom/ss/android/lark/main/app/tab/EditorTabItem;", "retrieveAllGroups", "update", "CallbackHolder", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class NavigationTabEditorView extends LKUIRoundableLayout implements RoundableLayoutContainer {

    /* renamed from: i */
    public static final Companion f112462i = new Companion(null);

    /* renamed from: c */
    public final CallbackHolder f112463c;

    /* renamed from: d */
    public EditorTabInfoList f112464d;

    /* renamed from: e */
    public Function2<? super NavigationTabEditorView, ? super EditorTabInfoList, Unit> f112465e;

    /* renamed from: f */
    public Function1<? super NavigationTabEditorView, Unit> f112466f;

    /* renamed from: g */
    public C20981l f112467g;

    /* renamed from: h */
    public C20981l f112468h;

    /* renamed from: j */
    private final int f112469j;

    /* renamed from: k */
    private final int f112470k;

    /* renamed from: l */
    private RecyclerView f112471l;

    /* renamed from: m */
    private RecyclerView f112472m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$c */
    static final class View$OnClickListenerC44346c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC44346c f112479a = new View$OnClickListenerC44346c();

        View$OnClickListenerC44346c() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0004\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabEditorView$CallbackHolder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onMainTabMaxReached", "Lkotlin/Function0;", "", "getOnMainTabMaxReached", "()Lkotlin/jvm/functions/Function0;", "onMainTabMinReached", "getOnMainTabMinReached", "time", "", "getTime", "()J", "setTime", "(J)V", "debounce", "func", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$d */
    public static final class CallbackHolder {

        /* renamed from: a */
        public static final Companion f112480a = new Companion(null);

        /* renamed from: b */
        private long f112481b;

        /* renamed from: c */
        private final Function0<Unit> f112482c;

        /* renamed from: d */
        private final Function0<Unit> f112483d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabEditorView$CallbackHolder$Companion;", "", "()V", "INTERVAL", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$d$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final long mo157527a() {
            return this.f112481b;
        }

        /* renamed from: b */
        public final Function0<Unit> mo157529b() {
            return this.f112482c;
        }

        /* renamed from: c */
        public final Function0<Unit> mo157530c() {
            return this.f112483d;
        }

        /* renamed from: a */
        public final void mo157528a(long j) {
            this.f112481b = j;
        }

        public CallbackHolder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f112482c = new NavigationTabEditorView$CallbackHolder$$special$$inlined$debounce$1(this, context);
            this.f112483d = new NavigationTabEditorView$CallbackHolder$$special$$inlined$debounce$2(this, context);
        }
    }

    public NavigationTabEditorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NavigationTabEditorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.ss.android.lark.main.app.tab.RoundableLayoutContainer
    /* renamed from: d */
    public LKUIRoundableLayout mo157501d() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabEditorView$Companion;", "", "()V", "MAIN_TAB_MAX_COUNT", "", "MAIN_TAB_MIN_COUNT", "TAG", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$e */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C20981l getMainTabItemsSection() {
        C20981l lVar = this.f112467g;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainTabItemsSection");
        }
        return lVar;
    }

    public final C20981l getNavTabItemsSection() {
        C20981l lVar = this.f112468h;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navTabItemsSection");
        }
        return lVar;
    }

    /* renamed from: c */
    private final void m175917c() {
        EditorTabInfoList cVar = this.f112464d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editorTabInfoList");
        }
        mo157516c(cVar.mo157560a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/main/app/tab/NavigationTabEditorView$initialize$itemTouchHelper$1", "Lcom/ss/android/lark/main/app/tab/TranslationZDragCallback;", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "", "target", "onSelectedChanged", "actionState", "", "onSwiped", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$i */
    public static final class C44351i extends TranslationZDragCallback {

        /* renamed from: a */
        final /* synthetic */ NavigationTabEditorView f112488a;

        /* renamed from: b */
        final /* synthetic */ C20967d f112489b;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: a */
        public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$i$a */
        static final class RunnableC44352a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44351i f112490a;

            /* renamed from: b */
            final /* synthetic */ C20981l f112491b;

            /* renamed from: c */
            final /* synthetic */ EditorTabItem f112492c;

            RunnableC44352a(C44351i iVar, C20981l lVar, EditorTabItem dVar) {
                this.f112490a = iVar;
                this.f112491b = lVar;
                this.f112492c = dVar;
            }

            public final void run() {
                EditorTabItem dVar;
                C20981l lVar = this.f112491b;
                List<AbstractC20966c> b = C44370n.m176059b(lVar);
                int indexOf = b.indexOf(this.f112492c);
                if (Intrinsics.areEqual(C44370n.m176058a(this.f112491b), C44370n.m176058a(this.f112490a.f112488a.getMainTabItemsSection()))) {
                    dVar = this.f112492c.aR_();
                } else {
                    dVar = this.f112492c.mo157568d();
                }
                b.set(indexOf, dVar);
                lVar.mo71078c(b);
            }
        }

        C44351i(NavigationTabEditorView navigationTabEditorView, C20967d dVar) {
            this.f112488a = navigationTabEditorView;
            this.f112489b = dVar;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: b */
        public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
            super.mo6584b(viewHolder, i);
            if (i == 2 && viewHolder != null) {
                AbstractC20975h a = this.f112489b.mo71012a(viewHolder.getAdapterPosition());
                if (a != null) {
                    ((EditorTabItem) a).mo157564a((EditorTabItem.ViewHolder) viewHolder);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
            }
        }

        @Override // com.ss.android.lark.main.app.tab.TranslationZDragCallback, androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: e */
        public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
            super.mo6591e(recyclerView, viewHolder);
            AbstractC20966c b = this.f112489b.mo71021b(viewHolder.getAdapterPosition());
            if (b != null) {
                C20981l lVar = (C20981l) b;
                AbstractC20975h a = this.f112489b.mo71012a(viewHolder.getAdapterPosition());
                if (a != null) {
                    EditorTabItem dVar = (EditorTabItem) a;
                    dVar.mo157567b((EditorTabItem.ViewHolder) viewHolder);
                    if (!dVar.mo157577k() || !dVar.mo157576j()) {
                        recyclerView.postDelayed(new RunnableC44352a(this, lVar, dVar), 200);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
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
            AbstractC20975h a = this.f112489b.mo71012a(viewHolder.getAdapterPosition());
            Intrinsics.checkExpressionValueIsNotNull(a, "groupAdapter.getItem(viewHolder.adapterPosition)");
            AbstractC20966c b = this.f112489b.mo71022b(a);
            if (b != null) {
                C20981l lVar2 = (C20981l) b;
                int c = lVar2.mo71007c(a);
                AbstractC20975h a2 = this.f112489b.mo71012a(viewHolder2.getAdapterPosition());
                Intrinsics.checkExpressionValueIsNotNull(a2, "groupAdapter.getItem(target.adapterPosition)");
                if (a2 instanceof HeaderItem) {
                    if (viewHolder.getAdapterPosition() > viewHolder2.getAdapterPosition()) {
                        AbstractC20966c b2 = this.f112489b.mo71021b(viewHolder2.getAdapterPosition() - 1);
                        if (b2 != null) {
                            lVar = (C20981l) b2;
                            i2 = C44370n.m176059b(lVar).size();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                        }
                    } else {
                        AbstractC20966c b3 = this.f112489b.mo71021b(viewHolder2.getAdapterPosition());
                        if (b3 != null) {
                            lVar = (C20981l) b3;
                            i2 = lVar.mo71007c(a2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                        }
                    }
                    i = i2 + 1;
                } else if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
                } else if (((EditorTabItem) a2).mo157575i()) {
                    return false;
                } else {
                    AbstractC20966c b4 = this.f112489b.mo71021b(viewHolder2.getAdapterPosition());
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
                    List<AbstractC20966c> b5 = C44370n.m176059b(lVar3);
                    b5.add(i - 1, b5.remove(c - 1));
                    lVar3.mo71078c(b5);
                } else if (a != null) {
                    EditorTabItem dVar = (EditorTabItem) a;
                    if (dVar.mo157577k() && dVar.mo157576j()) {
                        return false;
                    }
                    C20981l lVar4 = lVar;
                    if (Intrinsics.areEqual(C44370n.m176058a(lVar4), C44370n.m176058a(this.f112488a.getMainTabItemsSection()))) {
                        if (lVar4.mo71008u() >= 6) {
                            this.f112488a.f112463c.mo157529b().invoke();
                            return false;
                        }
                    } else if (lVar2.mo71008u() <= 2) {
                        this.f112488a.f112463c.mo157530c().invoke();
                        return false;
                    }
                    List<AbstractC20966c> b6 = C44370n.m176059b(lVar2);
                    b6.remove(a);
                    List<AbstractC20966c> b7 = C44370n.m176059b(lVar4);
                    b7.add(i - 1, a);
                    if (Intrinsics.areEqual(C44370n.m176058a(lVar2), C44370n.m176058a(this.f112488a.getMainTabItemsSection()))) {
                        NavigationTabEditorView navigationTabEditorView = this.f112488a;
                        C20967d<C20972g> dVar2 = this.f112489b;
                        Intrinsics.checkExpressionValueIsNotNull(b6, "newSourceItemGroupChildren");
                        C20981l a3 = navigationTabEditorView.mo157510a(b6);
                        NavigationTabEditorView navigationTabEditorView2 = this.f112488a;
                        Intrinsics.checkExpressionValueIsNotNull(b7, "newTargetItemGroupChildren");
                        navigationTabEditorView.mo157513a(dVar2, a3, navigationTabEditorView2.mo157515b(b7));
                    } else {
                        NavigationTabEditorView navigationTabEditorView3 = this.f112488a;
                        C20967d<C20972g> dVar3 = this.f112489b;
                        Intrinsics.checkExpressionValueIsNotNull(b7, "newTargetItemGroupChildren");
                        C20981l a4 = navigationTabEditorView3.mo157510a(b7);
                        NavigationTabEditorView navigationTabEditorView4 = this.f112488a;
                        Intrinsics.checkExpressionValueIsNotNull(b6, "newSourceItemGroupChildren");
                        navigationTabEditorView3.mo157513a(dVar3, a4, navigationTabEditorView4.mo157515b(b6));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }
    }

    /* renamed from: b */
    private final void m175916b() {
        m175917c();
        RecyclerView recyclerView = this.f112471l;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        if (adapter != null) {
            C20967d dVar = (C20967d) adapter;
            dVar.registerAdapterDataObserver(new C44349g(this, dVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder>");
    }

    /* renamed from: a */
    public final EditorTabInfoList mo157511a() {
        RecyclerView recyclerView = this.f112471l;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        if (adapter != null) {
            List<AbstractC20966c> a = mo157512a((C20967d) adapter);
            C44347f fVar = C44347f.INSTANCE;
            AbstractC20966c cVar = a.get(0);
            if (cVar != null) {
                List<AbstractC20966c> b = C44370n.m176059b((C20981l) cVar);
                Intrinsics.checkExpressionValueIsNotNull(b, "(allGroups[0] as Section).children");
                List<AbstractC20966c> list = b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (T t : list) {
                    if (t != null) {
                        arrayList.add(t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
                    }
                }
                ArrayList<Object> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (Object obj : arrayList2) {
                    arrayList3.add(fVar.invoke(obj));
                }
                ArrayList arrayList4 = arrayList3;
                AbstractC20966c cVar2 = a.get(1);
                if (cVar2 != null) {
                    List<AbstractC20966c> b2 = C44370n.m176059b((C20981l) cVar2);
                    Intrinsics.checkExpressionValueIsNotNull(b2, "(allGroups[1] as Section).children");
                    List<AbstractC20966c> list2 = b2;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (T t2 : list2) {
                        if (t2 != null) {
                            arrayList5.add(t2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
                        }
                    }
                    ArrayList<Object> arrayList6 = arrayList5;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                    for (Object obj2 : arrayList6) {
                        arrayList7.add(fVar.invoke(obj2));
                    }
                    return new EditorTabInfoList(arrayList4, arrayList7);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder>");
    }

    public final void setOnEditCanceledListener(Function1<? super NavigationTabEditorView, Unit> function1) {
        this.f112466f = function1;
    }

    public final void setOnEditFinishedListener(Function2<? super NavigationTabEditorView, ? super EditorTabInfoList, Unit> kVar) {
        this.f112465e = kVar;
    }

    public final void setMainTabItemsSection(C20981l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "<set-?>");
        this.f112467g = lVar;
    }

    public final void setNavTabItemsSection(C20981l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "<set-?>");
        this.f112468h = lVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\t"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$1$1$2$1$1", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$$special$$inlined$textView$lambda$1", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$$special$$inlined$linearLayout$lambda$1", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$$special$$inlined$linearLayout$lambda$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$a */
    static final class View$OnClickListenerC44344a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NavigationTabEditorView f112473a;

        /* renamed from: b */
        final /* synthetic */ NavigationTabEditorView f112474b;

        /* renamed from: c */
        final /* synthetic */ Context f112475c;

        View$OnClickListenerC44344a(NavigationTabEditorView navigationTabEditorView, NavigationTabEditorView navigationTabEditorView2, Context context) {
            this.f112473a = navigationTabEditorView;
            this.f112474b = navigationTabEditorView2;
            this.f112475c = context;
        }

        public final void onClick(View view) {
            Function1<? super NavigationTabEditorView, Unit> function1 = this.f112473a.f112466f;
            if (function1 != null) {
                function1.invoke(this.f112474b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/xwray/groupie/Group;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$moveItemToTheEndOfAnotherGroup$newThisGroupItems$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$j */
    public static final class C44353j extends Lambda implements Function1<AbstractC20966c, Boolean> {
        final /* synthetic */ EditorTabItem $item$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44353j(EditorTabItem dVar) {
            super(1);
            this.$item$inlined = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(AbstractC20966c cVar) {
            return Boolean.valueOf(invoke(cVar));
        }

        public final boolean invoke(AbstractC20966c cVar) {
            if (cVar != null) {
                return Intrinsics.areEqual(((EditorTabItem) cVar).mo157571f(), this.$item$inlined.mo157571f());
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditorTabInfoList m175913a(NavigationTabEditorView navigationTabEditorView) {
        EditorTabInfoList cVar = navigationTabEditorView.f112464d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editorTabInfoList");
        }
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\t"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$1$1$2$3$1", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$$special$$inlined$textView$lambda$2", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$$special$$inlined$linearLayout$lambda$2", "com/ss/android/lark/main/app/tab/NavigationTabEditorView$$special$$inlined$linearLayout$lambda$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$b */
    static final class View$OnClickListenerC44345b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NavigationTabEditorView f112476a;

        /* renamed from: b */
        final /* synthetic */ NavigationTabEditorView f112477b;

        /* renamed from: c */
        final /* synthetic */ Context f112478c;

        View$OnClickListenerC44345b(NavigationTabEditorView navigationTabEditorView, NavigationTabEditorView navigationTabEditorView2, Context context) {
            this.f112476a = navigationTabEditorView;
            this.f112477b = navigationTabEditorView2;
            this.f112478c = context;
        }

        public final void onClick(View view) {
            Function2<? super NavigationTabEditorView, ? super EditorTabInfoList, Unit> kVar = this.f112476a.f112465e;
            if (kVar != null) {
                kVar.invoke(this.f112477b, this.f112476a.mo157511a());
            }
        }
    }

    /* renamed from: a */
    private final void m175914a(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        viewGroup.addView(space);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/main/app/tab/EditorTabInfo;", "it", "Lcom/ss/android/lark/main/app/tab/EditorTabItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$f */
    public static final class C44347f extends Lambda implements Function1<EditorTabItem, EditorTabInfo> {
        public static final C44347f INSTANCE = new C44347f();

        C44347f() {
            super(1);
        }

        public final EditorTabInfo invoke(EditorTabItem dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "it");
            String f = dVar.mo157571f();
            String g = dVar.mo157572g();
            ColorDrawable h = dVar.mo157573h();
            if (h == null) {
                h = new ColorDrawable(-16777216);
            }
            return new EditorTabInfo(f, g, h, dVar.mo157575i(), dVar.mo157576j(), false, C443481.INSTANCE, 32, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/main/app/tab/EditorTabItem;", "tabInfo", "Lcom/ss/android/lark/main/app/tab/EditorTabInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$k */
    public static final class C44354k extends Lambda implements Function1<EditorTabInfo, EditorTabItem> {
        public static final C44354k INSTANCE = new C44354k();

        C44354k() {
            super(1);
        }

        public final EditorTabItem invoke(EditorTabInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tabInfo");
            return new EditorTabItem(bVar.mo157553a(), bVar.mo157554b(), bVar.mo157555c(), bVar.mo157556d(), bVar.mo157557e(), false, 32, null);
        }
    }

    /* renamed from: a */
    public final C20981l mo157510a(List<? extends AbstractC20966c> list) {
        String string = getContext().getString(R.string.Lark_Legacy_BottomNavigation);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…_Legacy_BottomNavigation)");
        return new C44363k(new HeaderItem(string), list);
    }

    /* renamed from: a */
    private final void m175915a(RecyclerView recyclerView) {
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        C20967d dVar = new C20967d();
        C20981l lVar = this.f112467g;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainTabItemsSection");
        }
        dVar.mo71023b(lVar);
        C20981l lVar2 = this.f112468h;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navTabItemsSection");
        }
        dVar.mo71023b(lVar2);
        recyclerView.setAdapter(dVar);
        new ItemTouchHelper(new C44351i(this, dVar)).attachToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int a = C44390w.m176139a(54, context);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        recyclerView.addItemDecoration(new NavTabEditorItemDecoration(context2, a));
        dVar.mo71018a(new C44350h(this, dVar));
    }

    /* renamed from: b */
    public final C20981l mo157515b(List<? extends AbstractC20966c> list) {
        String string = getContext().getString(R.string.Lark_Legacy_NavigationMore);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…rk_Legacy_NavigationMore)");
        return new C44363k(new HeaderItem(string), list);
    }

    /* renamed from: a */
    public final List<AbstractC20966c> mo157512a(C20967d<C20972g> dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int itemCount = dVar.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            linkedHashSet.add(dVar.mo71021b(i));
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    /* renamed from: c */
    public final void mo157516c(List<EditorTabInfo> list) {
        String string = getContext().getString(R.string.Lark_Legacy_NavigationMore);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…rk_Legacy_NavigationMore)");
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ud_icon_tab_more_colorful);
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(drawable, "ContextCompat.getDrawabl…icon_tab_more_colorful)!!");
        MainTabPreviewItem gVar = new MainTabPreviewItem("more", string, drawable, false, 8, null);
        RecyclerView recyclerView = this.f112472m;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainTabPreview");
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            MainTabPreviewAdapter fVar = (MainTabPreviewAdapter) adapter;
            List<EditorTabInfo> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                arrayList.add(new MainTabPreviewItem(t.mo157553a(), t.mo157554b(), t.mo157559g().invoke(t.mo157553a()), t.mo157558f()));
            }
            fVar.submitList(CollectionsKt.plus((Collection) arrayList, (Object) gVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.MainTabPreviewAdapter");
    }

    public final void setupTabs(EditorTabInfoList cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f112464d = cVar;
        C44354k kVar = C44354k.INSTANCE;
        List<EditorTabInfo> a = cVar.mo157560a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(kVar.invoke((Object) it.next()));
        }
        ArrayList<EditorTabItem> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (EditorTabItem dVar : arrayList2) {
            arrayList3.add(dVar.mo157569e());
        }
        this.f112467g = mo157510a(arrayList3);
        List<EditorTabInfo> b = cVar.mo157561b();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it2 = b.iterator();
        while (it2.hasNext()) {
            arrayList4.add(kVar.invoke((Object) it2.next()));
        }
        this.f112468h = mo157515b(arrayList4);
        RecyclerView recyclerView = this.f112471l;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        m175915a(recyclerView);
        m175916b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/main/app/tab/NavigationTabEditorView$createMainTabPreviewRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onItemRangeMoved", "", "fromPosition", "", "toPosition", "itemCount", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$g */
    public static final class C44349g extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ NavigationTabEditorView f112484a;

        /* renamed from: b */
        final /* synthetic */ C20967d f112485b;

        C44349g(NavigationTabEditorView navigationTabEditorView, C20967d dVar) {
            this.f112484a = navigationTabEditorView;
            this.f112485b = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            AbstractC20966c cVar = this.f112484a.mo157512a(this.f112485b).get(0);
            if (cVar != null) {
                C20981l lVar = (C20981l) cVar;
                IntRange kVar = new IntRange(1, lVar.mo71008u());
                if (kVar.mo239410a(i) || kVar.mo239410a(i2)) {
                    NavigationTabEditorView navigationTabEditorView = this.f112484a;
                    List<AbstractC20966c> b = C44370n.m176059b(lVar);
                    Intrinsics.checkExpressionValueIsNotNull(b, "mainTabItemsGroup.children");
                    List<AbstractC20966c> list = b;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (T t : list) {
                        if (t != null) {
                            String f = t.mo157571f();
                            for (EditorTabInfo bVar : NavigationTabEditorView.m175913a(this.f112484a)) {
                                if (Intrinsics.areEqual(bVar.mo157553a(), f)) {
                                    arrayList.add(bVar);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
                    }
                    navigationTabEditorView.mo157516c(arrayList);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "item", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/GroupieViewHolder;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTabEditorView$h */
    public static final class C44350h implements AbstractC20979j {

        /* renamed from: a */
        final /* synthetic */ NavigationTabEditorView f112486a;

        /* renamed from: b */
        final /* synthetic */ C20967d f112487b;

        C44350h(NavigationTabEditorView navigationTabEditorView, C20967d dVar) {
            this.f112486a = navigationTabEditorView;
            this.f112487b = dVar;
        }

        @Override // com.p943f.p944a.AbstractC20979j
        /* renamed from: a */
        public final void mo71073a(AbstractC20975h<C20972g> hVar, View view) {
            Intrinsics.checkParameterIsNotNull(hVar, "item");
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (hVar instanceof EditorTabItem) {
                EditorTabItem dVar = (EditorTabItem) hVar;
                if ((!dVar.mo157577k() || (dVar.mo157577k() && !dVar.mo157576j())) && !dVar.mo157575i()) {
                    this.f112486a.mo157514a(this.f112487b, dVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo157514a(C20967d<C20972g> dVar, EditorTabItem dVar2) {
        List<AbstractC20966c> list;
        try {
            AbstractC20966c b = dVar.mo71022b((AbstractC20975h) dVar2);
            if (b != null) {
                C20981l lVar = (C20981l) b;
                int a = dVar.mo71009a(lVar);
                C20981l lVar2 = lVar;
                AbstractC20966c b2 = dVar.mo71021b(((a + C44370n.m176059b(lVar2).size()) + 1) % dVar.getItemCount());
                if (b2 != null) {
                    C20981l lVar3 = (C20981l) b2;
                    List<AbstractC20966c> b3 = C44370n.m176059b(lVar2);
                    CollectionsKt.removeAll((List) b3, (Function1) new C44353j(dVar2));
                    List<AbstractC20966c> b4 = C44370n.m176059b(lVar3);
                    b4.add(dVar2.mo157569e());
                    C20981l lVar4 = this.f112467g;
                    if (lVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainTabItemsSection");
                    }
                    if (Intrinsics.areEqual(lVar3, lVar4)) {
                        list = b4;
                    } else {
                        list = b3;
                    }
                    C20981l lVar5 = this.f112467g;
                    if (lVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainTabItemsSection");
                    }
                    if (!Intrinsics.areEqual(lVar3, lVar5)) {
                        b3 = b4;
                    }
                    if (list.size() > 5) {
                        this.f112463c.mo157529b().invoke();
                    } else if (list.size() < 1) {
                        this.f112463c.mo157530c().invoke();
                    } else {
                        Intrinsics.checkExpressionValueIsNotNull(list, "mainTabSection");
                        C20981l a2 = mo157510a(list);
                        Intrinsics.checkExpressionValueIsNotNull(b3, "navTabSection");
                        mo157513a(dVar, a2, mo157515b(b3));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.xwray.groupie.Section");
            }
        } catch (IndexOutOfBoundsException e) {
            Log.m165383e("NavigationTabEditorView", "moveItemToTheEndOfAnotherGroup failed: " + dVar2 + ", " + e.getMessage());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationTabEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f112469j = C44390w.m176139a(16, context);
        this.f112470k = C44390w.m176139a(8, context);
        this.f112463c = new CallbackHolder(context);
        setBackgroundColor(C44390w.m176140b(R.color.bg_float_base, context));
        NavigationTabEditorView navigationTabEditorView = this;
        NavigationTabEditorView navigationTabEditorView2 = navigationTabEditorView;
        LinearLayout linearLayout = new LinearLayout(navigationTabEditorView2.getContext());
        linearLayout.setOnClickListener(View$OnClickListenerC44346c.f112479a);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = linearLayout;
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, C44390w.m176138a(56.0f, context)));
        linearLayout3.setGravity(16);
        LinearLayout linearLayout4 = linearLayout3;
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout4.getContext());
        appCompatTextView.setText(context.getString(R.string.Lark_Legacy_Cancel));
        appCompatTextView.setTextSize(2, 17.0f);
        appCompatTextView.setTextColor(C44390w.m176140b(R.color.text_title, context));
        int i2 = navigationTabEditorView.f112469j;
        appCompatTextView.setPaddingRelative(i2, 0, i2, 0);
        appCompatTextView.setOnClickListener(new View$OnClickListenerC44344a(navigationTabEditorView, this, context));
        linearLayout4.addView(appCompatTextView);
        Unit unit = Unit.INSTANCE;
        navigationTabEditorView.m175914a(linearLayout4);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout4.getContext());
        appCompatTextView2.setText(context.getString(R.string.Lark_Navigation_EditBottomNavigationBar));
        appCompatTextView2.setTextSize(2, 17.0f);
        appCompatTextView2.setTextColor(C44390w.m176140b(R.color.text_title, context));
        appCompatTextView2.setTypeface(Typeface.DEFAULT_BOLD);
        appCompatTextView2.setGravity(17);
        linearLayout4.addView(appCompatTextView2);
        Unit unit2 = Unit.INSTANCE;
        navigationTabEditorView.m175914a(linearLayout4);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout4.getContext());
        appCompatTextView3.setText(context.getString(R.string.Lark_Legacy_Done));
        appCompatTextView3.setTextSize(2, 16.0f);
        appCompatTextView3.setTextColor(C44390w.m176140b(R.color.text_link_normal, context));
        int i3 = navigationTabEditorView.f112469j;
        appCompatTextView3.setPaddingRelative(i3, 0, i3, 0);
        appCompatTextView3.setOnClickListener(new View$OnClickListenerC44345b(navigationTabEditorView, this, context));
        linearLayout4.addView(appCompatTextView3);
        Unit unit3 = Unit.INSTANCE;
        linearLayout2.addView(linearLayout3);
        Unit unit4 = Unit.INSTANCE;
        Context context2 = linearLayout2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "parent.context");
        RequestParentDisallowInterceptTouchEventRecyclerView requestParentDisallowInterceptTouchEventRecyclerView = new RequestParentDisallowInterceptTouchEventRecyclerView(context2, null, 0, 6, null);
        RequestParentDisallowInterceptTouchEventRecyclerView requestParentDisallowInterceptTouchEventRecyclerView2 = requestParentDisallowInterceptTouchEventRecyclerView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        Unit unit5 = Unit.INSTANCE;
        requestParentDisallowInterceptTouchEventRecyclerView2.setLayoutParams(layoutParams);
        int i4 = navigationTabEditorView.f112469j;
        requestParentDisallowInterceptTouchEventRecyclerView2.setPaddingRelative(i4, 0, i4, 0);
        linearLayout2.addView(requestParentDisallowInterceptTouchEventRecyclerView);
        Unit unit6 = Unit.INSTANCE;
        navigationTabEditorView.f112471l = requestParentDisallowInterceptTouchEventRecyclerView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout2.getContext());
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, C44390w.m176138a(0.5f, context)));
        appCompatImageView.setBackgroundResource(R.color.line_divider_default);
        linearLayout2.addView(appCompatImageView);
        Unit unit7 = Unit.INSTANCE;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(linearLayout2.getContext());
        appCompatTextView4.setBackgroundColor(C44390w.m176140b(R.color.bg_float, context));
        appCompatTextView4.setText(R.string.Lark_Legacy_NavigationPreview);
        appCompatTextView4.setTextSize(2, 14.0f);
        appCompatTextView4.setTextColor(C44390w.m176140b(R.color.text_caption, context));
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int i5 = navigationTabEditorView.f112470k;
        appCompatTextView4.setPadding(0, i5, 0, i5);
        linearLayout2.addView(appCompatTextView4);
        Unit unit8 = Unit.INSTANCE;
        RecyclerView recyclerView = new RecyclerView(linearLayout2.getContext());
        recyclerView.setBackgroundColor(C44390w.m176140b(R.color.bg_float, context));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, C44390w.m176139a(65, context));
        layoutParams2.gravity = 80;
        Unit unit9 = Unit.INSTANCE;
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setAdapter(new MainTabPreviewAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        C1363f fVar = new C1363f();
        fVar.setSupportsChangeAnimations(false);
        Unit unit10 = Unit.INSTANCE;
        recyclerView.setItemAnimator(fVar);
        linearLayout2.addView(recyclerView);
        Unit unit11 = Unit.INSTANCE;
        navigationTabEditorView.f112472m = recyclerView;
        navigationTabEditorView2.addView(linearLayout);
        Unit unit12 = Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo157513a(C20967d<C20972g> dVar, C20981l lVar, C20981l lVar2) {
        dVar.mo71019a(CollectionsKt.listOf((Object[]) new C20981l[]{lVar, lVar2}));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationTabEditorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
