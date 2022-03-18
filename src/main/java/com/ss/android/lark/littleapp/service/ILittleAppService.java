package com.ss.android.lark.littleapp.service;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.ss.android.lark.littleapp.entity.RouteDriveSDKModel;
import com.ss.android.lark.littleapp.entity.RouteFileDetailModel;
import com.ss.android.lark.littleapp.entity.RoutePasswordVerifyModel;
import com.ss.android.lark.littleapp.entity.RouteProfileModel;
import com.ss.android.lark.littleapp.entity.RouteQRModel;
import com.ss.android.lark.littleapp.entity.RouteShareModel;
import com.ss.android.lark.littleapp.entity.ShareAppModel;
import com.tt.refer.common.base.AppType;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface ILittleAppService {

    public @interface Scene {
    }

    /* renamed from: com.ss.android.lark.littleapp.service.ILittleAppService$a */
    public interface AbstractC41416a extends AbstractC41418c {
        /* renamed from: a */
        AbstractC13304a mo144254a();

        /* renamed from: a */
        String mo144255a(DomainSettings.Alias alias);

        /* renamed from: a */
        void mo144256a(Context context);

        /* renamed from: a */
        void mo144257a(Context context, Bundle bundle);

        /* renamed from: a */
        void mo144258a(Context context, String str, float f, long j, String str2, long j2, AbstractC41371j.AbstractC41380i iVar);

        /* renamed from: a */
        void mo144259a(Context context, String str, String str2);

        /* renamed from: a */
        void mo144260a(Context context, String str, String str2, String str3);

        /* renamed from: a */
        void mo144261a(Context context, String str, String str2, String str3, Map<String, String> map, int i, int i2);

        /* renamed from: a */
        void mo144262a(AbstractC41371j.AbstractC41376e eVar);

        /* renamed from: a */
        void mo144263a(AbstractC41371j.AbstractC41377f fVar);

        /* renamed from: a */
        void mo144264a(AbstractC41417b bVar);

        /* renamed from: a */
        void mo144267a(String str, int i, JSONObject jSONObject);

        /* renamed from: a */
        void mo144268a(String str, AbstractC41371j.AbstractC41378g gVar);

        /* renamed from: a */
        void mo144269a(String str, JSONObject jSONObject);

        /* renamed from: a */
        void mo144270a(String str, JSONObject jSONObject, JSONObject jSONObject2);

        /* renamed from: a */
        void mo144272a(boolean z);

        /* renamed from: a */
        boolean mo144273a(Context context, ShareAppModel shareAppModel, int i);

        /* renamed from: a */
        boolean mo144274a(Context context, String str);

        /* renamed from: a */
        boolean mo144275a(Context context, String str, String str2, String str3, int i);

        /* renamed from: a */
        boolean mo144276a(Context context, String str, String str2, String str3, boolean z);

        /* renamed from: a */
        boolean mo144277a(Context context, String str, String str2, boolean z);

        /* renamed from: a */
        boolean mo144278a(Uri uri);

        /* renamed from: b */
        void mo144280b(String str, JSONObject jSONObject);

        /* renamed from: b */
        boolean mo144281b();

        /* renamed from: b */
        boolean mo144283b(Context context, String str, String str2);

        /* renamed from: b */
        boolean mo144284b(Context context, String str, String str2, boolean z);

        /* renamed from: b */
        boolean mo144285b(String str, boolean z);

        /* renamed from: c */
        String mo144286c();

        /* renamed from: c */
        boolean mo144287c(Context context, String str);

        /* renamed from: c */
        boolean mo144288c(Context context, String str, String str2);

        /* renamed from: c */
        boolean mo144289c(Context context, String str, String str2, boolean z);

        /* renamed from: d */
        void mo144291d();

        /* renamed from: d */
        void mo144292d(Context context, String str);

        /* renamed from: d */
        boolean mo144293d(Context context, String str, String str2, boolean z);

        /* renamed from: d */
        boolean mo144294d(String str);

        /* renamed from: e */
        String mo144295e();

        /* renamed from: e */
        boolean mo144296e(String str);

        /* renamed from: f */
        Long mo144297f();

        /* renamed from: f */
        String mo144298f(String str);

        /* renamed from: g */
        String mo144299g();

        /* renamed from: g */
        String mo144300g(String str);

        /* renamed from: h */
        String mo144301h();

        /* renamed from: h */
        String mo144302h(String str);

        /* renamed from: i */
        C29187c mo144303i();

        /* renamed from: i */
        void mo144304i(String str);

        /* renamed from: j */
        void mo144305j();

        /* renamed from: j */
        void mo144306j(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.service.ILittleAppService$b */
    public interface AbstractC41417b {
        /* renamed from: a */
        void mo149192a(boolean z);
    }

    /* renamed from: com.ss.android.lark.littleapp.service.ILittleAppService$c */
    public interface AbstractC41418c {
        /* renamed from: a */
        void mo144265a(String str);

        /* renamed from: a */
        void mo144266a(String str, int i);

        /* renamed from: a */
        void mo144271a(String str, boolean z);

        /* renamed from: b */
        void mo144279b(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.service.ILittleAppService$d */
    public interface AbstractC41419d {
        /* renamed from: a */
        void mo149133a(String str);
    }

    /* renamed from: a */
    int mo149141a(int i);

    /* renamed from: a */
    IAppContext mo149142a(Context context, AbstractC41416a aVar);

    /* renamed from: a */
    List<LittleAppPermissionData> mo149143a(Context context, String str, AppType appType);

    /* renamed from: a */
    void mo149144a();

    /* renamed from: a */
    void mo149145a(Activity activity, Bundle bundle, String str);

    /* renamed from: a */
    void mo149146a(Context context);

    /* renamed from: a */
    void mo149147a(Context context, int i);

    /* renamed from: a */
    void mo149148a(Context context, int i, String str);

    /* renamed from: a */
    void mo149149a(Context context, int i, String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo149150a(Context context, String str);

    /* renamed from: a */
    void mo149151a(Context context, String str, int i);

    /* renamed from: a */
    void mo149152a(Context context, String str, String str2, int i);

    /* renamed from: a */
    void mo149153a(Context context, String str, String str2, int i, String str3);

    /* renamed from: a */
    void mo149154a(Context context, String str, String str2, AppType appType, AbstractC13298i iVar);

    /* renamed from: a */
    void mo149155a(Context context, String str, String str2, String str3, int i, String str4);

    /* renamed from: a */
    void mo149156a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num);

    /* renamed from: a */
    void mo149157a(HostInterface hostInterface);

    /* renamed from: a */
    void mo149158a(boolean z);

    /* renamed from: a */
    boolean mo149159a(Activity activity, int i, boolean z);

    /* renamed from: a */
    boolean mo149160a(Activity activity, int i, boolean z, boolean z2, boolean z3);

    /* renamed from: a */
    boolean mo149161a(Context context, Bundle bundle);

    /* renamed from: a */
    boolean mo149162a(Context context, RouteDriveSDKModel routeDriveSDKModel);

    /* renamed from: a */
    boolean mo149163a(Context context, RouteFileDetailModel routeFileDetailModel);

    /* renamed from: a */
    boolean mo149164a(Context context, RoutePasswordVerifyModel routePasswordVerifyModel);

    /* renamed from: a */
    boolean mo149165a(Context context, RouteProfileModel routeProfileModel);

    /* renamed from: a */
    boolean mo149166a(Context context, RouteQRModel routeQRModel);

    /* renamed from: a */
    boolean mo149167a(Context context, RouteShareModel routeShareModel);

    /* renamed from: a */
    boolean mo149168a(Context context, ShareAppModel shareAppModel);

    /* renamed from: a */
    boolean mo149169a(Context context, AbstractC41419d dVar);

    /* renamed from: a */
    boolean mo149170a(Context context, String str, String str2);

    /* renamed from: a */
    boolean mo149171a(String str);

    /* renamed from: b */
    void mo149172b();

    /* renamed from: b */
    void mo149173b(Context context);

    /* renamed from: b */
    void mo149174b(Context context, int i);

    /* renamed from: b */
    void mo149175b(Context context, String str, String str2);

    /* renamed from: b */
    void mo149176b(boolean z);

    /* renamed from: b */
    boolean mo149177b(Context context, String str);

    /* renamed from: b */
    boolean mo149178b(Context context, String str, int i);

    /* renamed from: b */
    boolean mo149179b(String str);

    /* renamed from: c */
    void mo149180c();

    /* renamed from: c */
    boolean mo149181c(Context context);

    /* renamed from: c */
    boolean mo149182c(Context context, String str);

    /* renamed from: c */
    boolean mo149183c(String str);

    /* renamed from: d */
    Map<String, AbstractC29186b> mo149184d(Context context);

    /* renamed from: d */
    void mo149185d();

    /* renamed from: d */
    void mo149186d(Context context, String str);

    /* renamed from: d */
    void mo149187d(String str);

    /* renamed from: e */
    void mo149188e(Context context, String str);

    /* renamed from: e */
    void mo149189e(String str);

    /* renamed from: f */
    void mo149190f(String str);

    public enum OpenAppFeedIdType {
        FEED_ID(0),
        CHAT_ID(1),
        APP_ID(2),
        CLI_APP_ID(3);
        
        int value;

        public int getNumber() {
            return this.value;
        }

        public static OpenAppFeedIdType valueOf(int i) {
            return forNumber(i);
        }

        public static OpenAppFeedIdType forNumber(int i) {
            if (i == 0) {
                return FEED_ID;
            }
            if (i == 1) {
                return CHAT_ID;
            }
            if (i == 2) {
                return APP_ID;
            }
            if (i != 3) {
                return FEED_ID;
            }
            return CLI_APP_ID;
        }

        private OpenAppFeedIdType(int i) {
            this.value = i;
        }
    }
}
