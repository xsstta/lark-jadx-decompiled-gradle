package com.ss.android.lark.todo.impl.features.setting;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "badgeSettingShowLv", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "getBadgeSettingShowLv", "()Landroidx/lifecycle/MutableLiveData;", "setBadgeSettingShowLv", "(Landroidx/lifecycle/MutableLiveData;)V", "errorToastLv", "", "getErrorToastLv", "setErrorToastLv", "todoSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "getTodoSetting", "()Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "setTodoSetting", "(Lcom/bytedance/lark/pb/todo/v1/TodoSetting;)V", "initSettingData", "", "updateBadgeSetting", "enable", "includeToday", "updateTodoSetting", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.setting.a */
public final class TodoBadgeSettingViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private C1177w<TodoBadgeConfig> badgeSettingShowLv = new C1177w<>();
    private C1177w<Boolean> errorToastLv = new C1177w<>();
    private TodoSetting todoSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<TodoBadgeConfig> getBadgeSettingShowLv() {
        return this.badgeSettingShowLv;
    }

    public final C1177w<Boolean> getErrorToastLv() {
        return this.errorToastLv;
    }

    public final TodoSetting getTodoSetting() {
        return this.todoSetting;
    }

    public final void initSettingData() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoBadgeSettingViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getTodoSetting", new String[0]));
        TodoSettingService.f141012a.mo194071a(new C57191b(this, valueOf, "getTodoSetting"));
    }

    public final void setTodoSetting(TodoSetting todoSetting2) {
        this.todoSetting = todoSetting2;
    }

    public final void setBadgeSettingShowLv(C1177w<TodoBadgeConfig> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.badgeSettingShowLv = wVar;
    }

    public final void setErrorToastLv(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.errorToastLv = wVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingViewModel$updateBadgeSetting$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.a$c */
    public static final class C57192c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeConfig f141005a;

        /* renamed from: b */
        final /* synthetic */ TodoBadgeConfig f141006b;

        /* renamed from: c */
        final /* synthetic */ TodoBadgeSettingViewModel f141007c;

        /* renamed from: d */
        final /* synthetic */ boolean f141008d;

        /* renamed from: e */
        final /* synthetic */ boolean f141009e;

        /* renamed from: a */
        public void mo194066a(boolean z) {
            this.f141007c.getBadgeSettingShowLv().mo5926a(this.f141005a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo194066a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoBadgeSettingViewModel", "updateBadgeSetting Err");
            this.f141007c.getErrorToastLv().mo5926a((Boolean) true);
            this.f141007c.getBadgeSettingShowLv().mo5926a(this.f141006b);
        }

        C57192c(TodoBadgeConfig todoBadgeConfig, TodoBadgeConfig todoBadgeConfig2, TodoBadgeSettingViewModel aVar, boolean z, boolean z2) {
            this.f141005a = todoBadgeConfig;
            this.f141006b = todoBadgeConfig2;
            this.f141007c = aVar;
            this.f141008d = z;
            this.f141009e = z2;
        }
    }

    public final void updateTodoSetting(TodoSetting todoSetting2) {
        Intrinsics.checkParameterIsNotNull(todoSetting2, "todoSetting");
        this.todoSetting = todoSetting2;
        this.badgeSettingShowLv.mo5926a(todoSetting2.badge_config);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/setting/TodoBadgeSettingViewModel$initSettingData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "setting", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.a$b */
    public static final class C57191b implements IGetDataCallback<TodoSetting> {

        /* renamed from: a */
        final /* synthetic */ TodoBadgeSettingViewModel f141002a;

        /* renamed from: b */
        final /* synthetic */ String f141003b;

        /* renamed from: c */
        final /* synthetic */ String f141004c;

        /* renamed from: a */
        public void onSuccess(TodoSetting todoSetting) {
            Log.m165389i("TodoBadgeSettingViewModel", LogMessageUtil.f139260a.mo191768a(this.f141003b, this.f141004c, new String[0]));
            if (todoSetting != null) {
                this.f141002a.updateTodoSetting(todoSetting);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoBadgeSettingViewModel", LogMessageUtil.f139260a.mo191766a(this.f141003b, this.f141004c, errorResult));
        }

        C57191b(TodoBadgeSettingViewModel aVar, String str, String str2) {
            this.f141002a = aVar;
            this.f141003b = str;
            this.f141004c = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoBadgeSettingViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
    }

    public final void updateBadgeSetting(boolean z, boolean z2) {
        TodoBadgeConfig.BadgeType badgeType;
        TodoSetting todoSetting2 = this.todoSetting;
        if (todoSetting2 != null) {
            TodoBadgeConfig todoBadgeConfig = todoSetting2.badge_config;
            TodoBadgeConfig.C19643a a = new TodoBadgeConfig.C19643a().mo66649a(Boolean.valueOf(z));
            if (z2) {
                badgeType = TodoBadgeConfig.BadgeType.OVERDUE_AND_TODAY;
            } else {
                badgeType = TodoBadgeConfig.BadgeType.OVERDUE;
            }
            TodoBadgeConfig a2 = a.mo66648a(badgeType).build();
            TodoSetting todoSetting3 = new TodoSetting(todoSetting2.enable_daily_remind, todoSetting2.tab_view_settings, a2, todoSetting2.due_reminder_offset);
            TodoSettingService.Companion aVar = TodoSettingService.f141012a;
            UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C57192c(a2, todoBadgeConfig, this, z, z2));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "CallbackManager().wrapAn…     }\n                })");
            aVar.mo194070a(todoSetting3, wrapAndAddGetDataCallback);
        }
    }
}
