package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.app.Activity;
import android.content.Intent;
import com.larksuite.framework.mvp.C26033a;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.e */
public class C61127e extends C26033a<C61116b.AbstractC61117a, C61116b.AbstractC61118b> {

    /* renamed from: a */
    public final C61130f.AbstractC61133a f153130a;

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m237738c();
    }

    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.e$a */
    public class C61129a implements C61116b.AbstractC61118b.AbstractC61119a {
        @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61118b.AbstractC61119a
        /* renamed from: a */
        public void mo211413a() {
            if (C61127e.this.f153130a != null) {
                C61127e.this.f153130a.mo211385a();
            }
        }

        public C61129a() {
        }

        @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61118b.AbstractC61119a
        /* renamed from: a */
        public void mo211414a(String str) {
            if (C61127e.this.f153130a != null) {
                C61127e.this.f153130a.mo211387a(str, ((C61116b.AbstractC61117a) C61127e.this.mo92554b()).mo211403e(), ((C61116b.AbstractC61117a) C61127e.this.mo92554b()).mo211400b());
            }
        }
    }

    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.e$1 */
    static /* synthetic */ class C611281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153131a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.AttendeeFromSource[] r0 = com.ss.android.vc.entity.AttendeeFromSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.lark.message.meeting.cardview.attendee.C61127e.C611281.f153131a = r0
                com.ss.android.vc.entity.AttendeeFromSource r1 = com.ss.android.vc.entity.AttendeeFromSource.VC_CARD_ATTENDEE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.lark.message.meeting.cardview.attendee.C61127e.C611281.f153131a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.AttendeeFromSource r1 = com.ss.android.vc.entity.AttendeeFromSource.VC_TAB_ATTENDEE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.lark.message.meeting.cardview.attendee.C61127e.C611281.f153131a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.AttendeeFromSource r1 = com.ss.android.vc.entity.AttendeeFromSource.VC_PREVIEW_ATTENDEE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.lark.message.meeting.cardview.attendee.C61127e.C611281.<clinit>():void");
        }
    }

    /* renamed from: c */
    private void m237738c() {
        if (mo92551a() != null && mo92554b() != null) {
            ((C61116b.AbstractC61118b) mo92551a()).mo211412a(((C61116b.AbstractC61117a) mo92554b()).mo211400b(), ((C61116b.AbstractC61117a) mo92554b()).mo211401c(), ((C61116b.AbstractC61117a) mo92554b()).mo211406h(), ((C61116b.AbstractC61117a) mo92554b()).mo211404f(), ((C61116b.AbstractC61117a) mo92554b()).mo211405g(), ((C61116b.AbstractC61117a) mo92554b()).mo211407i(), ((C61116b.AbstractC61117a) mo92554b()).mo211408j(), ((C61116b.AbstractC61117a) mo92554b()).mo211402d(), ((C61116b.AbstractC61117a) mo92554b()).mo211399a(), ((C61116b.AbstractC61117a) mo92554b()).mo211409k(), ((C61116b.AbstractC61117a) mo92554b()).mo211410l(), ((C61116b.AbstractC61117a) mo92554b()).mo211411m());
        }
    }

    public C61127e(Activity activity, Intent intent, AttendeeFromSource attendeeFromSource, C61130f.AbstractC61133a aVar) {
        C61130f fVar;
        this.f153130a = aVar;
        int i = C611281.f153131a[attendeeFromSource.ordinal()];
        if (i == 1) {
            fVar = new C61134g(activity, aVar);
        } else if (i == 2) {
            fVar = new C61143i(activity, aVar);
        } else if (i != 3) {
            fVar = new C61130f(activity, aVar);
        } else {
            fVar = new C61142h(activity, aVar);
        }
        mo92553a(fVar, new C61126d(intent));
        fVar.setViewDelegate(new C61129a());
    }
}
