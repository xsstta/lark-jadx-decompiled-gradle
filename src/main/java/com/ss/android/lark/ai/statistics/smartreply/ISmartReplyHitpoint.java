package com.ss.android.lark.ai.statistics.smartreply;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u000eJI\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\u0010JY\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0014JG\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ai/statistics/smartreply/ISmartReplyHitpoint;", "", "sendSmartReplyClick", "", "chatId", "", "replyContext", "messageId", "language", "itemId", "completedChars", "", "vid", "imprId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "sendSmartReplyEdit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sendSmartReplyShow", "replies", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "sendSmartReplyViewMore", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.d.d.a */
public interface ISmartReplyHitpoint {
    /* renamed from: a */
    void mo101597a(String str, String str2, String str3, String str4, Integer num, int i);

    /* renamed from: a */
    void mo101598a(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6);

    /* renamed from: a */
    void mo101599a(String str, String str2, String str3, String str4, List<String> list, Integer num, String str5);
}
