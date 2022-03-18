package com.ss.android.vc.meeting.module.reaction.view.reaction;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum ReactionPosition {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition$Companion;", "", "()V", "forNumber", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "value", "", "valueOf", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionPosition$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ReactionPosition mo217198a(int i) {
            switch (i) {
                case 0:
                    return ReactionPosition.ZERO;
                case 1:
                    return ReactionPosition.ONE;
                case 2:
                    return ReactionPosition.TWO;
                case 3:
                    return ReactionPosition.THREE;
                case 4:
                    return ReactionPosition.FOUR;
                case 5:
                    return ReactionPosition.FIVE;
                case 6:
                    return ReactionPosition.SIX;
                case 7:
                    return ReactionPosition.SEVEN;
                default:
                    return ReactionPosition.ZERO;
            }
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private ReactionPosition(int i) {
        this.number = i;
    }
}
