package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class ChatFilterParam extends Message<ChatFilterParam, C18813a> {
    public static final ProtoAdapter<ChatFilterParam> ADAPTER = new C18814b();
    public static final SortType DEFAULT_SORT_TYPE = SortType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final List<String> chat_member_ids;
    public final String chat_message_key;
    public final List<ChatMode> chat_modes;
    public final List<ChatType> chat_types;
    public final List<String> exclude_ids;
    public final SortType sort_type;

    public enum ChatMode implements WireEnum {
        UNLIMITED(0),
        NORMAL(1),
        THREAD(2);
        
        public static final ProtoAdapter<ChatMode> ADAPTER = ProtoAdapter.newEnumAdapter(ChatMode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatMode fromValue(int i) {
            if (i == 0) {
                return UNLIMITED;
            }
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return THREAD;
        }

        private ChatMode(int i) {
            this.value = i;
        }
    }

    public enum ChatType implements WireEnum {
        UNKNOWNTAB(0),
        PRIVATE(1),
        OUTER(2),
        PUBLIC_JOIN(3),
        PUBLIC_ABSENT(4);
        
        public static final ProtoAdapter<ChatType> ADAPTER = ProtoAdapter.newEnumAdapter(ChatType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatType fromValue(int i) {
            if (i == 0) {
                return UNKNOWNTAB;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return OUTER;
            }
            if (i == 3) {
                return PUBLIC_JOIN;
            }
            if (i != 4) {
                return null;
            }
            return PUBLIC_ABSENT;
        }

        private ChatType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.ChatFilterParam$b */
    private static final class C18814b extends ProtoAdapter<ChatFilterParam> {
        C18814b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatFilterParam chatFilterParam) {
            int i;
            int encodedSizeWithTag = ChatType.ADAPTER.asRepeated().encodedSizeWithTag(1, chatFilterParam.chat_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, chatFilterParam.chat_member_ids);
            int i2 = 0;
            if (chatFilterParam.chat_message_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, chatFilterParam.chat_message_key);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ChatMode.ADAPTER.asRepeated().encodedSizeWithTag(4, chatFilterParam.chat_modes);
            if (chatFilterParam.sort_type != null) {
                i2 = SortType.ADAPTER.encodedSizeWithTag(5, chatFilterParam.sort_type);
            }
            return encodedSizeWithTag2 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, chatFilterParam.exclude_ids) + chatFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public ChatFilterParam decode(ProtoReader protoReader) throws IOException {
            C18813a aVar = new C18813a();
            aVar.f46381c = "";
            aVar.f46383e = SortType.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f46379a.add(ChatType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f46380b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f46381c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f46382d.add(ChatMode.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f46383e = SortType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 6:
                            aVar.f46384f.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, ChatFilterParam chatFilterParam) throws IOException {
            ChatType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatFilterParam.chat_types);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, chatFilterParam.chat_member_ids);
            if (chatFilterParam.chat_message_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatFilterParam.chat_message_key);
            }
            ChatMode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, chatFilterParam.chat_modes);
            if (chatFilterParam.sort_type != null) {
                SortType.ADAPTER.encodeWithTag(protoWriter, 5, chatFilterParam.sort_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, chatFilterParam.exclude_ids);
            protoWriter.writeBytes(chatFilterParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.ChatFilterParam$a */
    public static final class C18813a extends Message.Builder<ChatFilterParam, C18813a> {

        /* renamed from: a */
        public List<ChatType> f46379a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f46380b = Internal.newMutableList();

        /* renamed from: c */
        public String f46381c;

        /* renamed from: d */
        public List<ChatMode> f46382d = Internal.newMutableList();

        /* renamed from: e */
        public SortType f46383e;

        /* renamed from: f */
        public List<String> f46384f = Internal.newMutableList();

        /* renamed from: a */
        public ChatFilterParam build() {
            return new ChatFilterParam(this.f46379a, this.f46380b, this.f46381c, this.f46382d, this.f46383e, this.f46384f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18813a mo64597a(String str) {
            this.f46381c = str;
            return this;
        }

        /* renamed from: a */
        public C18813a mo64598a(List<ChatType> list) {
            Internal.checkElementsNotNull(list);
            this.f46379a = list;
            return this;
        }

        /* renamed from: b */
        public C18813a mo64600b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f46380b = list;
            return this;
        }

        /* renamed from: c */
        public C18813a mo64601c(List<ChatMode> list) {
            Internal.checkElementsNotNull(list);
            this.f46382d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18813a newBuilder() {
        C18813a aVar = new C18813a();
        aVar.f46379a = Internal.copyOf("chat_types", this.chat_types);
        aVar.f46380b = Internal.copyOf("chat_member_ids", this.chat_member_ids);
        aVar.f46381c = this.chat_message_key;
        aVar.f46382d = Internal.copyOf("chat_modes", this.chat_modes);
        aVar.f46383e = this.sort_type;
        aVar.f46384f = Internal.copyOf("exclude_ids", this.exclude_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ChatFilterParam");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_types.isEmpty()) {
            sb.append(", chat_types=");
            sb.append(this.chat_types);
        }
        if (!this.chat_member_ids.isEmpty()) {
            sb.append(", chat_member_ids=");
            sb.append(this.chat_member_ids);
        }
        if (this.chat_message_key != null) {
            sb.append(", chat_message_key=");
            sb.append(this.chat_message_key);
        }
        if (!this.chat_modes.isEmpty()) {
            sb.append(", chat_modes=");
            sb.append(this.chat_modes);
        }
        if (this.sort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.sort_type);
        }
        if (!this.exclude_ids.isEmpty()) {
            sb.append(", exclude_ids=");
            sb.append(this.exclude_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public ChatFilterParam(List<ChatType> list, List<String> list2, String str, List<ChatMode> list3, SortType sortType, List<String> list4) {
        this(list, list2, str, list3, sortType, list4, ByteString.EMPTY);
    }

    public ChatFilterParam(List<ChatType> list, List<String> list2, String str, List<ChatMode> list3, SortType sortType, List<String> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_types = Internal.immutableCopyOf("chat_types", list);
        this.chat_member_ids = Internal.immutableCopyOf("chat_member_ids", list2);
        this.chat_message_key = str;
        this.chat_modes = Internal.immutableCopyOf("chat_modes", list3);
        this.sort_type = sortType;
        this.exclude_ids = Internal.immutableCopyOf("exclude_ids", list4);
    }
}
