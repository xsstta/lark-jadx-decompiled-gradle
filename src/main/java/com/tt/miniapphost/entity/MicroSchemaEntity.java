package com.tt.miniapphost.entity;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class MicroSchemaEntity {
    private String appId;
    private Map<String, Object> bdpLog;
    private Map<String, Object> customFields;
    private Host host;
    private Map<String, Object> inspect;
    private LaunchMode launchMode;
    private Map<String, Object> meta;
    private String path;
    private String protocol;
    private Map<String, Object> query;
    private Map<String, Object> refererInfo;
    private String scene;
    private String token;
    private VersionType versionType;

    public enum BdpsumCheckResult {
        NORMAL("normal"),
        NONE("none"),
        ERROR("error");
        
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        private BdpsumCheckResult(String str) {
            this.name = str;
        }
    }

    public enum Host {
        MICROAPP("microapp"),
        MICROGAME("microgame");
        
        public String name;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public static Host fromString(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Host[] values = values();
            for (Host host : values) {
                if (host.name.equalsIgnoreCase(str)) {
                    return host;
                }
            }
            return null;
        }

        private Host(String str) {
            this.name = str;
        }
    }

    public enum LaunchFromCheckResult {
        INNER("inner"),
        OUTER("outer"),
        BOTH("both"),
        NEITHER("neither");
        
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        private LaunchFromCheckResult(String str) {
            this.name = str;
        }
    }

    public enum LaunchMode {
        HOST_STACK("hostStack");
        
        public String mode;

        public String getMode() {
            return this.mode;
        }

        public void setMode(String str) {
            this.mode = str;
        }

        public static LaunchMode fromString(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            LaunchMode[] values = values();
            for (LaunchMode launchMode : values) {
                if (launchMode.mode.equalsIgnoreCase(str)) {
                    return launchMode;
                }
            }
            return null;
        }

        private LaunchMode(String str) {
            this.mode = str;
        }
    }

    public enum SceneCheckResult {
        NORMAL("normal"),
        NONE("none"),
        DEFAULT("0");
        
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        private SceneCheckResult(String str) {
            this.name = str;
        }
    }

    public enum TTidCheckResult {
        INNER("inner"),
        OUTER("outer"),
        BOTH("both"),
        NEITHER("neither");
        
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        private TTidCheckResult(String str) {
            this.name = str;
        }
    }

    public enum VersionType {
        CURRENT("current"),
        LATEST("latest"),
        AUDIT("audit"),
        PREVIEW("preview"),
        LOCAL_DEV("local_dev");
        
        public String name;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public static VersionType fromString(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            VersionType[] values = values();
            for (VersionType versionType : values) {
                if (versionType.name.equalsIgnoreCase(str)) {
                    return versionType;
                }
            }
            return null;
        }

        private VersionType(String str) {
            this.name = str;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public Map<String, Object> getBdpLog() {
        return this.bdpLog;
    }

    public Map<String, Object> getCustomFields() {
        return this.customFields;
    }

    public Host getHost() {
        return this.host;
    }

    public Map<String, Object> getInspect() {
        return this.inspect;
    }

    public LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public Map<String, Object> getMeta() {
        return this.meta;
    }

    public String getPath() {
        return this.path;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Map<String, Object> getQuery() {
        return this.query;
    }

    public Map<String, Object> getRefererInfo() {
        return this.refererInfo;
    }

    public String getScene() {
        return this.scene;
    }

    public String getToken() {
        return this.token;
    }

    public VersionType getVersionType() {
        return this.versionType;
    }

    public static final class Builder {
        public String appId;
        public Map<String, Object> bdpLog;
        public Map<String, Object> customFields;
        public Host host;
        public Map<String, Object> inspect;
        public LaunchMode launchMode;
        public Map<String, Object> meta;
        public String path;
        public String protocol;
        public Map<String, Object> query;
        public Map<String, Object> refererInfo;
        public String scene;
        public String token;
        public VersionType versionType;

        public MicroSchemaEntity build() {
            return new MicroSchemaEntity(this);
        }

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public Builder bdpLog(Map<String, Object> map) {
            this.bdpLog = map;
            return this;
        }

        public Builder customFields(Map<String, Object> map) {
            this.customFields = map;
            return this;
        }

        public Builder host(Host host2) {
            this.host = host2;
            return this;
        }

        public Builder inspect(Map<String, Object> map) {
            this.inspect = map;
            return this;
        }

        public Builder launchMode(LaunchMode launchMode2) {
            this.launchMode = launchMode2;
            return this;
        }

        public Builder meta(Map<String, Object> map) {
            this.meta = map;
            return this;
        }

        public Builder path(String str) {
            this.path = str;
            return this;
        }

        public Builder protocol(String str) {
            this.protocol = str;
            return this;
        }

        public Builder query(Map<String, Object> map) {
            this.query = map;
            return this;
        }

        public Builder refererInfo(Map<String, Object> map) {
            this.refererInfo = map;
            return this;
        }

        public Builder scene(String str) {
            this.scene = str;
            return this;
        }

        public Builder token(String str) {
            this.token = str;
            return this;
        }

        public Builder versionType(VersionType versionType2) {
            this.versionType = versionType2;
            return this;
        }
    }

    public String toSchema() {
        JSONObject jsonFromMap;
        if (TextUtils.isEmpty(this.appId)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(this.protocol)) {
            this.protocol = "sslocal";
        }
        if (this.host == null) {
            this.host = Host.MICROAPP;
        }
        try {
            sb.append(this.protocol);
            sb.append("://");
            sb.append(this.host.name);
            sb.append("?");
            sb.append(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append("v2");
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append("app_id");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(this.appId);
            if (!TextUtils.isEmpty(this.scene)) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("scene");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(Uri.encode(this.scene));
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("scene");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append("0");
            }
            if (this.launchMode != null) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("launch_mode");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(this.launchMode.mode);
            }
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append("version_type");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            VersionType versionType2 = this.versionType;
            if (versionType2 != null) {
                sb.append(versionType2.name);
            } else {
                sb.append(VersionType.CURRENT.name);
            }
            if (!TextUtils.isEmpty(this.token)) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("token");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(this.token);
            }
            if (this.host == Host.MICROGAME) {
                Map<String, Object> map = this.query;
                if (!(map == null || map.size() <= 0 || (jsonFromMap = getJsonFromMap(this.query)) == null)) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                    sb.append(SearchIntents.EXTRA_QUERY);
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(Uri.encode(jsonFromMap.toJSONString()));
                }
            } else if (!TextUtils.isEmpty(this.path)) {
                String str = this.path;
                if (this.query != null) {
                    String str2 = str + "?";
                    try {
                        JSONObject jsonFromMap2 = getJsonFromMap(this.query);
                        for (String str3 : jsonFromMap2.keySet()) {
                            Object obj = jsonFromMap2.get(str3);
                            if (!(obj instanceof JSONObject)) {
                                if (!(obj instanceof JSONArray)) {
                                    str2 = str2 + str3 + ContainerUtils.KEY_VALUE_DELIMITER + Uri.encode(obj.toString()) + ContainerUtils.FIELD_DELIMITER;
                                }
                            }
                            str2 = str2 + str3 + ContainerUtils.KEY_VALUE_DELIMITER + Uri.encode(((JSONAware) obj).toJSONString()) + ContainerUtils.FIELD_DELIMITER;
                        }
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "MicroSchemaEntity", e.getStackTrace());
                    }
                    str = str2.substring(0, str2.length() - 1);
                }
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("start_page");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(Uri.encode(str));
            } else if (this.query != null) {
                return null;
            }
            Map<String, Object> map2 = this.bdpLog;
            if (map2 != null && map2.size() > 0) {
                try {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                    sb.append("bdp_log");
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(Uri.encode(getJsonFromMap(this.bdpLog).toJSONString()));
                } catch (Exception e2) {
                    AppBrandLogger.stacktrace(6, "MicroSchemaEntity", e2.getStackTrace());
                }
            }
            Map<String, Object> map3 = this.meta;
            if (map3 != null && map3.size() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("meta");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(Uri.encode(getJsonFromMap(this.meta).toJSONString()));
            }
            Map<String, Object> map4 = this.inspect;
            if (map4 != null && map4.size() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("inspect");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(Uri.encode(getJsonFromMap(this.inspect).toJSONString()));
            }
            Map<String, Object> map5 = this.refererInfo;
            if (map5 != null && map5.size() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("referer_info");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(Uri.encode(getJsonFromMap(this.refererInfo).toJSONString()));
            }
            Map<String, Object> map6 = this.customFields;
            if (map6 != null && map6.size() > 0) {
                for (String str4 : this.customFields.keySet()) {
                    if (!isReservedField(str4)) {
                        Object obj2 = this.customFields.get(str4);
                        if (obj2 instanceof Map) {
                            sb.append(ContainerUtils.FIELD_DELIMITER);
                            sb.append(str4);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(Uri.encode(getJsonFromMap((Map) obj2).toJSONString()));
                        } else if (obj2 != null && !TextUtils.isEmpty(obj2.toString())) {
                            sb.append(ContainerUtils.FIELD_DELIMITER);
                            sb.append(str4);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(Uri.encode(obj2.toString()));
                        }
                    }
                }
            }
            String genBdpSum = genBdpSum(sb.toString());
            if (!TextUtils.isEmpty(genBdpSum)) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("bdpsum");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(genBdpSum);
            }
        } catch (Exception e3) {
            AppBrandLogger.stacktrace(6, "MicroSchemaEntity", e3.getStackTrace());
        }
        return sb.toString();
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setBdpLog(Map<String, Object> map) {
        this.bdpLog = map;
    }

    public void setCustomFields(Map<String, Object> map) {
        this.customFields = map;
    }

    public void setHost(Host host2) {
        this.host = host2;
    }

    public void setInspect(Map<String, Object> map) {
        this.inspect = map;
    }

    public void setLaunchMode(LaunchMode launchMode2) {
        this.launchMode = launchMode2;
    }

    public void setMeta(Map<String, Object> map) {
        this.meta = map;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setQuery(Map<String, Object> map) {
        this.query = map;
    }

    public void setRefererInfo(Map<String, Object> map) {
        this.refererInfo = map;
    }

    public void setScene(String str) {
        this.scene = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVersionType(VersionType versionType2) {
        this.versionType = versionType2;
    }

    private static boolean isNormalUri(String str) {
        try {
            Uri.parse(str).getQueryParameterNames();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean isjson(String str) {
        try {
            Object parse = new JSONParser().parse(str);
            if ((parse instanceof JSONObject) || (parse instanceof JSONArray)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean removeBdpLogField(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Object> map = this.bdpLog;
        if (map == null) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public boolean removeCustomField(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Object> map = this.customFields;
        if (map == null) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public boolean removeInspectField(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Object> map = this.inspect;
        if (map == null) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public boolean removeMetaField(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Object> map = this.meta;
        if (map == null) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public boolean removeQueryField(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Object> map = this.query;
        if (map == null) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public boolean removeRefererInfoField(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Object> map = this.refererInfo;
        if (map == null) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public static BdpsumCheckResult checkBdpsum(String str) {
        if (TextUtils.isEmpty(str)) {
            return BdpsumCheckResult.NONE;
        }
        String[] split = str.split("&bdpsum=");
        if (split.length < 2) {
            return BdpsumCheckResult.NONE;
        }
        String str2 = split[1];
        String genBdpSum = genBdpSum(split[0]);
        if (TextUtils.isEmpty(str2)) {
            return BdpsumCheckResult.NONE;
        }
        if (TextUtils.isEmpty(genBdpSum)) {
            return BdpsumCheckResult.ERROR;
        }
        if (str2.equals(genBdpSum)) {
            return BdpsumCheckResult.NORMAL;
        }
        return BdpsumCheckResult.ERROR;
    }

    public static SceneCheckResult checkScene(String str) {
        if (TextUtils.isEmpty(str)) {
            return SceneCheckResult.NONE;
        }
        MicroSchemaEntity parseFromSchema = parseFromSchema(str);
        if (parseFromSchema == null) {
            return null;
        }
        String scene2 = parseFromSchema.getScene();
        if (TextUtils.isEmpty(scene2)) {
            return SceneCheckResult.NONE;
        }
        if (scene2.equals("0")) {
            return SceneCheckResult.DEFAULT;
        }
        return SceneCheckResult.NORMAL;
    }

    public static boolean checkSchemaV2valid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("&bdpsum=");
        if (split.length < 2) {
            return false;
        }
        String str2 = split[1];
        String genBdpSum = genBdpSum(split[0]);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(genBdpSum) || !str2.equals(genBdpSum)) {
            return false;
        }
        return true;
    }

    private static List<Object> getArrayFromJsonArray(JSONArray jSONArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = getArrayFromJsonArray((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getMapFromJson((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private static JSONObject getJsonFromMap(Map map) {
        if (map == null) {
            return null;
        }
        try {
            return (JSONObject) new JSONParser().parse(JSONValue.toJSONString(map));
        } catch (Exception e) {
            AppBrandLogger.m52829e("MicroSchemaEntity", e.toString());
            return null;
        }
    }

    private static Map<String, Object> getMapFromJson(JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = getArrayFromJsonArray((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getMapFromJson((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    private static String md5Hex(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return toHexString(instance.digest());
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "MicroSchemaEntity", e.getStackTrace());
            }
        }
        return null;
    }

    private MicroSchemaEntity(Builder builder) {
        if (TextUtils.isEmpty(builder.protocol)) {
            this.protocol = "sslocal";
        } else {
            this.protocol = builder.protocol;
        }
        if (builder.host == null) {
            this.host = Host.MICROAPP;
        } else {
            this.host = builder.host;
        }
        this.appId = builder.appId;
        if (builder.versionType == null) {
            this.versionType = VersionType.CURRENT;
        } else {
            this.versionType = builder.versionType;
        }
        this.token = builder.token;
        this.meta = builder.meta;
        if (TextUtils.isEmpty(builder.scene)) {
            this.scene = "0";
        } else {
            this.scene = builder.scene;
        }
        this.path = builder.path;
        this.query = builder.query;
        this.bdpLog = builder.bdpLog;
        if (builder.customFields == null) {
            this.customFields = new HashMap();
        } else {
            this.customFields = builder.customFields;
        }
        this.launchMode = builder.launchMode;
        this.refererInfo = builder.refererInfo;
        this.inspect = builder.inspect;
    }

    public static LaunchFromCheckResult checkLaunchFrom(String str) {
        boolean z;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (TextUtils.isEmpty(str)) {
            return LaunchFromCheckResult.NEITHER;
        }
        MicroSchemaEntity parseFromSchema = parseFromSchema(str);
        if (parseFromSchema == null) {
            return null;
        }
        boolean z2 = false;
        if (parseFromSchema == null || (map2 = parseFromSchema.customFields) == null) {
            z = false;
        } else {
            z = map2.containsKey("launch_from");
        }
        if (!(parseFromSchema == null || (map = parseFromSchema.bdpLog) == null)) {
            z2 = map.containsKey("launch_from");
        }
        if (z2 && z) {
            return LaunchFromCheckResult.BOTH;
        }
        if (z2 && !z) {
            return LaunchFromCheckResult.INNER;
        }
        if (!z2 && z) {
            return LaunchFromCheckResult.OUTER;
        }
        if (z2 || z) {
            return LaunchFromCheckResult.NEITHER;
        }
        return LaunchFromCheckResult.NEITHER;
    }

    public static TTidCheckResult checkTTid(String str) {
        boolean z;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (TextUtils.isEmpty(str)) {
            return TTidCheckResult.NEITHER;
        }
        MicroSchemaEntity parseFromSchema = parseFromSchema(str);
        if (parseFromSchema == null) {
            return null;
        }
        boolean z2 = false;
        if (parseFromSchema == null || (map2 = parseFromSchema.customFields) == null) {
            z = false;
        } else {
            z = map2.containsKey("ttid");
        }
        if (!(parseFromSchema == null || (map = parseFromSchema.bdpLog) == null)) {
            z2 = map.containsKey("ttid");
        }
        if (z2 && z) {
            return TTidCheckResult.BOTH;
        }
        if (z2 && !z) {
            return TTidCheckResult.INNER;
        }
        if (!z2 && z) {
            return TTidCheckResult.OUTER;
        }
        if (z2 || z) {
            return TTidCheckResult.NEITHER;
        }
        return TTidCheckResult.NEITHER;
    }

    private static String genBdpSum(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("://")) {
            String[] split = str.split("://");
            if (split == null || split.length < 2) {
                return "";
            }
            str = split[1];
        }
        String md5Hex = md5Hex(str.substring(0, 10) + "bytetimordance" + str.substring(10));
        if (TextUtils.isEmpty(md5Hex)) {
            return "";
        }
        return md5Hex.substring(2, 6) + md5Hex.substring(20, 23);
    }

    private static boolean isReservedField(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(HiAnalyticsConstant.HaKey.BI_KEY_VERSION) && !str.equals("app_id") && !str.equals("meta") && !str.equals("scene") && !str.equals("version_type") && !str.equals("token") && !str.equals("start_page") && !str.equals(SearchIntents.EXTRA_QUERY) && !str.equals("bdp_log") && !str.equals("launch_mode") && !str.equals("inspect") && !str.equals("referer_info") && !str.equals("path") && !str.equals("bdpsum")) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x001c */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    private static String toHexString(byte... bArr) {
        byte b;
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] < 0) {
                b = bArr[i2] + DynamicModule.f58006b;
            } else {
                b = bArr[i2];
            }
            int i3 = i + 1;
            cArr2[i] = cArr[(b == true ? 1 : 0) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[(b == true ? 1 : 0) & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ed A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.entity.MicroSchemaEntity.equals(java.lang.Object):boolean");
    }

    public static MicroSchemaEntity parseFromSchema(String str) {
        if (TextUtils.isEmpty(str) || !isNormalUri(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        JSONParser jSONParser = new JSONParser();
        try {
            Builder scene2 = new Builder().protocol(parse.getScheme()).host(Host.fromString(parse.getHost())).appId(parse.getQueryParameter("app_id")).versionType(VersionType.fromString(parse.getQueryParameter("version_type"))).token(parse.getQueryParameter("token")).scene(parse.getQueryParameter("scene"));
            if (!TextUtils.isEmpty(parse.getQueryParameter("inspect"))) {
                scene2.inspect(getMapFromJson((JSONObject) jSONParser.parse(parse.getQueryParameter("inspect"))));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("referer_info"))) {
                scene2.refererInfo(getMapFromJson((JSONObject) jSONParser.parse(parse.getQueryParameter("referer_info"))));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("meta"))) {
                scene2.meta(getMapFromJson((JSONObject) jSONParser.parse(parse.getQueryParameter("meta"))));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("launch_mode"))) {
                scene2.launchMode(LaunchMode.fromString(parse.getQueryParameter("launch_mode")));
            }
            String queryParameter = parse.getQueryParameter("bdp_log");
            if (!TextUtils.isEmpty(queryParameter)) {
                scene2.bdpLog(getMapFromJson((JSONObject) jSONParser.parse(queryParameter)));
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            HashMap hashMap = new HashMap();
            for (String str2 : queryParameterNames) {
                if (!TextUtils.isEmpty(str2) && !isReservedField(str2)) {
                    String queryParameter2 = parse.getQueryParameter(str2);
                    if (isjson(queryParameter2)) {
                        Object parse2 = jSONParser.parse(queryParameter2);
                        if (parse2 instanceof JSONObject) {
                            hashMap.put(str2, getMapFromJson((JSONObject) parse2));
                        } else if (parse2 != null) {
                            hashMap.put(str2, ((JSONArray) parse2).toArray());
                        }
                    } else {
                        hashMap.put(str2, queryParameter2);
                    }
                }
            }
            scene2.customFields(hashMap);
            if (Host.fromString(parse.getHost()) == Host.MICROAPP) {
                String queryParameter3 = parse.getQueryParameter("start_page");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    String[] split = queryParameter3.split("\\?");
                    if (split.length > 1) {
                        HashMap hashMap2 = new HashMap();
                        scene2.path(split[0]);
                        if (isNormalUri(queryParameter3)) {
                            Uri parse3 = Uri.parse(queryParameter3);
                            for (String str3 : parse3.getQueryParameterNames()) {
                                String queryParameter4 = parse3.getQueryParameter(str3);
                                if (isjson(queryParameter4)) {
                                    Object parse4 = jSONParser.parse(queryParameter4);
                                    if (parse4 instanceof JSONObject) {
                                        hashMap2.put(str3, getMapFromJson((JSONObject) parse4));
                                    } else if (parse4 != null) {
                                        hashMap2.put(str3, getArrayFromJsonArray((JSONArray) parse4));
                                    }
                                } else {
                                    hashMap2.put(str3, queryParameter4);
                                }
                            }
                            scene2.query(hashMap2);
                        }
                    } else {
                        scene2.path(split[0]);
                    }
                }
            } else {
                String queryParameter5 = parse.getQueryParameter(SearchIntents.EXTRA_QUERY);
                if (!TextUtils.isEmpty(queryParameter5)) {
                    if (!isjson(queryParameter5)) {
                        queryParameter5 = Uri.decode(queryParameter5);
                    }
                    if (isjson(queryParameter5)) {
                        Object parse5 = jSONParser.parse(queryParameter5);
                        if (parse5 instanceof JSONObject) {
                            scene2.query(getMapFromJson((JSONObject) parse5));
                        }
                    }
                }
            }
            return new MicroSchemaEntity(scene2);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "MicroSchemaEntity", e.getStackTrace());
            return null;
        }
    }

    public boolean addBdpLogField(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.bdpLog == null) {
            this.bdpLog = new HashMap();
        }
        this.bdpLog.put(str, obj);
        return true;
    }

    public boolean addCustomField(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.customFields == null) {
            this.customFields = new HashMap();
        }
        this.customFields.put(str, obj);
        return true;
    }

    public boolean addInspectField(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.inspect == null) {
            this.inspect = new HashMap();
        }
        this.inspect.put(str, obj);
        return true;
    }

    public boolean addMetaField(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.meta == null) {
            this.meta = new HashMap();
        }
        this.meta.put(str, obj);
        return true;
    }

    public boolean addQueryField(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.query == null) {
            this.query = new HashMap();
        }
        this.query.put(str, obj);
        return true;
    }

    public boolean addRefererInfoField(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.refererInfo == null) {
            this.refererInfo = new HashMap();
        }
        this.refererInfo.put(str, obj);
        return true;
    }
}
