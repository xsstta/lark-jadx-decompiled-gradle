package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.net.Uri;
import android.os.Bundle;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.List;

@RemoteService
public interface IHost extends IHookInterface {
    String docImageDownload(String str, String str2, int i, boolean z, AbstractC43389a aVar);

    int driveCancelDownload(String[] strArr);

    int driveCancelUpload(List<String> list);

    String driveDownload(String str, String str2, String str3, String str4, int i, String str5, AbstractC43389a aVar);

    String driveUpload(Uri uri, String str, String str2, String str3, AbstractC43390b bVar);

    String driveUpload(String str, String str2, String str3, String str4, AbstractC43390b bVar);

    String getAccessKey();

    long getAppId();

    String getAppVersionName();

    String getChatterAvatarByUserId(String str, int i);

    int getCurNetWorkLevel();

    String getCurrentLabelId();

    String getDeviceId();

    String getDomain();

    int getEnv();

    boolean getFGByKey(String str);

    int getFileIconByMIMEType(String str, String str2);

    String getFilePathListKey();

    String getForwardModuleAdditionNoteKey();

    String getGeckoRootFilePath();

    String getLan();

    String getSession();

    String getUserId();

    boolean is24HourClock();

    boolean isDebug();

    boolean isStrongBadgeRemind();

    boolean isUserSPContains(String str);

    boolean isUsingTTWebView();

    void launchReplyLotsOfMessagesActivity(String str, String str2);

    void openChat(String str);

    boolean openProfile(String str, String str2, String str3, String str4);

    void putBoolean(String str, boolean z);

    void reportBusiness(String str, String str2);

    void reportSlardar(String str, String str2);

    TranslationSetting syncTranslationSetting();

    void tryInitDrive();

    boolean tryOpenUrlWithAppBrowser(String str);

    boolean tryOpenUrlWithDoc(String str);

    boolean tryOpenUrlWithLittleApp(String str);

    boolean useCNString();

    boolean viewByDrive(Bundle bundle);
}
