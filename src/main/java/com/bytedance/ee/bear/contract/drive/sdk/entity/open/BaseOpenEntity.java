package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;

public class BaseOpenEntity implements Parcelable, NonProguard {
    private String apiExtra;
    private String appId;
    private int bizType;
    private Bundle extras;
    private String fileExt;
    private String fileId;
    private String fileName;
    private boolean inVc;
    private BinderOpenLifecycle mBinderOpenLifecycle;
    private ArrayList<BaseMoreMenuAction> mMoreMenuActions;
    private String previewFrom;
    private int previewType;
    private String uniqueId;

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity$a */
    interface AbstractC5156a {
        void onClose();

        void onOpenFinish(int i, String str);

        void onVisibleChange(boolean z);
    }

    public int describeContents() {
        return 0;
    }

    public String getMountPoint() {
        return null;
    }

    public String getApiExtra() {
        return this.apiExtra;
    }

    public String getAppId() {
        return this.appId;
    }

    public BinderOpenLifecycle getBinderOpenLifecycle() {
        return this.mBinderOpenLifecycle;
    }

    public int getBizType() {
        return this.bizType;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public String getFileExt() {
        return this.fileExt;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public ArrayList<BaseMoreMenuAction> getMoreMenuActions() {
        return this.mMoreMenuActions;
    }

    public String getPreviewFrom() {
        return this.previewFrom;
    }

    public int getPreviewType() {
        return this.previewType;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public boolean isInVc() {
        return this.inVc;
    }

    public String toString() {
        return "BaseOpenEntity{appId='" + this.appId + '\'' + ", fileId='" + C13598b.m55200g(this.fileId) + '\'' + ", fileName='" + C13598b.m55197d(this.fileName) + '\'' + ", uniqueId='" + C13598b.m55197d(this.uniqueId) + '\'' + ", mMoreMenuActions=" + this.mMoreMenuActions + ", mBinderOpenLifecycle=" + this.mBinderOpenLifecycle + ", bizType=" + this.bizType + ", previewFrom=" + this.previewFrom + ", fileExt=" + this.fileExt + ", previewType=" + this.previewType + ", inVc=" + this.inVc + '}';
    }

    public void setApiExtra(String str) {
        this.apiExtra = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public BaseOpenEntity setBinderOpenLifecycle(BinderOpenLifecycle binderOpenLifecycle) {
        this.mBinderOpenLifecycle = binderOpenLifecycle;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void setBizType(int i) {
        this.bizType = i;
    }

    public void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public void setFileExt(String str) {
        this.fileExt = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setInVc(boolean z) {
        this.inVc = z;
    }

    public void setMoreMenuActions(ArrayList<BaseMoreMenuAction> arrayList) {
        this.mMoreMenuActions = arrayList;
    }

    public void setPreviewFrom(String str) {
        this.previewFrom = str;
    }

    public void setPreviewType(int i) {
        this.previewType = i;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setFileId(String str) {
        if (str == null) {
            str = "";
        }
        this.fileId = str;
    }

    protected BaseOpenEntity(Parcel parcel) {
        boolean z;
        this.appId = "";
        this.fileId = "";
        this.fileName = "";
        this.uniqueId = "";
        this.fileExt = "";
        try {
            this.appId = parcel.readString();
            this.fileId = parcel.readString();
            this.fileName = parcel.readString();
            this.uniqueId = parcel.readString();
            ArrayList<BaseMoreMenuAction> arrayList = new ArrayList<>();
            this.mMoreMenuActions = arrayList;
            parcel.readList(arrayList, BaseMoreMenuAction.class.getClassLoader());
            this.mBinderOpenLifecycle = BinderOpenLifecycle.Stub.asInterface(parcel.readStrongBinder());
            this.bizType = parcel.readInt();
            this.apiExtra = parcel.readString();
            this.previewFrom = parcel.readString();
            this.fileExt = parcel.readString();
            this.extras = parcel.readBundle();
            this.previewType = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.inVc = z;
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#BaseOpenEntity", "BaseOpenEntity#BaseOpenEntity(Parcel) error=", th);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        byte b;
        try {
            parcel.writeString(this.appId);
            parcel.writeString(this.fileId);
            parcel.writeString(this.fileName);
            parcel.writeString(this.uniqueId);
            parcel.writeList(this.mMoreMenuActions);
            BinderOpenLifecycle binderOpenLifecycle = this.mBinderOpenLifecycle;
            if (binderOpenLifecycle == null) {
                iBinder = null;
            } else {
                iBinder = binderOpenLifecycle.asBinder();
            }
            parcel.writeStrongBinder(iBinder);
            parcel.writeInt(this.bizType);
            parcel.writeString(this.apiExtra);
            parcel.writeString(this.previewFrom);
            parcel.writeString(this.fileExt);
            parcel.writeBundle(this.extras);
            parcel.writeInt(this.previewType);
            if (this.inVc) {
                b = 1;
            } else {
                b = 0;
            }
            parcel.writeByte(b);
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#BaseOpenEntity", "BaseOpenEntity#writeToParcel() error=", th);
        }
    }

    BaseOpenEntity(String str, String str2, String str3, String str4, ArrayList<BaseMoreMenuAction> arrayList) {
        this(str, str2, str3, str4, arrayList, null);
    }

    BaseOpenEntity(String str, String str2, String str3, String str4, ArrayList<BaseMoreMenuAction> arrayList, BinderOpenLifecycle binderOpenLifecycle) {
        this.appId = "";
        this.fileId = "";
        this.fileName = "";
        this.uniqueId = "";
        this.fileExt = "";
        this.appId = str;
        this.fileId = str2;
        this.fileName = str3;
        this.uniqueId = str4;
        this.mMoreMenuActions = arrayList;
        this.mBinderOpenLifecycle = binderOpenLifecycle;
    }
}
