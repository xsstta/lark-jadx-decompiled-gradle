package com.tt.miniapp.audio;

import android.app.Application;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.DataSource;
import com.ss.ttvideoengine.SeekCompletionListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapp.video.player.C67127b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67522b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.audio.d */
public class C65784d extends AbstractC65746a {

    /* renamed from: b */
    public boolean f165792b;

    /* renamed from: c */
    public int f165793c;

    /* renamed from: d */
    private AudioManager f165794d;

    /* renamed from: e */
    private List<Integer> f165795e;

    /* renamed from: f */
    private IAppContext f165796f;

    /* renamed from: com.tt.miniapp.audio.d$b */
    public static class C65789b extends AbstractC65746a.C65748b {

        /* renamed from: n */
        public String f165808n;

        /* renamed from: o */
        public TTVideoEngine f165809o;

        /* renamed from: p */
        public boolean f165810p;

        /* renamed from: q */
        public boolean f165811q;
    }

    /* renamed from: a */
    public boolean mo230464a(int i, C67522b bVar, boolean z) {
        if (bVar == null) {
            bVar = new C67522b();
        }
        AppBrandLogger.m52828d("tma_TTVideoAudio", "releaseAudio ", Integer.valueOf(i));
        SparseArray<C65789b> sparseArray = AbstractC65746a.m257746a().f165680e;
        C65789b bVar2 = sparseArray.get(i);
        if (bVar2 == null) {
            bVar.mo234467a(m257861a("audio init fail", i));
            return false;
        }
        TTVideoEngine tTVideoEngine = bVar2.f165809o;
        if (tTVideoEngine == null) {
            bVar.mo234467a(m257861a("audio create fail", i));
            return false;
        }
        if (!z) {
            mo230462a(i, "ended");
        }
        try {
            tTVideoEngine.release();
            this.f165794d.abandonAudioFocus(bVar2.f165671i);
            sparseArray.delete(i);
            this.f165652a.remove(i);
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_TTVideoAudio", "releaseAudio", e);
            bVar.mo234467a("release fail, audioId == " + i);
            bVar.mo234469a((Throwable) e);
            return false;
        }
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: a */
    public void mo230377a(int i, AbstractC65746a.AbstractC65751e eVar) {
        C65789b bVar = AbstractC65746a.m257746a().f165680e.get(i);
        if (bVar == null) {
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio init fail", i), null);
            }
        } else if (bVar.f165809o == null) {
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio create fail", i), null);
            }
        } else if (AbstractC65746a.m257746a().f165679d) {
            if (eVar != null) {
                eVar.mo88628a(m257861a("app in background", i), null);
            }
        } else if (m257864b(bVar)) {
            if (bVar.f165663a == 0 || bVar.f165663a == 6) {
                bVar.f165665c = true;
            }
            if (eVar != null) {
                eVar.mo88627a();
            }
        } else if (eVar != null) {
            eVar.mo88628a(m257861a("request focus and play", i), null);
        }
    }

    /* renamed from: a */
    public void mo230461a(int i, AbstractC65746a.AbstractC65751e eVar, boolean z) {
        C65789b bVar = AbstractC65746a.m257746a().f165680e.get(i);
        if (bVar != null && bVar.f165809o != null) {
            bVar.f165810p = false;
            bVar.f165811q = false;
            bVar.f165674l = false;
            bVar.f165809o.stop();
            bVar.f165663a = 5;
            if (!z) {
                mo230462a(i, "stop");
            }
            if (eVar != null) {
                eVar.mo88627a();
            }
        } else if (eVar != null) {
            eVar.mo88627a();
        }
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: a */
    public void mo230376a(final int i, final int i2, final AbstractC65746a.AbstractC65751e eVar) {
        final C65789b bVar = AbstractC65746a.m257746a().f165680e.get(i);
        if (bVar == null) {
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio init fail", i), null);
            }
        } else if (bVar.f165809o != null) {
            bVar.f165810p = false;
            if (bVar.f165663a == 2) {
                bVar.f165674l = true;
            } else {
                bVar.f165674l = false;
            }
            if ((bVar.f165811q || bVar.f165663a != 4) && ((!bVar.f165811q || bVar.f165663a != 9) && (!bVar.f165811q || bVar.f165663a != 5))) {
                bVar.f165811q = false;
            } else {
                bVar.f165811q = true;
            }
            if (i2 > bVar.f165809o.getDuration() + IByteRtcError.BRERR_INVALID_TOKEN) {
                bVar.f165810p = true;
            }
            mo230462a(i, "seeking");
            bVar.f165809o.seekTo(i2, new SeekCompletionListener() {
                /* class com.tt.miniapp.audio.C65784d.C657873 */

                @Override // com.ss.ttvideoengine.SeekCompletionListener
                public void onCompletion(boolean z) {
                    if (z) {
                        C65784d.this.mo230462a(i, "seeked");
                        AbstractC65746a.AbstractC65751e eVar = eVar;
                        if (eVar != null) {
                            eVar.mo88627a();
                        }
                    } else {
                        bVar.f165809o.setStartTime(i2);
                        if (bVar.f165674l) {
                            bVar.f165809o.play();
                        } else {
                            bVar.f165809o.pause();
                        }
                        C65784d.this.mo230462a(i, "seeked");
                        AbstractC65746a.AbstractC65751e eVar2 = eVar;
                        if (eVar2 != null) {
                            eVar2.mo88627a();
                        }
                    }
                    if (bVar.f165674l) {
                        bVar.f165663a = 2;
                    } else {
                        bVar.f165663a = 9;
                    }
                }
            });
        } else if (eVar != null) {
            eVar.mo88628a(m257861a("audio create fail", i), null);
        }
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: a */
    public void mo230378a(C65783c cVar, AbstractC65746a.AbstractC65751e eVar) {
        int i = cVar.f165788i;
        SparseArray<C65789b> sparseArray = AbstractC65746a.m257746a().f165680e;
        C65789b bVar = sparseArray.get(i);
        if (bVar == null) {
            mo230459a(cVar, cVar.f165791l, new C67522b());
            bVar = sparseArray.get(i);
        }
        if (bVar == null) {
            AppBrandLogger.m52828d("tma_TTVideoAudio", "setAudioState media == null");
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio init fail", i), null);
                return;
            }
            return;
        }
        TTVideoEngine tTVideoEngine = bVar.f165809o;
        if (tTVideoEngine == null) {
            AppBrandLogger.m52828d("tma_TTVideoAudio", "setAudioState mediaPlayer == null");
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio create fail", i), null);
                return;
            }
            return;
        }
        String str = cVar.f165780a;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52828d("tma_TTVideoAudio", "setAudioState src is empty");
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio set fail, src is empty", i), null);
            }
        } else if (!str.startsWith("http") || ((!ProcessUtil.isMiniappProcess() && (this.f165796f == null || AppType.GadgetAPP != this.f165796f.getAppType())) || C67053q.m261326a("request", str, this.f165796f))) {
            if (TextUtils.equals(bVar.f165664b, str)) {
                AppBrandLogger.m52828d("tma_TTVideoAudio", "setAudioState TextUtils.equals(media.src, playUrl) ", str);
            } else {
                AppBrandLogger.m52828d("tma_TTVideoAudio", "setAudioState src is ", str);
                try {
                    if (!TextUtils.isEmpty(cVar.f165781b)) {
                        tTVideoEngine.setDecryptionKey(cVar.f165781b);
                    }
                    m257860a(str, tTVideoEngine, this.f165796f);
                    bVar.f165673k = true;
                    bVar.f165663a = 6;
                    if (cVar.f165786g && !m257864b(bVar)) {
                        if (eVar != null) {
                            eVar.mo88628a("audio set fail, auto play fail", null);
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    if (eVar != null) {
                        eVar.mo88628a("audio set fail, src is error, src == " + str, e);
                        return;
                    }
                    return;
                }
            }
            bVar.f165664b = str;
            bVar.f165666d = cVar.f165786g;
            bVar.f165667e = cVar.f165787h;
            bVar.f165668f = cVar.f165785f;
            float f = cVar.f165789j;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (f > 1.0f) {
                f2 = 1.0f;
            } else if (cVar.f165789j >= BitmapDescriptorFactory.HUE_RED) {
                f2 = cVar.f165789j;
            }
            bVar.f165670h = f2;
            bVar.f165675m = cVar.f165790k;
            m257862a(bVar);
            if (eVar != null) {
                eVar.mo88627a();
            }
        } else {
            AppBrandLogger.m52828d("tma_TTVideoAudio", "setAudioState src is not valid domain");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 0);
            hashMap.put(ApiHandler.API_CALLBACK_ERRMSG, "not in valid domains");
            mo230463a(i, "error", hashMap);
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio set fail, src is not valid domain, src == " + str, i), null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230463a(int i, String str, Map<String, Object> map) {
        AbstractC65746a.C65750d a = m257746a();
        a.f165678c = false;
        if (!a.f165676a || a.f165677b == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("audioId", i);
                jSONObject.put("state", str);
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        jSONObject.put(str2, map.get(str2));
                    }
                }
                AppBrandLogger.m52828d("tma_TTVideoAudio", "sendMsgState ", str);
                ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) this.f165796f.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235028a(C67706e.C67708a.m263377a("onAudioStateChange", jSONObject).mo235009a());
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_TTVideoAudio", "", e);
            }
        } else {
            a.f165677b.mo230386a(i, str);
        }
    }

    /* renamed from: e */
    private String m257865e() {
        AppInfoEntity appInfo = C67432a.m262319a(this.f165796f).getAppInfo();
        if (appInfo != null) {
            return appInfo.appId;
        }
        return "";
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: c */
    public synchronized void mo230382c() {
        AppBrandLogger.m52828d("tma_TTVideoAudio", "onEnterForeground");
        AbstractC65746a.m257746a().f165679d = false;
        for (Integer num : this.f165795e) {
            mo230377a(num.intValue(), (AbstractC65746a.AbstractC65751e) null);
        }
        this.f165795e.clear();
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: d */
    public synchronized void mo230384d() {
        SparseArray<C65789b> sparseArray = AbstractC65746a.m257746a().f165680e;
        AppBrandLogger.m52828d("tma_TTVideoAudio", "onEnterBackground");
        AbstractC65746a.m257746a().f165679d = true;
        int size = sparseArray.size();
        this.f165795e.clear();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AbstractC65746a.C65747a a = mo230375a(keyAt, (C67522b) null);
            AppBrandLogger.m52828d("tma_TTVideoAudio", "onEnterBackground " + sparseArray.get(keyAt).f165663a);
            if (a != null && !a.f165655c) {
                this.f165795e.add(Integer.valueOf(keyAt));
                mo230380b(keyAt, (AbstractC65746a.AbstractC65751e) null);
            }
        }
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: b */
    public void mo230379b() {
        SparseArray<C65789b> sparseArray = AbstractC65746a.m257746a().f165680e;
        for (int i = 0; i < sparseArray.size(); i++) {
            C65789b valueAt = sparseArray.valueAt(i);
            if (!(valueAt == null || valueAt.f165809o == null)) {
                valueAt.f165809o.release();
                valueAt.f165809o = null;
                mo230462a(sparseArray.keyAt(i), "ended");
            }
        }
        sparseArray.clear();
        this.f165652a.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.audio.d$a */
    public class C65788a implements VideoEngineListener {

        /* renamed from: b */
        private int f165806b;

        /* renamed from: c */
        private C65789b f165807c;

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onRenderStart(TTVideoEngine tTVideoEngine) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onVideoStatusException(int i) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPrepare(TTVideoEngine tTVideoEngine) {
            this.f165807c.f165673k = true;
            this.f165807c.f165663a = 6;
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onCompletion(TTVideoEngine tTVideoEngine) {
            C65789b bVar = this.f165807c;
            if (bVar != null) {
                if (bVar.f165667e && !this.f165807c.f165811q) {
                    this.f165807c.f165810p = false;
                    this.f165807c.f165809o.play();
                    C65784d.this.mo230462a(this.f165807c.f165672j, "play");
                } else if (this.f165807c.f165810p) {
                    C65784d.this.mo230462a(this.f165806b, "pause");
                } else {
                    this.f165807c.f165811q = false;
                    this.f165807c.f165663a = 3;
                    C65784d.this.mo230462a(this.f165806b, "ended");
                }
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onError(Error error) {
            int i = error.code;
            String str = error.description;
            C65789b bVar = this.f165807c;
            if (bVar != null) {
                bVar.f165663a = 7;
            }
            AppBrandLogger.m52829e("tma_TTVideoAudio", "audioId ", Integer.valueOf(this.f165806b), " onError what ", Integer.valueOf(i), " extra ", str);
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            hashMap.put(ApiHandler.API_CALLBACK_ERRMSG, str);
            C65784d.this.mo230463a(this.f165806b, "error", hashMap);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPrepared(TTVideoEngine tTVideoEngine) {
            AppBrandLogger.m52828d("tma_TTVideoAudio", "onPrepared audioId ", Integer.valueOf(this.f165806b));
            C65789b bVar = this.f165807c;
            if (bVar != null) {
                if (bVar.f165664b != null && !this.f165807c.f165664b.startsWith("http")) {
                    this.f165807c.f165669g = 100;
                }
                this.f165807c.f165673k = false;
                if (this.f165807c.f165809o != null) {
                    this.f165807c.f165663a = 1;
                    C65784d.this.mo230462a(this.f165806b, "canplay");
                }
                if (!AbstractC65746a.m257746a().f165679d) {
                    if (this.f165807c.f165666d || this.f165807c.f165665c) {
                        this.f165807c.f165665c = false;
                        this.f165807c.f165663a = 2;
                        C65784d.this.mo230462a(this.f165807c.f165672j, "play");
                    }
                }
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
            this.f165807c.f165669g = i;
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            if (i == 0) {
                this.f165807c.f165663a = 5;
            } else if (i == 1) {
                this.f165807c.f165663a = 2;
            } else if (i == 2) {
                this.f165807c.f165663a = 4;
            } else if (i == 3) {
                this.f165807c.f165663a = 7;
            }
        }

        public C65788a(int i, C65789b bVar) {
            this.f165806b = i;
            this.f165807c = bVar;
        }
    }

    /* renamed from: b */
    public boolean mo230465b(int i) {
        if (AbstractC65746a.m257746a().f165680e.get(i) != null) {
            return true;
        }
        return false;
    }

    public C65784d(IAppContext iAppContext) {
        this.f165795e = new ArrayList();
        this.f165792b = false;
        this.f165793c = -1;
        this.f165796f = iAppContext;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null) {
            this.f165794d = (AudioManager) applicationContext.getSystemService("audio");
        }
    }

    /* renamed from: b */
    private boolean m257864b(C65789b bVar) {
        int requestAudioFocus = this.f165794d.requestAudioFocus(bVar.f165671i, 3, 2);
        if ((requestAudioFocus != 2 && requestAudioFocus != 1) || bVar.f165809o == null) {
            return false;
        }
        bVar.f165810p = false;
        bVar.f165809o.play();
        bVar.f165811q = false;
        bVar.f165674l = false;
        if (!(bVar.f165663a == 0 || bVar.f165663a == 6)) {
            mo230462a(bVar.f165672j, "play");
            bVar.f165663a = 2;
        }
        this.f165792b = false;
        return true;
    }

    /* renamed from: a */
    private static void m257862a(C65789b bVar) {
        if (bVar != null && bVar.f165809o != null) {
            TTVideoEngine tTVideoEngine = bVar.f165809o;
            AudioManager audioManager = (AudioManager) AppbrandContext.getInst().getApplicationContext().getSystemService("audio");
            if (audioManager != null && !bVar.f165675m) {
                AppBrandLogger.m52828d("tma_TTVideoAudio", "getMode ", Integer.valueOf(audioManager.getMode()));
                if (audioManager.getMode() != 0) {
                    audioManager.setMode(0);
                }
                float f = 1.0f;
                if (bVar.f165670h <= 1.0f) {
                    if (bVar.f165670h < BitmapDescriptorFactory.HUE_RED) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = bVar.f165670h;
                    }
                }
                if (!bVar.f165668f) {
                    tTVideoEngine.setVolume(f, f);
                } else if (audioManager.getRingerMode() != 2) {
                    tTVideoEngine.setVolume(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                } else {
                    tTVideoEngine.setVolume(f, f);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo230460a(int i) {
        SparseArray<C65789b> sparseArray = AbstractC65746a.m257746a().f165680e;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C65789b valueAt = sparseArray.valueAt(i2);
            if (!(valueAt == null || valueAt.f165672j != i || valueAt.f165809o == null)) {
                if (valueAt.f165663a != 0) {
                    valueAt.f165809o.stop();
                }
                mo230381b(valueAt.f165672j, (C67522b) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230462a(int i, String str) {
        mo230463a(i, str, (Map<String, Object>) null);
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: b */
    public boolean mo230381b(int i, C67522b bVar) {
        return mo230464a(i, bVar, false);
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: c */
    public void mo230383c(int i, AbstractC65746a.AbstractC65751e eVar) {
        mo230461a(i, eVar, false);
    }

    /* renamed from: a */
    private static String m257861a(String str, int i) {
        return str + ", audioId == " + i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65784d(boolean r2, com.tt.miniapp.audio.AbstractC65746a.AbstractC65749c r3) {
        /*
            r1 = this;
            com.tt.miniapphost.a.c.a r0 = com.tt.miniapphost.p3362a.p3365c.C67448a.m262353a()
            com.tt.miniapphost.a.a.a r0 = r0.mo234192k()
            if (r0 == 0) goto L_0x0013
            com.tt.miniapphost.a.c.a r0 = com.tt.miniapphost.p3362a.p3365c.C67448a.m262353a()
            com.tt.miniapphost.a.a.a r0 = r0.mo234192k()
            goto L_0x001b
        L_0x0013:
            com.tt.miniapphost.a.c.a r0 = com.tt.miniapphost.p3362a.p3365c.C67448a.m262353a()
            com.tt.miniapphost.a.a.a r0 = r0.mo234190i()
        L_0x001b:
            r1.<init>(r0)
            com.tt.miniapp.audio.a$d r0 = com.tt.miniapp.audio.AbstractC65746a.m257746a()
            r0.f165676a = r2
            r0.f165677b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.audio.C65784d.<init>(boolean, com.tt.miniapp.audio.a$c):void");
    }

    /* renamed from: a */
    private TTVideoEngine m257859a(C65783c cVar, C65789b bVar) {
        TTVideoEngine tTVideoEngine;
        String str;
        int i = cVar.f165788i;
        if (TextUtils.isEmpty(cVar.f165780a) || !cVar.f165780a.endsWith(".wav") || !TextUtils.isEmpty(cVar.f165781b)) {
            tTVideoEngine = new TTVideoEngine(AppbrandContext.getInst().getApplicationContext(), 0);
        } else {
            tTVideoEngine = new TTVideoEngine(AppbrandContext.getInst().getApplicationContext(), 2);
        }
        tTVideoEngine.setListener(new C65788a(i, bVar));
        tTVideoEngine.setIntOption(SmEvents.EVENT_NO, 1);
        VideoEventManager.instance.setListener(new C67127b());
        tTVideoEngine.setTag("miniapp");
        if (TextUtils.isEmpty(bVar.f165808n)) {
            str = m257865e();
        } else {
            str = bVar.f165808n;
        }
        tTVideoEngine.setSubTag("miniapp_appid:" + str);
        tTVideoEngine.setIntOption(415, 1);
        return tTVideoEngine;
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: b */
    public void mo230380b(int i, AbstractC65746a.AbstractC65751e eVar) {
        C65789b bVar = AbstractC65746a.m257746a().f165680e.get(i);
        if (bVar == null) {
            if (eVar != null) {
                eVar.mo88628a(m257861a("audio init fail", i), null);
            }
        } else if (bVar.f165809o != null) {
            bVar.f165810p = false;
            bVar.f165674l = false;
            if (bVar.f165663a != 7) {
                if (bVar.f165663a == 2) {
                    try {
                        mo230462a(i, "pause");
                        bVar.f165809o.pause();
                        bVar.f165663a = 4;
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("tma_TTVideoAudio", "pause", e);
                        if (eVar != null) {
                            eVar.mo88628a("audio pause fail", e);
                            return;
                        }
                        return;
                    }
                }
                if (eVar != null) {
                    eVar.mo88627a();
                }
            } else if (eVar != null) {
                eVar.mo88628a(m257861a("audio state fail", i), null);
            }
        } else if (eVar != null) {
            eVar.mo88628a(m257861a("audio create fail", i), null);
        }
    }

    @Override // com.tt.miniapp.audio.AbstractC65746a
    /* renamed from: a */
    public AbstractC65746a.C65747a mo230375a(int i, C67522b bVar) {
        boolean z;
        if (bVar == null) {
            bVar = new C67522b();
        }
        C65789b bVar2 = AbstractC65746a.m257746a().f165680e.get(i);
        if (bVar2 == null) {
            bVar.mo234467a(m257861a("audio init fail", i));
            return null;
        }
        TTVideoEngine tTVideoEngine = bVar2.f165809o;
        if (tTVideoEngine == null) {
            bVar.mo234467a(m257861a("audio create fail", i));
            return null;
        }
        AbstractC65746a.C65747a aVar = new AbstractC65746a.C65747a();
        aVar.f165653a = bVar2.f165664b;
        try {
            if (bVar2.f165673k) {
                aVar.f165657e = 0;
            } else {
                aVar.f165657e = (long) tTVideoEngine.getDuration();
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_TTVideoAudio", "mediaPlayer is not Playing", e);
            aVar.f165657e = 0;
        }
        AppBrandLogger.m52828d("tma_TTVideoAudio", "audioState.src ", aVar.f165653a, " ", Long.valueOf(aVar.f165657e));
        try {
            if (bVar2.f165673k) {
                aVar.f165656d = 0;
            } else if (bVar2.f165810p) {
                aVar.f165656d = (long) tTVideoEngine.getDuration();
            } else {
                aVar.f165656d = (long) tTVideoEngine.getCurrentPlaybackTime();
            }
        } catch (Exception e2) {
            AppBrandLogger.m52829e("tma_TTVideoAudio", "mediaPlayer is not Playing", e2);
            aVar.f165656d = 0;
        }
        try {
            if (bVar2.f165663a != 8) {
                if (bVar2.f165663a != 2) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f165655c = z;
            } else if (bVar2.f165674l) {
                aVar.f165655c = false;
            } else {
                aVar.f165655c = true;
            }
        } catch (Exception e3) {
            AppBrandLogger.m52829e("tma_TTVideoAudio", "mediaPlayer is not Playing", e3);
            aVar.f165655c = true;
        }
        aVar.f165659g = bVar2.f165669g;
        aVar.f165658f = bVar2.f165668f;
        aVar.f165660h = bVar2.f165666d;
        aVar.f165661i = bVar2.f165667e;
        aVar.f165662j = bVar2.f165670h;
        return aVar;
    }

    /* renamed from: a */
    private static TTVideoEngine m257860a(String str, TTVideoEngine tTVideoEngine, IAppContext iAppContext) {
        if (TTFileHelper.m264259a("audio", iAppContext)) {
            return m257863b(str, tTVideoEngine, iAppContext);
        }
        if (str.startsWith("file") || str.startsWith("/") || str.startsWith(".") || str.startsWith("～")) {
            tTVideoEngine.setLocalURL(str);
        } else {
            tTVideoEngine.setDirectURL(str);
        }
        return tTVideoEngine;
    }

    /* renamed from: b */
    private static TTVideoEngine m257863b(String str, TTVideoEngine tTVideoEngine, IAppContext iAppContext) {
        AppBrandLogger.m52830i("tma_TTVideoAudio", "standardSetTTVideoEnginePath, path:" + str);
        TTFile gVar = new TTFile(str);
        try {
            File i = ((AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class)).mo235635i(gVar, new TTFileContext(null, "audio"));
            if (i != null) {
                str = i.getPath();
            } else {
                AppBrandLogger.m52830i("tma_TTVideoAudio", "getSystemFile return null");
            }
        } catch (TTFileException e) {
            AppBrandLogger.m52829e("tma_TTVideoAudio", "getSystemFile exception", e);
        }
        if (str.startsWith("file") || str.startsWith("/") || str.startsWith(".") || str.startsWith("～")) {
            tTVideoEngine.setLocalURL(str);
        } else {
            tTVideoEngine.setDirectURL(str);
        }
        return tTVideoEngine;
    }

    /* renamed from: a */
    public int mo230459a(C65783c cVar, String str, C67522b bVar) {
        TTVideoEngine.setHTTPDNSFirst(false);
        final C65789b bVar2 = new C65789b();
        bVar2.f165663a = 0;
        int i = cVar.f165788i;
        bVar2.f165672j = i;
        bVar2.f165808n = str;
        bVar2.f165809o = m257859a(cVar, bVar2);
        if (DebugUtil.debug()) {
            TTVideoEngineLog.turnOn(1, 1);
        }
        TTVideoEngine tTVideoEngine = bVar2.f165809o;
        tTVideoEngine.setVideoID(i + "");
        bVar2.f165809o.setDataSource(new DataSource() {
            /* class com.tt.miniapp.audio.C65784d.C657851 */

            @Override // com.ss.ttvideoengine.DataSource
            public String apiForFetcher(Map<String, String> map, int i) {
                return null;
            }
        });
        bVar2.f165671i = new AudioManager.OnAudioFocusChangeListener() {
            /* class com.tt.miniapp.audio.C65784d.C657862 */

            public void onAudioFocusChange(int i) {
                if (i == -3 || i == -2 || i == -1) {
                    if (bVar2.f165809o != null) {
                        C65784d.this.mo230380b(bVar2.f165672j, (AbstractC65746a.AbstractC65751e) null);
                    }
                    AbstractC65746a.m257746a().f165678c = true;
                } else if (i == 1 && C65784d.this.f165792b) {
                    C65784d dVar = C65784d.this;
                    dVar.mo230377a(dVar.f165793c, (AbstractC65746a.AbstractC65751e) null);
                    C65784d.this.f165792b = false;
                }
            }
        };
        AbstractC65746a.m257746a().f165680e.put(i, bVar2);
        return i;
    }
}
