package com.bytedance.lark.pb.statistics.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.TrafficData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetTrafficDataRequest extends Message<SetTrafficDataRequest, C19417a> {
    public static final ProtoAdapter<SetTrafficDataRequest> ADAPTER = new C19418b();
    private static final long serialVersionUID = 0;
    public final TrafficData traffic_data;

    /* renamed from: com.bytedance.lark.pb.statistics.v1.SetTrafficDataRequest$b */
    private static final class C19418b extends ProtoAdapter<SetTrafficDataRequest> {
        C19418b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetTrafficDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetTrafficDataRequest setTrafficDataRequest) {
            int i;
            if (setTrafficDataRequest.traffic_data != null) {
                i = TrafficData.ADAPTER.encodedSizeWithTag(1, setTrafficDataRequest.traffic_data);
            } else {
                i = 0;
            }
            return i + setTrafficDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetTrafficDataRequest decode(ProtoReader protoReader) throws IOException {
            C19417a aVar = new C19417a();
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
                    aVar.f47742a = TrafficData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetTrafficDataRequest setTrafficDataRequest) throws IOException {
            if (setTrafficDataRequest.traffic_data != null) {
                TrafficData.ADAPTER.encodeWithTag(protoWriter, 1, setTrafficDataRequest.traffic_data);
            }
            protoWriter.writeBytes(setTrafficDataRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.SetTrafficDataRequest$a */
    public static final class C19417a extends Message.Builder<SetTrafficDataRequest, C19417a> {

        /* renamed from: a */
        public TrafficData f47742a;

        /* renamed from: a */
        public SetTrafficDataRequest build() {
            return new SetTrafficDataRequest(this.f47742a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19417a mo66110a(TrafficData trafficData) {
            this.f47742a = trafficData;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19417a newBuilder() {
        C19417a aVar = new C19417a();
        aVar.f47742a = this.traffic_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("statistics", "SetTrafficDataRequest");
        StringBuilder sb = new StringBuilder();
        if (this.traffic_data != null) {
            sb.append(", traffic_data=");
            sb.append(this.traffic_data);
        }
        StringBuilder replace = sb.replace(0, 2, "SetTrafficDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetTrafficDataRequest(TrafficData trafficData) {
        this(trafficData, ByteString.EMPTY);
    }

    public SetTrafficDataRequest(TrafficData trafficData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.traffic_data = trafficData;
    }
}
