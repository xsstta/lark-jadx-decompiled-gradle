package com.bytedance.ee.bear.bitable.card.model.jsmodel.commands;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandResultCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "FAIL", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum FieldCommandResultCode {
    SUCCESS(2),
    FAIL(1),
    UNKNOWN(0);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final FieldCommandResultCode from(int i) {
        return Companion.mo17590a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandResultCode$Companion;", "", "()V", "from", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandResultCode;", "value", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldCommandResultCode$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final FieldCommandResultCode mo17590a(int i) {
            if (i == FieldCommandResultCode.SUCCESS.getValue()) {
                return FieldCommandResultCode.SUCCESS;
            }
            if (i == FieldCommandResultCode.FAIL.getValue()) {
                return FieldCommandResultCode.FAIL;
            }
            return FieldCommandResultCode.UNKNOWN;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private FieldCommandResultCode(int i) {
        this.value = i;
    }
}
