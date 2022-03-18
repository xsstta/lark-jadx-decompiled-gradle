package com.ss.android.vc.p3069b.p3071b;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.bytertc.VcLogListener;
import com.ss.android.vc.p3069b.AbstractC60659a;
import com.ss.android.vc.p3069b.C60674c;
import com.ss.android.vc.service.impl.C63682b;

/* renamed from: com.ss.android.vc.b.b.b */
public class C60673b implements AbstractC60659a {

    /* renamed from: a */
    private C60672a f151772a = new C60672a();

    /* renamed from: b */
    private int f151773b;

    @Override // com.ss.android.vc.p3069b.AbstractC60659a
    /* renamed from: b */
    public C60674c mo208204b() {
        return this.f151772a.mo208227a(this.f151773b);
    }

    @Override // com.ss.android.vc.p3069b.AbstractC60659a
    /* renamed from: a */
    public C60674c mo208203a() {
        C60672a aVar = new C60672a(C60700b.C60702a.m235866a(), VcLogListener.LoggerStatistics.f153392a.mo211774b(), C63682b.C63684a.m249649a());
        this.f151772a.mo208229a(aVar);
        this.f151773b++;
        return aVar;
    }
}
