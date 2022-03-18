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

public final class SetTrafficDataResponse extends Message<SetTrafficDataResponse, C19419a> {
    public static final ProtoAdapter<SetTrafficDataResponse> ADAPTER = new C19420b();
    private static final long serialVersionUID = 0;
    public final TrafficData app_traffic_data;
    public final TrafficData sdk_traffic_data;

    /* renamed from: com.bytedance.lark.pb.statistics.v1.SetTrafficDataResponse$b */
    private static final class C19420b extends ProtoAdapter<SetTrafficDataResponse> {
        C19420b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetTrafficDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetTrafficDataResponse setTrafficDataResponse) {
            int i;
            int i2 = 0;
            if (setTrafficDataResponse.app_traffic_data != null) {
                i = TrafficData.ADAPTER.encodedSizeWithTag(1, setTrafficDataResponse.app_traffic_data);
            } else {
                i = 0;
            }
            if (setTrafficDataResponse.sdk_traffic_data != null) {
                i2 = TrafficData.ADAPTER.encodedSizeWithTag(2, setTrafficDataResponse.sdk_traffic_data);
            }
            return i + i2 + setTrafficDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetTrafficDataResponse decode(ProtoReader protoReader) throws IOException {
            C19419a aVar = new C19419a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47743a = TrafficData.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47744b = TrafficData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetTrafficDataResponse setTrafficDataResponse) throws IOException {
            if (setTrafficDataResponse.app_traffic_data != null) {
                TrafficData.ADAPTER.encodeWithTag(protoWriter, 1, setTrafficDataResponse.app_traffic_data);
            }
            if (setTrafficDataResponse.sdk_traffic_data != null) {
                TrafficData.ADAPTER.encodeWithTag(protoWriter, 2, setTrafficDataResponse.sdk_traffic_data);
            }
            protoWriter.writeBytes(setTrafficDataResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.SetTrafficDataResponse$a */
    public static final class C19419a extends Message.Builder<SetTrafficDataResponse, C19419a> {

        /* renamed from: a */
        public TrafficData f47743a;

        /* renamed from: b */
        public TrafficData f47744b;

        /* renamed from: a */
        public SetTrafficDataResponse build() {
            return new SetTrafficDataResponse(this.f47743a, this.f47744b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19419a newBuilder() {
        C19419a aVar = new C19419a();
        aVar.f47743a = this.app_traffic_data;
        aVar.f47744b = this.sdk_traffic_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("statistics", "SetTrafficDataResponse");
        StringBuilder sb = new StringBuilder();
        if (this.app_traffic_data != null) {
            sb.append(", app_traffic_data=");
            sb.append(this.app_traffic_data);
        }
        if (this.sdk_traffic_data != null) {
            sb.append(", sdk_traffic_data=");
            sb.append(this.sdk_traffic_data);
        }
        StringBuilder replace = sb.replace(0, 2, "SetTrafficDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetTrafficDataResponse(TrafficData trafficData, TrafficData trafficData2) {
        this(trafficData, trafficData2, ByteString.EMPTY);
    }

    public SetTrafficDataResponse(TrafficData trafficData, TrafficData trafficData2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_traffic_data = trafficData;
        this.sdk_traffic_data = trafficData2;
    }
}
