package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.huawei.hms.android.HwBuildEx;
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

public final class MessageData extends Message<MessageData, C15075a> {
    public static final ProtoAdapter<MessageData> ADAPTER = new C15076b();
    public static final Integer DEFAULT_CHANNEL_THREAD_POSITION = 0;
    public static final Chat.ChatMode DEFAULT_CHAT_MODE = Chat.ChatMode.UNKNOWN;
    public static final Chat.Type DEFAULT_CHAT_TYPE = Chat.Type.P2P;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_BOT = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_FOLLOWED = false;
    public static final Boolean DEFAULT_ME_READ = false;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_MESSAGE_POSITION = 0;
    public static final Type DEFAULT_TYPE = Type.NORMAL;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String avatar_key;
    public final String avatar_path;
    public final Channel channel;
    public final Integer channel_thread_position;
    public final String chat_id;
    public final Chat.ChatMode chat_mode;
    public final Chat.Type chat_type;
    public final Long create_time;
    public final String from_chatter_id;
    public final List<String> image_urls;
    public final Boolean is_bot;
    public final Boolean is_crypto;
    public final Boolean is_followed;
    public final Boolean me_read;
    public final String message_id;
    public final Integer new_message_count;
    public final String open_app_chat_feed_id;
    public final Integer position;
    public final String recaller_id;
    public final String thread_id;
    public final Integer thread_message_position;
    public final Type type;
    public final String urgent_id;

