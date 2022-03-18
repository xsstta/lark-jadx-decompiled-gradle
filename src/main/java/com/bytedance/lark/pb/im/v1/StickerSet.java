package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Image;
import com.huawei.hms.android.HwBuildEx;
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

public final class StickerSet extends Message<StickerSet, C18083a> {
    public static final ProtoAdapter<StickerSet> ADAPTER = new C18084b();
    public static final Boolean DEFAULT_HAS_PAID = false;
    public static final Perm DEFAULT_PERM = Perm.UNKNOWN;
    public static final StickerSetType DEFAULT_TYPE = StickerSetType.UNKNOWN_STICKER_SET_TYPE;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Archive archive;
    public final String author_id;
    public final Image cover;
    public final String description;
    public final Boolean has_paid;
    public final Image icon;
    public final Perm perm;
    public final Image preview;
    public final String sticker_set_id;
    public final List<Sticker> stickers;
    public final String title;
    public final StickerSetType type;
    public final Long update_time;
    public final Integer version;

    public enum Perm implements WireEnum {
        UNKNOWN(0),
        ALONE(1),
        OWN(2);
        
        public static final ProtoAdapter<Perm> ADAPTER = ProtoAdapter.newEnumAdapter(Perm.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Perm fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALONE;
            }
            if (i != 2) {
                return null;
            }
            return OWN;
        }

