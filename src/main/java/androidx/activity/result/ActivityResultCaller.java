package androidx.activity.result;

import androidx.activity.result.p016a.AbstractC0209a;

public interface ActivityResultCaller {
    <I, O> AbstractC0210b<I> registerForActivityResult(AbstractC0209a<I, O> aVar, AbstractC0208a<O> aVar2);

    <I, O> AbstractC0210b<I> registerForActivityResult(AbstractC0209a<I, O> aVar, AbstractC0211c cVar, AbstractC0208a<O> aVar2);
}
