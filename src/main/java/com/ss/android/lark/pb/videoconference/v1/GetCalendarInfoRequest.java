package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarInfoRequest extends Message<GetCalendarInfoRequest, C50627a> {
    public static final ProtoAdapter<GetCalendarInfoRequest> ADAPTER = new C50628b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarInfoRequest$b */
    private static final class C50628b extends ProtoAdapter<GetCalendarInfoRequest> {
        C50628b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarInfoRequest getCalendarInfoRequest) {
            int i;
            if (getCalendarInfoRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarInfoRequest.meeting_id);
            } else {
                i = 0;
            }
            return i + getCalendarInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50627a aVar = new C50627a();
            aVar.f126368a = "";
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
                    aVar.f126368a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarInfoRequest getCalendarInfoRequest) throws IOException {
            if (getCalendarInfoRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarInfoRequest.meeting_id);
            }
            protoWriter.writeBytes(getCalendarInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarInfoRequest$a */
    public static final class C50627a extends Message.Builder<GetCalendarInfoRequest, C50627a> {

        /* renamed from: a */
        public String f126368a;

        /* renamed from: a */
        public GetCalendarInfoRequest build() {
            return new GetCalendarInfoRequest(this.f126368a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50627a mo175228a(String str) {
            this.f126368a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50627a newBuilder() {
        C50627a aVar = new C50627a();
        aVar.f126368a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCalendarInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
