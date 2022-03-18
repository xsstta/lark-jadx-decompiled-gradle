package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import org.p3511d.AbstractC70022d;

public final class FlowableInternalHelper {

    public enum RequestMax implements Consumer<AbstractC70022d> {
        INSTANCE;

        public void accept(AbstractC70022d dVar) throws Exception {
            dVar.request(Long.MAX_VALUE);
        }
    }
}
