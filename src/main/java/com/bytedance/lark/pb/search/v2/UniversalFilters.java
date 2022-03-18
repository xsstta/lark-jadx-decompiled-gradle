package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class UniversalFilters extends Message<UniversalFilters, C19087a> {
    public static final ProtoAdapter<UniversalFilters> ADAPTER = new C19088b();
    private static final long serialVersionUID = 0;

    public static final class BotFilter extends Message<BotFilter, C19059a> {
        public static final ProtoAdapter<BotFilter> ADAPTER = new C19060b();
        private static final long serialVersionUID = 0;
        public final List<Integer> search_type;

        public enum SearchType implements WireEnum {
            ALL(0),
            TALKED(1),
            UN_TALKED(2);
            
            public static final ProtoAdapter<SearchType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SearchType fromValue(int i) {
                if (i == 0) {
                    return ALL;
                }
                if (i == 1) {
                    return TALKED;
                }
                if (i != 2) {
                    return null;
                }
                return UN_TALKED;
            }

            private SearchType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$BotFilter$b */
        private static final class C19060b extends ProtoAdapter<BotFilter> {
            C19060b() {
                super(FieldEncoding.LENGTH_DELIMITED, BotFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(BotFilter botFilter) {
                return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, botFilter.search_type) + botFilter.unknownFields().size();
            }

            /* renamed from: a */
            public BotFilter decode(ProtoReader protoReader) throws IOException {
                C19059a aVar = new C19059a();
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
                        aVar.f47153a.add(ProtoAdapter.INT32.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BotFilter botFilter) throws IOException {
                ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, botFilter.search_type);
                protoWriter.writeBytes(botFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$BotFilter$a */
        public static final class C19059a extends Message.Builder<BotFilter, C19059a> {

            /* renamed from: a */
            public List<Integer> f47153a = Internal.newMutableList();

            /* renamed from: a */
            public BotFilter build() {
                return new BotFilter(this.f47153a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19059a newBuilder() {
            C19059a aVar = new C19059a();
            aVar.f47153a = Internal.copyOf("search_type", this.search_type);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "BotFilter");
            StringBuilder sb = new StringBuilder();
            if (!this.search_type.isEmpty()) {
                sb.append(", search_type=");
                sb.append(this.search_type);
            }
            StringBuilder replace = sb.replace(0, 2, "BotFilter{");
            replace.append('}');
            return replace.toString();
        }

        public BotFilter(List<Integer> list) {
            this(list, ByteString.EMPTY);
        }

        public BotFilter(List<Integer> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.search_type = Internal.immutableCopyOf("search_type", list);
        }
    }

    public static final class ChatFilter extends Message<ChatFilter, C19061a> {
        public static final ProtoAdapter<ChatFilter> ADAPTER = new C19062b();
        public static final Boolean DEFAULT_ADDABLE_AS_USER = false;
        private static final long serialVersionUID = 0;
        public final Boolean addable_as_user;
        public final List<String> chat_member_ids;
        public final List<Chat.ChatMode> chat_modes;
        public final List<Chat.Type> chat_types;
        public final List<String> excluded_chat_ids;
        public final List<Integer> search_types;

        public enum SearchType implements WireEnum {
            ALL(0),
            JOINED(1),
            UN_JOINED(2),
            PRIVATE(4),
            PUBLIC(8),
            CROSS_TENANT(16),
            UN_CROSS_TENANT(32),
            CRYPTO(64),
            NORMAL(SmActions.ACTION_ONTHECALL_EXIT);
            
            public static final ProtoAdapter<SearchType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SearchType fromValue(int i) {
                if (i == 0) {
                    return ALL;
                }
                if (i == 1) {
                    return JOINED;
                }
                if (i == 2) {
                    return UN_JOINED;
                }
                if (i == 4) {
                    return PRIVATE;
                }
                if (i == 8) {
                    return PUBLIC;
                }
                if (i == 16) {
                    return CROSS_TENANT;
                }
                if (i == 32) {
                    return UN_CROSS_TENANT;
                }
                if (i == 64) {
                    return CRYPTO;
                }
                if (i != 128) {
                    return null;
                }
                return NORMAL;
            }

            private SearchType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$ChatFilter$b */
        private static final class C19062b extends ProtoAdapter<ChatFilter> {
            C19062b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatFilter chatFilter) {
                int i;
                int encodedSizeWithTag = Chat.Type.ADAPTER.asRepeated().encodedSizeWithTag(1, chatFilter.chat_types) + Chat.ChatMode.ADAPTER.asRepeated().encodedSizeWithTag(2, chatFilter.chat_modes) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(3, chatFilter.search_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, chatFilter.chat_member_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, chatFilter.excluded_chat_ids);
                if (chatFilter.addable_as_user != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(6, chatFilter.addable_as_user);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + chatFilter.unknownFields().size();
            }

            /* renamed from: a */
            public ChatFilter decode(ProtoReader protoReader) throws IOException {
                C19061a aVar = new C19061a();
                aVar.f47159f = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f47154a.add(Chat.Type.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                try {
                                    aVar.f47155b.add(Chat.ChatMode.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 3:
                                aVar.f47156c.add(ProtoAdapter.INT32.decode(protoReader));
                                break;
                            case 4:
                                aVar.f47157d.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 5:
                                aVar.f47158e.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 6:
                                aVar.f47159f = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ChatFilter chatFilter) throws IOException {
                Chat.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatFilter.chat_types);
                Chat.ChatMode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, chatFilter.chat_modes);
                ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 3, chatFilter.search_types);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, chatFilter.chat_member_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, chatFilter.excluded_chat_ids);
                if (chatFilter.addable_as_user != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, chatFilter.addable_as_user);
                }
                protoWriter.writeBytes(chatFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$ChatFilter$a */
        public static final class C19061a extends Message.Builder<ChatFilter, C19061a> {

            /* renamed from: a */
            public List<Chat.Type> f47154a = Internal.newMutableList();

            /* renamed from: b */
            public List<Chat.ChatMode> f47155b = Internal.newMutableList();

            /* renamed from: c */
            public List<Integer> f47156c = Internal.newMutableList();

            /* renamed from: d */
            public List<String> f47157d = Internal.newMutableList();

            /* renamed from: e */
            public List<String> f47158e = Internal.newMutableList();

            /* renamed from: f */
            public Boolean f47159f;

            /* renamed from: a */
            public ChatFilter build() {
                return new ChatFilter(this.f47154a, this.f47155b, this.f47156c, this.f47157d, this.f47158e, this.f47159f, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19061a mo65222a(Boolean bool) {
                this.f47159f = bool;
                return this;
            }

            /* renamed from: a */
            public C19061a mo65223a(List<Chat.ChatMode> list) {
                Internal.checkElementsNotNull(list);
                this.f47155b = list;
                return this;
            }

            /* renamed from: b */
            public C19061a mo65225b(List<Integer> list) {
                Internal.checkElementsNotNull(list);
                this.f47156c = list;
                return this;
            }

            /* renamed from: c */
            public C19061a mo65226c(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47157d = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19061a newBuilder() {
            C19061a aVar = new C19061a();
            aVar.f47154a = Internal.copyOf("chat_types", this.chat_types);
            aVar.f47155b = Internal.copyOf("chat_modes", this.chat_modes);
            aVar.f47156c = Internal.copyOf("search_types", this.search_types);
            aVar.f47157d = Internal.copyOf("chat_member_ids", this.chat_member_ids);
            aVar.f47158e = Internal.copyOf("excluded_chat_ids", this.excluded_chat_ids);
            aVar.f47159f = this.addable_as_user;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ChatFilter");
            StringBuilder sb = new StringBuilder();
            if (!this.chat_types.isEmpty()) {
                sb.append(", chat_types=");
                sb.append(this.chat_types);
            }
            if (!this.chat_modes.isEmpty()) {
                sb.append(", chat_modes=");
                sb.append(this.chat_modes);
            }
            if (!this.search_types.isEmpty()) {
                sb.append(", search_types=");
                sb.append(this.search_types);
            }
            if (!this.chat_member_ids.isEmpty()) {
                sb.append(", chat_member_ids=");
                sb.append(this.chat_member_ids);
            }
            if (!this.excluded_chat_ids.isEmpty()) {
                sb.append(", excluded_chat_ids=");
                sb.append(this.excluded_chat_ids);
            }
            if (this.addable_as_user != null) {
                sb.append(", addable_as_user=");
                sb.append(this.addable_as_user);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatFilter{");
            replace.append('}');
            return replace.toString();
        }

        public ChatFilter(List<Chat.Type> list, List<Chat.ChatMode> list2, List<Integer> list3, List<String> list4, List<String> list5, Boolean bool) {
            this(list, list2, list3, list4, list5, bool, ByteString.EMPTY);
        }

        public ChatFilter(List<Chat.Type> list, List<Chat.ChatMode> list2, List<Integer> list3, List<String> list4, List<String> list5, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_types = Internal.immutableCopyOf("chat_types", list);
            this.chat_modes = Internal.immutableCopyOf("chat_modes", list2);
            this.search_types = Internal.immutableCopyOf("search_types", list3);
            this.chat_member_ids = Internal.immutableCopyOf("chat_member_ids", list4);
            this.excluded_chat_ids = Internal.immutableCopyOf("excluded_chat_ids", list5);
            this.addable_as_user = bool;
        }
    }

    public static final class DocFilter extends Message<DocFilter, C19071a> {
        public static final ProtoAdapter<DocFilter> ADAPTER = new C19072b();
        private static final long serialVersionUID = 0;
        public final List<String> chat_ids;
        public final List<String> creator_ids;
        public final TimeRange review_time_range;
        public final List<SearchContentType> search_content_types;
        public final List<String> sharer_ids;
        public final List<Doc.Type> types;

        public enum SearchContentType implements WireEnum {
            ONLY_TITLE(1),
            FULL_CONTENT(2),
            ONLY_COMMENT(3);
            
            public static final ProtoAdapter<SearchContentType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchContentType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SearchContentType fromValue(int i) {
                if (i == 1) {
                    return ONLY_TITLE;
                }
                if (i == 2) {
                    return FULL_CONTENT;
                }
                if (i != 3) {
                    return null;
                }
                return ONLY_COMMENT;
            }

            private SearchContentType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$DocFilter$b */
        private static final class C19072b extends ProtoAdapter<DocFilter> {
            C19072b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(DocFilter docFilter) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, docFilter.creator_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, docFilter.chat_ids) + Doc.Type.ADAPTER.asRepeated().encodedSizeWithTag(3, docFilter.types);
                if (docFilter.review_time_range != null) {
                    i = TimeRange.ADAPTER.encodedSizeWithTag(5, docFilter.review_time_range);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + SearchContentType.ADAPTER.asRepeated().encodedSizeWithTag(6, docFilter.search_content_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, docFilter.sharer_ids) + docFilter.unknownFields().size();
            }

            /* renamed from: a */
            public DocFilter decode(ProtoReader protoReader) throws IOException {
                C19071a aVar = new C19071a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47167a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f47168b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        try {
                            aVar.f47169c.add(Doc.Type.ADAPTER.decode(protoReader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 5) {
                        aVar.f47170d = TimeRange.ADAPTER.decode(protoReader);
                    } else if (nextTag == 6) {
                        try {
                            aVar.f47171e.add(SearchContentType.ADAPTER.decode(protoReader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    } else if (nextTag != 7) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47172f.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocFilter docFilter) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, docFilter.creator_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, docFilter.chat_ids);
                Doc.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, docFilter.types);
                if (docFilter.review_time_range != null) {
                    TimeRange.ADAPTER.encodeWithTag(protoWriter, 5, docFilter.review_time_range);
                }
                SearchContentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, docFilter.search_content_types);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, docFilter.sharer_ids);
                protoWriter.writeBytes(docFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$DocFilter$a */
        public static final class C19071a extends Message.Builder<DocFilter, C19071a> {

            /* renamed from: a */
            public List<String> f47167a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f47168b = Internal.newMutableList();

            /* renamed from: c */
            public List<Doc.Type> f47169c = Internal.newMutableList();

            /* renamed from: d */
            public TimeRange f47170d;

            /* renamed from: e */
            public List<SearchContentType> f47171e = Internal.newMutableList();

            /* renamed from: f */
            public List<String> f47172f = Internal.newMutableList();

            /* renamed from: a */
            public DocFilter build() {
                return new DocFilter(this.f47167a, this.f47168b, this.f47169c, this.f47170d, this.f47171e, this.f47172f, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19071a mo65249a(TimeRange timeRange) {
                this.f47170d = timeRange;
                return this;
            }

            /* renamed from: a */
            public C19071a mo65250a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47167a = list;
                return this;
            }

            /* renamed from: b */
            public C19071a mo65252b(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47168b = list;
                return this;
            }

            /* renamed from: c */
            public C19071a mo65253c(List<Doc.Type> list) {
                Internal.checkElementsNotNull(list);
                this.f47169c = list;
                return this;
            }

            /* renamed from: d */
            public C19071a mo65254d(List<SearchContentType> list) {
                Internal.checkElementsNotNull(list);
                this.f47171e = list;
                return this;
            }

            /* renamed from: e */
            public C19071a mo65255e(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47172f = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19071a newBuilder() {
            C19071a aVar = new C19071a();
            aVar.f47167a = Internal.copyOf("creator_ids", this.creator_ids);
            aVar.f47168b = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f47169c = Internal.copyOf("types", this.types);
            aVar.f47170d = this.review_time_range;
            aVar.f47171e = Internal.copyOf("search_content_types", this.search_content_types);
            aVar.f47172f = Internal.copyOf("sharer_ids", this.sharer_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "DocFilter");
            StringBuilder sb = new StringBuilder();
            if (!this.creator_ids.isEmpty()) {
                sb.append(", creator_ids=");
                sb.append(this.creator_ids);
            }
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (!this.types.isEmpty()) {
                sb.append(", types=");
                sb.append(this.types);
            }
            if (this.review_time_range != null) {
                sb.append(", review_time_range=");
                sb.append(this.review_time_range);
            }
            if (!this.search_content_types.isEmpty()) {
                sb.append(", search_content_types=");
                sb.append(this.search_content_types);
            }
            if (!this.sharer_ids.isEmpty()) {
                sb.append(", sharer_ids=");
                sb.append(this.sharer_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "DocFilter{");
            replace.append('}');
            return replace.toString();
        }

        public DocFilter(List<String> list, List<String> list2, List<Doc.Type> list3, TimeRange timeRange, List<SearchContentType> list4, List<String> list5) {
            this(list, list2, list3, timeRange, list4, list5, ByteString.EMPTY);
        }

        public DocFilter(List<String> list, List<String> list2, List<Doc.Type> list3, TimeRange timeRange, List<SearchContentType> list4, List<String> list5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.creator_ids = Internal.immutableCopyOf("creator_ids", list);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list2);
            this.types = Internal.immutableCopyOf("types", list3);
            this.review_time_range = timeRange;
            this.search_content_types = Internal.immutableCopyOf("search_content_types", list4);
            this.sharer_ids = Internal.immutableCopyOf("sharer_ids", list5);
        }
    }

    public static final class MessageFilter extends Message<MessageFilter, C19073a> {
        public static final ProtoAdapter<MessageFilter> ADAPTER = new C19074b();
        private static final long serialVersionUID = 0;
        public final List<String> chat_ids;
        public final List<String> creator_ids;
        public final List<FromType> excluded_from_types;
        public final List<FromType> from_types;
        public final List<String> include_at_user_ids;
        public final List<Message.Type> message_types;
        public final List<String> receiver_ids;
        public final List<SearchType> search_types;
        public final TimeRange time_range;

        public enum FromType implements WireEnum {
            BOT(1),
            USER(2);
            
            public static final ProtoAdapter<FromType> ADAPTER = ProtoAdapter.newEnumAdapter(FromType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static FromType fromValue(int i) {
                if (i == 1) {
                    return BOT;
                }
                if (i != 2) {
                    return null;
                }
                return USER;
            }

            private FromType(int i) {
                this.value = i;
            }
        }

        public enum SearchType implements WireEnum {
            UNKNOWN(2),
            PIN(3);
            
            public static final ProtoAdapter<SearchType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SearchType fromValue(int i) {
                if (i == 2) {
                    return UNKNOWN;
                }
                if (i != 3) {
                    return null;
                }
                return PIN;
            }

            private SearchType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$MessageFilter$b */
        private static final class C19074b extends ProtoAdapter<MessageFilter> {
            C19074b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageFilter messageFilter) {
                int i;
                if (messageFilter.time_range != null) {
                    i = TimeRange.ADAPTER.encodedSizeWithTag(1, messageFilter.time_range);
                } else {
                    i = 0;
                }
                return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, messageFilter.creator_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, messageFilter.chat_ids) + SearchType.ADAPTER.asRepeated().encodedSizeWithTag(5, messageFilter.search_types) + Message.Type.ADAPTER.asRepeated().encodedSizeWithTag(6, messageFilter.message_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, messageFilter.include_at_user_ids) + FromType.ADAPTER.asRepeated().encodedSizeWithTag(9, messageFilter.from_types) + FromType.ADAPTER.asRepeated().encodedSizeWithTag(10, messageFilter.excluded_from_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, messageFilter.receiver_ids) + messageFilter.unknownFields().size();
            }

            /* renamed from: a */
            public MessageFilter decode(ProtoReader protoReader) throws IOException {
                C19073a aVar = new C19073a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f47173a = TimeRange.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                aVar.f47174b.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 3:
                            case 7:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 4:
                                aVar.f47175c.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 5:
                                try {
                                    aVar.f47176d.add(SearchType.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 6:
                                try {
                                    aVar.f47177e.add(Message.Type.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 8:
                                aVar.f47178f.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 9:
                                try {
                                    aVar.f47179g.add(FromType.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 10:
                                try {
                                    aVar.f47180h.add(FromType.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                    break;
                                }
                            case 11:
                                aVar.f47181i.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageFilter messageFilter) throws IOException {
                if (messageFilter.time_range != null) {
                    TimeRange.ADAPTER.encodeWithTag(protoWriter, 1, messageFilter.time_range);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, messageFilter.creator_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, messageFilter.chat_ids);
                SearchType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, messageFilter.search_types);
                Message.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, messageFilter.message_types);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, messageFilter.include_at_user_ids);
                FromType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, messageFilter.from_types);
                FromType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, messageFilter.excluded_from_types);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, messageFilter.receiver_ids);
                protoWriter.writeBytes(messageFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$MessageFilter$a */
        public static final class C19073a extends Message.Builder<MessageFilter, C19073a> {

            /* renamed from: a */
            public TimeRange f47173a;

            /* renamed from: b */
            public List<String> f47174b = Internal.newMutableList();

            /* renamed from: c */
            public List<String> f47175c = Internal.newMutableList();

            /* renamed from: d */
            public List<SearchType> f47176d = Internal.newMutableList();

            /* renamed from: e */
            public List<Message.Type> f47177e = Internal.newMutableList();

            /* renamed from: f */
            public List<String> f47178f = Internal.newMutableList();

            /* renamed from: g */
            public List<FromType> f47179g = Internal.newMutableList();

            /* renamed from: h */
            public List<FromType> f47180h = Internal.newMutableList();

            /* renamed from: i */
            public List<String> f47181i = Internal.newMutableList();

            /* renamed from: a */
            public MessageFilter build() {
                return new MessageFilter(this.f47173a, this.f47174b, this.f47175c, this.f47176d, this.f47177e, this.f47178f, this.f47179g, this.f47180h, this.f47181i, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19073a mo65259a(TimeRange timeRange) {
                this.f47173a = timeRange;
                return this;
            }

            /* renamed from: a */
            public C19073a mo65260a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47174b = list;
                return this;
            }

            /* renamed from: b */
            public C19073a mo65262b(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47175c = list;
                return this;
            }

            /* renamed from: c */
            public C19073a mo65263c(List<Message.Type> list) {
                Internal.checkElementsNotNull(list);
                this.f47177e = list;
                return this;
            }

            /* renamed from: d */
            public C19073a mo65264d(List<FromType> list) {
                Internal.checkElementsNotNull(list);
                this.f47179g = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19073a newBuilder() {
            C19073a aVar = new C19073a();
            aVar.f47173a = this.time_range;
            aVar.f47174b = Internal.copyOf("creator_ids", this.creator_ids);
            aVar.f47175c = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f47176d = Internal.copyOf("search_types", this.search_types);
            aVar.f47177e = Internal.copyOf("message_types", this.message_types);
            aVar.f47178f = Internal.copyOf("include_at_user_ids", this.include_at_user_ids);
            aVar.f47179g = Internal.copyOf("from_types", this.from_types);
            aVar.f47180h = Internal.copyOf("excluded_from_types", this.excluded_from_types);
            aVar.f47181i = Internal.copyOf("receiver_ids", this.receiver_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "MessageFilter");
            StringBuilder sb = new StringBuilder();
            if (this.time_range != null) {
                sb.append(", time_range=");
                sb.append(this.time_range);
            }
            if (!this.creator_ids.isEmpty()) {
                sb.append(", creator_ids=");
                sb.append(this.creator_ids);
            }
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (!this.search_types.isEmpty()) {
                sb.append(", search_types=");
                sb.append(this.search_types);
            }
            if (!this.message_types.isEmpty()) {
                sb.append(", message_types=");
                sb.append(this.message_types);
            }
            if (!this.include_at_user_ids.isEmpty()) {
                sb.append(", include_at_user_ids=");
                sb.append(this.include_at_user_ids);
            }
            if (!this.from_types.isEmpty()) {
                sb.append(", from_types=");
                sb.append(this.from_types);
            }
            if (!this.excluded_from_types.isEmpty()) {
                sb.append(", excluded_from_types=");
                sb.append(this.excluded_from_types);
            }
            if (!this.receiver_ids.isEmpty()) {
                sb.append(", receiver_ids=");
                sb.append(this.receiver_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageFilter{");
            replace.append('}');
            return replace.toString();
        }

        public MessageFilter(TimeRange timeRange, List<String> list, List<String> list2, List<SearchType> list3, List<Message.Type> list4, List<String> list5, List<FromType> list6, List<FromType> list7, List<String> list8) {
            this(timeRange, list, list2, list3, list4, list5, list6, list7, list8, ByteString.EMPTY);
        }

        public MessageFilter(TimeRange timeRange, List<String> list, List<String> list2, List<SearchType> list3, List<Message.Type> list4, List<String> list5, List<FromType> list6, List<FromType> list7, List<String> list8, ByteString byteString) {
            super(ADAPTER, byteString);
            this.time_range = timeRange;
            this.creator_ids = Internal.immutableCopyOf("creator_ids", list);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list2);
            this.search_types = Internal.immutableCopyOf("search_types", list3);
            this.message_types = Internal.immutableCopyOf("message_types", list4);
            this.include_at_user_ids = Internal.immutableCopyOf("include_at_user_ids", list5);
            this.from_types = Internal.immutableCopyOf("from_types", list6);
            this.excluded_from_types = Internal.immutableCopyOf("excluded_from_types", list7);
            this.receiver_ids = Internal.immutableCopyOf("receiver_ids", list8);
        }
    }

    public static final class UserFilter extends com.squareup.wire.Message<UserFilter, C19083a> {
        public static final ProtoAdapter<UserFilter> ADAPTER = new C19084b();
        public static final Boolean DEFAULT_EXCLUDE = false;
        private static final long serialVersionUID = 0;
        public final Map<String, FieldValues> custom_fields;
        public final Boolean exclude;
        public final List<Integer> search_type;

        public enum SearchType implements WireEnum {
            ALL(0),
            UN_RESIGNED(1),
            RESIGNED(2),
            TALKED(4),
            UN_TALKED(8);
            
            public static final ProtoAdapter<SearchType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SearchType fromValue(int i) {
                if (i == 0) {
                    return ALL;
                }
                if (i == 1) {
                    return UN_RESIGNED;
                }
                if (i == 2) {
                    return RESIGNED;
                }
                if (i == 4) {
                    return TALKED;
                }
                if (i != 8) {
                    return null;
                }
                return UN_TALKED;
            }

            private SearchType(int i) {
                this.value = i;
            }
        }

        public static final class FieldValues extends com.squareup.wire.Message<FieldValues, C19081a> {
            public static final ProtoAdapter<FieldValues> ADAPTER = new C19082b();
            private static final long serialVersionUID = 0;
            public final List<String> values;

            /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$UserFilter$FieldValues$b */
            private static final class C19082b extends ProtoAdapter<FieldValues> {
                C19082b() {
                    super(FieldEncoding.LENGTH_DELIMITED, FieldValues.class);
                }

                /* renamed from: a */
                public int encodedSize(FieldValues fieldValues) {
                    return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, fieldValues.values) + fieldValues.unknownFields().size();
                }

                /* renamed from: a */
                public FieldValues decode(ProtoReader protoReader) throws IOException {
                    C19081a aVar = new C19081a();
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
                            aVar.f47189a.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, FieldValues fieldValues) throws IOException {
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, fieldValues.values);
                    protoWriter.writeBytes(fieldValues.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$UserFilter$FieldValues$a */
            public static final class C19081a extends Message.Builder<FieldValues, C19081a> {

                /* renamed from: a */
                public List<String> f47189a = Internal.newMutableList();

                /* renamed from: a */
                public FieldValues build() {
                    return new FieldValues(this.f47189a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C19081a newBuilder() {
                C19081a aVar = new C19081a();
                aVar.f47189a = Internal.copyOf("values", this.values);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("search", "FieldValues");
                StringBuilder sb = new StringBuilder();
                if (!this.values.isEmpty()) {
                    sb.append(", values=");
                    sb.append(this.values);
                }
                StringBuilder replace = sb.replace(0, 2, "FieldValues{");
                replace.append('}');
                return replace.toString();
            }

            public FieldValues(List<String> list) {
                this(list, ByteString.EMPTY);
            }

            public FieldValues(List<String> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.values = Internal.immutableCopyOf("values", list);
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$UserFilter$a */
        public static final class C19083a extends Message.Builder<UserFilter, C19083a> {

            /* renamed from: a */
            public List<Integer> f47190a = Internal.newMutableList();

            /* renamed from: b */
            public Map<String, FieldValues> f47191b = Internal.newMutableMap();

            /* renamed from: c */
            public Boolean f47192c;

            /* renamed from: a */
            public UserFilter build() {
                return new UserFilter(this.f47190a, this.f47191b, this.f47192c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19083a mo65291a(Boolean bool) {
                this.f47192c = bool;
                return this;
            }

            /* renamed from: a */
            public C19083a mo65292a(List<Integer> list) {
                Internal.checkElementsNotNull(list);
                this.f47190a = list;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$UserFilter$b */
        private static final class C19084b extends ProtoAdapter<UserFilter> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, FieldValues>> f47193a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FieldValues.ADAPTER);

            C19084b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(UserFilter userFilter) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, userFilter.search_type) + this.f47193a.encodedSizeWithTag(3, userFilter.custom_fields);
                if (userFilter.exclude != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(4, userFilter.exclude);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + userFilter.unknownFields().size();
            }

            /* renamed from: a */
            public UserFilter decode(ProtoReader protoReader) throws IOException {
                C19083a aVar = new C19083a();
                aVar.f47192c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47190a.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f47191b.putAll(this.f47193a.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47192c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserFilter userFilter) throws IOException {
                ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, userFilter.search_type);
                this.f47193a.encodeWithTag(protoWriter, 3, userFilter.custom_fields);
                if (userFilter.exclude != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, userFilter.exclude);
                }
                protoWriter.writeBytes(userFilter.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19083a newBuilder() {
            C19083a aVar = new C19083a();
            aVar.f47190a = Internal.copyOf("search_type", this.search_type);
            aVar.f47191b = Internal.copyOf("custom_fields", this.custom_fields);
            aVar.f47192c = this.exclude;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "UserFilter");
            StringBuilder sb = new StringBuilder();
            if (!this.search_type.isEmpty()) {
                sb.append(", search_type=");
                sb.append(this.search_type);
            }
            if (!this.custom_fields.isEmpty()) {
                sb.append(", custom_fields=");
                sb.append(this.custom_fields);
            }
            if (this.exclude != null) {
                sb.append(", exclude=");
                sb.append(this.exclude);
            }
            StringBuilder replace = sb.replace(0, 2, "UserFilter{");
            replace.append('}');
            return replace.toString();
        }

        public UserFilter(List<Integer> list, Map<String, FieldValues> map, Boolean bool) {
            this(list, map, bool, ByteString.EMPTY);
        }

        public UserFilter(List<Integer> list, Map<String, FieldValues> map, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.search_type = Internal.immutableCopyOf("search_type", list);
            this.custom_fields = Internal.immutableCopyOf("custom_fields", map);
            this.exclude = bool;
        }
    }

    public static final class WikiFilter extends com.squareup.wire.Message<WikiFilter, C19085a> {
        public static final ProtoAdapter<WikiFilter> ADAPTER = new C19086b();
        private static final long serialVersionUID = 0;
        public final List<String> chat_ids;
        public final List<String> creator_ids;
        public final List<String> repo_ids;
        public final TimeRange review_time_range;
        public final List<SearchContentType> search_content_types;
        public final List<String> sharer_ids;
        public final List<Doc.Type> types;

        public enum SearchContentType implements WireEnum {
            ONLY_TITLE(1),
            FULL_CONTENT(2),
            ONLY_COMMENT(3);
            
            public static final ProtoAdapter<SearchContentType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchContentType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SearchContentType fromValue(int i) {
                if (i == 1) {
                    return ONLY_TITLE;
                }
                if (i == 2) {
                    return FULL_CONTENT;
                }
                if (i != 3) {
                    return null;
                }
                return ONLY_COMMENT;
            }

            private SearchContentType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$WikiFilter$b */
        private static final class C19086b extends ProtoAdapter<WikiFilter> {
            C19086b() {
                super(FieldEncoding.LENGTH_DELIMITED, WikiFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(WikiFilter wikiFilter) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, wikiFilter.creator_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, wikiFilter.chat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, wikiFilter.repo_ids);
                if (wikiFilter.review_time_range != null) {
                    i = TimeRange.ADAPTER.encodedSizeWithTag(4, wikiFilter.review_time_range);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + Doc.Type.ADAPTER.asRepeated().encodedSizeWithTag(5, wikiFilter.types) + SearchContentType.ADAPTER.asRepeated().encodedSizeWithTag(6, wikiFilter.search_content_types) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, wikiFilter.sharer_ids) + wikiFilter.unknownFields().size();
            }

            /* renamed from: a */
            public WikiFilter decode(ProtoReader protoReader) throws IOException {
                C19085a aVar = new C19085a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f47194a.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 2:
                                aVar.f47195b.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 3:
                                aVar.f47196c.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 4:
                                aVar.f47197d = TimeRange.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    aVar.f47198e.add(Doc.Type.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 6:
                                try {
                                    aVar.f47199f.add(SearchContentType.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 7:
                                aVar.f47200g.add(ProtoAdapter.STRING.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, WikiFilter wikiFilter) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, wikiFilter.creator_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, wikiFilter.chat_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, wikiFilter.repo_ids);
                if (wikiFilter.review_time_range != null) {
                    TimeRange.ADAPTER.encodeWithTag(protoWriter, 4, wikiFilter.review_time_range);
                }
                Doc.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, wikiFilter.types);
                SearchContentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, wikiFilter.search_content_types);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, wikiFilter.sharer_ids);
                protoWriter.writeBytes(wikiFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$WikiFilter$a */
        public static final class C19085a extends Message.Builder<WikiFilter, C19085a> {

            /* renamed from: a */
            public List<String> f47194a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f47195b = Internal.newMutableList();

            /* renamed from: c */
            public List<String> f47196c = Internal.newMutableList();

            /* renamed from: d */
            public TimeRange f47197d;

            /* renamed from: e */
            public List<Doc.Type> f47198e = Internal.newMutableList();

            /* renamed from: f */
            public List<SearchContentType> f47199f = Internal.newMutableList();

            /* renamed from: g */
            public List<String> f47200g = Internal.newMutableList();

            /* renamed from: a */
            public WikiFilter build() {
                return new WikiFilter(this.f47194a, this.f47195b, this.f47196c, this.f47197d, this.f47198e, this.f47199f, this.f47200g, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19085a mo65297a(TimeRange timeRange) {
                this.f47197d = timeRange;
                return this;
            }

            /* renamed from: a */
            public C19085a mo65298a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47194a = list;
                return this;
            }

            /* renamed from: b */
            public C19085a mo65300b(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47195b = list;
                return this;
            }

            /* renamed from: c */
            public C19085a mo65301c(List<Doc.Type> list) {
                Internal.checkElementsNotNull(list);
                this.f47198e = list;
                return this;
            }

            /* renamed from: d */
            public C19085a mo65302d(List<SearchContentType> list) {
                Internal.checkElementsNotNull(list);
                this.f47199f = list;
                return this;
            }

            /* renamed from: e */
            public C19085a mo65303e(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47200g = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19085a newBuilder() {
            C19085a aVar = new C19085a();
            aVar.f47194a = Internal.copyOf("creator_ids", this.creator_ids);
            aVar.f47195b = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f47196c = Internal.copyOf("repo_ids", this.repo_ids);
            aVar.f47197d = this.review_time_range;
            aVar.f47198e = Internal.copyOf("types", this.types);
            aVar.f47199f = Internal.copyOf("search_content_types", this.search_content_types);
            aVar.f47200g = Internal.copyOf("sharer_ids", this.sharer_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "WikiFilter");
            StringBuilder sb = new StringBuilder();
            if (!this.creator_ids.isEmpty()) {
                sb.append(", creator_ids=");
                sb.append(this.creator_ids);
            }
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (!this.repo_ids.isEmpty()) {
                sb.append(", repo_ids=");
                sb.append(this.repo_ids);
            }
            if (this.review_time_range != null) {
                sb.append(", review_time_range=");
                sb.append(this.review_time_range);
            }
            if (!this.types.isEmpty()) {
                sb.append(", types=");
                sb.append(this.types);
            }
            if (!this.search_content_types.isEmpty()) {
                sb.append(", search_content_types=");
                sb.append(this.search_content_types);
            }
            if (!this.sharer_ids.isEmpty()) {
                sb.append(", sharer_ids=");
                sb.append(this.sharer_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "WikiFilter{");
            replace.append('}');
            return replace.toString();
        }

        public WikiFilter(List<String> list, List<String> list2, List<String> list3, TimeRange timeRange, List<Doc.Type> list4, List<SearchContentType> list5, List<String> list6) {
            this(list, list2, list3, timeRange, list4, list5, list6, ByteString.EMPTY);
        }

        public WikiFilter(List<String> list, List<String> list2, List<String> list3, TimeRange timeRange, List<Doc.Type> list4, List<SearchContentType> list5, List<String> list6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.creator_ids = Internal.immutableCopyOf("creator_ids", list);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list2);
            this.repo_ids = Internal.immutableCopyOf("repo_ids", list3);
            this.review_time_range = timeRange;
            this.types = Internal.immutableCopyOf("types", list4);
            this.search_content_types = Internal.immutableCopyOf("search_content_types", list5);
            this.sharer_ids = Internal.immutableCopyOf("sharer_ids", list6);
        }
    }

    public static final class CustomizationFilter extends com.squareup.wire.Message<CustomizationFilter, C19067a> {
        public static final ProtoAdapter<CustomizationFilter> ADAPTER = new C19068b();
        private static final long serialVersionUID = 0;
        public final Map<String, Templates> templates;

        public static final class Templates extends com.squareup.wire.Message<Templates, C19065a> {
            public static final ProtoAdapter<Templates> ADAPTER = new C19066b();
            private static final long serialVersionUID = 0;
            public final List<String> versions;

            /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$CustomizationFilter$Templates$b */
            private static final class C19066b extends ProtoAdapter<Templates> {
                C19066b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Templates.class);
                }

                /* renamed from: a */
                public int encodedSize(Templates templates) {
                    return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, templates.versions) + templates.unknownFields().size();
                }

                /* renamed from: a */
                public Templates decode(ProtoReader protoReader) throws IOException {
                    C19065a aVar = new C19065a();
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
                            aVar.f47163a.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Templates templates) throws IOException {
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, templates.versions);
                    protoWriter.writeBytes(templates.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$CustomizationFilter$Templates$a */
            public static final class C19065a extends Message.Builder<Templates, C19065a> {

                /* renamed from: a */
                public List<String> f47163a = Internal.newMutableList();

                /* renamed from: a */
                public Templates build() {
                    return new Templates(this.f47163a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C19065a newBuilder() {
                C19065a aVar = new C19065a();
                aVar.f47163a = Internal.copyOf("versions", this.versions);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("search", "Templates");
                StringBuilder sb = new StringBuilder();
                if (!this.versions.isEmpty()) {
                    sb.append(", versions=");
                    sb.append(this.versions);
                }
                StringBuilder replace = sb.replace(0, 2, "Templates{");
                replace.append('}');
                return replace.toString();
            }

            public Templates(List<String> list) {
                this(list, ByteString.EMPTY);
            }

            public Templates(List<String> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.versions = Internal.immutableCopyOf("versions", list);
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$CustomizationFilter$a */
        public static final class C19067a extends Message.Builder<CustomizationFilter, C19067a> {

            /* renamed from: a */
            public Map<String, Templates> f47164a = Internal.newMutableMap();

            /* renamed from: a */
            public CustomizationFilter build() {
                return new CustomizationFilter(this.f47164a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$CustomizationFilter$b */
        private static final class C19068b extends ProtoAdapter<CustomizationFilter> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, Templates>> f47165a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Templates.ADAPTER);

            C19068b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomizationFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomizationFilter customizationFilter) {
                return this.f47165a.encodedSizeWithTag(1, customizationFilter.templates) + customizationFilter.unknownFields().size();
            }

            /* renamed from: a */
            public CustomizationFilter decode(ProtoReader protoReader) throws IOException {
                C19067a aVar = new C19067a();
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
                        aVar.f47164a.putAll(this.f47165a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CustomizationFilter customizationFilter) throws IOException {
                this.f47165a.encodeWithTag(protoWriter, 1, customizationFilter.templates);
                protoWriter.writeBytes(customizationFilter.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19067a newBuilder() {
            C19067a aVar = new C19067a();
            aVar.f47164a = Internal.copyOf("templates", this.templates);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "CustomizationFilter");
            StringBuilder sb = new StringBuilder();
            if (!this.templates.isEmpty()) {
                sb.append(", templates=");
                sb.append(this.templates);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomizationFilter{");
            replace.append('}');
            return replace.toString();
        }

        public CustomizationFilter(Map<String, Templates> map) {
            this(map, ByteString.EMPTY);
        }

        public CustomizationFilter(Map<String, Templates> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.templates = Internal.immutableCopyOf("templates", map);
        }
    }

    public static final class CommonFilter extends com.squareup.wire.Message<CommonFilter, C19063a> {
        public static final ProtoAdapter<CommonFilter> ADAPTER = new C19064b();
        public static final Boolean DEFAULT_INCLUDE_OUTER_TENANT = true;
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final TimeRange common_time_range;
        public final Boolean include_outer_tenant;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$CommonFilter$b */
        private static final class C19064b extends ProtoAdapter<CommonFilter> {
            C19064b() {
                super(FieldEncoding.LENGTH_DELIMITED, CommonFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(CommonFilter commonFilter) {
                int i;
                int i2;
                int i3 = 0;
                if (commonFilter.include_outer_tenant != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, commonFilter.include_outer_tenant);
                } else {
                    i = 0;
                }
                if (commonFilter.chat_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, commonFilter.chat_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (commonFilter.common_time_range != null) {
                    i3 = TimeRange.ADAPTER.encodedSizeWithTag(2, commonFilter.common_time_range);
                }
                return i4 + i3 + commonFilter.unknownFields().size();
            }

            /* renamed from: a */
            public CommonFilter decode(ProtoReader protoReader) throws IOException {
                C19063a aVar = new C19063a();
                aVar.f47160a = true;
                aVar.f47161b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47160a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f47162c = TimeRange.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47161b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CommonFilter commonFilter) throws IOException {
                if (commonFilter.include_outer_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, commonFilter.include_outer_tenant);
                }
                if (commonFilter.chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commonFilter.chat_id);
                }
                if (commonFilter.common_time_range != null) {
                    TimeRange.ADAPTER.encodeWithTag(protoWriter, 2, commonFilter.common_time_range);
                }
                protoWriter.writeBytes(commonFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$CommonFilter$a */
        public static final class C19063a extends Message.Builder<CommonFilter, C19063a> {

            /* renamed from: a */
            public Boolean f47160a;

            /* renamed from: b */
            public String f47161b;

            /* renamed from: c */
            public TimeRange f47162c;

            /* renamed from: a */
            public CommonFilter build() {
                return new CommonFilter(this.f47160a, this.f47161b, this.f47162c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19063a mo65230a(Boolean bool) {
                this.f47160a = bool;
                return this;
            }

            /* renamed from: a */
            public C19063a mo65231a(String str) {
                this.f47161b = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19063a newBuilder() {
            C19063a aVar = new C19063a();
            aVar.f47160a = this.include_outer_tenant;
            aVar.f47161b = this.chat_id;
            aVar.f47162c = this.common_time_range;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "CommonFilter");
            StringBuilder sb = new StringBuilder();
            if (this.include_outer_tenant != null) {
                sb.append(", include_outer_tenant=");
                sb.append(this.include_outer_tenant);
            }
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.common_time_range != null) {
                sb.append(", common_time_range=");
                sb.append(this.common_time_range);
            }
            StringBuilder replace = sb.replace(0, 2, "CommonFilter{");
            replace.append('}');
            return replace.toString();
        }

        public CommonFilter(Boolean bool, String str, TimeRange timeRange) {
            this(bool, str, timeRange, ByteString.EMPTY);
        }

        public CommonFilter(Boolean bool, String str, TimeRange timeRange, ByteString byteString) {
            super(ADAPTER, byteString);
            this.include_outer_tenant = bool;
            this.chat_id = str;
            this.common_time_range = timeRange;
        }
    }

    public static final class DepartmentFilter extends com.squareup.wire.Message<DepartmentFilter, C19069a> {
        public static final ProtoAdapter<DepartmentFilter> ADAPTER = new C19070b();
        public static final Boolean DEFAULT_ADDABLE_AS_USER = false;
        private static final long serialVersionUID = 0;
        public final Boolean addable_as_user;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$DepartmentFilter$b */
        private static final class C19070b extends ProtoAdapter<DepartmentFilter> {
            C19070b() {
                super(FieldEncoding.LENGTH_DELIMITED, DepartmentFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(DepartmentFilter departmentFilter) {
                int i;
                if (departmentFilter.addable_as_user != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, departmentFilter.addable_as_user);
                } else {
                    i = 0;
                }
                return i + departmentFilter.unknownFields().size();
            }

            /* renamed from: a */
            public DepartmentFilter decode(ProtoReader protoReader) throws IOException {
                C19069a aVar = new C19069a();
                aVar.f47166a = false;
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
                        aVar.f47166a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DepartmentFilter departmentFilter) throws IOException {
                if (departmentFilter.addable_as_user != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, departmentFilter.addable_as_user);
                }
                protoWriter.writeBytes(departmentFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$DepartmentFilter$a */
        public static final class C19069a extends Message.Builder<DepartmentFilter, C19069a> {

            /* renamed from: a */
            public Boolean f47166a;

            /* renamed from: a */
            public DepartmentFilter build() {
                return new DepartmentFilter(this.f47166a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19069a mo65244a(Boolean bool) {
                this.f47166a = bool;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19069a newBuilder() {
            C19069a aVar = new C19069a();
            aVar.f47166a = this.addable_as_user;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "DepartmentFilter");
            StringBuilder sb = new StringBuilder();
            if (this.addable_as_user != null) {
                sb.append(", addable_as_user=");
                sb.append(this.addable_as_user);
            }
            StringBuilder replace = sb.replace(0, 2, "DepartmentFilter{");
            replace.append('}');
            return replace.toString();
        }

        public DepartmentFilter(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public DepartmentFilter(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.addable_as_user = bool;
        }
    }

    public static final class SlashCommandFilter extends com.squareup.wire.Message<SlashCommandFilter, C19075a> {
        public static final ProtoAdapter<SlashCommandFilter> ADAPTER = new C19076b();
        private static final long serialVersionUID = 0;
        public final String command_id;
        public final List<String> extras;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$SlashCommandFilter$b */
        private static final class C19076b extends ProtoAdapter<SlashCommandFilter> {
            C19076b() {
                super(FieldEncoding.LENGTH_DELIMITED, SlashCommandFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(SlashCommandFilter slashCommandFilter) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, slashCommandFilter.command_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, slashCommandFilter.extras) + slashCommandFilter.unknownFields().size();
            }

            /* renamed from: a */
            public SlashCommandFilter decode(ProtoReader protoReader) throws IOException {
                C19075a aVar = new C19075a();
                aVar.f47182a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47182a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47183b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SlashCommandFilter slashCommandFilter) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, slashCommandFilter.command_id);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, slashCommandFilter.extras);
                protoWriter.writeBytes(slashCommandFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$SlashCommandFilter$a */
        public static final class C19075a extends Message.Builder<SlashCommandFilter, C19075a> {

            /* renamed from: a */
            public String f47182a;

            /* renamed from: b */
            public List<String> f47183b = Internal.newMutableList();

            /* renamed from: a */
            public SlashCommandFilter build() {
                String str = this.f47182a;
                if (str != null) {
                    return new SlashCommandFilter(str, this.f47183b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "command_id");
            }

            /* renamed from: a */
            public C19075a mo65268a(String str) {
                this.f47182a = str;
                return this;
            }

            /* renamed from: a */
            public C19075a mo65269a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47183b = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19075a newBuilder() {
            C19075a aVar = new C19075a();
            aVar.f47182a = this.command_id;
            aVar.f47183b = Internal.copyOf("extras", this.extras);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SlashCommandFilter");
            StringBuilder sb = new StringBuilder();
            sb.append(", command_id=");
            sb.append(this.command_id);
            if (!this.extras.isEmpty()) {
                sb.append(", extras=");
                sb.append(this.extras);
            }
            StringBuilder replace = sb.replace(0, 2, "SlashCommandFilter{");
            replace.append('}');
            return replace.toString();
        }

        public SlashCommandFilter(String str, List<String> list) {
            this(str, list, ByteString.EMPTY);
        }

        public SlashCommandFilter(String str, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.command_id = str;
            this.extras = Internal.immutableCopyOf("extras", list);
        }
    }

    public static final class TimeRange extends com.squareup.wire.Message<TimeRange, C19077a> {
        public static final ProtoAdapter<TimeRange> ADAPTER = new C19078b();
        public static final Long DEFAULT_END_TIME = 0L;
        public static final Long DEFAULT_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long end_time;
        public final Long start_time;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$TimeRange$b */
        private static final class C19078b extends ProtoAdapter<TimeRange> {
            C19078b() {
                super(FieldEncoding.LENGTH_DELIMITED, TimeRange.class);
            }

            /* renamed from: a */
            public int encodedSize(TimeRange timeRange) {
                int i;
                int i2 = 0;
                if (timeRange.start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, timeRange.start_time);
                } else {
                    i = 0;
                }
                if (timeRange.end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, timeRange.end_time);
                }
                return i + i2 + timeRange.unknownFields().size();
            }

            /* renamed from: a */
            public TimeRange decode(ProtoReader protoReader) throws IOException {
                C19077a aVar = new C19077a();
                aVar.f47184a = 0L;
                aVar.f47185b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47184a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47185b = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TimeRange timeRange) throws IOException {
                if (timeRange.start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, timeRange.start_time);
                }
                if (timeRange.end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, timeRange.end_time);
                }
                protoWriter.writeBytes(timeRange.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$TimeRange$a */
        public static final class C19077a extends Message.Builder<TimeRange, C19077a> {

            /* renamed from: a */
            public Long f47184a;

            /* renamed from: b */
            public Long f47185b;

            /* renamed from: a */
            public TimeRange build() {
                return new TimeRange(this.f47184a, this.f47185b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19077a mo65274a(Long l) {
                this.f47184a = l;
                return this;
            }

            /* renamed from: b */
            public C19077a mo65276b(Long l) {
                this.f47185b = l;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19077a newBuilder() {
            C19077a aVar = new C19077a();
            aVar.f47184a = this.start_time;
            aVar.f47185b = this.end_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "TimeRange");
            StringBuilder sb = new StringBuilder();
            if (this.start_time != null) {
                sb.append(", start_time=");
                sb.append(this.start_time);
            }
            if (this.end_time != null) {
                sb.append(", end_time=");
                sb.append(this.end_time);
            }
            StringBuilder replace = sb.replace(0, 2, "TimeRange{");
            replace.append('}');
            return replace.toString();
        }

        public TimeRange(Long l, Long l2) {
            this(l, l2, ByteString.EMPTY);
        }

        public TimeRange(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start_time = l;
            this.end_time = l2;
        }
    }

    public static final class URLFilter extends com.squareup.wire.Message<URLFilter, C19079a> {
        public static final ProtoAdapter<URLFilter> ADAPTER = new C19080b();
        private static final long serialVersionUID = 0;
        public final List<String> chat_ids;
        public final List<String> creator_ids;
        public final TimeRange time_range;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$URLFilter$b */
        private static final class C19080b extends ProtoAdapter<URLFilter> {
            C19080b() {
                super(FieldEncoding.LENGTH_DELIMITED, URLFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(URLFilter uRLFilter) {
                int i;
                if (uRLFilter.time_range != null) {
                    i = TimeRange.ADAPTER.encodedSizeWithTag(1, uRLFilter.time_range);
                } else {
                    i = 0;
                }
                return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, uRLFilter.creator_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, uRLFilter.chat_ids) + uRLFilter.unknownFields().size();
            }

            /* renamed from: a */
            public URLFilter decode(ProtoReader protoReader) throws IOException {
                C19079a aVar = new C19079a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47186a = TimeRange.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f47187b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47188c.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, URLFilter uRLFilter) throws IOException {
                if (uRLFilter.time_range != null) {
                    TimeRange.ADAPTER.encodeWithTag(protoWriter, 1, uRLFilter.time_range);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, uRLFilter.creator_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, uRLFilter.chat_ids);
                protoWriter.writeBytes(uRLFilter.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$URLFilter$a */
        public static final class C19079a extends Message.Builder<URLFilter, C19079a> {

            /* renamed from: a */
            public TimeRange f47186a;

            /* renamed from: b */
            public List<String> f47187b = Internal.newMutableList();

            /* renamed from: c */
            public List<String> f47188c = Internal.newMutableList();

            /* renamed from: a */
            public URLFilter build() {
                return new URLFilter(this.f47186a, this.f47187b, this.f47188c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19079a mo65280a(TimeRange timeRange) {
                this.f47186a = timeRange;
                return this;
            }

            /* renamed from: a */
            public C19079a mo65281a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47187b = list;
                return this;
            }

            /* renamed from: b */
            public C19079a mo65283b(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f47188c = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19079a newBuilder() {
            C19079a aVar = new C19079a();
            aVar.f47186a = this.time_range;
            aVar.f47187b = Internal.copyOf("creator_ids", this.creator_ids);
            aVar.f47188c = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "URLFilter");
            StringBuilder sb = new StringBuilder();
            if (this.time_range != null) {
                sb.append(", time_range=");
                sb.append(this.time_range);
            }
            if (!this.creator_ids.isEmpty()) {
                sb.append(", creator_ids=");
                sb.append(this.creator_ids);
            }
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "URLFilter{");
            replace.append('}');
            return replace.toString();
        }

        public URLFilter(TimeRange timeRange, List<String> list, List<String> list2) {
            this(timeRange, list, list2, ByteString.EMPTY);
        }

        public URLFilter(TimeRange timeRange, List<String> list, List<String> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.time_range = timeRange;
            this.creator_ids = Internal.immutableCopyOf("creator_ids", list);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list2);
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$b */
    private static final class C19088b extends ProtoAdapter<UniversalFilters> {
        C19088b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalFilters.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalFilters universalFilters) {
            return universalFilters.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalFilters decode(ProtoReader protoReader) throws IOException {
            C19087a aVar = new C19087a();
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
        public void encode(ProtoWriter protoWriter, UniversalFilters universalFilters) throws IOException {
            protoWriter.writeBytes(universalFilters.unknownFields());
        }
    }

    public UniversalFilters() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalFilters$a */
    public static final class C19087a extends Message.Builder<UniversalFilters, C19087a> {
        /* renamed from: a */
        public UniversalFilters build() {
            return new UniversalFilters(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19087a newBuilder() {
        C19087a aVar = new C19087a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UniversalFilters");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UniversalFilters{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalFilters(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
