package com.ss.android.lark.todo.impl.features.mainview2.widget.filter;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.ClickFilterActionData;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper.TodoMainFragmentLogHelper;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0016\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002R2\u0010\u0006\u001a&\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0007j\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "filterNumMap", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "model", "todoViewsChangeNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "handleAction", "", "action", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "handleFilterType", "Lcom/ss/android/lark/todo/impl/features/mainview2/entity/ClickFilterActionData;", "initFilterType", "initViewData", "loadAllTodoViews", "onCleared", "registerTodoViewsChangeNotificationPush", "unRegisterTodoViewsChangeNotificationPush", "updateFilterNumByPushData", "viewLists", "", "Lcom/bytedance/lark/pb/todo/v1/TodoListView;", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.a */
public final class FilterHeaderViewModel extends ViewModelSection<TodoMainModel2> {
    public static final Companion Companion = new Companion(null);
    private final HashMap<TodoListView.Type, Integer> filterNumMap = new HashMap<>();
    public final TodoMainModel2 model = ((TodoMainModel2) getModelStore());
    private TodoPushHandleCallBack todoViewsChangeNotification;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        unRegisterTodoViewsChangeNotificationPush();
    }

    private final void initFilterType() {
        this.model.mo193570a(TodoListView.Type.ALL, false);
    }

    private final void unRegisterTodoViewsChangeNotificationPush() {
        if (this.todoViewsChangeNotification != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION, this.todoViewsChangeNotification);
        }
    }

    private final void registerTodoViewsChangeNotificationPush() {
        this.todoViewsChangeNotification = new C57018d(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION, this.todoViewsChangeNotification);
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        this.model.ad().mo5925a(new C57016b(this));
    }

    public final void loadAllTodoViews() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57017c(this, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewModel$registerTodoViewsChangeNotificationPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.a$d */
    public static final class C57018d implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ FilterHeaderViewModel f140692a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57018d(FilterHeaderViewModel aVar) {
            this.f140692a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("FilterHeaderViewModel", LogMessageUtil.f139260a.mo191769b("pushTodoViewsChangeNotification"));
            Object obj = jSONObject.get("todo_views_change_notification");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…                ?: return");
                if (obj instanceof List) {
                    this.f140692a.updateFilterNumByPushData((List) obj);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.a$b */
    static final class C57016b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FilterHeaderViewModel f140691a;

        C57016b(FilterHeaderViewModel aVar) {
            this.f140691a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140691a.loadAllTodoViews();
            this.f140691a.handleFilterType(new ClickFilterActionData(TodoListView.Type.ALL, false));
            TodoHitPoint.m221730a("ongoing");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterHeaderViewModel(IViewModelAbility<TodoMainModel2> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
        registerTodoViewsChangeNotificationPush();
        loadAllTodoViews();
        initFilterType();
        TodoHitPoint.m221730a("ongoing");
    }

    public final void handleFilterType(ClickFilterActionData bVar) {
        this.model.mo193607x().mo5929b((Boolean) true);
        if (bVar.mo193492b()) {
            this.model.mo193554L().mo5926a(bVar.mo193491a());
        }
        TodoMainModel2.m221096a(this.model, bVar.mo193491a(), false, 2, null);
        this.model.ah();
    }

    public final void updateFilterNumByPushData(List<TodoListView> list) {
        for (T t : list) {
            TodoListView.Type type = t.type;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            Integer num = t.child_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.child_count");
            this.filterNumMap.put(type, num);
        }
        this.model.mo193595l().mo5926a(this.filterNumMap);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.filter.FilterHeaderViewModel$loadAllTodoViews$1", mo239173f = "FilterHeaderViewModel.kt", mo239174i = {0}, mo239175l = {MmListControl.f116813f}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.a$c */
    public static final class C57017c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FilterHeaderViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57017c(FilterHeaderViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57017c cVar2 = new C57017c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57017c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoListSDKService eVar = TodoListSDKService.f141114a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = eVar.mo194289a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TodoListData bVar = (TodoListData) obj;
            if (bVar == null) {
                return Unit.INSTANCE;
            }
            List<TodoListView> a2 = bVar.mo193206a();
            if (a2 != null) {
                this.this$0.updateFilterNumByPushData(a2);
            }
            List<TodoListViewSetting> b = bVar.mo193207b();
            if (b != null) {
                this.this$0.model.mo193573a(b);
            }
            if (!(this.this$0.model.ae() == TodoListView.Type.COMPLETED || this.this$0.model.ae() == TodoListView.Type.FROM_DOC)) {
                this.this$0.model.mo193599p().mo5926a(this.this$0.model.af());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i == 100 && (bVar instanceof ClickFilterActionData)) {
            handleFilterType((ClickFilterActionData) bVar);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, Object obj) {
        if (i == 6) {
            TodoMainFragmentLogHelper.f140769a.mo193772a(this.model.ae(), this.filterNumMap, "todo_tab");
        }
    }
}
