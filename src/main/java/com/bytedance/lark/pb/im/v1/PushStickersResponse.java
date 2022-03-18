package com.bytedance.lark.pb.im.v1;

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

public final class PushStickersResponse extends Message<PushStickersResponse, C17949a> {
    public static final ProtoAdapter<PushStickersResponse> ADAPTER = new C17950b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> key2url;
    public final List<String> keys;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushStickersResponse$a */
    public static final class C17949a extends Message.Builder<PushStickersResponse, C17949a> {

        /* renamed from: a */
        public List<String> f45040a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, String> f45041b = Internal.newMutableMap();

        /* renamed from: a */
        public PushStickersResponse build() {
            return new PushStickersResponse(this.f45040a, this.f45041b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushStickersResponse$b */
    private static final class C17950b extends ProtoAdapter<PushStickersResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45042a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17950b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushStickersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushStickersResponse pushStickersResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pushStickersResponse.keys) + this.f45042a.encodedSizeWithTag(2, pushStickersResponse.key2url) + pushStickersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushStickersResponse decode(ProtoReader protoReader) throws IOException {
            C17949a aVar = new C17949a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45040a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45041b.putAll(this.f45042a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushStickersResponse pushStickersResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pushStickersResponse.keys);
            this.f45042a.encodeWithTag(protoWriter, 2, pushStickersResponse.key2url);
            protoWriter.writeBytes(pushStickersResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17949a newBuilder() {
        C17949a aVar = new C17949a();
        aVar.f45040a = Internal.copyOf("keys", this.keys);
        aVar.f45041b = Internal.copyOf("key2url", this.key2url);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushStickersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        if (!this.key2url.isEmpty()) {
            sb.append(", key2url=");
            sb.append(this.key2url);
        }
        StringBuilder replace = sb.replace(0, 2, "PushStickersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushStickersResponse(List<String> list, Map<String, String> map) {
        this(list, map, ByteString.EMPTY);
    }

    public PushStickersResponse(List<String> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
        this.key2url = Internal.immutableCopyOf("key2url", map);
    }
}
