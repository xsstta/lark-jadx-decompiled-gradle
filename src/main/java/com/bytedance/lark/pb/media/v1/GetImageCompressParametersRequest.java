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

public final class GetImageCompressParametersRequest extends Message<GetImageCompressParametersRequest, C18242a> {
    public static final ProtoAdapter<GetImageCompressParametersRequest> ADAPTER = new C18243b();
    public static final Long DEFAULT_IMAGE_SIZE = 0L;
    public static final Integer DEFAULT_LONG_SIDE = 0;
    public static final Integer DEFAULT_QUALITY = 0;
    public static final Integer DEFAULT_SHORT_SIDE = 0;
    private static final long serialVersionUID = 0;
    public final Long image_size;
    public final Integer long_side;
    public final Integer quality;
    public final Integer short_side;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetImageCompressParametersRequest$b */
    private static final class C18243b extends ProtoAdapter<GetImageCompressParametersRequest> {
        C18243b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetImageCompressParametersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetImageCompressParametersRequest getImageCompressParametersRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, getImageCompressParametersRequest.image_size) + ProtoAdapter.INT32.encodedSizeWithTag(2, getImageCompressParametersRequest.short_side) + ProtoAdapter.INT32.encodedSizeWithTag(3, getImageCompressParametersRequest.long_side);
            if (getImageCompressParametersRequest.quality != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, getImageCompressParametersRequest.quality);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getImageCompressParametersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetImageCompressParametersRequest decode(ProtoReader protoReader) throws IOException {
            C18242a aVar = new C18242a();
            aVar.f45490a = 0L;
            aVar.f45491b = 0;
            aVar.f45492c = 0;
            aVar.f45493d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45490a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45491b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45492c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45493d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetImageCompressParametersRequest getImageCompressParametersRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getImageCompressParametersRequest.image_size);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getImageCompressParametersRequest.short_side);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getImageCompressParametersRequest.long_side);
            if (getImageCompressParametersRequest.quality != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getImageCompressParametersRequest.quality);
            }
            protoWriter.writeBytes(getImageCompressParametersRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18242a newBuilder() {
        C18242a aVar = new C18242a();
        aVar.f45490a = this.image_size;
        aVar.f45491b = this.short_side;
        aVar.f45492c = this.long_side;
        aVar.f45493d = this.quality;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetImageCompressParametersRequest$a */
    public static final class C18242a extends Message.Builder<GetImageCompressParametersRequest, C18242a> {

        /* renamed from: a */
        public Long f45490a;

        /* renamed from: b */
        public Integer f45491b;

        /* renamed from: c */
        public Integer f45492c;

        /* renamed from: d */
        public Integer f45493d;

        /* renamed from: a */
        public GetImageCompressParametersRequest build() {
            Integer num;
            Integer num2;
            Long l = this.f45490a;
            if (l != null && (num = this.f45491b) != null && (num2 = this.f45492c) != null) {
                return new GetImageCompressParametersRequest(l, num, num2, this.f45493d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "image_size", this.f45491b, "short_side", this.f45492c, "long_side");
        }

        /* renamed from: a */
        public C18242a mo63214a(Integer num) {
            this.f45491b = num;
            return this;
        }

        /* renamed from: b */
        public C18242a mo63217b(Integer num) {
            this.f45492c = num;
            return this;
        }

        /* renamed from: c */
        public C18242a mo63218c(Integer num) {
            this.f45493d = num;
            return this;
        }

        /* renamed from: a */
        public C18242a mo63215a(Long l) {
            this.f45490a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetImageCompressParametersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", image_size=");
        sb.append(this.image_size);
        sb.append(", short_side=");
        sb.append(this.short_side);
        sb.append(", long_side=");
        sb.append(this.long_side);
        if (this.quality != null) {
            sb.append(", quality=");
            sb.append(this.quality);
        }
        StringBuilder replace = sb.replace(0, 2, "GetImageCompressParametersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetImageCompressParametersRequest(Long l, Integer num, Integer num2, Integer num3) {
        this(l, num, num2, num3, ByteString.EMPTY);
    }

    public GetImageCompressParametersRequest(Long l, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_size = l;
        this.short_side = num;
        this.long_side = num2;
        this.quality = num3;
    }
}
