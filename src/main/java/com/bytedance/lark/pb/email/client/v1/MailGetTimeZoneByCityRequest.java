package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetTimeZoneByCityRequest extends Message<MailGetTimeZoneByCityRequest, C16810a> {
    public static final ProtoAdapter<MailGetTimeZoneByCityRequest> ADAPTER = new C16811b();
    private static final long serialVersionUID = 0;
    public final String city;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTimeZoneByCityRequest$b */
    private static final class C16811b extends ProtoAdapter<MailGetTimeZoneByCityRequest> {
        C16811b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetTimeZoneByCityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetTimeZoneByCityRequest mailGetTimeZoneByCityRequest) {
            int i;
            if (mailGetTimeZoneByCityRequest.city != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetTimeZoneByCityRequest.city);
            } else {
                i = 0;
            }
            return i + mailGetTimeZoneByCityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetTimeZoneByCityRequest decode(ProtoReader protoReader) throws IOException {
            C16810a aVar = new C16810a();
            aVar.f43280a = "";
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
                    aVar.f43280a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetTimeZoneByCityRequest mailGetTimeZoneByCityRequest) throws IOException {
            if (mailGetTimeZoneByCityRequest.city != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetTimeZoneByCityRequest.city);
            }
            protoWriter.writeBytes(mailGetTimeZoneByCityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTimeZoneByCityRequest$a */
    public static final class C16810a extends Message.Builder<MailGetTimeZoneByCityRequest, C16810a> {

        /* renamed from: a */
        public String f43280a;

        /* renamed from: a */
        public MailGetTimeZoneByCityRequest build() {
            return new MailGetTimeZoneByCityRequest(this.f43280a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16810a mo59565a(String str) {
            this.f43280a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16810a newBuilder() {
        C16810a aVar = new C16810a();
        aVar.f43280a = this.city;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetTimeZoneByCityRequest");
        StringBuilder sb = new StringBuilder();
        if (this.city != null) {
            sb.append(", city=");
            sb.append(this.city);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetTimeZoneByCityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetTimeZoneByCityRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetTimeZoneByCityRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.city = str;
    }
}
