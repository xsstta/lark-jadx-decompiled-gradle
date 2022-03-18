package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess;

import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl.CharSequenceProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl.MessageInfoProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl.MessageVOProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl.RichTextProcessor;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0006\"\u0006\b\u0000\u0010\n\u0018\u0001H\bR%\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessorCache;", "", "()V", "processorMap", "", "Ljava/lang/Class;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ILayoutProcessor;", "getProcessorMap", "()Ljava/util/Map;", "get", "T", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.e */
public final class ProcessorCache {

    /* renamed from: a */
    public static final ProcessorCache f85459a = new ProcessorCache();

    /* renamed from: b */
    private static final Map<Class<?>, ILayoutProcessor<?>> f85460b;

    private ProcessorCache() {
    }

    /* renamed from: a */
    public final Map<Class<?>, ILayoutProcessor<?>> mo122488a() {
        return f85460b;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f85460b = linkedHashMap;
        CharSequenceProcessor aVar = new CharSequenceProcessor();
        RichTextProcessor dVar = new RichTextProcessor(aVar);
        MessageInfoProcessor bVar = new MessageInfoProcessor(dVar);
        MessageVOProcessor cVar = new MessageVOProcessor(dVar);
        linkedHashMap.put(CharSequence.class, aVar);
        linkedHashMap.put(RichText.class, dVar);
        linkedHashMap.put(MessageInfo.class, bVar);
        linkedHashMap.put(AbsMessageVO.class, cVar);
    }
}
