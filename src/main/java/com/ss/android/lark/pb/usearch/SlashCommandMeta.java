package com.ss.android.lark.pb.usearch;

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

public final class SlashCommandMeta extends Message<SlashCommandMeta, C50244a> {
    public static final ProtoAdapter<SlashCommandMeta> ADAPTER = new C50245b();
    private static final long serialVersionUID = 0;
    public final String mapp_link;
    public final String mdata_source_id;
    public final String mdescription;
    public final String mextra;
    public final String mimage_url;
    public final SlashCommandType mslash_command_type;
    public final List<SlashCommandTag> mtag;

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

    public static final class SlashCommandTag extends Message<SlashCommandTag, C50242a> {
        public static final ProtoAdapter<SlashCommandTag> ADAPTER = new C50243b();
        public static final Integer DEFAULT_TYPE = 0;
        private static final long serialVersionUID = 0;
        public final String mtext;
        public final Integer mtype;

        /* renamed from: com.ss.android.lark.pb.usearch.SlashCommandMeta$SlashCommandTag$b */
        private static final class C50243b extends ProtoAdapter<SlashCommandTag> {
            C50243b() {
                super(FieldEncoding.LENGTH_DELIMITED, SlashCommandTag.class);
            }

            /* renamed from: a */
            public int encodedSize(SlashCommandTag slashCommandTag) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, slashCommandTag.mtype) + ProtoAdapter.STRING.encodedSizeWithTag(2, slashCommandTag.mtext) + slashCommandTag.unknownFields().size();
            }

            /* renamed from: a */
            public SlashCommandTag decode(ProtoReader protoReader) throws IOException {
                C50242a aVar = new C50242a();
                aVar.f125550a = 0;
                aVar.f125551b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125550a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125551b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SlashCommandTag slashCommandTag) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, slashCommandTag.mtype);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, slashCommandTag.mtext);
                protoWriter.writeBytes(slashCommandTag.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50242a newBuilder() {
            C50242a aVar = new C50242a();
            aVar.f125550a = this.mtype;
            aVar.f125551b = this.mtext;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.usearch.SlashCommandMeta$SlashCommandTag$a */
        public static final class C50242a extends Message.Builder<SlashCommandTag, C50242a> {

            /* renamed from: a */
            public Integer f125550a;

            /* renamed from: b */
            public String f125551b;

            /* renamed from: a */
            public SlashCommandTag build() {
                String str;
                Integer num = this.f125550a;
                if (num != null && (str = this.f125551b) != null) {
                    return new SlashCommandTag(num, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, "mtype", this.f125551b, "mtext");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.mtype);
            sb.append(", text=");
            sb.append(this.mtext);
            StringBuilder replace = sb.replace(0, 2, "SlashCommandTag{");
            replace.append('}');
            return replace.toString();
        }

        public SlashCommandTag(Integer num, String str) {
            this(num, str, ByteString.EMPTY);
        }

        public SlashCommandTag(Integer num, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtype = num;
            this.mtext = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.SlashCommandMeta$b */
    private static final class C50245b extends ProtoAdapter<SlashCommandMeta> {
        C50245b() {
            super(FieldEncoding.LENGTH_DELIMITED, SlashCommandMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SlashCommandMeta slashCommandMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = SlashCommandType.ADAPTER.encodedSizeWithTag(1, slashCommandMeta.mslash_command_type);
            int i5 = 0;
            if (slashCommandMeta.mapp_link != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, slashCommandMeta.mapp_link);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + SlashCommandTag.ADAPTER.asRepeated().encodedSizeWithTag(3, slashCommandMeta.mtag);
            if (slashCommandMeta.mextra != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, slashCommandMeta.mextra);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag2 + i2;
            if (slashCommandMeta.mimage_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, slashCommandMeta.mimage_url);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (slashCommandMeta.mdescription != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, slashCommandMeta.mdescription);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (slashCommandMeta.mdata_source_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, slashCommandMeta.mdata_source_id);
            }
            return i8 + i5 + slashCommandMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SlashCommandMeta decode(ProtoReader protoReader) throws IOException {
            C50244a aVar = new C50244a();
            aVar.f125553b = "";
            aVar.f125555d = "";
            aVar.f125556e = "";
            aVar.f125557f = "";
            aVar.f125558g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f125552a = SlashCommandType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f125553b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125554c.add(SlashCommandTag.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f125555d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125556e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125557f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125558g = ProtoAdapter.STRING.decode(protoReader);
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
            SlashCommandType.ADAPTER.encodeWithTag(protoWriter, 1, slashCommandMeta.mslash_command_type);
            if (slashCommandMeta.mapp_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, slashCommandMeta.mapp_link);
            }
            SlashCommandTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, slashCommandMeta.mtag);
            if (slashCommandMeta.mextra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, slashCommandMeta.mextra);
            }
            if (slashCommandMeta.mimage_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, slashCommandMeta.mimage_url);
            }
            if (slashCommandMeta.mdescription != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, slashCommandMeta.mdescription);
            }
            if (slashCommandMeta.mdata_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, slashCommandMeta.mdata_source_id);
            }
            protoWriter.writeBytes(slashCommandMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.SlashCommandMeta$a */
    public static final class C50244a extends Message.Builder<SlashCommandMeta, C50244a> {

        /* renamed from: a */
        public SlashCommandType f125552a;

        /* renamed from: b */
        public String f125553b;

        /* renamed from: c */
        public List<SlashCommandTag> f125554c = Internal.newMutableList();

        /* renamed from: d */
        public String f125555d;

        /* renamed from: e */
        public String f125556e;

        /* renamed from: f */
        public String f125557f;

        /* renamed from: g */
        public String f125558g;

        /* renamed from: a */
        public SlashCommandMeta build() {
            SlashCommandType slashCommandType = this.f125552a;
            if (slashCommandType != null) {
                return new SlashCommandMeta(slashCommandType, this.f125553b, this.f125554c, this.f125555d, this.f125556e, this.f125557f, this.f125558g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(slashCommandType, "mslash_command_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C50244a newBuilder() {
        C50244a aVar = new C50244a();
        aVar.f125552a = this.mslash_command_type;
        aVar.f125553b = this.mapp_link;
        aVar.f125554c = Internal.copyOf("mtag", this.mtag);
        aVar.f125555d = this.mextra;
        aVar.f125556e = this.mimage_url;
        aVar.f125557f = this.mdescription;
        aVar.f125558g = this.mdata_source_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", slash_command_type=");
        sb.append(this.mslash_command_type);
        if (this.mapp_link != null) {
            sb.append(", app_link=");
            sb.append(this.mapp_link);
        }
        if (!this.mtag.isEmpty()) {
            sb.append(", tag=");
            sb.append(this.mtag);
        }
        if (this.mextra != null) {
            sb.append(", extra=");
            sb.append(this.mextra);
        }
        if (this.mimage_url != null) {
            sb.append(", image_url=");
            sb.append(this.mimage_url);
        }
        if (this.mdescription != null) {
            sb.append(", description=");
            sb.append(this.mdescription);
        }
        if (this.mdata_source_id != null) {
            sb.append(", data_source_id=");
            sb.append(this.mdata_source_id);
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
        this.mslash_command_type = slashCommandType;
        this.mapp_link = str;
        this.mtag = Internal.immutableCopyOf("mtag", list);
        this.mextra = str2;
        this.mimage_url = str3;
        this.mdescription = str4;
        this.mdata_source_id = str5;
    }
}
