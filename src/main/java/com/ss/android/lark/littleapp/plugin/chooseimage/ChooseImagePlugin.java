package com.ss.android.lark.littleapp.plugin.chooseimage;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.plugins.utils.ApiCode;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.entity.RouteOpenCameraModel;
import com.ss.android.lark.littleapp.entity.RoutePhotoPickerModel;
import com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin;
import com.ss.android.lark.littleapp.util.MainTTFileHelper;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.tt.miniapphost.util.C67586c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChooseImagePlugin extends BaseChooseMediaPlugin<BaseChooseMediaPlugin.BaseRequest, Response> {

    public static class Response extends C25921b {
        @JSONField(name = "tempFilePaths")
        public List<String> mTempFilePaths = new ArrayList();
        @JSONField(name = "tempFiles")
        public List<TempFile> mTempFiles = new ArrayList();

        public static class TempFile {
            @JSONField(name = "path")
            public String mPath;
            @JSONField(name = "size")
            public long mSize;
        }
    }

    private boolean isShowOriginOption() {
        if (!this.mOriginal || !this.mCompressed) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin
    public Response createResponse() {
        return new Response();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin
    public BaseRouteModel createRouterModel(BaseChooseMediaPlugin.BaseRequest baseRequest) {
        if (this.mContainsAlbum) {
            return new RoutePhotoPickerModel(baseRequest.mSelectMaxCount, isShowOriginOption(), keepOrigin(), this.mContainsCamera);
        }
        if (!this.mContainsCamera) {
            return null;
        }
        boolean z = false;
        if (!TextUtils.isEmpty(baseRequest.mCameraDevice)) {
            z = baseRequest.mCameraDevice.contains(EnumC41409a.FRONT.mValue);
        }
        return new RouteOpenCameraModel(z);
    }

    private Response standardTransformResult2Response(ArrayList<Photo> arrayList, boolean z) {
        Response createResponse = createResponse();
        Iterator<Photo> it = arrayList.iterator();
        while (it.hasNext()) {
            Photo next = it.next();
            File file = new File(next.getPath());
            if (!file.exists() || next.isVideo()) {
                AppBrandLogger.m52829e("TextChooseImagePlugin", "file is not exist. path:" + file.getAbsolutePath());
            } else {
                try {
                    BaseChooseMediaPlugin.C41405a saveFile = saveFile(file, z);
                    if (saveFile != null) {
                        Response.TempFile tempFile = new Response.TempFile();
                        tempFile.mPath = saveFile.f105276a.mo235647a();
                        tempFile.mSize = saveFile.f105277b;
                        createResponse.mTempFiles.add(tempFile);
                        createResponse.mTempFilePaths.add(saveFile.f105276a.mo235647a());
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("TextChooseImagePlugin", "save file exception", e);
                }
            }
        }
        if (createResponse.mTempFiles == null || createResponse.mTempFiles.isEmpty()) {
            createResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            createResponse.mErrorMessage = "photo is empty";
        }
        return createResponse;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin
    public Response transformResult2Response(ArrayList<Photo> arrayList, boolean z) {
        if (MainTTFileHelper.m163936a(this.mLKEvent.mo92146m())) {
            AppBrandLogger.m52830i("TextChooseImagePlugin", "use new file sandbox transform");
            return standardTransformResult2Response(arrayList, z);
        }
        Response createResponse = createResponse();
        Iterator<Photo> it = arrayList.iterator();
        while (it.hasNext()) {
            Photo next = it.next();
            File file = new File(next.getPath());
            if (!file.exists() || next.isVideo()) {
                AppBrandLogger.m52829e("TextChooseImagePlugin", "file is not exist. path:" + file.getAbsolutePath());
            } else {
                try {
                    Response.TempFile tempFile = new Response.TempFile();
                    File compressOrCopyFile = getCompressOrCopyFile(file, z);
                    String tTFilePath = getTTFilePath(compressOrCopyFile);
                    tempFile.mPath = tTFilePath;
                    tempFile.mSize = C67586c.m263052c(compressOrCopyFile);
                    createResponse.mTempFiles.add(tempFile);
                    createResponse.mTempFilePaths.add(tTFilePath);
                } catch (IOException e) {
                    AppBrandLogger.m52829e("TextChooseImagePlugin", "transform path exception", e);
                }
            }
        }
        if (createResponse.mTempFiles == null || createResponse.mTempFiles.isEmpty()) {
            createResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            createResponse.mErrorMessage = "photo is empty";
        }
        return createResponse;
    }

    @LKPluginFunction(async = true, eventName = {"chooseImage"})
    public void chooseImage(LKEvent lKEvent, AbstractC25905b bVar, AbstractC25897h<Response> hVar, BaseChooseMediaPlugin.BaseRequest baseRequest, ILogger aVar) {
        AppBrandLogger.m52830i("TextChooseImagePlugin", "plugin process start");
        handleAction(lKEvent, bVar, hVar, baseRequest, aVar);
    }
}
