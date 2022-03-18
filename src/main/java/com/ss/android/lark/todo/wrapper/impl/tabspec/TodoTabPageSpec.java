package com.ss.android.lark.todo.wrapper.impl.tabspec;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1787a.C36517b;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnFragmentDestroyListener;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoBaseMainFragment;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainFragment2;
import com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderManager;
import com.ss.android.lark.todo.impl.features.tab.TodoMainTabView;
import com.ss.android.lark.todo.impl.features.tab.TodoNavigationTabView;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.perf.TodoSlardarPerfHitPoint;
import com.ss.android.lark.todo.wrapper.impl.tabspec.title.TodoTitleControllerProxy;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0017\u0010'\u001a\u0002H(\"\b\b\u0000\u0010(*\u00020)H\u0016¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020,H\u0016J\u0017\u0010-\u001a\u0002H(\"\b\b\u0000\u0010(*\u00020)H\u0016¢\u0006\u0002\u0010*J\b\u0010.\u001a\u00020\u001dH\u0016J\b\u0010/\u001a\u00020&H\u0016J\b\u00100\u001a\u000201H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\u001fH\u0002J\b\u00107\u001a\u000208H\u0016J\u0018\u00109\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0:H\u0016J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016J\u0018\u0010?\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0:H\u0016J\b\u0010@\u001a\u00020!H\u0016J\u0018\u0010A\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\n\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec;", "Lcom/ss/android/lark/maincore/TabPageSpec;", "Lcom/ss/android/lark/maincore/TabPageSpec$Resetable;", "Lcom/ss/android/lark/desktopmode/frame/tab/IDesktopPageSpec;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;)V", "mContext", "mNavigationTabController", "Lcom/ss/android/lark/todo/impl/features/tab/TodoNavigationTabView;", "getMNavigationTabController", "()Lcom/ss/android/lark/todo/impl/features/tab/TodoNavigationTabView;", "mNavigationTabController$delegate", "Lkotlin/Lazy;", "mOverallReminderManager", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderManager;", "mPageSwitchListener", "com/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec$mPageSwitchListener$1;", "mTabController", "Lcom/ss/android/lark/todo/impl/features/tab/TodoMainTabView;", "getMTabController", "()Lcom/ss/android/lark/todo/impl/features/tab/TodoMainTabView;", "mTabController$delegate", "mTitleController", "mTodoMainFragment", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoBaseMainFragment;", "mTodoTitleController", "Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy;", "destroy", "", "execCommand", "bundle", "Landroid/os/Bundle;", "getDrawerMenuLockMode", "", "getMainTabContent", "T", "Landroid/view/View;", "()Landroid/view/View;", "getName", "", "getNavigationTabContent", "getPageContent", "getPageLoadStrategy", "getPageSwitchListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "getTabDoubleClickedListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnTabDoubleClickedListener;", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "getTodoTitleController", "handleBackPress", "", "initTabFragments", "", "Lcom/ss/android/lark/desktopmode/base/ContainerType;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "preloadPage", "reload", "reloadTabFragments", "resetPage", "setPreloadFragmentBaseData", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.c.a */
public final class TodoTabPageSpec implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: b */
    public static final Companion f139213b = new Companion(null);

    /* renamed from: a */
    public Context f139214a;

    /* renamed from: c */
    private final Lazy f139215c = LazyKt.lazy(new C56246e(this));

    /* renamed from: d */
    private ITitleController f139216d;

    /* renamed from: e */
    private TodoTitleControllerProxy f139217e;

    /* renamed from: f */
    private OverallReminderManager f139218f;

    /* renamed from: g */
    private volatile TodoBaseMainFragment f139219g;

    /* renamed from: h */
    private final Lazy f139220h = LazyKt.lazy(new C56244c(this));

    /* renamed from: i */
    private final C56245d f139221i = new C56245d(this);

    /* renamed from: p */
    private final TodoNavigationTabView m219457p() {
        return (TodoNavigationTabView) this.f139220h.getValue();
    }

    /* renamed from: a */
    public final TodoMainTabView mo191706a() {
        return (TodoMainTabView) this.f139215c.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "todo";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec$Companion;", "", "()V", "TAB_KEY", "", "TAG", "getBundleForEnterFilter", "Landroid/os/Bundle;", "filter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "isResetExpandState", "", "getBundleForEnterFirstFilter", "getBundleForOpenCreate", "isTodoRefactorEnable", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: c */
        public final boolean mo191712c() {
            return TodoDependencyHolder.f139242a.mo191731b().mo191932e();
        }

        /* renamed from: a */
        public final Bundle mo191709a() {
            if (mo191712c()) {
                return TodoMainFragment2.f140566d.mo193527a();
            }
            return TodoMainFragment.f140346n.mo193248a();
        }

        /* renamed from: b */
        public final Bundle mo191711b() {
            if (mo191712c()) {
                return TodoMainFragment2.f140566d.mo193530b();
            }
            return TodoMainFragment.f140346n.mo193251b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo191710a(TodoListView.Type type, boolean z) {
            Intrinsics.checkParameterIsNotNull(type, "filter");
            if (mo191712c()) {
                return TodoMainFragment2.f140566d.mo193528a(type, z);
            }
            return TodoMainFragment.f140346n.mo193249a(type, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec$getPageContent$2$1$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnFragmentDestroyListener;", "onFragmentDestroy", "", "todo-wrapper_release", "com/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a$b */
    public static final class C56243b implements OnFragmentDestroyListener {

        /* renamed from: a */
        final /* synthetic */ TodoTabPageSpec f139222a;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.OnFragmentDestroyListener
        /* renamed from: a */
        public void mo191713a() {
            this.f139222a.mo103434s();
        }

        C56243b(TodoTabPageSpec aVar) {
            this.f139222a = aVar;
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        OverallReminderManager cVar = this.f139218f;
        if (cVar != null) {
            cVar.mo194008b();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f139221i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/tab/TodoNavigationTabView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a$c */
    static final class C56244c extends Lambda implements Function0<TodoNavigationTabView> {
        final /* synthetic */ TodoTabPageSpec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56244c(TodoTabPageSpec aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoNavigationTabView invoke() {
            return new TodoNavigationTabView(TodoTabPageSpec.m219456a(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/tab/TodoMainTabView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a$e */
    static final class C56246e extends Lambda implements Function0<TodoMainTabView> {
        final /* synthetic */ TodoTabPageSpec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56246e(TodoTabPageSpec aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoMainTabView invoke() {
            return new TodoMainTabView(TodoTabPageSpec.m219456a(this.this$0));
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        return m219458q().mo191714a();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f139219g = null;
        this.f139217e = null;
    }

    /* renamed from: q */
    private final TodoTitleControllerProxy m219458q() {
        TodoTitleControllerProxy aVar = this.f139217e;
        if (aVar != null) {
            return aVar;
        }
        TodoTitleControllerProxy.Companion aVar2 = TodoTitleControllerProxy.f139224e;
        Context context = this.f139214a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        TodoTitleControllerProxy a = aVar2.mo191718a(context, this.f139216d);
        this.f139217e = a;
        return a;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        TodoMainTabView a = mo191706a();
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        TodoNavigationTabView p = m219457p();
        if (p != null) {
            return p;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a<?>> mo103433r() {
        C36517b a = C36517b.m144069a(mo31318i());
        a.setFragmentParams(new MainWindowParams.C36570a(ContainerType.ALL).mo134958a(mo31311b()).mo134930b());
        return MapsKt.hashMapOf(new Pair(ContainerType.ALL, a));
    }

    /* renamed from: o */
    public TodoBaseMainFragment mo31318i() {
        TodoMainFragment todoMainFragment;
        TodoBaseMainFragment aVar = this.f139219g;
        if (aVar != null) {
            return aVar;
        }
        TodoSlardarPerfHitPoint.f141078a.mo194240g();
        if (f139213b.mo191712c()) {
            TodoMainFragment2.Companion aVar2 = TodoMainFragment2.f140566d;
            Context context = this.f139214a;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            todoMainFragment = aVar2.mo193529a(context);
        } else {
            TodoMainFragment.Companion aVar3 = TodoMainFragment.f140346n;
            Context context2 = this.f139214a;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            todoMainFragment = aVar3.mo193250a(context2);
        }
        todoMainFragment.mo193232a(new C56243b(this));
        Context context3 = this.f139214a;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        if (!(context3 instanceof Activity)) {
            context3 = null;
        }
        Activity activity = (Activity) context3;
        if (activity != null) {
            todoMainFragment.mo193228a(activity);
        }
        todoMainFragment.mo193231a(m219458q());
        this.f139219g = todoMainFragment;
        TodoSlardarPerfHitPoint.f141078a.mo194241h();
        return todoMainFragment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "afterPageSwitch", "", "prePageName", "", "currentPageName", "beforePageSwitch", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a$d */
    public static final class C56245d implements AbstractC44552i.AbstractC44553a {

        /* renamed from: a */
        final /* synthetic */ TodoTabPageSpec f139223a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56245d(TodoTabPageSpec aVar) {
            this.f139223a = aVar;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "prePageName");
            Intrinsics.checkParameterIsNotNull(str2, "currentPageName");
            if (TextUtils.equals(this.f139223a.mo31311b(), str2)) {
                TodoSlardarPerfHitPoint.f141078a.mo194232a();
                TodoAppreciableHitPoint.f141058a.mo194128a();
            }
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f139223a.mo31311b(), str);
            boolean equals2 = TextUtils.equals(this.f139223a.mo31311b(), str2);
            this.f139223a.mo31318i().mo193235a(equals, equals2);
            if (!equals && equals2) {
                this.f139223a.mo191706a().mo110677a();
            } else if (equals && !equals2) {
                this.f139223a.mo191706a().mo110683b();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m219456a(TodoTabPageSpec aVar) {
        Context context = aVar.f139214a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        mo31318i().mo193229a(bundle);
    }

    public TodoTabPageSpec(Context context, ITitleController iTitleController) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Activity activity = (Activity) context;
        this.f139214a = activity;
        this.f139216d = iTitleController;
        if (this.f139218f == null) {
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            if (activity != null) {
                OverallReminderManager cVar = new OverallReminderManager(activity);
                this.f139218f = cVar;
                if (cVar != null) {
                    cVar.mo194007a();
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public final void mo191707a(Context context, ITitleController iTitleController) {
        TodoBaseMainFragment aVar;
        TodoMainFragment todoMainFragment;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Activity activity = (Activity) context;
        this.f139214a = activity;
        this.f139216d = iTitleController;
        if (this.f139218f == null) {
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            if (activity != null) {
                OverallReminderManager cVar = new OverallReminderManager(activity);
                this.f139218f = cVar;
                if (cVar != null) {
                    cVar.mo194007a();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        if (this.f139219g == null) {
            if (f139213b.mo191712c()) {
                TodoMainFragment2.Companion aVar2 = TodoMainFragment2.f140566d;
                Context context2 = this.f139214a;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                todoMainFragment = aVar2.mo193529a(context2);
            } else {
                TodoMainFragment.Companion aVar3 = TodoMainFragment.f140346n;
                Context context3 = this.f139214a;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                todoMainFragment = aVar3.mo193250a(context3);
            }
            this.f139219g = todoMainFragment;
        }
        TodoTitleControllerProxy.Companion aVar4 = TodoTitleControllerProxy.f139224e;
        Context context4 = this.f139214a;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        this.f139217e = aVar4.mo191718a(context4, this.f139216d);
        Context context5 = this.f139214a;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        if (!(context5 instanceof Activity)) {
            context5 = null;
        }
        Activity activity2 = (Activity) context5;
        if (!(activity2 == null || (aVar = this.f139219g) == null)) {
            aVar.mo193228a(activity2);
        }
        TodoBaseMainFragment aVar5 = this.f139219g;
        if (aVar5 != null) {
            aVar5.mo193231a(m219458q());
        }
    }
}
