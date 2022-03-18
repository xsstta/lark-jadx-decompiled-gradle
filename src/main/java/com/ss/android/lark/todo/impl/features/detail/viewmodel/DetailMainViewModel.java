package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.C1143ag;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.rustadapter.push.entity.TodoChangeNotificationUnit;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DetailMainViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "todoChangeNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "closeDetailIfDeleteOrFinished", "", "pushData", "Lcom/ss/android/lark/todo/impl/rustadapter/push/entity/TodoChangeNotificationUnit;", "handleAction", "action", "", "initViewData", "onDestroy", "registerTodoChangeNotificationPush", "unRegisterTodoChangeNotificationPush", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.i */
public final class DetailMainViewModel extends ViewModelSection<TodoDetailModel> {
    public static final Companion Companion = new Companion(null);
    private TodoPushHandleCallBack todoChangeNotification;

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DetailMainViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void onDestroy() {
        super.onDestroy();
        unRegisterTodoChangeNotificationPush();
    }

    private final void unRegisterTodoChangeNotificationPush() {
        if (this.todoChangeNotification != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODOS_CHANGED_NOTIFICATION, this.todoChangeNotification);
        }
    }

    private final void registerTodoChangeNotificationPush() {
        this.todoChangeNotification = new C56774c(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODOS_CHANGED_NOTIFICATION, this.todoChangeNotification);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/viewmodel/DetailMainViewModel$registerTodoChangeNotificationPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.i$c */
    public static final class C56774c implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ DetailMainViewModel f140174a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56774c(DetailMainViewModel iVar) {
            this.f140174a = iVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("DetailMainViewModel", LogMessageUtil.f139260a.mo191769b("pushTodoChangeNotification"));
            Object obj = jSONObject.get("todo_change_notification");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…E_NOTIFICATION] ?: return");
                if (obj instanceof TodoChangeNotificationUnit) {
                    this.f140174a.closeDetailIfDeleteOrFinished((TodoChangeNotificationUnit) obj);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailMainViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
        registerTodoChangeNotificationPush();
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 101) {
            ((TodoDetailModel) getModelStore()).createTodo();
        } else if (i == 105) {
            ((TodoDetailModel) getModelStore()).createKeyBoardTodo(true);
        } else if (i == 106) {
            ((TodoDetailModel) getModelStore()).createKeyBoardTodo(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.DetailMainViewModel$closeDetailIfDeleteOrFinished$1", mo239173f = "DetailMainViewModel.kt", mo239174i = {0}, mo239175l = {74}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.i$b */
    public static final class C56773b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ DetailMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56773b(DetailMainViewModel iVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = iVar;
            this.$todoGuid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56773b bVar = new C56773b(this.this$0, this.$todoGuid, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56773b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194314b(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Todo todo = (Todo) obj;
            if (todo != null) {
                Long l = ((TodoDetailModel) this.this$0.getModelStore()).getTodoBuilder().f48033o;
                if (l != null && l.longValue() == 0 && todo.completed_milli_time.longValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (todo.deleted_milli_time.longValue() > 0 || z) {
                    ((TodoDetailModel) this.this$0.getModelStore()).getActivityFinished().mo5926a(C69089a.m265837a(true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void closeDetailIfDeleteOrFinished(TodoChangeNotificationUnit todoChangeNotificationUnit) {
        String str;
        List<String> list;
        boolean z;
        if (!((TodoDetailModel) getModelStore()).isCreateTodo() && (str = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48019a) != null) {
            ChangedTodoCollection changedTodoCollection = todoChangeNotificationUnit.getChangedTodoCollection();
            if (changedTodoCollection != null) {
                list = changedTodoCollection.deleted_todo_idents;
            } else {
                list = null;
            }
            List<String> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && list.contains(str)) {
                Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56773b(this, str, null), 2, null);
            }
        }
    }
}
