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

public final class CreateMeetingMinuteByChatIdResponse extends Message<CreateMeetingMinuteByChatIdResponse, C15582a> {
    public static final ProtoAdapter<CreateMeetingMinuteByChatIdResponse> ADAPTER = new C15583b();
    private static final long serialVersionUID = 0;
    public final String meeting_minute_url;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByChatIdResponse$b */
    private static final class C15583b extends ProtoAdapter<CreateMeetingMinuteByChatIdResponse> {
        C15583b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateMeetingMinuteByChatIdResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateMeetingMinuteByChatIdResponse createMeetingMinuteByChatIdResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createMeetingMinuteByChatIdResponse.meeting_minute_url) + createMeetingMinuteByChatIdResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateMeetingMinuteByChatIdResponse decode(ProtoReader protoReader) throws IOException {
            C15582a aVar = new C15582a();
            aVar.f41315a = "";
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
                    aVar.f41315a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateMeetingMinuteByChatIdResponse createMeetingMinuteByChatIdResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createMeetingMinuteByChatIdResponse.meeting_minute_url);
            protoWriter.writeBytes(createMeetingMinuteByChatIdResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByChatIdResponse$a */
    public static final class C15582a extends Message.Builder<CreateMeetingMinuteByChatIdResponse, C15582a> {

        /* renamed from: a */
        public String f41315a;

        /* renamed from: a */
        public CreateMeetingMinuteByChatIdResponse build() {
            String str = this.f41315a;
            if (str != null) {
                return new CreateMeetingMinuteByChatIdResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_minute_url");
        }
    }

    @Override // com.squareup.wire.Message
    public C15582a newBuilder() {
        C15582a aVar = new C15582a();
        aVar.f41315a = this.meeting_minute_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CreateMeetingMinuteByChatIdResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_minute_url=");
        sb.append(this.meeting_minute_url);
        StringBuilder replace = sb.replace(0, 2, "CreateMeetingMinuteByChatIdResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateMeetingMinuteByChatIdResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public CreateMeetingMinuteByChatIdResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_minute_url = str;
    }
}
