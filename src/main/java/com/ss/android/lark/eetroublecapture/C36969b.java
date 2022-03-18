package com.ss.android.lark.eetroublecapture;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.eetroublebase.C36960a;
import com.ss.android.lark.eetroublebase.Log;
import com.ss.android.lark.eetroublebase.p1826a.C36964b;
import com.ss.android.lark.eetroublebase.p1826a.C36966c;
import com.ss.android.lark.eetroublecapture.contentprovider.C36976b;
import com.ss.android.lark.eetroublecapture.entity.DumpCaptureEvent;
import com.ss.android.lark.eetroublecapture.miui.MiuiScreenshotReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.lark.eetroublecapture.b */
public class C36969b implements C36960a.AbstractC36962b, AbstractC36992l {

    /* renamed from: e */
    private static C36969b f95048e;

    /* renamed from: a */
    public C36993m f95049a;

    /* renamed from: b */
    public C36986g f95050b;

    /* renamed from: c */
    public AbstractC36974c f95051c;

    /* renamed from: d */
    public List<AbstractC36985f> f95052d = new ArrayList();

    /* renamed from: f */
    private Context f95053f;

    /* renamed from: g */
    private AbstractC36972a f95054g;

    /* renamed from: h */
    private C36976b f95055h;

    /* renamed from: com.ss.android.lark.eetroublecapture.b$a */
    public interface AbstractC36972a {
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36992l
    /* renamed from: a */
    public void mo136471a() {
        m145955a(2);
    }

    /* renamed from: com.ss.android.lark.eetroublecapture.b$b */
    public static class C36973b implements AbstractC36972a {

        /* renamed from: a */
        private C36986g f95058a;

        public C36973b(C36986g gVar) {
            this.f95058a = gVar;
        }
    }

    /* renamed from: a */
    public static AbstractC36983e m145954a(View view) {
        if (view instanceof AbstractC36983e) {
            return (AbstractC36983e) view;
        }
        Object tag = view.getTag(R.id.tag_troublecapture_view);
        if (tag instanceof AbstractC36983e) {
            return (AbstractC36983e) tag;
        }
        return null;
    }

    /* renamed from: a */
    static void m145955a(int i) {
        C36969b bVar = f95048e;
        if (bVar == null || bVar.f95051c == null || bVar.f95055h == null) {
            Log.m145907b("TroubleCapture please init before getService");
        }
        if (f95048e.f95051c.mo136463a() != null) {
            DumpCaptureEvent dumpCaptureEvent = new DumpCaptureEvent();
            dumpCaptureEvent.type = i;
            dumpCaptureEvent.uuid = UUID.randomUUID().toString();
            f95048e.f95055h.mo136486a("key_dump_capture", C36964b.m145945a(dumpCaptureEvent));
        }
    }

    /* renamed from: b */
    public static List<Map<String, String>> m145958b(View view) {
        Map<String, String> c;
        ArrayList arrayList = new ArrayList();
        for (View view2 : C36966c.m145949a(view)) {
            AbstractC36983e a = m145954a(view2);
            if (!(a == null || (c = a.mo129679c()) == null || c.isEmpty())) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.eetroublebase.C36960a.AbstractC36962b
    /* renamed from: a */
    public void mo136438a(C36960a aVar) {
        if (!aVar.mo136424j()) {
            return;
        }
        if (aVar.mo136417c()) {
            this.f95049a.mo136507a(this);
            MiuiScreenshotReceiver.m146011a(this.f95053f, new MiuiScreenshotReceiver.AbstractC36996a() {
                /* class com.ss.android.lark.eetroublecapture.C36969b.C369712 */

                @Override // com.ss.android.lark.eetroublecapture.miui.MiuiScreenshotReceiver.AbstractC36996a
                /* renamed from: a */
                public void mo136473a() {
                    C36969b.this.f95049a.mo136506a(SystemClock.elapsedRealtime());
                    C36969b.m145955a(2);
                }
            });
            return;
        }
        this.f95049a.mo136508b(this);
        MiuiScreenshotReceiver.m146010a(this.f95053f);
    }

    C36969b(Application application, AbstractC36974c cVar) {
        this.f95053f = application;
        this.f95051c = cVar;
        C36986g gVar = new C36986g(cVar);
        this.f95050b = gVar;
        this.f95054g = new C36973b(gVar);
        C36976b bVar = new C36976b(application, "key_dump_capture");
        this.f95055h = bVar;
        bVar.mo136485a("key_dump_capture", new C36976b.AbstractC36979a() {
            /* class com.ss.android.lark.eetroublecapture.C36969b.C369701 */

            @Override // com.ss.android.lark.eetroublecapture.contentprovider.C36976b.AbstractC36979a
            /* renamed from: a */
            public void mo136472a(String str, String str2) {
                if (str2 != null) {
                    try {
                        DumpCaptureEvent dumpCaptureEvent = (DumpCaptureEvent) C36964b.m145944a(str2, DumpCaptureEvent.class);
                        if (!(dumpCaptureEvent == null || dumpCaptureEvent.uuid == null)) {
                            C36969b.this.f95050b.mo136499a(dumpCaptureEvent.uuid, dumpCaptureEvent.type);
                        }
                        for (AbstractC36985f fVar : C36969b.this.f95052d) {
                            fVar.mo136498a(C36969b.this.f95051c.mo136463a());
                        }
                    } catch (Exception e) {
                        Log.m145906a("type parse error", e);
                    }
                }
            }
        });
        this.f95049a = new C36993m(application, this.f95051c);
    }

    /* renamed from: a */
    public static void m145956a(Application application, C36960a aVar) {
        if (f95048e == null) {
            C36968a aVar2 = new C36968a(application);
            application.registerActivityLifecycleCallbacks(aVar2);
            m145957a(application, aVar, aVar2);
        }
        C36960a.m145916a(aVar);
    }

    /* renamed from: a */
    public static void m145957a(Application application, C36960a aVar, AbstractC36974c cVar) {
        if (f95048e == null) {
            C36969b bVar = new C36969b(application, cVar);
            f95048e = bVar;
            C36960a.m145915a(bVar);
        }
        C36960a.m145916a(aVar);
    }
}
