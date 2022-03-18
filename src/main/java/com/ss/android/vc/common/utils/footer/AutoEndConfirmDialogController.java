package com.ss.android.vc.common.utils.footer;

import android.content.Context;
import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.view.View;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0010\u001a\u00020\u0011\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/common/utils/footer/AutoEndConfirmDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "countDownTimer", "Landroid/os/CountDownTimer;", "localReceiveTime", "", "serverTime", "timeTextId", "", "timeoutListener", "Landroid/content/DialogInterface$OnClickListener;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreateFooter", "Landroid/view/View;", "onDismiss", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.e.a.b */
public final class AutoEndConfirmDialogController extends UDDialogController {

    /* renamed from: a */
    public int f151905a = R.string.View_MV_EndMeetingTimer_PopUpButton;

    /* renamed from: b */
    public DialogInterface.OnClickListener f151906b;

    /* renamed from: c */
    private final String f151907c = "AutoEndConfirmDialogController";

    /* renamed from: d */
    private long f151908d;

    /* renamed from: e */
    private long f151909e;

    /* renamed from: f */
    private CountDownTimer f151910f;

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onDismiss() {
        CountDownTimer countDownTimer = this.f151910f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f151910f = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/common/utils/footer/AutoEndConfirmDialogController$onCreateFooter$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.e.a.b$a */
    public static final class CountDownTimerC60730a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ AutoEndConfirmDialogController f151911a;

        /* renamed from: b */
        final /* synthetic */ UDButton f151912b;

        /* renamed from: c */
        final /* synthetic */ Ref.LongRef f151913c;

        public void onFinish() {
            DialogInterface.OnClickListener onClickListener = this.f151911a.f151906b;
            if (onClickListener != null) {
                onClickListener.onClick(this.f151911a.getMDialog(), R.id.ud_dialog_btn_primary);
            }
        }

        public void onTick(long j) {
            int i = this.f151911a.f151905a;
            this.f151912b.setText(UIHelper.mustacheFormat(i, "number", "" + (j / ((long) 1000))));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC60730a(AutoEndConfirmDialogController bVar, UDButton uDButton, Ref.LongRef longRef, long j, long j2) {
            super(j, j2);
            this.f151911a = bVar;
            this.f151912b = uDButton;
            this.f151913c = longRef;
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
        if (uDButton != null) {
            String str = this.f151907c;
            StringBuilder sb = new StringBuilder();
            sb.append("Meeting Auto end Server time = ");
            sb.append(this.f151908d);
            sb.append(", current time=");
            long j = (long) 1000;
            sb.append(System.currentTimeMillis() / j);
            C60700b.m235843a(str, "onCreateFooter", sb.toString());
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = this.f151908d - (System.currentTimeMillis() / j);
            if (longRef.element <= 0 || longRef.element > ((long) 60)) {
                longRef.element = 60 - ((System.currentTimeMillis() / j) - this.f151909e);
            }
            if (longRef.element <= 0 || longRef.element > ((long) 60)) {
                longRef.element = 60;
            }
            String str2 = this.f151907c;
            C60700b.m235843a(str2, "onCreateFooter", "Meeting Auto end CountDownTimer time = " + longRef.element);
            uDButton.setText(UIHelper.mustacheFormat(this.f151905a, "number", String.valueOf(longRef.element)));
            uDButton.setEnabled(true);
            this.f151910f = new CountDownTimerC60730a(this, uDButton, longRef, j * longRef.element, 1000).start();
        }
        return onCreateFooter;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoEndConfirmDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C60729a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C60729a aVar = (C60729a) uDBaseDialogBuilder;
            this.f151905a = aVar.f151901a;
            Long l = aVar.f151902b;
            Intrinsics.checkExpressionValueIsNotNull(l, "builder.serverTime");
            this.f151908d = l.longValue();
            Long l2 = aVar.f151903c;
            Intrinsics.checkExpressionValueIsNotNull(l2, "builder.localReceiveTime");
            this.f151909e = l2.longValue();
            this.f151906b = aVar.f151904d;
            return;
        }
        throw new IllegalArgumentException(("builder should be AutoEndConfirmDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
