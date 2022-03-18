package com.ss.android.vc.meeting.module.follow.share;

import android.text.TextUtils;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.QuerySource;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.response.az;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.follow.share.C61821c;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.g */
public class C61848g extends BaseModel implements C61821c.AbstractC61822a {

    /* renamed from: a */
    protected int f155280a;

    /* renamed from: b */
    public boolean f155281b = true;

    /* renamed from: c */
    public String f155282c = "";

    /* renamed from: d */
    public List<VcDoc> f155283d = new ArrayList();

    /* renamed from: e */
    public C61303k f155284e;

    /* renamed from: f */
    public ShareContentViewHolder.SharePanelSource f155285f;

    /* renamed from: g */
    public ILocalSharePrepareContract.IView f155286g;

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a
    /* renamed from: a */
    public String mo214139a() {
        return this.f155282c;
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a
    /* renamed from: e */
    public boolean mo214144e() {
        return this.f155281b;
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a
    /* renamed from: b */
    public void mo214141b() {
        this.f155280a = 0;
        this.f155283d.clear();
        this.f155281b = true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a
    /* renamed from: c */
    public List<VcDoc> mo214142c() {
        if (this.f155285f == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            return this.f155284e.aa().mo216296x();
        }
        if (this.f155285f == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
            return this.f155286g.mo217789a();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a
    /* renamed from: d */
    public int mo214143d() {
        if (this.f155285f == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            return this.f155284e.aa().mo216297y();
        }
        if (this.f155285f == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
            return this.f155286g.mo217798b().intValue();
        }
        return 0;
    }

    public C61848g(C61303k kVar, ShareContentViewHolder.SharePanelSource sharePanelSource, ILocalSharePrepareContract.IView bVar) {
        this.f155284e = kVar;
        this.f155285f = sharePanelSource;
        this.f155286g = bVar;
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a
    /* renamed from: a */
    public void mo214140a(final String str, final boolean z, final C61821c.AbstractC61822a.AbstractC61823a<List<VcDoc>> aVar) {
        int d;
        if (this.f155280a == 0 && z && (d = mo214143d()) > 0) {
            this.f155280a += d;
        }
        VcBizService.searchVcDoc(str, null, this.f155280a, 20, TextUtils.isEmpty(str), QuerySource.SEARCH_LIST_PAGE, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.follow.share.C61848g.C618491 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("FollowLog_ShareDocModel", "[search2]", "search default doc " + C61848g.this.f155280a + " - " + (C61848g.this.f155280a + 20) + " fail");
                aVar.mo214145a(eVar.f160599b);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("FollowLog_ShareDocModel", "[search]", "search default doc " + C61848g.this.f155280a + " - " + (C61848g.this.f155280a + 20) + " success");
                az azVar = (az) obj;
                List<VcDoc> list = azVar.f152666a;
                if (!TextUtils.equals(str, C61848g.this.f155282c)) {
                    C61848g.this.mo214141b();
                }
                C61848g.this.f155282c = str;
                C61848g.this.f155283d.addAll(list);
                if (C61848g.this.f155280a == 0 && C61848g.this.f155283d.size() == 0) {
                    aVar.mo214147a(str);
                } else {
                    if (str.equals("")) {
                        aVar.mo214146a(C61848g.this.f155283d);
                    } else {
                        aVar.mo214148b(C61848g.this.f155283d);
                    }
                    C61848g.this.f155280a = azVar.f152669d;
                    C61848g.this.f155281b = azVar.f152667b;
                }
                if (!z) {
                    List<VcDoc> a = C61806b.m241470a(list);
                    if (C61848g.this.f155285f == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
                        C61848g.this.f155284e.aa().mo216270a(a);
                    } else if (C61848g.this.f155285f == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
                        C61848g.this.f155286g.mo217796a(a);
                    }
                }
            }
        });
    }
}
