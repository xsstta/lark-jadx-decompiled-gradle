package com.ss.android.lark.qrcode.ui;

import android.content.res.Configuration;
import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/WindowRotationArbiter;", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "doOnRotationChanged", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "oldRotation", "newRotation", "", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function2;)V", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.ui.i */
public final class WindowRotationArbiter {

    /* renamed from: a */
    private int f130878a;

    /* renamed from: b */
    private final FragmentActivity f130879b;

    /* renamed from: c */
    private final Function2<Integer, Integer, Unit> f130880c;

    /* renamed from: a */
    public final void mo180965a(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        WindowManager windowManager = this.f130879b.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "fragmentActivity.windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "fragmentActivity.windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        int i = this.f130878a;
        if (rotation != i) {
            this.f130878a = rotation;
            this.f130880c.invoke(Integer.valueOf(i), Integer.valueOf(rotation));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.k<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowRotationArbiter(FragmentActivity fragmentActivity, Function2<? super Integer, ? super Integer, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "fragmentActivity");
        Intrinsics.checkParameterIsNotNull(kVar, "doOnRotationChanged");
        this.f130879b = fragmentActivity;
        this.f130880c = kVar;
        WindowManager windowManager = fragmentActivity.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "fragmentActivity.windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "fragmentActivity.windowManager.defaultDisplay");
        this.f130878a = defaultDisplay.getRotation();
    }
}
