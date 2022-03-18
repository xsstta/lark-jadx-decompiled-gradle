package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SendMetricsRequest extends Message<SendMetricsRequest, C15259a> {
    public static final ProtoAdapter<SendMetricsRequest> ADAPTER = new C15260b();
    private static final long serialVersionUID = 0;
    public final Map<String, Double> key2double;
    public final Map<String, Float> key2value;
    public final Map<String, String> key2value_str;
    public final Map<String, String> tag2value;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendMetricsRequest$a */
    public static final class C15259a extends Message.Builder<SendMetricsRequest, C15259a> {

        /* renamed from: a */
        public Map<String, String> f40454a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Float> f40455b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, String> f40456c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, Double> f40457d = Internal.newMutableMap();

        /* renamed from: a */
        public SendMetricsRequest build() {
            return new SendMetricsRequest(this.f40454a, this.f40455b, this.f40456c, this.f40457d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15259a mo55547a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f40454a = map;
            return this;
        }

        /* renamed from: b */
        public C15259a mo55549b(Map<String, Float> map) {
            Internal.checkElementsNotNull(map);
            this.f40455b = map;
            return this;
        }

        /* renamed from: c */
        public C15259a mo55550c(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f40456c = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendMetricsRequest$b */
    private static final class C15260b extends ProtoAdapter<SendMetricsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40458a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Float>> f40459b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.FLOAT);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, String>> f40460c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, Double>> f40461d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.DOUBLE);

        C15260b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMetricsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendMetricsRequest sendMetricsRequest) {
            return this.f40458a.encodedSizeWithTag(1, sendMetricsRequest.key2value_str) + this.f40459b.encodedSizeWithTag(2, sendMetricsRequest.key2value) + this.f40460c.encodedSizeWithTag(3, sendMetricsRequest.tag2value) + this.f40461d.encodedSizeWithTag(4, sendMetricsRequest.key2double) + sendMetricsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendMetricsRequest decode(ProtoReader protoReader) throws IOException {
            C15259a aVar = new C15259a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40454a.putAll(this.f40458a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f40455b.putAll(this.f40459b.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f40456c.putAll(this.f40460c.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40457d.putAll(this.f40461d.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendMetricsRequest sendMetricsRequest) throws IOException {
            this.f40458a.encodeWithTag(protoWriter, 1, sendMetricsRequest.key2value_str);
            this.f40459b.encodeWithTag(protoWriter, 2, sendMetricsRequest.key2value);
            this.f40460c.encodeWithTag(protoWriter, 3, sendMetricsRequest.tag2value);
            this.f40461d.encodeWithTag(protoWriter, 4, sendMetricsRequest.key2double);
            protoWriter.writeBytes(sendMetricsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15259a newBuilder() {
        C15259a aVar = new C15259a();
        aVar.f40454a = Internal.copyOf("key2value_str", this.key2value_str);
        aVar.f40455b = Internal.copyOf("key2value", this.key2value);
        aVar.f40456c = Internal.copyOf("tag2value", this.tag2value);
        aVar.f40457d = Internal.copyOf("key2double", this.key2double);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SendMetricsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.key2value_str.isEmpty()) {
            sb.append(", key2value_str=");
            sb.append(this.key2value_str);
        }
        if (!this.key2value.isEmpty()) {
            sb.append(", key2value=");
            sb.append(this.key2value);
        }
        if (!this.tag2value.isEmpty()) {
            sb.append(", tag2value=");
            sb.append(this.tag2value);
        }
        if (!this.key2double.isEmpty()) {
            sb.append(", key2double=");
            sb.append(this.key2double);
        }
        StringBuilder replace = sb.replace(0, 2, "SendMetricsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendMetricsRequest(Map<String, String> map, Map<String, Float> map2, Map<String, String> map3, Map<String, Double> map4) {
        this(map, map2, map3, map4, ByteString.EMPTY);
    }

    public SendMetricsRequest(Map<String, String> map, Map<String, Float> map2, Map<String, String> map3, Map<String, Double> map4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key2value_str = Internal.immutableCopyOf("key2value_str", map);
        this.key2value = Internal.immutableCopyOf("key2value", map2);
        this.tag2value = Internal.immutableCopyOf("tag2value", map3);
        this.key2double = Internal.immutableCopyOf("key2double", map4);
    }
}
