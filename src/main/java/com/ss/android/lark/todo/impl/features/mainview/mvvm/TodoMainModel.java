package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.GetPagingTodosRequest;
import com.bytedance.lark.pb.todo.v1.ListDocTodosRequest;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.LoadTitleType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListData;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoPagingUnit;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper.ListComparatorHelper;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.perf.TodoSlardarPerfHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoListSDKService;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b8\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000603H@ø\u0001\u0000¢\u0006\u0002\u00104J\b\u00105\u001a\u00020,H\u0002J9\u00106\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000603H@ø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u00107\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u00108J\u0019\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u0019H@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0011\u0010<\u001a\u00020,H@ø\u0001\u0000¢\u0006\u0002\u0010;J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020\f032\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u000103H\u0002J+\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010EJ#\u0010F\u001a\u00020,2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020\f032\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u000103H\u0002J\u0019\u0010I\u001a\u00020,2\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u00020,2\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010JJ1\u0010L\u001a\u00020,2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001032\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020NH@ø\u0001\u0000¢\u0006\u0002\u0010OJ\b\u0010P\u001a\u00020\u0012H\u0002J\u0010\u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u0004H\u0002J\u0016\u0010S\u001a\u00020,2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0002J\u0016\u0010T\u001a\u00020,2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\f03H\u0002J\u0016\u0010U\u001a\u00020,2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\f03H\u0002J\b\u0010V\u001a\u00020,H\u0002J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00120\bJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00120\bJ\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016J\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00170\bJ\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0016J\u0014\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\bH\u0016J\u0018\u0010`\u001a\u00020,2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u000103H\u0002J+\u0010a\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010bJ\u0018\u0010c\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010@\u001a\u00020AH\u0002J)\u0010d\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00062\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010fJ)\u0010g\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00122\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010iJ)\u0010j\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u00122\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010iJ\u0010\u0010l\u001a\u00020,2\u0006\u0010m\u001a\u00020\fH\u0002J!\u0010n\u001a\u00020,2\u0006\u0010o\u001a\u00020\u00122\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010pJ\u0010\u0010q\u001a\u00020,2\u0006\u0010m\u001a\u00020\fH\u0002J\u0018\u0010r\u001a\u00020,2\u0006\u0010m\u001a\u00020\f2\u0006\u0010h\u001a\u00020\u0012H\u0002J\u0019\u0010s\u001a\u00020,2\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010JJ)\u0010t\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00122\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010iJ!\u0010u\u001a\u00020,2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020NH@ø\u0001\u0000¢\u0006\u0002\u0010vJ\u0011\u0010w\u001a\u00020,H@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0019\u0010x\u001a\u00020,2\u0006\u0010y\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010zJ\u001b\u0010{\u001a\u00020,2\b\u0010B\u001a\u0004\u0018\u00010CH@ø\u0001\u0000¢\u0006\u0002\u0010|J\b\u0010}\u001a\u00020,H\u0002J\u0018\u0010~\u001a\u00020,2\u0006\u0010B\u001a\u00020N2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J.\u0010\u0001\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0002\u0010bJH\u0010\u0001\u001a\u00020,2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006032\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006032\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006032\u0006\u0010@\u001a\u00020AH@ø\u0001\u0000¢\u0006\u0003\u0010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\"X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060 X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\"X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060 X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\"X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\"X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainModel;", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/ITodoMainModel;", "()V", "PAGE_SIZE", "", "TAG", "", "mBadgeSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "mCompleteComparator", "Ljava/util/Comparator;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "Lkotlin/Comparator;", "mCreateTimeComparator", "mIoDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mIsFetchColdLaunchData", "", "mLoadDocsDoingMore", "mLoadDocsDoneMore", "mLoadMoreLiveData", "mLoadTitleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/LoadTitleType;", "mObservableTasks", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListResult;", "mOperationToast", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "mPageDocsDoingPosition", "mPageDocsDonePosition", "mPagingDataSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mPagingDocsDataList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mPagingDocsDataSet", "mPagingDocsDoingDataList", "mPagingDocsDoingDataSet", "mPagingDocsDoneDataList", "mPagingDocsDoneDataSet", "mPagingTodoDataList", "mShowDonePage", "midStoreData", "activateTodo", "", "todoGuid", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/todo/v1/MarkTodoCompletedRequest$Type;", "userIds", "", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/bytedance/lark/pb/todo/v1/MarkTodoCompletedRequest$Type;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearDocsData", "completeTodo", "deleteTodo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTodoViews", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBadgeSetting", "getCreateTimeSortList", "todos", "getDocsDoingPageData", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "sortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "isFetchFirstPage", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lcom/bytedance/lark/pb/todo/v1/TodoSortType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocsDonePageData", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lcom/bytedance/lark/pb/todo/v1/TodoSortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDueTimeSortList", "getFirstPageData", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextPageData", "handleGetUrlPreview", "todoList", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "(Ljava/util/List;Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCanLoadMore", "isInListTimeRange", "completedMilliTime", "mergeAndSortList", "mergeDocsDoingList", "mergeDocsDoneList", "mergeDocsList", "observeBadgeSetting", "observeCanLoadDocsDoingMore", "observeCanLoadDocsDoneMore", "observeCanLoadMore", "observeDocsDoingPagePosition", "observeDocsDonePagePosition", "observeDocsLoadTitleType", "observeOperation", "observeTodoList", "perfHitPointEnd", "quitTodo", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDeleteDocs", "refreshDocsAssigneePage", "assignId", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDocsCompletePage", "is_completed", "(Ljava/lang/String;ZLcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDocsDeletePage", "success", "refreshDocsDoingPageComplete", "todo", "refreshDocsDoneList", "showDone", "(ZLcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDocsDonePageComplete", "refreshDocsPageComplete", "refreshExistPageData", "refreshTodoDocsComplete", "refreshTodosByFilter", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTodosEndTime", "refreshTodosWithAddedTodo", "addedTodo", "(Lcom/bytedance/lark/pb/todo/v1/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePageDocsDonePageData", "(Lcom/bytedance/lark/pb/todo/v1/TodoSortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortPagingList", "sortStoreTodos", "unFollowToastError", "unfollowTodo", "updatePagingData", "addedTodoIds", "updatedTodoIds", "deletedTodoIds", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d */
public final class TodoMainModel {

    /* renamed from: a */
    public static final TodoMainModel f140434a = new TodoMainModel();

    /* renamed from: b */
    private static final CoroutineDispatcher f140435b = Dispatchers.m266326d();

    /* renamed from: c */
    private static final C1177w<DataResult<TodoListResult>> f140436c = new C1177w<>();

    /* renamed from: d */
    private static final C1177w<TodoListToastUnit> f140437d = new C1177w<>();

    /* renamed from: e */
    private static final C1177w<TodoBadgeConfig> f140438e = new C1177w<>();

    /* renamed from: f */
    private static final Comparator<Todo> f140439f = C56878n.f140460a;

    /* renamed from: g */
    private static final CopyOnWriteArrayList<Todo> f140440g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    private static final Comparator<Todo> f140441h = C56879o.f140461a;

    /* renamed from: i */
    private static final CopyOnWriteArraySet<String> f140442i = new CopyOnWriteArraySet<>();

    /* renamed from: j */
    private static final CopyOnWriteArrayList<Todo> f140443j = new CopyOnWriteArrayList<>();

    /* renamed from: k */
    private static final CopyOnWriteArrayList<String> f140444k = new CopyOnWriteArrayList<>();

    /* renamed from: l */
    private static final CopyOnWriteArrayList<Todo> f140445l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    private static final CopyOnWriteArraySet<String> f140446m = new CopyOnWriteArraySet<>();

