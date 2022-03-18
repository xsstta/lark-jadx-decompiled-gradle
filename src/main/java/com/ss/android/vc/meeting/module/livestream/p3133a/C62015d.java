package com.ss.android.vc.meeting.module.livestream.p3133a;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.meeting.module.livestream.a.d */
public class C62015d extends AbstractC62012a {

    /* renamed from: a */
    private final String f155814a = "LegalParticipantPrivacyDialogLives";

    /* renamed from: b */
    private ILKUIGlobalDialog f155815b;

    /* renamed from: c */
    private DialogC25637f f155816c;

    private C62015d() {
    }

    /* renamed from: a */
    public void mo214698a() {
        C60700b.m235851b("LegalParticipantPrivacyDialogLives", "[dismiss]", "dismiss");
        ILKUIGlobalDialog cVar = this.f155815b;
        if (cVar != null && cVar.mo89213b()) {
            this.f155815b.mo89212a();
        }
        DialogC25637f fVar = this.f155816c;
        if (fVar != null && fVar.isShowing()) {
            this.f155816c.dismiss();
        }
        this.f155815b = null;
        this.f155816c = null;
    }

    /* renamed from: b */
    public boolean mo214700b() {
        boolean z;
        boolean z2;
        DialogC25637f fVar = this.f155816c;
        if (fVar == null || !fVar.isShowing()) {
            z = false;
        } else {
            z = true;
        }
        ILKUIGlobalDialog cVar = this.f155815b;
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
    public static /* synthetic */ void m242323a(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m242324b(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m242325c(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m242326d(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* renamed from: a */
    public static C62015d m242322a(Activity activity, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        C62015d dVar = new C62015d();
        dVar.mo214699b(activity, onClickListener, onClickListener2);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0096  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo214699b(android.app.Activity r26, android.view.View.OnClickListener r27, android.view.View.OnClickListener r28) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.livestream.p3133a.C62015d.mo214699b(android.app.Activity, android.view.View$OnClickListener, android.view.View$OnClickListener):void");
    }
}
