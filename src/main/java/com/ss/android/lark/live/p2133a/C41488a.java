package com.ss.android.lark.live.p2133a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.live.C41487a;
import com.ss.android.lark.live.C41511d;
import com.ss.android.lark.live.LiveStateHolder;
import com.ss.android.lark.live.VcLiveUrlParam;
import com.ss.android.lark.live.model.VCLiveData;
import com.ss.android.lark.live.p2140c.C41510b;
import com.ss.android.lark.live.webview.C41538d;
import com.ss.android.lark.live.webview.VcWebViewAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.minifloatwindow.C46509b;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import java.net.URI;

/* renamed from: com.ss.android.lark.live.a.a */
public class C41488a {

    /* renamed from: a */
    public final LiveStateHolder f105468a = new LiveStateHolder();

    /* renamed from: b */
    private final String f105469b = "lark_remove_video_overlay_icon";

    /* renamed from: c */
    private VcWebViewAdapter f105470c;

    /* renamed from: a */
    public static C41488a m164623a() {
        return C41487a.m164616a();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m164633f() {
        mo149321a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m164632e() {
        C41510b.m164739a("close");
        mo149321a(false);
    }

    /* renamed from: b */
    public void mo149322b() {
        C45855f.m181664c("LiveService", "[willStartMeeting] enter");
        mo149321a(false);
    }

    /* renamed from: c */
    public boolean mo149324c() {
        return C45899c.m181859a().getVideoChatDependency().mo144590b();
    }

    /* renamed from: d */
    public boolean mo149325d() {
        VcWebViewAdapter vcWebViewAdapter = this.f105470c;
        if (vcWebViewAdapter == null || !vcWebViewAdapter.mo149432a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo149321a(boolean z) {
        C45859k.m181685a(new Runnable(z) {
            /* class com.ss.android.lark.live.p2133a.$$Lambda$a$zu647ugsAd5P6Ts8Em2nArKBaM */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C41488a.this.m164628b((C41488a) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m164628b(boolean z) {
        VcWebViewAdapter vcWebViewAdapter = this.f105470c;
        if (vcWebViewAdapter != null) {
            if (z) {
                vcWebViewAdapter.mo149437e();
                C41538d.m164835a().mo149456a(this.f105470c);
            } else {
                vcWebViewAdapter.mo149438f();
            }
            this.f105470c = null;
            if (!z) {
                mo149318a(LiveStateHolder.LiveState.END);
            }
        }
    }

    /* renamed from: c */
    private String m164629c(String str) {
        String str2;
        VcWebViewAdapter vcWebViewAdapter = this.f105470c;
        if (vcWebViewAdapter == null || vcWebViewAdapter.mo149435c() == null || this.f105470c.mo149435c().f105596b == null) {
            return str;
        }
        VCLiveData vCLiveData = this.f105470c.mo149435c().f105596b;
        if (!m164630c(str, vCLiveData.f105545a)) {
            return str;
        }
        String str3 = "true";
        Uri.Builder appendQueryParameter = Uri.parse(vCLiveData.f105545a).buildUpon().appendQueryParameter("autoplay", str3);
        if (vCLiveData.f105549e) {
            str2 = str3;
        } else {
            str2 = "false";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("muted", str2);
        if (!vCLiveData.f105550f) {
            str3 = "false";
        }
        return appendQueryParameter2.appendQueryParameter("danmaku", str3).build().toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m164631d(String str) {
        VcWebViewAdapter a = C41538d.m164835a().mo149455a(str);
        if (a == null) {
            mo149318a(LiveStateHolder.LiveState.END);
            C45855f.m181664c("LiveService", "[tryShowFloatView6] no cached webviewadapter");
        } else if (a.mo149436d()) {
            if (C45852d.m181651a().mo161151b().mo164278h()) {
                C45852d.m181651a().mo161151b().mo164284t();
            }
            a.mo149431a(new Runnable() {
                /* class com.ss.android.lark.live.p2133a.$$Lambda$a$JLxUVWzgQTDNm8DDRRD1oM0HDgM */

                public final void run() {
                    C41488a.this.m164633f();
                }
            });
            a.mo149434b(new Runnable() {
                /* class com.ss.android.lark.live.p2133a.$$Lambda$a$UOpYcMMkP5K3R5WgzSvMwtoe_A */

                public final void run() {
                    C41488a.this.m164632e();
                }
            });
            a.mo149430a(new C46509b.AbstractC46515a(a) {
                /* class com.ss.android.lark.live.p2133a.$$Lambda$a$oGNCWDOF83UUXKvQGpi8xE3GnqM */
                public final /* synthetic */ VcWebViewAdapter f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
                /* renamed from: a */
                public /* synthetic */ void mo149312a() {
                    C46509b.AbstractC46515a.CC.$default$a(this);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
                /* renamed from: a */
                public /* synthetic */ void mo149313a(boolean z) {
                    C46509b.AbstractC46515a.CC.$default$a(this, z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
                public final void onCreatedResultCallBack(boolean z) {
                    C41488a.this.m164624a((C41488a) this.f$1, (VcWebViewAdapter) z);
                }
            });
        } else {
            a.mo149438f();
            mo149318a(LiveStateHolder.LiveState.END);
            C45855f.m181664c("LiveService", "[tryShowFloatView5] failed, canShowFloatWindow return false");
        }
    }

    /* renamed from: b */
    public void mo149323b(String str) {
        C45855f.m181664c("LiveService", "[tryShowFloatView] enter");
        if (mo149324c()) {
            C45855f.m181664c("LiveService", "[tryShowFloatView2] Can not show float view cause in meeting now");
            mo149318a(LiveStateHolder.LiveState.END);
        } else if (!MmRecordManager.m185552y()) {
            C45855f.m181664c("LiveService", "[tryShowFloatView3] invoke showFloatView");
            C45859k.m181685a(new Runnable(str) {
                /* class com.ss.android.lark.live.p2133a.$$Lambda$a$TrqvfRvPbXxedi31fJfJJE1Nkrs */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C41488a.this.m164631d(this.f$1);
                }
            });
        } else {
            mo149318a(LiveStateHolder.LiveState.END);
            C45855f.m181664c("LiveService", "[tryShowFloatView7] can not add view to float window cause is recording");
        }
    }

    /* renamed from: a */
    public void mo149317a(LiveStateHolder.DisplayMode displayMode) {
        this.f105468a.mo149254a(displayMode);
        C45855f.m181663b("LiveService", "[updateDisplayMode] " + this.f105468a.toString());
    }

    /* renamed from: a */
    public void mo149318a(LiveStateHolder.LiveState liveState) {
        this.f105468a.mo149255a(liveState);
        C45855f.m181663b("LiveService", "[updateLiveState] " + this.f105468a.toString());
    }

    /* renamed from: a */
    public void mo149319a(LiveStateHolder.PlayerState playerState) {
        this.f105468a.mo149256a(playerState);
        C45855f.m181663b("LiveService", "[updatePlayerState] " + this.f105468a.toString());
    }

    /* renamed from: a */
    public void mo149320a(String str) {
        this.f105468a.mo149259a(str);
        C45855f.m181663b("LiveService", "[updateLiveId] " + this.f105468a.toString());
    }

    /* renamed from: c */
    private boolean m164630c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m164624a(VcWebViewAdapter vcWebViewAdapter, boolean z) {
        if (!z) {
            C45855f.m181664c("LiveService", "[tryShowFloatView4] failed");
            vcWebViewAdapter.mo149438f();
            if (this.f105470c != null) {
                this.f105470c = null;
            }
            mo149318a(LiveStateHolder.LiveState.END);
        } else if (this.f105470c == null) {
            C41510b.m164739a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            C45855f.m181664c("LiveService", "[tryShowFloatView4] success");
            this.f105470c = vcWebViewAdapter;
        }
    }

    /* renamed from: a */
    private static boolean m164626a(String str, String str2) {
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || TextUtils.isEmpty(parse.getQueryParameter(str2))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static String m164627b(String str, String str2) {
        URI uri;
        try {
            URI uri2 = new URI(str);
            String query = uri2.getQuery();
            if (query != null) {
                str2 = query + ContainerUtils.FIELD_DELIMITER + str2;
            }
            uri = new URI(uri2.getScheme(), uri2.getAuthority(), uri2.getPath(), str2, uri2.getFragment());
        } catch (Exception e) {
            Log.m165383e("LiveService", "add query error:" + e);
            uri = null;
        }
        if (uri != null) {
            return uri.toString();
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m164625a(String str, int i, Context context) {
        mo149321a(true);
        VcLiveUrlParam a = VcLiveUrlParam.newBuilder().mo149271a(str).mo149270a(i).mo149272a();
        C45855f.m181664c("LiveService", "[openUrl2] invoke openLiveWeb");
        C41511d.m164742a(context, a);
    }

    /* renamed from: a */
    public void mo149316a(Context context, String str, int i) {
        if (!m164626a(str, "lark_remove_video_overlay_icon")) {
            str = m164627b(str, "lark_remove_video_overlay_icon=true");
        }
        try {
            str = m164629c(str);
        } catch (Exception e) {
            C45855f.m181663b("LiveService", "[openUrl3] " + e.getMessage());
        }
        C45855f.m181664c("LiveService", "[openUrl] open Url: " + str);
        C45859k.m181685a(new Runnable(str, i, context) {
            /* class com.ss.android.lark.live.p2133a.$$Lambda$a$6KcgGtqFezjRtnNlmRC6pkBBqs */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ Context f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C41488a.this.m164625a((C41488a) this.f$1, (String) this.f$2, (int) this.f$3);
            }
        });
    }
}
