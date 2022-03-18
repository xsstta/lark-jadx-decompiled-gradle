package org.apache.commons.lang3.concurrent;

public abstract class AbstractCircuitBreaker<T> {

    protected enum State {
        CLOSED {
            @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State
            public State oppositeState() {
                return OPEN;
            }
        },
        OPEN {
            @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State
            public State oppositeState() {
                return CLOSED;
            }
        };

        public abstract State oppositeState();
    }
}
