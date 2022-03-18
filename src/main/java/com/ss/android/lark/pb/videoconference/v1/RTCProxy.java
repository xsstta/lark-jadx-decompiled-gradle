package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RTCProxy extends Message<RTCProxy, C50954a> {
    public static final ProtoAdapter<RTCProxy> ADAPTER = new C50955b();
    public static final Long DEFAULT_PROXY_PORT = 0L;
    public static final ProxyType DEFAULT_PROXY_TYPE = ProxyType.NONE;
    public static final Boolean DEFAULT_STATUS = false;
    private static final long serialVersionUID = 0;
    public final String passport;
    public final String proxy_ip;
    public final Long proxy_port;
    public final ProxyType proxy_type;
    public final Boolean status;
    public final String user_name;

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

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RTCProxy$b */
    private static final class C50955b extends ProtoAdapter<RTCProxy> {
        C50955b() {
            super(FieldEncoding.LENGTH_DELIMITED, RTCProxy.class);
        }

        /* renamed from: a */
        public int encodedSize(RTCProxy rTCProxy) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, rTCProxy.status) + ProxyType.ADAPTER.encodedSizeWithTag(2, rTCProxy.proxy_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, rTCProxy.proxy_ip) + ProtoAdapter.INT64.encodedSizeWithTag(4, rTCProxy.proxy_port);
            int i2 = 0;
            if (rTCProxy.user_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, rTCProxy.user_name);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (rTCProxy.passport != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, rTCProxy.passport);
            }
            return i3 + i2 + rTCProxy.unknownFields().size();
        }

        /* renamed from: a */
        public RTCProxy decode(ProtoReader protoReader) throws IOException {
            C50954a aVar = new C50954a();
            aVar.f126974a = false;
            aVar.f126975b = ProxyType.NONE;
            aVar.f126976c = "";
            aVar.f126977d = 0L;
            aVar.f126978e = "";
            aVar.f126979f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126974a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f126975b = ProxyType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f126976c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126977d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126978e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126979f = ProtoAdapter.STRING.decode(protoReader);
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
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, rTCProxy.status);
            ProxyType.ADAPTER.encodeWithTag(protoWriter, 2, rTCProxy.proxy_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rTCProxy.proxy_ip);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, rTCProxy.proxy_port);
            if (rTCProxy.user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, rTCProxy.user_name);
            }
            if (rTCProxy.passport != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, rTCProxy.passport);
            }
            protoWriter.writeBytes(rTCProxy.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50954a newBuilder() {
        C50954a aVar = new C50954a();
        aVar.f126974a = this.status;
        aVar.f126975b = this.proxy_type;
        aVar.f126976c = this.proxy_ip;
        aVar.f126977d = this.proxy_port;
        aVar.f126978e = this.user_name;
        aVar.f126979f = this.passport;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RTCProxy$a */
    public static final class C50954a extends Message.Builder<RTCProxy, C50954a> {

        /* renamed from: a */
        public Boolean f126974a;

        /* renamed from: b */
        public ProxyType f126975b;

        /* renamed from: c */
        public String f126976c;

        /* renamed from: d */
        public Long f126977d;

        /* renamed from: e */
        public String f126978e;

        /* renamed from: f */
        public String f126979f;

        /* renamed from: a */
        public RTCProxy build() {
            ProxyType proxyType;
            String str;
            Long l;
            Boolean bool = this.f126974a;
            if (bool != null && (proxyType = this.f126975b) != null && (str = this.f126976c) != null && (l = this.f126977d) != null) {
                return new RTCProxy(bool, proxyType, str, l, this.f126978e, this.f126979f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, UpdateKey.STATUS, this.f126975b, "proxy_type", this.f126976c, "proxy_ip", this.f126977d, "proxy_port");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RTCProxy");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", proxy_type=");
        sb.append(this.proxy_type);
        sb.append(", proxy_ip=");
        sb.append(this.proxy_ip);
        sb.append(", proxy_port=");
        sb.append(this.proxy_port);
        if (this.user_name != null) {
            sb.append(", user_name=");
            sb.append(this.user_name);
        }
        if (this.passport != null) {
            sb.append(", passport=");
            sb.append(this.passport);
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
        this.status = bool;
        this.proxy_type = proxyType;
        this.proxy_ip = str;
        this.proxy_port = l;
        this.user_name = str2;
        this.passport = str3;
    }
}
