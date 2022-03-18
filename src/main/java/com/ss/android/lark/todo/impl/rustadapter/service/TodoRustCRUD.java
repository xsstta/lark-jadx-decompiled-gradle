package com.ss.android.lark.todo.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.AuthScene;
import com.bytedance.lark.pb.todo.v1.CreateTodoResponse;
import com.bytedance.lark.pb.todo.v1.DeleteTodoDraftRequest;
import com.bytedance.lark.pb.todo.v1.DraftScene;
import com.bytedance.lark.pb.todo.v1.FollowTodoResponse;
import com.bytedance.lark.pb.todo.v1.GetSharedTodosResponse;
import com.bytedance.lark.pb.todo.v1.GetTodoBadgeResponse;
import com.bytedance.lark.pb.todo.v1.GetTodoDraftResponse;
import com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsResponse;
import com.bytedance.lark.pb.todo.v1.GetTodoReferResourcesResponse;
import com.bytedance.lark.pb.todo.v1.GetTodoResponse;
import com.bytedance.lark.pb.todo.v1.MGetServerTodosResponse;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedResponse;
import com.bytedance.lark.pb.todo.v1.MergeMessagesAsTodoResourceResponse;
import com.bytedance.lark.pb.todo.v1.MergeTopicAsTodoResourceResponse;
import com.bytedance.lark.pb.todo.v1.Record;
import com.bytedance.lark.pb.todo.v1.SaveTodoDraftRequest;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoReferResource;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.UpdateTodoResponse;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.p2791b.C56265d;
import com.ss.android.lark.todo.impl.rustadapter.service.RustLog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J+\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0013\u0010'\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010(J/\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010-JM\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00152\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u0002032\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u000605H@ø\u0001\u0000¢\u0006\u0002\u00106J1\u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u000b\u001a\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0006\u0010:\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J#\u0010?\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u000101H@ø\u0001\u0000¢\u0006\u0002\u0010@J'\u0010A\u001a\u0004\u0018\u00010\t2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J-\u0010B\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0002\u0010CJ1\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0006\u0010G\u001a\u00020HH@ø\u0001\u0000¢\u0006\u0002\u0010IJ'\u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0002\u0010MR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD;", "", "()V", "PAGE_SIZE", "", "TAG", "", "createTodo", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "todo", "chatId", "(Lcom/bytedance/lark/pb/todo/v1/Todo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDraft", "", "scene", "Lcom/bytedance/lark/pb/todo/v1/DraftScene$Scene;", "Lcom/ss/android/lark/todo/impl/rustadapter/CreateTodoScene;", "sceneId", "(Lcom/bytedance/lark/pb/todo/v1/DraftScene$Scene;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodo", "", "guid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "followTodo", "Lcom/bytedance/lark/pb/todo/v1/FollowTodoResponse;", "todoGuid", "authScene", "Lcom/bytedance/lark/pb/todo/v1/AuthScene;", "isFollow", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/AuthScene;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReferResources", "Lcom/bytedance/lark/pb/todo/v1/TodoReferResource;", "resourceId", "getServerTodo", "getShareTodo", "authId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodo", "getTodoBadge", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodoHistory", "Lcom/bytedance/lark/pb/todo/v1/GetTodoHistoryRecordsResponse;", "cursor", "firstPage", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markTodoCompleted", "isCompleted", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/todo/v1/MarkTodoCompletedRequest$Type;", "userIds", "", "(Ljava/lang/String;ZLcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/bytedance/lark/pb/todo/v1/MarkTodoCompletedRequest$Type;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeMessages", "Lcom/bytedance/lark/pb/todo/v1/MergeMessagesAsTodoResourceResponse;", "msgIds", "shouldMerge", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeTopicAsTodo", "Lcom/bytedance/lark/pb/todo/v1/MergeTopicAsTodoResourceResponse;", "threadId", "quitTodo", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restoreDraft", "saveDraft", "(Lcom/bytedance/lark/pb/todo/v1/DraftScene$Scene;Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareTodo", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageResponse;", "chatIds", "shareType", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageRequest$ShareType;", "(Ljava/lang/String;Ljava/util/List;Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageRequest$ShareType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodo", "oldTodo", "newTodo", "(Lcom/bytedance/lark/pb/todo/v1/Todo;Lcom/bytedance/lark/pb/todo/v1/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f */
public final class TodoRustCRUD {

