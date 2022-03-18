package com.ss.android.lark.upgrade.setting.appversion;

import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/appversion/ThreeTimesClickListener;", "Landroid/view/View$OnClickListener;", "()V", "clearCounterRunnable", "Ljava/lang/Runnable;", "counter", "", "onClick", "", "v", "Landroid/view/View;", "onClickThreeTimes", "resetCounter", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.a.b */
public abstract class ThreeTimesClickListener implements View.OnClickListener {

    /* renamed from: a */
    private int f142118a;

    /* renamed from: b */
    private final Runnable f142119b = new RunnableC57667a(this);

    /* renamed from: a */
    public final void mo195757a() {
        this.f142118a = 0;
    }

    /* renamed from: a */
    public abstract void mo195756a(View view);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.a.b$a */
    static final class RunnableC57667a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreeTimesClickListener f142120a;

        RunnableC57667a(ThreeTimesClickListener bVar) {
            this.f142120a = bVar;
        }

        public final void run() {
            this.f142120a.mo195757a();
        }
    }

    public final void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        view.removeCallbacks(this.f142119b);
        int i = this.f142118a + 1;
        this.f142118a = i;
        if (i == 3) {
            mo195756a(view);
            mo195757a();
            return;
        }
        view.postDelayed(this.f142119b, TimeUnit.SECONDS.toMillis(1));
    }
}
