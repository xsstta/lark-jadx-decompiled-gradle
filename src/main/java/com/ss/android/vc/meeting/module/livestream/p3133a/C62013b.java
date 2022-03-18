package com.ss.android.vc.meeting.module.livestream.p3133a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;

/* renamed from: com.ss.android.vc.meeting.module.livestream.a.b */
public class C62013b extends AbstractC62012a {

    /* renamed from: a */
    private final String f155808a = "HostReceiveLivingReqDialogLives";

    /* renamed from: b */
    private ILKUIGlobalDialog f155809b;

    /* renamed from: c */
    private DialogC25637f f155810c;

    private C62013b() {
    }

    /* renamed from: a */
    public void mo214692a() {
        C60700b.m235851b("HostReceiveLivingReqDialogLives", "[dismiss]", "dismiss");
        ILKUIGlobalDialog cVar = this.f155809b;
        if (cVar != null && cVar.mo89213b()) {
            this.f155809b.mo89212a();
        }
        DialogC25637f fVar = this.f155810c;
        if (fVar != null && fVar.isShowing()) {
            this.f155810c.dismiss();
        }
        this.f155809b = null;
        this.f155810c = null;
    }

    /* renamed from: b */
    public boolean mo214694b() {
        boolean z;
        boolean z2;
        DialogC25637f fVar = this.f155810c;
        if (fVar == null || !fVar.isShowing()) {
            z = false;
        } else {
            z = true;
        }
        ILKUIGlobalDialog cVar = this.f155809b;
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
    public static /* synthetic */ void m242309a(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m242310b(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m242311c(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m242312d(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* renamed from: a */
    public static C62013b m242308a(Activity activity, int i, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        C62013b bVar = new C62013b();
        bVar.mo214693b(activity, i, str, onClickListener, onClickListener2);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo214693b(Activity activity, int i, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("in activity , ");
        boolean z2 = false;
        if (activity != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C60700b.m235851b("HostReceiveLivingReqDialogLives", "[showInternal]", sb.toString());
        if (activity == null) {
            this.f155809b = VCDialogUtils.m236174a(i, 1, str, (int) R.string.View_G_DeclineButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(onClickListener) {
                /* class com.ss.android.vc.meeting.module.livestream.p3133a.$$Lambda$b$TV102wrotXe0nZ0EeDybfuyXU */
                public final /* synthetic */ View.OnClickListener f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62013b.m271276lambda$TV102wrotXe0nZ0EeDybfuyXU(this.f$0, dialogInterface, i);
                }
            }, (int) R.string.View_G_ApproveButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(onClickListener2) {
                /* class com.ss.android.vc.meeting.module.livestream.p3133a.$$Lambda$b$IHun994jE3tJbm2Txbl7O05IV5c */
                public final /* synthetic */ View.OnClickListener f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62013b.lambda$IHun994jE3tJbm2Txbl7O05IV5c(this.f$0, dialogInterface, i);
                }
            }, false);
        } else {
            if (C60773o.m236120a(C60773o.m236124b(activity))) {
                this.f155810c = VCDialogUtils.m236182a((Context) activity, i, 1, str, (int) R.string.View_G_DeclineButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(onClickListener) {
                    /* class com.ss.android.vc.meeting.module.livestream.p3133a.$$Lambda$b$6d14Pm1dnKhaFzqVZPozL3hMI */
                    public final /* synthetic */ View.OnClickListener f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62013b.m271275lambda$6d14Pm1dnKhaFzqVZPozL3hMI(this.f$0, dialogInterface, i);
                    }
                }, (int) R.string.View_G_ApproveButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(onClickListener2) {
                    /* class com.ss.android.vc.meeting.module.livestream.p3133a.$$Lambda$b$FyGNkSzYTQYgprDoUiWSrgARsGQ */
                    public final /* synthetic */ View.OnClickListener f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62013b.lambda$FyGNkSzYTQYgprDoUiWSrgARsGQ(this.f$0, dialogInterface, i);
                    }
                }, false);
            }
            C60700b.m235851b("HostReceiveLivingReqDialogLives", "[showInternal]", "end, success=" + z2);
        }
        z2 = true;
        C60700b.m235851b("HostReceiveLivingReqDialogLives", "[showInternal]", "end, success=" + z2);
    }
}
