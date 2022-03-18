package com.bytedance.ee.bear.drive.biz.docplugin;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.browser.plugin.PluginHostAbility;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.drive.OpenAttachFileAbility;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.drive.biz.docplugin.AbstractBinderC6405b;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6729c;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13737d;
import java.util.ArrayList;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class ThirdPartyAttachmentOpenPlugin extends DocumentPluginV2 implements OpenAttachFileAbility {
    public AbstractC7947h mOnAttachFileExitCallback;

    public void exitAttachFileFragmentIfNeed() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer != null && uIContainer.mo19586a((AbstractC4941c) this) != null) {
            uIContainer.mo19597c(this);
        }
    }

    public void notifyJsAttachFileExited() {
        AbstractC7947h hVar = this.mOnAttachFileExitCallback;
        if (hVar != null) {
            hVar.mo17188a(new JSONObject());
            C13479a.m54764b("ThirdPartyAttachmentOpenPlugin", "execute mOnAttachFileExitCallback#onCallback");
            return;
        }
        dispatchBridgeMsg("window.lark.biz.util.onAttachFileExit", new JSONObject());
        C13479a.m54764b("ThirdPartyAttachmentOpenPlugin", "call js onAttachFileExit");
    }

    public void closeAttachFile(SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity) {
        notifyJsAttachFileExited();
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.ThirdPartyAttachmentOpenPlugin$b */
    private class C6402b implements AbstractC7945d<String> {
        private C6402b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("ThirdPartyAttachmentOpenPlugin", "ExitAttachFileHandler()...");
            ThirdPartyAttachmentOpenPlugin.this.exitAttachFileFragmentIfNeed();
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.ThirdPartyAttachmentOpenPlugin$c */
    private class C6403c implements AbstractC7945d<String> {
        private C6403c() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("ThirdPartyAttachmentOpenPlugin", "OnAttachFileExitHandler()...");
            ThirdPartyAttachmentOpenPlugin.this.mOnAttachFileExitCallback = hVar;
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        eVar.mo19545a((PluginHostAbility) this);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        eVar.mo19553b((PluginHostAbility) this);
    }

    @Override // com.bytedance.ee.bear.contract.drive.OpenAttachFileAbility
    public void openAttachFile(SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity) {
        if (spaceThirdPartyOpenEntity != null) {
            openAttachmentFragmentUnderFollow(spaceThirdPartyOpenEntity);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        boolean z;
        if (getDocumentMetadata().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        map.put("biz.util.attachFileClick", new C6401a(z));
        map.put("biz.util.exitAttachFile", new C6402b());
        map.put("biz.util.onAttachFileExit", new C6403c());
    }

    public void openAttachmentFragmentUnderFollow(SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity) {
        C4957m mVar = new C4957m();
        mVar.f14546e = true;
        C6729c cVar = new C6729c(false, new AbstractBinderC6405b() {
            /* class com.bytedance.ee.bear.drive.biz.docplugin.ThirdPartyAttachmentOpenPlugin.BinderC64001 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.drive.biz.docplugin.AbstractBinderC6405b
            /* renamed from: a */
            public void mo25700a(AbstractBinderC6405b.C6406a aVar) {
                C13479a.m54764b("ThirdPartyAttachmentOpenPlugin", "DriveMainFragment onCallback, result = " + aVar.toString());
                if (aVar.mo25713a() == 100) {
                    ThirdPartyAttachmentOpenPlugin.this.exitAttachFileFragmentIfNeed();
                    ThirdPartyAttachmentOpenPlugin.this.notifyJsAttachFileExited();
                }
            }
        });
        cVar.mo26480b(true);
        getUIContainer().mo19590a(this, DriveMainFragment.m27489a(spaceThirdPartyOpenEntity, cVar), mVar);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.ThirdPartyAttachmentOpenPlugin$a */
    private class C6401a implements AbstractC7945d<AttachmentFileModel> {

        /* renamed from: a */
        boolean f17707a;

        public C6401a(boolean z) {
            this.f17707a = z;
        }

        /* renamed from: a */
        public void handle(AttachmentFileModel attachmentFileModel, AbstractC7947h hVar) {
            String str;
            if (attachmentFileModel == null) {
                C13479a.m54758a("ThirdPartyAttachmentOpenPlugin", "AttachFileClickHandler()... data must not be null");
            } else if (!C13737d.m55693a(800)) {
                C13479a.m54775e("ThirdPartyAttachmentOpenPlugin", "is not ValidClick");
            } else {
                C13479a.m54764b("ThirdPartyAttachmentOpenPlugin", "AttachFileClickHandler()... enableFollow = " + this.f17707a + ", Open attachment:" + attachmentFileModel);
                if ("bitable_attach".equalsIgnoreCase(attachmentFileModel.getBussinessId())) {
                    str = "26";
                } else {
                    str = "44";
                }
                SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity = new SpaceThirdPartyOpenEntity(str, attachmentFileModel.getFileToken(), attachmentFileModel.getFileName());
                spaceThirdPartyOpenEntity.setApiExtra(attachmentFileModel.getExtra());
                spaceThirdPartyOpenEntity.setMountPoint(attachmentFileModel.getMountPoint());
                spaceThirdPartyOpenEntity.setMountNodeToken(attachmentFileModel.getMountNodeToken());
                spaceThirdPartyOpenEntity.setPreviewFrom(attachmentFileModel.getBussinessId());
                spaceThirdPartyOpenEntity.setBusinessId(attachmentFileModel.getBussinessId());
                ArrayList<BaseMoreMenuAction> arrayList = new ArrayList<>();
                arrayList.add(new SaveToLocalMenuV2());
                spaceThirdPartyOpenEntity.setMoreMenuActions(arrayList);
                if (!this.f17707a) {
                    try {
                        ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21092a(((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b(), spaceThirdPartyOpenEntity);
                    } catch (Exception e) {
                        C13479a.m54761a("ThirdPartyAttachmentOpenPlugin", e);
                    }
                } else {
                    ThirdPartyAttachmentOpenPlugin.this.openAttachmentFragmentUnderFollow(spaceThirdPartyOpenEntity);
                }
            }
        }
    }
}
