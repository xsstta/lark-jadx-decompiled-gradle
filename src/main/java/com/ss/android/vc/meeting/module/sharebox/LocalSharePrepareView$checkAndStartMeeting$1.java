package com.ss.android.vc.meeting.module.sharebox;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.meeting.module.localshare.LocalShareManager;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "meetingCheckData", "Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
public final class LocalSharePrepareView$checkAndStartMeeting$1<T> implements XConsumer<MeetingCheckData> {

    /* renamed from: a */
    final /* synthetic */ LocalSharePrepareView f158828a;

    /* renamed from: b */
    final /* synthetic */ ShareScreenToRoomEntityRequest.JoinPath f158829b;

    /* renamed from: c */
    final /* synthetic */ String f158830c;

    /* renamed from: d */
    final /* synthetic */ AbstractC63598b f158831d;

    /* renamed from: e */
    final /* synthetic */ LocalShareManager.ICheckAndShareToRoomByMeetingNumber f158832e;

    LocalSharePrepareView$checkAndStartMeeting$1(LocalSharePrepareView lVar, ShareScreenToRoomEntityRequest.JoinPath joinPath, String str, AbstractC63598b bVar, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar) {
        this.f158828a = lVar;
        this.f158829b = joinPath;
        this.f158830c = str;
        this.f158831d = bVar;
        this.f158832e = cVar;
    }

    /* renamed from: a */
    public final void accept(MeetingCheckData bVar) {
        Boolean bool;
        if (bVar != null) {
            bool = bVar.mo219661a();
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            C60700b.m235851b("LocalSharePrepareView", "[openLocalSharePage]", "not in meeting, will start new local share");
            int i = C63042m.f158890a[this.f158829b.ordinal()];
            if (i == 1) {
                this.f158828a.mo217795a(this.f158830c, null, this.f158831d);
            } else if (i == 2) {
                this.f158828a.mo217793a(this.f158830c, this.f158832e);
            }
        } else {
            AbstractC63598b bVar2 = this.f158831d;
            if (bVar2 != null) {
                bVar2.onError(null);
            }
        }
    }
}
