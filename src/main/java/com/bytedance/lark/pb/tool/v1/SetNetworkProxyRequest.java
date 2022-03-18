package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetNetworkProxyRequest extends Message<SetNetworkProxyRequest, C19759a> {
    public static final ProtoAdapter<SetNetworkProxyRequest> ADAPTER = new C19760b();
    public static final ProxyMode DEFAULT_MODE = ProxyMode.No;
    private static final long serialVersionUID = 0;
    public final ProxyMode mode;
    public final ProxyInfo proxy_info;
    public final String proxy_url;

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetNetworkProxyRequest$b */
    private static final class C19760b extends ProtoAdapter<SetNetworkProxyRequest> {
        C19760b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetNetworkProxyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetNetworkProxyRequest setNetworkProxyRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (setNetworkProxyRequest.proxy_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setNetworkProxyRequest.proxy_url);
            } else {
                i = 0;
            }
            if (setNetworkProxyRequest.mode != null) {
                i2 = ProxyMode.ADAPTER.encodedSizeWithTag(2, setNetworkProxyRequest.mode);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (setNetworkProxyRequest.proxy_info != null) {
                i3 = ProxyInfo.ADAPTER.encodedSizeWithTag(3, setNetworkProxyRequest.proxy_info);
            }
            return i4 + i3 + setNetworkProxyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetNetworkProxyRequest decode(ProtoReader protoReader) throws IOException {
            C19759a aVar = new C19759a();
            aVar.f48225a = "";
            aVar.f48226b = ProxyMode.No;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48225a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f48226b = ProxyMode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48227c = ProxyInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetNetworkProxyRequest setNetworkProxyRequest) throws IOException {
            if (setNetworkProxyRequest.proxy_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setNetworkProxyRequest.proxy_url);
            }
            if (setNetworkProxyRequest.mode != null) {
                ProxyMode.ADAPTER.encodeWithTag(protoWriter, 2, setNetworkProxyRequest.mode);
            }
            if (setNetworkProxyRequest.proxy_info != null) {
                ProxyInfo.ADAPTER.encodeWithTag(protoWriter, 3, setNetworkProxyRequest.proxy_info);
            }
            protoWriter.writeBytes(setNetworkProxyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetNetworkProxyRequest$a */
    public static final class C19759a extends Message.Builder<SetNetworkProxyRequest, C19759a> {

        /* renamed from: a */
        public String f48225a;

        /* renamed from: b */
        public ProxyMode f48226b;

        /* renamed from: c */
        public ProxyInfo f48227c;

        /* renamed from: a */
        public SetNetworkProxyRequest build() {
            return new SetNetworkProxyRequest(this.f48225a, this.f48226b, this.f48227c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19759a mo66928a(String str) {
            this.f48225a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19759a newBuilder() {
        C19759a aVar = new C19759a();
        aVar.f48225a = this.proxy_url;
        aVar.f48226b = this.mode;
        aVar.f48227c = this.proxy_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetNetworkProxyRequest");
        StringBuilder sb = new StringBuilder();
        if (this.proxy_url != null) {
            sb.append(", proxy_url=");
            sb.append(this.proxy_url);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.proxy_info != null) {
            sb.append(", proxy_info=");
            sb.append(this.proxy_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SetNetworkProxyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetNetworkProxyRequest(String str, ProxyMode proxyMode, ProxyInfo proxyInfo) {
        this(str, proxyMode, proxyInfo, ByteString.EMPTY);
    }

    public SetNetworkProxyRequest(String str, ProxyMode proxyMode, ProxyInfo proxyInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.proxy_url = str;
        this.mode = proxyMode;
        this.proxy_info = proxyInfo;
    }
}
