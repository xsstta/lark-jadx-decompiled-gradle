package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.EncodingException;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.j */
public final class C22900j {

    /* renamed from: a */
    private final String f56607a;

    /* renamed from: b */
    private final Intent f56608b;

    /* renamed from: com.google.firebase.messaging.j$a */
    static class C22901a implements AbstractC22788c<C22900j> {
        C22901a() {
        }

        /* renamed from: a */
        public void mo72519a(C22900j jVar, AbstractC22789d dVar) throws EncodingException, IOException {
            Intent a = jVar.mo79494a();
            dVar.mo79208a("ttl", C22906m.m83199f(a));
            dVar.mo79210a("event", jVar.mo79495b());
            dVar.mo79210a("instanceId", C22906m.m83194c());
            dVar.mo79208a("priority", C22906m.m83211r(a));
            dVar.mo79210a("packageName", C22906m.m83192b());
            dVar.mo79210a("sdkPlatform", "ANDROID");
            dVar.mo79210a("messageType", C22906m.m83208o(a));
            String m = C22906m.m83206m(a);
            if (m != null) {
                dVar.mo79210a("messageId", m);
            }
            String p = C22906m.m83209p(a);
            if (p != null) {
                dVar.mo79210a(ChatTypeStateKeeper.f135670e, p);
            }
            String g = C22906m.m83200g(a);
            if (g != null) {
                dVar.mo79210a("collapseKey", g);
            }
            if (C22906m.m83203j(a) != null) {
                dVar.mo79210a("analyticsLabel", C22906m.m83203j(a));
            }
            if (C22906m.m83202i(a) != null) {
                dVar.mo79210a("composerLabel", C22906m.m83202i(a));
            }
            String d = C22906m.m83196d();
            if (d != null) {
                dVar.mo79210a("projectNumber", d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.j$b */
    public static final class C22902b {

        /* renamed from: a */
        private final C22900j f56609a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C22900j mo79497a() {
            return this.f56609a;
        }

        C22902b(C22900j jVar) {
            this.f56609a = (C22900j) Preconditions.checkNotNull(jVar);
        }
    }

    /* renamed from: com.google.firebase.messaging.j$c */
    static final class C22903c implements AbstractC22788c<C22902b> {
        C22903c() {
        }

        /* renamed from: a */
        public final void mo72519a(C22902b bVar, AbstractC22789d dVar) throws EncodingException, IOException {
            dVar.mo79210a("messaging_client_event", bVar.mo79497a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo79494a() {
        return this.f56608b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo79495b() {
        return this.f56607a;
    }

    C22900j(String str, Intent intent) {
        this.f56607a = Preconditions.checkNotEmpty(str, "evenType must be non-null");
        this.f56608b = (Intent) Preconditions.checkNotNull(intent, "intent must be non-null");
    }
}
