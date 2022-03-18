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

public final class CreateMeetingMinuteByEventResponse extends Message<CreateMeetingMinuteByEventResponse, C15586a> {
    public static final ProtoAdapter<CreateMeetingMinuteByEventResponse> ADAPTER = new C15587b();
    private static final long serialVersionUID = 0;
    public final String meeting_minute_url;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByEventResponse$b */
    private static final class C15587b extends ProtoAdapter<CreateMeetingMinuteByEventResponse> {
        C15587b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateMeetingMinuteByEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateMeetingMinuteByEventResponse createMeetingMinuteByEventResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createMeetingMinuteByEventResponse.meeting_minute_url) + createMeetingMinuteByEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateMeetingMinuteByEventResponse decode(ProtoReader protoReader) throws IOException {
            C15586a aVar = new C15586a();
            aVar.f41319a = "";
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
                    aVar.f41319a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateMeetingMinuteByEventResponse createMeetingMinuteByEventResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createMeetingMinuteByEventResponse.meeting_minute_url);
            protoWriter.writeBytes(createMeetingMinuteByEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByEventResponse$a */
    public static final class C15586a extends Message.Builder<CreateMeetingMinuteByEventResponse, C15586a> {

        /* renamed from: a */
        public String f41319a;

        /* renamed from: a */
        public CreateMeetingMinuteByEventResponse build() {
            String str = this.f41319a;
            if (str != null) {
                return new CreateMeetingMinuteByEventResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_minute_url");
        }
    }

    @Override // com.squareup.wire.Message
    public C15586a newBuilder() {
        C15586a aVar = new C15586a();
        aVar.f41319a = this.meeting_minute_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CreateMeetingMinuteByEventResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_minute_url=");
        sb.append(this.meeting_minute_url);
        StringBuilder replace = sb.replace(0, 2, "CreateMeetingMinuteByEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateMeetingMinuteByEventResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public CreateMeetingMinuteByEventResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_minute_url = str;
    }
}
