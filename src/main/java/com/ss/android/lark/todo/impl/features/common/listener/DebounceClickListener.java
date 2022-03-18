package com.ss.android.lark.todo.impl.features.common.listener;

import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener;", "Landroid/view/View$OnClickListener;", "()V", "mLastClickTime", "", "doClick", "", "v", "Landroid/view/View;", "onClick", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.b.a */
public abstract class DebounceClickListener implements View.OnClickListener {

    /* renamed from: a */
    public static final Companion f139371a = new Companion(null);

    /* renamed from: c */
    private static long f139372c = 1000;

    /* renamed from: b */
    private long f139373b;

    /* renamed from: a */
    public abstract void mo191942a(View view);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener$Companion;", "", "()V", "TIME_INTERVAL", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f139373b > f139372c) {
            mo191942a(view);
            this.f139373b = uptimeMillis;
        }
    }
}
