package com.bytedance.ee.bear.drive.biz.docplugin;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.attachment.filereader.AbstractC4283a;
import com.bytedance.ee.bear.attachment.filereader.FileClickData;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceAttachmentOpenEntity;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.desktop.resultmodel.FileClickModel;
import com.bytedance.ee.bear.drive.biz.docplugin.AbstractBinderC6405b;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6729c;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13737d;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class AttachmentOpenPlugin extends DocumentPlugin {
    public AbstractC7947h mFileExitCallback;

    public void exitFile() {
        C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "exitFile()...");
        getUIContainer().mo19597c(this);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.AttachmentOpenPlugin$b */
    private class C6398b implements AbstractC7945d<String> {
        private C6398b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "FileExitHandler, exit file from js : " + str);
            AttachmentOpenPlugin.this.exitFile();
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.AttachmentOpenPlugin$c */
    private class C6399c implements AbstractC7945d<String> {
        private C6399c() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "FileOnExitHandler, exit file from native : " + str);
            AttachmentOpenPlugin.this.mFileExitCallback = hVar;
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        boolean z;
        if (getDocViewModel().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        map.put("biz.util.fileClick", new C6397a(z));
        map.put("biz.util.exitFile", new C6398b());
        map.put("biz.util.onFileExit", new C6399c());
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.AttachmentOpenPlugin$a */
    private class C6397a implements AbstractC7945d<FileClickModel> {

        /* renamed from: a */
        boolean f17702a;

        public C6397a(boolean z) {
            this.f17702a = z;
        }

        /* renamed from: a */
        public void handle(FileClickModel fileClickModel, AbstractC7947h hVar) {
            C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "FileClickHandler, enableFollow = " + this.f17702a + ", Open file : " + fileClickModel);
            AttachmentOpenPlugin.this.openFile(fileClickModel, this.f17702a);
        }
    }

    public void openFile(FileClickModel fileClickModel, boolean z) {
        String str;
        if (fileClickModel == null) {
            C13479a.m54758a("drive_in_doc_attachment_AttachmentOpenPlugin", "openFile()... data is null");
        } else if (z) {
            if ("sheet_attach".equalsIgnoreCase(fileClickModel.getPreview_from())) {
                str = "45";
            } else {
                str = "19";
            }
            SpaceAttachmentOpenEntity spaceAttachmentOpenEntity = new SpaceAttachmentOpenEntity(str, fileClickModel.getDrive_file_key(), fileClickModel.getFile_name());
            spaceAttachmentOpenEntity.setBusinessId(fileClickModel.getPreview_from());
            spaceAttachmentOpenEntity.setMountNodeToken(fileClickModel.getMount_node_token());
            spaceAttachmentOpenEntity.setMountPoint(fileClickModel.getMount_point());
            spaceAttachmentOpenEntity.setPreviewFrom(fileClickModel.getPreview_from());
            C4957m mVar = new C4957m();
            mVar.f14546e = true;
            C6729c cVar = new C6729c(false, new AbstractBinderC6405b() {
                /* class com.bytedance.ee.bear.drive.biz.docplugin.AttachmentOpenPlugin.BinderC63961 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.drive.biz.docplugin.AbstractBinderC6405b
                /* renamed from: a */
                public void mo25700a(AbstractBinderC6405b.C6406a aVar) {
                    C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "DriveOpenPlugin onCallback, native return data . result=" + aVar.toString());
                    if (aVar.mo25713a() == 100) {
                        AttachmentOpenPlugin.this.getUIContainer().mo19597c(AttachmentOpenPlugin.this);
                        if (AttachmentOpenPlugin.this.mFileExitCallback != null) {
                            C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "DriveOpenPlugin onCallback: ");
                            AttachmentOpenPlugin.this.mFileExitCallback.mo17188a(new JSONObject());
                            return;
                        }
                        C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "DriveOpenPlugin onCallback: mFileExitCallback is null");
                        AttachmentOpenPlugin.this.execJS("javascript:window.lark.biz.util.onFileExit", new JSONObject());
                    }
                }
            });
            cVar.mo26480b(true);
            if (fileClickModel.getType() == 1) {
                C13479a.m54764b("drive_in_doc_attachment_AttachmentOpenPlugin", "DriveOpenPlugin openFile: ");
                getUIContainer().mo19590a(this, DriveMainFragment.m27489a(spaceAttachmentOpenEntity, cVar), mVar);
                return;
            }
            C13479a.m54758a("drive_in_doc_attachment_AttachmentOpenPlugin", "DriveOpenPlugin openFile: type is invalid data=" + fileClickModel.toString());
        } else if (!C13737d.m55693a(800)) {
            C13479a.m54775e("drive_in_doc_attachment_AttachmentOpenPlugin", "is not ValidClick");
        } else {
            ((AbstractC4283a) KoinJavaComponent.m268610a(AbstractC4283a.class)).mo16874a(getDocViewModel().getToken(), new FileClickData(fileClickModel.getFile_id(), fileClickModel.getDrive_file_key(), fileClickModel.getFile_name(), fileClickModel.getFile_mime_type(), fileClickModel.getFile_size(), fileClickModel.getType(), fileClickModel.getMount_node_token(), fileClickModel.getMount_point(), fileClickModel.getDownLoadPath(), fileClickModel.getPreview_from()));
        }
    }
}
