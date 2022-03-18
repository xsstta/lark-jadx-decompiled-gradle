package com.bytedance.lark.pb.url.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetUrlPreviewResponse extends Message<MGetUrlPreviewResponse, C19817a> {
    public static final ProtoAdapter<MGetUrlPreviewResponse> ADAPTER = new C19818b();
    private static final long serialVersionUID = 0;
    public final List<GetUrlPreviewResponse> resps;

    /* renamed from: com.bytedance.lark.pb.url.v1.MGetUrlPreviewResponse$b */
    private static final class C19818b extends ProtoAdapter<MGetUrlPreviewResponse> {
        C19818b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetUrlPreviewResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetUrlPreviewResponse mGetUrlPreviewResponse) {
            return GetUrlPreviewResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetUrlPreviewResponse.resps) + mGetUrlPreviewResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetUrlPreviewResponse decode(ProtoReader protoReader) throws IOException {
            C19817a aVar = new C19817a();
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
                    aVar.f48304a.add(GetUrlPreviewResponse.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetUrlPreviewResponse mGetUrlPreviewResponse) throws IOException {
            GetUrlPreviewResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetUrlPreviewResponse.resps);
            protoWriter.writeBytes(mGetUrlPreviewResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.MGetUrlPreviewResponse$a */
    public static final class C19817a extends Message.Builder<MGetUrlPreviewResponse, C19817a> {

        /* renamed from: a */
        public List<GetUrlPreviewResponse> f48304a = Internal.newMutableList();

        /* renamed from: a */
        public MGetUrlPreviewResponse build() {
            return new MGetUrlPreviewResponse(this.f48304a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19817a newBuilder() {
        C19817a aVar = new C19817a();
        aVar.f48304a = Internal.copyOf("resps", this.resps);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "MGetUrlPreviewResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resps.isEmpty()) {
            sb.append(", resps=");
            sb.append(this.resps);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetUrlPreviewResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetUrlPreviewResponse(List<GetUrlPreviewResponse> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetUrlPreviewResponse(List<GetUrlPreviewResponse> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resps = Internal.immutableCopyOf("resps", list);
    }
}
