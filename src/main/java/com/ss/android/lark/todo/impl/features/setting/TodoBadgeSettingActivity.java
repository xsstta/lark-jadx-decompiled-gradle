package com.ss.android.lark.todo.impl.features.setting;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mIncludeToday", "", "mTodoSettingNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingViewModel;", "getMViewModel", "()Lcom/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "bindSettingItemLv", "", "initListener", "initOperationToast", "initTitleBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "registerTodoSettingPush", "unRegisterTodoSettingPush", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoBadgeSettingActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public static final Companion f140974b = new Companion(null);

    /* renamed from: a */
    public boolean f140975a;

    /* renamed from: c */
    private final Lazy f140976c = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TodoBadgeSettingViewModel.class), new TodoBadgeSettingActivity$$special$$inlined$viewModels$2(this), new TodoBadgeSettingActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: d */
    private TodoPushHandleCallBack f140977d;

    /* renamed from: e */
    private HashMap f140978e;

    /* renamed from: a */
    public Context mo194020a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo194021a(int i) {
        if (this.f140978e == null) {
            this.f140978e = new HashMap();
        }
        View view = (View) this.f140978e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140978e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final TodoBadgeSettingViewModel mo194022a() {
        return (TodoBadgeSettingViewModel) this.f140976c.getValue();
    }

    /* renamed from: a */
    public void mo194023a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m221519a(this, context);
    }

    /* renamed from: b */
    public Resources mo194024b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo194025c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m221517a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo194027d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m221521c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m221518a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m221520b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingActivity$Companion;", "", "()V", "SETTING_TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        m221523f();
    }

    /* renamed from: f */
    private final void m221523f() {
        if (this.f140977d != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.f140977d);
        }
    }

    /* renamed from: e */
    private final void m221522e() {
        this.f140977d = new C57178h(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.f140977d);
    }

    /* renamed from: i */
    private final void m221526i() {
        mo194022a().getErrorToastLv().mo5923a(this, new C57176f(this));
    }

    /* renamed from: j */
    private final void m221527j() {
        mo194022a().getBadgeSettingShowLv().mo5923a(this, new C57172b(this));
    }

    /* renamed from: g */
    private final void m221524g() {
        ((CommonTitleBar) mo194021a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC57177g(this));
        ((CommonTitleBar) mo194021a(R.id.title_bar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        ((CommonTitleBar) mo194021a(R.id.title_bar)).setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Settings_BadgeCountTitle));
    }

    /* renamed from: h */
    private final void m221525h() {
        ((TodoSwitchView) mo194021a(R.id.badgeSwitchView)).setOnStateChangedListener(new C57173c(this));
        ((LinearLayout) mo194021a(R.id.ll_overdue)).setOnClickListener(new View$OnClickListenerC57174d(this));
        ((LinearLayout) mo194021a(R.id.ll_overdue_today)).setOnClickListener(new View$OnClickListenerC57175e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingActivity$initListener$1", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoSwitchView$OnStateChangedListener;", "toggleToOff", "", "view", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoSwitchView;", "toggleToOn", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$c */
    public static final class C57173c implements TodoSwitchView.AbstractC57201a {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140980a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57173c(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140980a = todoBadgeSettingActivity;
        }

        @Override // com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView.AbstractC57201a
        /* renamed from: a */
        public void mo194030a(TodoSwitchView todoSwitchView) {
            TodoGeneralHitPoint.f141070a.mo194193c(true);
            this.f140980a.mo194022a().updateBadgeSetting(true, this.f140980a.f140975a);
        }

        @Override // com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView.AbstractC57201a
        /* renamed from: b */
        public void mo194031b(TodoSwitchView todoSwitchView) {
            TodoGeneralHitPoint.f141070a.mo194193c(false);
            this.f140980a.mo194022a().updateBadgeSetting(false, this.f140980a.f140975a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$g */
    public static final class View$OnClickListenerC57177g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140984a;

        View$OnClickListenerC57177g(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140984a = todoBadgeSettingActivity;
        }

        public final void onClick(View view) {
            this.f140984a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingActivity$registerTodoSettingPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$h */
    public static final class C57178h implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140985a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57178h(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140985a = todoBadgeSettingActivity;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("TodoBadgeSettingActivity", LogMessageUtil.f139260a.mo191769b("todo_setting_push"));
            Object obj = jSONObject.get("todo_setting_push");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…S_TODO_SETTING] ?: return");
                if (obj instanceof TodoSetting) {
                    this.f140985a.mo194022a().updateTodoSetting((TodoSetting) obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$f */
    public static final class C57176f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140983a;

        C57176f(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140983a = todoBadgeSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            OperationToastHelper.m219775a(OperationToastHelper.f139395a, this.f140983a, R.string.Todo_Task_FailedToSet, null, null, null, null, 60, null);
        }
    }

    /* renamed from: a */
    public static Resources m221518a(TodoBadgeSettingActivity todoBadgeSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoBadgeSettingActivity);
        }
        return todoBadgeSettingActivity.mo194024b();
    }

    /* renamed from: c */
    public static AssetManager m221521c(TodoBadgeSettingActivity todoBadgeSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoBadgeSettingActivity);
        }
        return todoBadgeSettingActivity.mo194027d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$d */
    public static final class View$OnClickListenerC57174d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140981a;

        View$OnClickListenerC57174d(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140981a = todoBadgeSettingActivity;
        }

        public final void onClick(View view) {
            this.f140981a.f140975a = false;
            ImageView imageView = (ImageView) this.f140981a.mo194021a(R.id.image_overdue_checked);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "image_overdue_checked");
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) this.f140981a.mo194021a(R.id.image_overdue_today_checked);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "image_overdue_today_checked");
            imageView2.setVisibility(8);
            this.f140981a.mo194022a().updateBadgeSetting(true, false);
            TodoGeneralHitPoint.f141070a.mo194197d(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$e */
    public static final class View$OnClickListenerC57175e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140982a;

        View$OnClickListenerC57175e(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140982a = todoBadgeSettingActivity;
        }

        public final void onClick(View view) {
            this.f140982a.f140975a = true;
            ImageView imageView = (ImageView) this.f140982a.mo194021a(R.id.image_overdue_checked);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "image_overdue_checked");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f140982a.mo194021a(R.id.image_overdue_today_checked);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "image_overdue_today_checked");
            imageView2.setVisibility(0);
            this.f140982a.mo194022a().updateBadgeSetting(true, true);
            TodoGeneralHitPoint.f141070a.mo194197d(true);
        }
    }

    /* renamed from: b */
    public static void m221520b(TodoBadgeSettingActivity todoBadgeSettingActivity) {
        todoBadgeSettingActivity.mo194025c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TodoBadgeSettingActivity todoBadgeSettingActivity2 = todoBadgeSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    todoBadgeSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        setContentView(R.layout.todo_badge_setting);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.setNavigationBarColor(ResUtil.f139261a.mo191775a(R.color.bg_base));
        m221524g();
        m221525h();
        m221527j();
        m221526i();
        mo194022a().initSettingData();
        m221522e();
        TodoGeneralHitPoint.f141070a.mo194218o();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "badgeConfig", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoBadgeSettingActivity$b */
    public static final class C57172b<T> implements AbstractC1178x<TodoBadgeConfig> {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingActivity f140979a;

        C57172b(TodoBadgeSettingActivity todoBadgeSettingActivity) {
            this.f140979a = todoBadgeSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(TodoBadgeConfig todoBadgeConfig) {
            if (todoBadgeConfig != null) {
                Boolean bool = todoBadgeConfig.enable;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.enable");
                ((TodoSwitchView) this.f140979a.mo194021a(R.id.badgeSwitchView)).setCheckedNoEvent(bool.booleanValue());
                Boolean bool2 = todoBadgeConfig.enable;
                Intrinsics.checkExpressionValueIsNotNull(bool2, "it.enable");
                if (bool2.booleanValue()) {
                    LinearLayout linearLayout = (LinearLayout) this.f140979a.mo194021a(R.id.ll_badge_type_container);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_badge_type_container");
                    linearLayout.setVisibility(0);
                    if (todoBadgeConfig.type == TodoBadgeConfig.BadgeType.OVERDUE) {
                        this.f140979a.f140975a = false;
                        ImageView imageView = (ImageView) this.f140979a.mo194021a(R.id.image_overdue_checked);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "image_overdue_checked");
                        imageView.setVisibility(0);
                        ImageView imageView2 = (ImageView) this.f140979a.mo194021a(R.id.image_overdue_today_checked);
                        Intrinsics.checkExpressionValueIsNotNull(imageView2, "image_overdue_today_checked");
                        imageView2.setVisibility(8);
                    } else if (todoBadgeConfig.type == TodoBadgeConfig.BadgeType.OVERDUE_AND_TODAY) {
                        this.f140979a.f140975a = true;
                        ImageView imageView3 = (ImageView) this.f140979a.mo194021a(R.id.image_overdue_checked);
                        Intrinsics.checkExpressionValueIsNotNull(imageView3, "image_overdue_checked");
                        imageView3.setVisibility(8);
                        ImageView imageView4 = (ImageView) this.f140979a.mo194021a(R.id.image_overdue_today_checked);
                        Intrinsics.checkExpressionValueIsNotNull(imageView4, "image_overdue_today_checked");
                        imageView4.setVisibility(0);
                    }
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) this.f140979a.mo194021a(R.id.ll_badge_type_container);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_badge_type_container");
                    linearLayout2.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m221519a(TodoBadgeSettingActivity todoBadgeSettingActivity, Context context) {
        todoBadgeSettingActivity.mo194023a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoBadgeSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m221517a(TodoBadgeSettingActivity todoBadgeSettingActivity, Configuration configuration) {
        Context a = todoBadgeSettingActivity.mo194020a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
