package com.lark.falcon.engine.inspect.p1062a.p1063a;

import android.net.Uri;
import com.lark.falcon.engine.inspect.p1062a.C23993b;
import com.lark.falcon.engine.inspect.p1062a.C24010d;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.lark.falcon.engine.inspect.a.a.h */
public class C23987h {

    /* renamed from: a */
    private final C23980b f59342a;

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.inspect.a.a.h$a */
    public static class C23989a {

        /* renamed from: a */
        private final BufferedInputStream f59343a;

        /* renamed from: b */
        private final StringBuilder f59344b = new StringBuilder();

        /* renamed from: c */
        private final C23990a f59345c = new C23990a();

        /* access modifiers changed from: private */
        /* renamed from: com.lark.falcon.engine.inspect.a.a.h$a$a */
        public static class C23990a {

            /* renamed from: a */
            private int f59346a;

            /* renamed from: a */
            public int mo86150a() {
                return this.f59346a;
            }

            private C23990a() {
                this.f59346a = 1;
            }

            /* renamed from: a */
            public void mo86151a(char c) {
                int i = this.f59346a;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalArgumentException("Unknown state: " + this.f59346a);
                        } else if (c == '\r') {
                            this.f59346a = 2;
                        } else {
                            this.f59346a = 1;
                        }
                    } else if (c == '\n') {
                        this.f59346a = 3;
                    } else {
                        this.f59346a = 1;
                    }
                } else if (c == '\r') {
                    this.f59346a = 2;
                }
            }
        }

        /* renamed from: a */
        public String mo86149a() throws IOException {
            while (true) {
                int read = this.f59343a.read();
                if (read < 0) {
                    return null;
                }
                char c = (char) read;
                this.f59345c.mo86151a(c);
                int a = this.f59345c.mo86150a();
                if (a == 1) {
                    this.f59344b.append(c);
                } else if (a == 3) {
                    String sb = this.f59344b.toString();
                    this.f59344b.setLength(0);
                    return sb;
                }
            }
        }

        public C23989a(BufferedInputStream bufferedInputStream) {
            this.f59343a = bufferedInputStream;
        }
    }

    /* renamed from: com.lark.falcon.engine.inspect.a.a.h$b */
    public static class C23991b {

        /* renamed from: b */
        private static final byte[] f59347b = "\r\n".getBytes();

        /* renamed from: a */
        private final BufferedOutputStream f59348a;

        /* renamed from: a */
        public void mo86152a() throws IOException {
            this.f59348a.write(f59347b);
        }

        /* renamed from: b */
        public void mo86154b() throws IOException {
            this.f59348a.flush();
        }

        public C23991b(BufferedOutputStream bufferedOutputStream) {
            this.f59348a = bufferedOutputStream;
        }

        /* renamed from: a */
        public void mo86153a(String str) throws IOException {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                this.f59348a.write(str.charAt(i));
            }
            this.f59348a.write(f59347b);
        }
    }

    public C23987h(C23980b bVar) {
        this.f59342a = bVar;
    }

    /* renamed from: a */
    public void mo86148a(C24010d dVar) throws IOException {
        C23993b bVar = new C23993b(dVar.mo86179a(), 1024);
        OutputStream b = dVar.mo86180b();
        C23989a aVar = new C23989a(bVar);
        C23991b bVar2 = new C23991b(new BufferedOutputStream(b));
        C24010d dVar2 = new C24010d(dVar, bVar);
        C23985f fVar = new C23985f();
        C23986g gVar = new C23986g();
        while (true) {
            C23985f a = m87700a(fVar, aVar);
            if (a != null) {
                gVar.mo86145a();
                if (m87704a(dVar2, a, gVar)) {
                    m87703a(gVar, bVar2, b);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static C23985f m87700a(C23985f fVar, C23989a aVar) throws IOException {
        fVar.mo86145a();
        String a = aVar.mo86149a();
        if (a == null) {
            return null;
        }
        String[] split = a.split(" ", 3);
        if (split.length == 3) {
            fVar.f59336c = split[0];
            fVar.f59337d = Uri.parse(split[1]);
            fVar.f59338e = split[2];
            m87701a((C23984e) fVar, aVar);
            return fVar;
        }
        throw new IOException("Invalid request line: " + a);
    }

    /* renamed from: a */
    private static void m87701a(C23984e eVar, C23989a aVar) throws IOException {
        while (true) {
            String a = aVar.mo86149a();
            if (a == null) {
                throw new EOFException();
            } else if (!"".equals(a)) {
                String[] split = a.split(": ", 2);
                if (split.length == 2) {
                    String str = split[0];
                    String str2 = split[1];
                    eVar.f59334a.add(str);
                    eVar.f59335b.add(str2);
                } else {
                    throw new IOException("Malformed header: " + a);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m87702a(C23986g gVar, C23991b bVar) throws IOException {
        bVar.mo86153a("HTTP/1.1 " + gVar.f59339c + " " + gVar.f59340d);
        int size = gVar.f59334a.size();
        for (int i = 0; i < size; i++) {
            bVar.mo86153a(((String) gVar.f59334a.get(i)) + ": " + ((String) gVar.f59335b.get(i)));
        }
        bVar.mo86152a();
        bVar.mo86154b();
    }

    /* renamed from: a */
    private static void m87703a(C23986g gVar, C23991b bVar, OutputStream outputStream) throws IOException {
        gVar.mo86147b();
        m87702a(gVar, bVar);
        if (gVar.f59341e != null) {
            gVar.f59341e.mo86142a(outputStream);
        }
    }

    /* renamed from: a */
    private boolean m87704a(C24010d dVar, C23985f fVar, C23986g gVar) throws IOException {
        PrintWriter printWriter;
        AbstractC23981c a = this.f59342a.mo86137a(fVar.f59337d.getPath());
        if (a == null) {
            gVar.f59339c = 404;
            gVar.f59340d = "Not found";
            gVar.f59341e = AbstractC23982d.m87686a("No handler found\n", "text/plain");
            return true;
        }
        try {
            return a.mo86140a(dVar, fVar, gVar);
        } catch (RuntimeException e) {
            gVar.f59339c = ParticipantRepo.f117150c;
            gVar.f59340d = "Internal Server Error";
            StringWriter stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.close();
            gVar.f59341e = AbstractC23982d.m87686a(stringWriter.toString(), "text/plain");
            return true;
        } catch (Throwable th) {
            printWriter.close();
            throw th;
        }
    }
}
