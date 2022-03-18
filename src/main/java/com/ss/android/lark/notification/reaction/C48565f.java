package com.ss.android.lark.notification.reaction;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.reaction.entity.ReactionNotice;

/* renamed from: com.ss.android.lark.notification.reaction.f */
public class C48565f implements AbstractNotification.AbstractC48496c<ReactionNotice> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.notification.export.entity.Notice] */
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: b */
    public /* synthetic */ void mo31118b(ReactionNotice reactionNotice) {
        AbstractNotification.AbstractC48496c.CC.$default$b(this, reactionNotice);
    }

    /* renamed from: a */
    public void mo31117a(ReactionNotice reactionNotice) {
        String str;
        String str2 = reactionNotice.messageId;
        String str3 = "";
        if (reactionNotice.extra != null) {
            String str4 = reactionNotice.extra.f122004c;
            if (reactionNotice.extra.f122005d == Notice.Extra.ChatType.P2P) {
                str3 = "single";
            } else if (reactionNotice.extra.f122005d == Notice.Extra.ChatType.GROUP) {
                str3 = "group";
            }
            str = str3;
            str3 = str4;
        } else {
            str = str3;
        }
        C29990c.m110930b().ad().mo134631a(str3, str2, str, "reaction");
    }
}
