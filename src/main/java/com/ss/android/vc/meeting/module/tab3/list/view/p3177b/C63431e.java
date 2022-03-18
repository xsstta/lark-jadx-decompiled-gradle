package com.ss.android.vc.meeting.module.tab3.list.view.p3177b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.vc.entity.tab.VCTabListItem;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b.e */
public final class C63431e {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b.e$1 */
    public static /* synthetic */ class C634321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160181a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus[] r0 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63431e.C634321.f160181a = r0
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_UPCOMING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63431e.C634321.f160181a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_ON_THE_CALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63431e.C634321.f160181a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63431e.C634321.f160181a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63431e.C634321.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AbstractC63411a m248500a(ViewGroup viewGroup, int i) {
        int i2 = C634321.f160181a[VCTabListItem.MeetingStatus.valueOf(i).ordinal()];
        if (i2 == 1) {
            return new C63425d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_tab3_list_item_upcoming, viewGroup, false));
        }
        if (i2 != 2) {
            return new C63412b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_tab3_list_item_history, viewGroup, false));
        }
        return new C63415c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_tab3_list_item_ongoing, viewGroup, false));
    }
}
