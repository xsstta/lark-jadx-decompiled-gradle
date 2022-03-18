package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.huawei.hms.android.HwBuildEx;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class CharValue extends IntegerValueConstant<Character> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) getValue()).charValue()), getPrintablePart(((Character) getValue()).charValue())}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        return format;
    }

    public CharValue(char c) {
        super(Character.valueOf(c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        SimpleType charType = moduleDescriptor.getBuiltIns().getCharType();
        Intrinsics.checkExpressionValueIsNotNull(charType, "module.builtIns.charType");
        return charType;
    }

    private final String getPrintablePart(char c) {
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                if (isPrintableUnicode(c)) {
                    return String.valueOf(c);
                }
                return "?";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean isPrintableUnicode(char c) {
        byte type = (byte) Character.getType(c);
        if (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) {
            return false;
        }
        return true;
    }
}
