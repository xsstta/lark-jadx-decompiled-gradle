package com.bytedance.lark.pb.search.v2;

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

public final class SlashCommandMeta extends Message<SlashCommandMeta, C19035a> {
    public static final ProtoAdapter<SlashCommandMeta> ADAPTER = new C19036b();
    public static final SlashCommandType DEFAULT_SLASH_COMMAND_TYPE = SlashCommandType.ENTITY;
    private static final long serialVersionUID = 0;
    public final String app_link;
    public final String data_source_id;
    public final String description;
    public final String extra;
    public final String image_url;
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

    public static final class SlashCommandTag extends Message<SlashCommandTag, C19033a> {
        public static final ProtoAdapter<SlashCommandTag> ADAPTER = new C19034b();
        public static final Integer DEFAULT_TYPE = 0;
        private static final long serialVersionUID = 0;
        public final String text;
        public final Integer type;

        /* renamed from: com.bytedance.lark.pb.search.v2.SlashCommandMeta$SlashCommandTag$b */
        private static final class C19034b extends ProtoAdapter<SlashCommandTag> {
            C19034b() {
                super(FieldEncoding.LENGTH_DELIMITED, SlashCommandTag.class);
            }

            /* renamed from: a */
            public int encodedSize(SlashCommandTag slashCommandTag) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, slashCommandTag.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, slashCommandTag.text) + slashCommandTag.unknownFields().size();
            }

            /* renamed from: a */
            public SlashCommandTag decode(ProtoReader protoReader) throws IOException {
                C19033a aVar = new C19033a();
                aVar.f47096a = 0;
                aVar.f47097b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47096a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47097b = ProtoAdapter.STRING.decode(protoReader);
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
        public C19033a newBuilder() {
            C19033a aVar = new C19033a();
            aVar.f47096a = this.type;
            aVar.f47097b = this.text;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.SlashCommandMeta$SlashCommandTag$a */
        public static final class C19033a extends Message.Builder<SlashCommandTag, C19033a> {

            /* renamed from: a */
            public Integer f47096a;

            /* renamed from: b */
            public String f47097b;

            /* renamed from: a */
            public SlashCommandTag build() {
                String str;
                Integer num = this.f47096a;
                if (num != null && (str = this.f47097b) != null) {
                    return new SlashCommandTag(num, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, ShareHitPoint.f121869d, this.f47097b, "text");
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

    /* renamed from: com.bytedance.lark.pb.search.v2.SlashCommandMeta$b */
    private static final class C19036b extends ProtoAdapter<SlashCommandMeta> {
        C19036b() {
            super(FieldEncoding.LENGTH_DELIMITED, SlashCommandMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SlashCommandMeta slashCommandMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = SlashCommandType.ADAPTER.encodedSizeWithTag(1, slashCommandMeta.slash_command_type);
            int i5 = 0;
            if (slashCommandMeta.app_link != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, slashCommandMeta.app_link);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + SlashCommandTag.ADAPTER.asRepeated().encodedSizeWithTag(3, slashCommandMeta.tag);
            if (slashCommandMeta.extra != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, slashCommandMeta.extra);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag2 + i2;
            if (slashCommandMeta.image_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, slashCommandMeta.image_url);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (slashCommandMeta.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, slashCommandMeta.description);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (slashCommandMeta.data_source_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, slashCommandMeta.data_source_id);
            }
            return i8 + i5 + slashCommandMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SlashCommandMeta decode(ProtoReader protoReader) throws IOException {
            C19035a aVar = new C19035a();
            aVar.f47098a = SlashCommandType.ENTITY;
            aVar.f47099b = "";
            aVar.f47101d = "";
            aVar.f47102e = "";
            aVar.f47103f = "";
            aVar.f47104g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f47098a = SlashCommandType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f47099b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47100c.add(SlashCommandTag.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f47101d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47102e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47103f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47104g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SlashCommandMeta slashCommandMeta) throws IOException {
            SlashCommandType.ADAPTER.encodeWithTag(protoWriter, 1, slashCommandMeta.slash_command_type);
            if (slashCommandMeta.app_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, slashCommandMeta.app_link);
            }
            SlashCommandTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, slashCommandMeta.tag);
            if (slashCommandMeta.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, slashCommandMeta.extra);
            }
            if (slashCommandMeta.image_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, slashCommandMeta.image_url);
            }
            if (slashCommandMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, slashCommandMeta.description);
            }
            if (slashCommandMeta.data_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, slashCommandMeta.data_source_id);
            }
            protoWriter.writeBytes(slashCommandMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SlashCommandMeta$a */
    public static final class C19035a extends Message.Builder<SlashCommandMeta, C19035a> {

        /* renamed from: a */
        public SlashCommandType f47098a;

        /* renamed from: b */
        public String f47099b;

        /* renamed from: c */
        public List<SlashCommandTag> f47100c = Internal.newMutableList();

        /* renamed from: d */
        public String f47101d;

        /* renamed from: e */
        public String f47102e;

        /* renamed from: f */
        public String f47103f;

        /* renamed from: g */
        public String f47104g;

        /* renamed from: a */
        public SlashCommandMeta build() {
            SlashCommandType slashCommandType = this.f47098a;
            if (slashCommandType != null) {
                return new SlashCommandMeta(slashCommandType, this.f47099b, this.f47100c, this.f47101d, this.f47102e, this.f47103f, this.f47104g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(slashCommandType, "slash_command_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C19035a newBuilder() {
        C19035a aVar = new C19035a();
        aVar.f47098a = this.slash_command_type;
        aVar.f47099b = this.app_link;
        aVar.f47100c = Internal.copyOf("tag", this.tag);
        aVar.f47101d = this.extra;
        aVar.f47102e = this.image_url;
        aVar.f47103f = this.description;
        aVar.f47104g = this.data_source_id;
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
        if (!this.tag.isEmpty()) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.data_source_id != null) {
            sb.append(", data_source_id=");
            sb.append(this.data_source_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SlashCommandMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SlashCommandMeta(SlashCommandType slashCommandType, String str, List<SlashCommandTag> list, String str2, String str3, String str4, String str5) {
        this(slashCommandType, str, list, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public SlashCommandMeta(SlashCommandType slashCommandType, String str, List<SlashCommandTag> list, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.slash_command_type = slashCommandType;
        this.app_link = str;
        this.tag = Internal.immutableCopyOf("tag", list);
        this.extra = str2;
        this.image_url = str3;
        this.description = str4;
        this.data_source_id = str5;
    }
}
