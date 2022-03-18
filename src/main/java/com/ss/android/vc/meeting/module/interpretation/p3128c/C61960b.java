package com.ss.android.vc.meeting.module.interpretation.p3128c;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61946a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63742at;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.c.b */
public class C61960b {

    /* renamed from: a */
    public C61303k f155613a;

    /* renamed from: b */
    public C61946a f155614b;

    /* renamed from: c */
    private LanguageType f155615c;

    /* renamed from: d */
    private LanguageType f155616d;

    /* renamed from: e */
    private boolean f155617e;

    /* renamed from: a */
    public void mo214507a() {
        InterpreterSetting interpreterSetting = new InterpreterSetting();
        interpreterSetting.firstLanguage = this.f155615c;
        interpreterSetting.secondLanguage = this.f155616d;
        interpreterSetting.interpretingLanguage = this.f155615c;
        interpreterSetting.confirmStatus = InterpreterSetting.ConfirmStatus.CONFIRMED;
        VcBizSender.m249162a(this.f155613a.mo212055d(), interpreterSetting).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.interpretation.p3128c.C61960b.C619622 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("ReceiveInterpretModel", "[sendConfirmRequest]", "onSuccess");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("ReceiveInterpretModel", "[sendConfirmRequest2]", "onError error=" + eVar);
            }
        });
    }

    /* renamed from: b */
    public void mo214511b() {
        C60700b.m235851b("ReceiveInterpretModel", "[dismissDialog]", "dismiss");
        C61946a aVar = this.f155614b;
        if (aVar != null && aVar.mo214478b()) {
            this.f155614b.mo214476a();
            mo214510a(false);
        }
        this.f155614b = null;
    }

    /* renamed from: a */
    public void mo214510a(boolean z) {
        this.f155617e = z;
    }

    public C61960b(C61303k kVar) {
        this.f155613a = kVar;
    }

    /* renamed from: b */
    public void mo214513b(boolean z) {
        if (!z) {
            mo214511b();
        }
    }

    /* renamed from: a */
    public void mo214509a(LanguageType languageType, LanguageType languageType2) {
        C60700b.m235851b("ReceiveInterpretModel", "[receiveRequestInWindow]", "receiveRequestInWindow");
        m242074a(languageType, languageType2, (Activity) null);
    }

    /* renamed from: b */
    private boolean m242076b(LanguageType languageType, LanguageType languageType2) {
        boolean z;
        boolean z2;
        LanguageType languageType3 = this.f155615c;
        if (languageType3 == null || languageType == null || !TextUtils.equals(languageType3.languageType, languageType.languageType)) {
            z = false;
        } else {
            z = true;
        }
        LanguageType languageType4 = this.f155616d;
        if (languageType4 == null || languageType2 == null || !TextUtils.equals(languageType4.languageType, languageType2.languageType)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo214508a(Activity activity, LanguageType languageType, LanguageType languageType2) {
        C60700b.m235851b("ReceiveInterpretModel", "[recoveryDialogWhenActivity]", "recoveryDialogWhenActivity");
        mo214512b(activity, languageType, languageType);
    }

    /* renamed from: b */
    private void m242075b(LanguageType languageType, LanguageType languageType2, Activity activity) {
        C60700b.m235851b("ReceiveInterpretModel", "[showDialog]", "show");
        this.f155615c = languageType;
        this.f155616d = languageType2;
        this.f155614b = C61946a.m242005a(activity, languageType, languageType2, new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.p3128c.C61960b.View$OnClickListenerC619611 */

            public void onClick(View view) {
                C61960b.this.f155614b.mo214476a();
                C61960b.this.mo214510a(false);
                C61960b.this.mo214507a();
                if (C61960b.this.f155613a != null && C61960b.this.f155613a.mo212091I() != null && C61960b.this.f155613a.mo212091I().mo212494b() != null && C61960b.this.f155613a.mo212091I().mo212494b().mo212605j() != null) {
                    Participant j = C61960b.this.f155613a.mo212091I().mo212494b().mo212605j();
                    C63742at.m250064a(C61960b.this.f155613a.mo212056e(), j.getId(), j.getDeviceId());
                }
            }
        });
        mo214510a(true);
    }

    /* renamed from: a */
    private void m242074a(LanguageType languageType, LanguageType languageType2, Activity activity) {
        C60700b.m235851b("ReceiveInterpretModel", "[receiveRequestInternal]", "receiveRequestInternal");
        C61946a aVar = this.f155614b;
        if (aVar == null) {
            m242075b(languageType, languageType2, activity);
        } else if (aVar.mo214478b()) {
            if (!m242076b(languageType, languageType2)) {
                this.f155614b.mo214476a();
                mo214510a(false);
                m242075b(languageType, languageType2, activity);
            }
        } else if (!m242076b(languageType, languageType2)) {
            m242075b(languageType, languageType2, activity);
        }
    }

    /* renamed from: b */
    public void mo214512b(Activity activity, LanguageType languageType, LanguageType languageType2) {
        if (!C60773o.m236120a(C60773o.m236124b(activity))) {
            C60700b.m235851b("ReceiveInterpretModel", "[receiveRequestInActivity]", "checkActivity error then return");
        } else {
            m242074a(languageType, languageType2, activity);
        }
    }
}
