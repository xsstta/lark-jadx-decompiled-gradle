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

public final class HongbaoContent extends Message<HongbaoContent, C15001a> {
    public static final ProtoAdapter<HongbaoContent> ADAPTER = new C15002b();
    public static final Boolean DEFAULT_CLICKED = false;
    public static final Boolean DEFAULT_GRABBED = false;
    public static final Boolean DEFAULT_GRABBED_FINISH = false;
    public static final Boolean DEFAULT_IS_EXPIRED = false;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean clicked;
    public final HongbaoCover cover;
    public final Boolean grabbed;
    public final Boolean grabbed_finish;
    public final String id;
    public final Boolean is_expired;
    public final String subject;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        P2P(1),
        GROUP_FIX(2),
        GROUP_RANDOM(3),
        COMMERCIAL(4);
        
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
                return P2P;
            }
            if (i == 2) {
                return GROUP_FIX;
            }
            if (i == 3) {
                return GROUP_RANDOM;
            }
            if (i != 4) {
                return null;
            }
            return COMMERCIAL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.HongbaoContent$b */
    private static final class C15002b extends ProtoAdapter<HongbaoContent> {
        C15002b() {
            super(FieldEncoding.LENGTH_DELIMITED, HongbaoContent.class);
        }

        /* renamed from: a */
        public int encodedSize(HongbaoContent hongbaoContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, hongbaoContent.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, hongbaoContent.subject) + Type.ADAPTER.encodedSizeWithTag(3, hongbaoContent.type);
            int i5 = 0;
            if (hongbaoContent.clicked != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, hongbaoContent.clicked);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (hongbaoContent.is_expired != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, hongbaoContent.is_expired);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (hongbaoContent.grabbed != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, hongbaoContent.grabbed);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (hongbaoContent.grabbed_finish != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, hongbaoContent.grabbed_finish);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (hongbaoContent.cover != null) {
                i5 = HongbaoCover.ADAPTER.encodedSizeWithTag(8, hongbaoContent.cover);
            }
            return i9 + i5 + hongbaoContent.unknownFields().size();
        }

        /* renamed from: a */
        public HongbaoContent decode(ProtoReader protoReader) throws IOException {
            C15001a aVar = new C15001a();
            aVar.f39667a = "";
            aVar.f39668b = "";
            aVar.f39669c = Type.UNKNOWN;
            aVar.f39670d = false;
            aVar.f39671e = false;
            aVar.f39672f = false;
            aVar.f39673g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39667a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39668b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f39669c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f39670d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39671e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39672f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39673g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39674h = HongbaoCover.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, HongbaoContent hongbaoContent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hongbaoContent.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hongbaoContent.subject);
            Type.ADAPTER.encodeWithTag(protoWriter, 3, hongbaoContent.type);
            if (hongbaoContent.clicked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, hongbaoContent.clicked);
            }
            if (hongbaoContent.is_expired != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, hongbaoContent.is_expired);
            }
            if (hongbaoContent.grabbed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, hongbaoContent.grabbed);
            }
            if (hongbaoContent.grabbed_finish != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, hongbaoContent.grabbed_finish);
            }
            if (hongbaoContent.cover != null) {
                HongbaoCover.ADAPTER.encodeWithTag(protoWriter, 8, hongbaoContent.cover);
            }
            protoWriter.writeBytes(hongbaoContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15001a newBuilder() {
        C15001a aVar = new C15001a();
        aVar.f39667a = this.id;
        aVar.f39668b = this.subject;
        aVar.f39669c = this.type;
        aVar.f39670d = this.clicked;
        aVar.f39671e = this.is_expired;
        aVar.f39672f = this.grabbed;
        aVar.f39673g = this.grabbed_finish;
        aVar.f39674h = this.cover;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.HongbaoContent$a */
    public static final class C15001a extends Message.Builder<HongbaoContent, C15001a> {

        /* renamed from: a */
        public String f39667a;

        /* renamed from: b */
        public String f39668b;

        /* renamed from: c */
        public Type f39669c;

        /* renamed from: d */
        public Boolean f39670d;

        /* renamed from: e */
        public Boolean f39671e;

        /* renamed from: f */
        public Boolean f39672f;

        /* renamed from: g */
        public Boolean f39673g;

        /* renamed from: h */
        public HongbaoCover f39674h;

        /* renamed from: a */
        public HongbaoContent build() {
            String str;
            Type type;
            String str2 = this.f39667a;
            if (str2 != null && (str = this.f39668b) != null && (type = this.f39669c) != null) {
                return new HongbaoContent(str2, str, type, this.f39670d, this.f39671e, this.f39672f, this.f39673g, this.f39674h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f39668b, "subject", this.f39669c, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "HongbaoContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", type=");
        sb.append(this.type);
        if (this.clicked != null) {
            sb.append(", clicked=");
            sb.append(this.clicked);
        }
        if (this.is_expired != null) {
            sb.append(", is_expired=");
            sb.append(this.is_expired);
        }
        if (this.grabbed != null) {
            sb.append(", grabbed=");
            sb.append(this.grabbed);
        }
        if (this.grabbed_finish != null) {
            sb.append(", grabbed_finish=");
            sb.append(this.grabbed_finish);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        StringBuilder replace = sb.replace(0, 2, "HongbaoContent{");
        replace.append('}');
        return replace.toString();
    }

    public HongbaoContent(String str, String str2, Type type2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, HongbaoCover hongbaoCover) {
        this(str, str2, type2, bool, bool2, bool3, bool4, hongbaoCover, ByteString.EMPTY);
    }

    public HongbaoContent(String str, String str2, Type type2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, HongbaoCover hongbaoCover, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.subject = str2;
        this.type = type2;
        this.clicked = bool;
        this.is_expired = bool2;
        this.grabbed = bool3;
        this.grabbed_finish = bool4;
        this.cover = hongbaoCover;
    }
}
