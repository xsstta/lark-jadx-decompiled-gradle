package com.larksuite.component.ui.toast;

import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

public class LKUIToast {
    public static WeakReference<UDToastImpl> mUdToastRef;
    private static int sBottomMargin = 0;
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    private static boolean sIsEnabled = true;

    public static void disableToast() {
        sIsEnabled = false;
    }

    public static void enableToast() {
        sIsEnabled = true;
    }

    public static void show(Context context, String str, boolean z) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str, z ? -2 : -1) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$5epTxd5HHBizm7Nw0_37PJeJNq8 */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    UDToast.build(this.f$0).mo91643a(LKUIToast.nullIsEmpty(this.f$1)).mo91640a(this.f$2).mo91655j().show();
                }
            });
        }
    }

    public static void cancelLoading() {
        runOnUiThread($$Lambda$LKUIToast$SldFayNMGgIyzn8BB5OLyDWOelM.INSTANCE);
    }

    private static boolean isDisabled() {
        return !sIsEnabled;
    }

    static /* synthetic */ void lambda$cancelLoading$1() {
        WeakReference<UDToastImpl> weakReference = mUdToastRef;
        if (weakReference != null) {
            UDToastImpl dVar = weakReference.get();
            if (dVar != null) {
                dVar.cancel();
            }
            mUdToastRef = null;
        }
    }

    public static RotateAnimation getRotateAnimation() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1200);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        return rotateAnimation;
    }

    public static void setBottomMargin(int i) {
        sBottomMargin = i;
    }

    static CharSequence nullIsEmpty(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        return charSequence;
    }

    private static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            sHandler.post(runnable);
        }
    }

    public static void show(Context context, int i) {
        show(context, context.getString(i));
    }

    public static void showInCenter(Context context, int i) {
        showInCenter(context, context.getString(i));
    }

    public static void showLoading(Context context, int i) {
        showLoading(context, context.getString(i));
    }

    public static void loadFail(Context context, int i) {
        runOnUiThread(new Runnable(context, i) {
            /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$Y49LYAzorw9jfRSxOfQ6HkKJaP0 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                Context context;
                LKUIToast.loadFail(context, (int) this.f$0.getString(this.f$1));
            }
        });
    }

    public static void loadSuccess(Context context, int i) {
        runOnUiThread(new Runnable(context, i) {
            /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$rjbUfbRhfq_Zxcc5gjnDTUSIwY */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                Context context;
                LKUIToast.loadSuccess(context, (int) this.f$0.getString(this.f$1));
            }
        });
    }

    public static void showLoading(Context context, CharSequence charSequence) {
        runOnUiThread(new Runnable(context, charSequence) {
            /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$3_gE2GXBNYs0C29LyiR5TEW428 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ CharSequence f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                LKUIToast.lambda$showLoading$0(this.f$0, this.f$1);
            }
        });
    }

    public static void loadFail(Context context, CharSequence charSequence) {
        runOnUiThread(new Runnable(context, charSequence) {
            /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$HOJU76xHGMZi8lN5A8rbDNaodU */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ CharSequence f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                LKUIToast.lambda$loadFail$4(this.f$0, this.f$1);
            }
        });
    }

    public static void loadSuccess(Context context, CharSequence charSequence) {
        runOnUiThread(new Runnable(context, charSequence) {
            /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$RezkH7SM3Vg_aNnLQhbkuhpjuVs */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ CharSequence f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                LKUIToast.lambda$loadSuccess$2(this.f$0, this.f$1);
            }
        });
    }

    public static C25707a newGlobalInCenter(Context context, String str) {
        return new C25707a(context, UDToast.build(context).mo91643a(nullIsEmpty(str)).mo91638a(17, 0, 0), str);
    }

    private static void showFail(Context context, CharSequence charSequence) {
        UDToast.build(context).mo91643a(nullIsEmpty(charSequence)).mo91647b(R.drawable.ud_icon_more_close_outlined).mo91655j().show();
    }

    private static void showSuccess(Context context, CharSequence charSequence) {
        UDToast.build(context).mo91643a(nullIsEmpty(charSequence)).mo91647b(R.drawable.ud_icon_yes_outlined).mo91655j().show();
    }

    static /* synthetic */ void lambda$loadFail$4(Context context, CharSequence charSequence) {
        WeakReference<UDToastImpl> weakReference = mUdToastRef;
        if (weakReference == null) {
            showFail(context, charSequence);
            return;
        }
        UDToastImpl dVar = weakReference.get();
        if (dVar == null || !dVar.mo91668c()) {
            showFail(context, charSequence);
            return;
        }
        dVar.setText(nullIsEmpty(charSequence));
        dVar.mo91660a(R.drawable.ud_icon_more_close_outlined);
        Handler handler = sHandler;
        dVar.getClass();
        handler.postDelayed(new Runnable() {
            /* class com.larksuite.component.ui.toast.$$Lambda$nOPo6WpBNTEMKGEAJCAlm__Hf70 */

            public final void run() {
                UDToastImpl.this.cancel();
            }
        }, 2000);
    }

    static /* synthetic */ void lambda$loadSuccess$2(Context context, CharSequence charSequence) {
        WeakReference<UDToastImpl> weakReference = mUdToastRef;
        if (weakReference == null) {
            showSuccess(context, charSequence);
            return;
        }
        UDToastImpl dVar = weakReference.get();
        if (dVar == null || !dVar.mo91668c()) {
            showSuccess(context, charSequence);
            return;
        }
        dVar.setText(nullIsEmpty(charSequence));
        dVar.mo91660a(R.drawable.ud_icon_yes_outlined);
        Handler handler = sHandler;
        dVar.getClass();
        handler.postDelayed(new Runnable() {
            /* class com.larksuite.component.ui.toast.$$Lambda$nOPo6WpBNTEMKGEAJCAlm__Hf70 */

            public final void run() {
                UDToastImpl.this.cancel();
            }
        }, 2000);
    }

    static /* synthetic */ void lambda$showLoading$0(Context context, CharSequence charSequence) {
        WeakReference<UDToastImpl> weakReference = mUdToastRef;
        if (weakReference == null) {
            showPermanentLoading(context, charSequence);
            return;
        }
        UDToastImpl dVar = weakReference.get();
        if (dVar == null || !dVar.mo91668c()) {
            showPermanentLoading(context, charSequence);
        } else {
            dVar.setText(nullIsEmpty(charSequence));
        }
    }

    public static C25707a newGlobal(Context context, String str) {
        return new C25707a(context, UDToast.build(context).mo91643a(nullIsEmpty(str)), str);
    }

    public static void showInCenter(Context context, String str) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$TxZI6NlmuGacDSxCOeEThZZBJOc */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    UDToast.build(this.f$0).mo91643a(LKUIToast.nullIsEmpty(this.f$1)).mo91638a(17, 0, 0).mo91655j().show();
                }
            });
        }
    }

    private static void showPermanentLoading(Context context, CharSequence charSequence) {
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.mo7698a(1);
        circularProgressDrawable.mo7701a(UDColorUtils.getColor(context, R.color.static_white));
        circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
        UDToastImpl j = UDToast.build(context).mo91643a(nullIsEmpty(charSequence)).mo91641a(circularProgressDrawable).mo91640a(2147483647L).mo91655j();
        mUdToastRef = new WeakReference<>(j);
        j.show();
    }

    public static void show(Context context, String str) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$XOrLZOBAKqu85JyrM2eXweXMrM */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    UDToast.show(this.f$0, LKUIToast.nullIsEmpty(this.f$1).toString());
                }
            });
        }
    }

    public static C25707a newGlobal(Context context, String str, int i) {
        return newGlobal(context, str);
    }

    public static C25707a newGlobalInCenter(Context context, String str, int i) {
        return newGlobalInCenter(context, str);
    }

    public static void show(Context context, int i, int i2) {
        show(context, i, context.getString(i2));
    }

    public static void showInCenter(Context context, int i, long j) {
        showInCenter(context, context.getString(i), j);
    }

    public static C25707a newGlobal(Context context, int i, String str) {
        return new C25707a(context, UDToast.build(context).mo91643a(nullIsEmpty(str)).mo91647b(i), str);
    }

    public static void showInCenter(Context context, int i, boolean z) {
        showInCenter(context, context.getString(i), z);
    }

    public static void show(Context context, int i, long j) {
        show(context, context.getString(i), j);
    }

    public static void show(Context context, int i, String str) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str, i) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$I7vMMNmGNSOBFRhdPypY5JffUVA */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    UDToast.build(this.f$0).mo91643a(LKUIToast.nullIsEmpty(this.f$1)).mo91647b(this.f$2).mo91655j().show();
                }
            });
        }
    }

    public static void showInCenter(Context context, String str, long j) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str, j) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$4wqzaeR92xMabFkbtiPAORuVQ */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    UDToast.build(this.f$0).mo91643a(LKUIToast.nullIsEmpty(this.f$1)).mo91640a(this.f$2).mo91655j().show();
                }
            });
        }
    }

    public static void showInCenter(Context context, String str, boolean z) {
        long j;
        if (context != null && !isDisabled()) {
            if (z) {
                j = -2;
            } else {
                j = -1;
            }
            runOnUiThread(new Runnable(context, str, j) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$bH5tUODsPi9EpNkKljlNaY0F2A */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    UDToast.build(this.f$0).mo91643a(LKUIToast.nullIsEmpty(this.f$1)).mo91638a(17, 0, 0).mo91640a(this.f$2).mo91655j().show();
                }
            });
        }
    }

    public static void show(Context context, int i, boolean z) {
        show(context, context.getString(i), z);
    }

    public static void show(Context context, String str, long j) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str, j) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$htroQdKZIpdGtWYOG9U1sKh6l5o */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    UDToast.build(this.f$0).mo91643a(LKUIToast.nullIsEmpty(this.f$1)).mo91640a(this.f$2).mo91655j().show();
                }
            });
        }
    }

    public static void show(Context context, int i, int i2, long j) {
        show(context, i, context.getString(i2), j);
    }

    public static void show(Context context, int i, String str, long j) {
        if (context != null && !isDisabled()) {
            runOnUiThread(new Runnable(context, str, i, j) {
                /* class com.larksuite.component.ui.toast.$$Lambda$LKUIToast$00EcXZGAAwXviXJiThbhN3Zy8ks */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ long f$3;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    Context context = this.f$0;
                    String str = this.f$1;
                    UDToast.build(context).mo91643a(LKUIToast.nullIsEmpty(str)).mo91647b(this.f$2).mo91640a(this.f$3).mo91655j().show();
                }
            });
        }
    }
}
