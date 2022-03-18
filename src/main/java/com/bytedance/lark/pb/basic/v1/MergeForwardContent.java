package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class MergeForwardContent extends Message<MergeForwardContent, C15065a> {
    public static final ProtoAdapter<MergeForwardContent> ADAPTER = new C15066b();
    public static final Chat.Type DEFAULT_CHAT_TYPE = Chat.Type.P2P;
    private static final long serialVersionUID = 0;
    public final Chat.Type chat_type;
    public final Map<String, ChatterInfo> chatters;
    public final Map<String, String> creator_i18n_names;
    public final String group_chat_name;
    public final Map<String, String> i18n_thread_title;
    public final List<Message> messages;
    public final String p2p_creator_name;
    public final String p2p_partner_name;
    public final Map<String, String> partner_i18n_names;
    public final OptionPutInfo put_info;
    public final String quasi_title;
    public final Map<String, MessageReaction> reaction_snapshots;
    public final Thread thread;

    public static final class MessageReaction extends Message<MessageReaction, C15059a> {
        public static final ProtoAdapter<MessageReaction> ADAPTER = new C15060b();
        private static final long serialVersionUID = 0;
        public final String message_id;
        public final List<Reaction> reactions;

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$MessageReaction$b */
        private static final class C15060b extends ProtoAdapter<MessageReaction> {
            C15060b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageReaction.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageReaction messageReaction) {
                int i;
                if (messageReaction.message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, messageReaction.message_id);
                } else {
                    i = 0;
                }
                return i + Reaction.ADAPTER.asRepeated().encodedSizeWithTag(2, messageReaction.reactions) + messageReaction.unknownFields().size();
            }

            /* renamed from: a */
            public MessageReaction decode(ProtoReader protoReader) throws IOException {
                C15059a aVar = new C15059a();
                aVar.f39834a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39834a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39835b.add(Reaction.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageReaction messageReaction) throws IOException {
                if (messageReaction.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageReaction.message_id);
                }
                Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messageReaction.reactions);
                protoWriter.writeBytes(messageReaction.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$MessageReaction$a */
        public static final class C15059a extends Message.Builder<MessageReaction, C15059a> {

            /* renamed from: a */
            public String f39834a;

            /* renamed from: b */
            public List<Reaction> f39835b = Internal.newMutableList();

            /* renamed from: a */
            public MessageReaction build() {
                return new MessageReaction(this.f39834a, this.f39835b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15059a newBuilder() {
            C15059a aVar = new C15059a();
            aVar.f39834a = this.message_id;
            aVar.f39835b = Internal.copyOf("reactions", this.reactions);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MessageReaction");
            StringBuilder sb = new StringBuilder();
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            if (!this.reactions.isEmpty()) {
                sb.append(", reactions=");
                sb.append(this.reactions);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageReaction{");
            replace.append('}');
            return replace.toString();
        }

        public MessageReaction(String str, List<Reaction> list) {
            this(str, list, ByteString.EMPTY);
        }

        public MessageReaction(String str, List<Reaction> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_id = str;
            this.reactions = Internal.immutableCopyOf("reactions", list);
        }
    }

    public static final class OptionPutInfo extends Message<OptionPutInfo, C15061a> {
        public static final ProtoAdapter<OptionPutInfo> ADAPTER = new C15062b();
        public static final Boolean DEFAULT_LIMITED = false;
        public static final MergeFowardMessageType DEFAULT_MERGE_TYPE = MergeFowardMessageType.MERGE_MESSAGE;
        public static final Boolean DEFAULT_NEED_COPY_REACTION = false;
        private static final long serialVersionUID = 0;
        public final Boolean limited;
        public final MergeFowardMessageType merge_type;
        public final Boolean need_copy_reaction;
        public final String thread_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$OptionPutInfo$b */
        private static final class C15062b extends ProtoAdapter<OptionPutInfo> {
            C15062b() {
                super(FieldEncoding.LENGTH_DELIMITED, OptionPutInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(OptionPutInfo optionPutInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (optionPutInfo.merge_type != null) {
                    i = MergeFowardMessageType.ADAPTER.encodedSizeWithTag(1, optionPutInfo.merge_type);
                } else {
                    i = 0;
                }
                if (optionPutInfo.thread_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, optionPutInfo.thread_id);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (optionPutInfo.limited != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, optionPutInfo.limited);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (optionPutInfo.need_copy_reaction != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, optionPutInfo.need_copy_reaction);
                }
                return i6 + i4 + optionPutInfo.unknownFields().size();
            }

            /* renamed from: a */
            public OptionPutInfo decode(ProtoReader protoReader) throws IOException {
                C15061a aVar = new C15061a();
                aVar.f39836a = MergeFowardMessageType.MERGE_MESSAGE;
                aVar.f39837b = "";
                aVar.f39838c = false;
                aVar.f39839d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39836a = MergeFowardMessageType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f39837b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39838c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39839d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OptionPutInfo optionPutInfo) throws IOException {
                if (optionPutInfo.merge_type != null) {
                    MergeFowardMessageType.ADAPTER.encodeWithTag(protoWriter, 1, optionPutInfo.merge_type);
                }
                if (optionPutInfo.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, optionPutInfo.thread_id);
                }
                if (optionPutInfo.limited != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, optionPutInfo.limited);
                }
                if (optionPutInfo.need_copy_reaction != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, optionPutInfo.need_copy_reaction);
                }
                protoWriter.writeBytes(optionPutInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$OptionPutInfo$a */
        public static final class C15061a extends Message.Builder<OptionPutInfo, C15061a> {

            /* renamed from: a */
            public MergeFowardMessageType f39836a;

            /* renamed from: b */
            public String f39837b;

            /* renamed from: c */
            public Boolean f39838c;

            /* renamed from: d */
            public Boolean f39839d;

            /* renamed from: a */
            public OptionPutInfo build() {
                return new OptionPutInfo(this.f39836a, this.f39837b, this.f39838c, this.f39839d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15061a newBuilder() {
            C15061a aVar = new C15061a();
            aVar.f39836a = this.merge_type;
            aVar.f39837b = this.thread_id;
            aVar.f39838c = this.limited;
            aVar.f39839d = this.need_copy_reaction;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "OptionPutInfo");
            StringBuilder sb = new StringBuilder();
            if (this.merge_type != null) {
                sb.append(", merge_type=");
                sb.append(this.merge_type);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            if (this.limited != null) {
                sb.append(", limited=");
                sb.append(this.limited);
            }
            if (this.need_copy_reaction != null) {
                sb.append(", need_copy_reaction=");
                sb.append(this.need_copy_reaction);
            }
            StringBuilder replace = sb.replace(0, 2, "OptionPutInfo{");
            replace.append('}');
            return replace.toString();
        }

        public OptionPutInfo(MergeFowardMessageType mergeFowardMessageType, String str, Boolean bool, Boolean bool2) {
            this(mergeFowardMessageType, str, bool, bool2, ByteString.EMPTY);
        }

        public OptionPutInfo(MergeFowardMessageType mergeFowardMessageType, String str, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.merge_type = mergeFowardMessageType;
            this.thread_id = str;
            this.limited = bool;
            this.need_copy_reaction = bool2;
        }
    }

    public static final class Reaction extends Message<Reaction, C15063a> {
        public static final ProtoAdapter<Reaction> ADAPTER = new C15064b();
        public static final Integer DEFAULT_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final List<String> chatter_ids;
        public final Integer count;
        public final String type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$Reaction$b */
        private static final class C15064b extends ProtoAdapter<Reaction> {
            C15064b() {
                super(FieldEncoding.LENGTH_DELIMITED, Reaction.class);
            }

            /* renamed from: a */
            public int encodedSize(Reaction reaction) {
                int i;
                int i2 = 0;
                if (reaction.type != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, reaction.type);
                } else {
                    i = 0;
                }
                if (reaction.count != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, reaction.count);
                }
                return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, reaction.chatter_ids) + reaction.unknownFields().size();
            }

            /* renamed from: a */
            public Reaction decode(ProtoReader protoReader) throws IOException {
                C15063a aVar = new C15063a();
                aVar.f39840a = "";
                aVar.f39841b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39840a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39841b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39842c.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Reaction reaction) throws IOException {
                if (reaction.type != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reaction.type);
                }
                if (reaction.count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, reaction.count);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, reaction.chatter_ids);
                protoWriter.writeBytes(reaction.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$Reaction$a */
        public static final class C15063a extends Message.Builder<Reaction, C15063a> {

            /* renamed from: a */
            public String f39840a;

            /* renamed from: b */
            public Integer f39841b;

            /* renamed from: c */
            public List<String> f39842c = Internal.newMutableList();

            /* renamed from: a */
            public Reaction build() {
                return new Reaction(this.f39840a, this.f39841b, this.f39842c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15063a newBuilder() {
            C15063a aVar = new C15063a();
            aVar.f39840a = this.type;
            aVar.f39841b = this.count;
            aVar.f39842c = Internal.copyOf("chatter_ids", this.chatter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Reaction");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            if (!this.chatter_ids.isEmpty()) {
                sb.append(", chatter_ids=");
                sb.append(this.chatter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "Reaction{");
            replace.append('}');
            return replace.toString();
        }

        public Reaction(String str, Integer num, List<String> list) {
            this(str, num, list, ByteString.EMPTY);
        }

        public Reaction(String str, Integer num, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = str;
            this.count = num;
            this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        }
    }

    public static final class ChatterInfo extends Message<ChatterInfo, C15057a> {
        public static final ProtoAdapter<ChatterInfo> ADAPTER = new C15058b();
        public static final Boolean DEFAULT_IS_ANONYMOUS = false;
        public static final Chatter.Type DEFAULT_TYPE = Chatter.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final ImageSet avatar;
        public final String avatar_key;
        public final String avatar_path;
        public final Map<String, String> i18n_name;
        public final String id;
        public final Boolean is_anonymous;
        public final String name;
        public final Chatter.Type type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$ChatterInfo$a */
        public static final class C15057a extends Message.Builder<ChatterInfo, C15057a> {

            /* renamed from: a */
            public String f39825a;

            /* renamed from: b */
            public String f39826b;

            /* renamed from: c */
            public ImageSet f39827c;

            /* renamed from: d */
            public Chatter.Type f39828d;

            /* renamed from: e */
            public String f39829e;

            /* renamed from: f */
            public String f39830f;

            /* renamed from: g */
            public Boolean f39831g;

            /* renamed from: h */
            public Map<String, String> f39832h = Internal.newMutableMap();

            /* renamed from: a */
            public ChatterInfo build() {
                return new ChatterInfo(this.f39825a, this.f39826b, this.f39827c, this.f39828d, this.f39829e, this.f39830f, this.f39831g, this.f39832h, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$ChatterInfo$b */
        private static final class C15058b extends ProtoAdapter<ChatterInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f39833a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C15058b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatterInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatterInfo chatterInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (chatterInfo.id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterInfo.id);
                } else {
                    i = 0;
                }
                if (chatterInfo.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterInfo.name);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (chatterInfo.avatar != null) {
                    i3 = ImageSet.ADAPTER.encodedSizeWithTag(3, chatterInfo.avatar);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (chatterInfo.type != null) {
                    i4 = Chatter.Type.ADAPTER.encodedSizeWithTag(4, chatterInfo.type);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (chatterInfo.avatar_key != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, chatterInfo.avatar_key);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (chatterInfo.avatar_path != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, chatterInfo.avatar_path);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (chatterInfo.is_anonymous != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, chatterInfo.is_anonymous);
                }
                return i12 + i7 + this.f39833a.encodedSizeWithTag(8, chatterInfo.i18n_name) + chatterInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ChatterInfo decode(ProtoReader protoReader) throws IOException {
                C15057a aVar = new C15057a();
                aVar.f39825a = "";
                aVar.f39826b = "";
                aVar.f39828d = Chatter.Type.UNKNOWN;
                aVar.f39829e = "";
                aVar.f39830f = "";
                aVar.f39831g = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f39825a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f39826b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f39827c = ImageSet.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                try {
                                    aVar.f39828d = Chatter.Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 5:
                                aVar.f39829e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f39830f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f39831g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                aVar.f39832h.putAll(this.f39833a.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, ChatterInfo chatterInfo) throws IOException {
                if (chatterInfo.id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterInfo.id);
                }
                if (chatterInfo.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterInfo.name);
                }
                if (chatterInfo.avatar != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 3, chatterInfo.avatar);
                }
                if (chatterInfo.type != null) {
                    Chatter.Type.ADAPTER.encodeWithTag(protoWriter, 4, chatterInfo.type);
                }
                if (chatterInfo.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, chatterInfo.avatar_key);
                }
                if (chatterInfo.avatar_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, chatterInfo.avatar_path);
                }
                if (chatterInfo.is_anonymous != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, chatterInfo.is_anonymous);
                }
                this.f39833a.encodeWithTag(protoWriter, 8, chatterInfo.i18n_name);
                protoWriter.writeBytes(chatterInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15057a newBuilder() {
            C15057a aVar = new C15057a();
            aVar.f39825a = this.id;
            aVar.f39826b = this.name;
            aVar.f39827c = this.avatar;
            aVar.f39828d = this.type;
            aVar.f39829e = this.avatar_key;
            aVar.f39830f = this.avatar_path;
            aVar.f39831g = this.is_anonymous;
            aVar.f39832h = Internal.copyOf("i18n_name", this.i18n_name);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ChatterInfo");
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.avatar != null) {
                sb.append(", avatar=");
                sb.append(this.avatar);
            }
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.avatar_path != null) {
                sb.append(", avatar_path=");
                sb.append(this.avatar_path);
            }
            if (this.is_anonymous != null) {
                sb.append(", is_anonymous=");
                sb.append(this.is_anonymous);
            }
            if (!this.i18n_name.isEmpty()) {
                sb.append(", i18n_name=");
                sb.append(this.i18n_name);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatterInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ChatterInfo(String str, String str2, ImageSet imageSet, Chatter.Type type2, String str3, String str4, Boolean bool, Map<String, String> map) {
            this(str, str2, imageSet, type2, str3, str4, bool, map, ByteString.EMPTY);
        }

        public ChatterInfo(String str, String str2, ImageSet imageSet, Chatter.Type type2, String str3, String str4, Boolean bool, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.name = str2;
            this.avatar = imageSet;
            this.type = type2;
            this.avatar_key = str3;
            this.avatar_path = str4;
            this.is_anonymous = bool;
            this.i18n_name = Internal.immutableCopyOf("i18n_name", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$a */
    public static final class C15065a extends Message.Builder<MergeForwardContent, C15065a> {

        /* renamed from: a */
        public List<Message> f39843a = Internal.newMutableList();

        /* renamed from: b */
        public Chat.Type f39844b;

        /* renamed from: c */
        public String f39845c;

        /* renamed from: d */
        public String f39846d;

        /* renamed from: e */
        public String f39847e;

        /* renamed from: f */
        public Map<String, String> f39848f = Internal.newMutableMap();

        /* renamed from: g */
        public Map<String, String> f39849g = Internal.newMutableMap();

        /* renamed from: h */
        public Map<String, ChatterInfo> f39850h = Internal.newMutableMap();

        /* renamed from: i */
        public Map<String, MessageReaction> f39851i = Internal.newMutableMap();

        /* renamed from: j */
        public Thread f39852j;

        /* renamed from: k */
        public Map<String, String> f39853k = Internal.newMutableMap();

        /* renamed from: l */
        public String f39854l;

        /* renamed from: m */
        public OptionPutInfo f39855m;

        /* renamed from: a */
        public MergeForwardContent build() {
            return new MergeForwardContent(this.f39843a, this.f39844b, this.f39845c, this.f39846d, this.f39847e, this.f39848f, this.f39849g, this.f39850h, this.f39851i, this.f39852j, this.f39853k, this.f39854l, this.f39855m, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MergeForwardContent$b */
    private static final class C15066b extends ProtoAdapter<MergeForwardContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39856a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f39857b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, ChatterInfo>> f39858c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatterInfo.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, MessageReaction>> f39859d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, MessageReaction.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, String>> f39860e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15066b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeForwardContent.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeForwardContent mergeForwardContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = Message.ADAPTER.asRepeated().encodedSizeWithTag(1, mergeForwardContent.messages);
            int i7 = 0;
            if (mergeForwardContent.chat_type != null) {
                i = Chat.Type.ADAPTER.encodedSizeWithTag(2, mergeForwardContent.chat_type);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (mergeForwardContent.group_chat_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mergeForwardContent.group_chat_name);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (mergeForwardContent.p2p_creator_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, mergeForwardContent.p2p_creator_name);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (mergeForwardContent.p2p_partner_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, mergeForwardContent.p2p_partner_name);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i10 + i4 + this.f39856a.encodedSizeWithTag(6, mergeForwardContent.creator_i18n_names) + this.f39857b.encodedSizeWithTag(7, mergeForwardContent.partner_i18n_names) + this.f39858c.encodedSizeWithTag(10, mergeForwardContent.chatters) + this.f39859d.encodedSizeWithTag(11, mergeForwardContent.reaction_snapshots);
            if (mergeForwardContent.thread != null) {
                i5 = Thread.ADAPTER.encodedSizeWithTag(12, mergeForwardContent.thread);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i5 + this.f39860e.encodedSizeWithTag(13, mergeForwardContent.i18n_thread_title);
            if (mergeForwardContent.quasi_title != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(20, mergeForwardContent.quasi_title);
            } else {
                i6 = 0;
            }
            int i11 = encodedSizeWithTag3 + i6;
            if (mergeForwardContent.put_info != null) {
                i7 = OptionPutInfo.ADAPTER.encodedSizeWithTag(21, mergeForwardContent.put_info);
            }
            return i11 + i7 + mergeForwardContent.unknownFields().size();
        }

        /* renamed from: a */
        public MergeForwardContent decode(ProtoReader protoReader) throws IOException {
            C15065a aVar = new C15065a();
            aVar.f39844b = Chat.Type.P2P;
            aVar.f39845c = "";
            aVar.f39846d = "";
            aVar.f39847e = "";
            aVar.f39854l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 20) {
                    aVar.f39854l = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 21) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39843a.add(Message.ADAPTER.decode(protoReader));
                            continue;
                        case 2:
                            try {
                                aVar.f39844b = Chat.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f39845c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f39846d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f39847e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f39848f.putAll(this.f39856a.decode(protoReader));
                            continue;
                        case 7:
                            aVar.f39849g.putAll(this.f39857b.decode(protoReader));
                            continue;
                        default:
                            switch (nextTag) {
                                case 10:
                                    aVar.f39850h.putAll(this.f39858c.decode(protoReader));
                                    continue;
                                case 11:
                                    aVar.f39851i.putAll(this.f39859d.decode(protoReader));
                                    continue;
                                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                    aVar.f39852j = Thread.ADAPTER.decode(protoReader);
                                    continue;
                                case 13:
                                    aVar.f39853k.putAll(this.f39860e.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f39855m = OptionPutInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeForwardContent mergeForwardContent) throws IOException {
            Message.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mergeForwardContent.messages);
            if (mergeForwardContent.chat_type != null) {
                Chat.Type.ADAPTER.encodeWithTag(protoWriter, 2, mergeForwardContent.chat_type);
            }
            if (mergeForwardContent.group_chat_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mergeForwardContent.group_chat_name);
            }
            if (mergeForwardContent.p2p_creator_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mergeForwardContent.p2p_creator_name);
            }
            if (mergeForwardContent.p2p_partner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mergeForwardContent.p2p_partner_name);
            }
            this.f39856a.encodeWithTag(protoWriter, 6, mergeForwardContent.creator_i18n_names);
            this.f39857b.encodeWithTag(protoWriter, 7, mergeForwardContent.partner_i18n_names);
            this.f39858c.encodeWithTag(protoWriter, 10, mergeForwardContent.chatters);
            this.f39859d.encodeWithTag(protoWriter, 11, mergeForwardContent.reaction_snapshots);
            if (mergeForwardContent.thread != null) {
                Thread.ADAPTER.encodeWithTag(protoWriter, 12, mergeForwardContent.thread);
            }
            this.f39860e.encodeWithTag(protoWriter, 13, mergeForwardContent.i18n_thread_title);
            if (mergeForwardContent.quasi_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, mergeForwardContent.quasi_title);
            }
            if (mergeForwardContent.put_info != null) {
                OptionPutInfo.ADAPTER.encodeWithTag(protoWriter, 21, mergeForwardContent.put_info);
            }
            protoWriter.writeBytes(mergeForwardContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15065a newBuilder() {
        C15065a aVar = new C15065a();
        aVar.f39843a = Internal.copyOf("messages", this.messages);
        aVar.f39844b = this.chat_type;
        aVar.f39845c = this.group_chat_name;
        aVar.f39846d = this.p2p_creator_name;
        aVar.f39847e = this.p2p_partner_name;
        aVar.f39848f = Internal.copyOf("creator_i18n_names", this.creator_i18n_names);
        aVar.f39849g = Internal.copyOf("partner_i18n_names", this.partner_i18n_names);
        aVar.f39850h = Internal.copyOf("chatters", this.chatters);
        aVar.f39851i = Internal.copyOf("reaction_snapshots", this.reaction_snapshots);
        aVar.f39852j = this.thread;
        aVar.f39853k = Internal.copyOf("i18n_thread_title", this.i18n_thread_title);
        aVar.f39854l = this.quasi_title;
        aVar.f39855m = this.put_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MergeForwardContent");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.chat_type != null) {
            sb.append(", chat_type=");
            sb.append(this.chat_type);
        }
        if (this.group_chat_name != null) {
            sb.append(", group_chat_name=");
            sb.append(this.group_chat_name);
        }
        if (this.p2p_creator_name != null) {
            sb.append(", p2p_creator_name=");
            sb.append(this.p2p_creator_name);
        }
        if (this.p2p_partner_name != null) {
            sb.append(", p2p_partner_name=");
            sb.append(this.p2p_partner_name);
        }
        if (!this.creator_i18n_names.isEmpty()) {
            sb.append(", creator_i18n_names=");
            sb.append(this.creator_i18n_names);
        }
        if (!this.partner_i18n_names.isEmpty()) {
            sb.append(", partner_i18n_names=");
            sb.append(this.partner_i18n_names);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (!this.reaction_snapshots.isEmpty()) {
            sb.append(", reaction_snapshots=");
            sb.append(this.reaction_snapshots);
        }
        if (this.thread != null) {
            sb.append(", thread=");
            sb.append(this.thread);
        }
        if (!this.i18n_thread_title.isEmpty()) {
            sb.append(", i18n_thread_title=");
            sb.append(this.i18n_thread_title);
        }
        if (this.quasi_title != null) {
            sb.append(", quasi_title=");
            sb.append(this.quasi_title);
        }
        if (this.put_info != null) {
            sb.append(", put_info=");
            sb.append(this.put_info);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeForwardContent{");
        replace.append('}');
        return replace.toString();
    }

    public MergeForwardContent(List<Message> list, Chat.Type type, String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, ChatterInfo> map3, Map<String, MessageReaction> map4, Thread thread2, Map<String, String> map5, String str4, OptionPutInfo optionPutInfo) {
        this(list, type, str, str2, str3, map, map2, map3, map4, thread2, map5, str4, optionPutInfo, ByteString.EMPTY);
    }

    public MergeForwardContent(List<Message> list, Chat.Type type, String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, ChatterInfo> map3, Map<String, MessageReaction> map4, Thread thread2, Map<String, String> map5, String str4, OptionPutInfo optionPutInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.chat_type = type;
        this.group_chat_name = str;
        this.p2p_creator_name = str2;
        this.p2p_partner_name = str3;
        this.creator_i18n_names = Internal.immutableCopyOf("creator_i18n_names", map);
        this.partner_i18n_names = Internal.immutableCopyOf("partner_i18n_names", map2);
        this.chatters = Internal.immutableCopyOf("chatters", map3);
        this.reaction_snapshots = Internal.immutableCopyOf("reaction_snapshots", map4);
        this.thread = thread2;
        this.i18n_thread_title = Internal.immutableCopyOf("i18n_thread_title", map5);
        this.quasi_title = str4;
        this.put_info = optionPutInfo;
    }
}
