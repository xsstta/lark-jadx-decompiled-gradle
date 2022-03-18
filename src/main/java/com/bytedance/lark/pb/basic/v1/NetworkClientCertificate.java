package com.bytedance.lark.pb.basic.v1;

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

public final class NetworkClientCertificate extends Message<NetworkClientCertificate, C15091a> {
    public static final ProtoAdapter<NetworkClientCertificate> ADAPTER = new C15092b();
    public static final ByteString DEFAULT_CERT = ByteString.EMPTY;
    public static final ByteString DEFAULT_PRIVKEY = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString cert;
    public final List<String> hosts;
    public final ByteString privkey;

    /* renamed from: com.bytedance.lark.pb.basic.v1.NetworkClientCertificate$b */
    private static final class C15092b extends ProtoAdapter<NetworkClientCertificate> {
        C15092b() {
            super(FieldEncoding.LENGTH_DELIMITED, NetworkClientCertificate.class);
        }

        /* renamed from: a */
        public int encodedSize(NetworkClientCertificate networkClientCertificate) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, networkClientCertificate.hosts) + ProtoAdapter.BYTES.encodedSizeWithTag(2, networkClientCertificate.cert) + ProtoAdapter.BYTES.encodedSizeWithTag(3, networkClientCertificate.privkey) + networkClientCertificate.unknownFields().size();
        }

        /* renamed from: a */
        public NetworkClientCertificate decode(ProtoReader protoReader) throws IOException {
            C15091a aVar = new C15091a();
            aVar.f39976b = ByteString.EMPTY;
            aVar.f39977c = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39975a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f39976b = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39977c = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NetworkClientCertificate networkClientCertificate) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, networkClientCertificate.hosts);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, networkClientCertificate.cert);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, networkClientCertificate.privkey);
            protoWriter.writeBytes(networkClientCertificate.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15091a newBuilder() {
        C15091a aVar = new C15091a();
        aVar.f39975a = Internal.copyOf("hosts", this.hosts);
        aVar.f39976b = this.cert;
        aVar.f39977c = this.privkey;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NetworkClientCertificate$a */
    public static final class C15091a extends Message.Builder<NetworkClientCertificate, C15091a> {

        /* renamed from: a */
        public List<String> f39975a = Internal.newMutableList();

        /* renamed from: b */
        public ByteString f39976b;

        /* renamed from: c */
        public ByteString f39977c;

        /* renamed from: a */
        public NetworkClientCertificate build() {
            ByteString byteString;
            ByteString byteString2 = this.f39976b;
            if (byteString2 != null && (byteString = this.f39977c) != null) {
                return new NetworkClientCertificate(this.f39975a, byteString2, byteString, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString2, "cert", this.f39977c, "privkey");
        }

        /* renamed from: a */
        public C15091a mo55061a(ByteString byteString) {
            this.f39976b = byteString;
            return this;
        }

        /* renamed from: b */
        public C15091a mo55063b(ByteString byteString) {
            this.f39977c = byteString;
            return this;
        }

        /* renamed from: a */
        public C15091a mo55060a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f39975a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NetworkClientCertificate");
        StringBuilder sb = new StringBuilder();
        if (!this.hosts.isEmpty()) {
            sb.append(", hosts=");
            sb.append(this.hosts);
        }
        sb.append(", cert=");
        sb.append(this.cert);
        sb.append(", privkey=");
        sb.append(this.privkey);
        StringBuilder replace = sb.replace(0, 2, "NetworkClientCertificate{");
        replace.append('}');
        return replace.toString();
    }

    public NetworkClientCertificate(List<String> list, ByteString byteString, ByteString byteString2) {
        this(list, byteString, byteString2, ByteString.EMPTY);
    }

    public NetworkClientCertificate(List<String> list, ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.hosts = Internal.immutableCopyOf("hosts", list);
        this.cert = byteString;
        this.privkey = byteString2;
    }
}
