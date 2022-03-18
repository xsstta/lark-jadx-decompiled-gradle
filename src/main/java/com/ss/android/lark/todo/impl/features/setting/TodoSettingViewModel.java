package com.ss.android.lark.todo.impl.features.setting;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.detail.time.TodoReminderItems;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.features.setting.data.TodoSettingData;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0014J\u001e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140*H\u0002R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "badgeSettingShowLv", "Landroidx/lifecycle/MutableLiveData;", "", "getBadgeSettingShowLv", "()Landroidx/lifecycle/MutableLiveData;", "setBadgeSettingShowLv", "(Landroidx/lifecycle/MutableLiveData;)V", "defaultReminderChosenIndex", "getDefaultReminderChosenIndex", "setDefaultReminderChosenIndex", "defaultReminderLv", "", "getDefaultReminderLv", "setDefaultReminderLv", "errorToastLv", "", "getErrorToastLv", "setErrorToastLv", "isReminderShowLv", "setReminderShowLv", "todoSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "getTodoSetting", "()Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "setTodoSetting", "(Lcom/bytedance/lark/pb/todo/v1/TodoSetting;)V", "initSettingData", "", "onReminderContainerClicked", "onReminderDialogItemClicked", "index", "updateLocalTodoSetting", "updateReminderStatus", UpdateKey.STATUS, "updateRemoteTodoSetting", "targetSetting", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.setting.c */
public final class TodoSettingViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private C1177w<Integer> badgeSettingShowLv = new C1177w<>();
    private C1177w<Integer> defaultReminderChosenIndex = new C1177w<>();
    private C1177w<String> defaultReminderLv = new C1177w<>();
    private C1177w<Boolean> errorToastLv = new C1177w<>();
    private C1177w<Boolean> isReminderShowLv = new C1177w<>();
    private TodoSetting todoSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Integer> getBadgeSettingShowLv() {
        return this.badgeSettingShowLv;
    }

    public final C1177w<Integer> getDefaultReminderChosenIndex() {
        return this.defaultReminderChosenIndex;
    }

    public final C1177w<String> getDefaultReminderLv() {
        return this.defaultReminderLv;
    }

    public final C1177w<Boolean> getErrorToastLv() {
        return this.errorToastLv;
    }

    public final TodoSetting getTodoSetting() {
        return this.todoSetting;
    }

    public final C1177w<Boolean> isReminderShowLv() {
        return this.isReminderShowLv;
    }

    public final void initSettingData() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoSettingViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getTodoSetting", new String[0]));
        TodoSettingService.f141012a.mo194071a(new C57196b(this, valueOf, "getTodoSetting"));
    }

    public final void onReminderContainerClicked() {
        int i;
        Integer num;
        C1177w<Integer> wVar = this.defaultReminderChosenIndex;
        ArrayList<Integer> a = TodoReminderItems.f140115a.mo192735a();
        TodoSetting todoSetting2 = this.todoSetting;
        if (todoSetting2 == null || (num = todoSetting2.due_reminder_offset) == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        wVar.mo5926a(Integer.valueOf(a.indexOf(Integer.valueOf(i))));
    }

    public final void setTodoSetting(TodoSetting todoSetting2) {
        this.todoSetting = todoSetting2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel$onReminderDialogItemClicked$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.c$c */
    public static final class C57197c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoSetting f141019a;

        /* renamed from: b */
        final /* synthetic */ TodoSettingViewModel f141020b;

        /* renamed from: c */
        final /* synthetic */ int f141021c;

        /* renamed from: a */
        public void mo194093a(boolean z) {
            TodoSettingData.f141010a.mo194068a(this.f141021c);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo194093a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C1177w<String> defaultReminderLv = this.f141020b.getDefaultReminderLv();
            TodoReminderItems cVar = TodoReminderItems.f140115a;
            Integer num = this.f141019a.due_reminder_offset;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.due_reminder_offset");
            defaultReminderLv.mo5926a(cVar.mo192736b(num.intValue()));
        }

        C57197c(TodoSetting todoSetting, TodoSettingViewModel cVar, int i) {
            this.f141019a = todoSetting;
            this.f141020b = cVar;
            this.f141021c = i;
        }
    }

    public final void setBadgeSettingShowLv(C1177w<Integer> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.badgeSettingShowLv = wVar;
    }

    public final void setDefaultReminderChosenIndex(C1177w<Integer> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.defaultReminderChosenIndex = wVar;
    }

    public final void setDefaultReminderLv(C1177w<String> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.defaultReminderLv = wVar;
    }

    public final void setErrorToastLv(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.errorToastLv = wVar;
    }

    public final void setReminderShowLv(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.isReminderShowLv = wVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel$updateReminderStatus$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.c$d */
    public static final class C57198d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingViewModel f141022a;

        /* renamed from: b */
        final /* synthetic */ boolean f141023b;

        /* renamed from: a */
        public void mo194094a(boolean z) {
            this.f141022a.isReminderShowLv().mo5926a(Boolean.valueOf(this.f141023b));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo194094a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f141022a.isReminderShowLv().mo5926a(Boolean.valueOf(!this.f141023b));
        }

        C57198d(TodoSettingViewModel cVar, boolean z) {
            this.f141022a = cVar;
            this.f141023b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel$updateRemoteTodoSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.c$e */
    public static final class C57199e implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingViewModel f141024a;

        /* renamed from: b */
        final /* synthetic */ String f141025b;

        /* renamed from: c */
        final /* synthetic */ String f141026c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f141027d;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo194095a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo194095a(boolean z) {
            Log.m165389i("TodoSettingViewModel", LogMessageUtil.f139260a.mo191768a(this.f141025b, this.f141026c, new String[0]));
            this.f141027d.onSuccess(Boolean.valueOf(z));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoSettingViewModel", LogMessageUtil.f139260a.mo191766a(this.f141025b, this.f141026c, errorResult));
            this.f141024a.getErrorToastLv().mo5926a((Boolean) true);
        }

        C57199e(TodoSettingViewModel cVar, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f141024a = cVar;
            this.f141025b = str;
            this.f141026c = str2;
            this.f141027d = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoSettingViewModel$initSettingData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "setting", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.c$b */
    public static final class C57196b implements IGetDataCallback<TodoSetting> {

        /* renamed from: a */
        final /* synthetic */ TodoSettingViewModel f141016a;

        /* renamed from: b */
        final /* synthetic */ String f141017b;

        /* renamed from: c */
        final /* synthetic */ String f141018c;

        /* renamed from: a */
        public void onSuccess(TodoSetting todoSetting) {
            Log.m165389i("TodoSettingViewModel", LogMessageUtil.f139260a.mo191768a(this.f141017b, this.f141018c, new String[0]));
            if (todoSetting != null) {
                this.f141016a.updateLocalTodoSetting(todoSetting);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoSettingViewModel", LogMessageUtil.f139260a.mo191766a(this.f141017b, this.f141018c, errorResult));
        }

        C57196b(TodoSettingViewModel cVar, String str, String str2) {
            this.f141016a = cVar;
            this.f141017b = str;
            this.f141018c = str2;
        }
    }

    public final void updateReminderStatus(boolean z) {
        TodoSetting todoSetting2 = this.todoSetting;
        if (todoSetting2 != null) {
            updateRemoteTodoSetting(new TodoSetting(Boolean.valueOf(z), todoSetting2.tab_view_settings, todoSetting2.badge_config, todoSetting2.due_reminder_offset), new C57198d(this, z));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoSettingViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
    }

    public final void onReminderDialogItemClicked(int i) {
        if (i >= 0 && i < TodoReminderItems.f140115a.mo192735a().size()) {
            Integer num = TodoReminderItems.f140115a.mo192735a().get(i);
            Intrinsics.checkExpressionValueIsNotNull(num, "normalReminders[index]");
            int intValue = num.intValue();
            TodoGeneralHitPoint.f141070a.mo194172a(intValue);
            this.defaultReminderLv.mo5926a(TodoReminderItems.f140115a.mo192736b(intValue));
            TodoSetting todoSetting2 = this.todoSetting;
            if (todoSetting2 != null) {
                updateRemoteTodoSetting(new TodoSetting(todoSetting2.enable_daily_remind, todoSetting2.tab_view_settings, todoSetting2.badge_config, Integer.valueOf(intValue)), new C57197c(todoSetting2, this, intValue));
            }
        }
    }

    public final void updateLocalTodoSetting(TodoSetting todoSetting2) {
        Intrinsics.checkParameterIsNotNull(todoSetting2, "todoSetting");
        this.todoSetting = todoSetting2;
        TodoSettingData aVar = TodoSettingData.f141010a;
        Integer num = todoSetting2.due_reminder_offset;
        Intrinsics.checkExpressionValueIsNotNull(num, "todoSetting.due_reminder_offset");
        aVar.mo194068a(num.intValue());
        this.isReminderShowLv.mo5926a(todoSetting2.enable_daily_remind);
        C1177w<String> wVar = this.defaultReminderLv;
        TodoReminderItems cVar = TodoReminderItems.f140115a;
        Integer num2 = todoSetting2.due_reminder_offset;
        Intrinsics.checkExpressionValueIsNotNull(num2, "todoSetting.due_reminder_offset");
        wVar.mo5926a(cVar.mo192736b(num2.intValue()));
        TodoBadgeConfig todoBadgeConfig = todoSetting2.badge_config;
        if (todoBadgeConfig == null) {
            return;
        }
        if (!todoBadgeConfig.enable.booleanValue()) {
            this.badgeSettingShowLv.mo5926a(Integer.valueOf((int) R.string.Todo_Settings_BadgeCountNone));
        } else if (todoBadgeConfig.type == TodoBadgeConfig.BadgeType.OVERDUE) {
            this.badgeSettingShowLv.mo5926a(Integer.valueOf((int) R.string.Todo_Settings_BadgeCountOverdue));
        } else if (todoBadgeConfig.type == TodoBadgeConfig.BadgeType.OVERDUE_AND_TODAY) {
            this.badgeSettingShowLv.mo5926a(Integer.valueOf((int) R.string.Todo_Settings_BadgeCountOverdueAndToday));
        }
    }

    private final void updateRemoteTodoSetting(TodoSetting todoSetting2, IGetDataCallback<Boolean> iGetDataCallback) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoSettingViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "updateTodoSetting", new String[0]));
        TodoSettingService.Companion aVar = TodoSettingService.f141012a;
        UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C57199e(this, valueOf, "updateTodoSetting", iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "CallbackManager().wrapAn…         }\n            })");
        aVar.mo194070a(todoSetting2, wrapAndAddGetDataCallback);
    }
}
