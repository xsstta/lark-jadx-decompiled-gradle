package com.ss.android.lark.todo.impl.features.mainview2.mvvm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.ISecManagerDependency;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.SectionManager;
import com.larksuite.suite.R;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnFragmentDestroyListener;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment;
import com.ss.android.lark.todo.impl.features.mainview2.widget.center.TodoCenterSection;
import com.ss.android.lark.todo.impl.features.mainview2.widget.center.TodoCenterViewModel;
import com.ss.android.lark.todo.impl.features.mainview2.widget.center.listener.IContentAnimateListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.filter.FilterHeaderViewModel;
import com.ss.android.lark.todo.impl.features.mainview2.widget.filter.FilterHeaderViewSection;
import com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.CompletedListViewModel;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.TodoListViewSection;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListSectionListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewModel;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection;
import com.ss.android.lark.todo.impl.features.remind.notification.NotificationHelper;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u001b\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB\u0005¢\u0006\u0002\u0010\u0003J\b\u00109\u001a\u00020:H\u0002J\u0018\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0016J\b\u0010?\u001a\u00020:H\u0002J\"\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020:H\u0016J\u0012\u0010G\u001a\u00020:2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J&\u0010J\u001a\u0004\u0018\u00010\t2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010O\u001a\u00020:H\u0016J\b\u0010P\u001a\u00020:H\u0016J\b\u0010Q\u001a\u00020:H\u0016J\u001a\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010T\u001a\u00020:2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010U\u001a\u00020:2\u0006\u0010V\u001a\u00020IH\u0016J\u0010\u0010W\u001a\u00020:2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010X\u001a\u00020:2\u0006\u0010$\u001a\u00020%H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0004\n\u0002\u0010\u001cR'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e8BX\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b8\u0010\r\u001a\u0004\b6\u00107¨\u0006Z"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainFragment2;", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoBaseMainFragment;", "Lcom/ss/android/lark/eetroublecapture/ICaptureCallback;", "()V", "activity", "Landroid/app/Activity;", "baseContext", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView$delegate", "Lkotlin/Lazy;", "filterSection", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection;", "getFilterSection", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection;", "filterSection$delegate", "fragmentDestroyListener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnFragmentDestroyListener;", "listSection", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection;", "getListSection", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection;", "listSection$delegate", "listSectionListener", "com/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainFragment2$listSectionListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainFragment2$listSectionListener$1;", "sectionManager", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "getSectionManager", "()Lcom/larksuite/framework/section/SectionManager;", "sectionManager$delegate", "titleController", "Lcom/ss/android/lark/todo/dependency/ITodoTitleControllerProxy;", "titleSection", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection;", "getTitleSection", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection;", "titleSection$delegate", "todoCenterSection", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection;", "getTodoCenterSection", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection;", "todoCenterSection$delegate", "todoCenterViewModel", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel;", "getTodoCenterViewModel", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel;", "todoCenterViewModel$delegate", "viewDataStore", "getViewDataStore", "()Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "viewDataStore$delegate", "handleArguments", "", "handlePageSwitch", "preIsTodoTab", "", "curIsTodoTab", "initSection", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCaptured", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "setActivity", "setArgumentsFromSpec", "args", "setOnDestroyListener", "updateTitleController", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b */
public final class TodoMainFragment2 extends TodoBaseMainFragment implements AbstractC36982d {

    /* renamed from: d */
    public static final Companion f140566d = new Companion(null);

    /* renamed from: a */
    public Context f140567a;

    /* renamed from: b */
    public ITodoTitleControllerProxy f140568b;

    /* renamed from: c */
    public final C56960o f140569c = new C56960o(this);

    /* renamed from: e */
    private Activity f140570e;

    /* renamed from: f */
    private final Lazy f140571f = LazyKt.lazy(C56967t.INSTANCE);

    /* renamed from: g */
    private final Lazy f140572g = LazyKt.lazy(new C56961p(this));

    /* renamed from: h */
    private OnFragmentDestroyListener f140573h;

    /* renamed from: i */
    private final Lazy f140574i = LazyKt.lazy(new C56947b(this));

    /* renamed from: j */
    private final Lazy f140575j = LazyKt.lazy(new C56963q(this));

    /* renamed from: k */
    private final Lazy f140576k = LazyKt.lazy(new C56948c(this));

