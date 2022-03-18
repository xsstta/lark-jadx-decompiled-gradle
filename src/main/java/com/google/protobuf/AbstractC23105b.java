package com.google.protobuf;

import com.google.protobuf.AbstractC23125m;

/* renamed from: com.google.protobuf.b */
public abstract class AbstractC23105b<MessageType extends AbstractC23125m> implements AbstractC23129p<MessageType> {

    /* renamed from: a */
    private static final C23111g f57035a = C23111g.m83798b();

    /* renamed from: a */
    private UninitializedMessageException m83756a(MessageType messagetype) {
        if (messagetype instanceof AbstractC23103a) {
            return ((AbstractC23103a) messagetype).mo80226c();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: b */
    private MessageType m83757b(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.mo80127h()) {
            return messagetype;
        }
        throw m83756a(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* renamed from: b */
    public MessageType mo80235c(ByteString byteString, C23111g gVar) throws InvalidProtocolBufferException {
        return m83757b(mo80233a(byteString, gVar));
    }

    /* renamed from: a */
    public MessageType mo80233a(ByteString byteString, C23111g gVar) throws InvalidProtocolBufferException {
        try {
            C23108e newCodedInput = byteString.newCodedInput();
            MessageType messagetype = (MessageType) ((AbstractC23125m) mo80150b(newCodedInput, gVar));
            try {
                newCodedInput.mo80253a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(messagetype);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
