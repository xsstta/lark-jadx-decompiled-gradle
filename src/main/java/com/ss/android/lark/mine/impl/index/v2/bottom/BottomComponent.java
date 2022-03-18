package com.ss.android.lark.mine.impl.index.v2.bottom;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45425c;
import com.ss.android.lark.mine.impl.index.v2.ICommonWidget;
import com.ss.android.lark.mine.impl.index.v2.IComponent;
import com.ss.android.lark.mine.impl.index.v2.bottom.BottomView;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\u0016\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002!\"B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/IComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/ICommonWidget;", "mContext", "Landroid/app/Activity;", "mBottomDependency", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency;)V", "layoutId", "", "getLayoutId", "()I", "getMBottomDependency", "()Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency;", "getMContext", "()Landroid/app/Activity;", "model", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomModel;", "view", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomView;", "viewDependency", "com/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$viewDependency$1", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$viewDependency$1;", "getComponentType", "launchOnCallChatNoLocation", "", "onCallId", "", "launchOnCallChatWithLocation", "onCreate", "onShow", "reload", "Companion", "IBottomDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BottomComponent extends Widget implements IComponent, ICommonWidget {

    /* renamed from: c */
    public static final Companion f115289c = new Companion(null);

    /* renamed from: a */
    public BottomView f115290a;

    /* renamed from: b */
    public BottomModel f115291b;

    /* renamed from: d */
    private final C45658d f115292d = new C45658d(this);

    /* renamed from: e */
    private final Activity f115293e;

    /* renamed from: f */
    private final IBottomDependency f115294f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency;", "", "checkLocationPermission", "", "callback", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency$ILocationPermissionResultCallback;", "onGotoOtherPage", "ILocationPermissionResultCallback", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent$b */
    public interface IBottomDependency {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency$ILocationPermissionResultCallback;", "", "onResult", "", "isGranted", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent$b$a */
        public interface ILocationPermissionResultCallback {
            /* renamed from: a */
            void mo160778a(boolean z);
        }

        /* renamed from: a */
        void mo160776a();

        /* renamed from: a */
        void mo160777a(ILocationPermissionResultCallback aVar);
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
        return R.layout.fragment_mine_v2_bottom;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Activity mo121985c() {
        return this.f115293e;
    }

    /* renamed from: f */
    public final IBottomDependency mo160775f() {
        return this.f115294f;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        Activity activity = this.f115293e;
        if (activity != null) {
            AbstractC1142af a = aj.m5366a((FragmentActivity) activity).mo6005a(BottomViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(mC…tomViewModel::class.java)");
            BottomViewModel aVar = (BottomViewModel) a;
            Activity activity2 = this.f115293e;
            View K = mo141184K();
            if (K == null) {
                Intrinsics.throwNpe();
            }
            this.f115290a = new BottomView(activity2, K, aVar, this.f115292d);
            this.f115291b = new BottomModel(aVar);
            WidgetManager a2 = WidgetManager.f99047e.mo141220a(this);
            BottomView bottomView = this.f115290a;
            if (bottomView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            WidgetManager a3 = a2.mo141214a(bottomView);
            BottomModel bottomModel = this.f115291b;
            if (bottomModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("model");
            }
            a3.mo141214a(bottomModel);
            BottomModel bottomModel2 = this.f115291b;
            if (bottomModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("model");
            }
            bottomModel2.mo160783a();
            Log.m165389i("Mine_BottomComponent", "init bottom component on" + getLifecycle().getCurrentState().name());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$viewDependency$1", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomView$IViewDependency;", "gotoOnCallChat", "", "chatId", "", "makePhoneCall", "phoneNum", "onClickOnCall", "onCallId", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent$d */
    public static final class C45658d implements BottomView.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ BottomComponent f115297a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45658d(BottomComponent bottomComponent) {
            this.f115297a = bottomComponent;
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.bottom.BottomView.IViewDependency
        /* renamed from: b */
        public void mo160781b(String str) {
            C45421b.m180420a().mo133435a(this.f115297a.mo121985c(), str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$viewDependency$1$onClickOnCall$1", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency$ILocationPermissionResultCallback;", "onResult", "", "isGranted", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent$d$a */
        public static final class C45659a implements IBottomDependency.ILocationPermissionResultCallback {

            /* renamed from: a */
            final /* synthetic */ C45658d f115298a;

            /* renamed from: b */
            final /* synthetic */ String f115299b;

            @Override // com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent.IBottomDependency.ILocationPermissionResultCallback
            /* renamed from: a */
            public void mo160778a(boolean z) {
                if (z) {
                    BottomComponent bottomComponent = this.f115298a.f115297a;
                    String str = this.f115299b;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    bottomComponent.mo160774b(str);
                }
            }

            C45659a(C45658d dVar, String str) {
                this.f115298a = dVar;
                this.f115299b = str;
            }
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.bottom.BottomView.IViewDependency
        /* renamed from: c */
        public void mo160782c(String str) {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            a.mo133459r().mo133508a(this.f115297a.mo121985c(), str);
            this.f115297a.mo160775f().mo160776a();
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.bottom.BottomView.IViewDependency
        /* renamed from: a */
        public void mo160780a(String str) {
            String b = BottomComponent.m181035a(this.f115297a).mo160786b();
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            if (NetworkUtils.getNetworkTypeFast(a.mo133443c()) == NetworkUtils.NetworkType.NONE && !TextUtils.isEmpty(b)) {
                BottomComponent.m181036b(this.f115297a).mo160792a(b);
            } else if (!TextUtils.isEmpty(str)) {
                if (!BottomComponent.m181035a(this.f115297a).mo121985c()) {
                    BottomComponent bottomComponent = this.f115297a;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    bottomComponent.mo160773a(str);
                    return;
                }
                this.f115297a.mo160775f().mo160777a(new C45659a(this, str));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$launchOnCallChatWithLocation$locationResult$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/mine/dto/LocationData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "locationData", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent$c */
    public static final class C45657c implements IGetDataCallback<C45425c> {

        /* renamed from: a */
        final /* synthetic */ BottomComponent f115295a;

        /* renamed from: b */
        final /* synthetic */ String f115296b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("Mine_BottomComponent", errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(C45425c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "locationData");
            float a = (float) cVar.mo160295a();
            float b = (float) cVar.mo160296b();
            Log.m165379d("Mine_BottomComponent", "longitude = " + a + " , latitude = " + b);
            BottomComponent.m181035a(this.f115295a).mo160785a(this.f115296b, a, b);
        }

        C45657c(BottomComponent bottomComponent, String str) {
            this.f115295a = bottomComponent;
            this.f115296b = str;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BottomModel m181035a(BottomComponent bottomComponent) {
        BottomModel bottomModel = bottomComponent.f115291b;
        if (bottomModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        return bottomModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ BottomView m181036b(BottomComponent bottomComponent) {
        BottomView bottomView = bottomComponent.f115290a;
        if (bottomView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        return bottomView;
    }

    /* renamed from: a */
    public final void mo160773a(String str) {
        BottomModel bottomModel = this.f115291b;
        if (bottomModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        bottomModel.mo160784a(str);
    }

    /* renamed from: b */
    public final void mo160774b(String str) {
        if (!C45421b.m180420a().mo133440a(new C45657c(this, str))) {
            Log.m165389i("Mine_BottomComponent", "location failed");
        }
    }

    public BottomComponent(Activity activity, IBottomDependency bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mBottomDependency");
        this.f115293e = activity;
        this.f115294f = bVar;
    }
}
