package com.ss.android.lark.todo.impl.rustadapter.service;

import com.bytedance.lark.pb.todo.v1.DocTodoItem;
import com.bytedance.lark.pb.todo.v1.GetAllTodoViewsResponse;
import com.bytedance.lark.pb.todo.v1.GetPagingTodosResponse;
import com.bytedance.lark.pb.todo.v1.GetTodosByViewAndGuidsResponse;
import com.bytedance.lark.pb.todo.v1.GetTodosResponse;
import com.bytedance.lark.pb.todo.v1.ListDocTodosResponse;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListData;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoPagingUnit;
import com.ss.android.lark.todo.impl.rustadapter.service.RustLog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J;\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011JG\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ9\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00180\"j\b\u0012\u0004\u0012\u00020\u0018`#2\u0006\u0010$\u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/service/TodoListSDKService;", "", "()V", "getAllTodoViews", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocTodosRequest", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoPagingUnit;", "count", "", "position", "order", "Lcom/bytedance/lark/pb/todo/v1/ListDocTodosRequest$Order$By;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/todo/v1/ListDocTodosRequest$Status;", "isDesc", "", "(JJLcom/bytedance/lark/pb/todo/v1/ListDocTodosRequest$Order$By;Lcom/bytedance/lark/pb/todo/v1/ListDocTodosRequest$Status;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPagingTodos", "requestType", "Lcom/bytedance/lark/pb/todo/v1/GetPagingTodosRequest$ReqType;", "startPosition", "isPrevious", "lastGuid", "", "(Lcom/bytedance/lark/pb/todo/v1/GetPagingTodosRequest$ReqType;Ljava/lang/Long;ZJZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodosByFilter", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "currentFilterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodosByGuidAndFilter", "guidList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "viewType", "(Ljava/util/ArrayList;Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e */
public final class TodoListSDKService {

    /* renamed from: a */
    public static final TodoListSDKService f141114a = new TodoListSDKService();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H@"}, d2 = {"getAllTodoViews", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListData;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService", mo239173f = "TodoListSDKService.kt", mo239174i = {0, 0}, mo239175l = {46}, mo239176m = "getAllTodoViews", mo239177n = {"this", "builder"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$a */
    public static final class C57234a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoListSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57234a(TodoListSDKService eVar, Continuation cVar) {
            super(cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194289a(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH@"}, d2 = {"getDocTodosRequest", "", "count", "", "position", "order", "Lcom/bytedance/lark/pb/todo/v1/ListDocTodosRequest$Order$By;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/todo/v1/ListDocTodosRequest$Status;", "isDesc", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoPagingUnit;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService", mo239173f = "TodoListSDKService.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {171}, mo239176m = "getDocTodosRequest", mo239177n = {"this", "count", "position", "order", UpdateKey.STATUS, "isDesc", "builder"}, mo239178s = {"L$0", "J$0", "J$1", "L$1", "L$2", "Z$0", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$c */
    public static final class C57236c extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoListSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57236c(TodoListSDKService eVar, Continuation cVar) {
            super(cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194285a(0, 0, null, null, false, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH@"}, d2 = {"getPagingTodos", "", "requestType", "Lcom/bytedance/lark/pb/todo/v1/GetPagingTodosRequest$ReqType;", "startPosition", "", "isPrevious", "", "count", "isDesc", "lastGuid", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoPagingUnit;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService", mo239173f = "TodoListSDKService.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {SmEvents.EVENT_TO}, mo239176m = "getPagingTodos", mo239177n = {"this", "requestType", "startPosition", "isPrevious", "count", "isDesc", "lastGuid", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "J$0", "Z$1", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$e */
    public static final class C57238e extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoListSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57238e(TodoListSDKService eVar, Continuation cVar) {
            super(cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194286a(null, null, false, 0, false, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005H@"}, d2 = {"getTodosByFilter", "", "currentFilterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService", mo239173f = "TodoListSDKService.kt", mo239174i = {0, 0, 0}, mo239175l = {70}, mo239176m = "getTodosByFilter", mo239177n = {"this", "currentFilterType", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$g */
    public static final class C57240g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoListSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57240g(TodoListSDKService eVar, Continuation cVar) {
            super(cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194287a(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\tH@"}, d2 = {"getTodosByGuidAndFilter", "", "guidList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "viewType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService", mo239173f = "TodoListSDKService.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {136}, mo239176m = "getTodosByGuidAndFilter", mo239177n = {"this", "guidList", "viewType", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$i */
    public static final class C57242i extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoListSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57242i(TodoListSDKService eVar, Continuation cVar) {
            super(cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194288a(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoListSDKService$getAllTodoViews$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListData;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$b */
    public static final class C57235b implements RustLog.ParserString<TodoListData> {
        C57235b() {
        }

        /* renamed from: a */
        public TodoListData parse(byte[] bArr) {
            List<TodoListView> list;
            List<TodoListViewSetting> list2 = null;
            if (bArr == null) {
                return null;
            }
            GetAllTodoViewsResponse decode = GetAllTodoViewsResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                list = decode.todo_views;
            } else {
                list = null;
            }
            if (decode != null) {
                list2 = decode.view_settings;
            }
            return new TodoListData(list, list2);
        }

        /* renamed from: a */
        public String mo194250a(TodoListData bVar) {
            Integer num;
            List<TodoListViewSetting> b;
            List<TodoListView> a;
            StringBuilder sb = new StringBuilder();
            sb.append("listViewChildCounts:");
            Integer num2 = null;
            if (bVar == null || (a = bVar.mo193206a()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(a.size());
            }
            sb.append(num);
            sb.append(", listViewSettingsSize:");
            if (!(bVar == null || (b = bVar.mo193207b()) == null)) {
                num2 = Integer.valueOf(b.size());
            }
            sb.append(num2);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoListSDKService$getDocTodosRequest$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoPagingUnit;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$d */
    public static final class C57237d implements RustLog.ParserString<TodoPagingUnit> {
        C57237d() {
        }

        /* renamed from: a */
        public String mo194250a(TodoPagingUnit eVar) {
            Integer num;
            CopyOnWriteArrayList<Todo> a;
            StringBuilder sb = new StringBuilder();
            sb.append("listSize:");
            Boolean bool = null;
            if (eVar == null || (a = eVar.mo193219a()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(a.size());
            }
            sb.append(num);
            sb.append(", hasMore:");
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.mo193220b());
            }
            sb.append(bool);
            return sb.toString();
        }

        /* renamed from: a */
        public TodoPagingUnit parse(byte[] bArr) {
            ListDocTodosResponse decode;
            if (bArr == null || (decode = ListDocTodosResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            List<DocTodoItem> list = decode.items;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Todo todo = it.next().todo;
                    if (todo != null) {
                        copyOnWriteArrayList.add(todo);
                    }
                }
            }
            Boolean bool = decode.has_more;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.has_more");
            boolean booleanValue = bool.booleanValue();
            Long l = decode.next_position;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.next_position");
            return new TodoPagingUnit(copyOnWriteArrayList, booleanValue, l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoListSDKService$getPagingTodos$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoPagingUnit;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$f */
    public static final class C57239f implements RustLog.ParserString<TodoPagingUnit> {
        C57239f() {
        }

        /* renamed from: a */
        public TodoPagingUnit parse(byte[] bArr) {
            if (bArr != null) {
                GetPagingTodosResponse decode = GetPagingTodosResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(decode.todos);
                    Boolean bool = decode.has_more;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "response.has_more");
                    return new TodoPagingUnit(copyOnWriteArrayList, bool.booleanValue(), 0, 4, null);
                }
            }
            return null;
        }

        /* renamed from: a */
        public String mo194250a(TodoPagingUnit eVar) {
            Integer num;
            CopyOnWriteArrayList<Todo> a;
            StringBuilder sb = new StringBuilder();
            sb.append("listSize:");
            Boolean bool = null;
            if (eVar == null || (a = eVar.mo193219a()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(a.size());
            }
            sb.append(num);
            sb.append(", hasMore:");
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.mo193220b());
            }
            sb.append(bool);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoListSDKService$getTodosByFilter$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$h */
    public static final class C57241h implements RustLog.ParserString<List<? extends Todo>> {
        C57241h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.lark.todo.impl.rustadapter.service.RustLog.ParserString
        /* renamed from: a */
        public /* bridge */ /* synthetic */ String mo194250a(List<? extends Todo> list) {
            return mo194296a((List<Todo>) list);
        }

        /* renamed from: a */
        public List<Todo> parse(byte[] bArr) {
            GetTodosResponse decode;
            if (bArr == null || (decode = GetTodosResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.todos;
        }

        /* renamed from: a */
        public String mo194296a(List<Todo> list) {
            Integer num;
            StringBuilder sb = new StringBuilder();
            sb.append("listSize:");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoListSDKService$getTodosByGuidAndFilter$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.e$j */
    public static final class C57243j implements RustLog.ParserString<List<? extends Todo>> {
        C57243j() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.lark.todo.impl.rustadapter.service.RustLog.ParserString
        /* renamed from: a */
        public /* bridge */ /* synthetic */ String mo194250a(List<? extends Todo> list) {
            return mo194298a((List<Todo>) list);
        }

        /* renamed from: a */
        public List<Todo> parse(byte[] bArr) {
            GetTodosByViewAndGuidsResponse decode;
            if (bArr == null || (decode = GetTodosByViewAndGuidsResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.todos;
        }

        /* renamed from: a */
        public String mo194298a(List<Todo> list) {
            Integer num;
            StringBuilder sb = new StringBuilder();
            sb.append("listSize:");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            return sb.toString();
        }
    }

    private TodoListSDKService() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194289a(kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.features.mainview.entity.TodoListData> r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService.mo194289a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194287a(com.bytedance.lark.pb.todo.v1.TodoListView.Type r9, kotlin.coroutines.Continuation<? super java.util.List<com.bytedance.lark.pb.todo.v1.Todo>> r10) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService.mo194287a(com.bytedance.lark.pb.todo.v1.TodoListView$Type, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194288a(java.util.ArrayList<java.lang.String> r10, com.bytedance.lark.pb.todo.v1.TodoListView.Type r11, kotlin.coroutines.Continuation<? super java.util.List<com.bytedance.lark.pb.todo.v1.Todo>> r12) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService.mo194288a(java.util.ArrayList, com.bytedance.lark.pb.todo.v1.TodoListView$Type, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194285a(long r17, long r19, com.bytedance.lark.pb.todo.v1.ListDocTodosRequest.Order.By r21, com.bytedance.lark.pb.todo.v1.ListDocTodosRequest.Status r22, boolean r23, kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.features.mainview.entity.TodoPagingUnit> r24) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService.mo194285a(long, long, com.bytedance.lark.pb.todo.v1.ListDocTodosRequest$Order$By, com.bytedance.lark.pb.todo.v1.ListDocTodosRequest$Status, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194286a(com.bytedance.lark.pb.todo.v1.GetPagingTodosRequest.ReqType r16, java.lang.Long r17, boolean r18, long r19, boolean r21, java.lang.String r22, kotlin.coroutines.Continuation<? super com.ss.android.lark.todo.impl.features.mainview.entity.TodoPagingUnit> r23) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService.mo194286a(com.bytedance.lark.pb.todo.v1.GetPagingTodosRequest$ReqType, java.lang.Long, boolean, long, boolean, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
