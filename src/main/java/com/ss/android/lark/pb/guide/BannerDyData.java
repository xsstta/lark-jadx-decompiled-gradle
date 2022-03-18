package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BannerDyData extends Message<BannerDyData, C49772a> {
    public static final ProtoAdapter<BannerDyData> ADAPTER = new C49773b();
    private static final long serialVersionUID = 0;
    public final BannerType mbanner_type;
    public final List<BannerNormalContent> mcarousel_content;
    public final BannerNormalContent mnormal_content;
    public final BannerNormalContent msidebar_content;
    public final BannerTemplateContent mtemplate_content;

    public enum BannerType implements WireEnum {
        UNKNOWN(0),
        NORMAL(1),
        TEMPLATE(2),
        CAROUSEL(3),
        SIDEBAR(4);
        
        public static final ProtoAdapter<BannerType> ADAPTER = ProtoAdapter.newEnumAdapter(BannerType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BannerType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return TEMPLATE;
            }
            if (i == 3) {
                return CAROUSEL;
            }
            if (i != 4) {
                return null;
            }
            return SIDEBAR;
        }

        private BannerType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerDyData$b */
    private static final class C49773b extends ProtoAdapter<BannerDyData> {
        C49773b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerDyData.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerDyData bannerDyData) {
            int i;
            int i2;
            int encodedSizeWithTag = BannerType.ADAPTER.encodedSizeWithTag(2, bannerDyData.mbanner_type);
            int i3 = 0;
            if (bannerDyData.mnormal_content != null) {
                i = BannerNormalContent.ADAPTER.encodedSizeWithTag(3, bannerDyData.mnormal_content);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (bannerDyData.mtemplate_content != null) {
                i2 = BannerTemplateContent.ADAPTER.encodedSizeWithTag(4, bannerDyData.mtemplate_content);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + BannerNormalContent.ADAPTER.asRepeated().encodedSizeWithTag(5, bannerDyData.mcarousel_content);
            if (bannerDyData.msidebar_content != null) {
                i3 = BannerNormalContent.ADAPTER.encodedSizeWithTag(6, bannerDyData.msidebar_content);
            }
            return encodedSizeWithTag2 + i3 + bannerDyData.unknownFields().size();
        }

        /* renamed from: a */
        public BannerDyData decode(ProtoReader protoReader) throws IOException {
            C49772a aVar = new C49772a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    try {
                        aVar.f124661a = BannerType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f124662b = BannerNormalContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124663c = BannerTemplateContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f124664d.add(BannerNormalContent.ADAPTER.decode(protoReader));
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124665e = BannerNormalContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerDyData bannerDyData) throws IOException {
            BannerType.ADAPTER.encodeWithTag(protoWriter, 2, bannerDyData.mbanner_type);
            if (bannerDyData.mnormal_content != null) {
                BannerNormalContent.ADAPTER.encodeWithTag(protoWriter, 3, bannerDyData.mnormal_content);
            }
            if (bannerDyData.mtemplate_content != null) {
                BannerTemplateContent.ADAPTER.encodeWithTag(protoWriter, 4, bannerDyData.mtemplate_content);
            }
            BannerNormalContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, bannerDyData.mcarousel_content);
            if (bannerDyData.msidebar_content != null) {
                BannerNormalContent.ADAPTER.encodeWithTag(protoWriter, 6, bannerDyData.msidebar_content);
            }
            protoWriter.writeBytes(bannerDyData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerDyData$a */
    public static final class C49772a extends Message.Builder<BannerDyData, C49772a> {

        /* renamed from: a */
        public BannerType f124661a;

        /* renamed from: b */
        public BannerNormalContent f124662b;

        /* renamed from: c */
        public BannerTemplateContent f124663c;

        /* renamed from: d */
        public List<BannerNormalContent> f124664d = Internal.newMutableList();

        /* renamed from: e */
        public BannerNormalContent f124665e;

        /* renamed from: a */
        public BannerDyData build() {
            BannerType bannerType = this.f124661a;
            if (bannerType != null) {
                return new BannerDyData(bannerType, this.f124662b, this.f124663c, this.f124664d, this.f124665e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bannerType, "mbanner_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C49772a newBuilder() {
        C49772a aVar = new C49772a();
        aVar.f124661a = this.mbanner_type;
        aVar.f124662b = this.mnormal_content;
        aVar.f124663c = this.mtemplate_content;
        aVar.f124664d = Internal.copyOf("mcarousel_content", this.mcarousel_content);
        aVar.f124665e = this.msidebar_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", banner_type=");
        sb.append(this.mbanner_type);
        if (this.mnormal_content != null) {
            sb.append(", normal_content=");
            sb.append(this.mnormal_content);
        }
        if (this.mtemplate_content != null) {
            sb.append(", template_content=");
            sb.append(this.mtemplate_content);
        }
        if (!this.mcarousel_content.isEmpty()) {
            sb.append(", carousel_content=");
            sb.append(this.mcarousel_content);
        }
        if (this.msidebar_content != null) {
            sb.append(", sidebar_content=");
            sb.append(this.msidebar_content);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerDyData{");
        replace.append('}');
        return replace.toString();
    }

    public BannerDyData(BannerType bannerType, BannerNormalContent bannerNormalContent, BannerTemplateContent bannerTemplateContent, List<BannerNormalContent> list, BannerNormalContent bannerNormalContent2) {
        this(bannerType, bannerNormalContent, bannerTemplateContent, list, bannerNormalContent2, ByteString.EMPTY);
    }

    public BannerDyData(BannerType bannerType, BannerNormalContent bannerNormalContent, BannerTemplateContent bannerTemplateContent, List<BannerNormalContent> list, BannerNormalContent bannerNormalContent2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbanner_type = bannerType;
        this.mnormal_content = bannerNormalContent;
        this.mtemplate_content = bannerTemplateContent;
        this.mcarousel_content = Internal.immutableCopyOf("mcarousel_content", list);
        this.msidebar_content = bannerNormalContent2;
    }
}
