package com.ss.android.lark.download.service.p1811a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AbstractC29575r;
import com.ss.android.lark.biz.core.api.C29556e;
import com.ss.android.lark.biz.core.api.FileDownloadState;
import com.ss.android.lark.biz.core.api.NetworkType;
import com.ss.android.lark.download.service.DownloadProgress;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.download.service.a.a */
public class C36842a implements AbstractC29572q {

    /* renamed from: a */
    public Map<String, C29556e> f94692a;

    /* renamed from: b */
    public Set<AbstractC29572q.AbstractC29573a> f94693b;

    /* renamed from: c */
    public Set<AbstractC29572q.AbstractC29574b> f94694c;

    /* renamed from: d */
    public NetworkType f94695d;

    /* renamed from: e */
    private C38770b f94696e;

    /* renamed from: f */
    private AbstractC29575r f94697f;

    /* renamed from: g */
    private AbstractC38769a f94698g;

    /* renamed from: h */
    private boolean f94699h;

    /* renamed from: i */
    private AbstractC36863d f94700i;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.download.service.a.a$a */
    public static class C36846a {

        /* renamed from: a */
        public static final C36842a f94704a = new C36842a();
    }

    /* renamed from: a */
    public static C36842a m145418a() {
        return C36846a.f94704a;
    }

