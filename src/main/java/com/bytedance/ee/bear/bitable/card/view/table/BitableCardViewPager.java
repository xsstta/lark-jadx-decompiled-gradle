package com.bytedance.ee.bear.bitable.card.view.table;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bitable.card.model.enums.ETableType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f;
import com.bytedance.ee.bear.bitable.card.view.table.BitableCardDragLayout;
import com.bytedance.ee.bear.bitable.card.view.table.C4739b;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.bitable.common.BitableAnalytic;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13727b;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.bytedance.ee.util.ui.ColorUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.aj;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001OB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010*\u001a\u00020\u001b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010,H\u0002J\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u000101J\b\u00102\u001a\u00020\u0010H\u0016J\b\u00103\u001a\u00020.H\u0002J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u00010\u0017J\b\u00107\u001a\u00020\u001bH\u0016J\b\u00108\u001a\u00020.H\u0002J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0014J\b\u0010<\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020.H\u0002J\u0018\u0010>\u001a\u00020.2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010,H\u0002J\b\u0010@\u001a\u00020.H\u0014J\u0012\u0010A\u001a\u00020.2\b\u0010B\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010F\u001a\u00020.2\u0006\u00100\u001a\u000201H\u0016J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020\u0014H\u0002J\u000e\u0010I\u001a\u00020.2\u0006\u00106\u001a\u00020\u0017J\u0010\u0010J\u001a\u00020.2\u0006\u0010D\u001a\u00020EH\u0002J\u000e\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020\u001bJ\u0010\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020\u001bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/table/BitableCardViewPager;", "Landroid/widget/FrameLayout;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardViewModel$IViewPagerDelegate;", "context", "Landroid/content/Context;", "mBitableCardViewModel", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardViewModel;", "mBitableCardDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardViewModel;Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;)V", "animSet", "Landroid/animation/AnimatorSet;", "mContainer", "Landroid/view/View;", "mCurrentPos", "", "mCurrentRecord", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "mCurrentRecordView", "Lcom/bytedance/ee/bear/bitable/card/view/record/IRecordView;", "mCurrentState", "mCurrentTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "mDragLayout", "Lcom/bytedance/ee/bear/bitable/card/view/table/BitableCardDragLayout;", "mIsVisibleToUser", "", "mPageAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/table/RecordPageAdapter;", "mPendingDataChangedTask", "Ljava/lang/Runnable;", "mPendingLinkRecordDeletedTask", "mRecordActionListener", "Lcom/bytedance/ee/bear/bitable/card/view/record/IRecordView$OnRecordActionListener;", "mShouldDirectViewPager", "mStatusBar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "mTableTitleView", "Landroid/widget/TextView;", "mViewPager", "Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager;", "checkIsCurrentLinkRecordDeleted", "newRecords", "", "dismiss", "", "findPositionInRecords", "recordId", "", "getCurrentIndex", "hideKeyboard", "isPro", "notifyDataChanged", "table", "onBackPressed", "onBindData", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "onCurrentLinkRecordDeleted", "onDataChanged", "records", "onDetachedFromWindow", "scrollToField", "topFieldId", "setBackgroundAlpha", "alpha", "", "setCurrentIndex", "setCurrentRecordView", "view", "setData", "setStatusBarAlpha", "setUserVisibleHint", "isVisibleToUser", "startAnim", "enter", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a */
public final class BitableCardViewPager extends FrameLayout implements C4771b.AbstractC4772a, AbstractC7666d {

    /* renamed from: m */
    public static final Companion f13957m = new Companion(null);

    /* renamed from: a */
    public IStatusBar f13958a;

    /* renamed from: b */
    public TextView f13959b;

    /* renamed from: c */
    public BitableCardDragLayout f13960c;

    /* renamed from: d */
    public FixPageTransformerViewPager f13961d;

    /* renamed from: e */
    public C4535b f13962e;

    /* renamed from: f */
    public C4525a f13963f;

    /* renamed from: g */
    public int f13964g;

    /* renamed from: h */
    public int f13965h;

    /* renamed from: i */
    public AbstractC4549f f13966i;

    /* renamed from: j */
    public Runnable f13967j;

    /* renamed from: k */
    public final C4771b f13968k;

    /* renamed from: l */
    public final AbstractC4712d f13969l;

