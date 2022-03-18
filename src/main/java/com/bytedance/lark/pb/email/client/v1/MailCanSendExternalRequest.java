package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailCanSendExternalRequest extends Message<MailCanSendExternalRequest, C16642a> {
    public static final ProtoAdapter<MailCanSendExternalRequest> ADAPTER = new C16643b();
    private static final long serialVersionUID = 0;
    public final Address address;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCanSendExternalRequest$b */
    private static final class C16643b extends ProtoAdapter<MailCanSendExternalRequest> {
        C16643b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCanSendExternalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCanSendExternalRequest mailCanSendExternalRequest) {
            return Address.ADAPTER.encodedSizeWithTag(1, mailCanSendExternalRequest.address) + mailCanSendExternalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCanSendExternalRequest decode(ProtoReader protoReader) throws IOException {
            C16642a aVar = new C16642a();
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
                    aVar.f43088a = Address.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCanSendExternalRequest mailCanSendExternalRequest) throws IOException {
            Address.ADAPTER.encodeWithTag(protoWriter, 1, mailCanSendExternalRequest.address);
            protoWriter.writeBytes(mailCanSendExternalRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCanSendExternalRequest$a */
    public static final class C16642a extends Message.Builder<MailCanSendExternalRequest, C16642a> {

        /* renamed from: a */
        public Address f43088a;

        /* renamed from: a */
        public MailCanSendExternalRequest build() {
            Address address = this.f43088a;
            if (address != null) {
                return new MailCanSendExternalRequest(address, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(address, "address");
        }

        /* renamed from: a */
        public C16642a mo59172a(Address address) {
            this.f43088a = address;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16642a newBuilder() {
        C16642a aVar = new C16642a();
        aVar.f43088a = this.address;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCanSendExternalRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", address=");
        sb.append(this.address);
        StringBuilder replace = sb.replace(0, 2, "MailCanSendExternalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCanSendExternalRequest(Address address2) {
        this(address2, ByteString.EMPTY);
    }

    public MailCanSendExternalRequest(Address address2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.address = address2;
    }
}
