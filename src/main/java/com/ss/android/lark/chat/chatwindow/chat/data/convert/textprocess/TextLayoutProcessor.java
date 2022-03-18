package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess;

import android.content.Context;
import android.text.Layout;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/TextLayoutProcessor;", "", "()V", "defaultProcessParams", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "process", "Landroid/text/Layout;", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "params", "context", "Landroid/content/Context;", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "charSequence", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.f */
public final class TextLayoutProcessor {

    /* renamed from: a */
    public static final TextLayoutProcessor f85461a = new TextLayoutProcessor();

    private TextLayoutProcessor() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ProcessParams m128387a() {
        return new ProcessParams();
    }

    @JvmStatic
    /* renamed from: a */
    public static final Layout m128384a(AbsMessageVO<?> aVar, ProcessParams dVar, Context context) {
        ILayoutProcessor<?> bVar;
        Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Iterator<T> it = ProcessorCache.f85459a.mo122488a().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            T next = it.next();
            if (AbsMessageVO.class.isAssignableFrom(next)) {
                bVar = ProcessorCache.f85459a.mo122488a().get(next);
                break;
            }
        }
        if (bVar != null) {
            return bVar.mo122459a(aVar, dVar, context);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Layout m128385a(AbstractC34006a aVar, ProcessParams dVar, Context context) {
        ILayoutProcessor<?> bVar;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Iterator<T> it = ProcessorCache.f85459a.mo122488a().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            T next = it.next();
            if (AbstractC34006a.class.isAssignableFrom(next)) {
                bVar = ProcessorCache.f85459a.mo122488a().get(next);
                break;
            }
        }
        if (bVar != null) {
            return bVar.mo122459a(aVar, dVar, context);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Layout m128386a(CharSequence charSequence, ProcessParams dVar, Context context) {
        ILayoutProcessor<?> bVar;
        Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Iterator<T> it = ProcessorCache.f85459a.mo122488a().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            T next = it.next();
            if (CharSequence.class.isAssignableFrom(next)) {
                bVar = ProcessorCache.f85459a.mo122488a().get(next);
                break;
            }
        }
        if (bVar != null) {
            return bVar.mo122459a(charSequence, dVar, context);
        }
        return null;
    }
}
