package com.ss.android.lark.ai.statistics.smartreply;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J]\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0011JI\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0013JY\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0017JG\u0010\u0018\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/ai/statistics/smartreply/SmartReplyHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "Lcom/ss/android/lark/ai/statistics/smartreply/ISmartReplyHitpoint;", "()V", "sendSmartReplyClick", "", "chatId", "", "replyContext", "messageId", "language", "itemId", "completedChars", "", "vid", "imprId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "sendSmartReplyEdit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sendSmartReplyShow", "replies", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "sendSmartReplyViewMore", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.d.d.b */
public final class SmartReplyHitPoint extends BaseHitPoint implements ISmartReplyHitpoint {
    @Override // com.ss.android.lark.ai.statistics.smartreply.ISmartReplyHitpoint
    /* renamed from: a */
    public void mo101597a(String str, String str2, String str3, String str4, Integer num, int i) {
        String str5;
        JSONObject put = new JSONObject().put("chat_id", str).put("reply_context", str2).put("message_id", str3).put("language", str4).put("vid", num);
        if (i > 0) {
            str5 = "right";
        } else {
            str5 = "left";
        }
        Statistics.sendEvent("suite_ai_replies_viewmore", put.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str5));
    }

    @Override // com.ss.android.lark.ai.statistics.smartreply.ISmartReplyHitpoint
    /* renamed from: a */
    public void mo101599a(String str, String str2, String str3, String str4, List<String> list, Integer num, String str5) {
        Statistics.sendEvent("suite_ai_replies_view", new JSONObject().put("chat_id", str).put("reply_context", str2).put("message_id", str3).put("language", str4).put("replies", list).put("vid", num).put("impression_id", str5));
    }

    @Override // com.ss.android.lark.ai.statistics.smartreply.ISmartReplyHitpoint
    /* renamed from: a */
    public void mo101598a(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6) {
        Statistics.sendEvent("suite_ai_replies_select", new JSONObject().put("chat_id", str).put("reply_context", str2).put("message_id", str3).put("language", str4).put("item_id", str5).put("completed_chars", num).put("vid", num2).put("impression_id", str6));
    }
}
