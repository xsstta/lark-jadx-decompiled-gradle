package com.bytedance.ee.bear.widgets.dialog.progressdialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.suite.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u000f\u001a\u00020\u0010\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0014J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/progressdialog/BearUDProgressDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mMessageView", "Landroid/widget/TextView;", "mProgress", "", "getMProgress", "()I", "setMProgress", "(I)V", "mProgressBar", "Lcom/larksuite/component/universe_design/progress/UDProgress;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "onCreateContent", "Landroid/view/View;", "setProgress", "progress", "setProgressInColor", "color", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.c.b */
public final class BearUDProgressDialogController extends UDDialogController {

    /* renamed from: a */
    private int f31977a;

    /* renamed from: b */
    private UDProgress f31978b;

    /* renamed from: c */
    private TextView f31979c;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.bear_ud_dialog_progress_content;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        TextView textView;
        View onCreateContent = super.onCreateContent();
        UDProgress uDProgress = null;
        if (onCreateContent == null) {
            return null;
        }
        if (onCreateContent != null) {
            textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_content_message_tv);
        } else {
            textView = null;
        }
        this.f31979c = textView;
        if (onCreateContent != null) {
            uDProgress = (UDProgress) onCreateContent.findViewById(R.id.progress_bar);
        }
        this.f31978b = uDProgress;
        mo45428a(this.f31977a);
        return onCreateContent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BearUDProgressDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo45428a(int i) {
        if (i <= 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        this.f31977a = i;
        UDProgress uDProgress = this.f31978b;
        if (uDProgress != null) {
            uDProgress.setProgress(i);
        }
        TextView textView = this.f31979c;
        if (textView != null) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            String format = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            textView.setText(format);
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof BearUDProgressDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            this.f31977a = ((BearUDProgressDialogBuilder) uDBaseDialogBuilder).mo45426a();
            return;
        }
        throw new IllegalArgumentException(("builder should be BearUDProgressDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
