package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class AvatarMeta extends Message<AvatarMeta, C14696a> {
    public static final ProtoAdapter<AvatarMeta> ADAPTER = new C14697b();
    public static final Integer DEFAULT_BACKGROUND_COLOR = 0;
    public static final Integer DEFAULT_BORDER_COLOR = 0;
    public static final Integer DEFAULT_CENTER_COLOR = 0;
    public static final Integer DEFAULT_COLOR = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer background_color;
    public final Integer border_color;
    public final Integer center_color;
    public final Integer color;
    public final String text;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        RANDOM(1),
        WORDS(2),
        UPLOAD(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return RANDOM;
            }
            if (i == 2) {
                return WORDS;
            }
            if (i != 3) {
                return null;
            }
            return UPLOAD;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AvatarMeta$b */
    private static final class C14697b extends ProtoAdapter<AvatarMeta> {
        C14697b() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(AvatarMeta avatarMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, avatarMeta.type);
            int i5 = 0;
            if (avatarMeta.color != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, avatarMeta.color);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (avatarMeta.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, avatarMeta.text);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (avatarMeta.border_color != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, avatarMeta.border_color);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (avatarMeta.background_color != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(7, avatarMeta.background_color);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (avatarMeta.center_color != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(8, avatarMeta.center_color);
            }
            return i9 + i5 + avatarMeta.unknownFields().size();
        }

        /* renamed from: a */
        public AvatarMeta decode(ProtoReader protoReader) throws IOException {
            C14696a aVar = new C14696a();
            aVar.f38857a = Type.UNKNOWN;
            aVar.f38858b = 0;
            aVar.f38859c = "";
            aVar.f38860d = 0;
            aVar.f38861e = 0;
            aVar.f38862f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f38857a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f38858b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f38859c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f38860d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 7) {
                    aVar.f38861e = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 8) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38862f = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AvatarMeta avatarMeta) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, avatarMeta.type);
            if (avatarMeta.color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, avatarMeta.color);
            }
            if (avatarMeta.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, avatarMeta.text);
            }
            if (avatarMeta.border_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, avatarMeta.border_color);
            }
            if (avatarMeta.background_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, avatarMeta.background_color);
            }
            if (avatarMeta.center_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, avatarMeta.center_color);
            }
            protoWriter.writeBytes(avatarMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AvatarMeta$a */
    public static final class C14696a extends Message.Builder<AvatarMeta, C14696a> {

        /* renamed from: a */
        public Type f38857a;

        /* renamed from: b */
        public Integer f38858b;

        /* renamed from: c */
        public String f38859c;

        /* renamed from: d */
        public Integer f38860d;

        /* renamed from: e */
        public Integer f38861e;

        /* renamed from: f */
        public Integer f38862f;

        /* renamed from: a */
        public AvatarMeta build() {
            Type type = this.f38857a;
            if (type != null) {
                return new AvatarMeta(type, this.f38858b, this.f38859c, this.f38860d, this.f38861e, this.f38862f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C14696a mo54115a(Type type) {
            this.f38857a = type;
            return this;
        }

        /* renamed from: b */
        public C14696a mo54119b(Integer num) {
            this.f38860d = num;
            return this;
        }

        /* renamed from: c */
        public C14696a mo54120c(Integer num) {
            this.f38861e = num;
            return this;
        }

        /* renamed from: d */
        public C14696a mo54121d(Integer num) {
            this.f38862f = num;
            return this;
        }

        /* renamed from: a */
        public C14696a mo54116a(Integer num) {
            this.f38858b = num;
            return this;
        }

        /* renamed from: a */
        public C14696a mo54117a(String str) {
            this.f38859c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14696a newBuilder() {
        C14696a aVar = new C14696a();
        aVar.f38857a = this.type;
        aVar.f38858b = this.color;
        aVar.f38859c = this.text;
        aVar.f38860d = this.border_color;
        aVar.f38861e = this.background_color;
        aVar.f38862f = this.center_color;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AvatarMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.border_color != null) {
            sb.append(", border_color=");
            sb.append(this.border_color);
        }
        if (this.background_color != null) {
            sb.append(", background_color=");
            sb.append(this.background_color);
        }
        if (this.center_color != null) {
            sb.append(", center_color=");
            sb.append(this.center_color);
        }
        StringBuilder replace = sb.replace(0, 2, "AvatarMeta{");
        replace.append('}');
        return replace.toString();
    }

    public AvatarMeta(Type type2, Integer num, String str, Integer num2, Integer num3, Integer num4) {
        this(type2, num, str, num2, num3, num4, ByteString.EMPTY);
    }

    public AvatarMeta(Type type2, Integer num, String str, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.color = num;
        this.text = str;
        this.border_color = num2;
        this.background_color = num3;
        this.center_color = num4;
    }
}
