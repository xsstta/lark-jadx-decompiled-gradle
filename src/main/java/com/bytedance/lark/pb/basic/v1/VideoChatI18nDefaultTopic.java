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
import java.util.List;
import okio.ByteString;

public final class VideoChatI18nDefaultTopic extends Message<VideoChatI18nDefaultTopic, C15444a> {
    public static final ProtoAdapter<VideoChatI18nDefaultTopic> ADAPTER = new C15445b();
    private static final long serialVersionUID = 0;
    public final String i18n_key;
    public final List<Param> params;

    public static final class Param extends Message<Param, C15442a> {
        public static final ProtoAdapter<Param> ADAPTER = new C15443b();
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final String default_content;
        public final String fixed_content;
        public final Type type;
        public final String user_id;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            FIXED_CONTENT(1),
            GROUP(2),
            LARK_USER(3),
            ROOM(4);
            
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
                    return FIXED_CONTENT;
                }
                if (i == 2) {
                    return GROUP;
                }
                if (i == 3) {
                    return LARK_USER;
                }
                if (i != 4) {
                    return null;
                }
                return ROOM;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic$Param$b */
        private static final class C15443b extends ProtoAdapter<Param> {
            C15443b() {
                super(FieldEncoding.LENGTH_DELIMITED, Param.class);
            }

            /* renamed from: a */
            public int encodedSize(Param param) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, param.type);
                int i4 = 0;
                if (param.default_content != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, param.default_content);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (param.fixed_content != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, param.fixed_content);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (param.chat_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, param.chat_id);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (param.user_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, param.user_id);
                }
                return i7 + i4 + param.unknownFields().size();
            }

            /* renamed from: a */
            public Param decode(ProtoReader protoReader) throws IOException {
                C15442a aVar = new C15442a();
                aVar.f40893a = Type.UNKNOWN;
                aVar.f40894b = "";
                aVar.mo55983a("");
                aVar.mo55985b("");
                aVar.mo55986c("");
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40893a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f40894b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.mo55983a(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 4) {
                        aVar.mo55985b(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo55986c(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Param param) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, param.type);
                if (param.default_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, param.default_content);
                }
                if (param.fixed_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, param.fixed_content);
                }
                if (param.chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, param.chat_id);
                }
                if (param.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, param.user_id);
                }
                protoWriter.writeBytes(param.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic$Param$a */
        public static final class C15442a extends Message.Builder<Param, C15442a> {

            /* renamed from: a */
            public Type f40893a;

            /* renamed from: b */
            public String f40894b;

            /* renamed from: c */
            public String f40895c;

            /* renamed from: d */
            public String f40896d;

            /* renamed from: e */
            public String f40897e;

            /* renamed from: a */
            public Param build() {
                Type type = this.f40893a;
                if (type != null) {
                    return new Param(type, this.f40894b, this.f40895c, this.f40896d, this.f40897e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
            }

            /* renamed from: a */
            public C15442a mo55983a(String str) {
                this.f40895c = str;
                this.f40896d = null;
                this.f40897e = null;
                return this;
            }

            /* renamed from: b */
            public C15442a mo55985b(String str) {
                this.f40896d = str;
                this.f40895c = null;
                this.f40897e = null;
                return this;
            }

            /* renamed from: c */
            public C15442a mo55986c(String str) {
                this.f40897e = str;
                this.f40895c = null;
                this.f40896d = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15442a newBuilder() {
            C15442a aVar = new C15442a();
            aVar.f40893a = this.type;
            aVar.f40894b = this.default_content;
            aVar.f40895c = this.fixed_content;
            aVar.f40896d = this.chat_id;
            aVar.f40897e = this.user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Param");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.default_content != null) {
                sb.append(", default_content=");
                sb.append(this.default_content);
            }
            if (this.fixed_content != null) {
                sb.append(", fixed_content=");
                sb.append(this.fixed_content);
            }
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Param{");
            replace.append('}');
            return replace.toString();
        }

        public Param(Type type2, String str, String str2, String str3, String str4) {
            this(type2, str, str2, str3, str4, ByteString.EMPTY);
        }

        public Param(Type type2, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(str2, str3, str4) <= 1) {
                this.type = type2;
                this.default_content = str;
                this.fixed_content = str2;
                this.chat_id = str3;
                this.user_id = str4;
                return;
            }
            throw new IllegalArgumentException("at most one of fixed_content, chat_id, user_id may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic$b */
    private static final class C15445b extends ProtoAdapter<VideoChatI18nDefaultTopic> {
        C15445b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatI18nDefaultTopic.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatI18nDefaultTopic videoChatI18nDefaultTopic) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatI18nDefaultTopic.i18n_key) + Param.ADAPTER.asRepeated().encodedSizeWithTag(2, videoChatI18nDefaultTopic.params) + videoChatI18nDefaultTopic.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatI18nDefaultTopic decode(ProtoReader protoReader) throws IOException {
            C15444a aVar = new C15444a();
            aVar.f40898a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40898a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40899b.add(Param.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatI18nDefaultTopic.i18n_key);
            Param.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, videoChatI18nDefaultTopic.params);
            protoWriter.writeBytes(videoChatI18nDefaultTopic.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic$a */
    public static final class C15444a extends Message.Builder<VideoChatI18nDefaultTopic, C15444a> {

        /* renamed from: a */
        public String f40898a;

        /* renamed from: b */
        public List<Param> f40899b = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatI18nDefaultTopic build() {
            String str = this.f40898a;
            if (str != null) {
                return new VideoChatI18nDefaultTopic(str, this.f40899b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "i18n_key");
        }
    }

    @Override // com.squareup.wire.Message
    public C15444a newBuilder() {
        C15444a aVar = new C15444a();
        aVar.f40898a = this.i18n_key;
        aVar.f40899b = Internal.copyOf("params", this.params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "VideoChatI18nDefaultTopic");
        StringBuilder sb = new StringBuilder();
        sb.append(", i18n_key=");
        sb.append(this.i18n_key);
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatI18nDefaultTopic{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatI18nDefaultTopic(String str, List<Param> list) {
        this(str, list, ByteString.EMPTY);
    }

    public VideoChatI18nDefaultTopic(String str, List<Param> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_key = str;
        this.params = Internal.immutableCopyOf("params", list);
    }
}