    /* renamed from: n */
    private View f13970n;

    /* renamed from: o */
    private C4739b f13971o;

    /* renamed from: p */
    private final AnimatorSet f13972p = new AnimatorSet();

    /* renamed from: q */
    private boolean f13973q;

    /* renamed from: r */
    private boolean f13974r = true;

    /* renamed from: s */
    private AbstractC4549f.AbstractC4550a f13975s;

    /* renamed from: t */
    private Runnable f13976t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/table/BitableCardViewPager$Companion;", "", "()V", "ANIM_DURATION", "", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$b */
    public static final class RunnableC4731b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13977a;

        RunnableC4731b(BitableCardViewPager aVar) {
            this.f13977a = aVar;
        }

        public final void run() {
            this.f13977a.mo18450a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/table/BitableCardViewPager$onBindData$5", "Lcom/bytedance/ee/bear/bitable/card/view/record/IRecordView$OnRecordActionListener;", "hasScrollToTop", "", "", "onCloseBtnClicked", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$f */
    public static final class C4735f implements AbstractC4549f.AbstractC4550a {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13982a;

        @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f.AbstractC4550a
        /* renamed from: a */
        public void mo17927a() {
            this.f13982a.mo18454a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4735f(BitableCardViewPager aVar) {
            this.f13982a = aVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f.AbstractC4550a
        /* renamed from: a */
        public void mo17928a(boolean z) {
            View view;
            AbstractC4549f fVar = this.f13982a.f13966i;
            if (fVar != null) {
                BitableCardDragLayout a = BitableCardViewPager.m19601a(this.f13982a);
                if (z) {
                    view = fVar.getRootView();
                } else {
                    view = fVar.getTitleBar();
                }
                a.setDragArea(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/table/BitableCardViewPager$onCreateView$1", "Lcom/bytedance/ee/bear/bitable/card/view/table/BitableCardDragLayout$OnDragListener;", "onDragViewPositionChanged", "", "fractionScreen", "", "onFinish", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$h */
    public static final class C4737h implements BitableCardDragLayout.AbstractC4729a {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13984a;

        @Override // com.bytedance.ee.bear.bitable.card.view.table.BitableCardDragLayout.AbstractC4729a
        /* renamed from: a */
        public void mo18448a() {
            this.f13984a.mo18456b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4737h(BitableCardViewPager aVar) {
            this.f13984a = aVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.table.BitableCardDragLayout.AbstractC4729a
        /* renamed from: a */
        public void mo18449a(float f) {
            this.f13984a.setBackgroundAlpha(Math.abs(((float) 1) - f));
        }
    }

    /* renamed from: c */
    public final void mo18457c() {
        C10548d.m43696a(getContext());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$c */
    public static final class RunnableC4732c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13978a;

        RunnableC4732c(BitableCardViewPager aVar) {
            this.f13978a = aVar;
        }

        public final void run() {
            List<C4525a> list;
            BitableCardViewPager aVar = this.f13978a;
            C4535b bVar = aVar.f13962e;
            if (bVar != null) {
                list = bVar.mo17784i();
            } else {
                list = null;
            }
            aVar.mo18453a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$g */
    static final class RunnableC4736g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13983a;

        RunnableC4736g(BitableCardViewPager aVar) {
            this.f13983a = aVar;
        }

        public final void run() {
            BitableCardViewPager.m19602b(this.f13983a).mo45516d();
        }
    }

    /* renamed from: f */
    private final boolean m19607f() {
        C4535b bVar = this.f13962e;
        if (bVar != null) {
            return bVar.mo17789n();
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.C4771b.AbstractC4772a
    public int getCurrentIndex() {
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f13961d;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return fixPageTransformerViewPager.getCurrentItem();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IStatusBar aVar = this.f13958a;
        if (aVar != null) {
            aVar.mo50689b();
        }
    }

    /* renamed from: a */
    public final void mo18450a() {
        C13479a.m54764b("BitableCardViewPager", "current showing record has been deleted");
        Toast.showText(getContext(), (int) R.string.Bitable_Record_DeletedByOtherUser);
        mo18454a(false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        if (m19607f()) {
            this.f13968k.cancelAddRecord();
            return true;
        }
        mo18454a(false);
        return true;
    }

    /* renamed from: d */
    private final void m19605d() {
        C13479a.m54764b("BitableCardViewPager", "onCreateView()...");
        LayoutInflater.from(getContext()).inflate(R.layout.bitable_card_view_pager, this);
        View findViewById = findViewById(R.id.container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.container)");
        this.f13970n = findViewById;
        if (findViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        findViewById.getBackground().mutate();
        View findViewById2 = findViewById(R.id.table_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.table_title)");
        this.f13959b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.bitable_card_view_pager);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.bitable_card_view_pager)");
        this.f13961d = (FixPageTransformerViewPager) findViewById3;
        FragmentActivity f = this.f13969l.mo17873f();
        Intrinsics.checkExpressionValueIsNotNull(f, "mBitableCardDelegate.activity");
        IStatusBar a = StatusBarManager.m55628a(f);
        this.f13958a = a;
        if (a != null) {
            a.mo50687a();
        }
        View findViewById4 = findViewById(R.id.drag_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.drag_layout)");
        BitableCardDragLayout bitableCardDragLayout = (BitableCardDragLayout) findViewById4;
        this.f13960c = bitableCardDragLayout;
        if (bitableCardDragLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragLayout");
        }
        bitableCardDragLayout.setOnDragListener(new C4737h(this));
    }

    /* renamed from: e */
    private final void m19606e() {
        ETableType eTableType;
        int i;
        List<C4525a> i2;
        int i3;
        C13479a.m54764b("BitableCardViewPager", "onBindData()...");
        TextView textView = this.f13959b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTableTitleView");
        }
        C4535b bVar = this.f13962e;
        String str = null;
        if (bVar != null) {
            eTableType = bVar.mo17788m();
        } else {
            eTableType = null;
        }
        int i4 = 0;
        if (eTableType == ETableType.LINK) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f13959b;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTableTitleView");
        }
        C4535b bVar2 = this.f13962e;
        if (bVar2 != null) {
            str = bVar2.mo17770c();
        }
        textView2.setText(str);
        C4739b bVar3 = new C4739b(this.f13968k, this.f13969l);
        this.f13971o = bVar3;
        if (bVar3 != null) {
            bVar3.mo18480a((C4739b.AbstractC4741a) new C4733d(this));
        }
        C4535b bVar4 = this.f13962e;
        if (bVar4 != null) {
            i4 = bVar4.mo17790o();
        }
        this.f13964g = i4;
        C4535b bVar5 = this.f13962e;
        if (!(bVar5 == null || (i2 = bVar5.mo17784i()) == null || i2.size() <= (i3 = this.f13964g))) {
            this.f13963f = i2.get(i3);
        }
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f13961d;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        fixPageTransformerViewPager.setAdapter(this.f13971o);
        FixPageTransformerViewPager fixPageTransformerViewPager2 = this.f13961d;
        if (fixPageTransformerViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        fixPageTransformerViewPager2.mo45501a(true, (FixPageTransformerViewPager.AbstractC11860e) new C4742c());
        FixPageTransformerViewPager fixPageTransformerViewPager3 = this.f13961d;
        if (fixPageTransformerViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        fixPageTransformerViewPager3.mo45500a(new C4734e(this));
        C4535b bVar6 = this.f13962e;
        if (bVar6 != null) {
            mo18453a(bVar6.mo17784i());
        }
        this.f13975s = new C4735f(this);
        mo18454a(true);
    }

    /* renamed from: b */
    public final void mo18456b() {
        String str;
        String str2;
        C13479a.m54764b("BitableCardViewPager", "dismiss()...");
        mo18457c();
        IStatusBar aVar = this.f13958a;
        if (aVar != null) {
            aVar.mo50689b();
        }
        this.f13969l.mo17867b(this);
        this.f13968k.unregisterViewPagerDelegate(this);
        C4771b bVar = this.f13968k;
        C4535b bVar2 = this.f13962e;
        ETableType eTableType = null;
        if (bVar2 != null) {
            str = bVar2.mo17757a();
        } else {
            str = null;
        }
        C4535b bVar3 = this.f13962e;
        if (bVar3 != null) {
            str2 = bVar3.mo17767b();
        } else {
            str2 = null;
        }
        C4535b bVar4 = this.f13962e;
        if (bVar4 != null) {
            eTableType = bVar4.mo17788m();
        }
        bVar.backwardTable(str, str2, eTableType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/table/BitableCardViewPager$onBindData$3", "Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager$OnPageChangeListener;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$e */
    public static final class C4734e implements FixPageTransformerViewPager.AbstractC11859d {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13980a;

        /* renamed from: b */
        private int f13981b;

        @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
        /* renamed from: a */
        public void mo18471a(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4734e(BitableCardViewPager aVar) {
            this.f13980a = aVar;
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
        /* renamed from: b */
        public void mo18472b(int i) {
            if (1 == i) {
                this.f13980a.mo18457c();
            }
            this.f13980a.f13965h = i;
            if (i == 0 && this.f13980a.f13967j != null) {
                Runnable runnable = this.f13980a.f13967j;
                if (runnable != null) {
                    runnable.run();
                }
                this.f13980a.f13967j = null;
            }
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
        /* renamed from: a */
        public void mo18470a(int i) {
            List<C4525a> i2;
            List<C4525a> list;
            ETableType eTableType;
            int i3 = i - this.f13980a.f13964g;
            this.f13981b = i3;
            C4525a aVar = null;
            if (i3 != 0) {
                if (this.f13980a.f13962e != null) {
                    C4535b bVar = this.f13980a.f13962e;
                    if (bVar != null) {
                        list = bVar.mo17784i();
                    } else {
                        list = null;
                    }
                    if (list != null && list.size() > this.f13980a.f13964g) {
                        C4535b bVar2 = this.f13980a.f13962e;
                        if (bVar2 != null) {
                            eTableType = bVar2.mo17788m();
                        } else {
                            eTableType = null;
                        }
                        if (eTableType == ETableType.NORMAL) {
                            C4771b bVar3 = this.f13980a.f13968k;
                            C4525a aVar2 = list.get(this.f13980a.f13964g);
                            Intrinsics.checkExpressionValueIsNotNull(aVar2, "records[mCurrentPos]");
                            String b = aVar2.mo17707b();
                            C4525a aVar3 = list.get(i);
                            Intrinsics.checkExpressionValueIsNotNull(aVar3, "records[position]");
                            bVar3.switchRecord(b, aVar3.mo17707b());
                        }
                        this.f13980a.mo18457c();
                        boolean z = true;
                        if (this.f13981b < 0) {
                            if (i <= 1) {
                                this.f13980a.f13968k.fetchRecordsPagingLeft();
                            }
                        } else if (list.size() - i <= 2) {
                            this.f13980a.f13968k.fetchRecordsPagingRight();
                        }
                        BitableAnalytic i4 = this.f13980a.f13969l.mo17876i();
                        if (this.f13981b >= 0) {
                            z = false;
                        }
                        i4.mo18680a(z);
                    }
                } else {
                    return;
                }
            }
            this.f13980a.f13964g = i;
            BitableCardViewPager aVar4 = this.f13980a;
            C4535b bVar4 = aVar4.f13962e;
            if (!(bVar4 == null || (i2 = bVar4.mo17784i()) == null)) {
                aVar = i2.get(this.f13980a.f13964g);
            }
            aVar4.f13963f = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Lcom/bytedance/ee/bear/bitable/card/view/record/IRecordView;", "onCurrentRecordChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$d */
    public static final class C4733d implements C4739b.AbstractC4741a {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13979a;

        C4733d(BitableCardViewPager aVar) {
            this.f13979a = aVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.table.C4739b.AbstractC4741a
        /* renamed from: a */
        public final void mo18469a(AbstractC4549f fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "view");
            this.f13979a.setCurrentRecordView(fVar);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BitableCardDragLayout m19601a(BitableCardViewPager aVar) {
        BitableCardDragLayout bitableCardDragLayout = aVar.f13960c;
        if (bitableCardDragLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragLayout");
        }
        return bitableCardDragLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ FixPageTransformerViewPager m19602b(BitableCardViewPager aVar) {
        FixPageTransformerViewPager fixPageTransformerViewPager = aVar.f13961d;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return fixPageTransformerViewPager;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m19604c(BitableCardViewPager aVar) {
        TextView textView = aVar.f13959b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTableTitleView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f13961d;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        fixPageTransformerViewPager.post(new RunnableC4736g(this));
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.C4771b.AbstractC4772a
    public void setCurrentIndex(String str) {
        Intrinsics.checkParameterIsNotNull(str, "recordId");
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f13961d;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        if (fixPageTransformerViewPager != null) {
            fixPageTransformerViewPager.mo45497a(mo18455b(str), true);
        }
    }

    public final void setCurrentRecordView(AbstractC4549f fVar) {
        AbstractC4549f fVar2 = this.f13966i;
        if (fVar != fVar2) {
            if (fVar2 != null) {
                fVar2.mo17917b(this.f13975s);
            }
            fVar.mo17913a(this.f13975s);
            this.f13966i = fVar;
        }
    }

    public final void setUserVisibleHint(boolean z) {
        this.f13973q = z;
        if (z) {
            Runnable runnable = this.f13976t;
            if (runnable != null) {
                runnable.run();
            }
            this.f13976t = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/table/BitableCardViewPager$startAnim$1", "Lcom/bytedance/ee/util/ui/AnimationUtils$SimpleAnimatorListener;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.a$i */
    public static final class C4738i extends C13727b.C13735a {

        /* renamed from: a */
        final /* synthetic */ BitableCardViewPager f13985a;

        /* renamed from: b */
        final /* synthetic */ boolean f13986b;

        @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
        public void onAnimationEnd(Animator animator) {
            View view;
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f13986b) {
                AbstractC4549f fVar = this.f13985a.f13966i;
                if (fVar != null) {
                    BitableCardDragLayout a = BitableCardViewPager.m19601a(this.f13985a);
                    if (fVar.mo17915a()) {
                        view = fVar.getRootView();
                    } else {
                        view = fVar.getTitleBar();
                    }
                    a.setDragArea(view);
                }
                this.f13985a.f13969l.mo17876i().mo18685c();
                return;
            }
            this.f13985a.mo18456b();
        }

        @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
        public void onAnimationStart(Animator animator) {
            if (this.f13986b) {
                this.f13985a.setStatusBarAlpha(1.0f);
                return;
            }
            IStatusBar aVar = this.f13985a.f13958a;
            if (aVar != null) {
                aVar.mo50689b();
            }
            if (BitableCardViewPager.m19604c(this.f13985a).getVisibility() == 0) {
                BitableCardViewPager.m19604c(this.f13985a).setVisibility(4);
            }
        }

        C4738i(BitableCardViewPager aVar, boolean z) {
            this.f13985a = aVar;
            this.f13986b = z;
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.C4771b.AbstractC4772a
    /* renamed from: a */
    public void mo18452a(String str) {
        AbstractC4549f fVar;
        if (str != null && (fVar = this.f13966i) != null) {
            fVar.mo17914a(str);
        }
    }

    /* renamed from: b */
    public final int mo18455b(String str) {
        List<C4525a> list;
        int i = 0;
        if (str != null) {
            C4535b bVar = this.f13962e;
            if (bVar != null) {
                list = bVar.mo17784i();
            } else {
                list = null;
            }
            if (list != null) {
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    if (aj.m95020a(t.mo17707b(), str)) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return i;
    }

    public final void setBackgroundAlpha(float f) {
        TextView textView = this.f13959b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTableTitleView");
        }
        textView.setAlpha(f);
        View view = this.f13970n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        Drawable background = view.getBackground();
        Intrinsics.checkExpressionValueIsNotNull(background, "mContainer.background");
        background.setAlpha((int) (((float) 255) * f));
        setStatusBarAlpha(f);
    }

    public final void setData(C4535b bVar) {
        List<C4525a> list;
        C4535b bVar2;
        List<C4525a> i;
        Intrinsics.checkParameterIsNotNull(bVar, "table");
        C13479a.m54764b("BitableCardViewPager", "setData()...");
        this.f13962e = bVar;
        if (bVar != null) {
            list = bVar.mo17784i();
        } else {
            list = null;
        }
        if (list == null || !((bVar2 = this.f13962e) == null || (i = bVar2.mo17784i()) == null || !i.isEmpty())) {
            C13479a.m54758a("BitableCardViewPager", "setData()... records can not be empty!");
            mo18454a(false);
            return;
        }
        m19606e();
    }

    public final void setStatusBarAlpha(float f) {
        ETableType eTableType;
        int i;
        IStatusBar aVar = this.f13958a;
        if (aVar != null) {
            int i2 = (int) (f * ((float) 255));
            Resources resources = getResources();
            C4535b bVar = this.f13962e;
            if (bVar != null) {
                eTableType = bVar.mo17788m();
            } else {
                eTableType = null;
            }
            if (eTableType == ETableType.LINK) {
                i = R.color.bg_body;
            } else {
                i = R.color.bg_base;
            }
            int a = ColorUtils.m55696a(i2, resources.getColor(i));
            Application application = C13615c.f35773a;
            Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
            aVar.mo50688a(a, !UDUiModeUtils.m93319a(application));
        }
    }

    /* renamed from: b */
    private final boolean m19603b(List<? extends C4525a> list) {
        ETableType eTableType;
        String str;
        C4535b bVar = this.f13962e;
        if (bVar != null) {
            eTableType = bVar.mo17788m();
        } else {
            eTableType = null;
        }
        if (eTableType != ETableType.LINK) {
            return false;
        }
        if (list != null) {
            List<? extends C4525a> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                String b = it.next().mo17707b();
                C4525a aVar = this.f13963f;
                if (aVar != null) {
                    str = aVar.mo17707b();
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(b, str)) {
                    return false;
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        if (this.f13973q) {
            mo18450a();
            return true;
        }
        this.f13976t = new RunnableC4731b(this);
        return true;
    }

    /* renamed from: a */
    public final void mo18451a(C4535b bVar) {
        List<C4525a> list;
        C13479a.m54764b("BitableCardViewPager", "notifyDataChanged()... " + this);
        this.f13962e = bVar;
        if (this.f13965h == 0) {
            List<C4525a> list2 = null;
            if (bVar != null) {
                list = bVar.mo17784i();
            } else {
                list = null;
            }
            if (!m19603b(list)) {
                C4535b bVar2 = this.f13962e;
                if (bVar2 != null) {
                    list2 = bVar2.mo17784i();
                }
                mo18453a(list2);
                return;
            }
            return;
        }
        this.f13967j = new RunnableC4732c(this);
    }

    /* renamed from: a */
    public final void mo18453a(List<? extends C4525a> list) {
        C13479a.m54764b("BitableCardViewPager", "onDataChanged()...");
        C4739b bVar = this.f13971o;
        if (bVar != null) {
            bVar.mo18481a((List<C4525a>) list);
        }
        if (this.f13974r) {
            FixPageTransformerViewPager fixPageTransformerViewPager = this.f13961d;
            if (fixPageTransformerViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            fixPageTransformerViewPager.setCurrentItem(this.f13964g);
            this.f13974r = false;
        }
        BitableCardDragLayout bitableCardDragLayout = this.f13960c;
        if (bitableCardDragLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragLayout");
        }
        bitableCardDragLayout.setEnabled(!m19607f());
    }

    /* renamed from: a */
    public final void mo18454a(boolean z) {
        float f;
        float f2;
        if (!this.f13972p.isRunning()) {
            this.f13972p.setDuration(300L);
            Resources system = Resources.getSystem();
            Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
            float f3 = (float) system.getDisplayMetrics().heightPixels;
            BitableCardDragLayout bitableCardDragLayout = this.f13960c;
            if (bitableCardDragLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDragLayout");
            }
            float[] fArr = new float[2];
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = f3;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            fArr[0] = f;
            if (z) {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            fArr[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bitableCardDragLayout, "translationY", fArr);
            View view = this.f13970n;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            }
            float[] fArr2 = new float[2];
            if (z) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = 1.0f;
            }
            fArr2[0] = f2;
            if (z) {
                f4 = 1.0f;
            }
            fArr2[1] = f4;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", fArr2);
            this.f13972p.playTogether(ofFloat, ofFloat2);
            this.f13972p.addListener(new C4738i(this, z));
            this.f13972p.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableCardViewPager(Context context, C4771b bVar, AbstractC4712d dVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "mBitableCardViewModel");
        Intrinsics.checkParameterIsNotNull(dVar, "mBitableCardDelegate");
        this.f13968k = bVar;
        this.f13969l = dVar;
        bVar.registerViewPagerDelegate(this);
        dVar.mo17861a(this);
        m19605d();
    }
}
