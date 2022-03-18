package com.ss.android.lark.forward.dto.template;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SHORT_CUT", "CLICK", "TOPIC_CLICK", "QUICK_CLICK", "Companion", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum ForwardCallType {
    SHORT_CUT("shortcutkey"),
    CLICK("click"),
    TOPIC_CLICK("topic_click"),
    QUICK_CLICK("quick_click");
    
    public static final Companion Companion = new Companion(null);
    private final String value;

    @JvmStatic
    public static final ForwardCallType forNumber(String str) {
        return Companion.mo140738a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardCallType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "value", "", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardCallType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ForwardCallType mo140738a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            switch (str.hashCode()) {
                case -107997576:
                    if (str.equals("topic_click")) {
                        return ForwardCallType.TOPIC_CLICK;
                    }
                    break;
                case 94750088:
                    if (str.equals("click")) {
                        return ForwardCallType.CLICK;
                    }
                    break;
                case 514222262:
                    if (str.equals("quick_click")) {
                        return ForwardCallType.QUICK_CLICK;
                    }
                    break;
                case 1416500313:
                    if (str.equals("shortcutkey")) {
                        return ForwardCallType.SHORT_CUT;
                    }
                    break;
            }
            return ForwardCallType.CLICK;
        }
    }

    public final String getValue() {
        return this.value;
    }

    private ForwardCallType(String str) {
        this.value = str;
    }
}
