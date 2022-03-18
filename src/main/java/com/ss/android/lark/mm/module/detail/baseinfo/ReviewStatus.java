package com.ss.android.lark.mm.module.detail.baseinfo;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/ReviewStatus;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Passed", "NoAuth", "AppealFailed", "ToAppeal", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum ReviewStatus implements Serializable {
    Passed(0),
    NoAuth(1),
    AppealFailed(2),
    ToAppeal(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/ReviewStatus$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/mm/module/detail/baseinfo/ReviewStatus;", "value", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ReviewStatus mo161616a(int i) {
            if (i == 0) {
                return ReviewStatus.Passed;
            }
            if (i == 1) {
                return ReviewStatus.NoAuth;
            }
            if (i == 2) {
                return ReviewStatus.AppealFailed;
            }
            if (i != 3) {
                return ReviewStatus.Passed;
            }
            return ReviewStatus.ToAppeal;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private ReviewStatus(int i) {
        this.value = i;
    }
}