    /* renamed from: a */
    public static final TodoRustCRUD f141115a = new TodoRustCRUD();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007H@"}, d2 = {"createTodo", "", "todo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "chatId", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {72}, mo239176m = "createTodo", mo239177n = {"this", "todo", "chatId", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$a */
    public static final class C57244a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57244a(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194303a((Todo) null, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH@"}, d2 = {"restoreDraft", "", "scene", "Lcom/bytedance/lark/pb/todo/v1/DraftScene$Scene;", "Lcom/ss/android/lark/todo/impl/rustadapter/CreateTodoScene;", "sceneId", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {404}, mo239176m = "restoreDraft", mo239177n = {"this", "scene", "sceneId", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$aa */
    public static final class C57245aa extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57245aa(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194301a((DraftScene.Scene) null, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH@"}, d2 = {"shareTodo", "", "guid", "", "chatIds", "", "shareType", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageRequest$ShareType;", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {259}, mo239176m = "shareTodo", mo239177n = {"this", "guid", "chatIds", "shareType", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$ad */
    public static final class C57248ad extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57248ad(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194308a((String) null, (List<String>) null, (ShareTodoMessageRequest.ShareType) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006H@"}, d2 = {"updateTodo", "", "oldTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "newTodo", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {163}, mo239176m = "updateTodo", mo239177n = {"this", "oldTodo", "newTodo", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$af */
    public static final class C57250af extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57250af(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194302a((Todo) null, (Todo) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"deleteTodo", "", "guid", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0}, mo239175l = {181}, mo239176m = "deleteTodo", mo239177n = {"this", "guid", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$d */
    public static final class C57254d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57254d(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194315c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH@"}, d2 = {"followTodo", "", "todoGuid", "", "authScene", "Lcom/bytedance/lark/pb/todo/v1/AuthScene;", "isFollow", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/todo/v1/FollowTodoResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {353}, mo239176m = "followTodo", mo239177n = {"this", "todoGuid", "authScene", "isFollow", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$f */
    public static final class C57256f extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57256f(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194304a((String) null, (AuthScene) null, false, (Continuation<? super SdkResponse<FollowTodoResponse>>) this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H@"}, d2 = {"getReferResources", "", "resourceId", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/TodoReferResource;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0}, mo239175l = {309}, mo239176m = "getReferResources", mo239177n = {"this", "resourceId", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$h */
    public static final class C57258h extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57258h(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194316d(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H@"}, d2 = {"getServerTodo", "", "guid", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0}, mo239175l = {SmEvents.EVENT_RS}, mo239176m = "getServerTodo", mo239177n = {"this", "guid", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$j */
    public static final class C57260j extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57260j(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194314b(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H@"}, d2 = {"getShareTodo", "", "guid", "", "authId", "authScene", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {143}, mo239176m = "getShareTodo", mo239177n = {"this", "guid", "authId", "authScene", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$l */
    public static final class C57262l extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57262l(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194306a((String) null, (String) null, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H@"}, d2 = {"getTodo", "", "guid", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0}, mo239175l = {92}, mo239176m = "getTodo", mo239177n = {"this", "guid", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$n */
    public static final class C57264n extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57264n(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194310a(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H@"}, d2 = {"getTodoBadge", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0}, mo239175l = {439}, mo239176m = "getTodoBadge", mo239177n = {"this", "builder"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$p */
    public static final class C57266p extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57266p(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194312a(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH@"}, d2 = {"getTodoHistory", "", "guid", "", "cursor", "firstPage", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/GetTodoHistoryRecordsResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {SmEvents.EVENT_HBRESET}, mo239176m = "getTodoHistory", mo239177n = {"this", "guid", "cursor", "firstPage", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$r */
    public static final class C57268r extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57268r(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194307a((String) null, (String) null, false, (Continuation<? super GetTodoHistoryRecordsResponse>) this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH@"}, d2 = {"mergeMessages", "", "chatId", "", "msgIds", "", "shouldMerge", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/MergeMessagesAsTodoResourceResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {286}, mo239176m = "mergeMessages", mo239177n = {"this", "chatId", "msgIds", "shouldMerge", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$u */
    public static final class C57271u extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57271u(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194309a((String) null, (List<String>) null, false, (Continuation<? super MergeMessagesAsTodoResourceResponse>) this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H@"}, d2 = {"mergeTopicAsTodo", "", "threadId", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/MergeTopicAsTodoResourceResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0}, mo239175l = {333}, mo239176m = "mergeTopicAsTodo", mo239177n = {"this", "threadId", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$w */
    public static final class C57273w extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57273w(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194317e(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, d2 = {"quitTodo", "", "todoGuid", "", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD", mo239173f = "TodoRustCRUD.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {370}, mo239176m = "quitTodo", mo239177n = {"this", "todoGuid", "todoSource", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$y */
    public static final class C57275y extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCRUD this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57275y(TodoRustCRUD fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194305a((String) null, (TodoSource) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$restoreDraft$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$ab */
    public static final class C57246ab implements RustLog.ParserString<Todo> {
        C57246ab() {
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            GetTodoDraftResponse decode = GetTodoDraftResponse.ADAPTER.decode(bArr);
            Boolean bool = decode.found;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.found");
            if (bool.booleanValue()) {
                return decode.todo;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$saveDraft$2", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Ljava/lang/Boolean;", "parseToString", "", "obj", "(Ljava/lang/Boolean;)Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$ac */
    public static final class C57247ac implements RustLog.ParserString<Boolean> {
        C57247ac() {
        }

        /* renamed from: a */
        public Boolean parse(byte[] bArr) {
            return true;
        }

        /* renamed from: a */
        public String mo194250a(Boolean bool) {
            String valueOf;
            if (bool == null || (valueOf = String.valueOf(bool.booleanValue())) == null) {
                return "NULL";
            }
            return valueOf;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$shareTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$ae */
    public static final class C57249ae implements RustLog.ParserString<ShareTodoMessageResponse> {
        C57249ae() {
        }

        /* renamed from: a */
        public ShareTodoMessageResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ShareTodoMessageResponse.ADAPTER.decode(bArr);
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(ShareTodoMessageResponse shareTodoMessageResponse) {
            Integer num;
            List<ShareTodoMessageResponse.ShareFailedChat> list;
            if (shareTodoMessageResponse == null || (list = shareTodoMessageResponse.failed_chats) == null) {
                num = null;
            } else {
                num = Integer.valueOf(list.size());
            }
            return String.valueOf(num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$updateTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$ag */
    public static final class C57251ag implements RustLog.ParserString<Todo> {
        C57251ag() {
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            UpdateTodoResponse decode;
            if (bArr == null || (decode = UpdateTodoResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.todo;
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$createTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$b */
    public static final class C57252b implements RustLog.ParserString<Todo> {
        C57252b() {
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            CreateTodoResponse decode;
            if (bArr == null || (decode = CreateTodoResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.todo;
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$deleteDraft$2", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Ljava/lang/Boolean;", "parseToString", "", "obj", "(Ljava/lang/Boolean;)Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$c */
    public static final class C57253c implements RustLog.ParserString<Boolean> {
        C57253c() {
        }

        /* renamed from: a */
        public Boolean parse(byte[] bArr) {
            return true;
        }

        /* renamed from: a */
        public String mo194250a(Boolean bool) {
            String valueOf;
            if (bool == null || (valueOf = String.valueOf(bool.booleanValue())) == null) {
                return "NULL";
            }
            return valueOf;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$deleteTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Ljava/lang/Boolean;", "parseToString", "", "obj", "(Ljava/lang/Boolean;)Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$e */
    public static final class C57255e implements RustLog.ParserString<Boolean> {
        C57255e() {
        }

        /* renamed from: a */
        public Boolean parse(byte[] bArr) {
            return true;
        }

        /* renamed from: a */
        public String mo194250a(Boolean bool) {
            String valueOf;
            if (bool == null || (valueOf = String.valueOf(bool.booleanValue())) == null) {
                return "NULL";
            }
            return valueOf;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$followTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/FollowTodoResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$g */
    public static final class C57257g implements RustLog.ParserString<FollowTodoResponse> {
        C57257g() {
        }

        /* renamed from: a */
        public FollowTodoResponse parse(byte[] bArr) {
            if (bArr != null) {
                return FollowTodoResponse.ADAPTER.decode(bArr);
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(FollowTodoResponse followTodoResponse) {
            Todo todo;
            String a;
            if (followTodoResponse == null || (todo = followTodoResponse.todo) == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$getReferResources$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/TodoReferResource;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$i */
    public static final class C57259i implements RustLog.ParserString<TodoReferResource> {
        C57259i() {
        }

        /* renamed from: a */
        public String mo194250a(TodoReferResource todoReferResource) {
            TodoReferResource.MessageResource messageResource;
            String str;
            if (todoReferResource == null || (messageResource = todoReferResource.msg) == null || (str = messageResource.msg_id) == null) {
                return "NULL";
            }
            return str;
        }

        /* renamed from: a */
        public TodoReferResource parse(byte[] bArr) {
            List<TodoReferResource> list;
            TodoReferResource todoReferResource;
            if (bArr != null) {
                GetTodoReferResourcesResponse decode = GetTodoReferResourcesResponse.ADAPTER.decode(bArr);
                if (decode != null && (list = decode.resources) != null && (todoReferResource = (TodoReferResource) CollectionsKt.firstOrNull((List) list)) != null) {
                    return todoReferResource;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$getServerTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$k */
    public static final class C57261k implements RustLog.ParserString<Todo> {
        C57261k() {
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            MGetServerTodosResponse decode;
            List<Todo> list;
            if (bArr == null || (decode = MGetServerTodosResponse.ADAPTER.decode(bArr)) == null || (list = decode.todos) == null || list.size() <= 0) {
                return null;
            }
            return list.get(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$getShareTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$m */
    public static final class C57263m implements RustLog.ParserString<Todo> {
        C57263m() {
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            GetSharedTodosResponse decode;
            List<Todo> list;
            if (bArr == null || (decode = GetSharedTodosResponse.ADAPTER.decode(bArr)) == null || (list = decode.todos) == null || list.size() <= 0) {
                return null;
            }
            return list.get(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$getTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$o */
    public static final class C57265o implements RustLog.ParserString<Todo> {
        C57265o() {
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            GetTodoResponse decode;
            if (bArr == null || (decode = GetTodoResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.todo;
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$getTodoBadge$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Ljava/lang/Integer;", "parseToString", "", "obj", "(Ljava/lang/Integer;)Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$q */
    public static final class C57267q implements RustLog.ParserString<Integer> {
        C57267q() {
        }

        /* renamed from: a */
        public String mo194250a(Integer num) {
            String valueOf;
            if (num == null || (valueOf = String.valueOf(num.intValue())) == null) {
                return "NULL";
            }
            return valueOf;
        }

        /* renamed from: a */
        public Integer parse(byte[] bArr) {
            if (bArr == null) {
                return 0;
            }
            GetTodoBadgeResponse decode = GetTodoBadgeResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                return decode.count;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$getTodoHistory$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/GetTodoHistoryRecordsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$s */
    public static final class C57269s implements RustLog.ParserString<GetTodoHistoryRecordsResponse> {
        C57269s() {
        }

        /* renamed from: a */
        public GetTodoHistoryRecordsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetTodoHistoryRecordsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(GetTodoHistoryRecordsResponse getTodoHistoryRecordsResponse) {
            List<Record> list;
            String valueOf;
            if (getTodoHistoryRecordsResponse == null || (list = getTodoHistoryRecordsResponse.records) == null || (valueOf = String.valueOf(list.size())) == null) {
                return "NULL";
            }
            return valueOf;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$markTodoCompleted$2", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$t */
    public static final class C57270t implements RustLog.ParserString<Todo> {
        C57270t() {
        }

        /* renamed from: a */
        public Todo parse(byte[] bArr) {
            MarkTodoCompletedResponse decode;
            if (bArr == null || (decode = MarkTodoCompletedResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.todo;
        }

        /* renamed from: a */
        public String mo194250a(Todo todo) {
            String a;
            if (todo == null || (a = C56265d.m219605a(todo)) == null) {
                return "NULL";
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$mergeMessages$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/MergeMessagesAsTodoResourceResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$v */
    public static final class C57272v implements RustLog.ParserString<MergeMessagesAsTodoResourceResponse> {
        C57272v() {
        }

        /* renamed from: a */
        public MergeMessagesAsTodoResourceResponse parse(byte[] bArr) {
            if (bArr != null) {
                return MergeMessagesAsTodoResourceResponse.ADAPTER.decode(bArr);
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(MergeMessagesAsTodoResourceResponse mergeMessagesAsTodoResourceResponse) {
            TodoReferResource todoReferResource;
            String str;
            if (mergeMessagesAsTodoResourceResponse == null || (todoReferResource = mergeMessagesAsTodoResourceResponse.resource) == null || (str = todoReferResource.id) == null) {
                return "NULL";
            }
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$mergeTopicAsTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/bytedance/lark/pb/todo/v1/MergeTopicAsTodoResourceResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$x */
    public static final class C57274x implements RustLog.ParserString<MergeTopicAsTodoResourceResponse> {
        C57274x() {
        }

        /* renamed from: a */
        public MergeTopicAsTodoResourceResponse parse(byte[] bArr) {
            if (bArr != null) {
                return MergeTopicAsTodoResourceResponse.ADAPTER.decode(bArr);
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(MergeTopicAsTodoResourceResponse mergeTopicAsTodoResourceResponse) {
            TodoReferResource todoReferResource;
            String str;
            if (mergeTopicAsTodoResourceResponse == null || (todoReferResource = mergeTopicAsTodoResourceResponse.resource) == null || (str = todoReferResource.id) == null) {
                return "NULL";
            }
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCRUD$quitTodo$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Lkotlin/Unit;", "parseToString", "", "obj", "(Lkotlin/Unit;)Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.f$z */
    public static final class C57276z implements RustLog.ParserString<Unit> {
        /* renamed from: a */
        public String mo194250a(Unit unit) {
            return "";
        }

        /* renamed from: a */
        public Unit parse(byte[] bArr) {
            return null;
        }

        C57276z() {
        }
    }

    private TodoRustCRUD() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194310a(java.lang.String r10, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.Todo> r11) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194310a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194306a(java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.Todo> r13) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194306a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194307a(java.lang.String r10, java.lang.String r11, boolean r12, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsResponse> r13) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194307a(java.lang.String, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo194311a(String str, boolean z, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List<String> list, Continuation<? super SdkResponse<Todo>> cVar) {
        MarkTodoCompletedRequest.C19585a a = new MarkTodoCompletedRequest.C19585a().mo66504a(str).mo66503a(C69089a.m265837a(z)).mo66502a(todoSource).mo66505a(list);
        a.mo66501a(!MultiCompleteHelper.f139390a.mo191984a(todoSource) ? MarkTodoCompletedRequest.Type.Todo : type);
        RustLog aVar = RustLog.f141092a;
        Command command = Command.MARK_TODO_COMPLETED;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        MarkTodoCompletedRequest.C19585a aVar2 = a;
        C57270t tVar = new C57270t();
        return aVar.mo194249a(command, aVar2, tVar, "guid: " + str + ", isCompleted: " + z + ",source: " + todoSource + ", type: " + type + ",  target_user_ids:" + list.size(), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194308a(java.lang.String r10, java.util.List<java.lang.String> r11, com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest.ShareType r12, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse> r13) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194308a(java.lang.String, java.util.List, com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest$ShareType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194309a(java.lang.String r10, java.util.List<java.lang.String> r11, boolean r12, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.MergeMessagesAsTodoResourceResponse> r13) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194309a(java.lang.String, java.util.List, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194305a(java.lang.String r10, com.bytedance.lark.pb.todo.v1.TodoSource r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194305a(java.lang.String, com.bytedance.lark.pb.todo.v1.TodoSource, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194312a(kotlin.coroutines.Continuation<? super java.lang.Integer> r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194312a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194314b(java.lang.String r10, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.Todo> r11) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194314b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194315c(java.lang.String r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194315c(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194316d(java.lang.String r10, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.TodoReferResource> r11) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194316d(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194317e(java.lang.String r10, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.MergeTopicAsTodoResourceResponse> r11) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194317e(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo194313b(DraftScene.Scene scene, String str, Continuation<? super Unit> cVar) {
        DeleteTodoDraftRequest.C19493a a = new DeleteTodoDraftRequest.C19493a().mo66278a(new DraftScene.C19499a().mo66292a(scene).mo66293a(str).build());
        RustLog aVar = RustLog.f141092a;
        Command command = Command.DELETE_TODO_DRAFT;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        DeleteTodoDraftRequest.C19493a aVar2 = a;
        C57253c cVar2 = new C57253c();
        Object a2 = aVar.mo194249a(command, aVar2, cVar2, "scene: " + scene + ", sceneId: " + str, cVar);
        if (a2 == C69086a.m265828a()) {
            return a2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194301a(com.bytedance.lark.pb.todo.v1.DraftScene.Scene r10, java.lang.String r11, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.Todo> r12) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194301a(com.bytedance.lark.pb.todo.v1.DraftScene$Scene, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194302a(com.bytedance.lark.pb.todo.v1.Todo r10, com.bytedance.lark.pb.todo.v1.Todo r11, kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse<com.bytedance.lark.pb.todo.v1.Todo>> r12) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194302a(com.bytedance.lark.pb.todo.v1.Todo, com.bytedance.lark.pb.todo.v1.Todo, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194303a(com.bytedance.lark.pb.todo.v1.Todo r10, java.lang.String r11, kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse<com.bytedance.lark.pb.todo.v1.Todo>> r12) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194303a(com.bytedance.lark.pb.todo.v1.Todo, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo194300a(DraftScene.Scene scene, String str, Todo todo, Continuation<? super Unit> cVar) {
        SaveTodoDraftRequest.C19627a a = new SaveTodoDraftRequest.C19627a().mo66596a(new DraftScene.C19499a().mo66292a(scene).mo66293a(str).build()).mo66597a(todo);
        RustLog aVar = RustLog.f141092a;
        Command command = Command.SAVE_TODO_DRAFT;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        SaveTodoDraftRequest.C19627a aVar2 = a;
        C57247ac acVar = new C57247ac();
        Object a2 = aVar.mo194249a(command, aVar2, acVar, "scene: " + scene + ", sceneId: " + str + ", todo: " + C56265d.m219605a(todo), cVar);
        if (a2 == C69086a.m265828a()) {
            return a2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194304a(java.lang.String r11, com.bytedance.lark.pb.todo.v1.AuthScene r12, boolean r13, kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse<com.bytedance.lark.pb.todo.v1.FollowTodoResponse>> r14) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD.mo194304a(java.lang.String, com.bytedance.lark.pb.todo.v1.AuthScene, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m221862a(TodoRustCRUD fVar, String str, String str2, boolean z, Continuation cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return fVar.mo194307a(str, str2, z, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.todo.impl.rustadapter.a.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ Object m221863a(TodoRustCRUD fVar, String str, boolean z, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            todoSource = null;
        }
        if ((i & 8) != 0) {
            type = MarkTodoCompletedRequest.Type.USER;
        }
        if ((i & 16) != 0) {
            list = new ArrayList();
        }
        return fVar.mo194311a(str, z, todoSource, type, list, cVar);
    }
}
