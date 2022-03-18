package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class AnonymityPolicy extends Message<AnonymityPolicy, C18324a> {
    public static final ProtoAdapter<AnonymityPolicy> ADAPTER = new C18325b();
    public static final Boolean DEFAULT_DISABLE_COMMENT = false;
    public static final Boolean DEFAULT_ENABLED = false;
    public static final Scope DEFAULT_SCOPE = Scope.DISABLED;
    public static final AnonymousType DEFAULT_TYPE = AnonymousType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean disable_comment;
    public final Boolean enabled;
    public final AnonymityLimitation limitation;
    public final Scope scope;
    public final String tip;
    public final AnonymousType type;

    public enum AnonymousType implements WireEnum {
        UNKNOWN(0),
        NICKNAME(1),
        ANONYMOUS(2);
        
        public static final ProtoAdapter<AnonymousType> ADAPTER = ProtoAdapter.newEnumAdapter(AnonymousType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AnonymousType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NICKNAME;
            }
            if (i != 2) {
                return null;
            }
            return ANONYMOUS;
        }

        private AnonymousType(int i) {
            this.value = i;
        }
    }

    public enum Scope implements WireEnum {
        DISABLED(0),
        GLOBAL(1),
        CATEGORY(2);
        
        public static final ProtoAdapter<Scope> ADAPTER = ProtoAdapter.newEnumAdapter(Scope.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scope fromValue(int i) {
            if (i == 0) {
                return DISABLED;
            }
            if (i == 1) {
                return GLOBAL;
            }
            if (i != 2) {
                return null;
            }
            return CATEGORY;
        }

        private Scope(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityPolicy$b */
    private static final class C18325b extends ProtoAdapter<AnonymityPolicy> {
        C18325b() {
            super(FieldEncoding.LENGTH_DELIMITED, AnonymityPolicy.class);
        }

        /* renamed from: a */
        public int encodedSize(AnonymityPolicy anonymityPolicy) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (anonymityPolicy.enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, anonymityPolicy.enabled);
            } else {
                i = 0;
            }
            if (anonymityPolicy.disable_comment != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, anonymityPolicy.disable_comment);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (anonymityPolicy.limitation != null) {
                i3 = AnonymityLimitation.ADAPTER.encodedSizeWithTag(3, anonymityPolicy.limitation);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (anonymityPolicy.tip != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, anonymityPolicy.tip);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (anonymityPolicy.type != null) {
                i5 = AnonymousType.ADAPTER.encodedSizeWithTag(5, anonymityPolicy.type);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (anonymityPolicy.scope != null) {
                i6 = Scope.ADAPTER.encodedSizeWithTag(6, anonymityPolicy.scope);
            }
            return i10 + i6 + anonymityPolicy.unknownFields().size();
        }

        /* renamed from: a */
        public AnonymityPolicy decode(ProtoReader protoReader) throws IOException {
            C18324a aVar = new C18324a();
            aVar.f45633a = false;
            aVar.f45634b = false;
            aVar.f45636d = "";
            aVar.f45637e = AnonymousType.UNKNOWN;
            aVar.f45638f = Scope.DISABLED;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45633a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45634b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45635c = AnonymityLimitation.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45636d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f45637e = AnonymousType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f45638f = Scope.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, AnonymityPolicy anonymityPolicy) throws IOException {
            if (anonymityPolicy.enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, anonymityPolicy.enabled);
            }
            if (anonymityPolicy.disable_comment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, anonymityPolicy.disable_comment);
            }
            if (anonymityPolicy.limitation != null) {
                AnonymityLimitation.ADAPTER.encodeWithTag(protoWriter, 3, anonymityPolicy.limitation);
            }
            if (anonymityPolicy.tip != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, anonymityPolicy.tip);
            }
            if (anonymityPolicy.type != null) {
                AnonymousType.ADAPTER.encodeWithTag(protoWriter, 5, anonymityPolicy.type);
            }
            if (anonymityPolicy.scope != null) {
                Scope.ADAPTER.encodeWithTag(protoWriter, 6, anonymityPolicy.scope);
            }
            protoWriter.writeBytes(anonymityPolicy.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityPolicy$a */
    public static final class C18324a extends Message.Builder<AnonymityPolicy, C18324a> {

        /* renamed from: a */
        public Boolean f45633a;

        /* renamed from: b */
        public Boolean f45634b;

        /* renamed from: c */
        public AnonymityLimitation f45635c;

        /* renamed from: d */
        public String f45636d;

        /* renamed from: e */
        public AnonymousType f45637e;

        /* renamed from: f */
        public Scope f45638f;

        /* renamed from: a */
        public AnonymityPolicy build() {
            return new AnonymityPolicy(this.f45633a, this.f45634b, this.f45635c, this.f45636d, this.f45637e, this.f45638f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18324a newBuilder() {
        C18324a aVar = new C18324a();
        aVar.f45633a = this.enabled;
        aVar.f45634b = this.disable_comment;
        aVar.f45635c = this.limitation;
        aVar.f45636d = this.tip;
        aVar.f45637e = this.type;
        aVar.f45638f = this.scope;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "AnonymityPolicy");
        StringBuilder sb = new StringBuilder();
        if (this.enabled != null) {
            sb.append(", enabled=");
            sb.append(this.enabled);
        }
        if (this.disable_comment != null) {
            sb.append(", disable_comment=");
            sb.append(this.disable_comment);
        }
        if (this.limitation != null) {
            sb.append(", limitation=");
            sb.append(this.limitation);
        }
        if (this.tip != null) {
            sb.append(", tip=");
            sb.append(this.tip);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.scope != null) {
            sb.append(", scope=");
            sb.append(this.scope);
        }
        StringBuilder replace = sb.replace(0, 2, "AnonymityPolicy{");
        replace.append('}');
        return replace.toString();
    }

    public AnonymityPolicy(Boolean bool, Boolean bool2, AnonymityLimitation anonymityLimitation, String str, AnonymousType anonymousType, Scope scope2) {
        this(bool, bool2, anonymityLimitation, str, anonymousType, scope2, ByteString.EMPTY);
    }

    public AnonymityPolicy(Boolean bool, Boolean bool2, AnonymityLimitation anonymityLimitation, String str, AnonymousType anonymousType, Scope scope2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enabled = bool;
        this.disable_comment = bool2;
        this.limitation = anonymityLimitation;
        this.tip = str;
        this.type = anonymousType;
        this.scope = scope2;
    }
}
