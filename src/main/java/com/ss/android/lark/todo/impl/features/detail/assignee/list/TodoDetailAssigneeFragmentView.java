package com.ss.android.lark.todo.impl.features.detail.assignee.list;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001c\u0010\u0019¨\u0006$"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "ability", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Landroidx/fragment/app/FragmentManager;Lcom/larksuite/framework/section/IViewAbility;)V", "assigneeAdapter", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "getAssigneeAdapter", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "assigneeAdapter$delegate", "Lkotlin/Lazy;", "assigneeFragments", "", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/AssigneeRecycleFragment;", "getAssigneeFragments", "()Ljava/util/List;", "assigneeFragments$delegate", "blueAdd", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "getBlueAdd", "()Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "blueAdd$delegate", "greyAdd", "getGreyAdd", "greyAdd$delegate", "initRecyclerView", "", "initTitleView", "initViewAction", "initViewObserver", "initViewPager", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d */
public final class TodoDetailAssigneeFragmentView extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139528a;

    /* renamed from: b */
    public final IViewAbility<ITodoDetailViewDataStore> f139529b;

    /* renamed from: c */
    private final Lazy f139530c = LazyKt.lazy(new C56414c(this));

    /* renamed from: d */
    private final Lazy f139531d = LazyKt.lazy(C56416d.INSTANCE);

    /* renamed from: e */
    private final Lazy f139532e = LazyKt.lazy(new C56413b(this));

    /* renamed from: f */
    private final Lazy f139533f = LazyKt.lazy(new C56412a(this));

    /* renamed from: g */
    private final FragmentManager f139534g;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: j */
    public final IActionTitlebar.TextAction mo192143j() {
        return (IActionTitlebar.TextAction) this.f139530c.getValue();
    }

    /* renamed from: k */
    public final IActionTitlebar.TextAction mo192144k() {
        return (IActionTitlebar.TextAction) this.f139531d.getValue();
    }

    /* renamed from: l */
    public final List<AssigneeRecycleFragment> mo192145l() {
        return (List) this.f139532e.getValue();
    }

    /* renamed from: m */
    public final TodoAssigneeAdapter mo192146m() {
        return (TodoAssigneeAdapter) this.f139533f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$a */
    static final class C56412a extends Lambda implements Function0<TodoAssigneeAdapter> {
        final /* synthetic */ TodoDetailAssigneeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56412a(TodoDetailAssigneeFragmentView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoAssigneeAdapter invoke() {
            return new TodoAssigneeAdapter(this.this$0.f139529b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$initViewPager$1", "Landroidx/fragment/app/FragmentPagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$i */
    public static final class C56422i extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ TodoDetailAssigneeFragmentView f139537a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f139537a.mo192145l().size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return this.f139537a.mo192145l().get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.f139537a.mo192145l().get(i).mo192126a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56422i(TodoDetailAssigneeFragmentView dVar, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f139537a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/AssigneeRecycleFragment;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$b */
    static final class C56413b extends Lambda implements Function0<ArrayList<AssigneeRecycleFragment>> {
        final /* synthetic */ TodoDetailAssigneeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56413b(TodoDetailAssigneeFragmentView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<AssigneeRecycleFragment> invoke() {
            ArrayList<AssigneeRecycleFragment> arrayList = new ArrayList<>();
            arrayList.add(new AssigneeRecycleFragment(this.this$0.f139529b));
            arrayList.add(new AssigneeRecycleFragment(this.this$0.f139529b));
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$blueAdd$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$blueAdd$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$c */
    static final class C56414c extends Lambda implements Function0<C564151> {
        final /* synthetic */ TodoDetailAssigneeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56414c(TodoDetailAssigneeFragmentView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C564151 invoke() {
            return new IActionTitlebar.TextAction(this, UIHelper.getString(R.string.Todo_common_Add), R.color.primary_pri_500, 16) {
                /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoDetailAssigneeFragmentView.C56414c.C564151 */

                /* renamed from: a */
                final /* synthetic */ C56414c f139535a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    this.f139535a.this$0.mo92107d().mo92064a(22);
                }

                {
                    this.f139535a = r1;
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$greyAdd$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$greyAdd$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$d */
    static final class C56416d extends Lambda implements Function0<C564171> {
        public static final C56416d INSTANCE = new C56416d();

        C56416d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C564171 invoke() {
            return new IActionTitlebar.TextAction(UIHelper.getString(R.string.Todo_common_Add), R.color.text_placeholder, 16) {
                /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoDetailAssigneeFragmentView.C56416d.C564171 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    Context context;
                    OperationToastHelper operationToastHelper = OperationToastHelper.f139395a;
                    if (view != null) {
                        context = view.getContext();
                    } else {
                        context = null;
                    }
                    OperationToastHelper.m219777b(operationToastHelper, context, R.string.Todo_Task_UnableEditTaskFromDocs, null, null, null, null, 60, null);
                }
            };
        }
    }

    /* renamed from: n */
    private final void m219933n() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f139528a.findViewById(R.id.title_bar);
        commonTitleBar.setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_AssigneesAre));
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC56418e(this));
    }

    /* renamed from: o */
    private final void m219934o() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo92106c());
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) this.f139528a.findViewById(R.id.assignee_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "containerView.assignee_list");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) this.f139528a.findViewById(R.id.assignee_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "containerView.assignee_list");
        recyclerView2.setAdapter(mo192146m());
    }

    /* renamed from: p */
    private final void m219935p() {
        ViewPager viewPager = (ViewPager) this.f139528a.findViewById(R.id.assignee_viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "containerView.assignee_viewPager");
        viewPager.setAdapter(new C56422i(this, this.f139534g));
        UDTabLayout uDTabLayout = (UDTabLayout) this.f139528a.findViewById(R.id.assignee_tabLayout);
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "containerView.assignee_tabLayout");
        ViewPager viewPager2 = (ViewPager) this.f139528a.findViewById(R.id.assignee_viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "containerView.assignee_viewPager");
        new UDTabLayoutCoordinator(uDTabLayout, viewPager2).attach();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        m219935p();
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getAssigneeFragmentShowAdd(), new C56419f(this));
        mo92103a(qVar.getAssigneeMultiStrategy(), new C56420g(this));
        mo92103a(qVar.getAssignees(), new C56421h(this));
        m219933n();
        m219934o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "assigneeBeans", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$h */
    static final class C56421h extends Lambda implements Function1<List<? extends AssigneeBean>, Unit> {
        final /* synthetic */ TodoDetailAssigneeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56421h(TodoDetailAssigneeFragmentView dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AssigneeBean> list) {
            invoke((List<AssigneeBean>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<AssigneeBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "assigneeBeans");
            AssigneeRecycleFragment aVar = this.this$0.mo192145l().get(0);
            List<AssigneeBean> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (true ^ t.mo192764g()) {
                    arrayList.add(t);
                }
            }
            aVar.mo192127a(arrayList, true);
            AssigneeRecycleFragment aVar2 = this.this$0.mo192145l().get(1);
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : list2) {
                if (t2.mo192764g()) {
                    arrayList2.add(t2);
                }
            }
            aVar2.mo192127a(arrayList2, false);
            if (((UDTabLayout) this.this$0.f139528a.findViewById(R.id.assignee_tabLayout)).getTabCount() == this.this$0.mo192145l().size()) {
                ((UDTabLayout) this.this$0.f139528a.findViewById(R.id.assignee_tabLayout)).getTabAt(0).mo91335a((CharSequence) this.this$0.mo192145l().get(0).mo192126a());
                ((UDTabLayout) this.this$0.f139528a.findViewById(R.id.assignee_tabLayout)).getTabAt(1).mo91335a((CharSequence) this.this$0.mo192145l().get(1).mo192126a());
            }
            this.this$0.mo192146m().mo192134a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$initTitleView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$e */
    public static final class View$OnClickListenerC56418e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailAssigneeFragmentView f139536a;

        View$OnClickListenerC56418e(TodoDetailAssigneeFragmentView dVar) {
            this.f139536a = dVar;
        }

        public final void onClick(View view) {
            this.f139536a.mo92107d().mo92064a(2001);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$f */
    static final class C56419f extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ TodoDetailAssigneeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56419f(TodoDetailAssigneeFragmentView dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((CommonTitleBar) this.this$0.f139528a.findViewById(R.id.title_bar)).removeAllActions();
            if (i == 0) {
                ((CommonTitleBar) this.this$0.f139528a.findViewById(R.id.title_bar)).addAction(this.this$0.mo192143j());
            } else if (i == 1) {
                ((CommonTitleBar) this.this$0.f139528a.findViewById(R.id.title_bar)).addAction(this.this$0.mo192144k());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.d$g */
    static final class C56420g extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TodoDetailAssigneeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56420g(TodoDetailAssigneeFragmentView dVar) {
            super(1);
            this.this$0 = dVar;
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
                UDTabLayout uDTabLayout = (UDTabLayout) this.this$0.f139528a.findViewById(R.id.assignee_tabLayout);
                Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "containerView.assignee_tabLayout");
                uDTabLayout.setVisibility(0);
                ViewPager viewPager = (ViewPager) this.this$0.f139528a.findViewById(R.id.assignee_viewPager);
                Intrinsics.checkExpressionValueIsNotNull(viewPager, "containerView.assignee_viewPager");
                viewPager.setVisibility(0);
                RecyclerView recyclerView = (RecyclerView) this.this$0.f139528a.findViewById(R.id.assignee_list);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "containerView.assignee_list");
                recyclerView.setVisibility(8);
                return;
            }
            UDTabLayout uDTabLayout2 = (UDTabLayout) this.this$0.f139528a.findViewById(R.id.assignee_tabLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDTabLayout2, "containerView.assignee_tabLayout");
            uDTabLayout2.setVisibility(8);
            ViewPager viewPager2 = (ViewPager) this.this$0.f139528a.findViewById(R.id.assignee_viewPager);
            Intrinsics.checkExpressionValueIsNotNull(viewPager2, "containerView.assignee_viewPager");
            viewPager2.setVisibility(8);
            RecyclerView recyclerView2 = (RecyclerView) this.this$0.f139528a.findViewById(R.id.assignee_list);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "containerView.assignee_list");
            recyclerView2.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDetailAssigneeFragmentView(View view, FragmentManager fragmentManager, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(fVar, "ability");
        this.f139528a = view;
        this.f139534g = fragmentManager;
        this.f139529b = fVar;
    }
}
