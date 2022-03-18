package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Map;

public class UploadRequestInfo {

    /* renamed from: a */
    public String f25152a;

    /* renamed from: b */
    public String f25153b;

    /* renamed from: c */
    public String f25154c;

    /* renamed from: d */
    public String f25155d;

    /* renamed from: e */
    public String f25156e;

    /* renamed from: f */
    public int f25157f;

    /* renamed from: g */
    public UploadType f25158g;

    /* renamed from: h */
    public Map<String, String> f25159h;

    /* renamed from: i */
    public Map<String, String> f25160i;

    /* renamed from: j */
    public UploadCallback f25161j;

    public enum UploadType {
        DRIVE(0),
        IMG(1);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static UploadType fromInt(int i) {
            if (i != 1) {
                return DRIVE;
            }
            return IMG;
        }

        private UploadType(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "Params{localPath='" + this.f25152a + '\'' + "uri='" + this.f25153b + '\'' + ", fileName='" + this.f25154c + '\'' + ", mountNodeToken='" + C13598b.m55197d(this.f25155d) + '\'' + ", mountPoint='" + this.f25156e + '\'' + ", priority='" + this.f25157f + '\'' + ", uploadType='" + this.f25158g + '\'' + ", extraRust='" + this.f25160i + '\'' + '}';
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo$a */
    public static final class C9359a {

        /* renamed from: a */
        public String f25162a = "";

        /* renamed from: b */
        public String f25163b = "";

        /* renamed from: c */
        public String f25164c = "";

        /* renamed from: d */
        public String f25165d = "";

        /* renamed from: e */
        public String f25166e = "";

        /* renamed from: f */
        public int f25167f = DrivePriority.UploadPriority.DEFAULT.getPriority();

        /* renamed from: g */
        public UploadType f25168g = UploadType.DRIVE;

        /* renamed from: h */
        public Map<String, String> f25169h = null;

        /* renamed from: i */
        public Map<String, String> f25170i = null;

        /* renamed from: j */
        public UploadCallback f25171j = null;

        /* renamed from: a */
        public UploadRequestInfo mo35741a() {
            return new UploadRequestInfo(this.f25162a, this.f25163b, this.f25164c, this.f25165d, this.f25166e, this.f25167f, this.f25168g, this.f25169h, this.f25170i, this.f25171j);
        }

        /* renamed from: a */
        public C9359a mo35735a(int i) {
            this.f25167f = i;
            return this;
        }

        /* renamed from: b */
        public C9359a mo35742b(String str) {
            this.f25163b = str;
            return this;
        }

        /* renamed from: c */
        public C9359a mo35744c(String str) {
            this.f25164c = str;
            return this;
        }

        /* renamed from: d */
        public C9359a mo35745d(String str) {
            this.f25165d = str;
            return this;
        }

        /* renamed from: e */
        public C9359a mo35746e(String str) {
            this.f25166e = str;
            return this;
        }

        /* renamed from: a */
        public C9359a mo35736a(DrivePriority.UploadPriority uploadPriority) {
            this.f25167f = uploadPriority.getPriority();
            return this;
        }

        /* renamed from: b */
        public C9359a mo35743b(Map<String, String> map) {
            this.f25170i = map;
            return this;
        }

        /* renamed from: a */
        public C9359a mo35737a(UploadCallback uploadCallback) {
            this.f25171j = uploadCallback;
            return this;
        }

        /* renamed from: a */
        public C9359a mo35738a(UploadType uploadType) {
            this.f25168g = uploadType;
            return this;
        }

        /* renamed from: a */
        public C9359a mo35739a(String str) {
            this.f25162a = str;
            return this;
        }

        /* renamed from: a */
        public C9359a mo35740a(Map<String, String> map) {
            this.f25169h = map;
            return this;
        }
    }

    private UploadRequestInfo(String str, String str2, String str3, String str4, String str5, int i, UploadType uploadType, Map<String, String> map, Map<String, String> map2, UploadCallback uploadCallback) {
        this.f25152a = str;
        this.f25153b = str2;
        this.f25154c = str3;
        this.f25155d = str4;
        this.f25156e = str5;
        this.f25157f = i;
        this.f25158g = uploadType;
        this.f25159h = map;
        this.f25160i = map2;
        this.f25161j = uploadCallback;
    }
}
