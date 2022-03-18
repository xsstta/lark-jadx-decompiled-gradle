package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.util.p700c.C13598b;

public class DownloadRequestInfo {

    /* renamed from: a */
    public String f25109a;

    /* renamed from: b */
    public String f25110b;

    /* renamed from: c */
    public String f25111c;

    /* renamed from: d */
    public String f25112d;

    /* renamed from: e */
    public int f25113e;

    /* renamed from: f */
    public String f25114f;

    /* renamed from: g */
    public DownloadType f25115g;

    /* renamed from: h */
    public String f25116h;

    /* renamed from: i */
    public long f25117i;

    /* renamed from: j */
    public boolean f25118j;

    /* renamed from: k */
    public String f25119k;

    /* renamed from: l */
    public int f25120l;

    /* renamed from: m */
    public DownloadCallback f25121m;

    /* renamed from: n */
    public C9356b f25122n;

    /* renamed from: o */
    public boolean f25123o;

    /* renamed from: p */
    public String f25124p;

    public enum DownloadType {
        DRIVE(0),
        COVER(1),
        PREVIEW(2),
        IMG(3),
        RANGE(4);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static DownloadType fromInt(int i) {
            if (i == 1) {
                return COVER;
            }
            if (i == 2) {
                return PREVIEW;
            }
            if (i != 3) {
                return DRIVE;
            }
            return IMG;
        }

        private DownloadType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$b */
    public static class C9356b {

        /* renamed from: a */
        public int f25142a;

        /* renamed from: b */
        public int f25143b;

        /* renamed from: c */
        public String f25144c;

        /* renamed from: d */
        public boolean f25145d;

        public String toString() {
            return "DownloadCoverInfo{width=" + this.f25142a + ", height=" + this.f25143b + ", policy='" + this.f25144c + '\'' + ", retryOrigin='" + this.f25145d + '\'' + '}';
        }

        public C9356b(int i, int i2, String str) {
            this(i, i2, str, true);
        }

        public C9356b(int i, int i2, String str, boolean z) {
            this.f25142a = i;
            this.f25143b = i2;
            this.f25144c = str;
            this.f25145d = z;
        }
    }

    public String toString() {
        return "Params{fileToken='" + C13598b.m55197d(this.f25110b) + '\'' + ", localPath='" + C13598b.m55197d(this.f25109a) + '\'' + ", priority='" + this.f25113e + '\'' + ", dataVersion='" + this.f25114f + '\'' + ", mountNodeToken='" + C13598b.m55197d(this.f25111c) + '\'' + ", mountPoint='" + this.f25112d + '\'' + ", downloadType='" + this.f25115g + '\'' + ", docToken='" + C13598b.m55197d(this.f25119k) + '\'' + ", docType='" + this.f25120l + '\'' + ", slice='" + this.f25118j + '\'' + ", coverInfo='" + this.f25122n + '\'' + ", disableCdn='" + this.f25123o + '\'' + '}';
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$a */
    public static final class C9355a {

        /* renamed from: a */
        public String f25125a = "";

        /* renamed from: b */
        public String f25126b = "";

        /* renamed from: c */
        public String f25127c = "";

        /* renamed from: d */
        public String f25128d = "";

        /* renamed from: e */
        public String f25129e = "";

        /* renamed from: f */
        public int f25130f = DrivePriority.DownloadPriority.DEFAULT.getPriority();

        /* renamed from: g */
        public String f25131g = "";

        /* renamed from: h */
        public DownloadType f25132h = DownloadType.DRIVE;

        /* renamed from: i */
        public String f25133i = "";

        /* renamed from: j */
        public long f25134j = 0;

        /* renamed from: k */
        public boolean f25135k = false;

        /* renamed from: l */
        public String f25136l = "";

        /* renamed from: m */
        public int f25137m = 2;

        /* renamed from: n */
        public DownloadCallback f25138n = null;

        /* renamed from: o */
        public C9356b f25139o = null;

        /* renamed from: p */
        public boolean f25140p = false;

        /* renamed from: q */
        public String f25141q;

        /* renamed from: a */
        public DownloadRequestInfo mo35664a() {
            return new DownloadRequestInfo(this.f25126b, this.f25127c, this.f25128d, this.f25129e, this.f25130f, this.f25131g, this.f25132h, this.f25133i, this.f25134j, this.f25135k, this.f25136l, this.f25137m, this.f25138n, this.f25139o, this.f25140p, this.f25141q);
        }

        /* renamed from: a */
        public C9355a mo35656a(int i) {
            this.f25130f = i;
            return this;
        }

        /* renamed from: b */
        public C9355a mo35665b(int i) {
            this.f25137m = i;
            return this;
        }

        /* renamed from: c */
        public C9355a mo35668c(String str) {
            this.f25128d = str;
            return this;
        }

        /* renamed from: d */
        public C9355a mo35669d(String str) {
            this.f25129e = str;
            return this;
        }

        /* renamed from: e */
        public C9355a mo35670e(String str) {
            this.f25131g = str;
            return this;
        }

        /* renamed from: f */
        public C9355a mo35671f(String str) {
            this.f25133i = str;
            return this;
        }

        /* renamed from: g */
        public C9355a mo35672g(String str) {
            this.f25136l = str;
            return this;
        }

        /* renamed from: h */
        public C9355a mo35673h(String str) {
            this.f25141q = str;
            return this;
        }

        /* renamed from: a */
        public C9355a mo35657a(long j) {
            this.f25134j = j;
            return this;
        }

        /* renamed from: b */
        public C9355a mo35666b(String str) {
            this.f25127c = str;
            return this;
        }

        /* renamed from: a */
        public C9355a mo35658a(DownloadCallback downloadCallback) {
            this.f25138n = downloadCallback;
            return this;
        }

        /* renamed from: b */
        public C9355a mo35667b(boolean z) {
            this.f25140p = z;
            return this;
        }

        /* renamed from: a */
        public C9355a mo35659a(DownloadType downloadType) {
            this.f25132h = downloadType;
            return this;
        }

        /* renamed from: a */
        public C9355a mo35660a(C9356b bVar) {
            this.f25139o = bVar;
            return this;
        }

        /* renamed from: a */
        public C9355a mo35661a(DrivePriority.DownloadPriority downloadPriority) {
            this.f25130f = downloadPriority.getPriority();
            return this;
        }

        /* renamed from: a */
        public C9355a mo35662a(String str) {
            this.f25126b = str;
            return this;
        }

        /* renamed from: a */
        public C9355a mo35663a(boolean z) {
            this.f25135k = z;
            return this;
        }
    }

    private DownloadRequestInfo(String str, String str2, String str3, String str4, int i, String str5, DownloadType downloadType, String str6, long j, boolean z, String str7, int i2, DownloadCallback downloadCallback, C9356b bVar, boolean z2, String str8) {
        this.f25109a = str;
        this.f25110b = str2;
        this.f25111c = str3;
        this.f25112d = str4;
        this.f25113e = i;
        this.f25114f = str5;
        this.f25115g = downloadType;
        this.f25116h = str6;
        this.f25117i = j;
        this.f25118j = z;
        this.f25119k = str7;
        this.f25120l = i2;
        this.f25121m = downloadCallback;
        this.f25122n = bVar;
        this.f25123o = z2;
        this.f25124p = str8;
    }
}
