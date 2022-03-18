package com.ss.android.lark.multitask.floating;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/multitask/floating/AppFloatFilter;", "", "()V", "MEETING", "", "MEETING_INS", "MULTITASK_LIST", "PODCAST", "VOIP", "mFilterList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMFilterList", "()Ljava/util/ArrayList;", "setMFilterList", "(Ljava/util/ArrayList;)V", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.f */
public final class AppFloatFilter {

    /* renamed from: a */
    public static final AppFloatFilter f121667a = new AppFloatFilter();

    /* renamed from: b */
    private static ArrayList<String> f121668b;

    private AppFloatFilter() {
    }

    /* renamed from: a */
    public final ArrayList<String> mo168995a() {
        return f121668b;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f121668b = arrayList;
        arrayList.add("com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity");
        f121668b.add("com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivityInstance");
        f121668b.add("com.ss.android.lark.voip.service.impl.app.VoIpCallActivity");
        f121668b.add("com.ss.android.lark.mm.podcast.MmPodcastActivity");
        f121668b.add("com.ss.android.lark.multitask.tasklist.MultitaskListActivity");
    }
}
