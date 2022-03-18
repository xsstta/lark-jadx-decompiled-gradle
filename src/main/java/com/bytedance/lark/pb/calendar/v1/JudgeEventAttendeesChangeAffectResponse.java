package com.bytedance.lark.pb.calendar.v1;

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

public final class JudgeEventAttendeesChangeAffectResponse extends Message<JudgeEventAttendeesChangeAffectResponse, C15826a> {
    public static final ProtoAdapter<JudgeEventAttendeesChangeAffectResponse> ADAPTER = new C15827b();
    public static final EventAttendeeChangeAffect DEFAULT_AFFECT = EventAttendeeChangeAffect.OK;
    private static final long serialVersionUID = 0;
    public final EventAttendeeChangeAffect affect;

    public enum EventAttendeeChangeAffect implements WireEnum {
        OK(0),
        NEW_ATTENDEE_CANNOT_ENTER_MEETING_GROUP(1);
        
        public static final ProtoAdapter<EventAttendeeChangeAffect> ADAPTER = ProtoAdapter.newEnumAdapter(EventAttendeeChangeAffect.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventAttendeeChangeAffect fromValue(int i) {
            if (i == 0) {
                return OK;
            }
            if (i != 1) {
                return null;
            }
            return NEW_ATTENDEE_CANNOT_ENTER_MEETING_GROUP;
        }

        private EventAttendeeChangeAffect(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeEventAttendeesChangeAffectResponse$b */
    private static final class C15827b extends ProtoAdapter<JudgeEventAttendeesChangeAffectResponse> {
        C15827b() {
            super(FieldEncoding.LENGTH_DELIMITED, JudgeEventAttendeesChangeAffectResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JudgeEventAttendeesChangeAffectResponse judgeEventAttendeesChangeAffectResponse) {
            return EventAttendeeChangeAffect.ADAPTER.encodedSizeWithTag(1, judgeEventAttendeesChangeAffectResponse.affect) + judgeEventAttendeesChangeAffectResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JudgeEventAttendeesChangeAffectResponse decode(ProtoReader protoReader) throws IOException {
            C15826a aVar = new C15826a();
            aVar.f41624a = EventAttendeeChangeAffect.OK;
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
                        aVar.f41624a = EventAttendeeChangeAffect.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JudgeEventAttendeesChangeAffectResponse judgeEventAttendeesChangeAffectResponse) throws IOException {
            EventAttendeeChangeAffect.ADAPTER.encodeWithTag(protoWriter, 1, judgeEventAttendeesChangeAffectResponse.affect);
            protoWriter.writeBytes(judgeEventAttendeesChangeAffectResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JudgeEventAttendeesChangeAffectResponse$a */
    public static final class C15826a extends Message.Builder<JudgeEventAttendeesChangeAffectResponse, C15826a> {

        /* renamed from: a */
        public EventAttendeeChangeAffect f41624a;

        /* renamed from: a */
        public JudgeEventAttendeesChangeAffectResponse build() {
            EventAttendeeChangeAffect eventAttendeeChangeAffect = this.f41624a;
            if (eventAttendeeChangeAffect != null) {
                return new JudgeEventAttendeesChangeAffectResponse(eventAttendeeChangeAffect, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(eventAttendeeChangeAffect, "affect");
        }
    }

    @Override // com.squareup.wire.Message
    public C15826a newBuilder() {
        C15826a aVar = new C15826a();
        aVar.f41624a = this.affect;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "JudgeEventAttendeesChangeAffectResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", affect=");
        sb.append(this.affect);
        StringBuilder replace = sb.replace(0, 2, "JudgeEventAttendeesChangeAffectResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JudgeEventAttendeesChangeAffectResponse(EventAttendeeChangeAffect eventAttendeeChangeAffect) {
        this(eventAttendeeChangeAffect, ByteString.EMPTY);
    }

    public JudgeEventAttendeesChangeAffectResponse(EventAttendeeChangeAffect eventAttendeeChangeAffect, ByteString byteString) {
        super(ADAPTER, byteString);
        this.affect = eventAttendeeChangeAffect;
    }
}
