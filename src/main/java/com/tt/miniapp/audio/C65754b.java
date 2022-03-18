package com.tt.miniapp.audio;

import android.media.AudioRecord;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.audio.p3259a.C65752a;
import com.tt.miniapp.p3335u.C66998c;
import com.tt.miniapp.util.C67035h;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.abs.container.background.DefaultForeBackgroundListener;
import com.tt.refer.abs.container.background.IForeBackgroundService;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tt.miniapp.audio.b */
public class C65754b {

    /* renamed from: a */
    public boolean f165694a;

    /* renamed from: b */
    public String f165695b;

    /* renamed from: c */
    public boolean f165696c;

    /* renamed from: d */
    public AudioRecord f165697d;

    /* renamed from: e */
    public int f165698e;

    /* renamed from: f */
    public int f165699f;

    /* renamed from: g */
    public int f165700g;

    /* renamed from: h */
    public byte[] f165701h;

    /* renamed from: i */
    public AbstractC65760d f165702i;

    /* renamed from: j */
    public C65759c f165703j;

    /* renamed from: k */
    private C67035h f165704k = new C67035h();

    /* renamed from: l */
    private IAppContext f165705l;

    /* renamed from: m */
    private final C65759c f165706m = new C65759c(60, JosStatusCodes.RTN_CODE_COMMON_ERROR, 48000, 2, "aac", 0);

    /* renamed from: n */
    private final IForeBackgroundService f165707n;

    /* renamed from: o */
    private DefaultForeBackgroundListener f165708o = new DefaultForeBackgroundListener() {
        /* class com.tt.miniapp.audio.C65754b.C657551 */

        @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
        /* renamed from: a */
        public void mo87717a() {
            synchronized (C65754b.this) {
                C65754b.this.f165694a = false;
            }
        }

        @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
        /* renamed from: a */
        public void mo87718a(long j) {
            synchronized (C65754b.this) {
                C65754b.this.f165694a = true;
                if (C65754b.this.f165696c) {
                    C65754b.this.mo230392b();
                }
            }
        }
    };

    /* renamed from: com.tt.miniapp.audio.b$d */
    public interface AbstractC65760d {
        /* renamed from: a */
        void mo88645a(String str, String str2);

        /* renamed from: a */
        void mo88646a(byte[] bArr, boolean z);
    }

    /* renamed from: a */
    private int m257767a(int i) {
        return i == 1 ? 16 : 12;
    }

    /* renamed from: b */
    public synchronized void mo230392b() {
        if (this.f165696c) {
            this.f165696c = false;
            AbstractC65760d dVar = this.f165702i;
            if (dVar != null) {
                dVar.mo88645a("pause", (String) null);
            }
            this.f165704k.mo233142a();
            C66998c.m261128a(this.f165705l).mo233047b(13);
        } else if (this.f165694a) {
            AppBrandLogger.m52828d("tma_AudioRecorderManager", "PauseRecordWhenBackground");
        } else {
            mo230391a("not recording");
        }
    }

    /* renamed from: a */
    public synchronized void mo230388a() {
        if (this.f165694a) {
            mo230391a("app in background");
            return;
        }
        this.f165696c = true;
        new AsyncTaskC65758b().execute(new Void[0]);
        AbstractC65760d dVar = this.f165702i;
        if (dVar != null) {
            dVar.mo88645a("resume", (String) null);
        }
        this.f165704k.mo233145b();
        C66998c.m261128a(this.f165705l).mo233045a(13);
    }

