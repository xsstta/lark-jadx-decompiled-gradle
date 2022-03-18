package com.ss.android.lark.littleapp.plugin.chooseimage;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.plugins.utils.ApiCode;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38826d;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin;
import com.ss.android.lark.littleapp.util.MainTTFileHelper;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.tt.miniapp.util.C67045l;
import com.tt.miniapphost.util.C67586c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChooseMediaPlugin extends BaseChooseMediaPlugin<MediaRequest, MediaResponse> {

    public static class MediaResponse extends C25921b {
        @JSONField(name = "tempFiles")
        public List<TempFile> mTempFiles = new ArrayList();

        /* access modifiers changed from: package-private */
        public static class TempFile {
            @JSONField(name = "tempFilePath")
            public String mPath;
            @JSONField(name = "size")
            public long mSize;
            @JSONField(name = ShareHitPoint.f121869d)
            public String mType;

            TempFile() {
            }
        }

        /* access modifiers changed from: package-private */
        public static class TempVideoFile extends TempFile {
            @JSONField(name = "duration")
            public long mDuration;
            @JSONField(name = "height")
            public long mHeight;
            @JSONField(name = "width")
            public long mWidth;
            @JSONField(name = "thumbTempFilePath")
            public String thumbTempFilePath;

            TempVideoFile() {
            }
        }
    }

    public static class MediaRequest extends BaseChooseMediaPlugin.BaseRequest {
        @JSONField(name = "maxDuration")
        public int maxDuration = 60;
        @JSONField(name = "mediaType")
        public List<String> mediaType = new ArrayList();

        public int getMaxDuration() {
            int i = this.maxDuration;
            if (i <= 0 || i > 60) {
                return 60;
            }
            return i;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin
    public MediaResponse createResponse() {
        return new MediaResponse();
    }

    /* access modifiers changed from: protected */
    public BaseRouteModel createRouterModel(MediaRequest mediaRequest) {
        return new RouteMediaPickerModel(mediaRequest);
    }

    private MediaResponse standardTransformResult2Response(ArrayList<Photo> arrayList, boolean z) {
        MediaResponse createResponse = createResponse();
        Iterator<Photo> it = arrayList.iterator();
        while (it.hasNext()) {
            Photo next = it.next();
            File file = new File(next.getPath());
            if (file.exists()) {
                try {
                    if (next.isVideo()) {
                        MediaResponse.TempVideoFile tempVideoFile = new MediaResponse.TempVideoFile();
                        try {
                            BaseChooseMediaPlugin.C41405a saveFile = saveFile(file, true);
                            if (saveFile != null) {
                                tempVideoFile.mPath = saveFile.f105276a.mo235647a();
                                BaseChooseMediaPlugin.C41405a saveFile2 = saveFile(file, true, C67045l.m261303a(ImageLoader.with(this.mBridgeContext.mo92207a()).load(new C38826d(next.getPath())).downloadOnly(-1, -1)));
                                if (saveFile2 != null) {
                                    tempVideoFile.thumbTempFilePath = saveFile2.f105276a.mo235647a();
                                }
                                tempVideoFile.mDuration = next.getDuration();
                                tempVideoFile.mWidth = (long) next.getWidth();
                                tempVideoFile.mHeight = (long) next.getHeight();
                                tempVideoFile.mSize = C67586c.m263052c(file);
                                tempVideoFile.mType = EnumC41410b.VIDEO.mValue;
                                createResponse.mTempFiles.add(tempVideoFile);
                            }
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("ChooseMediaPlugin", "get video thumb error. path:" + file.getAbsolutePath() + ", error:" + e.getMessage());
                        }
                    } else {
                        MediaResponse.TempFile tempFile = new MediaResponse.TempFile();
                        BaseChooseMediaPlugin.C41405a saveFile3 = saveFile(file, z);
                        if (saveFile3 != null) {
                            tempFile.mPath = saveFile3.f105276a.mo235647a();
                            tempFile.mSize = saveFile3.f105277b;
                            tempFile.mType = EnumC41410b.IMAGE.mValue;
                            createResponse.mTempFiles.add(tempFile);
                        }
                    }
                } catch (Exception e2) {
                    AppBrandLogger.m52829e("ChooseMediaPlugin", "transform file error. path:" + file.getAbsolutePath() + ", error:" + e2.getMessage());
                }
            } else {
                AppBrandLogger.m52829e("ChooseMediaPlugin", "file is not exist. path:" + file.getAbsolutePath());
            }
        }
        if (createResponse.mTempFiles == null || createResponse.mTempFiles.isEmpty()) {
            createResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            createResponse.mErrorMessage = "media is empty";
        }
        return createResponse;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin
    public MediaResponse transformResult2Response(ArrayList<Photo> arrayList, boolean z) {
        IOException e;
        MediaResponse.TempVideoFile tempVideoFile;
        Exception e2;
        int lastIndexOf;
        if (MainTTFileHelper.m163936a(this.mLKEvent.mo92146m())) {
            return standardTransformResult2Response(arrayList, z);
        }
        MediaResponse createResponse = createResponse();
        Iterator<Photo> it = arrayList.iterator();
        while (it.hasNext()) {
            Photo next = it.next();
            File file = new File(next.getPath());
            int i = 1;
            if (file.exists()) {
                try {
                    if (next.isVideo()) {
                        MediaResponse.TempVideoFile tempVideoFile2 = new MediaResponse.TempVideoFile();
                        tempVideoFile2.mPath = getTTFilePath(getCompressOrCopyFile(file, true));
                        try {
                            File downloadOnly = ImageLoader.with(this.mBridgeContext.mo92207a()).load(new C38826d(next.getPath())).downloadOnly(-1, -1);
                            ImageUtils.ImageType a = ImageUtils.m224131a(downloadOnly);
                            String str = "." + a.getValue();
                            if (a == ImageUtils.ImageType.TYPE_UNKNOWN && (lastIndexOf = file.getName().lastIndexOf(".")) > 0) {
                                str = file.getName().substring(lastIndexOf);
                            }
                            String str2 = ((OpenPlatform.Responses.GetTempDirPath) this.mBridgeContext.mo92208a("getTempDir", OpenPlatform.Responses.GetTempDirPath.class)).mTempDirPath;
                            StringBuilder sb = new StringBuilder();
                            try {
                                sb.append(System.currentTimeMillis());
                                sb.append(str);
                                File file2 = new File(str2, sb.toString());
                                IOUtils.copyFile(downloadOnly, file2, false);
                                tempVideoFile = tempVideoFile2;
                                try {
                                    tempVideoFile.thumbTempFilePath = getTTFilePath(file2);
                                } catch (Exception e3) {
                                    e2 = e3;
                                }
                            } catch (Exception e4) {
                                e2 = e4;
                                tempVideoFile = tempVideoFile2;
                                try {
                                    e2.printStackTrace();
                                    AppBrandLogger.m52829e("ChooseMediaPlugin", "get video thumb error. path:" + file.getAbsolutePath() + ", error:" + e2.getMessage());
                                    tempVideoFile.mDuration = next.getDuration();
                                    tempVideoFile.mWidth = (long) next.getWidth();
                                    tempVideoFile.mHeight = (long) next.getHeight();
                                    tempVideoFile.mSize = C67586c.m263052c(file);
                                    tempVideoFile.mType = EnumC41410b.VIDEO.mValue;
                                    createResponse.mTempFiles.add(tempVideoFile);
                                } catch (IOException e5) {
                                    e = e5;
                                    i = 1;
                                    Object[] objArr = new Object[i];
                                    objArr[0] = "transform file error. path:" + file.getAbsolutePath() + ", error:" + e.getMessage();
                                    AppBrandLogger.m52829e("ChooseMediaPlugin", objArr);
                                }
                            }
                        } catch (Exception e6) {
                            e2 = e6;
                            tempVideoFile = tempVideoFile2;
                            e2.printStackTrace();
                            AppBrandLogger.m52829e("ChooseMediaPlugin", "get video thumb error. path:" + file.getAbsolutePath() + ", error:" + e2.getMessage());
                            tempVideoFile.mDuration = next.getDuration();
                            tempVideoFile.mWidth = (long) next.getWidth();
                            tempVideoFile.mHeight = (long) next.getHeight();
                            tempVideoFile.mSize = C67586c.m263052c(file);
                            tempVideoFile.mType = EnumC41410b.VIDEO.mValue;
                            createResponse.mTempFiles.add(tempVideoFile);
                        }
                        tempVideoFile.mDuration = next.getDuration();
                        tempVideoFile.mWidth = (long) next.getWidth();
                        tempVideoFile.mHeight = (long) next.getHeight();
                        tempVideoFile.mSize = C67586c.m263052c(file);
                        tempVideoFile.mType = EnumC41410b.VIDEO.mValue;
                        createResponse.mTempFiles.add(tempVideoFile);
                    } else {
                        MediaResponse.TempFile tempFile = new MediaResponse.TempFile();
                        try {
                            File compressOrCopyFile = getCompressOrCopyFile(file, z);
                            tempFile.mPath = getTTFilePath(compressOrCopyFile);
                            tempFile.mSize = C67586c.m263052c(compressOrCopyFile);
                            tempFile.mType = EnumC41410b.IMAGE.mValue;
                            createResponse.mTempFiles.add(tempFile);
                        } catch (IOException e7) {
                            e = e7;
                        }
                    }
                } catch (IOException e8) {
                    e = e8;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = "transform file error. path:" + file.getAbsolutePath() + ", error:" + e.getMessage();
                    AppBrandLogger.m52829e("ChooseMediaPlugin", objArr2);
                }
            } else {
                AppBrandLogger.m52829e("ChooseMediaPlugin", "file is not exist. path:" + file.getAbsolutePath());
            }
        }
        if (createResponse.mTempFiles == null || createResponse.mTempFiles.isEmpty()) {
            createResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            createResponse.mErrorMessage = "media is empty";
        }
        return createResponse;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin
    public boolean checkParams(AbstractC25897h<MediaResponse> hVar, BaseChooseMediaPlugin.BaseRequest baseRequest, ILogger aVar) {
        return super.checkParams(hVar, baseRequest, aVar);
    }

    @LKPluginFunction(async = true, eventName = {"chooseMedia"})
    public void chooseMedia(LKEvent lKEvent, AbstractC25905b bVar, AbstractC25897h<MediaResponse> hVar, MediaRequest mediaRequest, ILogger aVar) {
        handleAction(lKEvent, bVar, hVar, mediaRequest, aVar);
    }
}
