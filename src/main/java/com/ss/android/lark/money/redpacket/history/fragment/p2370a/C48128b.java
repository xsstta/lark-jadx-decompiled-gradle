package com.ss.android.lark.money.redpacket.history.fragment.p2370a;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryItem;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.a.b */
public class C48128b extends AbstractC48127a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: d */
    public String mo168518d(RedPacketHistoryItem redPacketHistoryItem) {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: a */
    public String mo168514a(RedPacketHistoryItem redPacketHistoryItem) {
        Chatter chatter = redPacketHistoryItem.chatter;
        if (chatter != null) {
            return chatter.getAvatarKey();
        }
        Chat chat = redPacketHistoryItem.chat;
        if (chat != null) {
            return chat.getAvatarKey();
        }
        Log.m165383e("BaseParser", "RedPacket id:" + redPacketHistoryItem.id + ", Avatar Empty, isP2P:" + redPacketHistoryItem.isP2P);
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: b */
    public String mo168516b(RedPacketHistoryItem redPacketHistoryItem) {
        Chatter chatter = redPacketHistoryItem.chatter;
        if (chatter != null) {
            return chatter.getId();
        }
        Chat chat = redPacketHistoryItem.chat;
        if (chat != null) {
            return chat.getId();
        }
        Log.m165383e("BaseParser", "RedPacket id:" + redPacketHistoryItem.id + ", entityId Empty, isP2P:" + redPacketHistoryItem.isP2P);
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: c */
    public String mo168517c(RedPacketHistoryItem redPacketHistoryItem) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (redPacketHistoryItem.chatter == null) {
            str = str2;
        } else {
            str = this.f121132a.getDisplayNameByName(redPacketHistoryItem.chatter);
        }
        sb.append(str);
        if (!redPacketHistoryItem.isP2P) {
            if (redPacketHistoryItem.chat != null) {
                str2 = redPacketHistoryItem.chat.getName();
            }
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(" - ");
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
