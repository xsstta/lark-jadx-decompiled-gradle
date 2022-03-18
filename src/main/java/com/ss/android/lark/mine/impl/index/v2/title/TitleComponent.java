package com.ss.android.lark.mine.impl.index.v2.title;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45398a;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusActivity;
import com.ss.android.lark.mine.impl.index.v2.ICommonWidget;
import com.ss.android.lark.mine.impl.index.v2.IComponent;
import com.ss.android.lark.mine.impl.index.v2.container.HostViewModel;
import com.ss.android.lark.mine.impl.index.v2.title.TitleView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002 !B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\fH\u0016J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/IComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/ICommonWidget;", "mContext", "Landroid/app/Activity;", "mHostVM", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "mTitleDependency", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent$ITitleDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent$ITitleDependency;)V", "layoutId", "", "getLayoutId", "()I", "getMContext", "()Landroid/app/Activity;", "model", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleModel;", "view", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView;", "viewDependency", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView$IViewDependency;", "getComponentType", "noticeShowMintTip", "", "canShow", "", "onCreate", "onResume", "onShow", "reload", "Companion", "ITitleDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitleComponent extends Widget implements IComponent, ICommonWidget {

    /* renamed from: c */
    public static final Companion f115442c = new Companion(null);

    /* renamed from: a */
    public TitleModel f115443a;

    /* renamed from: b */
    public final ITitleDependency f115444b;

    /* renamed from: d */
    private TitleView f115445d;

    /* renamed from: e */
    private final TitleView.IViewDependency f115446e = new C45719c(this);

    /* renamed from: f */
    private final Activity f115447f;

    /* renamed from: g */
    private final HostViewModel f115448g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent$ITitleDependency;", "", "isFragmentAdded", "", "()Z", "onGotoOtherPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleComponent$b */
    public interface ITitleDependency {
        /* renamed from: a */
        void mo160805a();

        /* renamed from: b */
        boolean mo160806b();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void ba_() {
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void bb_() {
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.fragment_mine_title;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Activity mo121985c() {
        return this.f115447f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0019"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleComponent$viewDependency$1", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView$IViewDependency;", "isFragmentAdd", "", "()Z", "gotoPreviewAvatar", "", "context", "Landroid/content/Context;", "avatarKey", "", "entityId", "avatarView", "Landroid/widget/ImageView;", "gotoStatusSet", "chatterDescription", "Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "onClickDeleteWorkStatus", "openMineInfoPage", "openTenantCertificationUrl", "url", "openUserCustomStatusHomePage", "openZenSettingActivity", "mContext", "Landroid/app/Activity;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleComponent$c */
    public static final class C45719c implements TitleView.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ TitleComponent f115449a;

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleView.IViewDependency
        /* renamed from: a */
        public void mo160880a() {
            TitleComponent.m181240a(this.f115449a).mo160892h();
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleView.IViewDependency
        /* renamed from: b */
        public boolean mo160885b() {
            return this.f115449a.f115444b.mo160806b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45719c(TitleComponent titleComponent) {
            this.f115449a = titleComponent;
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleView.IViewDependency
        /* renamed from: a */
        public void mo160881a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "mContext");
            C45421b.m180420a().mo133441b(activity);
            this.f115449a.f115444b.mo160805a();
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleView.IViewDependency
        /* renamed from: b */
        public void mo160884b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            UserCustomStatusActivity.f115049a.mo160381a(this.f115449a.mo121985c());
            this.f115449a.f115444b.mo160805a();
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleView.IViewDependency
        /* renamed from: a */
        public void mo160882a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C45398a.m180319a(context);
            this.f115449a.f115444b.mo160805a();
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleView.IViewDependency
        /* renamed from: a */
        public void mo160883a(Context context, ChatterDescription chatterDescription) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(chatterDescription, "chatterDescription");
            C45398a.m180322a(context, chatterDescription);
            this.f115449a.f115444b.mo160805a();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: u */
    public void mo123361u() {
        super.mo123361u();
        TitleModel titleModel = this.f115443a;
        if (titleModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        titleModel.mo160891g();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        Activity activity = this.f115447f;
        if (activity != null) {
            AbstractC1142af a = aj.m5366a((FragmentActivity) activity).mo6005a(TitleViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(mC…tleViewModel::class.java)");
            HashMap hashMap = new HashMap();
            hashMap.put(0, this.f115448g);
            hashMap.put(1, (TitleViewModel) a);
            Activity activity2 = this.f115447f;
            View K = mo141184K();
            if (K == null) {
                Intrinsics.throwNpe();
            }
            this.f115445d = new TitleView(activity2, K, hashMap, this.f115446e);
            this.f115443a = new TitleModel(hashMap);
            WidgetManager a2 = WidgetManager.f99047e.mo141220a(this);
            TitleView titleView = this.f115445d;
            if (titleView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            WidgetManager a3 = a2.mo141214a(titleView);
            TitleModel titleModel = this.f115443a;
            if (titleModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("model");
            }
            a3.mo141214a(titleModel);
            TitleModel titleModel2 = this.f115443a;
            if (titleModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("model");
            }
            titleModel2.mo160890f();
            Log.m165389i("Mine_TitleComponent", "init title component on" + getLifecycle().getCurrentState().name());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ TitleModel m181240a(TitleComponent titleComponent) {
        TitleModel titleModel = titleComponent.f115443a;
        if (titleModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        return titleModel;
    }

    /* renamed from: a */
    public final void mo160879a(boolean z) {
        if (z) {
            TitleView titleView = this.f115445d;
            if (titleView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            titleView.mo160918n();
            return;
        }
        TitleView titleView2 = this.f115445d;
        if (titleView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        titleView2.mo160919p();
    }

    public TitleComponent(Activity activity, HostViewModel aVar, ITitleDependency bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mHostVM");
        Intrinsics.checkParameterIsNotNull(bVar, "mTitleDependency");
        this.f115447f = activity;
        this.f115448g = aVar;
        this.f115444b = bVar;
    }
}
