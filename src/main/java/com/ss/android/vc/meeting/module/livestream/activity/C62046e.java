package com.ss.android.vc.meeting.module.livestream.activity;

import com.larksuite.framework.mvp.C26033a;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.meeting.module.livestream.activity.C62026a;
import com.ss.android.vc.net.request.AbstractC63598b;

/* renamed from: com.ss.android.vc.meeting.module.livestream.activity.e */
public class C62046e extends C26033a<C62026a.AbstractC62027a, C62026a.AbstractC62029b> {

    /* renamed from: com.ss.android.vc.meeting.module.livestream.activity.e$b */
    public class C62048b implements C62026a.AbstractC62029b.AbstractC62030a {
        @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62029b.AbstractC62030a
        /* renamed from: a */
        public MsgWithUrlInfo mo214748a() {
            return ((C62026a.AbstractC62027a) C62046e.this.mo92554b()).mo214741a();
        }

        @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62029b.AbstractC62030a
        /* renamed from: b */
        public boolean mo214750b() {
            return ((C62026a.AbstractC62027a) C62046e.this.mo92554b()).mo214743b();
        }

        @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62029b.AbstractC62030a
        /* renamed from: c */
        public String mo214751c() {
            return ((C62026a.AbstractC62027a) C62046e.this.mo92554b()).mo214744c();
        }

        @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62029b.AbstractC62030a
        /* renamed from: d */
        public VideoChat mo214752d() {
            return ((C62026a.AbstractC62027a) C62046e.this.mo92554b()).mo214745d();
        }

        public C62048b() {
        }

        @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62029b.AbstractC62030a
        /* renamed from: a */
        public void mo214749a(String str, String str2, AbstractC63598b bVar) {
            ((C62026a.AbstractC62027a) C62046e.this.mo92554b()).mo214742a(str, str2, bVar);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.livestream.activity.e$a */
    public class C62047a implements C62026a.AbstractC62027a.AbstractC62028a {
        public C62047a() {
        }

        @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62027a.AbstractC62028a
        /* renamed from: a */
        public void mo214746a(MsgWithUrlInfo bVar) {
            if (C62046e.this.mo92551a() != null) {
                ((C62026a.AbstractC62029b) C62046e.this.mo92551a()).mo214747a(bVar);
            }
        }
    }

    public C62046e(C62031b bVar, C62034c cVar) {
        mo92553a(cVar, bVar);
        cVar.setViewDelegate(new C62048b());
        bVar.mo214753a(new C62047a());
    }
}