    public enum Type implements WireEnum {
        NORMAL(1),
        AT(2),
        URGENT(3),
        REACTION(4),
        URGENT_ACK(5);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return AT;
            }
            if (i == 3) {
                return URGENT;
            }
            if (i == 4) {
                return REACTION;
            }
            if (i != 5) {
                return null;
            }
            return URGENT_ACK;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MessageData$b */
    private static final class C15076b extends ProtoAdapter<MessageData> {
        C15076b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageData.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageData messageData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22 = 0;
            if (messageData.urgent_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, messageData.urgent_id);
            } else {
                i = 0;
            }
            if (messageData.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, messageData.message_id);
            } else {
                i2 = 0;
            }
            int i23 = i + i2;
            if (messageData.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, messageData.position);
            } else {
                i3 = 0;
            }
            int i24 = i23 + i3;
            if (messageData.recaller_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, messageData.recaller_id);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i24 + i4 + Type.ADAPTER.encodedSizeWithTag(5, messageData.type);
            if (messageData.channel != null) {
                i5 = Channel.ADAPTER.encodedSizeWithTag(6, messageData.channel);
            } else {
                i5 = 0;
            }
            int i25 = encodedSizeWithTag + i5;
            if (messageData.chat_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, messageData.chat_id);
            } else {
                i6 = 0;
            }
            int i26 = i25 + i6;
            if (messageData.chat_type != null) {
                i7 = Chat.Type.ADAPTER.encodedSizeWithTag(8, messageData.chat_type);
            } else {
                i7 = 0;
            }
            int i27 = i26 + i7;
            if (messageData.chat_mode != null) {
                i8 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(9, messageData.chat_mode);
            } else {
                i8 = 0;
            }
            int i28 = i27 + i8;
            if (messageData.is_crypto != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, messageData.is_crypto);
            } else {
                i9 = 0;
            }
            int i29 = i28 + i9;
            if (messageData.new_message_count != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, messageData.new_message_count);
            } else {
                i10 = 0;
            }
            int i30 = i29 + i10;
            if (messageData.avatar_key != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, messageData.avatar_key);
            } else {
                i11 = 0;
            }
            int i31 = i30 + i11;
            if (messageData.avatar_path != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, messageData.avatar_path);
            } else {
                i12 = 0;
            }
            int i32 = i31 + i12;
            if (messageData.thread_message_position != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(14, messageData.thread_message_position);
            } else {
                i13 = 0;
            }
            int i33 = i32 + i13;
            if (messageData.from_chatter_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, messageData.from_chatter_id);
            } else {
                i14 = 0;
            }
            int encodedSizeWithTag2 = i33 + i14 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(16, messageData.image_urls);
            if (messageData.is_followed != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(17, messageData.is_followed);
            } else {
                i15 = 0;
            }
            int i34 = encodedSizeWithTag2 + i15;
            if (messageData.thread_id != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(18, messageData.thread_id);
            } else {
                i16 = 0;
            }
            int i35 = i34 + i16;
            if (messageData.channel_thread_position != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(19, messageData.channel_thread_position);
            } else {
                i17 = 0;
            }
            int i36 = i35 + i17;
            if (messageData.create_time != null) {
                i18 = ProtoAdapter.INT64.encodedSizeWithTag(20, messageData.create_time);
            } else {
                i18 = 0;
            }
            int i37 = i36 + i18;
            if (messageData.me_read != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(21, messageData.me_read);
            } else {
                i19 = 0;
            }
            int i38 = i37 + i19;
            if (messageData.app_id != null) {
                i20 = ProtoAdapter.STRING.encodedSizeWithTag(22, messageData.app_id);
            } else {
                i20 = 0;
            }
            int i39 = i38 + i20;
            if (messageData.open_app_chat_feed_id != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(23, messageData.open_app_chat_feed_id);
            } else {
                i21 = 0;
            }
            int i40 = i39 + i21;
            if (messageData.is_bot != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(24, messageData.is_bot);
            }
            return i40 + i22 + messageData.unknownFields().size();
        }

        /* renamed from: a */
        public MessageData decode(ProtoReader protoReader) throws IOException {
            C15075a aVar = new C15075a();
            aVar.f39922a = "";
            aVar.f39923b = "";
            aVar.f39924c = 0;
            aVar.f39925d = "";
            aVar.f39926e = Type.NORMAL;
            aVar.f39928g = "";
            aVar.f39929h = Chat.Type.P2P;
            aVar.f39930i = Chat.ChatMode.UNKNOWN;
            aVar.f39931j = false;
            aVar.f39932k = 0;
            aVar.f39933l = "";
            aVar.f39934m = "";
            aVar.f39935n = 0;
            aVar.f39936o = "";
            aVar.f39938q = false;
            aVar.f39939r = "";
            aVar.f39940s = 0;
            aVar.f39941t = 0L;
            aVar.f39942u = false;
            aVar.f39943v = "";
            aVar.f39944w = "";
            aVar.f39945x = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39922a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39923b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39924c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39925d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f39926e = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f39927f = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39928g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f39929h = Chat.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            try {
                                aVar.f39930i = Chat.ChatMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 10:
                            aVar.f39931j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f39932k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39933l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f39934m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f39935n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f39936o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f39937p.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            aVar.f39938q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f39939r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f39940s = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 20:
                            aVar.f39941t = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 21:
                            aVar.f39942u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f39943v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f39944w = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 24:
                            aVar.f39945x = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MessageData messageData) throws IOException {
            if (messageData.urgent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageData.urgent_id);
            }
            if (messageData.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, messageData.message_id);
            }
            if (messageData.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messageData.position);
            }
            if (messageData.recaller_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, messageData.recaller_id);
            }
            Type.ADAPTER.encodeWithTag(protoWriter, 5, messageData.type);
            if (messageData.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 6, messageData.channel);
            }
            if (messageData.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, messageData.chat_id);
            }
            if (messageData.chat_type != null) {
                Chat.Type.ADAPTER.encodeWithTag(protoWriter, 8, messageData.chat_type);
            }
            if (messageData.chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 9, messageData.chat_mode);
            }
            if (messageData.is_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, messageData.is_crypto);
            }
            if (messageData.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, messageData.new_message_count);
            }
            if (messageData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, messageData.avatar_key);
            }
            if (messageData.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, messageData.avatar_path);
            }
            if (messageData.thread_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, messageData.thread_message_position);
            }
            if (messageData.from_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, messageData.from_chatter_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 16, messageData.image_urls);
            if (messageData.is_followed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, messageData.is_followed);
            }
            if (messageData.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, messageData.thread_id);
            }
            if (messageData.channel_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, messageData.channel_thread_position);
            }
            if (messageData.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, messageData.create_time);
            }
            if (messageData.me_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, messageData.me_read);
            }
            if (messageData.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, messageData.app_id);
            }
            if (messageData.open_app_chat_feed_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, messageData.open_app_chat_feed_id);
            }
            if (messageData.is_bot != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, messageData.is_bot);
            }
            protoWriter.writeBytes(messageData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MessageData$a */
    public static final class C15075a extends Message.Builder<MessageData, C15075a> {

        /* renamed from: a */
        public String f39922a;

        /* renamed from: b */
        public String f39923b;

        /* renamed from: c */
        public Integer f39924c;

        /* renamed from: d */
        public String f39925d;

        /* renamed from: e */
        public Type f39926e;

        /* renamed from: f */
        public Channel f39927f;

        /* renamed from: g */
        public String f39928g;

        /* renamed from: h */
        public Chat.Type f39929h;

        /* renamed from: i */
        public Chat.ChatMode f39930i;

        /* renamed from: j */
        public Boolean f39931j;

        /* renamed from: k */
        public Integer f39932k;

        /* renamed from: l */
        public String f39933l;

        /* renamed from: m */
        public String f39934m;

        /* renamed from: n */
        public Integer f39935n;

        /* renamed from: o */
        public String f39936o;

        /* renamed from: p */
        public List<String> f39937p = Internal.newMutableList();

        /* renamed from: q */
        public Boolean f39938q;

        /* renamed from: r */
        public String f39939r;

        /* renamed from: s */
        public Integer f39940s;

        /* renamed from: t */
        public Long f39941t;

        /* renamed from: u */
        public Boolean f39942u;

        /* renamed from: v */
        public String f39943v;

        /* renamed from: w */
        public String f39944w;

        /* renamed from: x */
        public Boolean f39945x;

        /* renamed from: a */
        public MessageData build() {
            Type type = this.f39926e;
            if (type != null) {
                return new MessageData(this.f39922a, this.f39923b, this.f39924c, this.f39925d, type, this.f39927f, this.f39928g, this.f39929h, this.f39930i, this.f39931j, this.f39932k, this.f39933l, this.f39934m, this.f39935n, this.f39936o, this.f39937p, this.f39938q, this.f39939r, this.f39940s, this.f39941t, this.f39942u, this.f39943v, this.f39944w, this.f39945x, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C15075a newBuilder() {
        C15075a aVar = new C15075a();
        aVar.f39922a = this.urgent_id;
        aVar.f39923b = this.message_id;
        aVar.f39924c = this.position;
        aVar.f39925d = this.recaller_id;
        aVar.f39926e = this.type;
        aVar.f39927f = this.channel;
        aVar.f39928g = this.chat_id;
        aVar.f39929h = this.chat_type;
        aVar.f39930i = this.chat_mode;
        aVar.f39931j = this.is_crypto;
        aVar.f39932k = this.new_message_count;
        aVar.f39933l = this.avatar_key;
        aVar.f39934m = this.avatar_path;
        aVar.f39935n = this.thread_message_position;
        aVar.f39936o = this.from_chatter_id;
        aVar.f39937p = Internal.copyOf("image_urls", this.image_urls);
        aVar.f39938q = this.is_followed;
        aVar.f39939r = this.thread_id;
        aVar.f39940s = this.channel_thread_position;
        aVar.f39941t = this.create_time;
        aVar.f39942u = this.me_read;
        aVar.f39943v = this.app_id;
        aVar.f39944w = this.open_app_chat_feed_id;
        aVar.f39945x = this.is_bot;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MessageData");
        StringBuilder sb = new StringBuilder();
        if (this.urgent_id != null) {
            sb.append(", urgent_id=");
            sb.append(this.urgent_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.recaller_id != null) {
            sb.append(", recaller_id=");
            sb.append(this.recaller_id);
        }
        sb.append(", type=");
        sb.append(this.type);
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.chat_type != null) {
            sb.append(", chat_type=");
            sb.append(this.chat_type);
        }
        if (this.chat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.chat_mode);
        }
        if (this.is_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.is_crypto);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.thread_message_position != null) {
            sb.append(", thread_message_position=");
            sb.append(this.thread_message_position);
        }
        if (this.from_chatter_id != null) {
            sb.append(", from_chatter_id=");
            sb.append(this.from_chatter_id);
        }
        if (!this.image_urls.isEmpty()) {
            sb.append(", image_urls=");
            sb.append(this.image_urls);
        }
        if (this.is_followed != null) {
            sb.append(", is_followed=");
            sb.append(this.is_followed);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.channel_thread_position != null) {
            sb.append(", channel_thread_position=");
            sb.append(this.channel_thread_position);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.me_read != null) {
            sb.append(", me_read=");
            sb.append(this.me_read);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.open_app_chat_feed_id != null) {
            sb.append(", open_app_chat_feed_id=");
            sb.append(this.open_app_chat_feed_id);
        }
        if (this.is_bot != null) {
            sb.append(", is_bot=");
            sb.append(this.is_bot);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageData{");
        replace.append('}');
        return replace.toString();
    }

    public MessageData(String str, String str2, Integer num, String str3, Type type2, Channel channel2, String str4, Chat.Type type3, Chat.ChatMode chatMode, Boolean bool, Integer num2, String str5, String str6, Integer num3, String str7, List<String> list, Boolean bool2, String str8, Integer num4, Long l, Boolean bool3, String str9, String str10, Boolean bool4) {
        this(str, str2, num, str3, type2, channel2, str4, type3, chatMode, bool, num2, str5, str6, num3, str7, list, bool2, str8, num4, l, bool3, str9, str10, bool4, ByteString.EMPTY);
    }

    public MessageData(String str, String str2, Integer num, String str3, Type type2, Channel channel2, String str4, Chat.Type type3, Chat.ChatMode chatMode, Boolean bool, Integer num2, String str5, String str6, Integer num3, String str7, List<String> list, Boolean bool2, String str8, Integer num4, Long l, Boolean bool3, String str9, String str10, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urgent_id = str;
        this.message_id = str2;
        this.position = num;
        this.recaller_id = str3;
        this.type = type2;
        this.channel = channel2;
        this.chat_id = str4;
        this.chat_type = type3;
        this.chat_mode = chatMode;
        this.is_crypto = bool;
        this.new_message_count = num2;
        this.avatar_key = str5;
        this.avatar_path = str6;
        this.thread_message_position = num3;
        this.from_chatter_id = str7;
        this.image_urls = Internal.immutableCopyOf("image_urls", list);
        this.is_followed = bool2;
        this.thread_id = str8;
        this.channel_thread_position = num4;
        this.create_time = l;
        this.me_read = bool3;
        this.app_id = str9;
        this.open_app_chat_feed_id = str10;
        this.is_bot = bool4;
    }
}
