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

public final class GetMeetingMinuteHasUpdateByChatIdRequest extends Message<GetMeetingMinuteHasUpdateByChatIdRequest, C15732a> {
    public static final ProtoAdapter<GetMeetingMinuteHasUpdateByChatIdRequest> ADAPTER = new C15733b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingMinuteHasUpdateByChatIdRequest$b */
    private static final class C15733b extends ProtoAdapter<GetMeetingMinuteHasUpdateByChatIdRequest> {
        C15733b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingMinuteHasUpdateByChatIdRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingMinuteHasUpdateByChatIdRequest getMeetingMinuteHasUpdateByChatIdRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMeetingMinuteHasUpdateByChatIdRequest.chat_id) + getMeetingMinuteHasUpdateByChatIdRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingMinuteHasUpdateByChatIdRequest decode(ProtoReader protoReader) throws IOException {
            C15732a aVar = new C15732a();
            aVar.f41493a = "";
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
                    aVar.f41493a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingMinuteHasUpdateByChatIdRequest getMeetingMinuteHasUpdateByChatIdRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMeetingMinuteHasUpdateByChatIdRequest.chat_id);
            protoWriter.writeBytes(getMeetingMinuteHasUpdateByChatIdRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingMinuteHasUpdateByChatIdRequest$a */
    public static final class C15732a extends Message.Builder<GetMeetingMinuteHasUpdateByChatIdRequest, C15732a> {

        /* renamed from: a */
        public String f41493a;

        /* renamed from: a */
        public GetMeetingMinuteHasUpdateByChatIdRequest build() {
            String str = this.f41493a;
            if (str != null) {
                return new GetMeetingMinuteHasUpdateByChatIdRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C15732a mo56894a(String str) {
            this.f41493a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15732a newBuilder() {
        C15732a aVar = new C15732a();
        aVar.f41493a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingMinuteHasUpdateByChatIdRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetMeetingMinuteHasUpdateByChatIdRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingMinuteHasUpdateByChatIdRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetMeetingMinuteHasUpdateByChatIdRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
