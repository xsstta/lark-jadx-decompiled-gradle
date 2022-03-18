package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetRTCDNSResponse extends Message<GetRTCDNSResponse, C50673a> {
    public static final ProtoAdapter<GetRTCDNSResponse> ADAPTER = new C50674b();
    private static final long serialVersionUID = 0;
    public final Map<String, IPList> result;

    public static final class IPList extends Message<IPList, C50671a> {
        public static final ProtoAdapter<IPList> ADAPTER = new C50672b();
        public static final Boolean DEFAULT_IS_HTTP_DNS = false;
        private static final long serialVersionUID = 0;
        public final List<String> ips;
        public final Boolean is_http_dns;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetRTCDNSResponse$IPList$b */
        private static final class C50672b extends ProtoAdapter<IPList> {
            C50672b() {
                super(FieldEncoding.LENGTH_DELIMITED, IPList.class);
            }

            /* renamed from: a */
            public int encodedSize(IPList iPList) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, iPList.ips);
                if (iPList.is_http_dns != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, iPList.is_http_dns);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + iPList.unknownFields().size();
            }

            /* renamed from: a */
            public IPList decode(ProtoReader protoReader) throws IOException {
                C50671a aVar = new C50671a();
                aVar.f126398b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126397a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126398b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, IPList iPList) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, iPList.ips);
                if (iPList.is_http_dns != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, iPList.is_http_dns);
                }
                protoWriter.writeBytes(iPList.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetRTCDNSResponse$IPList$a */
        public static final class C50671a extends Message.Builder<IPList, C50671a> {

            /* renamed from: a */
            public List<String> f126397a = Internal.newMutableList();

            /* renamed from: b */
            public Boolean f126398b;

            /* renamed from: a */
            public IPList build() {
                return new IPList(this.f126397a, this.f126398b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50671a newBuilder() {
            C50671a aVar = new C50671a();
            aVar.f126397a = Internal.copyOf("ips", this.ips);
            aVar.f126398b = this.is_http_dns;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "IPList");
            StringBuilder sb = new StringBuilder();
            if (!this.ips.isEmpty()) {
                sb.append(", ips=");
                sb.append(this.ips);
            }
            if (this.is_http_dns != null) {
                sb.append(", is_http_dns=");
                sb.append(this.is_http_dns);
            }
            StringBuilder replace = sb.replace(0, 2, "IPList{");
            replace.append('}');
            return replace.toString();
        }

        public IPList(List<String> list, Boolean bool) {
            this(list, bool, ByteString.EMPTY);
        }

        public IPList(List<String> list, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.ips = Internal.immutableCopyOf("ips", list);
            this.is_http_dns = bool;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetRTCDNSResponse$a */
    public static final class C50673a extends Message.Builder<GetRTCDNSResponse, C50673a> {

        /* renamed from: a */
        public Map<String, IPList> f126399a = Internal.newMutableMap();

        /* renamed from: a */
        public GetRTCDNSResponse build() {
            return new GetRTCDNSResponse(this.f126399a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetRTCDNSResponse$b */
    private static final class C50674b extends ProtoAdapter<GetRTCDNSResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, IPList>> f126400a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, IPList.ADAPTER);

        C50674b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRTCDNSResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRTCDNSResponse getRTCDNSResponse) {
            return this.f126400a.encodedSizeWithTag(1, getRTCDNSResponse.result) + getRTCDNSResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRTCDNSResponse decode(ProtoReader protoReader) throws IOException {
            C50673a aVar = new C50673a();
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
                    aVar.f126399a.putAll(this.f126400a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRTCDNSResponse getRTCDNSResponse) throws IOException {
            this.f126400a.encodeWithTag(protoWriter, 1, getRTCDNSResponse.result);
            protoWriter.writeBytes(getRTCDNSResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50673a newBuilder() {
        C50673a aVar = new C50673a();
        aVar.f126399a = Internal.copyOf("result", this.result);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetRTCDNSResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.result.isEmpty()) {
            sb.append(", result=");
            sb.append(this.result);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRTCDNSResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRTCDNSResponse(Map<String, IPList> map) {
        this(map, ByteString.EMPTY);
    }

    public GetRTCDNSResponse(Map<String, IPList> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = Internal.immutableCopyOf("result", map);
    }
}
