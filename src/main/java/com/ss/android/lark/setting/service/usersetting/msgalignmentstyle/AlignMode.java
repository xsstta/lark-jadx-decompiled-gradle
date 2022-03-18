package com.ss.android.lark.setting.service.usersetting.msgalignmentstyle;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "AlignLeft", "AlignLeftAndRight", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum AlignMode {
    AlignLeft(1),
    AlignLeftAndRight(2);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode;", "value", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.AlignMode$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AlignMode mo186837a(int i) {
            if (i == 1) {
                return AlignMode.AlignLeft;
            }
            if (i != 2) {
                return AlignMode.AlignLeft;
            }
            return AlignMode.AlignLeftAndRight;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private AlignMode(int i) {
        this.value = i;
    }
}
