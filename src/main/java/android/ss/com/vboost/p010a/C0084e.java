package android.ss.com.vboost.p010a;

import android.content.Context;
import android.os.Bundle;
import android.ss.com.vboost.AbstractC0079a;
import android.ss.com.vboost.AbstractC0086b;
import android.ss.com.vboost.Status;
import android.util.Log;
import com.oppo.oiface.OifaceManager;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: android.ss.com.vboost.a.e */
public class C0084e implements AbstractC0083d {

    /* renamed from: a */
    public static int f151a = 60000;

    /* renamed from: b */
    private static String f152b = "OPPOKIT";

    /* renamed from: c */
    private static String f153c = "vKWYcYClBCLhC5dDO112BFa6qz690ckEbxA98zqgKfoAxKvxzVHQGocUBMdqQ5NwEFz4Eb5saUcSHO+1z3uPnfXcjm03sdXBrcLPyjmtFIWJUEttxRG8utMi2YkzbAMcNXOlPAPIzXM68gUSPKAreweYFCh+DfBJqAoQxSVlGnU=";

    /* renamed from: d */
    private static String f154d = "";

    /* renamed from: e */
    private static String f155e = "NiCWiYWJhnNfi3/EYfVLpsscMu/SSHVbQbmp+7VnbLXbcpPYmBL7nztAefQ5/UcE1HFSPlJK0VFlHuEe63qo+V4ZHnh4lmYE5xosk0w+IhQVhkajUIWr2qQU9+iyAZ8xwujaRt8g6I3cNvMfW8bZjKXpUx4rKLW8pEzzNWLNobY=";

    /* renamed from: f */
    private static String f156f = "zUIIaLfyg13Hy7NwZ/KvE7FtPsriXnpV1wEsFJJEjgktdSMkxCDFsWefR7Vj6ndvB3FYgmli7uMtLKGCM8JV3t564U1q+RtMYZH/uoPEQ3FPVXRZ44TliialrGFqf+Stv0RdOSGtn9z2z4Bz6AhDUNh0NNNCQzphqKjAgdtmeyE=";

    /* renamed from: g */
    private static String f157g = "TzIBDaDEpusmEAfO4MBfgfspyCkRQ2vwouLtSwAALaU6IOyzTJBItrsgfk14m9c2M459E2IcBunNwywcg51TVStFXXj6slwGe8ioHoz3bmV+plZCt2j1o7xPmSNyNn0fdut1swQA8bBsodJ3nBdk0Z7yOYIwef1AyyYpwYrLP/0=";

    /* renamed from: h */
    private static String f158h = "MAdxOlJsK/WNSkhMKhiThOl1EO4PpffgQLtGyvQZWmAZylCZ+LfvXh+bRKqK7R/rqM+QddmD6blRIBVaXzO51NPYcQKrMXNfcBjRMd7Z2m+nNUKjEugJOgWjPyiPFrano2KG2FzUM97zrZg4JcbRSjD5SHclEhwVhhfVj6qcxx4=";

    /* renamed from: i */
    private static String f159i = "Pp26KCDand8I7x8lb3KwceVNcSDvLXHI2xla38xKrzt1GcaWbNDllZWV+zI+O7Zo/sW9JhtU/uJMSjfP9RIXrGzrj5/3DmWff8DM+umldZZQm4yb1UbnYGB05Mp1gJygjyaHAOqv47c6lUxxxjkUGGm3KiZ3iZvvyy3G2yow6gc=";

    /* renamed from: j */
    private static String f160j = "sT170rJdr333Z6ro0x+09VRi2CefgC80UZu85ZZ/NEKMTwG4xdAiNlADyj2vzo+2Ft1toI00fY4HxWUyHRqm7XRadrtzOEbBsHMeP8PKxBT63p32P6Sq0rnb1NR2BTVS/iThulMxZBbxsJThO8Via73b+VfYscC6J81wp6RuD34=";

    /* renamed from: k */
    private static String f161k = "T1lrcqgRHq/oqLO7dqwcI/t4VkSStbIrJZmUx4M4lA65A5j1Q8N7ImpKMI0JAhhxM9Hst8JB1MsNzo8NOgzoJNH77G4HL0Pxr7a7HcklJDF+DOHLG1yehMpyNUayywNQJkRbLIvUhK5oHPeYvqERxt3UrZxsFSXRD8zPyx77AvU=";

    /* renamed from: l */
    private static String f162l = "rmYvvsoUAliNcVDq9uCA1Ypco1c/Q+74x4oF90/b4W1shcDpsdao8aubxdQ0Dj5B4NeVEGoHmq6Fb9MnpNqCZ2w2Q+bYum2TaF2NTCCSQdEApSYf6cNLUT4XffOQLlJpzEbpQ3X/9x9EW0eZgPypfL5bkWw9YJQulmLbkIC1C70=";

    /* renamed from: m */
    private static String f163m = "tBmXsRKs2vHcrHlo/hHeDs3iMrU/f2YxpusGbkBJQCB+YqMfMGbMVVTpN3YcmsawVWfAsaZKfzjcH5sfGQ3K9NE7eLtvhd6UTct/6nng85+DvHSyaYiDr2W9SZYzHn75XYWX2zE6Co+CVMTgmDp1xAo9gm45HxSPKjYDcRE5ncg=";

