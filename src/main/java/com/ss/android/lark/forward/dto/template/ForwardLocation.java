package com.ss.android.lark.forward.dto.template;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "OTHER", "FILE", "PIN", "CHAT", "IMAGE", CodePackage.LOCATION, "FAVOURITE", "THREAD", "THREAD_DETAIL", "Companion", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum ForwardLocation {
    OTHER("other"),
    FILE("in_file_page"),
    PIN("pin"),
    CHAT("chat"),
    IMAGE("image_view"),
    LOCATION("location"),
    FAVOURITE("favorite"),
    THREAD("thread"),
    THREAD_DETAIL("thread_details");
    
    public static final Companion Companion = new Companion(null);
    private String value;

    @JvmStatic
    public static final ForwardLocation forNumber(String str) {
        return Companion.mo140817a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardLocation$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "value", "", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardLocation$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ForwardLocation mo140817a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            switch (str.hashCode()) {
                case -1442714871:
                    if (str.equals("image_view")) {
                        return ForwardLocation.IMAGE;
                    }
                    break;
                case -874443254:
                    if (str.equals("thread")) {
                        return ForwardLocation.THREAD;
                    }
                    break;
                case -855114483:
                    if (str.equals("thread_details")) {
                        return ForwardLocation.THREAD_DETAIL;
                    }
                    break;
                case 110997:
                    if (str.equals("pin")) {
                        return ForwardLocation.PIN;
                    }
                    break;
                case 3052376:
                    if (str.equals("chat")) {
                        return ForwardLocation.CHAT;
                    }
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        return ForwardLocation.OTHER;
                    }
                    break;
                case 1050790300:
                    if (str.equals("favorite")) {
                        return ForwardLocation.FAVOURITE;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        return ForwardLocation.LOCATION;
                    }
                    break;
                case 2062274776:
                    if (str.equals("in_file_page")) {
                        return ForwardLocation.FILE;
                    }
                    break;
            }
            return ForwardLocation.OTHER;
        }
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.value = str;
    }

    private ForwardLocation(String str) {
        this.value = str;
    }
}
