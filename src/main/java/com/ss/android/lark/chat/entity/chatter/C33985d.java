package com.ss.android.lark.chat.entity.chatter;

import com.bytedance.lark.pb.basic.v1.Chatter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.chatter.d */
public final /* synthetic */ class C33985d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f87779a;

    static {
        int[] iArr = new int[Chatter.ChatExtra.ChatChatterTagInfo.TagInfo.TagType.values().length];
        f87779a = iArr;
        iArr[Chatter.ChatExtra.ChatChatterTagInfo.TagInfo.TagType.CLASS_TEACHER.ordinal()] = 1;
        iArr[Chatter.ChatExtra.ChatChatterTagInfo.TagInfo.TagType.DISCIPLINE_TEACHER.ordinal()] = 2;
        iArr[Chatter.ChatExtra.ChatChatterTagInfo.TagInfo.TagType.ADMIN_USER.ordinal()] = 3;
    }
}
