package com.tt.miniapphost.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.refer.impl.business.meta.DependComponent;
import com.tt.refer.impl.business.meta.PackageComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppInfoEntity implements Parcelable {
    public static final Parcelable.Creator<AppInfoEntity> CREATOR = new Parcelable.Creator<AppInfoEntity>() {
        /* class com.tt.miniapphost.entity.AppInfoEntity.C675171 */

        /* renamed from: a */
        public AppInfoEntity[] newArray(int i) {
            return new AppInfoEntity[i];
        }

        /* renamed from: a */
        public AppInfoEntity createFromParcel(Parcel parcel) {
            return new AppInfoEntity(parcel);
        }
    };
    public String appId;
    public String appKey;
    public String appName;
    public List<String> appUrls;
    public int authPass;
    public String bdpLaunchQuery;
    public String bdpLog;
    public String bizLocation;
    public String compileVersion;
    public volatile ArrayMap<String, List<String>> domainMap;
    public String domains;
    public String encryIV;
    public String encryKey;
    public String encryptextra;
    public String extra;
    public int getFromType;
    public String gtoken;
    public String icon;
    public int innertype;
    public boolean isDevelop;
    public boolean isForceCheckDomains;
    public boolean isLandScape;
    public int isOpenLocation;
    public Map<String, DependComponent> jsComponents;
    public String launchActionAbility;
    public String launchFrom;
    public String launchType;
    public String loadingBg;
    public String location;
    public String mExtJson;
    public List<String> mGadgetSafeDomains;
    public WebApp mWebApp;
    public String md5;
    public String meta;
    public String minJssdk;
    public int mode;
    public String oriStartPage;
    public JSONObject originDataJson;
    public Map<String, PackageComponent> packageComponents;
    public String page;
    public String pkgCompressType;
    public String privacyPolicyUrl;
    public String query;
    public String refererInfo;
    public RenderEngineType renderEngineType;
    public String roomid;
    public IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType;
    public String scene;
    public String schema;
    public String schemaVersion;
    public String session;
    public int shareLevel;
    public String shareTicket;
    public String startPage;
    public int state;
    public String subScene;
    public boolean supportChatAction;
    public boolean supportMessageAction;
    public int switchBitmap;
    public String token;
    public String ttBlackCode;
    public String ttId;
    public String ttSafeCode;
    public int type;
    public String version;
    public long versionCode;
    public int versionState;
    public String versionType;

    public int describeContents() {
        return 0;
    }

    public static class WebApp implements Parcelable {
        public static final Parcelable.Creator<WebApp> CREATOR = new Parcelable.Creator<WebApp>() {
            /* class com.tt.miniapphost.entity.AppInfoEntity.WebApp.C675181 */

            /* renamed from: a */
            public WebApp[] newArray(int i) {
                return new WebApp[i];
            }

            /* renamed from: a */
            public WebApp createFromParcel(Parcel parcel) {
                return new WebApp(parcel);
            }
        };

        /* renamed from: a */
        private String f170265a;

        /* renamed from: b */
        private String f170266b;

        /* renamed from: c */
        private String f170267c;

        public int describeContents() {
            return 0;
        }

        public WebApp() {
        }

        /* renamed from: a */
        public String mo234349a() {
            return this.f170265a;
        }

        /* renamed from: b */
        public String mo234351b() {
            return this.f170266b;
        }

        /* renamed from: c */
        public String mo234353c() {
            return this.f170267c;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("web_app:");
            stringBuffer.append("md5=");
            stringBuffer.append(this.f170265a);
            stringBuffer.append("url=");
            stringBuffer.append(this.f170266b);
            stringBuffer.append("version_code");
            stringBuffer.append(this.f170267c);
            return stringBuffer.toString();
        }

        /* renamed from: a */
        public void mo234350a(String str) {
            this.f170265a = str;
        }

        /* renamed from: b */
        public void mo234352b(String str) {
            this.f170266b = str;
        }

        /* renamed from: c */
        public void mo234354c(String str) {
            this.f170267c = str;
        }

        protected WebApp(Parcel parcel) {
            this.f170265a = parcel.readString();
            this.f170266b = parcel.readString();
            this.f170267c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f170265a);
            parcel.writeString(this.f170266b);
            parcel.writeString(this.f170267c);
        }
    }

    public AppInfoEntity() {
        this.versionType = "current";
        this.isForceCheckDomains = true;
    }

    public boolean isAdSite() {
        if ((this.switchBitmap & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isAudit() {
        String str = this.versionType;
        if (str == null || !"audit".equals(str)) {
            return false;
        }
        return true;
    }

    public boolean isBox() {
        if ((this.switchBitmap & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isCanLaunchApp() {
        if ((this.switchBitmap & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isLocalTest() {
        String str = this.versionType;
        if (str == null || "current".equals(str)) {
            return false;
        }
        return true;
    }

    public boolean isPreview() {
        return "preview".equals(this.versionType);
    }

    public boolean isSpecial() {
        if ((this.switchBitmap & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isWhite() {
        if ((this.switchBitmap & 4) != 0) {
            return true;
        }
        return false;
    }

    public String getDefaultUrl() {
        List<String> list = this.appUrls;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.appUrls.get(0);
    }

    public int hashCode() {
        int i;
        String str = this.appId;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.version;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i + i2;
    }

    public void parseDomain() {
        ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
        AppBrandLogger.m52828d("AppInfoEntity", "parseDomain");
        if (TextUtils.isEmpty(this.domains)) {
            this.domainMap = arrayMap;
            return;
        }
        AppBrandLogger.m52828d("AppInfoEntity", "domains = ", this.domains);
        try {
            JSONObject jSONObject = new JSONObject(this.domains);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                if (jSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        AppBrandLogger.m52828d("AppInfoEntity", "getHost() = ", jSONArray.optString(i));
                        arrayList.add(jSONArray.optString(i));
                    }
                    arrayMap.put(next, arrayList);
                }
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "AppInfoEntity", e.getStackTrace());
        }
        AppBrandLogger.m52828d("AppInfoEntity", "domainMap.size = ", Integer.valueOf(arrayMap.size()));
        this.domainMap = arrayMap;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AppInfoEntity{\n\nappId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(",\n\n version='");
        sb.append(this.version);
        sb.append('\'');
        sb.append(",\n\n versionType=");
        sb.append(this.versionType);
        sb.append('\'');
        sb.append(",\n\n versionCode");
        sb.append(this.versionCode);
        sb.append('\'');
        sb.append(",\n\n appUrl='");
        List<String> list = this.appUrls;
        String str2 = "";
        if (list != null) {
            str = Arrays.toString(list.toArray());
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append('\'');
        sb.append(",\n\n icon='");
        sb.append(this.icon);
        sb.append('\'');
        sb.append(",\n\n appName='");
        sb.append(this.appName);
        sb.append('\'');
        sb.append(",\n\n isOpenLocation='");
        sb.append(this.isOpenLocation);
        sb.append('\'');
        sb.append(",\n\n startPage='");
        sb.append(this.startPage);
        sb.append('\'');
        sb.append(",\n\n ttId='");
        sb.append(this.ttId);
        sb.append('\'');
        sb.append(",\n\n ttSafeCode='");
        sb.append(this.ttSafeCode);
        sb.append('\'');
        sb.append(",\n\n ttBlackCode='");
        sb.append(this.ttBlackCode);
        sb.append('\'');
        sb.append(",\n\n isLocalTest=");
        sb.append(isLocalTest());
        sb.append(",\n\n isDevelop=");
        sb.append(this.isDevelop);
        sb.append(",\n\n md5='");
        sb.append(this.md5);
        sb.append('\'');
        sb.append(",\n\n type=");
        sb.append(this.type);
        sb.append(",\n\n mode=");
        sb.append(this.mode);
        sb.append(",\n\n launchType=");
        sb.append(this.launchType);
        sb.append(",\n\n extra=");
        sb.append(this.extra);
        sb.append(",\n\n encryptextra=");
        sb.append(this.encryptextra);
        sb.append(",\n\n mExtJson=");
        sb.append(this.mExtJson);
        sb.append(",\n\n privacyPolicyUrl=");
        sb.append(this.privacyPolicyUrl);
        sb.append(",\n\n compressType=");
        sb.append(this.pkgCompressType);
        sb.append(",\n\n bdpLaunchQuery=");
        sb.append(this.bdpLaunchQuery);
        sb.append(",\n\n sandBoxType=");
        sb.append(this.sandBoxEnvType);
        sb.append(",\n\n compileVersion=");
        sb.append(this.compileVersion);
        sb.append(",\n\n renderEngineType=");
        sb.append(this.renderEngineType);
        sb.append(",\n\n mGadgetSafeDomains=");
        List<String> list2 = this.mGadgetSafeDomains;
        if (list2 != null) {
            str2 = Arrays.toString(list2.toArray());
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public void setType(int i) {
        int i2 = this.type;
        if (1 != i2 && 2 != i2) {
            this.type = i;
        }
    }

    private boolean isSameVersionType(String str) {
        if (TextUtils.equals(str, this.versionType)) {
            return true;
        }
        if (!TextUtils.isEmpty(this.versionType) && !TextUtils.equals(this.versionType, "current")) {
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "current") || TextUtils.equals(str, "preview")) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AppInfoEntity)) {
            return false;
        }
        AppInfoEntity appInfoEntity = (AppInfoEntity) obj;
        if (!appInfoEntity.appId.equals(this.appId) || !appInfoEntity.version.equals(this.version)) {
            return false;
        }
        return true;
    }

    public int compareVersion(String str) {
        if (str == null && this.version != null) {
            return -1;
        }
        if (str != null && this.version == null) {
            return 1;
        }
        if (str == null) {
            return 0;
        }
        String str2 = this.version;
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (!(i == 0 && (i = split[i2].compareTo(split2[i2])) == 0)) {
                break;
            }
        }
        if (i != 0) {
            return i;
        }
        return split.length - split2.length;
    }

    public boolean shouldHotLaunch(String str) {
        if (!isSameVersionType(str)) {
            return false;
        }
        if (TextUtils.isEmpty(this.versionType)) {
            return true;
        }
        String str2 = this.versionType;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1109880953:
                if (str2.equals("latest")) {
                    c = 0;
                    break;
                }
                break;
            case 93166555:
                if (str2.equals("audit")) {
                    c = 1;
                    break;
                }
                break;
            case 1126940025:
                if (str2.equals("current")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    protected AppInfoEntity(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.versionType = "current";
        boolean z5 = true;
        this.isForceCheckDomains = true;
        this.appId = parcel.readString();
        this.version = parcel.readString();
        this.versionType = parcel.readString();
        this.versionCode = parcel.readLong();
        this.token = parcel.readString();
        this.appUrls = parcel.createStringArrayList();
        this.icon = parcel.readString();
        this.appName = parcel.readString();
        this.isOpenLocation = parcel.readInt();
        this.startPage = parcel.readString();
        this.oriStartPage = parcel.readString();
        this.query = parcel.readString();
        this.ttId = parcel.readString();
        this.ttSafeCode = parcel.readString();
        this.ttBlackCode = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDevelop = z;
        this.md5 = parcel.readString();
        this.type = parcel.readInt();
        this.mode = parcel.readInt();
        this.launchType = parcel.readString();
        this.domains = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isForceCheckDomains = z2;
        this.launchFrom = parcel.readString();
        this.shareTicket = parcel.readString();
        this.scene = parcel.readString();
        this.subScene = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isLandScape = z3;
        this.encryKey = parcel.readString();
        this.encryIV = parcel.readString();
        this.state = parcel.readInt();
        this.versionState = parcel.readInt();
        this.bdpLog = parcel.readString();
        this.location = parcel.readString();
        this.bizLocation = parcel.readString();
        this.page = parcel.readString();
        this.schemaVersion = parcel.readString();
        this.meta = parcel.readString();
        this.extra = parcel.readString();
        this.encryptextra = parcel.readString();
        this.minJssdk = parcel.readString();
        this.shareLevel = parcel.readInt();
        this.session = parcel.readString();
        this.roomid = parcel.readString();
        this.gtoken = parcel.readString();
        this.innertype = parcel.readInt();
        this.getFromType = parcel.readInt();
        this.loadingBg = parcel.readString();
        this.refererInfo = parcel.readString();
        this.switchBitmap = parcel.readInt();
        this.mExtJson = parcel.readString();
        this.privacyPolicyUrl = parcel.readString();
        this.pkgCompressType = parcel.readString();
        this.bdpLaunchQuery = parcel.readString();
        this.sandBoxEnvType = (IAppSandboxEnvManagerService.SandBoxEnvType) parcel.readSerializable();
        this.mWebApp = (WebApp) parcel.readParcelable(WebApp.class.getClassLoader());
        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.fix_parcelable_crash.disable")) {
            this.jsComponents = parcel.readHashMap(AppInfoEntity.class.getClassLoader());
            this.packageComponents = parcel.readHashMap(AppInfoEntity.class.getClassLoader());
        } else {
            HashMap hashMap = new HashMap();
            this.jsComponents = hashMap;
            parcel.readMap(hashMap, AppInfoEntity.class.getClassLoader());
            HashMap hashMap2 = new HashMap();
            this.packageComponents = hashMap2;
            parcel.readMap(hashMap2, AppInfoEntity.class.getClassLoader());
        }
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.supportChatAction = z4;
        this.supportMessageAction = parcel.readByte() == 0 ? false : z5;
        this.launchActionAbility = parcel.readString();
        this.renderEngineType = (RenderEngineType) parcel.readSerializable();
        this.mGadgetSafeDomains = parcel.createStringArrayList();
        this.compileVersion = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.version);
        parcel.writeString(this.versionType);
        parcel.writeLong(this.versionCode);
        parcel.writeString(this.token);
        parcel.writeStringList(this.appUrls);
        parcel.writeString(this.icon);
        parcel.writeString(this.appName);
        parcel.writeInt(this.isOpenLocation);
        parcel.writeString(this.startPage);
        parcel.writeString(this.oriStartPage);
        parcel.writeString(this.query);
        parcel.writeString(this.ttId);
        parcel.writeString(this.ttSafeCode);
        parcel.writeString(this.ttBlackCode);
        parcel.writeByte(this.isDevelop ? (byte) 1 : 0);
        parcel.writeString(this.md5);
        parcel.writeInt(this.type);
        parcel.writeInt(this.mode);
        parcel.writeString(this.launchType);
        parcel.writeString(this.domains);
        parcel.writeByte(this.isForceCheckDomains ? (byte) 1 : 0);
        parcel.writeString(this.launchFrom);
        parcel.writeString(this.shareTicket);
        parcel.writeString(this.scene);
        parcel.writeString(this.subScene);
        parcel.writeByte(this.isLandScape ? (byte) 1 : 0);
        parcel.writeString(this.encryKey);
        parcel.writeString(this.encryIV);
        parcel.writeInt(this.state);
        parcel.writeInt(this.versionState);
        parcel.writeString(this.bdpLog);
        parcel.writeString(this.location);
        parcel.writeString(this.bizLocation);
        parcel.writeString(this.page);
        parcel.writeString(this.schemaVersion);
        parcel.writeString(this.meta);
        parcel.writeString(this.extra);
        parcel.writeString(this.encryptextra);
        parcel.writeString(this.minJssdk);
        parcel.writeInt(this.shareLevel);
        parcel.writeString(this.session);
        parcel.writeString(this.roomid);
        parcel.writeString(this.gtoken);
        parcel.writeInt(this.innertype);
        parcel.writeInt(this.getFromType);
        parcel.writeString(this.loadingBg);
        parcel.writeString(this.refererInfo);
        parcel.writeInt(this.switchBitmap);
        parcel.writeString(this.mExtJson);
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.pkgCompressType);
        parcel.writeString(this.bdpLaunchQuery);
        parcel.writeSerializable(this.sandBoxEnvType);
        parcel.writeParcelable(this.mWebApp, i);
        parcel.writeMap(this.jsComponents);
        parcel.writeMap(this.packageComponents);
        parcel.writeByte(this.supportChatAction ? (byte) 1 : 0);
        parcel.writeByte(this.supportMessageAction ? (byte) 1 : 0);
        parcel.writeString(this.launchActionAbility);
        parcel.writeSerializable(this.renderEngineType);
        parcel.writeStringList(this.mGadgetSafeDomains);
        parcel.writeString(this.compileVersion);
    }
}
