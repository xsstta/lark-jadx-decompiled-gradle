package com.ss.android.lark.mm.module.player.core;

import com.ss.android.lark.mm.module.player.core.C46609l;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3195b.C64116b;

/* renamed from: com.ss.android.lark.mm.module.player.core.r */
public class C46692r extends C46691q {

    /* renamed from: c */
    private C46609l f117454c;

    /* renamed from: d */
    private C46609l.AbstractC46612a f117455d;

    @Override // com.ss.android.lark.mm.module.player.core.C46691q
    /* renamed from: a */
    public void mo163959a() {
        C46609l lVar = this.f117454c;
        if (lVar != null) {
            lVar.mo163770b();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.C46691q
    /* renamed from: b */
    private void m184742b() {
        this.f117455d = new C46609l.AbstractC46612a() {
            /* class com.ss.android.lark.mm.module.player.core.C46692r.C466931 */

            @Override // com.ss.android.lark.mm.module.player.core.C46609l.AbstractC46612a
            /* renamed from: a */
            public void mo163775a(boolean z) {
                C45855f.m181663b("PodcastPlayerListenerAdapter", "onAudioFocusLoss " + z);
                if (z) {
                    C46692r.this.f117450b.mo163686b().mo163700a();
                }
            }

            @Override // com.ss.android.lark.mm.module.player.core.C46609l.AbstractC46612a
            /* renamed from: b */
            public void mo163776b(boolean z) {
                C45855f.m181663b("PodcastPlayerListenerAdapter", "onAudioFocusGain " + z);
                if (z && C46692r.this.f117450b.mo163685a().mo163714c()) {
                    C46692r.this.f117450b.mo163686b().mo163706b();
                }
            }
        };
        this.f117454c = new C46609l(C45851c.m181646a(), this.f117455d);
    }

    public C46692r(AbstractC46595b bVar) {
        super(bVar);
        m184742b();
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.lark.mm.module.player.core.C46691q, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo163971c(AbstractC64108o oVar, C64116b bVar) {
        super.mo163971c(oVar, bVar);
        this.f117454c.mo163767a();
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.lark.mm.module.player.core.C46691q, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo163973e(AbstractC64108o oVar, C64116b bVar) {
        super.mo163973e(oVar, bVar);
        this.f117454c.mo163769a(true);
    }
}
