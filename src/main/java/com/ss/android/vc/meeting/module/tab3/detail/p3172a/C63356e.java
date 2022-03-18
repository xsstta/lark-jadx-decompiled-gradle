package com.ss.android.vc.meeting.module.tab3.detail.p3172a;

import android.content.Context;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VcTabDetailBasicInfo;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;
import com.ss.android.vc.net.request.C63602e;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.e */
public class C63356e implements C63328a.AbstractC63332b.AbstractC63333a {

    /* renamed from: a */
    protected C63328a.AbstractC63329a f159943a;

    /* renamed from: b */
    protected C63328a.AbstractC63332b f159944b;

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: b */
    public MeetingStatus mo219200b() {
        return this.f159944b.mo219193c();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: c */
    public String mo219201c() {
        return this.f159943a.mo219167a();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: d */
    public String mo219202d() {
        return this.f159943a.mo219171b();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: e */
    public VCTabListItem.PhoneType mo219203e() {
        return this.f159943a.mo219172c();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: f */
    public String mo219204f() {
        return this.f159943a.mo219173d();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: a */
    public void mo219197a() {
        this.f159944b.mo219179a();
        this.f159943a.mo219168a(new C63328a.AbstractC63329a.AbstractC63330a<VcTabDetailInfo>() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63356e.C633571 */

            @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a.AbstractC63330a
            /* renamed from: a */
            public void mo219174a() {
                C63356e.this.f159944b.mo219190b();
            }

            @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a.AbstractC63330a
            /* renamed from: a */
            public void mo219175a(C63602e eVar) {
                C63356e.this.f159944b.mo219187a(eVar);
            }

            /* renamed from: a */
            public void mo219176a(VcTabDetailInfo vcTabDetailInfo, VcTabDetailBasicInfo fVar) {
                C63356e.this.f159944b.mo219183a(vcTabDetailInfo, fVar);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: g */
    public void mo219205g() {
        this.f159943a.mo219169a(new C63328a.AbstractC63329a.AbstractC63331b<Object>() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63356e.C633582 */

            @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a.AbstractC63331b
            /* renamed from: a */
            public void mo219177a(C63602e eVar) {
                C63356e.this.f159944b.mo219194c(eVar);
            }

            @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a.AbstractC63331b
            /* renamed from: a */
            public void mo219178a(Object obj) {
                C63356e.this.f159944b.mo219196d();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: a */
    public void mo219199a(String str) {
        this.f159944b.mo219188a(str);
    }

    public C63356e(C63355d dVar) {
        this.f159943a = dVar.mo219258d();
        this.f159944b = dVar.mo219257c();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b.AbstractC63333a
    /* renamed from: a */
    public void mo219198a(Context context, String str) {
        List<String> appLinkDomain = VideoChatModuleDependency.getDynamicDomainDependency().getAppLinkDomain();
        String str2 = appLinkDomain.get(0) + str;
        C60700b.m235851b("VcTabDetailViewDelegate", "[onJumpToPage]", "appLink=" + str2);
        VideoChatModuleDependency.getBrowserDependency().openUrlBrowser(context, str2);
    }
}
