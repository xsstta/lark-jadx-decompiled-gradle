package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.mail.impl.service.upload.IDownloadCallbackStub;
import com.ss.android.lark.mail.impl.service.upload.IUploadCallbackStub;
import java.util.List;

public final class IHostProxy implements IInterface, IHost {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getAccessKey() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(30, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getAccessKey throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getAppVersionName() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(33, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getAppVersionName throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getCurNetWorkLevel() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getCurNetWorkLevel throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getCurrentLabelId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(36, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getCurrentLabelId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getDeviceId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(32, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getDeviceId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getDomain() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(31, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getDomain throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getEnv() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getEnv throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getFilePathListKey() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getFilePathListKey throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getForwardModuleAdditionNoteKey() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getForwardModuleAdditionNoteKey throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getGeckoRootFilePath() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getGeckoRootFilePath throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getLan() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getLan throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getSession() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getSession throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getUserId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getUserId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void tryInitDrive() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method tryInitDrive throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public long getAppId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(29, obtain, obtain2, 0);
            obtain2.readException();
            long readLong = obtain2.readLong();
            obtain2.recycle();
            obtain.recycle();
            return readLong;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getAppId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return 0;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean is24HourClock() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method is24HourClock throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isDebug() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method isDebug throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isStrongBadgeRemind() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method isStrongBadgeRemind throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isUsingTTWebView() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(41, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method isUsingTTWebView throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public TranslationSetting syncTranslationSetting() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        TranslationSetting translationSetting = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(35, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                translationSetting = TranslationSetting.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method syncTranslationSetting throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return translationSetting;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean useCNString() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            this.mRemote.transact(27, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method useCNString throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int driveCancelDownload(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeStringArray(strArr);
            this.mRemote.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method driveCancelDownload throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int driveCancelUpload(List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeList(list);
            this.mRemote.transact(22, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method driveCancelUpload throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void openChat(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            this.mRemote.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method openChat throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean getFGByKey(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getFGByKey throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isUserSPContains(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            this.mRemote.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method isUserSPContains throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithAppBrowser(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            this.mRemote.transact(40, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method tryOpenUrlWithAppBrowser throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithDoc(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            this.mRemote.transact(37, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method tryOpenUrlWithDoc throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithLittleApp(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            this.mRemote.transact(39, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method tryOpenUrlWithLittleApp throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean viewByDrive(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(38, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method viewByDrive throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IHostProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getFileIconByMIMEType(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getFileIconByMIMEType throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void launchReplyLotsOfMessagesActivity(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method launchReplyLotsOfMessagesActivity throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void putBoolean(String str, boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method putBoolean throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void reportBusiness(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method reportBusiness throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void reportSlardar(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method reportSlardar throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getChatterAvatarByUserId(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method getChatterAvatarByUserId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean openProfile(String str, String str2, String str3, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method openProfile throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String docImageDownload(String str, String str2, int i, boolean z, AbstractC43389a aVar) {
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        String str3 = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            if (aVar != null) {
                obtain.writeStrongBinder(new IDownloadCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            str3 = obtain2.readString();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method docImageDownload throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return str3;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveUpload(Uri uri, String str, String str2, String str3, AbstractC43390b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        String str4 = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (bVar != null) {
                obtain.writeStrongBinder(new IUploadCallbackStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            str4 = obtain2.readString();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method driveUpload throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return str4;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveUpload(String str, String str2, String str3, String str4, AbstractC43390b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        String str5 = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            if (bVar != null) {
                obtain.writeStrongBinder(new IUploadCallbackStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            str5 = obtain2.readString();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method driveUpload throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return str5;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveDownload(String str, String str2, String str3, String str4, int i, String str5, AbstractC43389a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        String str6 = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(i);
            obtain.writeString(str5);
            if (aVar != null) {
                obtain.writeStrongBinder(new IDownloadCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            str6 = obtain2.readString();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProxy", "call method driveDownload throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return str6;
    }
}
