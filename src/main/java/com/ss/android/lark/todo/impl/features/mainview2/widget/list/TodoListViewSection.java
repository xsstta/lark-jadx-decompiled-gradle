package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.C56808c;
import com.ss.android.lark.todo.impl.features.mainview2.entity.CheckBoxActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.DeleteActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.LoadMoreActionData;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TitleActionData;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.IMainFragmentLiveDataStore;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater.TodoListAdapter;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListSectionListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.recyclerView.PinnedHeaderRecyclerView;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.shine.ListScrollShineLogic;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0010\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020(H\u0003J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\u0018\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020(H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020(H\u0002J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J\b\u00107\u001a\u00020(H\u0002R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "containerView", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListSectionListener;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListSectionListener;Lcom/larksuite/framework/section/IViewAbility;)V", "isContentAnimate", "", "()Z", "setContentAnimate", "(Z)V", "itemListener", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$itemListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$itemListener$1;", "lastMotionEvent", "Landroid/graphics/PointF;", "listAdapter", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter;", "getListAdapter", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter;", "listAdapter$delegate", "Lkotlin/Lazy;", "ptrFrameLayout", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "scrollListDistance", "", "scrollShineLogic", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/shine/ListScrollShineLogic;", "getScrollShineLogic", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/shine/ListScrollShineLogic;", "scrollShineLogic$delegate", "scrollToTopRunnable", "Ljava/lang/Runnable;", "todoRecyclerView", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/recyclerView/PinnedHeaderRecyclerView;", "addListScrollListener", "", "addLoadMoreListener", "addTouchListener", "initViewAction", "initViewObserver", "modifyTitleBarProcess", "touchSlop", "dy", "onDestroy", "preloadingList", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "resetListItemState", "setAdapterListener", "setAnimationAttr", "showTitleBarWhenMoveToTop", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f */
public final class TodoListViewSection extends ViewSection<IMainFragmentLiveDataStore> {

    /* renamed from: h */
    public static final Companion f140800h = new Companion(null);

    /* renamed from: l */
    private static final int f140801l = C57582a.m223600a(40);

    /* renamed from: a */
    public final LKUIPtrClassicFrameLayout f140802a;

    /* renamed from: b */
    public final PinnedHeaderRecyclerView f140803b;

    /* renamed from: c */
    public final PointF f140804c = new PointF();

    /* renamed from: d */
    public int f140805d;

    /* renamed from: e */
    public final C57115m f140806e = new C57115m(this);

    /* renamed from: f */
    public final Runnable f140807f = new RunnableC57118p(this);

    /* renamed from: g */
    public final IListSectionListener f140808g;

    /* renamed from: i */
    private boolean f140809i;

    /* renamed from: j */
    private final Lazy f140810j = LazyKt.lazy(new C57116n(this));

    /* renamed from: k */
    private final Lazy f140811k = LazyKt.lazy(new C57117o(this));

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: k */
    public final TodoListAdapter mo193822k() {
        return (TodoListAdapter) this.f140810j.getValue();
    }

    /* renamed from: l */
    public final ListScrollShineLogic mo193823l() {
        return (ListScrollShineLogic) this.f140811k.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$Companion;", "", "()V", "SCROLL_DELAY_DURATION", "", "SCROLL_UP_THRESHOLD", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$n */
    static final class C57116n extends Lambda implements Function0<TodoListAdapter> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57116n(TodoListViewSection fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoListAdapter invoke() {
            return new TodoListAdapter(this.this$0.f140806e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$p */
    static final class RunnableC57118p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoListViewSection f140818a;

        RunnableC57118p(TodoListViewSection fVar) {
            this.f140818a = fVar;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager = this.f140818a.f140803b.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    /* renamed from: r */
    private final void m221335r() {
        mo193822k().mo193746a(new C57119q(this));
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: h */
    public void mo92111h() {
        super.mo92111h();
        UICallbackExecutor.removeCallbacks(this.f140807f);
    }

    /* renamed from: j */
    public final void mo193821j() {
        mo193822k().mo86622b();
        mo193823l().mo193814b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/shine/ListScrollShineLogic;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$o */
    static final class C57117o extends Lambda implements Function0<ListScrollShineLogic> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57117o(TodoListViewSection fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ListScrollShineLogic invoke() {
            return new ListScrollShineLogic(this.this$0.mo193822k(), this.this$0.f140803b);
        }
    }

    /* renamed from: n */
    private final void m221331n() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        this.f140803b.setOnTouchListener(new View$OnTouchListenerC57106d(this, booleanRef));
    }

    /* renamed from: p */
    private final void m221333p() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(ResUtil.f139261a.mo191776a());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(ResUtil.appContext)");
        this.f140803b.addOnScrollListener(new C57104b(this, viewConfiguration.getScaledTouchSlop()));
    }

    /* renamed from: o */
    private final void m221332o() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(mo92106c());
        this.f140802a.setFooterView(chatWindowPtrLoadingHeader);
        this.f140802a.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.f140802a.setMode(LKUIPtrFrameLayout.Mode.NONE);
        this.f140802a.setPtrHandler(new C57105c(this));
    }

    /* renamed from: q */
    private final void m221334q() {
        RecyclerView.ItemAnimator itemAnimator = this.f140803b.getItemAnimator();
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

    /* renamed from: m */
    public final void mo193824m() {
        Boolean b = ((IMainFragmentLiveDataStore) mo92096a()).mo193591h().mo5927b();
        if (b == null) {
            b = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "getViewDataStore().showTitleBar.value ?: true");
        if (!b.booleanValue() && !this.f140803b.canScrollVertically(-1)) {
            mo92107d().mo92064a(502);
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        IMainFragmentLiveDataStore aVar = (IMainFragmentLiveDataStore) mo92096a();
        mo92103a(aVar.mo193597n(), new C57107e(aVar, this));
        mo92103a(aVar.mo193605v(), new C57108f(this));
        mo92103a(aVar.mo193607x(), new C57109g(this));
        mo92103a(aVar.mo193609z(), new C57110h(this));
        mo92103a(aVar.mo193601r(), new C57111i(aVar, this));
        mo92103a(aVar.mo193599p(), new C57112j(this));
        mo92103a(aVar.mo193593j(), new C57113k(this));
        mo92103a(aVar.mo193544B(), new C57114l(this));
    }

    /* renamed from: a */
    public final void mo193819a(boolean z) {
        this.f140809i = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$addLoadMoreListener$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$c */
    public static final class C57105c extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ TodoListViewSection f140814a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57105c(TodoListViewSection fVar) {
            this.f140814a = fVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f140814a.mo92107d().mo92066a(503, (IActionData) new LoadMoreActionData(true, this.f140814a.mo193822k().getItemCount()));
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Boolean b = ((IMainFragmentLiveDataStore) this.f140814a.mo92096a()).mo193603t().mo5927b();
            if (b == null) {
                b = true;
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "getViewDataStore().hasMoreData.value ?: true");
            if (!b.booleanValue() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$e */
    static final class C57107e extends Lambda implements Function1<List<? extends TodoItemViewData>, Unit> {
        final /* synthetic */ IMainFragmentLiveDataStore $this_apply;
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57107e(IMainFragmentLiveDataStore aVar, TodoListViewSection fVar) {
            super(1);
            this.$this_apply = aVar;
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TodoItemViewData> list) {
            invoke((List<TodoItemViewData>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<TodoItemViewData> list) {
            boolean z;
            Boolean second;
            Boolean first;
            Intrinsics.checkParameterIsNotNull(list, "it");
            TodoListView.Type b = this.$this_apply.mo193593j().mo5927b();
            if (b == null) {
                b = TodoListView.Type.ALL;
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "todoFilterType.value ?: ALL");
            if (b == TodoListView.Type.COMPLETED || b == TodoListView.Type.FROM_DOC) {
                this.this$0.f140802a.refreshComplete();
            }
            TodoAppreciableHitPoint.f141058a.mo194129a(list.size());
            TodoListAdapter k = this.this$0.mo193822k();
            Pair<Boolean, Boolean> b2 = this.$this_apply.mo193605v().mo5927b();
            boolean z2 = true;
            if (b2 == null || (first = b2.getFirst()) == null) {
                z = true;
            } else {
                z = first.booleanValue();
            }
            k.mo193748a(z);
            TodoListAdapter k2 = this.this$0.mo193822k();
            Pair<Boolean, Boolean> b3 = this.$this_apply.mo193605v().mo5927b();
            if (!(b3 == null || (second = b3.getSecond()) == null)) {
                z2 = second.booleanValue();
            }
            k2.mo193749b(z2);
            this.this$0.mo193822k().mo193747a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$f */
    static final class C57108f extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57108f(TodoListViewSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(Pair<Boolean, Boolean> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            this.this$0.mo193822k().mo193748a(pair.getFirst().booleanValue());
            this.this$0.mo193822k().mo193749b(pair.getSecond().booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$i */
    static final class C57111i extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ IMainFragmentLiveDataStore $this_apply;
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57111i(IMainFragmentLiveDataStore aVar, TodoListViewSection fVar) {
            super(1);
            this.$this_apply = aVar;
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            ListScrollShineLogic l = this.this$0.mo193823l();
            TodoSortType b = this.$this_apply.mo193599p().mo5927b();
            if (b == null) {
                b = TodoSortType.DUE_TIME;
            }
            l.mo193813a(str, b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$j */
    static final class C57112j extends Lambda implements Function1<TodoSortType, Unit> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57112j(TodoListViewSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoSortType todoSortType) {
            invoke(todoSortType);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoSortType todoSortType) {
            Intrinsics.checkParameterIsNotNull(todoSortType, "it");
            this.this$0.mo193822k().mo193744a(todoSortType);
            UICallbackExecutor.executeDelayed(this.this$0.f140807f, 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$7"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$k */
    static final class C57113k extends Lambda implements Function1<TodoListView.Type, Unit> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57113k(TodoListViewSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoListView.Type type) {
            invoke(type);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoListView.Type type) {
            LKUIPtrFrameLayout.Mode mode;
            Intrinsics.checkParameterIsNotNull(type, "it");
            this.this$0.mo193822k().mo86622b();
            this.this$0.mo193822k().mo193743a(type);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.this$0.f140802a;
            int i = C57120g.f140820a[type.ordinal()];
            if (i == 1) {
                mode = LKUIPtrFrameLayout.Mode.LOAD_MORE;
            } else if (i != 2) {
                mode = LKUIPtrFrameLayout.Mode.NONE;
            } else {
                mode = LKUIPtrFrameLayout.Mode.LOAD_MORE;
            }
            lKUIPtrClassicFrameLayout.setMode(mode);
            UICallbackExecutor.executeDelayed(this.this$0.f140807f, 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$8"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$l */
    static final class C57114l extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57114l(TodoListViewSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final void invoke(boolean z) {
            this.this$0.f140805d = 0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J2\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$itemListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListItemClickListener;", "onBehindDeleteItemClicked", "", "todoGuid", "", "behindDeleteStatus", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "onItemCheckBoxClicked", "isTargetCompleted", "", "multiCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "onItemDetailClick", "onShareItemClicked", "summary", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$m */
    public static final class C57115m implements IListItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoListViewSection f140817a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57115m(TodoListViewSection fVar) {
            this.f140817a = fVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener
        /* renamed from: a */
        public void mo193773a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "todoGuid");
            this.f140817a.mo92107d().mo92068a(CommonCode.StatusCode.API_CLIENT_EXPIRED, str);
            this.f140817a.mo193821j();
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener
        /* renamed from: a */
        public void mo193775a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "todoGuid");
            Intrinsics.checkParameterIsNotNull(str2, "summary");
            this.f140817a.f140808g.mo193541a(str, str2);
            this.f140817a.mo193821j();
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener
        /* renamed from: a */
        public void mo193774a(String str, TodoItemViewData.BehindDeleteStatus behindDeleteStatus, TodoSource todoSource) {
            Intrinsics.checkParameterIsNotNull(str, "todoGuid");
            Intrinsics.checkParameterIsNotNull(behindDeleteStatus, "behindDeleteStatus");
            Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
            this.f140817a.mo92107d().mo92066a(1004, (IActionData) new DeleteActionData(str, behindDeleteStatus, todoSource));
            this.f140817a.mo193821j();
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener
        /* renamed from: a */
        public void mo193776a(String str, boolean z, TodoSource todoSource, MultiCompleteHelper.MultiCompleteType multiCompleteType, CustomComplete.Action action) {
            int i;
            Intrinsics.checkParameterIsNotNull(str, "todoGuid");
            Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
            Intrinsics.checkParameterIsNotNull(multiCompleteType, "multiCompleteType");
            if (action != null) {
                this.f140817a.mo92107d().mo92066a(1007, (IActionData) new CheckBoxActionData(str, z, todoSource, multiCompleteType, action));
            } else {
                if (todoSource == TodoSource.DOC) {
                    i = 1003;
                } else {
                    i = 1002;
                }
                this.f140817a.mo92107d().mo92066a(i, (IActionData) new CheckBoxActionData(str, z, todoSource, multiCompleteType, null, 16, null));
            }
            this.f140817a.mo193821j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$setAdapterListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleOperationListener;", "onTitleStateChanged", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "isTargetExpand", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$q */
    public static final class C57119q implements TodoListAdapter.ITitleOperationListener {

        /* renamed from: a */
        final /* synthetic */ TodoListViewSection f140819a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57119q(TodoListViewSection fVar) {
            this.f140819a = fVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater.TodoListAdapter.ITitleOperationListener
        /* renamed from: a */
        public void mo193756a(TodoItemViewData.TitleType titleType, boolean z) {
            int i;
            Intrinsics.checkParameterIsNotNull(titleType, "titleType");
            this.f140819a.mo193822k().mo86622b();
            if (titleType == TodoItemViewData.TitleType.DOING || titleType == TodoItemViewData.TitleType.DONE) {
                i = 1006;
            } else {
                i = 1005;
            }
            this.f140819a.mo92107d().mo92066a(i, (IActionData) new TitleActionData(titleType, z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$g */
    static final class C57109g extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57109g(TodoListViewSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.mo193823l().mo193814b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$h */
    static final class C57110h extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoListViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57110h(TodoListViewSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.mo193822k().mo86622b();
        }
    }

    /* renamed from: a */
    public final void mo193818a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        TodoListView.Type b = ((IMainFragmentLiveDataStore) mo92096a()).mo193593j().mo5927b();
        if (b == TodoListView.Type.COMPLETED && b == TodoListView.Type.FROM_DOC && (layoutManager = recyclerView.getLayoutManager()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
            if (layoutManager instanceof StableLinearLayoutManager) {
                StableLinearLayoutManager stableLinearLayoutManager = (StableLinearLayoutManager) layoutManager;
                if (((double) stableLinearLayoutManager.findLastCompletelyVisibleItemPosition()) >= ((double) stableLinearLayoutManager.getItemCount()) * 0.8d) {
                    mo92107d().mo92066a(503, (IActionData) new LoadMoreActionData(false, mo193822k().getItemCount()));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection$addListScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$b */
    public static final class C57104b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ TodoListViewSection f140812a;

        /* renamed from: b */
        final /* synthetic */ int f140813b;

        C57104b(TodoListViewSection fVar, int i) {
            this.f140812a = fVar;
            this.f140813b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f140812a.mo193823l().mo193812a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f140812a.mo193820b(this.f140813b, i2);
            this.f140812a.mo193818a(recyclerView);
        }
    }

    /* renamed from: b */
    public final void mo193820b(int i, int i2) {
        if (i2 < 0 && !this.f140803b.canScrollVertically(-1)) {
            mo92107d().mo92064a(502);
        } else if (!this.f140809i) {
            Boolean b = ((IMainFragmentLiveDataStore) mo92096a()).mo193591h().mo5927b();
            boolean z = true;
            if (b == null) {
                b = true;
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "getViewDataStore().showTitleBar.value ?: true");
            boolean booleanValue = b.booleanValue();
            int i3 = this.f140805d;
            if (i3 < (-i) && !booleanValue) {
                mo92107d().mo92064a(502);
            } else if (i3 <= f140801l || !booleanValue) {
                z = booleanValue;
            } else {
                mo92107d().mo92064a(501);
                z = false;
            }
            if ((i2 > 0 && z) || (i2 < 0 && !z)) {
                this.f140805d += i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.f$d */
    public static final class View$OnTouchListenerC57106d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ TodoListViewSection f140815a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f140816b;

        View$OnTouchListenerC57106d(TodoListViewSection fVar, Ref.BooleanRef booleanRef) {
            this.f140815a = fVar;
            this.f140816b = booleanRef;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.f140815a.f140804c.x = motionEvent.getX();
                this.f140815a.f140804c.y = motionEvent.getY();
            }
            if (motionEvent.getAction() == 2 && !this.f140816b.element) {
                this.f140815a.mo193823l().mo193814b();
                this.f140815a.mo193824m();
                this.f140815a.mo193822k().mo86622b();
                this.f140816b.element = true;
            }
            if (motionEvent.getAction() == 1) {
                Intrinsics.checkExpressionValueIsNotNull(view, "v");
                if (view.getId() != 0 && (view instanceof PinnedHeaderRecyclerView)) {
                    float f = (float) 5;
                    if (Math.abs(this.f140815a.f140804c.x - motionEvent.getX()) <= f && Math.abs(this.f140815a.f140804c.y - motionEvent.getY()) <= f) {
                        this.f140815a.mo193822k().mo86622b();
                    }
                }
                this.f140816b.element = false;
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoListViewSection(View view, IListSectionListener cVar, IViewAbility<IMainFragmentLiveDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140808g = cVar;
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) view.findViewById(R.id.todo_refactor_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "containerView.todo_refactor_ptr_layout");
        this.f140802a = lKUIPtrClassicFrameLayout;
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = (PinnedHeaderRecyclerView) view.findViewById(R.id.todo_refactor_list);
        Intrinsics.checkExpressionValueIsNotNull(pinnedHeaderRecyclerView, "containerView.todo_refactor_list");
        this.f140803b = pinnedHeaderRecyclerView;
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(mo92106c());
        stableLinearLayoutManager.setOrientation(1);
        pinnedHeaderRecyclerView.setLayoutManager(stableLinearLayoutManager);
        m221335r();
        pinnedHeaderRecyclerView.setAdapter(mo193822k());
        pinnedHeaderRecyclerView.addItemDecoration(new C56808c());
        m221334q();
        m221331n();
        m221332o();
        m221333p();
    }
}
