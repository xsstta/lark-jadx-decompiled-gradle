package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetGuideToRateEventRequest extends Message<SetGuideToRateEventRequest, C19205a> {
    public static final ProtoAdapter<SetGuideToRateEventRequest> ADAPTER = new C19206b();
    public static final EventType DEFAULT_EVENT_TYPE = EventType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final EventType event_type;

    public enum EventType implements WireEnum {
        UNKNOWN(0),
        SHOW(1),
        RATE(2),
        CANCEL(3);
        
        public static final ProtoAdapter<EventType> ADAPTER = ProtoAdapter.newEnumAdapter(EventType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SHOW;
            }
            if (i == 2) {
                return RATE;
            }
            if (i != 3) {
                return null;
            }
            return CANCEL;
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetGuideToRateEventRequest$b */
    private static final class C19206b extends ProtoAdapter<SetGuideToRateEventRequest> {
        C19206b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetGuideToRateEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetGuideToRateEventRequest setGuideToRateEventRequest) {
            return EventType.ADAPTER.encodedSizeWithTag(1, setGuideToRateEventRequest.event_type) + setGuideToRateEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetGuideToRateEventRequest decode(ProtoReader protoReader) throws IOException {
            C19205a aVar = new C19205a();
            aVar.f47372a = EventType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47372a = EventType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetGuideToRateEventRequest setGuideToRateEventRequest) throws IOException {
            EventType.ADAPTER.encodeWithTag(protoWriter, 1, setGuideToRateEventRequest.event_type);
            protoWriter.writeBytes(setGuideToRateEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetGuideToRateEventRequest$a */
    public static final class C19205a extends Message.Builder<SetGuideToRateEventRequest, C19205a> {

        /* renamed from: a */
        public EventType f47372a;

        /* renamed from: a */
        public SetGuideToRateEventRequest build() {
            EventType eventType = this.f47372a;
            if (eventType != null) {
                return new SetGuideToRateEventRequest(eventType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(eventType, "event_type");
        }

        /* renamed from: a */
        public C19205a mo65577a(EventType eventType) {
            this.f47372a = eventType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19205a newBuilder() {
        C19205a aVar = new C19205a();
        aVar.f47372a = this.event_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetGuideToRateEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", event_type=");
        sb.append(this.event_type);
        StringBuilder replace = sb.replace(0, 2, "SetGuideToRateEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetGuideToRateEventRequest(EventType eventType) {
        this(eventType, ByteString.EMPTY);
    }

    public SetGuideToRateEventRequest(EventType eventType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_type = eventType;
    }
}