    /* renamed from: n */
    private static String f164n = "iNlOET2yRvNS39EtsA7vkA0eB9O10s+m83RSDIfL5ggVJppSGnL2J5FzSbHgGQ9CnIHnCn91cHursskal+Af9cS46VibHY4T1OyFs2oK3IFAO6qRjYMWe2gLQjtnLrprWOXqriA5l7TFbHDb8lTZyBI1/nx0MXOZkiTbyDKr5h0=";

    /* renamed from: o */
    private static String f165o = "C0yQJyvjSEdP2kk88957q0GFboKHdj/PkNAkR6JvYdeljHxF4WEvZRQMu1/sPgA7F9vtOJ+ztCyuLIMec5uK0Nc1obdLBzxvKPEwg0Qc8ev3fpYRNCNKk3WAlRnxBt/BBmCr2pWpuvpWQ5VXMIhB5XTpnxKFgSjUv78Uqd7oz2U=";

    /* renamed from: p */
    private static String f166p = "f7QBO5bwHXf79kN+of3d75U35C6KTutih8VGw2XPHqyl4vpVrUSgHSaTdDOau0pI+/Mq7yLuOvduq4Um45rdRYXyh+pBaKsKUNzldPqp44PNisnAeLlLuJMprUo8LCPiN1sDoFQfTawUrvSAZUGNrgbsE07+iBd/QLnuayxnRL0=";

    /* renamed from: q */
    private static int f167q = 1000;

    /* renamed from: r */
    private Context f168r;

    /* renamed from: s */
    private Timer f169s;

    /* renamed from: t */
    private boolean f170t;

    /* renamed from: u */
    private volatile long f171u;

    /* renamed from: a */
    private boolean m171a() {
        if (this.f169s != null) {
            return false;
        }
        Timer timer = new Timer();
        this.f169s = timer;
        this.f170t = true;
        timer.schedule(new TimerTask() {
            /* class android.ss.com.vboost.p010a.C0084e.C00851 */

            public void run() {
                OifaceManager.m98002a().mo95867a(C0084e.f151a, OifaceManager.AType.UPLOAD_INFO);
                OifaceManager.m98002a().mo95866a(100, 5000, -1);
            }
        }, 0, 20000);
        return true;
    }

    /* renamed from: b */
    private boolean m172b() {
        Timer timer = this.f169s;
        if (timer == null || !this.f170t) {
            return true;
        }
        timer.cancel();
        this.f169s = null;
        this.f170t = false;
        return true;
    }

    @Override // android.ss.com.vboost.p010a.AbstractC0083d
    /* renamed from: a */
    public boolean mo137a(Context context, String str) {
        if (str.contains("aweme")) {
            f154d = f153c;
        } else if (str.contains("ugc.boom")) {
            f154d = f157g;
        } else if (str.contains("ugc.live")) {
            f154d = f158h;
        } else if (str.contains("android.auto")) {
            f154d = f159i;
        } else if (str.contains("my.maya")) {
            f154d = f160j;
        } else if (str.contains("android.superb")) {
            f154d = f161k;
        } else if (str.contains("article.news")) {
            f154d = f162l;
        } else if (str.contains("article.video")) {
            f154d = f163m;
        } else if (str.contains("buzz.share")) {
            f154d = f164n;
        } else if (str.contains("ttve.app")) {
            f154d = f155e;
        } else if (str.contains("larksuite.suite")) {
            f154d = f165o;
        } else if (str.contains("android.lark")) {
            f154d = f166p;
        } else {
            f154d = f156f;
        }
        boolean a = OifaceManager.m98002a().mo95868a(f154d);
        this.f168r = context.getApplicationContext();
        String str2 = f152b;
        Log.i(str2, "注册厂商sdk合作: " + a);
        return a;
    }

    @Override // android.ss.com.vboost.p010a.AbstractC0083d
    /* renamed from: a */
    public boolean mo138a(AbstractC0086b bVar, Status status, Bundle bundle) {
        if (Status.END == status) {
            this.f171u--;
            if (this.f171u <= 0) {
                if (!m172b() || !OifaceManager.m98002a().mo95869b()) {
                    return false;
                }
                return true;
            }
        }
        this.f171u++;
        if (bVar == AbstractC0079a.f137f) {
            return OifaceManager.m98002a().mo95867a(f151a, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f132a) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.ACTIVITY_SWITCH);
        }
        if (bVar == AbstractC0079a.f140i) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.ACTIVITY_SWITCH);
        }
        if (bVar == AbstractC0079a.f133b) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.OTHER_SWITCH);
        }
        if (bVar == AbstractC0079a.f134c) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.ACTIVITY_SWITCH);
        }
        if (bVar == AbstractC0079a.f135d) {
            return OifaceManager.m98002a().mo95867a(f151a, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f136e) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f138g) {
            return m171a();
        }
        if (bVar == AbstractC0079a.f139h) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.OTHER_SWITCH);
        }
        if (bVar == AbstractC0079a.f149r) {
            return m171a();
        }
        if (bVar == AbstractC0079a.f141j) {
            return OifaceManager.m98002a().mo95867a(f167q, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f144m) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f143l) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f145n) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f146o) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.LOAD_INFO);
        }
        if (bVar == AbstractC0079a.f147p) {
            return OifaceManager.m98002a().mo95867a(f151a, OifaceManager.AType.UPLOAD_INFO);
        }
        if (bVar == AbstractC0079a.f148q) {
            return OifaceManager.m98002a().mo95870b(f167q, OifaceManager.AType.LOAD_INFO);
        }
        return false;
    }
}
