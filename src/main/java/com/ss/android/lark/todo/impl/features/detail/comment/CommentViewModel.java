package com.ss.android.lark.todo.impl.features.detail.comment;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.todo.v1.CreateCommentInfo;
import com.bytedance.lark.pb.todo.v1.ListCommentsResponse;
import com.bytedance.lark.pb.todo.v1.PushTodoComment;
import com.bytedance.lark.pb.todo.v1.PushTodoCommentReaction;
import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.bytedance.lark.pb.todo.v1.TodoCommentReaction;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoCommentService;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002J.\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002J,\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0018\u0010$\u001a\u00020\u000b2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0017H\u0002J\b\u0010'\u001a\u00020\u000bH\u0016J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u000bH\u0002J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020-H\u0002J\u0012\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020\u000bH\u0002J\u0010\u00102\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u000b2\u0006\u0010)\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u000bH\u0002J.\u00107\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\t2\u0006\u00100\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "isFirstInit", "", "taskId", "", "checkUpdateAtUser", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "commentPanelEditClick", "info", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentEditInfo;", "commentPanelReactionClick", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentItemReactionInfo;", "commentPanelReplyClick", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentReplyInfo;", "createComment", "attachments", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "replyParentId", "createCommentDraft", "deleteComment", "commentId", "deleteCommentDraft", "handleAction", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "handleGetUrlPreview", "comments", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "initViewData", "keyboardShow", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardStateInfo;", "loadCommentTry", "pushCommentData", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPushData;", "pushCommentReactionData", "readComment", "position", "readCommentDraft", "saveCommentDraft", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSaveDraftInfo;", "sendComment", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSendInfo;", "showMoreComment", "updateComment", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w */
public final class CommentViewModel extends ViewModelSection<TodoDetailModel> {
    public static final Companion Companion = new Companion(null);
    private boolean isFirstInit = true;
    public String taskId = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentViewModel$Companion;", "", "()V", "ErrCommentImageCode", "", "ErrCommentTextCode", "TAG", "", "fromPb", "Lcom/ss/android/lark/widget/richtext/RichText;", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final RichText mo192495a(RichContent richContent) {
            return C56473b.m220117a(richContent.rich_text);
        }
    }

    private final void deleteCommentDraft() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56562e(this, null), 2, null);
    }

    public final void readCommentDraft() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56566i(this, null), 2, null);
    }

    private final void loadCommentTry() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getCommentIsLoading().mo5929b((Boolean) true);
        adVar.getCommentLoadingFailed().mo92061d(false);
        readComment$default(this, 0, 1, null);
    }

    private final void showMoreComment() {
        int i;
        TodoComment todoComment;
        Integer num;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getCommentLoadingMore().mo5929b((Boolean) true);
        List<TodoComment> b = adVar.getCommentLv().mo5927b();
        if (b == null || (todoComment = (TodoComment) CollectionsKt.first((List) b)) == null || (num = todoComment.position) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = num.intValue();
        }
        readComment(i - 1);
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getInitComment().mo5925a(new C56564g(adVar, this));
        adVar.getCommentInitChatId().mo5929b(((TodoDetailModel) getModelStore()).getChatIdForAddAssignee());
        this.taskId = adVar.getGuid();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$createComment$1", mo239173f = "CommentViewModel.kt", mo239174i = {0, 0}, mo239175l = {430}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$b */
    public static final class C56558b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $attachments;
        final /* synthetic */ String $replyParentId;
        final /* synthetic */ RichText $richText;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56558b(CommentViewModel wVar, RichText richText, List list, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
            this.$richText = richText;
            this.$attachments = list;
            this.$replyParentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56558b bVar = new C56558b(this.this$0, this.$richText, this.$attachments, this.$replyParentId, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56558b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/todo/impl/features/detail/comment/CommentViewModel$createComment$1$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$b$a */
        public static final class RunnableC56559a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SdkResponse f139900a;

            /* renamed from: b */
            final /* synthetic */ TodoDetailModel f139901b;

            RunnableC56559a(SdkResponse bVar, TodoDetailModel adVar) {
                this.f139900a = bVar;
                this.f139901b = adVar;
            }

            public final void run() {
                ErrorResult b;
                ErrorResult b2 = this.f139900a.mo194252b();
                if ((b2 != null && b2.getErrorCode() == 40016) || ((b = this.f139900a.mo194252b()) != null && b.getErrorCode() == 40017)) {
                    this.f139901b.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Report_FailedToSend, 2, null, 4, null)));
                } else if (this.f139900a.mo194252b() != null) {
                    this.f139901b.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_common_ActionFailedTryAgainLater, 2, null, 4, null)));
                } else {
                    TodoComment todoComment = (TodoComment) this.f139900a.mo194251a();
                    if (todoComment != null && todoComment.status != TodoComment.Status.DELETED) {
                        ArrayList arrayList = new ArrayList();
                        List<TodoComment> b3 = this.f139901b.getCommentLv().mo5927b();
                        if (b3 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(b3, "it");
                            arrayList.addAll(b3);
                        }
                        ArrayList arrayList2 = arrayList;
                        boolean z = false;
                        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (Intrinsics.areEqual(((TodoComment) it.next()).id, todoComment.id)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            arrayList.add(todoComment);
                            this.f139901b.getCommentLv().mo5926a(arrayList);
                            this.f139901b.getScrollToBottomOfComments().mo5926a(new Pair<>(Integer.valueOf(arrayList.size()), true));
                            this.f139901b.getReplyCommentInfo().mo5926a((Pair<Integer, TodoComment>) null);
                        }
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoDetailModel adVar;
            String str;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194160n();
                TodoDetailModel adVar2 = (TodoDetailModel) this.this$0.getModelStore();
                TodoCommentService cVar = TodoCommentService.f141101a;
                String guid = adVar2.getGuid();
                RichText richText = this.$richText;
                List<TodoAttachment> list = this.$attachments;
                String str2 = this.$replyParentId;
                this.L$0 = ahVar;
                this.L$1 = adVar2;
                this.label = 1;
                obj = cVar.mo194254a(guid, richText, list, str2, this);
                if (obj == a) {
                    return a;
                }
                adVar = adVar2;
            } else if (i == 1) {
                adVar = (TodoDetailModel) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar != null) {
                UICallbackExecutor.execute(new RunnableC56559a(bVar, adVar));
            }
            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
            String str3 = this.$replyParentId;
            if (!(str3 == null || str3.length() == 0)) {
                z = false;
            }
            if (z) {
                str = "new";
            } else {
                str = "reply";
            }
            aVar.mo194132a(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    private final void deleteComment(String str) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56561d(this, str, null), 2, null);
    }

    public final void handleGetUrlPreview(List<TodoComment> list) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56563f(this, list, null), 2, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$createCommentDraft$1", mo239173f = "CommentViewModel.kt", mo239174i = {0}, mo239175l = {522}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$c */
    public static final class C56560c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $attachments;
        final /* synthetic */ String $replyParentId;
        final /* synthetic */ RichText $richText;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56560c(CommentViewModel wVar, RichText richText, List list, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
            this.$richText = richText;
            this.$attachments = list;
            this.$replyParentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56560c cVar2 = new C56560c(this.this$0, this.$richText, this.$attachments, this.$replyParentId, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56560c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoCommentService cVar = TodoCommentService.f141101a;
                String str = this.this$0.taskId;
                RichText richText = this.$richText;
                List<TodoAttachment> list = this.$attachments;
                String str2 = this.$replyParentId;
                this.L$0 = ahVar;
                this.label = 1;
                if (cVar.mo194260b(str, richText, list, str2, this) == a) {
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$deleteCommentDraft$1", mo239173f = "CommentViewModel.kt", mo239174i = {0}, mo239175l = {554}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$e */
    public static final class C56562e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56562e(CommentViewModel wVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56562e eVar = new C56562e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56562e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoCommentService cVar = TodoCommentService.f141101a;
                String str = this.this$0.taskId;
                this.L$0 = ahVar;
                this.label = 1;
                if (cVar.mo194261b(str, this) == a) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/comment/CommentViewModel$initViewData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$g */
    static final class C56564g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailModel f139902a;

        /* renamed from: b */
        final /* synthetic */ CommentViewModel f139903b;

        C56564g(TodoDetailModel adVar, CommentViewModel wVar) {
            this.f139902a = adVar;
            this.f139903b = wVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (!this.f139902a.isCreateTodo()) {
                TodoGeneralHitPoint.f141070a.mo194207i(this.f139902a.getGuid());
                this.f139902a.getCommentIsLoading().mo5929b((Boolean) true);
                CommentViewModel.readComment$default(this.f139903b, 0, 1, null);
                this.f139903b.readCommentDraft();
            }
        }
    }

    private final void saveCommentDraft(CommentSaveDraftInfo sVar) {
        String str;
        TodoComment second;
        RichText a = sVar.mo192462a();
        List<TodoAttachment> b = sVar.mo192463b();
        Pair<Integer, TodoComment> b2 = ((TodoDetailModel) getModelStore()).getReplyCommentInfo().mo5927b();
        if (b2 == null || (second = b2.getSecond()) == null) {
            str = null;
        } else {
            str = second.id;
        }
        createCommentDraft(a, b, str);
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 130) {
            showMoreComment();
        } else if (i == 139) {
            deleteCommentDraft();
        } else if (i == 143) {
            TodoCommentService.f141101a.mo194258a(((TodoDetailModel) getModelStore()).getGuid());
        } else if (i == 146) {
            loadCommentTry();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$readCommentDraft$1", mo239173f = "CommentViewModel.kt", mo239174i = {0, 0}, mo239175l = {529}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$i */
    public static final class C56566i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56566i(CommentViewModel wVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56566i iVar = new C56566i(this.this$0, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56566i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoDetailModel adVar;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoDetailModel adVar2 = (TodoDetailModel) this.this$0.getModelStore();
                TodoCommentService cVar = TodoCommentService.f141101a;
                String guid = adVar2.getGuid();
                this.L$0 = ahVar;
                this.L$1 = adVar2;
                this.label = 1;
                obj = cVar.mo194257a(guid, this);
                if (obj == a) {
                    return a;
                }
                adVar = adVar2;
            } else if (i == 1) {
                adVar = (TodoDetailModel) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CreateCommentInfo createCommentInfo = (CreateCommentInfo) obj;
            C1177w<CommentDraftInfo> commentDraftLv = adVar.getCommentDraftLv();
            CommentDraftInfo fVar = null;
            RichText richText = null;
            if (createCommentInfo != null) {
                RichContent richContent = createCommentInfo.content;
                if (richContent != null) {
                    richText = CommentViewModel.Companion.mo192495a(richContent);
                }
                this.this$0.checkUpdateAtUser(richText);
                List<TodoAttachment> list = createCommentInfo.attachments;
                Intrinsics.checkExpressionValueIsNotNull(list, "this.attachments");
                fVar = new CommentDraftInfo(richText, list, createCommentInfo.reply_parent_id);
            }
            commentDraftLv.mo5926a(fVar);
            return Unit.INSTANCE;
        }
    }

    private final void readComment(int i) {
        if (TextUtils.isEmpty(((TodoDetailModel) getModelStore()).getGuid())) {
            ((TodoDetailModel) getModelStore()).getCommentIsLoading().mo5929b((Boolean) false);
            ((TodoDetailModel) getModelStore()).getCommentLoadingMore().mo5929b((Boolean) false);
            return;
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56565h(this, i, null), 2, null);
    }

    public final void checkUpdateAtUser(RichText richText) {
        List<String> list;
        RichText.RichTextElements elements;
        Map<String, RichTextElement> dictionary;
        RichTextElement richTextElement;
        RichTextElement.RichTextProperty property;
        if (richText != null) {
            list = richText.getAtIds();
        } else {
            list = null;
        }
        if (list != null) {
            for (String str : list) {
                if (!(richText == null || (elements = richText.getElements()) == null || (dictionary = elements.getDictionary()) == null || (richTextElement = dictionary.get(str)) == null || (property = richTextElement.getProperty()) == null || !(property instanceof RichTextElement.AtProperty))) {
                    RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) property;
                    atProperty.setOutChatUser(((TodoDetailModel) getModelStore()).isOutUser(atProperty.getUserId()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$deleteComment$1", mo239173f = "CommentViewModel.kt", mo239174i = {0, 0}, mo239175l = {499}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$d */
    public static final class C56561d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $commentId;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56561d(CommentViewModel wVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
            this.$commentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56561d dVar = new C56561d(this.this$0, this.$commentId, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56561d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoDetailModel adVar;
            String str;
            String str2;
            TodoComment second;
            TodoComment second2;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194161o();
                TodoDetailModel adVar2 = (TodoDetailModel) this.this$0.getModelStore();
                TodoCommentService cVar = TodoCommentService.f141101a;
                String guid = adVar2.getGuid();
                String str3 = this.$commentId;
                this.L$0 = ahVar;
                this.L$1 = adVar2;
                this.label = 1;
                if (cVar.mo194256a(guid, str3, this) == a) {
                    return a;
                }
                adVar = adVar2;
            } else if (i == 1) {
                adVar = (TodoDetailModel) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Unit unit = Unit.INSTANCE;
            Pair<Integer, TodoComment> b = adVar.getReplyCommentInfo().mo5927b();
            if (b == null || (second2 = b.getSecond()) == null) {
                str = null;
            } else {
                str = second2.id;
            }
            if (Intrinsics.areEqual(str, this.$commentId)) {
                adVar.getReplyCommentInfo().mo5926a((Pair<Integer, TodoComment>) null);
            }
            Pair<Integer, TodoComment> b2 = adVar.getEditCommentInfo().mo5927b();
            if (b2 == null || (second = b2.getSecond()) == null) {
                str2 = null;
            } else {
                str2 = second.id;
            }
            if (Intrinsics.areEqual(str2, this.$commentId)) {
                adVar.getEditCommentInfo().mo5926a((Pair<Integer, TodoComment>) null);
            }
            ArrayList arrayList = new ArrayList();
            List<TodoComment> b3 = adVar.getCommentLv().mo5927b();
            if (b3 != null) {
                Intrinsics.checkExpressionValueIsNotNull(b3, "it");
                C69089a.m265837a(arrayList.addAll(b3));
            }
            int i2 = 0;
            Iterator<TodoComment> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (C69089a.m265837a(Intrinsics.areEqual(it.next().id, this.$commentId)).booleanValue()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (C69089a.m265839a(i2) == null || i2 < 0) {
                return Unit.INSTANCE;
            }
            arrayList.remove(i2);
            adVar.getCommentLv().mo5926a(arrayList);
            TodoAppreciableHitPoint.f141058a.mo194162p();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$updateComment$1", mo239173f = "CommentViewModel.kt", mo239174i = {0, 0}, mo239175l = {469}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$j */
    public static final class C56567j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $attachments;
        final /* synthetic */ String $commentId;
        final /* synthetic */ int $position;
        final /* synthetic */ RichText $richText;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56567j(CommentViewModel wVar, String str, RichText richText, List list, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
            this.$commentId = str;
            this.$richText = richText;
            this.$attachments = list;
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56567j jVar = new C56567j(this.this$0, this.$commentId, this.$richText, this.$attachments, this.$position, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56567j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoDetailModel adVar;
            ErrorResult b;
            int i;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194160n();
                TodoDetailModel adVar2 = (TodoDetailModel) this.this$0.getModelStore();
                TodoCommentService cVar = TodoCommentService.f141101a;
                String guid = adVar2.getGuid();
                String str = this.$commentId;
                RichText richText = this.$richText;
                List<TodoAttachment> list = this.$attachments;
                this.L$0 = ahVar;
                this.L$1 = adVar2;
                this.label = 1;
                obj = cVar.mo194255a(guid, str, richText, list, this);
                if (obj == a) {
                    return a;
                }
                adVar = adVar2;
            } else if (i2 == 1) {
                adVar = (TodoDetailModel) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar != null) {
                ErrorResult b2 = bVar.mo194252b();
                if ((b2 == null || b2.getErrorCode() != 40016) && ((b = bVar.mo194252b()) == null || b.getErrorCode() != 40017)) {
                    TodoComment todoComment = (TodoComment) bVar.mo194251a();
                    if (!(todoComment == null || todoComment.status == TodoComment.Status.DELETED)) {
                        ArrayList arrayList = new ArrayList();
                        List<TodoComment> b3 = adVar.getCommentLv().mo5927b();
                        if (b3 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(b3, "it");
                            C69089a.m265837a(arrayList.addAll(b3));
                        }
                        if (this.$position < arrayList.size() && (i = this.$position) >= 0) {
                            arrayList.set(i, todoComment);
                        }
                        adVar.getCommentLv().mo5926a(arrayList);
                        adVar.getEditCommentInfo().mo5926a((Pair<Integer, TodoComment>) null);
                        EditedCommentDraftHolder.f139907a.mo192505b(this.$commentId);
                    }
                } else {
                    adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Report_FailedToSend, 2, null, 4, null)));
                }
            }
            TodoAppreciableHitPoint.f141058a.mo194132a("edit");
            return Unit.INSTANCE;
        }
    }

    private final void commentPanelEditClick(CommentEditInfo gVar) {
        RichText richText;
        List<TodoAttachment> list;
        RichContent richContent;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getBottomButtonVisible().mo92060c(false);
        adVar.getCommentKeyboardVisible().mo5929b((Boolean) true);
        TodoComment a = gVar.mo192386a();
        if (a == null || (richContent = a.rich_content) == null || (richText = Companion.mo192495a(richContent)) == null) {
            RichContent richContent2 = gVar.mo192387b().rich_content;
            if (richContent2 != null) {
                richText = Companion.mo192495a(richContent2);
            } else {
                richText = null;
            }
        }
        checkUpdateAtUser(richText);
        C1177w<CommentDraftInfo> commentDraftLv = adVar.getCommentDraftLv();
        TodoComment a2 = gVar.mo192386a();
        if (a2 == null || (list = a2.attachments) == null) {
            list = gVar.mo192387b().attachments;
            Intrinsics.checkExpressionValueIsNotNull(list, "info.itemComment.attachments");
        }
        commentDraftLv.mo5929b(new CommentDraftInfo(richText, list, gVar.mo192387b().id));
        adVar.getReplyCommentInfo().mo5929b((Pair<Integer, TodoComment>) null);
        adVar.getEditCommentInfo().mo5929b(new Pair<>(Integer.valueOf(gVar.mo192388c()), gVar.mo192387b()));
    }

    private final void commentPanelReactionClick(CommentItemReactionInfo jVar) {
        T t;
        List<TodoUser> list;
        List<TodoCommentReaction> list2 = jVar.mo192401a().reactions;
        Intrinsics.checkExpressionValueIsNotNull(list2, "info.item.reactions");
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.type, jVar.mo192402b())) {
                break;
            }
        }
        T t2 = t;
        if (!(t2 == null || (list = t2.users) == null)) {
            List<TodoUser> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().user_id);
            }
            if (arrayList.contains(CommentConstants.f139800a.mo192375a())) {
                TodoCommentService cVar = TodoCommentService.f141101a;
                String str = this.taskId;
                String str2 = jVar.mo192401a().id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "info.item.id");
                cVar.mo194262b(str, str2, jVar.mo192402b());
                return;
            }
        }
        TodoCommentService cVar2 = TodoCommentService.f141101a;
        String str3 = this.taskId;
        String str4 = jVar.mo192401a().id;
        Intrinsics.checkExpressionValueIsNotNull(str4, "info.item.id");
        cVar2.mo194259a(str3, str4, jVar.mo192402b());
    }

    private final void commentPanelReplyClick(CommentReplyInfo rVar) {
        String c;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TodoUser todoUser = rVar.mo192458b().from_user;
        adVar.getBottomButtonVisible().mo92060c(false);
        adVar.getCommentKeyboardVisible().mo5929b((Boolean) true);
        CommentDraftInfo b = adVar.getCommentDraftLv().mo5927b();
        if (!(b == null || (c = b.mo192382c()) == null || !(!Intrinsics.areEqual(c, rVar.mo192458b().id)))) {
            adVar.getCommentDraftLv().mo5929b(new CommentDraftInfo(null, new ArrayList(), rVar.mo192458b().id));
        }
        if (todoUser != null) {
            adVar.getCommentAtUserInfo().mo5929b(new CommentAtUserInfo(todoUser.user_id, todoUser.name, adVar.isOutUser(todoUser.user_id), 0));
        }
        adVar.getEditCommentInfo().mo5929b((Pair<Integer, TodoComment>) null);
        adVar.getReplyCommentInfo().mo5929b(new Pair<>(Integer.valueOf(rVar.mo192457a()), rVar.mo192458b()));
        TodoHitPoint.f141073a.mo194229g("reply_comment", adVar.getGuid());
    }

    private final void keyboardShow(CommentKeyboardStateInfo mVar) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        Pair<Integer, TodoComment> b = adVar.getEditCommentInfo().mo5927b();
        Pair<Integer, TodoComment> b2 = adVar.getReplyCommentInfo().mo5927b();
        if (!mVar.mo192435a()) {
            adVar.getEditCommentInfo().mo5929b((Pair<Integer, TodoComment>) null);
            adVar.getReplyCommentInfo().mo5929b((Pair<Integer, TodoComment>) null);
            TodoHitPoint.f141073a.mo194229g("cancel_comment", adVar.getGuid());
        } else {
            TodoHitPoint.f141073a.mo194229g("input_comment", adVar.getGuid());
        }
        if (!mVar.mo192435a()) {
            if (mVar.mo192436b()) {
                if (b != null) {
                    EditedCommentDraftHolder.f139907a.mo192504a(b.getSecond(), mVar.mo192437c(), mVar.mo192438d());
                    ((TodoDetailModel) getModelStore()).getCommentDraftLv().mo5929b((CommentDraftInfo) null);
                    readCommentDraft();
                } else if (b2 != null) {
                    createCommentDraft(mVar.mo192437c(), mVar.mo192438d(), b2.getSecond().id);
                } else {
                    createCommentDraft$default(this, mVar.mo192437c(), mVar.mo192438d(), null, 4, null);
                }
                ((TodoDetailModel) getModelStore()).getBottomHasDraft().mo5929b((Boolean) true);
                return;
            }
            deleteCommentDraft();
            ((TodoDetailModel) getModelStore()).getCommentDraftLv().mo5929b((CommentDraftInfo) null);
        } else if (!mVar.mo192436b()) {
            readCommentDraft();
        }
    }

    private final void pushCommentReactionData(CommentPushData qVar) {
        Object obj = qVar.mo192453a().get("todo_comment_reaction_notification");
        Object obj2 = null;
        if (!(obj instanceof PushTodoCommentReaction)) {
            obj = null;
        }
        PushTodoCommentReaction pushTodoCommentReaction = (PushTodoCommentReaction) obj;
        if (pushTodoCommentReaction != null && !(!Intrinsics.areEqual(pushTodoCommentReaction.todo_guid, ((TodoDetailModel) getModelStore()).getGuid()))) {
            ArrayList arrayList = new ArrayList();
            List<TodoComment> b = ((TodoDetailModel) getModelStore()).getCommentLv().mo5927b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "it");
                arrayList.addAll(b);
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((TodoComment) next).id, pushTodoCommentReaction.comment_id)) {
                        obj2 = next;
                        break;
                    }
                }
                TodoComment todoComment = (TodoComment) obj2;
                if (todoComment != null) {
                    TodoComment.C19645a newBuilder = todoComment.newBuilder();
                    newBuilder.f48074n = pushTodoCommentReaction.reactions;
                    TodoComment a = newBuilder.build();
                    int i = 0;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        } else if (Intrinsics.areEqual(((TodoComment) it2.next()).id, pushTodoCommentReaction.comment_id)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        Intrinsics.checkExpressionValueIsNotNull(a, "newComment");
                        arrayList.set(i, a);
                        ((TodoDetailModel) getModelStore()).getCommentLv().mo5929b(arrayList);
                    }
                }
            }
        }
    }

    private final void sendComment(CommentSendInfo uVar) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        Pair<Integer, TodoComment> b = adVar.getEditCommentInfo().mo5927b();
        Pair<Integer, TodoComment> b2 = adVar.getReplyCommentInfo().mo5927b();
        adVar.getCommentDraftLv().mo5929b((CommentDraftInfo) null);
        adVar.getBottomButtonVisible().mo92060c(true);
        TodoHitPoint.f141073a.mo194229g("submit_comment", adVar.getGuid());
        if (b != null) {
            RichText a = uVar.mo192473a();
            List<TodoAttachment> b3 = uVar.mo192474b();
            String str = b.getSecond().id;
            Intrinsics.checkExpressionValueIsNotNull(str, "editComment.second.id");
            updateComment(a, b3, str, b.getFirst().intValue());
        } else if (b2 != null) {
            createComment(uVar.mo192473a(), uVar.mo192474b(), b2.getSecond().id);
        } else {
            createComment$default(this, uVar.mo192473a(), uVar.mo192474b(), null, 4, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$handleGetUrlPreview$1", mo239173f = "CommentViewModel.kt", mo239174i = {0, 0}, mo239175l = {MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "previewMap"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$f */
    public static final class C56563f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $comments;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56563f(CommentViewModel wVar, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
            this.$comments = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56563f fVar = new C56563f(this.this$0, this.$comments, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56563f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Map<String, UrlPreviewHangPoint> map;
            Collection<UrlPreviewHangPoint> values;
            PreviewEntityPair previewEntityPair;
            Map<String, UrlPreviewEntity> map2;
            Map<String, UrlPreviewHangPoint> map3;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                List list = this.$comments;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return Unit.INSTANCE;
                }
                HashMap hashMap = new HashMap();
                for (TodoComment todoComment : this.$comments) {
                    RichContent richContent = todoComment.rich_content;
                    Integer num = null;
                    Integer a2 = (richContent == null || (map3 = richContent.url_preview_hang_points) == null) ? null : C69089a.m265839a(map3.size());
                    RichContent richContent2 = todoComment.rich_content;
                    if (!(richContent2 == null || (previewEntityPair = richContent2.url_preview_entities) == null || (map2 = previewEntityPair.preview_entity) == null)) {
                        num = C69089a.m265839a(map2.size());
                    }
                    if (!Intrinsics.areEqual(a2, num)) {
                        HashMap hashMap2 = hashMap;
                        String str = todoComment.cid;
                        Intrinsics.checkExpressionValueIsNotNull(str, "comment.cid");
                        RichContent richContent3 = todoComment.rich_content;
                        if (richContent3 == null || (map = richContent3.url_preview_hang_points) == null || (values = map.values()) == null) {
                            break;
                        }
                        Collection<UrlPreviewHangPoint> collection = values;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().preview_id);
                        }
                        hashMap2.put(str, arrayList);
                    }
                }
                HashMap hashMap3 = hashMap;
                if (!hashMap3.isEmpty()) {
                    TodoRustCommon gVar = TodoRustCommon.f141116a;
                    this.L$0 = ahVar;
                    this.L$1 = hashMap;
                    this.label = 1;
                    obj = gVar.mo194356a(hashMap3, this);
                    if (obj == a) {
                        return a;
                    }
                }
                return Unit.INSTANCE;
            } else if (i == 1) {
                HashMap hashMap4 = (HashMap) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map4 = (Map) obj;
            if (map4 != null) {
                ArrayList arrayList2 = new ArrayList();
                List<TodoComment> b = ((TodoDetailModel) this.this$0.getModelStore()).getCommentLv().mo5927b();
                if (b != null) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "it");
                    C69089a.m265837a(arrayList2.addAll(b));
                }
                if (!arrayList2.isEmpty()) {
                    for (Map.Entry entry : map4.entrySet()) {
                        Iterator it2 = arrayList2.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (C69089a.m265837a(Intrinsics.areEqual(((TodoComment) it2.next()).cid, (String) entry.getKey())).booleanValue()) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 >= 0) {
                            TodoComment.C19645a newBuilder = ((TodoComment) arrayList2.get(i2)).newBuilder();
                            RichContent richContent4 = ((TodoComment) arrayList2.get(i2)).rich_content;
                            if (richContent4 != null) {
                                newBuilder.mo66654a(richContent4.newBuilder().mo55252a(new PreviewEntityPair.C15119a().mo55135a((Map) entry.getValue()).build()).build());
                                TodoComment a3 = newBuilder.build();
                                Intrinsics.checkExpressionValueIsNotNull(a3, "newCommentBuilder.build()");
                                arrayList2.set(i2, a3);
                            }
                        }
                    }
                    ((TodoDetailModel) this.this$0.getModelStore()).getCommentLv().mo5926a(arrayList2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel$readComment$1", mo239173f = "CommentViewModel.kt", mo239174i = {0, 0}, mo239175l = {342}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply"}, mo239178s = {"L$0", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.w$h */
    public static final class C56565h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $position;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CommentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56565h(CommentViewModel wVar, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = wVar;
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56565h hVar = new C56565h(this.this$0, this.$position, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56565h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoDetailModel adVar;
            TodoUser todoUser;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$position == Integer.MAX_VALUE) {
                    TodoAppreciableHitPoint.f141058a.mo194158l();
                }
                Object modelStore = this.this$0.getModelStore();
                TodoDetailModel adVar2 = (TodoDetailModel) modelStore;
                TodoCommentService cVar = TodoCommentService.f141101a;
                String guid = adVar2.getGuid();
                int i2 = this.$position;
                this.L$0 = ahVar;
                this.L$1 = modelStore;
                this.L$2 = adVar2;
                this.label = 1;
                obj = TodoCommentService.m221801a(cVar, guid, i2, 0, null, this, 12, null);
                if (obj == a) {
                    return a;
                }
                adVar = adVar2;
            } else if (i == 1) {
                adVar = (TodoDetailModel) this.L$2;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ListCommentsResponse listCommentsResponse = (ListCommentsResponse) obj;
            if (listCommentsResponse != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<TodoComment> b = adVar.getCommentLv().mo5927b();
                if (b != null) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "it");
                    C69089a.m265837a(arrayList.addAll(b));
                }
                for (TodoComment todoComment : listCommentsResponse.comments) {
                    if (todoComment.status != TodoComment.Status.DELETED) {
                        arrayList2.add(todoComment);
                    }
                }
                arrayList.addAll(0, arrayList2);
                adVar.getCommentIsLoading().mo5926a(C69089a.m265837a(false));
                adVar.getCommentHasMore().mo5926a(listCommentsResponse.has_more);
                adVar.getCommentLoadingMore().mo5926a(C69089a.m265837a(false));
                adVar.getCommentLoadingFailed().mo92061d(C69089a.m265837a(false));
                adVar.getCommentLv().mo5926a(arrayList);
                adVar.getReplyCommentInfo().mo5926a((Pair<Integer, TodoComment>) null);
                this.this$0.handleGetUrlPreview(listCommentsResponse.comments);
                Log.m165389i("CommentContainerViewModel", "read comment done");
                if (this.$position == Integer.MAX_VALUE) {
                    TodoAppreciableHitPoint.f141058a.mo194159m();
                }
                if (!listCommentsResponse.has_more.booleanValue() && (todoUser = adVar.getTodoBuilder().f48037s) != null) {
                    C1177w<CreatorInfo> creatorInfo = adVar.getCreatorInfo();
                    String str = todoUser.name;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.name");
                    Long l = adVar.getTodoBuilder().f48036r;
                    Intrinsics.checkExpressionValueIsNotNull(l, "todoBuilder.create_milli_time");
                    creatorInfo.mo5926a(new CreatorInfo(str, l.longValue()));
                }
            } else {
                adVar.getCommentIsLoading().mo5926a(C69089a.m265837a(false));
                adVar.getCommentLoadingMore().mo5926a(C69089a.m265837a(false));
                if (this.$position != Integer.MAX_VALUE) {
                    adVar.getCommentHasMore().mo5926a(C69089a.m265837a(true));
                    adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_LoadFailedTryAgainLater, 2, null, 4, null)));
                } else {
                    adVar.getCommentLoadingFailed().mo92061d(C69089a.m265837a(true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void pushCommentData(CommentPushData qVar) {
        TodoComment todoComment;
        String str;
        String str2;
        Object obj = qVar.mo192453a().get("todo_comment_notification");
        if (!(obj instanceof PushTodoComment)) {
            obj = null;
        }
        PushTodoComment pushTodoComment = (PushTodoComment) obj;
        if (pushTodoComment != null) {
            boolean z = true;
            if (!(!Intrinsics.areEqual(pushTodoComment.todo_guid, ((TodoDetailModel) getModelStore()).getGuid())) && (todoComment = pushTodoComment.comment) != null) {
                ArrayList arrayList = new ArrayList();
                List<TodoComment> b = ((TodoDetailModel) getModelStore()).getCommentLv().mo5927b();
                if (b != null) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "it");
                    arrayList.addAll(b);
                }
                TodoComment.Status status = todoComment.status;
                if (status != null) {
                    int i = C56568x.f139904a[status.ordinal()];
                    int i2 = 0;
                    if (i != 1) {
                        int i3 = -1;
                        if (i == 2) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str3 = ((TodoComment) it.next()).id;
                                TodoComment todoComment2 = pushTodoComment.comment;
                                if (todoComment2 != null) {
                                    str = todoComment2.id;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.areEqual(str3, str)) {
                                    i3 = i2;
                                    break;
                                }
                                i2++;
                            }
                            if (i3 >= 0) {
                                Intrinsics.checkExpressionValueIsNotNull(todoComment, "newComment");
                                arrayList.set(i3, todoComment);
                                handleGetUrlPreview(CollectionsKt.listOf(todoComment));
                            } else {
                                return;
                            }
                        } else if (i == 3) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String str4 = ((TodoComment) it2.next()).id;
                                TodoComment todoComment3 = pushTodoComment.comment;
                                if (todoComment3 != null) {
                                    str2 = todoComment3.id;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.areEqual(str4, str2)) {
                                    i3 = i2;
                                    break;
                                }
                                i2++;
                            }
                            if (i3 >= 0) {
                                arrayList.remove(i3);
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        ArrayList arrayList2 = arrayList;
                        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (Intrinsics.areEqual(((TodoComment) it3.next()).id, todoComment.id)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                            Intrinsics.checkExpressionValueIsNotNull(todoComment, "newComment");
                            arrayList.add(todoComment);
                            handleGetUrlPreview(CollectionsKt.listOf(todoComment));
                        } else {
                            return;
                        }
                    }
                    ((TodoDetailModel) getModelStore()).getCommentLv().mo5929b(arrayList);
                }
            }
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, Object obj) {
        if (i == 145) {
            if (!(obj instanceof RichText)) {
                obj = null;
            }
            RichText richText = (RichText) obj;
            if (richText != null) {
                ((TodoDetailModel) getModelStore()).setRichTextComment(richText);
            }
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, boolean z) {
        if (i == 138) {
            ((TodoDetailModel) getModelStore()).getCommentKeyboardVisible().mo5929b(Boolean.valueOf(z));
        } else if (i == 141) {
            ((TodoDetailModel) getModelStore()).getCommentIsEmpty().mo5929b(Boolean.valueOf(z));
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        CommentEditInfo gVar = null;
        if (i == 140) {
            if (!(bVar instanceof CommentSaveDraftInfo)) {
                bVar = null;
            }
            CommentSaveDraftInfo sVar = (CommentSaveDraftInfo) bVar;
            if (sVar != null) {
                saveCommentDraft(sVar);
            }
        } else if (i == 142) {
            if (!(bVar instanceof CommentPushData)) {
                bVar = null;
            }
            CommentPushData qVar = (CommentPushData) bVar;
            if (qVar != null) {
                pushCommentData(qVar);
            }
        } else if (i != 144) {
            switch (i) {
                case 131:
                    if (bVar instanceof CommentSendInfo) {
                        gVar = bVar;
                    }
                    if (gVar != null) {
                        sendComment((CommentSendInfo) bVar);
                        return;
                    }
                    return;
                case 132:
                    if (bVar instanceof CommentKeyboardStateInfo) {
                        gVar = bVar;
                    }
                    if (gVar != null) {
                        keyboardShow((CommentKeyboardStateInfo) bVar);
                        return;
                    }
                    return;
                case 133:
                    if (!(bVar instanceof CommentPanelInfo)) {
                        bVar = null;
                    }
                    CommentPanelInfo nVar = (CommentPanelInfo) bVar;
                    if (nVar != null) {
                        ((TodoDetailModel) getModelStore()).getCommentPanelInfo().mo5929b(nVar);
                        return;
                    }
                    return;
                case 134:
                    if (bVar instanceof CommentReplyInfo) {
                        gVar = bVar;
                    }
                    if (gVar != null) {
                        commentPanelReplyClick((CommentReplyInfo) bVar);
                        return;
                    }
                    return;
                case 135:
                    if (bVar instanceof CommentEditInfo) {
                        gVar = bVar;
                    }
                    if (gVar != null) {
                        commentPanelEditClick((CommentEditInfo) bVar);
                        return;
                    }
                    return;
                case 136:
                    if (!(bVar instanceof CommentDeleteInfo)) {
                        bVar = null;
                    }
                    CommentDeleteInfo eVar = (CommentDeleteInfo) bVar;
                    if (eVar != null) {
                        deleteComment(eVar.mo192376a());
                        return;
                    }
                    return;
                case 137:
                    if (!(bVar instanceof CommentItemReactionInfo)) {
                        bVar = null;
                    }
                    CommentItemReactionInfo jVar = (CommentItemReactionInfo) bVar;
                    if (jVar != null) {
                        commentPanelReactionClick(jVar);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            if (!(bVar instanceof CommentPushData)) {
                bVar = null;
            }
            CommentPushData qVar2 = (CommentPushData) bVar;
            if (qVar2 != null) {
                pushCommentReactionData(qVar2);
            }
        }
    }

    private final void createComment(RichText richText, List<TodoAttachment> list, String str) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56558b(this, richText, list, str, null), 2, null);
    }

    private final void createCommentDraft(RichText richText, List<TodoAttachment> list, String str) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56560c(this, richText, list, str, null), 2, null);
    }

    static /* synthetic */ void readComment$default(CommentViewModel wVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        wVar.readComment(i);
    }

    private final void updateComment(RichText richText, List<TodoAttachment> list, String str, int i) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56567j(this, str, richText, list, i, null), 2, null);
    }

    static /* synthetic */ void createCommentDraft$default(CommentViewModel wVar, RichText richText, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        wVar.createCommentDraft(richText, list, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.todo.impl.features.detail.comment.w */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void createComment$default(CommentViewModel wVar, RichText richText, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            str = null;
        }
        wVar.createComment(richText, list, str);
    }
}
