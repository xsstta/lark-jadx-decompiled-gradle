package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.bytedance.lark.pb.todo.v1.Commit;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoAssigneeEvent;
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.UpdateTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001bj\b\u0012\u0004\u0012\u00020\t`\u001cH\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0012H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b¨\u0006)"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "preAssignee", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "selfTenantId", "", "getSelfTenantId", "()Ljava/lang/String;", "selfTenantId$delegate", "Lkotlin/Lazy;", "selfUserId", "getSelfUserId", "selfUserId$delegate", "addAssignees", "", "assigneeIds", "", "atAssignee", "id", "deleteAssignee", "isQuit", "", "getAssigneeIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAssignees", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "handleAction", "action", "", "actionData", "initViewData", "isAssigneeEditable", "registerCallback", "startAddAssigneeActivity", "updateAssignee", "AssigneeCommons", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AssigneeViewModel extends ViewModelSection<TodoDetailModel> {
    public static final AssigneeCommons AssigneeCommons = new AssigneeCommons(null);
    public TodoAssignee preAssignee;
    private final Lazy selfTenantId$delegate = LazyKt.lazy(C56727h.INSTANCE);
    private final Lazy selfUserId$delegate = LazyKt.lazy(C56728i.INSTANCE);

    private final String getSelfTenantId() {
        return (String) this.selfTenantId$delegate.getValue();
    }

    private final String getSelfUserId() {
        return (String) this.selfUserId$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel$AssigneeCommons;", "", "()V", "AddAssigneeBlue", "", "AddAssigneeGrey", "AddAssigneeHide", "DocGreyDelete", "Gone", "ShowDelete", "ShowMore", "ShowMoreOnlyDelete", "AddState", "DeleteState", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class AssigneeCommons {

        @Target({ElementType.TYPE_USE})
        @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel$AssigneeCommons$AddState;", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        public @interface AddState {
        }

        @Target({ElementType.TYPE_USE})
        @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel$AssigneeCommons$DeleteState;", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        public @interface DeleteState {
        }

        private AssigneeCommons() {
        }

        public /* synthetic */ AssigneeCommons(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$h */
    static final class C56727h extends Lambda implements Function0<String> {
        public static final C56727h INSTANCE = new C56727h();

        C56727h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145412b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$i */
    static final class C56728i extends Lambda implements Function0<String> {
        public static final C56728i INSTANCE = new C56728i();

        C56728i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        }
    }

    private final void registerCallback() {
        registerActivityResult(new C56726g(this));
    }

    public final void updateAssignee() {
        ((TodoDetailModel) getModelStore()).getAssignees().mo92061d(getAssignees());
    }

    private final ArrayList<String> getAssigneeIds() {
        ArrayList<String> arrayList = new ArrayList<>();
        List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        Intrinsics.checkExpressionValueIsNotNull(list, "getModelStore().todoBuilder.assignees");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().assignee_id);
        }
        return arrayList;
    }

    private final void startAddAssigneeActivity() {
        Intent intent = new Intent();
        intent.setClass(getContext(), TodoAssigneeAddActivity.class);
        intent.putExtra("add_assignee_selected_ids", getAssigneeIds());
        intent.putExtra("add_assignee_is_chat_id", ((TodoDetailModel) getModelStore()).getChatIdForAddAssignee());
        intent.putExtra("add_todo_user_request_code", 2);
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.startActivityForResult(intent, 2);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        Long l;
        boolean z;
        ((TodoDetailModel) getModelStore()).getNeedUpdate().mo5925a(new C56725f(this));
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getNeedUpdateAssignee().mo5925a(new C56724e(this));
        Todo.C19637a todoBuilder = adVar.getTodoBuilder();
        if (!(todoBuilder == null || (l = todoBuilder.f48017D) == null)) {
            if (l.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            adVar.setSelfDisplayCompleteOrigin(Boolean.valueOf(z));
        }
        registerCallback();
    }

    public final boolean isAssigneeEditable() {
        Map<Integer, Boolean> map;
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TodoItemPermission todoItemPermission = adVar.getTodoBuilder().f48031m;
        if (todoItemPermission == null || (map = todoItemPermission.can_edit_commit_keys) == null) {
            map = MapsKt.emptyMap();
        }
        TodoSource todoSource = adVar.getTodoSource();
        if (todoSource == null || ((i = C56767b.f140161a[todoSource.ordinal()]) != 1 && i != 2)) {
            return adVar.isEditable();
        }
        Boolean bool = map.get(Integer.valueOf(Commit.Key.TODO_ASSIGNEES.getValue()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final List<AssigneeBean> getAssignees() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        if (list != null) {
            for (T t : list) {
                if (t.completed_milli_time.longValue() <= 0) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    arrayList.add(t);
                }
            }
        }
        List<TodoAssignee> list2 = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        if (list2 != null) {
            for (T t2 : list2) {
                if (t2.completed_milli_time.longValue() > 0) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    arrayList.add(t2);
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.areEqual(((TodoAssignee) it.next()).assignee_id, getSelfUserId())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            arrayList.add(0, (TodoAssignee) arrayList.remove(i2));
        }
        ArrayList<TodoAssignee> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (TodoAssignee todoAssignee : arrayList2) {
            boolean equals = TextUtils.equals(todoAssignee.assignee_id, getSelfUserId());
            if (((TodoDetailModel) getModelStore()).isFromDoc() && !equals) {
                i = 1;
            } else if ((((TodoDetailModel) getModelStore()).isFromDoc() && equals) || (isAssigneeEditable() && (!Intrinsics.areEqual((Object) ((TodoDetailModel) getModelStore()).getAssigneeMultiStrategy().mo5927b(), (Object) true)))) {
                i = 0;
            } else if (isAssigneeEditable() && (equals || ((TodoDetailModel) getModelStore()).isSelfCreator())) {
                i = 3;
            } else if (isAssigneeEditable()) {
                i = 4;
            } else {
                i = 2;
            }
            if (equals) {
                TodoDetailModel adVar = (TodoDetailModel) getModelStore();
                if (adVar.isFollowed() || (adVar.isSelfCreator() && !adVar.isFromDoc())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z = z3;
            } else {
                z = false;
            }
            boolean z4 = !TextUtils.equals(todoAssignee.tenant_id, getSelfTenantId());
            String str = todoAssignee.assignee_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.assignee_id");
            String str2 = todoAssignee.name;
            Intrinsics.checkExpressionValueIsNotNull(str2, "it.name");
            String str3 = todoAssignee.avatar_key;
            Intrinsics.checkExpressionValueIsNotNull(str3, "it.avatar_key");
            if (todoAssignee.completed_milli_time.longValue() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList3.add(new AssigneeBean(str, str2, str3, i, z, z4, z2));
        }
        return arrayList3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel$initViewData$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$e */
    static final class C56724e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AssigneeViewModel f140119a;

        C56724e(AssigneeViewModel assigneeViewModel) {
            this.f140119a = assigneeViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140119a.updateAssignee();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssigneeViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    public final void addAssignees(List<String> list) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), ((TodoDetailModel) getModelStore()).getDispatcher(), null, new C56720a(this, list, null), 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$f */
    static final class C56725f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AssigneeViewModel f140120a;

        C56725f(AssigneeViewModel assigneeViewModel) {
            this.f140120a = assigneeViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            this.f140120a.updateAssignee();
            if (((TodoDetailModel) this.f140120a.getModelStore()).isFromDoc()) {
                i = 1;
            } else if (this.f140120a.isAssigneeEditable()) {
                i = 0;
            } else {
                i = 2;
            }
            ((TodoDetailModel) this.f140120a.getModelStore()).getAssigneeFragmentShowAdd().mo92060c(Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$handleAction$4$1$1", mo239173f = "AssigneeViewModel.kt", mo239174i = {0}, mo239175l = {133}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$d */
    static final class C56723d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDetailModel $this_apply;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56723d(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.$this_apply = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56723d dVar = new C56723d(this.$this_apply, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56723d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoDetailModel adVar = this.$this_apply;
                this.L$0 = ahVar;
                this.label = 1;
                obj = adVar.updateTodoMayError(this);
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
                this.$this_apply.setOldTodo(todo);
                EventBus.getDefault().trigger(new UpdateTodoEvent(todo));
            }
            return Unit.INSTANCE;
        }
    }

    private final void atAssignee(String str) {
        T t;
        List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        Intrinsics.checkExpressionValueIsNotNull(list, "getModelStore().todoBuilder.assignees");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.assignee_id, str)) {
                break;
            }
        }
        if (t == null) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), ((TodoDetailModel) getModelStore()).getDispatcher(), null, new C56721b(this, str, null), 2, null);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 21) {
            TodoDetailModel adVar = (TodoDetailModel) getModelStore();
            TodoHitPoint.f141073a.mo194221a(adVar.isCreateTodo(), adVar.getGuid(), !getAssignees().isEmpty());
            TodoHitPoint.m221725a();
        } else if (i == 22) {
            TodoDetailModel adVar2 = (TodoDetailModel) getModelStore();
            if (isAssigneeEditable()) {
                TodoHitPoint.f141073a.mo194221a(adVar2.isCreateTodo(), adVar2.getGuid(), !getAssignees().isEmpty());
                TodoHitPoint.m221755h(adVar2.getGuid());
                startAddAssigneeActivity();
                return;
            }
            adVar2.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_NoEditAccess, 4, null, 4, null)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$addAssignees$1", mo239173f = "AssigneeViewModel.kt", mo239174i = {0, 1, 1, 1, 1}, mo239175l = {308, 317}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "list", "oldAssignees", "$this$apply"}, mo239178s = {"L$0", "L$0", "L$1", "L$2", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$a */
    public static final class C56720a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $assigneeIds;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AssigneeViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56720a(AssigneeViewModel assigneeViewModel, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = assigneeViewModel;
            this.$assigneeIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56720a aVar = new C56720a(this.this$0, this.$assigneeIds, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56720a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel.C56720a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$atAssignee$2", mo239173f = "AssigneeViewModel.kt", mo239174i = {0}, mo239175l = {339}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$b */
    public static final class C56721b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AssigneeViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56721b(AssigneeViewModel assigneeViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = assigneeViewModel;
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56721b bVar = new C56721b(this.this$0, this.$id, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56721b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TodoAssignee todoAssignee;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCommon gVar = TodoRustCommon.f141116a;
                List<String> mutableListOf = CollectionsKt.mutableListOf(this.$id);
                this.L$0 = ahVar;
                this.label = 1;
                obj = gVar.mo194355a(mutableListOf, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) obj;
            if (!(list == null || (todoAssignee = (TodoAssignee) CollectionsKt.firstOrNull(list)) == null)) {
                this.this$0.preAssignee = todoAssignee;
                ((TodoDetailModel) this.this$0.getModelStore()).getShowRevokeAssignee().mo5926a(C69089a.m265837a(true));
                Todo.C19637a todoBuilder = ((TodoDetailModel) this.this$0.getModelStore()).getTodoBuilder();
                List<TodoAssignee> list2 = todoBuilder.f48032n;
                if (list2 != null) {
                    list2.add(0, todoAssignee);
                } else {
                    todoBuilder.f48032n = CollectionsKt.mutableListOf(todoAssignee);
                }
                this.this$0.updateAssignee();
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel$deleteAssignee$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$c */
    public static final class C56722c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id$inlined;
        final /* synthetic */ boolean $isQuit$inlined;
        final /* synthetic */ List $oldAssignees;
        final /* synthetic */ TodoDetailModel $this_apply;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AssigneeViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56722c(TodoDetailModel adVar, List list, Continuation cVar, AssigneeViewModel assigneeViewModel, String str, boolean z) {
            super(2, cVar);
            this.$this_apply = adVar;
            this.$oldAssignees = list;
            this.this$0 = assigneeViewModel;
            this.$id$inlined = str;
            this.$isQuit$inlined = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56722c cVar2 = new C56722c(this.$this_apply, this.$oldAssignees, cVar, this.this$0, this.$id$inlined, this.$isQuit$inlined);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56722c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                Todo oldTodo = this.$this_apply.getOldTodo();
                Todo a2 = this.$this_apply.getTodoBuilder().build();
                Intrinsics.checkExpressionValueIsNotNull(a2, "todoBuilder.build()");
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194302a(oldTodo, a2, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194252b() != null) {
                this.$this_apply.getTodoBuilder().f48032n = this.$oldAssignees;
                this.this$0.updateAssignee();
                this.$this_apply.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_FailedToRemove, 2, null, 4, null)));
            } else {
                Todo todo = (Todo) bVar.mo194251a();
                if (todo != null) {
                    this.$this_apply.setOldTodo(todo);
                    if (!this.$this_apply.isFromDoc()) {
                        EventBus.getDefault().trigger(new UpdateTodoEvent(todo));
                    } else if (this.$isQuit$inlined) {
                        EventBus eventBus = EventBus.getDefault();
                        String str = this.$this_apply.getTodoBuilder().f48019a;
                        Intrinsics.checkExpressionValueIsNotNull(str, "todoBuilder.guid");
                        eventBus.trigger(new QuitTodoEvent(str));
                    } else {
                        EventBus eventBus2 = EventBus.getDefault();
                        String str2 = this.$this_apply.getTodoBuilder().f48019a;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "todoBuilder.guid");
                        eventBus2.trigger(new DeleteTodoAssigneeEvent(str2, this.$id$inlined));
                    }
                    this.$this_apply.getNeedUpdate().mo5926a(C69089a.m265837a(true));
                    this.$this_apply.getToastStringResId().mo5926a(C69089a.m265839a((int) R.string.Todo_Task_RemovedSuccessfully));
                    if (this.$isQuit$inlined) {
                        this.$this_apply.getActivityFinished().mo5926a(C69089a.m265837a(true));
                    }
                }
            }
            if (Intrinsics.areEqual(this.$this_apply.getSelfDisplayCompleteOrigin(), C69089a.m265837a(false)) && this.$this_apply.getTodoBuilder().f48017D.longValue() > 0) {
                this.$this_apply.getActivityFinished().mo5926a(C69089a.m265837a(true));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionData");
        if (i == 25) {
            TodoGeneralHitPoint.f141070a.mo194213l(((TodoDetailModel) getModelStore()).getGuid());
            deleteAssignee(str, false);
        } else if (i == 26) {
            TodoGeneralHitPoint.f141070a.mo194213l(((TodoDetailModel) getModelStore()).getGuid());
            deleteAssignee(str, true);
        } else if (i == 60) {
            atAssignee(str);
        }
    }

    private final void deleteAssignee(String str, boolean z) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        List<TodoAssignee> list = adVar.getTodoBuilder().f48032n;
        List<TodoAssignee> list2 = adVar.getTodoBuilder().f48032n;
        if (list2 != null) {
            Todo.C19637a todoBuilder = adVar.getTodoBuilder();
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!Intrinsics.areEqual(t.assignee_id, str)) {
                    arrayList.add(t);
                }
            }
            todoBuilder.f48032n = arrayList;
        }
        TodoHitPoint.m221745b(adVar.getGuid(), str);
        updateAssignee();
        if (!adVar.isCreateTodo()) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(adVar), adVar.getDispatcher(), null, new C56722c(adVar, list, null, this, str, z), 2, null);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, boolean z) {
        if (i == 24) {
            if (z) {
                TodoHitPoint.f141073a.mo194227f();
                if (this.preAssignee != null) {
                    List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
                    if (list != null) {
                        list.remove(this.preAssignee);
                    }
                    this.preAssignee = null;
                    updateAssignee();
                }
            } else if (this.preAssignee != null) {
                this.preAssignee = null;
                TodoDetailModel adVar = (TodoDetailModel) getModelStore();
                Job unused = C69553g.m266944a(C1143ag.m5356a(adVar), adVar.getDispatcher(), null, new C56723d(adVar, null), 2, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel$g */
    public static final class C56726g extends Lambda implements Function3<Integer, Integer, Intent, Unit> {
        final /* synthetic */ AssigneeViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56726g(AssigneeViewModel assigneeViewModel) {
            super(3);
            this.this$0 = assigneeViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Integer num, Integer num2, Intent intent) {
            invoke(num.intValue(), num2.intValue(), intent);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, Intent intent) {
            if (i == 2 && i2 == -1 && intent != null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("add_assignee_chosen_data");
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = new ArrayList<>();
                }
                if (!stringArrayListExtra.isEmpty()) {
                    AssigneeViewModel assigneeViewModel = this.this$0;
                    ArrayList<String> arrayList = stringArrayListExtra;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getId());
                    }
                    assigneeViewModel.addAssignees(arrayList2);
                }
            }
        }
    }
}
