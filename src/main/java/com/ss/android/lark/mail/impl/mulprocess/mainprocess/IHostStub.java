package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.HostImp;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.mail.impl.service.upload.IDownloadCallbackStub;
import com.ss.android.lark.mail.impl.service.upload.IUploadCallbackStub;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.List;

public final class IHostStub extends Binder implements IInterface, IHost {
    public final HostImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getAccessKey() {
        return this.base.getAccessKey();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public long getAppId() {
        return this.base.getAppId();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getAppVersionName() {
        return this.base.getAppVersionName();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getCurNetWorkLevel() {
        return this.base.getCurNetWorkLevel();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getCurrentLabelId() {
        return this.base.getCurrentLabelId();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getDeviceId() {
        return this.base.getDeviceId();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getDomain() {
        return this.base.getDomain();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getEnv() {
        return this.base.getEnv();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getFilePathListKey() {
        return this.base.getFilePathListKey();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getForwardModuleAdditionNoteKey() {
        return this.base.getForwardModuleAdditionNoteKey();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getGeckoRootFilePath() {
        return this.base.getGeckoRootFilePath();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getLan() {
        return this.base.getLan();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getSession() {
        return this.base.getSession();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getUserId() {
        return this.base.getUserId();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean is24HourClock() {
        return this.base.is24HourClock();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isDebug() {
        return this.base.isDebug();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isStrongBadgeRemind() {
        return this.base.isStrongBadgeRemind();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isUsingTTWebView() {
        return this.base.isUsingTTWebView();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public TranslationSetting syncTranslationSetting() {
        return this.base.syncTranslationSetting();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void tryInitDrive() {
        this.base.tryInitDrive();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean useCNString() {
        return this.base.useCNString();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int driveCancelDownload(String[] strArr) {
        return this.base.driveCancelDownload(strArr);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int driveCancelUpload(List<String> list) {
        return this.base.driveCancelUpload(list);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean getFGByKey(String str) {
        return this.base.getFGByKey(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isUserSPContains(String str) {
        return this.base.isUserSPContains(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void openChat(String str) {
        this.base.openChat(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithAppBrowser(String str) {
        return this.base.tryOpenUrlWithAppBrowser(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithDoc(String str) {
        return this.base.tryOpenUrlWithDoc(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithLittleApp(String str) {
        return this.base.tryOpenUrlWithLittleApp(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean viewByDrive(Bundle bundle) {
        return this.base.viewByDrive(bundle);
    }

    public IHostStub(Context context) {
        this.base = new HostImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getChatterAvatarByUserId(String str, int i) {
        return this.base.getChatterAvatarByUserId(str, i);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getFileIconByMIMEType(String str, String str2) {
        return this.base.getFileIconByMIMEType(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void launchReplyLotsOfMessagesActivity(String str, String str2) {
        this.base.launchReplyLotsOfMessagesActivity(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void putBoolean(String str, boolean z) {
        this.base.putBoolean(str, z);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void reportBusiness(String str, String str2) {
        this.base.reportBusiness(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void reportSlardar(String str, String str2) {
        this.base.reportSlardar(str, str2);
    }

    public static IHostProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IHostProxy)) {
            return new IHostProxy(context, iBinder);
        }
        return (IHostProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean openProfile(String str, String str2, String str3, String str4) {
        return this.base.openProfile(str, str2, str3, str4);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i != 1598968902) {
            Uri uri = null;
            Bundle bundle = null;
            boolean z2 = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean isDebug = isDebug();
                    parcel2.writeNoException();
                    parcel2.writeInt(isDebug ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean fGByKey = getFGByKey(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(fGByKey ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String userId = getUserId();
                    parcel2.writeNoException();
                    parcel2.writeString(userId);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean openProfile = openProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(openProfile ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String chatterAvatarByUserId = getChatterAvatarByUserId(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(chatterAvatarByUserId);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    launchReplyLotsOfMessagesActivity(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    reportBusiness(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    reportSlardar(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String forwardModuleAdditionNoteKey = getForwardModuleAdditionNoteKey();
                    parcel2.writeNoException();
                    parcel2.writeString(forwardModuleAdditionNoteKey);
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean is24HourClock = is24HourClock();
                    parcel2.writeNoException();
                    parcel2.writeInt(is24HourClock ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean isStrongBadgeRemind = isStrongBadgeRemind();
                    parcel2.writeNoException();
                    parcel2.writeInt(isStrongBadgeRemind ? 1 : 0);
                    return true;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String lan = getLan();
                    parcel2.writeNoException();
                    parcel2.writeString(lan);
                    return true;
                case 13:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean isUserSPContains = isUserSPContains(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isUserSPContains ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String session = getSession();
                    parcel2.writeNoException();
                    parcel2.writeString(session);
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String driveDownload = driveDownload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), IDownloadCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(driveDownload);
                    return true;
                case 16:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String driveUpload = driveUpload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), IUploadCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(driveUpload);
                    return true;
                case 17:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    String driveUpload2 = driveUpload(uri, parcel.readString(), parcel.readString(), parcel.readString(), IUploadCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(driveUpload2);
                    return true;
                case 18:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    if (parcel.readInt() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    String docImageDownload = docImageDownload(readString, readString2, readInt, z, IDownloadCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(docImageDownload);
                    return true;
                case 19:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    int driveCancelDownload = driveCancelDownload(parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(driveCancelDownload);
                    return true;
                case 20:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    tryInitDrive();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String filePathListKey = getFilePathListKey();
                    parcel2.writeNoException();
                    parcel2.writeString(filePathListKey);
                    return true;
                case 22:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    int driveCancelUpload = driveCancelUpload(parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(driveCancelUpload);
                    return true;
                case 23:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    openChat(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    int fileIconByMIMEType = getFileIconByMIMEType(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(fileIconByMIMEType);
                    return true;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    putBoolean(readString3, z2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    int env = getEnv();
                    parcel2.writeNoException();
                    parcel2.writeInt(env);
                    return true;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean useCNString = useCNString();
                    parcel2.writeNoException();
                    parcel2.writeInt(useCNString ? 1 : 0);
                    return true;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    int curNetWorkLevel = getCurNetWorkLevel();
                    parcel2.writeNoException();
                    parcel2.writeInt(curNetWorkLevel);
                    return true;
                case 29:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    long appId = getAppId();
                    parcel2.writeNoException();
                    parcel2.writeLong(appId);
                    return true;
                case 30:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String accessKey = getAccessKey();
                    parcel2.writeNoException();
                    parcel2.writeString(accessKey);
                    return true;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String domain = getDomain();
                    parcel2.writeNoException();
                    parcel2.writeString(domain);
                    return true;
                case 32:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String deviceId = getDeviceId();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceId);
                    return true;
                case 33:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String appVersionName = getAppVersionName();
                    parcel2.writeNoException();
                    parcel2.writeString(appVersionName);
                    return true;
                case 34:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String geckoRootFilePath = getGeckoRootFilePath();
                    parcel2.writeNoException();
                    parcel2.writeString(geckoRootFilePath);
                    return true;
                case 35:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    TranslationSetting syncTranslationSetting = syncTranslationSetting();
                    parcel2.writeNoException();
                    if (syncTranslationSetting != null) {
                        parcel2.writeInt(1);
                        syncTranslationSetting.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 36:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    String currentLabelId = getCurrentLabelId();
                    parcel2.writeNoException();
                    parcel2.writeString(currentLabelId);
                    return true;
                case 37:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean tryOpenUrlWithDoc = tryOpenUrlWithDoc(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(tryOpenUrlWithDoc ? 1 : 0);
                    return true;
                case 38:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean viewByDrive = viewByDrive(bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(viewByDrive ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean tryOpenUrlWithLittleApp = tryOpenUrlWithLittleApp(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(tryOpenUrlWithLittleApp ? 1 : 0);
                    return true;
                case 40:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean tryOpenUrlWithAppBrowser = tryOpenUrlWithAppBrowser(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(tryOpenUrlWithAppBrowser ? 1 : 0);
                    return true;
                case 41:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
                    boolean isUsingTTWebView = isUsingTTWebView();
                    parcel2.writeNoException();
                    parcel2.writeInt(isUsingTTWebView ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            return true;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String docImageDownload(String str, String str2, int i, boolean z, AbstractC43389a aVar) {
        return this.base.docImageDownload(str, str2, i, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveUpload(Uri uri, String str, String str2, String str3, AbstractC43390b bVar) {
        return this.base.driveUpload(uri, str, str2, str3, bVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveUpload(String str, String str2, String str3, String str4, AbstractC43390b bVar) {
        return this.base.driveUpload(str, str2, str3, str4, bVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveDownload(String str, String str2, String str3, String str4, int i, String str5, AbstractC43389a aVar) {
        return this.base.driveDownload(str, str2, str3, str4, i, str5, aVar);
    }
}
