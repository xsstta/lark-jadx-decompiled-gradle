package com.ss.android.lark.todo.impl.features.detail.comment;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\r\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "view", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "mHandler", "Landroid/os/Handler;", "mTodoCommentNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "mTodoCommentReactionNotification", "com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$mTodoCommentReactionNotification$1", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSection$mTodoCommentReactionNotification$1;", "mTodoHeartbeatRunnable", "Ljava/lang/Runnable;", "initViewAction", "", "initViewObserver", "onDestroy", "onStop", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t */
public final class CommentSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: c */
    public static final Companion f139877c = new Companion(null);

    /* renamed from: a */
    public final Handler f139878a;

    /* renamed from: b */
    public final View f139879b;

    /* renamed from: d */
    private final TodoPushHandleCallBack f139880d = new C56548e(this);

    /* renamed from: e */
    private final C56549f f139881e = new C56549f(this);

    /* renamed from: f */
    private final Runnable f139882f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSection$Companion;", "", "()V", "TAG", "", "TODO_HEARTBEAT_INTERVAL", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: i */
    public void mo92112i() {
        super.mo92112i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$mTodoHeartbeatRunnable$1", "Ljava/lang/Runnable;", "run", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$g */
    public static final class RunnableC56550g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentSection f139889a;

        public void run() {
            this.f139889a.mo92107d().mo92064a(143);
            this.f139889a.f139878a.postDelayed(this, 10000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC56550g(CommentSection tVar) {
            this.f139889a = tVar;
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_COMMENT_NOTIFICATION, this.f139880d);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_COMMENT_REACTION_NOTIFICATION, this.f139881e);
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: h */
    public void mo92111h() {
        this.f139878a.removeCallbacks(this.f139882f);
        TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION, this.f139880d);
        TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION, this.f139881e);
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getEditCommentInfo(), new C56543b(this));
        mo92103a(qVar.getReplyCommentInfo(), new C56545c(this));
        mo92103a(qVar.getScrollToBottomOfComments(), new C56547d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "info", "Lkotlin/Pair;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$b */
    static final class C56543b extends Lambda implements Function1<Pair<? extends Integer, ? extends TodoComment>, Unit> {
        final /* synthetic */ CommentSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56543b(CommentSection tVar) {
            super(1);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends TodoComment> pair) {
            invoke((Pair<Integer, TodoComment>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(final Pair<Integer, TodoComment> pair) {
            if (pair != null) {
                ((RecyclerView) this.this$0.f139879b.findViewById(R.id.todo_content_rv)).postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentSection.C56543b.RunnableC565441 */

                    /* renamed from: a */
                    final /* synthetic */ C56543b f139883a;

                    {
                        this.f139883a = r1;
                    }

                    public final void run() {
                        ((RecyclerView) this.f139883a.this$0.f139879b.findViewById(R.id.todo_content_rv)).smoothScrollToPosition(((Number) pair.getFirst()).intValue() + 1);
                    }
                }, 80);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "info", "Lkotlin/Pair;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$c */
    static final class C56545c extends Lambda implements Function1<Pair<? extends Integer, ? extends TodoComment>, Unit> {
        final /* synthetic */ CommentSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56545c(CommentSection tVar) {
            super(1);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends TodoComment> pair) {
            invoke((Pair<Integer, TodoComment>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(final Pair<Integer, TodoComment> pair) {
            if (pair != null) {
                ((RecyclerView) this.this$0.f139879b.findViewById(R.id.todo_content_rv)).postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentSection.C56545c.RunnableC565461 */

                    /* renamed from: a */
                    final /* synthetic */ C56545c f139885a;

                    {
                        this.f139885a = r1;
                    }

                    public final void run() {
                        ((RecyclerView) this.f139885a.this$0.f139879b.findViewById(R.id.todo_content_rv)).smoothScrollToPosition(((Number) pair.getFirst()).intValue() + 1);
                    }
                }, 80);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "info", "Lkotlin/Pair;", "", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$d */
    static final class C56547d extends Lambda implements Function1<Pair<? extends Integer, ? extends Boolean>, Unit> {
        final /* synthetic */ CommentSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56547d(CommentSection tVar) {
            super(1);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Boolean> pair) {
            invoke((Pair<Integer, Boolean>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(Pair<Integer, Boolean> pair) {
            if (pair != null && pair.getSecond().booleanValue()) {
                ((RecyclerView) this.this$0.f139879b.findViewById(R.id.todo_content_rv)).smoothScrollToPosition(pair.getFirst().intValue());
                ((RecyclerView) this.this$0.f139879b.findViewById(R.id.todo_content_rv)).smoothScrollBy(0, DeviceUtils.getScreenHeight(this.this$0.mo92106c()) / 2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$mTodoCommentNotification$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$e */
    public static final class C56548e implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ CommentSection f139887a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56548e(CommentSection tVar) {
            this.f139887a = tVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("CommentSection", LogMessageUtil.f139260a.mo191769b("todo_comment_push"));
            this.f139887a.mo92107d().mo92066a(142, (IActionData) new CommentPushData(jSONObject));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentSection$mTodoCommentReactionNotification$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.t$f */
    public static final class C56549f implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ CommentSection f139888a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56549f(CommentSection tVar) {
            this.f139888a = tVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("CommentSection", LogMessageUtil.f139260a.mo191769b("todo_comment_reaction_push"));
            this.f139888a.mo92107d().mo92066a(SmEvents.EVENT_UA_SUCCESS, (IActionData) new CommentPushData(jSONObject));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139879b = view;
        Handler handler = new Handler();
        this.f139878a = handler;
        RunnableC56550g gVar = new RunnableC56550g(this);
        handler.post(gVar);
        this.f139882f = gVar;
    }
}
