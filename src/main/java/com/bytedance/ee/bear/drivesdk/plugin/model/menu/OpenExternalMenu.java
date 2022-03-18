package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class OpenExternalMenu extends DownloadMenu {
    public static final Parcelable.Creator<OpenExternalMenu> CREATOR = new Parcelable.Creator<OpenExternalMenu>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu.C75791 */

        /* renamed from: a */
        public OpenExternalMenu[] newArray(int i) {
            return new OpenExternalMenu[i];
        }

        /* renamed from: a */
        public OpenExternalMenu createFromParcel(Parcel parcel) {
            return new OpenExternalMenu(parcel);
        }
    };

    @Override // com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: f */
    public int mo20445f() {
        return R.string.CreationMobile_ECM_AdminDisableToast;
    }

    @Override // com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: e */
    public boolean mo20444e() {
        if (this.f14888d == null) {
            return super.mo20444e();
        }
        if (!mo20442d()) {
            return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36540a(6, 5, this.f14888d.getAppId());
        }
        return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36540a(6, 0, this.f14888d.getAppId());
    }

    @Override // com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: c */
    public void mo20440c() {
        if (this.f14888d != null) {
            if (!mo20442d()) {
                ((IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class)).mo37702a(12, 13, this.f14888d.getAppId(), this.f14888d.getFileId(), (Boolean) false, (String) null);
            } else if (!TextUtils.isEmpty(this.f14888d.getFileId())) {
                ((IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class)).mo37702a(16, 13, this.f14888d.getAppId(), this.f14888d.getFileId(), (Boolean) true, ((LocalOpenEntity) this.f14888d).getThirdPartyAppID());
            }
            ((AbstractC7583a) KoinJavaComponent.m268610a(AbstractC7583a.class)).mo27995a(this.f14888d, "open_in_other_apps", "none");
        }
        if (!mo20448i()) {
            C13479a.m54758a("DriveSdk#AbsMoreMenuAction", "OpenExternalMenu#execute() no default action now, ignore it");
        }
    }

    protected OpenExternalMenu(Parcel parcel) {
        super(parcel);
    }

    public OpenExternalMenu(BinderMenuAction binderMenuAction) {
        super((int) R.string.Drive_Drive_OpenWithOtherApps);
        this.f14885a = binderMenuAction;
    }

    @Override // com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
