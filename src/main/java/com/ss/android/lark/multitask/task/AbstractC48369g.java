package com.ss.android.lark.multitask.task;

import androidx.fragment.app.FragmentActivity;

/* renamed from: com.ss.android.lark.multitask.task.g */
public interface AbstractC48369g extends AbstractC48379u {
    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    EventTracker O_();

    /* renamed from: d */
    FragmentActivity mo23785d();

    FragmentActivity p_();

    /* renamed from: com.ss.android.lark.multitask.task.g$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static EventTracker $default$O_(AbstractC48369g gVar) {
            return new StatisticsEventTracker();
        }

        public static FragmentActivity $default$p_(AbstractC48369g gVar) {
            return gVar.mo23785d();
        }
    }
}
