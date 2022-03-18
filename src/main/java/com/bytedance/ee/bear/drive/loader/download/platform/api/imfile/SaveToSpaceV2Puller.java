package com.bytedance.ee.bear.drive.loader.download.platform.api.imfile;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.util.p716r.C13721c;
import org.koin.java.KoinJavaComponent;

public class SaveToSpaceV2Puller extends BasePuller<Params, Result> {

    public static class Result extends BasePuller.Result {
        public String file_token;
    }

    public static class Params extends BasePuller.Params {
        public String app_file_id;
        public String app_id;
        public String auth_extra;
        public boolean size_checker = ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40014a();

        public String toString() {
            return "Params{app_id='" + C13721c.m55650d(this.app_id) + '\'' + ", app_file_id='" + C13721c.m55650d(this.app_file_id) + '\'' + ", auth_extra='" + C13721c.m55650d(this.auth_extra) + '\'' + ", size_checker='" + this.size_checker + '\'' + '}';
        }

        public Params(String str, String str2, String str3) {
            this.app_id = str;
            this.app_file_id = str2;
            this.auth_extra = str3;
        }
    }

    public SaveToSpaceV2Puller(NetService netService) {
        super(netService, "/api/box/stream/sdk/file/save/");
    }
}
