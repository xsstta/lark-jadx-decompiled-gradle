package com.bytedance.ee.bear.basesdk.route;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveCallback;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity;
import com.bytedance.ee.bear.contract.route.lark.AbstractC5220a;
import com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean;
import com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToAlbumMenu;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToSpaceMenu;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.ForwardMenuAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.ForwardMenu;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

public class SpaceRouteProxyImpl implements AbstractC5220a {

    /* renamed from: a */
    private C10929e f13163a;

    public SpaceRouteProxyImpl(C10929e eVar) {
        this.f13163a = eVar;
    }

    /* access modifiers changed from: private */
    public static class SaveCallback extends BinderSaveCallback.Stub {
        private WeakReference<SaveToLocalMenu.AbstractC6873a> saveCbRef;

        public SaveCallback(SaveToLocalMenu.AbstractC6873a aVar) {
            this.saveCbRef = new WeakReference<>(aVar);
        }

        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5154d
        public void onSaved(boolean z) {
            SaveToLocalMenu.AbstractC6873a aVar = this.saveCbRef.get();
            if (aVar != null) {
                aVar.mo27042a(z, null);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class ForwardMenuProxyAction extends BinderMenuAction.Stub {
        private String fileId;
        private AttachmentBaseMenuAction menuAction;

        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
        public void action(Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("EXTRA_KEY_CUR_TOKEN", this.fileId);
            this.menuAction.mo27053b().action(bundle);
        }

        public ForwardMenuProxyAction(AttachmentBaseMenuAction attachmentBaseMenuAction, String str) {
            this.menuAction = attachmentBaseMenuAction;
            this.fileId = str;
        }
    }

    /* renamed from: b */
    private boolean m18513b(SpaceRouteBean spaceRouteBean) throws Exception {
        if (spaceRouteBean instanceof SpaceMultipleDriveFileRouteBean) {
            SpaceMultipleDriveFileRouteBean spaceMultipleDriveFileRouteBean = (SpaceMultipleDriveFileRouteBean) spaceRouteBean;
            ArrayList<SpaceMultipleDriveFileRouteBean.DriveFile> a = spaceMultipleDriveFileRouteBean.mo20939a();
            ArrayList<? extends BaseOpenEntity> arrayList = new ArrayList<>();
            int i = 0;
            for (int i2 = 0; i2 < a.size(); i2++) {
                SpaceMultipleDriveFileRouteBean.DriveFile driveFile = a.get(i2);
                if (TextUtils.equals(driveFile.mo20945a(), spaceMultipleDriveFileRouteBean.mo20963c())) {
                    i = i2;
                }
                SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity = new SpaceThirdPartyOpenEntity("10", driveFile.mo20945a(), "");
                spaceThirdPartyOpenEntity.setMountNodeToken(driveFile.mo20947b());
                spaceThirdPartyOpenEntity.setMountPoint(driveFile.mo20949c());
                spaceThirdPartyOpenEntity.setUniqueId(driveFile.mo20945a());
                if (spaceRouteBean.mo20965e() != null) {
                    spaceThirdPartyOpenEntity.setBusinessId(spaceRouteBean.mo20965e().get("bussinessId"));
                    spaceThirdPartyOpenEntity.setPreviewFrom(spaceThirdPartyOpenEntity.getBusinessId());
                }
                if (spaceRouteBean.mo20965e() != null && "calendar".equalsIgnoreCase(spaceRouteBean.mo20965e().get("bussinessId"))) {
                    spaceThirdPartyOpenEntity.setAppId("25");
                }
                m18512a(spaceThirdPartyOpenEntity, spaceMultipleDriveFileRouteBean.mo20966f());
                arrayList.add(spaceThirdPartyOpenEntity);
            }
            ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21093a(((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b(), arrayList, i);
            return true;
        } else if ("thirdparty_attachment".equalsIgnoreCase(spaceRouteBean.mo20964d()) || 12 == spaceRouteBean.mo20961b()) {
            SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity2 = new SpaceThirdPartyOpenEntity("10", spaceRouteBean.mo20963c(), "");
            if (spaceRouteBean.mo20965e() != null) {
                spaceThirdPartyOpenEntity2.setMountNodeToken(spaceRouteBean.mo20965e().get("mountNodeToken"));
                spaceThirdPartyOpenEntity2.setMountPoint(spaceRouteBean.mo20965e().get("mountPoint"));
                if (spaceRouteBean.mo20965e() != null && "calendar".equalsIgnoreCase(spaceRouteBean.mo20965e().get("bussinessId"))) {
                    spaceThirdPartyOpenEntity2.setAppId("25");
                }
            }
            spaceThirdPartyOpenEntity2.setUniqueId(spaceRouteBean.mo20963c());
            if (spaceRouteBean.mo20965e() != null) {
                spaceThirdPartyOpenEntity2.setBusinessId(spaceRouteBean.mo20965e().get("bussinessId"));
                spaceThirdPartyOpenEntity2.setPreviewFrom(spaceThirdPartyOpenEntity2.getBusinessId());
            }
            m18512a(spaceThirdPartyOpenEntity2, spaceRouteBean.mo20966f());
            ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21092a(((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b(), spaceThirdPartyOpenEntity2);
            return true;
        } else {
            C13479a.m54758a("SpaceRouteProxyImpl", "routeByDrive with MultipleDriveFileRouteBean, but tokens is empty");
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.contract.route.lark.AbstractC5220a
    /* renamed from: a */
    public boolean mo17264a(SpaceRouteBean spaceRouteBean) {
        if (spaceRouteBean == null) {
            C13479a.m54758a("SpaceRouteProxyImpl", "spaceRouteBean is null");
            return false;
        }
        try {
            if (m18513b(spaceRouteBean)) {
                C13479a.m54764b("SpaceRouteProxyImpl", "SpaceRouteBean route to drive");
                return true;
            } else if (TextUtils.isEmpty(spaceRouteBean.mo20963c())) {
                C13479a.m54758a("SpaceRouteProxyImpl", "spaceRouteBean token is empty");
                return false;
            } else if (TextUtils.equals(C8275a.m34050a(spaceRouteBean.mo20961b()), C8275a.f22369b.mo32553a())) {
                C13479a.m54758a("SpaceRouteProxyImpl", "unknown type, route type=" + spaceRouteBean.mo20961b());
                return false;
            } else {
                RouteBean routeBean = new RouteBean();
                routeBean.mo40621g(spaceRouteBean.mo20964d());
                routeBean.mo40612a(spaceRouteBean.mo20965e());
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(m18511a(spaceRouteBean.mo20963c(), spaceRouteBean.mo20964d()), routeBean);
                return true;
            }
        } catch (Throwable th) {
            C13479a.m54761a("SpaceRouteProxyImpl", th);
            return false;
        }
    }

    /* renamed from: a */
    private String m18511a(String str, String str2) {
        return C6313i.m25327a().mo25382a(C8275a.f22375h.mo32553a(), str, str2);
    }

    /* renamed from: a */
    private void m18512a(BaseOpenEntity baseOpenEntity, Bundle bundle) {
        int i;
        if (bundle != null) {
            try {
                bundle.setClassLoader(BaseOpenEntity.class.getClassLoader());
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("AttachmentMenuConfig");
                if (parcelableArrayList == null) {
                    C13479a.m54764b("SpaceRouteProxyImpl", "attachmentBaseMenuActions is null");
                    return;
                }
                ArrayList<BaseMoreMenuAction> arrayList = new ArrayList<>();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AttachmentBaseMenuAction attachmentBaseMenuAction = (AttachmentBaseMenuAction) it.next();
                    if (attachmentBaseMenuAction instanceof ForwardMenuAction) {
                        if (attachmentBaseMenuAction.mo27054c() != 0) {
                            i = attachmentBaseMenuAction.mo27054c();
                        } else {
                            i = R.string.Drive_Drive_ShareToChat;
                        }
                        arrayList.add(new ForwardMenu(i, new ForwardMenuProxyAction(attachmentBaseMenuAction, baseOpenEntity.getFileId())));
                    } else {
                        boolean z = false;
                        if (attachmentBaseMenuAction instanceof SaveToLocalMenu) {
                            boolean b = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36543b(C8275a.f22375h.mo32555b(), baseOpenEntity.getFileId());
                            int c = attachmentBaseMenuAction.mo27054c();
                            if (c == 0) {
                                if (attachmentBaseMenuAction instanceof SaveToAlbumMenu) {
                                    c = R.string.Doc_Facade_SaveToAlbum;
                                    z = true;
                                } else {
                                    c = R.string.Drive_Drive_SaveToLocal;
                                }
                            }
                            com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenu saveToLocalMenu = new com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenu(c);
                            saveToLocalMenu.mo20437a(b);
                            saveToLocalMenu.mo29758d(z);
                            saveToLocalMenu.mo20434a(R.string.CreationMobile_ECM_AdminDisableToast);
                            saveToLocalMenu.mo29757a(new SaveCallback(((SaveToLocalMenu) attachmentBaseMenuAction).mo27037a()));
                            arrayList.add(saveToLocalMenu);
                        } else if (attachmentBaseMenuAction instanceof SaveToSpaceMenu) {
                            com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToSpaceMenu saveToSpaceMenu = new com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToSpaceMenu();
                            saveToSpaceMenu.mo20439b(((SaveToSpaceMenu) attachmentBaseMenuAction).mo27044a());
                            saveToSpaceMenu.mo20441c(false);
                            C13479a.m54764b("SpaceRouteProxyImpl", "addCompatMoreMenus() SaveToSpaceMenu isVisible=" + saveToSpaceMenu.mo20446g());
                            arrayList.add(saveToSpaceMenu);
                        }
                    }
                }
                baseOpenEntity.setMoreMenuActions(arrayList);
            } catch (Exception e) {
                C13479a.m54761a("SpaceRouteProxyImpl", e);
            }
        }
    }
}
