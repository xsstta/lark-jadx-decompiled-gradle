package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class I18nKeyInfo extends Message<I18nKeyInfo, C50755a> {
    public static final ProtoAdapter<I18nKeyInfo> ADAPTER = new C50756b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Map<String, I18nParam> i18n_params;
    public final String jump_scheme;
    public final String key;
    public final String new_key;
    public final Map<String, String> params;
    public final Type type;

    public static final class I18nParam extends Message<I18nParam, C50753a> {
        public static final ProtoAdapter<I18nParam> ADAPTER = new C50754b();
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Type type;
        public final String val;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            RAW_TEXT(1),
            USER_ID(2);
            
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
                    return RAW_TEXT;
                }
                if (i != 2) {
                    return null;
                }
                return USER_ID;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.I18nKeyInfo$I18nParam$b */
        private static final class C50754b extends ProtoAdapter<I18nParam> {
            C50754b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nParam.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nParam i18nParam) {
                int i;
                int i2 = 0;
                if (i18nParam.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, i18nParam.type);
                } else {
                    i = 0;
                }
                if (i18nParam.val != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, i18nParam.val);
                }
                return i + i2 + i18nParam.unknownFields().size();
            }

            /* renamed from: a */
            public I18nParam decode(ProtoReader protoReader) throws IOException {
                C50753a aVar = new C50753a();
                aVar.f126532a = Type.UNKNOWN;
                aVar.f126533b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126532a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126533b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, I18nParam i18nParam) throws IOException {
                if (i18nParam.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, i18nParam.type);
                }
                if (i18nParam.val != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, i18nParam.val);
                }
                protoWriter.writeBytes(i18nParam.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.I18nKeyInfo$I18nParam$a */
        public static final class C50753a extends Message.Builder<I18nParam, C50753a> {

            /* renamed from: a */
            public Type f126532a;

            /* renamed from: b */
            public String f126533b;

            /* renamed from: a */
            public I18nParam build() {
                return new I18nParam(this.f126532a, this.f126533b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50753a newBuilder() {
            C50753a aVar = new C50753a();
            aVar.f126532a = this.type;
            aVar.f126533b = this.val;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "I18nParam");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.val != null) {
                sb.append(", val=");
                sb.append(this.val);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nParam{");
            replace.append('}');
            return replace.toString();
        }

        public I18nParam(Type type2, String str) {
            this(type2, str, ByteString.EMPTY);
        }

        public I18nParam(Type type2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.val = str;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        NORMAL(1),
        SCHEME_JUMP(2),
        UPGRADE_JUMP(3),
        CUSTOMER_JUMP(4),
        SUBTITLE_SETTING_JUMP(5);
        
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
                return NORMAL;
            }
            if (i == 2) {
                return SCHEME_JUMP;
            }
            if (i == 3) {
                return UPGRADE_JUMP;
            }
            if (i == 4) {
                return CUSTOMER_JUMP;
            }
            if (i != 5) {
                return null;
            }
            return SUBTITLE_SETTING_JUMP;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.I18nKeyInfo$a */
    public static final class C50755a extends Message.Builder<I18nKeyInfo, C50755a> {

        /* renamed from: a */
        public String f126534a;

        /* renamed from: b */
        public Map<String, String> f126535b = Internal.newMutableMap();

        /* renamed from: c */
        public Type f126536c;

        /* renamed from: d */
        public String f126537d;

        /* renamed from: e */
        public String f126538e;

        /* renamed from: f */
        public Map<String, I18nParam> f126539f = Internal.newMutableMap();

        /* renamed from: a */
        public I18nKeyInfo build() {
            return new I18nKeyInfo(this.f126534a, this.f126535b, this.f126536c, this.f126537d, this.f126538e, this.f126539f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.I18nKeyInfo$b */
    private static final class C50756b extends ProtoAdapter<I18nKeyInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f126540a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, I18nParam>> f126541b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, I18nParam.ADAPTER);

        C50756b() {
            super(FieldEncoding.LENGTH_DELIMITED, I18nKeyInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(I18nKeyInfo i18nKeyInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (i18nKeyInfo.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, i18nKeyInfo.key);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f126540a.encodedSizeWithTag(2, i18nKeyInfo.params);
            if (i18nKeyInfo.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(3, i18nKeyInfo.type);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (i18nKeyInfo.jump_scheme != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, i18nKeyInfo.jump_scheme);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (i18nKeyInfo.new_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, i18nKeyInfo.new_key);
            }
            return i6 + i4 + this.f126541b.encodedSizeWithTag(6, i18nKeyInfo.i18n_params) + i18nKeyInfo.unknownFields().size();
        }

        /* renamed from: a */
        public I18nKeyInfo decode(ProtoReader protoReader) throws IOException {
            C50755a aVar = new C50755a();
            aVar.f126534a = "";
            aVar.f126536c = Type.UNKNOWN;
            aVar.f126537d = "";
            aVar.f126538e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126534a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126535b.putAll(this.f126540a.decode(protoReader));
                            break;
                        case 3:
                            try {
                                aVar.f126536c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f126537d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126538e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126539f.putAll(this.f126541b.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, I18nKeyInfo i18nKeyInfo) throws IOException {
            if (i18nKeyInfo.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, i18nKeyInfo.key);
            }
            this.f126540a.encodeWithTag(protoWriter, 2, i18nKeyInfo.params);
            if (i18nKeyInfo.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, i18nKeyInfo.type);
            }
            if (i18nKeyInfo.jump_scheme != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, i18nKeyInfo.jump_scheme);
            }
            if (i18nKeyInfo.new_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, i18nKeyInfo.new_key);
            }
            this.f126541b.encodeWithTag(protoWriter, 6, i18nKeyInfo.i18n_params);
            protoWriter.writeBytes(i18nKeyInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50755a newBuilder() {
        C50755a aVar = new C50755a();
        aVar.f126534a = this.key;
        aVar.f126535b = Internal.copyOf("params", this.params);
        aVar.f126536c = this.type;
        aVar.f126537d = this.jump_scheme;
        aVar.f126538e = this.new_key;
        aVar.f126539f = Internal.copyOf("i18n_params", this.i18n_params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "I18nKeyInfo");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.jump_scheme != null) {
            sb.append(", jump_scheme=");
            sb.append(this.jump_scheme);
        }
        if (this.new_key != null) {
            sb.append(", new_key=");
            sb.append(this.new_key);
        }
        if (!this.i18n_params.isEmpty()) {
            sb.append(", i18n_params=");
            sb.append(this.i18n_params);
        }
        StringBuilder replace = sb.replace(0, 2, "I18nKeyInfo{");
        replace.append('}');
        return replace.toString();
    }

    public I18nKeyInfo(String str, Map<String, String> map, Type type2, String str2, String str3, Map<String, I18nParam> map2) {
        this(str, map, type2, str2, str3, map2, ByteString.EMPTY);
    }

    public I18nKeyInfo(String str, Map<String, String> map, Type type2, String str2, String str3, Map<String, I18nParam> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.params = Internal.immutableCopyOf("params", map);
        this.type = type2;
        this.jump_scheme = str2;
        this.new_key = str3;
        this.i18n_params = Internal.immutableCopyOf("i18n_params", map2);
    }
}
