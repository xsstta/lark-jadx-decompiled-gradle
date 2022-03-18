package com.bytedance.ee.bear.drive.preload;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.LinkedHashMap;
import java.util.List;

public class DriveCacheInfo implements NonProguard {
    String dataVersion;
    String ext;
    String mimeType;
    String name;
    String objToken;
    int permissionStatusCode;
    String previewExt;
    LinkedHashMap<String, String> previewUrls;
    int serverPreviewType;
    List<Integer> serverSupportPreviewType;
    long size;
    String version;

    public DriveCacheInfo() {
    }

    public String getDataVersion() {
        return this.dataVersion;
    }

    public String getExt() {
        return this.ext;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getName() {
        return this.name;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public int getPermissionStatusCode() {
        return this.permissionStatusCode;
    }

    public String getPreviewExt() {
        return this.previewExt;
    }

    public LinkedHashMap<String, String> getPreviewUrls() {
        return this.previewUrls;
    }

    public int getServerPreviewType() {
        return this.serverPreviewType;
    }

    public List<Integer> getServerSupportPreviewType() {
        return this.serverSupportPreviewType;
    }

    public long getSize() {
        return this.size;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVideoPreviewUrl() {
        try {
            return this.previewUrls.values().iterator().next();
        } catch (Exception e) {
            C13479a.m54761a("DRIVE_PREVIEW_FLOW", e);
            return null;
        }
    }

    public C7086a toFileModel() {
        String str;
        LinkedHashMap<String, String> linkedHashMap = null;
        if (C13657b.m55422a(this.previewUrls)) {
            str = null;
        } else if (this.previewUrls.containsKey("default")) {
            str = this.previewUrls.get("default");
        } else {
            linkedHashMap = this.previewUrls;
            str = null;
        }
        return (C7086a) new C7086a(new C7086a.C7087a(this.name, this.size, new int[0], 0, this.mimeType, false, this.objToken, "", "", 0, this.version, this.dataVersion, "", 0, this.permissionStatusCode)).mo27318a(this.serverPreviewType).mo27320a(this.serverSupportPreviewType).mo27319a(this.previewExt).mo27321a(linkedHashMap).mo27330c(str);
    }

    public void setDataVersion(String str) {
        this.dataVersion = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setObjToken(String str) {
        this.objToken = str;
    }

    public void setPermissionStatusCode(int i) {
        this.permissionStatusCode = i;
    }

    public void setPreviewExt(String str) {
        this.previewExt = str;
    }

    public void setPreviewUrls(LinkedHashMap<String, String> linkedHashMap) {
        this.previewUrls = linkedHashMap;
    }

    public void setServerPreviewType(int i) {
        this.serverPreviewType = i;
    }

    public void setServerSupportPreviewType(List<Integer> list) {
        this.serverSupportPreviewType = list;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public DriveCacheInfo(C7086a aVar) {
        this.objToken = aVar.mo27322a().f18785a;
        this.name = aVar.mo27322a().mo27358a();
        this.ext = aVar.mo27322a().mo27364g();
        this.size = aVar.mo27322a().f18787c;
        if (!C13657b.m55422a(aVar.mo27336e())) {
            this.previewUrls = aVar.mo27336e();
        } else if (!TextUtils.isEmpty(aVar.mo27340g())) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            this.previewUrls = linkedHashMap;
            linkedHashMap.put("default", aVar.mo27340g());
        }
        this.serverSupportPreviewType = aVar.mo27325b();
        this.version = aVar.mo27322a().f19097p;
        this.dataVersion = aVar.mo27322a().f19098q;
        this.mimeType = aVar.mo27351r();
        this.previewExt = aVar.mo27333d();
        this.serverPreviewType = aVar.mo27329c();
        this.permissionStatusCode = aVar.mo27322a().mo27365h();
    }
}
