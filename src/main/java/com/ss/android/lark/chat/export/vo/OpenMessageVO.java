package com.ss.android.lark.chat.export.vo;

import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\r\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\u0005H&J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "", "getChatId", "", "getContentVO", "()Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getFromId", "getGroupType", "", "getId", "getParentId", "getcId", "hasReaction", "", "isFromMe", "isRecalled", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.vo.c */
public interface OpenMessageVO<T extends ContentVO<?>> {
    /* renamed from: a */
    String mo121681a();

    boolean ah();

    /* renamed from: b */
    String mo121692b();

    /* renamed from: c */
    boolean mo121695c();

    /* renamed from: d */
    String mo121696d();

    /* renamed from: e */
    String mo121697e();

    /* renamed from: f */
    boolean mo121698f();

    /* renamed from: g */
    T mo121699g();

    /* renamed from: i */
    String mo121701i();

    @Deprecated(message = "do not use this method out of chat module")
    /* renamed from: m */
    int mo121705m();
}
