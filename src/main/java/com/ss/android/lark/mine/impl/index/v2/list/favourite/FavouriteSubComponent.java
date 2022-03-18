package com.ss.android.lark.mine.impl.index.v2.list.favourite;

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
import com.ss.android.lark.mine.impl.statistics.favourite.FavouriteHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/favourite/FavouriteSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/favourite/FavouriteSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/list/favourite/FavouriteSubComponent$IDependency;)V", "mChatModuleDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "getMChatModuleDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "mChatModuleDependency$delegate", "Lkotlin/Lazy;", "getMContext", "()Landroid/content/Context;", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "onCreate", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FavouriteSubComponent extends BaseSubComponent {

    /* renamed from: b */
    public static final Companion f115396b = new Companion(null);

    /* renamed from: a */
    public final IDependency f115397a;

    /* renamed from: c */
    private final Lazy f115398c = LazyKt.lazy(C45699d.INSTANCE);

    /* renamed from: d */
    private final Context f115399d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/favourite/FavouriteSubComponent$IDependency;", "", "openFavourite", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.favourite.FavouriteSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160814a();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1002;
    }

    /* renamed from: f */
    public final AbstractC45399a.AbstractC45401b mo160848f() {
        return (AbstractC45399a.AbstractC45401b) this.f115398c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/favourite/FavouriteSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.favourite.FavouriteSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final Context mo160849g() {
        return this.f115399d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.favourite.FavouriteSubComponent$d */
    static final class C45699d extends Lambda implements Function0<AbstractC45399a.AbstractC45401b> {
        public static final C45699d INSTANCE = new C45699d();

        C45699d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45401b invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133459r();
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        return a.mo133447f();
    }

    /* renamed from: i */
    private final void m181174i() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new View$OnClickListenerC45698c(this));
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115399d).inflate(R.layout.sidebar_favourite, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181174i();
        Log.m165389i("Mine_FavSubComponent", "init favourite sub component on " + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.favourite.FavouriteSubComponent$c */
    public static final class View$OnClickListenerC45698c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FavouriteSubComponent f115400a;

        View$OnClickListenerC45698c(FavouriteSubComponent favouriteSubComponent) {
            this.f115400a = favouriteSubComponent;
        }

        public final void onClick(View view) {
            this.f115400a.mo160848f().mo133507a(this.f115400a.mo160849g());
            FavouriteHitPoint.f115574a.mo161017a();
            this.f115400a.f115397a.mo160814a();
            MineHitPoint.m181467a("favorite");
        }
    }

    public FavouriteSubComponent(Context context, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f115399d = context;
        this.f115397a = bVar;
    }
}
