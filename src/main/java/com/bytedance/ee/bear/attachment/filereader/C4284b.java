package com.bytedance.ee.bear.attachment.filereader;

import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.attachment.filereader.b */
public class C4284b implements AbstractC4283a {
    @Override // com.bytedance.ee.bear.attachment.filereader.AbstractC4283a
    /* renamed from: a */
    public void mo16873a() {
        Toast.showSuccessText(C13615c.f35773a, C13615c.f35773a.getString(R.string.Doc_Attachment_SaveSuccessfully), 0);
    }

    @Override // com.bytedance.ee.bear.attachment.filereader.AbstractC4283a
    /* renamed from: b */
    public void mo16875b() {
        Toast.showSuccessText(C13615c.f35773a, C13615c.f35773a.getString(R.string.Doc_Attachment_SaveNoPermission), 0);
    }

    @Override // com.bytedance.ee.bear.attachment.filereader.AbstractC4283a
    /* renamed from: a */
    public void mo16874a(String str, FileClickData fileClickData) {
        FileReaderUtil.m17799a(str, fileClickData);
    }
}
