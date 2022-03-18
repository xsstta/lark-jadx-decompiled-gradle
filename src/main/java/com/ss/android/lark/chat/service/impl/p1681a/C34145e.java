package com.ss.android.lark.chat.service.impl.p1681a;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.a.e */
public class C34145e {
    /* renamed from: a */
    public List<Runnable> mo126689a(Message message, AbstractC34135a<VideoCompressResult> aVar) {
        ArrayList arrayList = new ArrayList();
        List<RichTextElement.MediaProperty> b = C59031e.m229183b(((PostContent) message.getContent()).getRichText());
        if (CollectionUtils.isEmpty(b)) {
            return arrayList;
        }
        for (RichTextElement.MediaProperty mediaProperty : b) {
            if (mediaProperty != null) {
                arrayList.add(new RunnableC34139c.C34141a().mo126669a(message.getId()).mo126671b(message.getcId()).mo126672c(mediaProperty.getOriginPath()).mo126667a((long) mediaProperty.getDuration()).mo126673d(mediaProperty.getCompressPath()).mo126668a(aVar).mo126670a());
            }
        }
        return arrayList;
    }
}
