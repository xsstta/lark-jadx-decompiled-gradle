package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReportResponse extends Message<ReportResponse, C49952a> {
    public static final ProtoAdapter<ReportResponse> ADAPTER = new C49953b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.moments.ReportResponse$b */
    private static final class C49953b extends ProtoAdapter<ReportResponse> {
        C49953b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ReportResponse reportResponse) {
            return reportResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ReportResponse decode(ProtoReader protoReader) throws IOException {
            C49952a aVar = new C49952a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReportResponse reportResponse) throws IOException {
            protoWriter.writeBytes(reportResponse.unknownFields());
        }
    }

    public ReportResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.moments.ReportResponse$a */
    public static final class C49952a extends Message.Builder<ReportResponse, C49952a> {
        /* renamed from: a */
        public ReportResponse build() {
            return new ReportResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49952a newBuilder() {
        C49952a aVar = new C49952a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "ReportResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ReportResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
