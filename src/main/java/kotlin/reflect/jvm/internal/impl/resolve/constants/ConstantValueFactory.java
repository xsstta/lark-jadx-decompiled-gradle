package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class ConstantValueFactory {
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    public final ConstantValue<?> createConstantValue(Object obj) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return createArrayValue(C69043h.m265742a((byte[]) obj), PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return createArrayValue(C69043h.m265746a((short[]) obj), PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(C69043h.m265774c((int[]) obj), PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(C69043h.m265744a((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return createArrayValue(C69043h.m265759b((char[]) obj), PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(C69043h.m265761b((float[]) obj), PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return createArrayValue(C69043h.m265743a((double[]) obj), PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return createArrayValue(C69043h.m265747a((boolean[]) obj), PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new NullValue();
        }
        return null;
    }

    public final ArrayValue createArrayValue(List<? extends ConstantValue<?>> list, KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        return new ArrayValue(list, new ConstantValueFactory$createArrayValue$1(kotlinType));
    }

    private final ArrayValue createArrayValue(List<?> list, PrimitiveType primitiveType) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.toList(list)) {
            ConstantValue<?> createConstantValue = createConstantValue(obj);
            if (createConstantValue != null) {
                arrayList.add(createConstantValue);
            }
        }
        return new ArrayValue(arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }
}
