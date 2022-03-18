package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.mainview.helper.TodoDisplayHelper;
import com.ss.android.lark.todo.impl.features.mainview2.entity.CheckBoxActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.DeleteActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper.ListComparatorHelper;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import com.ss.android.lark.todo.impl.framework.busevents.AddTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.perf.TodoSlardarPerfHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.C69097g;
import kotlin.Metadata;
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
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u001d\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nH\u0002J\u0019\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\n\u0010'\u001a\u00060\u0018j\u0002`\u0019H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nH\u0002J%\u0010)\u001a\u00020\u000e\"\u0004\b\u0000\u0010**\b\u0012\u0004\u0012\u0002H*0+2\u0006\u0010,\u001a\u0002H*H\u0016¢\u0006\u0002\u0010-R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/FullDataListViewModel;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "isFetchColdLaunchData", "", "getCreateTimeSortList", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "todos", "getDueTimeSortList", "handleAction", "", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "initViewData", "loadAllTodoDatas", "loadAllTodoDatasByFilter", "currentFilter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAddTodoEvent", "addTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/AddTodoEvent;", "perfHitPointEnd", "todoList", "refreshListWithAddedTodo", "addedTodo", "refreshTodosWithAddedTodo", "(Lcom/bytedance/lark/pb/todo/v1/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortStoreTodoData", "sortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "filterType", "updateTodoFilterByAddTodo", "postCompareFilter", "T", "Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "dataResult", "(Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;Ljava/lang/Object;)V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FullDataListViewModel extends TodoListViewModel {
    public static final Companion Companion = new Companion(null);
    public boolean isFetchColdLaunchData = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/FullDataListViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void loadAllTodoDatas() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57050g(this, null), 3, null);
    }

    @Override // com.larksuite.framework.section.ViewModelSection, com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
    public void initViewData() {
        super.initViewData();
        getModel().mo193593j().mo5925a(new C57045b(this));
        getModel().mo193549G().mo5925a(new C57046c(this));
        getModel().mo193599p().mo5925a(new C57047d(this));
        getModel().mo193546D().mo5925a(new C57048e(this));
        getModel().mo193555M().mo5925a(new C57049f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$c */
    static final class C57046c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FullDataListViewModel f140708a;

        C57046c(FullDataListViewModel fullDataListViewModel) {
            this.f140708a = fullDataListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140708a.loadAllTodoDatas();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullDataListViewModel(IViewModelAbility<TodoMainModel2> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014 \u0005*\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$b */
    static final class C57045b<T> implements AbstractC1178x<TodoListView.Type> {

        /* renamed from: a */
        final /* synthetic */ FullDataListViewModel f140707a;

        C57045b(FullDataListViewModel fullDataListViewModel) {
            this.f140707a = fullDataListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(TodoListView.Type type) {
            FullDataListViewModel fullDataListViewModel = this.f140707a;
            Intrinsics.checkExpressionValueIsNotNull(type, "filterType");
            if (fullDataListViewModel.isFullDataType(type)) {
                this.f140707a.loadAllTodoDatas();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TodoListResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$e */
    static final class C57048e<T> implements AbstractC1178x<DataResult<? extends TodoListResult>> {

        /* renamed from: a */
        final /* synthetic */ FullDataListViewModel f140710a;

        C57048e(FullDataListViewModel fullDataListViewModel) {
            this.f140710a = fullDataListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(DataResult<TodoListResult> aVar) {
            FullDataListViewModel fullDataListViewModel = this.f140710a;
            if (fullDataListViewModel.isFullDataType(fullDataListViewModel.getModel().ae())) {
                FullDataListViewModel fullDataListViewModel2 = this.f140710a;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
                fullDataListViewModel2.refreshListAndHandleBadge(aVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$f */
    static final class C57049f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FullDataListViewModel f140711a;

        C57049f(FullDataListViewModel fullDataListViewModel) {
            this.f140711a = fullDataListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            FullDataListViewModel fullDataListViewModel = this.f140711a;
            if (fullDataListViewModel.isFullDataType(fullDataListViewModel.getModel().ae())) {
                this.f140711a.refreshTodoDisplayDatas();
            }
        }
    }

    public final List<Todo> getCreateTimeSortList(List<Todo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        arrayList.addAll(list);
        ArrayList arrayList2 = arrayList;
        Collections.sort(arrayList2, ListComparatorHelper.f140757a.mo193761c());
        return arrayList2;
    }

    public final void perfHitPointEnd(List<Todo> list) {
        boolean z;
        if (this.isFetchColdLaunchData) {
            TodoSlardarPerfHitPoint aVar = TodoSlardarPerfHitPoint.f141078a;
            List<Todo> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo194235b(z);
            this.isFetchColdLaunchData = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$d */
    static final class C57047d<T> implements AbstractC1178x<TodoSortType> {

        /* renamed from: a */
        final /* synthetic */ FullDataListViewModel f140709a;

        C57047d(FullDataListViewModel fullDataListViewModel) {
            this.f140709a = fullDataListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(TodoSortType todoSortType) {
            FullDataListViewModel fullDataListViewModel = this.f140709a;
            if (fullDataListViewModel.isFullDataType(fullDataListViewModel.getModel().ae())) {
                FullDataListViewModel fullDataListViewModel2 = this.f140709a;
                Intrinsics.checkExpressionValueIsNotNull(todoSortType, "it");
                fullDataListViewModel2.sortStoreTodoData(todoSortType, this.f140709a.getModel().ae());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$loadAllTodoDatas$1", mo239173f = "FullDataListViewModel.kt", mo239174i = {0}, mo239175l = {134}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$g */
    public static final class C57050g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FullDataListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57050g(FullDataListViewModel fullDataListViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fullDataListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57050g gVar = new C57050g(this.this$0, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57050g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                FullDataListViewModel fullDataListViewModel = this.this$0;
                TodoListView.Type ae = fullDataListViewModel.getModel().ae();
                this.L$0 = ahVar;
                this.label = 1;
                if (fullDataListViewModel.loadAllTodoDatasByFilter(ae, this) == a) {
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
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$refreshListWithAddedTodo$1", mo239173f = "FullDataListViewModel.kt", mo239174i = {0}, mo239175l = {209}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$i */
    public static final class C57052i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Todo $addedTodo;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FullDataListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57052i(FullDataListViewModel fullDataListViewModel, Todo todo, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fullDataListViewModel;
            this.$addedTodo = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57052i iVar = new C57052i(this.this$0, this.$addedTodo, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57052i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                FullDataListViewModel fullDataListViewModel = this.this$0;
                Todo todo = this.$addedTodo;
                this.L$0 = ahVar;
                this.label = 1;
                if (fullDataListViewModel.refreshTodosWithAddedTodo(todo, this) == a) {
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

    private final void refreshListWithAddedTodo(Todo todo) {
        updateTodoFilterByAddTodo(todo);
        setAddedScene(true);
        String str = todo.guid;
        Intrinsics.checkExpressionValueIsNotNull(str, "addedTodo.guid");
        setAddedTodoGuid(str);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57052i(this, todo, null), 3, null);
    }

    @Subscribe
    public final void onAddTodoEvent(AddTodoEvent aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "addTodoEvent");
        if (isFullDataType(getModel().ae())) {
            getModel().mo193607x().mo5926a((Boolean) true);
            refreshListWithAddedTodo(aVar.mo194120a());
        }
    }

    public final List<Todo> getDueTimeSortList(List<Todo> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
            for (T t : list) {
                Long l = t.due_time;
                if (l != null && l.longValue() == 0) {
                    arrayList2.add(t);
                } else {
                    arrayList3.add(t);
                }
            }
        }
        Collections.sort(arrayList3, ListComparatorHelper.f140757a.mo193760b());
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$loadAllTodoDatasByFilter$2", mo239173f = "FullDataListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {148}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$h */
    public static final class C57051h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoListView.Type $currentFilter;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FullDataListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57051h(FullDataListViewModel fullDataListViewModel, TodoListView.Type type, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fullDataListViewModel;
            this.$currentFilter = type;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57051h hVar = new C57051h(this.this$0, this.$currentFilter, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57051h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Integer a;
            Object a2 = C69086a.m265828a();
            int i = this.label;
            int i2 = 0;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194134b();
                str = String.valueOf(new Date().getTime());
                Log.m165389i("FullDataListViewModel", LogMessageUtil.f139260a.mo191770b(str, "loadAllTodoDatasByFilter", "currentFilter", this.$currentFilter.name()));
                if (this.this$0.isFetchColdLaunchData) {
                    TodoSlardarPerfHitPoint.f141078a.mo194239f();
                }
                TodoListSDKService eVar = TodoListSDKService.f141114a;
                TodoListView.Type type = this.$currentFilter;
                this.L$0 = ahVar;
                this.L$1 = str;
                this.L$2 = "loadAllTodoDatasByFilter";
                this.label = 1;
                obj = eVar.mo194287a(type, this);
                if (obj == a2) {
                    return a2;
                }
                str2 = "loadAllTodoDatasByFilter";
            } else if (i == 1) {
                str2 = (String) this.L$2;
                str = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<Todo> list = (List) obj;
            this.this$0.perfHitPointEnd(list);
            if (list != null) {
                Log.m165389i("FullDataListViewModel", LogMessageUtil.f139260a.mo191768a(str, str2, "todo_size", String.valueOf(list.size())));
                if (this.this$0.getModel().af() == TodoSortType.CREATE_TIME) {
                    FullDataListViewModel fullDataListViewModel = this.this$0;
                    fullDataListViewModel.postCompareFilter(fullDataListViewModel.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.getCreateTimeSortList(list), this.$currentFilter)));
                } else {
                    FullDataListViewModel fullDataListViewModel2 = this.this$0;
                    fullDataListViewModel2.postCompareFilter(fullDataListViewModel2.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.getDueTimeSortList(list), this.$currentFilter)));
                }
            }
            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
            TodoListView.Type type2 = this.$currentFilter;
            if (!(list == null || (a = C69089a.m265839a(list.size())) == null)) {
                i2 = a.intValue();
            }
            aVar.mo194130a(type2, i2);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$refreshTodosWithAddedTodo$2", mo239173f = "FullDataListViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel$j */
    public static final class C57053j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Todo $addedTodo;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ FullDataListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57053j(FullDataListViewModel fullDataListViewModel, Todo todo, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fullDataListViewModel;
            this.$addedTodo = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57053j jVar = new C57053j(this.this$0, this.$addedTodo, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57053j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                DataResult<TodoListResult> b = this.this$0.getModel().mo193546D().mo5927b();
                if (b instanceof DataResult.DataSuccess) {
                    DataResult.DataSuccess cVar = (DataResult.DataSuccess) b;
                    List<Todo> a = ((TodoListResult) cVar.mo194115a()).mo193517a();
                    if (a == null) {
                        return Unit.INSTANCE;
                    }
                    List<Todo> list = a;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().guid);
                    }
                    if (arrayList.contains(this.$addedTodo.guid)) {
                        return Unit.INSTANCE;
                    }
                    if (a instanceof ArrayList) {
                        ((ArrayList) a).add(this.$addedTodo);
                    }
                    if (this.this$0.getModel().af() == TodoSortType.CREATE_TIME) {
                        FullDataListViewModel fullDataListViewModel = this.this$0;
                        fullDataListViewModel.postCompareFilter(fullDataListViewModel.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.getCreateTimeSortList(a), ((TodoListResult) cVar.mo194115a()).mo193518b())));
                    } else {
                        FullDataListViewModel fullDataListViewModel2 = this.this$0;
                        fullDataListViewModel2.postCompareFilter(fullDataListViewModel2.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.getDueTimeSortList(a), ((TodoListResult) cVar.mo194115a()).mo193518b())));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void updateTodoFilterByAddTodo(Todo todo) {
        TimeZone timeZone;
        if (isFullDataType(getModel().ae())) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            Boolean bool = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "addedTodo.is_all_day");
            if (bool.booleanValue()) {
                timeZone = TimeZone.getTimeZone("UTC");
            } else {
                timeZone = TimeZone.getDefault();
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setTimeInMillis(todo.due_time.longValue() * ((long) 1000));
            Long l = todo.due_time;
            if (l == null || l.longValue() != 0) {
                TodoDisplayHelper aVar = TodoDisplayHelper.f140267a;
                Boolean bool2 = todo.is_all_day;
                Intrinsics.checkExpressionValueIsNotNull(bool2, "addedTodo.is_all_day");
                if (aVar.mo193136a(bool2.booleanValue(), gregorianCalendar2, gregorianCalendar)) {
                    changeTitleState(TodoItemViewData.TitleType.OVER_DUE, true);
                    return;
                }
            }
            if (TodoDisplayHelper.f140267a.mo193135a(gregorianCalendar2, gregorianCalendar)) {
                changeTitleState(TodoItemViewData.TitleType.TODAY, true);
            } else if (TodoDisplayHelper.f140267a.mo193137b(gregorianCalendar2, gregorianCalendar)) {
                changeTitleState(TodoItemViewData.TitleType.IN_WEEK, true);
            } else {
                changeTitleState(TodoItemViewData.TitleType.OTHER, true);
            }
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionData");
        if (i == 1001 && isFullDataType(getModel().ae())) {
            clickEnterDetail(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object loadAllTodoDatasByFilter(TodoListView.Type type, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57051h(this, type, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object refreshTodosWithAddedTodo(Todo todo, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57053j(this, todo, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
    public <T> void postCompareFilter(MutableLiveDataPlus<T> eVar, T t) {
        Intrinsics.checkParameterIsNotNull(eVar, "$this$postCompareFilter");
        if (!(t instanceof DataResult.DataSuccess)) {
            eVar.mo5926a((Object) t);
            return;
        }
        Object a = t.mo194115a();
        if (a != null && (a instanceof TodoListResult) && ((TodoListResult) a).mo193518b() == getModel().ae()) {
            eVar.mo5926a((Object) t);
        }
    }

    public final void sortStoreTodoData(TodoSortType todoSortType, TodoListView.Type type) {
        List<Todo> list = null;
        DataResult<TodoListResult> b = getModel().mo193546D().mo5927b();
        if (b instanceof DataResult.DataSuccess) {
            DataResult.DataSuccess cVar = (DataResult.DataSuccess) b;
            if (((TodoListResult) cVar.mo194115a()).mo193518b() == type) {
                list = ((TodoListResult) cVar.mo194115a()).mo193517a();
            } else {
                return;
            }
        }
        if (list == null) {
            loadAllTodoDatas();
        } else if (todoSortType == TodoSortType.CREATE_TIME) {
            postCompareFilter(getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(getCreateTimeSortList(list), type)));
        } else {
            postCompareFilter(getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(getDueTimeSortList(list), type)));
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection, com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
    public void handleAction(int i, IActionData bVar) {
        CheckBoxActionData aVar;
        CustomComplete.Action e;
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i != 1002) {
            if (i != 1004) {
                if (i == 1007 && (bVar instanceof CheckBoxActionData) && isFullDataType(getModel().ae()) && (e = (aVar = (CheckBoxActionData) bVar).mo193487e()) != null && !isCustomCompleteStrategy(e)) {
                    setCompleted(aVar.mo193483a(), aVar.mo193484b(), aVar.mo193485c(), aVar.mo193486d());
                }
            } else if ((bVar instanceof DeleteActionData) && isFullDataType(getModel().ae())) {
                DeleteActionData dVar = (DeleteActionData) bVar;
                updateTodoByDeleteStatus(dVar.mo193501a(), dVar.mo193502b(), dVar.mo193503c());
            }
        } else if ((bVar instanceof CheckBoxActionData) && isFullDataType(getModel().ae())) {
            CheckBoxActionData aVar2 = (CheckBoxActionData) bVar;
            setCompleted(aVar2.mo193483a(), aVar2.mo193484b(), aVar2.mo193485c(), aVar2.mo193486d());
        }
    }
}
