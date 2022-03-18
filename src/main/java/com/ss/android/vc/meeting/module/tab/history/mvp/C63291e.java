package com.ss.android.vc.meeting.module.tab.history.mvp;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63278a;
import com.ss.android.vc.meeting.module.tab.history.mvp.VcTabListDataLoader;
import com.ss.android.vc.net.request.C63602e;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.e */
public class C63291e implements C63278a.AbstractC63281b.AbstractC63282a {

    /* renamed from: a */
    public C63278a.AbstractC63281b f159660a;

    /* renamed from: b */
    private C63278a.AbstractC63279a f159661b;

    /* renamed from: a */
    public List<VCTabListItem> mo219031a() {
        return this.f159661b.mo218997a();
    }

    /* renamed from: b */
    public boolean mo219034b() {
        return this.f159661b.mo219000b();
    }

    public C63291e(C63286c cVar) {
        this.f159661b = cVar.mo219021d();
        this.f159660a = cVar.mo219020c();
    }

    /* renamed from: a */
    public void mo219032a(VcTabListDataLoader.LoadType loadType) {
        this.f159660a.mo219007a(loadType);
    }

    /* renamed from: a */
    public void mo219033a(boolean z, boolean z2) {
        C60700b.m235851b("VideoChatTab_VCTabHistoryViewDelegate", "[refreshLoad]", "isNetworkAvailable= " + C60785x.m236238b());
        if (!C60785x.m236238b()) {
            this.f159660a.mo219010b();
            return;
        }
        this.f159661b.mo218999a(z, z2, new C63278a.AbstractC63279a.AbstractC63280a<VCTabListHistoryListEntity>() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.C63291e.C632921 */

            @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63279a.AbstractC63280a
            /* renamed from: a */
            public void mo219001a() {
                C60700b.m235851b("VideoChatTab_VCTabHistoryViewDelegate", "[refreshLoad3]", "onLoading");
                C63291e.this.f159660a.mo219004a();
            }

            /* renamed from: a */
            public void mo219003a(VCTabListHistoryListEntity vCTabListHistoryListEntity) {
                C60700b.m235851b("VideoChatTab_VCTabHistoryViewDelegate", "[refreshLoad2]", "onSuccess");
                C63291e.this.f159660a.mo219006a(vCTabListHistoryListEntity);
            }

            @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63279a.AbstractC63280a
            /* renamed from: a */
            public void mo219002a(C63602e eVar) {
                C60700b.m235851b("VideoChatTab_VCTabHistoryViewDelegate", "[refreshLoad4]", "onError");
                C63291e.this.f159660a.mo219010b();
            }
        });
        this.f159660a.mo219012d();
    }
}
