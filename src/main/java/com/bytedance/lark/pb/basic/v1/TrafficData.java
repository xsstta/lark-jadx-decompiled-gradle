package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TrafficData extends Message<TrafficData, C15350a> {
    public static final ProtoAdapter<TrafficData> ADAPTER = new C15351b();
    public static final Long DEFAULT_MOBILE_RECV = 0L;
    public static final Long DEFAULT_MOBILE_SEND = 0L;
    public static final Long DEFAULT_WIFI_RECV = 0L;
    public static final Long DEFAULT_WIFI_SEND = 0L;
    private static final long serialVersionUID = 0;
    public final Long mobile_recv;
    public final Long mobile_send;
    public final Long wifi_recv;
    public final Long wifi_send;

    /* renamed from: com.bytedance.lark.pb.basic.v1.TrafficData$b */
    private static final class C15351b extends ProtoAdapter<TrafficData> {
        C15351b() {
            super(FieldEncoding.LENGTH_DELIMITED, TrafficData.class);
        }

        /* renamed from: a */
        public int encodedSize(TrafficData trafficData) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (trafficData.wifi_recv != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, trafficData.wifi_recv);
            } else {
                i = 0;
            }
            if (trafficData.wifi_send != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, trafficData.wifi_send);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (trafficData.mobile_recv != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, trafficData.mobile_recv);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (trafficData.mobile_send != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, trafficData.mobile_send);
            }
            return i6 + i4 + trafficData.unknownFields().size();
        }

        /* renamed from: a */
        public TrafficData decode(ProtoReader protoReader) throws IOException {
            C15350a aVar = new C15350a();
            aVar.f40657a = 0L;
            aVar.f40658b = 0L;
            aVar.f40659c = 0L;
            aVar.f40660d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40657a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40658b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40659c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40660d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TrafficData trafficData) throws IOException {
            if (trafficData.wifi_recv != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, trafficData.wifi_recv);
            }
            if (trafficData.wifi_send != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, trafficData.wifi_send);
            }
            if (trafficData.mobile_recv != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, trafficData.mobile_recv);
            }
            if (trafficData.mobile_send != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, trafficData.mobile_send);
            }
            protoWriter.writeBytes(trafficData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TrafficData$a */
    public static final class C15350a extends Message.Builder<TrafficData, C15350a> {

        /* renamed from: a */
        public Long f40657a;

        /* renamed from: b */
        public Long f40658b;

        /* renamed from: c */
        public Long f40659c;

        /* renamed from: d */
        public Long f40660d;

        /* renamed from: a */
        public TrafficData build() {
            return new TrafficData(this.f40657a, this.f40658b, this.f40659c, this.f40660d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15350a mo55759a(Long l) {
            this.f40657a = l;
            return this;
        }

        /* renamed from: b */
        public C15350a mo55761b(Long l) {
            this.f40658b = l;
            return this;
        }

        /* renamed from: c */
        public C15350a mo55762c(Long l) {
            this.f40659c = l;
            return this;
        }

        /* renamed from: d */
        public C15350a mo55763d(Long l) {
            this.f40660d = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15350a newBuilder() {
        C15350a aVar = new C15350a();
        aVar.f40657a = this.wifi_recv;
        aVar.f40658b = this.wifi_send;
        aVar.f40659c = this.mobile_recv;
        aVar.f40660d = this.mobile_send;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TrafficData");
        StringBuilder sb = new StringBuilder();
        if (this.wifi_recv != null) {
            sb.append(", wifi_recv=");
            sb.append(this.wifi_recv);
        }
        if (this.wifi_send != null) {
            sb.append(", wifi_send=");
            sb.append(this.wifi_send);
        }
        if (this.mobile_recv != null) {
            sb.append(", mobile_recv=");
            sb.append(this.mobile_recv);
        }
        if (this.mobile_send != null) {
            sb.append(", mobile_send=");
            sb.append(this.mobile_send);
        }
        StringBuilder replace = sb.replace(0, 2, "TrafficData{");
        replace.append('}');
        return replace.toString();
    }

    public TrafficData(Long l, Long l2, Long l3, Long l4) {
        this(l, l2, l3, l4, ByteString.EMPTY);
    }

    public TrafficData(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.wifi_recv = l;
        this.wifi_send = l2;
        this.mobile_recv = l3;
        this.mobile_send = l4;
    }
}
