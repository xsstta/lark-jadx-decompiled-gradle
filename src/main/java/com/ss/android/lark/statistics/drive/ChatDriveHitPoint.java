package com.ss.android.lark.statistics.drive;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/drive/ChatDriveHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "EVENT_CLICK_ATTACH_ICON", "", "EVENT_OPEN_ATTACH_CARD", "KEY_FILE_TYPE", "sendClickAttachFile", "", "sendOpenAttachCard", "fileType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.f.a */
public final class ChatDriveHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final ChatDriveHitPoint f135702a = new ChatDriveHitPoint();

    private ChatDriveHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m213217a() {
        try {
            Statistics.sendEvent("click_attach_icon");
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
