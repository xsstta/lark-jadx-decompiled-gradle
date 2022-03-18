package com.bytedance.ee.bear.drive.biz.versions;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.versions.VersionHistoryRepository;
import com.bytedance.ee.bear.drive.biz.versions.model.DriveVersionHistoryRecord;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import org.p3511d.AbstractC70020b;

public class VersionHistoryRepository {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<DriveVersionHistoryRecord>> f18576a;

    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.VersionHistoryRepository$a */
    private static class C6829a implements NetService.AbstractC5074c<NetService.Result<DriveVersionHistoryRecord>> {
        private C6829a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<DriveVersionHistoryRecord> parse(String str) throws NetService.ParseException {
            NetService.Result<DriveVersionHistoryRecord> result = (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<DriveVersionHistoryRecord>>() {
                /* class com.bytedance.ee.bear.drive.biz.versions.VersionHistoryRepository.C6829a.C68301 */
            }, new Feature[0]);
            if (result != null) {
                return result;
            }
            C13479a.m54758a("VersionHistoryRepository", "parse DriveVersionHistoryRecord error, " + str);
            throw new NetService.ParseException();
        }
    }

    public static class Params implements Serializable {
        @JSONField(name = "file_token")
        public String fileToken;
        @JSONField(name = "is_asc")
        public boolean isAsc;
        @JSONField(name = "last_edit_time")
        public long lastEditTime;
        @JSONField(name = "only_tag")
        public boolean onlyTag;
        @JSONField(name = "page_size")
        public int pageSize;

        public String toString() {
            return "Params{fileToken='" + C13598b.m55197d(this.fileToken) + '\'' + ", pageSize=" + this.pageSize + ", lastEditTime='" + this.lastEditTime + '\'' + ", isAsc=" + this.isAsc + ", onlyTag=" + this.onlyTag + '}';
        }
    }

    public VersionHistoryRepository(NetService netService) {
        this.f18576a = netService.mo20117a(new C6829a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m26965a(Params params, Throwable th) throws Exception {
        C13479a.m54758a("VersionHistoryRepository", String.format("VersionHistoryRepository.fetchHistory() error, msg: %s, params: ", th, params.toString()));
        return AbstractC68307f.m265084a(th);
    }

    /* renamed from: a */
    public AbstractC68307f<NetService.Result<DriveVersionHistoryRecord>> mo26875a(String str, int i, long j) {
        C13479a.m54764b("VersionHistoryRepository", "start fetch history...");
        Params params = new Params();
        params.fileToken = str;
        params.pageSize = i;
        params.lastEditTime = j;
        NetService.C5077f fVar = new NetService.C5077f("/api/box/file/history/");
        fVar.mo20153c(JSON.toJSONString(params));
        fVar.mo20143a(1);
        return this.f18576a.mo20141a(fVar).mo238026e(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.versions.$$Lambda$VersionHistoryRepository$FG3C9Bcha3CeNTrcoLGoWphQ0r0 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VersionHistoryRepository.lambda$FG3C9Bcha3CeNTrcoLGoWphQ0r0(VersionHistoryRepository.Params.this, (Throwable) obj);
            }
        });
    }
}
