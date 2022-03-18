package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.export.entity.chatter.IChatterDesc;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/PersonalSignUrlPreViewUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "entriesList", "", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "(Ljava/util/List;)V", "invoke", "p1", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.h */
public final class PersonalSignUrlPreViewUpdater implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    private final List<UrlPreViewEntries> f86184a;

    public PersonalSignUrlPreViewUpdater(List<UrlPreViewEntries> list) {
        this.f86184a = list;
    }

    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        String str;
        boolean z;
        ChatChatter messageSender;
        Chatter chatter;
        ChatChatter messageSender2;
        Chatter chatter2;
        IChatterDesc desc;
        String str2 = null;
        if (aVar == null || (messageSender2 = aVar.getMessageSender()) == null || (chatter2 = messageSender2.getChatter()) == null || (desc = chatter2.getDesc()) == null) {
            str = null;
        } else {
            str = desc.getContent();
        }
        if (!(aVar == null || (messageSender = aVar.getMessageSender()) == null || (chatter = messageSender.getChatter()) == null)) {
            str2 = chatter.getId();
        }
        String str3 = str;
        boolean z2 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                if (this.f86184a != null) {
                    UserStatusParseUrlPreViewUtils zVar = UserStatusParseUrlPreViewUtils.f88765a;
                    List<UrlPreViewEntries> list = this.f86184a;
                    char[] a = C69743a.m267688a(C69745a.m267697b(str));
                    Intrinsics.checkExpressionValueIsNotNull(a, "Hex.encodeHex(DigestUtils.md5(content))");
                    zVar.mo126950a(list, CollectionsKt.listOf(new UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams(str, str2, new String(a))));
                }
                aVar.setForceUpdate(true);
            }
        }
        return aVar;
    }
}
