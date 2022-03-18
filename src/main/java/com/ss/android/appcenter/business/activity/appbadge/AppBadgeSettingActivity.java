package com.ss.android.appcenter.business.activity.appbadge;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.larkbrand.permission.C13296g;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.footer.FalsifyFooter;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.appcenter.business.activity.appbadge.adapter.AppBadgeSettingAdapter;
import com.ss.android.appcenter.business.activity.appsetting.LittleAppPermissionData;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.badge.AppBadgeSettingData;
import com.ss.android.appcenter.business.net.badge.AppBadgeSettingInfo;
import com.ss.android.appcenter.business.net.badge.AppBadgeSettingResponse;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27568a;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.base.BaseActivity;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.biz.WorkplaceErrorView;
import com.ss.android.appcenter.common.view.biz.WorkplaceGuideView;
import com.ss.android.appcenter.common.view.biz.WorkplaceLoadingView;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0002\u0007\n\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0003345B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J(\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0014\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0018\u0010)\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\"\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u00020\u000fH\u0003J\"\u00102\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity;", "Lcom/ss/android/appcenter/common/base/BaseActivity;", "Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter$OnBadgeSettingChangedListener;", "()V", "adapter", "Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter;", "callback", "com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$callback$1", "Lcom/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$callback$1;", "callbackMore", "com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$callbackMore$1", "Lcom/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$callbackMore$1;", "gson", "Lcom/google/gson/Gson;", "loading", "", "pageToken", "", "statusCtrl", "Lcom/ss/android/appcenter/business/view/StatusController;", "addData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingInfo;", "initView", "onBadgeSettingChanged", "buttonView", "Landroid/widget/CompoundButton;", "badgeInfo", "checked", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "parseJson", "Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingResponse;", "jsonStr", "queryData", "refreshData", "setData", "statusContent", "statusEmpty", "statusError", "statusLoading", "syncAppBadgePermission", "appId", "appName", "needShow", "syncAppBadgeSetting", "BadgePermissionSyncCallback", "Companion", "IBadgePermissionSyncCallback", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppBadgeSettingActivity extends BaseActivity implements AppBadgeSettingAdapter.OnBadgeSettingChangedListener {

    /* renamed from: c */
    public static final Companion f68883c = new Companion(null);

    /* renamed from: a */
    public String f68884a;

    /* renamed from: b */
    public boolean f68885b;

    /* renamed from: d */
    private AppBadgeSettingAdapter f68886d;

    /* renamed from: e */
    private StatusController f68887e;

    /* renamed from: f */
    private final Gson f68888f = new Gson();

    /* renamed from: g */
    private C27612c f68889g = new C27612c(this);

    /* renamed from: h */
    private C27615d f68890h = new C27615d(this);

    /* renamed from: i */
    private HashMap f68891i;

    /* renamed from: a */
    public Context mo98346a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo98347a(int i) {
        if (this.f68891i == null) {
            this.f68891i = new HashMap();
        }
        View view = (View) this.f68891i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f68891i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo98349a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m100769a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m100767a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo98356d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo98357e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo98358f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m100773c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m100768a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m100771b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo98362a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "ctx");
            context.startActivity(new Intent(context, AppBadgeSettingActivity.class));
        }
    }

    /* renamed from: a */
    public final void mo98351a(List<AppBadgeSettingInfo> list) {
        C27710b.m101253a(list != null ? list.size() : 0);
        C27568a.m100616b(list, true, "");
        if (list == null) {
            m100776j();
            return;
        }
        m100777k();
        AppBadgeSettingAdapter aVar = this.f68886d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo98376a(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$callback$1", "Lcom/ss/android/appcenter/business/net/base/Service$ICallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/appcenter/business/net/base/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$c */
    public static final class C27612c implements C27714b.AbstractC27716a {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68895a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$c$a */
        static final class RunnableC27613a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27612c f68896a;

            RunnableC27613a(C27612c cVar) {
                this.f68896a = cVar;
            }

            public final void run() {
                this.f68896a.f68895a.mo98354c();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$c$b */
        static final class RunnableC27614b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27612c f68897a;

            /* renamed from: b */
            final /* synthetic */ AppBadgeSettingData f68898b;

            RunnableC27614b(C27612c cVar, AppBadgeSettingData appBadgeSettingData) {
                this.f68897a = cVar;
                this.f68898b = appBadgeSettingData;
            }

            public final void run() {
                List<AppBadgeSettingInfo> list;
                AppBadgeSettingActivity appBadgeSettingActivity = this.f68897a.f68895a;
                AppBadgeSettingData appBadgeSettingData = this.f68898b;
                if (appBadgeSettingData != null) {
                    list = appBadgeSettingData.getItems();
                } else {
                    list = null;
                }
                appBadgeSettingActivity.mo98351a(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27612c(AppBadgeSettingActivity appBadgeSettingActivity) {
            this.f68895a = appBadgeSettingActivity;
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
            AppBadgeSettingData appBadgeSettingData;
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            this.f68895a.f68885b = false;
            AppBadgeSettingResponse a = this.f68895a.mo98348a(sendHttpResponse.json_body);
            String str = null;
            if (a != null) {
                appBadgeSettingData = a.getData();
            } else {
                appBadgeSettingData = null;
            }
            AppBadgeSettingActivity appBadgeSettingActivity = this.f68895a;
            if (appBadgeSettingData != null) {
                str = appBadgeSettingData.getPageToken();
            }
            appBadgeSettingActivity.f68884a = str;
            UICallbackExecutor.execute(new RunnableC27614b(this, appBadgeSettingData));
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            this.f68895a.f68885b = false;
            UICallbackExecutor.execute(new RunnableC27613a(this));
            C27568a.m100616b(null, false, "page=" + this.f68895a.f68884a + ",err=" + errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$callbackMore$1", "Lcom/ss/android/appcenter/business/net/base/Service$ICallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/appcenter/business/net/base/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$d */
    public static final class C27615d implements C27714b.AbstractC27716a {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68899a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$d$a */
        static final class RunnableC27616a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27615d f68900a;

            /* renamed from: b */
            final /* synthetic */ AppBadgeSettingData f68901b;

            RunnableC27616a(C27615d dVar, AppBadgeSettingData appBadgeSettingData) {
                this.f68900a = dVar;
                this.f68901b = appBadgeSettingData;
            }

            public final void run() {
                this.f68900a.f68899a.mo98353b(this.f68901b.getItems());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27615d(AppBadgeSettingActivity appBadgeSettingActivity) {
            this.f68899a = appBadgeSettingActivity;
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
            AppBadgeSettingData data;
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            this.f68899a.f68885b = false;
            AppBadgeSettingResponse a = this.f68899a.mo98348a(sendHttpResponse.json_body);
            if (a != null && (data = a.getData()) != null) {
                AppBadgeSettingActivity appBadgeSettingActivity = this.f68899a;
                String pageToken = data.getPageToken();
                if (pageToken != null) {
                    appBadgeSettingActivity.f68884a = pageToken;
                    UICallbackExecutor.execute(new RunnableC27616a(this, data));
                }
            }
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            this.f68899a.f68885b = false;
            C27568a.m100616b(null, false, "page=" + this.f68899a.f68884a + ",err=" + errorResult);
            LKUIToast.show(this.f68899a, (int) R.string.OpenPlatform_AppCenter_BadgeAppLoadingFail);
        }
    }

    /* renamed from: i */
    private final void m100775i() {
        ((SmartRefreshLayout) mo98347a(R.id.refresh_layout)).mo96416n();
        StatusController statusController = this.f68887e;
        if (statusController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusCtrl");
        }
        statusController.mo100033a(StatusController.Status.LOADING);
    }

    /* renamed from: j */
    private final void m100776j() {
        ((SmartRefreshLayout) mo98347a(R.id.refresh_layout)).mo96416n();
        StatusController statusController = this.f68887e;
        if (statusController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusCtrl");
        }
        statusController.mo100033a(StatusController.Status.EMPTY);
    }

    /* renamed from: k */
    private final void m100777k() {
        ((SmartRefreshLayout) mo98347a(R.id.refresh_layout)).mo96416n();
        StatusController statusController = this.f68887e;
        if (statusController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusCtrl");
        }
        statusController.mo100033a(StatusController.Status.CONTENT);
    }

    /* renamed from: b */
    public final void mo98352b() {
        C27615d dVar;
        if (!this.f68885b) {
            String str = this.f68884a;
            if (str == null) {
                dVar = this.f68889g;
            } else {
                dVar = this.f68890h;
            }
            this.f68885b = true;
            C27711a.m101346f(str, dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$initView$5", "Lcom/ss/android/appcenter/business/view/StatusController$IStatusSwitch;", "switchOff", "", "switchOn", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$i */
    public static final class C27621i implements StatusController.AbstractC28105b {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68906a;

        @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
        /* renamed from: a */
        public void mo98317a() {
            WorkplaceLoadingView workplaceLoadingView = (WorkplaceLoadingView) this.f68906a.mo98347a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(workplaceLoadingView, "loading_view");
            workplaceLoadingView.setVisibility(0);
            WorkplaceLoadingView workplaceLoadingView2 = (WorkplaceLoadingView) this.f68906a.mo98347a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(workplaceLoadingView2, "loading_view");
            C27582j.m100671a(true, workplaceLoadingView2.getLottieAnimationView());
        }

        @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
        /* renamed from: b */
        public void mo98318b() {
            WorkplaceLoadingView workplaceLoadingView = (WorkplaceLoadingView) this.f68906a.mo98347a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(workplaceLoadingView, "loading_view");
            workplaceLoadingView.setVisibility(8);
            WorkplaceLoadingView workplaceLoadingView2 = (WorkplaceLoadingView) this.f68906a.mo98347a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(workplaceLoadingView2, "loading_view");
            C27582j.m100671a(false, workplaceLoadingView2.getLottieAnimationView());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27621i(AppBadgeSettingActivity appBadgeSettingActivity) {
            this.f68906a = appBadgeSettingActivity;
        }
    }

    /* renamed from: c */
    public final void mo98354c() {
        ((SmartRefreshLayout) mo98347a(R.id.refresh_layout)).mo96416n();
        StatusController statusController = this.f68887e;
        if (statusController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusCtrl");
        }
        statusController.mo100033a(StatusController.Status.ERROR);
    }

    /* renamed from: g */
    private final void m100774g() {
        ((AppCompatImageView) mo98347a(R.id.close_view)).setOnClickListener(new View$OnClickListenerC27617e(this));
        AppBadgeSettingActivity appBadgeSettingActivity = this;
        AppBadgeSettingAdapter aVar = new AppBadgeSettingAdapter(appBadgeSettingActivity);
        this.f68886d = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo98374a(this);
        RecyclerView recyclerView = (RecyclerView) mo98347a(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        AppBadgeSettingAdapter aVar2 = this.f68886d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView.setAdapter(aVar2);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo98347a(R.id.refresh_layout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "refresh_layout");
        smartRefreshLayout.mo96413l(false);
        ((SmartRefreshLayout) mo98347a(R.id.refresh_layout)).mo96385e(false);
        SmartRefreshLayout smartRefreshLayout2 = (SmartRefreshLayout) mo98347a(R.id.refresh_layout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout2, "refresh_layout");
        smartRefreshLayout2.mo96380d(false);
        SmartRefreshLayout smartRefreshLayout3 = (SmartRefreshLayout) mo98347a(R.id.refresh_layout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout3, "refresh_layout");
        smartRefreshLayout3.mo96367b((AbstractC27125d) new C27618f(this, appBadgeSettingActivity));
        ((SmartRefreshLayout) mo98347a(R.id.refresh_layout)).mo96368b(new C27619g(this));
        ((WorkplaceErrorView) mo98347a(R.id.error_view)).setOnClickListener(new View$OnClickListenerC27620h(this));
        this.f68887e = new StatusController((SmartRefreshLayout) mo98347a(R.id.refresh_layout), (WorkplaceErrorView) mo98347a(R.id.error_view), new C27621i(this));
        ((WorkplaceGuideView) mo98347a(R.id.empty_view)).setText(R.string.OpenPlatform_AppCenter_BadgeNoApp);
        StatusController statusController = this.f68887e;
        if (statusController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusCtrl");
        }
        statusController.mo100032a((WorkplaceGuideView) mo98347a(R.id.empty_view), StatusController.Status.EMPTY);
    }

    /* renamed from: a */
    public final void mo98268a() {
        this.f68884a = null;
        m100775i();
        mo98352b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$syncAppBadgePermission$1", "Lcom/ss/android/appcenter/business/net/base/Service$ICallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/appcenter/business/net/base/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$j */
    public static final class C27622j implements C27714b.AbstractC27716a {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68907a;

        /* renamed from: b */
        final /* synthetic */ BadgePermissionSyncCallback f68908b;

        /* renamed from: c */
        final /* synthetic */ boolean f68909c;

        /* renamed from: d */
        final /* synthetic */ String f68910d;

        /* renamed from: e */
        final /* synthetic */ String f68911e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$syncAppBadgePermission$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/openplatform/v1/UpdateOpenAppBadgeNodeResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "resp", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$j$a */
        public static final class C27623a implements IGetDataCallback<UpdateOpenAppBadgeNodeResponse> {

            /* renamed from: a */
            final /* synthetic */ C27622j f68912a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C27623a(C27622j jVar) {
                this.f68912a = jVar;
            }

            /* renamed from: a */
            public void onSuccess(UpdateOpenAppBadgeNodeResponse updateOpenAppBadgeNodeResponse) {
                Intrinsics.checkParameterIsNotNull(updateOpenAppBadgeNodeResponse, "resp");
                this.f68912a.f68908b.mo98360a(2, updateOpenAppBadgeNodeResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f68912a.f68908b.mo98361a(2, errorResult.toString());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$syncAppBadgePermission$1$onSuccess$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/openplatform/v1/PullOpenAppBadgeNodesResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "resp", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$j$b */
        public static final class C27624b implements IGetDataCallback<PullOpenAppBadgeNodesResponse> {

            /* renamed from: a */
            final /* synthetic */ C27622j f68913a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C27624b(C27622j jVar) {
                this.f68913a = jVar;
            }

            /* renamed from: a */
            public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                Intrinsics.checkParameterIsNotNull(pullOpenAppBadgeNodesResponse, "resp");
                this.f68913a.f68908b.mo98360a(3, pullOpenAppBadgeNodesResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f68913a.f68908b.mo98361a(3, errorResult.toString());
            }
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            if (this.f68909c) {
                str = "open";
            } else {
                str = "close";
            }
            C27710b.m101263a(this.f68910d, this.f68911e, "", "appcenter_setting", str);
            LKUIToast.show(this.f68907a, (int) R.string.OpenPlatform_AppCenter_BadgeSettingFail);
            this.f68908b.mo98361a(1, errorResult.toString());
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            this.f68908b.mo98360a(1, sendHttpResponse);
            if (this.f68909c) {
                str = "open";
            } else {
                str = "close";
            }
            C27710b.m101263a(this.f68910d, this.f68911e, "", "appcenter_setting", str);
            C67869a.m264035a(this.f68911e, null, Boolean.valueOf(this.f68909c), null, new C27623a(this));
            HashMap hashMap = new HashMap();
            hashMap.put(this.f68911e, null);
            C67869a.m264036a(hashMap, new C27624b(this));
        }

        C27622j(AppBadgeSettingActivity appBadgeSettingActivity, BadgePermissionSyncCallback aVar, boolean z, String str, String str2) {
            this.f68907a = appBadgeSettingActivity;
            this.f68908b = aVar;
            this.f68909c = z;
            this.f68910d = str;
            this.f68911e = str2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$e */
    public static final class View$OnClickListenerC27617e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68902a;

        View$OnClickListenerC27617e(AppBadgeSettingActivity appBadgeSettingActivity) {
            this.f68902a = appBadgeSettingActivity;
        }

        public final void onClick(View view) {
            this.f68902a.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$g */
    public static final class C27619g implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68904a;

        C27619g(AppBadgeSettingActivity appBadgeSettingActivity) {
            this.f68904a = appBadgeSettingActivity;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            this.f68904a.mo98352b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$h */
    public static final class View$OnClickListenerC27620h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingActivity f68905a;

        View$OnClickListenerC27620h(AppBadgeSettingActivity appBadgeSettingActivity) {
            this.f68905a = appBadgeSettingActivity;
        }

        public final void onClick(View view) {
            this.f68905a.mo98268a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.workplace_badge_setting_activity);
        m100774g();
        mo98268a();
    }

    /* renamed from: a */
    public static Resources m100768a(AppBadgeSettingActivity appBadgeSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appBadgeSettingActivity);
        }
        return appBadgeSettingActivity.mo98356d();
    }

    /* renamed from: c */
    public static AssetManager m100773c(AppBadgeSettingActivity appBadgeSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appBadgeSettingActivity);
        }
        return appBadgeSettingActivity.mo98358f();
    }

    /* renamed from: b */
    public static void m100771b(AppBadgeSettingActivity appBadgeSettingActivity) {
        appBadgeSettingActivity.mo98357e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppBadgeSettingActivity appBadgeSettingActivity2 = appBadgeSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appBadgeSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final AppBadgeSettingResponse mo98348a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (AppBadgeSettingResponse) this.f68888f.fromJson(str, AppBadgeSettingResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo98353b(List<AppBadgeSettingInfo> list) {
        C27568a.m100616b(list, true, "pageToken=" + this.f68884a);
        if (list != null) {
            AppBadgeSettingAdapter aVar = this.f68886d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            aVar.mo98378b(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$initView$2", "Lcom/scwang/smartrefresh/layout/footer/FalsifyFooter;", "onInitialized", "", "kernel", "Lcom/scwang/smartrefresh/layout/api/RefreshKernel;", "height", "", "extendHeight", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$f */
    public static final class C27618f extends FalsifyFooter {

        /* renamed from: b */
        final /* synthetic */ AppBadgeSettingActivity f68903b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27618f(AppBadgeSettingActivity appBadgeSettingActivity, Context context) {
            super(context);
            this.f68903b = appBadgeSettingActivity;
        }

        @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f, com.scwang.smartrefresh.layout.footer.FalsifyFooter
        /* renamed from: a */
        public void mo30299a(AbstractC27128g gVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(gVar, "kernel");
            super.mo30299a(gVar, i, i2);
            AbstractC27129h a = gVar.mo96459a();
            Intrinsics.checkExpressionValueIsNotNull(a, "kernel.refreshLayout");
            a.mo96410k(true);
        }
    }

    /* renamed from: a */
    public static void m100769a(AppBadgeSettingActivity appBadgeSettingActivity, Context context) {
        appBadgeSettingActivity.mo98349a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appBadgeSettingActivity);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$BadgePermissionSyncCallback;", "Lcom/ss/android/appcenter/business/activity/appbadge/AppBadgeSettingActivity$IBadgePermissionSyncCallback;", "appId", "", "needShow", "", "(Ljava/lang/String;Z)V", "tag", "onError", "", "step", "", ApiHandler.API_CALLBACK_ERRMSG, "onSuccess", "resp", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity$a */
    public static final class BadgePermissionSyncCallback {

        /* renamed from: a */
        private final String f68892a = "BadgePermissionSyncCallback";

        /* renamed from: b */
        private final String f68893b;

        /* renamed from: c */
        private final boolean f68894c;

        public BadgePermissionSyncCallback(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "appId");
            this.f68893b = str;
            this.f68894c = z;
        }

        /* renamed from: a */
        public void mo98360a(int i, Object obj) {
            if (i == 1) {
                C28184h.m103250d(this.f68892a, "STEP_SYNC_SERVER success(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + obj);
                C27568a.m100611a(this.f68893b, CollectionsKt.listOf(new LittleAppPermissionData(20, C13296g.m54138a(20), this.f68894c)), true, "", "");
            } else if (i == 2) {
                C28184h.m103250d(this.f68892a, "STEP_UPDATE_LOCAL success(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + obj);
                C27568a.m100614a((Map<String, Boolean>) MapsKt.mapOf(new Pair(this.f68893b, Boolean.valueOf(this.f68894c))), true, String.valueOf(obj));
            } else if (i != 3) {
                C28184h.m103250d(this.f68892a, "STEP_UNKNOWN success:" + obj);
            } else {
                C28184h.m103250d(this.f68892a, "STEP_PULL_BADGE success(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + obj);
                List<OpenAppBadgeNode> list = null;
                if (!(obj instanceof PullOpenAppBadgeNodesResponse)) {
                    obj = null;
                }
                PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse = (PullOpenAppBadgeNodesResponse) obj;
                if (pullOpenAppBadgeNodesResponse != null) {
                    list = pullOpenAppBadgeNodesResponse.notice_nodes;
                }
                C27568a.m100610a(2, list, true, "");
            }
        }

        /* renamed from: a */
        public void mo98361a(int i, String str) {
            if (i == 1) {
                String str2 = this.f68892a;
                C28184h.m103250d(str2, "STEP_SYNC_SERVER error(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + str);
                C27568a.m100611a(this.f68893b, CollectionsKt.listOf(new LittleAppPermissionData(20, C13296g.m54138a(20), this.f68894c)), false, "", "");
            } else if (i == 2) {
                String str3 = this.f68892a;
                C28184h.m103250d(str3, "STEP_UPDATE_LOCAL error(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + str);
                C27568a.m100614a((Map<String, Boolean>) MapsKt.mapOf(new Pair(this.f68893b, Boolean.valueOf(this.f68894c))), false, str);
            } else if (i != 3) {
                String str4 = this.f68892a;
                C28184h.m103250d(str4, "STEP_UNKNOWN error(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + str);
                String str5 = this.f68892a;
                StringBuilder sb = new StringBuilder();
                sb.append("error:");
                sb.append(str);
                C28184h.m103248b(str5, sb.toString());
            } else {
                String str6 = this.f68892a;
                C28184h.m103250d(str6, "STEP_PULL_BADGE error(appId=" + this.f68893b + ",needShow=" + this.f68894c + "):" + str);
                C27568a.m100610a(2, null, false, "");
            }
        }
    }

    /* renamed from: a */
    public static Context m100767a(AppBadgeSettingActivity appBadgeSettingActivity, Configuration configuration) {
        Context a = appBadgeSettingActivity.mo98346a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final void m100770a(String str, String str2, boolean z) {
        m100772b(str, str2, z);
    }

    /* renamed from: b */
    private final void m100772b(String str, String str2, boolean z) {
        BadgePermissionSyncCallback aVar = new BadgePermissionSyncCallback(str, z);
        C27548m m = C27548m.m100547m();
        Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
        AbstractC27547l e = m.mo98221e();
        Intrinsics.checkExpressionValueIsNotNull(e, "Providers.getInstance().userProvider");
        Object a = e.mo98211a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appID", str);
            jSONObject.put("sessionID", a);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = C13296g.m54138a(20);
            jSONObject3.put("auth", z);
            jSONObject3.put("modifyTime", currentTimeMillis);
            if (a2 != null) {
                jSONObject2.put(a2, jSONObject3);
            }
            jSONObject.put("userAuthScope", jSONObject2);
        } catch (JSONException e2) {
            aVar.mo98361a(-1, e2.toString());
        }
        C27711a.m101347g(jSONObject.toString(), new C27622j(this, aVar, z, str2, str));
    }

    @Override // com.ss.android.appcenter.business.activity.appbadge.adapter.AppBadgeSettingAdapter.OnBadgeSettingChangedListener
    /* renamed from: a */
    public void mo98350a(CompoundButton compoundButton, AppBadgeSettingInfo appBadgeSettingInfo, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(compoundButton, "buttonView");
        Intrinsics.checkParameterIsNotNull(appBadgeSettingInfo, "badgeInfo");
        String clientId = appBadgeSettingInfo.getClientId();
        if (clientId != null) {
            m100770a(clientId, appBadgeSettingInfo.name(), z);
        }
    }
}
