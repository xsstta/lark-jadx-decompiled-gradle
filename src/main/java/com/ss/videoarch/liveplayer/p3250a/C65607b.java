package com.ss.videoarch.liveplayer.p3250a;

import android.text.TextUtils;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.ttm.player.MediaPlayer;
import com.ss.videoarch.liveplayer.log.C65654a;
import com.ss.videoarch.liveplayer.log.C65658c;
import java.net.URLEncoder;

/* renamed from: com.ss.videoarch.liveplayer.a.b */
public class C65607b implements AVMDLDataLoaderListener {

    /* renamed from: a */
    public AVMDLDataLoaderConfigure f165141a;

    /* renamed from: b */
    private AbstractC65606a f165142b;

    /* renamed from: c */
    private MediaPlayer f165143c;

    /* renamed from: d */
    private C65654a f165144d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.a.b$a */
    public static class C65609a {

        /* renamed from: a */
        public static C65607b f165145a = new C65607b();
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public String getCheckSumInfo(String str) {
        return null;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public String getStringValue(int i, long j, String str) {
        return null;
    }

    /* renamed from: a */
    public static C65607b m257152a() {
        return C65609a.f165145a;
    }

    private C65607b() {
        this.f165141a = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    /* renamed from: b */
    public boolean mo229555b() {
        if (AVMDLDataLoader.getInstance() == null) {
            return false;
        }
        return AVMDLDataLoader.getInstance().isRunning();
    }

    /* renamed from: a */
    public void mo229551a(MediaPlayer mediaPlayer) {
        this.f165143c = mediaPlayer;
    }

    /* renamed from: a */
    public void mo229553a(C65654a aVar) {
        this.f165144d = aVar;
    }

    /* renamed from: b */
    public String mo229554b(int i) {
        C65658c.m257426b("MediaLoaderWrapper", "get string value from loader");
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (i == 11 && instance != null) {
            return instance.getStringValue(11);
        }
        return null;
    }

    /* renamed from: a */
    private boolean m257153a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http://127.0.0.1") || lowerCase.startsWith("http://localhost") || lowerCase.startsWith("file://") || lowerCase.startsWith("/") || lowerCase.endsWith(".mpd") || lowerCase.contains(".mpd?") || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public long mo229547a(int i) {
        C65658c.m257426b("MediaLoaderWrapper", "get long value from loader");
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        long j = -1;
        if (i != 7218) {
            switch (i) {
                case JosStatusCodes.RTN_CODE_PARAMS_ERROR:
                    if (instance == null) {
                        return -1;
                    }
                    return instance.getLongValue(JosStatusCodes.RTN_CODE_PARAMS_ERROR);
                case 8101:
                    if (instance == null) {
                        return -1;
                    }
                    return instance.getLongValue(8101);
                case 8102:
                    if (instance != null) {
                        j = instance.getLongValue(8102);
                    }
                    if (j == 1) {
                        return 1;
                    }
                    return 0;
                default:
                    return -1;
            }
        } else if (instance == null) {
            return -1;
        } else {
            return instance.getLongValue(7218);
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo != null && this.f165142b != null) {
            C65658c.m257426b("MediaLoaderWrapper", "what:" + aVMDLDataLoaderNotifyInfo.what);
            int i = aVMDLDataLoaderNotifyInfo.what;
            if (i == 9) {
                AbstractC65606a aVar = this.f165142b;
                if (aVar != null) {
                    aVar.mo229545a((int) aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                }
                C65658c.m257426b("MediaLoaderWrapper", "live loader errorCode:" + aVMDLDataLoaderNotifyInfo.parameter + " errorInfo:" + aVMDLDataLoaderNotifyInfo.logInfo);
            } else if (i == 12) {
                AbstractC65606a aVar2 = this.f165142b;
                if (aVar2 != null) {
                    aVar2.mo229546b((int) aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                }
                C65658c.m257426b("MediaLoaderWrapper", "switch reason:" + aVMDLDataLoaderNotifyInfo.parameter + " switchInfo:" + aVMDLDataLoaderNotifyInfo.logInfo);
            }
        }
    }

    /* renamed from: a */
    public void mo229552a(AbstractC65606a aVar) {
        this.f165142b = aVar;
        try {
            AVMDLDataLoader.getInstance().setListener(ActivityIdentificationData.WALKING, this);
        } catch (Exception e) {
            e.printStackTrace();
            C65658c.m257426b("MediaLoaderWrapper", String.format("create loader failed: exception is" + e.toString(), new Object[0]));
        }
    }

    /* renamed from: a */
    public void mo229549a(int i, long j) {
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (instance != null && i == 59) {
            instance.setLongValue(1100, j);
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public long getInt64Value(int i, long j) {
        AbstractC65606a aVar;
        C65658c.m257426b("MediaLoaderWrapper", "getInt64Value:" + i);
        if (i == 8003) {
            MediaPlayer mediaPlayer = this.f165143c;
            if (mediaPlayer != null) {
                return mediaPlayer.getLongOption(73, 0);
            }
            return j;
        } else if (i == 8004 && (aVar = this.f165142b) != null) {
            return aVar.mo229544a(0, j);
        } else {
            return j;
        }
    }

    /* renamed from: a */
    public String mo229548a(String str, Boolean bool) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (!m257153a(str)) {
            return str;
        }
        String localAddr = AVMDLDataLoader.getInstance().getLocalAddr();
        if (TextUtils.isEmpty(localAddr)) {
            return null;
        }
        try {
            str2 = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str3 = "http://" + localAddr + "?rk=v02004b50000bh9ajqhdli3lfv2rgsgg&k=426161df8c5ce110209a6fc6641e049ddfrfgaf&u0=" + str2;
        if (!bool.booleanValue()) {
            return str3;
        }
        return "mdl://" + str3;
    }

    /* renamed from: a */
    public void mo229550a(int i, String str, int i2) {
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (instance != null) {
            if (i == 7213) {
                instance.setInt64ValueByStrKey(i, str, (long) i2);
            } else {
                instance.setInt64ValueByStrKey(i, str, System.currentTimeMillis());
            }
        }
    }
}
