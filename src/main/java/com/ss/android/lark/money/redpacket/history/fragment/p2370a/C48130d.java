package com.ss.android.lark.money.redpacket.history.fragment.p2370a;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryItem;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.a.d */
public class C48130d extends AbstractC48127a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: a */
    public String mo168514a(RedPacketHistoryItem redPacketHistoryItem) {
        if (redPacketHistoryItem.isP2P) {
            Chatter chatter = redPacketHistoryItem.chatter;
            if (chatter != null) {
                return chatter.getAvatarKey();
            }
        } else {
            Chat chat = redPacketHistoryItem.chat;
            if (chat != null) {
                return chat.getAvatarKey();
            }
        }
        Log.m165383e("BaseParser", "RedPacket id:" + redPacketHistoryItem.id + ", Avatar Empty, isP2P:" + redPacketHistoryItem.isP2P);
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: b */
    public String mo168516b(RedPacketHistoryItem redPacketHistoryItem) {
        if (redPacketHistoryItem.isP2P) {
            Chatter chatter = redPacketHistoryItem.chatter;
            if (chatter != null) {
                return chatter.getId();
            }
        } else {
            Chat chat = redPacketHistoryItem.chat;
            if (chat != null) {
                return chat.getId();
            }
        }
        Log.m165383e("BaseParser", "RedPacket id:" + redPacketHistoryItem.id + ", entityId Empty, isP2P:" + redPacketHistoryItem.isP2P);
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: c */
    public String mo168517c(RedPacketHistoryItem redPacketHistoryItem) {
        if (redPacketHistoryItem.isP2P) {
            Chatter chatter = redPacketHistoryItem.chatter;
            if (chatter != null) {
                return this.f121132a.getDisplayNameByName(chatter);
            }
        } else {
            Chat chat = redPacketHistoryItem.chat;
            if (chat != null) {
                return chat.getName();
            }
        }
        Log.m165383e("BaseParser", "RedPacket id:" + redPacketHistoryItem.id + ", Name Empty, isP2P:" + redPacketHistoryItem.isP2P);
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48127a
    /* renamed from: d */
    public String mo168518d(RedPacketHistoryItem redPacketHistoryItem) {
        if (!redPacketHistoryItem.isP2P) {
            StringBuilder sb = new StringBuilder();
            if (redPacketHistoryItem.grabNum == redPacketHistoryItem.totalNum) {
                sb.append(UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryReceived));
            } else if (redPacketHistoryItem.isExpired) {
                sb.append(UIHelper.getString(R.string.Lark_Legacy_HistoryExpired));
            } else if (redPacketHistoryItem.grabNum == 0) {
                sb.append(UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryUnreceived));
            } else {
                sb.append(UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryReceived));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("grab_number", Integer.toString(redPacketHistoryItem.grabNum));
            hashMap.put("total_number", Integer.toString(redPacketHistoryItem.totalNum));
            sb.append(" ");
            sb.append(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_HongbaoHistoryAmount, hashMap));
            return sb.toString();
        } else if (redPacketHistoryItem.grabNum != 0) {
            return UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryReceived);
        } else {
            if (redPacketHistoryItem.isExpired) {
                return UIHelper.getString(R.string.Lark_Legacy_HistoryExpired);
            }
            return UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryUnreceived);
        }
    }
}
