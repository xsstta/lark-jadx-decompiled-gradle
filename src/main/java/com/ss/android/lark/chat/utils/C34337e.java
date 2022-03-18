package com.ss.android.lark.chat.utils;

import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.e */
public final /* synthetic */ class C34337e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f88671a;

    static {
        int[] iArr = new int[Message.Type.values().length];
        f88671a = iArr;
        iArr[Message.Type.UNKNOWN.ordinal()] = 1;
        iArr[Message.Type.TEXT_IMAGE.ordinal()] = 2;
        iArr[Message.Type.POST.ordinal()] = 3;
        iArr[Message.Type.FILE.ordinal()] = 4;
        iArr[Message.Type.TEXT.ordinal()] = 5;
        iArr[Message.Type.IMAGE.ordinal()] = 6;
        iArr[Message.Type.SYSTEM.ordinal()] = 7;
        iArr[Message.Type.AUDIO.ordinal()] = 8;
        iArr[Message.Type.EMAIL.ordinal()] = 9;
        iArr[Message.Type.SHARE_GROUP_CHAT.ordinal()] = 10;
        iArr[Message.Type.STICKER.ordinal()] = 11;
        iArr[Message.Type.MERGE_FORWARD.ordinal()] = 12;
        iArr[Message.Type.CALENDAR.ordinal()] = 13;
        iArr[Message.Type.CARD.ordinal()] = 14;
        iArr[Message.Type.MEDIA.ordinal()] = 15;
        iArr[Message.Type.SHARE_CALENDAR_EVENT.ordinal()] = 16;
        iArr[Message.Type.RED_PACKET.ordinal()] = 17;
        iArr[Message.Type.GENERAL_CALENDAR.ordinal()] = 18;
        iArr[Message.Type.VIDEO_CHAT.ordinal()] = 19;
        iArr[Message.Type.LOCATION.ordinal()] = 20;
        iArr[Message.Type.COMMERCIALIZED_HONGBAO.ordinal()] = 21;
        iArr[Message.Type.SHARE_USER_CARD.ordinal()] = 22;
        iArr[Message.Type.TODO.ordinal()] = 23;
        iArr[Message.Type.FOLDER.ordinal()] = 24;
    }
}
