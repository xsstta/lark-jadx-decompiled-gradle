package com.ss.android.lark.todo.impl.features.detail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.lark.pb.todo.v1.TodoOrigin;
import com.bytedance.lark.pb.todo.v1.TodoReferResource;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoSourceHref;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.section.ISecManagerDependency;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.SectionManager;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.helper.ShareToastDisplayHelper;
import com.ss.android.lark.todo.impl.features.common.widget.TodoLoadingUIBuilder;
import com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment;
import com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoDetailAssigneeFragmentV2;
import com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoDetailFollowerFragmentV2;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentAdapterV2;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentKeyboardSection;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentPanelSection;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentSection;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentTitleSection;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentViewModel;
import com.ss.android.lark.todo.impl.features.detail.description.TodoDetailDescriptionFragmentV2;
import com.ss.android.lark.todo.impl.features.detail.history.TodoDetailHistoryFragmentV2;
import com.ss.android.lark.todo.impl.features.detail.history.TodoHistoryViewModel;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeSection;
import com.ss.android.lark.todo.impl.features.detail.sections.AtSection;
import com.ss.android.lark.todo.impl.features.detail.sections.BottomContainerSection;
import com.ss.android.lark.todo.impl.features.detail.sections.DescriptionSection;
import com.ss.android.lark.todo.impl.features.detail.sections.FollowerSection;
import com.ss.android.lark.todo.impl.features.detail.sections.SummarySection;
import com.ss.android.lark.todo.impl.features.detail.sections.TimeSection;
import com.ss.android.lark.todo.impl.features.detail.sections.TitleBarSection;
import com.ss.android.lark.todo.impl.features.detail.sections.ToastSection;
import com.ss.android.lark.todo.impl.features.detail.time.TodoDetailTimeFragmentViewV2;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AtViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.BottomContainerViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DescriptionViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DetailMainViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TimeViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TitleBarViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoKeyboardViewModel;
import com.ss.android.lark.todo.impl.features.detail.widget.C56793b;
import com.ss.android.lark.todo.impl.features.detail.widget.FlatItemsAdapter;
import com.ss.android.lark.todo.impl.features.detail.widget.SingleItemAdapter;
import com.ss.android.lark.todo.impl.framework.TodoBaseActivity;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.BinderC57853n;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Û\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f*\u00014\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020\u0014H\u0002J\u0006\u0010`\u001a\u00020]J\b\u0010a\u001a\u00020]H\u0016J\b\u0010b\u001a\u00020]H\u0002J\b\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020dH\u0016J\b\u0010f\u001a\u00020]H\u0002J\u0006\u0010g\u001a\u00020]J\b\u0010h\u001a\u00020]H\u0002J\b\u0010i\u001a\u00020]H\u0002J\b\u0010j\u001a\u00020]H\u0002J\b\u0010k\u001a\u00020]H\u0002J\b\u0010l\u001a\u00020]H\u0002J\b\u0010m\u001a\u00020]H\u0002J\b\u0010n\u001a\u00020]H\u0002J\"\u0010o\u001a\u00020]2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020q2\b\u0010s\u001a\u0004\u0018\u00010tH\u0014J\b\u0010u\u001a\u00020]H\u0016J\b\u0010v\u001a\u00020]H\u0016J\u0012\u0010w\u001a\u00020]2\b\u0010x\u001a\u0004\u0018\u00010yH\u0014J\b\u0010z\u001a\u00020]H\u0014J\u0010\u0010{\u001a\u00020]2\u0006\u0010|\u001a\u00020yH\u0014J\b\u0010}\u001a\u00020]H\u0014J\u0018\u0010~\u001a\u00020]2\u0006\u0010p\u001a\u00020q2\u0006\u0010s\u001a\u00020tH\u0002J\u0010\u0010\u001a\u00020]2\u0006\u0010s\u001a\u00020tH\u0002J\u0012\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020\rH\u0002J\u0012\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020\rH\u0002J\t\u0010\u0001\u001a\u00020]H\u0002J\u0012\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020\rH\u0002J\u0013\u0010\u0001\u001a\u00020]2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020]H\u0002J\u0012\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u0001\u001a\u00020]H\u0002J$\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020F2\u0007\u0010\u0001\u001a\u00020F2\u0007\u0010\u0001\u001a\u00020FH\u0002J\u0010\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020\u0014J\t\u0010\u0001\u001a\u00020]H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0 X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0002¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b0\u00101R\u0010\u00103\u001a\u000204X\u0004¢\u0006\u0004\n\u0002\u00105R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b<\u0010\t\u001a\u0004\b:\u0010;R'\u0010=\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>8BX\u0002¢\u0006\f\n\u0004\bC\u0010\t\u001a\u0004\bA\u0010BR\u000e\u0010D\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u00020FXD¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001b\u0010I\u001a\u00020J8BX\u0002¢\u0006\f\n\u0004\bM\u0010\t\u001a\u0004\bK\u0010LR\u001b\u0010N\u001a\u00020O8BX\u0002¢\u0006\f\n\u0004\bR\u0010\t\u001a\u0004\bP\u0010QR\u001b\u0010S\u001a\u00020@8BX\u0002¢\u0006\f\n\u0004\bV\u0010\t\u001a\u0004\bT\u0010UR\u001b\u0010W\u001a\u00020X8FX\u0002¢\u0006\f\n\u0004\b[\u0010\t\u001a\u0004\bY\u0010Z¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity;", "Lcom/ss/android/lark/todo/impl/framework/TodoBaseActivity;", "Lcom/ss/android/lark/eetroublecapture/ICaptureCallback;", "()V", "assigneeFrag", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentV2;", "getAssigneeFrag", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentV2;", "assigneeFrag$delegate", "Lkotlin/Lazy;", "commentAdapter", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2;", "currentShowFrag", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "descriptionFrag", "Lcom/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentV2;", "getDescriptionFrag", "()Lcom/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentV2;", "descriptionFrag$delegate", "finishAfterCreate", "", "followerFrag", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentV2;", "getFollowerFrag", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentV2;", "followerFrag$delegate", "fragmentFinishCallBack", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "getFragmentFinishCallBack", "()Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "fragmentFinishCallBack$delegate", "fragmentStack", "Ljava/util/Stack;", "historyFrag", "Lcom/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentV2;", "getHistoryFrag", "()Lcom/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentV2;", "historyFrag$delegate", "isInFastCreate", "keyboardManager", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection;", "keyboardViewModel", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoKeyboardViewModel;", "getKeyboardViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoKeyboardViewModel;", "keyboardViewModel$delegate", "loadingUI", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "getLoadingUI", "()Lcom/larksuite/component/ui/loading/LKUIStatus;", "loadingUI$delegate", "mBlockViewClickListener", "com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$mBlockViewClickListener$1", "Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$mBlockViewClickListener$1;", "mHandler", "Landroid/os/Handler;", "mTodoKeyboardFragment", "Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment;", "getMTodoKeyboardFragment", "()Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment;", "mTodoKeyboardFragment$delegate", "sectionManager", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "getSectionManager", "()Lcom/larksuite/framework/section/SectionManager;", "sectionManager$delegate", "summaryHasTouch", "tag", "", "getTag", "()Ljava/lang/String;", "timeFrag", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentViewV2;", "getTimeFrag", "()Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentViewV2;", "timeFrag$delegate", "todoInfoView", "Landroid/view/View;", "getTodoInfoView", "()Landroid/view/View;", "todoInfoView$delegate", "viewDataStore", "getViewDataStore", "()Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewDataStore$delegate", "viewModel", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewModel;", "getViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewModel;", "viewModel$delegate", "backPressNoFragmentHandle", "", "checkLoading", "showLoading", "expandCreateView", "finish", "fragmentInit", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "hideFastCreateKeyboard", "hideFragment", "hideKeyboard", "initKeyboard", "initRecyclerView", "initVM", "initVMObserver", "initView", "initViewListener", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCaptured", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "onStop", "parsePhotoResult", "parseShareResult", "pureHideFragment", "fragment", "pureShowFragment", "showFastCreateKeyboard", "showFragment", "showMergeForwardView", "todoResource", "Lcom/bytedance/lark/pb/todo/v1/TodoReferResource;", "updateDocsView", "updateFastCreate", "fastCreate", "updateOriginView", ShareHitPoint.f121868c, "title", "url", "updateStatusBar", "transparent", "updateView", "FragmentManager", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoDetailActivity extends TodoBaseActivity implements AbstractC36982d {

    /* renamed from: a */
    public final Handler f139414a = new Handler();

    /* renamed from: b */
    public boolean f139415b;

    /* renamed from: c */
    public CommentKeyboardSection f139416c;

    /* renamed from: d */
    public DetailBaseFragment f139417d;

    /* renamed from: e */
    private final String f139418e = "TodoDetailActivity";

    /* renamed from: f */
    private boolean f139419f;

    /* renamed from: g */
    private final C56351at f139420g = new C56351at(this);

    /* renamed from: h */
    private CommentAdapterV2 f139421h;

    /* renamed from: i */
    private final Lazy f139422i = LazyKt.lazy(new ar(this));

    /* renamed from: j */
    private boolean f139423j;

    /* renamed from: k */
    private final Lazy f139424k = LazyKt.lazy(new bf(this));

    /* renamed from: l */
    private final Lazy f139425l = LazyKt.lazy(new ba(this));

    /* renamed from: m */
    private final Lazy f139426m = LazyKt.lazy(new au(this));

    /* renamed from: n */
    private final Lazy f139427n = LazyKt.lazy(new as(this));

    /* renamed from: o */
    private final Lazy f139428o = LazyKt.lazy(new C56358e(this));

    /* renamed from: p */
    private final Stack<DetailBaseFragment> f139429p = new Stack<>();

    /* renamed from: q */
    private final Lazy f139430q = LazyKt.lazy(new be(this));

    /* renamed from: r */
    private final Lazy f139431r = LazyKt.lazy(new av(this));

    /* renamed from: s */
    private final Lazy f139432s = LazyKt.lazy(az.INSTANCE);

    /* renamed from: t */
    private final Lazy f139433t = LazyKt.lazy(C56353b.INSTANCE);

    /* renamed from: u */
    private final Lazy f139434u = LazyKt.lazy(C56357d.INSTANCE);

    /* renamed from: v */
    private final Lazy f139435v = LazyKt.lazy(C56356c.INSTANCE);

    /* renamed from: w */
    private final Lazy f139436w = LazyKt.lazy(new C56362g(this));

    /* renamed from: x */
    private HashMap f139437x;

    /* renamed from: B */
    private final LKUIStatus m219808B() {
        return (LKUIStatus) this.f139427n.getValue();
    }

    /* renamed from: a */
    public Context mo192023a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.todo.impl.framework.TodoBaseActivity
    /* renamed from: a */
    public View mo192024a(int i) {
        if (this.f139437x == null) {
            this.f139437x = new HashMap();
        }
        View view = (View) this.f139437x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f139437x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final TodoKeyboardViewModel mo192025a() {
        return (TodoKeyboardViewModel) this.f139422i.getValue();
    }

    /* renamed from: a */
    public void mo192026a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m219817a(this, context);
    }

    /* renamed from: b */
    public final ITodoDetailViewModel mo192030b() {
        return (ITodoDetailViewModel) this.f139424k.getValue();
    }

    /* renamed from: c */
    public final View mo192032c() {
        return (View) this.f139425l.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m219813a(this, configuration);
    }

    /* renamed from: e */
    public final TodoKeyboardFragment mo192035e() {
        return (TodoKeyboardFragment) this.f139426m.getValue();
    }

    public AssetManager getAssets() {
        return m219821c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m219819b(this);
    }

    /* renamed from: l */
    public final TodoDetailModel mo192042l() {
        return (TodoDetailModel) this.f139430q.getValue();
    }

    /* renamed from: m */
    public final SectionManager<ITodoDetailViewDataStore, TodoDetailModel> mo192043m() {
        return (SectionManager) this.f139431r.getValue();
    }

    /* renamed from: n */
    public final TodoDetailTimeFragmentViewV2 mo192044n() {
        return (TodoDetailTimeFragmentViewV2) this.f139432s.getValue();
    }

    /* renamed from: o */
    public final TodoDetailAssigneeFragmentV2 mo192045o() {
        return (TodoDetailAssigneeFragmentV2) this.f139433t.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m219816a(this);
    }

    /* renamed from: p */
    public final TodoDetailFollowerFragmentV2 mo192046p() {
        return (TodoDetailFollowerFragmentV2) this.f139434u.getValue();
    }

    /* renamed from: q */
    public final TodoDetailDescriptionFragmentV2 mo192047q() {
        return (TodoDetailDescriptionFragmentV2) this.f139435v.getValue();
    }

    /* renamed from: r */
    public final TodoDetailHistoryFragmentV2 mo192048r() {
        return (TodoDetailHistoryFragmentV2) this.f139436w.getValue();
    }

    /* renamed from: s */
    public Resources mo192049s() {
        return super.getResources();
    }

    /* renamed from: t */
    public AssetManager mo192050t() {
        return super.getAssets();
    }

    /* renamed from: a */
    public final void mo192029a(boolean z) {
        if (z) {
            StatusBarUtil.setTransparent(this);
        } else {
            setStatusBarColorResource(R.color.bg_body);
        }
    }

    /* renamed from: a */
    public final void mo192027a(TodoReferResource todoReferResource) {
        TodoReferResource.MessageResource messageResource;
        TodoReferResource.MessageResource messageResource2;
        if (todoReferResource.type == TodoReferResource.ResourceType.MESSAGE) {
            MergeForwardContent mergeForwardContent = null;
            Message a = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145370a((todoReferResource == null || (messageResource2 = todoReferResource.msg) == null) ? null : messageResource2.entity, (todoReferResource == null || (messageResource = todoReferResource.msg) == null) ? null : messageResource.msg_id);
            if ((a != null ? a.getType() : null) == Message.Type.MERGE_FORWARD) {
                if (a != null) {
                    mergeForwardContent = (MergeForwardContent) a.getContent();
                }
                Intrinsics.checkExpressionValueIsNotNull(mergeForwardContent, "message?.getContent<MergeForwardContent>()");
                if (mergeForwardContent != null) {
                    mergeForwardContent.setMessageId(a.getId());
                    ((TextView) mo192024a(R.id.todo_merge_title)).setMaxLines(2);
                    DesktopUtil.m144299a((TextView) mo192024a(R.id.todo_merge_title));
                    Pair<String, CharSequence> a2 = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145373a(mergeForwardContent);
                    if (a2 != null) {
                        ((TextView) mo192024a(R.id.todo_merge_title)).setText(a2.getFirst());
                        ((EllipsizedEmojiconTextView) mo192024a(R.id.todo_merge_content)).setTranslateEmojiCode(false);
                        ((EllipsizedEmojiconTextView) mo192024a(R.id.todo_merge_content)).setText(a2.getSecond());
                        View a3 = mo192024a(R.id.todo_merge_container);
                        Intrinsics.checkExpressionValueIsNotNull(a3, "todo_merge_container");
                        a3.setVisibility(0);
                    }
                    mo192024a(R.id.todo_merge_container).setOnClickListener(new ax(this, a, mergeForwardContent));
                    if (mo192030b().isEditable()) {
                        ImageView imageView = (ImageView) mo192024a(R.id.todo_merge_close);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "todo_merge_close");
                        imageView.setVisibility(0);
                        ((ImageView) mo192024a(R.id.todo_merge_close)).setOnClickListener(new ay(this, a, mergeForwardContent));
                        return;
                    }
                    ImageView imageView2 = (ImageView) mo192024a(R.id.todo_merge_close);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "todo_merge_close");
                    imageView2.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo192028a(DetailBaseFragment aVar) {
        if (!this.f139429p.empty()) {
            DetailBaseFragment peek = this.f139429p.peek();
            Intrinsics.checkExpressionValueIsNotNull(peek, "this");
            m219822c(peek);
        }
        this.f139429p.push(aVar);
        m219820b(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentViewV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class az extends Lambda implements Function0<TodoDetailTimeFragmentViewV2> {
        public static final az INSTANCE = new az();

        az() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailTimeFragmentViewV2 invoke() {
            return new TodoDetailTimeFragmentViewV2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$b */
    static final class C56353b extends Lambda implements Function0<TodoDetailAssigneeFragmentV2> {
        public static final C56353b INSTANCE = new C56353b();

        C56353b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailAssigneeFragmentV2 invoke() {
            return new TodoDetailAssigneeFragmentV2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$c */
    static final class C56356c extends Lambda implements Function0<TodoDetailDescriptionFragmentV2> {
        public static final C56356c INSTANCE = new C56356c();

        C56356c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailDescriptionFragmentV2 invoke() {
            return new TodoDetailDescriptionFragmentV2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$d */
    static final class C56357d extends Lambda implements Function0<TodoDetailFollowerFragmentV2> {
        public static final C56357d INSTANCE = new C56357d();

        C56357d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailFollowerFragmentV2 invoke() {
            return new TodoDetailFollowerFragmentV2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$fragmentFinishCallBack$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$fragmentFinishCallBack$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$e */
    static final class C56358e extends Lambda implements Function0<C563591> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56358e(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C563591 invoke() {
            return new DetailBaseFragment.FinishCallBack(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity.C56358e.C563591 */

                /* renamed from: a */
                final /* synthetic */ C56358e f139466a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139466a = r1;
                }
            };
        }
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        mo192030b().logTodoDetailOnScreenShot();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class ba extends Lambda implements Function0<View> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ba(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return View.inflate(this.this$0, R.layout.todo_detail_content, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$g */
    static final class C56362g extends Lambda implements Function0<TodoDetailHistoryFragmentV2> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56362g(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailHistoryFragmentV2 invoke() {
            return new TodoDetailHistoryFragmentV2(this.this$0.mo192043m());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$l */
    public static final /* synthetic */ class C56367l extends FunctionReference implements Function0<Unit> {
        C56367l(TodoDetailActivity todoDetailActivity) {
            super(0, todoDetailActivity);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "initView";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(TodoDetailActivity.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "initView()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((TodoDetailActivity) this.receiver).mo192034d();
        }
    }

    /* renamed from: F */
    private final void m219812F() {
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new C56360f(this), true);
    }

    /* renamed from: d */
    public final void mo192034d() {
        m219827x();
        m219829z();
        m219828y();
        mo192036f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        mo192043m().mo92080f();
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$fragmentInit$1", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "onFragmentViewCreated", "", "fm", "Landroidx/fragment/app/FragmentManager;", C13998f.f36682a, "Landroidx/fragment/app/Fragment;", "v", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$f */
    public static final class C56360f extends FragmentManager.AbstractC1010b {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139467a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$f$a */
        static final class RunnableC56361a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C56360f f139468a;

            /* renamed from: b */
            final /* synthetic */ Fragment f139469b;

            RunnableC56361a(C56360f fVar, Fragment fragment) {
                this.f139468a = fVar;
                this.f139469b = fragment;
            }

            public final void run() {
                Fragment fragment = this.f139469b;
                if (fragment instanceof IMVInitiator) {
                    ((IMVInitiator) fragment).mo192099b(this.f139468a.f139467a.mo192043m());
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56360f(TodoDetailActivity todoDetailActivity) {
            this.f139467a = todoDetailActivity;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
        /* renamed from: a */
        public void mo5403a(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(fragment, C13998f.f36682a);
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f139467a.f139414a.post(new RunnableC56361a(this, fragment));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoKeyboardViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class ar extends Lambda implements Function0<TodoKeyboardViewModel> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ar(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoKeyboardViewModel invoke() {
            return (TodoKeyboardViewModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity.ar.C563501 */

                /* renamed from: a */
                final /* synthetic */ ar f139448a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139448a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    TodoDetailActivity todoDetailActivity = this.f139448a.this$0;
                    ITodoDetailViewModel b = this.f139448a.this$0.mo192030b();
                    if (b != null) {
                        return new TodoKeyboardViewModel(null, todoDetailActivity, (ITodoKeyboardViewModel) b, false, 8, null);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel");
                }
            }).mo6005a(TodoKeyboardViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class as extends Lambda implements Function0<LKUIStatus> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        as(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LKUIStatus invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo192024a(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "loading_container");
            return new TodoLoadingUIBuilder(frameLayout).mo89859a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class au extends Lambda implements Function0<TodoKeyboardFragment> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoKeyboardFragment invoke() {
            TodoKeyboardFragment eVar = new TodoKeyboardFragment();
            TodoKeyboardViewModel a = this.this$0.mo192025a();
            Intrinsics.checkExpressionValueIsNotNull(a, "keyboardViewModel");
            eVar.mo192698a(a, this.this$0.mo192043m());
            return eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class av extends Lambda implements Function0<SectionManager<ITodoDetailViewDataStore, TodoDetailModel>> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        av(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SectionManager<ITodoDetailViewDataStore, TodoDetailModel> invoke() {
            return new SectionManager<>(new ISecManagerDependency(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity.av.C563521 */

                /* renamed from: a */
                final /* synthetic */ av f139450a;

                @Override // com.larksuite.framework.section.ISecManagerDependency
                /* renamed from: a */
                public Context mo92070a() {
                    return this.f139450a.this$0;
                }

                @Override // com.larksuite.framework.section.ISecManagerDependency
                /* renamed from: b */
                public LifecycleOwner mo92071b() {
                    return this.f139450a.this$0;
                }

                @Override // com.larksuite.framework.section.ISecManagerDependency
                /* renamed from: c */
                public androidx.lifecycle.ak mo92072c() {
                    androidx.lifecycle.ak viewModelStore = this.f139450a.this$0.getViewModelStore();
                    Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "this@TodoDetailActivity.viewModelStore");
                    return viewModelStore;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139450a = r1;
                }
            }, this.this$0.mo192042l());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class be extends Lambda implements Function0<TodoDetailModel> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        be(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailModel invoke() {
            ITodoDetailViewModel b = this.this$0.mo192030b();
            if (b != null) {
                return (TodoDetailModel) b;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class bf extends Lambda implements Function0<TodoDetailModel> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bf(TodoDetailActivity todoDetailActivity) {
            super(0);
            this.this$0 = todoDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDetailModel invoke() {
            return (TodoDetailModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity.bf.C563551 */

                /* renamed from: a */
                final /* synthetic */ bf f139465a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139465a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    Intent intent = this.f139465a.this$0.getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                    return new TodoDetailModel(intent);
                }
            }).mo6005a(TodoDetailModel.class);
        }
    }

    /* renamed from: v */
    private final void m219825v() {
        mo192028a(mo192035e());
        ((FrameLayout) mo192024a(R.id.todo_feature_fragment_container)).setOnClickListener(new aw(this));
    }

    /* renamed from: w */
    private final void m219826w() {
        FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.todo_feature_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "todo_feature_fragment_container");
        frameLayout.setClickable(false);
        mo192040j();
    }

    /* renamed from: x */
    private final void m219827x() {
        ((CommonTitleBar) mo192024a(R.id.title_bar)).setLeftClickListener(new aq(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$mBlockViewClickListener$1", "Lcom/larksuite/component/blockit/todo/ITodoBlockViewClickListener;", "onTodoBlockViewClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$at */
    public static final class C56351at implements ITodoBlockViewClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139449a;

        @Override // com.larksuite.component.blockit.todo.ITodoBlockViewClickListener
        /* renamed from: a */
        public void mo86334a() {
            TodoHitPoint.f141073a.mo194226e(this.f139449a.mo192030b().getGuid(), "chat");
            TodoGeneralHitPoint.m221669a(this.f139449a.mo192030b().getGuid(), "source_link_from_chat", false, 4, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56351at(TodoDetailActivity todoDetailActivity) {
            this.f139449a = todoDetailActivity;
        }
    }

    /* renamed from: A */
    private final void m219807A() {
        if (this.f139423j || !mo192030b().isCreateTodo() || !mo192030b().isShouldFastCreate()) {
            finish();
            return;
        }
        TodoHitPoint.f141073a.mo194223b(false);
        m219823c(true);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        mo192039i();
        if (this.f139423j || mo192030b().isChatKeyboardCreateTodo()) {
            Intent intent = new Intent();
            if (this.f139415b) {
                intent.putExtra("message_alert_todo_guid", mo192030b().getGuid());
            }
            setResult(-1, intent);
        }
        super.finish();
        Log.m165389i(this.f139418e, LogMessageUtil.f139260a.mo191765a("finish"));
    }

    /* renamed from: g */
    public void mo192037g() {
        super.onStop();
        mo192043m().mo92081g();
        if (this.f139419f) {
            mo192030b().updateTodo();
        }
        mo192030b().saveDraft();
        Log.m165389i(this.f139418e, LogMessageUtil.f139260a.mo191765a("onStop"));
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        boolean z = false;
        if (extras != null) {
            z = extras.getBoolean("todo_detail_key_horizontal_animation", false);
        }
        if (!mo192030b().isCreateTodo() || z) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        boolean z = false;
        if (extras != null) {
            z = extras.getBoolean("todo_detail_key_horizontal_animation", false);
        }
        if (!mo192030b().isCreateTodo() || z) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: i */
    public final void mo192039i() {
        mo192043m().mo92076e().getSummaryClearFocus().mo5926a((Boolean) true);
        mo192043m().mo92076e().getDescriptionClearFocus().mo5926a((Boolean) true);
        mo192043m().mo92076e().getSummaryHideKeyboard().mo5926a((Boolean) true);
    }

    /* renamed from: k */
    public final void mo192041k() {
        m219823c(false);
        mo192043m().mo92075d().mo92064a(83);
        mo192043m().mo92076e().getSummaryRequestFocus().mo5926a((Boolean) true);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (this.f139429p.size() > 0) {
            DetailBaseFragment peek = this.f139429p.peek();
            if (peek == null) {
                m219807A();
            } else if (peek instanceof TodoKeyboardFragment) {
                finish();
            } else {
                mo192040j();
            }
        } else {
            m219807A();
        }
        Log.m165389i(this.f139418e, LogMessageUtil.f139260a.mo191765a("onBackPressed"));
    }

    /* renamed from: u */
    private final void m219824u() {
        RecyclerView recyclerView = (RecyclerView) mo192024a(R.id.todo_content_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "todo_content_rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = (RecyclerView) mo192024a(R.id.todo_content_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "todo_content_rv");
        FlatItemsAdapter aVar = new FlatItemsAdapter();
        aVar.mo193084a(SingleItemAdapter.f140216a.mo193097a(mo192032c()));
        if (!mo192030b().isCreateTodo()) {
            CommentAdapterV2 aVar2 = new CommentAdapterV2(mo192043m());
            aVar.mo193084a(aVar2);
            this.f139421h = aVar2;
        }
        recyclerView2.setAdapter(aVar);
        mo192032c().post(new RunnableC56571d(new C56367l(this)));
    }

    /* renamed from: y */
    private final void m219828y() {
        TodoDetailActivity todoDetailActivity = this;
        mo192030b().getNeedUpdate().mo5923a(todoDetailActivity, new ak(this));
        mo192030b().getLoading().mo5923a(todoDetailActivity, new al(this));
        mo192030b().getActivityFinished().mo5923a(todoDetailActivity, new am(this));
        mo192030b().getToastStringResId().mo5923a(todoDetailActivity, new an(this));
        mo192030b().getShareEntity().mo5923a(todoDetailActivity, new ao(this));
        mo192030b().getReferResourceLv().mo5923a(todoDetailActivity, new ap(this));
    }

    /* renamed from: f */
    public final void mo192036f() {
        boolean z;
        FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.todo_block_view);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "todo_block_view");
        frameLayout.setVisibility(8);
        if (!mo192030b().isCreateTodo()) {
            String blockId = mo192030b().getBlockId();
            if (blockId != null) {
                if (blockId.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TodoAppreciableHitPoint.f141058a.mo194147f();
                    FrameLayout frameLayout2 = (FrameLayout) mo192024a(R.id.todo_block_view);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "todo_block_view");
                    frameLayout2.setVisibility(0);
                    TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency().mo145421a(blockId, this.f139420g, new bd(this));
                }
            }
            m219809C();
            TodoAppreciableHitPoint.f141058a.mo194144e();
        }
    }

    /* renamed from: j */
    public final void mo192040j() {
        if (!this.f139429p.empty()) {
            DetailBaseFragment pop = this.f139429p.pop();
            Intrinsics.checkExpressionValueIsNotNull(pop, "fragmentStack.pop()");
            m219822c(pop);
        }
        if (!this.f139429p.empty()) {
            DetailBaseFragment peek = this.f139429p.peek();
            Intrinsics.checkExpressionValueIsNotNull(peek, "this");
            m219820b(peek);
        }
        getSupportFragmentManager().popBackStack();
        Log.m165389i(this.f139418e, LogMessageUtil.f139260a.mo191765a("hideFragment"));
    }

    /* renamed from: C */
    private final void m219809C() {
        TextView textView = (TextView) mo192024a(R.id.todo_origin_view);
        Intrinsics.checkExpressionValueIsNotNull(textView, "todo_origin_view");
        textView.setVisibility(8);
        TodoOrigin todoOrigin = mo192030b().getTodoOrigin();
        if (todoOrigin != null) {
            if (todoOrigin.type == TodoOrigin.Type.HREF) {
                if (!TextUtils.isEmpty(todoOrigin.href.url)) {
                    String str = todoOrigin.href.title;
                    if (TextUtils.isEmpty(str)) {
                        if (mo192030b().getTodoSource() == TodoSource.DOC) {
                            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_UnnamedDocPlaceholder);
                        } else {
                            str = todoOrigin.href.url;
                        }
                    }
                    String str2 = todoOrigin.display_i18n_name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.display_i18n_name");
                    Intrinsics.checkExpressionValueIsNotNull(str, "title");
                    String str3 = todoOrigin.href.url;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "it.href.url");
                    m219818a(str2, str, str3);
                }
            } else if (mo192030b().getTodoSource() == TodoSource.DOC) {
                m219810D();
            }
        } else if (mo192030b().getTodoSource() == TodoSource.DOC) {
            m219810D();
        }
    }

    /* renamed from: D */
    private final void m219810D() {
        String str;
        TodoSourceHref todoSourceHref = mo192030b().getTodoSourceHref();
        if (todoSourceHref != null) {
            FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.todo_block_view);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "todo_block_view");
            frameLayout.setVisibility(8);
            TextView textView = (TextView) mo192024a(R.id.todo_origin_view);
            Intrinsics.checkExpressionValueIsNotNull(textView, "todo_origin_view");
            textView.setVisibility(0);
            TextView textView2 = (TextView) mo192024a(R.id.todo_origin_view);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "todo_origin_view");
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            if (TextUtils.isEmpty(todoSourceHref.title)) {
                str = getString(R.string.Todo_Task_UnnamedDocPlaceholder);
            } else {
                str = todoSourceHref.title;
            }
            ResUtil eVar = ResUtil.f139261a;
            Intrinsics.checkExpressionValueIsNotNull(str, "docsName");
            String a = eVar.mo191778a(R.string.Todo_Task_ViewInDocument, "DocsName", str);
            String str2 = a;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(ResUtil.f139261a.mo191775a(R.color.text_link_normal)), StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null), a.length(), 33);
            TextView textView3 = (TextView) mo192024a(R.id.todo_origin_view);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "todo_origin_view");
            textView3.setText(spannableString);
            ((TextView) mo192024a(R.id.todo_origin_view)).setOnClickListener(new bb(todoSourceHref, this));
        }
    }

    /* renamed from: z */
    private final void m219829z() {
        if (mo192030b().isCreateTodo()) {
            FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.keyboardContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "keyboardContainer");
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) mo192024a(R.id.keyboardContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "keyboardContainer");
        frameLayout2.setVisibility(0);
        FrameLayout frameLayout3 = (FrameLayout) mo192024a(R.id.content_detail_activity);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "content_detail_activity");
        this.f139416c = new CommentKeyboardSection(frameLayout3, mo192043m());
        ((CommonTitleBar) mo192024a(R.id.title_bar)).setOnTouchListener(new View$OnTouchListenerC56363h(this));
        ((FrameLayout) mo192024a(R.id.todo_comment_at_container)).setOnTouchListener(new View$OnTouchListenerC56364i(this));
        ((RecyclerView) mo192024a(R.id.todo_content_rv)).addOnScrollListener(new C56365j(this));
        mo192043m().mo92078a(new C56366k(this));
    }

    /* renamed from: E */
    private final void m219811E() {
        mo192043m().mo92078a(new C56368m(this));
        mo192043m().mo92078a(new C56379x(this));
        mo192043m().mo92078a(new C56344ad(this));
        mo192043m().mo92078a(new C56345ae(this));
        mo192043m().mo92078a(new C56346af(this));
        mo192043m().mo92078a(new C56347ag(this));
        mo192043m().mo92078a(new C56348ah(this));
        mo192043m().mo92078a(new C56349ai(this));
        mo192043m().mo92078a(new aj(this));
        mo192043m().mo92078a(C56369n.INSTANCE);
        mo192043m().mo92078a(C56370o.INSTANCE);
        mo192043m().mo92079b(C56371p.INSTANCE);
        mo192043m().mo92079b(C56372q.INSTANCE);
        mo192043m().mo92079b(C56373r.INSTANCE);
        mo192043m().mo92079b(C56374s.INSTANCE);
        mo192043m().mo92079b(C56375t.INSTANCE);
        mo192043m().mo92079b(C56376u.INSTANCE);
        mo192043m().mo92079b(C56377v.INSTANCE);
        mo192043m().mo92079b(C56378w.INSTANCE);
        mo192043m().mo92078a(new C56380y(this));
        mo192043m().mo92079b(C56381z.INSTANCE);
        mo192043m().mo92078a(new C56341aa(this));
        mo192043m().mo92079b(C56342ab.INSTANCE);
        mo192043m().mo92079b(C56343ac.INSTANCE);
        m219812F();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ak<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139441a;

        ak(TodoDetailActivity todoDetailActivity) {
            this.f139441a = todoDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f139441a.mo192036f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$updateView$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/view/View;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class bd implements IGetDataCallback<View> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139462a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        bd(TodoDetailActivity todoDetailActivity) {
            this.f139462a = todoDetailActivity;
        }

        /* renamed from: a */
        public void onSuccess(final View view) {
            if (view != null) {
                ((FrameLayout) this.f139462a.mo192024a(R.id.todo_block_view)).post(new Runnable() {
                    /* class com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity.bd.RunnableC563541 */

                    public final void run() {
                        ((FrameLayout) this.f139462a.mo192024a(R.id.todo_block_view)).removeAllViews();
                        ((FrameLayout) this.f139462a.mo192024a(R.id.todo_block_view)).addView(view);
                        TodoAppreciableHitPoint.f141058a.mo194149g();
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$initKeyboard$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$j */
    public static final class C56365j extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139472a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56365j(TodoDetailActivity todoDetailActivity) {
            this.f139472a = todoDetailActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1) {
                this.f139472a.mo192043m().mo92075d().mo92069a(250, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ab */
    public static final class C56342ab extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, FollowerViewModel> {
        public static final C56342ab INSTANCE = new C56342ab();

        C56342ab() {
            super(1);
        }

        public final FollowerViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new FollowerViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ac */
    public static final class C56343ac extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, TodoHistoryViewModel> {
        public static final C56343ac INSTANCE = new C56343ac();

        C56343ac() {
            super(1);
        }

        public final TodoHistoryViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new TodoHistoryViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "loading", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class al<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139442a;

        al(TodoDetailActivity todoDetailActivity) {
            this.f139442a = todoDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            TodoDetailActivity todoDetailActivity = this.f139442a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "loading");
            todoDetailActivity.mo192031b(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "entity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ao<T> implements AbstractC1178x<ShareEntity> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139445a;

        ao(TodoDetailActivity todoDetailActivity) {
            this.f139445a = todoDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(ShareEntity shareEntity) {
            Intrinsics.checkExpressionValueIsNotNull(shareEntity, "entity");
            ShareToastDisplayHelper.f139408a.mo192008a(this.f139445a, shareEntity);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "resource", "Lcom/bytedance/lark/pb/todo/v1/TodoReferResource;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ap<T> implements AbstractC1178x<TodoReferResource> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139446a;

        ap(TodoDetailActivity todoDetailActivity) {
            this.f139446a = todoDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(TodoReferResource todoReferResource) {
            TodoDetailActivity todoDetailActivity = this.f139446a;
            Intrinsics.checkExpressionValueIsNotNull(todoReferResource, "resource");
            todoDetailActivity.mo192027a(todoReferResource);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class aw implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139451a;

        aw(TodoDetailActivity todoDetailActivity) {
            this.f139451a = todoDetailActivity;
        }

        public final void onClick(View view) {
            TodoHitPoint.f141073a.mo194228g();
            this.f139451a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$n */
    public static final class C56369n extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, CommentPanelSection> {
        public static final C56369n INSTANCE = new C56369n();

        C56369n() {
            super(1);
        }

        public final CommentPanelSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new CommentPanelSection(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/ToastSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$o */
    public static final class C56370o extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, ToastSection> {
        public static final C56370o INSTANCE = new C56370o();

        C56370o() {
            super(1);
        }

        public final ToastSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new ToastSection(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TitleBarViewDataStore;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$p */
    public static final class C56371p extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, TitleBarViewDataStore> {
        public static final C56371p INSTANCE = new C56371p();

        C56371p() {
            super(1);
        }

        public final TitleBarViewDataStore invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new TitleBarViewDataStore(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$q */
    public static final class C56372q extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, TimeViewModel> {
        public static final C56372q INSTANCE = new C56372q();

        C56372q() {
            super(1);
        }

        public final TimeViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new TimeViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DetailMainViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$r */
    public static final class C56373r extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, DetailMainViewModel> {
        public static final C56373r INSTANCE = new C56373r();

        C56373r() {
            super(1);
        }

        public final DetailMainViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new DetailMainViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$s */
    public static final class C56374s extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, SummaryViewModel> {
        public static final C56374s INSTANCE = new C56374s();

        C56374s() {
            super(1);
        }

        public final SummaryViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new SummaryViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$t */
    public static final class C56375t extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, DescriptionViewModel> {
        public static final C56375t INSTANCE = new C56375t();

        C56375t() {
            super(1);
        }

        public final DescriptionViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new DescriptionViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$u */
    public static final class C56376u extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, CommentViewModel> {
        public static final C56376u INSTANCE = new C56376u();

        C56376u() {
            super(1);
        }

        public final CommentViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new CommentViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/BottomContainerViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$v */
    public static final class C56377v extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, BottomContainerViewModel> {
        public static final C56377v INSTANCE = new C56377v();

        C56377v() {
            super(1);
        }

        public final BottomContainerViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new BottomContainerViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$w */
    public static final class C56378w extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, AtViewModel> {
        public static final C56378w INSTANCE = new C56378w();

        C56378w() {
            super(1);
        }

        public final AtViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new AtViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$z */
    public static final class C56381z extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, AssigneeViewModel> {
        public static final C56381z INSTANCE = new C56381z();

        C56381z() {
            super(1);
        }

        public final AssigneeViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new AssigneeViewModel(gVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(new Bundle());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/FollowerSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$aa */
    public static final class C56341aa extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, FollowerSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56341aa(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final FollowerSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new FollowerSection(this.this$0.mo192032c(), fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$FragmentManager;", "Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ad */
    public static final class C56344ad extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, FragmentManager> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56344ad(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final FragmentManager invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            TodoDetailActivity todoDetailActivity = this.this$0;
            FrameLayout frameLayout = (FrameLayout) todoDetailActivity.mo192024a(R.id.todo_feature_fragment_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "todo_feature_fragment_container");
            return new FragmentManager(todoDetailActivity, frameLayout, fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/SummarySection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ae */
    public static final class C56345ae extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, SummarySection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56345ae(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final SummarySection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new SummarySection(this.this$0.mo192032c(), fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$af */
    public static final class C56346af extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, DescriptionSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56346af(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final DescriptionSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new DescriptionSection(this.this$0.mo192032c(), fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ah */
    public static final class C56348ah extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, CommentSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56348ah(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final CommentSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo192024a(R.id.content_detail_activity);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_detail_activity");
            return new CommentSection(frameLayout, fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ai */
    public static final class C56349ai extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, BottomContainerSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56349ai(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final BottomContainerSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo192024a(R.id.content_detail_activity);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_detail_activity");
            return new BottomContainerSection(frameLayout, fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class aj extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, CommentTitleSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final CommentTitleSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new CommentTitleSection(this.this$0.mo192032c(), fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class aq implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139447a;

        aq(TodoDetailActivity todoDetailActivity) {
            this.f139447a = todoDetailActivity;
        }

        public final void onClick(View view) {
            this.f139447a.onBackPressed();
            TodoHitPoint.m221738a(this.f139447a.mo192030b().isCreateTodo(), this.f139447a.mo192030b().getGuid());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class bc implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139460a;

        /* renamed from: b */
        final /* synthetic */ String f139461b;

        bc(TodoDetailActivity todoDetailActivity, String str) {
            this.f139460a = todoDetailActivity;
            this.f139461b = str;
        }

        public final void onClick(View view) {
            TodoHitPoint.m221735a("source_link_from_docs", false, 2, (Object) null);
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(this.f139460a, this.f139461b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$k */
    public static final class C56366k extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, CommentKeyboardSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56366k(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final CommentKeyboardSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            CommentKeyboardSection kVar = this.this$0.f139416c;
            if (kVar != null) {
                return kVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.todo.impl.features.detail.comment.CommentKeyboardSection");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$m */
    public static final class C56368m extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, TitleBarSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56368m(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final TitleBarSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo192024a(R.id.content_detail_activity);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_detail_activity");
            return new TitleBarSection(frameLayout, fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TimeSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$x */
    public static final class C56379x extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, TimeSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56379x(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final TimeSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new TimeSection(this.this$0.mo192032c(), fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$y */
    public static final class C56380y extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, AssigneeSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56380y(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final AssigneeSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new AssigneeSection(this.this$0.mo192032c(), fVar);
        }
    }

    /* renamed from: b */
    public static Resources m219819b(TodoDetailActivity todoDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoDetailActivity);
        }
        return todoDetailActivity.mo192049s();
    }

    /* renamed from: c */
    public static AssetManager m219821c(TodoDetailActivity todoDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoDetailActivity);
        }
        return todoDetailActivity.mo192050t();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AtSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$ag */
    public static final class C56347ag extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, AtSection> {
        final /* synthetic */ TodoDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56347ag(TodoDetailActivity todoDetailActivity) {
            super(1);
            this.this$0 = todoDetailActivity;
        }

        public final AtSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            View c = this.this$0.mo192032c();
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo192024a(R.id.content_detail_activity);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_detail_activity");
            return new AtSection(c, frameLayout, fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$showMergeForwardView$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ax implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139452a;

        /* renamed from: b */
        final /* synthetic */ Message f139453b;

        /* renamed from: c */
        final /* synthetic */ MergeForwardContent f139454c;

        ax(TodoDetailActivity todoDetailActivity, Message message, MergeForwardContent mergeForwardContent) {
            this.f139452a = todoDetailActivity;
            this.f139453b = message;
            this.f139454c = mergeForwardContent;
        }

        public final void onClick(View view) {
            String referResourceId = this.f139452a.mo192030b().getReferResourceId();
            if (referResourceId != null) {
                TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145374a(this.f139452a, this.f139454c, referResourceId);
            }
            TodoHitPoint.f141073a.mo194224d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$showMergeForwardView$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ay implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139455a;

        /* renamed from: b */
        final /* synthetic */ Message f139456b;

        /* renamed from: c */
        final /* synthetic */ MergeForwardContent f139457c;

        ay(TodoDetailActivity todoDetailActivity, Message message, MergeForwardContent mergeForwardContent) {
            this.f139455a = todoDetailActivity;
            this.f139456b = message;
            this.f139457c = mergeForwardContent;
        }

        public final void onClick(View view) {
            this.f139455a.mo192030b().setReferResourceId(null);
            View a = this.f139455a.mo192024a(R.id.todo_merge_container);
            Intrinsics.checkExpressionValueIsNotNull(a, "todo_merge_container");
            a.setVisibility(8);
            this.f139455a.mo192030b().updateTodo();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$updateDocsView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class bb implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoSourceHref f139458a;

        /* renamed from: b */
        final /* synthetic */ TodoDetailActivity f139459b;

        bb(TodoSourceHref todoSourceHref, TodoDetailActivity todoDetailActivity) {
            this.f139458a = todoSourceHref;
            this.f139459b = todoDetailActivity;
        }

        public final void onClick(View view) {
            TodoHitPoint.m221735a("source_link_from_docs", false, 2, (Object) null);
            TodoGeneralHitPoint.m221669a(this.f139459b.mo192030b().getGuid(), "source_link_from_docs", false, 4, null);
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(this.f139459b, this.f139458a.url);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.todo_detail_activity);
        m219823c(mo192030b().isCreateTodo());
        m219824u();
        m219811E();
        Log.m165389i(this.f139418e, LogMessageUtil.f139260a.mo191765a("onCreate"));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "resId", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class an<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139444a;

        an(TodoDetailActivity todoDetailActivity) {
            this.f139444a = todoDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            int g;
            int a = C57582a.m223600a(162);
            TodoKeyboardFragment e = this.f139444a.mo192035e();
            if (e != null && e.isVisible() && (g = e.mo192699g()) > 0) {
                a = (DeviceUtils.getScreenHeight(this.f139444a) - g) + C57582a.m223600a(60);
            }
            OperationToastHelper operationToastHelper = OperationToastHelper.f139395a;
            Context applicationContext = this.f139444a.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(num, "resId");
            operationToastHelper.mo191993a(applicationContext, num.intValue(), 80, 0, Integer.valueOf(a));
        }
    }

    /* renamed from: a */
    private final void m219815a(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("chat_ids_for_share_todo");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(stringArrayListExtra, "data.getStringArrayListE…           ?: ArrayList()");
        String stringExtra = intent.getStringExtra("comment_for_share_todo");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(stringExtra, "data.getStringExtra(KEY_…_SHARE_TODO_RESULT) ?: \"\"");
        if (CollectionUtils.isNotEmpty(stringArrayListExtra)) {
            mo192030b().shareTodo(stringArrayListExtra, stringExtra);
        }
    }

    /* renamed from: b */
    private final void m219820b(DetailBaseFragment aVar) {
        aVar.mo192100b(true);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.setCustomAnimations(aVar.mo192098b(), aVar.mo192101c());
        if (!aVar.mo192097a()) {
            beginTransaction.add(R.id.todo_feature_fragment_container, aVar, (String) null);
            aVar.mo192096a(true);
            aVar.mo192103e();
        } else {
            beginTransaction.show(aVar);
            aVar.mo192102d();
        }
        beginTransaction.commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
        String str = this.f139418e;
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i(str, cVar.mo191765a("showFragment " + aVar.getClass()));
    }

    /* renamed from: c */
    private final void m219822c(DetailBaseFragment aVar) {
        aVar.mo192100b(false);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(aVar.mo192098b(), aVar.mo192101c()).hide(aVar).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
        String str = this.f139418e;
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i(str, cVar.mo191765a("hideFragment " + aVar.getClass()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity$FragmentManager;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Lcom/ss/android/lark/todo/impl/features/detail/TodoDetailActivity;Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "lastBackMillion", "", "handleAction", "", "action", "", "initViewAction", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$a */
    public final class FragmentManager extends ViewSection<ITodoDetailViewDataStore> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139438a;

        /* renamed from: b */
        private long f139439b;

        /* renamed from: c */
        private final View f139440c;

        @Override // com.larksuite.framework.section.ViewSection
        /* renamed from: f */
        public void mo92109f() {
        }

        @Override // com.larksuite.framework.section.ViewSection
        /* renamed from: g */
        public void mo92110g() {
        }

        @Override // com.larksuite.framework.section.ViewSection
        /* renamed from: a */
        public void mo92097a(int i) {
            if (i == 5) {
                TodoDetailActivity todoDetailActivity = this.f139438a;
                todoDetailActivity.mo192028a(todoDetailActivity.mo192044n());
                TodoDetailActivity todoDetailActivity2 = this.f139438a;
                todoDetailActivity2.f139417d = todoDetailActivity2.mo192044n();
            } else if (i == 21) {
                TodoDetailActivity todoDetailActivity3 = this.f139438a;
                todoDetailActivity3.mo192028a(todoDetailActivity3.mo192045o());
                TodoDetailActivity todoDetailActivity4 = this.f139438a;
                todoDetailActivity4.f139417d = todoDetailActivity4.mo192045o();
            } else if (i == 31) {
                TodoDetailActivity todoDetailActivity5 = this.f139438a;
                todoDetailActivity5.mo192028a(todoDetailActivity5.mo192046p());
                TodoDetailActivity todoDetailActivity6 = this.f139438a;
                todoDetailActivity6.f139417d = todoDetailActivity6.mo192046p();
            } else if (i == 41) {
                ITodoDetailViewModel.C56785a.m220654a(this.f139438a.mo192030b(), false, 1, null);
            } else if (i == 44) {
                this.f139438a.mo192030b().updateTodo();
            } else if (i == 57) {
                TodoDetailActivity todoDetailActivity7 = this.f139438a;
                todoDetailActivity7.mo192028a(todoDetailActivity7.mo192047q());
                TodoDetailActivity todoDetailActivity8 = this.f139438a;
                todoDetailActivity8.f139417d = todoDetailActivity8.mo192047q();
            } else if (i == 200) {
                mo92107d().mo92069a(138, false);
            } else if (i == 412) {
                TodoDetailActivity todoDetailActivity9 = this.f139438a;
                todoDetailActivity9.mo192028a(todoDetailActivity9.mo192048r());
                TodoDetailActivity todoDetailActivity10 = this.f139438a;
                todoDetailActivity10.f139417d = todoDetailActivity10.mo192048r();
            } else if (i == 1001) {
                this.f139438a.mo192039i();
            } else if (i == 2001) {
                if (System.currentTimeMillis() - this.f139439b > ((long) ParticipantRepo.f117150c)) {
                    this.f139438a.mo192040j();
                }
                this.f139439b = System.currentTimeMillis();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FragmentManager(TodoDetailActivity todoDetailActivity, View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
            super(fVar);
            Intrinsics.checkParameterIsNotNull(view, "containerView");
            Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
            this.f139438a = todoDetailActivity;
            this.f139440c = view;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "finished", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class am<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139443a;

        am(TodoDetailActivity todoDetailActivity) {
            this.f139443a = todoDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "finished");
            if (bool.booleanValue() && this.f139443a.mo192030b().isCreateTodo() && (this.f139443a.mo192030b().isCreateFromMessage() || this.f139443a.mo192030b().isCreateFromMultiMessage())) {
                TodoGeneralHitPoint.f141070a.mo194209j(this.f139443a.mo192030b().getGuid());
                Bundle bundle = new Bundle();
                bundle.putBinder("message_alert_drawable", new BinderC57853n(this.f139443a.getDrawable(R.drawable.todo_svg_icon_message_alert)));
                bundle.putString("message_alert_text", ResUtil.f139261a.mo191781c(R.string.Todo_Task_SendTaskToChatShortcut));
                Intent intent = new Intent();
                intent.putExtra("message_alert_bundle", bundle);
                intent.putExtra("message_alert_todo_guid", this.f139443a.mo192030b().getGuid());
                this.f139443a.setResult(-1, intent);
            }
            if (bool.booleanValue()) {
                this.f139443a.f139415b = true;
                this.f139443a.finish();
            }
        }
    }

    /* renamed from: a */
    public static void m219816a(TodoDetailActivity todoDetailActivity) {
        todoDetailActivity.mo192037g();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TodoDetailActivity todoDetailActivity2 = todoDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    todoDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private final void m219823c(boolean z) {
        boolean z2;
        if (!z || !mo192030b().isShouldFastCreate()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f139423j = z2;
        if (z2) {
            SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout = (SysKeyBoardObserveFrameLayout) mo192024a(R.id.edit_activity_root);
            Intrinsics.checkExpressionValueIsNotNull(sysKeyBoardObserveFrameLayout, "edit_activity_root");
            sysKeyBoardObserveFrameLayout.setVisibility(4);
            m219825v();
            FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.content_detail_activity);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_detail_activity");
            if (frameLayout.getLayoutTransition() == null) {
                FrameLayout frameLayout2 = (FrameLayout) mo192024a(R.id.content_detail_activity);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "content_detail_activity");
                frameLayout2.setLayoutTransition(C56793b.m220695a(0, DeviceUtils.getScreenWidth(this), LocationRequest.PRIORITY_INDOOR));
            }
        } else {
            if (mo192030b().isCreateTodo()) {
                TodoGeneralHitPoint.f141070a.mo194202g();
            }
            SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout2 = (SysKeyBoardObserveFrameLayout) mo192024a(R.id.edit_activity_root);
            Intrinsics.checkExpressionValueIsNotNull(sysKeyBoardObserveFrameLayout2, "edit_activity_root");
            sysKeyBoardObserveFrameLayout2.setVisibility(0);
            m219826w();
        }
        mo192029a(this.f139423j);
    }

    /* renamed from: b */
    public final void mo192031b(boolean z) {
        if (z) {
            FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "loading_container");
            frameLayout.setVisibility(0);
            m219808B().mo89837a();
        } else if (!mo192030b().getHasValidTodo()) {
            FrameLayout frameLayout2 = (FrameLayout) mo192024a(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "loading_container");
            frameLayout2.setVisibility(0);
            m219808B().mo89843b();
        } else if (!mo192030b().getCanRead()) {
            FrameLayout frameLayout3 = (FrameLayout) mo192024a(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "loading_container");
            frameLayout3.setVisibility(0);
            m219808B().mo89844b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_UnableToViewTaskDetails));
        } else if (mo192030b().isDeleted()) {
            FrameLayout frameLayout4 = (FrameLayout) mo192024a(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "loading_container");
            frameLayout4.setVisibility(0);
            m219808B().mo89844b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_BotMsgTaskDeleted));
        } else {
            FrameLayout frameLayout5 = (FrameLayout) mo192024a(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout5, "loading_container");
            frameLayout5.setVisibility(8);
            m219808B().mo89849f();
        }
    }

    /* renamed from: a */
    private final void m219814a(int i, Intent intent) {
        CommentKeyboardSection kVar = this.f139416c;
        if (kVar != null) {
            kVar.mo192407a(i, intent);
        }
    }

    /* renamed from: a */
    public static void m219817a(TodoDetailActivity todoDetailActivity, Context context) {
        todoDetailActivity.mo192026a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoDetailActivity);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$h */
    public static final class View$OnTouchListenerC56363h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139470a;

        View$OnTouchListenerC56363h(TodoDetailActivity todoDetailActivity) {
            this.f139470a = todoDetailActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f139470a.mo192043m().mo92075d().mo92069a(138, false);
            this.f139470a.mo192043m().mo92075d().mo92069a(250, true);
            return view.performClick();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity$i */
    public static final class View$OnTouchListenerC56364i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailActivity f139471a;

        View$OnTouchListenerC56364i(TodoDetailActivity todoDetailActivity) {
            this.f139471a = todoDetailActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f139471a.mo192043m().mo92075d().mo92069a(138, false);
            this.f139471a.mo192043m().mo92075d().mo92069a(250, true);
            return view.performClick();
        }
    }

    /* renamed from: a */
    public static Context m219813a(TodoDetailActivity todoDetailActivity, Configuration configuration) {
        Context a = todoDetailActivity.mo192023a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo192043m().mo92077a(i, i2, intent);
        if (intent == null) {
            return;
        }
        if (i2 == 1) {
            m219815a(intent);
        } else {
            m219814a(i, intent);
        }
    }

    /* renamed from: a */
    private final void m219818a(String str, String str2, String str3) {
        FrameLayout frameLayout = (FrameLayout) mo192024a(R.id.todo_block_view);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "todo_block_view");
        frameLayout.setVisibility(8);
        TextView textView = (TextView) mo192024a(R.id.todo_origin_view);
        Intrinsics.checkExpressionValueIsNotNull(textView, "todo_origin_view");
        textView.setVisibility(0);
        TextView textView2 = (TextView) mo192024a(R.id.todo_origin_view);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "todo_origin_view");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        HashMap hashMap = new HashMap();
        hashMap.put("TaskSource", str);
        hashMap.put("SourceLocation", str2);
        String a = ResUtil.f139261a.mo191779a(R.string.Todo_Task_ViewInSomewhere, hashMap);
        String str4 = a;
        SpannableString spannableString = new SpannableString(str4);
        spannableString.setSpan(new ForegroundColorSpan(ResUtil.f139261a.mo191775a(R.color.text_link_normal)), StringsKt.indexOf$default((CharSequence) str4, str2, 0, false, 6, (Object) null), a.length(), 33);
        TextView textView3 = (TextView) mo192024a(R.id.todo_origin_view);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "todo_origin_view");
        textView3.setText(spannableString);
        ((TextView) mo192024a(R.id.todo_origin_view)).setOnClickListener(new bc(this, str3));
    }
}
