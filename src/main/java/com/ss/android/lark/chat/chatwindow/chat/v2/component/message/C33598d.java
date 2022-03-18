package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.d */
public final /* synthetic */ class C33598d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f86571a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f86572b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f86573c;

    static {
        int[] iArr = new int[OpenApp.State.values().length];
        f86571a = iArr;
        iArr[OpenApp.State.OFFLINE.ordinal()] = 1;
        iArr[OpenApp.State.USER_INVISIBLE.ordinal()] = 2;
        iArr[OpenApp.State.DELETED.ordinal()] = 3;
        int[] iArr2 = new int[Message.Type.values().length];
        f86572b = iArr2;
        iArr2[Message.Type.TEXT.ordinal()] = 1;
        iArr2[Message.Type.POST.ordinal()] = 2;
        iArr2[Message.Type.MEDIA.ordinal()] = 3;
        iArr2[Message.Type.IMAGE.ordinal()] = 4;
        iArr2[Message.Type.MERGE_FORWARD.ordinal()] = 5;
        int[] iArr3 = new int[Message.Type.values().length];
        f86573c = iArr3;
        iArr3[Message.Type.CARD.ordinal()] = 1;
        iArr3[Message.Type.CALENDAR.ordinal()] = 2;
        iArr3[Message.Type.TODO.ordinal()] = 3;
    }
}
