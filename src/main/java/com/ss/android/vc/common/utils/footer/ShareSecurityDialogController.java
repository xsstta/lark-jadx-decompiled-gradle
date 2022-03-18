package com.ss.android.vc.common.utils.footer;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\t\u001a\u00020\n\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/common/utils/footer/ShareSecurityDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "text", "", "time", "", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreateFooter", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.e.a.d */
public final class ShareSecurityDialogController extends UDDialogController {

    /* renamed from: a */
    public String f151916a;

    /* renamed from: b */
    private int f151917b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/common/utils/footer/ShareSecurityDialogController$onCreateFooter$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.e.a.d$a */
    public static final class CountDownTimerC60732a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ ShareSecurityDialogController f151918a;

        /* renamed from: b */
        final /* synthetic */ UDButton f151919b;

        public void onFinish() {
            cancel();
            UDButton uDButton = this.f151919b;
            if (uDButton != null) {
                uDButton.setText(this.f151918a.f151916a);
            }
            UDButton uDButton2 = this.f151919b;
            if (uDButton2 != null) {
                uDButton2.setEnabled(true);
            }
        }

        public void onTick(long j) {
            UDButton uDButton = this.f151919b;
            if (uDButton != null) {
                uDButton.setText(this.f151918a.f151916a + "(" + (j / ((long) 1000)) + "s)");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC60732a(ShareSecurityDialogController dVar, UDButton uDButton, long j, long j2) {
            super(j, j2);
            this.f151918a = dVar;
            this.f151919b = uDButton;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        UDButton uDButton;
        View onCreateFooter = super.onCreateFooter();
        if (onCreateFooter != null) {
            uDButton = (UDButton) onCreateFooter.findViewById(R.id.ud_dialog_btn_primary);
        } else {
            uDButton = null;
        }
        if (this.f151917b > 0) {
            if (uDButton != null) {
                uDButton.setEnabled(false);
            }
            if (uDButton != null) {
                uDButton.setText(this.f151916a + "(" + this.f151917b + "s)");
            }
            new CountDownTimerC60732a(this, uDButton, (long) (this.f151917b * 1000), 1000).start();
        }
        return onCreateFooter;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareSecurityDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C60731c) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C60731c cVar = (C60731c) uDBaseDialogBuilder;
            this.f151916a = cVar.f151914a;
            this.f151917b = cVar.f151915b;
            return;
        }
        throw new IllegalArgumentException(("builder should be ShareSecurityDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
