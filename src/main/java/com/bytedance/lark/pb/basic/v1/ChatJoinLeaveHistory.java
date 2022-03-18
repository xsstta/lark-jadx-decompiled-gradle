package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
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

public final class ChatJoinLeaveHistory extends Message<ChatJoinLeaveHistory, C14785a> {
    public static final ProtoAdapter<ChatJoinLeaveHistory> ADAPTER = new C14786b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN_ACTION;
    public static final ChatterType DEFAULT_CHATTER_TYPE = ChatterType.UNKNOWN;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final EventType DEFAULT_EVENT = EventType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String avatar_key;
    public final String chat_id;
    public final String chatter_id;
    public final String chatter_name;
    public final ChatterType chatter_type;
    public final Long create_time;
    public final EventType event;
    public final HistoryExtra extra;
    public final String id;

    public static final class ContentValue extends Message<ContentValue, C14781a> {
        public static final ProtoAdapter<ContentValue> ADAPTER = new C14782b();
        public static final ValueType DEFAULT_TYPE = ValueType.UNKNOWN_VALUE_TYPE;
        public static final Boolean DEFAULT_UNAUTHORIZED_DOC = false;
        private static final long serialVersionUID = 0;
        public final String display_text;
        public final String doc_url;
        public final String id;
        public final ValueType type;
        public final Boolean unauthorized_doc;

        public enum ValueType implements WireEnum {
            UNKNOWN_VALUE_TYPE(0),
            USER(1),
            BOT(2),
            CHAT(3),
            DOC(4);
            
            public static final ProtoAdapter<ValueType> ADAPTER = ProtoAdapter.newEnumAdapter(ValueType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ValueType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN_VALUE_TYPE;
                }
                if (i == 1) {
                    return USER;
                }
                if (i == 2) {
                    return BOT;
                }
                if (i == 3) {
                    return CHAT;
                }
                if (i != 4) {
                    return null;
                }
                return DOC;
            }

            private ValueType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory$ContentValue$b */
        private static final class C14782b extends ProtoAdapter<ContentValue> {
            C14782b() {
                super(FieldEncoding.LENGTH_DELIMITED, ContentValue.class);
            }

            /* renamed from: a */
            public int encodedSize(ContentValue contentValue) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (contentValue.id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, contentValue.id);
                } else {
                    i = 0;
                }
                if (contentValue.doc_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, contentValue.doc_url);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (contentValue.type != null) {
                    i3 = ValueType.ADAPTER.encodedSizeWithTag(3, contentValue.type);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (contentValue.display_text != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, contentValue.display_text);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (contentValue.unauthorized_doc != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, contentValue.unauthorized_doc);
                }
                return i8 + i5 + contentValue.unknownFields().size();
            }

