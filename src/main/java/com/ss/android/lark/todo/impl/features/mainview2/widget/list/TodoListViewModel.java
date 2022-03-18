package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.AuthScene;
import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.FollowTodoResponse;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoFollower;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview2.entity.ConfirmActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.LoadMoreActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TitleActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper.TodoListHelper;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.rustadapter.push.entity.TodoChangeNotificationUnit;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.impl.utils.VibrateUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001yB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J=\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)H@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0011J \u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u0002J\b\u00101\u001a\u00020\"H\u0002J\u000e\u00102\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J1\u00103\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u00105\u001a\u000206H@ø\u0001\u0000¢\u0006\u0002\u00107J)\u00108\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H@ø\u0001\u0000¢\u0006\u0002\u00109J=\u0010:\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)H@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u0010;\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010<J\u0016\u0010=\u001a\u00020\"2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J$\u0010A\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00110Bj\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0011`CH\u0002J\u0014\u0010D\u001a\u00020\u00072\n\u0010E\u001a\u00060Fj\u0002`GH\u0002J\b\u0010H\u001a\u00020\"H\u0002J$\u0010I\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00110Bj\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0011`CH\u0002J\u0010\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020\u000eH\u0016J\u0018\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020\"H\u0016J\u0010\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020QH\u0004J\u0012\u0010R\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0012\u0010U\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0018\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020\u00112\u0006\u0010X\u001a\u00020\u000eH\u0002J\u0010\u0010Y\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\u0011H\u0002J\b\u0010[\u001a\u00020\"H\u0014J/\u0010\\\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%2\n\u0010]\u001a\u00060Fj\u0002`GH@ø\u0001\u0000¢\u0006\u0002\u0010^J\u0014\u0010_\u001a\u00020\"2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020@0?J\u0006\u0010a\u001a\u00020\"J\b\u0010b\u001a\u00020\"H\u0002J\b\u0010c\u001a\u00020\"H\u0002J\b\u0010d\u001a\u00020\"H\u0002J\b\u0010e\u001a\u00020\"H\u0004J\u0018\u0010f\u001a\u00020\"2\u000e\u0010E\u001a\n\u0018\u00010Fj\u0004\u0018\u0001`GH\u0002J\b\u0010g\u001a\u00020\"H\u0002J(\u0010h\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u00105\u001a\u000206H\u0004J\b\u0010i\u001a\u00020\"H\u0002J\b\u0010j\u001a\u00020\"H\u0002J\b\u0010k\u001a\u00020\"H\u0002J\b\u0010l\u001a\u00020\"H\u0002J1\u0010m\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%2\n\u0010]\u001a\u00060Fj\u0002`GH@ø\u0001\u0000¢\u0006\u0002\u0010^J \u0010n\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010o\u001a\u00020p2\u0006\u0010$\u001a\u00020%H\u0004J\u000e\u0010q\u001a\u00020\"2\u0006\u0010r\u001a\u00020sJ\n\u0010t\u001a\u00020\u0011*\u00020FJ%\u0010u\u001a\u00020\"\"\u0004\b\u0000\u0010v*\b\u0012\u0004\u0012\u0002Hv0w2\u0006\u0010`\u001a\u0002HvH&¢\u0006\u0002\u0010xR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006z"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "addedTodoGuid", "", "getAddedTodoGuid", "()Ljava/lang/String;", "setAddedTodoGuid", "(Ljava/lang/String;)V", "compeletedListItemsSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "isAddedScene", "", "()Z", "setAddedScene", "(Z)V", "isTimezoneRegister", "model", "getModel", "()Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "timeFormatChangeListener", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "timeFormatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "todoChangeNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "todoTimeZoneReceiver", "Landroid/content/BroadcastReceiver;", "activateTodo", "", "todoGuid", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/todo/v1/MarkTodoCompletedRequest$Type;", "userIds", "", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/bytedance/lark/pb/todo/v1/MarkTodoCompletedRequest$Type;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeTitleState", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "isExpand", "changeTodoCompleteStatus", "isTargetComplete", "clearCompletedListItem", "clickEnterDetail", "completeInMultiStrategy", "isTargetCompleted", "multiCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "(Ljava/lang/String;ZLcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeOutMultiAssignee", "(Ljava/lang/String;ZLcom/bytedance/lark/pb/todo/v1/TodoSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeTodo", "deleteTodo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateTodoViewDataByTodoList", "listResult", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TodoListResult;", "getDocsTitleStateMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getEmptyStrByFilterType", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "getFirstPageData", "getTitleStateMap", "handleAction", "action", "actionData", "Lcom/larksuite/framework/section/IActionData;", "initViewData", "isCustomCompleteStrategy", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "isShowBadgeOverdue", "badgeConfig", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "isShowBadgeToday", "loadMoreTodoDatas", "isForceFetch", "totalItemCount", "loadPagingDatas", "isFirstPage", "onCleared", "quitTodo", "currentFilter", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshListAndHandleBadge", "dataResult", "refreshTodoDisplayDatas", "registerSystemTimeZoneReceiver", "registerTimeFormatChangePush", "registerTodoChangeNotificationPush", "resetDocsTitleStateMap", "resetTitleExpandState", "resetTitleStateMap", "setCompleted", "showOperationSuccessToast", "unRegisterSystemTimeZoneReceiver", "unRegisterTimeFormatChangePush", "unRegisterTodoChangeNotificationPush", "unfollowTodo", "updateTodoByDeleteStatus", "behindDeleteStatus", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "updateTodoListByPush", "pushData", "Lcom/ss/android/lark/todo/impl/rustadapter/push/entity/TodoChangeNotificationUnit;", "isFullDataType", "postCompareFilter", "T", "Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "(Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;Ljava/lang/Object;)V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d */
public abstract class TodoListViewModel extends ViewModelSection<TodoMainModel2> {
    public static final Companion Companion = new Companion(null);
    public static volatile HashMap<TodoListView.Type, HashMap<TodoItemViewData.TitleType, Boolean>> midTitleState = new HashMap<>();
    private String addedTodoGuid = "";
    private HashSet<Integer> compeletedListItemsSet = new HashSet<>();
    private boolean isAddedScene;
    private boolean isTimezoneRegister;
    private final TodoMainModel2 model = ((TodoMainModel2) getModelStore());
    private AbstractC56259u.AbstractC56260a timeFormatChangeListener;
    private final AbstractC56259u timeFormatDependency = TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency();
    private TodoPushHandleCallBack todoChangeNotification;
    private final BroadcastReceiver todoTimeZoneReceiver = new TodoListViewModel$todoTimeZoneReceiver$1(this);

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@"}, d2 = {"completeInMultiStrategy", "", "todoGuid", "", "isTargetCompleted", "", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "multiCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, mo239175l = {358, 370}, mo239176m = "completeInMultiStrategy", mo239177n = {"this", "todoGuid", "isTargetCompleted", "todoSource", "multiCompleteType", "operationList", "this", "todoGuid", "isTargetCompleted", "todoSource", "multiCompleteType", "operationList"}, mo239178s = {"L$0", "L$1", "Z$0", "L$2", "L$3", "L$4", "L$0", "L$1", "Z$0", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$d */
    public static final class C57085d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57085d(TodoListViewModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.completeInMultiStrategy(null, false, null, null, this);
        }
    }

    public abstract <T> void postCompareFilter(MutableLiveDataPlus<T> eVar, T t);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000Rf\u0010\t\u001aN\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n0\nj.\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\nj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000f`\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel$Companion;", "", "()V", "FETCH_FIRST_PAGE_ERROR", "", "FETCH_NEXT_PAGE_ERROR", "PAGE_SIZE", "", "TAG", "midTitleState", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "", "Lkotlin/collections/HashMap;", "getMidTitleState", "()Ljava/util/HashMap;", "setMidTitleState", "(Ljava/util/HashMap;)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final HashMap<TodoListView.Type, HashMap<TodoItemViewData.TitleType, Boolean>> mo193804a() {
            return TodoListViewModel.midTitleState;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getAddedTodoGuid() {
        return this.addedTodoGuid;
    }

    public final TodoMainModel2 getModel() {
        return this.model;
    }

    public final boolean isAddedScene() {
        return this.isAddedScene;
    }

    public final void clearCompletedListItem() {
        this.compeletedListItemsSet.clear();
    }

    private final void unRegisterTodoChangeNotificationPush() {
        if (this.todoChangeNotification != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODOS_CHANGED_NOTIFICATION, this.todoChangeNotification);
        }
    }

    /* access modifiers changed from: protected */
    public final void resetDocsTitleStateMap() {
        midTitleState.put(TodoListView.Type.FROM_DOC, getDocsTitleStateMap());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTimeFormatChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$l */
    public static final class C57093l implements AbstractC56259u.AbstractC56260a {

        /* renamed from: a */
        final /* synthetic */ TodoListViewModel f140775a;

        C57093l(TodoListViewModel dVar) {
            this.f140775a = dVar;
        }

        @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u.AbstractC56260a
        /* renamed from: a */
        public final void mo191729a() {
            Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191769b("pushTimeFormatChange"));
            this.f140775a.refreshTodoDisplayDatas();
        }
    }

    private final HashMap<TodoItemViewData.TitleType, Boolean> getDocsTitleStateMap() {
        HashMap<TodoItemViewData.TitleType, Boolean> hashMap = new HashMap<>();
        HashMap<TodoItemViewData.TitleType, Boolean> hashMap2 = hashMap;
        hashMap2.put(TodoItemViewData.TitleType.DOING, true);
        hashMap2.put(TodoItemViewData.TitleType.DONE, false);
        return hashMap;
    }

    private final void registerTimeFormatChangePush() {
        this.timeFormatChangeListener = new C57093l(this);
        TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145432a(this.timeFormatChangeListener);
    }

    private final void registerTodoChangeNotificationPush() {
        this.todoChangeNotification = new C57094m(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODOS_CHANGED_NOTIFICATION, this.todoChangeNotification);
    }

    private final void unRegisterSystemTimeZoneReceiver() {
        if (this.isTimezoneRegister) {
            try {
                getContext().unregisterReceiver(this.todoTimeZoneReceiver);
                this.isTimezoneRegister = false;
            } catch (Exception unused) {
                Log.m165383e("TodoListViewModel", LogMessageUtil.f139260a.mo191771c("UnregisterReceiver failed"));
            }
        }
    }

    private final void unRegisterTimeFormatChangePush() {
        if (this.timeFormatChangeListener != null) {
            TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145433b(this.timeFormatChangeListener);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        unRegisterSystemTimeZoneReceiver();
        unRegisterTimeFormatChangePush();
        unRegisterTodoChangeNotificationPush();
        EventBus.getDefault().unregister(this);
    }

    public final void refreshTodoDisplayDatas() {
        DataResult<TodoListResult> b = this.model.mo193546D().mo5927b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "model.todoListResult.value ?: return");
            generateTodoViewDataByTodoList(b);
        }
    }

    public final void showOperationSuccessToast() {
        this.model.mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_CollabTask_Successful, OperationToastHelper.ToastType.SUCCESS, null, 4, null));
    }

    private final HashMap<TodoItemViewData.TitleType, Boolean> getTitleStateMap() {
        HashMap<TodoItemViewData.TitleType, Boolean> hashMap = new HashMap<>();
        HashMap<TodoItemViewData.TitleType, Boolean> hashMap2 = hashMap;
        hashMap2.put(TodoItemViewData.TitleType.OVER_DUE, true);
        hashMap2.put(TodoItemViewData.TitleType.TODAY, true);
        hashMap2.put(TodoItemViewData.TitleType.IN_WEEK, true);
        hashMap2.put(TodoItemViewData.TitleType.OTHER, true);
        return hashMap;
    }

    private final void registerSystemTimeZoneReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        try {
            INVOKEVIRTUAL_com_ss_android_lark_todo_impl_features_mainview2_widget_list_TodoListViewModel_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(getContext(), this.todoTimeZoneReceiver, intentFilter);
            this.isTimezoneRegister = true;
        } catch (Exception unused) {
            Log.m165383e("TodoListViewModel", LogMessageUtil.f139260a.mo191771c("RegisterReceiver failed"));
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        this.model.mo193545C().mo5925a(new C57088g(this));
        this.model.mo193554L().mo5925a(new C57089h(this));
        this.model.ad().mo5925a(new C57090i(this));
    }

    private final void getFirstPageData() {
        if (this.model.mo193561S().mo5927b() == TodoFetchStatus.FIRST_PAGE_FAILED) {
            int i = C57099e.f140786f[this.model.ae().ordinal()];
            if (i == 1) {
                this.model.mo193553K().mo5926a((Boolean) true);
            } else if (i == 2) {
                this.model.mo193552J().mo5926a((Boolean) true);
            }
        }
    }

    private final void resetTitleStateMap() {
        midTitleState.put(TodoListView.Type.ALL, getTitleStateMap());
        midTitleState.put(TodoListView.Type.ASSIGN_FROM_ME, getTitleStateMap());
        midTitleState.put(TodoListView.Type.ASSIGN_TO_ME, getTitleStateMap());
        midTitleState.put(TodoListView.Type.FOLLOWED, getTitleStateMap());
        midTitleState.put(TodoListView.Type.FROM_DOC, getDocsTitleStateMap());
    }

    public final void setAddedScene(boolean z) {
        this.isAddedScene = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014 \u0005*\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$h */
    static final class C57089h<T> implements AbstractC1178x<TodoListView.Type> {

        /* renamed from: a */
        final /* synthetic */ TodoListViewModel f140772a;

        C57089h(TodoListViewModel dVar) {
            this.f140772a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(TodoListView.Type type) {
            this.f140772a.resetTitleExpandState(type);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$i */
    static final class C57090i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoListViewModel f140773a;

        C57090i(TodoListViewModel dVar) {
            this.f140773a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140773a.clearCompletedListItem();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel$isCustomCompleteStrategy$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "showTipToast", "", "tipsStr", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$j */
    public static final class C57091j implements CustomCompleteHelper.ITipShowListener {

        /* renamed from: a */
        final /* synthetic */ TodoListViewModel f140774a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57091j(TodoListViewModel dVar) {
            this.f140774a = dVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper.ITipShowListener
        /* renamed from: a */
        public void mo191923a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tipsStr");
            this.f140774a.getModel().mo193563U().mo5926a(new TodoListToastUnit(0, OperationToastHelper.ToastType.PROMPT, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewModel$registerTodoChangeNotificationPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$m */
    public static final class C57094m implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoListViewModel f140776a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57094m(TodoListViewModel dVar) {
            this.f140776a = dVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191769b("pushTodoChangeNotification"));
            Object obj = jSONObject.get("todo_change_notification");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…E_NOTIFICATION] ?: return");
                if (obj instanceof TodoChangeNotificationUnit) {
                    this.f140776a.updateTodoListByPush((TodoChangeNotificationUnit) obj);
                }
            }
        }
    }

    public final void setAddedTodoGuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.addedTodoGuid = str;
    }

    public final boolean isShowBadgeOverdue(TodoBadgeConfig todoBadgeConfig) {
        Boolean bool;
        if (todoBadgeConfig == null || (bool = todoBadgeConfig.enable) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void refreshListAndHandleBadge(DataResult<TodoListResult> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dataResult");
        this.model.ag();
        generateTodoViewDataByTodoList(aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean isCustomCompleteStrategy(CustomComplete.Action action) {
        Intrinsics.checkParameterIsNotNull(action, "completeAction");
        return CustomCompleteHelper.f139396a.mo191997a(getContext(), action, new C57091j(this));
    }

    public final boolean isShowBadgeToday(TodoBadgeConfig todoBadgeConfig) {
        TodoBadgeConfig.BadgeType badgeType;
        if (isShowBadgeOverdue(todoBadgeConfig)) {
            if (todoBadgeConfig != null) {
                badgeType = todoBadgeConfig.type;
            } else {
                badgeType = null;
            }
            if (badgeType == TodoBadgeConfig.BadgeType.OVERDUE_AND_TODAY) {
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$g */
    static final class C57088g<T> implements AbstractC1178x<TodoBadgeConfig> {

        /* renamed from: a */
        final /* synthetic */ TodoListViewModel f140771a;

        C57088g(TodoListViewModel dVar) {
            this.f140771a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(TodoBadgeConfig todoBadgeConfig) {
            this.f140771a.getModel().mo193605v().mo5929b(new Pair<>(Boolean.valueOf(this.f140771a.isShowBadgeOverdue(todoBadgeConfig)), Boolean.valueOf(this.f140771a.isShowBadgeToday(todoBadgeConfig))));
            this.f140771a.refreshTodoDisplayDatas();
        }
    }

    private final void loadPagingDatas(boolean z) {
        int i = C57099e.f140782b[this.model.ae().ordinal()];
        if (i == 1) {
            this.model.mo193553K().mo5926a(Boolean.valueOf(z));
        } else if (i == 2) {
            this.model.mo193552J().mo5926a(Boolean.valueOf(z));
        }
    }

    public final void clickEnterDetail(String str) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        DetailEntrance.m220107a(DetailEntrance.f139694a, getContext(), str, true, (String) null, (String) null, (String) null, (String) null, (int) SmEvents.EVENT_NW, (Object) null);
        TodoHitPoint.m221727a(this.model.ae(), str);
        TodoGeneralHitPoint.f141070a.mo194190c(str);
    }

    public final boolean isFullDataType(TodoListView.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "$this$isFullDataType");
        return CollectionsKt.listOf((Object[]) new TodoListView.Type[]{TodoListView.Type.ALL, TodoListView.Type.ASSIGN_FROM_ME, TodoListView.Type.ASSIGN_TO_ME, TodoListView.Type.FOLLOWED}).contains(type);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$activateTodo$2", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {416}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$b */
    public static final class C57083b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        final /* synthetic */ MarkTodoCompletedRequest.Type $type;
        final /* synthetic */ List $userIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57083b(TodoListViewModel dVar, String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoGuid = str;
            this.$todoSource = todoSource;
            this.$type = type;
            this.$userIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57083b bVar = new C57083b(this.this$0, this.$todoGuid, this.$todoSource, this.$type, this.$userIds, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57083b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "activateTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                TodoSource todoSource = this.$todoSource;
                MarkTodoCompletedRequest.Type type = this.$type;
                List<String> list = this.$userIds;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "activateTodo";
                this.label = 1;
                if (fVar.mo194311a(str, false, todoSource, type, list, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                String str2 = (String) this.L$2;
                String str3 = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.showOperationSuccessToast();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$changeTodoCompleteStatus$1", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 1}, mo239175l = {613, 615}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$c */
    public static final class C57084c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTargetComplete;
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57084c(TodoListViewModel dVar, String str, boolean z, TodoSource todoSource, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoGuid = str;
            this.$isTargetComplete = z;
            this.$todoSource = todoSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57084c cVar2 = new C57084c(this.this$0, this.$todoGuid, this.$isTargetComplete, this.$todoSource, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57084c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoGeneralHitPoint.f141070a.mo194180a(this.$todoGuid, this.$isTargetComplete, "done_all_task");
                if (!this.$isTargetComplete) {
                    TodoListViewModel dVar = this.this$0;
                    String str = this.$todoGuid;
                    TodoSource todoSource = this.$todoSource;
                    MarkTodoCompletedRequest.Type type = MarkTodoCompletedRequest.Type.Todo;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (TodoListViewModel.activateTodo$default(dVar, str, todoSource, type, null, this, 8, null) == a) {
                        return a;
                    }
                } else {
                    TodoListViewModel dVar2 = this.this$0;
                    String str2 = this.$todoGuid;
                    TodoSource todoSource2 = this.$todoSource;
                    MarkTodoCompletedRequest.Type type2 = MarkTodoCompletedRequest.Type.Todo;
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (TodoListViewModel.completeTodo$default(dVar2, str2, todoSource2, type2, null, this, 8, null) == a) {
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
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$completeTodo$2", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {402}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$e */
    public static final class C57086e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        final /* synthetic */ MarkTodoCompletedRequest.Type $type;
        final /* synthetic */ List $userIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57086e(TodoListViewModel dVar, String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoGuid = str;
            this.$todoSource = todoSource;
            this.$type = type;
            this.$userIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57086e eVar = new C57086e(this.this$0, this.$todoGuid, this.$todoSource, this.$type, this.$userIds, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57086e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "completeTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                TodoSource todoSource = this.$todoSource;
                MarkTodoCompletedRequest.Type type = this.$type;
                List<String> list = this.$userIds;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "completeTodo";
                this.label = 1;
                if (fVar.mo194311a(str, true, todoSource, type, list, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                String str2 = (String) this.L$2;
                String str3 = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.showOperationSuccessToast();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$setCompleted$1", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 1}, mo239175l = {328, 330}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$n */
    static final class C57095n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTargetCompleted;
        final /* synthetic */ MultiCompleteHelper.MultiCompleteType $multiCompleteType;
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57095n(TodoListViewModel dVar, TodoSource todoSource, String str, boolean z, MultiCompleteHelper.MultiCompleteType multiCompleteType, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoSource = todoSource;
            this.$todoGuid = str;
            this.$isTargetCompleted = z;
            this.$multiCompleteType = multiCompleteType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57095n nVar = new C57095n(this.this$0, this.$todoSource, this.$todoGuid, this.$isTargetCompleted, this.$multiCompleteType, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57095n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                VibrateUtil.f139263a.mo191785a();
                if (MultiCompleteHelper.f139390a.mo191984a(this.$todoSource)) {
                    TodoListViewModel dVar = this.this$0;
                    String str = this.$todoGuid;
                    boolean z = this.$isTargetCompleted;
                    TodoSource todoSource = this.$todoSource;
                    MultiCompleteHelper.MultiCompleteType multiCompleteType = this.$multiCompleteType;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (dVar.completeInMultiStrategy(str, z, todoSource, multiCompleteType, this) == a) {
                        return a;
                    }
                } else {
                    TodoListViewModel dVar2 = this.this$0;
                    String str2 = this.$todoGuid;
                    boolean z2 = this.$isTargetCompleted;
                    TodoSource todoSource2 = this.$todoSource;
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (dVar2.completeOutMultiAssignee(str2, z2, todoSource2, this) == a) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$updateTodoByDeleteStatus$1", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 1, 2}, mo239175l = {429, 430, 431}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$p */
    static final class C57097p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoItemViewData.BehindDeleteStatus $behindDeleteStatus;
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57097p(TodoListViewModel dVar, TodoItemViewData.BehindDeleteStatus behindDeleteStatus, String str, TodoSource todoSource, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$behindDeleteStatus = behindDeleteStatus;
            this.$todoGuid = str;
            this.$todoSource = todoSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57097p pVar = new C57097p(this.this$0, this.$behindDeleteStatus, this.$todoGuid, this.$todoSource, cVar);
            pVar.p$ = (CoroutineScope) obj;
            return pVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57097p) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                int i2 = C57099e.f140785e[this.$behindDeleteStatus.ordinal()];
                if (i2 == 1) {
                    TodoListViewModel dVar = this.this$0;
                    String str = this.$todoGuid;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (dVar.deleteTodo(str, this) == a) {
                        return a;
                    }
                } else if (i2 == 2) {
                    TodoListViewModel dVar2 = this.this$0;
                    String str2 = this.$todoGuid;
                    TodoSource todoSource = this.$todoSource;
                    TodoListView.Type ae = dVar2.getModel().ae();
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (dVar2.quitTodo(str2, todoSource, ae, this) == a) {
                        return a;
                    }
                } else if (i2 == 3) {
                    TodoListViewModel dVar3 = this.this$0;
                    String str3 = this.$todoGuid;
                    TodoSource todoSource2 = this.$todoSource;
                    TodoListView.Type ae2 = dVar3.getModel().ae();
                    this.L$0 = ahVar;
                    this.label = 3;
                    if (dVar3.unfollowTodo(str3, todoSource2, ae2, this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2 || i == 3) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoListViewModel(IViewModelAbility<TodoMainModel2> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
        registerSystemTimeZoneReceiver();
        registerTimeFormatChangePush();
        registerTodoChangeNotificationPush();
        clearCompletedListItem();
        resetTitleStateMap();
        EventBus.getDefault().register(this);
    }

    private final String getEmptyStrByFilterType(TodoListView.Type type) {
        switch (C57099e.f140787g[type.ordinal()]) {
            case 1:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_TaskEmpty);
            case 2:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_AssignedTaskEmptyTip);
            case 3:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_ReceivedTaskEmpty);
            case 4:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_FinishedTaskEmpty);
            case 5:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_FollowingTaskEmpty);
            case 6:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTaskFromDocsEmptyState);
            default:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_TaskEmpty);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i != 1) {
            if (i == 2) {
                this.model.mo193607x().mo5929b((Boolean) true);
                return;
            } else if (i != 3) {
                if (i == 501) {
                    this.model.mo193574a(false);
                    return;
                } else if (i == 502) {
                    this.model.mo193574a(true);
                    return;
                } else if (i == 1502) {
                    getFirstPageData();
                    return;
                } else {
                    return;
                }
            }
        }
        this.model.mo193555M().mo5926a((Boolean) true);
    }

    public final void resetTitleExpandState(TodoListView.Type type) {
        if (type != null) {
            int i = C57099e.f140781a[type.ordinal()];
            if (i == 1) {
                midTitleState.put(TodoListView.Type.ALL, getTitleStateMap());
            } else if (i == 2) {
                midTitleState.put(TodoListView.Type.ASSIGN_FROM_ME, getTitleStateMap());
            } else if (i == 3) {
                midTitleState.put(TodoListView.Type.ASSIGN_TO_ME, getTitleStateMap());
            } else if (i == 4) {
                midTitleState.put(TodoListView.Type.FOLLOWED, getTitleStateMap());
            } else if (i == 5) {
                midTitleState.put(TodoListView.Type.FROM_DOC, getDocsTitleStateMap());
            }
        }
    }

    public final void updateTodoListByPush(TodoChangeNotificationUnit todoChangeNotificationUnit) {
        Intrinsics.checkParameterIsNotNull(todoChangeNotificationUnit, "pushData");
        Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191769b("updateTodoListByPush"));
        ChangedTodoCollection changedTodoCollection = todoChangeNotificationUnit.getChangedTodoCollection();
        if (changedTodoCollection == null) {
            return;
        }
        if (isFullDataType(this.model.ae())) {
            this.model.mo193549G().mo5926a((Boolean) true);
        } else if (this.model.ae() == TodoListView.Type.COMPLETED) {
            this.model.mo193550H().mo5926a(changedTodoCollection);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$deleteTodo$2", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {441}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$f */
    public static final class C57087f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57087f(TodoListViewModel dVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoGuid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57087f fVar = new C57087f(this.this$0, this.$todoGuid, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57087f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "deleteTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "deleteTodo";
                this.label = 1;
                obj = fVar.mo194315c(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                String str2 = (String) this.L$2;
                String str3 = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_common_ActionFailedTryAgainLater, OperationToastHelper.ToastType.FAIL, null, 4, null));
            } else {
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_Task_TaskDeleted, OperationToastHelper.ToastType.SUCCESS, null, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$quitTodo$2", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {458}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$k */
    public static final class C57092k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57092k(TodoListViewModel dVar, String str, TodoSource todoSource, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoGuid = str;
            this.$todoSource = todoSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57092k kVar = new C57092k(this.this$0, this.$todoGuid, this.$todoSource, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57092k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "quitTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                TodoSource todoSource = this.$todoSource;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "quitTodo";
                this.label = 1;
                obj = fVar.mo194305a(str, todoSource, this);
                if (obj == a) {
                    return a;
                }
            } else if (i2 == 1) {
                String str2 = (String) this.L$2;
                String str3 = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_Task_LeaveTaskConfirmToast, OperationToastHelper.ToastType.SUCCESS, null, 4, null));
            } else {
                if (this.$todoSource == TodoSource.OAPI) {
                    i = R.string.Todo_Tasks_APICantExit;
                } else {
                    i = R.string.Todo_common_ActionFailedTryAgainLater;
                }
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(i, OperationToastHelper.ToastType.FAIL, null, 4, null));
            }
            if (this.$todoSource == TodoSource.DOC) {
                this.this$0.getModel().mo193551I().mo5926a(this.$todoGuid);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel$unfollowTodo$2", mo239173f = "TodoListViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {478}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d$o */
    public static final class C57096o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57096o(TodoListViewModel dVar, String str, TodoSource todoSource, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$todoGuid = str;
            this.$todoSource = todoSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57096o oVar = new C57096o(this.this$0, this.$todoGuid, this.$todoSource, cVar);
            oVar.p$ = (CoroutineScope) obj;
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57096o) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<TodoFollower> list;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoListViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "unFollowTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "unFollowTodo";
                this.label = 1;
                obj = fVar.mo194304a(str, (AuthScene) null, false, (Continuation<? super SdkResponse<FollowTodoResponse>>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                String str2 = (String) this.L$2;
                String str3 = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194252b() != null) {
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_common_ActionFailedTryAgainLater, OperationToastHelper.ToastType.FAIL, null, 4, null));
                return Unit.INSTANCE;
            }
            FollowTodoResponse followTodoResponse = (FollowTodoResponse) bVar.mo194251a();
            if (followTodoResponse == null) {
                return null;
            }
            String a2 = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
            Todo todo = followTodoResponse.todo;
            if (!(todo == null || (list = todo.followers) == null)) {
                List<TodoFollower> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().follower_id);
                }
                Boolean a3 = C69089a.m265837a(arrayList.contains(a2));
                if (a3 != null) {
                    z = a3.booleanValue();
                }
            }
            if (this.$todoSource == TodoSource.DOC) {
                this.this$0.getModel().mo193551I().mo5926a(this.$todoGuid);
            }
            if (!z) {
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_Task_UnfollowConfirmToast, OperationToastHelper.ToastType.SUCCESS, null, 4, null));
            } else {
                this.this$0.getModel().mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_common_ActionFailedTryAgainLater, OperationToastHelper.ToastType.FAIL, null, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    private final void generateTodoViewDataByTodoList(DataResult<TodoListResult> aVar) {
        TodoListView.Type ae = this.model.ae();
        TodoSortType af = this.model.af();
        if (aVar instanceof DataResult.DataSuccess) {
            DataResult.DataSuccess cVar = (DataResult.DataSuccess) aVar;
            if (((TodoListResult) cVar.mo194115a()).mo193518b() != ae) {
                Log.m165383e("TodoListViewModel", "belongFilter cannot match current filter");
                return;
            }
            List<TodoItemViewData> a = TodoListHelper.f140764a.mo193768a(ResUtil.f139261a.mo191776a(), ((TodoListResult) cVar.mo194115a()).mo193517a(), this.timeFormatDependency.mo145434b(), ae, af, midTitleState.get(ae), isShowBadgeOverdue(this.model.mo193545C().mo5927b()), isShowBadgeToday(this.model.mo193545C().mo5927b()));
            List<TodoItemViewData> list = a;
            if ((!list.isEmpty()) && af == TodoSortType.CREATE_TIME) {
                a.get(a.size() - 1).mo193845i().mo193864b(true);
                a.get(0).mo193845i().mo193862a(true);
            }
            this.model.mo193597n().mo5926a(a);
            this.model.mo193561S().mo5926a(TodoFetchStatus.SUCCESS);
            this.model.mo193557O().mo5926a(Boolean.valueOf(CollectionUtils.isEmpty(list)));
            this.model.mo193559Q().mo5926a(getEmptyStrByFilterType(this.model.ae()));
            if (this.isAddedScene) {
                this.model.mo193601r().mo5926a(this.addedTodoGuid);
                this.isAddedScene = false;
            }
        } else if (!(aVar instanceof DataResult.DataError)) {
        } else {
            if (Intrinsics.areEqual(((DataResult.DataError) aVar).mo194112a().getMessage(), "fetch first page error")) {
                this.model.mo193597n().mo5926a(CollectionsKt.emptyList());
                this.model.mo193561S().mo5926a(TodoFetchStatus.FIRST_PAGE_FAILED);
                return;
            }
            this.model.mo193561S().mo5926a(TodoFetchStatus.NEXT_PAGE_FAILED);
        }
    }

    private final void loadMoreTodoDatas(boolean z, int i) {
        if (z) {
            loadPagingDatas(false);
        } else if (!this.compeletedListItemsSet.contains(Integer.valueOf(i))) {
            loadPagingDatas(false);
            this.compeletedListItemsSet.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object deleteTodo(String str, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57087f(this, str, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    public final void changeTitleState(TodoItemViewData.TitleType titleType, boolean z) {
        Intrinsics.checkParameterIsNotNull(titleType, "titleType");
        HashMap<TodoItemViewData.TitleType, Boolean> hashMap = midTitleState.get(this.model.ae());
        if (hashMap != null) {
            Intrinsics.checkExpressionValueIsNotNull(hashMap, "midTitleState[model.getTodoFilterType()] ?: return");
            hashMap.put(titleType, Boolean.valueOf(z));
            refreshTodoDisplayDatas();
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i != 503) {
            if (i != 1005) {
                if (i != 1503) {
                    if (i == 1504 && (bVar instanceof ConfirmActionData) && isFullDataType(this.model.ae())) {
                        ConfirmActionData cVar = (ConfirmActionData) bVar;
                        changeTodoCompleteStatus(true, cVar.mo193496a(), cVar.mo193497b());
                    }
                } else if ((bVar instanceof ConfirmActionData) && this.model.ae() == TodoListView.Type.COMPLETED) {
                    ConfirmActionData cVar2 = (ConfirmActionData) bVar;
                    changeTodoCompleteStatus(false, cVar2.mo193496a(), cVar2.mo193497b());
                }
            } else if (bVar instanceof TitleActionData) {
                TitleActionData fVar = (TitleActionData) bVar;
                changeTitleState(fVar.mo193512a(), fVar.mo193513b());
            }
        } else if (!(bVar instanceof LoadMoreActionData)) {
        } else {
            if (this.model.ae() == TodoListView.Type.COMPLETED || this.model.ae() == TodoListView.Type.FROM_DOC) {
                LoadMoreActionData eVar = (LoadMoreActionData) bVar;
                loadMoreTodoDatas(eVar.mo193507a(), eVar.mo193508b());
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_android_lark_todo_impl_features_mainview2_widget_list_TodoListViewModel_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    private final void changeTodoCompleteStatus(boolean z, String str, TodoSource todoSource) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57084c(this, str, z, todoSource, null), 3, null);
    }

    /* access modifiers changed from: protected */
    public final void updateTodoByDeleteStatus(String str, TodoItemViewData.BehindDeleteStatus behindDeleteStatus, TodoSource todoSource) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(behindDeleteStatus, "behindDeleteStatus");
        Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57097p(this, behindDeleteStatus, str, todoSource, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object quitTodo(String str, TodoSource todoSource, TodoListView.Type type, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57092k(this, str, todoSource, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object unfollowTodo(String str, TodoSource todoSource, TodoListView.Type type, Continuation<? super Unit> cVar) {
        return C69388e.m266829a(Dispatchers.m266326d(), new C57096o(this, str, todoSource, null), cVar);
    }

    /* access modifiers changed from: protected */
    public final void setCompleted(String str, boolean z, TodoSource todoSource, MultiCompleteHelper.MultiCompleteType multiCompleteType) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
        Intrinsics.checkParameterIsNotNull(multiCompleteType, "multiCompleteType");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C57095n(this, todoSource, str, z, multiCompleteType, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object completeOutMultiAssignee(String str, boolean z, TodoSource todoSource, Continuation<? super Unit> cVar) {
        TodoGeneralHitPoint.f141070a.mo194180a(str, z, "done_task");
        if (!z) {
            TodoHitPoint.m221744b(str);
            Object activateTodo$default = activateTodo$default(this, str, todoSource, null, null, cVar, 12, null);
            if (activateTodo$default == C69086a.m265828a()) {
                return activateTodo$default;
            }
        } else {
            TodoHitPoint.m221731a(str, TodoHitPoint.f141073a.mo194222b(this.model.ae()));
            Object completeTodo$default = completeTodo$default(this, str, todoSource, null, null, cVar, 12, null);
            if (completeTodo$default == C69086a.m265828a()) {
                return completeTodo$default;
            }
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object activateTodo(String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List<String> list, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57083b(this, str, todoSource, type, list, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object completeTodo(String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List<String> list, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C57086e(this, str, todoSource, type, list, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object completeInMultiStrategy(java.lang.String r8, boolean r9, com.bytedance.lark.pb.todo.v1.TodoSource r10, com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.MultiCompleteType r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewModel.completeInMultiStrategy(java.lang.String, boolean, com.bytedance.lark.pb.todo.v1.TodoSource, com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$MultiCompleteType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object activateTodo$default(TodoListViewModel dVar, String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                type = MarkTodoCompletedRequest.Type.Todo;
            }
            if ((i & 8) != 0) {
                list = new ArrayList();
            }
            return dVar.activateTodo(str, todoSource, type, list, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activateTodo");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object completeTodo$default(TodoListViewModel dVar, String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                type = MarkTodoCompletedRequest.Type.Todo;
            }
            if ((i & 8) != 0) {
                list = new ArrayList();
            }
            return dVar.completeTodo(str, todoSource, type, list, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeTodo");
    }
}
