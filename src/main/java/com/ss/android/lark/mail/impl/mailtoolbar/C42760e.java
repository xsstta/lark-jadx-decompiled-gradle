package com.ss.android.lark.mail.impl.mailtoolbar;

import com.bytedance.ee.bear.browser.AbstractC4934l;
import com.bytedance.ee.bear.browser.AbstractC4936n;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.mention.MentionPlugin;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.MailSelectImageViewPlugin;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailToolbarPlugin;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.e */
public class C42760e implements AbstractC4936n, AbstractC4948i {

    /* renamed from: a */
    private final String f108898a = "MailWebPluginProvider";

    /* renamed from: b */
    private MailToolbarPlugin.AbstractC42812b f108899b;

    /* renamed from: c */
    private MailToolbarPlugin f108900c;

    /* renamed from: d */
    private MentionPlugin f108901d;

    /* renamed from: e */
    private MentionPlugin.AbstractC42020a f108902e;

    /* renamed from: f */
    private PermissionCode f108903f = PermissionCode.NONE;

    /* renamed from: g */
    private String f108904g;

    @Override // com.bytedance.ee.bear.browser.AbstractC4936n
    /* renamed from: a */
    public List<AbstractC4934l> mo17013a() {
        return Arrays.asList(new LoggerWebService());
    }

    /* renamed from: c */
    private MentionPlugin m170528c() {
        if (this.f108901d == null) {
            MentionPlugin mentionPlugin = new MentionPlugin();
            this.f108901d = mentionPlugin;
            mentionPlugin.setCallback(this.f108902e);
        }
        return this.f108901d;
    }

    /* renamed from: b */
    public void mo153566b() {
        Log.m165389i("MailWebPluginProvider", "release");
        MailToolbarPlugin mailToolbarPlugin = this.f108900c;
        if (mailToolbarPlugin != null) {
            mailToolbarPlugin.release();
            this.f108900c = null;
        }
        MentionPlugin mentionPlugin = this.f108901d;
        if (mentionPlugin != null) {
            mentionPlugin.release();
        }
        this.f108901d = null;
        this.f108902e = null;
        this.f108899b = null;
    }

    /* renamed from: a */
    public void mo153565a(boolean z) {
        MailToolbarPlugin mailToolbarPlugin = this.f108900c;
        if (mailToolbarPlugin != null) {
            mailToolbarPlugin.updateToolbarState(z);
        }
    }

    /* renamed from: a */
    public void mo153561a(PermissionCode permissionCode) {
        Log.m165389i("MailWebPluginProvider", "setPermissionCode");
        this.f108903f = permissionCode;
        MailToolbarPlugin mailToolbarPlugin = this.f108900c;
        if (mailToolbarPlugin != null) {
            mailToolbarPlugin.setPermissionCode(permissionCode);
        }
    }

    /* renamed from: a */
    public void mo153562a(MentionPlugin.AbstractC42020a aVar) {
        this.f108902e = aVar;
        MentionPlugin mentionPlugin = this.f108901d;
        if (mentionPlugin != null) {
            mentionPlugin.setCallback(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
    /* renamed from: a */
    public C4946h mo17011a(C4943e eVar) {
        MailToolbarPlugin mailToolbarPlugin = new MailToolbarPlugin();
        this.f108900c = mailToolbarPlugin;
        mailToolbarPlugin.setPermissionCode(this.f108903f);
        this.f108900c.updateThreadID(this.f108904g);
        this.f108900c.setOnSelectAttachmentClickListener(this.f108899b);
        return C4946h.m20453a(C4946h.m20441a(this.f108900c, 1), C4946h.m20441a(m170528c(), 4), C4946h.m20440a(new MailSelectImageViewPlugin()));
    }

    /* renamed from: a */
    public void mo153563a(MailToolbarPlugin.AbstractC42812b bVar) {
        this.f108899b = bVar;
        MailToolbarPlugin mailToolbarPlugin = this.f108900c;
        if (mailToolbarPlugin != null) {
            mailToolbarPlugin.setOnSelectAttachmentClickListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo153564a(String str) {
        Log.m165389i("MailWebPluginProvider", "updateThreadID");
        this.f108904g = str;
        MailToolbarPlugin mailToolbarPlugin = this.f108900c;
        if (mailToolbarPlugin != null) {
            mailToolbarPlugin.updateThreadID(str);
        }
    }
}
