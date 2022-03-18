package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetDynamicMediaRequest extends Message<GetDynamicMediaRequest, C16236a> {
    public static final ProtoAdapter<GetDynamicMediaRequest> ADAPTER = new C16237b();
    public static final BizScenario DEFAULT_BUSINESS_SCENARIO = BizScenario.UnknownScenario;
    private static final long serialVersionUID = 0;
    public final BizScenario business_scenario;
    public final EduCardOptions edu_card_options;
    public final ImageOptions image_options;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest$b */
    private static final class C16237b extends ProtoAdapter<GetDynamicMediaRequest> {
        C16237b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDynamicMediaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDynamicMediaRequest getDynamicMediaRequest) {
            int i;
            int encodedSizeWithTag = BizScenario.ADAPTER.encodedSizeWithTag(1, getDynamicMediaRequest.business_scenario);
            int i2 = 0;
            if (getDynamicMediaRequest.image_options != null) {
                i = ImageOptions.ADAPTER.encodedSizeWithTag(2, getDynamicMediaRequest.image_options);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getDynamicMediaRequest.edu_card_options != null) {
                i2 = EduCardOptions.ADAPTER.encodedSizeWithTag(3, getDynamicMediaRequest.edu_card_options);
            }
            return i3 + i2 + getDynamicMediaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDynamicMediaRequest decode(ProtoReader protoReader) throws IOException {
            C16236a aVar = new C16236a();
            aVar.f42432a = BizScenario.UnknownScenario;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42432a = BizScenario.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42433b = ImageOptions.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo58177a(EduCardOptions.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDynamicMediaRequest getDynamicMediaRequest) throws IOException {
            BizScenario.ADAPTER.encodeWithTag(protoWriter, 1, getDynamicMediaRequest.business_scenario);
            if (getDynamicMediaRequest.image_options != null) {
                ImageOptions.ADAPTER.encodeWithTag(protoWriter, 2, getDynamicMediaRequest.image_options);
            }
            if (getDynamicMediaRequest.edu_card_options != null) {
                EduCardOptions.ADAPTER.encodeWithTag(protoWriter, 3, getDynamicMediaRequest.edu_card_options);
            }
            protoWriter.writeBytes(getDynamicMediaRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16236a newBuilder() {
        C16236a aVar = new C16236a();
        aVar.f42432a = this.business_scenario;
        aVar.f42433b = this.image_options;
        aVar.f42434c = this.edu_card_options;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest$a */
    public static final class C16236a extends Message.Builder<GetDynamicMediaRequest, C16236a> {

        /* renamed from: a */
        public BizScenario f42432a;

        /* renamed from: b */
        public ImageOptions f42433b;

        /* renamed from: c */
        public EduCardOptions f42434c;

        /* renamed from: a */
        public GetDynamicMediaRequest build() {
            BizScenario bizScenario = this.f42432a;
            if (bizScenario != null) {
                return new GetDynamicMediaRequest(bizScenario, this.f42433b, this.f42434c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bizScenario, "business_scenario");
        }

        /* renamed from: a */
        public C16236a mo58176a(BizScenario bizScenario) {
            this.f42432a = bizScenario;
            return this;
        }

        /* renamed from: a */
        public C16236a mo58177a(EduCardOptions eduCardOptions) {
            this.f42434c = eduCardOptions;
            return this;
        }

        /* renamed from: a */
        public C16236a mo58178a(ImageOptions imageOptions) {
            this.f42433b = imageOptions;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDynamicMediaRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", business_scenario=");
        sb.append(this.business_scenario);
        if (this.image_options != null) {
            sb.append(", image_options=");
            sb.append(this.image_options);
        }
        if (this.edu_card_options != null) {
            sb.append(", edu_card_options=");
            sb.append(this.edu_card_options);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDynamicMediaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDynamicMediaRequest(BizScenario bizScenario, ImageOptions imageOptions, EduCardOptions eduCardOptions) {
        this(bizScenario, imageOptions, eduCardOptions, ByteString.EMPTY);
    }

    public GetDynamicMediaRequest(BizScenario bizScenario, ImageOptions imageOptions, EduCardOptions eduCardOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.business_scenario = bizScenario;
        this.image_options = imageOptions;
        this.edu_card_options = eduCardOptions;
    }
}
