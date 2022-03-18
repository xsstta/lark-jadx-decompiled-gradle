package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class HongbaoCover extends Message<HongbaoCover, C49706a> {
    public static final ProtoAdapter<HongbaoCover> ADAPTER = new C49707b();
    public static final Long DEFAULT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final ImageSetPassThrough mcompany_logo;
    public final CoverType mcover_type;
    public final ImageSetPassThrough mhead_cover;
    public final Long mid;
    public final ImageSetPassThrough mmain_cover;
    public final ImageSetPassThrough mmessage_cover;
    public final String mname;
    public final ImageSetPassThrough mselect_cover;

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

    /* renamed from: com.ss.android.lark.pb.entities.HongbaoCover$b */
    private static final class C49707b extends ProtoAdapter<HongbaoCover> {
        C49707b() {
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
            int i7;
            int i8 = 0;
            if (hongbaoCover.mid != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, hongbaoCover.mid);
            } else {
                i = 0;
            }
            if (hongbaoCover.mname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, hongbaoCover.mname);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (hongbaoCover.mcover_type != null) {
                i3 = CoverType.ADAPTER.encodedSizeWithTag(3, hongbaoCover.mcover_type);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (hongbaoCover.mmain_cover != null) {
                i4 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(4, hongbaoCover.mmain_cover);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (hongbaoCover.mmessage_cover != null) {
                i5 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(5, hongbaoCover.mmessage_cover);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (hongbaoCover.mhead_cover != null) {
                i6 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(6, hongbaoCover.mhead_cover);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (hongbaoCover.mcompany_logo != null) {
                i7 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(7, hongbaoCover.mcompany_logo);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (hongbaoCover.mselect_cover != null) {
                i8 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(8, hongbaoCover.mselect_cover);
            }
            return i14 + i8 + hongbaoCover.unknownFields().size();
        }

        /* renamed from: a */
        public HongbaoCover decode(ProtoReader protoReader) throws IOException {
            C49706a aVar = new C49706a();
            aVar.f124444a = 0L;
            aVar.f124445b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124444a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124445b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f124446c = CoverType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f124447d = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124448e = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124449f = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124450g = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124451h = ImageSetPassThrough.ADAPTER.decode(protoReader);
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
            if (hongbaoCover.mid != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, hongbaoCover.mid);
            }
            if (hongbaoCover.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hongbaoCover.mname);
            }
            if (hongbaoCover.mcover_type != null) {
                CoverType.ADAPTER.encodeWithTag(protoWriter, 3, hongbaoCover.mcover_type);
            }
            if (hongbaoCover.mmain_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 4, hongbaoCover.mmain_cover);
            }
            if (hongbaoCover.mmessage_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 5, hongbaoCover.mmessage_cover);
            }
            if (hongbaoCover.mhead_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 6, hongbaoCover.mhead_cover);
            }
            if (hongbaoCover.mcompany_logo != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 7, hongbaoCover.mcompany_logo);
            }
            if (hongbaoCover.mselect_cover != null) {
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 8, hongbaoCover.mselect_cover);
            }
            protoWriter.writeBytes(hongbaoCover.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.HongbaoCover$a */
    public static final class C49706a extends Message.Builder<HongbaoCover, C49706a> {

        /* renamed from: a */
        public Long f124444a;

        /* renamed from: b */
        public String f124445b;

        /* renamed from: c */
        public CoverType f124446c;

        /* renamed from: d */
        public ImageSetPassThrough f124447d;

        /* renamed from: e */
        public ImageSetPassThrough f124448e;

        /* renamed from: f */
        public ImageSetPassThrough f124449f;

        /* renamed from: g */
        public ImageSetPassThrough f124450g;

        /* renamed from: h */
        public ImageSetPassThrough f124451h;

        /* renamed from: a */
        public HongbaoCover build() {
            return new HongbaoCover(this.f124444a, this.f124445b, this.f124446c, this.f124447d, this.f124448e, this.f124449f, this.f124450g, this.f124451h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49706a newBuilder() {
        C49706a aVar = new C49706a();
        aVar.f124444a = this.mid;
        aVar.f124445b = this.mname;
        aVar.f124446c = this.mcover_type;
        aVar.f124447d = this.mmain_cover;
        aVar.f124448e = this.mmessage_cover;
        aVar.f124449f = this.mhead_cover;
        aVar.f124450g = this.mcompany_logo;
        aVar.f124451h = this.mselect_cover;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mcover_type != null) {
            sb.append(", cover_type=");
            sb.append(this.mcover_type);
        }
        if (this.mmain_cover != null) {
            sb.append(", main_cover=");
            sb.append(this.mmain_cover);
        }
        if (this.mmessage_cover != null) {
            sb.append(", message_cover=");
            sb.append(this.mmessage_cover);
        }
        if (this.mhead_cover != null) {
            sb.append(", head_cover=");
            sb.append(this.mhead_cover);
        }
        if (this.mcompany_logo != null) {
            sb.append(", company_logo=");
            sb.append(this.mcompany_logo);
        }
        if (this.mselect_cover != null) {
            sb.append(", select_cover=");
            sb.append(this.mselect_cover);
        }
        StringBuilder replace = sb.replace(0, 2, "HongbaoCover{");
        replace.append('}');
        return replace.toString();
    }

    public HongbaoCover(Long l, String str, CoverType coverType, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, ImageSetPassThrough imageSetPassThrough3, ImageSetPassThrough imageSetPassThrough4, ImageSetPassThrough imageSetPassThrough5) {
        this(l, str, coverType, imageSetPassThrough, imageSetPassThrough2, imageSetPassThrough3, imageSetPassThrough4, imageSetPassThrough5, ByteString.EMPTY);
    }

    public HongbaoCover(Long l, String str, CoverType coverType, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, ImageSetPassThrough imageSetPassThrough3, ImageSetPassThrough imageSetPassThrough4, ImageSetPassThrough imageSetPassThrough5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = l;
        this.mname = str;
        this.mcover_type = coverType;
        this.mmain_cover = imageSetPassThrough;
        this.mmessage_cover = imageSetPassThrough2;
        this.mhead_cover = imageSetPassThrough3;
        this.mcompany_logo = imageSetPassThrough4;
        this.mselect_cover = imageSetPassThrough5;
    }
}
