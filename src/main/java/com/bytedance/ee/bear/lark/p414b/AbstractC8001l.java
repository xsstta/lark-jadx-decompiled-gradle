package com.bytedance.ee.bear.lark.p414b;

import android.content.Context;
import com.bytedance.ee.bear.dto.DocImagesForwardData;
import com.bytedance.ee.bear.dto.DocShareTextData;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.lark.b.l */
public interface AbstractC8001l {
    /* renamed from: a */
    Chatter mo31004a(String str);

    /* renamed from: a */
    String mo31005a(Chatter chatter);

    /* renamed from: a */
    Map<String, Chatter> mo31006a(List<String> list);

    /* renamed from: a */
    void mo31007a(Context context, DocImagesForwardData docImagesForwardData);

    /* renamed from: a */
    void mo31008a(Context context, DocShareTextData docShareTextData);

    /* renamed from: a */
    void mo31009a(Context context, String str);

    /* renamed from: a */
    void mo31010a(String str, String str2, String str3, RichText richText);

    /* renamed from: a */
    void mo31011a(String str, boolean z, String str2, RichText richText, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    ChatSetting mo31012b(String str);

    /* renamed from: b */
    Map<String, Chatter> mo31013b(List<String> list);
}
