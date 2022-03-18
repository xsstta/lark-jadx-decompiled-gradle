package com.ss.android.vc.meeting.basedialog;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.basedialog.f */
public class C61227f {

    /* renamed from: a */
    private final List<AbstractC61222a> f153353a;

    /* renamed from: com.ss.android.vc.meeting.basedialog.f$a */
    private static class C61229a {

        /* renamed from: a */
        public static final C61227f f153354a = new C61227f();
    }

    @XSingleton
    /* renamed from: c */
    public static C61227f m238148c() {
        return C61229a.f153354a;
    }

    private C61227f() {
        this.f153353a = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public void mo211723b() {
        C60700b.m235851b("MeetingDialogManager", "[release]", "" + this.f153353a.size());
        this.f153353a.clear();
    }

    /* renamed from: a */
    public void mo211721a() {
        C60700b.m235851b("MeetingDialogManager", "[dismissAll]", "" + this.f153353a.size());
        for (AbstractC61222a aVar : this.f153353a) {
            if (aVar != null && aVar.mo211613b()) {
                aVar.dismiss();
                this.f153353a.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo211722a(AbstractC61222a aVar) {
        if (!this.f153353a.contains(aVar)) {
            C60700b.m235851b("MeetingDialogManager", "[addDialogInterface]", "" + aVar);
            this.f153353a.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo211724b(AbstractC61222a aVar) {
        if (this.f153353a.contains(aVar)) {
            C60700b.m235851b("MeetingDialogManager", "[removeDialogInterface]", "" + aVar);
            this.f153353a.remove(aVar);
        }
    }
}
