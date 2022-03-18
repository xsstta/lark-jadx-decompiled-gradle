package com.ss.android.lark.chat.topnoticemessage.message;

import com.bytedance.lark.pb.im.v1.ChatTopNoticeContent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.message.b */
public final /* synthetic */ class C34327b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f88653a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f88654b;

    static {
        int[] iArr = new int[ChatTopNoticeContent.ContentType.values().length];
        f88653a = iArr;
        iArr[ChatTopNoticeContent.ContentType.MSG_TYPE.ordinal()] = 1;
        iArr[ChatTopNoticeContent.ContentType.ANNOUNCEMENT_TYPE.ordinal()] = 2;
        int[] iArr2 = new int[TopNoticeMsgType.values().length];
        f88654b = iArr2;
        iArr2[TopNoticeMsgType.ImageMessage.ordinal()] = 1;
        iArr2[TopNoticeMsgType.VideoMessage.ordinal()] = 2;
        iArr2[TopNoticeMsgType.StickerMessage.ordinal()] = 3;
    }
}
