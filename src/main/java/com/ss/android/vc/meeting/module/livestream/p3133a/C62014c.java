package com.ss.android.vc.meeting.module.livestream.p3133a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;

/* renamed from: com.ss.android.vc.meeting.module.livestream.a.c */
public class C62014c extends AbstractC62012a {

    /* renamed from: a */
    private final String f155811a = "LegalHostRefusedDialogLives";

    /* renamed from: b */
    private ILKUIGlobalDialog f155812b;

    /* renamed from: c */
    private DialogC25637f f155813c;

    private C62014c() {
    }

    /* renamed from: a */
    public void mo214695a() {
        C60700b.m235851b("LegalHostRefusedDialogLives", "[dismiss]", "dismiss");
        ILKUIGlobalDialog cVar = this.f155812b;
        if (cVar != null && cVar.mo89213b()) {
            this.f155812b.mo89212a();
        }
        DialogC25637f fVar = this.f155813c;
        if (fVar != null && fVar.isShowing()) {
            this.f155813c.dismiss();
        }
        this.f155812b = null;
        this.f155813c = null;
    }

    /* renamed from: b */
    public boolean mo214697b() {
        boolean z;
        boolean z2;
        DialogC25637f fVar = this.f155813c;
        if (fVar == null || !fVar.isShowing()) {
            z = false;
        } else {
            z = true;
        }
        ILKUIGlobalDialog cVar = this.f155812b;
        if (cVar == null || !cVar.mo89213b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m242317a(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m242318b(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* renamed from: a */
    public static C62014c m242316a(Activity activity, int i, int i2, View.OnClickListener onClickListener) {
        C62014c cVar = new C62014c();
        cVar.mo214696b(activity, i, i2, onClickListener);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo214696b(Activity activity, int i, int i2, View.OnClickListener onClickListener) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("in activity ");
        boolean z2 = true;
        if (activity != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C60700b.m235851b("LegalHostRefusedDialogLives", "[showInternal]", sb.toString());
        if (activity == null) {
            this.f155812b = VCDialogUtils.m236176a(UIHelper.getString(i), i2, new DialogInterface.OnClickListener(onClickListener) {
                /* class com.ss.android.vc.meeting.module.livestream.p3133a.$$Lambda$c$f1xI4ZZbdun4_d4Qffc6WIQ_ym0 */
                public final /* synthetic */ View.OnClickListener f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62014c.lambda$f1xI4ZZbdun4_d4Qffc6WIQ_ym0(this.f$0, dialogInterface, i);
                }
            }, false);
        } else if (C60773o.m236120a(C60773o.m236124b(activity))) {
            this.f155813c = VCDialogUtils.m236181a((Context) activity, i, i2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(onClickListener) {
                /* class com.ss.android.vc.meeting.module.livestream.p3133a.$$Lambda$c$QeWn_HsQHmEB67kzR2C7E3oBXA */
                public final /* synthetic */ View.OnClickListener f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62014c.m271277lambda$QeWn_HsQHmEB67kzR2C7E3oBXA(this.f$0, dialogInterface, i);
                }
            }, false);
        } else {
            z2 = false;
        }
        C60700b.m235851b("LegalHostRefusedDialogLives", "[showInternal2]", "end, success=" + z2);
    }
}
