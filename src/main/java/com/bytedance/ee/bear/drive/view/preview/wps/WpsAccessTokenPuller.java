package com.bytedance.ee.bear.drive.view.preview.wps;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.wps.WpsAccessTokenPuller;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

public class WpsAccessTokenPuller extends BasePuller<Params, Result> {

    public static class Params extends BasePuller.Params {
        public String auth_extra;
        public String file_token;
        public boolean need_edit;
        public int third_source;

        public String toString() {
            return "Params{file_token='" + C13721c.m55650d(this.file_token) + '\'' + ", auth_extra='" + C13721c.m55650d(this.auth_extra) + '\'' + ", need_edit='" + this.need_edit + '\'' + '}';
        }

        public Params(String str, String str2, boolean z) {
            this.file_token = str;
            this.need_edit = z;
            this.auth_extra = TextUtils.isEmpty(str2) ? "" : str2;
            this.third_source = 1;
        }
    }

    public static class Result extends BasePuller.Result {
        public long expire;
        public boolean has_quota;
        public String token;

        public String toString() {
            return "Result{token='" + C13721c.m55650d(this.token) + '\'' + ", has_quota=" + this.has_quota + ", expire=" + this.expire + '}';
        }
    }

    public static class DriveSdkParams extends Params {
        public String app_file_id;
        public String app_id;

        @Override // com.bytedance.ee.bear.drive.view.preview.wps.WpsAccessTokenPuller.Params
        public String toString() {
            return "DriveSdkParams{app_id='" + C13721c.m55650d(this.app_id) + '\'' + ", app_file_id='" + C13721c.m55650d(this.app_file_id) + '\'' + ", auth_extra='" + C13721c.m55650d(this.auth_extra) + '\'' + ", need_edit='" + this.need_edit + '\'' + '}';
        }

        public DriveSdkParams(String str, String str2, String str3, boolean z) {
            super("", str3, z);
            this.app_id = str;
            this.app_file_id = str2;
        }
    }

    public WpsAccessTokenPuller(NetService netService) {
        super(netService, "/api/box/third/access_token/");
    }

    /* renamed from: a */
    public static AbstractC68307f<Result> m30082a(NetService netService, Params params) {
        return new WpsAccessTokenPuller(netService).mo26542a((BasePuller.Params) params).mo238026e(new Function() {
            /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsAccessTokenPuller$EOHlatnsAwzySftWWkqXLopBvCo */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return WpsAccessTokenPuller.lambda$EOHlatnsAwzySftWWkqXLopBvCo(WpsAccessTokenPuller.Params.this, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m30083a(Params params, Throwable th) throws Exception {
        C13479a.m54758a("DrivePlatform_BasePuller", String.format("wps getAccessToken error, msg: %s, params: %s", th, params.toString()));
        if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            if (code == 90001061) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.WPS_PREVIEW_GET_ACCESS_TOKEN_USER_MEMORY_OVER_LIMIT, th));
            }
            if (code == 11001) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.WPS_PREVIEW_GET_ACCESS_TOKEN_TENANT_MEMORY_OVER_LIMIT, th));
            }
        }
        return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.WPS_PREVIEW_GET_ACCESS_TOKEN_EXP, th));
    }
}
