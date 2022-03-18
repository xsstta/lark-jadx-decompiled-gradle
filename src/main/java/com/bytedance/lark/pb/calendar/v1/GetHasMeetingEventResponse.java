package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetHasMeetingEventResponse extends Message<GetHasMeetingEventResponse, C15714a> {
    public static final ProtoAdapter<GetHasMeetingEventResponse> ADAPTER = new C15715b();
    public static final Boolean DEFAULT_HAS_MEETING_EVENT = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_meeting_event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetHasMeetingEventResponse$b */
    private static final class C15715b extends ProtoAdapter<GetHasMeetingEventResponse> {
        C15715b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHasMeetingEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHasMeetingEventResponse getHasMeetingEventResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getHasMeetingEventResponse.has_meeting_event) + getHasMeetingEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHasMeetingEventResponse decode(ProtoReader protoReader) throws IOException {
            C15714a aVar = new C15714a();
            aVar.f41473a = false;
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
                    aVar.f41473a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHasMeetingEventResponse getHasMeetingEventResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getHasMeetingEventResponse.has_meeting_event);
            protoWriter.writeBytes(getHasMeetingEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetHasMeetingEventResponse$a */
    public static final class C15714a extends Message.Builder<GetHasMeetingEventResponse, C15714a> {

        /* renamed from: a */
        public Boolean f41473a;

        /* renamed from: a */
        public GetHasMeetingEventResponse build() {
            Boolean bool = this.f41473a;
            if (bool != null) {
                return new GetHasMeetingEventResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_meeting_event");
        }
    }

    @Override // com.squareup.wire.Message
    public C15714a newBuilder() {
        C15714a aVar = new C15714a();
        aVar.f41473a = this.has_meeting_event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetHasMeetingEventResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", has_meeting_event=");
        sb.append(this.has_meeting_event);
        StringBuilder replace = sb.replace(0, 2, "GetHasMeetingEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHasMeetingEventResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetHasMeetingEventResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_meeting_event = bool;
    }
}
