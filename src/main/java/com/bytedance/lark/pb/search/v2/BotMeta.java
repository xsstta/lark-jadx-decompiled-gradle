package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.search.v1.TimeZone;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BotMeta extends Message<BotMeta, C18969a> {
    public static final ProtoAdapter<BotMeta> ADAPTER = new C18970b();
    public static final Boolean DEFAULT_CAN_JOIN_GROUP = true;
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_FLAG = Chatter.Description.Type.ON_DEFAULT;
    public static final Boolean DEFAULT_IN_CONTACTS = true;
    private static final long serialVersionUID = 0;
    public final Boolean can_join_group;
    public final String description;
    public final Chatter.Description.Type description_flag;
    public final String id;
    public final Boolean in_contacts;
    public final SimpleP2PChatInfo p2p_chat_info;
    public final List<Tag> tags;
    public final String tenant_id;
    public final TimeZone timezone;
    public final String with_bot_tag;

    /* renamed from: com.bytedance.lark.pb.search.v2.BotMeta$b */
    private static final class C18970b extends ProtoAdapter<BotMeta> {
        C18970b() {
            super(FieldEncoding.LENGTH_DELIMITED, BotMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(BotMeta botMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, botMeta.id);
            int i8 = 0;
            if (botMeta.tenant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, botMeta.tenant_id);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (botMeta.timezone != null) {
                i2 = TimeZone.ADAPTER.encodedSizeWithTag(3, botMeta.timezone);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (botMeta.with_bot_tag != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, botMeta.with_bot_tag);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (botMeta.in_contacts != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, botMeta.in_contacts);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (botMeta.can_join_group != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, botMeta.can_join_group);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (botMeta.description != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, botMeta.description);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (botMeta.description_flag != null) {
                i7 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(8, botMeta.description_flag);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag2 = i14 + i7 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(9, botMeta.tags);
            if (botMeta.p2p_chat_info != null) {
                i8 = SimpleP2PChatInfo.ADAPTER.encodedSizeWithTag(10, botMeta.p2p_chat_info);
            }
            return encodedSizeWithTag2 + i8 + botMeta.unknownFields().size();
        }

        /* renamed from: a */
        public BotMeta decode(ProtoReader protoReader) throws IOException {
            C18969a aVar = new C18969a();
            aVar.f46879a = "";
            aVar.f46880b = "";
            aVar.f46882d = "bot";
            aVar.f46883e = true;
            aVar.f46884f = true;
            aVar.f46885g = "";
            aVar.f46886h = Chatter.Description.Type.ON_DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46879a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46880b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46881c = TimeZone.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46882d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46883e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46884f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46885g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f46886h = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            try {
                                aVar.f46887i.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 10:
                            aVar.f46888j = SimpleP2PChatInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, BotMeta botMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, botMeta.id);
            if (botMeta.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, botMeta.tenant_id);
            }
            if (botMeta.timezone != null) {
                TimeZone.ADAPTER.encodeWithTag(protoWriter, 3, botMeta.timezone);
            }
            if (botMeta.with_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, botMeta.with_bot_tag);
            }
            if (botMeta.in_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, botMeta.in_contacts);
            }
            if (botMeta.can_join_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, botMeta.can_join_group);
            }
            if (botMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, botMeta.description);
            }
            if (botMeta.description_flag != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 8, botMeta.description_flag);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, botMeta.tags);
            if (botMeta.p2p_chat_info != null) {
                SimpleP2PChatInfo.ADAPTER.encodeWithTag(protoWriter, 10, botMeta.p2p_chat_info);
            }
            protoWriter.writeBytes(botMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.BotMeta$a */
    public static final class C18969a extends Message.Builder<BotMeta, C18969a> {

        /* renamed from: a */
        public String f46879a;

        /* renamed from: b */
        public String f46880b;

        /* renamed from: c */
        public TimeZone f46881c;

        /* renamed from: d */
        public String f46882d;

        /* renamed from: e */
        public Boolean f46883e;

        /* renamed from: f */
        public Boolean f46884f;

        /* renamed from: g */
        public String f46885g;

        /* renamed from: h */
        public Chatter.Description.Type f46886h;

        /* renamed from: i */
        public List<Tag> f46887i = Internal.newMutableList();

        /* renamed from: j */
        public SimpleP2PChatInfo f46888j;

        /* renamed from: a */
        public BotMeta build() {
            String str = this.f46879a;
            if (str != null) {
                return new BotMeta(str, this.f46880b, this.f46881c, this.f46882d, this.f46883e, this.f46884f, this.f46885g, this.f46886h, this.f46887i, this.f46888j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18969a newBuilder() {
        C18969a aVar = new C18969a();
        aVar.f46879a = this.id;
        aVar.f46880b = this.tenant_id;
        aVar.f46881c = this.timezone;
        aVar.f46882d = this.with_bot_tag;
        aVar.f46883e = this.in_contacts;
        aVar.f46884f = this.can_join_group;
        aVar.f46885g = this.description;
        aVar.f46886h = this.description_flag;
        aVar.f46887i = Internal.copyOf("tags", this.tags);
        aVar.f46888j = this.p2p_chat_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "BotMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.with_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.with_bot_tag);
        }
        if (this.in_contacts != null) {
            sb.append(", in_contacts=");
            sb.append(this.in_contacts);
        }
        if (this.can_join_group != null) {
            sb.append(", can_join_group=");
            sb.append(this.can_join_group);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_flag != null) {
            sb.append(", description_flag=");
            sb.append(this.description_flag);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.p2p_chat_info != null) {
            sb.append(", p2p_chat_info=");
            sb.append(this.p2p_chat_info);
        }
        StringBuilder replace = sb.replace(0, 2, "BotMeta{");
        replace.append('}');
        return replace.toString();
    }

    public BotMeta(String str, String str2, TimeZone timeZone, String str3, Boolean bool, Boolean bool2, String str4, Chatter.Description.Type type, List<Tag> list, SimpleP2PChatInfo simpleP2PChatInfo) {
        this(str, str2, timeZone, str3, bool, bool2, str4, type, list, simpleP2PChatInfo, ByteString.EMPTY);
    }

    public BotMeta(String str, String str2, TimeZone timeZone, String str3, Boolean bool, Boolean bool2, String str4, Chatter.Description.Type type, List<Tag> list, SimpleP2PChatInfo simpleP2PChatInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.tenant_id = str2;
        this.timezone = timeZone;
        this.with_bot_tag = str3;
        this.in_contacts = bool;
        this.can_join_group = bool2;
        this.description = str4;
        this.description_flag = type;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.p2p_chat_info = simpleP2PChatInfo;
    }
}
