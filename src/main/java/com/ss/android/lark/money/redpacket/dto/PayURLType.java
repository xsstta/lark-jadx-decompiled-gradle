package com.ss.android.lark.money.redpacket.dto;

import com.bytedance.lark.pb.im.v1.SendHongbaoResponse;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/money/redpacket/dto/PayURLType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CAIJING_PAY", "BYTE_PAY", "Companion", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum PayURLType {
    UNKNOWN(0),
    CAIJING_PAY(1),
    BYTE_PAY(2);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final PayURLType fromServerPayURLType(SendHongbaoResponse.PayURLType payURLType) {
        return Companion.mo168468a(payURLType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/money/redpacket/dto/PayURLType$Companion;", "", "()V", "fromServerPayURLType", "Lcom/ss/android/lark/money/redpacket/dto/PayURLType;", "serverType", "Lcom/bytedance/lark/pb/im/v1/SendHongbaoResponse$PayURLType;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.dto.PayURLType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final PayURLType mo168468a(SendHongbaoResponse.PayURLType payURLType) {
            if (payURLType == null) {
                return null;
            }
            int value = payURLType.getValue();
            if (value == PayURLType.UNKNOWN.getValue()) {
                return PayURLType.UNKNOWN;
            }
            if (value == PayURLType.CAIJING_PAY.getValue()) {
                return PayURLType.CAIJING_PAY;
            }
            if (value == PayURLType.BYTE_PAY.getValue()) {
                return PayURLType.BYTE_PAY;
            }
            return null;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private PayURLType(int i) {
        this.value = i;
    }
}
