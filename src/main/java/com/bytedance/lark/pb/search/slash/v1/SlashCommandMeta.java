package com.bytedance.lark.pb.search.slash.v1;

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

public final class SlashCommandMeta extends Message<SlashCommandMeta, C18807a> {
    public static final ProtoAdapter<SlashCommandMeta> ADAPTER = new C18808b();
    public static final SlashCommandType DEFAULT_SLASH_COMMAND_TYPE = SlashCommandType.ENTITY;
    private static final long serialVersionUID = 0;
    public final String app_link;
    public final String description;
    public final String extra;
    public final SlashCommandType slash_command_type;
    public final List<SlashCommandTag> tag;

    public enum SlashCommandType implements WireEnum {
        ENTITY(0),
        FILTER(1);
        
        public static final ProtoAdapter<SlashCommandType> ADAPTER = ProtoAdapter.newEnumAdapter(SlashCommandType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SlashCommandType fromValue(int i) {
            if (i == 0) {
                return ENTITY;
            }
            if (i != 1) {
                return null;
            }
            return FILTER;
        }

        private SlashCommandType(int i) {
            this.value = i;
        }
    }

    public static final class SlashCommandTag extends Message<SlashCommandTag, C18805a> {
        public static final ProtoAdapter<SlashCommandTag> ADAPTER = new C18806b();
        public static final Integer DEFAULT_TYPE = 0;
        private static final long serialVersionUID = 0;
        public final String text;
        public final Integer type;

        /* renamed from: com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta$SlashCommandTag$b */
        private static final class C18806b extends ProtoAdapter<SlashCommandTag> {
            C18806b() {
                super(FieldEncoding.LENGTH_DELIMITED, SlashCommandTag.class);
            }

            /* renamed from: a */
            public int encodedSize(SlashCommandTag slashCommandTag) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, slashCommandTag.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, slashCommandTag.text) + slashCommandTag.unknownFields().size();
            }

            /* renamed from: a */
            public SlashCommandTag decode(ProtoReader protoReader) throws IOException {
                C18805a aVar = new C18805a();
                aVar.f46368a = 0;
                aVar.f46369b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46368a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46369b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SlashCommandTag slashCommandTag) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, slashCommandTag.type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, slashCommandTag.text);
                protoWriter.writeBytes(slashCommandTag.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18805a newBuilder() {
            C18805a aVar = new C18805a();
            aVar.f46368a = this.type;
            aVar.f46369b = this.text;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta$SlashCommandTag$a */
        public static final class C18805a extends Message.Builder<SlashCommandTag, C18805a> {

            /* renamed from: a */
            public Integer f46368a;

            /* renamed from: b */
            public String f46369b;

            /* renamed from: a */
            public SlashCommandTag build() {
                String str;
                Integer num = this.f46368a;
                if (num != null && (str = this.f46369b) != null) {
                    return new SlashCommandTag(num, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, ShareHitPoint.f121869d, this.f46369b, "text");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SlashCommandTag");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", text=");
            sb.append(this.text);
            StringBuilder replace = sb.replace(0, 2, "SlashCommandTag{");
            replace.append('}');
            return replace.toString();
        }

        public SlashCommandTag(Integer num, String str) {
            this(num, str, ByteString.EMPTY);
        }

        public SlashCommandTag(Integer num, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = num;
            this.text = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta$b */
    private static final class C18808b extends ProtoAdapter<SlashCommandMeta> {
        C18808b() {
            super(FieldEncoding.LENGTH_DELIMITED, SlashCommandMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SlashCommandMeta slashCommandMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = SlashCommandType.ADAPTER.encodedSizeWithTag(1, slashCommandMeta.slash_command_type);
            int i3 = 0;
            if (slashCommandMeta.app_link != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, slashCommandMeta.app_link);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (slashCommandMeta.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, slashCommandMeta.description);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + SlashCommandTag.ADAPTER.asRepeated().encodedSizeWithTag(4, slashCommandMeta.tag);
            if (slashCommandMeta.extra != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, slashCommandMeta.extra);
            }
            return encodedSizeWithTag2 + i3 + slashCommandMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SlashCommandMeta decode(ProtoReader protoReader) throws IOException {
            C18807a aVar = new C18807a();
            aVar.f46370a = SlashCommandType.ENTITY;
            aVar.f46371b = "";
            aVar.f46372c = "";
            aVar.f46374e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46370a = SlashCommandType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46371b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46372c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46373d.add(SlashCommandTag.ADAPTER.decode(protoReader));
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46374e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SlashCommandMeta slashCommandMeta) throws IOException {
            SlashCommandType.ADAPTER.encodeWithTag(protoWriter, 1, slashCommandMeta.slash_command_type);
            if (slashCommandMeta.app_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, slashCommandMeta.app_link);
            }
            if (slashCommandMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, slashCommandMeta.description);
            }
            SlashCommandTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, slashCommandMeta.tag);
            if (slashCommandMeta.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, slashCommandMeta.extra);
            }
            protoWriter.writeBytes(slashCommandMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta$a */
    public static final class C18807a extends Message.Builder<SlashCommandMeta, C18807a> {

        /* renamed from: a */
        public SlashCommandType f46370a;

        /* renamed from: b */
        public String f46371b;

        /* renamed from: c */
        public String f46372c;

        /* renamed from: d */
        public List<SlashCommandTag> f46373d = Internal.newMutableList();

        /* renamed from: e */
        public String f46374e;

        /* renamed from: a */
        public SlashCommandMeta build() {
            SlashCommandType slashCommandType = this.f46370a;
            if (slashCommandType != null) {
                return new SlashCommandMeta(slashCommandType, this.f46371b, this.f46372c, this.f46373d, this.f46374e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(slashCommandType, "slash_command_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C18807a newBuilder() {
        C18807a aVar = new C18807a();
        aVar.f46370a = this.slash_command_type;
        aVar.f46371b = this.app_link;
        aVar.f46372c = this.description;
        aVar.f46373d = Internal.copyOf("tag", this.tag);
        aVar.f46374e = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SlashCommandMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", slash_command_type=");
        sb.append(this.slash_command_type);
        if (this.app_link != null) {
            sb.append(", app_link=");
            sb.append(this.app_link);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.tag.isEmpty()) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "SlashCommandMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SlashCommandMeta(SlashCommandType slashCommandType, String str, String str2, List<SlashCommandTag> list, String str3) {
        this(slashCommandType, str, str2, list, str3, ByteString.EMPTY);
    }

    public SlashCommandMeta(SlashCommandType slashCommandType, String str, String str2, List<SlashCommandTag> list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.slash_command_type = slashCommandType;
        this.app_link = str;
        this.description = str2;
        this.tag = Internal.immutableCopyOf("tag", list);
        this.extra = str3;
    }
}
