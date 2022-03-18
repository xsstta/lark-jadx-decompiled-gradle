package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.TrafficData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TakeTrafficDataResponse extends Message<TakeTrafficDataResponse, C19763a> {
    public static final ProtoAdapter<TakeTrafficDataResponse> ADAPTER = new C19764b();
    public static final Long DEFAULT_RECV_BYTES = 0L;
    public static final Long DEFAULT_SEND_BYTES = 0L;
    private static final long serialVersionUID = 0;
    public final TrafficData data;
    public final Long recv_bytes;
    public final Long send_bytes;

    /* renamed from: com.bytedance.lark.pb.tool.v1.TakeTrafficDataResponse$b */
    private static final class C19764b extends ProtoAdapter<TakeTrafficDataResponse> {
        C19764b() {
            super(FieldEncoding.LENGTH_DELIMITED, TakeTrafficDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TakeTrafficDataResponse takeTrafficDataResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (takeTrafficDataResponse.send_bytes != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, takeTrafficDataResponse.send_bytes);
            } else {
                i = 0;
            }
            if (takeTrafficDataResponse.recv_bytes != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, takeTrafficDataResponse.recv_bytes);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (takeTrafficDataResponse.data != null) {
                i3 = TrafficData.ADAPTER.encodedSizeWithTag(3, takeTrafficDataResponse.data);
            }
            return i4 + i3 + takeTrafficDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TakeTrafficDataResponse decode(ProtoReader protoReader) throws IOException {
            C19763a aVar = new C19763a();
            aVar.f48228a = 0L;
            aVar.f48229b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48228a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48229b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48230c = TrafficData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TakeTrafficDataResponse takeTrafficDataResponse) throws IOException {
            if (takeTrafficDataResponse.send_bytes != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, takeTrafficDataResponse.send_bytes);
            }
            if (takeTrafficDataResponse.recv_bytes != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, takeTrafficDataResponse.recv_bytes);
            }
            if (takeTrafficDataResponse.data != null) {
                TrafficData.ADAPTER.encodeWithTag(protoWriter, 3, takeTrafficDataResponse.data);
            }
            protoWriter.writeBytes(takeTrafficDataResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.TakeTrafficDataResponse$a */
    public static final class C19763a extends Message.Builder<TakeTrafficDataResponse, C19763a> {

        /* renamed from: a */
        public Long f48228a;

        /* renamed from: b */
        public Long f48229b;

        /* renamed from: c */
        public TrafficData f48230c;

        /* renamed from: a */
        public TakeTrafficDataResponse build() {
            return new TakeTrafficDataResponse(this.f48228a, this.f48229b, this.f48230c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19763a newBuilder() {
        C19763a aVar = new C19763a();
        aVar.f48228a = this.send_bytes;
        aVar.f48229b = this.recv_bytes;
        aVar.f48230c = this.data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "TakeTrafficDataResponse");
        StringBuilder sb = new StringBuilder();
        if (this.send_bytes != null) {
            sb.append(", send_bytes=");
            sb.append(this.send_bytes);
        }
        if (this.recv_bytes != null) {
            sb.append(", recv_bytes=");
            sb.append(this.recv_bytes);
        }
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "TakeTrafficDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TakeTrafficDataResponse(Long l, Long l2, TrafficData trafficData) {
        this(l, l2, trafficData, ByteString.EMPTY);
    }

    public TakeTrafficDataResponse(Long l, Long l2, TrafficData trafficData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_bytes = l;
        this.recv_bytes = l2;
        this.data = trafficData;
    }
}
