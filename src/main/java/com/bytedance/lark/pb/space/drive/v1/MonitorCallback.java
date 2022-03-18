package com.bytedance.lark.pb.space.drive.v1;

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

public final class MonitorCallback extends Message<MonitorCallback, C19369a> {
    public static final ProtoAdapter<MonitorCallback> ADAPTER = new C19370b();
    private static final long serialVersionUID = 0;
    public final String event;
    public final Map<String, String> params;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.MonitorCallback$a */
    public static final class C19369a extends Message.Builder<MonitorCallback, C19369a> {

        /* renamed from: a */
        public String f47631a;

        /* renamed from: b */
        public Map<String, String> f47632b = Internal.newMutableMap();

        /* renamed from: a */
        public MonitorCallback build() {
            String str = this.f47631a;
            if (str != null) {
                return new MonitorCallback(str, this.f47632b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "event");
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.MonitorCallback$b */
    private static final class C19370b extends ProtoAdapter<MonitorCallback> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47633a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19370b() {
            super(FieldEncoding.LENGTH_DELIMITED, MonitorCallback.class);
        }

        /* renamed from: a */
        public int encodedSize(MonitorCallback monitorCallback) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, monitorCallback.event) + this.f47633a.encodedSizeWithTag(2, monitorCallback.params) + monitorCallback.unknownFields().size();
        }

        /* renamed from: a */
        public MonitorCallback decode(ProtoReader protoReader) throws IOException {
            C19369a aVar = new C19369a();
            aVar.f47631a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47631a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47632b.putAll(this.f47633a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MonitorCallback monitorCallback) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, monitorCallback.event);
            this.f47633a.encodeWithTag(protoWriter, 2, monitorCallback.params);
            protoWriter.writeBytes(monitorCallback.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19369a newBuilder() {
        C19369a aVar = new C19369a();
        aVar.f47631a = this.event;
        aVar.f47632b = Internal.copyOf("params", this.params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "MonitorCallback");
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        StringBuilder replace = sb.replace(0, 2, "MonitorCallback{");
        replace.append('}');
        return replace.toString();
    }

    public MonitorCallback(String str, Map<String, String> map) {
        this(str, map, ByteString.EMPTY);
    }

    public MonitorCallback(String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = str;
        this.params = Internal.immutableCopyOf("params", map);
    }
}
