package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class AvatarMeta extends Message<AvatarMeta, C49642a> {
    public static final ProtoAdapter<AvatarMeta> ADAPTER = new C49643b();
    public static final Integer DEFAULT_BACKGROUND_COLOR = 0;
    public static final Integer DEFAULT_BORDER_COLOR = 0;
    public static final Integer DEFAULT_CENTER_COLOR = 0;
    public static final Integer DEFAULT_COLOR = 0;
    private static final long serialVersionUID = 0;
    public final Integer mbackground_color;
    public final Integer mborder_color;
    public final Integer mcenter_color;
    public final Integer mcolor;
    public final String mtext;
    public final Type mtype;

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

    /* renamed from: com.ss.android.lark.pb.entities.AvatarMeta$b */
    private static final class C49643b extends ProtoAdapter<AvatarMeta> {
        C49643b() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(AvatarMeta avatarMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (avatarMeta.mtype != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, avatarMeta.mtype);
            } else {
                i = 0;
            }
            if (avatarMeta.mcolor != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, avatarMeta.mcolor);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (avatarMeta.mtext != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, avatarMeta.mtext);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (avatarMeta.mborder_color != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, avatarMeta.mborder_color);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (avatarMeta.mbackground_color != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, avatarMeta.mbackground_color);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (avatarMeta.mcenter_color != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(8, avatarMeta.mcenter_color);
            }
            return i10 + i6 + avatarMeta.unknownFields().size();
        }

        /* renamed from: a */
        public AvatarMeta decode(ProtoReader protoReader) throws IOException {
            C49642a aVar = new C49642a();
            aVar.f124309b = 0;
            aVar.f124310c = "";
            aVar.f124311d = 0;
            aVar.f124312e = 0;
            aVar.f124313f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124308a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124309b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124310c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f124311d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 7) {
                    aVar.f124312e = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 8) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124313f = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AvatarMeta avatarMeta) throws IOException {
            if (avatarMeta.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, avatarMeta.mtype);
            }
            if (avatarMeta.mcolor != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, avatarMeta.mcolor);
            }
            if (avatarMeta.mtext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, avatarMeta.mtext);
            }
            if (avatarMeta.mborder_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, avatarMeta.mborder_color);
            }
            if (avatarMeta.mbackground_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, avatarMeta.mbackground_color);
            }
            if (avatarMeta.mcenter_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, avatarMeta.mcenter_color);
            }
            protoWriter.writeBytes(avatarMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.AvatarMeta$a */
    public static final class C49642a extends Message.Builder<AvatarMeta, C49642a> {

        /* renamed from: a */
        public Type f124308a;

        /* renamed from: b */
        public Integer f124309b;

        /* renamed from: c */
        public String f124310c;

        /* renamed from: d */
        public Integer f124311d;

        /* renamed from: e */
        public Integer f124312e;

        /* renamed from: f */
        public Integer f124313f;

        /* renamed from: a */
        public AvatarMeta build() {
            return new AvatarMeta(this.f124308a, this.f124309b, this.f124310c, this.f124311d, this.f124312e, this.f124313f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49642a newBuilder() {
        C49642a aVar = new C49642a();
        aVar.f124308a = this.mtype;
        aVar.f124309b = this.mcolor;
        aVar.f124310c = this.mtext;
        aVar.f124311d = this.mborder_color;
        aVar.f124312e = this.mbackground_color;
        aVar.f124313f = this.mcenter_color;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mcolor != null) {
            sb.append(", color=");
            sb.append(this.mcolor);
        }
        if (this.mtext != null) {
            sb.append(", text=");
            sb.append(this.mtext);
        }
        if (this.mborder_color != null) {
            sb.append(", border_color=");
            sb.append(this.mborder_color);
        }
        if (this.mbackground_color != null) {
            sb.append(", background_color=");
            sb.append(this.mbackground_color);
        }
        if (this.mcenter_color != null) {
            sb.append(", center_color=");
            sb.append(this.mcenter_color);
        }
        StringBuilder replace = sb.replace(0, 2, "AvatarMeta{");
        replace.append('}');
        return replace.toString();
    }

    public AvatarMeta(Type type, Integer num, String str, Integer num2, Integer num3, Integer num4) {
        this(type, num, str, num2, num3, num4, ByteString.EMPTY);
    }

    public AvatarMeta(Type type, Integer num, String str, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.mcolor = num;
        this.mtext = str;
        this.mborder_color = num2;
        this.mbackground_color = num3;
        this.mcenter_color = num4;
    }
}
