package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class MailGetSignatureResponse extends Message<MailGetSignatureResponse, C16776a> {
    public static final ProtoAdapter<MailGetSignatureResponse> ADAPTER = new C16777b();
    private static final long serialVersionUID = 0;
    public final Map<String, OptionalSignature> optional_signature_map;
    public final List<MailSignatureUsage> signature_usages;
    public final List<MailSignature> signatures;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse$a */
    public static final class C16776a extends Message.Builder<MailGetSignatureResponse, C16776a> {

        /* renamed from: a */
        public List<MailSignature> f43247a = Internal.newMutableList();

        /* renamed from: b */
        public List<MailSignatureUsage> f43248b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, OptionalSignature> f43249c = Internal.newMutableMap();

        /* renamed from: a */
        public MailGetSignatureResponse build() {
            return new MailGetSignatureResponse(this.f43247a, this.f43248b, this.f43249c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse$b */
    private static final class C16777b extends ProtoAdapter<MailGetSignatureResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, OptionalSignature>> f43250a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, OptionalSignature.ADAPTER);

        C16777b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetSignatureResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetSignatureResponse mailGetSignatureResponse) {
            return MailSignature.ADAPTER.asRepeated().encodedSizeWithTag(1, mailGetSignatureResponse.signatures) + MailSignatureUsage.ADAPTER.asRepeated().encodedSizeWithTag(2, mailGetSignatureResponse.signature_usages) + this.f43250a.encodedSizeWithTag(3, mailGetSignatureResponse.optional_signature_map) + mailGetSignatureResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetSignatureResponse decode(ProtoReader protoReader) throws IOException {
            C16776a aVar = new C16776a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43247a.add(MailSignature.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43248b.add(MailSignatureUsage.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43249c.putAll(this.f43250a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetSignatureResponse mailGetSignatureResponse) throws IOException {
            MailSignature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailGetSignatureResponse.signatures);
            MailSignatureUsage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailGetSignatureResponse.signature_usages);
            this.f43250a.encodeWithTag(protoWriter, 3, mailGetSignatureResponse.optional_signature_map);
            protoWriter.writeBytes(mailGetSignatureResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16776a newBuilder() {
        C16776a aVar = new C16776a();
        aVar.f43247a = Internal.copyOf("signatures", this.signatures);
        aVar.f43248b = Internal.copyOf("signature_usages", this.signature_usages);
        aVar.f43249c = Internal.copyOf("optional_signature_map", this.optional_signature_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetSignatureResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.signatures.isEmpty()) {
            sb.append(", signatures=");
            sb.append(this.signatures);
        }
        if (!this.signature_usages.isEmpty()) {
            sb.append(", signature_usages=");
            sb.append(this.signature_usages);
        }
        if (!this.optional_signature_map.isEmpty()) {
            sb.append(", optional_signature_map=");
            sb.append(this.optional_signature_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetSignatureResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetSignatureResponse(List<MailSignature> list, List<MailSignatureUsage> list2, Map<String, OptionalSignature> map) {
        this(list, list2, map, ByteString.EMPTY);
    }

    public MailGetSignatureResponse(List<MailSignature> list, List<MailSignatureUsage> list2, Map<String, OptionalSignature> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.signatures = Internal.immutableCopyOf("signatures", list);
        this.signature_usages = Internal.immutableCopyOf("signature_usages", list2);
        this.optional_signature_map = Internal.immutableCopyOf("optional_signature_map", map);
    }
}
