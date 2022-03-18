package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class RenderingFormat extends Enum<RenderingFormat> {
    private static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat HTML;
    public static final RenderingFormat PLAIN;

    static {
        PLAIN plain = new PLAIN("PLAIN", 0);
        PLAIN = plain;
        HTML html = new HTML("HTML", 1);
        HTML = html;
        $VALUES = new RenderingFormat[]{plain, html};
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) $VALUES.clone();
    }

    public abstract String escape(String str);

    static final class HTML extends RenderingFormat {
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String str) {
            Intrinsics.checkParameterIsNotNull(str, "string");
            return StringsKt.replace$default(StringsKt.replace$default(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        HTML(String str, int i) {
            super(str, i, null);
        }
    }

    private RenderingFormat(String str, int i) {
    }

    static final class PLAIN extends RenderingFormat {
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String str) {
            Intrinsics.checkParameterIsNotNull(str, "string");
            return str;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        PLAIN(String str, int i) {
            super(str, i, null);
        }
    }

    public /* synthetic */ RenderingFormat(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }
}
