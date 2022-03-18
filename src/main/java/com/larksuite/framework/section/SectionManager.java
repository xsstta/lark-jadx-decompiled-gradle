package com.larksuite.framework.section;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C1173t;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\bJ&\u0010\u001a\u001a\u00020\u000e2\u001e\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00170\u001cJ&\u0010\u001d\u001a\u00020\u000e2\u001e\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u001cJ \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\rJ\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020(H\u0016J\r\u0010)\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010*J\r\u0010+\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*JW\u0010,\u001a\u00020\u000e2M\u0010\u001b\u001aI\u0012\u0013\u0012\u00110\f¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b( \u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016R.\u0010\t\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0007\u001a\u00028\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00170\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\nX\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/larksuite/framework/section/SectionManager;", "T", "M", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/larksuite/framework/section/IViewModelAbility;", "dependency", "Lcom/larksuite/framework/section/ISecManagerDependency;", "viewDataStore", "(Lcom/larksuite/framework/section/ISecManagerDependency;Ljava/lang/Object;)V", "activityResultListeners", "", "Lkotlin/Function3;", "", "Landroid/content/Intent;", "", "dispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "getDispatcher", "()Lcom/larksuite/framework/section/IActionDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "Ljava/lang/Object;", "viewModelSectionList", "Lcom/larksuite/framework/section/ViewModelSection;", "viewSectionList", "Lcom/larksuite/framework/section/ViewSection;", "addViewModelSection", "block", "Lkotlin/Function1;", "addViewSection", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onDestroy", "onStop", "provideContext", "Landroid/content/Context;", "provideDispatcher", "provideLifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "provideModel", "()Ljava/lang/Object;", "provideViewModel", "registerActivityResult", "Lkotlin/ParameterName;", "name", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.h */
public final class SectionManager<T, M extends T> implements IViewAbility<T>, IViewModelAbility<M> {

    /* renamed from: a */
    public final List<ViewSection<T>> f64032a = new ArrayList();

    /* renamed from: b */
    public final List<ViewModelSection<M>> f64033b = new ArrayList();

    /* renamed from: c */
    private final Lazy f64034c = LazyKt.lazy(new C25884a(this));

    /* renamed from: d */
    private List<Function3<Integer, Integer, Intent, Unit>> f64035d = new ArrayList();

    /* renamed from: e */
    private final ISecManagerDependency f64036e;

    /* renamed from: f */
    private final M f64037f;

    /* renamed from: h */
    private final IActionDispatcher m93690h() {
        return (IActionDispatcher) this.f64034c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, M extends T] */
    @Override // com.larksuite.framework.section.IViewAbility
    /* renamed from: b */
    public T mo92073b() {
        return this.f64037f;
    }

    @Override // com.larksuite.framework.section.IViewModelAbility
    /* renamed from: e */
    public M mo92076e() {
        return this.f64037f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0005*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "com/larksuite/framework/section/SectionManager$dispatcher$2$1", "T", "M", "invoke", "()Lcom/larksuite/framework/section/SectionManager$dispatcher$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.h$a */
    static final class C25884a extends Lambda implements Function0<C258851> {
        final /* synthetic */ SectionManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25884a(SectionManager hVar) {
            super(0);
            this.this$0 = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C258851 invoke() {
            return new IActionDispatcher(this) {
                /* class com.larksuite.framework.section.SectionManager.C25884a.C258851 */

                /* renamed from: a */
                final /* synthetic */ C25884a f64038a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f64038a = r1;
                }

                @Override // com.larksuite.framework.section.IActionDispatcher
                /* renamed from: a */
                public void mo92064a(int i) {
                    Iterator<T> it = this.f64038a.this$0.f64032a.iterator();
                    while (it.hasNext()) {
                        it.next().mo92097a(i);
                    }
                    Iterator<T> it2 = this.f64038a.this$0.f64033b.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleAction(i);
                    }
                }

                @Override // com.larksuite.framework.section.IActionDispatcher
                /* renamed from: a */
                public void mo92065a(int i, int i2) {
                    Iterator<T> it = this.f64038a.this$0.f64032a.iterator();
                    while (it.hasNext()) {
                        it.next().mo92098a(i, i2);
                    }
                    Iterator<T> it2 = this.f64038a.this$0.f64033b.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleAction(i, i2);
                    }
                }

                @Override // com.larksuite.framework.section.IActionDispatcher
                /* renamed from: a */
                public void mo92066a(int i, IActionData bVar) {
                    Intrinsics.checkParameterIsNotNull(bVar, "actionData");
                    Iterator<T> it = this.f64038a.this$0.f64032a.iterator();
                    while (it.hasNext()) {
                        it.next().mo92099a(i, bVar);
                    }
                    Iterator<T> it2 = this.f64038a.this$0.f64033b.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleAction(i, bVar);
                    }
                }

                @Override // com.larksuite.framework.section.IActionDispatcher
                /* renamed from: a */
                public void mo92067a(int i, Object obj) {
                    Iterator<T> it = this.f64038a.this$0.f64032a.iterator();
                    while (it.hasNext()) {
                        it.next().mo92100a(i, obj);
                    }
                    Iterator<T> it2 = this.f64038a.this$0.f64033b.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleAction(i, obj);
                    }
                }

                @Override // com.larksuite.framework.section.IActionDispatcher
                /* renamed from: a */
                public void mo92068a(int i, String str) {
                    Intrinsics.checkParameterIsNotNull(str, "actionData");
                    Iterator<T> it = this.f64038a.this$0.f64032a.iterator();
                    while (it.hasNext()) {
                        it.next().mo92101a(i, str);
                    }
                    Iterator<T> it2 = this.f64038a.this$0.f64033b.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleAction(i, str);
                    }
                }

                @Override // com.larksuite.framework.section.IActionDispatcher
                /* renamed from: a */
                public void mo92069a(int i, boolean z) {
                    Iterator<T> it = this.f64038a.this$0.f64032a.iterator();
                    while (it.hasNext()) {
                        it.next().mo92102a(i, z);
                    }
                    Iterator<T> it2 = this.f64038a.this$0.f64033b.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleAction(i, z);
                    }
                }
            };
        }
    }

    @Override // com.larksuite.framework.section.IAbility
    /* renamed from: a */
    public Context mo92048a() {
        return this.f64036e.mo92070a();
    }

    @Override // com.larksuite.framework.section.IViewAbility
    /* renamed from: c */
    public LifecycleOwner mo92074c() {
        return this.f64036e.mo92071b();
    }

    @Override // com.larksuite.framework.section.IViewAbility
    /* renamed from: d */
    public IActionDispatcher mo92075d() {
        return m93690h();
    }

    /* renamed from: g */
    public void mo92081g() {
        Iterator<T> it = this.f64032a.iterator();
        while (it.hasNext()) {
            it.next().mo92112i();
        }
    }

    /* renamed from: f */
    public void mo92080f() {
        Iterator<T> it = this.f64033b.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        Iterator<T> it2 = this.f64032a.iterator();
        while (it2.hasNext()) {
            it2.next().mo92111h();
        }
    }

    @Override // com.larksuite.framework.section.IAbility
    /* renamed from: a */
    public void mo92049a(Function3<? super Integer, ? super Integer, ? super Intent, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "block");
        this.f64035d.add(oVar);
    }

    /* renamed from: a */
    public final void mo92078a(Function1<? super IViewAbility<T>, ? extends ViewSection<T>> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        ViewSection<T> jVar = (ViewSection) function1.invoke(this);
        this.f64032a.add(jVar);
        jVar.mo92109f();
        jVar.mo92110g();
    }

    /* renamed from: b */
    public final void mo92079b(Function1<? super IViewModelAbility<M>, ? extends ViewModelSection<M>> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        ViewModelSection<M> iVar = (ViewModelSection) function1.invoke(this);
        this.f64033b.add(iVar);
        iVar.initViewModel();
        iVar.initViewData();
        ak c = this.f64036e.mo92072c();
        String name = iVar.getClass().getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "modelSection::class.java.name");
        C1173t.m5409a(c, name, iVar);
    }

    public SectionManager(ISecManagerDependency eVar, M m) {
        Intrinsics.checkParameterIsNotNull(eVar, "dependency");
        this.f64036e = eVar;
        this.f64037f = m;
    }

    /* renamed from: a */
    public final void mo92077a(int i, int i2, Intent intent) {
        for (Function3<Integer, Integer, Intent, Unit> oVar : this.f64035d) {
            oVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }
}
