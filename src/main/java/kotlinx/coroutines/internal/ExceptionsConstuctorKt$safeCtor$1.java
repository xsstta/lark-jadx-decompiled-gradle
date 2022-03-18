package kotlinx.coroutines.internal;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class ExceptionsConstuctorKt$safeCtor$1 extends Lambda implements Function1<Throwable, Throwable> {
    final /* synthetic */ Function1 $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExceptionsConstuctorKt$safeCtor$1(Function1 function1) {
        super(1);
        this.$block = function1;
    }

    public final Throwable invoke(Throwable th) {
        Object obj;
        try {
            Result.Companion aVar = Result.Companion;
            obj = Result.m271569constructorimpl((Throwable) this.$block.invoke(th));
        } catch (Throwable th2) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th2));
        }
        if (Result.m271575isFailureimpl(obj)) {
            obj = null;
        }
        return (Throwable) obj;
    }
}
