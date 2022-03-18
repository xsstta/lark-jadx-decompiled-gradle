package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSuiteQuotaRequest extends Message<GetSuiteQuotaRequest, C50679a> {
    public static final ProtoAdapter<GetSuiteQuotaRequest> ADAPTER = new C50680b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaRequest$b */
    private static final class C50680b extends ProtoAdapter<GetSuiteQuotaRequest> {
        C50680b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSuiteQuotaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSuiteQuotaRequest getSuiteQuotaRequest) {
            int i;
            if (getSuiteQuotaRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(31, getSuiteQuotaRequest.meeting_id);
            } else {
                i = 0;
            }
            return i + getSuiteQuotaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSuiteQuotaRequest decode(ProtoReader protoReader) throws IOException {
            C50679a aVar = new C50679a();
            aVar.f126403a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 31) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126403a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSuiteQuotaRequest getSuiteQuotaRequest) throws IOException {
            if (getSuiteQuotaRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, getSuiteQuotaRequest.meeting_id);
            }
            protoWriter.writeBytes(getSuiteQuotaRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaRequest$a */
    public static final class C50679a extends Message.Builder<GetSuiteQuotaRequest, C50679a> {

        /* renamed from: a */
        public String f126403a;

        /* renamed from: a */
        public GetSuiteQuotaRequest build() {
            return new GetSuiteQuotaRequest(this.f126403a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50679a newBuilder() {
        C50679a aVar = new C50679a();
        aVar.f126403a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetSuiteQuotaRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSuiteQuotaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSuiteQuotaRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetSuiteQuotaRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
