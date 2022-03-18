package com.ss.android.lark.statistics.p2700n;

import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.n.e */
public final /* synthetic */ class C54966e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f135839a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f135840b;

    static {
        int[] iArr = new int[Message.Type.values().length];
        f135839a = iArr;
        iArr[Message.Type.POST.ordinal()] = 1;
        iArr[Message.Type.TEXT.ordinal()] = 2;
        int[] iArr2 = new int[Message.Type.values().length];
        f135840b = iArr2;
        iArr2[Message.Type.POST.ordinal()] = 1;
        iArr2[Message.Type.TEXT.ordinal()] = 2;
        iArr2[Message.Type.FILE.ordinal()] = 3;
        iArr2[Message.Type.IMAGE.ordinal()] = 4;
        iArr2[Message.Type.AUDIO.ordinal()] = 5;
        iArr2[Message.Type.TEXT_IMAGE.ordinal()] = 6;
        iArr2[Message.Type.SHARE_GROUP_CHAT.ordinal()] = 7;
        iArr2[Message.Type.STICKER.ordinal()] = 8;
        iArr2[Message.Type.SHARE_USER_CARD.ordinal()] = 9;
        iArr2[Message.Type.SYSTEM.ordinal()] = 10;
    }
}
