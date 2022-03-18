package com.ss.android.lark.todo.impl.features.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.setting.widget.TodoReminderPickerMenu;
import com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0011H\u0014J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0011H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mReminderDialog", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu;", "getMReminderDialog", "()Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu;", "mReminderDialog$delegate", "Lkotlin/Lazy;", "mTodoSettingNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel;", "getMViewModel", "()Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel;", "mViewModel$delegate", "bindSettingItemLv", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initListener", "initOperationToast", "initTitleBar", "initView", "isStartSettingFromTodoTab", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "registerTodoSettingPush", "unRegisterTodoSettingPush", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f140986a = new Companion(null);

    /* renamed from: b */
    private final Lazy f140987b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TodoSettingViewModel.class), new TodoSettingActivity$$special$$inlined$viewModels$2(this), new TodoSettingActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: c */
    private TodoPushHandleCallBack f140988c;

    /* renamed from: d */
    private final Lazy f140989d = LazyKt.lazy(new C57189l(this));

    /* renamed from: e */
    private HashMap f140990e;

    /* renamed from: a */
    public Context mo194036a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo194037a(int i) {
        if (this.f140990e == null) {
            this.f140990e = new HashMap();
        }
        View view = (View) this.f140990e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140990e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final TodoSettingViewModel mo194038a() {
        return (TodoSettingViewModel) this.f140987b.getValue();
    }

    /* renamed from: a */
    public void mo194039a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m221542a(this, context);
    }

    /* renamed from: b */
    public final TodoReminderPickerMenu mo194040b() {
        return (TodoReminderPickerMenu) this.f140989d.getValue();
    }

    /* renamed from: c */
    public Resources mo194041c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m221540a(this, configuration);
    }

    /* renamed from: d */
    public void mo194043d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo194044e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m221544c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m221541a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m221543b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingActivity$Companion;", "", "()V", "KEY_PARAMS_FROM_TODO_TAB", "", "SETTING_TAG", "startSettingFromMoreIcon", "", "context", "Landroid/content/Context;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo194046a(Context context) {
            Log.m165389i("TodoSettingActivity", LogMessageUtil.f139260a.mo191765a("goto setting from todo more icon"));
            if (context != null) {
                Intent intent = new Intent();
                intent.setClass(context, TodoSettingActivity.class);
                intent.putExtra("todo_from_tab", true);
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        m221547h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$l */
    static final class C57189l extends Lambda implements Function0<TodoReminderPickerMenu> {
        final /* synthetic */ TodoSettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57189l(TodoSettingActivity todoSettingActivity) {
            super(0);
            this.this$0 = todoSettingActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoReminderPickerMenu invoke() {
            return new TodoReminderPickerMenu(this.this$0, 2131886427);
        }
    }

    /* renamed from: h */
    private final void m221547h() {
        if (this.f140988c != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.f140988c);
        }
    }

    /* renamed from: m */
    private final boolean m221552m() {
        return getIntent().getBooleanExtra("todo_from_tab", false);
    }

    /* renamed from: g */
    private final void m221546g() {
        this.f140988c = new C57190m(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.f140988c);
    }

    /* renamed from: k */
    private final void m221550k() {
        mo194038a().getErrorToastLv().mo5923a(this, new C57186i(this));
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (m221552m()) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (m221552m()) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
    }

    /* renamed from: f */
    private final void m221545f() {
        int i;
        TextView textView = (TextView) mo194037a(R.id.todo_setting_reminder);
        Intrinsics.checkExpressionValueIsNotNull(textView, "todo_setting_reminder");
        ResUtil eVar = ResUtil.f139261a;
        if (TodoDependencyHolder.f139242a.mo191731b().mo191935h()) {
            i = R.string.Todo_Task_RecentTodoTaskDesc;
        } else {
            i = R.string.Todo_Settings_DailyNotificationDescription;
        }
        textView.setText(eVar.mo191781c(i));
        ((SettingGroupLayout) mo194037a(R.id.ll_badge_container)).setOnClickListener(new View$OnClickListenerC57188k(this));
    }

    /* renamed from: i */
    private final void m221548i() {
        int i;
        ((CommonTitleBar) mo194037a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC57187j(this));
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo194037a(R.id.title_bar);
        if (m221552m()) {
            i = CommonTitleBarConstants.ICON_CLOSE;
        } else {
            i = CommonTitleBarConstants.ICON_BACK;
        }
        commonTitleBar.setLeftImageResource(i);
        ((CommonTitleBar) mo194037a(R.id.title_bar)).setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Tasks));
    }

    /* renamed from: j */
    private final void m221549j() {
        ((TodoSwitchView) mo194037a(R.id.reminderSwitchView)).setOnStateChangedListener(new C57183f(this));
        ((LinearLayout) mo194037a(R.id.ll_reminder)).setOnClickListener(new View$OnClickListenerC57184g(this));
        mo194040b().mo194100a(new C57185h(this));
    }

    /* renamed from: l */
    private final void m221551l() {
        TodoSettingActivity todoSettingActivity = this;
        mo194038a().isReminderShowLv().mo5923a(todoSettingActivity, new C57179b(this));
        mo194038a().getDefaultReminderLv().mo5923a(todoSettingActivity, new C57180c(this));
        mo194038a().getDefaultReminderChosenIndex().mo5923a(todoSettingActivity, new C57181d(this));
        mo194038a().getBadgeSettingShowLv().mo5923a(todoSettingActivity, new C57182e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingActivity$initListener$1", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoSwitchView$OnStateChangedListener;", "toggleToOff", "", "view", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoSwitchView;", "toggleToOn", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$f */
    public static final class C57183f implements TodoSwitchView.AbstractC57201a {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140995a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57183f(TodoSettingActivity todoSettingActivity) {
            this.f140995a = todoSettingActivity;
        }

        @Override // com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView.AbstractC57201a
        /* renamed from: a */
        public void mo194030a(TodoSwitchView todoSwitchView) {
            TodoHitPoint.m221737a(true);
            TodoGeneralHitPoint.f141070a.mo194188b(true);
            this.f140995a.mo194038a().updateReminderStatus(true);
        }

        @Override // com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView.AbstractC57201a
        /* renamed from: b */
        public void mo194031b(TodoSwitchView todoSwitchView) {
            TodoHitPoint.m221737a(false);
            TodoGeneralHitPoint.f141070a.mo194188b(false);
            this.f140995a.mo194038a().updateReminderStatus(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingActivity$initListener$3", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu$ActionListener;", "onActionPerform", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$h */
    public static final class C57185h implements TodoReminderPickerMenu.ActionListener {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140997a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57185h(TodoSettingActivity todoSettingActivity) {
            this.f140997a = todoSettingActivity;
        }

        @Override // com.ss.android.lark.todo.impl.features.setting.widget.TodoReminderPickerMenu.ActionListener
        /* renamed from: a */
        public void mo194052a(int i) {
            this.f140997a.mo194038a().onReminderDialogItemClicked(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$j */
    public static final class View$OnClickListenerC57187j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140999a;

        View$OnClickListenerC57187j(TodoSettingActivity todoSettingActivity) {
            this.f140999a = todoSettingActivity;
        }

        public final void onClick(View view) {
            this.f140999a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingActivity$registerTodoSettingPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$m */
    public static final class C57190m implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f141001a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57190m(TodoSettingActivity todoSettingActivity) {
            this.f141001a = todoSettingActivity;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("TodoSettingActivity", LogMessageUtil.f139260a.mo191769b("todo_setting_push"));
            Object obj = jSONObject.get("todo_setting_push");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…S_TODO_SETTING] ?: return");
                if (obj instanceof TodoSetting) {
                    this.f141001a.mo194038a().updateLocalTodoSetting((TodoSetting) obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$g */
    public static final class View$OnClickListenerC57184g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140996a;

        View$OnClickListenerC57184g(TodoSettingActivity todoSettingActivity) {
            this.f140996a = todoSettingActivity;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194208j();
            this.f140996a.mo194038a().onReminderContainerClicked();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isShowReminder", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$b */
    public static final class C57179b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140991a;

        C57179b(TodoSettingActivity todoSettingActivity) {
            this.f140991a = todoSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "isShowReminder");
            ((TodoSwitchView) this.f140991a.mo194037a(R.id.reminderSwitchView)).setCheckedNoEvent(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "defaultReminderStr", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$c */
    public static final class C57180c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140992a;

        C57180c(TodoSettingActivity todoSettingActivity) {
            this.f140992a = todoSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            TextView textView = (TextView) this.f140992a.mo194037a(R.id.tv_reminder_time);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_reminder_time");
            textView.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "stringRes", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$e */
    public static final class C57182e<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140994a;

        C57182e(TodoSettingActivity todoSettingActivity) {
            this.f140994a = todoSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "stringRes");
            ((TextView) this.f140994a.mo194037a(R.id.tv_badge_setting)).setText(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$i */
    public static final class C57186i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140998a;

        C57186i(TodoSettingActivity todoSettingActivity) {
            this.f140998a = todoSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            OperationToastHelper.m219775a(OperationToastHelper.f139395a, this.f140998a, R.string.Todo_Task_FailedToSet, null, null, null, null, 60, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$k */
    public static final class View$OnClickListenerC57188k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f141000a;

        View$OnClickListenerC57188k(TodoSettingActivity todoSettingActivity) {
            this.f141000a = todoSettingActivity;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194216n();
            this.f141000a.startActivity(new Intent(this.f141000a, TodoBadgeSettingActivity.class));
        }
    }

    /* renamed from: a */
    public static Resources m221541a(TodoSettingActivity todoSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoSettingActivity);
        }
        return todoSettingActivity.mo194041c();
    }

    /* renamed from: c */
    public static AssetManager m221544c(TodoSettingActivity todoSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoSettingActivity);
        }
        return todoSettingActivity.mo194044e();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "reminderIndex", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity$d */
    public static final class C57181d<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingActivity f140993a;

        C57181d(TodoSettingActivity todoSettingActivity) {
            this.f140993a = todoSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            TodoReminderPickerMenu b = this.f140993a.mo194040b();
            Intrinsics.checkExpressionValueIsNotNull(num, "reminderIndex");
            b.mo194099a(num.intValue());
            TodoSettingActivity todoSettingActivity = this.f140993a;
            C58339d.m226194a(todoSettingActivity, todoSettingActivity.mo194040b());
            TodoGeneralHitPoint.f141070a.mo194210k();
        }
    }

    /* renamed from: b */
    public static void m221543b(TodoSettingActivity todoSettingActivity) {
        todoSettingActivity.mo194043d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TodoSettingActivity todoSettingActivity2 = todoSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    todoSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        setContentView(R.layout.todo_bg_setting);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.setNavigationBarColor(ResUtil.f139261a.mo191775a(R.color.bg_base));
        m221548i();
        m221545f();
        m221549j();
        m221551l();
        m221550k();
        mo194038a().initSettingData();
        m221546g();
        TodoGeneralHitPoint.f141070a.mo194214m();
    }

    /* renamed from: a */
    public static void m221542a(TodoSettingActivity todoSettingActivity, Context context) {
        todoSettingActivity.mo194039a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m221540a(TodoSettingActivity todoSettingActivity, Configuration configuration) {
        Context a = todoSettingActivity.mo194036a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
