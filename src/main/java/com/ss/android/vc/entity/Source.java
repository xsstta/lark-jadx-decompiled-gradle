package com.ss.android.vc.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/entity/Source;", "", "(Ljava/lang/String;I)V", "UNKNOWN_SOURCE", "WEB", "IOS", "IOS_APP", "ANDROID", "ANDROID_APP", "PC_CLIENT", "GOOGLE", "PEOPLE", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum Source {
    UNKNOWN_SOURCE,
    WEB,
    IOS,
    IOS_APP,
    ANDROID,
    ANDROID_APP,
    PC_CLIENT,
    GOOGLE,
    PEOPLE;
    
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final Source valueOf(int i) {
        return Companion.mo209308a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/Source$Companion;", "", "()V", "valueOf", "Lcom/ss/android/vc/entity/Source;", "value", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.Source$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Source mo209308a(int i) {
            switch (i) {
                case 1:
                    return Source.WEB;
                case 2:
                    return Source.IOS;
                case 3:
                    return Source.IOS_APP;
                case 4:
                    return Source.ANDROID;
                case 5:
                    return Source.ANDROID_APP;
                case 6:
                    return Source.PC_CLIENT;
                case 7:
                    return Source.GOOGLE;
                case 8:
                    return Source.PEOPLE;
                default:
                    return Source.UNKNOWN_SOURCE;
            }
        }
    }
}
