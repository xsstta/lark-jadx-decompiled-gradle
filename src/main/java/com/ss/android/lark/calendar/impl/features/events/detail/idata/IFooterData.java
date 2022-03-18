package com.ss.android.lark.calendar.impl.features.events.detail.idata;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "", "getFooterType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData$FooterType;", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getRsvpBotCardReplyStatus", "", "isShowRsvpCommentIcon", "", "FooterType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IFooterData {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData$FooterType;", "", "(Ljava/lang/String;I)V", "RSVP", "REPLY", "JOIN", "UNJOINABLE", "GONE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FooterType {
        RSVP,
        REPLY,
        JOIN,
        UNJOINABLE,
        GONE
    }

    /* renamed from: a */
    FooterType mo113676a();

    /* renamed from: b */
    RSVPStatus mo113677b();

    /* renamed from: c */
    boolean mo113678c();

    /* renamed from: d */
    String mo113679d();
}
