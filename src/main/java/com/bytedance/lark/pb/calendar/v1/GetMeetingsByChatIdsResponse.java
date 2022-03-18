package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetMeetingsByChatIdsResponse extends Message<GetMeetingsByChatIdsResponse, C15748a> {
    public static final ProtoAdapter<GetMeetingsByChatIdsResponse> ADAPTER = new C15749b();
    private static final long serialVersionUID = 0;
    public final Map<String, MeetingDependency> chat_meetings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingsByChatIdsResponse$a */
    public static final class C15748a extends Message.Builder<GetMeetingsByChatIdsResponse, C15748a> {

        /* renamed from: a */
        public Map<String, MeetingDependency> f41517a = Internal.newMutableMap();

        /* renamed from: a */
        public GetMeetingsByChatIdsResponse build() {
            return new GetMeetingsByChatIdsResponse(this.f41517a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingsByChatIdsResponse$b */
    private static final class C15749b extends ProtoAdapter<GetMeetingsByChatIdsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, MeetingDependency>> f41518a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, MeetingDependency.ADAPTER);

        C15749b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingsByChatIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingsByChatIdsResponse getMeetingsByChatIdsResponse) {
            return this.f41518a.encodedSizeWithTag(1, getMeetingsByChatIdsResponse.chat_meetings) + getMeetingsByChatIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingsByChatIdsResponse decode(ProtoReader protoReader) throws IOException {
            C15748a aVar = new C15748a();
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
                    aVar.f41517a.putAll(this.f41518a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingsByChatIdsResponse getMeetingsByChatIdsResponse) throws IOException {
            this.f41518a.encodeWithTag(protoWriter, 1, getMeetingsByChatIdsResponse.chat_meetings);
            protoWriter.writeBytes(getMeetingsByChatIdsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15748a newBuilder() {
        C15748a aVar = new C15748a();
        aVar.f41517a = Internal.copyOf("chat_meetings", this.chat_meetings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingsByChatIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_meetings.isEmpty()) {
            sb.append(", chat_meetings=");
            sb.append(this.chat_meetings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingsByChatIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingsByChatIdsResponse(Map<String, MeetingDependency> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMeetingsByChatIdsResponse(Map<String, MeetingDependency> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_meetings = Internal.immutableCopyOf("chat_meetings", map);
    }
}
