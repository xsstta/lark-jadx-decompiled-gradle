package com.bytedance.ies.xbridge.base.runtime.model;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0013\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/model/SettingValueType;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "STRING", "BOOL", "NUMBER", "OBJECT", "ARRAY", "INT32", "LONG", "FLOAT", "DOUBLE", "UNSUPPORTED", "Companion", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum SettingValueType {
    STRING("string"),
    BOOL("bool"),
    NUMBER("number"),
    OBJECT("object"),
    ARRAY("array"),
    INT32("int32"),
    LONG("long"),
    FLOAT("float"),
    DOUBLE("double"),
    UNSUPPORTED(null, 1, null);
    
    public static final Companion Companion = new Companion(null);
    private final String type;

    @JvmStatic
    public static final SettingValueType getValueByType(String str) {
        return Companion.mo53058a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/model/SettingValueType$Companion;", "", "()V", "getValueByType", "Lcom/bytedance/ies/xbridge/base/runtime/model/SettingValueType;", ShareHitPoint.f121869d, "", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.model.SettingValueType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SettingValueType mo53058a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                return SettingValueType.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return SettingValueType.UNSUPPORTED;
            }
        }
    }

    public final String getType() {
        return this.type;
    }

    private SettingValueType(String str) {
        this.type = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ SettingValueType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
