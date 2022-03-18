package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ProxyInfo extends Message<ProxyInfo, C19745a> {
    public static final ProtoAdapter<ProxyInfo> ADAPTER = new C19746b();
    private static final long serialVersionUID = 0;
    public final String host;
    public final String password;
    public final String port;
    public final String username;

    /* renamed from: com.bytedance.lark.pb.tool.v1.ProxyInfo$b */
    private static final class C19746b extends ProtoAdapter<ProxyInfo> {
        C19746b() {
            super(FieldEncoding.LENGTH_DELIMITED, ProxyInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ProxyInfo proxyInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, proxyInfo.host) + ProtoAdapter.STRING.encodedSizeWithTag(2, proxyInfo.port);
            int i2 = 0;
            if (proxyInfo.username != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, proxyInfo.username);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (proxyInfo.password != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, proxyInfo.password);
            }
            return i3 + i2 + proxyInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ProxyInfo decode(ProtoReader protoReader) throws IOException {
            C19745a aVar = new C19745a();
            aVar.f48211a = "";
            aVar.f48212b = "";
            aVar.f48213c = "";
            aVar.f48214d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48211a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48212b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48213c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48214d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ProxyInfo proxyInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, proxyInfo.host);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, proxyInfo.port);
            if (proxyInfo.username != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, proxyInfo.username);
            }
            if (proxyInfo.password != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, proxyInfo.password);
            }
            protoWriter.writeBytes(proxyInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19745a newBuilder() {
        C19745a aVar = new C19745a();
        aVar.f48211a = this.host;
        aVar.f48212b = this.port;
        aVar.f48213c = this.username;
        aVar.f48214d = this.password;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.ProxyInfo$a */
    public static final class C19745a extends Message.Builder<ProxyInfo, C19745a> {

        /* renamed from: a */
        public String f48211a;

        /* renamed from: b */
        public String f48212b;

        /* renamed from: c */
        public String f48213c;

        /* renamed from: d */
        public String f48214d;

        /* renamed from: a */
        public ProxyInfo build() {
            String str;
            String str2 = this.f48211a;
            if (str2 != null && (str = this.f48212b) != null) {
                return new ProxyInfo(str2, str, this.f48213c, this.f48214d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "host", this.f48212b, "port");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "ProxyInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", host=");
        sb.append(this.host);
        sb.append(", port=");
        sb.append(this.port);
        if (this.username != null) {
            sb.append(", username=");
            sb.append(this.username);
        }
        if (this.password != null) {
            sb.append(", password=");
            sb.append(this.password);
        }
        StringBuilder replace = sb.replace(0, 2, "ProxyInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ProxyInfo(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public ProxyInfo(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.host = str;
        this.port = str2;
        this.username = str3;
        this.password = str4;
    }
}
