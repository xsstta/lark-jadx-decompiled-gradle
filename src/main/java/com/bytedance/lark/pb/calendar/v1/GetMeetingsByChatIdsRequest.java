package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMeetingsByChatIdsRequest extends Message<GetMeetingsByChatIdsRequest, C15746a> {
    public static final ProtoAdapter<GetMeetingsByChatIdsRequest> ADAPTER = new C15747b();
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingsByChatIdsRequest$b */
    private static final class C15747b extends ProtoAdapter<GetMeetingsByChatIdsRequest> {
        C15747b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingsByChatIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingsByChatIdsRequest getMeetingsByChatIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getMeetingsByChatIdsRequest.chat_ids) + getMeetingsByChatIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingsByChatIdsRequest decode(ProtoReader protoReader) throws IOException {
            C15746a aVar = new C15746a();
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
                    aVar.f41516a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingsByChatIdsRequest getMeetingsByChatIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getMeetingsByChatIdsRequest.chat_ids);
            protoWriter.writeBytes(getMeetingsByChatIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingsByChatIdsRequest$a */
    public static final class C15746a extends Message.Builder<GetMeetingsByChatIdsRequest, C15746a> {

        /* renamed from: a */
        public List<String> f41516a = Internal.newMutableList();

        /* renamed from: a */
        public GetMeetingsByChatIdsRequest build() {
            return new GetMeetingsByChatIdsRequest(this.f41516a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15746a mo56933a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41516a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15746a newBuilder() {
        C15746a aVar = new C15746a();
        aVar.f41516a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingsByChatIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingsByChatIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingsByChatIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetMeetingsByChatIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
    }
}
