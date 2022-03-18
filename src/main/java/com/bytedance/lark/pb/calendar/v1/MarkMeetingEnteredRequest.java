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

public final class MarkMeetingEnteredRequest extends Message<MarkMeetingEnteredRequest, C15858a> {
    public static final ProtoAdapter<MarkMeetingEnteredRequest> ADAPTER = new C15859b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MarkMeetingEnteredRequest$b */
    private static final class C15859b extends ProtoAdapter<MarkMeetingEnteredRequest> {
        C15859b() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMeetingEnteredRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MarkMeetingEnteredRequest markMeetingEnteredRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markMeetingEnteredRequest.meeting_id) + markMeetingEnteredRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MarkMeetingEnteredRequest decode(ProtoReader protoReader) throws IOException {
            C15858a aVar = new C15858a();
            aVar.f41681a = "";
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
                    aVar.f41681a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MarkMeetingEnteredRequest markMeetingEnteredRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMeetingEnteredRequest.meeting_id);
            protoWriter.writeBytes(markMeetingEnteredRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MarkMeetingEnteredRequest$a */
    public static final class C15858a extends Message.Builder<MarkMeetingEnteredRequest, C15858a> {

        /* renamed from: a */
        public String f41681a;

        /* renamed from: a */
        public MarkMeetingEnteredRequest build() {
            String str = this.f41681a;
            if (str != null) {
                return new MarkMeetingEnteredRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15858a newBuilder() {
        C15858a aVar = new C15858a();
        aVar.f41681a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MarkMeetingEnteredRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        StringBuilder replace = sb.replace(0, 2, "MarkMeetingEnteredRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MarkMeetingEnteredRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MarkMeetingEnteredRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
