package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RTCProxy extends Message<RTCProxy, C50409a> {
    public static final ProtoAdapter<RTCProxy> ADAPTER = new C50410b();
    public static final Long DEFAULT_PROXY_PORT = 0L;
    public static final Boolean DEFAULT_STATUS = false;
    private static final long serialVersionUID = 0;
    public final String mpassport;
    public final String mproxy_ip;
    public final Long mproxy_port;
    public final ProxyType mproxy_type;
    public final Boolean mstatus;
    public final String muser_name;

    public enum ProxyType implements WireEnum {
        NONE(0),
        HTTPS(1),
        SOCKS5(2),
        HTTP(3),
        UNKNOWN(4);
        
        public static final ProtoAdapter<ProxyType> ADAPTER = ProtoAdapter.newEnumAdapter(ProxyType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ProxyType fromValue(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return HTTPS;
            }
            if (i == 2) {
                return SOCKS5;
            }
            if (i == 3) {
                return HTTP;
            }
            if (i != 4) {
                return null;
            }
            return UNKNOWN;
        }

        private ProxyType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.RTCProxy$b */
    private static final class C50410b extends ProtoAdapter<RTCProxy> {
        C50410b() {
            super(FieldEncoding.LENGTH_DELIMITED, RTCProxy.class);
        }

        /* renamed from: a */
        public int encodedSize(RTCProxy rTCProxy) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, rTCProxy.mstatus) + ProxyType.ADAPTER.encodedSizeWithTag(2, rTCProxy.mproxy_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, rTCProxy.mproxy_ip) + ProtoAdapter.INT64.encodedSizeWithTag(4, rTCProxy.mproxy_port);
            int i2 = 0;
            if (rTCProxy.muser_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, rTCProxy.muser_name);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (rTCProxy.mpassport != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, rTCProxy.mpassport);
            }
            return i3 + i2 + rTCProxy.unknownFields().size();
        }

        /* renamed from: a */
        public RTCProxy decode(ProtoReader protoReader) throws IOException {
            C50409a aVar = new C50409a();
            aVar.f125880a = false;
            aVar.f125882c = "";
            aVar.f125883d = 0L;
            aVar.f125884e = "";
            aVar.f125885f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125880a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125881b = ProxyType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125882c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125883d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125884e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125885f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RTCProxy rTCProxy) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, rTCProxy.mstatus);
            ProxyType.ADAPTER.encodeWithTag(protoWriter, 2, rTCProxy.mproxy_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rTCProxy.mproxy_ip);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, rTCProxy.mproxy_port);
            if (rTCProxy.muser_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, rTCProxy.muser_name);
            }
            if (rTCProxy.mpassport != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, rTCProxy.mpassport);
            }
            protoWriter.writeBytes(rTCProxy.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50409a newBuilder() {
        C50409a aVar = new C50409a();
        aVar.f125880a = this.mstatus;
        aVar.f125881b = this.mproxy_type;
        aVar.f125882c = this.mproxy_ip;
        aVar.f125883d = this.mproxy_port;
        aVar.f125884e = this.muser_name;
        aVar.f125885f = this.mpassport;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.RTCProxy$a */
    public static final class C50409a extends Message.Builder<RTCProxy, C50409a> {

        /* renamed from: a */
        public Boolean f125880a;

        /* renamed from: b */
        public ProxyType f125881b;

        /* renamed from: c */
        public String f125882c;

        /* renamed from: d */
        public Long f125883d;

        /* renamed from: e */
        public String f125884e;

        /* renamed from: f */
        public String f125885f;

        /* renamed from: a */
        public RTCProxy build() {
            ProxyType proxyType;
            String str;
            Long l;
            Boolean bool = this.f125880a;
            if (bool != null && (proxyType = this.f125881b) != null && (str = this.f125882c) != null && (l = this.f125883d) != null) {
                return new RTCProxy(bool, proxyType, str, l, this.f125884e, this.f125885f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mstatus", this.f125881b, "mproxy_type", this.f125882c, "mproxy_ip", this.f125883d, "mproxy_port");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.mstatus);
        sb.append(", proxy_type=");
        sb.append(this.mproxy_type);
        sb.append(", proxy_ip=");
        sb.append(this.mproxy_ip);
        sb.append(", proxy_port=");
        sb.append(this.mproxy_port);
        if (this.muser_name != null) {
            sb.append(", user_name=");
            sb.append(this.muser_name);
        }
        if (this.mpassport != null) {
            sb.append(", passport=");
            sb.append(this.mpassport);
        }
        StringBuilder replace = sb.replace(0, 2, "RTCProxy{");
        replace.append('}');
        return replace.toString();
    }

    public RTCProxy(Boolean bool, ProxyType proxyType, String str, Long l, String str2, String str3) {
        this(bool, proxyType, str, l, str2, str3, ByteString.EMPTY);
    }

    public RTCProxy(Boolean bool, ProxyType proxyType, String str, Long l, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstatus = bool;
        this.mproxy_type = proxyType;
        this.mproxy_ip = str;
        this.mproxy_port = l;
        this.muser_name = str2;
        this.mpassport = str3;
    }
}
