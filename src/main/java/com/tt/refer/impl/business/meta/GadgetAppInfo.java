package com.tt.refer.impl.business.meta;

import com.tt.refer.common.meta.base.AbsAppMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GadgetAppInfo extends AbsAppMeta {
    private C67934b authData = new C67934b();
    private C67935c bizData = new C67935c();
    private C67933a decodeData = new C67933a();
    private C67936d packageData = new C67936d();

    /* renamed from: com.tt.refer.impl.business.meta.GadgetAppInfo$a */
    public static class C67933a {

        /* renamed from: a */
        public String f171152a;

        /* renamed from: b */
        public String f171153b;

        /* renamed from: c */
        public String f171154c;
    }

    /* renamed from: com.tt.refer.impl.business.meta.GadgetAppInfo$b */
    public static class C67934b extends AbsAppMeta.C67793a {

        /* renamed from: a */
        public String f171155a;

        /* renamed from: b */
        public String f171156b;
    }

    /* renamed from: com.tt.refer.impl.business.meta.GadgetAppInfo$c */
    public static class C67935c extends AbsAppMeta.C67794b {

        /* renamed from: a */
        public int f171157a;

        /* renamed from: b */
        public int f171158b;

        /* renamed from: c */
        public String f171159c;

        /* renamed from: d */
        public int f171160d;

        /* renamed from: e */
        public String f171161e;

        /* renamed from: h */
        public long f171162h;

        /* renamed from: i */
        public int f171163i;

        /* renamed from: j */
        public String f171164j;

        /* renamed from: k */
        public boolean f171165k;

        /* renamed from: l */
        public Map<String, DependComponent> f171166l;

        /* renamed from: m */
        public Map<String, PackageComponent> f171167m;

        /* renamed from: n */
        public boolean f171168n;

        /* renamed from: o */
        public boolean f171169o;

        /* renamed from: p */
        public List<String> f171170p;
    }

    /* renamed from: com.tt.refer.impl.business.meta.GadgetAppInfo$d */
    public static class C67936d extends AbsAppMeta.C67795c {

        /* renamed from: c */
        public String f171171c;

        /* renamed from: d */
        public String f171172d;

        /* renamed from: e */
        public String f171173e;
    }

    public String getDecodeDomains() {
        return this.decodeData.f171154c;
    }

    public String getDecodeExtra() {
        return this.decodeData.f171152a;
    }

    public String getDecodeMd5() {
        return this.decodeData.f171153b;
    }

    public String getDomains() {
        return this.authData.f171156b;
    }

    public String getExtra() {
        return this.bizData.f171161e;
    }

    public boolean getFromPreset() {
        return this.bizData.f171165k;
    }

    public String getLanguage() {
        return this.bizData.f171164j;
    }

    public String getMd5() {
        return this.packageData.f170756b;
    }

    public String getMinJsSdk() {
        return this.bizData.f171159c;
    }

    public List<String> getPaths() {
        return this.packageData.f170755a;
    }

    public int getShareLevel() {
        return this.bizData.f171160d;
    }

    public int getState() {
        return this.bizData.f171157a;
    }

    public String getTtCode() {
        return this.authData.f171155a;
    }

    public int getType() {
        return this.bizData.f171163i;
    }

    public long getVersionCode() {
        return this.bizData.f171162h;
    }

    public int getVersionState() {
        return this.bizData.f171158b;
    }

    @Override // com.tt.refer.common.meta.base.AbsAppMeta
    public String getVersionType() {
        return this.bizData.f170753f;
    }

    public String getWebMd5() {
        return this.packageData.f171172d;
    }

    public String getWebUrl() {
        return this.packageData.f171171c;
    }

    public String getWebVersionCode() {
        return this.packageData.f171173e;
    }

    public boolean isSupportChatAction() {
        return this.bizData.f171169o;
    }

    public boolean isSupportMessageAction() {
        return this.bizData.f171168n;
    }

    public List<String> getGadgetSafeDomains() {
        if (this.bizData.f171170p == null) {
            return new ArrayList();
        }
        return this.bizData.f171170p;
    }

    public Map<String, DependComponent> getJsComponents() {
        if (this.bizData.f171166l == null) {
            return new HashMap();
        }
        return this.bizData.f171166l;
    }

    public Map<String, PackageComponent> getPackageComponents() {
        if (this.bizData.f171167m == null) {
            return new LinkedHashMap();
        }
        return this.bizData.f171167m;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("GadgetAppInfo:");
        sb.append(" appId:");
        sb.append(this.appId);
        sb.append(" version:");
        sb.append(this.appVersion);
        sb.append(" compileVersion:");
        sb.append(this.compileVersion);
        sb.append(" name:");
        sb.append(this.name);
        sb.append(" versionState:");
        sb.append(this.bizData.f171158b);
        sb.append(" minJsSdk");
        sb.append(this.bizData.f171159c);
        sb.append(" versionCode:");
        sb.append(this.bizData.f171162h);
        sb.append(" lang:");
        sb.append(this.bizData.f171164j);
        sb.append(" md5:");
        sb.append(this.packageData.f170756b);
        sb.append(" decode md5:");
        sb.append(this.decodeData.f171153b);
        sb.append(" webMd5:");
        sb.append(this.packageData.f171172d);
        sb.append(" paths:");
        String str3 = "";
        if (this.packageData.f170755a != null) {
            str = Arrays.toString(this.packageData.f170755a.toArray());
        } else {
            str = str3;
        }
        sb.append(str);
        sb.append(" webUrl:");
        sb.append(this.packageData.f171171c);
        sb.append(" webVersion:");
        sb.append(this.packageData.f171173e);
        sb.append(" components");
        if (this.bizData.f171166l != null) {
            str2 = Arrays.toString(this.bizData.f171166l.keySet().toArray());
        } else {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(" packageComponents:");
        if (this.bizData.f171167m != null) {
            str3 = Arrays.toString(this.bizData.f171167m.keySet().toArray());
        }
        sb.append(str3);
        return sb.toString();
    }

    public void setDecodeDomains(String str) {
        this.decodeData.f171154c = str;
    }

    public void setDecodeExtra(String str) {
        this.decodeData.f171152a = str;
    }

    public void setDecodeMd5(String str) {
        this.decodeData.f171153b = str;
    }

    public void setDomains(String str) {
        this.authData.f171156b = str;
    }

    public void setExtra(String str) {
        this.bizData.f171161e = str;
    }

    public void setFromPreset(boolean z) {
        this.bizData.f171165k = z;
    }

    public void setGadgetSafeDomains(List<String> list) {
        this.bizData.f171170p = list;
    }

    public void setJsComponents(Map<String, DependComponent> map) {
        this.bizData.f171166l = map;
    }

    public void setLanguage(String str) {
        this.bizData.f171164j = str;
    }

    public void setMd5(String str) {
        this.packageData.f170756b = str;
    }

    public void setMinJsSdk(String str) {
        this.bizData.f171159c = str;
    }

    public void setPackageComponents(Map<String, PackageComponent> map) {
        this.bizData.f171167m = map;
    }

    public void setPaths(List<String> list) {
        this.packageData.f170755a = list;
    }

    public void setShareLevel(int i) {
        this.bizData.f171160d = i;
    }

    public void setState(int i) {
        this.bizData.f171157a = i;
    }

    public void setSupportChatAction(boolean z) {
        this.bizData.f171169o = z;
    }

    public void setSupportMessageAction(boolean z) {
        this.bizData.f171168n = z;
    }

    public void setTtCode(String str) {
        this.authData.f171155a = str;
    }

    public void setType(int i) {
        this.bizData.f171163i = i;
    }

    public void setVersionCode(long j) {
        this.bizData.f171162h = j;
    }

    public void setVersionState(int i) {
        this.bizData.f171158b = i;
    }

    @Override // com.tt.refer.common.meta.base.AbsAppMeta
    public void setVersionType(String str) {
        this.bizData.f170753f = str;
    }

    public void setWebMd5(String str) {
        this.packageData.f171172d = str;
    }

    public void setWebUrl(String str) {
        this.packageData.f171171c = str;
    }

    public void setWebVersionCode(String str) {
        this.packageData.f171173e = str;
    }
}
