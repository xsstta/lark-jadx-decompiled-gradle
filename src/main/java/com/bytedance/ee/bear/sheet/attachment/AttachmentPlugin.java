package com.bytedance.ee.bear.sheet.attachment;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.attachment.AttachmentModelList;
import com.bytedance.ee.bear.sheet.attachment.C11033c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import java.util.Map;

public class AttachmentPlugin extends DocumentPlugin implements AbstractC6054a {
    private C11027a showAttachmentHandler;
    public C11033c viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return false;
    }

    public void hideAttachmentList() {
        C11028a attachmentFragment = getAttachmentFragment();
        if (attachmentFragment != null) {
            attachmentFragment.mo5513b();
        }
    }

    private C11028a getAttachmentFragment() {
        return (C11028a) getActivity().getSupportFragmentManager().findFragmentByTag("AttachmentFragment");
    }

    public void showAttachmentList() {
        if (getAttachmentFragment() == null) {
            ((C11028a) instantiateFragment(C11028a.class)).mo5511a(getActivity().getSupportFragmentManager(), "AttachmentFragment");
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.attachment.AttachmentPlugin$a */
    private class C11027a implements AbstractC7945d<AttachmentModelList> {

        /* renamed from: b */
        private AbstractC7947h f29690b;

        private C11027a() {
        }

        /* renamed from: a */
        public void mo42086a(AttachmentModelList.AttachmentModel attachmentModel) {
            C13479a.m54764b("AttachmentPlugin", "onSelectAttachment");
            AbstractC7947h hVar = this.f29690b;
            if (hVar != null) {
                hVar.mo17189a(attachmentModel);
            }
        }

        /* renamed from: a */
        public void handle(AttachmentModelList attachmentModelList, AbstractC7947h hVar) {
            this.f29690b = hVar;
            if (AttachmentPlugin.this.viewModel != null) {
                if (attachmentModelList != null) {
                    AttachmentPlugin.this.viewModel.getAttachmentList().mo5929b(attachmentModelList.getList());
                    return;
                }
                C13479a.m54775e("AttachmentPlugin", "AttachmentModelList is null");
                AttachmentPlugin.this.viewModel.closeAttachmentPanel();
            }
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$AttachmentPlugin(AttachmentModelList.AttachmentModel attachmentModel) {
        this.showAttachmentHandler.mo42086a(attachmentModel);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        C11027a aVar = new C11027a();
        this.showAttachmentHandler = aVar;
        map.put("biz.sheet.showAttachmentList", aVar);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C11033c cVar = (C11033c) viewModel(C11033c.class);
        this.viewModel = cVar;
        cVar.getActive().mo5923a(getLifecycleOwner(), new AbstractC13687a<Boolean>() {
            /* class com.bytedance.ee.bear.sheet.attachment.AttachmentPlugin.C110261 */

            /* renamed from: a */
            public void mo18510a(Boolean bool) {
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) AttachmentPlugin.this.findPlugin(UnspecifiedOrientationPlugin.class);
                if (Boolean.TRUE.equals(bool)) {
                    C13479a.m54764b("AttachmentPlugin", "open attachment list");
                    AttachmentPlugin.this.showAttachmentList();
                    if (unspecifiedOrientationPlugin != null) {
                        unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(AttachmentPlugin.this);
                        return;
                    }
                    return;
                }
                C13479a.m54764b("AttachmentPlugin", "close attachment list");
                AttachmentPlugin.this.hideAttachmentList();
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(AttachmentPlugin.this);
                }
            }
        });
        this.viewModel.setDelegate(new C11033c.AbstractC11034a() {
            /* class com.bytedance.ee.bear.sheet.attachment.$$Lambda$AttachmentPlugin$0LAWFkUvxmxeJ_I9erArbd2Ywc */

            @Override // com.bytedance.ee.bear.sheet.attachment.C11033c.AbstractC11034a
            public final void onSelectAttachment(AttachmentModelList.AttachmentModel attachmentModel) {
                AttachmentPlugin.this.lambda$onAttachToHost$0$AttachmentPlugin(attachmentModel);
            }
        });
        sVar.mo24599n().registerEditPanel(getLifecycleOwner(), this.viewModel);
    }
}
