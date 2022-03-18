package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.GetPagingTodosRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoPagingUnit;
import com.ss.android.lark.todo.impl.features.mainview2.entity.CheckBoxActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.DeleteActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper.ListComparatorHelper;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TypeCastException;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002JG\u0010\u001f\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0!2\n\u0010$\u001a\u00060%j\u0002`&H@ø\u0001\u0000¢\u0006\u0002\u0010'J%\u0010(\u001a\u00020\r\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0*2\u0006\u0010+\u001a\u0002H)H\u0016¢\u0006\u0002\u0010,R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/CompletedListViewModel;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "pagingDataSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "pagingTodoDataList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "getCompletedFirstPageData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompletedNextPageData", "getCompletedPagingItems", "isFetchFirstPage", "", "handleAction", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "initViewData", "isInListTimeRange", "completedMilliTime", "", "mergeAndSortList", "todoList", "sortPagingList", "updatePagingData", "addedTodoIds", "", "updatedTodoIds", "deletedTodoIds", "currentFilter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCompareFilter", "T", "Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "dataResult", "(Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;Ljava/lang/Object;)V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a */
public final class CompletedListViewModel extends TodoListViewModel {
    public static final Companion Companion = new Companion(null);
    public final CopyOnWriteArraySet<String> pagingDataSet = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArrayList<Todo> pagingTodoDataList = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/CompletedListViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void sortPagingList() {
        Object[] array = this.pagingTodoDataList.toArray(new Todo[0]);
        if (array != null) {
            Todo[] todoArr = (Todo[]) array;
            List listOf = CollectionsKt.listOf((Object[]) ((Todo[]) Arrays.copyOf(todoArr, todoArr.length)));
            Collections.sort(listOf, ListComparatorHelper.f140757a.mo193758a());
            this.pagingTodoDataList.clear();
            this.pagingTodoDataList.addAll(listOf);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.larksuite.framework.section.ViewModelSection, com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
    public void initViewData() {
        super.initViewData();
        getModel().mo193593j().mo5925a(new C57058e(this));
        getModel().mo193550H().mo5925a(new C57059f(this));
        getModel().mo193553K().mo5925a(new C57061g(this));
        getModel().mo193546D().mo5925a(new C57062h(this));
        getModel().mo193555M().mo5925a(new C57063i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014 \u0005*\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$e */
    static final class C57058e<T> implements AbstractC1178x<TodoListView.Type> {

        /* renamed from: a */
        final /* synthetic */ CompletedListViewModel f140714a;

        C57058e(CompletedListViewModel aVar) {
            this.f140714a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(TodoListView.Type type) {
            if (type == TodoListView.Type.COMPLETED) {
                this.f140714a.getCompletedPagingItems(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isFetchFirstPage", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$g */
    static final class C57061g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CompletedListViewModel f140716a;

        C57061g(CompletedListViewModel aVar) {
            this.f140716a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            CompletedListViewModel aVar = this.f140716a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "isFetchFirstPage");
            aVar.getCompletedPagingItems(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "collection", "Lcom/bytedance/lark/pb/todo/v1/ChangedTodoCollection;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$f */
    public static final class C57059f<T> implements AbstractC1178x<ChangedTodoCollection> {

        /* renamed from: a */
        final /* synthetic */ CompletedListViewModel f140715a;

        C57059f(CompletedListViewModel aVar) {
            this.f140715a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(final ChangedTodoCollection changedTodoCollection) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this.f140715a), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel.C57059f.C570601 */
                Object L$0;
                int label;
                private CoroutineScope p$;
                final /* synthetic */ C57059f this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                    C570601 r0 = 

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TodoListResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$h */
                    static final class C57062h<T> implements AbstractC1178x<DataResult<? extends TodoListResult>> {

                        /* renamed from: a */
                        final /* synthetic */ CompletedListViewModel f140717a;

                        C57062h(CompletedListViewModel aVar) {
                            this.f140717a = aVar;
                        }

                        /* renamed from: a */
                        public final void onChanged(DataResult<TodoListResult> aVar) {
                            if (this.f140717a.getModel().ae() == TodoListView.Type.COMPLETED) {
                                CompletedListViewModel aVar2 = this.f140717a;
                                Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
                                aVar2.refreshListAndHandleBadge(aVar);
                            }
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$i */
                    static final class C57063i<T> implements AbstractC1178x<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ CompletedListViewModel f140718a;

                        C57063i(CompletedListViewModel aVar) {
                            this.f140718a = aVar;
                        }

                        /* renamed from: a */
                        public final void onChanged(Boolean bool) {
                            if (this.f140718a.getModel().ae() == TodoListView.Type.COMPLETED) {
                                this.f140718a.refreshTodoDisplayDatas();
                            }
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public CompletedListViewModel(IViewModelAbility<TodoMainModel2> gVar) {
                        super(gVar);
                        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object getCompletedFirstPageData(Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57055b(this, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object getCompletedNextPageData(Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57056c(this, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    public final void getCompletedPagingItems(boolean z) {
                        if (getModel().ae() == TodoListView.Type.COMPLETED && z) {
                            getModel().mo193561S().mo5929b(TodoFetchStatus.LOADING);
                        }
                        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57057d(this, z, null), 3, null);
                    }

                    public final boolean isInListTimeRange(long j) {
                        if (CollectionUtils.isEmpty(this.pagingTodoDataList)) {
                            return false;
                        }
                        MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
                        CopyOnWriteArrayList<Todo> copyOnWriteArrayList = this.pagingTodoDataList;
                        if (j >= multiCompleteHelper.mo191979a(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1))) {
                            return true;
                        }
                        return false;
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel$getCompletedPagingItems$1", mo239173f = "CompletedListViewModel.kt", mo239174i = {0, 1}, mo239175l = {87, CameraPosition.TILT_90}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$d */
                    public static final class C57057d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $isFetchFirstPage;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ CompletedListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57057d(CompletedListViewModel aVar, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = aVar;
                            this.$isFetchFirstPage = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57057d dVar = new C57057d(this.this$0, this.$isFetchFirstPage, cVar);
                            dVar.p$ = (CoroutineScope) obj;
                            return dVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57057d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                if (this.$isFetchFirstPage) {
                                    CompletedListViewModel aVar = this.this$0;
                                    this.L$0 = ahVar;
                                    this.label = 1;
                                    if (aVar.getCompletedFirstPageData(this) == a) {
                                        return a;
                                    }
                                } else {
                                    CompletedListViewModel aVar2 = this.this$0;
                                    this.L$0 = ahVar;
                                    this.label = 2;
                                    if (aVar2.getCompletedNextPageData(this) == a) {
                                        return a;
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else if (i == 1) {
                                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                C69097g.m265891a(obj);
                            } else if (i == 2) {
                                CoroutineScope ahVar3 = (CoroutineScope) this.L$0;
                                C69097g.m265891a(obj);
                                return Unit.INSTANCE;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    public final void mergeAndSortList(CopyOnWriteArrayList<Todo> copyOnWriteArrayList) {
                        int size = copyOnWriteArrayList.size();
                        for (int i = 0; i < size; i++) {
                            Todo todo = copyOnWriteArrayList.get(i);
                            if (!this.pagingDataSet.contains(todo.guid)) {
                                this.pagingDataSet.add(todo.guid);
                                this.pagingTodoDataList.add(todo);
                            } else {
                                try {
                                    int size2 = this.pagingTodoDataList.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (Intrinsics.areEqual(this.pagingTodoDataList.get(i2).guid, todo.guid)) {
                                            this.pagingTodoDataList.set(i2, todo);
                                        }
                                    }
                                } catch (Throwable th) {
                                    Log.m165383e("CompletedListViewModel", th.getMessage());
                                }
                            }
                        }
                        sortPagingList();
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel$getCompletedFirstPageData$2", mo239173f = "CompletedListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {SmActions.ACTION_ONTHECALL_EXIT}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$b */
                    public static final class C57055b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ CompletedListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57055b(CompletedListViewModel aVar, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = aVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57055b bVar = new C57055b(this.this$0, cVar);
                            bVar.p$ = (CoroutineScope) obj;
                            return bVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57055b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            String str;
                            String str2;
                            Object obj2;
                            Integer num;
                            Integer a;
                            Object a2 = C69086a.m265828a();
                            int i = this.label;
                            int i2 = 0;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                TodoAppreciableHitPoint.f141058a.mo194134b();
                                String valueOf = String.valueOf(new Date().getTime());
                                str = "getFirstPageData";
                                Log.m165389i("CompletedListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, str, new String[0]));
                                TodoListSDKService eVar = TodoListSDKService.f141114a;
                                GetPagingTodosRequest.ReqType reqType = GetPagingTodosRequest.ReqType.COMPLETED_TODO;
                                Long a3 = C69089a.m265840a(Long.MAX_VALUE);
                                this.L$0 = ahVar;
                                this.L$1 = valueOf;
                                this.L$2 = str;
                                this.label = 1;
                                obj2 = eVar.mo194286a(reqType, a3, false, 50, true, null, this);
                                if (obj2 == a2) {
                                    return a2;
                                }
                                str2 = valueOf;
                            } else if (i == 1) {
                                str2 = (String) this.L$1;
                                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                C69097g.m265891a(obj);
                                str = (String) this.L$2;
                                obj2 = obj;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            TodoPagingUnit eVar2 = (TodoPagingUnit) obj2;
                            if (eVar2 == null) {
                                Log.m165383e("CompletedListViewModel", LogMessageUtil.f139260a.mo191767a(str2, str, "getFirstPageData result is empty!"));
                                CompletedListViewModel aVar = this.this$0;
                                aVar.postCompareFilter(aVar.getModel().mo193546D(), new DataResult.DataError(new Exception("fetch first page error")));
                                return Unit.INSTANCE;
                            }
                            this.this$0.pagingDataSet.clear();
                            this.this$0.pagingTodoDataList.clear();
                            LogMessageUtil cVar = LogMessageUtil.f139260a;
                            String[] strArr = new String[2];
                            strArr[0] = "todo_size";
                            CopyOnWriteArrayList<Todo> a4 = eVar2.mo193219a();
                            if (a4 != null) {
                                num = C69089a.m265839a(a4.size());
                            } else {
                                num = null;
                            }
                            strArr[1] = String.valueOf(num);
                            Log.m165389i("CompletedListViewModel", cVar.mo191768a(str2, str, strArr));
                            CopyOnWriteArrayList<Todo> a5 = eVar2.mo193219a();
                            if (a5 != null) {
                                this.this$0.mergeAndSortList(a5);
                            }
                            CompletedListViewModel aVar2 = this.this$0;
                            aVar2.postCompareFilter(aVar2.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingTodoDataList, TodoListView.Type.COMPLETED)));
                            this.this$0.getModel().mo193603t().mo5926a(C69089a.m265837a(eVar2.mo193220b()));
                            TodoAppreciableHitPoint aVar3 = TodoAppreciableHitPoint.f141058a;
                            TodoListView.Type type = TodoListView.Type.COMPLETED;
                            CopyOnWriteArrayList<Todo> a6 = eVar2.mo193219a();
                            if (!(a6 == null || (a = C69089a.m265839a(a6.size())) == null)) {
                                i2 = a.intValue();
                            }
                            aVar3.mo194130a(type, i2);
                            return Unit.INSTANCE;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel$getCompletedNextPageData$2", mo239173f = "CompletedListViewModel.kt", mo239174i = {0, 1, 1, 1}, mo239175l = {150, 161}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$0", "L$1", "L$2"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$c */
                    public static final class C57056c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ CompletedListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57056c(CompletedListViewModel aVar, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = aVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57056c cVar2 = new C57056c(this.this$0, cVar);
                            cVar2.p$ = (CoroutineScope) obj;
                            return cVar2;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57056c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d2  */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x00f9  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                            /*
                            // Method dump skipped, instructions count: 372
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel.C57056c.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel$updatePagingData$2", mo239173f = "CompletedListViewModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {234}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "mergedList", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a$j */
                    public static final class C57064j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ List $addedTodoIds;
                        final /* synthetic */ TodoListView.Type $currentFilter;
                        final /* synthetic */ List $deletedTodoIds;
                        final /* synthetic */ List $updatedTodoIds;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ CompletedListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57064j(CompletedListViewModel aVar, List list, List list2, List list3, TodoListView.Type type, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = aVar;
                            this.$addedTodoIds = list;
                            this.$updatedTodoIds = list2;
                            this.$deletedTodoIds = list3;
                            this.$currentFilter = type;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57064j jVar = new C57064j(this.this$0, this.$addedTodoIds, this.$updatedTodoIds, this.$deletedTodoIds, this.$currentFilter, cVar);
                            jVar.p$ = (CoroutineScope) obj;
                            return jVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57064j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            ArrayList<String> arrayList;
                            String str;
                            String str2;
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                for (String str3 : this.$addedTodoIds) {
                                    if (this.this$0.pagingDataSet.contains(str3)) {
                                        this.this$0.pagingDataSet.remove(str3);
                                        int size = this.this$0.pagingTodoDataList.size();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= size) {
                                                break;
                                            } else if (Intrinsics.areEqual(this.this$0.pagingTodoDataList.get(i2).guid, str3)) {
                                                this.this$0.pagingTodoDataList.remove(i2);
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                arrayList = new ArrayList<>();
                                for (String str4 : this.$updatedTodoIds) {
                                    arrayList.add(str4);
                                }
                                for (String str5 : this.$deletedTodoIds) {
                                    arrayList.add(str5);
                                }
                                str = String.valueOf(new Date().getTime());
                                Log.m165389i("CompletedListViewModel", LogMessageUtil.f139260a.mo191770b(str, "getTodosByGuidAndFilter", "mergedList", String.valueOf(arrayList.size())));
                                TodoListSDKService eVar = TodoListSDKService.f141114a;
                                TodoListView.Type type = TodoListView.Type.COMPLETED;
                                this.L$0 = ahVar;
                                this.L$1 = arrayList;
                                this.L$2 = str;
                                this.L$3 = "getTodosByGuidAndFilter";
                                this.label = 1;
                                obj = eVar.mo194288a(arrayList, type, this);
                                if (obj == a) {
                                    return a;
                                }
                                str2 = "getTodosByGuidAndFilter";
                            } else if (i == 1) {
                                str2 = (String) this.L$3;
                                str = (String) this.L$2;
                                arrayList = (ArrayList) this.L$1;
                                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                C69097g.m265891a(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List list = (List) obj;
                            if (list == null) {
                                Log.m165383e("CompletedListViewModel", LogMessageUtil.f139260a.mo191767a(str, str2, "getTodosByGuidAndFilter result is empty"));
                                CompletedListViewModel aVar = this.this$0;
                                aVar.postCompareFilter(aVar.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingTodoDataList, TodoListView.Type.COMPLETED)));
                                return Unit.INSTANCE;
                            }
                            Log.m165389i("CompletedListViewModel", LogMessageUtil.f139260a.mo191768a(str, str2, "merged_size", String.valueOf(list.size())));
                            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                            for (String str6 : arrayList) {
                                int size2 = list.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < size2) {
                                        if (Intrinsics.areEqual(((Todo) list.get(i3)).guid, str6)) {
                                            Boolean b = this.this$0.getModel().mo193603t().mo5927b();
                                            if (b == null) {
                                                b = C69089a.m265837a(true);
                                            }
                                            Intrinsics.checkExpressionValueIsNotNull(b, "model.hasMoreData.value ?: true");
                                            if (!b.booleanValue() || this.this$0.isInListTimeRange(MultiCompleteHelper.f139390a.mo191979a((Todo) list.get(i3)))) {
                                                copyOnWriteArrayList.add(list.get(i3));
                                            }
                                        } else {
                                            i3++;
                                        }
                                    } else if (this.this$0.pagingDataSet.contains(str6)) {
                                        this.this$0.pagingDataSet.remove(str6);
                                        int size3 = this.this$0.pagingTodoDataList.size();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= size3) {
                                                break;
                                            } else if (Intrinsics.areEqual(this.this$0.pagingTodoDataList.get(i4).guid, str6)) {
                                                this.this$0.pagingTodoDataList.remove(i4);
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                }
                            }
                            this.this$0.mergeAndSortList(copyOnWriteArrayList);
                            CompletedListViewModel aVar2 = this.this$0;
                            aVar2.postCompareFilter(aVar2.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingTodoDataList, this.$currentFilter)));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // com.larksuite.framework.section.ViewModelSection
                    public void handleAction(int i, String str) {
                        Intrinsics.checkParameterIsNotNull(str, "actionData");
                        if (i == 1001 && getModel().ae() == TodoListView.Type.COMPLETED) {
                            clickEnterDetail(str);
                        }
                    }

                    @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
                    public <T> void postCompareFilter(MutableLiveDataPlus<T> eVar, T t) {
                        Intrinsics.checkParameterIsNotNull(eVar, "$this$postCompareFilter");
                        if (!(t instanceof DataResult.DataSuccess)) {
                            eVar.mo5926a((Object) t);
                        } else if (getModel().ae() == TodoListView.Type.COMPLETED) {
                            eVar.mo5926a((Object) t);
                        }
                    }

                    @Override // com.larksuite.framework.section.ViewModelSection, com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
                    public void handleAction(int i, IActionData bVar) {
                        CheckBoxActionData aVar;
                        CustomComplete.Action e;
                        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
                        if (i != 1002) {
                            if (i != 1004) {
                                if (i == 1007 && (bVar instanceof CheckBoxActionData) && getModel().ae() == TodoListView.Type.COMPLETED && (e = (aVar = (CheckBoxActionData) bVar).mo193487e()) != null && !isCustomCompleteStrategy(e)) {
                                    setCompleted(aVar.mo193483a(), aVar.mo193484b(), aVar.mo193485c(), aVar.mo193486d());
                                }
                            } else if ((bVar instanceof DeleteActionData) && getModel().ae() == TodoListView.Type.COMPLETED) {
                                DeleteActionData dVar = (DeleteActionData) bVar;
                                updateTodoByDeleteStatus(dVar.mo193501a(), dVar.mo193502b(), dVar.mo193503c());
                            }
                        } else if ((bVar instanceof CheckBoxActionData) && getModel().ae() == TodoListView.Type.COMPLETED) {
                            CheckBoxActionData aVar2 = (CheckBoxActionData) bVar;
                            setCompleted(aVar2.mo193483a(), aVar2.mo193484b(), aVar2.mo193485c(), aVar2.mo193486d());
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object updatePagingData(List<String> list, List<String> list2, List<String> list3, TodoListView.Type type, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57064j(this, list, list2, list3, type, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }
                }
