package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetHiddenWaterMarkImageRequest extends Message<GetHiddenWaterMarkImageRequest, C18723a> {
    public static final ProtoAdapter<GetHiddenWaterMarkImageRequest> ADAPTER = new C18724b();
    public static final Integer DEFAULT_ALPHA_FLAG = 0;
    public static final Integer DEFAULT_COLOR_RGBA8 = 0;
    public static final ImgSizeOption DEFAULT_SIZE_OPTION = ImgSizeOption.ImgSizeOption_SIZE_DEFAULT;
    private static final long serialVersionUID = 0;
    public final Integer alpha_flag;
    public final Integer color_rgba8;
    public final ImgSizeOption size_option;

    public enum ImgSizeOption implements WireEnum {
        ImgSizeOption_SIZE_DEFAULT(1),
        ImgSizeOption_SIZE_192_192(2),
        ImgSizeOption_SIZE_288_288(3),
        ImgSizeOption_SIZE_384_384(4);
        
        public static final ProtoAdapter<ImgSizeOption> ADAPTER = ProtoAdapter.newEnumAdapter(ImgSizeOption.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ImgSizeOption fromValue(int i) {
            if (i == 1) {
                return ImgSizeOption_SIZE_DEFAULT;
            }
            if (i == 2) {
                return ImgSizeOption_SIZE_192_192;
            }
            if (i == 3) {
                return ImgSizeOption_SIZE_288_288;
            }
            if (i != 4) {
                return null;
            }
            return ImgSizeOption_SIZE_384_384;
        }

        private ImgSizeOption(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetHiddenWaterMarkImageRequest$b */
    private static final class C18724b extends ProtoAdapter<GetHiddenWaterMarkImageRequest> {
        C18724b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHiddenWaterMarkImageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHiddenWaterMarkImageRequest getHiddenWaterMarkImageRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getHiddenWaterMarkImageRequest.color_rgba8 != null) {
                i = ProtoAdapter.UINT32.encodedSizeWithTag(1, getHiddenWaterMarkImageRequest.color_rgba8);
            } else {
                i = 0;
            }
            if (getHiddenWaterMarkImageRequest.size_option != null) {
                i2 = ImgSizeOption.ADAPTER.encodedSizeWithTag(2, getHiddenWaterMarkImageRequest.size_option);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getHiddenWaterMarkImageRequest.alpha_flag != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, getHiddenWaterMarkImageRequest.alpha_flag);
            }
            return i4 + i3 + getHiddenWaterMarkImageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHiddenWaterMarkImageRequest decode(ProtoReader protoReader) throws IOException {
            C18723a aVar = new C18723a();
            aVar.f46270a = 0;
            aVar.f46271b = ImgSizeOption.ImgSizeOption_SIZE_DEFAULT;
            aVar.f46272c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46270a = ProtoAdapter.UINT32.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46271b = ImgSizeOption.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46272c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHiddenWaterMarkImageRequest getHiddenWaterMarkImageRequest) throws IOException {
            if (getHiddenWaterMarkImageRequest.color_rgba8 != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, getHiddenWaterMarkImageRequest.color_rgba8);
            }
            if (getHiddenWaterMarkImageRequest.size_option != null) {
                ImgSizeOption.ADAPTER.encodeWithTag(protoWriter, 2, getHiddenWaterMarkImageRequest.size_option);
            }
            if (getHiddenWaterMarkImageRequest.alpha_flag != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getHiddenWaterMarkImageRequest.alpha_flag);
            }
            protoWriter.writeBytes(getHiddenWaterMarkImageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetHiddenWaterMarkImageRequest$a */
    public static final class C18723a extends Message.Builder<GetHiddenWaterMarkImageRequest, C18723a> {

        /* renamed from: a */
        public Integer f46270a;

        /* renamed from: b */
        public ImgSizeOption f46271b;

        /* renamed from: c */
        public Integer f46272c;

        /* renamed from: a */
        public GetHiddenWaterMarkImageRequest build() {
            return new GetHiddenWaterMarkImageRequest(this.f46270a, this.f46271b, this.f46272c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18723a newBuilder() {
        C18723a aVar = new C18723a();
        aVar.f46270a = this.color_rgba8;
        aVar.f46271b = this.size_option;
        aVar.f46272c = this.alpha_flag;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "GetHiddenWaterMarkImageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.color_rgba8 != null) {
            sb.append(", color_rgba8=");
            sb.append(this.color_rgba8);
        }
        if (this.size_option != null) {
            sb.append(", size_option=");
            sb.append(this.size_option);
        }
        if (this.alpha_flag != null) {
            sb.append(", alpha_flag=");
            sb.append(this.alpha_flag);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHiddenWaterMarkImageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHiddenWaterMarkImageRequest(Integer num, ImgSizeOption imgSizeOption, Integer num2) {
        this(num, imgSizeOption, num2, ByteString.EMPTY);
    }

    public GetHiddenWaterMarkImageRequest(Integer num, ImgSizeOption imgSizeOption, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.color_rgba8 = num;
        this.size_option = imgSizeOption;
        this.alpha_flag = num2;
    }
}
