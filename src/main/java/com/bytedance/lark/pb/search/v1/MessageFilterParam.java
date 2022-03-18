package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
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

public final class MessageFilterParam extends Message<MessageFilterParam, C18841a> {
    public static final ProtoAdapter<MessageFilterParam> ADAPTER = new C18842b();
    public static final SortType DEFAULT_SORT_TYPE = SortType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final List<String> chat_at_user_ids;
    public final List<String> exclude_ids;
    public final List<Message.Type> message_types;
    public final List<MessageFromType> must_from_types;
    public final List<MessageFromType> must_not_from_types;
    public final SortType sort_type;

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

    /* renamed from: com.bytedance.lark.pb.search.v1.MessageFilterParam$b */
    private static final class C18842b extends ProtoAdapter<MessageFilterParam> {
        C18842b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageFilterParam messageFilterParam) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, messageFilterParam.chat_at_user_ids) + MessageFromType.ADAPTER.asRepeated().encodedSizeWithTag(2, messageFilterParam.must_from_types) + MessageFromType.ADAPTER.asRepeated().encodedSizeWithTag(3, messageFilterParam.must_not_from_types);
            if (messageFilterParam.sort_type != null) {
                i = SortType.ADAPTER.encodedSizeWithTag(4, messageFilterParam.sort_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, messageFilterParam.exclude_ids) + Message.Type.ADAPTER.asRepeated().encodedSizeWithTag(7, messageFilterParam.message_types) + messageFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public MessageFilterParam decode(ProtoReader protoReader) throws IOException {
            C18841a aVar = new C18841a();
            aVar.f46518d = SortType.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46515a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f46516b.add(MessageFromType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f46517c.add(MessageFromType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 4) {
                    try {
                        aVar.f46518d = SortType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                } else if (nextTag == 5) {
                    aVar.f46519e.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 7) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46520f.add(Message.Type.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageFilterParam messageFilterParam) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, messageFilterParam.chat_at_user_ids);
            MessageFromType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messageFilterParam.must_from_types);
            MessageFromType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, messageFilterParam.must_not_from_types);
            if (messageFilterParam.sort_type != null) {
                SortType.ADAPTER.encodeWithTag(protoWriter, 4, messageFilterParam.sort_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, messageFilterParam.exclude_ids);
            Message.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, messageFilterParam.message_types);
            protoWriter.writeBytes(messageFilterParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.MessageFilterParam$a */
    public static final class C18841a extends Message.Builder<MessageFilterParam, C18841a> {

        /* renamed from: a */
        public List<String> f46515a = Internal.newMutableList();

        /* renamed from: b */
        public List<MessageFromType> f46516b = Internal.newMutableList();

        /* renamed from: c */
        public List<MessageFromType> f46517c = Internal.newMutableList();

        /* renamed from: d */
        public SortType f46518d;

        /* renamed from: e */
        public List<String> f46519e = Internal.newMutableList();

        /* renamed from: f */
        public List<Message.Type> f46520f = Internal.newMutableList();

        /* renamed from: a */
        public MessageFilterParam build() {
            return new MessageFilterParam(this.f46515a, this.f46516b, this.f46517c, this.f46518d, this.f46519e, this.f46520f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18841a mo64694a(List<MessageFromType> list) {
            Internal.checkElementsNotNull(list);
            this.f46517c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18841a newBuilder() {
        C18841a aVar = new C18841a();
        aVar.f46515a = Internal.copyOf("chat_at_user_ids", this.chat_at_user_ids);
        aVar.f46516b = Internal.copyOf("must_from_types", this.must_from_types);
        aVar.f46517c = Internal.copyOf("must_not_from_types", this.must_not_from_types);
        aVar.f46518d = this.sort_type;
        aVar.f46519e = Internal.copyOf("exclude_ids", this.exclude_ids);
        aVar.f46520f = Internal.copyOf("message_types", this.message_types);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "MessageFilterParam");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_at_user_ids.isEmpty()) {
            sb.append(", chat_at_user_ids=");
            sb.append(this.chat_at_user_ids);
        }
        if (!this.must_from_types.isEmpty()) {
            sb.append(", must_from_types=");
            sb.append(this.must_from_types);
        }
        if (!this.must_not_from_types.isEmpty()) {
            sb.append(", must_not_from_types=");
            sb.append(this.must_not_from_types);
        }
        if (this.sort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.sort_type);
        }
        if (!this.exclude_ids.isEmpty()) {
            sb.append(", exclude_ids=");
            sb.append(this.exclude_ids);
        }
        if (!this.message_types.isEmpty()) {
            sb.append(", message_types=");
            sb.append(this.message_types);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public MessageFilterParam(List<String> list, List<MessageFromType> list2, List<MessageFromType> list3, SortType sortType, List<String> list4, List<Message.Type> list5) {
        this(list, list2, list3, sortType, list4, list5, ByteString.EMPTY);
    }

    public MessageFilterParam(List<String> list, List<MessageFromType> list2, List<MessageFromType> list3, SortType sortType, List<String> list4, List<Message.Type> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_at_user_ids = Internal.immutableCopyOf("chat_at_user_ids", list);
        this.must_from_types = Internal.immutableCopyOf("must_from_types", list2);
        this.must_not_from_types = Internal.immutableCopyOf("must_not_from_types", list3);
        this.sort_type = sortType;
        this.exclude_ids = Internal.immutableCopyOf("exclude_ids", list4);
        this.message_types = Internal.immutableCopyOf("message_types", list5);
    }
}
