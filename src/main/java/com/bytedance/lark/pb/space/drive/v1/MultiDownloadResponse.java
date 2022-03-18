package com.bytedance.lark.pb.space.drive.v1;

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

public final class MultiDownloadResponse extends Message<MultiDownloadResponse, C19373a> {
    public static final ProtoAdapter<MultiDownloadResponse> ADAPTER = new C19374b();
    private static final long serialVersionUID = 0;
    public final List<String> keys;
    public final Map<String, String> keys_map;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.MultiDownloadResponse$a */
    public static final class C19373a extends Message.Builder<MultiDownloadResponse, C19373a> {

        /* renamed from: a */
        public List<String> f47635a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, String> f47636b = Internal.newMutableMap();

        /* renamed from: a */
        public MultiDownloadResponse build() {
            return new MultiDownloadResponse(this.f47635a, this.f47636b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.MultiDownloadResponse$b */
    private static final class C19374b extends ProtoAdapter<MultiDownloadResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47637a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19374b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiDownloadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiDownloadResponse multiDownloadResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, multiDownloadResponse.keys) + this.f47637a.encodedSizeWithTag(2, multiDownloadResponse.keys_map) + multiDownloadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MultiDownloadResponse decode(ProtoReader protoReader) throws IOException {
            C19373a aVar = new C19373a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47635a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47636b.putAll(this.f47637a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MultiDownloadResponse multiDownloadResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, multiDownloadResponse.keys);
            this.f47637a.encodeWithTag(protoWriter, 2, multiDownloadResponse.keys_map);
            protoWriter.writeBytes(multiDownloadResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19373a newBuilder() {
        C19373a aVar = new C19373a();
        aVar.f47635a = Internal.copyOf("keys", this.keys);
        aVar.f47636b = Internal.copyOf("keys_map", this.keys_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "MultiDownloadResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        if (!this.keys_map.isEmpty()) {
            sb.append(", keys_map=");
            sb.append(this.keys_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiDownloadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MultiDownloadResponse(List<String> list, Map<String, String> map) {
        this(list, map, ByteString.EMPTY);
    }

    public MultiDownloadResponse(List<String> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
        this.keys_map = Internal.immutableCopyOf("keys_map", map);
    }
}
