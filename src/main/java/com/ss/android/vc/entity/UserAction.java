package com.ss.android.vc.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/entity/UserAction;", "", "(Ljava/lang/String;I)V", "ACTION_UNKNOWN", "USER_LEAVE", "USER_NOTACCEPT", "USER_REFUSE", "USER_CANCEL", "USER_NO_ANSWER", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum UserAction {
    ACTION_UNKNOWN,
    USER_LEAVE,
    USER_NOTACCEPT,
    USER_REFUSE,
    USER_CANCEL,
    USER_NO_ANSWER;
    
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final UserAction valueOf(int i) {
        return Companion.mo209310a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/UserAction$Companion;", "", "()V", "valueOf", "Lcom/ss/android/vc/entity/UserAction;", "value", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.UserAction$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final UserAction mo209310a(int i) {
            if (i == 1) {
                return UserAction.USER_LEAVE;
            }
            if (i == 2) {
                return UserAction.USER_NOTACCEPT;
            }
            if (i == 3) {
                return UserAction.USER_REFUSE;
            }
            if (i == 4) {
                return UserAction.USER_CANCEL;
            }
            if (i != 5) {
                return UserAction.ACTION_UNKNOWN;
            }
            return UserAction.USER_NO_ANSWER;
        }
    }
}
