package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "R", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
final class KCallableImpl$_parameters$1 extends Lambda implements Function0<ArrayList<KParameter>> {
    final /* synthetic */ KCallableImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KCallableImpl$_parameters$1(KCallableImpl kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<KParameter> invoke() {
        int i;
        final CallableMemberDescriptor descriptor = this.this$0.getDescriptor();
        ArrayList<KParameter> arrayList = new ArrayList<>();
        final int i2 = 0;
        if (!this.this$0.isBound()) {
            final ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
            if (instanceReceiverParameter != null) {
                arrayList.add(new KParameterImpl(this.this$0, 0, KParameter.Kind.INSTANCE, new Function0<ReceiverParameterDescriptor>() {
                    /* class kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.C691331 */

                    @Override // kotlin.jvm.functions.Function0
                    public final ReceiverParameterDescriptor invoke() {
                        return instanceReceiverParameter;
                    }
                }));
                i = 1;
            } else {
                i = 0;
            }
            final ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.EXTENSION_RECEIVER, new Function0<ReceiverParameterDescriptor>() {
                    /* class kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.C691342 */

                    @Override // kotlin.jvm.functions.Function0
                    public final ReceiverParameterDescriptor invoke() {
                        return extensionReceiverParameter;
                    }
                }));
                i++;
            }
        } else {
            i = 0;
        }
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
        int size = valueParameters.size();
        while (i2 < size) {
            arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.VALUE, new Function0<ValueParameterDescriptor>() {
                /* class kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.C691353 */

                @Override // kotlin.jvm.functions.Function0
                public final ValueParameterDescriptor invoke() {
                    ValueParameterDescriptor valueParameterDescriptor = descriptor.getValueParameters().get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(valueParameterDescriptor, "descriptor.valueParameters[i]");
                    return valueParameterDescriptor;
                }
            }));
            i2++;
            i++;
        }
        if (this.this$0.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor)) {
            ArrayList<KParameter> arrayList2 = arrayList;
            if (arrayList2.size() > 1) {
                CollectionsKt.sortWith(arrayList2, new KCallableImpl$_parameters$1$$special$$inlined$sortBy$1());
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
