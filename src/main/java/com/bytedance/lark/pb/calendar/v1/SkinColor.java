package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SkinColor extends Message<SkinColor, C16060a> {
    public static final ProtoAdapter<SkinColor> ADAPTER = new C16061b();
    public static final Integer DEFAULT_ACCEPT_BG_COLOR = 0;
    public static final Integer DEFAULT_ACCEPT_TITLE_COLOR = 0;
    public static final Integer DEFAULT_BACKGROUND_COLOR = 0;
    public static final Integer DEFAULT_DECLINE_BG_COLOR = 0;
    public static final Integer DEFAULT_DECLINE_TITLE_COLOR = 0;
    public static final Integer DEFAULT_EVENT_CARD_COLOR = 0;
    public static final Integer DEFAULT_FOREGROUND_COLOR = 0;
    public static final Integer DEFAULT_NEED_ACTION_BG_COLOR = 0;
    public static final Integer DEFAULT_NEED_ACTION_TITLE_COLOR = 0;
    public static final Integer DEFAULT_STRIPE_COLOR = 0;
    public static final Integer DEFAULT_TENTATIVE_BG_COLOR = 0;
    public static final Integer DEFAULT_TENTATIVE_MASK_COLOR = 0;
    public static final Integer DEFAULT_TENTATIVE_TITLE_COLOR = 0;
    private static final long serialVersionUID = 0;
    public final Integer accept_bg_color;
    public final Integer accept_title_color;
    public final Integer background_color;
    public final Integer decline_bg_color;
    public final Integer decline_title_color;
    public final Integer event_card_color;
    public final Integer foreground_color;
    public final Integer need_action_bg_color;
    public final Integer need_action_title_color;
    public final Integer stripe_color;
    public final Integer tentative_bg_color;
    public final Integer tentative_mask_color;
    public final Integer tentative_title_color;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SkinColor$b */
    private static final class C16061b extends ProtoAdapter<SkinColor> {
        C16061b() {
            super(FieldEncoding.LENGTH_DELIMITED, SkinColor.class);
        }

        /* renamed from: a */
        public int encodedSize(SkinColor skinColor) {
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
            int i12;
            int i13 = 0;
            if (skinColor.background_color != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, skinColor.background_color);
            } else {
                i = 0;
            }
            if (skinColor.foreground_color != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, skinColor.foreground_color);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (skinColor.event_card_color != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, skinColor.event_card_color);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (skinColor.accept_title_color != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, skinColor.accept_title_color);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (skinColor.decline_title_color != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, skinColor.decline_title_color);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (skinColor.tentative_title_color != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, skinColor.tentative_title_color);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (skinColor.need_action_title_color != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, skinColor.need_action_title_color);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (skinColor.accept_bg_color != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, skinColor.accept_bg_color);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (skinColor.decline_bg_color != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(9, skinColor.decline_bg_color);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (skinColor.tentative_bg_color != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, skinColor.tentative_bg_color);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (skinColor.need_action_bg_color != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, skinColor.need_action_bg_color);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (skinColor.stripe_color != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(12, skinColor.stripe_color);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (skinColor.tentative_mask_color != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(13, skinColor.tentative_mask_color);
            }
            return i24 + i13 + skinColor.unknownFields().size();
        }

        /* renamed from: a */
        public SkinColor decode(ProtoReader protoReader) throws IOException {
            C16060a aVar = new C16060a();
            aVar.f42137a = 0;
            aVar.f42138b = 0;
            aVar.f42139c = 0;
            aVar.f42140d = 0;
            aVar.f42141e = 0;
            aVar.f42142f = 0;
            aVar.f42143g = 0;
            aVar.f42144h = 0;
            aVar.f42145i = 0;
            aVar.f42146j = 0;
            aVar.f42147k = 0;
            aVar.f42148l = 0;
            aVar.f42149m = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42137a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42138b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42139c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42140d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42141e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42142f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42143g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42144h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42145i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f42146j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f42147k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f42148l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f42149m = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SkinColor skinColor) throws IOException {
            if (skinColor.background_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, skinColor.background_color);
            }
            if (skinColor.foreground_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, skinColor.foreground_color);
            }
            if (skinColor.event_card_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, skinColor.event_card_color);
            }
            if (skinColor.accept_title_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, skinColor.accept_title_color);
            }
            if (skinColor.decline_title_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, skinColor.decline_title_color);
            }
            if (skinColor.tentative_title_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, skinColor.tentative_title_color);
            }
            if (skinColor.need_action_title_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, skinColor.need_action_title_color);
            }
            if (skinColor.accept_bg_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, skinColor.accept_bg_color);
            }
            if (skinColor.decline_bg_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, skinColor.decline_bg_color);
            }
            if (skinColor.tentative_bg_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, skinColor.tentative_bg_color);
            }
            if (skinColor.need_action_bg_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, skinColor.need_action_bg_color);
            }
            if (skinColor.stripe_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, skinColor.stripe_color);
            }
            if (skinColor.tentative_mask_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, skinColor.tentative_mask_color);
            }
            protoWriter.writeBytes(skinColor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SkinColor$a */
    public static final class C16060a extends Message.Builder<SkinColor, C16060a> {

        /* renamed from: a */
        public Integer f42137a;

        /* renamed from: b */
        public Integer f42138b;

        /* renamed from: c */
        public Integer f42139c;

        /* renamed from: d */
        public Integer f42140d;

        /* renamed from: e */
        public Integer f42141e;

        /* renamed from: f */
        public Integer f42142f;

        /* renamed from: g */
        public Integer f42143g;

        /* renamed from: h */
        public Integer f42144h;

        /* renamed from: i */
        public Integer f42145i;

        /* renamed from: j */
        public Integer f42146j;

        /* renamed from: k */
        public Integer f42147k;

        /* renamed from: l */
        public Integer f42148l;

        /* renamed from: m */
        public Integer f42149m;

        /* renamed from: a */
        public SkinColor build() {
            return new SkinColor(this.f42137a, this.f42138b, this.f42139c, this.f42140d, this.f42141e, this.f42142f, this.f42143g, this.f42144h, this.f42145i, this.f42146j, this.f42147k, this.f42148l, this.f42149m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16060a newBuilder() {
        C16060a aVar = new C16060a();
        aVar.f42137a = this.background_color;
        aVar.f42138b = this.foreground_color;
        aVar.f42139c = this.event_card_color;
        aVar.f42140d = this.accept_title_color;
        aVar.f42141e = this.decline_title_color;
        aVar.f42142f = this.tentative_title_color;
        aVar.f42143g = this.need_action_title_color;
        aVar.f42144h = this.accept_bg_color;
        aVar.f42145i = this.decline_bg_color;
        aVar.f42146j = this.tentative_bg_color;
        aVar.f42147k = this.need_action_bg_color;
        aVar.f42148l = this.stripe_color;
        aVar.f42149m = this.tentative_mask_color;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SkinColor");
        StringBuilder sb = new StringBuilder();
        if (this.background_color != null) {
            sb.append(", background_color=");
            sb.append(this.background_color);
        }
        if (this.foreground_color != null) {
            sb.append(", foreground_color=");
            sb.append(this.foreground_color);
        }
        if (this.event_card_color != null) {
            sb.append(", event_card_color=");
            sb.append(this.event_card_color);
        }
        if (this.accept_title_color != null) {
            sb.append(", accept_title_color=");
            sb.append(this.accept_title_color);
        }
        if (this.decline_title_color != null) {
            sb.append(", decline_title_color=");
            sb.append(this.decline_title_color);
        }
        if (this.tentative_title_color != null) {
            sb.append(", tentative_title_color=");
            sb.append(this.tentative_title_color);
        }
        if (this.need_action_title_color != null) {
            sb.append(", need_action_title_color=");
            sb.append(this.need_action_title_color);
        }
        if (this.accept_bg_color != null) {
            sb.append(", accept_bg_color=");
            sb.append(this.accept_bg_color);
        }
        if (this.decline_bg_color != null) {
            sb.append(", decline_bg_color=");
            sb.append(this.decline_bg_color);
        }
        if (this.tentative_bg_color != null) {
            sb.append(", tentative_bg_color=");
            sb.append(this.tentative_bg_color);
        }
        if (this.need_action_bg_color != null) {
            sb.append(", need_action_bg_color=");
            sb.append(this.need_action_bg_color);
        }
        if (this.stripe_color != null) {
            sb.append(", stripe_color=");
            sb.append(this.stripe_color);
        }
        if (this.tentative_mask_color != null) {
            sb.append(", tentative_mask_color=");
            sb.append(this.tentative_mask_color);
        }
        StringBuilder replace = sb.replace(0, 2, "SkinColor{");
        replace.append('}');
        return replace.toString();
    }

    public SkinColor(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, ByteString.EMPTY);
    }

    public SkinColor(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, ByteString byteString) {
        super(ADAPTER, byteString);
        this.background_color = num;
        this.foreground_color = num2;
        this.event_card_color = num3;
        this.accept_title_color = num4;
        this.decline_title_color = num5;
        this.tentative_title_color = num6;
        this.need_action_title_color = num7;
        this.accept_bg_color = num8;
        this.decline_bg_color = num9;
        this.tentative_bg_color = num10;
        this.need_action_bg_color = num11;
        this.stripe_color = num12;
        this.tentative_mask_color = num13;
    }
}
