package com.ss.android.lark.littleapp.plugin.chooseimage;

import android.content.Intent;
import android.graphics.Bitmap;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.plugins.utils.ApiCode;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.common.SystemPermission;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin.BaseRequest;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.tt.miniapp.util.C67045l;
import com.tt.refer.common.util.C67858b;
import com.tt.refer.impl.business.file.TTFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.C69104g;

public abstract class BaseChooseMediaPlugin<Req extends BaseRequest, Res extends C25921b> extends AbstractC25889a {
    protected AbstractC25905b mBridgeContext;
    protected boolean mCompressed;
    protected boolean mContainsAlbum = true;
    protected boolean mContainsCamera = true;
    protected AbstractC25897h<Res> mEventInvokeCallback;
    protected LKEvent mLKEvent;
    protected boolean mOriginal;

    public static class BaseRequest extends C25920a {
        @JSONField(name = "cameraDevice")
        public String mCameraDevice;
        @JSONField(name = "count")
        public int mSelectMaxCount = 9;
        @JSONField(name = "sizeType")
        public List<String> mSizeTypeArray = new ArrayList();
        @JSONField(name = "sourceType")
        public List<String> mSourceTypeArray = new ArrayList();
    }

    /* access modifiers changed from: protected */
    public abstract Res createResponse();

