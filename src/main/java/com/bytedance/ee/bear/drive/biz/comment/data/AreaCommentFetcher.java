package com.bytedance.ee.bear.drive.biz.comment.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.comment.area.AreaCoordinate;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;

public class AreaCommentFetcher {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<ArrayList<AreaComment>>> f17647a;

    /* renamed from: b */
    private NetService.AbstractC5075d<NetService.Result> f17648b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.AreaCommentFetcher$a */
    public static class C6372a implements Serializable {
        @JSONField(name = "comment_id")
        private String commentId;
        private C6373a extra;
        @JSONField(name = "file_token")
        private String fileToken;
        private String version;

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.AreaCommentFetcher$a$a */
        public static class C6373a implements Serializable {
            @JSONField(name = "drive_area_coordinate")
            private AreaCoordinate areaCoordinate;

            private C6373a() {
            }

            public AreaCoordinate getAreaCoordinate() {
                return this.areaCoordinate;
            }

            public void setAreaCoordinate(AreaCoordinate areaCoordinate2) {
                this.areaCoordinate = areaCoordinate2;
            }
        }

        private C6372a() {
        }

        public String getCommentId() {
            return this.commentId;
        }

        public C6373a getExtra() {
            return this.extra;
        }

        public String getFileToken() {
            return this.fileToken;
        }

        public String getVersion() {
            return this.version;
        }

        public void setCommentId(String str) {
            this.commentId = str;
        }

        public void setExtra(C6373a aVar) {
            this.extra = aVar;
        }

        public void setFileToken(String str) {
            this.fileToken = str;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public static class AreaComment implements Serializable {
        @JSONField(name = "drive_area_coordinate")
        private AreaCoordinate areaCoordinate;
        @JSONField(name = "comment_id")
        private String commentId;

        public AreaCoordinate getAreaCoordinate() {
            return this.areaCoordinate;
        }

        public String getCommentId() {
            return this.commentId;
        }

        public void setAreaCoordinate(AreaCoordinate areaCoordinate2) {
            this.areaCoordinate = areaCoordinate2;
        }

        public void setCommentId(String str) {
            this.commentId = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.AreaCommentFetcher$b */
    private static class C6374b implements NetService.AbstractC5074c<NetService.Result<ArrayList<AreaComment>>> {
        private C6374b() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<ArrayList<AreaComment>> parse(String str) throws NetService.ParseException {
            C13479a.m54772d("AreaCommentFetcher", "get comment " + str);
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<ArrayList<AreaComment>>>() {
                /* class com.bytedance.ee.bear.drive.biz.comment.data.AreaCommentFetcher.C6374b.C63751 */
            }, new Feature[0]);
        }
    }

    public AreaCommentFetcher(NetService netService) {
        this.f17647a = netService.mo20117a(new C6374b());
        this.f17648b = netService.mo20118a(NetService.Result.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ NetService.Result m25601a(NetService.C5077f fVar, NetService.Result result) throws Exception {
        if (result != null && result.getCode() == 0) {
            return result;
        }
        throw new Exception("add area comment server error, result=" + fVar);
    }

    /* renamed from: a */
    public AbstractC68307f<ArrayList<AreaComment>> mo25587a(String str, String str2) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "get rect comment starting...");
        NetService.C5077f fVar = new NetService.C5077f("/api/box/comment/get/");
        fVar.mo20145a("file_token", str);
        if (!TextUtils.isEmpty(str2)) {
            fVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str2);
        }
        fVar.mo20143a(2);
        return this.f17647a.mo20141a(fVar).mo238020d($$Lambda$twKQ9kfd6N1RQCqqZAeKMyMtWU.INSTANCE);
    }

    /* renamed from: a */
    public AbstractC68307f<ArrayList<AreaComment>> mo25588a(String str, String str2, String str3) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "get rect comment starting...");
        if (TextUtils.isEmpty(str3)) {
            return AbstractC68307f.m265084a((Throwable) new Exception("getCommentById id is empty"));
        }
        NetService.C5077f fVar = new NetService.C5077f("/api/box/comment/get/");
        fVar.mo20145a("file_token", str);
        if (!TextUtils.isEmpty(str2)) {
            fVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str2);
        }
        fVar.mo20145a("comment_id", str3);
        fVar.mo20143a(2);
        return this.f17647a.mo20141a(fVar).mo238020d($$Lambda$twKQ9kfd6N1RQCqqZAeKMyMtWU.INSTANCE);
    }

    /* renamed from: a */
    public AbstractC68307f<NetService.Result> mo25589a(String str, String str2, String str3, AreaCoordinate areaCoordinate) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "add rect comment starting...");
        NetService.C5077f fVar = new NetService.C5077f("/api/box/comment/add/");
        C6372a aVar = new C6372a();
        aVar.setFileToken(str);
        aVar.setVersion(str2);
        aVar.setCommentId(str3);
        C6372a.C6373a aVar2 = new C6372a.C6373a();
        aVar2.setAreaCoordinate(areaCoordinate);
        aVar.setExtra(aVar2);
        fVar.mo20153c(JSON.toJSONString(aVar));
        fVar.mo20143a(1);
        return this.f17648b.mo20141a(fVar).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$AreaCommentFetcher$II_K469tXIzGQrHSJ6s26SZG30 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AreaCommentFetcher.m269343lambda$II_K469tXIzGQrHSJ6s26SZG30(NetService.C5077f.this, (NetService.Result) obj);
            }
        });
    }
}
