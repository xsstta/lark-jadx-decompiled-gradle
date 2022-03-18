package com.ss.android.lark.mm.p2288b;

import com.ss.android.lark.mm.C45833a;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mm.b.d */
public final class C45852d {

    /* renamed from: a */
    private ConcurrentHashMap<String, MmRecordManager> f115676a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private MmPodcastControl f115677b;

    /* renamed from: c */
    private final Object f115678c = new Object();

    /* renamed from: a */
    public static C45852d m181651a() {
        return C45833a.m181565h();
    }

    /* renamed from: b */
    public MmPodcastControl mo161151b() {
        if (this.f115677b == null) {
            synchronized (MmPodcastControl.class) {
                if (this.f115677b == null) {
                    this.f115677b = new MmPodcastControl();
                }
            }
        }
        return this.f115677b;
    }

    /* renamed from: c */
    public void mo161153c() {
        C45855f.m181664c("MmControl", "clearPodcastControl");
        synchronized (MmPodcastControl.class) {
            MmPodcastControl mmPodcastControl = this.f115677b;
            if (mmPodcastControl != null) {
                mmPodcastControl.mo161235k();
                this.f115677b = null;
            }
        }
    }

    /* renamed from: a */
    public MmRecordManager mo161150a(String str) {
        synchronized (this.f115678c) {
            if (this.f115676a.containsKey(str)) {
                return this.f115676a.get(str);
            }
            MmRecordManager mmRecordManager = new MmRecordManager();
            this.f115676a.put(str, mmRecordManager);
            return mmRecordManager;
        }
    }

    /* renamed from: b */
    public void mo161152b(String str) {
        C45855f.m181664c("MmControl", "clearRecordManager");
        if (str != null) {
            synchronized (this.f115678c) {
                MmRecordManager mmRecordManager = this.f115676a.get(str);
                if (mmRecordManager != null) {
                    mmRecordManager.mo164540v();
                }
                this.f115676a.remove(str);
            }
        }
    }
}
