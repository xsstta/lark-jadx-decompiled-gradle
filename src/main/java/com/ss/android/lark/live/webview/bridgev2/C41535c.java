package com.ss.android.lark.live.webview.bridgev2;

import com.ss.android.lark.live.model.VCLiveData;
import com.ss.android.lark.live.webview.bridgev2.VcLiveBridgeHandlerV2;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeData;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.live.webview.bridgev2.c */
public class C41535c implements VcLiveBridgeHandlerV2.IStateTracker {

    /* renamed from: b */
    public VCLiveData f105596b;

    /* renamed from: c */
    public boolean f105597c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.c$1 */
    public static /* synthetic */ class C415361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f105598a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent[] r0 = com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.live.webview.bridgev2.C41535c.C415361.f105598a = r0
                com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent r1 = com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent.PLAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.live.webview.bridgev2.C41535c.C415361.f105598a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent r1 = com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent.PAUSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.live.webview.bridgev2.C41535c.C415361.f105598a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent r1 = com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent.END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.live.webview.bridgev2.C41535c.C415361.f105598a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent r1 = com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.live.webview.bridgev2.C41535c.C415361.<clinit>():void");
        }
    }

    public C41535c(VCLiveData vCLiveData) {
        this.f105596b = vCLiveData;
    }

    @Override // com.ss.android.lark.live.webview.bridgev2.VcLiveBridgeHandlerV2.IStateTracker
    /* renamed from: a */
    public void mo149439a(CallNativeData callNativeData) {
        C45855f.m181664c("VcStateTrackerImpl", "[onWebLiveStateChanged] WebLiveData: " + callNativeData);
        VCLiveData vCLiveData = this.f105596b;
        if (vCLiveData == null) {
            C45855f.m181664c("VcStateTrackerImpl", "[onWebLiveStateChanged] live data has not been inited");
            return;
        }
        vCLiveData.mo149392a(callNativeData);
        int i = C415361.f105598a[callNativeData.live_event.ordinal()];
        if (i == 1) {
            this.f105596b.f105551g = VCLiveData.LivePlayerState.PLAY;
            this.f105597c = true;
        } else if (i == 2) {
            this.f105596b.f105551g = VCLiveData.LivePlayerState.PAUSE;
            this.f105597c = false;
        } else if (i == 3) {
            this.f105596b.f105551g = VCLiveData.LivePlayerState.END;
            this.f105597c = false;
        } else if (i != 4) {
            C45855f.m181664c("VcStateTrackerImpl", "[onWebLiveStateChanged] nothing to do");
        } else {
            this.f105596b.f105551g = VCLiveData.LivePlayerState.ERROR;
            this.f105597c = false;
        }
    }
}
