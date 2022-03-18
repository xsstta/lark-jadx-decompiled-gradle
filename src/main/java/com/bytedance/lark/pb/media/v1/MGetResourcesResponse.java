package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Trace;
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

public final class MGetResourcesResponse extends Message<MGetResourcesResponse, C18274a> {
    public static final ProtoAdapter<MGetResourcesResponse> ADAPTER = new C18275b();
    private static final long serialVersionUID = 0;
    public final List<String> miss_keys;
    public final Map<String, Resource> resources;
    public final Trace trace;

    /* renamed from: com.bytedance.lark.pb.media.v1.MGetResourcesResponse$a */
    public static final class C18274a extends Message.Builder<MGetResourcesResponse, C18274a> {

        /* renamed from: a */
        public Map<String, Resource> f45531a = Internal.newMutableMap();

        /* renamed from: b */
        public List<String> f45532b = Internal.newMutableList();

        /* renamed from: c */
        public Trace f45533c;

        /* renamed from: a */
        public MGetResourcesResponse build() {
            return new MGetResourcesResponse(this.f45531a, this.f45532b, this.f45533c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.MGetResourcesResponse$b */
    private static final class C18275b extends ProtoAdapter<MGetResourcesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Resource>> f45534a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Resource.ADAPTER);

        C18275b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetResourcesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetResourcesResponse mGetResourcesResponse) {
            int i;
            int encodedSizeWithTag = this.f45534a.encodedSizeWithTag(1, mGetResourcesResponse.resources) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mGetResourcesResponse.miss_keys);
            if (mGetResourcesResponse.trace != null) {
                i = Trace.ADAPTER.encodedSizeWithTag(3, mGetResourcesResponse.trace);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mGetResourcesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetResourcesResponse decode(ProtoReader protoReader) throws IOException {
            C18274a aVar = new C18274a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45531a.putAll(this.f45534a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45532b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45533c = Trace.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetResourcesResponse mGetResourcesResponse) throws IOException {
            this.f45534a.encodeWithTag(protoWriter, 1, mGetResourcesResponse.resources);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mGetResourcesResponse.miss_keys);
            if (mGetResourcesResponse.trace != null) {
                Trace.ADAPTER.encodeWithTag(protoWriter, 3, mGetResourcesResponse.trace);
            }
            protoWriter.writeBytes(mGetResourcesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18274a newBuilder() {
        C18274a aVar = new C18274a();
        aVar.f45531a = Internal.copyOf("resources", this.resources);
        aVar.f45532b = Internal.copyOf("miss_keys", this.miss_keys);
        aVar.f45533c = this.trace;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "MGetResourcesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        if (!this.miss_keys.isEmpty()) {
            sb.append(", miss_keys=");
            sb.append(this.miss_keys);
        }
        if (this.trace != null) {
            sb.append(", trace=");
            sb.append(this.trace);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetResourcesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetResourcesResponse(Map<String, Resource> map, List<String> list, Trace trace2) {
        this(map, list, trace2, ByteString.EMPTY);
    }

    public MGetResourcesResponse(Map<String, Resource> map, List<String> list, Trace trace2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", map);
        this.miss_keys = Internal.immutableCopyOf("miss_keys", list);
        this.trace = trace2;
    }
}
