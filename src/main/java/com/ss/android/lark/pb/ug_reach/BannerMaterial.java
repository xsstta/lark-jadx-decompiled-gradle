package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BannerMaterial extends Message<BannerMaterial, C50108a> {
    public static final ProtoAdapter<BannerMaterial> ADAPTER = new C50109b();
    private static final long serialVersionUID = 0;
    public final String mbanner_name;
    public final BannerType mbanner_type;
    public final MaterialBase mbase;
    public final CarouselBanner mcarousel_banner;
    public final CustomBannerMaterial mcustom_banner;
    public final NormalBannerMaterial mnormal_banner;
    public final NormalBannerMaterial msidebar_banner;
    public final TemplateBannerMaterial mtemplate_banner;

    public enum BannerType implements WireEnum {
        UNKNOWN(0),
        NORMAL(1),
        TEMPLATE(2),
        CAROUSEL(3),
        SIDEBAR(4),
        CUSTOM(5);
        
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
            if (i == 4) {
                return SIDEBAR;
            }
            if (i != 5) {
                return null;
            }
            return CUSTOM;
        }

        private BannerType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerMaterial$b */
    private static final class C50109b extends ProtoAdapter<BannerMaterial> {
        C50109b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerMaterial.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerMaterial bannerMaterial) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (bannerMaterial.mbanner_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerMaterial.mbanner_name);
            } else {
                i = 0;
            }
            if (bannerMaterial.mbanner_type != null) {
                i2 = BannerType.ADAPTER.encodedSizeWithTag(2, bannerMaterial.mbanner_type);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (bannerMaterial.mbase != null) {
                i3 = MaterialBase.ADAPTER.encodedSizeWithTag(7, bannerMaterial.mbase);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (bannerMaterial.mnormal_banner != null) {
                i4 = NormalBannerMaterial.ADAPTER.encodedSizeWithTag(3, bannerMaterial.mnormal_banner);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (bannerMaterial.mtemplate_banner != null) {
                i5 = TemplateBannerMaterial.ADAPTER.encodedSizeWithTag(4, bannerMaterial.mtemplate_banner);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (bannerMaterial.mcarousel_banner != null) {
                i6 = CarouselBanner.ADAPTER.encodedSizeWithTag(5, bannerMaterial.mcarousel_banner);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (bannerMaterial.msidebar_banner != null) {
                i7 = NormalBannerMaterial.ADAPTER.encodedSizeWithTag(6, bannerMaterial.msidebar_banner);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (bannerMaterial.mcustom_banner != null) {
                i8 = CustomBannerMaterial.ADAPTER.encodedSizeWithTag(8, bannerMaterial.mcustom_banner);
            }
            return i14 + i8 + bannerMaterial.unknownFields().size();
        }

        /* renamed from: a */
        public BannerMaterial decode(ProtoReader protoReader) throws IOException {
            C50108a aVar = new C50108a();
            aVar.f125240a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125240a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125241b = BannerType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.mo174038a(NormalBannerMaterial.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.mo174039a(TemplateBannerMaterial.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.mo174036a(CarouselBanner.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo174041b(NormalBannerMaterial.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f125242c = MaterialBase.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.mo174037a(CustomBannerMaterial.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerMaterial bannerMaterial) throws IOException {
            if (bannerMaterial.mbanner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerMaterial.mbanner_name);
            }
            if (bannerMaterial.mbanner_type != null) {
                BannerType.ADAPTER.encodeWithTag(protoWriter, 2, bannerMaterial.mbanner_type);
            }
            if (bannerMaterial.mbase != null) {
                MaterialBase.ADAPTER.encodeWithTag(protoWriter, 7, bannerMaterial.mbase);
            }
            if (bannerMaterial.mnormal_banner != null) {
                NormalBannerMaterial.ADAPTER.encodeWithTag(protoWriter, 3, bannerMaterial.mnormal_banner);
            }
            if (bannerMaterial.mtemplate_banner != null) {
                TemplateBannerMaterial.ADAPTER.encodeWithTag(protoWriter, 4, bannerMaterial.mtemplate_banner);
            }
            if (bannerMaterial.mcarousel_banner != null) {
                CarouselBanner.ADAPTER.encodeWithTag(protoWriter, 5, bannerMaterial.mcarousel_banner);
            }
            if (bannerMaterial.msidebar_banner != null) {
                NormalBannerMaterial.ADAPTER.encodeWithTag(protoWriter, 6, bannerMaterial.msidebar_banner);
            }
            if (bannerMaterial.mcustom_banner != null) {
                CustomBannerMaterial.ADAPTER.encodeWithTag(protoWriter, 8, bannerMaterial.mcustom_banner);
            }
            protoWriter.writeBytes(bannerMaterial.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50108a newBuilder() {
        C50108a aVar = new C50108a();
        aVar.f125240a = this.mbanner_name;
        aVar.f125241b = this.mbanner_type;
        aVar.f125242c = this.mbase;
        aVar.f125243d = this.mnormal_banner;
        aVar.f125244e = this.mtemplate_banner;
        aVar.f125245f = this.mcarousel_banner;
        aVar.f125246g = this.msidebar_banner;
        aVar.f125247h = this.mcustom_banner;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerMaterial$a */
    public static final class C50108a extends Message.Builder<BannerMaterial, C50108a> {

        /* renamed from: a */
        public String f125240a;

        /* renamed from: b */
        public BannerType f125241b;

        /* renamed from: c */
        public MaterialBase f125242c;

        /* renamed from: d */
        public NormalBannerMaterial f125243d;

        /* renamed from: e */
        public TemplateBannerMaterial f125244e;

        /* renamed from: f */
        public CarouselBanner f125245f;

        /* renamed from: g */
        public NormalBannerMaterial f125246g;

        /* renamed from: h */
        public CustomBannerMaterial f125247h;

        /* renamed from: a */
        public BannerMaterial build() {
            return new BannerMaterial(this.f125240a, this.f125241b, this.f125242c, this.f125243d, this.f125244e, this.f125245f, this.f125246g, this.f125247h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50108a mo174036a(CarouselBanner carouselBanner) {
            this.f125245f = carouselBanner;
            this.f125243d = null;
            this.f125244e = null;
            this.f125246g = null;
            this.f125247h = null;
            return this;
        }

        /* renamed from: b */
        public C50108a mo174041b(NormalBannerMaterial normalBannerMaterial) {
            this.f125246g = normalBannerMaterial;
            this.f125243d = null;
            this.f125244e = null;
            this.f125245f = null;
            this.f125247h = null;
            return this;
        }

        /* renamed from: a */
        public C50108a mo174037a(CustomBannerMaterial customBannerMaterial) {
            this.f125247h = customBannerMaterial;
            this.f125243d = null;
            this.f125244e = null;
            this.f125245f = null;
            this.f125246g = null;
            return this;
        }

        /* renamed from: a */
        public C50108a mo174038a(NormalBannerMaterial normalBannerMaterial) {
            this.f125243d = normalBannerMaterial;
            this.f125244e = null;
            this.f125245f = null;
            this.f125246g = null;
            this.f125247h = null;
            return this;
        }

        /* renamed from: a */
        public C50108a mo174039a(TemplateBannerMaterial templateBannerMaterial) {
            this.f125244e = templateBannerMaterial;
            this.f125243d = null;
            this.f125245f = null;
            this.f125246g = null;
            this.f125247h = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mbanner_name != null) {
            sb.append(", banner_name=");
            sb.append(this.mbanner_name);
        }
        if (this.mbanner_type != null) {
            sb.append(", banner_type=");
            sb.append(this.mbanner_type);
        }
        if (this.mbase != null) {
            sb.append(", base=");
            sb.append(this.mbase);
        }
        if (this.mnormal_banner != null) {
            sb.append(", normal_banner=");
            sb.append(this.mnormal_banner);
        }
        if (this.mtemplate_banner != null) {
            sb.append(", template_banner=");
            sb.append(this.mtemplate_banner);
        }
        if (this.mcarousel_banner != null) {
            sb.append(", carousel_banner=");
            sb.append(this.mcarousel_banner);
        }
        if (this.msidebar_banner != null) {
            sb.append(", sidebar_banner=");
            sb.append(this.msidebar_banner);
        }
        if (this.mcustom_banner != null) {
            sb.append(", custom_banner=");
            sb.append(this.mcustom_banner);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerMaterial{");
        replace.append('}');
        return replace.toString();
    }

    public BannerMaterial(String str, BannerType bannerType, MaterialBase materialBase, NormalBannerMaterial normalBannerMaterial, TemplateBannerMaterial templateBannerMaterial, CarouselBanner carouselBanner, NormalBannerMaterial normalBannerMaterial2, CustomBannerMaterial customBannerMaterial) {
        this(str, bannerType, materialBase, normalBannerMaterial, templateBannerMaterial, carouselBanner, normalBannerMaterial2, customBannerMaterial, ByteString.EMPTY);
    }

    public BannerMaterial(String str, BannerType bannerType, MaterialBase materialBase, NormalBannerMaterial normalBannerMaterial, TemplateBannerMaterial templateBannerMaterial, CarouselBanner carouselBanner, NormalBannerMaterial normalBannerMaterial2, CustomBannerMaterial customBannerMaterial, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(normalBannerMaterial, templateBannerMaterial, carouselBanner, normalBannerMaterial2, customBannerMaterial) <= 1) {
            this.mbanner_name = str;
            this.mbanner_type = bannerType;
            this.mbase = materialBase;
            this.mnormal_banner = normalBannerMaterial;
            this.mtemplate_banner = templateBannerMaterial;
            this.mcarousel_banner = carouselBanner;
            this.msidebar_banner = normalBannerMaterial2;
            this.mcustom_banner = customBannerMaterial;
            return;
        }
        throw new IllegalArgumentException("at most one of mnormal_banner, mtemplate_banner, mcarousel_banner, msidebar_banner, mcustom_banner may be non-null");
    }
}
