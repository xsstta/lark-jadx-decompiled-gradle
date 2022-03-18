package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoSourceHref;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import com.ss.android.lark.todo.impl.framework.busevents.CompleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.UpdateTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.VibrateUtil;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\u001a\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\nH\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "taskId", "", "userId", "assigneeComplete", "", "assigneeBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "isTodoComplete", "", "bottomShowAction", "visible", "commentAction", "completeCreateAction", "completeTodoAction", "completeUserAction", "handleAction", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "initViewData", "isExtraAssigneeStatusDiff", "isExtraAssigneeStatusSame", "isInCustomCompleteStrategy", "context", "Landroid/content/Context;", "customComplete", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "markTodoRefresh", "todo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "updateButtonState", "updateCreatorAndAssigneeButtonState", "isAssigneeComplete", "updateOnlyAssigneeButtonState", "updateOnlyCreatorButtonState", "BottomState", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BottomContainerViewModel extends ViewModelSection<TodoDetailModel> {
    public static final BottomState BottomState = new BottomState(null);
    private String taskId = "";
    private final String userId = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel$BottomState;", "", "()V", "AssigneeComTodoCom", "", "AssigneeComTodoUnCom", "AssigneeComplete", "AssigneeUnComTodoUnCom", "AssigneeUnComplete", "Follower", "TodoComplete", "TodoUnComplete", "UnFollower", "ButtonState", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class BottomState {

        @Target({ElementType.TYPE_USE})
        @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel$BottomState$ButtonState;", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        public @interface ButtonState {
        }

        private BottomState() {
        }

        public /* synthetic */ BottomState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void completeCreateAction() {
        AssigneeBean assigneeBean = ((TodoDetailModel) getModelStore()).getAssigneeBean(this.userId);
        if (assigneeBean != null) {
            assigneeComplete(assigneeBean, false);
            TodoGeneralHitPoint.f141070a.mo194187b(this.taskId, !assigneeBean.mo192764g());
        }
    }

    private final void commentAction() {
        TodoHitPoint.m221735a(Comment.f24093e, false, 2, (Object) null);
        ((TodoDetailModel) getModelStore()).getBottomButtonVisible().mo92060c(false);
        ((TodoDetailModel) getModelStore()).getCommentKeyboardVisible().mo5929b((Boolean) true);
    }

    private final void completeTodoAction() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        if (!isExtraAssigneeStatusSame() || !Intrinsics.areEqual((Object) adVar.getAssigneeMultiStrategy().mo5927b(), (Object) true)) {
            if (Intrinsics.areEqual((Object) adVar.getAssigneeMultiStrategy().mo5927b(), (Object) true)) {
                TodoGeneralHitPoint.f141070a.mo194192c(adVar.getGuid(), !adVar.isComplete());
            } else {
                TodoGeneralHitPoint.m221668a(adVar.getGuid(), "done_task", !adVar.isComplete());
            }
            assigneeComplete(((TodoDetailModel) getModelStore()).getAssigneeBean(this.userId), true);
        } else if (adVar.isComplete()) {
            adVar.getAllUsersUnCompletedDialog().mo5929b((Boolean) true);
        } else {
            adVar.getAllUsersCompletedDialog().mo5929b((Boolean) true);
        }
    }

    private final void completeUserAction() {
        Integer b;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        AssigneeBean assigneeBean = adVar.getAssigneeBean(this.userId);
        Integer b2 = adVar.getBottomButtonState().mo5927b();
        if ((b2 == null || b2.intValue() != 0) && ((b = adVar.getBottomButtonState().mo5927b()) == null || b.intValue() != 1)) {
            completeTodoAction();
        } else if (assigneeBean != null) {
            TodoGeneralHitPoint.f141070a.mo194187b(this.taskId, true ^ assigneeBean.mo192764g());
            assigneeComplete(assigneeBean, false);
        }
    }

    private final boolean isExtraAssigneeStatusDiff() {
        boolean z;
        List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        if (list != null) {
            for (T t : list) {
                if (!Intrinsics.areEqual(t.assignee_id, this.userId)) {
                    if (t.completed_milli_time.longValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z == ((TodoDetailModel) getModelStore()).isComplete()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final boolean isExtraAssigneeStatusSame() {
        boolean z;
        List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        if (list != null) {
            for (T t : list) {
                if (!Intrinsics.areEqual(t.assignee_id, this.userId)) {
                    if (t.completed_milli_time.longValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z == ((TodoDetailModel) getModelStore()).isComplete()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        this.taskId = ((TodoDetailModel) getModelStore()).getGuid();
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getNeedUpdate().mo5925a(new C56730b(this));
        adVar.getNeedUpdateBottom().mo5925a(new C56731c(this));
        adVar.getBottomButtonVisible().mo5929b(Boolean.valueOf(!((TodoDetailModel) getModelStore()).isCreateTodo()));
    }

    public final void updateButtonState() {
        boolean z;
        Boolean bool;
        boolean z2;
        Long l;
        boolean z3;
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TodoAssignee todoAssignee = adVar.getTodoAssignee(this.userId);
        boolean isFollowed = adVar.isFollowed();
        boolean isSelfCreator = adVar.isSelfCreator();
        if (isSelfCreator || todoAssignee != null) {
            long longValue = adVar.getTodoBuilder().f48033o.longValue();
            boolean z4 = true;
            if (longValue > 0) {
                z = true;
            } else {
                z = false;
            }
            if (todoAssignee == null || (l = todoAssignee.completed_milli_time) == null) {
                bool = null;
            } else {
                if (l.longValue() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = Boolean.valueOf(z3);
            }
            if (!isSelfCreator || todoAssignee != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (isSelfCreator || todoAssignee == null) {
                z4 = false;
            }
            if (z4) {
                if (bool != null) {
                    updateOnlyAssigneeButtonState(bool.booleanValue(), z);
                }
            } else if (z2) {
                updateOnlyCreatorButtonState(z);
            } else if (bool != null) {
                updateCreatorAndAssigneeButtonState(bool.booleanValue(), z);
            }
        } else {
            MutableLiveDataPlus<Integer> bottomButtonState = adVar.getBottomButtonState();
            if (isFollowed) {
                i = 2;
            } else {
                i = 3;
            }
            bottomButtonState.mo92060c(Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel$initViewData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.BottomContainerViewModel$b */
    static final class C56730b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BottomContainerViewModel f140121a;

        C56730b(BottomContainerViewModel bottomContainerViewModel) {
            this.f140121a = bottomContainerViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140121a.updateButtonState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel$initViewData$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.BottomContainerViewModel$c */
    static final class C56731c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BottomContainerViewModel f140122a;

        C56731c(BottomContainerViewModel bottomContainerViewModel) {
            this.f140122a = bottomContainerViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140122a.updateButtonState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel$isInCustomCompleteStrategy$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "showTipToast", "", "tipsStr", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.BottomContainerViewModel$d */
    public static final class C56732d implements CustomCompleteHelper.ITipShowListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerViewModel f140123a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56732d(BottomContainerViewModel bottomContainerViewModel) {
            this.f140123a = bottomContainerViewModel;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper.ITipShowListener
        /* renamed from: a */
        public void mo191923a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tipsStr");
            ((TodoDetailModel) this.f140123a.getModelStore()).getToast().mo5926a(new Event<>(new TodoToastUnit(0, 4, str)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomContainerViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    private final void bottomShowAction(boolean z) {
        ((TodoDetailModel) getModelStore()).getBottomButtonVisible().mo92060c(Boolean.valueOf(z));
    }

    private final void updateOnlyCreatorButtonState(boolean z) {
        int i;
        MutableLiveDataPlus<Integer> bottomButtonState = ((TodoDetailModel) getModelStore()).getBottomButtonState();
        if (z) {
            i = 7;
        } else {
            i = 8;
        }
        bottomButtonState.mo92060c(Integer.valueOf(i));
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        boolean z;
        if (i != 251) {
            switch (i) {
                case DynamicModule.f58006b:
                    completeTodoAction();
                    return;
                case 257:
                    commentAction();
                    return;
                case 258:
                    TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                    String str = this.taskId;
                    if (((TodoDetailModel) getModelStore()).getTodoBuilder().f48033o.longValue() <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo194192c(str, z);
                    assigneeComplete(((TodoDetailModel) getModelStore()).getAssigneeBean(this.userId), true);
                    return;
                case 259:
                    completeCreateAction();
                    return;
                default:
                    return;
            }
        } else {
            completeUserAction();
        }
    }

    public final void markTodoRefresh(Todo todo) {
        String str;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        Todo.C19637a newBuilder = todo.newBuilder();
        Intrinsics.checkExpressionValueIsNotNull(newBuilder, "todo.newBuilder()");
        adVar.setTodoBuilder(newBuilder);
        TodoSourceHref todoSourceHref = adVar.getOldTodo().source_href;
        if (todoSourceHref != null) {
            str = todoSourceHref.url;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            adVar.getTodoBuilder().mo66621a(adVar.getOldTodo().source_href);
        }
        Todo a = adVar.getTodoBuilder().build();
        Intrinsics.checkExpressionValueIsNotNull(a, "todoBuilder.build()");
        adVar.setOldTodo(a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.BottomContainerViewModel$assigneeComplete$1", mo239173f = "BottomContainerViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {190}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply", "isComplete"}, mo239178s = {"L$0", "L$1", "Z$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.BottomContainerViewModel$a */
    public static final class C56729a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssigneeBean $assigneeBean;
        final /* synthetic */ boolean $isTodoComplete;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ BottomContainerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56729a(BottomContainerViewModel bottomContainerViewModel, boolean z, AssigneeBean aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bottomContainerViewModel;
            this.$isTodoComplete = z;
            this.$assigneeBean = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56729a aVar = new C56729a(this.this$0, this.$isTodoComplete, this.$assigneeBean, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56729a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoDetailModel adVar;
            boolean z;
            Long l;
            Long l2;
            int i;
            MarkTodoCompletedRequest.Type type;
            ArrayList arrayList;
            AssigneeBean aVar;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                adVar = (TodoDetailModel) this.this$0.getModelStore();
                boolean z2 = false;
                if (this.$isTodoComplete || (aVar = this.$assigneeBean) == null ? !adVar.isComplete() : !aVar.mo192764g()) {
                    z2 = true;
                }
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = adVar.getTodoBuilder().f48019a;
                Intrinsics.checkExpressionValueIsNotNull(str, "todoBuilder.guid");
                TodoSource todoSource = adVar.getTodoBuilder().f48024f;
                if (this.$isTodoComplete) {
                    type = MarkTodoCompletedRequest.Type.Todo;
                } else {
                    type = MarkTodoCompletedRequest.Type.USER;
                }
                AssigneeBean aVar2 = this.$assigneeBean;
                if (aVar2 != null) {
                    arrayList = CollectionsKt.listOf(aVar2.mo192757a());
                } else {
                    arrayList = new ArrayList();
                }
                this.L$0 = ahVar;
                this.L$1 = adVar;
                this.Z$0 = z2;
                this.label = 1;
                obj = fVar.mo194311a(str, z2, todoSource, type, arrayList, this);
                if (obj == a) {
                    return a;
                }
                z = z2;
            } else if (i2 == 1) {
                z = this.Z$0;
                adVar = (TodoDetailModel) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194252b() != null) {
                if (adVar.getTodoSource() != TodoSource.OAPI || !z) {
                    i = R.string.Todo_common_ActionFailedTryAgainLater;
                } else {
                    i = R.string.Todo_Tasks_APICantClickToast;
                }
                adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(i, 2, null, 4, null)));
            } else {
                VibrateUtil.f139263a.mo191785a();
                TodoGeneralHitPoint.m221668a(adVar.getGuid(), "done_task", z);
                adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_CollabTask_Successful, 1, null, 4, null)));
                if (bVar.mo194251a() != null) {
                    this.this$0.markTodoRefresh((Todo) bVar.mo194251a());
                    EventBus.getDefault().trigger(new UpdateTodoEvent(adVar.getOldTodo()));
                } else {
                    Todo.C19637a todoBuilder = adVar.getTodoBuilder();
                    if (z) {
                        l = C69089a.m265840a(System.currentTimeMillis());
                    } else {
                        l = C69089a.m265840a(0L);
                    }
                    todoBuilder.f48017D = l;
                    Todo.C19637a todoBuilder2 = adVar.getTodoBuilder();
                    if (z) {
                        l2 = C69089a.m265840a(System.currentTimeMillis());
                    } else {
                        l2 = C69089a.m265840a(0L);
                    }
                    todoBuilder2.f48033o = l2;
                    EventBus eventBus = EventBus.getDefault();
                    Todo a2 = adVar.getTodoBuilder().build();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "todoBuilder.build()");
                    eventBus.trigger(new UpdateTodoEvent(a2));
                }
                if (adVar.isFromDoc()) {
                    EventBus eventBus2 = EventBus.getDefault();
                    String str2 = adVar.getTodoBuilder().f48019a;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "todoBuilder.guid");
                    eventBus2.trigger(new CompleteTodoEvent(str2, z));
                }
                adVar.getNeedUpdate().mo5926a(C69089a.m265837a(true));
                if (adVar.getTodoBuilder().f48017D.longValue() > 0) {
                    adVar.getActivityFinished().mo5926a(C69089a.m265837a(true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean isInCustomCompleteStrategy(Context context, CustomComplete.Action action) {
        if (action != null) {
            return CustomCompleteHelper.f139396a.mo191997a(context, action, new C56732d(this));
        }
        return false;
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, boolean z) {
        if (i == 250) {
            bottomShowAction(z);
        } else if (i == 254) {
            ((TodoDetailModel) getModelStore()).getBottomHasDraft().mo5929b(Boolean.valueOf(z));
        }
    }

    private final void assigneeComplete(AssigneeBean aVar, boolean z) {
        CustomComplete.Action action;
        Context context = getContext();
        CustomComplete customComplete = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48018E;
        if (customComplete != null) {
            action = customComplete.f175433android;
        } else {
            action = null;
        }
        if (!isInCustomCompleteStrategy(context, action)) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56729a(this, z, aVar, null), 2, null);
        }
    }

    private final void updateOnlyAssigneeButtonState(boolean z, boolean z2) {
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        if (!Intrinsics.areEqual((Object) adVar.getAssigneeMultiStrategy().mo5927b(), (Object) true)) {
            MutableLiveDataPlus<Integer> bottomButtonState = adVar.getBottomButtonState();
            if (z2) {
                i = 7;
            } else {
                i = 8;
            }
            bottomButtonState.mo92060c(Integer.valueOf(i));
            return;
        }
        adVar.getBottomButtonState().mo92060c(Integer.valueOf(!z ? 1 : 0));
    }

    private final void updateCreatorAndAssigneeButtonState(boolean z, boolean z2) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        int i = 7;
        if (!Intrinsics.areEqual((Object) adVar.getAssigneeMultiStrategy().mo5927b(), (Object) true)) {
            MutableLiveDataPlus<Integer> bottomButtonState = adVar.getBottomButtonState();
            if (!z2) {
                i = 8;
            }
            bottomButtonState.mo92060c(Integer.valueOf(i));
        } else if (z2) {
            adVar.getBottomButtonState().mo92060c(7);
        } else if (z) {
            adVar.getBottomButtonState().mo92060c(4);
        } else if (isExtraAssigneeStatusDiff()) {
            adVar.getBottomButtonState().mo92060c(1);
        } else {
            adVar.getBottomButtonState().mo92060c(6);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i == 255) {
            if (!(bVar instanceof CompleteInfo)) {
                bVar = null;
            }
            CompleteInfo eVar = (CompleteInfo) bVar;
            if (eVar != null) {
                TodoDetailModel adVar = (TodoDetailModel) getModelStore();
                if (Intrinsics.areEqual(this.userId, eVar.mo192992a().mo192757a())) {
                    TodoGeneralHitPoint.f141070a.mo194187b(this.taskId, !eVar.mo192992a().mo192764g());
                } else {
                    TodoGeneralHitPoint.f141070a.mo194196d(this.taskId, !eVar.mo192992a().mo192764g());
                }
                assigneeComplete(eVar.mo192992a(), false);
            }
        }
    }

    static /* synthetic */ void assigneeComplete$default(BottomContainerViewModel bottomContainerViewModel, AssigneeBean aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bottomContainerViewModel.assigneeComplete(aVar, z);
    }
}
