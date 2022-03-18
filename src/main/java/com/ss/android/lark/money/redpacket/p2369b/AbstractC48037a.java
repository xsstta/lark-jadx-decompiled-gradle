package com.ss.android.lark.money.redpacket.p2369b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.money.redpacket.dto.RedPacketDataWrapper;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketGrabResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.dto.SendRedPacketResponse;

/* renamed from: com.ss.android.lark.money.redpacket.b.a */
public interface AbstractC48037a {
    /* renamed from: a */
    void mo168216a(int i, String str, int i2, IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback);

    /* renamed from: a */
    void mo168217a(long j, int i, String str, RedPacketContent.Type type, String str2, String str3, Long l, IGetDataCallback<SendRedPacketResponse> iGetDataCallback);

    /* renamed from: a */
    void mo168218a(IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo168219a(String str, String str2, boolean z, IGetDataCallback<RedPacketDetail> iGetDataCallback);

    /* renamed from: a */
    void mo168220a(String str, boolean z, IGetDataCallback<RedPacketGrabResponse> iGetDataCallback);

    /* renamed from: a */
    void mo168221a(String str, boolean z, boolean z2, boolean z3, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo168222b(int i, String str, int i2, IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback);

    /* renamed from: b */
    void mo168223b(String str, boolean z, IGetDataCallback<RedPacketInfo> iGetDataCallback);

    /* renamed from: c */
    void mo168224c(String str, boolean z, IGetDataCallback<RedPacketDataWrapper> iGetDataCallback);
}
