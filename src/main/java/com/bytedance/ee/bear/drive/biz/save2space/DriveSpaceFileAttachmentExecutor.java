package com.bytedance.ee.bear.drive.biz.save2space;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public class DriveSpaceFileAttachmentExecutor {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<AttachSaveResponse>> f18349a;

    public static class AttachSaveResponse implements Serializable {
        @JSONField(name = "file_token")
        private String fileToken;
        private String version;

        public String getFileToken() {
            return this.fileToken;
        }

        public String getVersion() {
            return this.version;
        }

        public String toString() {
            return "AttachSaveResponse{fileToken='" + C13721c.m55650d(this.fileToken) + '\'' + ", version='" + this.version + '\'' + '}';
        }

        public void setFileToken(String str) {
            this.fileToken = str;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.save2space.DriveSpaceFileAttachmentExecutor$a */
    private static class C6741a implements NetService.AbstractC5074c<NetService.Result<AttachSaveResponse>> {
        private C6741a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<AttachSaveResponse> parse(String str) throws NetService.ParseException {
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<AttachSaveResponse>>() {
                /* class com.bytedance.ee.bear.drive.biz.save2space.DriveSpaceFileAttachmentExecutor.C6741a.C67421 */
            }, new Feature[0]);
        }
    }

    public DriveSpaceFileAttachmentExecutor(NetService netService) {
        this.f18349a = netService.mo20117a(new C6741a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AttachSaveResponse m26558a(NetService.C5077f fVar, NetService.Result result) throws Exception {
        if (result != null && result.getCode() == 0 && result.getData() != null) {
            return (AttachSaveResponse) result.getData();
        }
        throw new Exception("saveAttachFileToCloudSpace, result=" + fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m26559a(String str, String str2, String str3, Throwable th) throws Exception {
        C13479a.m54758a("AttachmentExecutor", String.format("AttachmentExecutor.saveAttachFileToCloudSpace() error, msg: %s, params: { token: %s, mountNodePoint: %s, name: %s }", th, C13598b.m55197d(str), str2, str3));
        return AbstractC68307f.m265084a(th);
    }

    /* renamed from: a */
    public AbstractC68307f<AttachSaveResponse> mo26533a(String str, String str2, String str3, String str4) {
        C13479a.m54764b("TAG_ATTACH_FLOW", "saveAttachFileToCloudSpace: starting...");
        HashMap hashMap = new HashMap();
        hashMap.put("file_token", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("mount_node_token", str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("extra", str4);
        }
        hashMap.put("name", str3);
        hashMap.put("size_checker", Boolean.valueOf(((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40014a()));
        NetService.C5077f fVar = new NetService.C5077f("/api/box/file/save/");
        fVar.mo20153c(JSON.toJSONString(hashMap));
        fVar.mo20143a(1);
        return this.f18349a.mo20141a(fVar).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveSpaceFileAttachmentExecutor$R6L1B7z8lJEGFidiIi_LPBwkxfE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DriveSpaceFileAttachmentExecutor.m26558a(NetService.C5077f.this, (NetService.Result) obj);
            }
        }).mo238026e(new Function(str, str2, str3) {
            /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveSpaceFileAttachmentExecutor$t9aTMv4cR6uAfU_atL6ex_KYv7o */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DriveSpaceFileAttachmentExecutor.m26559a(this.f$0, this.f$1, this.f$2, (Throwable) obj);
            }
        });
    }
}
