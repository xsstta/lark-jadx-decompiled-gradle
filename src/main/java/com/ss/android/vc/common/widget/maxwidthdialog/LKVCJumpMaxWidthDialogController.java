package com.ss.android.vc.common.widget.maxwidthdialog;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.component.universe_design.util.UDUiUtils;
import com.larksuite.suite.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J.\u0010\u000f\u001a\u00020\u000e\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0017J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/vc/common/widget/maxwidthdialog/LKVCJumpMaxWidthDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mJumpListener", "Lcom/ss/android/vc/common/widget/maxwidthdialog/LKVCJumpMaxWidthDialogController$OnJumpListener;", "mJumpMsg", "", "mMessageTV", "Landroid/widget/TextView;", "maxWidth", "", "adjustSize", "", "apply", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDialogInitSize", "Landroid/util/Size;", "onCreateContent", "Landroid/view/View;", "onShow", "updateMessage", "OnJumpListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.c.b */
public class LKVCJumpMaxWidthDialogController extends UDDialogController {

    /* renamed from: a */
    public TextView f152332a;

    /* renamed from: b */
    private String f152333b = "";

    /* renamed from: c */
    private OnJumpListener f152334c;

    /* renamed from: d */
    private float f152335d = -1.0f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/common/widget/maxwidthdialog/LKVCJumpMaxWidthDialogController$OnJumpListener;", "", "onJump", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.c.b$a */
    public interface OnJumpListener {
        void onJump();
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onShow() {
        super.onShow();
        m236544b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/common/widget/maxwidthdialog/LKVCJumpMaxWidthDialogController$adjustSize$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.c.b$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC60852b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f152336a;

        /* renamed from: b */
        final /* synthetic */ float f152337b;

        /* renamed from: c */
        final /* synthetic */ Window f152338c;

        /* renamed from: d */
        final /* synthetic */ Size f152339d;

        public void onGlobalLayout() {
            if (((float) this.f152336a.getWidth()) > this.f152337b) {
                ViewGroup.LayoutParams layoutParams = this.f152336a.getLayoutParams();
                layoutParams.width = (int) this.f152337b;
                this.f152336a.setLayoutParams(layoutParams);
                this.f152336a.requestLayout();
                this.f152338c.setLayout((int) this.f152337b, this.f152339d.getHeight());
            }
            this.f152336a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC60852b(View view, float f, Window window, Size size) {
            this.f152336a = view;
            this.f152337b = f;
            this.f152338c = window;
            this.f152339d = size;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/common/widget/maxwidthdialog/LKVCJumpMaxWidthDialogController$onCreateContent$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.c.b$c */
    public static final class ViewTreeObserver$OnPreDrawListenerC60853c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ LKVCJumpMaxWidthDialogController f152340a;

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            TextView textView = this.f152340a.f152332a;
            if (textView != null && textView.getLineCount() > 2) {
                textView.setGravity(8388611);
            }
            TextView textView2 = this.f152340a.f152332a;
            if (textView2 == null || (viewTreeObserver = textView2.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC60853c(LKVCJumpMaxWidthDialogController bVar) {
            this.f152340a = bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        TextView textView;
        ViewTreeObserver viewTreeObserver;
        View onCreateContent = super.onCreateContent();
        if (onCreateContent != null) {
            textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_content_message_tv);
        } else {
            textView = null;
        }
        this.f152332a = textView;
        m236543a();
        TextView textView2 = this.f152332a;
        if (!(textView2 == null || (viewTreeObserver = textView2.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC60853c(this));
        }
        return onCreateContent;
    }

    /* renamed from: b */
    private final void m236544b() {
        Window window;
        UDDialog mDialog = getMDialog();
        if (mDialog != null && (window = mDialog.getWindow()) != null) {
            Size c = m236545c();
            float a = UDDimenUtils.m93308a(getContext(), getMTranslationOnY());
            if (this.f152335d < BitmapDescriptorFactory.HUE_RED) {
                this.f152335d = 303.0f;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = c.getWidth();
            attributes.height = c.getHeight();
            attributes.y = (int) a;
            attributes.gravity = getMGravity();
            window.setAttributes(attributes);
            float f = this.f152335d;
            if (f > ((float) 0)) {
                float size = getSize(f, UDUiUtils.m93321a(getContext()).getWidth());
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC60852b(decorView, size, window, c));
            }
        }
    }

    /* renamed from: c */
    private final Size m236545c() {
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

    /* renamed from: a */
    private final void m236543a() {
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(this.f152333b);
        String str = this.f152333b;
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String str2 = this.f152333b;
            int start = matcher.start() + 2;
            int end = matcher.end() - 2;
            if (str2 != null) {
                String substring = str2.substring(start, end);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String str3 = this.f152333b;
                Intrinsics.checkExpressionValueIsNotNull(group, "placeholder");
                String replace$default = StringsKt.replace$default(str3, group, substring, false, 4, (Object) null);
                i2 = matcher.start();
                i = substring.length() + i2;
                str = replace$default;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        if (i > 0) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new MyClickableSpan(this.f152334c), i2, i, 33);
            TextView textView = this.f152332a;
            if (textView != null) {
                textView.setText(spannableString);
            }
            TextView textView2 = this.f152332a;
            if (textView2 != null) {
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
            TextView textView3 = this.f152332a;
            if (textView3 != null) {
                textView3.setHighlightColor(0);
                return;
            }
            return;
        }
        TextView textView4 = this.f152332a;
        if (textView4 != null) {
            textView4.setText(this.f152333b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKVCJumpMaxWidthDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C60851a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C60851a aVar = (C60851a) uDBaseDialogBuilder;
            this.f152332a = aVar.f152329a;
            String str = aVar.f152330b;
            Intrinsics.checkExpressionValueIsNotNull(str, "builder.mJumpMsg");
            this.f152333b = str;
            this.f152334c = aVar.f152331c;
            return;
        }
        throw new IllegalArgumentException(("builder should be LKVCJumpMaxWidthDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
