package com.google.firebase.encoders.p997a;

import com.google.firebase.encoders.AbstractC22780a;
import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22790e;
import com.google.firebase.encoders.AbstractC22791f;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.firebase.encoders.a.a */
public final class C22781a {

    /* renamed from: c */
    private static final AbstractC22790e<String> f56328c = C22784b.m82780a();

    /* renamed from: d */
    private static final AbstractC22790e<Boolean> f56329d = C22785c.m82782a();

    /* renamed from: e */
    private static final C22783a f56330e = new C22783a();

    /* renamed from: a */
    public final Map<Class<?>, AbstractC22788c<?>> f56331a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, AbstractC22790e<?>> f56332b = new HashMap();

    /* renamed from: com.google.firebase.encoders.a.a$a */
    private static final class C22783a implements AbstractC22790e<Date> {

        /* renamed from: a */
        private static final DateFormat f56334a;

        private C22783a() {
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f56334a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        /* renamed from: a */
        public void mo72519a(Date date, AbstractC22791f fVar) throws EncodingException, IOException {
            fVar.mo79211a(f56334a.format(date));
        }
    }

    /* renamed from: a */
    public AbstractC22780a mo79202a() {
        return new AbstractC22780a() {
            /* class com.google.firebase.encoders.p997a.C22781a.C227821 */

            @Override // com.google.firebase.encoders.AbstractC22780a
            /* renamed from: a */
            public String mo79198a(Object obj) throws EncodingException {
                StringWriter stringWriter = new StringWriter();
                try {
                    mo79199a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }

            @Override // com.google.firebase.encoders.AbstractC22780a
            /* renamed from: a */
            public void mo79199a(Object obj, Writer writer) throws IOException, EncodingException {
                C22786d dVar = new C22786d(writer, C22781a.this.f56331a, C22781a.this.f56332b);
                dVar.mo79206a(obj);
                dVar.mo79213a();
            }
        };
    }

    public C22781a() {
        mo79201a(String.class, f56328c);
        mo79201a(Boolean.class, f56329d);
        mo79201a(Date.class, f56330e);
    }

    /* renamed from: a */
    public <T> C22781a mo79200a(Class<T> cls, AbstractC22788c<? super T> cVar) {
        if (!this.f56331a.containsKey(cls)) {
            this.f56331a.put(cls, cVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    /* renamed from: a */
    public <T> C22781a mo79201a(Class<T> cls, AbstractC22790e<? super T> eVar) {
        if (!this.f56332b.containsKey(cls)) {
            this.f56332b.put(cls, eVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
