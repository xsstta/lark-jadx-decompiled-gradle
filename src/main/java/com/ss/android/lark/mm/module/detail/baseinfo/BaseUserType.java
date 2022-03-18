package com.ss.android.lark.mm.module.detail.baseinfo;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/BaseUserType;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "USER", "GROUP", "TENANT", "PUBLIC", "MOBILE", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum BaseUserType implements Serializable {
    UNKNOWN(-1),
    USER(0),
    GROUP(1),
    TENANT(2),
    PUBLIC(3),
    MOBILE(4);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/BaseUserType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/mm/module/detail/baseinfo/BaseUserType;", "value", "", "isPerson", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final boolean mo161470b(int i) {
            if (i == BaseUserType.USER.getValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final BaseUserType mo161469a(int i) {
            if (i == 0) {
                return BaseUserType.USER;
            }
            if (i == 1) {
                return BaseUserType.GROUP;
            }
            if (i == 2) {
                return BaseUserType.TENANT;
            }
            if (i == 3) {
                return BaseUserType.PUBLIC;
            }
            if (i != 4) {
                return BaseUserType.UNKNOWN;
            }
            return BaseUserType.MOBILE;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private BaseUserType(int i) {
        this.value = i;
    }
}
