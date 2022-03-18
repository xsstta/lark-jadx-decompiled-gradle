package com.bytedance.ee.bear.drive.biz.permission;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.permission.model.ThirdPartyAttachmentPermission;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.HashMap;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.permission.e */
public class C6518e {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<ThirdPartyAttachmentPermission>> f17954a;

    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.e$a */
    public static class C6519a implements NetService.AbstractC5074c<NetService.Result<ThirdPartyAttachmentPermission>> {
        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<ThirdPartyAttachmentPermission> parse(String str) throws NetService.ParseException {
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<ThirdPartyAttachmentPermission>>() {
                /* class com.bytedance.ee.bear.drive.biz.permission.C6518e.C6519a.C65201 */
            }, new Feature[0]);
        }
    }

    public C6518e(NetService netService) {
        this.f17954a = netService.mo20117a(new C6519a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m26143a(String str, Throwable th) throws Exception {
        C13479a.m54758a("ThirdPartyAttachmentPermissionExecutor", String.format("ThirdPartyAttachmentPermissionExecutor.fetchThirdPartyAttachmentPermission() error, msg: %s, params: { token: %s }", th, C13598b.m55197d(str)));
        return AbstractC68307f.m265084a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ThirdPartyAttachmentPermission m26142a(NetService.C5077f fVar, NetService.Result result) throws Exception {
        if (result != null && result.getCode() == 0 && result.getData() != null) {
            return (ThirdPartyAttachmentPermission) result.getData();
        }
        throw new Exception("fetchThirdPartyAttachmentPermission, result=" + fVar);
    }

    /* renamed from: a */
    public AbstractC68307f<ThirdPartyAttachmentPermission> mo26028a(String str, String str2, String str3, String str4) {
        C13479a.m54764b("TAG_ATTACH_FLOW", "saveAttachFileToCloudSpace: starting...");
        HashMap hashMap = new HashMap();
        hashMap.put("file_token", str);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("extra", str3);
        }
        NetService.C5077f fVar = new NetService.C5077f("/api/box/file/permission/");
        fVar.mo20153c(JSON.toJSONString(hashMap));
        if (!TextUtils.isEmpty(str4)) {
            fVar.mo20145a("mount_point", str4);
        }
        fVar.mo20143a(1);
        return this.f17954a.mo20141a(fVar).mo237985a(C11678b.m48478b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.permission.$$Lambda$e$MoM6nga78ZyqynykdOUWrzxPtic */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6518e.m26142a(NetService.C5077f.this, (NetService.Result) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238026e(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.permission.$$Lambda$e$K9SW9GJxiw9BZV9fWQTU582zek */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6518e.m26143a(this.f$0, (Throwable) obj);
            }
        });
    }
}
