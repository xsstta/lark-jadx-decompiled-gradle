package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadCallBack;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class DownloadMenu extends BaseMoreMenuAction {
    public static final Parcelable.Creator<DownloadMenu> CREATOR = new Parcelable.Creator<DownloadMenu>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu.C75762 */

        /* renamed from: a */
        public DownloadMenu[] newArray(int i) {
            return new DownloadMenu[i];
        }

        /* renamed from: a */
        public DownloadMenu createFromParcel(Parcel parcel) {
            return new DownloadMenu(parcel);
        }
    };

    /* renamed from: e */
    private BinderProxyDownloadCallBack f20571e;

    /* renamed from: f */
    private BinderProxyDownloadUpdaterContainer f20572f;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: f */
    public int mo20445f() {
        return R.string.CreationMobile_ECM_AdminDisableToast;
    }

    /* renamed from: j */
    public BinderProxyDownloadCallBack mo29740j() {
        return this.f20571e;
    }

    public DownloadMenu() {
        this((int) R.string.Drive_Sdk_Download);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: e */
    public boolean mo20444e() {
        if (this.f14888d == null) {
            return super.mo20444e();
        }
        if (!mo20442d()) {
            return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36540a(3, 5, this.f14888d.getAppId());
        }
        return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36540a(3, 0, this.f14888d.getAppId());
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: c */
    public void mo20440c() {
        if (this.f14888d != null) {
            if (!mo20442d()) {
                ((IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class)).mo37702a(12, 7, this.f14888d.getAppId(), this.f14888d.getFileId(), (Boolean) false, (String) null);
            } else if (!TextUtils.isEmpty(this.f14888d.getFileId())) {
                ((IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class)).mo37702a(16, 7, this.f14888d.getAppId(), this.f14888d.getFileId(), (Boolean) true, ((LocalOpenEntity) this.f14888d).getThirdPartyAppID());
            }
            ((AbstractC7583a) KoinJavaComponent.m268610a(AbstractC7583a.class)).mo27995a(this.f14888d, "download", "none");
        }
        if (!mo20448i()) {
            C13479a.m54758a("DriveSdk#AbsMoreMenuAction", "DownloadMenu#execute() no default action now, ignore it");
        }
    }

    protected DownloadMenu(int i) {
        super(i);
        this.f20572f = new BinderProxyDownloadUpdaterContainer.Stub() {
            /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu.BinderC75751 */
            private BinderProxyDownloadUpdater mBinderProxyDownloadUpdater;

            @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5153c
            public BinderProxyDownloadUpdater getProxyDownloadUpdater() {
                return this.mBinderProxyDownloadUpdater;
            }

            @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5153c
            public void setProxyDownloadUpdater(BinderProxyDownloadUpdater binderProxyDownloadUpdater) {
                this.mBinderProxyDownloadUpdater = binderProxyDownloadUpdater;
            }
        };
    }

    protected DownloadMenu(Parcel parcel) {
        super(parcel);
        try {
            this.f20571e = BinderProxyDownloadCallBack.Stub.asInterface(parcel.readStrongBinder());
            this.f20572f = BinderProxyDownloadUpdaterContainer.Stub.asInterface(parcel.readStrongBinder());
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "DownloadMenu#DownloadMenu(Parcel) error=", th);
        }
    }

    /* renamed from: a */
    public void mo29735a(BinderProxyDownloadUpdater binderProxyDownloadUpdater) {
        C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "DownloadMenu#setBinderProxyDownloadUpdater() -> " + binderProxyDownloadUpdater + " this=" + hashCode());
        this.f20572f.setProxyDownloadUpdater(binderProxyDownloadUpdater);
    }

    /* renamed from: b */
    public void mo29739b(String str) {
        C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "DownloadMenu#hideDownloadingView() binderProxyDownloadUpdater = " + this.f20572f.getProxyDownloadUpdater() + " this=" + hashCode());
        if (this.f20572f.getProxyDownloadUpdater() != null) {
            this.f20572f.getProxyDownloadUpdater().hideDownloadingView("", str);
        }
    }

    /* renamed from: a */
    public void mo29736a(String str) {
        C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "DownloadMenu#showDownloadingView() binderProxyDownloadUpdater = " + this.f20572f.getProxyDownloadUpdater() + " this=" + hashCode());
        if (this.f20572f.getProxyDownloadUpdater() != null) {
            this.f20572f.getProxyDownloadUpdater().showDownloadingView("", str);
        }
    }

    /* renamed from: a */
    public void mo29734a(BinderMenuAction binderMenuAction, BinderProxyDownloadCallBack binderProxyDownloadCallBack) {
        super.mo20435a(binderMenuAction);
        this.f20571e = binderProxyDownloadCallBack;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        super.writeToParcel(parcel, i);
        try {
            BinderProxyDownloadCallBack binderProxyDownloadCallBack = this.f20571e;
            IBinder iBinder2 = null;
            if (binderProxyDownloadCallBack == null) {
                iBinder = null;
            } else {
                iBinder = binderProxyDownloadCallBack.asBinder();
            }
            parcel.writeStrongBinder(iBinder);
            BinderProxyDownloadUpdaterContainer binderProxyDownloadUpdaterContainer = this.f20572f;
            if (binderProxyDownloadUpdaterContainer != null) {
                iBinder2 = binderProxyDownloadUpdaterContainer.asBinder();
            }
            parcel.writeStrongBinder(iBinder2);
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "DownloadMenu#writeToParcel() error=", th);
        }
    }

    /* renamed from: a */
    public void mo29737a(String str, int i) {
        C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "DownloadMenu#onDownloadingProgressChange() binderProxyDownloadUpdater = " + this.f20572f.getProxyDownloadUpdater() + " this=" + hashCode());
        if (this.f20572f.getProxyDownloadUpdater() != null) {
            this.f20572f.getProxyDownloadUpdater().onDownloadingProgressChange("", str, i);
        }
    }

    /* renamed from: a */
    public void mo29738a(String str, String str2) {
        C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "DownloadMenu#onDownloadingFailed() binderProxyDownloadUpdater = " + this.f20572f.getProxyDownloadUpdater() + " this=" + hashCode());
        if (this.f20572f.getProxyDownloadUpdater() != null) {
            this.f20572f.getProxyDownloadUpdater().onFailed("", str, str2);
        }
    }
}
