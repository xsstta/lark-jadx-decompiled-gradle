package com.ss.android.lark.pb.searches;

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

public final class ChatFilterParam extends Message<ChatFilterParam, C50008a> {
    public static final ProtoAdapter<ChatFilterParam> ADAPTER = new C50009b();
    private static final long serialVersionUID = 0;
    public final List<String> mchat_member_ids;
    public final String mchat_message_key;
    public final List<ChatMode> mchat_modes;
    public final List<ChatType> mchat_types;
    public final List<String> mexclude_ids;
    public final SortType msort_type;

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

    /* renamed from: com.ss.android.lark.pb.searches.ChatFilterParam$b */
    private static final class C50009b extends ProtoAdapter<ChatFilterParam> {
        C50009b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatFilterParam chatFilterParam) {
            int i;
            int encodedSizeWithTag = ChatType.ADAPTER.asRepeated().encodedSizeWithTag(1, chatFilterParam.mchat_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, chatFilterParam.mchat_member_ids);
            int i2 = 0;
            if (chatFilterParam.mchat_message_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, chatFilterParam.mchat_message_key);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ChatMode.ADAPTER.asRepeated().encodedSizeWithTag(4, chatFilterParam.mchat_modes);
            if (chatFilterParam.msort_type != null) {
                i2 = SortType.ADAPTER.encodedSizeWithTag(5, chatFilterParam.msort_type);
            }
            return encodedSizeWithTag2 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, chatFilterParam.mexclude_ids) + chatFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public ChatFilterParam decode(ProtoReader protoReader) throws IOException {
            C50008a aVar = new C50008a();
            aVar.f125061c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f125059a.add(ChatType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f125060b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f125061c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f125062d.add(ChatMode.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f125063e = SortType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 6:
                            aVar.f125064f.add(ProtoAdapter.STRING.decode(protoReader));
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
            ChatType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatFilterParam.mchat_types);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, chatFilterParam.mchat_member_ids);
            if (chatFilterParam.mchat_message_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatFilterParam.mchat_message_key);
            }
            ChatMode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, chatFilterParam.mchat_modes);
            if (chatFilterParam.msort_type != null) {
                SortType.ADAPTER.encodeWithTag(protoWriter, 5, chatFilterParam.msort_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, chatFilterParam.mexclude_ids);
            protoWriter.writeBytes(chatFilterParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.ChatFilterParam$a */
    public static final class C50008a extends Message.Builder<ChatFilterParam, C50008a> {

        /* renamed from: a */
        public List<ChatType> f125059a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f125060b = Internal.newMutableList();

        /* renamed from: c */
        public String f125061c;

        /* renamed from: d */
        public List<ChatMode> f125062d = Internal.newMutableList();

        /* renamed from: e */
        public SortType f125063e;

        /* renamed from: f */
        public List<String> f125064f = Internal.newMutableList();

        /* renamed from: a */
        public ChatFilterParam build() {
            return new ChatFilterParam(this.f125059a, this.f125060b, this.f125061c, this.f125062d, this.f125063e, this.f125064f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50008a newBuilder() {
        C50008a aVar = new C50008a();
        aVar.f125059a = Internal.copyOf("mchat_types", this.mchat_types);
        aVar.f125060b = Internal.copyOf("mchat_member_ids", this.mchat_member_ids);
        aVar.f125061c = this.mchat_message_key;
        aVar.f125062d = Internal.copyOf("mchat_modes", this.mchat_modes);
        aVar.f125063e = this.msort_type;
        aVar.f125064f = Internal.copyOf("mexclude_ids", this.mexclude_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mchat_types.isEmpty()) {
            sb.append(", chat_types=");
            sb.append(this.mchat_types);
        }
        if (!this.mchat_member_ids.isEmpty()) {
            sb.append(", chat_member_ids=");
            sb.append(this.mchat_member_ids);
        }
        if (this.mchat_message_key != null) {
            sb.append(", chat_message_key=");
            sb.append(this.mchat_message_key);
        }
        if (!this.mchat_modes.isEmpty()) {
            sb.append(", chat_modes=");
            sb.append(this.mchat_modes);
        }
        if (this.msort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.msort_type);
        }
        if (!this.mexclude_ids.isEmpty()) {
            sb.append(", exclude_ids=");
            sb.append(this.mexclude_ids);
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
        this.mchat_types = Internal.immutableCopyOf("mchat_types", list);
        this.mchat_member_ids = Internal.immutableCopyOf("mchat_member_ids", list2);
        this.mchat_message_key = str;
        this.mchat_modes = Internal.immutableCopyOf("mchat_modes", list3);
        this.msort_type = sortType;
        this.mexclude_ids = Internal.immutableCopyOf("mexclude_ids", list4);
    }
}
