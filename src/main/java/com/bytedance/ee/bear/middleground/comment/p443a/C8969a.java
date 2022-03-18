package com.bytedance.ee.bear.middleground.comment.p443a;

import android.app.Activity;
import com.bytedance.ee.bear.contract.route.parcelable.DriveRouteBean;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.comment.a.a */
public class C8969a implements AbstractC10460a.AbstractC10461a {

    /* renamed from: a */
    private final String f24170a = "LinkClickCell";

    /* renamed from: b */
    private boolean f24171b = true;

    /* renamed from: c */
    private long f24172c;

    /* renamed from: d */
    private C8275a f24173d;

    /* renamed from: e */
    private Activity f24174e;

    /* renamed from: f */
    private AbstractC8970a f24175f;

    /* renamed from: g */
    private boolean f24176g;

    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.a$a */
    public interface AbstractC8970a {
        /* renamed from: a */
        boolean mo34412a(String str);

        /* renamed from: b */
        void mo34413b(String str);

        /* renamed from: c */
        void mo34414c(String str);
    }

    /* renamed from: a */
    public void mo34409a(long j) {
        this.f24172c = j;
    }

    /* renamed from: a */
    public void mo34410a(C8275a aVar) {
        this.f24173d = aVar;
    }

    /* renamed from: a */
    public void mo34411a(AbstractC8970a aVar) {
        this.f24175f = aVar;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10460a.AbstractC10461a
    /* renamed from: a */
    public void mo18121a(AbstractC10460a aVar) {
        if (this.f24171b && this.f24174e != null && aVar != null) {
            boolean z = false;
            String str = "";
            if (aVar instanceof C10463c) {
                C10463c cVar = (C10463c) aVar;
                str = cVar.mo39749g();
                int j = cVar.mo39751j();
                AbstractC8970a aVar2 = this.f24175f;
                if (aVar2 != null && aVar2.mo34412a(str)) {
                    return;
                }
                if (j == 12) {
                    ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(cVar.mo39749g(), new DriveRouteBean());
                } else {
                    C9185d.m37997a().mo34728a(cVar.mo39749g());
                }
            } else if (aVar instanceof C10468i) {
                AbstractC8970a aVar3 = this.f24175f;
                if (aVar3 != null && !this.f24176g) {
                    aVar3.mo34414c(((C10468i) aVar).mo39767g());
                }
                if (C9185d.m37997a().mo34732e() == 2 || this.f24176g) {
                    z = true;
                }
            } else if (aVar instanceof HyperLinkSpan) {
                str = ((HyperLinkSpan) aVar).mo39763g();
                AbstractC8970a aVar4 = this.f24175f;
                if (aVar4 == null || !aVar4.mo34412a(str)) {
                    C9185d.m37997a().mo34728a(str);
                } else {
                    return;
                }
            }
            AbstractC8970a aVar5 = this.f24175f;
            if (aVar5 != null && !z) {
                aVar5.mo34413b(str);
            }
        }
    }

    public C8969a(Activity activity, boolean z) {
        this.f24174e = activity;
        this.f24176g = z;
    }
}
