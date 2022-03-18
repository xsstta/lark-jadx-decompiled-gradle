package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "T", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
final class KClassImpl$Data$annotations$2 extends Lambda implements Function0<List<? extends Annotation>> {
    final /* synthetic */ KClassImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$annotations$2(KClassImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    /* Return type fixed from 'java.util.List<java.lang.annotation.Annotation>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Annotation> invoke() {
        return UtilKt.computeAnnotations(this.this$0.getDescriptor());
    }
}
