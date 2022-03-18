package com.ss.android.vc.common.widget.maxwidthdialog;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.component.universe_design.util.UDUiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J.\u0010\u000b\u001a\u00020\n\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0017R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/common/widget/maxwidthdialog/MaxWidthContentDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "maxWidth", "", "adjustSize", "", "apply", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDialogInitSize", "Landroid/util/Size;", "onShow", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.c.d */
public final class MaxWidthContentDialogController extends UDDialogController {

    /* renamed from: a */
    private final String f152343a = "MaxWidthContentDialogController";

    /* renamed from: b */
    private float f152344b = -1.0f;

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onShow() {
        super.onShow();
        m236546a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/common/widget/maxwidthdialog/MaxWidthContentDialogController$adjustSize$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.c.d$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC60855a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f152345a;

        /* renamed from: b */
        final /* synthetic */ float f152346b;

        /* renamed from: c */
        final /* synthetic */ Window f152347c;

        /* renamed from: d */
        final /* synthetic */ Size f152348d;

        public void onGlobalLayout() {
            if (((float) this.f152345a.getWidth()) > this.f152346b) {
                ViewGroup.LayoutParams layoutParams = this.f152345a.getLayoutParams();
                layoutParams.width = (int) this.f152346b;
                this.f152345a.setLayoutParams(layoutParams);
                this.f152345a.requestLayout();
                this.f152347c.setLayout((int) this.f152346b, this.f152348d.getHeight());
            }
            this.f152345a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC60855a(View view, float f, Window window, Size size) {
            this.f152345a = view;
            this.f152346b = f;
            this.f152347c = window;
            this.f152348d = size;
        }
    }

    /* renamed from: a */
    private final void m236546a() {
        Window window;
        UDDialog mDialog = getMDialog();
        if (mDialog != null && (window = mDialog.getWindow()) != null) {
            Size b = m236547b();
            float a = UDDimenUtils.m93308a(getContext(), getMTranslationOnY());
            if (this.f152344b < BitmapDescriptorFactory.HUE_RED) {
                this.f152344b = 303.0f;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = b.getWidth();
            attributes.height = b.getHeight();
            attributes.y = (int) a;
            attributes.gravity = getMGravity();
            window.setAttributes(attributes);
            float f = this.f152344b;
            if (f > ((float) 0)) {
                float size = getSize(f, UDUiUtils.m93321a(getContext()).getWidth());
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC60855a(decorView, size, window, b));
            }
        }
    }

    /* renamed from: b */
    private final Size m236547b() {
        float f;
        float f2;
        Size a = UDUiUtils.m93321a(getContext());
        float a2 = UDDimenUtils.m93308a(getContext(), getMMarginInDp());
        float size = getSize(getMWidth(), Math.min(a.getWidth(), a.getHeight()));
        float f3 = (float) 0;
        if (size > f3) {
            f = Math.max((float) BitmapDescriptorFactory.HUE_RED, size - (((float) 2) * a2));
        } else {
            f = getMWidth();
        }
        float size2 = getSize(getMHeight(), a.getHeight());
        if (size2 > f3) {
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, size2 - (a2 * ((float) 2)));
        } else {
            f2 = getMHeight();
        }
        return new Size((int) f, (int) f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxWidthContentDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C60854c) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            this.f152344b = ((C60854c) uDBaseDialogBuilder).f152341a;
            return;
        }
        throw new IllegalArgumentException(("builder should be MaxWidthContentDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
