package com.ss.android.lark.todo.impl.features.detail.history;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.todo.v1.Record;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.widget.TodoLoadingUIBuilder;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016R\u001b\u0010\b\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentView;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "view", "Landroid/view/View;", "ability", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "adapter", "Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2;", "getAdapter", "()Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2;", "adapter$delegate", "Lkotlin/Lazy;", "loadingUI", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "getLoadingUI", "()Lcom/larksuite/component/ui/loading/LKUIStatus;", "loadingUI$delegate", "checkLoadingView", "", "isLoading", "", "enterPage", "initPtr", "initRecyclerView", "initTitleView", "initViewAction", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b */
public final class TodoDetailHistoryFragmentView extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139708a;

    /* renamed from: b */
    private final Lazy f139709b;

    /* renamed from: c */
    private final Lazy f139710c = LazyKt.lazy(new C56487g(this));

    /* renamed from: n */
    private final LKUIStatus m220192n() {
        return (LKUIStatus) this.f139710c.getValue();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: j */
    public final TodoHistoryAdapterV2 mo192314j() {
        return (TodoHistoryAdapterV2) this.f139709b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$a */
    static final class C56481a extends Lambda implements Function0<TodoHistoryAdapterV2> {
        final /* synthetic */ IViewAbility $ability;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56481a(IViewAbility fVar) {
            super(0);
            this.$ability = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoHistoryAdapterV2 invoke() {
            return new TodoHistoryAdapterV2(this.$ability);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$g */
    static final class C56487g extends Lambda implements Function0<LKUIStatus> {
        final /* synthetic */ TodoDetailHistoryFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56487g(TodoDetailHistoryFragmentView bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LKUIStatus invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.f139708a.findViewById(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.loading_container");
            return new TodoLoadingUIBuilder(frameLayout).mo89859a();
        }
    }

    /* renamed from: k */
    private final void m220189k() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f139708a.findViewById(R.id.title_bar);
        commonTitleBar.setTitle(R.string.Todo_Task_Changelog);
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC56483c(this));
        TodoHitPoint.m221754g(((ITodoDetailViewDataStore) mo92096a()).getGuid());
    }

    /* renamed from: l */
    private final void m220190l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo92106c());
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) this.f139708a.findViewById(R.id.history_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.history_list");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) this.f139708a.findViewById(R.id.history_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "view.history_list");
        recyclerView2.setAdapter(mo192314j());
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getHistoryRecords(), new C56484d(this));
        mo92103a(qVar.getHistoryIsLoading(), new C56485e(this));
        mo92103a(qVar.getHistoryHasMore(), new C56486f(this));
    }

    /* renamed from: m */
    private final void m220191m() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(mo92106c());
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f139708a.findViewById(R.id.history_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "view.history_ptr_layout");
        lKUIPtrClassicFrameLayout.setHeaderView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f139708a.findViewById(R.id.history_ptr_layout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader2 = new ChatWindowPtrLoadingHeader(mo92106c());
        ((LKUIPtrClassicFrameLayout) this.f139708a.findViewById(R.id.history_ptr_layout)).setFooterView(chatWindowPtrLoadingHeader2);
        ((LKUIPtrClassicFrameLayout) this.f139708a.findViewById(R.id.history_ptr_layout)).addPtrUIHandler(chatWindowPtrLoadingHeader2);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f139708a.findViewById(R.id.history_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "view.history_ptr_layout");
        lKUIPtrClassicFrameLayout2.setMode(LKUIPtrFrameLayout.Mode.REFRESH);
        ((LKUIPtrClassicFrameLayout) this.f139708a.findViewById(R.id.history_ptr_layout)).setPtrHandler(new C56482b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentView$initPtr$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "onLoadMoreBegin", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "onRefreshBegin", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$b */
    public static final class C56482b extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ TodoDetailHistoryFragmentView f139711a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56482b(TodoDetailHistoryFragmentView bVar) {
            this.f139711a = bVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f139711a.mo92107d().mo92064a(301);
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f139711a.mo92107d().mo92064a(LocationRequest.PRIORITY_INDOOR);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/lark/pb/todo/v1/Record;", "invoke", "com/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentView$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$d */
    static final class C56484d extends Lambda implements Function1<List<? extends Record>, Unit> {
        final /* synthetic */ TodoDetailHistoryFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56484d(TodoDetailHistoryFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Record> list) {
            invoke((List<Record>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<Record> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.this$0.mo192314j().mo192321a(list);
            ((LKUIPtrClassicFrameLayout) this.this$0.f139708a.findViewById(R.id.history_ptr_layout)).refreshComplete();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentView$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$e */
    static final class C56485e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoDetailHistoryFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56485e(TodoDetailHistoryFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192313a(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentView$initTitleView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$c */
    public static final class View$OnClickListenerC56483c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailHistoryFragmentView f139712a;

        View$OnClickListenerC56483c(TodoDetailHistoryFragmentView bVar) {
            this.f139712a = bVar;
        }

        public final void onClick(View view) {
            this.f139712a.mo92107d().mo92064a(2001);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/history/TodoDetailHistoryFragmentView$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.b$f */
    static final class C56486f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoDetailHistoryFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56486f(TodoDetailHistoryFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.this$0.f139708a.findViewById(R.id.history_ptr_layout);
                Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "view.history_ptr_layout");
                lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.BOTH);
                return;
            }
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.this$0.f139708a.findViewById(R.id.history_ptr_layout);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "view.history_ptr_layout");
            lKUIPtrClassicFrameLayout2.setMode(LKUIPtrFrameLayout.Mode.REFRESH);
        }
    }

    /* renamed from: a */
    public final void mo192313a(boolean z) {
        int i;
        List<Record> b;
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f139708a.findViewById(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.loading_container");
            frameLayout.setVisibility(0);
            m220192n().mo89837a();
            return;
        }
        LiveData<List<Record>> historyRecords = ((ITodoDetailViewDataStore) mo92096a()).getHistoryRecords();
        if (historyRecords == null || (b = historyRecords.mo5927b()) == null) {
            i = 0;
        } else {
            i = b.size();
        }
        if (i > 0) {
            FrameLayout frameLayout2 = (FrameLayout) this.f139708a.findViewById(R.id.loading_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "view.loading_container");
            frameLayout2.setVisibility(8);
            m220192n().mo89849f();
            return;
        }
        FrameLayout frameLayout3 = (FrameLayout) this.f139708a.findViewById(R.id.loading_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "view.loading_container");
        frameLayout3.setVisibility(0);
        m220192n().mo89843b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDetailHistoryFragmentView(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "ability");
        this.f139708a = view;
        this.f139709b = LazyKt.lazy(new C56481a(fVar));
        m220189k();
        m220190l();
        m220191m();
    }
}
