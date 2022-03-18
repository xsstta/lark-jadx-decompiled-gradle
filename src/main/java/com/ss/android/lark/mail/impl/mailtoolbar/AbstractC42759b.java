package com.ss.android.lark.mail.impl.mailtoolbar;

import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.b */
public interface AbstractC42759b extends IView.IViewDelegate {
    /* renamed from: a */
    void mo150893a(MailImage mailImage);

    /* renamed from: a */
    void mo150894a(SearchAddress searchAddress);

    /* renamed from: a */
    void mo150896a(String str, DocsPermissionConfig.Action action);

    /* renamed from: a */
    void mo150898a(String str, String str2);

    /* renamed from: a */
    void mo150899a(String str, String str2, String str3, String str4, int i);

    /* renamed from: a */
    void mo150900a(List<MailImage> list);

    /* renamed from: b */
    void mo150905b(SearchAddress searchAddress);

    /* renamed from: b */
    void mo150908b(String str, String str2);

    /* renamed from: b */
    void mo150909b(List<MailImage> list);

    /* renamed from: d */
    void mo150915d(String str);

    /* renamed from: e */
    void mo150918e(String str);

    /* renamed from: g */
    List<MailImage> mo150922g();

    /* renamed from: g */
    void mo150923g(String str);

    /* renamed from: h */
    List<LocalAttachment> mo150924h();

    /* renamed from: t */
    void mo150937t();

    /* renamed from: w */
    String mo150940w();
}
