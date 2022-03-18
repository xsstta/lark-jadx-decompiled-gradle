package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Message;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MessageFilterParam extends Message<MessageFilterParam, C50020a> {
    public static final ProtoAdapter<MessageFilterParam> ADAPTER = new C50021b();
    private static final long serialVersionUID = 0;
    public final List<String> mchat_at_user_ids;
    public final List<String> mexclude_ids;
    public final Message.Type mmessage_type;
    public final List<Message.Type> mmessage_types;
    public final List<MessageFromType> mmust_from_types;
    public final List<MessageFromType> mmust_not_from_types;
    public final SortType msort_type;

    public enum MessageFromType implements WireEnum {
        BOT(0),
        USER(1);
        
        public static final ProtoAdapter<MessageFromType> ADAPTER = ProtoAdapter.newEnumAdapter(MessageFromType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MessageFromType fromValue(int i) {
            if (i == 0) {
                return BOT;
            }
            if (i != 1) {
                return null;
            }
            return USER;
        }

        private MessageFromType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.MessageFilterParam$b */
    private static final class C50021b extends ProtoAdapter<MessageFilterParam> {
        C50021b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageFilterParam messageFilterParam) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, messageFilterParam.mchat_at_user_ids) + MessageFromType.ADAPTER.asRepeated().encodedSizeWithTag(2, messageFilterParam.mmust_from_types) + MessageFromType.ADAPTER.asRepeated().encodedSizeWithTag(3, messageFilterParam.mmust_not_from_types);
            int i2 = 0;
            if (messageFilterParam.msort_type != null) {
                i = SortType.ADAPTER.encodedSizeWithTag(4, messageFilterParam.msort_type);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, messageFilterParam.mexclude_ids);
            if (messageFilterParam.mmessage_type != null) {
                i2 = Message.Type.ADAPTER.encodedSizeWithTag(6, messageFilterParam.mmessage_type);
            }
            return encodedSizeWithTag2 + i2 + Message.Type.ADAPTER.asRepeated().encodedSizeWithTag(7, messageFilterParam.mmessage_types) + messageFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public MessageFilterParam decode(ProtoReader protoReader) throws IOException {
            C50020a aVar = new C50020a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125110a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            try {
                                aVar.f125111b.add(MessageFromType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f125112c.add(MessageFromType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f125113d = SortType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 5:
                            aVar.f125114e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            try {
                                aVar.f125115f = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f125116g.add(Message.Type.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
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
        public void encode(ProtoWriter protoWriter, MessageFilterParam messageFilterParam) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, messageFilterParam.mchat_at_user_ids);
            MessageFromType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messageFilterParam.mmust_from_types);
            MessageFromType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, messageFilterParam.mmust_not_from_types);
            if (messageFilterParam.msort_type != null) {
                SortType.ADAPTER.encodeWithTag(protoWriter, 4, messageFilterParam.msort_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, messageFilterParam.mexclude_ids);
            if (messageFilterParam.mmessage_type != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 6, messageFilterParam.mmessage_type);
            }
            Message.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, messageFilterParam.mmessage_types);
            protoWriter.writeBytes(messageFilterParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.MessageFilterParam$a */
    public static final class C50020a extends Message.Builder<MessageFilterParam, C50020a> {

        /* renamed from: a */
        public List<String> f125110a = Internal.newMutableList();

        /* renamed from: b */
        public List<MessageFromType> f125111b = Internal.newMutableList();

        /* renamed from: c */
        public List<MessageFromType> f125112c = Internal.newMutableList();

        /* renamed from: d */
        public SortType f125113d;

        /* renamed from: e */
        public List<String> f125114e = Internal.newMutableList();

        /* renamed from: f */
        public Message.Type f125115f;

        /* renamed from: g */
        public List<Message.Type> f125116g = Internal.newMutableList();

        /* renamed from: a */
        public MessageFilterParam build() {
            return new MessageFilterParam(this.f125110a, this.f125111b, this.f125112c, this.f125113d, this.f125114e, this.f125115f, this.f125116g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50020a newBuilder() {
        C50020a aVar = new C50020a();
        aVar.f125110a = Internal.copyOf("mchat_at_user_ids", this.mchat_at_user_ids);
        aVar.f125111b = Internal.copyOf("mmust_from_types", this.mmust_from_types);
        aVar.f125112c = Internal.copyOf("mmust_not_from_types", this.mmust_not_from_types);
        aVar.f125113d = this.msort_type;
        aVar.f125114e = Internal.copyOf("mexclude_ids", this.mexclude_ids);
        aVar.f125115f = this.mmessage_type;
        aVar.f125116g = Internal.copyOf("mmessage_types", this.mmessage_types);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mchat_at_user_ids.isEmpty()) {
            sb.append(", chat_at_user_ids=");
            sb.append(this.mchat_at_user_ids);
        }
        if (!this.mmust_from_types.isEmpty()) {
            sb.append(", must_from_types=");
            sb.append(this.mmust_from_types);
        }
        if (!this.mmust_not_from_types.isEmpty()) {
            sb.append(", must_not_from_types=");
            sb.append(this.mmust_not_from_types);
        }
        if (this.msort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.msort_type);
        }
        if (!this.mexclude_ids.isEmpty()) {
            sb.append(", exclude_ids=");
            sb.append(this.mexclude_ids);
        }
        if (this.mmessage_type != null) {
            sb.append(", message_type=");
            sb.append(this.mmessage_type);
        }
        if (!this.mmessage_types.isEmpty()) {
            sb.append(", message_types=");
            sb.append(this.mmessage_types);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public MessageFilterParam(List<String> list, List<MessageFromType> list2, List<MessageFromType> list3, SortType sortType, List<String> list4, Message.Type type, List<Message.Type> list5) {
        this(list, list2, list3, sortType, list4, type, list5, ByteString.EMPTY);
    }

    public MessageFilterParam(List<String> list, List<MessageFromType> list2, List<MessageFromType> list3, SortType sortType, List<String> list4, Message.Type type, List<Message.Type> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_at_user_ids = Internal.immutableCopyOf("mchat_at_user_ids", list);
        this.mmust_from_types = Internal.immutableCopyOf("mmust_from_types", list2);
        this.mmust_not_from_types = Internal.immutableCopyOf("mmust_not_from_types", list3);
        this.msort_type = sortType;
        this.mexclude_ids = Internal.immutableCopyOf("mexclude_ids", list4);
        this.mmessage_type = type;
        this.mmessage_types = Internal.immutableCopyOf("mmessage_types", list5);
    }
}
