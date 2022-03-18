package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C1067t;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.todo.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.todo.dependency.idependency.IOldModuleDependency;
import com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.helper.ShareToastDisplayHelper;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.mainview.adapter.TodoListAdapter;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.C56808c;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderRecyclerView;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnFragmentDestroyListener;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnItemClickListener;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnPopupWindowListener;
import com.ss.android.lark.todo.impl.features.mainview.schedule.TodoListSchedule;
import com.ss.android.lark.todo.impl.features.mainview.shine.ListScrollShineLogic;
import com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.ISortTypeChangeListener;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog;
import com.ss.android.lark.todo.impl.features.remind.notification.NotificationHelper;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity;
import com.ss.android.lark.todo.impl.framework.architecture.EventObserver;
import com.ss.android.lark.todo.impl.framework.busevents.AddTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.CompleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoAssigneeEvent;
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.perf.TodoSlardarPerfHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager;
import com.ss.android.lark.todo.impl.rustadapter.push.entity.TodoChangeNotificationUnit;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ç\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001#\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000207H\u0002J\b\u00109\u001a\u000207H\u0002J\b\u0010:\u001a\u000207H\u0003J \u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0002J\u0018\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\tH\u0016J\b\u0010B\u001a\u000207H\u0002J\b\u0010C\u001a\u000207H\u0002J\b\u0010D\u001a\u000207H\u0002J\b\u0010E\u001a\u000207H\u0002J\b\u0010F\u001a\u000207H\u0002J\b\u0010G\u001a\u000207H\u0002J\b\u0010H\u001a\u000207H\u0002J\b\u0010I\u001a\u000207H\u0002J\b\u0010J\u001a\u00020\tH\u0002J\u0018\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0002J\u0012\u0010N\u001a\u0002072\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\"\u0010Q\u001a\u0002072\u0006\u0010R\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u00072\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010V\u001a\u0002072\u0006\u0010W\u001a\u00020XH\u0007J\b\u0010Y\u001a\u000207H\u0016J\u0010\u0010Z\u001a\u0002072\u0006\u0010[\u001a\u00020\\H\u0007J\u0012\u0010]\u001a\u0002072\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J&\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010c2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0010\u0010d\u001a\u0002072\u0006\u0010e\u001a\u00020fH\u0007J\b\u0010g\u001a\u000207H\u0016J\b\u0010h\u001a\u000207H\u0016J\u0010\u0010i\u001a\u0002072\u0006\u0010j\u001a\u00020kH\u0007J\b\u0010l\u001a\u000207H\u0016J\u0010\u0010m\u001a\u0002072\u0006\u0010n\u001a\u00020oH\u0002J\u0010\u0010p\u001a\u0002072\u0006\u0010T\u001a\u00020UH\u0002J\u0010\u0010q\u001a\u0002072\u0006\u0010r\u001a\u00020sH\u0002J\b\u0010t\u001a\u000207H\u0002J\b\u0010u\u001a\u000207H\u0002J\b\u0010v\u001a\u000207H\u0002J\b\u0010w\u001a\u000207H\u0002J\u000f\u0010x\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0002\u0010yJ\u0010\u0010z\u001a\u0002072\u0006\u0010{\u001a\u00020\u0011H\u0016J\b\u0010|\u001a\u000207H\u0002J\u0010\u0010}\u001a\u0002072\u0006\u0010~\u001a\u00020PH\u0016J\u0011\u0010\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u0017H\u0016J\u0011\u0010\u0001\u001a\u0002072\u0006\u0010n\u001a\u00020oH\u0002J\u0011\u0010\u0001\u001a\u0002072\u0006\u0010n\u001a\u00020oH\u0002J\t\u0010\u0001\u001a\u000207H\u0002J\t\u0010\u0001\u001a\u000207H\u0002J\t\u0010\u0001\u001a\u000207H\u0002J\u0012\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\tH\u0002J\t\u0010\u0001\u001a\u000207H\u0002J\t\u0010\u0001\u001a\u000207H\u0002J\t\u0010\u0001\u001a\u000207H\u0002J\u0013\u0010\u0001\u001a\u0002072\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0012\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020#X\u0004¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R\u000e\u00103\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment;", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoBaseMainFragment;", "Lcom/ss/android/lark/eetroublecapture/ICaptureCallback;", "()V", "addedTodoGuid", "", "filterNumberParam", "", "isNeedHandleShineLogic", "", "isOpenCreateBtnParam", "isResetExpandStateParam", "lastMotionEvent", "Landroid/graphics/PointF;", "mAccountChangeListener", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency$IAccountChangeListener;", "mActivity", "Landroid/app/Activity;", "mAppStateChangeListener", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "mBaseContext", "Landroid/content/Context;", "mFragmentDestroyListener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnFragmentDestroyListener;", "mHideLoadingRunnable", "Ljava/lang/Runnable;", "mIsContentViewAnimate", "mIsOnTodoPage", "mIsTimezoneRegister", "mIsTitleVisible", "mListAdapter", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter;", "mListScheduledFuture", "Lcom/ss/android/lark/todo/impl/features/mainview/schedule/TodoListSchedule;", "mPopWindowListener", "com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$mPopWindowListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$mPopWindowListener$1;", "mScrollListDistance", "mScrollToTopRunnable", "mTitleController", "Lcom/ss/android/lark/todo/dependency/ITodoTitleControllerProxy;", "mTodoListPushManager", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager;", "mTodoTimeZoneReceiver", "Landroid/content/BroadcastReceiver;", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "getMViewModel", "()Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "scrollAndShineRunnable", "scrollShineLogic", "Lcom/ss/android/lark/todo/impl/features/mainview/shine/ListScrollShineLogic;", "addListLiveData", "", "addListScrollListener", "addLoadMoreListener", "addTouchListener", "handleArguments", "filterNum", "isOpenCreateBtn", "isResetExpandState", "handlePageSwitch", "preIsTodoTab", "curIsTodoTab", "initClassifyView", "initLoadingContainer", "initNavigation", "initOperationDialog", "initOperationToast", "initRegister", "initShareLiveData", "initTodoList", "isShowSetting", "modifyTitleBarProcess", "touchSlop", "dy", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAddTodoEvent", "addTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/AddTodoEvent;", "onCaptured", "onCompleteTodoEvent", "completeTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/CompleteTodoEvent;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDeleteTodoAssigneeEvent", "deleteTodoAssigneeEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/DeleteTodoAssigneeEvent;", "onDestroy", "onPause", "onQuitTodoEvent", "quitTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/QuitTodoEvent;", "onResume", "openTodoDetails", "todoDisplayItem", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "parseShareResult", "preloadingList", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "registerAccountChangedPush", "registerAppLifeCycleObserver", "registerSystemTimeZoneReceiver", "resetContentViewParams", "scrollToListTop", "()Lkotlin/Unit;", "setActivity", "activity", "setAnimationAttr", "setArgumentsFromSpec", "args", "setOnDestroyListener", "fragmentDestroyListener", "showActiveConfirmDialog", "showCompleteConfirmDialog", "showHelpCenterView", "showSortDialog", "showTitleBarWhenMoveToTop", "translateContentView", "isHideTitleBar", "unRegisterAccountChangedPush", "unRegisterAppLifeCycleObserver", "unRegisterSystemTimeZoneReceiver", "updateFilterType", "targetFilterType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "updateTitleController", "titleController", "Companion", "MenuItem", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TodoMainFragment extends TodoBaseMainFragment implements AbstractC36982d {

    /* renamed from: C */
    private static final int f140344C = C57582a.m223600a(40);

    /* renamed from: D */
    private static final int f140345D = C57582a.m223600a(58);

    /* renamed from: n */
    public static final Companion f140346n = new Companion(null);

    /* renamed from: A */
    private final C56817ac f140347A = new C56817ac(this);

    /* renamed from: B */
    private final Runnable f140348B = new RunnableC56824ah(this);

    /* renamed from: E */
    private HashMap f140349E;

    /* renamed from: a */
    public Context f140350a;

    /* renamed from: b */
    public TodoListAdapter f140351b;

    /* renamed from: c */
    public ITodoTitleControllerProxy f140352c;

    /* renamed from: d */
    public boolean f140353d = true;

    /* renamed from: e */
    public TodoListSchedule f140354e = new TodoListSchedule();

    /* renamed from: f */
    public int f140355f;

    /* renamed from: g */
    public boolean f140356g = true;

    /* renamed from: h */
    public boolean f140357h;

    /* renamed from: i */
    public final PointF f140358i = new PointF();

    /* renamed from: j */
    public ListScrollShineLogic f140359j;

    /* renamed from: k */
    public String f140360k = "";

    /* renamed from: l */
    public final Runnable f140361l = new RunnableC56816ab(this);

    /* renamed from: m */
    public final Runnable f140362m = new RunnableC56819ad(this);

    /* renamed from: o */
    private Activity f140363o;

    /* renamed from: p */
    private final Lazy f140364p = C1067t.m5172a(this, Reflection.getOrCreateKotlinClass(TodoMainViewModel.class), new TodoMainFragment$$special$$inlined$viewModels$2(new TodoMainFragment$$special$$inlined$viewModels$1(this)), null);

    /* renamed from: q */
    private TodoListPushManager f140365q;

    /* renamed from: r */
    private IAppLifeCycleDependency.IAppStateChangeListener f140366r;

    /* renamed from: s */
    private IAccountChangeDependency.IAccountChangeListener f140367s;

    /* renamed from: t */
    private OnFragmentDestroyListener f140368t;

    /* renamed from: u */
    private boolean f140369u;

    /* renamed from: v */
    private boolean f140370v;

    /* renamed from: w */
    private int f140371w = -1;

    /* renamed from: x */
    private boolean f140372x;

    /* renamed from: y */
    private boolean f140373y;

    /* renamed from: z */
    private final BroadcastReceiver f140374z = new TodoMainFragment$mTodoTimeZoneReceiver$1(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$MenuItem;", "", "(Ljava/lang/String;I)V", "SORT", "SETTING", "HELP_CENTER", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MenuItem {
        SORT,
        SETTING,
        HELP_CENTER
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public View mo193225a(int i) {
        if (this.f140349E == null) {
            this.f140349E = new HashMap();
        }
        View view = (View) this.f140349E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f140349E.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193226a() {
        HashMap hashMap = this.f140349E;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final TodoMainViewModel mo193236b() {
        return (TodoMainViewModel) this.f140364p.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo193226a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$Companion;", "", "()V", "DELAY_DURATION", "", "INVISIBLE_DURATION", "SCROLL_SHINE_DURATION", "SCROLL_UP_THRESHOLD", "", "TAG_LOG", "", "TITLE_BAR_HEIGHT", "TODO_HELP_KEY", "TODO_TAB_ENTER_FILTER", "TODO_TAB_OPEN_CREATE", "TODO_TAB_RESET_EXPAND_STATE", "getBundleForEnterFilter", "Landroid/os/Bundle;", "filter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "isResetExpandState", "", "getBundleForEnterFirstFilter", "getBundleForOpenCreate", "getFilterType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "filterType", "newInstance", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment;", "context", "Landroid/content/Context;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final Bundle mo193251b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("todo_tab_open_create", true);
            return bundle;
        }

        /* renamed from: a */
        public final Bundle mo193248a() {
            Bundle bundle = new Bundle();
            bundle.putInt("todo_tab_enter_filter", TodoFilterType.ALL.getValue());
            return bundle;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final TodoFilterType m220889a(TodoListView.Type type) {
            switch (C56855b.f140426a[type.ordinal()]) {
                case 1:
                    return TodoFilterType.ALL;
                case 2:
                    return TodoFilterType.ASSIGN_TO_ME;
                case 3:
                    return TodoFilterType.ASSIGN_FROM_ME;
                case 4:
                    return TodoFilterType.FOLLOWED;
                case 5:
                    return TodoFilterType.COMPLETED;
                case 6:
                    return TodoFilterType.FROM_DOCS;
                default:
                    return TodoFilterType.ALL;
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final TodoMainFragment mo193250a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            TodoMainFragment todoMainFragment = new TodoMainFragment();
            todoMainFragment.f140350a = context;
            Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("TodoMainFragment"));
            return todoMainFragment;
        }

        /* renamed from: a */
        public final Bundle mo193249a(TodoListView.Type type, boolean z) {
            Intrinsics.checkParameterIsNotNull(type, "filter");
            Bundle bundle = new Bundle();
            bundle.putInt("todo_tab_enter_filter", TodoMainFragment.f140346n.m220889a(type).getValue());
            bundle.putBoolean("todo_tab_reset_expand_state", z);
            return bundle;
        }
    }

    /* renamed from: a */
    public final void mo193233a(TodoDisplayItem todoDisplayItem) {
        Context context = getContext();
        if (context != null) {
            MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            multiCompleteHelper.mo191983a(context, new C56825ai(this, todoDisplayItem));
        }
    }

    /* renamed from: a */
    public final void mo193230a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        if (mo193236b().getCurrentFilter() == TodoFilterType.COMPLETED && (layoutManager = recyclerView.getLayoutManager()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
            if (layoutManager instanceof StableLinearLayoutManager) {
                StableLinearLayoutManager stableLinearLayoutManager = (StableLinearLayoutManager) layoutManager;
                int findLastCompletelyVisibleItemPosition = stableLinearLayoutManager.findLastCompletelyVisibleItemPosition();
                int itemCount = stableLinearLayoutManager.getItemCount();
                if (((double) findLastCompletelyVisibleItemPosition) >= ((double) itemCount) * 0.8d) {
                    mo193236b().loadMoreTodoDatas(false, itemCount);
                }
            }
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193235a(boolean z, boolean z2) {
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i("TodoMainFragment", cVar.mo191772d("handlePageSwitch preIsTodoTab = " + z + " curIsTodoTab = " + z2));
        if (!z && !z2) {
            return;
        }
        if (!z || !z2) {
            this.f140353d = z2;
            TodoListPushManager aVar = this.f140365q;
            if (aVar != null) {
                aVar.mo194368a(z2);
            }
            if (z2) {
                ITodoTitleControllerProxy bVar = this.f140352c;
                if (bVar != null) {
                    bVar.mo191716a(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Tasks));
                }
                this.f140354e.mo193143b();
                m220864v();
                TodoHitPoint.m221758k("navigator");
                if (isActive()) {
                    TodoGeneralHitPoint.f141070a.mo194174a(mo193236b().getCurrentFilter());
                    mo193236b().refreshListEndTime();
                    mo193236b().handleBadgePush(mo193236b().getCurrentFilterSortType());
                    if (this.f140370v) {
                        UICallbackExecutor.executeDelayed(this.f140348B, 200);
                        this.f140370v = false;
                    }
                }
            }
            if (z) {
                this.f140354e.mo193144c();
                TodoBadgeManager.f139264a.mo191790b();
                ListScrollShineLogic aVar2 = this.f140359j;
                if (aVar2 != null) {
                    aVar2.mo193149b();
                }
            }
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193231a(ITodoTitleControllerProxy bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "titleController");
        Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("updateTitleController"));
        this.f140352c = bVar;
        if (bVar != null) {
            bVar.mo191715a(this.f140347A);
        }
    }

    /* renamed from: a */
    public final void mo193234a(boolean z) {
        int i;
        boolean z2 = this.f140356g;
        if (z2 && !z) {
            return;
        }
        if ((z2 || !z) && !this.f140357h) {
            int i2 = z ? f140345D : 0;
            if (z) {
                i = 0;
            } else {
                i = f140345D;
            }
            ValueAnimator duration = ValueAnimator.ofInt(i2, i).setDuration(200L);
            duration.addUpdateListener(new al(this));
            duration.addListener(new am(this, z));
            duration.start();
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193229a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "args");
        Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("setArgumentsFromSpec"));
        int i = bundle.getInt("todo_tab_enter_filter", -1);
        boolean z = bundle.getBoolean("todo_tab_open_create", false);
        boolean z2 = bundle.getBoolean("todo_tab_reset_expand_state", false);
        if (!isActive()) {
            this.f140371w = i;
            this.f140372x = z;
            this.f140373y = z2;
            return;
        }
        m220848a(i, z, z2);
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193232a(OnFragmentDestroyListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "fragmentDestroyListener");
        this.f140368t = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ad */
    static final class RunnableC56819ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140381a;

        RunnableC56819ad(TodoMainFragment todoMainFragment) {
            this.f140381a = todoMainFragment;
        }

        public final void run() {
            this.f140381a.mo193243g();
        }
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        mo193236b().logTodoListOnScreenShot();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ae */
    static final class RunnableC56820ae implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140382a;

        RunnableC56820ae(TodoMainFragment todoMainFragment) {
            this.f140382a = todoMainFragment;
        }

        public final void run() {
            ListScrollShineLogic aVar = this.f140382a.f140359j;
            if (aVar != null) {
                aVar.mo193149b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$showActiveConfirmDialog$1$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ai */
    public static final class C56825ai implements MultiCompleteHelper.IMultiCompleteDialogListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140387a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140388b;

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: a */
        public void mo191869a() {
            this.f140387a.mo193236b().changeTodoCompleteStatus(false, this.f140388b);
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: b */
        public void mo191870b() {
            this.f140387a.mo193236b().refreshListEndTime();
        }

        C56825ai(TodoMainFragment todoMainFragment, TodoDisplayItem todoDisplayItem) {
            this.f140387a = todoMainFragment;
            this.f140388b = todoDisplayItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$showCompleteConfirmDialog$1$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class aj implements MultiCompleteHelper.IMultiCompleteDialogListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140389a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140390b;

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: a */
        public void mo191869a() {
            this.f140389a.mo193236b().changeTodoCompleteStatus(true, this.f140390b);
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: b */
        public void mo191870b() {
            this.f140389a.mo193236b().refreshListEndTime();
        }

        aj(TodoMainFragment todoMainFragment, TodoDisplayItem todoDisplayItem) {
            this.f140389a = todoMainFragment;
            this.f140390b = todoDisplayItem;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$o */
    public static final class RunnableC56839o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140410a;

        RunnableC56839o(TodoMainFragment todoMainFragment) {
            this.f140410a = todoMainFragment;
        }

        public final void run() {
            ((ImageView) this.f140410a.mo193225a(R.id.create_bt)).performClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$initRegister$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$IPushListener;", "onLoadAllTodo", "", "onLoadTodoViews", "onRefreshTimeFormat", "onRefreshTodoByPush", "pushData", "Lcom/ss/android/lark/todo/impl/rustadapter/push/entity/TodoChangeNotificationUnit;", "onRefreshTodoSetting", "todoSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "onRefreshTodoViewsByPush", "list", "", "Lcom/bytedance/lark/pb/todo/v1/TodoListView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$x */
    public static final class C56848x implements TodoListPushManager.IPushListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140417a;

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager.IPushListener
        /* renamed from: a */
        public void mo193283a() {
            this.f140417a.mo193236b().refreshListEndTime();
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager.IPushListener
        /* renamed from: b */
        public void mo193287b() {
            this.f140417a.mo193236b().loadAllTodo();
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager.IPushListener
        /* renamed from: c */
        public void mo193288c() {
            this.f140417a.mo193236b().loadAllTodoViews();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56848x(TodoMainFragment todoMainFragment) {
            this.f140417a = todoMainFragment;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager.IPushListener
        /* renamed from: a */
        public void mo193284a(TodoSetting todoSetting) {
            Intrinsics.checkParameterIsNotNull(todoSetting, "todoSetting");
            this.f140417a.mo193236b().updateTodoSetting(todoSetting);
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager.IPushListener
        /* renamed from: a */
        public void mo193285a(TodoChangeNotificationUnit todoChangeNotificationUnit) {
            Intrinsics.checkParameterIsNotNull(todoChangeNotificationUnit, "pushData");
            this.f140417a.mo193236b().updateTodoListByPush(todoChangeNotificationUnit);
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoListPushManager.IPushListener
        /* renamed from: a */
        public void mo193286a(List<TodoListView> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f140417a.mo193236b().updateTodoCountByPush(list);
        }
    }

    /* renamed from: d */
    public final boolean mo193240d() {
        return TodoDependencyHolder.f139242a.mo191731b().mo191928a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$registerAccountChangedPush$1", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency$IAccountChangeListener;", "onAccountChange", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$af */
    public static final class C56821af implements IAccountChangeDependency.IAccountChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140383a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$af$a */
        static final class RunnableC56822a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C56821af f140384a;

            RunnableC56822a(C56821af afVar) {
                this.f140384a = afVar;
            }

            public final void run() {
                TodoClassifyHeaderView todoClassifyHeaderView = (TodoClassifyHeaderView) this.f140384a.f140383a.mo193225a(R.id.todo_classify_view);
                if (todoClassifyHeaderView != null) {
                    todoClassifyHeaderView.mo193426a(TodoFilterType.ALL);
                }
                this.f140384a.f140383a.mo193236b().initialData();
            }
        }

        @Override // com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency.IAccountChangeListener
        /* renamed from: a */
        public void mo191727a() {
            Log.m165389i(this.f140383a.TAG, LogMessageUtil.f139260a.mo191772d("onAccountChanged"));
            UICallbackExecutor.post(new RunnableC56822a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56821af(TodoMainFragment todoMainFragment) {
            this.f140383a = todoMainFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ab */
    static final class RunnableC56816ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140376a;

        RunnableC56816ab(TodoMainFragment todoMainFragment) {
            this.f140376a = todoMainFragment;
        }

        public final void run() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f140376a.mo193225a(R.id.todo_loading_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "todo_loading_container");
            relativeLayout.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ah */
    static final class RunnableC56824ah implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140386a;

        RunnableC56824ah(TodoMainFragment todoMainFragment) {
            this.f140386a = todoMainFragment;
        }

        public final void run() {
            ListScrollShineLogic aVar = this.f140386a.f140359j;
            if (aVar != null) {
                aVar.mo193148a(this.f140386a.f140360k, this.f140386a.mo193236b().getCurrentFilterSortType());
            }
            this.f140386a.f140360k = "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$initTodoList$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnItemClickListener;", "onChangeStatusItemClicked", "", "onShareItemClicked", "guid", "", "summary", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$z */
    public static final class C56850z implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140419a;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.OnItemClickListener
        /* renamed from: a */
        public void mo193138a() {
            ListScrollShineLogic aVar = this.f140419a.f140359j;
            if (aVar != null) {
                aVar.mo193149b();
            }
            TodoMainFragment.m220847a(this.f140419a).mo86622b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56850z(TodoMainFragment todoMainFragment) {
            this.f140419a = todoMainFragment;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.OnItemClickListener
        /* renamed from: a */
        public void mo193139a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "guid");
            Intrinsics.checkParameterIsNotNull(str2, "summary");
            ListScrollShineLogic aVar = this.f140419a.f140359j;
            if (aVar != null) {
                aVar.mo193149b();
            }
            TodoMainFragment.m220847a(this.f140419a).mo86622b();
            Context context = this.f140419a.getContext();
            if (context != null) {
                IOldModuleDependency oldModuleDependency = TodoDependencyHolder.f139242a.mo191730a().oldModuleDependency();
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                oldModuleDependency.mo145422a(context, this.f140419a, str, str2, 1);
            }
        }
    }

    /* renamed from: l */
    private final void m220854l() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        ((PinnedHeaderRecyclerView) mo193225a(R.id.todo_list)).setOnTouchListener(new View$OnTouchListenerC56838n(this, booleanRef));
    }

    /* renamed from: q */
    private final void m220859q() {
        ((RelativeLayout) mo193225a(R.id.todo_loading_container)).setOnClickListener(new View$OnClickListenerC56842r(this));
    }

    /* renamed from: t */
    private final void m220862t() {
        mo193236b().getToastUnit().mo5923a(this, new EventObserver(new C56847w(this)));
    }

    /* renamed from: u */
    private final void m220863u() {
        mo193236b().getShareEntity().mo5923a(this, new C56849y(this));
    }

    /* renamed from: w */
    private final void m220865w() {
        if (this.f140366r == null) {
            this.f140366r = new C56823ag(this);
        }
        IAppLifeCycleDependency.IAppStateChangeListener aVar = this.f140366r;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().appLifeCycleDependency().mo145365a(aVar);
        }
    }

    /* renamed from: x */
    private final void m220866x() {
        this.f140354e.mo193144c();
        IAppLifeCycleDependency.IAppStateChangeListener aVar = this.f140366r;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().appLifeCycleDependency().mo145366b(aVar);
        }
    }

    /* renamed from: y */
    private final void m220867y() {
        if (this.f140367s == null) {
            this.f140367s = new C56821af(this);
        }
        IAccountChangeDependency.IAccountChangeListener aVar = this.f140367s;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().accountChangeDependency().mo145357a(aVar);
        }
    }

    /* renamed from: z */
    private final void m220868z() {
        IAccountChangeDependency.IAccountChangeListener aVar = this.f140367s;
        if (aVar != null) {
            TodoDependencyHolder.f139242a.mo191730a().accountChangeDependency().mo145358b(aVar);
        }
    }

    /* renamed from: f */
    public final void mo193242f() {
        if ((!((PinnedHeaderRecyclerView) mo193225a(R.id.todo_list)).canScrollVertically(-1)) && !this.f140356g) {
            this.f140355f = 0;
            mo193234a(false);
            this.f140356g = true;
        }
    }

    /* renamed from: g */
    public final Unit mo193243g() {
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) mo193225a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView, "todo_list");
        RecyclerView.LayoutManager layoutManager = pinnedHeaderRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        layoutManager.scrollToPosition(0);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("onPause"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("onResume"));
    }

    /* renamed from: A */
    private final void m220844A() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                m220846a(activity, this.f140374z, intentFilter);
            }
            this.f140369u = true;
        } catch (Exception unused) {
            Log.m165383e(this.TAG, LogMessageUtil.f139260a.mo191771c("RegisterReceiver failed"));
        }
    }

    /* renamed from: B */
    private final void m220845B() {
        if (this.f140369u) {
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.unregisterReceiver(this.f140374z);
                }
                this.f140369u = false;
            } catch (Exception unused) {
                Log.m165383e(this.TAG, LogMessageUtil.f139260a.mo191771c("UnregisterReceiver failed"));
            }
        }
    }

    /* renamed from: i */
    private final void m220851i() {
        TodoMainFragment todoMainFragment = this;
        mo193236b().getShowActiveDialog().mo5923a(todoMainFragment, new C56845u(this));
        mo193236b().getShowCompleteDialog().mo5923a(todoMainFragment, new C56846v(this));
    }

    /* renamed from: j */
    private final void m220852j() {
        TodoListPushManager aVar = new TodoListPushManager();
        this.f140365q = aVar;
        if (aVar != null) {
            aVar.mo194366a();
        }
        TodoListPushManager aVar2 = this.f140365q;
        if (aVar2 != null) {
            aVar2.mo194367a(new C56848x(this));
        }
        m220865w();
        m220867y();
        m220844A();
        this.f140354e.mo193142a(mo193236b());
    }

    /* renamed from: m */
    private final void m220855m() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(ResUtil.f139261a.mo191776a());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(ResUtil.appContext)");
        ((PinnedHeaderRecyclerView) mo193225a(R.id.todo_list)).addOnScrollListener(new C56836l(this, viewConfiguration.getScaledTouchSlop()));
    }

    /* renamed from: n */
    private final void m220856n() {
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) mo193225a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView, "todo_list");
        RecyclerView.ItemAnimator itemAnimator = pinnedHeaderRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0);
        }
        if (itemAnimator != null) {
            itemAnimator.setChangeDuration(0);
        }
        if (itemAnimator != null) {
            itemAnimator.setMoveDuration(0);
        }
        if (itemAnimator != null) {
            itemAnimator.setRemoveDuration(0);
        }
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    /* renamed from: s */
    private final void m220861s() {
        ((TodoClassifyHeaderView) mo193225a(R.id.todo_classify_view)).setActionListener(new C56840p(this));
        mo193236b().getFilterNumMapLv().mo5923a(this, new C56841q(this));
    }

    /* renamed from: e */
    public final void mo193241e() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        SortDialog sortDialog = new SortDialog(context, R.style.TodoSortDialog, mo193236b().getCurrentFilterSortType());
        sortDialog.mo193452a(new ak(this));
        sortDialog.show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("onDestroy"));
        UICallbackExecutor.removeCallbacks(this.f140361l);
        UICallbackExecutor.removeCallbacks(this.f140362m);
        UICallbackExecutor.removeCallbacks(this.f140348B);
        EventBus.getDefault().unregister(this);
        m220866x();
        TodoListPushManager aVar = this.f140365q;
        if (aVar != null) {
            aVar.mo194369b();
        }
        m220868z();
        m220845B();
        OnFragmentDestroyListener bVar = this.f140368t;
        if (bVar != null) {
            bVar.mo191713a();
        }
    }

    /* renamed from: o */
    private final void m220857o() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(getContext());
        ((LKUIPtrClassicFrameLayout) mo193225a(R.id.todo_ptr_layout)).setFooterView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) mo193225a(R.id.todo_ptr_layout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo193225a(R.id.todo_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "todo_ptr_layout");
        lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        ((LKUIPtrClassicFrameLayout) mo193225a(R.id.todo_ptr_layout)).setPtrHandler(new C56837m(this));
    }

    /* renamed from: r */
    private final void m220860r() {
        Drawable findDrawableByLayerId;
        mo193236b().getOpenTodoEvent().mo5923a(this, new EventObserver(new C56843s(this)));
        ((ImageView) mo193225a(R.id.create_bt)).setOnClickListener(new View$OnClickListenerC56844t(this));
        View findViewById = ((UDShadowLayout) mo193225a(R.id.todo_append_view)).findViewById(R.id.create_bt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "todo_append_view.findVie…mageView>(R.id.create_bt)");
        Drawable drawable = ((ImageView) findViewById).getDrawable();
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.add_bold)) != null) {
            findDrawableByLayerId.setTint(UIUtils.getColor(getContext(), R.color.static_white));
        }
    }

    /* renamed from: v */
    private final void m220864v() {
        if (((RelativeLayout) mo193225a(R.id.todo_content_view)) != null) {
            this.f140355f = 0;
            this.f140356g = true;
            RelativeLayout relativeLayout = (RelativeLayout) mo193225a(R.id.todo_content_view);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "todo_content_view");
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, f140345D, 0, 0);
                RelativeLayout relativeLayout2 = (RelativeLayout) mo193225a(R.id.todo_content_view);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "todo_content_view");
                relativeLayout2.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: c */
    public final void mo193238c() {
        boolean z;
        TodoHitPoint.f141073a.mo194230h("help", "none");
        TodoGeneralHitPoint.f141070a.mo194171a();
        String a = TodoDependencyHolder.f139242a.mo191730a().appConfigDependency().mo145363a("help_key_todo");
        if (getContext() != null) {
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(getContext(), a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$mPopWindowListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnPopupWindowListener;", "onShowMoreMenu", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ac */
    public static final class C56817ac implements OnPopupWindowListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140377a;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.OnPopupWindowListener
        /* renamed from: a */
        public void mo193140a() {
            Context context;
            TodoHitPoint.f141073a.mo194231i("more", "todo_center_task_list_more_view");
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            int i = 0;
            if (this.f140377a.mo193236b().getCurrentFilter() != TodoFilterType.COMPLETED) {
                arrayList.add(ResUtil.f139261a.mo191781c(R.string.Todo_Menu_Sort));
                hashMap.put(0, MenuItem.SORT);
                i = 1;
            }
            if (this.f140377a.mo193240d()) {
                arrayList.add(ResUtil.f139261a.mo191781c(R.string.Todo_Settings_Tooltip));
                hashMap.put(Integer.valueOf(i), MenuItem.SETTING);
                i++;
            }
            if (TodoDependencyHolder.f139242a.mo191731b().mo191939l()) {
                arrayList.add(ResUtil.f139261a.mo191781c(R.string.Todo_Common_HelpCenter));
                hashMap.put(Integer.valueOf(i), MenuItem.HELP_CENTER);
            }
            if (!hashMap.isEmpty() && (context = this.f140377a.getContext()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(arrayList)).mo90869a(new C56818a(this, arrayList, hashMap))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56817ac(TodoMainFragment todoMainFragment) {
            this.f140377a = todoMainFragment;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$mPopWindowListener$1$onShowMoreMenu$1$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ac$a */
        public static final class C56818a implements UDListDialogController.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C56817ac f140378a;

            /* renamed from: b */
            final /* synthetic */ List f140379b;

            /* renamed from: c */
            final /* synthetic */ HashMap f140380c;

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public void onItemClick(int i) {
                MenuItem menuItem;
                if (i < this.f140380c.size() && (menuItem = (MenuItem) this.f140380c.get(Integer.valueOf(i))) != null) {
                    int i2 = C56856c.f140427a[menuItem.ordinal()];
                    if (i2 == 1) {
                        TodoGeneralHitPoint.f141070a.mo194183b();
                        this.f140378a.f140377a.mo193241e();
                    } else if (i2 == 2) {
                        TodoGeneralHitPoint.f141070a.mo194189c();
                        TodoSettingActivity.f140986a.mo194046a(this.f140378a.f140377a.getContext());
                    } else if (i2 == 3) {
                        this.f140378a.f140377a.mo193238c();
                    }
                }
            }

            C56818a(C56817ac acVar, List list, HashMap hashMap) {
                this.f140378a = acVar;
                this.f140379b = list;
                this.f140380c = hashMap;
            }
        }
    }

    /* renamed from: k */
    private final void m220853k() {
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(this.mContext);
        stableLinearLayoutManager.setOrientation(1);
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) mo193225a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView, "todo_list");
        pinnedHeaderRecyclerView.setLayoutManager(stableLinearLayoutManager);
        ((PinnedHeaderRecyclerView) mo193225a(R.id.todo_list)).setIsChatList(false);
        TodoListAdapter cVar = new TodoListAdapter(mo193236b(), new C56850z(this));
        this.f140351b = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListAdapter");
        }
        cVar.mo193119a(new C56815aa(this));
        TodoListAdapter cVar2 = this.f140351b;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListAdapter");
        }
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = (PinnedHeaderRecyclerView) mo193225a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView2, "todo_list");
        this.f140359j = new ListScrollShineLogic(cVar2, pinnedHeaderRecyclerView2);
        m220854l();
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView3 = (PinnedHeaderRecyclerView) mo193225a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView3, "todo_list");
        TodoListAdapter cVar3 = this.f140351b;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListAdapter");
        }
        pinnedHeaderRecyclerView3.setAdapter(cVar3);
        ((PinnedHeaderRecyclerView) mo193225a(R.id.todo_list)).addItemDecoration(new C56808c());
        m220856n();
        m220857o();
        m220858p();
        m220855m();
    }

    /* renamed from: p */
    private final void m220858p() {
        m220859q();
        TodoMainFragment todoMainFragment = this;
        mo193236b().getDataFetchStatus().mo5923a(todoMainFragment, new C56826b(this));
        mo193236b().getNoTodoLabel().mo5923a(todoMainFragment, new C56828d(this));
        mo193236b().getNoTodoText().mo5923a(todoMainFragment, new C56829e(this));
        mo193236b().getFetchFirstPage().mo5923a(todoMainFragment, new C56830f(this));
        mo193236b().getItems().mo5923a(todoMainFragment, new C56831g(this));
        mo193236b().getOperationToastUnit().mo5923a(todoMainFragment, new C56832h(this));
        mo193236b().getBadgeSettingUnit().mo5923a(todoMainFragment, new C56833i(this));
        mo193236b().getCurrentViewSortTypeLV().mo5923a(todoMainFragment, new C56834j(this));
        mo193236b().getFilterType().mo5923a(todoMainFragment, new C56835k(this));
        mo193236b().getMoveToCreateItemLv().mo5923a(todoMainFragment, new C56827c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$initTodoList$2", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleOperationListener;", "onTitleStateChanged", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "isExpand", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$aa */
    public static final class C56815aa implements TodoListAdapter.ITitleOperationListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140375a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56815aa(TodoMainFragment todoMainFragment) {
            this.f140375a = todoMainFragment;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.TodoListAdapter.ITitleOperationListener
        /* renamed from: a */
        public void mo193129a(TodoDisplayItem.TitleType titleType, boolean z) {
            Intrinsics.checkParameterIsNotNull(titleType, "titleType");
            TodoMainFragment.m220847a(this.f140375a).mo86622b();
            this.f140375a.mo193236b().changeTitleState(titleType, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$registerAppLifeCycleObserver$1", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "onAppStateChange", "", "isAppFronted", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$ag */
    public static final class C56823ag implements IAppLifeCycleDependency.IAppStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140385a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56823ag(TodoMainFragment todoMainFragment) {
            this.f140385a = todoMainFragment;
        }

        @Override // com.ss.android.lark.todo.dependency.idependency.IAppLifeCycleDependency.IAppStateChangeListener
        /* renamed from: a */
        public void mo191728a(boolean z) {
            if (!z || !this.f140385a.f140353d) {
                this.f140385a.f140354e.mo193144c();
            } else {
                this.f140385a.f140354e.mo193143b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$showSortDialog$1", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/ISortTypeChangeListener;", "onSortTypeChanged", "", "sortType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ak implements ISortTypeChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140391a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ak(TodoMainFragment todoMainFragment) {
            this.f140391a = todoMainFragment;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.widget.sort.ISortTypeChangeListener
        /* renamed from: a */
        public void mo193257a(SortDialog.SortType sortType) {
            Intrinsics.checkParameterIsNotNull(sortType, "sortType");
            this.f140391a.mo193236b().updateCurrentSortType(sortType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$addLoadMoreListener$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$m */
    public static final class C56837m extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140407a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56837m(TodoMainFragment todoMainFragment) {
            this.f140407a = todoMainFragment;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            if (this.f140407a.mo193236b().getCurrentFilter() == TodoFilterType.COMPLETED || this.f140407a.mo193236b().getCurrentFilter() == TodoFilterType.FROM_DOCS) {
                this.f140407a.mo193236b().loadMoreTodoDatas(true, TodoMainFragment.m220847a(this.f140407a).getItemCount());
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            if (!this.f140407a.mo193236b().canLoadMore() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$initClassifyView$1", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$OnClassifyClickListener;", "onClassifyBtnClick", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$p */
    public static final class C56840p implements TodoClassifyHeaderView.OnClassifyClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140411a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56840p(TodoMainFragment todoMainFragment) {
            this.f140411a = todoMainFragment;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView.OnClassifyClickListener
        /* renamed from: a */
        public void mo193275a(TodoFilterType todoFilterType) {
            Intrinsics.checkParameterIsNotNull(todoFilterType, ShareHitPoint.f121869d);
            ListScrollShineLogic aVar = this.f140411a.f140359j;
            if (aVar != null) {
                aVar.mo193149b();
            }
            this.f140411a.mo193236b().setFilterType(todoFilterType, true);
            if (!this.f140411a.f140356g) {
                this.f140411a.mo193234a(false);
                this.f140411a.f140355f = 0;
                this.f140411a.f140356g = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$s */
    public static final class C56843s extends Lambda implements Function1<TodoDisplayItem, Unit> {
        final /* synthetic */ TodoMainFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56843s(TodoMainFragment todoMainFragment) {
            super(1);
            this.this$0 = todoMainFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoDisplayItem todoDisplayItem) {
            invoke(todoDisplayItem);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoDisplayItem todoDisplayItem) {
            Intrinsics.checkParameterIsNotNull(todoDisplayItem, "it");
            this.this$0.mo193239c(todoDisplayItem);
            TodoMainFragment.m220847a(this.this$0).mo86622b();
            ListScrollShineLogic aVar = this.this$0.f140359j;
            if (aVar != null) {
                aVar.mo193149b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "toastUnit", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$w */
    public static final class C56847w extends Lambda implements Function1<TodoListToastUnit, Unit> {
        final /* synthetic */ TodoMainFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56847w(TodoMainFragment todoMainFragment) {
            super(1);
            this.this$0 = todoMainFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoListToastUnit dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoListToastUnit dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "toastUnit");
            int i = C56856c.f140433g[dVar.mo193214b().ordinal()];
            if (i == 1) {
                OperationToastHelper.m219774a(OperationToastHelper.f139395a, this.this$0.getContext(), dVar.mo193213a(), null, null, null, 28, null);
            } else if (i == 2) {
                OperationToastHelper.m219775a(OperationToastHelper.f139395a, this.this$0.getContext(), dVar.mo193213a(), null, null, null, null, 60, null);
            } else if (i == 3) {
                OperationToastHelper.m219777b(OperationToastHelper.f139395a, this.this$0.getContext(), dVar.mo193213a(), dVar.mo193215c(), null, null, null, 56, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$translateContentView$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class am implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140393a;

        /* renamed from: b */
        final /* synthetic */ boolean f140394b;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140393a.f140357h = false;
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140393a.f140357h = true;
        }

        public void onAnimationEnd(Animator animator) {
            ITodoTitleControllerProxy bVar;
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f140393a.f140357h = false;
            if (!this.f140394b && (bVar = this.f140393a.f140352c) != null) {
                bVar.mo191717a(true, false);
            }
        }

        am(TodoMainFragment todoMainFragment, boolean z) {
            this.f140393a = todoMainFragment;
            this.f140394b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$i */
    public static final class C56833i<T> implements AbstractC1178x<TodoBadgeConfig> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140402a;

        C56833i(TodoMainFragment todoMainFragment) {
            this.f140402a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(TodoBadgeConfig todoBadgeConfig) {
            this.f140402a.mo193236b().refreshListEndTime();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012H\u0010\u0002\u001aD\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0007*\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$q */
    public static final class C56841q<T> implements AbstractC1178x<HashMap<TodoFilterType, Integer>> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140412a;

        C56841q(TodoMainFragment todoMainFragment) {
            this.f140412a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(HashMap<TodoFilterType, Integer> hashMap) {
            ((TodoClassifyHeaderView) this.f140412a.mo193225a(R.id.todo_classify_view)).mo193427a(hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$u */
    public static final class C56845u<T> implements AbstractC1178x<TodoDisplayItem> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140415a;

        C56845u(TodoMainFragment todoMainFragment) {
            this.f140415a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(TodoDisplayItem todoDisplayItem) {
            TodoMainFragment todoMainFragment = this.f140415a;
            Intrinsics.checkExpressionValueIsNotNull(todoDisplayItem, "it");
            todoMainFragment.mo193233a(todoDisplayItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$v */
    public static final class C56846v<T> implements AbstractC1178x<TodoDisplayItem> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140416a;

        C56846v(TodoMainFragment todoMainFragment) {
            this.f140416a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(TodoDisplayItem todoDisplayItem) {
            TodoMainFragment todoMainFragment = this.f140416a;
            Intrinsics.checkExpressionValueIsNotNull(todoDisplayItem, "it");
            todoMainFragment.mo193237b(todoDisplayItem);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TodoListAdapter m220847a(TodoMainFragment todoMainFragment) {
        TodoListAdapter cVar = todoMainFragment.f140351b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListAdapter");
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "addedGuid", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$c */
    public static final class C56827c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140396a;

        C56827c(TodoMainFragment todoMainFragment) {
            this.f140396a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            ListScrollShineLogic aVar = this.f140396a.f140359j;
            if (aVar != null) {
                aVar.mo193148a(str, this.f140396a.mo193236b().getCurrentFilterSortType());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$e */
    public static final class C56829e<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140398a;

        C56829e(TodoMainFragment todoMainFragment) {
            this.f140398a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            TextView textView = (TextView) this.f140398a.mo193225a(R.id.tv_empty_list);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_empty_list");
            textView.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$h */
    public static final class C56832h<T> implements AbstractC1178x<TodoListToastUnit> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140401a;

        C56832h(TodoMainFragment todoMainFragment) {
            this.f140401a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(TodoListToastUnit dVar) {
            this.f140401a.mo193236b().showToastMessage(dVar.mo193213a(), dVar.mo193214b());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$j */
    public static final class C56834j<T> implements AbstractC1178x<SortDialog.SortType> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140403a;

        C56834j(TodoMainFragment todoMainFragment) {
            this.f140403a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(SortDialog.SortType sortType) {
            TodoListAdapter a = TodoMainFragment.m220847a(this.f140403a);
            Intrinsics.checkExpressionValueIsNotNull(sortType, "it");
            a.mo193121a(sortType);
            UICallbackExecutor.executeDelayed(this.f140403a.f140362m, 100);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "entity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$y */
    public static final class C56849y<T> implements AbstractC1178x<ShareEntity> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140418a;

        C56849y(TodoMainFragment todoMainFragment) {
            this.f140418a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(ShareEntity shareEntity) {
            ShareToastDisplayHelper bVar = ShareToastDisplayHelper.f139408a;
            Context context = this.f140418a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(shareEntity, "entity");
            bVar.mo192008a(context, shareEntity);
        }
    }

    /* renamed from: b */
    public final void mo193237b(TodoDisplayItem todoDisplayItem) {
        Context context = getContext();
        if (context != null) {
            MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            multiCompleteHelper.mo191985b(context, new aj(this, todoDisplayItem));
        }
    }

    @Subscribe
    public final void onCompleteTodoEvent(CompleteTodoEvent bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "completeTodoEvent");
        mo193236b().completeDocsTodo(bVar.mo194121a(), bVar.mo194122b());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().register(this);
        Log.m165389i("TodoMainFragment", LogMessageUtil.f139260a.mo191772d("onCreate"));
    }

    @Subscribe
    public final void onDeleteTodoAssigneeEvent(DeleteTodoAssigneeEvent cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "deleteTodoAssigneeEvent");
        mo193236b().deleteDocsAssigneeTodo(cVar.mo194123a(), cVar.mo194124b());
    }

    @Subscribe
    public final void onQuitTodoEvent(QuitTodoEvent eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "quitTodoEvent");
        mo193236b().quitDocsTodo(eVar.mo194126a());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isListEmpty", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$d */
    public static final class C56828d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140397a;

        C56828d(TodoMainFragment todoMainFragment) {
            this.f140397a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            Intrinsics.checkExpressionValueIsNotNull(bool, "isListEmpty");
            if (bool.booleanValue()) {
                TodoSlardarPerfHitPoint.f141078a.mo194233a(true);
                TodoAppreciableHitPoint.f141058a.mo194133a("ongoing", true);
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.f140397a.mo193225a(R.id.empty_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "empty_container");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$f */
    public static final class C56830f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140399a;

        C56830f(TodoMainFragment todoMainFragment) {
            this.f140399a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i = C56856c.f140429c[this.f140399a.mo193236b().getCurrentFilter().ordinal()];
            if (i == 1) {
                TodoMainViewModel b = this.f140399a.mo193236b();
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                b.getPagingItems(bool.booleanValue());
            } else if (i == 2) {
                TodoMainViewModel b2 = this.f140399a.mo193236b();
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                b2.getDocsPagingItems(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$g */
    public static final class C56831g<T> implements AbstractC1178x<List<? extends TodoDisplayItem>> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140400a;

        C56831g(TodoMainFragment todoMainFragment) {
            this.f140400a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(List<TodoDisplayItem> list) {
            if (this.f140400a.mo193236b().getCurrentFilter() == TodoFilterType.COMPLETED || this.f140400a.mo193236b().getCurrentFilter() == TodoFilterType.FROM_DOCS) {
                ((LKUIPtrClassicFrameLayout) this.f140400a.mo193225a(R.id.todo_ptr_layout)).refreshComplete();
            }
            TodoAppreciableHitPoint.f141058a.mo194129a(list.size());
            TodoMainFragment.m220847a(this.f140400a).mo193122a(list);
        }
    }

    @Subscribe
    public final void onAddTodoEvent(AddTodoEvent aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "addTodoEvent");
        if (!this.f140353d) {
            this.f140370v = true;
            String str = aVar.mo194120a().guid;
            Intrinsics.checkExpressionValueIsNotNull(str, "addTodoEvent.todo.guid");
            this.f140360k = str;
        }
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) mo193225a(R.id.todo_list);
        if (pinnedHeaderRecyclerView != null) {
            pinnedHeaderRecyclerView.post(new RunnableC56820ae(this));
        }
        mo193236b().refreshListWithAddedTodo(aVar.mo194120a());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class al implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140392a;

        al(TodoMainFragment todoMainFragment) {
            this.f140392a = todoMainFragment;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                RelativeLayout relativeLayout = (RelativeLayout) this.f140392a.mo193225a(R.id.todo_content_view);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "todo_content_view");
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, intValue, 0, 0);
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f140392a.mo193225a(R.id.todo_content_view);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "todo_content_view");
                    relativeLayout2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$k */
    public static final class C56835k<T> implements AbstractC1178x<TodoFilterType> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140404a;

        C56835k(TodoMainFragment todoMainFragment) {
            this.f140404a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(TodoFilterType todoFilterType) {
            LKUIPtrFrameLayout.Mode mode;
            TodoMainFragment.m220847a(this.f140404a).mo86622b();
            TodoListAdapter a = TodoMainFragment.m220847a(this.f140404a);
            Intrinsics.checkExpressionValueIsNotNull(todoFilterType, "it");
            a.mo193120a(todoFilterType);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f140404a.mo193225a(R.id.todo_ptr_layout);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "todo_ptr_layout");
            int i = C56856c.f140430d[todoFilterType.ordinal()];
            if (i == 1) {
                mode = LKUIPtrFrameLayout.Mode.LOAD_MORE;
            } else if (i != 2) {
                mode = LKUIPtrFrameLayout.Mode.NONE;
            } else {
                mode = LKUIPtrFrameLayout.Mode.LOAD_MORE;
            }
            lKUIPtrClassicFrameLayout.setMode(mode);
            UICallbackExecutor.executeDelayed(this.f140404a.f140362m, 100);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$r */
    public static final class View$OnClickListenerC56842r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140413a;

        View$OnClickListenerC56842r(TodoMainFragment todoMainFragment) {
            this.f140413a = todoMainFragment;
        }

        public final void onClick(View view) {
            if (this.f140413a.mo193236b().getDataFetchStatus().mo5927b() == TodoFetchStatus.FIRST_PAGE_FAILED) {
                int i = C56856c.f140431e[this.f140413a.mo193236b().getCurrentFilter().ordinal()];
                if (i == 1) {
                    this.f140413a.mo193236b().getPagingItems(true);
                } else if (i == 2) {
                    this.f140413a.mo193236b().getDocsPagingItems(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$t */
    public static final class View$OnClickListenerC56844t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140414a;

        View$OnClickListenerC56844t(TodoMainFragment todoMainFragment) {
            this.f140414a = todoMainFragment;
        }

        public final void onClick(View view) {
            TodoSceneType todoSceneType;
            TodoHitPoint.m221728a(this.f140414a.mo193236b().getCurrentFilter());
            TodoGeneralHitPoint.f141070a.mo194194d();
            TodoMainFragment.m220847a(this.f140414a).mo86622b();
            FragmentActivity activity = this.f140414a.getActivity();
            if (activity != null) {
                DetailEntrance bVar = DetailEntrance.f139694a;
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                FragmentActivity fragmentActivity = activity;
                switch (C56856c.f140432f[this.f140414a.mo193236b().getCurrentFilter().ordinal()]) {
                    case 1:
                        todoSceneType = TodoSceneType.TODO_ALL;
                        break;
                    case 2:
                        todoSceneType = TodoSceneType.TODO_ASSIGIN_FROM_ME;
                        break;
                    case 3:
                        todoSceneType = TodoSceneType.TODO_ASSIGN_TO_ME;
                        break;
                    case 4:
                        todoSceneType = TodoSceneType.TODO_COMPLETED;
                        break;
                    case 5:
                        todoSceneType = TodoSceneType.TODO_FOLLOWED;
                        break;
                    case 6:
                        todoSceneType = TodoSceneType.TODO_FROM_DOCS;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                bVar.mo192299a(fragmentActivity, null, null, todoSceneType);
            }
            ListScrollShineLogic aVar = this.f140414a.f140359j;
            if (aVar != null) {
                aVar.mo193149b();
            }
        }
    }

    /* renamed from: a */
    private final void m220849a(Intent intent) {
        boolean z;
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("chat_ids_for_share_todo");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(stringArrayListExtra, "data.getStringArrayListE…DO_RESULT) ?: ArrayList()");
        String stringExtra = intent.getStringExtra("comment_for_share_todo");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        Intrinsics.checkExpressionValueIsNotNull(stringExtra, "data.getStringExtra(Todo…RESULT)\n            ?: \"\"");
        String stringExtra2 = intent.getStringExtra("guid_for_share_todo");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "data.getStringExtra(Todo…_SHARE_TODO_RESULT) ?: \"\"");
        if (CollectionUtils.isNotEmpty(stringArrayListExtra)) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo193236b().shareTodo(stringArrayListExtra, stringExtra, str);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        Intent intent;
        super.onActivityCreated(bundle);
        TodoSlardarPerfHitPoint.f141078a.mo194237d();
        m220852j();
        m220853k();
        m220860r();
        m220861s();
        m220863u();
        m220862t();
        m220851i();
        NotificationHelper aVar = NotificationHelper.f140950a;
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle2 = null;
        } else {
            bundle2 = intent.getExtras();
        }
        aVar.mo193995a(context, bundle2);
        m220848a(this.f140371w, this.f140372x, this.f140373y);
        TodoSlardarPerfHitPoint.f141078a.mo194238e();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "fetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$b */
    public static final class C56826b<T> implements AbstractC1178x<TodoFetchStatus> {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140395a;

        C56826b(TodoMainFragment todoMainFragment) {
            this.f140395a = todoMainFragment;
        }

        /* renamed from: a */
        public final void onChanged(TodoFetchStatus todoFetchStatus) {
            long j;
            if (todoFetchStatus == TodoFetchStatus.NONE) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f140395a.mo193225a(R.id.todo_loading_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "todo_loading_container");
                relativeLayout.setVisibility(8);
            } else if (todoFetchStatus == TodoFetchStatus.NEXT_PAGE_FAILED) {
                ((LKUIPtrClassicFrameLayout) this.f140395a.mo193225a(R.id.todo_ptr_layout)).refreshComplete();
            } else if (todoFetchStatus == TodoFetchStatus.SUCCESS) {
                Runnable runnable = this.f140395a.f140361l;
                if (!this.f140395a.mo193236b().isNoTodoLabelShow()) {
                    j = 200;
                } else {
                    j = 0;
                }
                UICallbackExecutor.executeDelayed(runnable, j);
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f140395a.mo193225a(R.id.empty_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "empty_container");
                relativeLayout2.setVisibility(8);
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f140395a.mo193225a(R.id.todo_loading_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "todo_loading_container");
                relativeLayout3.setVisibility(0);
                if (todoFetchStatus != null) {
                    int i = C56856c.f140428b[todoFetchStatus.ordinal()];
                    if (i == 1) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f140395a.mo193225a(R.id.todo_lottie_loading_anim);
                        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "todo_lottie_loading_anim");
                        lottieAnimationView.setVisibility(0);
                        ((LottieAnimationView) this.f140395a.mo193225a(R.id.todo_lottie_loading_anim)).playAnimation();
                        LinearLayout linearLayout = (LinearLayout) this.f140395a.mo193225a(R.id.todo_loading_error_ll);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "todo_loading_error_ll");
                        linearLayout.setVisibility(8);
                    } else if (i == 2) {
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f140395a.mo193225a(R.id.todo_lottie_loading_anim);
                        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "todo_lottie_loading_anim");
                        lottieAnimationView2.setVisibility(8);
                        ((LottieAnimationView) this.f140395a.mo193225a(R.id.todo_lottie_loading_anim)).cancelAnimation();
                        LinearLayout linearLayout2 = (LinearLayout) this.f140395a.mo193225a(R.id.todo_loading_error_ll);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "todo_loading_error_ll");
                        linearLayout2.setVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m220850a(TodoFilterType todoFilterType) {
        mo193236b().setFilterType(todoFilterType, true);
        ((TodoClassifyHeaderView) mo193225a(R.id.todo_classify_view)).mo193426a(todoFilterType);
    }

    /* renamed from: c */
    public final void mo193239c(TodoDisplayItem todoDisplayItem) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            TodoListAdapter cVar = this.f140351b;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListAdapter");
            }
            cVar.mo86622b();
            DetailEntrance bVar = DetailEntrance.f139694a;
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            DetailEntrance.m220107a(bVar, (Context) activity, todoDisplayItem.mo193167e(), true, (String) null, (String) null, (String) null, (String) null, (int) SmEvents.EVENT_NW, (Object) null);
            TodoHitPoint.m221729a(mo193236b().getCurrentFilter(), todoDisplayItem.mo193167e());
            TodoGeneralHitPoint.f141070a.mo194190c(todoDisplayItem.mo193167e());
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193228a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f140363o = activity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainFragment$addListScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$l */
    public static final class C56836l extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140405a;

        /* renamed from: b */
        final /* synthetic */ int f140406b;

        C56836l(TodoMainFragment todoMainFragment, int i) {
            this.f140405a = todoMainFragment;
            this.f140406b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ListScrollShineLogic aVar;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && (aVar = this.f140405a.f140359j) != null) {
                aVar.mo193147a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f140405a.mo193227a(this.f140406b, i2);
            this.f140405a.mo193230a(recyclerView);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment$n */
    public static final class View$OnTouchListenerC56838n implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment f140408a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f140409b;

        View$OnTouchListenerC56838n(TodoMainFragment todoMainFragment, Ref.BooleanRef booleanRef) {
            this.f140408a = todoMainFragment;
            this.f140409b = booleanRef;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.f140408a.f140358i.x = motionEvent.getX();
                this.f140408a.f140358i.y = motionEvent.getY();
            }
            if (motionEvent.getAction() == 2 && !this.f140409b.element) {
                ListScrollShineLogic aVar = this.f140408a.f140359j;
                if (aVar != null) {
                    aVar.mo193149b();
                }
                TodoMainFragment.m220847a(this.f140408a).mo86622b();
                this.f140408a.mo193242f();
                this.f140409b.element = true;
            }
            if (motionEvent.getAction() == 1) {
                Intrinsics.checkExpressionValueIsNotNull(view, "v");
                if (view.getId() != 0 && (view instanceof PinnedHeaderRecyclerView)) {
                    float f = (float) 5;
                    if (Math.abs(this.f140408a.f140358i.x - motionEvent.getX()) <= f && Math.abs(this.f140408a.f140358i.y - motionEvent.getY()) <= f) {
                        TodoMainFragment.m220847a(this.f140408a).mo86622b();
                    }
                }
                this.f140409b.element = false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo193227a(int i, int i2) {
        if (!this.f140357h) {
            int i3 = this.f140355f;
            if (i3 < (-i) && !this.f140356g) {
                this.f140355f = 0;
                mo193234a(false);
                this.f140356g = true;
            } else if (i3 > f140344C && this.f140356g) {
                ITodoTitleControllerProxy bVar = this.f140352c;
                if (bVar != null) {
                    bVar.mo191717a(false, false);
                }
                this.f140355f = 0;
                mo193234a(true);
                this.f140356g = false;
            }
            if ((i2 > 0 && this.f140356g) || (i2 < 0 && !this.f140356g)) {
                this.f140355f += i2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == 1) {
            m220849a(intent);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m220846a(FragmentActivity fragmentActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return fragmentActivity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        TodoSlardarPerfHitPoint.f141078a.mo194234b();
        View inflate = layoutInflater.inflate(R.layout.todo_fragment_main_view, viewGroup, false);
        TodoSlardarPerfHitPoint.f141078a.mo194236c();
        return inflate;
    }

    /* renamed from: a */
    private final void m220848a(int i, boolean z, boolean z2) {
        if (i != -1) {
            TodoFilterType a = TodoFilterType.Companion.mo193195a(i);
            if (z2) {
                mo193236b().resetTitleStateByType(a);
            }
            m220850a(a);
        }
        if (z) {
            ((ImageView) mo193225a(R.id.create_bt)).post(new RunnableC56839o(this));
        }
    }
}
