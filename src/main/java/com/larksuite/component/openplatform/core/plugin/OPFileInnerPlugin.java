package com.larksuite.component.openplatform.core.plugin;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class OPFileInnerPlugin extends OPPlugin {

    public static final class GetTTFileInfoRequest extends C25920a {
        public String mTTFilePath;
    }

    public static final class GetTTFileInfoResponse extends C25921b {
        public String mRealFilePath;
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(eventName = {"convertFilePathToTTFile"})
    public OpenPlatform.Responses.ConvertFilePathToTTFile convertFilePathToTTFile(OpenPlatform.Requests.ConvertFilePathToTTFile convertFilePathToTTFile, ILogger aVar) {
        aVar.mo92224i("OPFileInnerPlugin", "filePath:" + convertFilePathToTTFile.mFilePath);
        OpenPlatform.Responses.ConvertFilePathToTTFile convertFilePathToTTFile2 = new OpenPlatform.Responses.ConvertFilePathToTTFile();
        convertFilePathToTTFile2.mTTFilePath = getApiDependency().mo235048d(convertFilePathToTTFile.mFilePath);
        return convertFilePathToTTFile2;
    }

    @LKPluginFunction(eventName = {"getTempDir"})
    public OpenPlatform.Responses.GetTempDirPath getTempDirPath(OpenPlatform.Requests.GetTempDirPath getTempDirPath, ILogger aVar) {
        aVar.mo92224i("OPFileInnerPlugin", "getTempDirPath");
        OpenPlatform.Responses.GetTempDirPath getTempDirPath2 = new OpenPlatform.Responses.GetTempDirPath();
        getTempDirPath2.mTempDirPath = getApiDependency().mo235047d().getPath();
        return getTempDirPath2;
    }

    @LKPluginFunction(eventName = {"copySystemFile"})
    public OpenPlatform.CopySystemFileResponse copySystemFile(OpenPlatform.CopySystemFileRequest copySystemFileRequest, LKEvent lKEvent) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        b.mo92224i("OPFileInnerPlugin", "src:" + copySystemFileRequest.mSrcPath + " dest:" + copySystemFileRequest.mDestTTPath + " tag:" + copySystemFileRequest.mTag);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        File file = new File(copySystemFileRequest.mSrcPath);
        TTFile gVar = new TTFile(copySystemFileRequest.mDestTTPath);
        TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), copySystemFileRequest.mTag);
        OpenPlatform.CopySystemFileResponse copySystemFileResponse = new OpenPlatform.CopySystemFileResponse();
        try {
            copySystemFileResponse.mSuccess = aVar.mo235605a(file, gVar, hVar);
        } catch (TTFileException e) {
            TTFileHelper.m264258a(copySystemFileResponse, e, b);
        }
        return copySystemFileResponse;
    }

    @LKPluginFunction(eventName = {"getSystemFile"})
    public OpenPlatform.GetSystemFileResponse getSystemFile(OpenPlatform.GetSystemFileRequest getSystemFileRequest, LKEvent lKEvent) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        b.mo92224i("OPFileInnerPlugin", "ttFilePath:" + getSystemFileRequest.mTTFilePath + " tag:" + getSystemFileRequest.mTag);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar = new TTFile(getSystemFileRequest.mTTFilePath);
        TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), getSystemFileRequest.mTag);
        OpenPlatform.GetSystemFileResponse getSystemFileResponse = new OpenPlatform.GetSystemFileResponse();
        try {
            File i = aVar.mo235635i(gVar, hVar);
            if (i != null) {
                getSystemFileResponse.mFilePath = i.getAbsolutePath();
            } else {
                b.mo92223e("OPFileInnerPlugin", "getSystemFile return null");
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(getSystemFileResponse, e, b);
        }
        return getSystemFileResponse;
    }

    @LKPluginFunction(eventName = {"getTTFileInfo"})
    public GetTTFileInfoResponse getTTFileInfo(LKEvent lKEvent, GetTTFileInfoRequest getTTFileInfoRequest) {
        GetTTFileInfoResponse getTTFileInfoResponse = new GetTTFileInfoResponse();
        AppBrandLogger.m52830i("OPFileInnerPlugin", "filePath:" + getTTFileInfoRequest.mTTFilePath);
        if (!TextUtils.isEmpty(getTTFileInfoRequest.mTTFilePath)) {
            getTTFileInfoResponse.mRealFilePath = ((AbstractC67722a) getEventContext(lKEvent).findServiceByInterface(AbstractC67722a.class)).mo235082b(getTTFileInfoRequest.mTTFilePath);
        }
        AppBrandLogger.m52830i("OPFileInnerPlugin", "real file path:" + getTTFileInfoResponse.mRealFilePath);
        return getTTFileInfoResponse;
    }
}