        private Perm(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.StickerSet$b */
    private static final class C18084b extends ProtoAdapter<StickerSet> {
        C18084b() {
            super(FieldEncoding.LENGTH_DELIMITED, StickerSet.class);
        }

        /* renamed from: a */
        public int encodedSize(StickerSet stickerSet) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, stickerSet.sticker_set_id);
            int i12 = 0;
            if (stickerSet.type != null) {
                i = StickerSetType.ADAPTER.encodedSizeWithTag(2, stickerSet.type);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (stickerSet.author_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, stickerSet.author_id);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (stickerSet.cover != null) {
                i3 = Image.ADAPTER.encodedSizeWithTag(4, stickerSet.cover);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (stickerSet.preview != null) {
                i4 = Image.ADAPTER.encodedSizeWithTag(5, stickerSet.preview);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (stickerSet.icon != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(6, stickerSet.icon);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (stickerSet.version != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, stickerSet.version);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (stickerSet.update_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, stickerSet.update_time);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (stickerSet.title != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, stickerSet.title);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (stickerSet.description != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, stickerSet.description);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag2 = i20 + i9 + Sticker.ADAPTER.asRepeated().encodedSizeWithTag(11, stickerSet.stickers);
            if (stickerSet.archive != null) {
                i10 = Archive.ADAPTER.encodedSizeWithTag(12, stickerSet.archive);
            } else {
                i10 = 0;
            }
            int i21 = encodedSizeWithTag2 + i10;
            if (stickerSet.perm != null) {
                i11 = Perm.ADAPTER.encodedSizeWithTag(13, stickerSet.perm);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (stickerSet.has_paid != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, stickerSet.has_paid);
            }
            return i22 + i12 + stickerSet.unknownFields().size();
        }

        /* renamed from: a */
        public StickerSet decode(ProtoReader protoReader) throws IOException {
            C18083a aVar = new C18083a();
            aVar.f45219a = "";
            aVar.f45220b = StickerSetType.UNKNOWN_STICKER_SET_TYPE;
            aVar.f45221c = "";
            aVar.f45225g = 0;
            aVar.f45226h = 0L;
            aVar.f45227i = "";
            aVar.f45228j = "";
            aVar.f45231m = Perm.UNKNOWN;
            aVar.f45232n = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45219a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f45220b = StickerSetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f45221c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45222d = Image.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45223e = Image.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45224f = Image.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45225g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45226h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f45227i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45228j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45229k.add(Sticker.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45230l = Archive.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f45231m = Perm.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f45232n = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, StickerSet stickerSet) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, stickerSet.sticker_set_id);
            if (stickerSet.type != null) {
                StickerSetType.ADAPTER.encodeWithTag(protoWriter, 2, stickerSet.type);
            }
            if (stickerSet.author_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, stickerSet.author_id);
            }
            if (stickerSet.cover != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, stickerSet.cover);
            }
            if (stickerSet.preview != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 5, stickerSet.preview);
            }
            if (stickerSet.icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 6, stickerSet.icon);
            }
            if (stickerSet.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, stickerSet.version);
            }
            if (stickerSet.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, stickerSet.update_time);
            }
            if (stickerSet.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, stickerSet.title);
            }
            if (stickerSet.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, stickerSet.description);
            }
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, stickerSet.stickers);
            if (stickerSet.archive != null) {
                Archive.ADAPTER.encodeWithTag(protoWriter, 12, stickerSet.archive);
            }
            if (stickerSet.perm != null) {
                Perm.ADAPTER.encodeWithTag(protoWriter, 13, stickerSet.perm);
            }
            if (stickerSet.has_paid != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, stickerSet.has_paid);
            }
            protoWriter.writeBytes(stickerSet.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.StickerSet$a */
    public static final class C18083a extends Message.Builder<StickerSet, C18083a> {

        /* renamed from: a */
        public String f45219a;

        /* renamed from: b */
        public StickerSetType f45220b;

        /* renamed from: c */
        public String f45221c;

        /* renamed from: d */
        public Image f45222d;

        /* renamed from: e */
        public Image f45223e;

        /* renamed from: f */
        public Image f45224f;

        /* renamed from: g */
        public Integer f45225g;

        /* renamed from: h */
        public Long f45226h;

        /* renamed from: i */
        public String f45227i;

        /* renamed from: j */
        public String f45228j;

        /* renamed from: k */
        public List<Sticker> f45229k = Internal.newMutableList();

        /* renamed from: l */
        public Archive f45230l;

        /* renamed from: m */
        public Perm f45231m;

        /* renamed from: n */
        public Boolean f45232n;

        /* renamed from: a */
        public StickerSet build() {
            String str = this.f45219a;
            if (str != null) {
                return new StickerSet(str, this.f45220b, this.f45221c, this.f45222d, this.f45223e, this.f45224f, this.f45225g, this.f45226h, this.f45227i, this.f45228j, this.f45229k, this.f45230l, this.f45231m, this.f45232n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "sticker_set_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18083a newBuilder() {
        C18083a aVar = new C18083a();
        aVar.f45219a = this.sticker_set_id;
        aVar.f45220b = this.type;
        aVar.f45221c = this.author_id;
        aVar.f45222d = this.cover;
        aVar.f45223e = this.preview;
        aVar.f45224f = this.icon;
        aVar.f45225g = this.version;
        aVar.f45226h = this.update_time;
        aVar.f45227i = this.title;
        aVar.f45228j = this.description;
        aVar.f45229k = Internal.copyOf("stickers", this.stickers);
        aVar.f45230l = this.archive;
        aVar.f45231m = this.perm;
        aVar.f45232n = this.has_paid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "StickerSet");
        StringBuilder sb = new StringBuilder();
        sb.append(", sticker_set_id=");
        sb.append(this.sticker_set_id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.author_id != null) {
            sb.append(", author_id=");
            sb.append(this.author_id);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.preview != null) {
            sb.append(", preview=");
            sb.append(this.preview);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        if (this.archive != null) {
            sb.append(", archive=");
            sb.append(this.archive);
        }
        if (this.perm != null) {
            sb.append(", perm=");
            sb.append(this.perm);
        }
        if (this.has_paid != null) {
            sb.append(", has_paid=");
            sb.append(this.has_paid);
        }
        StringBuilder replace = sb.replace(0, 2, "StickerSet{");
        replace.append('}');
        return replace.toString();
    }

    public StickerSet(String str, StickerSetType stickerSetType, String str2, Image image, Image image2, Image image3, Integer num, Long l, String str3, String str4, List<Sticker> list, Archive archive2, Perm perm2, Boolean bool) {
        this(str, stickerSetType, str2, image, image2, image3, num, l, str3, str4, list, archive2, perm2, bool, ByteString.EMPTY);
    }

    public StickerSet(String str, StickerSetType stickerSetType, String str2, Image image, Image image2, Image image3, Integer num, Long l, String str3, String str4, List<Sticker> list, Archive archive2, Perm perm2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_set_id = str;
        this.type = stickerSetType;
        this.author_id = str2;
        this.cover = image;
        this.preview = image2;
        this.icon = image3;
        this.version = num;
        this.update_time = l;
        this.title = str3;
        this.description = str4;
        this.stickers = Internal.immutableCopyOf("stickers", list);
        this.archive = archive2;
        this.perm = perm2;
        this.has_paid = bool;
    }
}