    /* renamed from: c */
    public synchronized void mo230393c() {
        this.f165696c = false;
        AudioRecord audioRecord = this.f165697d;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
                this.f165697d.release();
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_AudioRecorderManager", "stop audio record", e);
            }
            this.f165697d = null;
        }
        IForeBackgroundService bVar = this.f165707n;
        if (bVar != null) {
            bVar.mo235072b(this.f165708o);
        }
        this.f165704k.mo233147c();
        if (this.f165703j != null) {
            if (C66998c.m261128a(this.f165705l).mo233048c(13)) {
                mo230391a("auth deny");
            } else {
                new AsyncTaskC65757a(this.f165703j, this.f165702i, this.f165695b, this.f165705l).execute(new Void[0]);
            }
        }
        this.f165703j = null;
        this.f165702i = null;
        C66998c.m261128a(this.f165705l).mo233047b(13);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.audio.b$b */
    public class AsyncTaskC65758b extends AsyncTask<Void, Void, Void> {
        AsyncTaskC65758b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7 A[Catch:{ all -> 0x0119 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6 A[Catch:{ IllegalStateException -> 0x00fe }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010a A[SYNTHETIC, Splitter:B:53:0x010a] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0120 A[Catch:{ IllegalStateException -> 0x0128 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0134 A[SYNTHETIC, Splitter:B:66:0x0134] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r14) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.audio.C65754b.AsyncTaskC65758b.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    public void mo230390a(AbstractC65760d dVar) {
        if (dVar != null) {
            this.f165702i = dVar;
        }
    }

    /* renamed from: b */
    private static AbstractC67709b m257771b(IAppContext iAppContext) {
        return (AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class);
    }

    /* renamed from: c */
    private static AbstractC67709b.AbstractC67710a m257775c(IAppContext iAppContext) {
        return (AbstractC67709b.AbstractC67710a) m257771b(iAppContext).mo235130i();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.audio.b$a */
    public static class AsyncTaskC65757a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private String f165711a;

        /* renamed from: b */
        private C65759c f165712b;

        /* renamed from: c */
        private AbstractC65760d f165713c;

        /* renamed from: d */
        private IAppContext f165714d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String a = C65754b.m257770a("wav", this.f165714d);
            C65752a.m257762a(this.f165711a, a, true, this.f165712b);
            AppBrandLogger.m52828d("tma_AudioRecorderManager", "doInBackground ", a, " ", this.f165713c);
            AbstractC65760d dVar = this.f165713c;
            if (dVar == null) {
                return null;
            }
            dVar.mo88645a("stop", a);
            return null;
        }

        public AsyncTaskC65757a(C65759c cVar, AbstractC65760d dVar, String str, IAppContext iAppContext) {
            this.f165711a = str;
            this.f165712b = cVar;
            this.f165713c = dVar;
            this.f165714d = iAppContext;
        }
    }

    /* renamed from: a */
    public static C65754b m257769a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234293n();
    }

    /* renamed from: c */
    private C65759c m257774c(C65759c cVar) {
        long j;
        int i;
        int i2;
        short s;
        String str;
        int i3;
        if (cVar == null) {
            return this.f165706m;
        }
        if (cVar.f165716a > 0) {
            j = cVar.f165716a;
        } else {
            j = this.f165706m.f165716a;
        }
        cVar.f165716a = j;
        if (cVar.f165717b > 0) {
            i = cVar.f165717b;
        } else {
            i = this.f165706m.f165717b;
        }
        cVar.f165717b = i;
        if (cVar.f165718c > 0) {
            i2 = cVar.f165718c;
        } else {
            i2 = this.f165706m.f165718c;
        }
        cVar.f165718c = i2;
        if (cVar.f165719d > 0) {
            s = cVar.f165719d;
        } else {
            s = this.f165706m.f165719d;
        }
        cVar.f165719d = s;
        if (!TextUtils.isEmpty(cVar.f165720e)) {
            str = cVar.f165720e;
        } else {
            str = this.f165706m.f165720e;
        }
        cVar.f165720e = str;
        if (cVar.f165721f > 0) {
            i3 = cVar.f165721f;
        } else {
            i3 = this.f165706m.f165721f;
        }
        cVar.f165721f = i3;
        return cVar;
    }

    /* renamed from: b */
    private void m257773b(C65759c cVar) {
        int minBufferSize = AudioRecord.getMinBufferSize(cVar.f165717b, m257767a(cVar.f165719d), 2);
        if (cVar.f165721f != 0) {
            int i = cVar.f165721f * 1024;
            int a = m257768a(i, minBufferSize);
            this.f165698e = a;
            this.f165700g = i / a;
            this.f165701h = new byte[i];
            AppBrandLogger.m52828d("tma_AudioRecorderManager", "frameSize_byte = ", Integer.valueOf(i));
            AppBrandLogger.m52828d("tma_AudioRecorderManager", "mBufferSize = ", Integer.valueOf(this.f165698e));
        } else {
            this.f165698e = minBufferSize;
        }
        this.f165697d = new AudioRecord(1, cVar.f165717b, m257767a(cVar.f165719d), 2, this.f165698e);
        this.f165695b = m257770a("pcm", this.f165705l);
    }

    /* renamed from: a */
    public synchronized void mo230389a(C65759c cVar) {
        if (this.f165694a) {
            mo230391a("app in background");
            return;
        }
        C65759c c = m257774c(cVar);
        c.f165720e = "wav";
        if (!TextUtils.equals(c.f165720e, "wav")) {
            mo230391a("format is error");
            return;
        }
        C65764a.m257802a().mo230429b(null, this.f165705l);
        this.f165703j = c;
        if (this.f165697d == null) {
            m257773b(c);
        }
        this.f165696c = true;
        new AsyncTaskC65758b().execute(new Void[0]);
        AbstractC65760d dVar = this.f165702i;
        if (dVar != null) {
            dVar.mo88645a("start", (String) null);
        }
        this.f165704k.mo233143a(cVar.f165716a);
        C66998c.m261128a(this.f165705l).mo233045a(13);
    }

    /* renamed from: a */
    public void mo230391a(String str) {
        AppBrandLogger.m52829e("tma_AudioRecorderManager", "onError:", str);
        AbstractC65760d dVar = this.f165702i;
        if (dVar != null) {
            dVar.mo88645a("error", str);
        }
    }

    /* renamed from: a */
    private int m257768a(int i, int i2) {
        int i3 = 1;
        while (i3 != 0) {
            i3 = i % i2;
            if (i3 == 0) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    public C65754b(AppbrandApplicationImpl appbrandApplicationImpl, IAppContext iAppContext) {
        this.f165705l = iAppContext;
        IForeBackgroundService bVar = (IForeBackgroundService) iAppContext.findServiceByInterface(AbstractC67720a.class);
        this.f165707n = bVar;
        if (bVar != null) {
            this.f165694a = bVar.mo235074d();
            bVar.mo235071a(this.f165708o);
        }
        this.f165704k.mo233144a(new C67035h.AbstractC67041a() {
            /* class com.tt.miniapp.audio.C65754b.C657562 */

            @Override // com.tt.miniapp.util.C67035h.AbstractC67041a
            /* renamed from: a */
            public void mo230394a() {
                C65754b.this.mo230393c();
            }
        });
    }

    /* renamed from: a */
    public static String m257770a(String str, IAppContext iAppContext) {
        if (TTFileHelper.m264259a("operateRecorder", iAppContext)) {
            return m257772b(str, iAppContext);
        }
        File file = new File(m257775c(iAppContext).mo235047d(), new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "." + str);
        AppBrandLogger.m52828d("tma_AudioRecorderManager", "destFile.getAbsolutePath() ", file.getAbsolutePath());
        return file.getAbsolutePath();
    }

    /* renamed from: b */
    private static String m257772b(String str, IAppContext iAppContext) {
        AppBrandLogger.m52830i("tma_AudioRecorderManager", "standardCreateTmpFile");
        File file = new File(((AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class)).mo235087d(), new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "." + str);
        AppBrandLogger.m52830i("tma_AudioRecorderManager", "destFile.getAbsolutePath() ", file.getAbsolutePath());
        return file.getAbsolutePath();
    }

    /* renamed from: com.tt.miniapp.audio.b$c */
    public static class C65759c {

        /* renamed from: a */
        public long f165716a;

        /* renamed from: b */
        public int f165717b;

        /* renamed from: c */
        public int f165718c;

        /* renamed from: d */
        public short f165719d;

        /* renamed from: e */
        public String f165720e;

        /* renamed from: f */
        public int f165721f;

        public C65759c(long j, int i, int i2, short s, String str, int i3) {
            this.f165716a = j;
            this.f165717b = i;
            this.f165718c = i2;
            this.f165719d = s;
            this.f165720e = str;
            this.f165721f = i3;
        }
    }
}
