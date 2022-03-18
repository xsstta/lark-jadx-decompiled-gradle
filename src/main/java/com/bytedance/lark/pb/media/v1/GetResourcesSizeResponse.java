package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetResourcesSizeResponse extends Message<GetResourcesSizeResponse, C18260a> {
    public static final ProtoAdapter<GetResourcesSizeResponse> ADAPTER = new C18261b();
    public static final Float DEFAULT_SIZE_M = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    private static final long serialVersionUID = 0;
    public final Float size_m;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourcesSizeResponse$b */
    private static final class C18261b extends ProtoAdapter<GetResourcesSizeResponse> {
        C18261b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourcesSizeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourcesSizeResponse getResourcesSizeResponse) {
            return ProtoAdapter.FLOAT.encodedSizeWithTag(1, getResourcesSizeResponse.size_m) + getResourcesSizeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourcesSizeResponse decode(ProtoReader protoReader) throws IOException {
            C18260a aVar = new C18260a();
            aVar.f45509a = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
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
                    aVar.f45509a = ProtoAdapter.FLOAT.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetResourcesSizeResponse getResourcesSizeResponse) throws IOException {
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, getResourcesSizeResponse.size_m);
            protoWriter.writeBytes(getResourcesSizeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourcesSizeResponse$a */
    public static final class C18260a extends Message.Builder<GetResourcesSizeResponse, C18260a> {

        /* renamed from: a */
        public Float f45509a;

        /* renamed from: a */
        public GetResourcesSizeResponse build() {
            Float f = this.f45509a;
            if (f != null) {
                return new GetResourcesSizeResponse(f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(f, "size_m");
        }
    }

    @Override // com.squareup.wire.Message
    public C18260a newBuilder() {
        C18260a aVar = new C18260a();
        aVar.f45509a = this.size_m;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetResourcesSizeResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", size_m=");
        sb.append(this.size_m);
        StringBuilder replace = sb.replace(0, 2, "GetResourcesSizeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourcesSizeResponse(Float f) {
        this(f, ByteString.EMPTY);
    }

    public GetResourcesSizeResponse(Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        this.size_m = f;
    }
}
