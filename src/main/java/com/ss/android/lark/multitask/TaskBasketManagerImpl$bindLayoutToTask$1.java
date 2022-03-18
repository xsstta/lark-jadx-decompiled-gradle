package com.ss.android.lark.multitask;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.TaskBasketManagerImpl;
import com.ss.android.lark.multitask.p2373a.C48278c;
import com.ss.android.lark.multitask.screencapture.CompositeScreenshotCapture;
import com.ss.android.lark.multitask.task.AbstractC48379u;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.multitask.task.RemoteTaskContainer;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.slideback.SlideFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/multitask/TaskBasketManagerImpl$bindLayoutToTask$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TaskBasketManagerImpl$bindLayoutToTask$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ View f121556a;

    /* renamed from: b */
    final /* synthetic */ Task f121557b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "container", "Landroid/view/View;", "onDroppedIntoBasket"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.TaskBasketManagerImpl$bindLayoutToTask$1$a */
    static final class C48275a implements C48278c.AbstractC48279a {

        /* renamed from: a */
        final /* synthetic */ TaskBasketManagerImpl$bindLayoutToTask$1 f121558a;

        /* renamed from: b */
        final /* synthetic */ TaskBasketManagerImpl.RestoredTaskWrapper f121559b;

        /* renamed from: c */
        final /* synthetic */ C48278c f121560c;

        C48275a(TaskBasketManagerImpl$bindLayoutToTask$1 taskBasketManagerImpl$bindLayoutToTask$1, TaskBasketManagerImpl.RestoredTaskWrapper aVar, C48278c cVar) {
            this.f121558a = taskBasketManagerImpl$bindLayoutToTask$1;
            this.f121559b = aVar;
            this.f121560c = cVar;
        }

        @Override // com.ss.android.lark.multitask.p2373a.C48278c.AbstractC48279a
        /* renamed from: a */
        public final void mo168867a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "container");
            TaskBasketManagerImpl.RestoredTaskWrapper aVar = this.f121559b;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            if (aVar.mo23786e().mo169157a()) {
                SlideFrameLayout.m212893d(this.f121558a.f121556a).mo187230c();
                this.f121560c.mo168891b();
            }
            TaskBasketManagerImpl oVar = TaskBasketManagerImpl.f121743b;
            TaskBasketManagerImpl.RestoredTaskWrapper aVar2 = this.f121559b;
            Task task = this.f121558a.f121557b;
            Context context = ((SlideFrameLayout) this.f121558a.f121556a).getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "layout.context");
            TaskBasketManagerImpl.m190679a(oVar, (AbstractC48379u) aVar2, task, context, false, (Function0) null, 24, (Object) null);
        }
    }

    TaskBasketManagerImpl$bindLayoutToTask$1(View view, Task task) {
        this.f121556a = view;
        this.f121557b = task;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        GlobalTaskContainerImpl jVar;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        int i = C48346p.f121766a[event.ordinal()];
        boolean z = true;
        if (i == 1) {
            TaskBasketManagerImpl.RestoredTaskWrapper aVar = TaskBasketManagerImpl.f121743b.mo169079b().get(this.f121556a);
            if (aVar == null) {
                z = false;
            }
            if (z) {
                if (((SlideFrameLayout) this.f121556a).getBackgroundArtist() == null) {
                    View view = this.f121556a;
                    SlideFrameLayout slideFrameLayout = (SlideFrameLayout) view;
                    Context context = ((SlideFrameLayout) view).getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "layout.context");
                    slideFrameLayout.setBackgroundArtist(new MultipleProcessBackgroundArtist(new CompositeScreenshotCapture(context)));
                }
                Context context2 = ((SlideFrameLayout) this.f121556a).getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "layout.context");
                Task task = this.f121557b;
                if (TaskBasketManagerImpl.f121743b.mo169080c()) {
                    jVar = GlobalTaskContainerImpl.f121803b;
                } else {
                    jVar = RemoteTaskContainer.f121815b.mo169231a();
                }
                C48278c cVar = new C48278c(new TaskBasketManagerImpl.UIElementDelegateImpl(context2, task, jVar));
                ((SlideFrameLayout) this.f121556a).mo187225a(cVar);
                cVar.mo168890a(new C48275a(this, aVar, cVar));
                TaskBasketManagerImpl.f121743b.mo169074a().put(this.f121556a, cVar);
            }
        } else if (i == 2) {
            C48278c remove = TaskBasketManagerImpl.f121743b.mo169074a().remove(this.f121556a);
            ((SlideFrameLayout) this.f121556a).mo187229b(remove);
            if (remove != null) {
                remove.mo168887a();
            }
            TaskBasketManagerImpl.f121743b.mo169079b().remove(this.f121556a);
        }
    }
}
