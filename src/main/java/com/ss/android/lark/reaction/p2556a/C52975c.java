package com.ss.android.lark.reaction.p2556a;

import android.content.Context;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.reaction.p2557b.p2558a.C52982a;
import com.ss.android.lark.reaction.p2557b.p2558a.C52984c;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.reaction.a.c */
public class C52975c {

    /* renamed from: a */
    private AbstractC52974b f130885a = new C52973a();

    /* renamed from: com.ss.android.lark.reaction.a.c$a */
    private static final class C52976a {

        /* renamed from: a */
        public static final C52975c f130886a = new C52975c();
    }

    /* renamed from: a */
    public static C52975c m205187a() {
        return C52976a.f130886a;
    }

    /* renamed from: b */
    public AbstractC52974b mo180989b() {
        return this.f130885a;
    }

    /* renamed from: a */
    public void mo180988a(Context context, AbstractC52974b bVar) {
        this.f130885a = bVar;
        ImageLoader.registerLoadModelHook(context, C52982a.class, InputStream.class, new C52984c.C52985a());
    }
}
