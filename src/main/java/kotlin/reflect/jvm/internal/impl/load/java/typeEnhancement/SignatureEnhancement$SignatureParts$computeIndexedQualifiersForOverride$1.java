package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
    final /* synthetic */ JavaTypeQualifiers[] $computedResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1(JavaTypeQualifiers[] javaTypeQualifiersArr) {
        super(1);
        this.$computedResult = javaTypeQualifiersArr;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ JavaTypeQualifiers invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final JavaTypeQualifiers invoke(int i) {
        JavaTypeQualifiers[] javaTypeQualifiersArr = this.$computedResult;
        if (i < 0 || i > C69043h.m265784i(javaTypeQualifiersArr)) {
            return JavaTypeQualifiers.Companion.getNONE();
        }
        return javaTypeQualifiersArr[i];
    }
}