            /* renamed from: a */
            public ContentValue decode(ProtoReader protoReader) throws IOException {
                C14781a aVar = new C14781a();
                aVar.f39061a = "";
                aVar.f39062b = "";
                aVar.f39063c = ValueType.UNKNOWN_VALUE_TYPE;
                aVar.f39064d = "";
                aVar.f39065e = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39061a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39062b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f39063c = ValueType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 4) {
                        aVar.f39064d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39065e = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ContentValue contentValue) throws IOException {
                if (contentValue.id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contentValue.id);
                }
                if (contentValue.doc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, contentValue.doc_url);
                }
                if (contentValue.type != null) {
                    ValueType.ADAPTER.encodeWithTag(protoWriter, 3, contentValue.type);
                }
                if (contentValue.display_text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, contentValue.display_text);
                }
                if (contentValue.unauthorized_doc != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, contentValue.unauthorized_doc);
                }
                protoWriter.writeBytes(contentValue.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory$ContentValue$a */
        public static final class C14781a extends Message.Builder<ContentValue, C14781a> {

            /* renamed from: a */
            public String f39061a;

            /* renamed from: b */
            public String f39062b;

            /* renamed from: c */
            public ValueType f39063c;

            /* renamed from: d */
            public String f39064d;

            /* renamed from: e */
            public Boolean f39065e;

            /* renamed from: a */
            public ContentValue build() {
                return new ContentValue(this.f39061a, this.f39062b, this.f39063c, this.f39064d, this.f39065e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14781a newBuilder() {
            C14781a aVar = new C14781a();
            aVar.f39061a = this.id;
            aVar.f39062b = this.doc_url;
            aVar.f39063c = this.type;
            aVar.f39064d = this.display_text;
            aVar.f39065e = this.unauthorized_doc;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ContentValue");
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.doc_url != null) {
                sb.append(", doc_url=");
                sb.append(this.doc_url);
            }
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.display_text != null) {
                sb.append(", display_text=");
                sb.append(this.display_text);
            }
            if (this.unauthorized_doc != null) {
                sb.append(", unauthorized_doc=");
                sb.append(this.unauthorized_doc);
            }
            StringBuilder replace = sb.replace(0, 2, "ContentValue{");
            replace.append('}');
            return replace.toString();
        }

        public ContentValue(String str, String str2, ValueType valueType, String str3, Boolean bool) {
            this(str, str2, valueType, str3, bool, ByteString.EMPTY);
        }

        public ContentValue(String str, String str2, ValueType valueType, String str3, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.doc_url = str2;
            this.type = valueType;
            this.display_text = str3;
            this.unauthorized_doc = bool;
        }
    }

    public enum Action implements WireEnum {
        UNKNOWN_ACTION(0),
        JOIN(1),
        LEAVE(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ACTION;
            }
            if (i == 1) {
                return JOIN;
            }
            if (i != 2) {
                return null;
            }
            return LEAVE;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum ChatterType implements WireEnum {
        UNKNOWN(0),
        USER(1),
        BOT(2);
        
        public static final ProtoAdapter<ChatterType> ADAPTER = ProtoAdapter.newEnumAdapter(ChatterType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatterType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return null;
            }
            return BOT;
        }

        private ChatterType(int i) {
            this.value = i;
        }
    }

    public enum EventType implements WireEnum {
        UNKNOWN_TYPE(0),
        DEL_SELF(1),
        DEL_ADMIN(2),
        INV_MESSAGE_CARD(10),
        INV_QR_CODE(11),
        INV_CHATTER(12),
        INV_DOC(13),
        INV_SEARCH(14),
        INV_SELF(15),
        INV_P2P_CHAT(16),
        INV_GROUP_CHAT(17);
        
        public static final ProtoAdapter<EventType> ADAPTER = ProtoAdapter.newEnumAdapter(EventType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return DEL_SELF;
            }
            if (i == 2) {
                return DEL_ADMIN;
            }
            switch (i) {
                case 10:
                    return INV_MESSAGE_CARD;
                case 11:
                    return INV_QR_CODE;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return INV_CHATTER;
                case 13:
                    return INV_DOC;
                case 14:
                    return INV_SEARCH;
                case 15:
                    return INV_SELF;
                case 16:
                    return INV_P2P_CHAT;
                case 17:
                    return INV_GROUP_CHAT;
                default:
                    return null;
            }
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory$b */
    private static final class C14786b extends ProtoAdapter<ChatJoinLeaveHistory> {
        C14786b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatJoinLeaveHistory.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatJoinLeaveHistory chatJoinLeaveHistory) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (chatJoinLeaveHistory.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatJoinLeaveHistory.id);
            } else {
                i = 0;
            }
            if (chatJoinLeaveHistory.action != null) {
                i2 = Action.ADAPTER.encodedSizeWithTag(2, chatJoinLeaveHistory.action);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (chatJoinLeaveHistory.event != null) {
                i3 = EventType.ADAPTER.encodedSizeWithTag(3, chatJoinLeaveHistory.event);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (chatJoinLeaveHistory.chatter_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, chatJoinLeaveHistory.chatter_id);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (chatJoinLeaveHistory.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, chatJoinLeaveHistory.avatar_key);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (chatJoinLeaveHistory.chatter_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, chatJoinLeaveHistory.chatter_name);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (chatJoinLeaveHistory.chat_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, chatJoinLeaveHistory.chat_id);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (chatJoinLeaveHistory.create_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, chatJoinLeaveHistory.create_time);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (chatJoinLeaveHistory.extra != null) {
                i9 = HistoryExtra.ADAPTER.encodedSizeWithTag(9, chatJoinLeaveHistory.extra);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (chatJoinLeaveHistory.chatter_type != null) {
                i10 = ChatterType.ADAPTER.encodedSizeWithTag(10, chatJoinLeaveHistory.chatter_type);
            }
            return i18 + i10 + chatJoinLeaveHistory.unknownFields().size();
        }

        /* renamed from: a */
        public ChatJoinLeaveHistory decode(ProtoReader protoReader) throws IOException {
            C14785a aVar = new C14785a();
            aVar.f39069a = "";
            aVar.f39070b = Action.UNKNOWN_ACTION;
            aVar.f39071c = EventType.UNKNOWN_TYPE;
            aVar.f39072d = "";
            aVar.f39073e = "";
            aVar.f39074f = "";
            aVar.f39075g = "";
            aVar.f39076h = 0L;
            aVar.f39078j = ChatterType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39069a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f39070b = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f39071c = EventType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f39072d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39073e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39074f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39075g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39076h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39077i = HistoryExtra.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f39078j = ChatterType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, ChatJoinLeaveHistory chatJoinLeaveHistory) throws IOException {
            if (chatJoinLeaveHistory.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatJoinLeaveHistory.id);
            }
            if (chatJoinLeaveHistory.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 2, chatJoinLeaveHistory.action);
            }
            if (chatJoinLeaveHistory.event != null) {
                EventType.ADAPTER.encodeWithTag(protoWriter, 3, chatJoinLeaveHistory.event);
            }
            if (chatJoinLeaveHistory.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, chatJoinLeaveHistory.chatter_id);
            }
            if (chatJoinLeaveHistory.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, chatJoinLeaveHistory.avatar_key);
            }
            if (chatJoinLeaveHistory.chatter_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, chatJoinLeaveHistory.chatter_name);
            }
            if (chatJoinLeaveHistory.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, chatJoinLeaveHistory.chat_id);
            }
            if (chatJoinLeaveHistory.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, chatJoinLeaveHistory.create_time);
            }
            if (chatJoinLeaveHistory.extra != null) {
                HistoryExtra.ADAPTER.encodeWithTag(protoWriter, 9, chatJoinLeaveHistory.extra);
            }
            if (chatJoinLeaveHistory.chatter_type != null) {
                ChatterType.ADAPTER.encodeWithTag(protoWriter, 10, chatJoinLeaveHistory.chatter_type);
            }
            protoWriter.writeBytes(chatJoinLeaveHistory.unknownFields());
        }
    }

    public static final class HistoryExtra extends Message<HistoryExtra, C14783a> {
        public static final ProtoAdapter<HistoryExtra> ADAPTER = new C14784b();
        private static final long serialVersionUID = 0;
        public final Map<String, ContentValue> content_values;
        public final String template;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory$HistoryExtra$a */
        public static final class C14783a extends Message.Builder<HistoryExtra, C14783a> {

            /* renamed from: a */
            public String f39066a;

            /* renamed from: b */
            public Map<String, ContentValue> f39067b = Internal.newMutableMap();

            /* renamed from: a */
            public HistoryExtra build() {
                return new HistoryExtra(this.f39066a, this.f39067b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory$HistoryExtra$b */
        private static final class C14784b extends ProtoAdapter<HistoryExtra> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, ContentValue>> f39068a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ContentValue.ADAPTER);

            C14784b() {
                super(FieldEncoding.LENGTH_DELIMITED, HistoryExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(HistoryExtra historyExtra) {
                int i;
                if (historyExtra.template != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, historyExtra.template);
                } else {
                    i = 0;
                }
                return i + this.f39068a.encodedSizeWithTag(2, historyExtra.content_values) + historyExtra.unknownFields().size();
            }

            /* renamed from: a */
            public HistoryExtra decode(ProtoReader protoReader) throws IOException {
                C14783a aVar = new C14783a();
                aVar.f39066a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39066a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39067b.putAll(this.f39068a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, HistoryExtra historyExtra) throws IOException {
                if (historyExtra.template != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, historyExtra.template);
                }
                this.f39068a.encodeWithTag(protoWriter, 2, historyExtra.content_values);
                protoWriter.writeBytes(historyExtra.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14783a newBuilder() {
            C14783a aVar = new C14783a();
            aVar.f39066a = this.template;
            aVar.f39067b = Internal.copyOf("content_values", this.content_values);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "HistoryExtra");
            StringBuilder sb = new StringBuilder();
            if (this.template != null) {
                sb.append(", template=");
                sb.append(this.template);
            }
            if (!this.content_values.isEmpty()) {
                sb.append(", content_values=");
                sb.append(this.content_values);
            }
            StringBuilder replace = sb.replace(0, 2, "HistoryExtra{");
            replace.append('}');
            return replace.toString();
        }

        public HistoryExtra(String str, Map<String, ContentValue> map) {
            this(str, map, ByteString.EMPTY);
        }

        public HistoryExtra(String str, Map<String, ContentValue> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.template = str;
            this.content_values = Internal.immutableCopyOf("content_values", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory$a */
    public static final class C14785a extends Message.Builder<ChatJoinLeaveHistory, C14785a> {

        /* renamed from: a */
        public String f39069a;

        /* renamed from: b */
        public Action f39070b;

        /* renamed from: c */
        public EventType f39071c;

        /* renamed from: d */
        public String f39072d;

        /* renamed from: e */
        public String f39073e;

        /* renamed from: f */
        public String f39074f;

        /* renamed from: g */
        public String f39075g;

        /* renamed from: h */
        public Long f39076h;

        /* renamed from: i */
        public HistoryExtra f39077i;

        /* renamed from: j */
        public ChatterType f39078j;

        /* renamed from: a */
        public ChatJoinLeaveHistory build() {
            return new ChatJoinLeaveHistory(this.f39069a, this.f39070b, this.f39071c, this.f39072d, this.f39073e, this.f39074f, this.f39075g, this.f39076h, this.f39077i, this.f39078j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14785a newBuilder() {
        C14785a aVar = new C14785a();
        aVar.f39069a = this.id;
        aVar.f39070b = this.action;
        aVar.f39071c = this.event;
        aVar.f39072d = this.chatter_id;
        aVar.f39073e = this.avatar_key;
        aVar.f39074f = this.chatter_name;
        aVar.f39075g = this.chat_id;
        aVar.f39076h = this.create_time;
        aVar.f39077i = this.extra;
        aVar.f39078j = this.chatter_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChatJoinLeaveHistory");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.chatter_name != null) {
            sb.append(", chatter_name=");
            sb.append(this.chatter_name);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.chatter_type != null) {
            sb.append(", chatter_type=");
            sb.append(this.chatter_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatJoinLeaveHistory{");
        replace.append('}');
        return replace.toString();
    }

    public ChatJoinLeaveHistory(String str, Action action2, EventType eventType, String str2, String str3, String str4, String str5, Long l, HistoryExtra historyExtra, ChatterType chatterType) {
        this(str, action2, eventType, str2, str3, str4, str5, l, historyExtra, chatterType, ByteString.EMPTY);
    }

    public ChatJoinLeaveHistory(String str, Action action2, EventType eventType, String str2, String str3, String str4, String str5, Long l, HistoryExtra historyExtra, ChatterType chatterType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.action = action2;
        this.event = eventType;
        this.chatter_id = str2;
        this.avatar_key = str3;
        this.chatter_name = str4;
        this.chat_id = str5;
        this.create_time = l;
        this.extra = historyExtra;
        this.chatter_type = chatterType;
    }
}
