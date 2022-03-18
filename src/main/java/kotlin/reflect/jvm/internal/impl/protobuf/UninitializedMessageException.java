package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private final List<String> missingFields;

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
