package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class HongbaoCover extends Message<HongbaoCover, C15003a> {
    public static final ProtoAdapter<HongbaoCover> ADAPTER = new C15004b();
    public static final CoverType DEFAULT_COVER_TYPE = CoverType.UNKNOWN;
    public static final Long DEFAULT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final ImageSetPassThrough company_logo;
    public final CoverType cover_type;
    public final ImageSetPassThrough head_cover;
    public final Long id;
    public final ImageSetPassThrough main_cover;
    public final ImageSetPassThrough message_cover;
    public final String name;

    public enum CoverType implements WireEnum {
        UNKNOWN(0),
        TEMPLATE(1),
        CUSTOMIZE(2);
        
        public static final ProtoAdapter<CoverType> ADAPTER = ProtoAdapter.newEnumAdapter(CoverType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CoverType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TEMPLATE;
            }
            if (i != 2) {
                return null;
            }
            return CUSTOMIZE;
        }

        private CoverType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.HongbaoCover$b */
    private static final class C15004b extends ProtoAdapter<HongbaoCover> {
        C15004b() {
            super(FieldEncoding.LENGTH_DELIMITED, HongbaoCover.class);
        }

        /* renamed from: a */
        public int encodedSize(HongbaoCover hongbaoCover) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (hongbaoCover.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, hongbaoCover.id);
            } else {
                i = 0;
            }
            if (hongbaoCover.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, hongbaoCover.name);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (hongbaoCover.cover_type != null) {
                i3 = CoverType.ADAPTER.encodedSizeWithTag(3, hongbaoCover.cover_type);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (hongbaoCover.main_cover != null) {
                i4 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(4, hongbaoCover.main_cover);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (hongbaoCover.message_cover != null) {
                i5 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(5, hongbaoCover.message_cover);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (hongbaoCover.head_cover != null) {
                i6 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(6, hongbaoCover.head_cover);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (hongbaoCover.company_logo != null) {
                i7 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(7, hongbaoCover.company_logo);
            }
            return i12 + i7 + hongbaoCover.unknownFields().size();
        }

        /* renamed from: a */
        public HongbaoCover decode(ProtoReader protoReader) throws IOException {
            C15003a aVar = new C15003a();
            aVar.f39675a = 0L;
            aVar.f39676b = "";
            aVar.f39677c = CoverType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39675a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39676b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f39677c = CoverType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f39678d = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39679e = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39680f = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39681g = ImageSetPassThrough.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, HongbaoCover hongbaoCover) throws IOException {
            if (hongbaoCover.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, hongbaoCover.id);
            }
            if (hongbaoCover.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hongbaoCover.name);
            }
            if (hongbaoCover.cover_type != null) {
                CoverType.ADAPTER.encodeWithTag(protoWriter, 3, hongbaoCover.cover_type);
            }
            if (hongbaoCover.main_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 4, hongbaoCover.main_cover);
            }
            if (hongbaoCover.message_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 5, hongbaoCover.message_cover);
            }
            if (hongbaoCover.head_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 6, hongbaoCover.head_cover);
            }
            if (hongbaoCover.company_logo != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 7, hongbaoCover.company_logo);
            }
            protoWriter.writeBytes(hongbaoCover.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.HongbaoCover$a */
    public static final class C15003a extends Message.Builder<HongbaoCover, C15003a> {

        /* renamed from: a */
        public Long f39675a;

        /* renamed from: b */
        public String f39676b;

        /* renamed from: c */
        public CoverType f39677c;

        /* renamed from: d */
        public ImageSetPassThrough f39678d;

        /* renamed from: e */
        public ImageSetPassThrough f39679e;

        /* renamed from: f */
        public ImageSetPassThrough f39680f;

        /* renamed from: g */
        public ImageSetPassThrough f39681g;

        /* renamed from: a */
        public HongbaoCover build() {
            return new HongbaoCover(this.f39675a, this.f39676b, this.f39677c, this.f39678d, this.f39679e, this.f39680f, this.f39681g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15003a newBuilder() {
        C15003a aVar = new C15003a();
        aVar.f39675a = this.id;
        aVar.f39676b = this.name;
        aVar.f39677c = this.cover_type;
        aVar.f39678d = this.main_cover;
        aVar.f39679e = this.message_cover;
        aVar.f39680f = this.head_cover;
        aVar.f39681g = this.company_logo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "HongbaoCover");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.cover_type != null) {
            sb.append(", cover_type=");
            sb.append(this.cover_type);
        }
        if (this.main_cover != null) {
            sb.append(", main_cover=");
            sb.append(this.main_cover);
        }
        if (this.message_cover != null) {
            sb.append(", message_cover=");
            sb.append(this.message_cover);
        }
        if (this.head_cover != null) {
            sb.append(", head_cover=");
            sb.append(this.head_cover);
        }
        if (this.company_logo != null) {
            sb.append(", company_logo=");
            sb.append(this.company_logo);
        }
        StringBuilder replace = sb.replace(0, 2, "HongbaoCover{");
        replace.append('}');
        return replace.toString();
    }

    public HongbaoCover(Long l, String str, CoverType coverType, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, ImageSetPassThrough imageSetPassThrough3, ImageSetPassThrough imageSetPassThrough4) {
        this(l, str, coverType, imageSetPassThrough, imageSetPassThrough2, imageSetPassThrough3, imageSetPassThrough4, ByteString.EMPTY);
    }

    public HongbaoCover(Long l, String str, CoverType coverType, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, ImageSetPassThrough imageSetPassThrough3, ImageSetPassThrough imageSetPassThrough4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.name = str;
        this.cover_type = coverType;
        this.main_cover = imageSetPassThrough;
        this.message_cover = imageSetPassThrough2;
        this.head_cover = imageSetPassThrough3;
        this.company_logo = imageSetPassThrough4;
    }
}
