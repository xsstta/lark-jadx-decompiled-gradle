package com.ss.android.lark.mine.impl.index.v2.list.contact_us;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent$IDependency;)V", "mChatModuleDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "getMChatModuleDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "mChatModuleDependency$delegate", "Lkotlin/Lazy;", "getMContext", "()Landroid/content/Context;", "mILoginDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "getMILoginDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "mILoginDependency$delegate", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "isCustomer", "onCreate", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedHelpSubComponent extends BaseSubComponent {

    /* renamed from: b */
    public static final Companion f115373b = new Companion(null);

    /* renamed from: a */
    public final IDependency f115374a;

    /* renamed from: c */
    private final Lazy f115375c = LazyKt.lazy(C45690e.INSTANCE);

    /* renamed from: d */
    private final Lazy f115376d = LazyKt.lazy(C45689d.INSTANCE);

    /* renamed from: e */
    private final Context f115377e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent$IDependency;", "", "openCustomServiceChat", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160817a();
    }

    /* renamed from: i */
    private final AbstractC45399a.AbstractC45410k m181144i() {
        return (AbstractC45399a.AbstractC45410k) this.f115375c.getValue();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1005;
    }

    /* renamed from: f */
    public final AbstractC45399a.AbstractC45401b mo160837f() {
        return (AbstractC45399a.AbstractC45401b) this.f115376d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final Context mo160838g() {
        return this.f115377e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent$d */
    static final class C45689d extends Lambda implements Function0<AbstractC45399a.AbstractC45401b> {
        public static final C45689d INSTANCE = new C45689d();

        C45689d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45401b invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133459r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent$e */
    static final class C45690e extends Lambda implements Function0<AbstractC45399a.AbstractC45410k> {
        public static final C45690e INSTANCE = new C45690e();

        C45690e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45410k invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133458q();
        }
    }

    /* renamed from: k */
    private final boolean m181146k() {
        return m181144i().mo133501b();
    }

    /* renamed from: j */
    private final void m181145j() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new C45688c(this));
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        if (!m181146k()) {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            if (a.mo133448g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115377e).inflate(R.layout.sidebar_contact_us, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181145j();
        Log.m165389i("Mine_FeedHelpSubComponent", "init feed help sub component on " + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent$c */
    public static final class C45688c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedHelpSubComponent f115378a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45688c(FeedHelpSubComponent feedHelpSubComponent) {
            this.f115378a = feedHelpSubComponent;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f115378a.mo160837f().mo133512b(this.f115378a.mo160838g());
            this.f115378a.f115374a.mo160817a();
            MineHitPoint.m181467a("help");
        }
    }

    public FeedHelpSubComponent(Context context, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f115377e = context;
        this.f115374a = bVar;
    }
}
