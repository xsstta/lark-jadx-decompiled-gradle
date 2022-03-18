package com.ss.android.lark.chatwindow.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatwindow/statistics/ChatWindowHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "SEND_TYPE", "", "STICKER_FORWARD_LOCAITON", "sendGroupAnnounceForward", "", ShareHitPoint.f121869d, "sendGroupAnnounceForwardEntrance", "sendOnClickPhoneCallback", "sendOnClickPhoneRecall", "sendStickerShare", "location", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.statistics.a */
public final class ChatWindowHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final ChatWindowHitPoint f91026a = new ChatWindowHitPoint();

    private ChatWindowHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m137638a() {
        Statistics.sendEvent("chat_call_phone_click_recall");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m137640b() {
        Statistics.sendEvent("chat_call_phone_click_callback");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m137639a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "location");
        try {
            new JSONObject().put("stickerpack_stickerforward_location", str);
            Statistics.sendEvent("stickerpack_stickerforward");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }
}