    /* renamed from: n */
    private static final CopyOnWriteArrayList<Todo> f140447n = new CopyOnWriteArrayList<>();

    /* renamed from: o */
    private static final CopyOnWriteArraySet<String> f140448o = new CopyOnWriteArraySet<>();

    /* renamed from: p */
    private static final CopyOnWriteArrayList<Todo> f140449p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    private static final C1177w<Boolean> f140450q = new C1177w<>();

    /* renamed from: r */
    private static final C1177w<Boolean> f140451r = new C1177w<>();

    /* renamed from: s */
    private static final C1177w<Boolean> f140452s = new C1177w<>();

    /* renamed from: t */
    private static final C1177w<Long> f140453t = new C1177w<>();

    /* renamed from: u */
    private static final C1177w<Long> f140454u = new C1177w<>();

    /* renamed from: v */
    private static final C1177w<Boolean> f140455v = new C1177w<>();

    /* renamed from: w */
    private static final C1177w<LoadTitleType> f140456w = new C1177w<>();

    /* renamed from: x */
    private static boolean f140457x = true;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"refreshTodosWithAddedTodo", "", "addedTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0}, mo239175l = {305}, mo239176m = "refreshTodosWithAddedTodo", mo239177n = {"this", "addedTodo"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ab */
    public static final class C56859ab extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56859ab(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193292a((Todo) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@"}, d2 = {"updatePagingData", "", "addedTodoIds", "", "", "updatedTodoIds", "deletedTodoIds", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {577}, mo239176m = "updatePagingData", mo239177n = {"this", "addedTodoIds", "updatedTodoIds", "deletedTodoIds", "currentFilter"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$af */
    public static final class C56863af extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56863af(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193303a((List<String>) null, (List<String>) null, (List<String>) null, (TodoFilterType) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"deleteTodo", "", "todoGuid", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0}, mo239175l = {685}, mo239176m = "deleteTodo", mo239177n = {"this", "todoGuid"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$c */
    public static final class C56866c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56866c(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193301a((String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"getBadgeSetting", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0}, mo239175l = {281}, mo239176m = "getBadgeSetting", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$f */
    public static final class C56869f extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56869f(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193318b(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"getFirstPageData", "", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0}, mo239175l = {334}, mo239176m = "getFirstPageData", mo239177n = {"this", "currentFilter"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$j */
    public static final class C56874j extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56874j(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193297a((TodoFilterType) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"getNextPageData", "", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0}, mo239175l = {358}, mo239176m = "getNextPageData", mo239177n = {"this", "currentFilter"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$l */
    public static final class C56876l extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56876l(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193314b(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"refreshExistPageData", "", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0}, mo239175l = {479}, mo239176m = "refreshExistPageData", mo239177n = {"this", "currentFilter"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$u */
    public static final class C56885u extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56885u(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193322c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, d2 = {"refreshTodosByFilter", "", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "sortType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0}, mo239175l = {146}, mo239176m = "refreshTodosByFilter", mo239177n = {"this", "currentFilter", "sortType"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$x */
    public static final class C56888x extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56888x(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193296a((TodoFilterType) null, (SortDialog.SortType) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"refreshTodosEndTime", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel", mo239173f = "TodoMainModel.kt", mo239174i = {0}, mo239175l = {LocationRequest.PRIORITY_INDOOR}, mo239176m = "refreshTodosEndTime", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$z */
    public static final class C56890z extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56890z(TodoMainModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo193324c(this);
        }
    }

    private TodoMainModel() {
    }

    /* renamed from: a */
    public Object mo193304a(Continuation<? super DataResult<TodoListData>> cVar) {
        return C69388e.m266829a(f140435b, new C56868e(null), cVar);
    }

    /* renamed from: a */
    public final void mo193310a(List<Todo> list) {
        if (f140457x) {
            List<Todo> list2 = list;
            TodoSlardarPerfHitPoint.f141078a.mo194235b(list2 == null || list2.isEmpty());
            f140457x = false;
        }
    }

    /* renamed from: a */
    public void mo193309a(SortDialog.SortType sortType, TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(sortType, "sortType");
        Intrinsics.checkParameterIsNotNull(todoFilterType, "currentFilter");
        if (sortType == SortDialog.SortType.CREATE_TIME) {
            f140436c.mo5926a(new DataResult.DataSuccess(new TodoListResult(mo193325c(f140440g), todoFilterType)));
        } else {
            f140436c.mo5926a(new DataResult.DataSuccess(new TodoListResult(mo193319b(f140440g), todoFilterType)));
        }
    }

    /* renamed from: a */
    public final Object mo193305a(boolean z, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56884t(z, todoFilterType, null), cVar);
        return a == C69086a.m265828a() ? a : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo193311a(CopyOnWriteArrayList<Todo> copyOnWriteArrayList) {
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            Todo todo = copyOnWriteArrayList.get(i);
            CopyOnWriteArraySet<String> copyOnWriteArraySet = f140442i;
            if (!copyOnWriteArraySet.contains(todo.guid)) {
                copyOnWriteArraySet.add(todo.guid);
                f140443j.add(todo);
            } else {
                try {
                    int size2 = f140443j.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        CopyOnWriteArrayList<Todo> copyOnWriteArrayList2 = f140443j;
                        if (Intrinsics.areEqual(copyOnWriteArrayList2.get(i2).guid, todo.guid)) {
                            copyOnWriteArrayList2.set(i2, todo);
                        }
                    }
                } catch (Throwable th) {
                    Log.m165383e("TodoMainModel", th.getMessage());
                }
            }
        }
        m220946m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193303a(java.util.List<java.lang.String> r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193303a(java.util.List, java.util.List, java.util.List, com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final boolean mo193312a(long j) {
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList = f140443j;
        if (!CollectionUtils.isEmpty(copyOnWriteArrayList) && j >= MultiCompleteHelper.f139390a.mo191979a(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193301a(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56866c
            if (r0 == 0) goto L_0x0014
            r0 = r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$c r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56866c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$c r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$c
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r6 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r6
            kotlin.C69097g.m265891a(r7)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C69097g.m265891a(r7)
            kotlinx.coroutines.ac r7 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r7 = (kotlin.coroutines.CoroutineContext) r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$d r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$d
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r7, r2, r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193301a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo193299a(String str, TodoSource todoSource, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56880p(str, todoSource, todoFilterType, null), cVar);
        return a == C69086a.m265828a() ? a : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo193308a(TodoSource todoSource) {
        f140437d.mo5926a(new TodoListToastUnit(todoSource == TodoSource.OAPI ? R.string.Todo_Task_CantCancelFollow : R.string.Todo_common_ActionFailedTryAgainLater, OperationToastHelper.ToastType.FAIL, null, 4, null));
    }

    /* renamed from: a */
    public final Object mo193302a(String str, boolean z, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56887w(str, z, todoFilterType, null), cVar);
        return a == C69086a.m265828a() ? a : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo193306a(Todo todo) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f140448o.remove(todo.guid);
        for (T t : f140449p) {
            if (!Intrinsics.areEqual(t.guid, todo.guid)) {
                arrayList2.add(t);
            }
        }
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList = f140449p;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList2);
        f140446m.add(todo.guid);
        arrayList.add(todo.newBuilder().mo66622a(Long.valueOf(System.currentTimeMillis())).build());
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList2 = f140447n;
        arrayList.addAll(copyOnWriteArrayList2);
        copyOnWriteArrayList2.clear();
        copyOnWriteArrayList2.addAll(arrayList);
    }

    /* renamed from: a */
    public final Object mo193300a(String str, String str2, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56881q(str2, str, todoFilterType, null), cVar);
        return a == C69086a.m265828a() ? a : Unit.INSTANCE;
    }

    /* renamed from: a */
    public C1177w<DataResult<TodoListResult>> mo193291a() {
        return f140436c;
    }

    /* renamed from: b */
    public C1177w<Boolean> mo193313b() {
        return f140452s;
    }

    /* renamed from: c */
    public C1177w<TodoListToastUnit> mo193321c() {
        return f140437d;
    }

    /* renamed from: d */
    public C1177w<TodoBadgeConfig> mo193326d() {
        return f140438e;
    }

    /* renamed from: e */
    public final C1177w<Boolean> mo193328e() {
        return f140451r;
    }

    /* renamed from: f */
    public final C1177w<Boolean> mo193330f() {
        return f140450q;
    }

    /* renamed from: g */
    public final C1177w<Long> mo193331g() {
        return f140453t;
    }

    /* renamed from: h */
    public final C1177w<Long> mo193332h() {
        return f140454u;
    }

    /* renamed from: i */
    public final C1177w<LoadTitleType> mo193333i() {
        return f140456w;
    }

    /* renamed from: k */
    public final boolean mo193335k() {
        Boolean b = f140452s.mo5927b();
        if (b != null) {
            return b.booleanValue();
        }
        return true;
    }

    /* renamed from: m */
    private final void m220946m() {
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList = f140443j;
        Object[] array = copyOnWriteArrayList.toArray(new Todo[0]);
        if (array != null) {
            Todo[] todoArr = (Todo[]) array;
            List listOf = CollectionsKt.listOf((Object[]) ((Todo[]) Arrays.copyOf(todoArr, todoArr.length)));
            Collections.sort(listOf, f140439f);
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(listOf);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: j */
    public final void mo193334j() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f140444k;
        copyOnWriteArrayList.clear();
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList2 = f140445l;
        copyOnWriteArrayList2.clear();
        copyOnWriteArrayList.addAll(f140448o);
        copyOnWriteArrayList2.addAll(f140449p);
        copyOnWriteArrayList.addAll(f140446m);
        copyOnWriteArrayList2.addAll(f140447n);
    }

    /* renamed from: l */
    public final void mo193336l() {
        f140444k.clear();
        f140445l.clear();
        f140448o.clear();
        f140449p.clear();
        f140446m.clear();
        f140447n.clear();
        f140454u.mo5926a((Long) 0L);
        f140453t.mo5926a((Long) 0L);
        f140451r.mo5926a((Boolean) false);
        f140450q.mo5926a((Boolean) true);
        f140456w.mo5926a(LoadTitleType.LOAD_DOING);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshTodosEndTime$2", mo239173f = "TodoMainModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$aa */
    public static final class C56858aa extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;

        C56858aa(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56858aa aaVar = new C56858aa(cVar);
            aaVar.p$ = (CoroutineScope) obj;
            return aaVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56858aa) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                TodoMainModel dVar = TodoMainModel.f140434a;
                C1177w wVar = TodoMainModel.f140436c;
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                wVar.mo5926a(TodoMainModel.f140436c.mo5927b());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$getBadgeSetting$2", mo239173f = "TodoMainModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$g */
    public static final class C56870g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;

        C56870g(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56870g gVar = new C56870g(cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56870g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getTodoSetting", new String[0]));
                TodoSettingService.f141012a.mo194071a(new IGetDataCallback<TodoSetting>("getTodoSetting") {
                    /* class com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56870g.C568711 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Log.m165383e("TodoMainModel", LogMessageUtil.f139260a.mo191766a(valueOf, "getTodoSetting", errorResult));
                    }

                    /* renamed from: a */
                    public void onSuccess(TodoSetting todoSetting) {
                        TodoBadgeConfig todoBadgeConfig;
                        Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191768a(valueOf, "getTodoSetting", new String[0]));
                        if (todoSetting != null && (todoBadgeConfig = todoSetting.badge_config) != null) {
                            TodoMainModel dVar = TodoMainModel.f140434a;
                            TodoMainModel.f140438e.mo5926a(todoBadgeConfig);
                        }
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: c */
    public final List<Todo> mo193325c(List<Todo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        arrayList.addAll(list);
        ArrayList arrayList2 = arrayList;
        Collections.sort(arrayList2, f140441h);
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$activateTodo$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0}, mo239175l = {680}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$a */
    public static final class C56857a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SdkResponse<Todo>>, Object> {
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        final /* synthetic */ MarkTodoCompletedRequest.Type $type;
        final /* synthetic */ List $userIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56857a(String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
            this.$todoSource = todoSource;
            this.$type = type;
            this.$userIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56857a aVar = new C56857a(this.$todoGuid, this.$todoSource, this.$type, this.$userIds, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super SdkResponse<Todo>> cVar) {
            return ((C56857a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, "activateTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                TodoSource todoSource = this.$todoSource;
                MarkTodoCompletedRequest.Type type = this.$type;
                List<String> list = this.$userIds;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "activateTodo";
                this.label = 1;
                obj = fVar.mo194311a(str, false, todoSource, type, list, this);
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
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshTodosWithAddedTodo$2", mo239173f = "TodoMainModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ac */
    public static final class C56860ac extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Todo $addedTodo;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56860ac(Todo todo, Continuation cVar) {
            super(2, cVar);
            this.$addedTodo = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56860ac acVar = new C56860ac(this.$addedTodo, cVar);
            acVar.p$ = (CoroutineScope) obj;
            return acVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56860ac) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                TodoMainModel dVar = TodoMainModel.f140434a;
                DataResult aVar = (DataResult) TodoMainModel.f140436c.mo5927b();
                if (aVar instanceof DataResult.DataSuccess) {
                    DataResult.DataSuccess cVar = (DataResult.DataSuccess) aVar;
                    List<Todo> a = ((TodoListResult) cVar.mo194115a()).mo193211a();
                    if (a == null) {
                        return Unit.INSTANCE;
                    }
                    if (a instanceof ArrayList) {
                        ((ArrayList) a).add(this.$addedTodo);
                    }
                    TodoMainModel dVar2 = TodoMainModel.f140434a;
                    TodoMainModel.f140436c.mo5926a(new DataResult.DataSuccess(new TodoListResult(a, ((TodoListResult) cVar.mo194115a()).mo193212b())));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$completeTodo$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0}, mo239175l = {667}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$b */
    public static final class C56865b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SdkResponse<Todo>>, Object> {
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        final /* synthetic */ MarkTodoCompletedRequest.Type $type;
        final /* synthetic */ List $userIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56865b(String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List list, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
            this.$todoSource = todoSource;
            this.$type = type;
            this.$userIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56865b bVar = new C56865b(this.$todoGuid, this.$todoSource, this.$type, this.$userIds, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super SdkResponse<Todo>> cVar) {
            return ((C56865b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, "completeTodo", new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$todoGuid;
                TodoSource todoSource = this.$todoSource;
                MarkTodoCompletedRequest.Type type = this.$type;
                List<String> list = this.$userIds;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = "completeTodo";
                this.label = 1;
                obj = fVar.mo194311a(str, true, todoSource, type, list, this);
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
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListData;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$getAllTodoViews$2", mo239173f = "TodoMainModel.kt", mo239174i = {0}, mo239175l = {138}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$e */
    public static final class C56868e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DataResult<? extends TodoListData>>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C56868e(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56868e eVar = new C56868e(cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super DataResult<? extends TodoListData>> cVar) {
            return ((C56868e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                try {
                    C69097g.m265891a(obj);
                } catch (Exception e) {
                    return new DataResult.DataError(e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TodoListData bVar = (TodoListData) obj;
            if (bVar == null) {
                bVar = null;
            }
            return new DataResult.DataSuccess(bVar);
        }
    }

    /* renamed from: d */
    public final void mo193327d(List<Todo> list) {
        for (Todo todo : list) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = f140448o;
            if (!copyOnWriteArraySet.contains(todo.guid)) {
                copyOnWriteArraySet.add(todo.guid);
                f140449p.add(todo);
            } else {
                int size = f140449p.size();
                for (int i = 0; i < size; i++) {
                    CopyOnWriteArrayList<Todo> copyOnWriteArrayList = f140449p;
                    if (Intrinsics.areEqual(copyOnWriteArrayList.get(i).guid, todo.guid)) {
                        copyOnWriteArrayList.set(i, todo);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo193329e(List<Todo> list) {
        for (Todo todo : list) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = f140446m;
            if (!copyOnWriteArraySet.contains(todo.guid)) {
                copyOnWriteArraySet.add(todo.guid);
                f140447n.add(todo);
            } else {
                int size = f140447n.size();
                for (int i = 0; i < size; i++) {
                    CopyOnWriteArrayList<Todo> copyOnWriteArrayList = f140447n;
                    if (Intrinsics.areEqual(copyOnWriteArrayList.get(i).guid, todo.guid)) {
                        copyOnWriteArrayList.set(i, todo);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$deleteTodo$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0}, mo239175l = {689}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$d */
    public static final class C56867d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56867d(String str, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56867d dVar = new C56867d(this.$todoGuid, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56867d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, "deleteTodo", new String[0]));
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
                TodoMainModel dVar = TodoMainModel.f140434a;
                TodoMainModel.f140437d.mo5926a(new TodoListToastUnit(R.string.Todo_common_ActionFailedTryAgainLater, OperationToastHelper.ToastType.FAIL, null, 4, null));
            } else {
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                TodoMainModel.f140437d.mo5926a(new TodoListToastUnit(R.string.Todo_Task_TaskDeleted, OperationToastHelper.ToastType.SUCCESS, null, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$getDocsDonePageData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0}, mo239175l = {468}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$i */
    public static final class C56873i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ TodoSortType $sortType;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56873i(TodoSortType todoSortType, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$sortType = todoSortType;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56873i iVar = new C56873i(this.$sortType, this.$currentFilter, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56873i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = TodoMainModel.f140434a;
                TodoSortType todoSortType = this.$sortType;
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193293a(todoSortType, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TodoMainModel.f140434a.mo193334j();
            TodoMainModel dVar2 = TodoMainModel.f140434a;
            C1177w wVar = TodoMainModel.f140436c;
            TodoMainModel dVar3 = TodoMainModel.f140434a;
            wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140445l, this.$currentFilter)));
            TodoMainModel dVar4 = TodoMainModel.f140434a;
            C1177w wVar2 = TodoMainModel.f140452s;
            TodoMainModel dVar5 = TodoMainModel.f140434a;
            wVar2.mo5926a(TodoMainModel.f140451r.mo5927b());
            TodoMainModel dVar6 = TodoMainModel.f140434a;
            Boolean bool = (Boolean) TodoMainModel.f140451r.mo5927b();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                TodoMainModel dVar7 = TodoMainModel.f140434a;
                TodoMainModel.f140456w.mo5926a(LoadTitleType.LOAD_NONE);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$quitTodo$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 1, 1, 1, 1}, mo239175l = {705, 714}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "result"}, mo239178s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$p */
    public static final class C56880p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56880p(String str, TodoSource todoSource, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
            this.$todoSource = todoSource;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56880p pVar = new C56880p(this.$todoGuid, this.$todoSource, this.$currentFilter, cVar);
            pVar.p$ = (CoroutineScope) obj;
            return pVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56880p) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope ahVar;
            String str;
            String str2;
            int i;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                str2 = "quitTodo";
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, str2, new String[0]));
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str3 = this.$todoGuid;
                TodoSource todoSource = this.$todoSource;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = str2;
                this.label = 1;
                Object a2 = fVar.mo194305a(str3, todoSource, this);
                if (a2 == a) {
                    return a;
                }
                str = valueOf;
                obj = a2;
            } else if (i2 == 1) {
                str2 = (String) this.L$2;
                str = (String) this.L$1;
                ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i2 == 2) {
                String str4 = (String) this.L$2;
                String str5 = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                TodoMainModel dVar = TodoMainModel.f140434a;
                TodoMainModel.f140437d.mo5926a(new TodoListToastUnit(R.string.Todo_Task_LeaveTaskConfirmToast, OperationToastHelper.ToastType.SUCCESS, null, 4, null));
            } else {
                if (this.$todoSource == TodoSource.OAPI) {
                    i = R.string.Todo_Tasks_APICantExit;
                } else {
                    i = R.string.Todo_common_ActionFailedTryAgainLater;
                }
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                TodoMainModel.f140437d.mo5926a(new TodoListToastUnit(i, OperationToastHelper.ToastType.FAIL, null, 4, null));
            }
            if (this.$todoSource == TodoSource.DOC) {
                TodoMainModel dVar3 = TodoMainModel.f140434a;
                String str6 = this.$todoGuid;
                TodoFilterType todoFilterType = this.$currentFilter;
                this.L$0 = ahVar;
                this.L$1 = str;
                this.L$2 = str2;
                this.Z$0 = booleanValue;
                this.label = 2;
                if (dVar3.mo193323c(str6, booleanValue, todoFilterType, this) == a) {
                    return a;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshDocsCompletePage$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0}, mo239175l = {817}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "todo"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$r */
    public static final class C56882r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ boolean $is_completed;
        final /* synthetic */ String $todoGuid;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56882r(String str, boolean z, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
            this.$is_completed = z;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56882r rVar = new C56882r(this.$todoGuid, this.$is_completed, this.$currentFilter, cVar);
            rVar.p$ = (CoroutineScope) obj;
            return rVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56882r) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                TodoMainModel dVar = TodoMainModel.f140434a;
                for (Todo todo : TodoMainModel.f140449p) {
                    T t = (T) todo;
                    if (Intrinsics.areEqual(t.guid, this.$todoGuid)) {
                        objectRef.element = t;
                    }
                }
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                for (Todo todo2 : TodoMainModel.f140447n) {
                    T t2 = (T) todo2;
                    if (Intrinsics.areEqual(t2.guid, this.$todoGuid)) {
                        objectRef.element = t2;
                    }
                }
                T t3 = objectRef.element;
                if (t3 != null) {
                    boolean z = this.$is_completed;
                    if (z) {
                        TodoMainModel.f140434a.mo193306a((Todo) t3);
                    } else if (!z) {
                        TodoMainModel.f140434a.mo193320b((Todo) t3);
                    }
                }
                TodoMainModel dVar3 = TodoMainModel.f140434a;
                TodoMainModel dVar4 = TodoMainModel.f140434a;
                Boolean bool = (Boolean) TodoMainModel.f140455v.mo5927b();
                if (bool == null) {
                    bool = C69089a.m265837a(false);
                }
                boolean booleanValue = bool.booleanValue();
                TodoFilterType todoFilterType = this.$currentFilter;
                this.L$0 = ahVar;
                this.L$1 = objectRef;
                this.label = 1;
                if (dVar3.mo193305a(booleanValue, todoFilterType, this) == a) {
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
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshDocsDoneList$2", mo239173f = "TodoMainModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$t */
    public static final class C56884t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ boolean $showDone;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56884t(boolean z, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$showDone = z;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56884t tVar = new C56884t(this.$showDone, this.$currentFilter, cVar);
            tVar.p$ = (CoroutineScope) obj;
            return tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56884t) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                TodoMainModel dVar = TodoMainModel.f140434a;
                TodoMainModel.f140444k.clear();
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                TodoMainModel.f140445l.clear();
                TodoMainModel dVar3 = TodoMainModel.f140434a;
                CopyOnWriteArrayList copyOnWriteArrayList = TodoMainModel.f140444k;
                TodoMainModel dVar4 = TodoMainModel.f140434a;
                copyOnWriteArrayList.addAll(TodoMainModel.f140448o);
                TodoMainModel dVar5 = TodoMainModel.f140434a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = TodoMainModel.f140445l;
                TodoMainModel dVar6 = TodoMainModel.f140434a;
                copyOnWriteArrayList2.addAll(TodoMainModel.f140449p);
                TodoMainModel dVar7 = TodoMainModel.f140434a;
                TodoMainModel.f140455v.mo5926a(C69089a.m265837a(this.$showDone));
                if (this.$showDone) {
                    TodoMainModel dVar8 = TodoMainModel.f140434a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = TodoMainModel.f140444k;
                    TodoMainModel dVar9 = TodoMainModel.f140434a;
                    copyOnWriteArrayList3.addAll(TodoMainModel.f140446m);
                    TodoMainModel dVar10 = TodoMainModel.f140434a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = TodoMainModel.f140445l;
                    TodoMainModel dVar11 = TodoMainModel.f140434a;
                    copyOnWriteArrayList4.addAll(TodoMainModel.f140447n);
                }
                TodoMainModel dVar12 = TodoMainModel.f140434a;
                C1177w wVar = TodoMainModel.f140436c;
                TodoMainModel dVar13 = TodoMainModel.f140434a;
                wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140445l, this.$currentFilter)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshExistPageData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0}, mo239175l = {484}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$v */
    public static final class C56886v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56886v(TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56886v vVar = new C56886v(this.$currentFilter, cVar);
            vVar.p$ = (CoroutineScope) obj;
            return vVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56886v) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Object obj2;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String valueOf = String.valueOf(new Date().getTime());
                str = "refreshExistPageData";
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, str, new String[0]));
                TodoListSDKService eVar = TodoListSDKService.f141114a;
                GetPagingTodosRequest.ReqType reqType = GetPagingTodosRequest.ReqType.COMPLETED_TODO;
                TodoMainModel dVar = TodoMainModel.f140434a;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = str;
                this.label = 1;
                obj2 = eVar.mo194286a(reqType, null, false, (long) TodoMainModel.f140442i.size(), true, null, this);
                if (obj2 == a) {
                    return a;
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
                Log.m165383e("TodoMainModel", LogMessageUtil.f139260a.mo191767a(str2, str, "refreshExistPageData result is empty!"));
                return Unit.INSTANCE;
            }
            TodoMainModel dVar2 = TodoMainModel.f140434a;
            TodoMainModel.f140442i.clear();
            TodoMainModel dVar3 = TodoMainModel.f140434a;
            TodoMainModel.f140443j.clear();
            CopyOnWriteArrayList<Todo> a2 = eVar2.mo193219a();
            if (a2 != null) {
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191768a(str2, str, "todo_size", String.valueOf(a2.size())));
                TodoMainModel.f140434a.mo193311a(a2);
                TodoMainModel dVar4 = TodoMainModel.f140434a;
                C1177w wVar = TodoMainModel.f140436c;
                TodoMainModel dVar5 = TodoMainModel.f140434a;
                wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140443j, this.$currentFilter)));
                TodoMainModel dVar6 = TodoMainModel.f140434a;
                TodoMainModel.f140452s.mo5926a(C69089a.m265837a(eVar2.mo193220b()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193324c(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56890z
            if (r0 == 0) goto L_0x0014
            r0 = r6
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$z r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56890z) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$z r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$z
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r0
            kotlin.C69097g.m265891a(r6)
            goto L_0x0050
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            kotlin.C69097g.m265891a(r6)
            kotlinx.coroutines.ac r6 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r6 = (kotlin.coroutines.CoroutineContext) r6
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$aa r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$aa
            r4 = 0
            r2.<init>(r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r6, r2, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193324c(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$savePageDocsDonePageData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "orderBy"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ad */
    public static final class C56861ad extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;

        C56861ad(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56861ad adVar = new C56861ad(cVar);
            adVar.p$ = (CoroutineScope) obj;
            return adVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56861ad) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, str, new String[0]));
                ListDocTodosRequest.Order.By by = ListDocTodosRequest.Order.By.COMPLETED_TIME;
                TodoListSDKService eVar = TodoListSDKService.f141114a;
                TodoMainModel dVar = TodoMainModel.f140434a;
                Long l = (Long) TodoMainModel.f140454u.mo5927b();
                if (l == null) {
                    l = C69089a.m265840a(0L);
                }
                long longValue = l.longValue();
                ListDocTodosRequest.Status status = ListDocTodosRequest.Status.COMPLETED;
                this.L$0 = ahVar;
                this.L$1 = valueOf;
                this.L$2 = str;
                this.L$3 = by;
                this.label = 1;
                obj2 = eVar.mo194285a(50, longValue, by, status, true, this);
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
                Log.m165383e("TodoMainModel", LogMessageUtil.f139260a.mo191767a(str2, str, "saveDocsDonePageData result is empty!"));
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                TodoMainModel.f140436c.mo5926a(new DataResult.DataError(new Exception("fetch next page error")));
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
            Log.m165389i("TodoMainModel", cVar.mo191768a(str2, str, strArr));
            CopyOnWriteArrayList<Todo> a4 = eVar2.mo193219a();
            if (a4 != null) {
                TodoMainModel.f140434a.mo193329e(a4);
            }
            TodoMainModel dVar3 = TodoMainModel.f140434a;
            TodoMainModel.f140454u.mo5926a(C69089a.m265840a(eVar2.mo193221c()));
            TodoMainModel dVar4 = TodoMainModel.f140434a;
            TodoMainModel.f140451r.mo5926a(C69089a.m265837a(eVar2.mo193220b()));
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
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$unfollowTodo$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, mo239175l = {725, 734}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "response", "it", "userId", "containsSelf"}, mo239178s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ae */
    public static final class C56862ae extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ String $todoGuid;
        final /* synthetic */ TodoSource $todoSource;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56862ae(String str, TodoSource todoSource, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
            this.$todoSource = todoSource;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56862ae aeVar = new C56862ae(this.$todoGuid, this.$todoSource, this.$currentFilter, cVar);
            aeVar.p$ = (CoroutineScope) obj;
            return aeVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56862ae) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 303
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56862ae.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$getFirstPageData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0}, mo239175l = {340}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$k */
    public static final class C56875k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56875k(TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56875k kVar = new C56875k(this.$currentFilter, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56875k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(valueOf, str, new String[0]));
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
                Log.m165383e("TodoMainModel", LogMessageUtil.f139260a.mo191767a(str2, str, "getFirstPageData result is empty!"));
                TodoMainModel dVar = TodoMainModel.f140434a;
                TodoMainModel.f140436c.mo5926a(new DataResult.DataError(new Exception("fetch first page error")));
                return Unit.INSTANCE;
            }
            TodoMainModel dVar2 = TodoMainModel.f140434a;
            TodoMainModel.f140442i.clear();
            TodoMainModel dVar3 = TodoMainModel.f140434a;
            TodoMainModel.f140443j.clear();
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
            Log.m165389i("TodoMainModel", cVar.mo191768a(str2, str, strArr));
            CopyOnWriteArrayList<Todo> a5 = eVar2.mo193219a();
            if (a5 != null) {
                TodoMainModel.f140434a.mo193311a(a5);
            }
            TodoMainModel dVar4 = TodoMainModel.f140434a;
            C1177w wVar = TodoMainModel.f140436c;
            TodoMainModel dVar5 = TodoMainModel.f140434a;
            wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140443j, this.$currentFilter)));
            TodoMainModel dVar6 = TodoMainModel.f140434a;
            TodoMainModel.f140452s.mo5926a(C69089a.m265837a(eVar2.mo193220b()));
            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
            TodoListView.Type type = TodoListView.Type.COMPLETED;
            CopyOnWriteArrayList<Todo> a6 = eVar2.mo193219a();
            if (!(a6 == null || (a = C69089a.m265839a(a6.size())) == null)) {
                i2 = a.intValue();
            }
            aVar.mo194130a(type, i2);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$getNextPageData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 1, 1, 1}, mo239175l = {361, 372}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$m */
    public static final class C56877m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56877m(TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56877m mVar = new C56877m(this.$currentFilter, cVar);
            mVar.p$ = (CoroutineScope) obj;
            return mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56877m) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0102  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 375
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56877m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshDocsAssigneePage$2", mo239173f = "TodoMainModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$q */
    public static final class C56881q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $assignId;
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ String $todoGuid;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56881q(String str, String str2, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$assignId = str;
            this.$todoGuid = str2;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56881q qVar = new C56881q(this.$assignId, this.$todoGuid, this.$currentFilter, cVar);
            qVar.p$ = (CoroutineScope) obj;
            return qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56881q) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer num;
            Integer num2;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                if (TextUtils.equals(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a(), this.$assignId)) {
                    Todo todo = null;
                    Integer num3 = null;
                    ArrayList arrayList = new ArrayList();
                    TodoMainModel dVar = TodoMainModel.f140434a;
                    int size = TodoMainModel.f140445l.size();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            num = num3;
                            break;
                        }
                        TodoMainModel dVar2 = TodoMainModel.f140434a;
                        if (Intrinsics.areEqual(((Todo) TodoMainModel.f140445l.get(i2)).guid, this.$todoGuid)) {
                            TodoMainModel dVar3 = TodoMainModel.f140434a;
                            todo = (Todo) TodoMainModel.f140445l.get(i2);
                            num = C69089a.m265839a(i2);
                            break;
                        }
                        i2++;
                    }
                    TodoMainModel dVar4 = TodoMainModel.f140434a;
                    int size2 = TodoMainModel.f140449p.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            num2 = num3;
                            break;
                        }
                        TodoMainModel dVar5 = TodoMainModel.f140434a;
                        if (Intrinsics.areEqual(((Todo) TodoMainModel.f140449p.get(i3)).guid, this.$todoGuid)) {
                            TodoMainModel dVar6 = TodoMainModel.f140434a;
                            todo = (Todo) TodoMainModel.f140449p.get(i3);
                            num2 = C69089a.m265839a(i3);
                            break;
                        }
                        i3++;
                    }
                    TodoMainModel dVar7 = TodoMainModel.f140434a;
                    int size3 = TodoMainModel.f140447n.size();
                    while (true) {
                        if (i >= size3) {
                            break;
                        }
                        TodoMainModel dVar8 = TodoMainModel.f140434a;
                        if (Intrinsics.areEqual(((Todo) TodoMainModel.f140447n.get(i)).guid, this.$todoGuid)) {
                            TodoMainModel dVar9 = TodoMainModel.f140434a;
                            todo = (Todo) TodoMainModel.f140447n.get(i);
                            num3 = C69089a.m265839a(i);
                            break;
                        }
                        i++;
                    }
                    if (todo != null) {
                        List<TodoAssignee> list = todo.assignees;
                        Intrinsics.checkExpressionValueIsNotNull(list, "it.assignees");
                        for (T t : list) {
                            if (!Intrinsics.areEqual(t.assignee_id, this.$assignId)) {
                                arrayList.add(t);
                            }
                        }
                        if (num != null) {
                            int intValue = num.intValue();
                            TodoMainModel dVar10 = TodoMainModel.f140434a;
                            TodoMainModel.f140445l.set(intValue, todo.newBuilder().mo66623a(arrayList).build());
                        }
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            TodoMainModel dVar11 = TodoMainModel.f140434a;
                            TodoMainModel.f140449p.set(intValue2, todo.newBuilder().mo66623a(arrayList).build());
                        }
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            TodoMainModel dVar12 = TodoMainModel.f140434a;
                            TodoMainModel.f140447n.set(intValue3, todo.newBuilder().mo66623a(arrayList).build());
                        }
                    }
                    TodoMainModel dVar13 = TodoMainModel.f140434a;
                    C1177w wVar = TodoMainModel.f140436c;
                    TodoMainModel dVar14 = TodoMainModel.f140434a;
                    wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140445l, this.$currentFilter)));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshDocsDeletePage$2", mo239173f = "TodoMainModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$s */
    public static final class C56883s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ boolean $success;
        final /* synthetic */ String $todoGuid;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56883s(boolean z, String str, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$success = z;
            this.$todoGuid = str;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56883s sVar = new C56883s(this.$success, this.$todoGuid, this.$currentFilter, cVar);
            sVar.p$ = (CoroutineScope) obj;
            return sVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56883s) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                if (this.$success) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    TodoMainModel dVar = TodoMainModel.f140434a;
                    TodoMainModel.f140444k.remove(this.$todoGuid);
                    TodoMainModel dVar2 = TodoMainModel.f140434a;
                    TodoMainModel.f140446m.remove(this.$todoGuid);
                    TodoMainModel dVar3 = TodoMainModel.f140434a;
                    TodoMainModel.f140448o.remove(this.$todoGuid);
                    TodoMainModel dVar4 = TodoMainModel.f140434a;
                    for (Todo todo : TodoMainModel.f140445l) {
                        if (!Intrinsics.areEqual(todo.guid, this.$todoGuid)) {
                            arrayList.add(todo);
                        }
                    }
                    TodoMainModel dVar5 = TodoMainModel.f140434a;
                    for (Todo todo2 : TodoMainModel.f140449p) {
                        if (!Intrinsics.areEqual(todo2.guid, this.$todoGuid)) {
                            arrayList3.add(todo2);
                        }
                    }
                    TodoMainModel dVar6 = TodoMainModel.f140434a;
                    for (Todo todo3 : TodoMainModel.f140447n) {
                        if (!Intrinsics.areEqual(todo3.guid, this.$todoGuid)) {
                            arrayList2.add(todo3);
                        }
                    }
                    TodoMainModel dVar7 = TodoMainModel.f140434a;
                    TodoMainModel.f140445l.clear();
                    TodoMainModel dVar8 = TodoMainModel.f140434a;
                    TodoMainModel.f140445l.addAll(arrayList);
                    TodoMainModel dVar9 = TodoMainModel.f140434a;
                    TodoMainModel.f140449p.clear();
                    TodoMainModel dVar10 = TodoMainModel.f140434a;
                    TodoMainModel.f140449p.addAll(arrayList3);
                    TodoMainModel dVar11 = TodoMainModel.f140434a;
                    TodoMainModel.f140447n.clear();
                    TodoMainModel dVar12 = TodoMainModel.f140434a;
                    TodoMainModel.f140447n.addAll(arrayList2);
                }
                TodoMainModel dVar13 = TodoMainModel.f140434a;
                C1177w wVar = TodoMainModel.f140436c;
                TodoMainModel dVar14 = TodoMainModel.f140434a;
                wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140445l, this.$currentFilter)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshTodosByFilter$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {164}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "todoListViewType"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$y */
    public static final class C56889y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ SortDialog.SortType $sortType;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56889y(TodoFilterType todoFilterType, SortDialog.SortType sortType, Continuation cVar) {
            super(2, cVar);
            this.$currentFilter = todoFilterType;
            this.$sortType = sortType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56889y yVar = new C56889y(this.$currentFilter, this.$sortType, cVar);
            yVar.p$ = (CoroutineScope) obj;
            return yVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56889y) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            TodoListView.Type type;
            Integer a;
            TodoListView.Type type2;
            Object a2 = C69086a.m265828a();
            int i = this.label;
            int i2 = 0;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoAppreciableHitPoint.f141058a.mo194134b();
                str = String.valueOf(new Date().getTime());
                str2 = "refreshTodosByFilter";
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(str, str2, "currentFilter", this.$currentFilter.name()));
                switch (this.$currentFilter.getValue()) {
                    case 1:
                        type2 = TodoListView.Type.ALL;
                        break;
                    case 2:
                        type2 = TodoListView.Type.ASSIGN_FROM_ME;
                        break;
                    case 3:
                        type2 = TodoListView.Type.ASSIGN_TO_ME;
                        break;
                    case 4:
                        type2 = TodoListView.Type.COMPLETED;
                        break;
                    case 5:
                        type2 = TodoListView.Type.FOLLOWED;
                        break;
                    case 6:
                        type2 = TodoListView.Type.FROM_DOC;
                        break;
                    default:
                        type2 = TodoListView.Type.ALL;
                        break;
                }
                TodoMainModel dVar = TodoMainModel.f140434a;
                if (TodoMainModel.f140457x) {
                    TodoSlardarPerfHitPoint.f141078a.mo194239f();
                }
                TodoListSDKService eVar = TodoListSDKService.f141114a;
                this.L$0 = ahVar;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = type2;
                this.label = 1;
                obj = eVar.mo194287a(type2, this);
                if (obj == a2) {
                    return a2;
                }
                type = type2;
            } else if (i == 1) {
                type = (TodoListView.Type) this.L$3;
                str2 = (String) this.L$2;
                str = (String) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<Todo> list = (List) obj;
            TodoMainModel.f140434a.mo193310a(list);
            if (list != null) {
                TodoMainModel dVar2 = TodoMainModel.f140434a;
                TodoMainModel.f140440g.clear();
                TodoMainModel dVar3 = TodoMainModel.f140434a;
                TodoMainModel.f140440g.addAll(list);
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191768a(str, str2, "todo_size", String.valueOf(list.size())));
                if (this.$sortType == SortDialog.SortType.CREATE_TIME) {
                    TodoMainModel dVar4 = TodoMainModel.f140434a;
                    TodoMainModel.f140436c.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140434a.mo193325c(list), this.$currentFilter)));
                } else {
                    TodoMainModel dVar5 = TodoMainModel.f140434a;
                    TodoMainModel.f140436c.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140434a.mo193319b(list), this.$currentFilter)));
                }
            }
            TodoAppreciableHitPoint aVar = TodoAppreciableHitPoint.f141058a;
            if (!(list == null || (a = C69089a.m265839a(list.size())) == null)) {
                i2 = a.intValue();
            }
            aVar.mo194130a(type, i2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193318b(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56869f
            if (r0 == 0) goto L_0x0014
            r0 = r6
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$f r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56869f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$f r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$f
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r0
            kotlin.C69097g.m265891a(r6)
            goto L_0x0050
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            kotlin.C69097g.m265891a(r6)
            kotlinx.coroutines.ac r6 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r6 = (kotlin.coroutines.CoroutineContext) r6
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$g r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$g
            r4 = 0
            r2.<init>(r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r6, r2, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193318b(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$updatePagingData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {598}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "mergedList", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ag */
    public static final class C56864ag extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $addedTodoIds;
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ List $deletedTodoIds;
        final /* synthetic */ List $updatedTodoIds;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56864ag(List list, List list2, List list3, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$addedTodoIds = list;
            this.$updatedTodoIds = list2;
            this.$deletedTodoIds = list3;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56864ag agVar = new C56864ag(this.$addedTodoIds, this.$updatedTodoIds, this.$deletedTodoIds, this.$currentFilter, cVar);
            agVar.p$ = (CoroutineScope) obj;
            return agVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56864ag) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: com.ss.android.lark.todo.impl.features.mainview.mvvm.d */
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
                    TodoMainModel dVar = TodoMainModel.f140434a;
                    if (TodoMainModel.f140442i.contains(str3)) {
                        TodoMainModel dVar2 = TodoMainModel.f140434a;
                        TodoMainModel.f140442i.remove(str3);
                        TodoMainModel dVar3 = TodoMainModel.f140434a;
                        int size = TodoMainModel.f140443j.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            TodoMainModel dVar4 = TodoMainModel.f140434a;
                            if (Intrinsics.areEqual(((Todo) TodoMainModel.f140443j.get(i2)).guid, str3)) {
                                TodoMainModel dVar5 = TodoMainModel.f140434a;
                                TodoMainModel.f140443j.remove(i2);
                                break;
                            }
                            i2++;
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
                Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191770b(str, "getTodosByGuidAndFilter", "mergedList", String.valueOf(arrayList.size())));
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
                Log.m165383e("TodoMainModel", LogMessageUtil.f139260a.mo191767a(str, str2, "getTodosByGuidAndFilter result is empty"));
                TodoMainModel dVar6 = TodoMainModel.f140434a;
                C1177w wVar = TodoMainModel.f140436c;
                TodoMainModel dVar7 = TodoMainModel.f140434a;
                wVar.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140443j, this.$currentFilter)));
                return Unit.INSTANCE;
            }
            Log.m165389i("TodoMainModel", LogMessageUtil.f139260a.mo191768a(str, str2, "merged_size", String.valueOf(list.size())));
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            for (String str6 : arrayList) {
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        TodoMainModel dVar8 = TodoMainModel.f140434a;
                        if (TodoMainModel.f140442i.contains(str6)) {
                            TodoMainModel dVar9 = TodoMainModel.f140434a;
                            TodoMainModel.f140442i.remove(str6);
                            TodoMainModel dVar10 = TodoMainModel.f140434a;
                            int size3 = TodoMainModel.f140443j.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size3) {
                                    break;
                                }
                                TodoMainModel dVar11 = TodoMainModel.f140434a;
                                if (Intrinsics.areEqual(((Todo) TodoMainModel.f140443j.get(i4)).guid, str6)) {
                                    TodoMainModel dVar12 = TodoMainModel.f140434a;
                                    TodoMainModel.f140443j.remove(i4);
                                    break;
                                }
                                i4++;
                            }
                        }
                    } else if (!Intrinsics.areEqual(((Todo) list.get(i3)).guid, str6)) {
                        i3++;
                    } else if (!TodoMainModel.f140434a.mo193335k() || TodoMainModel.f140434a.mo193312a(MultiCompleteHelper.f139390a.mo191979a((Todo) list.get(i3)))) {
                        copyOnWriteArrayList.add(list.get(i3));
                    }
                }
            }
            TodoMainModel.f140434a.mo193311a((CopyOnWriteArrayList<Todo>) copyOnWriteArrayList);
            TodoMainModel dVar13 = TodoMainModel.f140434a;
            C1177w wVar2 = TodoMainModel.f140436c;
            TodoMainModel dVar14 = TodoMainModel.f140434a;
            wVar2.mo5926a(new DataResult.DataSuccess(new TodoListResult(TodoMainModel.f140443j, this.$currentFilter)));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$getDocsDoingPageData$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, mo239175l = {430, 444}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "orderBy", "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "orderBy", "result"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$h */
    public static final class C56872h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ boolean $isFetchFirstPage;
        final /* synthetic */ TodoSortType $sortType;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56872h(TodoSortType todoSortType, boolean z, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$sortType = todoSortType;
            this.$isFetchFirstPage = z;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56872h hVar = new C56872h(this.$sortType, this.$isFetchFirstPage, this.$currentFilter, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56872h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x014c  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
            // Method dump skipped, instructions count: 602
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56872h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel$refreshTodoDocsComplete$2", mo239173f = "TodoMainModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, mo239175l = {778, 782}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "result", "todoList", "changeTodo", "newTodoList", "$this$forEach$iv", "element$iv", "it", "$this$withContext", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "result", "todoList", "changeTodo", "newTodoList"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$w */
    public static final class C56887w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoFilterType $currentFilter;
        final /* synthetic */ boolean $is_completed;
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56887w(String str, boolean z, TodoFilterType todoFilterType, Continuation cVar) {
            super(2, cVar);
            this.$todoGuid = str;
            this.$is_completed = z;
            this.$currentFilter = todoFilterType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56887w wVar = new C56887w(this.$todoGuid, this.$is_completed, this.$currentFilter, cVar);
            wVar.p$ = (CoroutineScope) obj;
            return wVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56887w) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x016f  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x01c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
            // Method dump skipped, instructions count: 515
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56887w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final List<Todo> mo193319b(List<Todo> list) {
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

    /* renamed from: b */
    public final void mo193320b(Todo todo) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f140446m.remove(todo.guid);
        for (T t : f140447n) {
            if (!Intrinsics.areEqual(t.guid, todo.guid)) {
                arrayList.add(t);
            }
        }
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList = f140447n;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
        f140448o.add(todo.guid);
        arrayList2.add(todo.newBuilder().mo66622a((Long) 0L).build());
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList2 = f140449p;
        arrayList2.addAll(copyOnWriteArrayList2);
        copyOnWriteArrayList2.clear();
        copyOnWriteArrayList2.addAll(arrayList2);
    }

    /* renamed from: a */
    public final void mo193307a(Todo todo, boolean z) {
        if (z) {
            mo193306a(todo);
        } else if (!z) {
            mo193320b(todo);
        }
    }

    /* renamed from: a */
    public final Object mo193293a(TodoSortType todoSortType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56861ad(null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "kotlin.jvm.PlatformType", "secondTodo", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$o */
    static final class C56879o<T> implements Comparator<Todo> {

        /* renamed from: a */
        public static final C56879o f140461a = new C56879o();

        C56879o() {
        }

        /* renamed from: a */
        public final int compare(Todo todo, Todo todo2) {
            long j;
            long j2;
            Long l = todo.create_milli_time;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = todo2.create_milli_time;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            int i = ((j - j2) > 0 ? 1 : ((j - j2) == 0 ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "s1", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "kotlin.jvm.PlatformType", "s2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.d$n */
    static final class C56878n<T> implements Comparator<Todo> {

        /* renamed from: a */
        public static final C56878n f140460a = new C56878n();

        C56878n() {
        }

        /* renamed from: a */
        public final int compare(Todo todo, Todo todo2) {
            if (MultiCompleteHelper.f139390a.mo191979a(todo) - MultiCompleteHelper.f139390a.mo191979a(todo2) >= 0) {
                if (MultiCompleteHelper.f139390a.mo191979a(todo) - MultiCompleteHelper.f139390a.mo191979a(todo2) != 0) {
                    return -1;
                }
                long longValue = todo.create_milli_time.longValue();
                Long l = todo2.create_milli_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "s2.create_milli_time");
                if (longValue - l.longValue() > 0) {
                    return -1;
                }
                long longValue2 = todo.create_milli_time.longValue();
                Long l2 = todo2.create_milli_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "s2.create_milli_time");
                if (longValue2 - l2.longValue() == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193292a(com.bytedance.lark.pb.todo.v1.Todo r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56859ab
            if (r0 == 0) goto L_0x0014
            r0 = r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ab r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56859ab) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ab r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ab
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            com.bytedance.lark.pb.todo.v1.Todo r6 = (com.bytedance.lark.pb.todo.v1.Todo) r6
            java.lang.Object r6 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r6 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r6
            kotlin.C69097g.m265891a(r7)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C69097g.m265891a(r7)
            kotlinx.coroutines.ac r7 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r7 = (kotlin.coroutines.CoroutineContext) r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ac r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$ac
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r7, r2, r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193292a(com.bytedance.lark.pb.todo.v1.Todo, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193314b(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56876l
            if (r0 == 0) goto L_0x0014
            r0 = r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$l r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56876l) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$l r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$l
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6 = (com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType) r6
            java.lang.Object r6 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r6 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r6
            kotlin.C69097g.m265891a(r7)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C69097g.m265891a(r7)
            kotlinx.coroutines.ac r7 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r7 = (kotlin.coroutines.CoroutineContext) r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$m r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$m
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r7, r2, r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193314b(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193322c(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56885u
            if (r0 == 0) goto L_0x0014
            r0 = r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$u r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56885u) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$u r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$u
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6 = (com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType) r6
            java.lang.Object r6 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r6 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r6
            kotlin.C69097g.m265891a(r7)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C69097g.m265891a(r7)
            kotlinx.coroutines.ac r7 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r7 = (kotlin.coroutines.CoroutineContext) r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$v r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$v
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r7, r2, r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193322c(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193297a(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56874j
            if (r0 == 0) goto L_0x0014
            r0 = r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$j r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56874j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$j r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$j
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6 = (com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType) r6
            java.lang.Object r6 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r6 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r6
            kotlin.C69097g.m265891a(r7)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C69097g.m265891a(r7)
            kotlinx.coroutines.ac r7 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r7 = (kotlin.coroutines.CoroutineContext) r7
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$k r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$k
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r7, r2, r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193297a(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo193294a(TodoFilterType todoFilterType, TodoSortType todoSortType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56873i(todoSortType, todoFilterType, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo193296a(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6, com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog.SortType r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56888x
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$x r0 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.C56888x) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$x r0 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$x
            r0.<init>(r5, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.L$2
            com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog$SortType r6 = (com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog.SortType) r6
            java.lang.Object r6 = r0.L$1
            com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType r6 = (com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType) r6
            java.lang.Object r6 = r0.L$0
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d r6 = (com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel) r6
            kotlin.C69097g.m265891a(r8)
            goto L_0x005c
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            kotlin.C69097g.m265891a(r8)
            kotlinx.coroutines.ac r8 = com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.f140435b
            kotlin.coroutines.f r8 = (kotlin.coroutines.CoroutineContext) r8
            com.ss.android.lark.todo.impl.features.mainview.mvvm.d$y r2 = new com.ss.android.lark.todo.impl.features.mainview.mvvm.d$y
            r4 = 0
            r2.<init>(r6, r7, r4)
            kotlin.jvm.functions.k r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C69388e.m266829a(r8, r2, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainModel.mo193296a(com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType, com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog$SortType, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public final Object mo193323c(String str, boolean z, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56883s(z, str, todoFilterType, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Object mo193316b(String str, TodoSource todoSource, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        return C69388e.m266829a(f140435b, new C56862ae(str, todoSource, todoFilterType, null), cVar);
    }

    /* renamed from: a */
    public final Object mo193295a(TodoFilterType todoFilterType, TodoSortType todoSortType, boolean z, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56872h(todoSortType, z, todoFilterType, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Object mo193317b(String str, boolean z, TodoFilterType todoFilterType, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56882r(str, z, todoFilterType, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public Object mo193315b(String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List<String> list, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56857a(str, todoSource, type, list, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public Object mo193298a(String str, TodoSource todoSource, MarkTodoCompletedRequest.Type type, List<String> list, Continuation<? super Unit> cVar) {
        Object a = C69388e.m266829a(f140435b, new C56865b(str, todoSource, type, list, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
