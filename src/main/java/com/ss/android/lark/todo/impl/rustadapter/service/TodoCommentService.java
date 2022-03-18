package com.ss.android.lark.todo.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.DocEntity;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.CreateCommentInfo;
import com.bytedance.lark.pb.todo.v1.CreateCommentResponse;
import com.bytedance.lark.pb.todo.v1.DeleteCommentDraftRequest;
import com.bytedance.lark.pb.todo.v1.GetCommentDraftResponse;
import com.bytedance.lark.pb.todo.v1.ListCommentsRequest;
import com.bytedance.lark.pb.todo.v1.ListCommentsResponse;
import com.bytedance.lark.pb.todo.v1.SaveCommentDraftRequest;
import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.bytedance.lark.pb.todo.v1.UpdateCommentRequest;
import com.bytedance.lark.pb.todo.v1.UpdateCommentResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.todo.SendTodoHeartbeatRequest;
import com.ss.android.lark.pb.todo.SendTodoHeartbeatResponse;
import com.ss.android.lark.pb.todo_comments.CreateTodoCommentReactionRequest;
import com.ss.android.lark.pb.todo_comments.CreateTodoCommentReactionResponse;
import com.ss.android.lark.pb.todo_comments.DeleteTodoCommentReactionRequest;
import com.ss.android.lark.pb.todo_comments.DeleteTodoCommentReactionResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.RustLog;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c */
public final class TodoCommentService {

