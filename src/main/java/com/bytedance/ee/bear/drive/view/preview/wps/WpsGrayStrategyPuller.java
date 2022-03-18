package com.bytedance.ee.bear.drive.view.preview.wps;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import io.reactivex.AbstractC68307f;

public class WpsGrayStrategyPuller extends BasePuller<Params, Result> {

    public static class Params extends BasePuller.Params {
        public int third_source = 1;
    }

    public static class Result extends BasePuller.Result {
        public String env;

        public String toString() {
            return "Result{env='" + this.env + '\'' + '}';
        }
    }

    private WpsGrayStrategyPuller(NetService netService) {
        super(netService, "/api/box/third/gray_strategy");
    }

    /* renamed from: a */
    public static AbstractC68307f<Result> m30084a(NetService netService) {
        return new WpsGrayStrategyPuller(netService).mo26542a((BasePuller.Params) new Params());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27623a(NetService.C5077f fVar, Params params) {
        fVar.mo20153c((String) null);
        fVar.mo20143a(2);
        fVar.mo20145a("third_source", String.valueOf(params.third_source));
    }
}
