package com.ss.android.lark.mm.module.detail.summary;

import android.graphics.Color;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26401f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummaryContent;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummarySection;
import com.ss.android.lark.mm.module.detail.summary.view.MmSummarySectionView;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.mention.C46489e;
import com.ss.android.lark.mm.module.translate.NestScrollHidingScrollListener;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ClipBoardUtil;
import com.ss.android.lark.mm.utils.MmScrollViewUtils;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.pullrefresh.MmRefreshHeadView;
import com.ss.android.lark.mm.widget.selectable.AbstractC47166a;
import com.ss.android.lark.mm.widget.selectable.SelectableOverlay;
import com.ss.android.lark.mm.widget.selectable.SelectableTextHelper;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004:\u0001.B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020\u001aH\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\b\u0010)\u001a\u00020\u001aH\u0016J\u0012\u0010*\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u000fH\u0016J\b\u0010-\u001a\u00020\u001aH\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryListener;", "Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryDependency;", "Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "currentHelper", "Lcom/ss/android/lark/mm/widget/selectable/SelectableTextHelper;", "cursorHandleColor", "", "isCanModify", "", "isFirstLoad", "selectedColor", "viewHolder", "Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$MmSummaryViewHolder;", "attachContextMenu", "textView", "Landroid/widget/TextView;", "contentId", "", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "dismissContextMenu", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "initData", "initRefreshLayout", "initScrollViewListener", "jumpToMentionPosition", "mentionSummaryContentView", "Landroid/view/View;", "onCreate", "onRefresh", "onStopScroll", "onTranslate", "onVideoPlayerCompletelyVisibleChange", "isCompletelyVisible", "refresh", "MmSummaryViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.summary.f */
public final class MmSummaryViewControl extends MmBaseViewControl<IMmSummaryListener, IMmSummaryDependency> implements IMmSummaryInquirer, IMmSummaryListener {

    /* renamed from: a */
    public MmSummaryViewHolder f116583a;

    /* renamed from: b */
    public SelectableTextHelper f116584b;

    /* renamed from: c */
    public boolean f116585c;

    /* renamed from: d */
    public final IMmViewControlContext f116586d;

    /* renamed from: e */
    public final MmBaseViewControlAdapter<IMmSummaryListener, IMmSummaryDependency> f116587e;

    /* renamed from: f */
    private final int f116588f;

    /* renamed from: g */
    private final int f116589g = Color.parseColor("#0071E8");

    /* renamed from: h */
    private boolean f116590h = true;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: i */
    public IMmSummaryListener mo161243c() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$MmSummaryViewHolder;", "", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl;Landroid/view/View;)V", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "getRefreshLayout", "()Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "Landroidx/core/widget/NestedScrollView;", "getRootView", "()Landroidx/core/widget/NestedScrollView;", "summaryContainer", "Landroid/widget/LinearLayout;", "getSummaryContainer", "()Landroid/widget/LinearLayout;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$a */
    public final class MmSummaryViewHolder {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116591a;

        /* renamed from: b */
        private final TwinklingRefreshLayout f116592b;

        /* renamed from: c */
        private final NestedScrollView f116593c;

        /* renamed from: d */
        private final LinearLayout f116594d;

        /* renamed from: a */
        public final TwinklingRefreshLayout mo162650a() {
            return this.f116592b;
        }

        /* renamed from: b */
        public final NestedScrollView mo162651b() {
            return this.f116593c;
        }

        /* renamed from: c */
        public final LinearLayout mo162652c() {
            return this.f116594d;
        }