    /* renamed from: a */
    public static final TodoCommentService f141101a = new TodoCommentService();

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$a */
    public static final class C57216a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoCommentService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57216a(TodoCommentService cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194254a((String) null, (RichText) null, (List<TodoAttachment>) null, (String) null, this);
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$f */
    public static final class C57221f extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoCommentService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57221f(TodoCommentService cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194256a((String) null, (String) null, this);
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$k */
    public static final class C57226k extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoCommentService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57226k(TodoCommentService cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194253a((String) null, 0, 0, (ListCommentsRequest.Direction) null, this);
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$m */
    public static final class C57228m extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoCommentService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57228m(TodoCommentService cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194257a(null, this);
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$b */
    public static final class C57217b implements RustLog.ParserString<TodoComment> {
        C57217b() {
        }

        /* renamed from: a */
        public TodoComment parse(byte[] bArr) {
            if (bArr != null) {
                return CreateCommentResponse.ADAPTER.decode(bArr).comment;
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(TodoComment todoComment) {
            String str;
            if (todoComment == null || (str = todoComment.cid) == null) {
                return "";
            }
            return str;
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$c */
    public static final class C57218c implements RustLog.ParserString<Unit> {
        /* renamed from: a */
        public String mo194250a(Unit unit) {
            return "";
        }

        /* renamed from: a */
        public void mo194266a(byte[] bArr) {
        }

        C57218c() {
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            mo194266a(bArr);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$g */
    public static final class C57222g implements RustLog.ParserString<Unit> {
        /* renamed from: a */
        public String mo194250a(Unit unit) {
            return "";
        }

        /* renamed from: a */
        public void mo194270a(byte[] bArr) {
        }

        C57222g() {
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            mo194270a(bArr);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$h */
    public static final class C57223h implements RustLog.ParserString<Unit> {
        /* renamed from: a */
        public String mo194250a(Unit unit) {
            return "";
        }

        /* renamed from: a */
        public void mo194272a(byte[] bArr) {
        }

        C57223h() {
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            mo194272a(bArr);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$l */
    public static final class C57227l implements RustLog.ParserString<ListCommentsResponse> {
        C57227l() {
        }

        /* renamed from: a */
        public ListCommentsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListCommentsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(ListCommentsResponse listCommentsResponse) {
            List<TodoComment> list;
            if (!(listCommentsResponse == null || (list = listCommentsResponse.comments) == null)) {
                List<TodoComment> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().cid);
                }
                String obj = arrayList.toString();
                if (obj != null) {
                    return obj;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$n */
    public static final class C57229n implements RustLog.ParserString<CreateCommentInfo> {
        C57229n() {
        }

        /* renamed from: a */
        public String mo194250a(CreateCommentInfo createCommentInfo) {
            String str;
            if (createCommentInfo == null || (str = createCommentInfo.cid) == null) {
                return "";
            }
            return str;
        }

        /* renamed from: a */
        public CreateCommentInfo parse(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            GetCommentDraftResponse decode = GetCommentDraftResponse.ADAPTER.decode(bArr);
            Boolean bool = decode.found;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.found");
            if (bool.booleanValue()) {
                return decode.info;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$q */
    public static final class C57232q implements RustLog.ParserString<TodoComment> {
        C57232q() {
        }

        /* renamed from: a */
        public TodoComment parse(byte[] bArr) {
            if (bArr != null) {
                return UpdateCommentResponse.ADAPTER.decode(bArr).comment;
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(TodoComment todoComment) {
            String str;
            if (todoComment == null || (str = todoComment.cid) == null) {
                return "";
            }
            return str;
        }
    }

    private TodoCommentService() {
    }

    /* renamed from: a */
    public final void mo194259a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str3, "reactionKey");
        TodoAppreciableHitPoint.f141058a.mo194163q();
        TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145376a(str3);
        SdkSender.sendPassThroughRequest(Command.CREATE_TODO_COMMENT_REACTION, new CreateTodoCommentReactionRequest(str, str2, str3).newBuilder(), new C57219d(str, str2, str3), C57220e.f141105a);
        TodoHitPoint.f141073a.mo194229g("select_reaction", str);
    }

    /* renamed from: a */
    public final void mo194258a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        SdkSender.sendPassThroughRequest(Command.SEND_TODO_HEARTBEAT, new SendTodoHeartbeatRequest(str).newBuilder(), new C57230o(str), C57231p.f141111a);
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$o */
    public static final class C57230o implements IGetDataCallback<SendTodoHeartbeatResponse> {

        /* renamed from: a */
        final /* synthetic */ String f141110a;

        C57230o(String str) {
            this.f141110a = str;
        }

        /* renamed from: a */
        public void onSuccess(SendTodoHeartbeatResponse sendTodoHeartbeatResponse) {
            Log.m165389i("TodoCommentService", "send todo heartbeat success, guid " + this.f141110a);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("TodoCommentService", "send todo heartbeat failed, guid " + this.f141110a + ", " + errorResult.getDebugMsg());
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$e */
    public static final class C57220e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C57220e f141105a = new C57220e();

        C57220e() {
        }

        /* renamed from: a */
        public final CreateTodoCommentReactionResponse parse(byte[] bArr) {
            return CreateTodoCommentReactionResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$j */
    public static final class C57225j<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C57225j f141109a = new C57225j();

        C57225j() {
        }

        /* renamed from: a */
        public final DeleteTodoCommentReactionResponse parse(byte[] bArr) {
            return DeleteTodoCommentReactionResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$p */
    public static final class C57231p<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C57231p f141111a = new C57231p();

        C57231p() {
        }

        /* renamed from: a */
        public final SendTodoHeartbeatResponse parse(byte[] bArr) {
            return SendTodoHeartbeatResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    private final RichContent m221800a(RichText richText) {
        return new RichContent.C15157a().mo55253a(C56473b.m220114a(richText)).mo55251a((DocEntity) null).build();
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$d */
    public static final class C57219d implements IGetDataCallback<CreateTodoCommentReactionResponse> {

        /* renamed from: a */
        final /* synthetic */ String f141102a;

        /* renamed from: b */
        final /* synthetic */ String f141103b;

        /* renamed from: c */
        final /* synthetic */ String f141104c;

        /* renamed from: a */
        public void onSuccess(CreateTodoCommentReactionResponse createTodoCommentReactionResponse) {
            Log.m165389i("TodoCommentService", "create todo comment reaction success, guid " + this.f141102a + ", commentId " + this.f141103b + ", reactionKey " + this.f141104c);
            TodoAppreciableHitPoint.f141058a.mo194164r();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("TodoCommentService", "create todo comment reaction failed, guid " + this.f141102a + ", commentId " + this.f141103b + ", reactionKey " + this.f141104c + ", " + errorResult.getDebugMsg());
            TodoAppreciableHitPoint.f141058a.mo194150g(errorResult);
        }

        C57219d(String str, String str2, String str3) {
            this.f141102a = str;
            this.f141103b = str2;
            this.f141104c = str3;
        }
    }

    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.c$i */
    public static final class C57224i implements IGetDataCallback<DeleteTodoCommentReactionResponse> {

        /* renamed from: a */
        final /* synthetic */ String f141106a;

        /* renamed from: b */
        final /* synthetic */ String f141107b;

        /* renamed from: c */
        final /* synthetic */ String f141108c;

        /* renamed from: a */
        public void onSuccess(DeleteTodoCommentReactionResponse deleteTodoCommentReactionResponse) {
            Log.m165389i("TodoCommentService", "delete todo comment reaction success, guid " + this.f141106a + ", commentId " + this.f141107b + ", reactionKey " + this.f141108c);
            TodoAppreciableHitPoint.f141058a.mo194166t();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("TodoCommentService", "delete todo comment reaction failed, guid " + this.f141106a + ", commentId " + this.f141107b + ", reactionKey " + this.f141108c + ", " + errorResult.getDebugMsg());
            TodoAppreciableHitPoint.f141058a.mo194152h(errorResult);
        }

        C57224i(String str, String str2, String str3) {
            this.f141106a = str;
            this.f141107b = str2;
            this.f141108c = str3;
        }
    }

    /* renamed from: b */
    public final Object mo194261b(String str, Continuation<? super Unit> cVar) {
        DeleteCommentDraftRequest.C19489a newBuilder = new DeleteCommentDraftRequest(str).newBuilder();
        RustLog aVar = RustLog.f141092a;
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.DELETE_TODO_COMMENT_DRAFT;
        Intrinsics.checkExpressionValueIsNotNull(newBuilder, "builder");
        Object a = aVar.mo194249a(command, newBuilder, new C57223h(), str, cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194257a(java.lang.String r8, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.CreateCommentInfo> r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoCommentService.mo194257a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo194262b(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str3, "reactionKey");
        TodoAppreciableHitPoint.f141058a.mo194165s();
        SdkSender.sendPassThroughRequest(Command.DELETE_TODO_COMMENT_REACTION, new DeleteTodoCommentReactionRequest(str, str2, str3).newBuilder(), new C57224i(str, str2, str3), C57225j.f141109a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194256a(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoCommentService.mo194256a(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo194255a(String str, String str2, RichText richText, List<TodoAttachment> list, Continuation<? super SdkResponse<TodoComment>> cVar) {
        UpdateCommentRequest.C19675a newBuilder = new UpdateCommentRequest(str, str2, m221800a(richText), list).newBuilder();
        RustLog aVar = RustLog.f141092a;
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.UPDATE_TODO_COMMENT;
        Intrinsics.checkExpressionValueIsNotNull(newBuilder, "builder");
        return aVar.mo194249a(command, newBuilder, new C57232q(), str, cVar);
    }

    /* renamed from: b */
    public final Object mo194260b(String str, RichText richText, List<TodoAttachment> list, String str2, Continuation<? super Unit> cVar) {
        RichContent richContent;
        if (richText != null) {
            richContent = m221800a(richText);
        } else {
            richContent = null;
        }
        SaveCommentDraftRequest.C19625a newBuilder = new SaveCommentDraftRequest(str, new CreateCommentInfo(richContent, str2, null, null, list, TodoComment.Type.RICH_TEXT)).newBuilder();
        RustLog aVar = RustLog.f141092a;
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.SAVE_TODO_COMMENT_DRAFT;
        Intrinsics.checkExpressionValueIsNotNull(newBuilder, "builder");
        Object a = aVar.mo194249a(command, newBuilder, new C57218c(), str, cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194253a(java.lang.String r8, int r9, int r10, com.bytedance.lark.pb.todo.v1.ListCommentsRequest.Direction r11, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.ListCommentsResponse> r12) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoCommentService.mo194253a(java.lang.String, int, int, com.bytedance.lark.pb.todo.v1.ListCommentsRequest$Direction, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194254a(java.lang.String r19, com.ss.android.lark.widget.richtext.RichText r20, java.util.List<com.bytedance.lark.pb.todo.v1.TodoAttachment> r21, java.lang.String r22, kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse<com.bytedance.lark.pb.todo.v1.TodoComment>> r23) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoCommentService.mo194254a(java.lang.String, com.ss.android.lark.widget.richtext.RichText, java.util.List, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m221801a(TodoCommentService cVar, String str, int i, int i2, ListCommentsRequest.Direction direction, Continuation cVar2, int i3, Object obj) {
        int i4;
        if ((i3 & 4) != 0) {
            i4 = 10;
        } else {
            i4 = i2;
        }
        if ((i3 & 8) != 0) {
            direction = ListCommentsRequest.Direction.UP;
        }
        return cVar.mo194253a(str, i, i4, direction, cVar2);
    }
}
