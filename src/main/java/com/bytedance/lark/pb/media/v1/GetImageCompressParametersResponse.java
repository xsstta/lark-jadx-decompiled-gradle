package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetImageCompressParametersResponse extends Message<GetImageCompressParametersResponse, C18244a> {
    public static final ProtoAdapter<GetImageCompressParametersResponse> ADAPTER = new C18245b();
    public static final Integer DEFAULT_QUALITY = 0;
    public static final Integer DEFAULT_SHORT_SIDE = 0;
    private static final long serialVersionUID = 0;
    public final Integer quality;
    public final Integer short_side;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetImageCompressParametersResponse$b */
    private static final class C18245b extends ProtoAdapter<GetImageCompressParametersResponse> {
        C18245b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetImageCompressParametersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetImageCompressParametersResponse getImageCompressParametersResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getImageCompressParametersResponse.short_side) + ProtoAdapter.INT32.encodedSizeWithTag(2, getImageCompressParametersResponse.quality) + getImageCompressParametersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetImageCompressParametersResponse decode(ProtoReader protoReader) throws IOException {
            C18244a aVar = new C18244a();
            aVar.f45494a = 0;
            aVar.f45495b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45494a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45495b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetImageCompressParametersResponse getImageCompressParametersResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getImageCompressParametersResponse.short_side);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getImageCompressParametersResponse.quality);
            protoWriter.writeBytes(getImageCompressParametersResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18244a newBuilder() {
        C18244a aVar = new C18244a();
        aVar.f45494a = this.short_side;
        aVar.f45495b = this.quality;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetImageCompressParametersResponse$a */
    public static final class C18244a extends Message.Builder<GetImageCompressParametersResponse, C18244a> {

        /* renamed from: a */
        public Integer f45494a;

        /* renamed from: b */
        public Integer f45495b;

        /* renamed from: a */
        public GetImageCompressParametersResponse build() {
            Integer num;
            Integer num2 = this.f45494a;
            if (num2 != null && (num = this.f45495b) != null) {
                return new GetImageCompressParametersResponse(num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "short_side", this.f45495b, "quality");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetImageCompressParametersResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", short_side=");
        sb.append(this.short_side);
        sb.append(", quality=");
        sb.append(this.quality);
        StringBuilder replace = sb.replace(0, 2, "GetImageCompressParametersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetImageCompressParametersResponse(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetImageCompressParametersResponse(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.short_side = num;
        this.quality = num2;
    }
}
