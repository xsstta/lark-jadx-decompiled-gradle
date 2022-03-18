package com.ss.android.lark.todo.impl.features.detail.history;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsResponse;
import com.bytedance.lark.pb.todo.v1.Record;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "cursor", "", "handleAction", "", "action", "", "initViewData", "loadMore", "refreshList", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.c.e */
public final class TodoHistoryViewModel extends ViewModelSection<TodoDetailModel> {
    public String cursor = "";

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
    }

    private final void loadMore() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        Job unused = C69553g.m266944a(C1143ag.m5356a(adVar), Dispatchers.m266326d(), null, new C56495a(adVar, null, this), 2, null);
    }

    private final void refreshList() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        Job unused = C69553g.m266944a(C1143ag.m5356a(adVar), Dispatchers.m266326d(), null, new C56496b(adVar, null, this), 2, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoHistoryViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        switch (i) {
            case LocationRequest.PRIORITY_INDOOR:
                refreshList();
                return;
            case 301:
                loadMore();
                return;
            case 302:
                ((TodoDetailModel) getModelStore()).getHistoryIsLoading().mo92060c(true);
                refreshList();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/todo/impl/features/detail/history/TodoHistoryViewModel$loadMore$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.e$a */
    public static final class C56495a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDetailModel $this_apply;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoHistoryViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56495a(TodoDetailModel adVar, Continuation cVar, TodoHistoryViewModel eVar) {
            super(2, cVar);
            this.$this_apply = adVar;
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56495a aVar = new C56495a(this.$this_apply, cVar, this.this$0);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56495a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Boolean bool;
            List<Record> list;
            Integer a;
            List<Record> list2;
            ArrayList arrayList;
            Object a2 = C69086a.m265828a();
            int i = this.label;
            int i2 = 0;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194153i();
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String guid = this.$this_apply.getGuid();
                String str2 = this.this$0.cursor;
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194307a(guid, str2, false, (Continuation<? super GetTodoHistoryRecordsResponse>) this);
                if (obj == a2) {
                    return a2;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GetTodoHistoryRecordsResponse getTodoHistoryRecordsResponse = (GetTodoHistoryRecordsResponse) obj;
            if (!(getTodoHistoryRecordsResponse == null || (list2 = getTodoHistoryRecordsResponse.records) == null)) {
                List<Record> b = this.$this_apply.getHistoryRecords().mo5927b();
                if (b == null || (arrayList = CollectionsKt.toMutableList((Collection) b)) == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(list2);
                this.$this_apply.getHistoryRecords().mo5926a(arrayList);
            }
            TodoHistoryViewModel eVar = this.this$0;
            if (getTodoHistoryRecordsResponse == null || (str = getTodoHistoryRecordsResponse.next_cursor) == null) {
                str = "";
            }
            eVar.cursor = str;
            C1177w<Boolean> historyHasMore = this.$this_apply.getHistoryHasMore();
            if (getTodoHistoryRecordsResponse == null || (bool = getTodoHistoryRecordsResponse.has_more) == null) {
                bool = C69089a.m265837a(false);
            }
            historyHasMore.mo5926a(bool);
            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
            if (!(getTodoHistoryRecordsResponse == null || (list = getTodoHistoryRecordsResponse.records) == null || (a = C69089a.m265839a(list.size())) == null)) {
                i2 = a.intValue();
            }
            aVar.mo194139c(i2);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/todo/impl/features/detail/history/TodoHistoryViewModel$refreshList$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.e$b */
    public static final class C56496b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDetailModel $this_apply;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoHistoryViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56496b(TodoDetailModel adVar, Continuation cVar, TodoHistoryViewModel eVar) {
            super(2, cVar);
            this.$this_apply = adVar;
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56496b bVar = new C56496b(this.$this_apply, cVar, this.this$0);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56496b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Boolean bool;
            List<Record> list;
            Integer a;
            List<Record> list2;
            Object a2 = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194151h();
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String guid = this.$this_apply.getGuid();
                this.L$0 = ahVar;
                this.label = 1;
                obj = TodoRustCRUD.m221862a(fVar, guid, null, false, this, 6, null);
                if (obj == a2) {
                    return a2;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GetTodoHistoryRecordsResponse getTodoHistoryRecordsResponse = (GetTodoHistoryRecordsResponse) obj;
            if (!(getTodoHistoryRecordsResponse == null || (list2 = getTodoHistoryRecordsResponse.records) == null)) {
                this.$this_apply.getHistoryRecords().mo5926a(list2);
            }
            TodoHistoryViewModel eVar = this.this$0;
            if (getTodoHistoryRecordsResponse == null || (str = getTodoHistoryRecordsResponse.next_cursor) == null) {
                str = "";
            }
            eVar.cursor = str;
            C1177w<Boolean> historyHasMore = this.$this_apply.getHistoryHasMore();
            int i2 = 0;
            if (getTodoHistoryRecordsResponse == null || (bool = getTodoHistoryRecordsResponse.has_more) == null) {
                bool = C69089a.m265837a(false);
            }
            historyHasMore.mo5926a(bool);
            this.$this_apply.getHistoryIsLoading().mo92061d(C69089a.m265837a(false));
            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
            if (!(getTodoHistoryRecordsResponse == null || (list = getTodoHistoryRecordsResponse.records) == null || (a = C69089a.m265839a(list.size())) == null)) {
                i2 = a.intValue();
            }
            aVar.mo194135b(i2);
            return Unit.INSTANCE;
        }
    }
}
