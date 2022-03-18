package com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.bytedance.lark.pb.todo.v1.AuthScene;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.FollowTodoResponse;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoFollower;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.todo.impl.features.common.entity.EndTimeTextAttribute;
import com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.features.messagecard.entity.TextAttributes;
import com.ss.android.lark.todo.impl.features.messagecard.helper.TodoRichTextHelper;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoErrorHelper;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.impl.utils.VibrateUtil;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002:\u0001XB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0018\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0010\u00104\u001a\u0002052\u0006\u0010$\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000207H\u0016J \u00109\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020,H\u0002J\b\u0010<\u001a\u00020\u0006H\u0016J\u001a\u0010=\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0016J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020\u0006H\u0016J\n\u0010F\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020*H\u0002J\b\u0010J\u001a\u00020*H\u0016J\b\u0010K\u001a\u00020*H\u0002J\u0010\u0010L\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010M\u001a\u00020*H\u0016J\b\u0010N\u001a\u00020*H\u0016J\b\u0010O\u001a\u00020*H\u0016J\b\u0010P\u001a\u00020*H\u0016J\u0006\u0010Q\u001a\u00020*J\u0006\u0010R\u001a\u00020*J\b\u0010S\u001a\u00020#H\u0016J\b\u0010T\u001a\u00020#H\u0016J\u0010\u0010U\u001a\u00020#2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010V\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010W\u001a\u00020*H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardViewModel;", "Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/ITodoOperationCardViewModel;", "Landroidx/lifecycle/ViewModel;", "contentData", "Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;", "chatId", "", "messageId", "senderId", "(Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "loginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "getLoginDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "loginDependency$delegate", "Lkotlin/Lazy;", "operationUserId", "showActiveDialog", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "getShowActiveDialog", "()Landroidx/lifecycle/MutableLiveData;", "setShowActiveDialog", "(Landroidx/lifecycle/MutableLiveData;)V", "showCompleteDialog", "getShowCompleteDialog", "showToastLiveData", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit;", "getShowToastLiveData", "timeFormatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "getTimeFormatDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "timeFormatDependency$delegate", "clickCompleteInMultiStrategy", "", "todoDetail", "(Lcom/bytedance/lark/pb/basic/v1/TodoDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clickCompleteOutMultiStrategy", "followTodo", "userId", "isFollowed", "", "getAssigneeNum", "", "getAssigneeStr", "getCheckBoxStatus", "Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardViewModel$CheckBoxStatus;", "getCompleteCardTitle", "operatorName", ShareHitPoint.f121868c, "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "getDisplayCompleteTime", "", "getEnterDetailIconAttr", "Lcom/ss/android/lark/todo/impl/features/messagecard/entity/TextAttributes;", "getFollowIconAttr", "getMultiUserFormatString", "singleResId", "multiResId", "getOperationTitleStr", "getRestoreCardTitle", "getShowAssignees", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "getShowTimeAttrs", "Lcom/ss/android/lark/todo/impl/features/common/entity/EndTimeTextAttribute;", "context", "Landroid/content/Context;", "getTodoGuid", "getTodoSummaryDetail", "getTodoSummaryRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "isCanFollowByPermission", "isFollowIconShow", "isHaveEditPermission", "isInCustomCompleteStrategy", "isInMultiCompleteStrategy", "isShowAssigneeContainer", "isShowTimeContainer", "isTodoCompleted", "isTodoDeleted", "isUserInTodo", "onCheckBoxClicked", "onFollowIconClicked", "onOpenTodoDetailClicked", "setTodoCompleteStatus", "isTargetComplete", "CheckBoxStatus", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoOperationCardViewModel extends AbstractC1142af {
    private final String chatId;
    public final TodoOperationContent contentData;
    private final Lazy loginDependency$delegate = LazyKt.lazy(C57144d.INSTANCE);
    public final String messageId;
    private final String operationUserId = getLoginDependency().mo145411a();
    private final String senderId;
    private C1177w<TodoDetail> showActiveDialog = new C1177w<>();
    private final C1177w<TodoDetail> showCompleteDialog = new C1177w<>();
    private final C1177w<TodoToastUnit> showToastLiveData = new C1177w<>();
    private final Lazy timeFormatDependency$delegate = LazyKt.lazy(C57147g.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardViewModel$CheckBoxStatus;", "", "(Ljava/lang/String;I)V", "CHECKED_ENABLE", "CHECKED_UNABLE", "UNCHECK_ENABLE", "UNCHECK_UNABLE", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CheckBoxStatus {
        CHECKED_ENABLE,
        CHECKED_UNABLE,
        UNCHECK_ENABLE,
        UNCHECK_UNABLE
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"clickCompleteInMultiStrategy", "", "todoDetail", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel", mo239173f = "TodoOperationCardViewModel.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1}, mo239175l = {373, 385}, mo239176m = "clickCompleteInMultiStrategy", mo239177n = {"this", "todoDetail", "completeType", "operationList", "this", "todoDetail", "completeType", "operationList"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$a */
    public static final class C57141a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoOperationCardViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57141a(TodoOperationCardViewModel todoOperationCardViewModel, Continuation cVar) {
            super(cVar);
            this.this$0 = todoOperationCardViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clickCompleteInMultiStrategy(null, this);
        }
    }

    private final ILoginDependency getLoginDependency() {
        return (ILoginDependency) this.loginDependency$delegate.getValue();
    }

    private final AbstractC56259u getTimeFormatDependency() {
        return (AbstractC56259u) this.timeFormatDependency$delegate.getValue();
    }

    public C1177w<TodoDetail> getShowActiveDialog() {
        return this.showActiveDialog;
    }

    public C1177w<TodoDetail> getShowCompleteDialog() {
        return this.showCompleteDialog;
    }

    public C1177w<TodoToastUnit> getShowToastLiveData() {
        return this.showToastLiveData;
    }

    public TodoDetail getTodoSummaryDetail() {
        return this.contentData.todo_detail;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$d */
    static final class C57144d extends Lambda implements Function0<ILoginDependency> {
        public static final C57144d INSTANCE = new C57144d();

        C57144d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ILoginDependency invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$g */
    static final class C57147g extends Lambda implements Function0<AbstractC56259u> {
        public static final C57147g INSTANCE = new C57147g();

        C57147g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC56259u invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency();
        }
    }

    public String getTodoGuid() {
        String str;
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null || (str = todoDetail.guid) == null) {
            return "";
        }
        return str;
    }

    public RichText getTodoSummaryRichText() {
        return TodoRichTextHelper.f140904a.mo193945a(this.contentData.todo_detail);
    }

    public int getAssigneeNum() {
        List<TodoAssignee> list;
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null || (list = todoDetail.assignees) == null) {
            return 0;
        }
        return list.size();
    }

    public boolean isInMultiCompleteStrategy() {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return false");
        return MultiCompleteHelper.f139390a.mo191984a(todoDetail.source);
    }

    public boolean isShowAssigneeContainer() {
        List<TodoAssignee> list;
        boolean z;
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail != null) {
            list = todoDetail.assignees;
        } else {
            list = null;
        }
        List<TodoAssignee> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public boolean isShowTimeContainer() {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return false");
        if (todoDetail.due_time.longValue() > 0) {
            return true;
        }
        return false;
    }

    public boolean isTodoCompleted() {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return false");
        if (getDisplayCompleteTime(todoDetail) > 0) {
            return true;
        }
        return false;
    }

    public final boolean isTodoDeleted() {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return false");
        if (todoDetail.deleted_milli_time.longValue() > 0) {
            return true;
        }
        return false;
    }

    public void onCheckBoxClicked() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C57145e(this, null), 2, null);
    }

    private final boolean isCanFollowByPermission() {
        Boolean bool;
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return false");
        TodoDetail.Permission permission = todoDetail.user_to_permission.get(getLoginDependency().mo145411a());
        if (permission != null && (bool = permission.can_follow) != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = todoDetail.can_follow;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "todoDetail.can_follow");
        return bool2.booleanValue();
    }

    private final boolean isHaveEditPermission() {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return false");
        TodoDetail.Permission permission = todoDetail.user_to_permission.get(getLoginDependency().mo145411a());
        if (permission == null) {
            return false;
        }
        Boolean bool = permission.can_complete_self;
        Intrinsics.checkExpressionValueIsNotNull(bool, "permission.can_complete_self");
        if (!bool.booleanValue()) {
            Boolean bool2 = permission.can_complete_todo;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "permission.can_complete_todo");
            if (bool2.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public CheckBoxStatus getCheckBoxStatus() {
        if (isTodoCompleted()) {
            if (!isHaveEditPermission() || isTodoDeleted()) {
                return CheckBoxStatus.CHECKED_UNABLE;
            }
            return CheckBoxStatus.CHECKED_ENABLE;
        } else if (!isHaveEditPermission() || isTodoDeleted()) {
            return CheckBoxStatus.UNCHECK_UNABLE;
        } else {
            return CheckBoxStatus.UNCHECK_ENABLE;
        }
    }

    public String getAssigneeStr() {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return \"\"");
        StringBuilder sb = new StringBuilder();
        List<TodoAssignee> list = todoDetail.assignees;
        if (!CollectionUtils.isEmpty(list)) {
            for (TodoAssignee todoAssignee : list) {
                sb.append(C57814c.m224350b(todoAssignee.assignee_id, todoAssignee.name) + "  ");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.todo.impl.features.messagecard.entity.TextAttributes getEnterDetailIconAttr() {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel.getEnterDetailIconAttr():com.ss.android.lark.todo.impl.features.messagecard.c.a");
    }

    public TextAttributes getFollowIconAttr() {
        boolean z;
        String str;
        int i;
        List<TodoFollower> list;
        TodoDetail todoDetail = this.contentData.todo_detail;
        boolean z2 = false;
        if (todoDetail == null || (list = todoDetail.followers) == null) {
            z = false;
        } else {
            List<TodoFollower> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().follower_id);
            }
            z = arrayList.contains(getLoginDependency().mo145411a());
        }
        if (z) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_Following);
        } else {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_FollowButton);
        }
        if (!(this.contentData.msg_status == TodoOperationContent.MsgStatus.DELETED || this.contentData.operation_type == TodoOperationContent.Type.DELETE || this.contentData.operation_type == TodoOperationContent.Type.CANCEL)) {
            z2 = true;
        }
        if (z2) {
            i = ResUtil.f139261a.mo191775a(R.color.text_title);
        } else {
            i = ResUtil.f139261a.mo191775a(R.color.text_placeholder);
        }
        return new TextAttributes(str, i, z2, z);
    }

    public List<TodoAssignee> getShowAssignees() {
        List<TodoAssignee> list;
        boolean z;
        ArrayList arrayList = new ArrayList();
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (!(todoDetail == null || (list = todoDetail.assignees) == null)) {
            List<TodoAssignee> list2 = list;
            ArrayList arrayList2 = new ArrayList();
            for (T t : list2) {
                if (Intrinsics.areEqual(t.assignee_id, this.operationUserId)) {
                    arrayList2.add(t);
                }
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (!(!Intrinsics.areEqual(t2.assignee_id, this.operationUserId)) || t2.completed_milli_time.longValue() > 0) {
                    z2 = false;
                }
                if (z2) {
                    arrayList3.add(next);
                }
            }
            arrayList.addAll(arrayList3);
            if (arrayList.size() >= 4) {
                List<TodoAssignee> subList = arrayList.subList(0, 4);
                Intrinsics.checkExpressionValueIsNotNull(subList, "newAssignees.subList(0, 4)");
                return subList;
            }
            ArrayList arrayList4 = new ArrayList();
            for (T t3 : list2) {
                T t4 = t3;
                if (!(!Intrinsics.areEqual(t4.assignee_id, this.operationUserId)) || t4.completed_milli_time.longValue() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList4.add(t3);
                }
            }
            arrayList.addAll(arrayList4);
        }
        if (arrayList.size() <= 4) {
            return arrayList;
        }
        List<TodoAssignee> subList2 = arrayList.subList(0, 4);
        Intrinsics.checkExpressionValueIsNotNull(subList2, "newAssignees.subList(0, 4)");
        return subList2;
    }

    public boolean isFollowIconShow() {
        TodoDetail.MsgBelongTo msgBelongTo;
        TodoUser todoUser;
        List<TodoAssignee> list;
        if (!isCanFollowByPermission()) {
            return false;
        }
        TodoDetail todoDetail = this.contentData.todo_detail;
        Boolean bool = null;
        if (todoDetail != null) {
            msgBelongTo = todoDetail.msg_belong_to;
        } else {
            msgBelongTo = null;
        }
        TodoDetail todoDetail2 = this.contentData.todo_detail;
        if (todoDetail2 != null) {
            todoUser = todoDetail2.creator;
        } else {
            todoUser = null;
        }
        String a = getLoginDependency().mo145411a();
        TodoDetail todoDetail3 = this.contentData.todo_detail;
        if (!(todoDetail3 == null || (list = todoDetail3.assignees) == null)) {
            List<TodoAssignee> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().assignee_id);
            }
            bool = Boolean.valueOf(arrayList.contains(a));
        }
        if (msgBelongTo == TodoDetail.MsgBelongTo.BOT || todoUser == null || !(!Intrinsics.areEqual(todoUser.user_id, a)) || !Intrinsics.areEqual((Object) bool, (Object) false) || this.contentData.operation_type == TodoOperationContent.Type.DELETE) {
            return false;
        }
        return true;
    }

    public final boolean isUserInTodo() {
        String str;
        boolean z;
        boolean z2;
        List<TodoFollower> list;
        List<TodoAssignee> list2;
        TodoUser todoUser;
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null || (todoUser = todoDetail.creator) == null) {
            str = null;
        } else {
            str = todoUser.user_id;
        }
        boolean equals = TextUtils.equals(str, this.operationUserId);
        TodoDetail todoDetail2 = this.contentData.todo_detail;
        if (todoDetail2 == null || (list2 = todoDetail2.assignees) == null) {
            z = false;
        } else {
            List<TodoAssignee> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().assignee_id);
            }
            z = arrayList.contains(this.operationUserId);
        }
        TodoDetail todoDetail3 = this.contentData.todo_detail;
        if (todoDetail3 == null || (list = todoDetail3.followers) == null) {
            z2 = false;
        } else {
            List<TodoFollower> list4 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().follower_id);
            }
            z2 = arrayList2.contains(getLoginDependency().mo145411a());
        }
        if (equals || z || z2) {
            return true;
        }
        return false;
    }

    public void onFollowIconClicked() {
        boolean z;
        String str;
        List<TodoFollower> list;
        String a = getLoginDependency().mo145411a();
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null || (list = todoDetail.followers) == null) {
            z = false;
        } else {
            List<TodoFollower> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().follower_id);
            }
            z = arrayList.contains(a);
        }
        TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
        TodoDetail todoDetail2 = this.contentData.todo_detail;
        if (todoDetail2 == null || (str = todoDetail2.guid) == null) {
            str = "";
        }
        aVar.mo194179a(str, !z);
        String str2 = null;
        if (z) {
            getShowToastLiveData().mo5926a(new TodoToastUnit(R.string.Todo_Task_UnfollowingToast, 3, null, 4, null));
            TodoDetail todoDetail3 = this.contentData.todo_detail;
            if (todoDetail3 != null) {
                str2 = todoDetail3.guid;
            }
            TodoHitPoint.m221732a("card", str2, TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a());
        } else {
            getShowToastLiveData().mo5926a(new TodoToastUnit(R.string.Todo_Task_FollowingToast, 3, null, 4, null));
            TodoDetail todoDetail4 = this.contentData.todo_detail;
            if (todoDetail4 != null) {
                str2 = todoDetail4.guid;
            }
            TodoHitPoint.m221753f("card", str2);
        }
        followTodo(a, z);
    }

    public String getOperationTitleStr() {
        String str;
        String str2;
        TodoUser todoUser = this.contentData.operator;
        if (todoUser == null || (str = todoUser.name) == null) {
            str = "";
        }
        TodoUser todoUser2 = this.contentData.operator;
        if (todoUser2 == null || (str2 = todoUser2.user_id) == null) {
            str2 = "";
        }
        if (this.contentData.msg_status == TodoOperationContent.MsgStatus.DELETED) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_BotMsgTaskCardExpired);
        }
        TodoOperationContent.Type type = this.contentData.operation_type;
        if (type == null) {
            return "";
        }
        TodoSource todoSource = null;
        switch (C57164c.f140944a[type.ordinal()]) {
            case 1:
                if (!Intrinsics.areEqual(this.senderId, str2)) {
                    return ResUtil.f139261a.mo191778a(R.string.Todo_Notify_UsernameCreatedTask, "username", str);
                }
                return ResUtil.f139261a.mo191781c(R.string.Todo_Notify_CreatedATask);
            case 2:
                return ResUtil.f139261a.mo191778a(R.string.Todo_Notify_AddedYouAssignee, "username", str);
            case 3:
                TodoDetail todoDetail = this.contentData.todo_detail;
                if (todoDetail != null) {
                    todoSource = todoDetail.source;
                }
                return getCompleteCardTitle(str, todoSource);
            case 4:
                TodoDetail todoDetail2 = this.contentData.todo_detail;
                if (todoDetail2 != null) {
                    todoSource = todoDetail2.source;
                }
                return getRestoreCardTitle(str, todoSource);
            case 5:
                return ResUtil.f139261a.mo191778a(R.string.Todo_Notify_CreatorDeletedTask, "username", str);
            case 6:
                if (Intrinsics.areEqual(this.senderId, str2)) {
                    return ResUtil.f139261a.mo191781c(R.string.Todo_Notify_SharedATask);
                }
                return ResUtil.f139261a.mo191778a(R.string.Todo_Task_ShareTask, "user_name", str);
            case 7:
                return ResUtil.f139261a.mo191778a(R.string.Todo_Notify_FollowerAddedYou, "username", str);
            case 8:
                return ResUtil.f139261a.mo191778a(R.string.Todo_Task_BotMsgTitleUserCanceledAssign, "user_name", str);
            case 9:
                return ResUtil.f139261a.mo191778a(R.string.Todo_Task_BotMsgTitleUserDeleteFollower, "user", str);
            case 10:
                return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserCompletedYourTask, "user_name", str);
            case 11:
                return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserCompleteTask, "user_name", str);
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserRestoredYourTask, "user_name", str);
            case 13:
                return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserRestoreTask, "user_name", str);
            default:
                return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardViewModel$isInCustomCompleteStrategy$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "showTipToast", "", "tipsStr", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$c */
    public static final class C57143c implements CustomCompleteHelper.ITipShowListener {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardViewModel f140920a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57143c(TodoOperationCardViewModel todoOperationCardViewModel) {
            this.f140920a = todoOperationCardViewModel;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper.ITipShowListener
        /* renamed from: a */
        public void mo191923a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tipsStr");
            this.f140920a.getShowToastLiveData().mo5926a(new TodoToastUnit(0, 4, str));
        }
    }

    public void setShowActiveDialog(C1177w<TodoDetail> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showActiveDialog = wVar;
    }

    public boolean isInCustomCompleteStrategy(Context context) {
        CustomComplete customComplete;
        CustomComplete.Action action;
        Intrinsics.checkParameterIsNotNull(context, "context");
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null || (customComplete = todoDetail.custom_complete) == null || (action = customComplete.f175433android) == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(action, "contentData.todo_detail?…?.android ?: return false");
        return CustomCompleteHelper.f139396a.mo191997a(context, action, new C57143c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$onCheckBoxClicked$1", mo239173f = "TodoOperationCardViewModel.kt", mo239174i = {0, 0, 1, 1}, mo239175l = {341, 343}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "todoDetail", "$this$launch", "todoDetail"}, mo239178s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$e */
    public static final class C57145e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoOperationCardViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57145e(TodoOperationCardViewModel todoOperationCardViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoOperationCardViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57145e eVar = new C57145e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57145e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                VibrateUtil.f139263a.mo191785a();
                TodoDetail todoDetail = this.this$0.contentData.todo_detail;
                if (todoDetail == null) {
                    return Unit.INSTANCE;
                }
                Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return@launch");
                if (!MultiCompleteHelper.f139390a.mo191984a(todoDetail.source)) {
                    TodoOperationCardViewModel todoOperationCardViewModel = this.this$0;
                    this.L$0 = ahVar;
                    this.L$1 = todoDetail;
                    this.label = 1;
                    if (todoOperationCardViewModel.clickCompleteOutMultiStrategy(todoDetail, this) == a) {
                        return a;
                    }
                } else {
                    TodoOperationCardViewModel todoOperationCardViewModel2 = this.this$0;
                    this.L$0 = ahVar;
                    this.L$1 = todoDetail;
                    this.label = 2;
                    if (todoOperationCardViewModel2.clickCompleteInMultiStrategy(todoDetail, this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2) {
                TodoDetail todoDetail2 = (TodoDetail) this.L$1;
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
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$setTodoCompleteStatus$1", mo239173f = "TodoOperationCardViewModel.kt", mo239174i = {0}, mo239175l = {498}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$f */
    public static final class C57146f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTargetComplete;
        final /* synthetic */ TodoDetail $todoDetail;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57146f(TodoDetail todoDetail, boolean z, Continuation cVar) {
            super(2, cVar);
            this.$todoDetail = todoDetail;
            this.$isTargetComplete = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57146f fVar = new C57146f(this.$todoDetail, this.$isTargetComplete, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57146f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                String str2 = this.$todoDetail.guid;
                Intrinsics.checkExpressionValueIsNotNull(str2, "todoDetail.guid");
                if (this.$isTargetComplete) {
                    str = "undone_to_done";
                } else {
                    str = "done_to_undone";
                }
                aVar.mo194177a(str2, str, "done_all_task");
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str3 = this.$todoDetail.guid;
                Intrinsics.checkExpressionValueIsNotNull(str3, "todoDetail.guid");
                boolean z = this.$isTargetComplete;
                TodoSource todoSource = this.$todoDetail.source;
                MarkTodoCompletedRequest.Type type = MarkTodoCompletedRequest.Type.Todo;
                this.L$0 = ahVar;
                this.label = 1;
                if (TodoRustCRUD.m221863a(fVar, str3, z, todoSource, type, null, this, 16, null) == a) {
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

    private final long getDisplayCompleteTime(TodoDetail todoDetail) {
        Long l;
        String str;
        List<TodoAssignee> list = todoDetail.assignees;
        Intrinsics.checkExpressionValueIsNotNull(list, "todoDetail.assignees");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (Intrinsics.areEqual(t.assignee_id, this.operationUserId)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            l = ((TodoAssignee) arrayList2.get(0)).completed_milli_time;
        } else {
            l = todoDetail.completed_milli_time;
        }
        TodoUser todoUser = todoDetail.creator;
        if (todoUser != null) {
            str = todoUser.user_id;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, this.operationUserId)) {
            l = todoDetail.completed_milli_time;
        }
        Intrinsics.checkExpressionValueIsNotNull(l, "displayCompleteTime");
        return l.longValue();
    }

    public EndTimeTextAttribute getShowTimeAttrs(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return null");
        Boolean bool = todoDetail.is_all_day;
        Intrinsics.checkExpressionValueIsNotNull(bool, "todoDetail.is_all_day");
        EndTimeTextAttribute a = EndTimeHelper.f139399a.mo191999a(context, todoDetail.due_time.longValue() * ((long) 1000), bool.booleanValue(), getTimeFormatDependency().mo145434b(), true);
        if (todoDetail.deleted_milli_time.longValue() > 0) {
            a.setEndTimeColor(ResUtil.f139261a.mo191775a(R.color.text_title));
        } else if ((isInMultiCompleteStrategy() && getDisplayCompleteTime(todoDetail) > 0) || todoDetail.completed_milli_time.longValue() > 0) {
            a.setEndTimeColor(ResUtil.f139261a.mo191775a(R.color.text_link_normal));
        }
        return a;
    }

    public void onOpenTodoDetailClicked(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail != null && (str = todoDetail.guid) != null) {
            DetailEntrance bVar = DetailEntrance.f139694a;
            String str4 = this.chatId;
            String str5 = "";
            if (str4 != null) {
                str2 = str4;
            } else {
                str2 = str5;
            }
            bVar.mo192302a(context, str, false, str2, this.messageId, String.valueOf(AuthScene.Type.MESSAGE.getValue()), this.messageId);
            TodoHitPoint.m221748c("chat", str);
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            TodoDetail todoDetail2 = this.contentData.todo_detail;
            if (!(todoDetail2 == null || (str3 = todoDetail2.guid) == null)) {
                str5 = str3;
            }
            aVar.mo194195d(str5);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$followTodo$1", mo239173f = "TodoOperationCardViewModel.kt", mo239174i = {0}, mo239175l = {437}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel$b */
    public static final class C57142b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isFollowed;
        final /* synthetic */ TodoDetail $todoDetail;
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoOperationCardViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57142b(TodoOperationCardViewModel todoOperationCardViewModel, TodoDetail todoDetail, boolean z, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoOperationCardViewModel;
            this.$todoDetail = todoDetail;
            this.$isFollowed = z;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57142b bVar = new C57142b(this.this$0, this.$todoDetail, this.$isFollowed, this.$userId, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57142b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<TodoFollower> list;
            int i;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            boolean z = true;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                obj = TodoRustCRUD.f141115a.mo194304a(this.$todoDetail.guid, new AuthScene(this.this$0.messageId, AuthScene.Type.MESSAGE), !this.$isFollowed, this);
                if (obj == a) {
                    return a;
                }
            } else if (i2 == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            boolean z2 = false;
            if (bVar.mo194252b() == null) {
                FollowTodoResponse followTodoResponse = (FollowTodoResponse) bVar.mo194251a();
                if (followTodoResponse != null) {
                    Todo todo = followTodoResponse.todo;
                    if (!(todo == null || (list = todo.followers) == null)) {
                        List<TodoFollower> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().follower_id);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C57782ag.m224242a((String) it2.next(), this.$userId)) {
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        z2 = z;
                    }
                    boolean z3 = this.$isFollowed;
                    if (z3 && z2) {
                        this.this$0.getShowToastLiveData().mo5926a(new TodoToastUnit(R.string.Todo_Task_FailedToUnollowToast, 2, null, 4, null));
                    } else if (z3 && !z2) {
                        this.this$0.getShowToastLiveData().mo5926a(new TodoToastUnit(R.string.Todo_Task_UnfollowedToast, 1, null, 4, null));
                    } else if (z3 || !z2) {
                        this.this$0.getShowToastLiveData().mo5926a(new TodoToastUnit(R.string.Todo_Task_FailedToFollowToast, 2, null, 4, null));
                    } else {
                        this.this$0.getShowToastLiveData().mo5926a(new TodoToastUnit(R.string.Todo_Task_SuccesfullyFollow, 1, null, 4, null));
                    }
                }
            } else if (bVar.mo194252b().getErrorCode() != 10028) {
                if (this.$todoDetail.source != TodoSource.OAPI) {
                    i = R.string.Todo_common_ActionFailedTryAgainLater;
                } else if (this.$isFollowed) {
                    i = R.string.Todo_Task_CantCancelFollow;
                } else {
                    i = R.string.Todo_Task_CantFollowExternalPlatform;
                }
                this.this$0.getShowToastLiveData().mo5926a(new TodoToastUnit(i, 2, null, 4, null));
            } else {
                this.this$0.getShowToastLiveData().mo5926a(new TodoToastUnit(0, 2, TodoErrorHelper.f141112a.mo194284b()));
            }
            return Unit.INSTANCE;
        }
    }

    public void setTodoCompleteStatus(TodoDetail todoDetail, boolean z) {
        Intrinsics.checkParameterIsNotNull(todoDetail, "todoDetail");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57146f(todoDetail, z, null), 3, null);
    }

    private final void followTodo(String str, boolean z) {
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail != null) {
            Intrinsics.checkExpressionValueIsNotNull(todoDetail, "contentData.todo_detail ?: return");
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C57142b(this, todoDetail, z, str, null), 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object clickCompleteOutMultiStrategy(TodoDetail todoDetail, Continuation<? super Unit> cVar) {
        if (isTodoCompleted()) {
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            String str = todoDetail.guid;
            Intrinsics.checkExpressionValueIsNotNull(str, "todoDetail.guid");
            aVar.mo194177a(str, "done", "check_box");
            TodoRustCRUD fVar = TodoRustCRUD.f141115a;
            String str2 = todoDetail.guid;
            Intrinsics.checkExpressionValueIsNotNull(str2, "todoDetail.guid");
            Object a = TodoRustCRUD.m221863a(fVar, str2, false, todoDetail.source, null, null, cVar, 24, null);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
        TodoGeneralHitPoint aVar2 = TodoGeneralHitPoint.f141070a;
        String str3 = todoDetail.guid;
        Intrinsics.checkExpressionValueIsNotNull(str3, "todoDetail.guid");
        aVar2.mo194177a(str3, "not_done", "check_box");
        TodoRustCRUD fVar2 = TodoRustCRUD.f141115a;
        String str4 = todoDetail.guid;
        Intrinsics.checkExpressionValueIsNotNull(str4, "todoDetail.guid");
        Object a2 = TodoRustCRUD.m221863a(fVar2, str4, true, todoDetail.source, null, null, cVar, 24, null);
        if (a2 == C69086a.m265828a()) {
            return a2;
        }
        return Unit.INSTANCE;
    }

    private final String getCompleteCardTitle(String str, TodoSource todoSource) {
        if (!MultiCompleteHelper.f139390a.mo191984a(todoSource)) {
            return ResUtil.f139261a.mo191778a(R.string.Todo_Notify_CreatorCompletedTask, "username", str);
        }
        TodoOperationContent.CompleteType completeType = this.contentData.complete_type;
        if (completeType != null) {
            switch (C57164c.f140945b[completeType.ordinal()]) {
                case 1:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_CompletedWholeTaskCompleted, "user_name", str);
                case 2:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_ExitWholeTaskCompleted, "user_name", str);
                case 3:
                    return getMultiUserFormatString(str, R.string.Todo_CollabTask_UserRemoveAsigneeTaskDone, R.string.Todo_CollabTask_UserRemovedNumAssigneesTaskDone);
                case 4:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserRemovedYouAsAssigneeTaskCompleted, "user_name", str);
                case 5:
                    return getMultiUserFormatString(str, R.string.Todo_CollabTask_UserCompletedAsigneeTaskDone, R.string.Todo_CollabTask_UserCompletedNumAssigneeTasksDone);
                case 6:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserCompletedYourTaskTaskDone, "user_name", str);
            }
        }
        return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserCompleteTask, "user_name", str);
    }

    private final String getRestoreCardTitle(String str, TodoSource todoSource) {
        if (!MultiCompleteHelper.f139390a.mo191984a(todoSource)) {
            return ResUtil.f139261a.mo191778a(R.string.Todo_Notify_CreatorReopenTask, "user_name", str);
        }
        TodoOperationContent.CompleteType completeType = this.contentData.complete_type;
        if (completeType != null) {
            switch (C57164c.f140946c[completeType.ordinal()]) {
                case 1:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_CreatorReopenedEntireTask, "user_name", str);
                case 2:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserAddSelfAsigneeTaskRestored, "user_name", str);
                case 3:
                    return getMultiUserFormatString(str, R.string.Todo_CollabTask_UserAddUserTaskRestored, R.string.Todo_CollabTask_UserAddAsigneeTaskRestored);
                case 4:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserAddedYouAsAssigneeTaskReopened, "user_name", str);
                case 5:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserRestoreOwnTask, "user_name", str);
                case 6:
                    return getMultiUserFormatString(str, R.string.Todo_CollabTask_UserRestoreAsigneeTask, R.string.Todo_CollabTask_UserAddedBackAssigneeTaskReopened);
                case 7:
                    return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserReopenedYourTaskTaskReopened, "user_name", str);
            }
        }
        return ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_UserRestoreTask, "user_name", str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object clickCompleteInMultiStrategy(com.bytedance.lark.pb.basic.v1.TodoDetail r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel.clickCompleteInMultiStrategy(com.bytedance.lark.pb.basic.v1.TodoDetail, kotlin.coroutines.c):java.lang.Object");
    }

    private final String getMultiUserFormatString(String str, int i, int i2) {
        boolean z;
        List<TodoUser> list = this.contentData.target_users;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("user_name", str);
        if (this.contentData.target_users.size() > 1) {
            hashMap.put("num", String.valueOf(this.contentData.target_users.size()));
            i = i2;
        } else {
            String str2 = this.contentData.target_users.get(0).name;
            Intrinsics.checkExpressionValueIsNotNull(str2, "contentData.target_users[0].name");
            hashMap.put("assignee", str2);
        }
        return ResUtil.f139261a.mo191779a(i, hashMap);
    }

    public TodoOperationCardViewModel(TodoOperationContent todoOperationContent, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(todoOperationContent, "contentData");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        Intrinsics.checkParameterIsNotNull(str3, "senderId");
        this.contentData = todoOperationContent;
        this.chatId = str;
        this.messageId = str2;
        this.senderId = str3;
    }
}