    /* renamed from: l */
    private final Lazy f140577l = LazyKt.lazy(new C56959n(this));

    /* renamed from: m */
    private final Lazy f140578m = LazyKt.lazy(new C56964r(this));

    /* renamed from: n */
    private final Lazy f140579n = LazyKt.lazy(new C56966s(this));

    /* renamed from: o */
    private HashMap f140580o;

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public View mo193225a(int i) {
        if (this.f140580o == null) {
            this.f140580o = new HashMap();
        }
        View view = (View) this.f140580o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f140580o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193226a() {
        HashMap hashMap = this.f140580o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final TodoMainModel2 mo193519b() {
        return (TodoMainModel2) this.f140571f.getValue();
    }

    /* renamed from: c */
    public final SectionManager<IMainFragmentLiveDataStore, TodoMainModel2> mo193520c() {
        return (SectionManager) this.f140572g.getValue();
    }

    /* renamed from: d */
    public final View mo193521d() {
        return (View) this.f140574i.getValue();
    }

    /* renamed from: e */
    public final TitleViewSection mo193522e() {
        return (TitleViewSection) this.f140575j.getValue();
    }

    /* renamed from: f */
    public final FilterHeaderViewSection mo193523f() {
        return (FilterHeaderViewSection) this.f140576k.getValue();
    }

    /* renamed from: g */
    public final TodoListViewSection mo193524g() {
        return (TodoListViewSection) this.f140577l.getValue();
    }

    /* renamed from: i */
    public final TodoCenterSection mo193525i() {
        return (TodoCenterSection) this.f140578m.getValue();
    }

    /* renamed from: j */
    public final TodoCenterViewModel mo193526j() {
        return (TodoCenterViewModel) this.f140579n.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo193226a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainFragment2$Companion;", "", "()V", "TAG_LOG", "", "TODO_TAB_ENTER_FILTER", "TODO_TAB_OPEN_CREATE", "TODO_TAB_RESET_EXPAND_STATE", "getBundleForEnterFilter", "Landroid/os/Bundle;", "filter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "isResetExpandState", "", "getBundleForEnterFirstFilter", "getBundleForOpenCreate", "newInstance", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainFragment2;", "context", "Landroid/content/Context;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final Bundle mo193530b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("todo_tab_open_create", true);
            return bundle;
        }

        /* renamed from: a */
        public final Bundle mo193527a() {
            Bundle bundle = new Bundle();
            bundle.putInt("todo_tab_enter_filter", TodoListView.Type.ALL.getValue());
            return bundle;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TodoMainFragment2 mo193529a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            TodoMainFragment2 bVar = new TodoMainFragment2();
            bVar.f140567a = context;
            Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("TodoMainFragment2"));
            return bVar;
        }

        /* renamed from: a */
        public final Bundle mo193528a(TodoListView.Type type, boolean z) {
            Intrinsics.checkParameterIsNotNull(type, "filter");
            Bundle bundle = new Bundle();
            bundle.putInt("todo_tab_enter_filter", type.getValue());
            bundle.putBoolean("todo_tab_reset_expand_state", z);
            return bundle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$t */
    static final class C56967t extends Lambda implements Function0<TodoMainModel2> {
        public static final C56967t INSTANCE = new C56967t();

        C56967t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoMainModel2 invoke() {
            return new TodoMainModel2();
        }
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        mo193525i().mo193617l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$b */
    static final class C56947b extends Lambda implements Function0<View> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56947b(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return View.inflate(TodoMainFragment2.m221068a(this.this$0), R.layout.todo_fragment_main_view_refactor, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$s */
    static final class C56966s extends Lambda implements Function0<TodoCenterViewModel> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56966s(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoCenterViewModel invoke() {
            return new TodoCenterViewModel(this.this$0.mo193520c());
        }
    }

    /* renamed from: l */
    private final void m221070l() {
        mo193523f().mo193676j();
        mo193525i().mo193618m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$n */
    static final class C56959n extends Lambda implements Function0<TodoListViewSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56959n(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoListViewSection invoke() {
            return new TodoListViewSection(this.this$0.mo193521d(), this.this$0.f140569c, this.this$0.mo193520c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$p */
    static final class C56961p extends Lambda implements Function0<SectionManager<IMainFragmentLiveDataStore, TodoMainModel2>> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56961p(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SectionManager<IMainFragmentLiveDataStore, TodoMainModel2> invoke() {
            return new SectionManager<>(new ISecManagerDependency(this) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainFragment2.C56961p.C569621 */

                /* renamed from: a */
                final /* synthetic */ C56961p f140582a;

                @Override // com.larksuite.framework.section.ISecManagerDependency
                /* renamed from: b */
                public LifecycleOwner mo92071b() {
                    return this.f140582a.this$0;
                }

                @Override // com.larksuite.framework.section.ISecManagerDependency
                /* renamed from: a */
                public Context mo92070a() {
                    return TodoMainFragment2.m221068a(this.f140582a.this$0);
                }

                @Override // com.larksuite.framework.section.ISecManagerDependency
                /* renamed from: c */
                public ak mo92072c() {
                    ak viewModelStore = this.f140582a.this$0.getViewModelStore();
                    Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "getViewModelStore()");
                    return viewModelStore;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f140582a = r1;
                }
            }, this.this$0.mo193519b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$q */
    static final class C56963q extends Lambda implements Function0<TitleViewSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56963q(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TitleViewSection invoke() {
            return new TitleViewSection(this.this$0.mo193520c(), this.this$0.f140568b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$r */
    static final class C56964r extends Lambda implements Function0<TodoCenterSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56964r(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoCenterSection invoke() {
            return new TodoCenterSection(this.this$0.mo193521d(), new IContentAnimateListener(this) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainFragment2.C56964r.C569651 */

                /* renamed from: a */
                final /* synthetic */ C56964r f140583a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f140583a = r1;
                }

                @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.center.listener.IContentAnimateListener
                /* renamed from: a */
                public void mo193542a(boolean z) {
                    this.f140583a.this$0.mo193522e().mo193896a(z);
                    this.f140583a.this$0.mo193524g().mo193819a(z);
                }
            }, this.this$0.mo193520c());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("onPause"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("onResume"));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$c */
    static final class C56948c extends Lambda implements Function0<FilterHeaderViewSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56948c(TodoMainFragment2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FilterHeaderViewSection invoke() {
            TodoFilterHeaderView todoFilterHeaderView = (TodoFilterHeaderView) this.this$0.mo193521d().findViewById(R.id.todo_classify_view);
            Intrinsics.checkExpressionValueIsNotNull(todoFilterHeaderView, "contentView.todo_classify_view");
            return new FilterHeaderViewSection(todoFilterHeaderView, this.this$0.mo193520c());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("onDestroy"));
        mo193525i().mo193615j();
        mo193525i().mo193616k();
        OnFragmentDestroyListener bVar = this.f140573h;
        if (bVar != null) {
            bVar.mo191713a();
        }
    }

    /* renamed from: k */
    private final void m221069k() {
        mo193520c().mo92078a(new C56949d(this));
        mo193520c().mo92078a(new C56951f(this));
        mo193520c().mo92078a(new C56952g(this));
        mo193520c().mo92078a(new C56953h(this));
        mo193520c().mo92079b(C56954i.INSTANCE);
        mo193520c().mo92079b(C56955j.INSTANCE);
        mo193520c().mo92079b(C56956k.INSTANCE);
        mo193520c().mo92079b(C56957l.INSTANCE);
        mo193520c().mo92079b(C56958m.INSTANCE);
        mo193520c().mo92079b(new C56950e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainFragment2$listSectionListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListSectionListener;", "onListShareItemClicked", "", "todoGuid", "", "summary", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$o */
    public static final class C56960o implements IListSectionListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainFragment2 f140581a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56960o(TodoMainFragment2 bVar) {
            this.f140581a = bVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListSectionListener
        /* renamed from: a */
        public void mo193541a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "todoGuid");
            Intrinsics.checkParameterIsNotNull(str2, "summary");
            TodoDependencyHolder.f139242a.mo191730a().oldModuleDependency().mo145422a(TodoMainFragment2.m221068a(this.f140581a), this.f140581a, str, str2, 1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$d */
    public static final class C56949d extends Lambda implements Function1<IViewAbility<IMainFragmentLiveDataStore>, TitleViewSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56949d(TodoMainFragment2 bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final TitleViewSection invoke(IViewAbility<IMainFragmentLiveDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return this.this$0.mo193522e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$e */
    public static final class C56950e extends Lambda implements Function1<IViewModelAbility<TodoMainModel2>, TodoCenterViewModel> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56950e(TodoMainFragment2 bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final TodoCenterViewModel invoke(IViewModelAbility<TodoMainModel2> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return this.this$0.mo193526j();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$f */
    public static final class C56951f extends Lambda implements Function1<IViewAbility<IMainFragmentLiveDataStore>, FilterHeaderViewSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56951f(TodoMainFragment2 bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final FilterHeaderViewSection invoke(IViewAbility<IMainFragmentLiveDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return this.this$0.mo193523f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/TodoListViewSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$g */
    public static final class C56952g extends Lambda implements Function1<IViewAbility<IMainFragmentLiveDataStore>, TodoListViewSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56952g(TodoMainFragment2 bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final TodoListViewSection invoke(IViewAbility<IMainFragmentLiveDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return this.this$0.mo193524g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/center/TodoCenterSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$h */
    public static final class C56953h extends Lambda implements Function1<IViewAbility<IMainFragmentLiveDataStore>, TodoCenterSection> {
        final /* synthetic */ TodoMainFragment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56953h(TodoMainFragment2 bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final TodoCenterSection invoke(IViewAbility<IMainFragmentLiveDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return this.this$0.mo193525i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$i */
    public static final class C56954i extends Lambda implements Function1<IViewModelAbility<TodoMainModel2>, TitleViewModel> {
        public static final C56954i INSTANCE = new C56954i();

        C56954i() {
            super(1);
        }

        public final TitleViewModel invoke(IViewModelAbility<TodoMainModel2> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new TitleViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$j */
    public static final class C56955j extends Lambda implements Function1<IViewModelAbility<TodoMainModel2>, FilterHeaderViewModel> {
        public static final C56955j INSTANCE = new C56955j();

        C56955j() {
            super(1);
        }

        public final FilterHeaderViewModel invoke(IViewModelAbility<TodoMainModel2> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new FilterHeaderViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/FullDataListViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$k */
    public static final class C56956k extends Lambda implements Function1<IViewModelAbility<TodoMainModel2>, FullDataListViewModel> {
        public static final C56956k INSTANCE = new C56956k();

        C56956k() {
            super(1);
        }

        public final FullDataListViewModel invoke(IViewModelAbility<TodoMainModel2> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new FullDataListViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/DocListViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$l */
    public static final class C56957l extends Lambda implements Function1<IViewModelAbility<TodoMainModel2>, DocListViewModel> {
        public static final C56957l INSTANCE = new C56957l();

        C56957l() {
            super(1);
        }

        public final DocListViewModel invoke(IViewModelAbility<TodoMainModel2> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new DocListViewModel(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/CompletedListViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.b$m */
    public static final class C56958m extends Lambda implements Function1<IViewModelAbility<TodoMainModel2>, CompletedListViewModel> {
        public static final C56958m INSTANCE = new C56958m();

        C56958m() {
            super(1);
        }

        public final CompletedListViewModel invoke(IViewModelAbility<TodoMainModel2> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new CompletedListViewModel(gVar);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m221068a(TodoMainFragment2 bVar) {
        Context context = bVar.f140567a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193228a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f140570e = activity;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("onCreate"));
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193229a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "args");
        Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("setArgumentsFromSpec"));
        mo193523f().mo193674a(TodoListView.Type.fromValue(bundle.getInt("todo_tab_enter_filter", TodoListView.Type.ALL.getValue())));
        mo193523f().mo193675a(bundle.getBoolean("todo_tab_reset_expand_state", false));
        mo193525i().mo193612a(bundle.getBoolean("todo_tab_open_create", false));
        if (isActive()) {
            m221070l();
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193231a(ITodoTitleControllerProxy bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "titleController");
        Log.m165389i("TodoMainFragment2", LogMessageUtil.f139260a.mo191772d("updateTitleController"));
        this.f140568b = bVar;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193232a(OnFragmentDestroyListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "fragmentDestroyListener");
        this.f140573h = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        Intent intent;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m221069k();
        m221070l();
        NotificationHelper aVar = NotificationHelper.f140950a;
        Context context = getContext();
        Activity activity = this.f140570e;
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle2 = null;
        } else {
            bundle2 = intent.getExtras();
        }
        aVar.mo193995a(context, bundle2);
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment
    /* renamed from: a */
    public void mo193235a(boolean z, boolean z2) {
        mo193525i().mo193613a(z, z2, isActive());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == 1) {
            mo193526j().parseShareResult(intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return mo193521d();
    }
}
