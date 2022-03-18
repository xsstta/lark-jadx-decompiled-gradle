package com.ss.android.vc.meeting.module.tab3.list.view.utils;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.tab.VCTabListItem;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/view/utils/DataUtil;", "", "()V", "isLastOfSection", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "position", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.a.a */
public final class DataUtil {

    /* renamed from: a */
    public static final DataUtil f160103a = new DataUtil();

    private DataUtil() {
    }

    /* renamed from: a */
    public final boolean mo219415a(List<? extends VCTabListItem> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return false;
        }
        if (i != list.size() - 1 && ((VCTabListItem) list.get(i + 1)).getMeetingStatus() == ((VCTabListItem) list.get(i)).getMeetingStatus()) {
            return false;
        }
        return true;
    }
}
