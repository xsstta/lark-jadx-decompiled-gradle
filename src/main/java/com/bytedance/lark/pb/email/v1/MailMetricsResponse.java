package com.bytedance.lark.pb.email.v1;

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

public final class MailMetricsResponse extends Message<MailMetricsResponse, C17022a> {
    public static final ProtoAdapter<MailMetricsResponse> ADAPTER = new C17023b();
    private static final long serialVersionUID = 0;
    public final List<MailSlardar> slardar;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailMetricsResponse$b */
    private static final class C17023b extends ProtoAdapter<MailMetricsResponse> {
        C17023b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMetricsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMetricsResponse mailMetricsResponse) {
            return MailSlardar.ADAPTER.asRepeated().encodedSizeWithTag(1, mailMetricsResponse.slardar) + mailMetricsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailMetricsResponse decode(ProtoReader protoReader) throws IOException {
            C17022a aVar = new C17022a();
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
                    aVar.f43670a.add(MailSlardar.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMetricsResponse mailMetricsResponse) throws IOException {
            MailSlardar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailMetricsResponse.slardar);
            protoWriter.writeBytes(mailMetricsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailMetricsResponse$a */
    public static final class C17022a extends Message.Builder<MailMetricsResponse, C17022a> {

        /* renamed from: a */
        public List<MailSlardar> f43670a = Internal.newMutableList();

        /* renamed from: a */
        public MailMetricsResponse build() {
            return new MailMetricsResponse(this.f43670a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17022a newBuilder() {
        C17022a aVar = new C17022a();
        aVar.f43670a = Internal.copyOf("slardar", this.slardar);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMetricsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.slardar.isEmpty()) {
            sb.append(", slardar=");
            sb.append(this.slardar);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMetricsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailMetricsResponse(List<MailSlardar> list) {
        this(list, ByteString.EMPTY);
    }

    public MailMetricsResponse(List<MailSlardar> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.slardar = Internal.immutableCopyOf("slardar", list);
    }
}
