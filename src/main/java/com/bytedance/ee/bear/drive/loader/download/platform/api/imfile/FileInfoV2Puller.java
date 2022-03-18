package com.bytedance.ee.bear.drive.loader.download.platform.api.imfile;

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

public class FileInfoV2Puller extends BasePuller<Params, Result> {

    public static class Result extends BasePuller.Result {
        @JSONField(name = "available_preview_type")
        public int[] availablePreviewType;
        @JSONField(name = "file_token")
        public String fileToken;
        @JSONField(name = "mime_type")
        public String mimeType;
        public String name;
        @JSONField(name = "permission_status_code")
        public int permissionStatusCode;
        @JSONField(name = "preview_meta")
        public String previewMeta;
        @JSONField(name = "preview_status")
        public int previewStatus;
        @JSONField(name = "save_status")
        public int saveStatus;
        public long size;
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
            return "Result{name='" + this.name + '\'' + ", size='" + this.size + '\'' + ", availablePreviewType='" + Arrays.toString(this.availablePreviewType) + '\'' + ", previewStatus='" + this.previewStatus + '\'' + ", permissionStatusCode='" + this.permissionStatusCode + '\'' + ", saveStatus='" + this.saveStatus + '\'' + ", fileToken='" + this.fileToken + '\'' + ", webOffice='" + this.webOffice + '\'' + '}';
        }
    }

    public static class Params extends BasePuller.Params {
        public String app_file_id;
        public String app_id;
        public String auth_extra;
        public ArrayList<String> option_params;

        public String toString() {
            return "Params{app_id='" + C13721c.m55650d(this.app_id) + '\'' + ", app_file_id='" + C13721c.m55650d(this.app_file_id) + '\'' + ", auth_extra='" + C13721c.m55650d(this.auth_extra) + '\'' + ", option_params='" + this.option_params + '\'' + '}';
        }

        public Params(String str, String str2, String str3) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.option_params = arrayList;
            this.app_id = str;
            this.app_file_id = str2;
            this.auth_extra = str3;
            arrayList.add("save_status");
            boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.drive_preview_meta_preload_enable", false);
            Log.i("FileInfoV2Puller", "FeatureGatingConstants.Drive.DRIVE_PREVIEW_META_PRELOAD_ENABLE: " + a);
            if (a) {
                this.option_params.add("preview_meta");
            }
        }
    }

    public FileInfoV2Puller(NetService netService) {
        super(netService, "/api/box/sdk/file/info/");
    }
}
