package com.ss.android.lark.todo.impl.features.mainview2.widget.center;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.share.helper.ShareProcess;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListScheduledListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.schedule.TodoListSchedule;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.ArrayList;
import java.util.Date;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0014J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "listScheduledFuture", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/schedule/TodoListSchedule;", "model", "todoSettingNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "enterTodoCreatePage", "", "getBadgeSetting", "handleAction", "action", "", "initViewData", "onCleared", "parseShareResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "registerTodoSettingPush", "unRegisterTodoSettingPush", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.d */
public final class TodoCenterViewModel extends ViewModelSection<TodoMainModel2> {
    public static final Companion Companion = new Companion(null);
    private TodoListSchedule listScheduledFuture = new TodoListSchedule(new C56991d(this));
    public final TodoMainModel2 model = ((TodoMainModel2) getModelStore());
    private TodoPushHandleCallBack todoSettingNotification;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        unRegisterTodoSettingPush();
    }

    private final void unRegisterTodoSettingPush() {
        if (this.todoSettingNotification != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.todoSettingNotification);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel$listScheduledFuture$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListScheduledListener;", "refreshListEndTime", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.d$d */
    public static final class C56991d implements IListScheduledListener {

        /* renamed from: a */
        final /* synthetic */ TodoCenterViewModel f140651a;

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListScheduledListener
        /* renamed from: a */
        public void mo193641a() {
            this.f140651a.model.mo193555M().mo5926a((Boolean) true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56991d(TodoCenterViewModel dVar) {
            this.f140651a = dVar;
        }
    }

    private final void registerTodoSettingPush() {
        this.todoSettingNotification = new C56992e(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.todoSettingNotification);
    }

    public final void getBadgeSetting() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56988b(this, null), 3, null);
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        this.model.ad().mo5925a(new C56990c(this));
    }

    private final void enterTodoCreatePage() {
        TodoSceneType todoSceneType;
        TodoHitPoint.m221726a(this.model.ae());
        TodoGeneralHitPoint.f141070a.mo194194d();
        this.model.mo193609z().mo5929b((Boolean) true);
        Activity activity = (Activity) getContext();
        if (activity != null) {
            DetailEntrance bVar = DetailEntrance.f139694a;
            switch (C56993e.f140653a[this.model.ae().ordinal()]) {
                case 1:
                    todoSceneType = TodoSceneType.TODO_ALL;
                    break;
                case 2:
                    todoSceneType = TodoSceneType.TODO_ASSIGIN_FROM_ME;
                    break;
                case 3:
                    todoSceneType = TodoSceneType.TODO_ASSIGN_TO_ME;
                    break;
                case 4:
                    todoSceneType = TodoSceneType.TODO_COMPLETED;
                    break;
                case 5:
                    todoSceneType = TodoSceneType.TODO_FOLLOWED;
                    break;
                case 6:
                    todoSceneType = TodoSceneType.TODO_FROM_DOCS;
                    break;
                default:
                    todoSceneType = TodoSceneType.TODO_ALL;
                    break;
            }
            bVar.mo192299a(activity, null, null, todoSceneType);
        }
        this.model.mo193607x().mo5929b((Boolean) true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.d$c */
    static final class C56990c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoCenterViewModel f140650a;

        C56990c(TodoCenterViewModel dVar) {
            this.f140650a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140650a.getBadgeSetting();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel$registerTodoSettingPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.d$e */
    public static final class C56992e implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoCenterViewModel f140652a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56992e(TodoCenterViewModel dVar) {
            this.f140652a = dVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("TodoCenterViewModel", LogMessageUtil.f139260a.mo191769b("todo_setting_push"));
            Object obj = jSONObject.get("todo_setting_push");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…S_TODO_SETTING] ?: return");
                if (obj instanceof TodoSetting) {
                    this.f140652a.model.mo193571a((TodoSetting) obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.center.TodoCenterViewModel$getBadgeSetting$1", mo239173f = "TodoCenterViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.d$b */
    public static final class C56988b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoCenterViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56988b(TodoCenterViewModel dVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56988b bVar = new C56988b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56988b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoCenterViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getTodoSetting", new String[0]));
                TodoSettingService.f141012a.mo194071a(new IGetDataCallback<TodoSetting>(this, "getTodoSetting") {
                    /* class com.ss.android.lark.todo.impl.features.mainview2.widget.center.TodoCenterViewModel.C56988b.C569891 */

                    /* renamed from: a */
                    final /* synthetic */ C56988b f140647a;

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Log.m165383e("TodoCenterViewModel", LogMessageUtil.f139260a.mo191766a(valueOf, "getTodoSetting", errorResult));
                    }

                    /* renamed from: a */
                    public void onSuccess(TodoSetting todoSetting) {
                        TodoBadgeConfig todoBadgeConfig;
                        Log.m165389i("TodoCenterViewModel", LogMessageUtil.f139260a.mo191768a(valueOf, "getTodoSetting", new String[0]));
                        if (todoSetting != null && (todoBadgeConfig = todoSetting.badge_config) != null) {
                            this.f140647a.this$0.model.mo193545C().mo5926a(todoBadgeConfig);
                        }
                    }

                    {
                        this.f140647a = r1;
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoCenterViewModel(IViewModelAbility<TodoMainModel2> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
        getBadgeSetting();
        registerTodoSettingPush();
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 1) {
            TodoGeneralHitPoint.f141070a.mo194173a(this.model.ae());
            this.listScheduledFuture.mo193808a();
            this.model.ag();
        } else if (i == 2) {
            this.listScheduledFuture.mo193809b();
            this.model.mo193607x().mo5929b((Boolean) true);
        } else if (i == 3) {
            this.listScheduledFuture.mo193808a();
        } else if (i == 4) {
            this.listScheduledFuture.mo193809b();
        } else if (i == 5) {
            this.model.aj();
        } else if (i == 1501) {
            enterTodoCreatePage();
        }
    }

    public final void parseShareResult(Intent intent) {
        String str;
        String str2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("chat_ids_for_share_todo");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(stringArrayListExtra, "data.getStringArrayListE…DO_RESULT) ?: ArrayList()");
        String stringExtra = intent.getStringExtra("comment_for_share_todo");
        if (stringExtra != null) {
            str = stringExtra;
        } else {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "data.getStringExtra(Todo…RESULT)\n            ?: \"\"");
        String stringExtra2 = intent.getStringExtra("guid_for_share_todo");
        if (stringExtra2 != null) {
            str2 = stringExtra2;
        } else {
            str2 = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "data.getStringExtra(Todo…_SHARE_TODO_RESULT) ?: \"\"");
        if (CollectionUtils.isNotEmpty(stringArrayListExtra)) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ShareProcess.f139407a.mo192005a(this.model.mo193567Y(), stringArrayListExtra, str, str2, C1143ag.m5356a(this));
            }
        }
    }
}
