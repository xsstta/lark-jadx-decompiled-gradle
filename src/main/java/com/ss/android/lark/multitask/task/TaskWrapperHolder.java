package com.ss.android.lark.multitask.task;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0017\u0010\u0012\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u0013R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/multitask/task/TaskWrapperHolder;", "", "()V", "taskWrapperList", "", "Lcom/ss/android/lark/multitask/task/TaskWrapper;", "kotlin.jvm.PlatformType", "", "isRestored", "", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "isRestored$features_multitask_release", "(Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;)Z", "addTaskWrapper", "", "taskWrapper", "finishPreviousTaskIfIsTop", "removeTaskWrapper", "trimNulls", "trimNulls$features_multitask_release", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.v */
public final class TaskWrapperHolder {

    /* renamed from: a */
    public static final TaskWrapperHolder f121828a = new TaskWrapperHolder();

    /* renamed from: b */
    private static final List<AbstractC48379u> f121829b = Collections.synchronizedList(new ArrayList());

    private TaskWrapperHolder() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/TaskWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.v$a */
    public static final class C48380a extends Lambda implements Function1<AbstractC48379u, Boolean> {
        public static final C48380a INSTANCE = new C48380a();

        C48380a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(AbstractC48379u uVar) {
            return Boolean.valueOf(invoke(uVar));
        }

        public final boolean invoke(AbstractC48379u uVar) {
            Intrinsics.checkParameterIsNotNull(uVar, "it");
            if (!(uVar instanceof AbstractC48369g) || ((AbstractC48369g) uVar).p_() != null) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo169250a(AbstractC48379u uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        f121829b.add(uVar);
    }

    /* renamed from: b */
    public final void mo169252b(AbstractC48379u uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        f121829b.remove(uVar);
    }

    /* renamed from: a */
    public final void mo169251a(List<AbstractC48379u> list) {
        Intrinsics.checkParameterIsNotNull(list, "$this$trimNulls");
        CollectionsKt.removeAll((List) list, (Function1) C48380a.INSTANCE);
    }

    /* renamed from: b */
    public final boolean mo169253b(AbstractC48369g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$isRestored");
        FragmentActivity d = gVar.mo23785d();
        Intrinsics.checkExpressionValueIsNotNull(d, "activity");
        Intent intent = d.getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "activity.intent");
        return C48368f.m190780a(intent);
    }

    /* renamed from: a */
    public final void mo169249a(AbstractC48369g gVar) {
        FragmentActivity fragmentActivity;
        List<AbstractC48379u> list = f121829b;
        Intrinsics.checkExpressionValueIsNotNull(list, "this.taskWrapperList");
        for (AbstractC48379u uVar : CollectionsKt.toList(list)) {
            if (uVar instanceof AbstractC48369g) {
                AbstractC48369g gVar2 = (AbstractC48369g) uVar;
                FragmentActivity p_ = gVar2.p_();
                if (f121828a.mo169253b(gVar2) && p_ != null) {
                    if (gVar != null) {
                        fragmentActivity = gVar.mo23785d();
                    } else {
                        fragmentActivity = null;
                    }
                    if (!Intrinsics.areEqual(p_, fragmentActivity)) {
                        p_.getLifecycle().addObserver(new TaskWrapperHolder$finishPreviousTaskIfIsTop$1$1(p_));
                        f121829b.remove(uVar);
                    }
                }
            }
        }
        List<AbstractC48379u> list2 = f121829b;
        Intrinsics.checkExpressionValueIsNotNull(list2, "taskWrapperList");
        mo169251a(list2);
    }
}