    /* renamed from: c */
    private void m145419c() {
        if (this.f94698g == null) {
            this.f94698g = new AbstractC38769a() {
                /* class com.ss.android.lark.download.service.p1811a.C36842a.C368442 */

                @Override // com.ss.android.lark.http.netstate.AbstractC38769a
                public void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                    switch (C368453.f94703a[networkType.ordinal()]) {
                        case 2:
                            C36842a.this.f94695d = NetworkType.NO_INTERNET_CONNECTION;
                            if (C36842a.this.f94693b != null && C36842a.this.f94693b.size() > 0 && C36842a.this.mo136004b()) {
                                for (AbstractC29572q.AbstractC29573a aVar : C36842a.this.f94693b) {
                                    aVar.mo105822a();
                                }
                                break;
                            }
                        case 3:
                            C36842a.this.f94695d = NetworkType.WIFI;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            C36842a.this.f94695d = NetworkType.CELLULAR_DATA_NETWORK;
                            if (C36842a.this.mo136004b()) {
                                boolean z = false;
                                boolean z2 = false;
                                for (C29556e eVar : C36842a.this.f94692a.values()) {
                                    if (eVar.mo105720g() == FileDownloadState.DOWNLOADING) {
                                        long i = eVar.mo105722i();
                                        if (!eVar.mo105724k() && i - ((((long) eVar.mo105721h()) * i) / 100) > 104857600) {
                                            C36842a.this.mo136003b(eVar);
                                            z2 = true;
                                        }
                                        z = true;
                                    }
                                }
                                if (!(C36842a.this.f94693b == null || C36842a.this.f94693b.size() == 0)) {
                                    for (AbstractC29572q.AbstractC29573a aVar2 : C36842a.this.f94693b) {
                                        if (z2) {
                                            aVar2.mo105823b();
                                        } else if (z) {
                                            aVar2.mo105824c();
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                    for (AbstractC29572q.AbstractC29574b bVar : C36842a.this.f94694c) {
                        bVar.mo105825a(C36842a.this.f94695d.getNumber());
                    }
                }
            };
        }
        if (!this.f94699h) {
            this.f94699h = true;
            this.f94696e.mo142127a(this.f94698g);
        }
    }

    /* renamed from: d */
    private void m145420d() {
        if (this.f94692a.size() == 0 && this.f94694c.size() == 0) {
            this.f94699h = false;
            this.f94696e.mo142129b(this.f94698g);
        }
    }

    private C36842a() {
        this.f94692a = new HashMap();
        this.f94696e = C38770b.m153078a();
        this.f94700i = new AbstractC36863d() {
            /* class com.ss.android.lark.download.service.p1811a.C36842a.C368431 */

            @Override // com.ss.android.lark.download.service.p1811a.AbstractC36863d
            /* renamed from: a */
            public void mo136005a(DownloadProgress downloadProgress) {
                C36842a.this.mo136002a(downloadProgress);
            }
        };
        C36847b.m145432a().mo136006a(this.f94700i);
        this.f94693b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f94694c = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f94697f = new C36853c();
    }

    /* renamed from: com.ss.android.lark.download.service.a.a$3 */
    static /* synthetic */ class C368453 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94703a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a = r0
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36842a.C368453.f94703a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.download.service.p1811a.C36842a.C368453.<clinit>():void");
        }
    }

    /* renamed from: b */
    public boolean mo136004b() {
        Map<String, C29556e> map = this.f94692a;
        if (!(map == null || map.size() == 0)) {
            for (C29556e eVar : this.f94692a.values()) {
                if (eVar.mo105720g() == FileDownloadState.DOWNLOADING) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: a */
    public void mo105818a(AbstractC29572q.AbstractC29574b bVar) {
        if (bVar != null) {
            this.f94694c.add(bVar);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: b */
    public void mo105821b(AbstractC29572q.AbstractC29574b bVar) {
        if (bVar != null) {
            this.f94694c.remove(bVar);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: a */
    public void mo105817a(AbstractC29572q.AbstractC29573a aVar) {
        if (aVar != null) {
            this.f94693b.add(aVar);
            m145419c();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: b */
    public void mo105820b(AbstractC29572q.AbstractC29573a aVar) {
        if (aVar != null) {
            this.f94693b.remove(aVar);
            m145420d();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: a */
    public NetworkType mo105815a(Context context) {
        switch (C368453.f94703a[NetworkUtils.m153071d(context).ordinal()]) {
            case 1:
            case 2:
                this.f94695d = NetworkType.NO_INTERNET_CONNECTION;
                break;
            case 3:
                this.f94695d = NetworkType.WIFI;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                this.f94695d = NetworkType.CELLULAR_DATA_NETWORK;
                break;
        }
        return this.f94695d;
    }

    /* renamed from: b */
    public void mo136003b(C29556e eVar) {
        eVar.mo105714a(true);
        eVar.mo105712a(FileDownloadState.DOWNLOAD_CANCEL);
        if (eVar.mo105723j()) {
            this.f94697f.mo105834a(eVar.mo105715b(), eVar.mo105719f(), eVar.mo105716c(), eVar.mo105717d());
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: a */
    public void mo105816a(C29556e eVar) {
        if (eVar != null) {
            C29556e eVar2 = this.f94692a.get(eVar.mo105719f());
            if (eVar2 == null) {
                this.f94692a.put(eVar.mo105719f(), eVar);
                m145419c();
                return;
            }
            eVar2.mo105713a(eVar.mo105718e());
        }
    }

    /* renamed from: a */
    public void mo136002a(DownloadProgress downloadProgress) {
        C29556e eVar;
        if (downloadProgress != null && (eVar = this.f94692a.get(downloadProgress.getKey())) != null && downloadProgress.getMessageId().equals(eVar.mo105715b())) {
            if (downloadProgress.getState() == FileDownloadState.DOWNLOAD_SUCCESS) {
                mo105819a(downloadProgress.getKey(), downloadProgress.getMessageId());
                return;
            }
            eVar.mo105712a(downloadProgress.getState());
            eVar.mo105711a(downloadProgress.getProgress());
            eVar.mo105714a(false);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29572q
    /* renamed from: a */
    public void mo105819a(String str, String str2) {
        C29556e eVar;
        if (!TextUtils.isEmpty(str) && (eVar = this.f94692a.get(str)) != null && eVar.mo105715b().equals(str2)) {
            this.f94692a.remove(str);
            m145420d();
        }
    }
}
