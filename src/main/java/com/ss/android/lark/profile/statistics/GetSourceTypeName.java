package com.ss.android.lark.profile.statistics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/statistics/GetSourceTypeName;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.a */
public final class GetSourceTypeName {

    /* renamed from: a */
    public static final Companion f130733a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/statistics/GetSourceTypeName$Companion;", "", "()V", "getSourceTypename", "", "sourceType", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.a$a */
    public static final class Companion {
        /* renamed from: a */
        public final String mo180529a(int i) {
            switch (i) {
                case 1:
                    return "LINK";
                case 2:
                    return "CHAT";
                case 3:
                    return "CALENDAR";
                case 4:
                    return "DOCS";
                case 5:
                    return "VC";
                case 6:
                    return "EMAIL";
                case 7:
                    return "NAME_CARD";
                case 8:
                    return "SEARCH_PHONE";
                case 9:
                    return "SEARCH_EMAIL";
                case 10:
                    return "SEARCH_CONTACT";
                case 11:
                    return "COMMUNITY";
                default:
                    return "UNKNOWN_SOURCE";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
