package com.ss.android.lark.integrator.todo.im;

import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.im.f */
public final /* synthetic */ class C40068f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f101837a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f101838b;

    static {
        int[] iArr = new int[Message.Type.values().length];
        f101837a = iArr;
        iArr[Message.Type.TEXT.ordinal()] = 1;
        iArr[Message.Type.POST.ordinal()] = 2;
        iArr[Message.Type.MEDIA.ordinal()] = 3;
        iArr[Message.Type.IMAGE.ordinal()] = 4;
        iArr[Message.Type.MERGE_FORWARD.ordinal()] = 5;
        int[] iArr2 = new int[Message.Type.values().length];
        f101838b = iArr2;
        iArr2[Message.Type.CARD.ordinal()] = 1;
        iArr2[Message.Type.CALENDAR.ordinal()] = 2;
        iArr2[Message.Type.TODO.ordinal()] = 3;
    }
}
