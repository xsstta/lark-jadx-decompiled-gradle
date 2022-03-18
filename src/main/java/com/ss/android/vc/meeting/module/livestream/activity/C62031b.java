package com.ss.android.vc.meeting.module.livestream.activity;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.livestream.C62081k;
import com.ss.android.vc.meeting.module.livestream.activity.C62026a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;

/* renamed from: com.ss.android.vc.meeting.module.livestream.activity.b */
public class C62031b implements C62026a.AbstractC62027a {

    /* renamed from: a */
    public C62026a.AbstractC62027a.AbstractC62028a f155844a;

    /* renamed from: b */
    public MsgWithUrlInfo f155845b;

    /* renamed from: c */
    public MsgWithUrlInfo f155846c;

    /* renamed from: d */
    private boolean f155847d;

    /* renamed from: e */
    private String f155848e;

    /* renamed from: f */
    private VideoChat f155849f;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62027a
    /* renamed from: a */
    public MsgWithUrlInfo mo214741a() {
        return this.f155846c;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62027a
    /* renamed from: b */
    public boolean mo214743b() {
        return this.f155847d;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62027a
    /* renamed from: c */
    public String mo214744c() {
        return this.f155848e;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62027a
    /* renamed from: d */
    public VideoChat mo214745d() {
        return this.f155849f;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C62081k.m242570a(new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62031b.C620321 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                if (obj instanceof MsgWithUrlInfo) {
                    C62031b.this.f155845b = (MsgWithUrlInfo) obj;
                    C62031b.this.f155844a.mo214746a(C62031b.this.f155845b);
                }
            }
        });
        C62081k.m242572b(new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62031b.C620332 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                if (obj instanceof MsgWithUrlInfo) {
                    C62031b.this.f155846c = (MsgWithUrlInfo) obj;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo214753a(C62026a.AbstractC62027a.AbstractC62028a aVar) {
        this.f155844a = aVar;
    }

    public C62031b(String str, boolean z) {
        this.f155847d = z;
        this.f155848e = str;
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(this.f155848e);
        if (kVar != null) {
            this.f155849f = kVar.mo212056e();
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62027a
    /* renamed from: a */
    public void mo214742a(String str, String str2, AbstractC63598b bVar) {
        VcBizSender.m249179a(str, str2, 1, 2841, "feishu_livestream").mo219889a(bVar);
    }
}
