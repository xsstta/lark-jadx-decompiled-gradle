package com.ss.android.lark.pb.videochat;

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

public final class I18nKeyInfo extends Message<I18nKeyInfo, C50360a> {
    public static final ProtoAdapter<I18nKeyInfo> ADAPTER = new C50361b();
    private static final long serialVersionUID = 0;
    public final Map<String, I18nParam> mi18n_params;
    public final String mjump_scheme;
    public final String mkey;
    public final String mnew_key;
    public final Map<String, String> mparams;
    public final Type mtype;

    public static final class I18nParam extends Message<I18nParam, C50358a> {
        public static final ProtoAdapter<I18nParam> ADAPTER = new C50359b();
        private static final long serialVersionUID = 0;
        public final Type mtype;
        public final String mval;

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

        /* renamed from: com.ss.android.lark.pb.videochat.I18nKeyInfo$I18nParam$b */
        private static final class C50359b extends ProtoAdapter<I18nParam> {
            C50359b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nParam.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nParam i18nParam) {
                int i;
                int i2 = 0;
                if (i18nParam.mtype != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, i18nParam.mtype);
                } else {
                    i = 0;
                }
                if (i18nParam.mval != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, i18nParam.mval);
                }
                return i + i2 + i18nParam.unknownFields().size();
            }

            /* renamed from: a */
            public I18nParam decode(ProtoReader protoReader) throws IOException {
                C50358a aVar = new C50358a();
                aVar.f125741b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f125740a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125741b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, I18nParam i18nParam) throws IOException {
                if (i18nParam.mtype != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, i18nParam.mtype);
                }
                if (i18nParam.mval != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, i18nParam.mval);
                }
                protoWriter.writeBytes(i18nParam.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.I18nKeyInfo$I18nParam$a */
        public static final class C50358a extends Message.Builder<I18nParam, C50358a> {

            /* renamed from: a */
            public Type f125740a;

            /* renamed from: b */
            public String f125741b;

            /* renamed from: a */
            public I18nParam build() {
                return new I18nParam(this.f125740a, this.f125741b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50358a newBuilder() {
            C50358a aVar = new C50358a();
            aVar.f125740a = this.mtype;
            aVar.f125741b = this.mval;
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
            if (this.mval != null) {
                sb.append(", val=");
                sb.append(this.mval);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nParam{");
            replace.append('}');
            return replace.toString();
        }

        public I18nParam(Type type, String str) {
            this(type, str, ByteString.EMPTY);
        }

        public I18nParam(Type type, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtype = type;
            this.mval = str;
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

    /* renamed from: com.ss.android.lark.pb.videochat.I18nKeyInfo$a */
    public static final class C50360a extends Message.Builder<I18nKeyInfo, C50360a> {

        /* renamed from: a */
        public String f125742a;

        /* renamed from: b */
        public Map<String, String> f125743b = Internal.newMutableMap();

        /* renamed from: c */
        public Type f125744c;

        /* renamed from: d */
        public String f125745d;

        /* renamed from: e */
        public String f125746e;

        /* renamed from: f */
        public Map<String, I18nParam> f125747f = Internal.newMutableMap();

        /* renamed from: a */
        public I18nKeyInfo build() {
            return new I18nKeyInfo(this.f125742a, this.f125743b, this.f125744c, this.f125745d, this.f125746e, this.f125747f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.I18nKeyInfo$b */
    private static final class C50361b extends ProtoAdapter<I18nKeyInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f125748a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, I18nParam>> f125749b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, I18nParam.ADAPTER);

        C50361b() {
            super(FieldEncoding.LENGTH_DELIMITED, I18nKeyInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(I18nKeyInfo i18nKeyInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (i18nKeyInfo.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, i18nKeyInfo.mkey);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f125748a.encodedSizeWithTag(2, i18nKeyInfo.mparams);
            if (i18nKeyInfo.mtype != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(3, i18nKeyInfo.mtype);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (i18nKeyInfo.mjump_scheme != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, i18nKeyInfo.mjump_scheme);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (i18nKeyInfo.mnew_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, i18nKeyInfo.mnew_key);
            }
            return i6 + i4 + this.f125749b.encodedSizeWithTag(6, i18nKeyInfo.mi18n_params) + i18nKeyInfo.unknownFields().size();
        }

        /* renamed from: a */
        public I18nKeyInfo decode(ProtoReader protoReader) throws IOException {
            C50360a aVar = new C50360a();
            aVar.f125742a = "";
            aVar.f125745d = "";
            aVar.f125746e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125742a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125743b.putAll(this.f125748a.decode(protoReader));
                            break;
                        case 3:
                            try {
                                aVar.f125744c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f125745d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125746e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125747f.putAll(this.f125749b.decode(protoReader));
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
            if (i18nKeyInfo.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, i18nKeyInfo.mkey);
            }
            this.f125748a.encodeWithTag(protoWriter, 2, i18nKeyInfo.mparams);
            if (i18nKeyInfo.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, i18nKeyInfo.mtype);
            }
            if (i18nKeyInfo.mjump_scheme != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, i18nKeyInfo.mjump_scheme);
            }
            if (i18nKeyInfo.mnew_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, i18nKeyInfo.mnew_key);
            }
            this.f125749b.encodeWithTag(protoWriter, 6, i18nKeyInfo.mi18n_params);
            protoWriter.writeBytes(i18nKeyInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50360a newBuilder() {
        C50360a aVar = new C50360a();
        aVar.f125742a = this.mkey;
        aVar.f125743b = Internal.copyOf("mparams", this.mparams);
        aVar.f125744c = this.mtype;
        aVar.f125745d = this.mjump_scheme;
        aVar.f125746e = this.mnew_key;
        aVar.f125747f = Internal.copyOf("mi18n_params", this.mi18n_params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (!this.mparams.isEmpty()) {
            sb.append(", params=");
            sb.append(this.mparams);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mjump_scheme != null) {
            sb.append(", jump_scheme=");
            sb.append(this.mjump_scheme);
        }
        if (this.mnew_key != null) {
            sb.append(", new_key=");
            sb.append(this.mnew_key);
        }
        if (!this.mi18n_params.isEmpty()) {
            sb.append(", i18n_params=");
            sb.append(this.mi18n_params);
        }
        StringBuilder replace = sb.replace(0, 2, "I18nKeyInfo{");
        replace.append('}');
        return replace.toString();
    }

    public I18nKeyInfo(String str, Map<String, String> map, Type type, String str2, String str3, Map<String, I18nParam> map2) {
        this(str, map, type, str2, str3, map2, ByteString.EMPTY);
    }

    public I18nKeyInfo(String str, Map<String, String> map, Type type, String str2, String str3, Map<String, I18nParam> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.mparams = Internal.immutableCopyOf("mparams", map);
        this.mtype = type;
        this.mjump_scheme = str2;
        this.mnew_key = str3;
        this.mi18n_params = Internal.immutableCopyOf("mi18n_params", map2);
    }
}