        public MmSummaryViewHolder(MmSummaryViewControl fVar, View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f116591a = fVar;
            View findViewById = view.findViewById(R.id.swipeRefreshLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.swipeRefreshLayout)");
            this.f116592b = (TwinklingRefreshLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.rootView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.rootView)");
            this.f116593c = (NestedScrollView) findViewById2;
            View findViewById3 = view.findViewById(R.id.summaryContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.summaryContainer)");
            this.f116594d = (LinearLayout) findViewById3;
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener
    /* renamed from: b */
    public void mo162628b() {
        mo162647f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$initRefreshLayout$1", "Lcom/lcodecore/tkrefreshlayout/RefreshListenerAdapter;", "onPullingDown", "", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "fraction", "", "onRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$h */
    public static final class C46275h extends AbstractC26401f {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116602a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$h$a */
        static final class RunnableC46276a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46275h f116603a;

            RunnableC46276a(C46275h hVar) {
                this.f116603a = hVar;
            }

            public final void run() {
                MmSummaryViewControl.m183225a(this.f116603a.f116602a).mo162650a().mo93527f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46275h(MmSummaryViewControl fVar) {
            this.f116602a = fVar;
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: a */
        public void mo93516a(TwinklingRefreshLayout twinklingRefreshLayout) {
            super.mo93516a(twinklingRefreshLayout);
            this.f116602a.mo162647f();
            MmSummaryViewControl.m183225a(this.f116602a).mo162650a().invalidate();
            new Handler().postDelayed(new RunnableC46276a(this), 1000);
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: a */
        public void mo93517a(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo93517a(twinklingRefreshLayout, f);
            ((IMmSummaryDependency) this.f116602a.mo161247w()).mo162615b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$attachContextMenu$4", "Lcom/ss/android/lark/mm/widget/selectable/OnSelectListener;", "onTextLongClicked", "", "onTextSelected", "content", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$e */
    public static final class C46268e implements AbstractC47166a {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116596a;

        /* renamed from: b */
        final /* synthetic */ SelectableTextHelper f116597b;

        @Override // com.ss.android.lark.mm.widget.selectable.AbstractC47166a
        /* renamed from: a */
        public void mo162158a(CharSequence charSequence) {
        }

        @Override // com.ss.android.lark.mm.widget.selectable.AbstractC47166a
        /* renamed from: a */
        public void mo162157a() {
            this.f116596a.mo162648g();
            this.f116596a.f116584b = this.f116597b;
        }

        C46268e(MmSummaryViewControl fVar, SelectableTextHelper selectableTextHelper) {
            this.f116596a = fVar;
            this.f116597b = selectableTextHelper;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$initScrollViewListener$1", "Lcom/ss/android/lark/mm/module/translate/NestScrollHidingScrollListener;", "onHide", "", "onShow", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$i */
    public static final class C46277i extends NestScrollHidingScrollListener {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116604a;

        @Override // com.ss.android.lark.mm.module.translate.NestScrollHidingScrollListener
        /* renamed from: a */
        public void mo161308a() {
            ((IMmSummaryDependency) this.f116604a.mo161247w()).mo162618c();
        }

        @Override // com.ss.android.lark.mm.module.translate.NestScrollHidingScrollListener
        /* renamed from: b */
        public void mo161309b() {
            ((IMmSummaryDependency) this.f116604a.mo161247w()).mo162619d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46277i(MmSummaryViewControl fVar) {
            this.f116604a = fVar;
        }
    }

    /* renamed from: g */
    public final void mo162648g() {
        SelectableTextHelper selectableTextHelper = this.f116584b;
        if (selectableTextHelper != null) {
            selectableTextHelper.mo165821g();
        }
        this.f116584b = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/widget/selectable/SelectableTextHelper$Mode;", "kotlin.jvm.PlatformType", "getMode"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$d */
    public static final class C46267d implements SelectableTextHelper.AbstractC47164c {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116595a;

        C46267d(MmSummaryViewControl fVar) {
            this.f116595a = fVar;
        }

        @Override // com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.AbstractC47164c
        /* renamed from: a */
        public final SelectableTextHelper.Mode mo162159a() {
            if (Intrinsics.areEqual(((IMmSummaryDependency) this.f116595a.mo161247w()).mo162611a(), MmTranslateLangType.DEFAULT.getValue())) {
                return SelectableTextHelper.Mode.NORMAL;
            }
            return SelectableTextHelper.Mode.SUMMARY_TRANSLATE;
        }
    }

    /* renamed from: l */
    private final void m183228l() {
        MmSummaryViewHolder aVar = this.f116583a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162651b().setOnScrollChangeListener(new C46277i(this));
    }

    @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener
    /* renamed from: a */
    public void mo162625a() {
        MmSummaryViewHolder aVar = this.f116583a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162651b().stopNestedScroll(1);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        this.f116583a = new MmSummaryViewHolder(this, this.f116586d.mo161233o());
        m183227k();
        m183226j();
        m183228l();
    }

    /* renamed from: f */
    public final void mo162647f() {
        this.f116587e.mo161230c().mo162614a(new C46279k(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$f */
    public static final class RunnableC46269f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116598a;

        /* renamed from: b */
        final /* synthetic */ MmSummary f116599b;

        RunnableC46269f(MmSummaryViewControl fVar, MmSummary mmSummary) {
            this.f116598a = fVar;
            this.f116599b = mmSummary;
        }

        public final void run() {
            HashMap<String, MmSummaryContent> summaries;
            Collection<MmSummaryContent> values;
            MmSummary mmSummary = this.f116599b;
            if (!(mmSummary == null || (summaries = mmSummary.getSummaries()) == null || (values = summaries.values()) == null)) {
                for (T t : values) {
                    t.set_spanDataContent(C46489e.m183852a(t.getData()));
                }
            }
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.detail.summary.MmSummaryViewControl.RunnableC46269f.RunnableC462701 */

                /* renamed from: a */
                final /* synthetic */ RunnableC46269f f116600a;

                {
                    this.f116600a = r1;
                }

                public final void run() {
                    List<MmSummarySection> section_list;
                    boolean z;
                    MmSummaryViewControl.m183225a(this.f116600a.f116598a).mo162652c().removeAllViews();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = (T) null;
                    MmSummary mmSummary = this.f116600a.f116599b;
                    if (!(mmSummary == null || (section_list = mmSummary.getSection_list()) == null)) {
                        for (T t : section_list) {
                            List<MmSummaryContent> contents = this.f116600a.f116599b.getContents(t.getContent_ids());
                            List<MmSummaryContent> list = contents;
                            if (list == null || list.isEmpty()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                MmSummarySectionView mmSummarySectionView = new MmSummarySectionView(this.f116600a.f116598a.f116586d.mo161232n());
                                mmSummarySectionView.mo162714a(t, contents, this.f116600a.f116598a.f116585c, ((IMmSummaryDependency) this.f116600a.f116598a.mo161247w()).mo162620e(), new C46271a(mmSummarySectionView, this, objectRef), new C46273b(this, objectRef));
                                if (objectRef.element == null) {
                                    objectRef.element = (T) mmSummarySectionView.getMentionSummaryContentView();
                                }
                                MmSummaryViewControl.m183225a(this.f116600a.f116598a).mo162652c().addView(mmSummarySectionView);
                            }
                        }
                    }
                    this.f116600a.f116598a.mo162644a((View) objectRef.element);
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "contentId", "", "isChecked", "", "invoke", "com/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$bindData$1$2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$f$1$a */
                public static final class C46271a extends Lambda implements Function2<String, Boolean, Unit> {
                    final /* synthetic */ Ref.ObjectRef $mentionSummaryContentView$inlined;
                    final /* synthetic */ MmSummarySectionView $summaryView;
                    final /* synthetic */ RunnableC462701 this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C46271a(MmSummarySectionView mmSummarySectionView, RunnableC462701 r2, Ref.ObjectRef objectRef) {
                        super(2);
                        this.$summaryView = mmSummarySectionView;
                        this.this$0 = r2;
                        this.$mentionSummaryContentView$inlined = objectRef;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ Unit invoke(String str, Boolean bool) {
                        invoke(str, bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final String str, final boolean z) {
                        Intrinsics.checkParameterIsNotNull(str, "contentId");
                        this.this$0.f116600a.f116598a.f116587e.mo161230c().mo162613a(str, z, new Function1<Boolean, Unit>(this) {
                            /* class com.ss.android.lark.mm.module.detail.summary.MmSummaryViewControl.RunnableC46269f.RunnableC462701.C46271a.C462721 */
                            final /* synthetic */ C46271a this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                if (C47098d.m186535b(C47098d.m186533a(this.this$0.this$0.f116600a.f116598a.f116586d.mo161232n()))) {
                                    this.this$0.$summaryView.mo162715a(str, !z);
                                }
                            }
                        });
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "textView", "Landroid/widget/TextView;", "contentId", "", "invoke", "com/ss/android/lark/mm/module/detail/summary/MmSummaryViewControl$bindData$1$2$1$2"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$f$1$b */
                static final class C46273b extends Lambda implements Function2<TextView, String, Boolean> {
                    final /* synthetic */ Ref.ObjectRef $mentionSummaryContentView$inlined;
                    final /* synthetic */ RunnableC462701 this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C46273b(RunnableC462701 r1, Ref.ObjectRef objectRef) {
                        super(2);
                        this.this$0 = r1;
                        this.$mentionSummaryContentView$inlined = objectRef;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ Boolean invoke(TextView textView, String str) {
                        return Boolean.valueOf(invoke(textView, str));
                    }

                    public final boolean invoke(TextView textView, String str) {
                        Intrinsics.checkParameterIsNotNull(textView, "textView");
                        Intrinsics.checkParameterIsNotNull(str, "contentId");
                        return this.this$0.f116600a.f116598a.mo162645a(textView, str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$j */
    public static final class RunnableC46278j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116605a;

        /* renamed from: b */
        final /* synthetic */ View f116606b;

        RunnableC46278j(MmSummaryViewControl fVar, View view) {
            this.f116605a = fVar;
            this.f116606b = view;
        }

        public final void run() {
            MmScrollViewUtils.f118646a.mo165500a(MmSummaryViewControl.m183225a(this.f116605a).mo162651b(), this.f116606b);
            if (((IMmSummaryDependency) this.f116605a.mo161247w()).mo162621f()) {
                ((IMmSummaryDependency) this.f116605a.mo161247w()).mo162622g();
            }
        }
    }

    /* renamed from: j */
    private final void m183226j() {
        C68296b<Boolean> dismissSubject;
        Disposable subscribe;
        mo162647f();
        SelectableOverlay a = SelectableOverlay.f118884a.mo165806a(this.f116586d.mo161232n());
        if (a != null && (dismissSubject = a.getDismissSubject()) != null && (subscribe = dismissSubject.subscribe(new C46274g(this))) != null) {
            mo161246v().mo237937a(subscribe);
        }
    }

    /* renamed from: k */
    private final void m183227k() {
        MmSummaryViewHolder aVar = this.f116583a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162650a().setOnRefreshListener(new C46275h(this));
        MmSummaryViewHolder aVar2 = this.f116583a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo162650a().setNestedScrollingEnabled(false);
        MmRefreshHeadView mmRefreshHeadView = new MmRefreshHeadView(this.f116586d.mo161232n());
        mmRefreshHeadView.setProgressBackgroundColorSchemeResource(R.color.bg_body);
        MmSummaryViewHolder aVar3 = this.f116583a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar3.mo162650a().setHeaderView(mmRefreshHeadView);
        MmSummaryViewHolder aVar4 = this.f116583a;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar4.mo162650a().setHeaderHeight(48.0f);
        MmSummaryViewHolder aVar5 = this.f116583a;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar5.mo162650a().setOverScrollHeight(10.0f);
        MmSummaryViewHolder aVar6 = this.f116583a;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar6.mo162650a().setEnableRefresh(true);
        MmSummaryViewHolder aVar7 = this.f116583a;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar7.mo162650a().setEnableLoadmore(false);
        MmSummaryViewHolder aVar8 = this.f116583a;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar8.mo162650a().setEnableOverScroll(false);
        MmSummaryViewHolder aVar9 = this.f116583a;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar9.mo162651b().setOverScrollMode(2);
    }

    @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener
    /* renamed from: a */
    public void mo162626a(MmSummary mmSummary) {
        mo162646b(mmSummary);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$b */
    public static final class C46265b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ TextView $textView;
        final /* synthetic */ MmSummaryViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46265b(MmSummaryViewControl fVar, TextView textView) {
            super(1);
            this.this$0 = fVar;
            this.$textView = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmSummaryViewControl", "copy");
            ClipBoardUtil.f118606a.mo165481a(this.this$0.f116586d.mo161232n(), this.$textView.getText().toString());
            C45858j.m181677a((int) R.string.MMWeb_G_CopiedSuccessfully);
            this.this$0.mo162648g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$c */
    public static final class C46266c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ String $contentId;
        final /* synthetic */ TextView $textView;
        final /* synthetic */ MmSummaryViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46266c(MmSummaryViewControl fVar, String str, TextView textView) {
            super(1);
            this.this$0 = fVar;
            this.$contentId = str;
            this.$textView = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmSummaryViewControl", "view origin text");
            this.this$0.mo162648g();
            String a = this.this$0.f116587e.mo161230c().mo162612a(this.$contentId);
            if (a == null) {
                a = this.$textView.getText().toString();
            }
            ((IMmSummaryDependency) this.this$0.mo161247w()).mo162623h();
            ((IMmSummaryDependency) this.this$0.mo161247w()).mo162616b(a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$g */
    public static final class C46274g<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControl f116601a;

        C46274g(MmSummaryViewControl fVar) {
            this.f116601a = fVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f116601a.mo162648g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.f$k */
    public static final class C46279k extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmSummaryViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46279k(MmSummaryViewControl fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
            invoke(mmBaseInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(MmBaseInfo mmBaseInfo) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
            this.this$0.f116585c = mmBaseInfo.isCanModify();
            this.this$0.f116587e.mo161230c().mo162617b(new Function1<MmSummary, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.summary.MmSummaryViewControl.C46279k.C462801 */
                final /* synthetic */ C46279k this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MmSummary mmSummary) {
                    invoke(mmSummary);
                    return Unit.INSTANCE;
                }

                public final void invoke(MmSummary mmSummary) {
                    this.this$0.this$0.mo162646b(mmSummary);
                    ((IMmSummaryDependency) this.this$0.this$0.mo161247w()).mo162624i();
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MmSummaryViewHolder m183225a(MmSummaryViewControl fVar) {
        MmSummaryViewHolder aVar = fVar.f116583a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo162646b(MmSummary mmSummary) {
        C45857i.m181676a(new RunnableC46269f(this, mmSummary));
    }

    @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener
    /* renamed from: a */
    public void mo162627a(boolean z) {
        MmSummaryViewHolder aVar = this.f116583a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo162650a().setEnableRefresh(z);
    }

    /* renamed from: a */
    public final void mo162644a(View view) {
        boolean z;
        if (this.f116590h) {
            if (view == null) {
                if (((IMmSummaryDependency) mo161247w()).mo162621f()) {
                    ((IMmSummaryDependency) mo161247w()).mo162622g();
                }
                String e = ((IMmSummaryDependency) mo161247w()).mo162620e();
                if (e == null || e.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C45858j.m181677a((int) R.string.MMWeb_G_AtMentionContentDeleted_Toast);
                }
            } else {
                view.postDelayed(new RunnableC46278j(this, view), 200);
            }
        }
        this.f116590h = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSummaryViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmSummaryListener, IMmSummaryDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f116586d = gVar;
        this.f116587e = jVar;
        this.f116588f = UDColorUtils.getColor(gVar.mo161232n(), R.color.ud_B500_20);
    }

    /* renamed from: a */
    public final boolean mo162645a(TextView textView, String str) {
        View inflate = LayoutInflater.from(this.f116586d.mo161232n()).inflate(R.layout.mm_layout_menu_windows, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.tv_comment);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contextMenu.findViewById<View>(R.id.tv_comment)");
        findViewById.setVisibility(8);
        if (Intrinsics.areEqual(this.f116587e.mo161230c().mo162611a(), MmTranslateLangType.DEFAULT.getValue())) {
            View findViewById2 = inflate.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contextMenu.findViewById<View>(R.id.divider)");
            findViewById2.setVisibility(8);
            View findViewById3 = inflate.findViewById(R.id.tv_view_origin_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contextMenu.findViewById…R.id.tv_view_origin_text)");
            findViewById3.setVisibility(8);
        } else {
            View findViewById4 = inflate.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contextMenu.findViewById<View>(R.id.divider)");
            findViewById4.setVisibility(0);
        }
        View findViewById5 = inflate.findViewById(R.id.tv_copy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "contextMenu.findViewById<View>(R.id.tv_copy)");
        C47110e.m186573a(findViewById5, new C46265b(this, textView));
        View findViewById6 = inflate.findViewById(R.id.tv_view_origin_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "contextMenu.findViewById…R.id.tv_view_origin_text)");
        C47110e.m186573a(findViewById6, new C46266c(this, str, textView));
        SelectableTextHelper a = new SelectableTextHelper.C47162a(textView, inflate).mo165834b(this.f116588f).mo165831a(20.0f).mo165832a(this.f116589g).mo165833a();
        if (a != null) {
            a.mo165812a(new C46267d(this));
        }
        if (a == null) {
            return true;
        }
        a.mo165813a(new C46268e(this, a));
        return true;
    }
}
