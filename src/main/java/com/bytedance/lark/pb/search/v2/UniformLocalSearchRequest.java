package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v2.BaseEntity;
import com.bytedance.lark.pb.search.v2.BaseEnum;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UniformLocalSearchRequest extends Message<UniformLocalSearchRequest, C19055a> {
    public static final ProtoAdapter<UniformLocalSearchRequest> ADAPTER = new C19056b();
    public static final BaseEnum.LocalAbility DEFAULT_ABILITY = BaseEnum.LocalAbility.CHATTER;
    public static final Integer DEFAULT_BEGIN = 0;
    public static final Integer DEFAULT_END = 10;
    private static final long serialVersionUID = 0;
    public final BaseEnum.LocalAbility ability;
    public final Integer begin;
    public final ChatFilterParam chat_filter_param;
    public final ChatterFilterParam chatter_filter_param;
    public final Integer end;
    public final MessageFilterParam message_filter_param;
    public final String query;

    public static final class ChatFilterParam extends Message<ChatFilterParam, C19049a> {
        public static final ProtoAdapter<ChatFilterParam> ADAPTER = new C19050b();
        private static final long serialVersionUID = 0;
        public final List<BaseEntity.ChatMode> chat_modes;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$ChatFilterParam$b */
        private static final class C19050b extends ProtoAdapter<ChatFilterParam> {
            C19050b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatFilterParam.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatFilterParam chatFilterParam) {
                return BaseEntity.ChatMode.ADAPTER.asRepeated().encodedSizeWithTag(1, chatFilterParam.chat_modes) + chatFilterParam.unknownFields().size();
            }

            /* renamed from: a */
            public ChatFilterParam decode(ProtoReader protoReader) throws IOException {
                C19049a aVar = new C19049a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f47129a.add(BaseEntity.ChatMode.ADAPTER.decode(protoReader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatFilterParam chatFilterParam) throws IOException {
                BaseEntity.ChatMode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatFilterParam.chat_modes);
                protoWriter.writeBytes(chatFilterParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$ChatFilterParam$a */
        public static final class C19049a extends Message.Builder<ChatFilterParam, C19049a> {

            /* renamed from: a */
            public List<BaseEntity.ChatMode> f47129a = Internal.newMutableList();

            /* renamed from: a */
            public ChatFilterParam build() {
                return new ChatFilterParam(this.f47129a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19049a newBuilder() {
            C19049a aVar = new C19049a();
            aVar.f47129a = Internal.copyOf("chat_modes", this.chat_modes);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ChatFilterParam");
            StringBuilder sb = new StringBuilder();
            if (!this.chat_modes.isEmpty()) {
                sb.append(", chat_modes=");
                sb.append(this.chat_modes);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatFilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public ChatFilterParam(List<BaseEntity.ChatMode> list) {
            this(list, ByteString.EMPTY);
        }

        public ChatFilterParam(List<BaseEntity.ChatMode> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_modes = Internal.immutableCopyOf("chat_modes", list);
        }
    }

    public static final class ChatterFilterParam extends Message<ChatterFilterParam, C19051a> {
        public static final ProtoAdapter<ChatterFilterParam> ADAPTER = new C19052b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$ChatterFilterParam$b */
        private static final class C19052b extends ProtoAdapter<ChatterFilterParam> {
            C19052b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatterFilterParam.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatterFilterParam chatterFilterParam) {
                return chatterFilterParam.unknownFields().size();
            }

            /* renamed from: a */
            public ChatterFilterParam decode(ProtoReader protoReader) throws IOException {
                C19051a aVar = new C19051a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatterFilterParam chatterFilterParam) throws IOException {
                protoWriter.writeBytes(chatterFilterParam.unknownFields());
            }
        }

        public ChatterFilterParam() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$ChatterFilterParam$a */
        public static final class C19051a extends Message.Builder<ChatterFilterParam, C19051a> {
            /* renamed from: a */
            public ChatterFilterParam build() {
                return new ChatterFilterParam(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19051a newBuilder() {
            C19051a aVar = new C19051a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ChatterFilterParam");
            StringBuilder replace = new StringBuilder().replace(0, 2, "ChatterFilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public ChatterFilterParam(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class MessageFilterParam extends Message<MessageFilterParam, C19053a> {
        public static final ProtoAdapter<MessageFilterParam> ADAPTER = new C19054b();
        public static final Long DEFAULT_MESSAGE_END_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final ChatFilterParam chat_filter_param;
        public final List<String> chat_ids;
        public final List<String> message_creator_ids;
        public final Long message_end_time;
        public final Long message_start_time;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$MessageFilterParam$b */
        private static final class C19054b extends ProtoAdapter<MessageFilterParam> {
            C19054b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageFilterParam.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageFilterParam messageFilterParam) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, messageFilterParam.chat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, messageFilterParam.message_creator_ids);
                int i3 = 0;
                if (messageFilterParam.message_start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(3, messageFilterParam.message_start_time);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (messageFilterParam.message_end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, messageFilterParam.message_end_time);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (messageFilterParam.chat_filter_param != null) {
                    i3 = ChatFilterParam.ADAPTER.encodedSizeWithTag(5, messageFilterParam.chat_filter_param);
                }
                return i5 + i3 + messageFilterParam.unknownFields().size();
            }

            /* renamed from: a */
            public MessageFilterParam decode(ProtoReader protoReader) throws IOException {
                C19053a aVar = new C19053a();
                aVar.f47132c = 0L;
                aVar.f47133d = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47130a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f47131b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f47132c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f47133d = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47134e = ChatFilterParam.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageFilterParam messageFilterParam) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, messageFilterParam.chat_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, messageFilterParam.message_creator_ids);
                if (messageFilterParam.message_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageFilterParam.message_start_time);
                }
                if (messageFilterParam.message_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageFilterParam.message_end_time);
                }
                if (messageFilterParam.chat_filter_param != null) {
                    ChatFilterParam.ADAPTER.encodeWithTag(protoWriter, 5, messageFilterParam.chat_filter_param);
                }
                protoWriter.writeBytes(messageFilterParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$MessageFilterParam$a */
        public static final class C19053a extends Message.Builder<MessageFilterParam, C19053a> {

            /* renamed from: a */
            public List<String> f47130a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f47131b = Internal.newMutableList();

            /* renamed from: c */
            public Long f47132c;

            /* renamed from: d */
            public Long f47133d;

            /* renamed from: e */
            public ChatFilterParam f47134e;

            /* renamed from: a */
            public MessageFilterParam build() {
                return new MessageFilterParam(this.f47130a, this.f47131b, this.f47132c, this.f47133d, this.f47134e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19053a newBuilder() {
            C19053a aVar = new C19053a();
            aVar.f47130a = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f47131b = Internal.copyOf("message_creator_ids", this.message_creator_ids);
            aVar.f47132c = this.message_start_time;
            aVar.f47133d = this.message_end_time;
            aVar.f47134e = this.chat_filter_param;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "MessageFilterParam");
            StringBuilder sb = new StringBuilder();
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (!this.message_creator_ids.isEmpty()) {
                sb.append(", message_creator_ids=");
                sb.append(this.message_creator_ids);
            }
            if (this.message_start_time != null) {
                sb.append(", message_start_time=");
                sb.append(this.message_start_time);
            }
            if (this.message_end_time != null) {
                sb.append(", message_end_time=");
                sb.append(this.message_end_time);
            }
            if (this.chat_filter_param != null) {
                sb.append(", chat_filter_param=");
                sb.append(this.chat_filter_param);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageFilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public MessageFilterParam(List<String> list, List<String> list2, Long l, Long l2, ChatFilterParam chatFilterParam) {
            this(list, list2, l, l2, chatFilterParam, ByteString.EMPTY);
        }

        public MessageFilterParam(List<String> list, List<String> list2, Long l, Long l2, ChatFilterParam chatFilterParam, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
            this.message_creator_ids = Internal.immutableCopyOf("message_creator_ids", list2);
            this.message_start_time = l;
            this.message_end_time = l2;
            this.chat_filter_param = chatFilterParam;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$b */
    private static final class C19056b extends ProtoAdapter<UniformLocalSearchRequest> {
        C19056b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniformLocalSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UniformLocalSearchRequest uniformLocalSearchRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uniformLocalSearchRequest.query);
            int i6 = 0;
            if (uniformLocalSearchRequest.begin != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, uniformLocalSearchRequest.begin);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (uniformLocalSearchRequest.end != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, uniformLocalSearchRequest.end);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (uniformLocalSearchRequest.ability != null) {
                i3 = BaseEnum.LocalAbility.ADAPTER.encodedSizeWithTag(4, uniformLocalSearchRequest.ability);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (uniformLocalSearchRequest.chat_filter_param != null) {
                i4 = ChatFilterParam.ADAPTER.encodedSizeWithTag(5, uniformLocalSearchRequest.chat_filter_param);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (uniformLocalSearchRequest.message_filter_param != null) {
                i5 = MessageFilterParam.ADAPTER.encodedSizeWithTag(6, uniformLocalSearchRequest.message_filter_param);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (uniformLocalSearchRequest.chatter_filter_param != null) {
                i6 = ChatterFilterParam.ADAPTER.encodedSizeWithTag(7, uniformLocalSearchRequest.chatter_filter_param);
            }
            return i11 + i6 + uniformLocalSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UniformLocalSearchRequest decode(ProtoReader protoReader) throws IOException {
            C19055a aVar = new C19055a();
            aVar.f47135a = "";
            aVar.f47136b = 0;
            aVar.f47137c = 10;
            aVar.f47138d = BaseEnum.LocalAbility.CHATTER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47135a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47136b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47137c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f47138d = BaseEnum.LocalAbility.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f47139e = ChatFilterParam.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47140f = MessageFilterParam.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47141g = ChatterFilterParam.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UniformLocalSearchRequest uniformLocalSearchRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uniformLocalSearchRequest.query);
            if (uniformLocalSearchRequest.begin != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uniformLocalSearchRequest.begin);
            }
            if (uniformLocalSearchRequest.end != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, uniformLocalSearchRequest.end);
            }
            if (uniformLocalSearchRequest.ability != null) {
                BaseEnum.LocalAbility.ADAPTER.encodeWithTag(protoWriter, 4, uniformLocalSearchRequest.ability);
            }
            if (uniformLocalSearchRequest.chat_filter_param != null) {
                ChatFilterParam.ADAPTER.encodeWithTag(protoWriter, 5, uniformLocalSearchRequest.chat_filter_param);
            }
            if (uniformLocalSearchRequest.message_filter_param != null) {
                MessageFilterParam.ADAPTER.encodeWithTag(protoWriter, 6, uniformLocalSearchRequest.message_filter_param);
            }
            if (uniformLocalSearchRequest.chatter_filter_param != null) {
                ChatterFilterParam.ADAPTER.encodeWithTag(protoWriter, 7, uniformLocalSearchRequest.chatter_filter_param);
            }
            protoWriter.writeBytes(uniformLocalSearchRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19055a newBuilder() {
        C19055a aVar = new C19055a();
        aVar.f47135a = this.query;
        aVar.f47136b = this.begin;
        aVar.f47137c = this.end;
        aVar.f47138d = this.ability;
        aVar.f47139e = this.chat_filter_param;
        aVar.f47140f = this.message_filter_param;
        aVar.f47141g = this.chatter_filter_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UniformLocalSearchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        if (this.ability != null) {
            sb.append(", ability=");
            sb.append(this.ability);
        }
        if (this.chat_filter_param != null) {
            sb.append(", chat_filter_param=");
            sb.append(this.chat_filter_param);
        }
        if (this.message_filter_param != null) {
            sb.append(", message_filter_param=");
            sb.append(this.message_filter_param);
        }
        if (this.chatter_filter_param != null) {
            sb.append(", chatter_filter_param=");
            sb.append(this.chatter_filter_param);
        }
        StringBuilder replace = sb.replace(0, 2, "UniformLocalSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest$a */
    public static final class C19055a extends Message.Builder<UniformLocalSearchRequest, C19055a> {

        /* renamed from: a */
        public String f47135a;

        /* renamed from: b */
        public Integer f47136b;

        /* renamed from: c */
        public Integer f47137c;

        /* renamed from: d */
        public BaseEnum.LocalAbility f47138d;

        /* renamed from: e */
        public ChatFilterParam f47139e;

        /* renamed from: f */
        public MessageFilterParam f47140f;

        /* renamed from: g */
        public ChatterFilterParam f47141g;

        /* renamed from: a */
        public UniformLocalSearchRequest build() {
            String str = this.f47135a;
            if (str != null) {
                return new UniformLocalSearchRequest(str, this.f47136b, this.f47137c, this.f47138d, this.f47139e, this.f47140f, this.f47141g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY);
        }

        /* renamed from: a */
        public C19055a mo65203a(BaseEnum.LocalAbility localAbility) {
            this.f47138d = localAbility;
            return this;
        }

        /* renamed from: b */
        public C19055a mo65210b(Integer num) {
            this.f47137c = num;
            return this;
        }

        /* renamed from: a */
        public C19055a mo65204a(ChatFilterParam chatFilterParam) {
            this.f47139e = chatFilterParam;
            return this;
        }

        /* renamed from: a */
        public C19055a mo65205a(ChatterFilterParam chatterFilterParam) {
            this.f47141g = chatterFilterParam;
            return this;
        }

        /* renamed from: a */
        public C19055a mo65206a(MessageFilterParam messageFilterParam) {
            this.f47140f = messageFilterParam;
            return this;
        }

        /* renamed from: a */
        public C19055a mo65207a(Integer num) {
            this.f47136b = num;
            return this;
        }

        /* renamed from: a */
        public C19055a mo65208a(String str) {
            this.f47135a = str;
            return this;
        }
    }

    public UniformLocalSearchRequest(String str, Integer num, Integer num2, BaseEnum.LocalAbility localAbility, ChatFilterParam chatFilterParam, MessageFilterParam messageFilterParam, ChatterFilterParam chatterFilterParam) {
        this(str, num, num2, localAbility, chatFilterParam, messageFilterParam, chatterFilterParam, ByteString.EMPTY);
    }

    public UniformLocalSearchRequest(String str, Integer num, Integer num2, BaseEnum.LocalAbility localAbility, ChatFilterParam chatFilterParam, MessageFilterParam messageFilterParam, ChatterFilterParam chatterFilterParam, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.begin = num;
        this.end = num2;
        this.ability = localAbility;
        this.chat_filter_param = chatFilterParam;
        this.message_filter_param = messageFilterParam;
        this.chatter_filter_param = chatterFilterParam;
    }
}
