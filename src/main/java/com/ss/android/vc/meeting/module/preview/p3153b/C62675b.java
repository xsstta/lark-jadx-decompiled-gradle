package com.ss.android.vc.meeting.module.preview.p3153b;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.statistics.event.bq;

/* renamed from: com.ss.android.vc.meeting.module.preview.b.b */
public class C62675b extends AbstractC62684c<C62678d> {

    /* renamed from: f */
    private String f157724f;

    /* renamed from: g */
    private boolean f157725g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "加入会议";
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public String mo216561a() {
        return this.f157724f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
        bq.m250208a(false, this.f157724f, this.f157736c);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        if (!super.mo216587a(bundle)) {
            return false;
        }
        this.f157724f = bundle.getString("param_card_meeting_id");
        this.f157725g = bundle.getBoolean("param_calendar_force", false);
        if (!TextUtils.isEmpty(this.f157724f)) {
            return true;
        }
        C60700b.m235864f("MeetingPreviewNormalJoinFragment", "[parseParams]", "Param error. [meetingId]" + this.f157724f);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62678d mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62678d(baseFragment, hVar, this.f157724f, this.f157725g);
    }
}
