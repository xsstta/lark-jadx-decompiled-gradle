package com.ss.android.lark.chat.p1605c.p1609c;

import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.c.n */
public final /* synthetic */ class C33016n {

    /* renamed from: a */
    public static final /* synthetic */ int[] f84952a;

    static {
        int[] iArr = new int[Message.Type.values().length];
        f84952a = iArr;
        iArr[Message.Type.TEXT.ordinal()] = 1;
        iArr[Message.Type.POST.ordinal()] = 2;
        iArr[Message.Type.AUDIO.ordinal()] = 3;
        iArr[Message.Type.IMAGE.ordinal()] = 4;
        iArr[Message.Type.MERGE_FORWARD.ordinal()] = 5;
    }
}
