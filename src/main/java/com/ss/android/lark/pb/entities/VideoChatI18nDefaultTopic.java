package com.ss.android.lark.pb.entities;

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

public final class VideoChatI18nDefaultTopic extends Message<VideoChatI18nDefaultTopic, C49752a> {
    public static final ProtoAdapter<VideoChatI18nDefaultTopic> ADAPTER = new C49753b();
    private static final long serialVersionUID = 0;
    public final String mi18n_key;
    public final List<Param> mparams;

    public static final class Param extends Message<Param, C49750a> {
        public static final ProtoAdapter<Param> ADAPTER = new C49751b();
        private static final long serialVersionUID = 0;
        public final String mchat_id;
        public final String mdefault_content;
        public final String mfixed_content;
        public final Type mtype;
        public final String muser_id;

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

        /* renamed from: com.ss.android.lark.pb.entities.VideoChatI18nDefaultTopic$Param$b */
        private static final class C49751b extends ProtoAdapter<Param> {
            C49751b() {
                super(FieldEncoding.LENGTH_DELIMITED, Param.class);
            }

            /* renamed from: a */
            public int encodedSize(Param param) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, param.mtype);
                int i4 = 0;
                if (param.mdefault_content != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, param.mdefault_content);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (param.mfixed_content != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, param.mfixed_content);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (param.mchat_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, param.mchat_id);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (param.muser_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, param.muser_id);
                }
                return i7 + i4 + param.unknownFields().size();
            }

            /* renamed from: a */
            public Param decode(ProtoReader protoReader) throws IOException {
                C49750a aVar = new C49750a();
                aVar.f124618b = "";
                aVar.mo173232a("");
                aVar.mo173234b("");
                aVar.mo173235c("");
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f124617a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f124618b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.mo173232a(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 4) {
                        aVar.mo173234b(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo173235c(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Param param) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, param.mtype);
                if (param.mdefault_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, param.mdefault_content);
                }
                if (param.mfixed_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, param.mfixed_content);
                }
                if (param.mchat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, param.mchat_id);
                }
                if (param.muser_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, param.muser_id);
                }
                protoWriter.writeBytes(param.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.VideoChatI18nDefaultTopic$Param$a */
        public static final class C49750a extends Message.Builder<Param, C49750a> {

            /* renamed from: a */
            public Type f124617a;

            /* renamed from: b */
            public String f124618b;

            /* renamed from: c */
            public String f124619c;

            /* renamed from: d */
            public String f124620d;

            /* renamed from: e */
            public String f124621e;

            /* renamed from: a */
            public Param build() {
                Type type = this.f124617a;
                if (type != null) {
                    return new Param(type, this.f124618b, this.f124619c, this.f124620d, this.f124621e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, "mtype");
            }

            /* renamed from: a */
            public C49750a mo173232a(String str) {
                this.f124619c = str;
                this.f124620d = null;
                this.f124621e = null;
                return this;
            }

            /* renamed from: b */
            public C49750a mo173234b(String str) {
                this.f124620d = str;
                this.f124619c = null;
                this.f124621e = null;
                return this;
            }

            /* renamed from: c */
            public C49750a mo173235c(String str) {
                this.f124621e = str;
                this.f124619c = null;
                this.f124620d = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C49750a newBuilder() {
            C49750a aVar = new C49750a();
            aVar.f124617a = this.mtype;
            aVar.f124618b = this.mdefault_content;
            aVar.f124619c = this.mfixed_content;
            aVar.f124620d = this.mchat_id;
            aVar.f124621e = this.muser_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.mtype);
            if (this.mdefault_content != null) {
                sb.append(", default_content=");
                sb.append(this.mdefault_content);
            }
            if (this.mfixed_content != null) {
                sb.append(", fixed_content=");
                sb.append(this.mfixed_content);
            }
            if (this.mchat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.mchat_id);
            }
            if (this.muser_id != null) {
                sb.append(", user_id=");
                sb.append(this.muser_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Param{");
            replace.append('}');
            return replace.toString();
        }

        public Param(Type type, String str, String str2, String str3, String str4) {
            this(type, str, str2, str3, str4, ByteString.EMPTY);
        }

        public Param(Type type, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(str2, str3, str4) <= 1) {
                this.mtype = type;
                this.mdefault_content = str;
                this.mfixed_content = str2;
                this.mchat_id = str3;
                this.muser_id = str4;
                return;
            }
            throw new IllegalArgumentException("at most one of mfixed_content, mchat_id, muser_id may be non-null");
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.VideoChatI18nDefaultTopic$b */
    private static final class C49753b extends ProtoAdapter<VideoChatI18nDefaultTopic> {
        C49753b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatI18nDefaultTopic.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatI18nDefaultTopic videoChatI18nDefaultTopic) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatI18nDefaultTopic.mi18n_key) + Param.ADAPTER.asRepeated().encodedSizeWithTag(2, videoChatI18nDefaultTopic.mparams) + videoChatI18nDefaultTopic.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatI18nDefaultTopic decode(ProtoReader protoReader) throws IOException {
            C49752a aVar = new C49752a();
            aVar.f124622a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124622a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124623b.add(Param.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatI18nDefaultTopic.mi18n_key);
            Param.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, videoChatI18nDefaultTopic.mparams);
            protoWriter.writeBytes(videoChatI18nDefaultTopic.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.VideoChatI18nDefaultTopic$a */
    public static final class C49752a extends Message.Builder<VideoChatI18nDefaultTopic, C49752a> {

        /* renamed from: a */
        public String f124622a;

        /* renamed from: b */
        public List<Param> f124623b = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatI18nDefaultTopic build() {
            String str = this.f124622a;
            if (str != null) {
                return new VideoChatI18nDefaultTopic(str, this.f124623b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mi18n_key");
        }
    }

    @Override // com.squareup.wire.Message
    public C49752a newBuilder() {
        C49752a aVar = new C49752a();
        aVar.f124622a = this.mi18n_key;
        aVar.f124623b = Internal.copyOf("mparams", this.mparams);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", i18n_key=");
        sb.append(this.mi18n_key);
        if (!this.mparams.isEmpty()) {
            sb.append(", params=");
            sb.append(this.mparams);
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
        this.mi18n_key = str;
        this.mparams = Internal.immutableCopyOf("mparams", list);
    }
}
