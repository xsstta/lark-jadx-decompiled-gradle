package com.ss.android.lark.chat.service.impl.p1682b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.service.impl.p1682b.C34180b;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.b.d */
public class C34185d implements AbstractC34179a {
    @Override // com.ss.android.lark.chat.service.impl.p1682b.AbstractC34179a
    /* renamed from: a */
    public void mo126722a(Message message, IGetDataCallback<String> iGetDataCallback, boolean z) {
        if (message != null) {
            List<RichTextElement.MediaProperty> b = C59031e.m229183b(((PostContent) message.getContent()).getRichText());
            C34180b.C34183b bVar = new C34180b.C34183b();
            bVar.f88458a = message;
            bVar.f88459b = b.size();
            bVar.f88460c = false;
            bVar.f88461d = iGetDataCallback;
            bVar.f88462e = z;
            C34180b.m132694a().mo126723a(bVar);
        }
    }
}
