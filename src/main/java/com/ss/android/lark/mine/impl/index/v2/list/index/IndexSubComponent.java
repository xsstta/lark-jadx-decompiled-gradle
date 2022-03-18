package com.ss.android.lark.mine.impl.index.v2.list.index;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/index/IndexSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "context", "Landroid/content/Context;", "dependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/index/IndexSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/list/index/IndexSubComponent$IDependency;)V", "getContext", "()Landroid/content/Context;", "loginDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "getLoginDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "loginDependency$delegate", "Lkotlin/Lazy;", "profileDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IProfileDependency;", "getProfileDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IProfileDependency;", "profileDependency$delegate", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "onCreate", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IndexSubComponent extends BaseSubComponent {

    /* renamed from: a */
    public final IDependency f115407a;

    /* renamed from: b */
    private final Lazy f115408b = LazyKt.lazy(C45705d.INSTANCE);

    /* renamed from: c */
    private final Lazy f115409c = LazyKt.lazy(C45704c.INSTANCE);

    /* renamed from: d */
    private final Context f115410d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/index/IndexSubComponent$IDependency;", "", "onOpenMineIndex", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.index.IndexSubComponent$a */
    public interface IDependency {
        /* renamed from: a */
        void mo160812a();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1008;
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        return true;
    }

    /* renamed from: f */
    public final AbstractC45399a.AbstractC45415p mo160856f() {
        return (AbstractC45399a.AbstractC45415p) this.f115408b.getValue();
    }

    /* renamed from: g */
    public final AbstractC45399a.AbstractC45410k mo160857g() {
        return (AbstractC45399a.AbstractC45410k) this.f115409c.getValue();
    }

    /* renamed from: i */
    public final Context mo160858i() {
        return this.f115410d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.index.IndexSubComponent$c */
    static final class C45704c extends Lambda implements Function0<AbstractC45399a.AbstractC45410k> {
        public static final C45704c INSTANCE = new C45704c();

        C45704c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45410k invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133458q();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IProfileDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.index.IndexSubComponent$d */
    static final class C45705d extends Lambda implements Function0<AbstractC45399a.AbstractC45415p> {
        public static final C45705d INSTANCE = new C45705d();

        C45705d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45415p invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133463v();
        }
    }

    /* renamed from: j */
    private final void m181190j() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new View$OnClickListenerC45703b(this));
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115410d).inflate(R.layout.sidebar_index, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181190j();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.index.IndexSubComponent$b */
    public static final class View$OnClickListenerC45703b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IndexSubComponent f115411a;

        View$OnClickListenerC45703b(IndexSubComponent indexSubComponent) {
            this.f115411a = indexSubComponent;
        }

        public final void onClick(View view) {
            AbstractC45399a.AbstractC45410k g = this.f115411a.mo160857g();
            Intrinsics.checkExpressionValueIsNotNull(g, "loginDependency");
            String e = g.mo133504e();
            MineHitPoint.m181468a("profile_detail", "profile_main_view");
            if (!TextUtils.isEmpty(e) && this.f115411a.mo160858i() != null) {
                this.f115411a.mo160856f().mo133530a(this.f115411a.mo160858i(), e);
            }
            this.f115411a.f115407a.mo160812a();
        }
    }

    public IndexSubComponent(Context context, IDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f115410d = context;
        this.f115407a = aVar;
    }
}
