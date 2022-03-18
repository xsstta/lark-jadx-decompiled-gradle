package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0001EB{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r¢\u0006\u0002\u0010\u0015J\u0006\u0010?\u001a\u00020\u0005J\u0012\u0010@\u001a\u00020A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010AJ\b\u0010C\u001a\u0004\u0018\u00010\u0010J\b\u0010D\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006F"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "", "srcUri", "Landroid/net/Uri;", "filePath", "", ShareHitPoint.f121869d, "Lcom/bytedance/ies/bullet/service/base/ResourceType;", "from", "Lcom/bytedance/ies/bullet/service/base/ResourceFrom;", "isCache", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "statisic", "fileStream", "Ljava/io/InputStream;", "model", "Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;", "successLoader", "startLoadTime", "(Landroid/net/Uri;Ljava/lang/String;Lcom/bytedance/ies/bullet/service/base/ResourceType;Lcom/bytedance/ies/bullet/service/base/ResourceFrom;ZJZLjava/io/InputStream;Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;Ljava/lang/String;J)V", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "getFileStream", "()Ljava/io/InputStream;", "setFileStream", "(Ljava/io/InputStream;)V", "getFrom", "()Lcom/bytedance/ies/bullet/service/base/ResourceFrom;", "setFrom", "(Lcom/bytedance/ies/bullet/service/base/ResourceFrom;)V", "()Z", "setCache", "(Z)V", "getModel", "()Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;", "setModel", "(Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;)V", "getSrcUri", "()Landroid/net/Uri;", "getStartLoadTime", "()J", "setStartLoadTime", "(J)V", "getStatisic", "setStatisic", "getSuccessLoader", "setSuccessLoader", "getType", "()Lcom/bytedance/ies/bullet/service/base/ResourceType;", "setType", "(Lcom/bytedance/ies/bullet/service/base/ResourceType;)V", "getVersion", "setVersion", "webResourceResponse", "Landroid/webkit/WebResourceResponse;", "getWebResourceResponse", "()Landroid/webkit/WebResourceResponse;", "setWebResourceResponse", "(Landroid/webkit/WebResourceResponse;)V", "getStatisticFrom", "provideFile", "Ljava/io/File;", "rootFile", "provideInputStream", "toString", "Companion", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.m */
public final class ResourceInfo {

    /* renamed from: a */
    public static final Companion f37899a = new Companion(null);

    /* renamed from: b */
    private final Uri f37900b;

    /* renamed from: c */
    private String f37901c;

    /* renamed from: d */
    private ResourceType f37902d;

    /* renamed from: e */
    private ResourceFrom f37903e;

    /* renamed from: f */
    private boolean f37904f;

    /* renamed from: g */
    private long f37905g;

    /* renamed from: h */
    private boolean f37906h;

    /* renamed from: i */
    private InputStream f37907i;

    /* renamed from: j */
    private ChannelBundleModel f37908j;

    /* renamed from: k */
    private String f37909k;

    /* renamed from: l */
    private long f37910l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ResourceInfo$Companion;", "", "()V", "RESOURCE_FROM_ASSET", "", "RESOURCE_FROM_CDN", "RESOURCE_FROM_CDN_CACHE", "RESOURCE_FROM_GECKO", "RESOURCE_FROM_GECKO_UPDATE", "RESOURCE_FROM_OFFLINE", "RESOURCE_FROM_UNKNOWN", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.m$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Uri mo52702b() {
        return this.f37900b;
    }

    /* renamed from: c */
    public final String mo52705c() {
        return this.f37901c;
    }

    /* renamed from: d */
    public final ResourceType mo52706d() {
        return this.f37902d;
    }

    /* renamed from: e */
    public final ResourceFrom mo52707e() {
        return this.f37903e;
    }

    /* renamed from: f */
    public final long mo52708f() {
        return this.f37905g;
    }

    /* renamed from: g */
    public final boolean mo52709g() {
        return this.f37906h;
    }

    /* renamed from: h */
    public final InputStream mo52710h() {
        return this.f37907i;
    }

    /* renamed from: i */
    public final ChannelBundleModel mo52711i() {
        return this.f37908j;
    }

    /* renamed from: j */
    public final String mo52712j() {
        return this.f37909k;
    }

    /* renamed from: k */
    public final long mo52713k() {
        return this.f37910l;
    }

    /* renamed from: a */
    public final String mo52694a() {
        ResourceFrom resourceFrom = this.f37903e;
        if (resourceFrom != null) {
            int i = C14419n.f37912b[resourceFrom.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return "unknown";
                        }
                        return "offline";
                    } else if (this.f37904f) {
                        return "cdnCache";
                    } else {
                        return "cdn";
                    }
                } else if (this.f37902d == ResourceType.ASSET) {
                    return "buildin";
                } else {
                    return "offline";
                }
            } else if (this.f37904f) {
                return "gecko";
            } else {
                return "geckoUpdate";
            }
        }
        return "unknown";
    }

    public String toString() {
        return "[srcUri=" + this.f37900b + ", filePath=" + this.f37901c + ", type=" + this.f37902d + ',' + "from=" + this.f37903e + ", fileStream=" + this.f37907i + ", model=" + this.f37908j + ']';
    }

    /* renamed from: a */
    public final void mo52695a(long j) {
        this.f37905g = j;
    }

    /* renamed from: a */
    public final void mo52696a(ResourceFrom resourceFrom) {
        this.f37903e = resourceFrom;
    }

    /* renamed from: b */
    public final void mo52703b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37909k = str;
    }

    /* renamed from: b */
    public final void mo52704b(boolean z) {
        this.f37906h = z;
    }

    /* renamed from: a */
    public final void mo52697a(ResourceType resourceType) {
        this.f37902d = resourceType;
    }

    /* renamed from: a */
    public final File mo52693a(File file) {
        String str = this.f37901c;
        if (str == null) {
            str = "";
        }
        ResourceType resourceType = this.f37902d;
        if (resourceType == null || C14419n.f37911a[resourceType.ordinal()] != 1) {
            return new File(str);
        }
        if (file != null) {
            return new File(file, str);
        }
        return new File(str);
    }

    /* renamed from: a */
    public final void mo52698a(ChannelBundleModel aVar) {
        this.f37908j = aVar;
    }

    /* renamed from: a */
    public final void mo52699a(InputStream inputStream) {
        this.f37907i = inputStream;
    }

    /* renamed from: a */
    public final void mo52700a(String str) {
        this.f37901c = str;
    }

    /* renamed from: a */
    public final void mo52701a(boolean z) {
        this.f37904f = z;
    }

    /* renamed from: a */
    public static /* synthetic */ File m58083a(ResourceInfo mVar, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            file = null;
        }
        return mVar.mo52693a(file);
    }

    public ResourceInfo(Uri uri, String str, ResourceType resourceType, ResourceFrom resourceFrom, boolean z, long j, boolean z2, InputStream inputStream, ChannelBundleModel aVar, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(uri, "srcUri");
        Intrinsics.checkParameterIsNotNull(str2, "successLoader");
        this.f37900b = uri;
        this.f37901c = str;
        this.f37902d = resourceType;
        this.f37903e = resourceFrom;
        this.f37904f = z;
        this.f37905g = j;
        this.f37906h = z2;
        this.f37907i = inputStream;
        this.f37908j = aVar;
        this.f37909k = str2;
        this.f37910l = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResourceInfo(android.net.Uri r14, java.lang.String r15, com.bytedance.ies.bullet.service.base.ResourceType r16, com.bytedance.ies.bullet.service.base.ResourceFrom r17, boolean r18, long r19, boolean r21, java.io.InputStream r22, com.bytedance.ies.bullet.service.base.ChannelBundleModel r23, java.lang.String r24, long r25, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.base.ResourceInfo.<init>(android.net.Uri, java.lang.String, com.bytedance.ies.bullet.service.base.ResourceType, com.bytedance.ies.bullet.service.base.ResourceFrom, boolean, long, boolean, java.io.InputStream, com.bytedance.ies.bullet.service.base.a, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
