package com.ss.android.lark.mine.impl.index.v2.list.join_team;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.common.MineUtils;
import com.ss.android.lark.mine.impl.index.v2.container.HostViewModel;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.JoinTeamHitPoint;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u000201B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020+H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00062"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "mContext", "Landroid/content/Context;", "mHostVM", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$IDependency;)V", "getMContext", "()Landroid/content/Context;", "getMDependency", "()Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$IDependency;", "mFeatureGatingDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "getMFeatureGatingDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "mFeatureGatingDependency$delegate", "Lkotlin/Lazy;", "mJoinTeamTV", "Landroid/widget/TextView;", "getMJoinTeamTV", "()Landroid/widget/TextView;", "setMJoinTeamTV", "(Landroid/widget/TextView;)V", "mJoinTeamUpdateTip", "Landroid/widget/ImageView;", "getMJoinTeamUpdateTip", "()Landroid/widget/ImageView;", "setMJoinTeamUpdateTip", "(Landroid/widget/ImageView;)V", "mLoginDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "getMLoginDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "mLoginDependency$delegate", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "isJoinTeamTipShow", "markJoinTeamTipHide", "onCreate", "openDispatchNextPage", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class JoinTeamSubComponent extends BaseSubComponent {

    /* renamed from: a */
    public static final Companion f115412a = new Companion(null);

    /* renamed from: b */
    private final Lazy f115413b = LazyKt.lazy(C45708e.INSTANCE);

    /* renamed from: c */
    private final Lazy f115414c = LazyKt.lazy(C45707d.INSTANCE);

    /* renamed from: d */
    private final Context f115415d;

    /* renamed from: e */
    private final HostViewModel f115416e;

    /* renamed from: f */
    private final IDependency f115417f;
    @BindView(7184)
    public TextView mJoinTeamTV;
    @BindView(7185)
    public ImageView mJoinTeamUpdateTip;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$IDependency;", "", "openJoinTeamPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160816a();
    }

    /* renamed from: l */
    private final AbstractC45399a.AbstractC45410k m181198l() {
        return (AbstractC45399a.AbstractC45410k) this.f115413b.getValue();
    }

    /* renamed from: m */
    private final AbstractC45399a.AbstractC45405f m181199m() {
        return (AbstractC45399a.AbstractC45405f) this.f115414c.getValue();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1004;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k */
    public final IDependency mo160864k() {
        return this.f115417f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$d */
    static final class C45707d extends Lambda implements Function0<AbstractC45399a.AbstractC45405f> {
        public static final C45707d INSTANCE = new C45707d();

        C45707d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45405f invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133451j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$e */
    static final class C45708e extends Lambda implements Function0<AbstractC45399a.AbstractC45410k> {
        public static final C45708e INSTANCE = new C45708e();

        C45708e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45410k invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133458q();
        }
    }

    /* renamed from: n */
    private final boolean m181200n() {
        return MineUtils.f114995a.mo160279a().getBoolean("key_mine_join_team_tip_show", true);
    }

    /* renamed from: f */
    public final ImageView mo160860f() {
        ImageView imageView = this.mJoinTeamUpdateTip;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mJoinTeamUpdateTip");
        }
        return imageView;
    }

    /* renamed from: i */
    public final void mo160862i() {
        MineUtils.f114995a.mo160279a().putBoolean("key_mine_join_team_tip_show", false);
    }

    /* renamed from: j */
    public final void mo160863j() {
        JoinTeamHitPoint.f115571a.mo161016a();
        m181198l().mo133499a(this.f115415d, "mine", new C45710g(this));
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        if (m181199m().mo133481a("lark.tenant.avatarmenu.jointeam.show") && !m181198l().mo133503d()) {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            AbstractC45399a.AbstractC45404e k = a.mo133452k();
            Intrinsics.checkExpressionValueIsNotNull(k, "MineModule.getDependency().dynamicDependency");
            if (k.mo133482a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115415d).inflate(R.layout.sidebar_join_team, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        mo160861g();
        this.f115416e.getTenentInfos().mo5923a(this, new C45709f(this));
        Log.m165389i("Mine_JoinTeamSubComponent", "init join team sub component on " + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    /* renamed from: g */
    public final void mo160861g() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new View$OnClickListenerC45706c(this));
        }
        if (mo160829b()) {
            TextView textView = this.mJoinTeamTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mJoinTeamTV");
            }
            textView.setText(R.string.Lark_Login_UseByOrgs);
            int i = 0;
            if (m181198l().mo133501b()) {
                boolean n = m181200n();
                ImageView imageView = this.mJoinTeamUpdateTip;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mJoinTeamUpdateTip");
                }
                if (!n) {
                    i = 8;
                }
                imageView.setVisibility(i);
            } else if (m181198l().mo133502c()) {
                boolean n2 = m181200n();
                ImageView imageView2 = this.mJoinTeamUpdateTip;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mJoinTeamUpdateTip");
                }
                if (!n2) {
                    i = 8;
                }
                imageView2.setVisibility(i);
            } else {
                ImageView imageView3 = this.mJoinTeamUpdateTip;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mJoinTeamUpdateTip");
                }
                imageView3.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$openDispatchNextPage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$g */
    public static final class C45710g implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ JoinTeamSubComponent f115420a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45710g(JoinTeamSubComponent joinTeamSubComponent) {
            this.f115420a = joinTeamSubComponent;
        }

        /* renamed from: a */
        public void mo160867a(boolean z) {
            if (z) {
                this.f115420a.mo160864k().mo160816a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo160867a(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$f */
    static final class C45709f<T> implements AbstractC1178x<List<TenantInfo>> {

        /* renamed from: a */
        final /* synthetic */ JoinTeamSubComponent f115419a;

        C45709f(JoinTeamSubComponent joinTeamSubComponent) {
            this.f115419a = joinTeamSubComponent;
        }

        /* renamed from: a */
        public final void onChanged(List<TenantInfo> list) {
            this.f115419a.mo121985c();
            this.f115419a.mo160861g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent$c */
    public static final class View$OnClickListenerC45706c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinTeamSubComponent f115418a;

        View$OnClickListenerC45706c(JoinTeamSubComponent joinTeamSubComponent) {
            this.f115418a = joinTeamSubComponent;
        }

        public final void onClick(View view) {
            this.f115418a.mo160863j();
            this.f115418a.mo160860f().setVisibility(8);
            this.f115418a.mo160862i();
            MineHitPoint.m181467a("join_or_create_team");
        }
    }

    public JoinTeamSubComponent(Context context, HostViewModel aVar, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mHostVM");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f115415d = context;
        this.f115416e = aVar;
        this.f115417f = bVar;
    }
}
