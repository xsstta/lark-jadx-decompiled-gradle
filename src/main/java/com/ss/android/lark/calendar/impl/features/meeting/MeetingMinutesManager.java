package com.ss.android.lark.calendar.impl.features.meeting;

import android.app.Activity;
import com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMinutesManager;", "", "()V", "meetingMinutesMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl;", "Lkotlin/collections/HashMap;", "getMeetingMinutes", "activity", "Landroid/app/Activity;", "chatId", "meetingMinutesDelegate", "Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$IMeetingMinutesDelegate;", "removeMeetingMinutes", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meeting.d */
public final class MeetingMinutesManager {

    /* renamed from: a */
    public static final MeetingMinutesManager f81712a = new MeetingMinutesManager();

    /* renamed from: b */
    private static final HashMap<String, MeetingMintuesImpl> f81713b = new HashMap<>();

    private MeetingMinutesManager() {
    }

    /* renamed from: a */
    public final void mo116619a(String str, MeetingMintuesImpl.IMeetingMinutesDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(bVar, "meetingMinutesDelegate");
        HashMap<String, MeetingMintuesImpl> hashMap = f81713b;
        MeetingMintuesImpl cVar = hashMap.get(str);
        if (cVar != null && cVar.mo116587b(bVar) == 0) {
            hashMap.remove(str);
            cVar.mo116583a();
        }
    }

    /* renamed from: a */
    public final MeetingMintuesImpl mo116618a(Activity activity, String str, MeetingMintuesImpl.IMeetingMinutesDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(bVar, "meetingMinutesDelegate");
        HashMap<String, MeetingMintuesImpl> hashMap = f81713b;
        MeetingMintuesImpl cVar = hashMap.get(str);
        if (cVar != null) {
            cVar.mo116584a(bVar);
            return cVar;
        }
        MeetingMintuesImpl cVar2 = new MeetingMintuesImpl(activity, str);
        cVar2.mo116584a(bVar);
        hashMap.put(str, cVar2);
        return cVar2;
    }
}
