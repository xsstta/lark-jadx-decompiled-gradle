package com.ss.android.lark.chat.service.impl.p1681a;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.a.d */
public class C34144d {
    /* renamed from: a */
    public List<Runnable> mo126688a(Message message, AbstractC34135a<VideoCompressResult> aVar) {
        MediaContent mediaContent = (MediaContent) message.getContent();
        return Collections.singletonList(new RunnableC34139c.C34141a().mo126669a(message.getId()).mo126671b(message.getcId()).mo126672c(mediaContent.getOriginPath()).mo126667a(mediaContent.getDuration()).mo126673d(mediaContent.getCompressPath()).mo126668a(aVar).mo126670a());
    }
}
