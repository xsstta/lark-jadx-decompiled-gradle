package com.ss.android.vc.meeting.module.follow.universal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowPatch;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.meeting.module.follow.base.AbstractC61785c;
import com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime;
import com.ss.android.vc.meeting.module.follow.universal.AbstractC61857a;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.universal.b */
public class C61859b extends BaseFollowRuntime implements AbstractC61857a.AbstractC61858a {

    /* renamed from: d */
    private C61860c f155299d;

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: b */
    public void mo214004b(List<FollowState> list) {
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: c */
    public void mo214006c(List<FollowPatch> list) {
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: x */
    public void mo214010x() {
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: w */
    public Fragment mo214009w() {
        return this.f155299d;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b, com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime
    /* renamed from: a */
    public void mo214001a() {
        super.mo214001a();
        C60700b.m235851b("FollowLog_UniversalFollowRuntime", "[destroy]", "destroy");
        this.f155299d = null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: u */
    public void mo214007u() {
        mo214225y();
        if (this.f155299d != null) {
            C60700b.m235851b("FollowLog_UniversalFollowRuntime", "[startReplay]", "startReply");
            this.f155299d.mo214228b();
            mo214040s().f155056e.set(true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: v */
    public void mo214008v() {
        if (this.f155299d != null && mo214040s().f155056e.get()) {
            C60700b.m235851b("FollowLog_UniversalFollowRuntime", "[stopReplay]", "stopReplay");
            this.f155299d.mo214229c();
            mo214040s().f155056e.set(false);
        }
    }

    /* renamed from: y */
    public void mo214225y() {
        if (this.f155299d != null && mo214040s().f155055d.get()) {
            C60700b.m235851b("FollowLog_UniversalFollowRuntime", "[stopRecord]", "stopRecord");
            this.f155299d.mo214226a();
            mo214040s().f155055d.set(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.AbstractC61857a.AbstractC61858a
    /* renamed from: a */
    public void mo214224a(boolean z) {
        if (mo214039r() != null) {
            mo214039r().mo213865a(z, System.currentTimeMillis() - this.f155036a);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.AbstractC61857a.AbstractC61858a
    /* renamed from: a */
    public void mo214223a(String str, String str2) {
        if (mo214039r() != null) {
            mo214039r().mo213870b(str, str2);
        }
    }

    public C61859b(Context context, FollowInfo followInfo, String str, AbstractC61785c cVar) {
        super(context, followInfo, str, cVar, false);
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime
    /* renamed from: a */
    public void mo214002a(Context context, FollowInfo followInfo, String str, boolean z) {
        super.mo214002a(context, followInfo, str, z);
        C61860c a = C61860c.m241651a(followInfo.getUrl());
        this.f155299d = a;
        a.mo214227a(this);
    }
}
