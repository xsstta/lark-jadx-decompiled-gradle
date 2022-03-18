package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin;

public class MailToolbarPlugin extends BaseToolbarPlugin<MailToolbar> {
    private boolean enableAttribution;
    private C42813a mMailToolbarFragment;
    public AbstractC42812b mOnSelectAttachmentClickListener;
    private PermissionCode permissionCode;
    private String threadID;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailToolbarPlugin$b */
    public interface AbstractC42812b {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin
    public String getToolbarJSBinderName() {
        return "biz.navigation.setToolBar";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin
    public BaseToolbarPlugin.AbstractC42808a<MailToolbar> onCreateToolbarJSHandler() {
        return new C42811a();
    }

    public void release() {
        C13479a.m54764b("MailToolbarPlugin", "release");
        this.mOnSelectAttachmentClickListener = null;
        this.mMailToolbarFragment = null;
    }

    private void insertPermissionCode() {
        if (this.permissionCode == null) {
            this.permissionCode = PermissionCode.NONE;
        }
        Bundle arguments = this.mMailToolbarFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("share_permission_code", this.permissionCode);
        this.mMailToolbarFragment.setArguments(arguments);
    }

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailToolbarPlugin$a */
    private class C42811a implements BaseToolbarPlugin.AbstractC42808a<MailToolbar> {

        /* renamed from: b */
        private AbstractC7947h f108990b;

        private C42811a() {
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin.AbstractC42808a
        /* renamed from: a */
        public void mo153690a(ItemId itemId, String str) {
            if (this.f108990b != null) {
                this.f108990b.mo17190a(String.format("{\"id\":\"%s\",\"value\":\"%s\"}", itemId.name(), str));
            }
        }

        /* renamed from: a */
        public void handle(MailToolbar mailToolbar, AbstractC7947h hVar) {
            C13479a.m54772d("MailToolbarPlugin", "Js update toolbar:" + mailToolbar);
            if (mailToolbar != null) {
                MailItemId[] values = MailItemId.values();
                if (MailToolbarPlugin.this.mOnSelectAttachmentClickListener == null) {
                    C13479a.m54764b("MailToolbarPlugin", "filter attachment");
                    values = MailItemId.filter(MailItemId.attachment);
                }
                mailToolbar.initFromJsBridge(values);
            }
            this.f108990b = hVar;
            MailToolbarPlugin mailToolbarPlugin = MailToolbarPlugin.this;
            if (mailToolbar == null || mailToolbar.getChildren().length == 0) {
                mailToolbar = null;
            }
            mailToolbarPlugin.updateToolbar(mailToolbar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin
    public AbstractC6212e<MailToolbar> getToolbarViewModel(FragmentActivity fragmentActivity) {
        return (AbstractC6212e) aj.m5366a(fragmentActivity).mo6005a(C42815b.class);
    }

    public void setPermissionCode(PermissionCode permissionCode2) {
        C13479a.m54764b("MailToolbarPlugin", "setPermissionCode");
        this.permissionCode = permissionCode2;
    }

    public void updateThreadID(String str) {
        C13479a.m54764b("MailToolbarPlugin", "updateThreadID");
        this.threadID = str;
    }

    public void setOnSelectAttachmentClickListener(AbstractC42812b bVar) {
        C13479a.m54764b("MailToolbarPlugin", "setOnSelectAttachmentClickListener:" + bVar);
        this.mOnSelectAttachmentClickListener = bVar;
    }

    public void updateToolbarState(boolean z) {
        C13479a.m54764b("MailToolbarPlugin", "updateToolbarState enableAttribution: " + z);
        this.enableAttribution = z;
        C42813a aVar = this.mMailToolbarFragment;
        if (aVar != null) {
            aVar.mo153702d(z);
            if (this.mMailToolbarFragment.mo153699b()) {
                updateToolbar(this.mMailToolbarFragment.mo153700c());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin
    public Fragment onCreateToolbarFragment(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putSerializable("share_permission_code", this.permissionCode);
        bundle.putString("thread_id", this.threadID);
        C42813a aVar = (C42813a) Fragment.instantiate(context, C42813a.class.getName(), bundle);
        this.mMailToolbarFragment = aVar;
        aVar.mo153701c(this.enableAttribution);
        return this.mMailToolbarFragment;
    }
}
