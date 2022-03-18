package com.tt.miniapp.audio;

import android.content.Context;
import android.media.AudioManager;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.audio.C65784d;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.C67522b;

/* renamed from: com.tt.miniapp.audio.a */
public abstract class AbstractC65746a {

    /* renamed from: a */
    protected SparseArray<C65783c> f165652a = new SparseArray<>();

    /* renamed from: com.tt.miniapp.audio.a$b */
    public static class C65748b {

        /* renamed from: a */
        public volatile int f165663a;

        /* renamed from: b */
        public String f165664b;

        /* renamed from: c */
        public boolean f165665c;

        /* renamed from: d */
        public boolean f165666d;

        /* renamed from: e */
        public boolean f165667e;

        /* renamed from: f */
        public boolean f165668f;

        /* renamed from: g */
        public int f165669g;

        /* renamed from: h */
        public float f165670h;

        /* renamed from: i */
        public AudioManager.OnAudioFocusChangeListener f165671i;

        /* renamed from: j */
        public int f165672j;

        /* renamed from: k */
        public boolean f165673k;

        /* renamed from: l */
        public boolean f165674l;

        /* renamed from: m */
        public boolean f165675m;
    }

    /* renamed from: com.tt.miniapp.audio.a$c */
    public interface AbstractC65749c {
        /* renamed from: a */
        void mo230386a(int i, String str);
    }

    /* renamed from: com.tt.miniapp.audio.a$d */
    public static class C65750d {

        /* renamed from: a */
        public boolean f165676a;

        /* renamed from: b */
        public AbstractC65749c f165677b;

        /* renamed from: c */
        public boolean f165678c;

        /* renamed from: d */
        public boolean f165679d;

        /* renamed from: e */
        public final SparseArray<C65784d.C65789b> f165680e = new SparseArray<>();
    }

    /* renamed from: com.tt.miniapp.audio.a$e */
    public interface AbstractC65751e {
        /* renamed from: a */
        void mo88627a();

        /* renamed from: a */
        void mo88628a(String str, Throwable th);
    }

    /* renamed from: a */
    public abstract C65747a mo230375a(int i, C67522b bVar);

    /* renamed from: a */
    public abstract void mo230376a(int i, int i2, AbstractC65751e eVar);

    /* renamed from: a */
    public abstract void mo230377a(int i, AbstractC65751e eVar);

    /* renamed from: a */
    public abstract void mo230378a(C65783c cVar, AbstractC65751e eVar);

    /* renamed from: b */
    public abstract void mo230379b();

    /* renamed from: b */
    public abstract void mo230380b(int i, AbstractC65751e eVar);

    /* renamed from: b */
    public abstract boolean mo230381b(int i, C67522b bVar);

    /* renamed from: c */
    public abstract void mo230382c();

    /* renamed from: c */
    public abstract void mo230383c(int i, AbstractC65751e eVar);

    /* renamed from: d */
    public abstract void mo230384d();

    /* renamed from: a */
    public static C65750d m257746a() {
        return ContextSingletonInstance.getInstance().audioDataInstance;
    }

    /* renamed from: com.tt.miniapp.audio.a$a */
    public static class C65747a {

        /* renamed from: a */
        public String f165653a;

        /* renamed from: b */
        public long f165654b;

        /* renamed from: c */
        public boolean f165655c;

        /* renamed from: d */
        public long f165656d;

        /* renamed from: e */
        public long f165657e;

        /* renamed from: f */
        public boolean f165658f;

        /* renamed from: g */
        public int f165659g;

        /* renamed from: h */
        public boolean f165660h;

        /* renamed from: i */
        public boolean f165661i;

        /* renamed from: j */
        public float f165662j;

        public String toString() {
            return "AudioState{src='" + this.f165653a + '\'' + ", startTime=" + this.f165654b + ", paused=" + this.f165655c + ", currentTime=" + this.f165656d + ", duration=" + this.f165657e + ", obeyMuteSwitch=" + this.f165658f + ", buffered=" + this.f165659g + ", autoplay=" + this.f165660h + ", loop=" + this.f165661i + ", volume=" + this.f165662j + '}';
        }
    }

    /* renamed from: a */
    public static synchronized AbstractC65746a m257747a(IAppContext iAppContext) {
        AbstractC65746a s;
        synchronized (AbstractC65746a.class) {
            s = C67485a.m262488a(iAppContext).mo234298s();
        }
        return s;
    }

    /* renamed from: a */
    public static void m257748a(Context context, IAppContext iAppContext) {
        m257747a(iAppContext);
    }
}
