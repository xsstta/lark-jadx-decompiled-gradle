package com.tt.refer.common.download.engine.model;

import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.util.C67044k;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import com.tt.refer.common.download.engine.p3423d.AbstractC67776d;
import java.util.Map;

public class DownloadRequest implements DownloadBean {
    private boolean allowedInMobile;
    private long completeSize;
    private C67779b downloadError;
    public String downloadMethod;
    private String downloadUrl;
    private String fileId;
    private String fileName;
    private String filePath;
    private AbstractC67776d<DownloadRequest> mTaskCreator;
    private int maxRetryTimes;
    private int priority;
    public String requestBody;
    public Map<String, String> requestHeader;
    private long speed;
    private int taskStatus;
    public C67781b timeoutConfig;
    private long totalSize;
    public IVerifyHandler verifyHandler;

    public C67779b getDownloadError() {
        return this.downloadError;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public String getDownloadPath() {
        return this.filePath;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public long getDownloadedSize() {
        return this.completeSize;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public long getFileSize() {
        return this.totalSize;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public String getId() {
        return this.fileId;
    }

    public int getMaxRetryTimes() {
        return this.maxRetryTimes;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public long getSpeed() {
        return this.speed;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public int getStatus() {
        return this.taskStatus;
    }

    public AbstractC67776d<DownloadRequest> getTaskCreator() {
        return this.mTaskCreator;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public boolean isAllowInMobile() {
        return this.allowedInMobile;
    }

    public int hashCode() {
        return this.fileId.hashCode();
    }

    public void clearErrorInfo() {
        this.downloadError.f170701a = "";
        this.downloadError.f170702b = "";
    }

    public float getDownloadPercent() {
        long j = this.totalSize;
        if (j == -1 || j == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        long j2 = this.completeSize;
        if (j2 != -1) {
            return (((float) j2) / ((float) j)) * 100.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public String getDownloadingPath() {
        return this.filePath + ".cfg";
    }

    public void resetDownloadStatus() {
        this.totalSize = 0;
        this.completeSize = 0;
        this.downloadError.f170701a = "";
        this.downloadError.f170702b = "";
        setStatus(0);
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public String getFileName() {
        if (TextUtils.isEmpty(this.fileName)) {
            if (!TextUtils.isEmpty(this.filePath)) {
                int lastIndexOf = this.filePath.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    this.fileName = this.filePath.substring(lastIndexOf + 1);
                } else {
                    this.fileName = "unknown";
                }
            } else {
                this.fileName = "unknown";
            }
        }
        return this.fileName;
    }

    /* renamed from: com.tt.refer.common.download.engine.model.DownloadRequest$a */
    public static class C67778a {

        /* renamed from: a */
        public int f170689a = 1;

        /* renamed from: b */
        public String f170690b;

        /* renamed from: c */
        public String f170691c;

        /* renamed from: d */
        public String f170692d;

        /* renamed from: e */
        public IVerifyHandler f170693e;

        /* renamed from: f */
        public C67781b f170694f;

        /* renamed from: g */
        public AbstractC67776d<DownloadRequest> f170695g;

        /* renamed from: h */
        public int f170696h;

        /* renamed from: i */
        public boolean f170697i = true;

        /* renamed from: j */
        public String f170698j;

        /* renamed from: k */
        public Map<String, String> f170699k;

        /* renamed from: l */
        public String f170700l;

        /* renamed from: a */
        public DownloadRequest mo235240a() {
            return new DownloadRequest(this);
        }

        /* renamed from: a */
        public C67778a mo235235a(int i) {
            this.f170689a = i;
            return this;
        }

        /* renamed from: b */
        public C67778a mo235241b(int i) {
            this.f170696h = i;
            return this;
        }

        /* renamed from: a */
        public C67778a mo235237a(AbstractC67776d<DownloadRequest> dVar) {
            this.f170695g = dVar;
            return this;
        }

        /* renamed from: b */
        public C67778a mo235242b(String str) {
            this.f170692d = str;
            return this;
        }

        public C67778a(String str) {
            this.f170690b = str;
        }

        /* renamed from: a */
        public C67778a mo235238a(IVerifyHandler iVerifyHandler) {
            this.f170693e = iVerifyHandler;
            return this;
        }

        /* renamed from: a */
        public C67778a mo235239a(String str) {
            this.f170691c = str;
            return this;
        }

        /* renamed from: a */
        public C67778a mo235236a(long j, long j2, long j3) {
            C67781b bVar = new C67781b();
            bVar.mo235251a(j);
            bVar.mo235253b(j2);
            bVar.mo235255c(j3);
            this.f170694f = bVar;
            return this;
        }
    }

    public String toString() {
        return "FileDownloadObject{fileId='" + this.fileId + '\'' + ", fileName='" + this.fileName + '\'' + ", filePath='" + this.filePath + '\'' + ", completeSize=" + this.completeSize + ", totalSize=" + this.totalSize + '\'' + ", speed=" + this.speed + ", taskStatus=" + this.taskStatus + ",method=" + this.downloadMethod + '}';
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public void setDownloadedSize(long j) {
        this.completeSize = j;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public void setFileSize(long j) {
        this.totalSize = j;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public void setSpeed(long j) {
        this.speed = j;
    }

    @Override // com.tt.refer.common.download.engine.model.DownloadBean
    public void setStatus(int i) {
        this.taskStatus = i;
    }

    /* renamed from: com.tt.refer.common.download.engine.model.DownloadRequest$b */
    public class C67779b {

        /* renamed from: a */
        public String f170701a;

        /* renamed from: b */
        public String f170702b;

        public C67779b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof DownloadRequest)) {
            return this.fileId.equals(((DownloadRequest) obj).fileId);
        }
        return false;
    }

    public void setErrorInfo(AbstractC67767c.C67768a aVar) {
        this.downloadError.f170701a = aVar.mo235193b();
        this.downloadError.f170702b = aVar.mo235192a();
    }

    private DownloadRequest(C67778a aVar) {
        this.completeSize = -1;
        this.totalSize = -1;
        this.downloadError = new C67779b();
        this.priority = 1;
        this.maxRetryTimes = 0;
        this.allowedInMobile = true;
        this.downloadMethod = "GET";
        this.downloadUrl = aVar.f170690b;
        this.fileName = aVar.f170691c;
        this.filePath = aVar.f170692d;
        this.priority = aVar.f170689a;
        this.allowedInMobile = aVar.f170697i;
        this.maxRetryTimes = aVar.f170696h;
        this.verifyHandler = aVar.f170693e;
        this.timeoutConfig = aVar.f170694f;
        this.mTaskCreator = aVar.f170695g;
        this.fileId = C67044k.m261294b(aVar.f170690b + this.filePath);
        if (!TextUtils.isEmpty(aVar.f170698j)) {
            this.downloadMethod = aVar.f170698j;
            if (aVar.f170698j.equals("POST")) {
                this.requestBody = aVar.f170700l;
            }
        }
        if (aVar.f170699k != null && !aVar.f170699k.isEmpty()) {
            this.requestHeader = aVar.f170699k;
        }
        setStatus(0);
    }

    public void setErrorInfo(String str, String str2) {
        this.downloadError.f170701a = str;
        this.downloadError.f170702b = str2;
    }

    public DownloadRequest(String str, String str2, String str3) {
        this.completeSize = -1;
        this.totalSize = -1;
        this.downloadError = new C67779b();
        this.priority = 1;
        this.maxRetryTimes = 0;
        this.allowedInMobile = true;
        this.downloadMethod = "GET";
        this.fileId = C67044k.m261294b(str);
        this.fileName = str2;
        this.filePath = str3;
        this.downloadUrl = str;
        setStatus(0);
    }
}
