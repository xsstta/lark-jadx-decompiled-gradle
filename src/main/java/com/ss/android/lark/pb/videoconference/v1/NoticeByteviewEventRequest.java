package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class NoticeByteviewEventRequest extends Message<NoticeByteviewEventRequest, C50890a> {
    public static final ProtoAdapter<NoticeByteviewEventRequest> ADAPTER = new C50891b();
    public static final EventType DEFAULT_TYPE = EventType.ENTER;
    private static final long serialVersionUID = 0;
    public final EventType type;

    public enum EventType implements WireEnum {
        ENTER(1),
        LEAVE(2);
        
        public static final ProtoAdapter<EventType> ADAPTER = ProtoAdapter.newEnumAdapter(EventType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventType fromValue(int i) {
            if (i == 1) {
                return ENTER;
            }
            if (i != 2) {
                return null;
            }
            return LEAVE;
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.NoticeByteviewEventRequest$b */
    private static final class C50891b extends ProtoAdapter<NoticeByteviewEventRequest> {
        C50891b() {
            super(FieldEncoding.LENGTH_DELIMITED, NoticeByteviewEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(NoticeByteviewEventRequest noticeByteviewEventRequest) {
            return EventType.ADAPTER.encodedSizeWithTag(1, noticeByteviewEventRequest.type) + noticeByteviewEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public NoticeByteviewEventRequest decode(ProtoReader protoReader) throws IOException {
            C50890a aVar = new C50890a();
            aVar.f126822a = EventType.ENTER;
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
                        aVar.f126822a = EventType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NoticeByteviewEventRequest noticeByteviewEventRequest) throws IOException {
            EventType.ADAPTER.encodeWithTag(protoWriter, 1, noticeByteviewEventRequest.type);
            protoWriter.writeBytes(noticeByteviewEventRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.NoticeByteviewEventRequest$a */
    public static final class C50890a extends Message.Builder<NoticeByteviewEventRequest, C50890a> {

        /* renamed from: a */
        public EventType f126822a;

        /* renamed from: a */
        public NoticeByteviewEventRequest build() {
            EventType eventType = this.f126822a;
            if (eventType != null) {
                return new NoticeByteviewEventRequest(eventType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(eventType, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C50890a mo175819a(EventType eventType) {
            this.f126822a = eventType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50890a newBuilder() {
        C50890a aVar = new C50890a();
        aVar.f126822a = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "NoticeByteviewEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "NoticeByteviewEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public NoticeByteviewEventRequest(EventType eventType) {
        this(eventType, ByteString.EMPTY);
    }

    public NoticeByteviewEventRequest(EventType eventType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = eventType;
    }
}
