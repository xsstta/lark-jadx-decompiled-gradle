package com.ss.android.lark.todo.impl.features.chatlist.mvvm;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.chatlist.adapter.TodoChatListAdapter;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.C56808c;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderRecyclerView;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "addCenterAction", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "getAddCenterAction", "()Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "addCenterAction$delegate", "Lkotlin/Lazy;", "mListAdapter", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter;", "getMListAdapter", "()Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter;", "mListAdapter$delegate", "mScrollToTopRunnable", "Ljava/lang/Runnable;", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel;", "getMViewModel", "()Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel;", "mViewModel$delegate", "addListScrollListener", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initBackGround", "initListLiveData", "initListener", "initPtrLayout", "initTitleBar", "initTodoList", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "preloadingList", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setAnimationAttr", "showActiveConfirmDialog", "todoDisplayItem", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "showCompleteConfirmDialog", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoChatListActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public static final Companion f139322b = new Companion(null);

    /* renamed from: a */
    public final Runnable f139323a = new RunnableC56302r(this);

    /* renamed from: c */
    private final Lazy f139324c = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TodoChatListViewModel.class), new TodoChatListActivity$$special$$inlined$viewModels$2(this), new TodoChatListActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: d */
    private final Lazy f139325d = LazyKt.lazy(new C56301q(this));

    /* renamed from: e */
    private final Lazy f139326e = LazyKt.lazy(new C56285b(this));

    /* renamed from: f */
    private HashMap f139327f;

    /* renamed from: f */
    private final IActionTitlebar.TextAction m219694f() {
        return (IActionTitlebar.TextAction) this.f139326e.getValue();
    }

    /* renamed from: a */
    public Context mo191843a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo191844a(int i) {
        if (this.f139327f == null) {
            this.f139327f = new HashMap();
        }
        View view = (View) this.f139327f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f139327f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final TodoChatListViewModel mo191845a() {
        return (TodoChatListViewModel) this.f139324c.getValue();
    }

    /* renamed from: a */
    public void mo191846a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m219691a(this, context);
    }

    /* renamed from: b */
    public final TodoChatListAdapter mo191849b() {
        return (TodoChatListAdapter) this.f139325d.getValue();
    }

    /* renamed from: c */
    public Resources mo191851c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m219689a(this, configuration);
    }

    /* renamed from: d */
    public void mo191853d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo191854e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m219693c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m219690a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m219692b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$Companion;", "", "()V", "DELAY_DURATION", "", "KEY_PARAMS_FROM_CHAT", "", "KEY_PARAMS_IS_THREAD", "TAG", "startTodoChatList", "", "context", "Landroid/content/Context;", "chatId", "isThread", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo191856a(Context context, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Log.m165389i("TodoChatListActivity", LogMessageUtil.f139260a.mo191765a("startTodoChatList"));
            TodoHitPoint.m221758k("chat_todo_list");
            TodoAppreciableHitPoint.f141058a.mo194167u();
            Intent intent = new Intent();
            intent.setClass(context, TodoChatListActivity.class);
            intent.putExtra("key_from_chat", str);
            intent.putExtra("key_is_thread", z);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$q */
    static final class C56301q extends Lambda implements Function0<TodoChatListAdapter> {
        final /* synthetic */ TodoChatListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56301q(TodoChatListActivity todoChatListActivity) {
            super(0);
            this.this$0 = todoChatListActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoChatListAdapter invoke() {
            return new TodoChatListAdapter(this.this$0.mo191845a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$showActiveConfirmDialog$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$s */
    public static final class C56303s implements MultiCompleteHelper.IMultiCompleteDialogListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139344a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f139345b;

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: a */
        public void mo191869a() {
            this.f139344a.mo191845a().changeTodoCompleteStatus(false, this.f139345b);
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: b */
        public void mo191870b() {
            this.f139344a.mo191845a().onConfirmDialogCancelClicked();
        }

        C56303s(TodoChatListActivity todoChatListActivity, TodoDisplayItem todoDisplayItem) {
            this.f139344a = todoChatListActivity;
            this.f139345b = todoDisplayItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$showCompleteConfirmDialog$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$t */
    public static final class C56304t implements MultiCompleteHelper.IMultiCompleteDialogListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139346a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f139347b;

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: a */
        public void mo191869a() {
            this.f139346a.mo191845a().changeTodoCompleteStatus(true, this.f139347b);
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: b */
        public void mo191870b() {
            this.f139346a.mo191845a().onConfirmDialogCancelClicked();
        }

        C56304t(TodoChatListActivity todoChatListActivity, TodoDisplayItem todoDisplayItem) {
            this.f139346a = todoChatListActivity;
            this.f139347b = todoDisplayItem;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        UICallbackExecutor.removeCallbacks(this.f139323a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$addCenterAction$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$addCenterAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$b */
    static final class C56285b extends Lambda implements Function0<C562861> {
        final /* synthetic */ TodoChatListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56285b(TodoChatListActivity todoChatListActivity) {
            super(0);
            this.this$0 = todoChatListActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C562861 invoke() {
            return new IActionTitlebar.TextAction(this, UIHelper.getString(R.string.Todo_TaskCenter_ViewMore), R.color.text_title, 16) {
                /* class com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity.C56285b.C562861 */

                /* renamed from: a */
                final /* synthetic */ C56285b f139328a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    TodoGeneralHitPoint.f141070a.mo194200f();
                    TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency().mo145417b(this.f139328a.this$0);
                }

                {
                    this.f139328a = r1;
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$r */
    static final class RunnableC56302r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139343a;

        RunnableC56302r(TodoChatListActivity todoChatListActivity) {
            this.f139343a = todoChatListActivity;
        }

        public final void run() {
            PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) this.f139343a.mo191844a(R.id.todo_list);
            Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView, "todo_list");
            RecyclerView.LayoutManager layoutManager = pinnedHeaderRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    /* renamed from: j */
    private final void m219698j() {
        ((PinnedHeaderRecyclerView) mo191844a(R.id.todo_list)).addOnScrollListener(new C56287c(this));
    }

    /* renamed from: k */
    private final void m219699k() {
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) mo191844a(R.id.todo_list);
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

    /* renamed from: l */
    private final void m219700l() {
        TodoChatListActivity todoChatListActivity = this;
        mo191845a().getTodoChatListItem().mo5923a(todoChatListActivity, new C56294j(this));
        mo191845a().getScrollToListTop().mo5923a(todoChatListActivity, new C56295k(this));
        mo191845a().getCanFetchMore().mo5923a(todoChatListActivity, new C56296l(this));
    }

    /* renamed from: g */
    private final void m219695g() {
        ((RelativeLayout) mo191844a(R.id.todo_loading_container)).setOnClickListener(new View$OnClickListenerC56288d(this));
        TodoChatListActivity todoChatListActivity = this;
        mo191845a().getDataFetchStatus().mo5923a(todoChatListActivity, new C56289e(this));
        mo191845a().getNoTodoLabel().mo5923a(todoChatListActivity, new C56290f(this));
        mo191845a().getShowToast().mo5923a(todoChatListActivity, new C56291g(this));
        mo191845a().getShowActiveDialog().mo5923a(todoChatListActivity, new C56292h(this));
        mo191845a().getShowCompleteDialog().mo5923a(todoChatListActivity, new C56293i(this));
    }

    /* renamed from: h */
    private final void m219696h() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this);
        ((LKUIPtrClassicFrameLayout) mo191844a(R.id.todo_ptr_layout)).setFooterView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) mo191844a(R.id.todo_ptr_layout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo191844a(R.id.todo_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "todo_ptr_layout");
        lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        ((LKUIPtrClassicFrameLayout) mo191844a(R.id.todo_ptr_layout)).setPtrHandler(new C56298n(this));
    }

    /* renamed from: i */
    private final void m219697i() {
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(this);
        stableLinearLayoutManager.setOrientation(1);
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) mo191844a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView, "todo_list");
        pinnedHeaderRecyclerView.setLayoutManager(stableLinearLayoutManager);
        ((PinnedHeaderRecyclerView) mo191844a(R.id.todo_list)).setIsChatList(true);
        mo191849b().mo191816a(new C56300p(this));
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = (PinnedHeaderRecyclerView) mo191844a(R.id.todo_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView2, "todo_list");
        pinnedHeaderRecyclerView2.setAdapter(mo191849b());
        ((PinnedHeaderRecyclerView) mo191844a(R.id.todo_list)).addItemDecoration(new C56808c());
        m219700l();
        m219699k();
        m219698j();
    }

    /* renamed from: m */
    private final void m219701m() {
        ((CommonTitleBar) mo191844a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC56299o(this));
        ((CommonTitleBar) mo191844a(R.id.title_bar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        ((CommonTitleBar) mo191844a(R.id.title_bar)).setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Tasks));
        ((CommonTitleBar) mo191844a(R.id.title_bar)).addAction(m219694f());
    }

    /* renamed from: n */
    private final void m219702n() {
        Drawable findDrawableByLayerId;
        View findViewById = ((UDShadowLayout) mo191844a(R.id.todo_chat_list_append_view)).findViewById(R.id.create_bt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "todo_chat_list_append_vi…mageView>(R.id.create_bt)");
        Drawable drawable = ((ImageView) findViewById).getDrawable();
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (!(layerDrawable == null || (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.add_bold)) == null)) {
            findDrawableByLayerId.setTint(UIUtils.getColor(this, R.color.static_white));
        }
        ((ImageView) mo191844a(R.id.create_bt)).setOnClickListener(new View$OnClickListenerC56297m(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$addListScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$c */
    public static final class C56287c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139329a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56287c(TodoChatListActivity todoChatListActivity) {
            this.f139329a = todoChatListActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f139329a.mo191847a(recyclerView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$initPtrLayout$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$n */
    public static final class C56298n extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139340a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56298n(TodoChatListActivity todoChatListActivity) {
            this.f139340a = todoChatListActivity;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f139340a.mo191845a().loadMoreTodoDatas(true, this.f139340a.mo191849b().getItemCount());
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            if (!this.f139340a.mo191845a().getCanLoadMore() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$o */
    public static final class View$OnClickListenerC56299o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139341a;

        View$OnClickListenerC56299o(TodoChatListActivity todoChatListActivity) {
            this.f139341a = todoChatListActivity;
        }

        public final void onClick(View view) {
            this.f139341a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListActivity$initTodoList$1", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleOperationListener;", "onTitleStateChanged", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "isExpand", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$p */
    public static final class C56300p implements TodoChatListAdapter.ITitleOperationListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139342a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56300p(TodoChatListActivity todoChatListActivity) {
            this.f139342a = todoChatListActivity;
        }

        @Override // com.ss.android.lark.todo.impl.features.chatlist.adapter.TodoChatListAdapter.ITitleOperationListener
        /* renamed from: a */
        public void mo191824a(TodoDisplayItem.ChatListTitleType chatListTitleType, boolean z) {
            Intrinsics.checkParameterIsNotNull(chatListTitleType, "titleType");
            this.f139342a.mo191845a().updateTitleState(chatListTitleType, z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$h */
    public static final class C56292h<T> implements AbstractC1178x<TodoDisplayItem> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139334a;

        C56292h(TodoChatListActivity todoChatListActivity) {
            this.f139334a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(TodoDisplayItem todoDisplayItem) {
            TodoChatListActivity todoChatListActivity = this.f139334a;
            Intrinsics.checkExpressionValueIsNotNull(todoDisplayItem, "it");
            todoChatListActivity.mo191848a(todoDisplayItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$i */
    public static final class C56293i<T> implements AbstractC1178x<TodoDisplayItem> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139335a;

        C56293i(TodoChatListActivity todoChatListActivity) {
            this.f139335a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(TodoDisplayItem todoDisplayItem) {
            TodoChatListActivity todoChatListActivity = this.f139335a;
            Intrinsics.checkExpressionValueIsNotNull(todoDisplayItem, "it");
            todoChatListActivity.mo191850b(todoDisplayItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$j */
    public static final class C56294j<T> implements AbstractC1178x<List<? extends TodoDisplayItem>> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139336a;

        C56294j(TodoChatListActivity todoChatListActivity) {
            this.f139336a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<TodoDisplayItem> list) {
            this.f139336a.mo191849b().mo191817a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$k */
    public static final class C56295k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139337a;

        C56295k(TodoChatListActivity todoChatListActivity) {
            this.f139337a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            UICallbackExecutor.executeDelayed(this.f139337a.f139323a, 100);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$m */
    public static final class View$OnClickListenerC56297m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139339a;

        View$OnClickListenerC56297m(TodoChatListActivity todoChatListActivity) {
            this.f139339a = todoChatListActivity;
        }

        public final void onClick(View view) {
            this.f139339a.mo191845a().createTodo(this.f139339a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$d */
    public static final class View$OnClickListenerC56288d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139330a;

        View$OnClickListenerC56288d(TodoChatListActivity todoChatListActivity) {
            this.f139330a = todoChatListActivity;
        }

        public final void onClick(View view) {
            if (this.f139330a.mo191845a().getDataFetchStatus().mo5927b() == TodoFetchStatus.FIRST_PAGE_FAILED) {
                this.f139330a.mo191845a().reloadFirstPageData();
            }
        }
    }

    /* renamed from: a */
    public static Resources m219690a(TodoChatListActivity todoChatListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoChatListActivity);
        }
        return todoChatListActivity.mo191851c();
    }

    /* renamed from: c */
    public static AssetManager m219693c(TodoChatListActivity todoChatListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoChatListActivity);
        }
        return todoChatListActivity.mo191854e();
    }

    /* renamed from: b */
    public final void mo191850b(TodoDisplayItem todoDisplayItem) {
        MultiCompleteHelper.f139390a.mo191985b(this, new C56304t(this, todoDisplayItem));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$f */
    public static final class C56290f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139332a;

        C56290f(TodoChatListActivity todoChatListActivity) {
            this.f139332a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            RelativeLayout relativeLayout = (RelativeLayout) this.f139332a.mo191844a(R.id.empty_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "empty_container");
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
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
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$l */
    public static final class C56296l<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139338a;

        C56296l(TodoChatListActivity todoChatListActivity) {
            this.f139338a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            LKUIPtrFrameLayout.Mode mode;
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f139338a.mo191844a(R.id.todo_ptr_layout);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "todo_ptr_layout");
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                mode = LKUIPtrFrameLayout.Mode.LOAD_MORE;
            } else {
                mode = LKUIPtrFrameLayout.Mode.NONE;
            }
            lKUIPtrClassicFrameLayout.setMode(mode);
        }
    }

    /* renamed from: b */
    public static void m219692b(TodoChatListActivity todoChatListActivity) {
        todoChatListActivity.mo191853d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TodoChatListActivity todoChatListActivity2 = todoChatListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    todoChatListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.todo_chat_list_bg);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.setNavigationBarColor(ResUtil.f139261a.mo191775a(R.color.bg_base));
        m219701m();
        m219702n();
        m219696h();
        m219697i();
        m219695g();
        TodoChatListViewModel a = mo191845a();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        a.initData(intent);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "toastUnit", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$g */
    public static final class C56291g<T> implements AbstractC1178x<TodoListToastUnit> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139333a;

        C56291g(TodoChatListActivity todoChatListActivity) {
            this.f139333a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(TodoListToastUnit dVar) {
            int i = C56321a.f139366b[dVar.mo193214b().ordinal()];
            if (i == 1) {
                OperationToastHelper.m219774a(OperationToastHelper.f139395a, this.f139333a, dVar.mo193213a(), null, null, null, 28, null);
            } else if (i == 2) {
                OperationToastHelper.m219775a(OperationToastHelper.f139395a, this.f139333a, dVar.mo193213a(), null, null, null, null, 60, null);
            } else if (i == 3) {
                OperationToastHelper.m219777b(OperationToastHelper.f139395a, this.f139333a, dVar.mo193213a(), dVar.mo193215c(), null, null, null, 56, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "fetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity$e */
    public static final class C56289e<T> implements AbstractC1178x<TodoFetchStatus> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListActivity f139331a;

        C56289e(TodoChatListActivity todoChatListActivity) {
            this.f139331a = todoChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(TodoFetchStatus todoFetchStatus) {
            if (todoFetchStatus == TodoFetchStatus.NONE || todoFetchStatus == TodoFetchStatus.SUCCESS) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f139331a.mo191844a(R.id.todo_loading_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "todo_loading_container");
                relativeLayout.setVisibility(8);
                LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f139331a.mo191844a(R.id.todo_ptr_layout);
                Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "todo_ptr_layout");
                if (lKUIPtrClassicFrameLayout.getMode() == LKUIPtrFrameLayout.Mode.LOAD_MORE) {
                    ((LKUIPtrClassicFrameLayout) this.f139331a.mo191844a(R.id.todo_ptr_layout)).refreshComplete();
                }
            } else if (todoFetchStatus == TodoFetchStatus.NEXT_PAGE_FAILED) {
                ((LKUIPtrClassicFrameLayout) this.f139331a.mo191844a(R.id.todo_ptr_layout)).refreshComplete();
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f139331a.mo191844a(R.id.empty_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "empty_container");
                relativeLayout2.setVisibility(8);
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f139331a.mo191844a(R.id.todo_loading_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "todo_loading_container");
                relativeLayout3.setVisibility(0);
                if (todoFetchStatus != null) {
                    int i = C56321a.f139365a[todoFetchStatus.ordinal()];
                    if (i == 1) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f139331a.mo191844a(R.id.todo_lottie_loading_anim);
                        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "todo_lottie_loading_anim");
                        lottieAnimationView.setVisibility(0);
                        ((LottieAnimationView) this.f139331a.mo191844a(R.id.todo_lottie_loading_anim)).playAnimation();
                        LinearLayout linearLayout = (LinearLayout) this.f139331a.mo191844a(R.id.todo_loading_error_ll);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "todo_loading_error_ll");
                        linearLayout.setVisibility(8);
                    } else if (i == 2) {
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f139331a.mo191844a(R.id.todo_lottie_loading_anim);
                        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "todo_lottie_loading_anim");
                        lottieAnimationView2.setVisibility(8);
                        ((LottieAnimationView) this.f139331a.mo191844a(R.id.todo_lottie_loading_anim)).cancelAnimation();
                        LinearLayout linearLayout2 = (LinearLayout) this.f139331a.mo191844a(R.id.todo_loading_error_ll);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "todo_loading_error_ll");
                        linearLayout2.setVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo191847a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
            if (layoutManager instanceof StableLinearLayoutManager) {
                StableLinearLayoutManager stableLinearLayoutManager = (StableLinearLayoutManager) layoutManager;
                int findLastCompletelyVisibleItemPosition = stableLinearLayoutManager.findLastCompletelyVisibleItemPosition();
                int itemCount = stableLinearLayoutManager.getItemCount();
                if (((double) findLastCompletelyVisibleItemPosition) >= ((double) itemCount) * 0.8d) {
                    mo191845a().loadMoreTodoDatas(false, itemCount);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo191848a(TodoDisplayItem todoDisplayItem) {
        MultiCompleteHelper.f139390a.mo191983a(this, new C56303s(this, todoDisplayItem));
    }

    /* renamed from: a */
    public static void m219691a(TodoChatListActivity todoChatListActivity, Context context) {
        todoChatListActivity.mo191846a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoChatListActivity);
        }
    }

    /* renamed from: a */
    public static Context m219689a(TodoChatListActivity todoChatListActivity, Configuration configuration) {
        Context a = todoChatListActivity.mo191843a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
