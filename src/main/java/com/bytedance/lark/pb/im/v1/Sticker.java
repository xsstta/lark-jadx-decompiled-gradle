package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Sticker extends Message<Sticker, C18081a> {
    public static final ProtoAdapter<Sticker> ADAPTER = new C18082b();
    public static final Boolean DEFAULT_HAS_PAID = false;
    public static final Mode DEFAULT_MODE = Mode.UNKNOWN;
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final String description;
    public final Boolean has_paid;
    public final ImageSet image;
    public final Mode mode;
    public final Integer position;
    public final String small_url;
    public final String sticker_id;
    public final String sticker_set_id;

    public enum Mode implements WireEnum {
        UNKNOWN(0),
        STICKER(1),
        MEME(2);
        
        public static final ProtoAdapter<Mode> ADAPTER = ProtoAdapter.newEnumAdapter(Mode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Mode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return STICKER;
            }
            if (i != 2) {
                return null;
            }
            return MEME;
        }

        private Mode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.Sticker$b */
    private static final class C18082b extends ProtoAdapter<Sticker> {
        C18082b() {
            super(FieldEncoding.LENGTH_DELIMITED, Sticker.class);
        }

        /* renamed from: a */
        public int encodedSize(Sticker sticker) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (sticker.position != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, sticker.position);
            } else {
                i = 0;
            }
            if (sticker.image != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(2, sticker.image);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (sticker.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sticker.description);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (sticker.mode != null) {
                i4 = Mode.ADAPTER.encodedSizeWithTag(4, sticker.mode);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (sticker.has_paid != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, sticker.has_paid);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (sticker.sticker_set_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, sticker.sticker_set_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (sticker.sticker_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, sticker.sticker_id);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (sticker.small_url != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, sticker.small_url);
            }
            return i14 + i8 + sticker.unknownFields().size();
        }

        /* renamed from: a */
        public Sticker decode(ProtoReader protoReader) throws IOException {
            C18081a aVar = new C18081a();
            aVar.f45211a = 0;
            aVar.f45213c = "";
            aVar.f45214d = Mode.UNKNOWN;
            aVar.f45215e = false;
            aVar.f45216f = "";
            aVar.f45217g = "";
            aVar.f45218h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45211a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45212b = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45213c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f45214d = Mode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f45215e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45216f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45217g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45218h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Sticker sticker) throws IOException {
            if (sticker.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, sticker.position);
            }
            if (sticker.image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 2, sticker.image);
            }
            if (sticker.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sticker.description);
            }
            if (sticker.mode != null) {
                Mode.ADAPTER.encodeWithTag(protoWriter, 4, sticker.mode);
            }
            if (sticker.has_paid != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, sticker.has_paid);
            }
            if (sticker.sticker_set_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sticker.sticker_set_id);
            }
            if (sticker.sticker_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, sticker.sticker_id);
            }
            if (sticker.small_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sticker.small_url);
            }
            protoWriter.writeBytes(sticker.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.Sticker$a */
    public static final class C18081a extends Message.Builder<Sticker, C18081a> {

        /* renamed from: a */
        public Integer f45211a;

        /* renamed from: b */
        public ImageSet f45212b;

        /* renamed from: c */
        public String f45213c;

        /* renamed from: d */
        public Mode f45214d;

        /* renamed from: e */
        public Boolean f45215e;

        /* renamed from: f */
        public String f45216f;

        /* renamed from: g */
        public String f45217g;

        /* renamed from: h */
        public String f45218h;

        /* renamed from: a */
        public Sticker build() {
            return new Sticker(this.f45211a, this.f45212b, this.f45213c, this.f45214d, this.f45215e, this.f45216f, this.f45217g, this.f45218h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18081a newBuilder() {
        C18081a aVar = new C18081a();
        aVar.f45211a = this.position;
        aVar.f45212b = this.image;
        aVar.f45213c = this.description;
        aVar.f45214d = this.mode;
        aVar.f45215e = this.has_paid;
        aVar.f45216f = this.sticker_set_id;
        aVar.f45217g = this.sticker_id;
        aVar.f45218h = this.small_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "Sticker");
        StringBuilder sb = new StringBuilder();
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.has_paid != null) {
            sb.append(", has_paid=");
            sb.append(this.has_paid);
        }
        if (this.sticker_set_id != null) {
            sb.append(", sticker_set_id=");
            sb.append(this.sticker_set_id);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=");
            sb.append(this.sticker_id);
        }
        if (this.small_url != null) {
            sb.append(", small_url=");
            sb.append(this.small_url);
        }
        StringBuilder replace = sb.replace(0, 2, "Sticker{");
        replace.append('}');
        return replace.toString();
    }

    public Sticker(Integer num, ImageSet imageSet, String str, Mode mode2, Boolean bool, String str2, String str3, String str4) {
        this(num, imageSet, str, mode2, bool, str2, str3, str4, ByteString.EMPTY);
    }

    public Sticker(Integer num, ImageSet imageSet, String str, Mode mode2, Boolean bool, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.position = num;
        this.image = imageSet;
        this.description = str;
        this.mode = mode2;
        this.has_paid = bool;
        this.sticker_set_id = str2;
        this.sticker_id = str3;
        this.small_url = str4;
    }
}
