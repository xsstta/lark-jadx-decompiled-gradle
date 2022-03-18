package com.ss.android.lark.mine.impl.index.v2.list.feishu_event;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.p2278a.C45800a;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020 H\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/feishu_event/FeishuEventSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mBrowserDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IBrowserDependency;", "kotlin.jvm.PlatformType", "getMBrowserDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IBrowserDependency;", "mBrowserDependency$delegate", "Lkotlin/Lazy;", "getMContext", "()Landroid/content/Context;", "mFeatureGatingDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "getMFeatureGatingDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "mFeatureGatingDependency$delegate", "mRewardBadge", "Landroid/widget/ImageView;", "getMRewardBadge", "()Landroid/widget/ImageView;", "setMRewardBadge", "(Landroid/widget/ImageView;)V", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "initView", "onCreate", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeishuEventSubComponent extends BaseSubComponent {

    /* renamed from: a */
    public static final Companion f115401a = new Companion(null);

    /* renamed from: b */
    private final Lazy f115402b = LazyKt.lazy(C45701c.INSTANCE);

    /* renamed from: c */
    private final Lazy f115403c = LazyKt.lazy(C45702d.INSTANCE);

    /* renamed from: d */
    private final Context f115404d;
    @BindView(7622)
    public ImageView mRewardBadge;

    /* renamed from: k */
    private final AbstractC45399a.AbstractC45405f m181181k() {
        return (AbstractC45399a.AbstractC45405f) this.f115403c.getValue();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1000;
    }

    /* renamed from: f */
    public final AbstractC45399a.AbstractC45400a mo160851f() {
        return (AbstractC45399a.AbstractC45400a) this.f115402b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/feishu_event/FeishuEventSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.feishu_event.FeishuEventSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: l */
    private final void m181182l() {
        mo160853i();
    }

    /* renamed from: j */
    public final Context mo160854j() {
        return this.f115404d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IBrowserDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.feishu_event.FeishuEventSubComponent$c */
    static final class C45701c extends Lambda implements Function0<AbstractC45399a.AbstractC45400a> {
        public static final C45701c INSTANCE = new C45701c();

        C45701c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45400a invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133455n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.feishu_event.FeishuEventSubComponent$d */
    static final class C45702d extends Lambda implements Function0<AbstractC45399a.AbstractC45405f> {
        public static final C45702d INSTANCE = new C45702d();

        C45702d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45405f invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133451j();
        }
    }

    /* renamed from: g */
    public final ImageView mo160852g() {
        ImageView imageView = this.mRewardBadge;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRewardBadge");
        }
        return imageView;
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        boolean z;
        if (m181181k().mo133481a("activity.award.enable") || m181181k().mo133481a("invite.member.award.enable") || m181181k().mo133481a("invite.external.award.enable")) {
            z = true;
        } else {
            z = false;
        }
        String string = UserSP.getInstance().getString("key_param_activity_banner_url", "");
        StringBuilder sb = new StringBuilder();
        sb.append("isRewardActivityEnabled  fg-> ");
        sb.append(z);
        sb.append(" ");
        String str = string;
        sb.append(TextUtils.isEmpty(str));
        Log.m165389i("Mine_EventSubComponent", sb.toString());
        if (TextUtils.isEmpty(str) || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115404d).inflate(R.layout.sidebar_event, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181182l();
        Log.m165389i("Mine_EventSubComponent", "init event sub component on " + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    /* renamed from: i */
    public final void mo160853i() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new View$OnClickListenerC45700b(this));
        }
        boolean b = mo160829b();
        if (b) {
            int i = 0;
            boolean z = !C57744a.m224104a().getBoolean("key_param_redbot_hide", false);
            Log.m165389i("Mine_EventSubComponent", "judgeShowRewardLayout rewardRedBotVisible -> " + b);
            ImageView imageView = this.mRewardBadge;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRewardBadge");
            }
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public FeishuEventSubComponent(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f115404d = context;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.feishu_event.FeishuEventSubComponent$b */
    public static final class View$OnClickListenerC45700b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeishuEventSubComponent f115405a;

        View$OnClickListenerC45700b(FeishuEventSubComponent feishuEventSubComponent) {
            this.f115405a = feishuEventSubComponent;
        }

        public final void onClick(View view) {
            C45800a.m181470a();
            if (!C57744a.m224104a().getBoolean("key_param_redbot_hide", false)) {
                this.f115405a.mo160852g().setVisibility(8);
                C57744a.m224104a().putBoolean("key_param_redbot_hide", true);
            }
            String string = UserSP.getInstance().getString("key_param_activity_banner_url", "");
            if (!TextUtils.isEmpty(string)) {
                this.f115405a.mo160851f().mo133492a(this.f115405a.mo160854j(), string);
            }
        }
    }
}
