package com.ss.android.lark.ug.common;

import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/common/PreventDoubleClickListener;", "Landroid/view/View$OnClickListener;", "()V", "mLastClickTime", "", "onClick", "", "v", "Landroid/view/View;", "performClick", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.common.e */
public abstract class PreventDoubleClickListener implements View.OnClickListener {

    /* renamed from: a */
    public static final Companion f141342a = new Companion(null);

    /* renamed from: b */
    private long f141343b;

    /* renamed from: a */
    public abstract void mo194687a(View view);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/common/PreventDoubleClickListener$Companion;", "", "()V", "TIME_INTERVAL", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.common.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f141343b > 1000) {
            mo194687a(view);
            this.f141343b = uptimeMillis;
        }
    }
}
