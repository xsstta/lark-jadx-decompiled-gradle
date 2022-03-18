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

public final class CreateMeetingMinuteByChatIdRequest extends Message<CreateMeetingMinuteByChatIdRequest, C15580a> {
    public static final ProtoAdapter<CreateMeetingMinuteByChatIdRequest> ADAPTER = new C15581b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByChatIdRequest$b */
    private static final class C15581b extends ProtoAdapter<CreateMeetingMinuteByChatIdRequest> {
        C15581b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateMeetingMinuteByChatIdRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateMeetingMinuteByChatIdRequest createMeetingMinuteByChatIdRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createMeetingMinuteByChatIdRequest.chat_id) + createMeetingMinuteByChatIdRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateMeetingMinuteByChatIdRequest decode(ProtoReader protoReader) throws IOException {
            C15580a aVar = new C15580a();
            aVar.f41314a = "";
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
                    aVar.f41314a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateMeetingMinuteByChatIdRequest createMeetingMinuteByChatIdRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createMeetingMinuteByChatIdRequest.chat_id);
            protoWriter.writeBytes(createMeetingMinuteByChatIdRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByChatIdRequest$a */
    public static final class C15580a extends Message.Builder<CreateMeetingMinuteByChatIdRequest, C15580a> {

        /* renamed from: a */
        public String f41314a;

        /* renamed from: a */
        public CreateMeetingMinuteByChatIdRequest build() {
            String str = this.f41314a;
            if (str != null) {
                return new CreateMeetingMinuteByChatIdRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C15580a mo56519a(String str) {
            this.f41314a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15580a newBuilder() {
        C15580a aVar = new C15580a();
        aVar.f41314a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CreateMeetingMinuteByChatIdRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "CreateMeetingMinuteByChatIdRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateMeetingMinuteByChatIdRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public CreateMeetingMinuteByChatIdRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
