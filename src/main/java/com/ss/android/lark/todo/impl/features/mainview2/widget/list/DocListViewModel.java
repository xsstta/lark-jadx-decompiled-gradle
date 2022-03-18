package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.bytedance.lark.pb.todo.v1.ListDocTodosRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.entity.LoadTitleType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoPagingUnit;
import com.ss.android.lark.todo.impl.features.mainview2.entity.CheckBoxActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.DeleteActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TitleActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import com.ss.android.lark.todo.impl.framework.busevents.CompleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoAssigneeEvent;
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.VibrateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 U2\u00020\u0001:\u0001UB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J#\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001b\u0010$\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!H@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0016H\u0002J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0016\u0010-\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0/H\u0002J\u0016\u00100\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0/H\u0002J\b\u00101\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0007J\u0010\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u000207H\u0007J\u0010\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020:H\u0007J!\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010>J!\u0010?\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\rH\u0002J\u0019\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\rH\u0002J\u0018\u0010H\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\r2\u0006\u0010I\u001a\u00020\u0016H\u0002J\u0019\u0010J\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010KJ!\u0010L\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u001b\u0010M\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!H@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0018\u0010N\u001a\u00020O2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u0016H\u0002J%\u0010P\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q*\b\u0012\u0004\u0012\u0002HQ0R2\u0006\u0010S\u001a\u0002HQH\u0016¢\u0006\u0002\u0010TR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/DocListViewModel;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "docsLoadTitleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/LoadTitleType;", "pageDocsDoingPosition", "", "pageDocsDonePosition", "pagingDocsDataList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "pagingDocsDataSet", "", "pagingDocsDoingDataList", "pagingDocsDoingDataSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "pagingDocsDoneDataList", "pagingDocsDoneDataSet", "showDonePage", "", "changeDocTitleState", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "isExpand", "changeDocsDoingTitleState", "changeDocsDoneTitleState", "clearDocsData", "getDocsDoingPageData", "sortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "isFetchFirstPage", "(Lcom/bytedance/lark/pb/todo/v1/TodoSortType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocsDonePageData", "(Lcom/bytedance/lark/pb/todo/v1/TodoSortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocsPagingItems", "handleAction", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "initViewData", "mergeDocsDoingList", "todoList", "", "mergeDocsDoneList", "mergeDocsList", "onCompleteTodoEvent", "completeTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/CompleteTodoEvent;", "onDeleteTodoAssigneeEvent", "deleteTodoAssigneeEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/DeleteTodoAssigneeEvent;", "onQuitTodoEvent", "quitTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/QuitTodoEvent;", "refreshDocsAssigneePage", "todoGuid", "assigneeId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDocsCompletePage", "isCompleted", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDocsDoingPageComplete", "todo", "refreshDocsDoneList", "showDone", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDocsDonePageComplete", "refreshDocsPageComplete", "isTargetCompleted", "refreshListWithDeleteTodoId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTodoDocsComplete", "savePageDocsDonePageData", "setDocsCompleted", "Lkotlinx/coroutines/Job;", "postCompareFilter", "T", "Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "dataResult", "(Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;Ljava/lang/Object;)V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DocListViewModel extends TodoListViewModel {
    public static final Companion Companion = new Companion(null);
    public LoadTitleType docsLoadTitleType = LoadTitleType.LOAD_NONE;
    public long pageDocsDoingPosition;
    public long pageDocsDonePosition;
    public final CopyOnWriteArrayList<Todo> pagingDocsDataList = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<String> pagingDocsDataSet = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<Todo> pagingDocsDoingDataList = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArraySet<String> pagingDocsDoingDataSet = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArrayList<Todo> pagingDocsDoneDataList = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArraySet<String> pagingDocsDoneDataSet = new CopyOnWriteArraySet<>();
    public boolean showDonePage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/DocListViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void mergeDocsList() {
        this.pagingDocsDataSet.clear();
        this.pagingDocsDataList.clear();
        this.pagingDocsDataSet.addAll(this.pagingDocsDoingDataSet);
        this.pagingDocsDataList.addAll(this.pagingDocsDoingDataList);
        this.pagingDocsDataSet.addAll(this.pagingDocsDoneDataSet);
        this.pagingDocsDataList.addAll(this.pagingDocsDoneDataList);
    }

    public final void clearDocsData() {
        this.pagingDocsDataSet.clear();
        this.pagingDocsDataList.clear();
        this.pagingDocsDoingDataSet.clear();
        this.pagingDocsDoingDataList.clear();
        this.pagingDocsDoneDataSet.clear();
        this.pagingDocsDoneDataList.clear();
        this.pageDocsDonePosition = 0;
        this.pageDocsDoingPosition = 0;
        getModel().mo193547E().mo5926a((Boolean) false);
        getModel().mo193548F().mo5926a((Boolean) false);
        this.docsLoadTitleType = LoadTitleType.LOAD_DOING;
    }

    @Override // com.larksuite.framework.section.ViewModelSection, com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
    public void initViewData() {
        super.initViewData();
        getModel().mo193593j().mo5925a(new C57026f(this));
        getModel().mo193551I().mo5925a(new C57027g(this));
        getModel().mo193552J().mo5925a(new C57029h(this));
        getModel().mo193546D().mo5925a(new C57030i(this));
        getModel().mo193555M().mo5925a(new C57031j(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014 \u0005*\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$f */
    static final class C57026f<T> implements AbstractC1178x<TodoListView.Type> {

        /* renamed from: a */
        final /* synthetic */ DocListViewModel f140699a;

        C57026f(DocListViewModel docListViewModel) {
            this.f140699a = docListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(TodoListView.Type type) {
            if (type == TodoListView.Type.FROM_DOC) {
                this.f140699a.getDocsPagingItems(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isFetchFirstPage", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$h */
    static final class C57029h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DocListViewModel f140701a;

        C57029h(DocListViewModel docListViewModel) {
            this.f140701a = docListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            DocListViewModel docListViewModel = this.f140701a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "isFetchFirstPage");
            docListViewModel.getDocsPagingItems(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "todoGuid", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$g */
    public static final class C57027g<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DocListViewModel f140700a;

        C57027g(DocListViewModel docListViewModel) {
            this.f140700a = docListViewModel;
        }

        /* renamed from: a */
        public final void onChanged(final String str) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this.f140700a), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel.C57027g.C570281 */
                Object L$0;
                int label;
                private CoroutineScope p$;
                final /* synthetic */ C57027g this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                    C570281 r0 = 

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TodoListResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$i */
                    static final class C57030i<T> implements AbstractC1178x<DataResult<? extends TodoListResult>> {

                        /* renamed from: a */
                        final /* synthetic */ DocListViewModel f140702a;

                        C57030i(DocListViewModel docListViewModel) {
                            this.f140702a = docListViewModel;
                        }

                        /* renamed from: a */
                        public final void onChanged(DataResult<TodoListResult> aVar) {
                            if (this.f140702a.getModel().ae() == TodoListView.Type.FROM_DOC) {
                                DocListViewModel docListViewModel = this.f140702a;
                                Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
                                docListViewModel.refreshListAndHandleBadge(aVar);
                            }
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$j */
                    static final class C57031j<T> implements AbstractC1178x<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ DocListViewModel f140703a;

                        C57031j(DocListViewModel docListViewModel) {
                            this.f140703a = docListViewModel;
                        }

                        /* renamed from: a */
                        public final void onChanged(Boolean bool) {
                            if (this.f140703a.getModel().ae() == TodoListView.Type.FROM_DOC) {
                                this.f140703a.refreshTodoDisplayDatas();
                            }
                        }
                    }

                    @Subscribe
                    public final void onCompleteTodoEvent(CompleteTodoEvent bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "completeTodoEvent");
                        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57032k(this, bVar, null), 3, null);
                    }

                    @Subscribe
                    public final void onDeleteTodoAssigneeEvent(DeleteTodoAssigneeEvent cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "deleteTodoAssigneeEvent");
                        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57033l(this, cVar, null), 3, null);
                    }

                    @Subscribe
                    public final void onQuitTodoEvent(QuitTodoEvent eVar) {
                        Intrinsics.checkParameterIsNotNull(eVar, "quitTodoEvent");
                        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57034m(this, eVar, null), 3, null);
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$changeDocsDoingTitleState$1", mo239173f = "DocListViewModel.kt", mo239174i = {0}, mo239175l = {221}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$b */
                    public static final class C57022b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $showDone;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57022b(DocListViewModel docListViewModel, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$showDone = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57022b bVar = new C57022b(this.this$0, this.$showDone, cVar);
                            bVar.p$ = (CoroutineScope) obj;
                            return bVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57022b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                DocListViewModel docListViewModel = this.this$0;
                                boolean z = this.$showDone;
                                this.L$0 = ahVar;
                                this.label = 1;
                                if (docListViewModel.refreshDocsDoneList(z, this) == a) {
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

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$onCompleteTodoEvent$1", mo239173f = "DocListViewModel.kt", mo239174i = {0}, mo239175l = {542}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$k */
                    static final class C57032k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CompleteTodoEvent $completeTodoEvent;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57032k(DocListViewModel docListViewModel, CompleteTodoEvent bVar, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$completeTodoEvent = bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57032k kVar = new C57032k(this.this$0, this.$completeTodoEvent, cVar);
                            kVar.p$ = (CoroutineScope) obj;
                            return kVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57032k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                DocListViewModel docListViewModel = this.this$0;
                                String a2 = this.$completeTodoEvent.mo194121a();
                                boolean b = this.$completeTodoEvent.mo194122b();
                                this.L$0 = ahVar;
                                this.label = 1;
                                if (docListViewModel.refreshDocsCompletePage(a2, b, this) == a) {
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

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$onDeleteTodoAssigneeEvent$1", mo239173f = "DocListViewModel.kt", mo239174i = {0}, mo239175l = {550}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$l */
                    static final class C57033l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ DeleteTodoAssigneeEvent $deleteTodoAssigneeEvent;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57033l(DocListViewModel docListViewModel, DeleteTodoAssigneeEvent cVar, Continuation cVar2) {
                            super(2, cVar2);
                            this.this$0 = docListViewModel;
                            this.$deleteTodoAssigneeEvent = cVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57033l lVar = new C57033l(this.this$0, this.$deleteTodoAssigneeEvent, cVar);
                            lVar.p$ = (CoroutineScope) obj;
                            return lVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57033l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                DocListViewModel docListViewModel = this.this$0;
                                String a2 = this.$deleteTodoAssigneeEvent.mo194123a();
                                String b = this.$deleteTodoAssigneeEvent.mo194124b();
                                this.L$0 = ahVar;
                                this.label = 1;
                                if (docListViewModel.refreshDocsAssigneePage(a2, b, this) == a) {
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

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$onQuitTodoEvent$1", mo239173f = "DocListViewModel.kt", mo239174i = {0}, mo239175l = {249}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$m */
                    static final class C57034m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ QuitTodoEvent $quitTodoEvent;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57034m(DocListViewModel docListViewModel, QuitTodoEvent eVar, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$quitTodoEvent = eVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57034m mVar = new C57034m(this.this$0, this.$quitTodoEvent, cVar);
                            mVar.p$ = (CoroutineScope) obj;
                            return mVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57034m) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                DocListViewModel docListViewModel = this.this$0;
                                String a2 = this.$quitTodoEvent.mo194126a();
                                this.L$0 = ahVar;
                                this.label = 1;
                                if (docListViewModel.refreshListWithDeleteTodoId(a2, this) == a) {
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

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public DocListViewModel(IViewModelAbility<TodoMainModel2> gVar) {
                        super(gVar);
                        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
                    }

                    private final void changeDocsDoingTitleState(boolean z) {
                        boolean z2 = true;
                        if (!z || !Intrinsics.areEqual((Object) getModel().mo193548F().mo5927b(), (Object) true)) {
                            this.docsLoadTitleType = LoadTitleType.LOAD_NONE;
                        } else {
                            this.docsLoadTitleType = LoadTitleType.LOAD_DOING;
                            z2 = false;
                        }
                        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57022b(this, z2, null), 3, null);
                    }

                    private final void changeDocsDoneTitleState(boolean z) {
                        LoadTitleType loadTitleType;
                        if (!z || !Intrinsics.areEqual((Object) getModel().mo193547E().mo5927b(), (Object) true)) {
                            loadTitleType = LoadTitleType.LOAD_NONE;
                        } else {
                            loadTitleType = LoadTitleType.LOAD_DONE;
                        }
                        this.docsLoadTitleType = loadTitleType;
                        refreshTodoDisplayDatas();
                    }

                    public final void getDocsPagingItems(boolean z) {
                        if (getModel().ae() == TodoListView.Type.FROM_DOC && z) {
                            resetDocsTitleStateMap();
                            getModel().mo193561S().mo5929b(TodoFetchStatus.LOADING);
                        }
                        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57025e(this, z, null), 3, null);
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$getDocsPagingItems$1", mo239173f = "DocListViewModel.kt", mo239174i = {0, 1}, mo239175l = {101, 102}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$e */
                    public static final class C57025e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $isFetchFirstPage;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57025e(DocListViewModel docListViewModel, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$isFetchFirstPage = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57025e eVar = new C57025e(this.this$0, this.$isFetchFirstPage, cVar);
                            eVar.p$ = (CoroutineScope) obj;
                            return eVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57025e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                if (C57076b.f140754a[this.this$0.docsLoadTitleType.ordinal()] != 1) {
                                    DocListViewModel docListViewModel = this.this$0;
                                    TodoSortType af = docListViewModel.getModel().af();
                                    boolean z = this.$isFetchFirstPage;
                                    this.L$0 = ahVar;
                                    this.label = 2;
                                    if (docListViewModel.getDocsDoingPageData(af, z, this) == a) {
                                        return a;
                                    }
                                } else {
                                    DocListViewModel docListViewModel2 = this.this$0;
                                    TodoSortType af2 = docListViewModel2.getModel().af();
                                    this.L$0 = ahVar;
                                    this.label = 1;
                                    if (docListViewModel2.getDocsDonePageData(af2, this) == a) {
                                        return a;
                                    }
                                }
                            } else if (i == 1 || i == 2) {
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
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$refreshDocsDoneList$2", mo239173f = "DocListViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$p */
                    public static final class C57037p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $showDone;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57037p(DocListViewModel docListViewModel, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$showDone = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57037p pVar = new C57037p(this.this$0, this.$showDone, cVar);
                            pVar.p$ = (CoroutineScope) obj;
                            return pVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57037p) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            C69086a.m265828a();
                            if (this.label == 0) {
                                C69097g.m265891a(obj);
                                this.this$0.pagingDocsDataSet.clear();
                                this.this$0.pagingDocsDataList.clear();
                                this.this$0.pagingDocsDataSet.addAll(this.this$0.pagingDocsDoingDataSet);
                                this.this$0.pagingDocsDataList.addAll(this.this$0.pagingDocsDoingDataList);
                                this.this$0.showDonePage = this.$showDone;
                                if (this.$showDone) {
                                    this.this$0.pagingDocsDataSet.addAll(this.this$0.pagingDocsDoneDataSet);
                                    this.this$0.pagingDocsDataList.addAll(this.this$0.pagingDocsDoneDataList);
                                }
                                DocListViewModel docListViewModel = this.this$0;
                                docListViewModel.postCompareFilter(docListViewModel.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingDocsDataList, TodoListView.Type.FROM_DOC)));
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$setDocsCompleted$1", mo239173f = "DocListViewModel.kt", mo239174i = {0}, mo239175l = {150}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$t */
                    public static final class C57041t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $isTargetCompleted;
                        final /* synthetic */ String $todoGuid;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57041t(DocListViewModel docListViewModel, boolean z, String str, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$isTargetCompleted = z;
                            this.$todoGuid = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57041t tVar = new C57041t(this.this$0, this.$isTargetCompleted, this.$todoGuid, cVar);
                            tVar.p$ = (CoroutineScope) obj;
                            return tVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57041t) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                if (!this.$isTargetCompleted) {
                                    TodoHitPoint.m221744b(this.$todoGuid);
                                } else {
                                    TodoHitPoint.m221731a(this.$todoGuid, TodoHitPoint.f141073a.mo194222b(this.this$0.getModel().ae()));
                                }
                                TodoGeneralHitPoint.f141070a.mo194180a(this.$todoGuid, this.$isTargetCompleted, "done_task");
                                DocListViewModel docListViewModel = this.this$0;
                                String str = this.$todoGuid;
                                boolean z = this.$isTargetCompleted;
                                this.L$0 = ahVar;
                                this.label = 1;
                                if (docListViewModel.refreshTodoDocsComplete(str, z, this) == a) {
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

                    public final void mergeDocsDoingList(List<Todo> list) {
                        for (Todo todo : list) {
                            if (!this.pagingDocsDoingDataSet.contains(todo.guid)) {
                                this.pagingDocsDoingDataSet.add(todo.guid);
                                this.pagingDocsDoingDataList.add(todo);
                            } else {
                                int size = this.pagingDocsDoingDataList.size();
                                for (int i = 0; i < size; i++) {
                                    if (Intrinsics.areEqual(this.pagingDocsDoingDataList.get(i).guid, todo.guid)) {
                                        this.pagingDocsDoingDataList.set(i, todo);
                                    }
                                }
                            }
                        }
                    }

                    public final void mergeDocsDoneList(List<Todo> list) {
                        for (Todo todo : list) {
                            if (!this.pagingDocsDoneDataSet.contains(todo.guid)) {
                                this.pagingDocsDoneDataSet.add(todo.guid);
                                this.pagingDocsDoneDataList.add(todo);
                            } else {
                                int size = this.pagingDocsDoneDataList.size();
                                for (int i = 0; i < size; i++) {
                                    if (Intrinsics.areEqual(this.pagingDocsDoneDataList.get(i).guid, todo.guid)) {
                                        this.pagingDocsDoneDataList.set(i, todo);
                                    }
                                }
                            }
                        }
                    }

                    public final void refreshDocsDoingPageComplete(Todo todo) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        this.pagingDocsDoneDataSet.remove(todo.guid);
                        for (T t : this.pagingDocsDoneDataList) {
                            if (!Intrinsics.areEqual(t.guid, todo.guid)) {
                                arrayList.add(t);
                            }
                        }
                        this.pagingDocsDoneDataList.clear();
                        this.pagingDocsDoneDataList.addAll(arrayList);
                        this.pagingDocsDoingDataSet.add(todo.guid);
                        arrayList2.add(todo.newBuilder().mo66622a((Long) 0L).build());
                        arrayList2.addAll(this.pagingDocsDoingDataList);
                        this.pagingDocsDoingDataList.clear();
                        this.pagingDocsDoingDataList.addAll(arrayList2);
                    }

                    public final void refreshDocsDonePageComplete(Todo todo) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        this.pagingDocsDoingDataSet.remove(todo.guid);
                        for (T t : this.pagingDocsDoingDataList) {
                            if (!Intrinsics.areEqual(t.guid, todo.guid)) {
                                arrayList2.add(t);
                            }
                        }
                        this.pagingDocsDoingDataList.clear();
                        this.pagingDocsDoingDataList.addAll(arrayList2);
                        this.pagingDocsDoneDataSet.add(todo.guid);
                        arrayList.add(todo.newBuilder().mo66622a(Long.valueOf(System.currentTimeMillis())).build());
                        arrayList.addAll(this.pagingDocsDoneDataList);
                        this.pagingDocsDoneDataList.clear();
                        this.pagingDocsDoneDataList.addAll(arrayList);
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$getDocsDonePageData$2", mo239173f = "DocListViewModel.kt", mo239174i = {0}, mo239175l = {288}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$d */
                    public static final class C57024d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TodoSortType $sortType;
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57024d(DocListViewModel docListViewModel, TodoSortType todoSortType, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$sortType = todoSortType;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57024d dVar = new C57024d(this.this$0, this.$sortType, cVar);
                            dVar.p$ = (CoroutineScope) obj;
                            return dVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57024d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                DocListViewModel docListViewModel = this.this$0;
                                TodoSortType todoSortType = this.$sortType;
                                this.L$0 = ahVar;
                                this.label = 1;
                                if (docListViewModel.savePageDocsDonePageData(todoSortType, this) == a) {
                                    return a;
                                }
                            } else if (i == 1) {
                                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                C69097g.m265891a(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            this.this$0.mergeDocsList();
                            DocListViewModel docListViewModel2 = this.this$0;
                            docListViewModel2.postCompareFilter(docListViewModel2.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingDocsDataList, TodoListView.Type.FROM_DOC)));
                            this.this$0.getModel().mo193603t().mo5926a(this.this$0.getModel().mo193547E().mo5927b());
                            if (Intrinsics.areEqual(this.this$0.getModel().mo193547E().mo5927b(), C69089a.m265837a(true))) {
                                this.this$0.docsLoadTitleType = LoadTitleType.LOAD_NONE;
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$refreshDocsCompletePage$2", mo239173f = "DocListViewModel.kt", mo239174i = {0, 0}, mo239175l = {442}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "todo"}, mo239178s = {"L$0", "L$1"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$o */
                    public static final class C57036o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $isCompleted;
                        final /* synthetic */ String $todoGuid;
                        Object L$0;
                        Object L$1;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57036o(DocListViewModel docListViewModel, String str, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$todoGuid = str;
                            this.$isCompleted = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57036o oVar = new C57036o(this.this$0, this.$todoGuid, this.$isCompleted, cVar);
                            oVar.p$ = (CoroutineScope) obj;
                            return oVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57036o) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object a = C69086a.m265828a();
                            int i = this.label;
                            if (i == 0) {
                                C69097g.m265891a(obj);
                                CoroutineScope ahVar = this.p$;
                                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                objectRef.element = (T) null;
                                for (T t : this.this$0.pagingDocsDoingDataList) {
                                    if (Intrinsics.areEqual(t.guid, this.$todoGuid)) {
                                        objectRef.element = t;
                                    }
                                }
                                for (T t2 : this.this$0.pagingDocsDoneDataList) {
                                    if (Intrinsics.areEqual(t2.guid, this.$todoGuid)) {
                                        objectRef.element = t2;
                                    }
                                }
                                T t3 = objectRef.element;
                                if (t3 != null) {
                                    boolean z = this.$isCompleted;
                                    if (z) {
                                        this.this$0.refreshDocsDonePageComplete(t3);
                                    } else if (!z) {
                                        this.this$0.refreshDocsDoingPageComplete(t3);
                                    }
                                }
                                DocListViewModel docListViewModel = this.this$0;
                                boolean z2 = docListViewModel.showDonePage;
                                this.L$0 = ahVar;
                                this.L$1 = objectRef;
                                this.label = 1;
                                if (docListViewModel.refreshDocsDoneList(z2, this) == a) {
                                    return a;
                                }
                            } else if (i == 1) {
                                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$1;
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
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$refreshListWithDeleteTodoId$2", mo239173f = "DocListViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$q */
                    public static final class C57038q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ String $todoGuid;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57038q(DocListViewModel docListViewModel, String str, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$todoGuid = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57038q qVar = new C57038q(this.this$0, this.$todoGuid, cVar);
                            qVar.p$ = (CoroutineScope) obj;
                            return qVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57038q) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            C69086a.m265828a();
                            if (this.label == 0) {
                                C69097g.m265891a(obj);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                this.this$0.pagingDocsDataSet.remove(this.$todoGuid);
                                this.this$0.pagingDocsDoneDataSet.remove(this.$todoGuid);
                                this.this$0.pagingDocsDoingDataSet.remove(this.$todoGuid);
                                for (T t : this.this$0.pagingDocsDataList) {
                                    if (!Intrinsics.areEqual(t.guid, this.$todoGuid)) {
                                        arrayList.add(t);
                                    }
                                }
                                for (T t2 : this.this$0.pagingDocsDoingDataList) {
                                    if (!Intrinsics.areEqual(t2.guid, this.$todoGuid)) {
                                        arrayList3.add(t2);
                                    }
                                }
                                for (T t3 : this.this$0.pagingDocsDoneDataList) {
                                    if (!Intrinsics.areEqual(t3.guid, this.$todoGuid)) {
                                        arrayList2.add(t3);
                                    }
                                }
                                this.this$0.pagingDocsDataList.clear();
                                this.this$0.pagingDocsDataList.addAll(arrayList);
                                this.this$0.pagingDocsDoingDataList.clear();
                                this.this$0.pagingDocsDoingDataList.addAll(arrayList3);
                                this.this$0.pagingDocsDoneDataList.clear();
                                this.this$0.pagingDocsDoneDataList.addAll(arrayList2);
                                DocListViewModel docListViewModel = this.this$0;
                                docListViewModel.postCompareFilter(docListViewModel.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingDocsDataList, TodoListView.Type.FROM_DOC)));
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$refreshDocsAssigneePage$2", mo239173f = "DocListViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$n */
                    public static final class C57035n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ String $assigneeId;
                        final /* synthetic */ String $todoGuid;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57035n(DocListViewModel docListViewModel, String str, String str2, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$assigneeId = str;
                            this.$todoGuid = str2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57035n nVar = new C57035n(this.this$0, this.$assigneeId, this.$todoGuid, cVar);
                            nVar.p$ = (CoroutineScope) obj;
                            return nVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57035n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Integer num;
                            Integer num2;
                            C69086a.m265828a();
                            if (this.label == 0) {
                                C69097g.m265891a(obj);
                                if (TextUtils.equals(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a(), this.$assigneeId)) {
                                    Todo todo = null;
                                    Integer num3 = null;
                                    ArrayList arrayList = new ArrayList();
                                    int size = this.this$0.pagingDocsDataList.size();
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= size) {
                                            num = num3;
                                            break;
                                        } else if (Intrinsics.areEqual(this.this$0.pagingDocsDataList.get(i2).guid, this.$todoGuid)) {
                                            todo = this.this$0.pagingDocsDataList.get(i2);
                                            num = C69089a.m265839a(i2);
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    int size2 = this.this$0.pagingDocsDoingDataList.size();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= size2) {
                                            num2 = num3;
                                            break;
                                        } else if (Intrinsics.areEqual(this.this$0.pagingDocsDoingDataList.get(i3).guid, this.$todoGuid)) {
                                            todo = this.this$0.pagingDocsDoingDataList.get(i3);
                                            num2 = C69089a.m265839a(i3);
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    int size3 = this.this$0.pagingDocsDoneDataList.size();
                                    while (true) {
                                        if (i >= size3) {
                                            break;
                                        } else if (Intrinsics.areEqual(this.this$0.pagingDocsDoneDataList.get(i).guid, this.$todoGuid)) {
                                            todo = this.this$0.pagingDocsDoneDataList.get(i);
                                            num3 = C69089a.m265839a(i);
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    if (todo != null) {
                                        List<TodoAssignee> list = todo.assignees;
                                        Intrinsics.checkExpressionValueIsNotNull(list, "it.assignees");
                                        for (T t : list) {
                                            if (!Intrinsics.areEqual(t.assignee_id, this.$assigneeId)) {
                                                arrayList.add(t);
                                            }
                                        }
                                        if (num != null) {
                                            this.this$0.pagingDocsDataList.set(num.intValue(), todo.newBuilder().mo66623a(arrayList).build());
                                        }
                                        if (num2 != null) {
                                            this.this$0.pagingDocsDoingDataList.set(num2.intValue(), todo.newBuilder().mo66623a(arrayList).build());
                                        }
                                        if (num3 != null) {
                                            this.this$0.pagingDocsDoneDataList.set(num3.intValue(), todo.newBuilder().mo66623a(arrayList).build());
                                        }
                                    }
                                    DocListViewModel docListViewModel = this.this$0;
                                    docListViewModel.postCompareFilter(docListViewModel.getModel().mo193546D(), new DataResult.DataSuccess(new TodoListResult(this.this$0.pagingDocsDataList, TodoListView.Type.FROM_DOC)));
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$refreshTodoDocsComplete$2", mo239173f = "DocListViewModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, mo239175l = {184, 188}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "result", "todoList", "changeTodo", "newTodoList", "$this$forEach$iv", "element$iv", "it", "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "result", "todoList", "changeTodo", "newTodoList"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$r */
                    public static final class C57039r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $isTargetCompleted;
                        final /* synthetic */ String $todoGuid;
                        Object L$0;
                        Object L$1;
                        Object L$10;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        Object L$5;
                        Object L$6;
                        Object L$7;
                        Object L$8;
                        Object L$9;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57039r(DocListViewModel docListViewModel, String str, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$todoGuid = str;
                            this.$isTargetCompleted = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57039r rVar = new C57039r(this.this$0, this.$todoGuid, this.$isTargetCompleted, cVar);
                            rVar.p$ = (CoroutineScope) obj;
                            return rVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57039r) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:34:0x015f  */
                        /* JADX WARNING: Removed duplicated region for block: B:39:0x01ab  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
                            /*
                            // Method dump skipped, instructions count: 468
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel.C57039r.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$savePageDocsDonePageData$2", mo239173f = "DocListViewModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {307}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "orderBy"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$s */
                    public static final class C57040s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57040s(DocListViewModel docListViewModel, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57040s sVar = new C57040s(this.this$0, cVar);
                            sVar.p$ = (CoroutineScope) obj;
                            return sVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57040s) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                                TodoAppreciableHitPoint.f141058a.mo194138c();
                                String valueOf = String.valueOf(new Date().getTime());
                                str = "savePageDocsDonePageData";
                                Log.m165389i("DocListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, str, new String[0]));
                                ListDocTodosRequest.Order.By by = ListDocTodosRequest.Order.By.COMPLETED_TIME;
                                TodoListSDKService eVar = TodoListSDKService.f141114a;
                                long j = this.this$0.pageDocsDonePosition;
                                ListDocTodosRequest.Status status = ListDocTodosRequest.Status.COMPLETED;
                                this.L$0 = ahVar;
                                this.L$1 = valueOf;
                                this.L$2 = str;
                                this.L$3 = by;
                                this.label = 1;
                                obj2 = eVar.mo194285a(50, j, by, status, true, this);
                                if (obj2 == a2) {
                                    return a2;
                                }
                                str2 = valueOf;
                            } else if (i == 1) {
                                ListDocTodosRequest.Order.By by2 = (ListDocTodosRequest.Order.By) this.L$3;
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
                                Log.m165383e("DocListViewModel", LogMessageUtil.f139260a.mo191767a(str2, str, "saveDocsDonePageData result is empty!"));
                                DocListViewModel docListViewModel = this.this$0;
                                docListViewModel.postCompareFilter(docListViewModel.getModel().mo193546D(), new DataResult.DataError(new Exception("fetch next page error")));
                                return Unit.INSTANCE;
                            }
                            LogMessageUtil cVar = LogMessageUtil.f139260a;
                            String[] strArr = new String[2];
                            strArr[0] = "todo_size";
                            CopyOnWriteArrayList<Todo> a3 = eVar2.mo193219a();
                            if (a3 != null) {
                                num = C69089a.m265839a(a3.size());
                            } else {
                                num = null;
                            }
                            strArr[1] = String.valueOf(num);
                            Log.m165389i("DocListViewModel", cVar.mo191768a(str2, str, strArr));
                            CopyOnWriteArrayList<Todo> a4 = eVar2.mo193219a();
                            if (a4 != null) {
                                this.this$0.mergeDocsDoneList(a4);
                            }
                            this.this$0.pageDocsDonePosition = eVar2.mo193221c();
                            this.this$0.getModel().mo193547E().mo5926a(C69089a.m265837a(eVar2.mo193220b()));
                            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
                            TodoListView.Type type = TodoListView.Type.FROM_DOC;
                            CopyOnWriteArrayList<Todo> a5 = eVar2.mo193219a();
                            if (!(a5 == null || (a = C69089a.m265839a(a5.size())) == null)) {
                                i2 = a.intValue();
                            }
                            aVar.mo194136b(type, i2);
                            return Unit.INSTANCE;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$getDocsDoingPageData$2", mo239173f = "DocListViewModel.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, mo239175l = {351, 365}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "orderBy", "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "orderBy", "result"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
                    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel$c */
                    public static final class C57023c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $isFetchFirstPage;
                        final /* synthetic */ TodoSortType $sortType;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ DocListViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C57023c(DocListViewModel docListViewModel, TodoSortType todoSortType, boolean z, Continuation cVar) {
                            super(2, cVar);
                            this.this$0 = docListViewModel;
                            this.$sortType = todoSortType;
                            this.$isFetchFirstPage = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C57023c cVar2 = new C57023c(this.this$0, this.$sortType, this.$isFetchFirstPage, cVar);
                            cVar2.p$ = (CoroutineScope) obj;
                            return cVar2;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                            return ((C57023c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
                        /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:24:0x00bc  */
                        /* JADX WARNING: Removed duplicated region for block: B:42:0x013f  */
                        /* JADX WARNING: Removed duplicated region for block: B:43:0x0148  */
                        /* JADX WARNING: Removed duplicated region for block: B:46:0x015c  */
                        /* JADX WARNING: Removed duplicated region for block: B:49:0x019a  */
                        /* JADX WARNING: Removed duplicated region for block: B:50:0x01bb  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                            /*
                            // Method dump skipped, instructions count: 556
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel.C57023c.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    public final void refreshDocsPageComplete(Todo todo, boolean z) {
                        if (z) {
                            refreshDocsDonePageComplete(todo);
                        } else if (!z) {
                            refreshDocsDoingPageComplete(todo);
                        }
                    }

                    private final Job setDocsCompleted(String str, boolean z) {
                        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57041t(this, z, str, null), 3, null);
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object getDocsDonePageData(TodoSortType todoSortType, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57024d(this, todoSortType, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // com.larksuite.framework.section.ViewModelSection
                    public void handleAction(int i, String str) {
                        Intrinsics.checkParameterIsNotNull(str, "actionData");
                        if (i == 1001 && getModel().ae() == TodoListView.Type.FROM_DOC) {
                            clickEnterDetail(str);
                        }
                    }

                    @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
                    public <T> void postCompareFilter(MutableLiveDataPlus<T> eVar, T t) {
                        Intrinsics.checkParameterIsNotNull(eVar, "$this$postCompareFilter");
                        if (!(t instanceof DataResult.DataSuccess)) {
                            eVar.mo5926a((Object) t);
                        } else if (getModel().ae() == TodoListView.Type.FROM_DOC) {
                            eVar.mo5926a((Object) t);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object refreshDocsDoneList(boolean z, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57037p(this, z, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object refreshListWithDeleteTodoId(String str, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57038q(this, str, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object savePageDocsDonePageData(TodoSortType todoSortType, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57040s(this, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    private final void changeDocTitleState(TodoItemViewData.TitleType titleType, boolean z) {
                        HashMap<TodoItemViewData.TitleType, Boolean> hashMap = TodoListViewModel.Companion.mo193804a().get(getModel().ae());
                        if (hashMap != null) {
                            Intrinsics.checkExpressionValueIsNotNull(hashMap, "midTitleState[model.getTodoFilterType()] ?: return");
                            hashMap.put(titleType, Boolean.valueOf(z));
                            int i = C57076b.f140755b[titleType.ordinal()];
                            if (i == 1) {
                                changeDocsDoneTitleState(z);
                            } else if (i == 2) {
                                changeDocsDoingTitleState(z);
                            }
                        }
                    }

                    @Override // com.larksuite.framework.section.ViewModelSection, com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel
                    public void handleAction(int i, IActionData bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
                        super.handleAction(i, bVar);
                        if (i != 1003) {
                            if (i != 1004) {
                                if (i == 1006 && (bVar instanceof TitleActionData)) {
                                    TitleActionData fVar = (TitleActionData) bVar;
                                    changeDocTitleState(fVar.mo193512a(), fVar.mo193513b());
                                }
                            } else if ((bVar instanceof DeleteActionData) && getModel().ae() == TodoListView.Type.FROM_DOC) {
                                DeleteActionData dVar = (DeleteActionData) bVar;
                                updateTodoByDeleteStatus(dVar.mo193501a(), dVar.mo193502b(), dVar.mo193503c());
                            }
                        } else if (bVar instanceof CheckBoxActionData) {
                            VibrateUtil.f139263a.mo191785a();
                            CheckBoxActionData aVar = (CheckBoxActionData) bVar;
                            setDocsCompleted(aVar.mo193483a(), aVar.mo193484b());
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object getDocsDoingPageData(TodoSortType todoSortType, boolean z, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57023c(this, todoSortType, z, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object refreshDocsAssigneePage(String str, String str2, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57035n(this, str2, str, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object refreshDocsCompletePage(String str, boolean z, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57036o(this, str, z, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ Object refreshTodoDocsComplete(String str, boolean z, Continuation<? super Unit> cVar) {
                        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57039r(this, str, z, null), cVar);
                        if (a == C69086a.m265828a()) {
                            return a;
                        }
                        return Unit.INSTANCE;
                    }
                }
