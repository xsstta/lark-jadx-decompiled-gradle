package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;

public class Toast {
    private static C7726a sToastWrapper;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    public static void cancelLoading() {
        LKUIToast.cancelLoading();
    }

    public static void cancel() {
        C13742g.m55711d($$Lambda$Toast$_6oP29wnflJCgBwF3HM2R8o5kRw.INSTANCE);
    }

    public static void show() {
        C13742g.m55711d($$Lambda$Toast$jMHJOg5SKA_NJ2AGxWG4iybvgY.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.facade.common.widget.Toast$a */
    public static class C7726a {

        /* renamed from: a */
        public C25707a f20889a;

        /* renamed from: b */
        public AtomicBoolean f20890b = new AtomicBoolean();

        private C7726a() {
        }

        /* renamed from: a */
        public static C7726a m30900a(Context context, String str, boolean z) {
            C7726a aVar = new C7726a();
            aVar.f20889a = LKUIToast.newGlobal(context.getApplicationContext(), str.toString());
            aVar.f20890b.set(z);
            return aVar;
        }
    }

    static /* synthetic */ void lambda$cancel$3() {
        C7726a aVar = sToastWrapper;
        if (aVar != null && aVar.f20889a != null) {
            sToastWrapper.f20889a.mo90189b();
        }
    }

    static /* synthetic */ void lambda$show$2() {
        C7726a aVar = sToastWrapper;
        if (aVar != null && aVar.f20889a != null) {
            sToastWrapper.f20889a.mo90191c();
        }
    }

    public static void showLoading(Context context, CharSequence charSequence) {
        LKUIToast.showLoading(context, charSequence);
    }

    public static void showFailureText(Context context, CharSequence charSequence) {
        showFailureText(context, charSequence, 0);
    }

    public static void showSuccessText(Context context, CharSequence charSequence) {
        showSuccessText(context, charSequence, 0);
    }

    public static void showText(Context context, CharSequence charSequence) {
        showText(context, charSequence, 0);
    }

    public static void showFailureText(Context context, int i) {
        showFailureText(context, context.getString(i), 0);
    }

    public static void showSuccessText(Context context, int i) {
        showSuccessText(context, context.getString(i), 0);
    }

    public static void showText(Context context, int i) {
        showText(context, context.getString(i), 0);
    }

    public static void showCenterToast(Context context, CharSequence charSequence, int i) {
        initAndShowToast(context, charSequence, -1, 17, 0, i, false);
    }

    public static void showFailureText(Context context, CharSequence charSequence, int i) {
        initAndShowToast(context, charSequence, R.drawable.facade_widget_toast_ic_failure, 80, 0, i, false);
    }

    public static void showFailureTextWithMargin(Context context, CharSequence charSequence, int i) {
        initAndShowToast(context, charSequence, R.drawable.facade_widget_toast_ic_failure, 80, C13749l.m55738a((int) SmActions.ACTION_ONTHECALL_EXIT), i, false);
    }

    public static void showSuccessText(Context context, CharSequence charSequence, int i) {
        initAndShowToast(context, charSequence, R.drawable.facade_widget_toast_ic_success, 80, 0, i, false);
    }

    public static void showSuccessTextWithMargin(Context context, CharSequence charSequence, int i) {
        initAndShowToast(context, charSequence, R.drawable.facade_widget_toast_ic_success, 80, C13749l.m55738a((int) SmActions.ACTION_ONTHECALL_EXIT), i, false);
    }

    public static void showText(Context context, CharSequence charSequence, int i) {
        initAndShowToast(context, charSequence, -1, 80, 0, i, false);
    }

    public static void showToastWithBottomMargin(Context context, CharSequence charSequence, int i, int i2) {
        initAndShowToast(context, charSequence, -1, 80, i, i2, false);
    }

    public static void showText(Context context, CharSequence charSequence, int i, boolean z) {
        initAndShowToast(context, charSequence, -1, 80, 0, i, z);
    }

    private static void initAndShowToast(Context context, CharSequence charSequence, int i, int i2, int i3, int i4, boolean z) {
        if (context != null) {
            C7726a aVar = sToastWrapper;
            if (aVar == null || aVar.f20889a == null || !sToastWrapper.f20890b.get()) {
                C13742g.m55711d(new Runnable(context, charSequence, i, i2, i3, i4, z) {
                    /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$Toast$Xl2V9Ab5CcqIKNxLxAyIyAFI8Q */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ CharSequence f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ int f$3;
                    public final /* synthetic */ int f$4;
                    public final /* synthetic */ int f$5;
                    public final /* synthetic */ boolean f$6;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                    }

                    public final void run() {
                        Toast.doInitAndShowToast(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                    }
                });
            } else {
                C13742g.m55708b(new Runnable(context, charSequence, i, i2, i3, i4, z) {
                    /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$Toast$bDlUpFGw5OtKYsORZvEsZi8AYXo */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ CharSequence f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ int f$3;
                    public final /* synthetic */ int f$4;
                    public final /* synthetic */ int f$5;
                    public final /* synthetic */ boolean f$6;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                    }

                    public final void run() {
                        Toast.doInitAndShowToast(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                    }
                }, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void doInitAndShowToast(Context context, CharSequence charSequence, int i, int i2, int i3, int i4, boolean z) {
        C7726a aVar = sToastWrapper;
        if (!(aVar == null || aVar.f20889a == null)) {
            sToastWrapper.f20889a.mo90189b();
        }
        C7726a a = C7726a.m30900a(context, charSequence.toString(), z);
        sToastWrapper = a;
        a.f20889a.mo90190b(i4);
        if (i != -1) {
            sToastWrapper.f20889a.mo90183a(i);
        }
        if (i2 == 80 && i3 != 0) {
            sToastWrapper.f20889a.mo90184a(80, 0, i3);
        }
        if (i2 == 17 || i2 == 48) {
            sToastWrapper.f20889a.mo90184a(i2, 0, 0);
        }
        sToastWrapper.f20889a.mo90191c();
    }
}
