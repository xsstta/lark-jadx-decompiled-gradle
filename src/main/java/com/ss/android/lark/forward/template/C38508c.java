package com.ss.android.lark.forward.template;

import android.content.Context;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;

/* renamed from: com.ss.android.lark.forward.template.c */
public class C38508c {
    /* renamed from: a */
    public static ForwardTargetFilter m151888a(Context context, Message message) {
        return m151889a(context, message, false, false);
    }

    /* renamed from: a */
    public static ForwardTargetFilter m151889a(Context context, Message message, boolean z, boolean z2) {
        ForwardTargetFilter.C38400a aVar = new ForwardTargetFilter.C38400a();
        aVar.mo140848d(true);
        aVar.mo140845b(z);
        aVar.mo140851g(z2);
        return aVar.mo140846b();
    }
}
