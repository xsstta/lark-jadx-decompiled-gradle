package com.ss.android.vc.meeting.module.tab3.list.mvp.repo.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/utils/MeetingListUtil;", "", "()V", "sort", "", "itemList", "", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "status2SortIndex", "", "item", "MeetingComparator", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.a.a */
public final class MeetingListUtil {

    /* renamed from: a */
    public static final MeetingListUtil f160042a = new MeetingListUtil();

    private MeetingListUtil() {
    }

    /* renamed from: a */
    public final int mo219355a(VCTabListItem vCTabListItem) {
        VCTabListItem.MeetingStatus meetingStatus = vCTabListItem.getMeetingStatus();
        if (meetingStatus == null) {
            return 2;
        }
        int i = C63388c.f160044a[meetingStatus.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo219356a(List<? extends VCTabListItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        if (!CollectionUtils.isEmpty(list)) {
            Collections.sort(list, new MeetingComparator());
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/utils/MeetingListUtil$MeetingComparator;", "Ljava/util/Comparator;", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "Lkotlin/Comparator;", "()V", "compare", "", "item1", "item2", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.a.a$a */
    public static final class MeetingComparator implements Comparator<VCTabListItem> {
        /* renamed from: a */
        public int compare(VCTabListItem vCTabListItem, VCTabListItem vCTabListItem2) {
            long meetingTime;
            long meetingTime2;
            Intrinsics.checkParameterIsNotNull(vCTabListItem, "item1");
            Intrinsics.checkParameterIsNotNull(vCTabListItem2, "item2");
            int a = MeetingListUtil.f160042a.mo219355a(vCTabListItem);
            int a2 = MeetingListUtil.f160042a.mo219355a(vCTabListItem2);
            if (a != a2) {
                return a - a2;
            }
            VCTabListItem.MeetingStatus meetingStatus = vCTabListItem.getMeetingStatus();
            if (meetingStatus != null) {
                int i = C63387b.f160043a[meetingStatus.ordinal()];
                if (i == 1) {
                    MeetingManager a3 = MeetingManager.m238341a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "MeetingManager.getInstance()");
                    AbstractC61294b j = a3.mo211906j();
                    if (j == null) {
                        meetingTime = vCTabListItem2.getMeetingTime();
                        meetingTime2 = vCTabListItem.getMeetingTime();
                    } else if (TextUtils.equals(j.mo212055d(), vCTabListItem.getMeetingId())) {
                        return -1;
                    } else {
                        if (TextUtils.equals(j.mo212055d(), vCTabListItem2.getMeetingId())) {
                            return 1;
                        }
                        return (vCTabListItem2.getMeetingTime() > vCTabListItem.getMeetingTime() ? 1 : (vCTabListItem2.getMeetingTime() == vCTabListItem.getMeetingTime() ? 0 : -1));
                    }
                } else if (i == 2) {
                    meetingTime = vCTabListItem.getCreateTime();
                    meetingTime2 = vCTabListItem2.getCreateTime();
                }
                return (meetingTime > meetingTime2 ? 1 : (meetingTime == meetingTime2 ? 0 : -1));
            }
            if (!C60752f.m236080a(vCTabListItem.getHistoryId()) && !C60752f.m236080a(vCTabListItem2.getHistoryId())) {
                String historyId = vCTabListItem2.getHistoryId();
                String historyId2 = vCTabListItem.getHistoryId();
                Intrinsics.checkExpressionValueIsNotNull(historyId2, "item1.historyId");
                return historyId.compareTo(historyId2);
            } else if (C60752f.m236080a(vCTabListItem.getHistoryId()) && C60752f.m236080a(vCTabListItem2.getHistoryId())) {
                return 0;
            } else {
                if (C60752f.m236080a(vCTabListItem.getHistoryId())) {
                    return -1;
                }
                return 1;
            }
        }
    }
}
