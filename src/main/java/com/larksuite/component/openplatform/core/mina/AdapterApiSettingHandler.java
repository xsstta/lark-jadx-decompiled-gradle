package com.larksuite.component.openplatform.core.mina;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.tt.refer.common.base.AppType;
import org.json.JSONObject;

public class AdapterApiSettingHandler extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<AdapterApiSettingHandler> f60558a = new AbstractC12790g<AdapterApiSettingHandler>() {
        /* class com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler.C245721 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public AdapterApiSettingHandler mo48227b(Context... contextArr) {
            return new AdapterApiSettingHandler();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler$a */
    public enum EnumC24574a {
        webApp,
        widget,
        block,
        gadget
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "universalAPI";
    }

    /* renamed from: a */
    public static AdapterApiSettingHandler m89609a() {
        return f60558a.mo48348c(new Context[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler$2 */
    public static /* synthetic */ class C245732 {

        /* renamed from: a */
        static final /* synthetic */ int[] f60559a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler.C245732.f60559a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler.C245732.f60559a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler.C245732.f60559a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler.C245732.f60559a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler.C245732.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("universalAPI", str);
    }

    public enum ApiCommand {
        DO_NOT_USE("doNotUse"),
        USE_OLD("useOld"),
        DEFAULT_COMMAND("default");
        
        private String name;

        public static ApiCommand fromString(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            ApiCommand[] values = values();
            for (ApiCommand apiCommand : values) {
                if (apiCommand.name.equalsIgnoreCase(str)) {
                    return apiCommand;
                }
            }
            return DEFAULT_COMMAND;
        }

        private ApiCommand(String str) {
            this.name = str;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }

    /* renamed from: a */
    public ApiCommand mo87533a(AppType appType, String str) {
        String str2 = "";
        String settingFromLocal = getSettingFromLocal("universalAPI", str2);
        if (TextUtils.isEmpty(settingFromLocal)) {
            AppBrandLogger.m52830i("AdapterApiSettingHandle", "universalApiList is empty");
            return ApiCommand.DEFAULT_COMMAND;
        }
        int i = C245732.f60559a[appType.ordinal()];
        if (i == 1) {
            str2 = EnumC24574a.gadget.name();
        } else if (i == 2) {
            str2 = EnumC24574a.webApp.name();
        } else if (i == 3) {
            str2 = EnumC24574a.widget.name();
        } else if (i == 4) {
            str2 = EnumC24574a.block.name();
        }
        if (TextUtils.isEmpty(str2)) {
            AppBrandLogger.m52830i("AdapterApiSettingHandle", "appTypeKey is empty:" + appType.name());
            return ApiCommand.DEFAULT_COMMAND;
        }
        try {
            JSONObject optJSONObject = new JSONObject(settingFromLocal).optJSONObject(str2);
            if (optJSONObject == null) {
                AppBrandLogger.m52830i("AdapterApiSettingHandle", "appTypeConfig is empty");
                return ApiCommand.DEFAULT_COMMAND;
            }
            String optString = optJSONObject.optString(str);
            if (TextUtils.isEmpty(optString)) {
                AppBrandLogger.m52830i("AdapterApiSettingHandle", "apiCommand is empty");
                return ApiCommand.DEFAULT_COMMAND;
            }
            AppBrandLogger.m52830i("AdapterApiSettingHandle", "apiName:" + str + " appType:" + appType + " apiCommand:" + optString);
            return ApiCommand.fromString(optString);
        } catch (Throwable th) {
            AppBrandLogger.m52829e("AdapterApiSettingHandle", "Throwable", th);
            return ApiCommand.DEFAULT_COMMAND;
        }
    }
}
