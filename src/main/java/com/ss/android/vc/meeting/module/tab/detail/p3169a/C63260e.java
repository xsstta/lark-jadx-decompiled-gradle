package com.ss.android.vc.meeting.module.tab.detail.p3169a;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;
import com.ss.android.vc.net.request.C63602e;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.e */
public class C63260e implements C63230a.AbstractC63234b.AbstractC63235a {

    /* renamed from: a */
    protected C63230a.AbstractC63231a f159567a;

    /* renamed from: b */
    protected C63230a.AbstractC63234b f159568b;

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: b */
    public RecyclerView mo218887b() {
        return this.f159568b.mo218880f();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: c */
    public RecyclerView mo218888c() {
        return this.f159568b.mo218881g();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: d */
    public MeetingStatus mo218889d() {
        return this.f159568b.mo218875c();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: e */
    public String mo218890e() {
        return this.f159568b.mo218878d();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: f */
    public String mo218891f() {
        return this.f159568b.mo218879e();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: g */
    public ByteviewUser mo218892g() {
        return this.f159568b.mo218882h();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: h */
    public boolean mo218893h() {
        return this.f159568b.mo218883i();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: i */
    public String mo218894i() {
        return this.f159567a.mo218853a();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: a */
    public void mo218885a() {
        this.f159568b.mo218862a();
        this.f159567a.mo218854a(new C63230a.AbstractC63231a.AbstractC63232a<VcTabDetailInfo>() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63260e.C632611 */

            @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a.AbstractC63232a
            /* renamed from: a */
            public void mo218857a() {
                C63260e.this.f159568b.mo218872b();
            }

            /* renamed from: a */
            public void mo218859a(VcTabDetailInfo vcTabDetailInfo) {
                C63260e.this.f159568b.mo218866a(vcTabDetailInfo);
            }

            @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a.AbstractC63232a
            /* renamed from: a */
            public void mo218858a(C63602e eVar) {
                C63260e.this.f159568b.mo218870a(eVar);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: j */
    public void mo218895j() {
        this.f159567a.mo218855a(new C63230a.AbstractC63231a.AbstractC63233b<Object>() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63260e.C632622 */

            @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a.AbstractC63233b
            /* renamed from: a */
            public void mo218860a(C63602e eVar) {
                C63260e.this.f159568b.mo218876c(eVar);
            }

            @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a.AbstractC63233b
            /* renamed from: a */
            public void mo218861a(Object obj) {
                C63260e.this.f159568b.mo218884j();
            }
        });
    }

    public C63260e(C63241c cVar) {
        this.f159567a = cVar.mo218905d();
        this.f159568b = cVar.mo218904c();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b.AbstractC63235a
    /* renamed from: a */
    public void mo218886a(Context context, String str) {
        List<String> appLinkDomain = VideoChatModuleDependency.getDynamicDomainDependency().getAppLinkDomain();
        String str2 = appLinkDomain.get(0) + str;
        C60700b.m235851b("VcTabDetailViewDelegate", "[onJumpToPage]", "appLink=" + str2);
        VideoChatModuleDependency.getBrowserDependency().openUrlBrowser(context, str2);
    }
}
