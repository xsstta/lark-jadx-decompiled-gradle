package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.bytedance.lark.pb.todo.v1.AuthScene;
import com.bytedance.lark.pb.todo.v1.Commit;
import com.bytedance.lark.pb.todo.v1.FollowTodoResponse;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoFollower;
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
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoErrorHelper;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001dj\b\u0012\u0004\u0012\u00020\u0007`\u001eH\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0012H\u0002J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0018\u0010$\u001a\u00020\u00102\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0012H\u0002J\b\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\u0012\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010,\u001a\u00020\u0010H\u0002J\b\u0010-\u001a\u00020\u0010H\u0002J\b\u0010.\u001a\u00020\u0010H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006/"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "selfTenantId", "", "getSelfTenantId", "()Ljava/lang/String;", "selfTenantId$delegate", "Lkotlin/Lazy;", "selfUserId", "getSelfUserId", "selfUserId$delegate", "addFollowers", "", "followerIds", "", "addOrDeleteSelfToFollower", "isFollow", "", "deleteFollower", "id", "isQuit", "followToastError", "errorCode", "", "getFollowerIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getFollowers", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "handleAction", "action", "actionData", "handleUnFollowFail", "oldFollowers", "Lcom/bytedance/lark/pb/todo/v1/TodoFollower;", "initViewData", "isFollowerEditable", "registerCallback", "removeDocFollowerShouldQuit", "userId", "selfFollowAction", "startFollowerActivity", "updateFollower", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m */
public final class FollowerViewModel extends ViewModelSection<TodoDetailModel> {
    private final Lazy selfTenantId$delegate = LazyKt.lazy(C56782h.INSTANCE);
    private final Lazy selfUserId$delegate = LazyKt.lazy(C56783i.INSTANCE);

    private final String getSelfTenantId() {
        return (String) this.selfTenantId$delegate.getValue();
    }

    public final String getSelfUserId() {
        return (String) this.selfUserId$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$h */
    static final class C56782h extends Lambda implements Function0<String> {
        public static final C56782h INSTANCE = new C56782h();

        C56782h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145412b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$i */
    static final class C56783i extends Lambda implements Function0<String> {
        public static final C56783i INSTANCE = new C56783i();

        C56783i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        }
    }

    private final void registerCallback() {
        registerActivityResult(new C56781g(this));
    }

    public final void updateFollower() {
        ((TodoDetailModel) getModelStore()).getFollowers().mo92061d(getFollowers());
    }

    private final ArrayList<String> getFollowerIds() {
        ArrayList<String> arrayList = new ArrayList<>();
        List<TodoFollower> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48044z;
        Intrinsics.checkExpressionValueIsNotNull(list, "getModelStore().todoBuilder.followers");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().follower_id);
        }
        return arrayList;
    }

    private final void startFollowerActivity() {
        Intent intent = new Intent();
        intent.setClass(getContext(), TodoAssigneeAddActivity.class);
        intent.putExtra("add_assignee_selected_ids", getFollowerIds());
        intent.putExtra("add_assignee_is_chat_id", ((TodoDetailModel) getModelStore()).getChatIdForAddAssignee());
        intent.putExtra("add_todo_user_request_code", 3);
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.startActivityForResult(intent, 3);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        ((TodoDetailModel) getModelStore()).getNeedUpdate().mo5925a(new C56779e(this));
        ((TodoDetailModel) getModelStore()).getNeedUpdateFollower().mo5925a(new C56780f(this));
        registerCallback();
    }

    private final void selfFollowAction() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        if (adVar.isFollowed()) {
            if (adVar.isFromTodoTab()) {
                adVar.getBottomUnFollowDialog().mo5929b((Boolean) true);
            } else {
                addOrDeleteSelfToFollower(false);
            }
            TodoGeneralHitPoint.m221669a(adVar.getGuid(), "leave_task", false, 4, null);
            TodoHitPoint.m221732a("bottom", adVar.getGuid(), TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a());
            return;
        }
        addOrDeleteSelfToFollower(true);
        TodoHitPoint.m221753f("bottom", adVar.getGuid());
    }

    public final boolean isFollowerEditable() {
        Map<Integer, Boolean> map;
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TodoItemPermission todoItemPermission = adVar.getTodoBuilder().f48031m;
        if (todoItemPermission == null || (map = todoItemPermission.can_edit_commit_keys) == null) {
            map = MapsKt.emptyMap();
        }
        TodoSource todoSource = adVar.getTodoSource();
        if (todoSource == null || ((i = C56784n.f140188a[todoSource.ordinal()]) != 1 && i != 2)) {
            return adVar.isEditable();
        }
        Boolean bool = map.get(Integer.valueOf(Commit.Key.TODO_FOLLOWERS.getValue()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final List<FollowerBean> getFollowers() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        List<TodoFollower> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48044z;
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(((TodoFollower) it.next()).follower_id, getSelfUserId())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.add(0, (TodoFollower) arrayList.remove(i));
        }
        ArrayList<TodoFollower> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (TodoFollower todoFollower : arrayList2) {
            boolean equals = TextUtils.equals(todoFollower.follower_id, getSelfUserId());
            if (isFollowerEditable() || equals) {
                z = true;
            } else {
                z = false;
            }
            if (!equals || isFollowerEditable()) {
                z2 = false;
            } else {
                z2 = true;
            }
            TodoDetailModel adVar = (TodoDetailModel) getModelStore();
            if (adVar.isFromDoc()) {
                List<TodoAssignee> list2 = adVar.getTodoBuilder().f48032n;
                TodoAssignee todoAssignee = null;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (Intrinsics.areEqual(next.assignee_id, getSelfUserId())) {
                            todoAssignee = next;
                            break;
                        }
                    }
                    todoAssignee = todoAssignee;
                }
                if (todoAssignee == null && equals) {
                    z3 = true;
                    String str = todoFollower.follower_id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.follower_id");
                    String str2 = todoFollower.name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.name");
                    String str3 = todoFollower.avatar_key;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "it.avatar_key");
                    arrayList3.add(new FollowerBean(str, str2, str3, z, z3, !TextUtils.equals(todoFollower.tenant_id, getSelfTenantId())));
                }
            }
            z3 = z2;
            String str4 = todoFollower.follower_id;
            Intrinsics.checkExpressionValueIsNotNull(str4, "it.follower_id");
            String str22 = todoFollower.name;
            Intrinsics.checkExpressionValueIsNotNull(str22, "it.name");
            String str32 = todoFollower.avatar_key;
            Intrinsics.checkExpressionValueIsNotNull(str32, "it.avatar_key");
            arrayList3.add(new FollowerBean(str4, str22, str32, z, z3, !TextUtils.equals(todoFollower.tenant_id, getSelfTenantId())));
        }
        return arrayList3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$f */
    static final class C56780f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FollowerViewModel f140187a;

        C56780f(FollowerViewModel mVar) {
            this.f140187a = mVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140187a.updateFollower();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$e */
    static final class C56779e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FollowerViewModel f140186a;

        C56779e(FollowerViewModel mVar) {
            this.f140186a = mVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140186a.updateFollower();
            ((TodoDetailModel) this.f140186a.getModelStore()).getFollowerFragmentShowAdd().mo92060c(Boolean.valueOf(this.f140186a.isFollowerEditable()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowerViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    private final void addOrDeleteSelfToFollower(boolean z) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56776b(this, z, null), 2, null);
    }

    public final void addFollowers(List<String> list) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56775a(this, list, null), 3, null);
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 32) {
            TodoDetailModel adVar = (TodoDetailModel) getModelStore();
            if (isFollowerEditable()) {
                startFollowerActivity();
            } else {
                adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_NoEditAccess, 4, null, 4, null)));
            }
        } else if (i == 37) {
            selfFollowAction();
        } else if (i == 253) {
            addOrDeleteSelfToFollower(false);
        }
    }

    public final void handleUnFollowFail(List<TodoFollower> list) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getTodoBuilder().f48044z = list;
        adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_FailedToRemove, 2, null, 4, null)));
        updateFollower();
    }

    public final boolean removeDocFollowerShouldQuit(String str) {
        if (!Intrinsics.areEqual(str, TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a())) {
            return false;
        }
        List<TodoAssignee> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48032n;
        Intrinsics.checkExpressionValueIsNotNull(list, "getModelStore().todoBuilder.assignees");
        List<TodoAssignee> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().assignee_id);
        }
        if (!arrayList.contains(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerViewModel$addFollowers$1", mo239173f = "FollowerViewModel.kt", mo239174i = {0, 1, 1, 1}, mo239175l = {269, 279}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "list", "$this$apply"}, mo239178s = {"L$0", "L$0", "L$1", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$a */
    public static final class C56775a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $followerIds;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FollowerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56775a(FollowerViewModel mVar, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = mVar;
            this.$followerIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56775a aVar = new C56775a(this.this$0, this.$followerIds, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56775a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerViewModel.C56775a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerViewModel$deleteFollower$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$c */
    public static final class C56777c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id$inlined;
        final /* synthetic */ boolean $isQuit$inlined;
        final /* synthetic */ List $oldFollowers;
        final /* synthetic */ TodoDetailModel $this_apply;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FollowerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56777c(TodoDetailModel adVar, List list, Continuation cVar, FollowerViewModel mVar, String str, boolean z) {
            super(2, cVar);
            this.$this_apply = adVar;
            this.$oldFollowers = list;
            this.this$0 = mVar;
            this.$id$inlined = str;
            this.$isQuit$inlined = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56777c cVar2 = new C56777c(this.$this_apply, this.$oldFollowers, cVar, this.this$0, this.$id$inlined, this.$isQuit$inlined);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56777c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
            Todo todo = (Todo) ((SdkResponse) obj).mo194251a();
            if (todo != null) {
                this.$this_apply.setOldTodo(todo);
                this.$this_apply.getToastStringResId().mo5926a(C69089a.m265839a((int) R.string.Todo_Task_RemovedSuccessfully));
                if (this.$this_apply.isFromDoc() && this.$isQuit$inlined) {
                    EventBus eventBus = EventBus.getDefault();
                    String str = this.$this_apply.getTodoBuilder().f48019a;
                    Intrinsics.checkExpressionValueIsNotNull(str, "todoBuilder.guid");
                    eventBus.trigger(new QuitTodoEvent(str));
                }
                if (this.$isQuit$inlined) {
                    this.$this_apply.getActivityFinished().mo5926a(C69089a.m265837a(true));
                }
            } else {
                this.this$0.handleUnFollowFail(this.$oldFollowers);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerViewModel$deleteFollower$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$d */
    public static final class C56778d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id$inlined;
        final /* synthetic */ boolean $isQuit$inlined;
        final /* synthetic */ List $oldFollowers;
        final /* synthetic */ TodoDetailModel $this_apply;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FollowerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56778d(TodoDetailModel adVar, List list, Continuation cVar, FollowerViewModel mVar, String str, boolean z) {
            super(2, cVar);
            this.$this_apply = adVar;
            this.$oldFollowers = list;
            this.this$0 = mVar;
            this.$id$inlined = str;
            this.$isQuit$inlined = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56778d dVar = new C56778d(this.$this_apply, this.$oldFollowers, cVar, this.this$0, this.$id$inlined, this.$isQuit$inlined);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56778d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<TodoFollower> list;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z = false;
            TodoFollower todoFollower = null;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.$this_apply.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_UnfollowingToast, 3, null, 4, null)));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String guid = this.$this_apply.getGuid();
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194304a(guid, (AuthScene) null, false, (Continuation<? super SdkResponse<FollowTodoResponse>>) this);
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
                this.this$0.handleUnFollowFail(this.$oldFollowers);
            } else {
                FollowTodoResponse followTodoResponse = (FollowTodoResponse) bVar.mo194251a();
                if (followTodoResponse != null) {
                    Todo todo = followTodoResponse.todo;
                    if (!(todo == null || (list = todo.followers) == null)) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (C69089a.m265837a(Intrinsics.areEqual(next.follower_id, this.this$0.getSelfUserId())).booleanValue()) {
                                todoFollower = next;
                                break;
                            }
                        }
                        todoFollower = todoFollower;
                    }
                    if (todoFollower != null) {
                        z = true;
                    }
                    if (z) {
                        this.this$0.handleUnFollowFail(this.$oldFollowers);
                    } else {
                        this.$this_apply.getToastStringResId().mo5926a(C69089a.m265839a((int) R.string.Todo_Task_RemovedSuccessfully));
                        if (this.$isQuit$inlined) {
                            this.$this_apply.getActivityFinished().mo5926a(C69089a.m265837a(true));
                        }
                    }
                    if (this.$isQuit$inlined) {
                        this.$this_apply.getActivityFinished().mo5926a(C69089a.m265837a(true));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerViewModel$addOrDeleteSelfToFollower$1", mo239173f = "FollowerViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {302}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$apply", "authSceneBuilder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$b */
    public static final class C56776b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isFollow;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FollowerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56776b(FollowerViewModel mVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = mVar;
            this.$isFollow = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56776b bVar = new C56776b(this.this$0, this.$isFollow, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56776b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:53:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x017f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 427
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerViewModel.C56776b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionData");
        if (i == 35) {
            deleteFollower(str, false);
        } else if (i == 36) {
            deleteFollower(str, true);
        }
    }

    public final void followToastError(boolean z, int i) {
        int i2;
        String str;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        if (!z && adVar.getTodoSource() == TodoSource.OAPI) {
            i2 = R.string.Todo_Task_CantCancelFollow;
        } else if (z && adVar.getTodoSource() == TodoSource.OAPI) {
            i2 = R.string.Todo_Task_CantFollowExternalPlatform;
        } else if (!z) {
            i2 = R.string.Todo_Task_FailedToUnollowToast;
        } else {
            i2 = R.string.Todo_Task_FailedToFollowToast;
        }
        if (z || i != 10028) {
            str = null;
        } else {
            str = TodoErrorHelper.f141112a.mo194284b();
        }
        adVar.getToast().mo5926a(new Event<>(new TodoToastUnit(i2, 2, str)));
    }

    private final void deleteFollower(String str, boolean z) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        List<TodoFollower> list = adVar.getTodoBuilder().f48044z;
        List<TodoFollower> list2 = adVar.getTodoBuilder().f48044z;
        if (list2 != null) {
            Todo.C19637a todoBuilder = adVar.getTodoBuilder();
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!Intrinsics.areEqual(t.follower_id, str)) {
                    arrayList.add(t);
                }
            }
            todoBuilder.f48044z = arrayList;
        }
        updateFollower();
        if (!adVar.isCreateTodo()) {
            if (adVar.isFromDoc() || !z) {
                Job unused = C69553g.m266944a(C1143ag.m5356a(adVar), adVar.getDispatcher(), null, new C56777c(adVar, list, null, this, str, z), 2, null);
            } else {
                Job unused2 = C69553g.m266944a(C1143ag.m5356a(adVar), adVar.getDispatcher(), null, new C56778d(adVar, list, null, this, str, z), 2, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.m$g */
    public static final class C56781g extends Lambda implements Function3<Integer, Integer, Intent, Unit> {
        final /* synthetic */ FollowerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56781g(FollowerViewModel mVar) {
            super(3);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Integer num, Integer num2, Intent intent) {
            invoke(num.intValue(), num2.intValue(), intent);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, Intent intent) {
            if (i == 3 && i2 == -1 && intent != null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("add_assignee_chosen_data");
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = new ArrayList<>();
                }
                if (!stringArrayListExtra.isEmpty()) {
                    if (((TodoDetailModel) this.this$0.getModelStore()).isCreateTodo()) {
                        TodoHitPoint.m221753f("create", ((TodoDetailModel) this.this$0.getModelStore()).getGuid());
                    } else {
                        TodoHitPoint.m221753f("edit", ((TodoDetailModel) this.this$0.getModelStore()).getGuid());
                    }
                    FollowerViewModel mVar = this.this$0;
                    ArrayList<String> arrayList = stringArrayListExtra;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getId());
                    }
                    mVar.addFollowers(arrayList2);
                }
            }
        }
    }

    static /* synthetic */ void followToastError$default(FollowerViewModel mVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        mVar.followToastError(z, i);
    }
}
