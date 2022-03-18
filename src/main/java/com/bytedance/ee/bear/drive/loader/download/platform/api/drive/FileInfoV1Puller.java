package com.bytedance.ee.bear.drive.loader.download.platform.api.drive;

import android.util.Log;
import android.util.SparseArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.core.model.PreviewMeta;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7056a;
import com.bytedance.ee.bear.drive.loader.download.platform.api.FileInfoMeta;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.ArrayList;
import java.util.Arrays;

public class FileInfoV1Puller extends BasePuller<Params, Result> {

    public static class Result extends BasePuller.Result {
        @JSONField(name = "available_preview_type")
        public int[] availablePreviewType;
        @JSONField(name = "comment_flag")
        public int commentFlag;
        @JSONField(name = "creator_tenant_id")
        public String creatorTenantId;
        @JSONField(name = "data_version")
        public String dataVersion;
        @JSONField(name = "mime_type")
        public String mimeType;
        public String name;
        @JSONField(name = "num_blocks")
        public int numBlocks;
        @JSONField(name = "permission_status_code")
        public int permissionStatusCode;
        @JSONField(name = "preview_meta")
        public String previewMeta;
        @JSONField(name = "preview_status")
        public int previewStatus;
        public long size;
        public String type;
        public String version;
        @JSONField(name = "weboffice")
        public boolean webOffice;

        public SparseArray<PreviewMeta> getPreviewMetaMap() {
            SparseArray<FileInfoMeta> a = C7056a.m28084a(this.previewMeta);
            int size2 = a.size();
            SparseArray<PreviewMeta> sparseArray = new SparseArray<>(size2);
            for (int i = 0; i < size2; i++) {
                sparseArray.put(a.keyAt(i), new PreviewMeta(a.valueAt(i)));
            }
            return sparseArray;
        }

        public String toString() {
            return "Result{name='" + this.name + '\'' + ", size='" + this.size + ", numBlocks='" + this.numBlocks + ", type='" + this.type + '\'' + ", availablePreviewType='" + Arrays.toString(this.availablePreviewType) + ", version='" + this.version + '\'' + ", dataVersion='" + this.dataVersion + '\'' + ", mimeType='" + this.mimeType + '\'' + ", previewStatus='" + this.previewStatus + ", permissionStatusCode='" + this.permissionStatusCode + ", creatorTenantId='" + this.creatorTenantId + '\'' + ", commentFlag='" + this.commentFlag + '\'' + ", webOffice='" + this.webOffice + '\'' + '}';
        }
    }

    public static class Params extends BasePuller.Params {
        public String caller;
        public String extra;
        public String file_token;
        public String mount_node_token;
        public String mount_point;
        public ArrayList<String> option_params = new ArrayList<>();
        public String version;

        public String toString() {
            return "Params{file_token='" + C13721c.m55650d(this.file_token) + '\'' + ", mount_node_token='" + C13721c.m55650d(this.mount_node_token) + '\'' + ", mount_point='" + this.mount_point + '\'' + ", caller='" + this.caller + '\'' + ", version='" + this.version + '\'' + ", extra='" + C13721c.m55650d(this.extra) + '\'' + ", option_params='" + this.option_params + '\'' + '}';
        }

        public Params(String str, String str2, String str3, String str4, String str5, String str6) {
            this.file_token = str;
            this.mount_node_token = str2;
            this.mount_point = str3;
            this.caller = str4;
            this.version = str5;
            this.extra = str6;
            boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.drive_preview_meta_preload_enable", false);
            Log.i("FileInfoV1Puller", "FeatureGatingConstants.Drive.DRIVE_PREVIEW_META_PRELOAD_ENABLE: " + a);
            if (a) {
                this.option_params.add("preview_meta");
            }
        }
    }

    public FileInfoV1Puller(NetService netService) {
        super(netService, "/api/box/file/info/");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27623a(NetService.C5077f fVar, Params params) {
        super.mo27623a(fVar, (BasePuller.Params) params);
    }
}
