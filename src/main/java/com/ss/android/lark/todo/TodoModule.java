package com.ss.android.lark.todo;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.api.ITodoModule;
import com.ss.android.lark.todo.api.ITodoService;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.entity.TodoNotice;
import com.ss.android.lark.todo.impl.abtest.ExperimentConfig;
import com.ss.android.lark.todo.impl.features.chatlist.service.TodoChatListService;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.mainview.guide.GuideDialogProcess;
import com.ss.android.lark.todo.impl.features.messagecard.helper.TodoRichTextHelper;
import com.ss.android.lark.todo.impl.features.remind.notification.NotificationHelper;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0016\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0006H\u0016J,\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\b\u00101\u001a\u00020\u0004H\u0016¨\u00063"}, d2 = {"Lcom/ss/android/lark/todo/TodoModule;", "Lcom/ss/android/lark/todo/api/ITodoModule;", "()V", "checkChatHasDraft", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "createTodo", "context", "Landroid/content/Context;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "blockExtra", "Lcom/larksuite/component/blockit/entity/BlockExtra;", "createTodoFromAppLink", "isHorizontalAnimation", "getAbTestExperiments", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "getEventPendingIntent", "Landroid/app/PendingIntent;", "todoNotice", "Lcom/ss/android/lark/todo/dependency/entity/TodoNotice;", "getIntentForWsChannelOfflinePush", "Landroid/content/Intent;", "bizExtra", "getPageName", "getTodoCardMessageTitle", "", "todoContent", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "getTodoService", "Lcom/ss/android/lark/todo/api/ITodoService;", "isChatInlineCreateTodoEnabled", "sendCreateTodoCard", "todoId", "showTodoGuideDialog", "createdTodoGuid", "startTodoDetailFromAppLink", "guid", "authScene", "authId", "startTodoSettingActivity", "activity", "Landroid/app/Activity;", "todoModuleInit", "todoModuleUnInit", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.a */
public abstract class TodoModule implements ITodoModule {

    /* renamed from: a */
    public static final Companion f139160a = new Companion(null);

    /* renamed from: a */
    public void mo191652a() {
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: e */
    public boolean mo191662e() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/TodoModule$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/TodoModule$getTodoService$1", "Lcom/ss/android/lark/todo/api/ITodoService;", "getChatTodoStatus", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.a$b */
    public static final class C56224b implements ITodoService {
        C56224b() {
        }

        @Override // com.ss.android.lark.todo.api.ITodoService
        /* renamed from: a */
        public void mo191663a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            TodoChatListService.f139313a.mo191827a(str, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: d */
    public List<AbstractC28490a<?>> mo191661d() {
        return ExperimentConfig.f139254a;
    }

    public TodoModule() {
        mo191652a();
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: c */
    public ITodoService mo191660c() {
        return new C56224b();
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: b */
    public String mo191659b() {
        return TodoDependencyHolder.f139242a.mo191730a().coreModuleDependency().mo145382a();
    }

    @Override // com.ss.android.lark.todo.api.ITodoLifeCycle
    /* renamed from: a */
    public Intent mo191650a(String str) {
        return NotificationHelper.f140950a.mo193993a(str);
    }

    @Override // com.ss.android.lark.todo.api.ITodoLifeCycle
    /* renamed from: a */
    public PendingIntent mo191649a(TodoNotice todoNotice) {
        Intrinsics.checkParameterIsNotNull(todoNotice, "todoNotice");
        return NotificationHelper.f140950a.mo193992a(todoNotice);
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: a */
    public CharSequence mo191651a(TodoContent todoContent) {
        TodoDetail todoDetail;
        Intrinsics.checkParameterIsNotNull(todoContent, "todoContent");
        TodoRichTextHelper aVar = TodoRichTextHelper.f140904a;
        TodoOperationContent cardContentData = todoContent.getCardContentData();
        if (cardContentData != null) {
            todoDetail = cardContentData.todo_detail;
        } else {
            todoDetail = null;
        }
        String a = C59035h.m229208a(aVar.mo193945a(todoDetail), false);
        Intrinsics.checkExpressionValueIsNotNull(a, "RichTextUtil.generateDig…ata?.todo_detail), false)");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.TodoModule$sendCreateTodoCard$1", mo239173f = "TodoModule.kt", mo239174i = {0}, mo239175l = {74}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.a$c */
    static final class C56225c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ String $todoId;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56225c(String str, String str2, Continuation cVar) {
            super(2, cVar);
            this.$todoId = str;
            this.$chatId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56225c cVar2 = new C56225c(this.$todoId, this.$chatId, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56225c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoId;
                String[] strArr = {this.$chatId};
                ShareTodoMessageRequest.ShareType shareType = ShareTodoMessageRequest.ShareType.CREATE;
                this.L$0 = ahVar;
                this.label = 1;
                if (fVar.mo194308a(str, CollectionsKt.arrayListOf(strArr), shareType, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: a */
    public void mo191653a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Log.m165389i("TodoModule", LogMessageUtil.f139260a.mo191765a("goto todo setting"));
        Intent intent = new Intent();
        intent.setClass(activity, TodoSettingActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: a */
    public void mo191655a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "createdTodoGuid");
        Log.m165389i("TodoModule", LogMessageUtil.f139260a.mo191771c("show todo guide dialog"));
        GuideDialogProcess.f140225a.mo193101a(context, str);
    }

    /* renamed from: a */
    public void mo191657a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        DetailEntrance.f139694a.mo192301a(context, (String) null, (String) null, (String) null, (BlockExtra) null, false, z);
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: a */
    public void mo191658a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "todoId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        TodoHitPoint.m221761n(str);
        TodoGeneralHitPoint.f141070a.mo194211k(str);
        Job unused = C69553g.m266944a(GlobalScope.f173453a, null, null, new C56225c(str, str2, null), 3, null);
    }

    @Override // com.ss.android.lark.todo.api.ITodoModule
    /* renamed from: a */
    public void mo191654a(Context context, BlockEntity blockEntity, BlockExtra blockExtra) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(blockEntity, "blockEntity");
        DetailEntrance.f139694a.mo192300a(context, blockEntity, blockExtra);
    }

    /* renamed from: a */
    public void mo191656a(Context context, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "guid");
        DetailEntrance.m220107a(DetailEntrance.f139694a, context, str, false, (String) null, str3, str2, str3, 12, (Object) null);
    }
}
