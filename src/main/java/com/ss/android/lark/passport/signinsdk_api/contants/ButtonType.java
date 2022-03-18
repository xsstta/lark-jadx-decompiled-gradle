package com.ss.android.lark.passport.signinsdk_api.contants;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "NEXT", "REGISTER", "JOIN", "JOIN_SCAN", "JOIN_CODE", "CREATE_TENANT", "CREATE_PERSONAL", "APPEAL", "VERIFY", "KNOWN", "VERIFY_EMAIL", "VERIFY_PHONE", "QR_AUTH_SINGLE", "QR_AUTH_ALL", "QR_AUTH_AUTHZ", "DEPROV_KNOWN", "DEPROV_DELETE_WALLET", "RETRIEVE_NEED_MOBILE_CANCEL", "VERIFY_CIDP", "VERIFY_GOOGLE", "VERIFY_APPLE_ID", "VERIFY_TENANT_DOMAIN", "VERIFY_B_IDP", "OPT_IN_ACCEPT", "OPT_IN_NOT_ACCEPT", "OPT_IN_SKIP_SELECP", "Companion", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum ButtonType {
    NORMAL(0),
    NEXT(1),
    REGISTER(2),
    JOIN(3),
    JOIN_SCAN(4),
    JOIN_CODE(5),
    CREATE_TENANT(6),
    CREATE_PERSONAL(7),
    APPEAL(8),
    VERIFY(9),
    KNOWN(10),
    VERIFY_EMAIL(11),
    VERIFY_PHONE(12),
    QR_AUTH_SINGLE(13),
    QR_AUTH_ALL(14),
    QR_AUTH_AUTHZ(15),
    DEPROV_KNOWN(16),
    DEPROV_DELETE_WALLET(17),
    RETRIEVE_NEED_MOBILE_CANCEL(18),
    VERIFY_CIDP(19),
    VERIFY_GOOGLE(20),
    VERIFY_APPLE_ID(21),
    VERIFY_TENANT_DOMAIN(22),
    VERIFY_B_IDP(23),
    OPT_IN_ACCEPT(24),
    OPT_IN_NOT_ACCEPT(25),
    OPT_IN_SKIP_SELECP(26);
    
    public static final Companion Companion = new Companion(null);
    public static final Lazy values$delegate = LazyKt.lazy(C49359b.INSTANCE);
    private final int value;

    @JvmStatic
    public static final ButtonType fromValue(int i) {
        return Companion.mo172217a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType$Companion;", "", "()V", "values", "", "Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType;", "getValues", "()[Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType;", "values$delegate", "Lkotlin/Lazy;", "fromValue", "value", "", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.signinsdk_api.contants.ButtonType$a */
    public static final class Companion {
        /* renamed from: a */
        private final ButtonType[] m194436a() {
            Lazy lazy = ButtonType.values$delegate;
            Companion aVar = ButtonType.Companion;
            return (ButtonType[]) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ButtonType mo172217a(int i) {
            ButtonType buttonType;
            boolean z;
            ButtonType[] a = m194436a();
            int length = a.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    buttonType = null;
                    break;
                }
                buttonType = a[i2];
                if (buttonType.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (buttonType != null) {
                return buttonType;
            }
            return ButtonType.NORMAL;
        }
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType;", "invoke", "()[Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.signinsdk_api.contants.ButtonType$b */
    static final class C49359b extends Lambda implements Function0<ButtonType[]> {
        public static final C49359b INSTANCE = new C49359b();

        C49359b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ButtonType[] invoke() {
            return ButtonType.values();
        }
    }

    private ButtonType(int i) {
        this.value = i;
    }
}
