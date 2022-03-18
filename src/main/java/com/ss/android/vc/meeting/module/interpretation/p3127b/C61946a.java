package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import android.view.View;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.ss.android.vc.entity.LanguageType;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.a */
public class C61946a {

    /* renamed from: a */
    private Object f155581a;

    /* renamed from: a */
    public void mo214476a() {
        Object obj = this.f155581a;
        if (obj != null) {
            if (obj instanceof ILKUIGlobalDialog) {
                ((ILKUIGlobalDialog) obj).mo89212a();
            } else if (obj instanceof DialogC25637f) {
                ((DialogC25637f) obj).dismiss();
            }
        }
        this.f155581a = null;
    }

    /* renamed from: b */
    public boolean mo214478b() {
        Object obj = this.f155581a;
        if (obj == null) {
            return false;
        }
        if (obj instanceof ILKUIGlobalDialog) {
            return ((ILKUIGlobalDialog) obj).mo89213b();
        }
        if (obj instanceof DialogC25637f) {
            return ((DialogC25637f) obj).isShowing();
        }
        return false;
    }

    /* renamed from: a */
    public static C61946a m242005a(Activity activity, LanguageType languageType, LanguageType languageType2, View.OnClickListener onClickListener) {
        C61946a aVar = new C61946a();
        aVar.mo214477b(activity, languageType, languageType2, onClickListener);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo214477b(android.app.Activity r17, com.ss.android.vc.entity.LanguageType r18, com.ss.android.vc.entity.LanguageType r19, final android.view.View.OnClickListener r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            r2 = 0
            r3 = 0
            if (r17 != 0) goto L_0x000e
            android.content.Context r4 = com.ss.android.vc.dependency.ar.m236694a()
            r5 = r4
            r6 = 1
            goto L_0x001d
        L_0x000e:
            android.app.Activity r4 = com.ss.android.vc.common.p3083e.C60773o.m236124b(r17)
            boolean r4 = com.ss.android.vc.common.p3083e.C60773o.m236120a(r4)
            if (r4 == 0) goto L_0x001b
            r5 = r17
            goto L_0x001c
        L_0x001b:
            r5 = r2
        L_0x001c:
            r6 = 0
        L_0x001d:
            if (r5 == 0) goto L_0x003d
            r7 = 2131842269(0x7f1154dd, float:1.931787E38)
            r8 = 2
            r9 = 2131841689(0x7f115299, float:1.9316693E38)
            r12 = 2131841753(0x7f1152d9, float:1.9316823E38)
            com.ss.android.vc.meeting.module.interpretation.b.a$1 r13 = new com.ss.android.vc.meeting.module.interpretation.b.a$1
            r2 = r20
            r13.<init>(r2)
            r14 = 0
            r15 = 1
            r10 = r18
            r11 = r19
            java.lang.Object r2 = com.ss.android.vc.common.utils.VCDialogUtils.m236210a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f155581a = r2
            goto L_0x0040
        L_0x003d:
            r0.f155581a = r2
            r1 = 0
        L_0x0040:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "end, success="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "InterpretationConfirmDialog"
            java.lang.String r3 = "[showInternal]"
            com.ss.android.vc.common.p3077b.C60700b.m235851b(r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.interpretation.p3127b.C61946a.mo214477b(android.app.Activity, com.ss.android.vc.entity.LanguageType, com.ss.android.vc.entity.LanguageType, android.view.View$OnClickListener):void");
    }
}
