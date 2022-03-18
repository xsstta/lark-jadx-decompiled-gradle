package com.ss.android.lark.chat.chatwindow.chat.data.content;

import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.content.b */
public final /* synthetic */ class C33233b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f85522a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f85523b;

    static {
        int[] iArr = new int[Message.Type.values().length];
        f85522a = iArr;
        iArr[Message.Type.TEXT.ordinal()] = 1;
        iArr[Message.Type.POST.ordinal()] = 2;
        int[] iArr2 = new int[Message.Type.values().length];
        f85523b = iArr2;
        iArr2[Message.Type.TEXT.ordinal()] = 1;
        iArr2[Message.Type.POST.ordinal()] = 2;
    }
}
