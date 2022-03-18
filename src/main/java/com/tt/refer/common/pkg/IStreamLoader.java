package com.tt.refer.common.pkg;

import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import java.io.InputStream;

public interface IStreamLoader {
    TTAPkgFile findFile(String str);

    <T> T getAppInfo();

    int getDownloadType();

    String getLoadPkgType();

    String getStringCache(String str, byte[] bArr);

    TTAPkgInfo getTTAPkgInfo();

    int getTTApkgVersion();

    boolean isDirectoryOfPkg(String str);

    boolean isFirstLaunch();

    boolean isReady();

    boolean isUseLocalPkg();

    void release();

    byte[] requestBytes(TTAPkgFile tTAPkgFile);

    InputStream requestStream(TTAPkgFile tTAPkgFile);

    String waitExtractFinish(TTAPkgFile tTAPkgFile);
}