    /* access modifiers changed from: protected */
    public abstract BaseRouteModel createRouterModel(Req req);

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Res transformResult2Response(ArrayList<Photo> arrayList, boolean z);

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mBridgeContext = null;
        this.mEventInvokeCallback = null;
        this.mLKEvent = null;
    }

    /* access modifiers changed from: protected */
    public boolean keepOrigin() {
        if (!this.mOriginal || this.mCompressed) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String getTTFilePath(File file) {
        OpenPlatform.Requests.ConvertFilePathToTTFile convertFilePathToTTFile = new OpenPlatform.Requests.ConvertFilePathToTTFile();
        convertFilePathToTTFile.mFilePath = file.getPath();
        return ((OpenPlatform.Responses.ConvertFilePathToTTFile) this.mBridgeContext.mo92210a("convertFilePathToTTFile", convertFilePathToTTFile, OpenPlatform.Responses.ConvertFilePathToTTFile.class)).mTTFilePath;
    }

    private void handlePhotoPickerResult(Intent intent) {
        final boolean booleanExtra = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
        final ArrayList arrayList = (ArrayList) intent.getSerializableExtra("KEY_SELECTED_MEDIA");
        if (!C67858b.m263996a(arrayList)) {
            AppBrandLogger.m52830i("BaseChooseMediaPlugin", "handlePhotoPickerResult. keepOrigin:" + booleanExtra);
            Observable.create(new Action() {
                /* class com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin.C414042 */

                /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: com.larksuite.framework.apiplugin.a.h<Res extends com.larksuite.framework.apiplugin.common.b> */
                /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: com.larksuite.framework.apiplugin.a.h<Res extends com.larksuite.framework.apiplugin.common.b> */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    try {
                        AppBrandLogger.m52830i("BaseChooseMediaPlugin", "handlePhotoPickerResult");
                        BaseChooseMediaPlugin.this.mEventInvokeCallback.callback(BaseChooseMediaPlugin.this.transformResult2Response(arrayList, booleanExtra));
                    } catch (Exception e) {
                        C25921b createResponse = BaseChooseMediaPlugin.this.createResponse();
                        createResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        createResponse.mErrorMessage = e.getMessage();
                        BaseChooseMediaPlugin.this.mEventInvokeCallback.callback(createResponse);
                        AppBrandLogger.m52829e("BaseChooseMediaPlugin", "handleImageFiles", e);
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
            return;
        }
        AppBrandLogger.m52830i("BaseChooseMediaPlugin", "chooseImage list is empty");
        Res createResponse = createResponse();
        createResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
        createResponse.mErrorMessage = "photos is empty";
        AppBrandLogger.m52829e("BaseChooseMediaPlugin", "photos is empty");
        this.mEventInvokeCallback.callback(createResponse);
    }

    /* access modifiers changed from: protected */
    public void initParams(BaseRequest baseRequest) {
        if (baseRequest.mSelectMaxCount <= 0) {
            baseRequest.mSelectMaxCount = 9;
        }
        if (baseRequest.mSelectMaxCount > 20) {
            baseRequest.mSelectMaxCount = 20;
        }
        baseRequest.mSourceTypeArray.removeAll(Arrays.asList("", null));
        if (baseRequest.mSourceTypeArray.size() != 0) {
            this.mContainsCamera = baseRequest.mSourceTypeArray.contains(EnumC41412d.CAMERA.mValue);
            this.mContainsAlbum = baseRequest.mSourceTypeArray.contains(EnumC41412d.ALBUM.mValue);
        }
        this.mOriginal = true;
        this.mCompressed = true;
        baseRequest.mSizeTypeArray.removeAll(Arrays.asList("", null));
        if (baseRequest.mSizeTypeArray.size() != 0) {
            this.mOriginal = baseRequest.mSizeTypeArray.contains(EnumC41411c.ORIGINAL.mValue);
            this.mCompressed = baseRequest.mSizeTypeArray.contains(EnumC41411c.COMPRESSED.mValue);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin$a */
    public static class C41405a {

        /* renamed from: a */
        public final TTFile f105276a;

        /* renamed from: b */
        public final long f105277b;

        public C41405a(TTFile gVar, long j) {
            this.f105276a = gVar;
            this.f105277b = j;
        }
    }

    /* access modifiers changed from: protected */
    public C41405a saveFile(File file, boolean z) throws IOException {
        return saveFile(file, z, C69104g.m265935d(file));
    }

    /* access modifiers changed from: protected */
    public File getCompressOrCopyFile(File file, boolean z) throws IOException {
        String str;
        String path = file.getPath();
        OpenPlatform.Responses.GetTempDirPath getTempDirPath = (OpenPlatform.Responses.GetTempDirPath) this.mBridgeContext.mo92208a("getTempDir", OpenPlatform.Responses.GetTempDirPath.class);
        if (!z) {
            if (path.endsWith(".png")) {
                String str2 = getTempDirPath.mTempDirPath;
                File file2 = new File(str2, System.currentTimeMillis() + ".png");
                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.PNG, 75, file2.toString());
                return file2;
            } else if (path.endsWith(".jpg")) {
                String str3 = getTempDirPath.mTempDirPath;
                File file3 = new File(str3, System.currentTimeMillis() + ".jpg");
                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.JPEG, 75, file3.toString());
                return file3;
            } else if (path.endsWith(".jpeg")) {
                String str4 = getTempDirPath.mTempDirPath;
                File file4 = new File(str4, System.currentTimeMillis() + ".jpeg");
                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.JPEG, 75, file4.toString());
                return file4;
            }
        }
        int lastIndexOf = file.getName().lastIndexOf(".");
        if (lastIndexOf > 0) {
            str = file.getName().substring(lastIndexOf);
        } else {
            str = "";
        }
        String str5 = getTempDirPath.mTempDirPath;
        File file5 = new File(str5, System.currentTimeMillis() + str);
        IOUtils.copyFile(file, file5, false);
        return file5;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (this.mEventInvokeCallback == null) {
            Log.m165389i("BaseChooseMediaPlugin", "mEventInvokeCallback is null");
            return false;
        } else if (i2 == 0) {
            Log.m165389i("BaseChooseMediaPlugin", "canceled");
            Res createResponse = createResponse();
            createResponse.mErrorCode = C25906a.f64073c.f64115H;
            createResponse.mErrorMessage = C25906a.f64073c.f64117J;
            this.mEventInvokeCallback.callback(createResponse);
            return true;
        } else if (i2 == -1) {
            if (i == 233 || i == 20010) {
                handlePhotoPickerResult(intent);
            }
            return true;
        } else {
            Log.m165389i("BaseChooseMediaPlugin", "requestCode:" + i + "   resultCode" + i2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkParams(AbstractC25897h<Res> hVar, BaseRequest baseRequest, ILogger aVar) {
        for (String str : baseRequest.mSourceTypeArray) {
            if (!EnumC41412d.contains(str)) {
                aVar.mo92223e("BaseChooseMediaPlugin", "sourceType invalid:" + str);
                Res createResponse = createResponse();
                createResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
                createResponse.mErrorMessage = ApiCode.GENERAL_PARAM.msg;
                hVar.callback(createResponse);
                return true;
            }
        }
        for (String str2 : baseRequest.mSizeTypeArray) {
            if (!EnumC41411c.contains(str2)) {
                aVar.mo92223e("BaseChooseMediaPlugin", "sizeType invalid:" + str2);
                Res createResponse2 = createResponse();
                createResponse2.mErrorCode = ApiCode.GENERAL_PARAM.code;
                createResponse2.mErrorMessage = ApiCode.GENERAL_PARAM.msg;
                hVar.callback(createResponse2);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public C41405a saveFile(File file, boolean z, String str) throws IOException {
        String path = file.getPath();
        if (!z) {
            Bitmap.CompressFormat a = C67045l.m261297a(path);
            if (a != null) {
                file = C67045l.m261300a(file, 640, 480, a, 75, this.mBridgeContext.mo92207a());
            } else {
                AppBrandLogger.m52831w("BaseChooseMediaPlugin", "compress format is null, path:" + path);
            }
        }
        OpenPlatform.CopySystemFileRequest copySystemFileRequest = new OpenPlatform.CopySystemFileRequest();
        copySystemFileRequest.mTag = this.mLKEvent.mo92146m();
        copySystemFileRequest.mSrcPath = file.getPath();
        TTFile gVar = TTFile.f171100b;
        TTFile a2 = gVar.mo235646a(System.currentTimeMillis() + "." + str);
        copySystemFileRequest.mDestTTPath = a2.mo235647a();
        OpenPlatform.CopySystemFileResponse copySystemFileResponse = (OpenPlatform.CopySystemFileResponse) this.mBridgeContext.mo92210a("copySystemFile", copySystemFileRequest, OpenPlatform.CopySystemFileResponse.class);
        if (copySystemFileResponse != null && copySystemFileResponse.mSuccess) {
            return new C41405a(a2, file.length());
        }
        AppBrandLogger.m52829e("BaseChooseMediaPlugin", "copy file failed");
        return null;
    }

    /* access modifiers changed from: protected */
    public void handleAction(LKEvent lKEvent, final AbstractC25905b bVar, final AbstractC25897h<Res> hVar, Req req, ILogger aVar) {
        this.mBridgeContext = bVar;
        this.mEventInvokeCallback = hVar;
        this.mLKEvent = lKEvent;
        if (checkParams(hVar, req, aVar)) {
            aVar.mo92223e("BaseChooseMediaPlugin", "invalid params");
            return;
        }
        initParams(req);
        SystemPermission.Request request = new SystemPermission.Request();
        request.mPermissions.add("android.permission.WRITE_EXTERNAL_STORAGE");
        if (this.mContainsAlbum) {
            if (this.mContainsCamera) {
                request.mPermissions.add("android.permission.CAMERA");
            }
            request.mPermissions.add("android.permission.READ_EXTERNAL_STORAGE");
        } else if (this.mContainsCamera) {
            request.mPermissions.add("android.permission.CAMERA");
        }
        final BaseRouteModel createRouterModel = createRouterModel(req);
        Log.m165389i("BaseChooseMediaPlugin", "request permission start");
        bVar.mo92209a("requestSystemPermission", request, new AbstractC25897h<SystemPermission.Response>() {
            /* class com.ss.android.lark.littleapp.plugin.chooseimage.BaseChooseMediaPlugin.C414031 */

            /* renamed from: a */
            public void callback(SystemPermission.Response response) {
                if (C67858b.m263996a(response.mDeniedPermissions)) {
                    AppBrandLogger.m52830i("BaseChooseMediaPlugin", "request permission success");
                    bVar.mo92213a(new ChooseMediaCallActivityCallback(createRouterModel));
                    return;
                }
                AppBrandLogger.m52830i("BaseChooseMediaPlugin", "request permission fail");
                C25921b createResponse = BaseChooseMediaPlugin.this.createResponse();
                createResponse.mErrorCode = C25906a.f64075e.f64115H;
                createResponse.mErrorMessage = C25906a.f64075e.f64117J;
                hVar.callback(createResponse);
            }
        }, SystemPermission.Response.class);
    }
}
