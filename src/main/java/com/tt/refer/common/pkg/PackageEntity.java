package com.tt.refer.common.pkg;

import android.text.TextUtils;
import com.tt.refer.impl.business.meta.PackageComponent;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PackageEntity {
    private String appId;
    private String compileVersion;
    private String identifier;
    private String jsonMeta;
    private String md5;
    public Map<String, PackageComponent> packageComponents;
    private String packageName;
    private List<String> rootPaths;
    private List<String> urls;

    public String getAppId() {
        return this.appId;
    }

    public String getCompileVersion() {
        return this.compileVersion;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getMd5() {
        return this.md5;
    }

    public Map<String, PackageComponent> getPackageComponents() {
        return this.packageComponents;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<String> getRootPaths() {
        return this.rootPaths;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public String getJsonMeta() {
        if (TextUtils.isEmpty(this.jsonMeta)) {
            return "";
        }
        return this.jsonMeta;
    }

    public String getDefaultDownloadUrl() {
        List<String> list = this.urls;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.urls.get(0);
    }

    public int hashCode() {
        int i;
        String str = this.appId;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (527 + i) * 31;
        String str2 = this.identifier;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public boolean isValidSubPackage() {
        Map<String, PackageComponent> map = this.packageComponents;
        if (map == null || map.isEmpty()) {
            return false;
        }
        Set<String> keySet = this.packageComponents.keySet();
        if (keySet == null || keySet.contains("__APP__")) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(" PackageEntity:");
        stringBuffer.append(" identifier:");
        stringBuffer.append(this.identifier);
        stringBuffer.append(" packageName:");
        stringBuffer.append(this.packageName);
        return stringBuffer.toString();
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCompileVersion(String str) {
        this.compileVersion = str;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setJsonMeta(String str) {
        this.jsonMeta = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackageComponents(Map<String, PackageComponent> map) {
        this.packageComponents = map;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRootPaths(List<String> list) {
        this.rootPaths = list;
    }

    public void setUrls(List<String> list) {
        this.urls = list;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PackageEntity)) {
            return false;
        }
        PackageEntity packageEntity = (PackageEntity) obj;
        if (!this.appId.equals(packageEntity.appId) || !Objects.equals(this.identifier, packageEntity.identifier)) {
            return false;
        }
        return true;
    }

    public String getSubPkgMd5(String str) {
        Map<String, PackageComponent> packageComponents2 = getPackageComponents();
        if (packageComponents2 == null || packageComponents2.isEmpty()) {
            return "";
        }
        return packageComponents2.get(str).mo235792a();
    }
}
