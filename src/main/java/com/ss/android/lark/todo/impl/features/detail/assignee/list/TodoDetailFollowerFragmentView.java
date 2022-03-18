package com.ss.android.lark.todo.impl.features.detail.assignee.list;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentView;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "ability", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "blueAdd", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "getBlueAdd", "()Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "blueAdd$delegate", "Lkotlin/Lazy;", "initRecyclerView", "", "initTitleView", "initViewAction", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.f */
public final class TodoDetailFollowerFragmentView extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139543a;

    /* renamed from: b */
    private final Lazy f139544b = LazyKt.lazy(new C56425a(this));

    /* renamed from: c */
    private final IViewAbility<ITodoDetailViewDataStore> f139545c;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: j */
    public final IActionTitlebar.TextAction mo192152j() {
        return (IActionTitlebar.TextAction) this.f139544b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentView$blueAdd$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentView$blueAdd$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.f$a */
    static final class C56425a extends Lambda implements Function0<C564261> {
        final /* synthetic */ TodoDetailFollowerFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56425a(TodoDetailFollowerFragmentView fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C564261 invoke() {
            return new IActionTitlebar.TextAction(this, UIHelper.getString(R.string.Todo_common_Add), R.color.primary_pri_500, 16) {
                /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoDetailFollowerFragmentView.C56425a.C564261 */

                /* renamed from: a */
                final /* synthetic */ C56425a f139546a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    this.f139546a.this$0.mo92107d().mo92064a(32);
                }

                {
                    this.f139546a = r1;
                }
            };
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        mo92103a(((ITodoDetailViewDataStore) mo92096a()).getFollowerFragmentShowAdd(), new C56428c(this));
        m219951k();
        m219952l();
    }

    /* renamed from: k */
    private final void m219951k() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f139543a.findViewById(R.id.title_bar);
        commonTitleBar.setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Follower));
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC56427b(this));
    }

    /* renamed from: l */
    private final void m219952l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo92106c());
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) this.f139543a.findViewById(R.id.assignee_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "containerView.assignee_list");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) this.f139543a.findViewById(R.id.assignee_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "containerView.assignee_list");
        recyclerView2.setAdapter(new TodoFollowerAdapter(this.f139545c));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentView$initTitleView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.f$b */
    public static final class View$OnClickListenerC56427b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailFollowerFragmentView f139547a;

        View$OnClickListenerC56427b(TodoDetailFollowerFragmentView fVar) {
            this.f139547a = fVar;
        }

        public final void onClick(View view) {
            this.f139547a.mo92107d().mo92064a(2001);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailFollowerFragmentView$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.f$c */
    static final class C56428c extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoDetailFollowerFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56428c(TodoDetailFollowerFragmentView fVar) {
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
            ((CommonTitleBar) this.this$0.f139543a.findViewById(R.id.title_bar)).removeAllActions();
            if (z) {
                ((CommonTitleBar) this.this$0.f139543a.findViewById(R.id.title_bar)).addAction(this.this$0.mo192152j());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDetailFollowerFragmentView(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "ability");
        this.f139543a = view;
        this.f139545c = fVar;
    }
}
