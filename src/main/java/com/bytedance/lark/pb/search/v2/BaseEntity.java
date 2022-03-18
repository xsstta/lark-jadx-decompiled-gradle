package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.ChatterPermissionsRequest;
import com.bytedance.lark.pb.search.v2.BaseEnum;
import com.bytedance.lark.pb.search.v2.UniversalFilters;
import com.bytedance.lark.pb.search.v2.UniversalSelectors;
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

public final class BaseEntity extends Message<BaseEntity, C18965a> {
    public static final ProtoAdapter<BaseEntity> ADAPTER = new C18966b();
    private static final long serialVersionUID = 0;

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

    public static final class EntityFilter extends Message<EntityFilter, C18947a> {
        public static final ProtoAdapter<EntityFilter> ADAPTER = new C18948b();
        private static final long serialVersionUID = 0;
        public final UniversalFilters.BotFilter bot_filter;
        public final UniversalFilters.CustomizationFilter customization_filter;
        public final UniversalFilters.DepartmentFilter department_filter;
        public final UniversalFilters.DocFilter doc_filter;
        public final UniversalFilters.ChatFilter group_chat_filter;
        public final UniversalFilters.MessageFilter message_filter;
        public final UniversalFilters.SlashCommandFilter slash_command_filter;
        public final UniversalFilters.URLFilter url_filter;
        public final UniversalFilters.UserFilter user_filter;
        public final UniversalFilters.WikiFilter wiki_filter;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$EntityFilter$a */
        public static final class C18947a extends Message.Builder<EntityFilter, C18947a> {

            /* renamed from: a */
            public UniversalFilters.UserFilter f46842a;

            /* renamed from: b */
            public UniversalFilters.ChatFilter f46843b;

            /* renamed from: c */
            public UniversalFilters.MessageFilter f46844c;

            /* renamed from: d */
            public UniversalFilters.DocFilter f46845d;

            /* renamed from: e */
            public UniversalFilters.WikiFilter f46846e;

            /* renamed from: f */
            public UniversalFilters.URLFilter f46847f;

            /* renamed from: g */
            public UniversalFilters.DepartmentFilter f46848g;

            /* renamed from: h */
            public UniversalFilters.SlashCommandFilter f46849h;

            /* renamed from: i */
            public UniversalFilters.CustomizationFilter f46850i;

            /* renamed from: j */
            public UniversalFilters.BotFilter f46851j;

            /* renamed from: a */
            public C18947a mo64934a(UniversalFilters.UserFilter userFilter) {
                this.f46842a = userFilter;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64935a(UniversalFilters.WikiFilter wikiFilter) {
                this.f46846e = wikiFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public EntityFilter build() {
                return new EntityFilter(this.f46842a, this.f46843b, this.f46844c, this.f46845d, this.f46846e, this.f46847f, this.f46848g, this.f46849h, this.f46850i, this.f46851j, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18947a mo64926a(UniversalFilters.BotFilter botFilter) {
                this.f46851j = botFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64927a(UniversalFilters.ChatFilter chatFilter) {
                this.f46843b = chatFilter;
                this.f46842a = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64928a(UniversalFilters.CustomizationFilter customizationFilter) {
                this.f46850i = customizationFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64929a(UniversalFilters.DepartmentFilter departmentFilter) {
                this.f46848g = departmentFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64930a(UniversalFilters.DocFilter docFilter) {
                this.f46845d = docFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64931a(UniversalFilters.MessageFilter messageFilter) {
                this.f46844c = messageFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64932a(UniversalFilters.SlashCommandFilter slashCommandFilter) {
                this.f46849h = slashCommandFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46847f = null;
                this.f46848g = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }

            /* renamed from: a */
            public C18947a mo64933a(UniversalFilters.URLFilter uRLFilter) {
                this.f46847f = uRLFilter;
                this.f46842a = null;
                this.f46843b = null;
                this.f46844c = null;
                this.f46845d = null;
                this.f46846e = null;
                this.f46848g = null;
                this.f46849h = null;
                this.f46850i = null;
                this.f46851j = null;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$EntityFilter$b */
        private static final class C18948b extends ProtoAdapter<EntityFilter> {
            C18948b() {
                super(FieldEncoding.LENGTH_DELIMITED, EntityFilter.class);
            }

            /* renamed from: a */
            public int encodedSize(EntityFilter entityFilter) {
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
                if (entityFilter.user_filter != null) {
                    i = UniversalFilters.UserFilter.ADAPTER.encodedSizeWithTag(1, entityFilter.user_filter);
                } else {
                    i = 0;
                }
                if (entityFilter.group_chat_filter != null) {
                    i2 = UniversalFilters.ChatFilter.ADAPTER.encodedSizeWithTag(2, entityFilter.group_chat_filter);
                } else {
                    i2 = 0;
                }
                int i11 = i + i2;
                if (entityFilter.message_filter != null) {
                    i3 = UniversalFilters.MessageFilter.ADAPTER.encodedSizeWithTag(3, entityFilter.message_filter);
                } else {
                    i3 = 0;
                }
                int i12 = i11 + i3;
                if (entityFilter.doc_filter != null) {
                    i4 = UniversalFilters.DocFilter.ADAPTER.encodedSizeWithTag(4, entityFilter.doc_filter);
                } else {
                    i4 = 0;
                }
                int i13 = i12 + i4;
                if (entityFilter.wiki_filter != null) {
                    i5 = UniversalFilters.WikiFilter.ADAPTER.encodedSizeWithTag(5, entityFilter.wiki_filter);
                } else {
                    i5 = 0;
                }
                int i14 = i13 + i5;
                if (entityFilter.url_filter != null) {
                    i6 = UniversalFilters.URLFilter.ADAPTER.encodedSizeWithTag(6, entityFilter.url_filter);
                } else {
                    i6 = 0;
                }
                int i15 = i14 + i6;
                if (entityFilter.department_filter != null) {
                    i7 = UniversalFilters.DepartmentFilter.ADAPTER.encodedSizeWithTag(7, entityFilter.department_filter);
                } else {
                    i7 = 0;
                }
                int i16 = i15 + i7;
                if (entityFilter.slash_command_filter != null) {
                    i8 = UniversalFilters.SlashCommandFilter.ADAPTER.encodedSizeWithTag(8, entityFilter.slash_command_filter);
                } else {
                    i8 = 0;
                }
                int i17 = i16 + i8;
                if (entityFilter.customization_filter != null) {
                    i9 = UniversalFilters.CustomizationFilter.ADAPTER.encodedSizeWithTag(9, entityFilter.customization_filter);
                } else {
                    i9 = 0;
                }
                int i18 = i17 + i9;
                if (entityFilter.bot_filter != null) {
                    i10 = UniversalFilters.BotFilter.ADAPTER.encodedSizeWithTag(10, entityFilter.bot_filter);
                }
                return i18 + i10 + entityFilter.unknownFields().size();
            }

            /* renamed from: a */
            public EntityFilter decode(ProtoReader protoReader) throws IOException {
                C18947a aVar = new C18947a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.mo64934a(UniversalFilters.UserFilter.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                aVar.mo64927a(UniversalFilters.ChatFilter.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                aVar.mo64931a(UniversalFilters.MessageFilter.ADAPTER.decode(protoReader));
                                break;
                            case 4:
                                aVar.mo64930a(UniversalFilters.DocFilter.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                aVar.mo64935a(UniversalFilters.WikiFilter.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                aVar.mo64933a(UniversalFilters.URLFilter.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                aVar.mo64929a(UniversalFilters.DepartmentFilter.ADAPTER.decode(protoReader));
                                break;
                            case 8:
                                aVar.mo64932a(UniversalFilters.SlashCommandFilter.ADAPTER.decode(protoReader));
                                break;
                            case 9:
                                aVar.mo64928a(UniversalFilters.CustomizationFilter.ADAPTER.decode(protoReader));
                                break;
                            case 10:
                                aVar.mo64926a(UniversalFilters.BotFilter.ADAPTER.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, EntityFilter entityFilter) throws IOException {
                if (entityFilter.user_filter != null) {
                    UniversalFilters.UserFilter.ADAPTER.encodeWithTag(protoWriter, 1, entityFilter.user_filter);
                }
                if (entityFilter.group_chat_filter != null) {
                    UniversalFilters.ChatFilter.ADAPTER.encodeWithTag(protoWriter, 2, entityFilter.group_chat_filter);
                }
                if (entityFilter.message_filter != null) {
                    UniversalFilters.MessageFilter.ADAPTER.encodeWithTag(protoWriter, 3, entityFilter.message_filter);
                }
                if (entityFilter.doc_filter != null) {
                    UniversalFilters.DocFilter.ADAPTER.encodeWithTag(protoWriter, 4, entityFilter.doc_filter);
                }
                if (entityFilter.wiki_filter != null) {
                    UniversalFilters.WikiFilter.ADAPTER.encodeWithTag(protoWriter, 5, entityFilter.wiki_filter);
                }
                if (entityFilter.url_filter != null) {
                    UniversalFilters.URLFilter.ADAPTER.encodeWithTag(protoWriter, 6, entityFilter.url_filter);
                }
                if (entityFilter.department_filter != null) {
                    UniversalFilters.DepartmentFilter.ADAPTER.encodeWithTag(protoWriter, 7, entityFilter.department_filter);
                }
                if (entityFilter.slash_command_filter != null) {
                    UniversalFilters.SlashCommandFilter.ADAPTER.encodeWithTag(protoWriter, 8, entityFilter.slash_command_filter);
                }
                if (entityFilter.customization_filter != null) {
                    UniversalFilters.CustomizationFilter.ADAPTER.encodeWithTag(protoWriter, 9, entityFilter.customization_filter);
                }
                if (entityFilter.bot_filter != null) {
                    UniversalFilters.BotFilter.ADAPTER.encodeWithTag(protoWriter, 10, entityFilter.bot_filter);
                }
                protoWriter.writeBytes(entityFilter.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18947a newBuilder() {
            C18947a aVar = new C18947a();
            aVar.f46842a = this.user_filter;
            aVar.f46843b = this.group_chat_filter;
            aVar.f46844c = this.message_filter;
            aVar.f46845d = this.doc_filter;
            aVar.f46846e = this.wiki_filter;
            aVar.f46847f = this.url_filter;
            aVar.f46848g = this.department_filter;
            aVar.f46849h = this.slash_command_filter;
            aVar.f46850i = this.customization_filter;
            aVar.f46851j = this.bot_filter;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "EntityFilter");
            StringBuilder sb = new StringBuilder();
            if (this.user_filter != null) {
                sb.append(", user_filter=");
                sb.append(this.user_filter);
            }
            if (this.group_chat_filter != null) {
                sb.append(", group_chat_filter=");
                sb.append(this.group_chat_filter);
            }
            if (this.message_filter != null) {
                sb.append(", message_filter=");
                sb.append(this.message_filter);
            }
            if (this.doc_filter != null) {
                sb.append(", doc_filter=");
                sb.append(this.doc_filter);
            }
            if (this.wiki_filter != null) {
                sb.append(", wiki_filter=");
                sb.append(this.wiki_filter);
            }
            if (this.url_filter != null) {
                sb.append(", url_filter=");
                sb.append(this.url_filter);
            }
            if (this.department_filter != null) {
                sb.append(", department_filter=");
                sb.append(this.department_filter);
            }
            if (this.slash_command_filter != null) {
                sb.append(", slash_command_filter=");
                sb.append(this.slash_command_filter);
            }
            if (this.customization_filter != null) {
                sb.append(", customization_filter=");
                sb.append(this.customization_filter);
            }
            if (this.bot_filter != null) {
                sb.append(", bot_filter=");
                sb.append(this.bot_filter);
            }
            StringBuilder replace = sb.replace(0, 2, "EntityFilter{");
            replace.append('}');
            return replace.toString();
        }

        public EntityFilter(UniversalFilters.UserFilter userFilter, UniversalFilters.ChatFilter chatFilter, UniversalFilters.MessageFilter messageFilter, UniversalFilters.DocFilter docFilter, UniversalFilters.WikiFilter wikiFilter, UniversalFilters.URLFilter uRLFilter, UniversalFilters.DepartmentFilter departmentFilter, UniversalFilters.SlashCommandFilter slashCommandFilter, UniversalFilters.CustomizationFilter customizationFilter, UniversalFilters.BotFilter botFilter) {
            this(userFilter, chatFilter, messageFilter, docFilter, wikiFilter, uRLFilter, departmentFilter, slashCommandFilter, customizationFilter, botFilter, ByteString.EMPTY);
        }

        public EntityFilter(UniversalFilters.UserFilter userFilter, UniversalFilters.ChatFilter chatFilter, UniversalFilters.MessageFilter messageFilter, UniversalFilters.DocFilter docFilter, UniversalFilters.WikiFilter wikiFilter, UniversalFilters.URLFilter uRLFilter, UniversalFilters.DepartmentFilter departmentFilter, UniversalFilters.SlashCommandFilter slashCommandFilter, UniversalFilters.CustomizationFilter customizationFilter, UniversalFilters.BotFilter botFilter, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(userFilter, chatFilter, messageFilter, docFilter, wikiFilter, uRLFilter, departmentFilter, slashCommandFilter, customizationFilter, botFilter) <= 1) {
                this.user_filter = userFilter;
                this.group_chat_filter = chatFilter;
                this.message_filter = messageFilter;
                this.doc_filter = docFilter;
                this.wiki_filter = wikiFilter;
                this.url_filter = uRLFilter;
                this.department_filter = departmentFilter;
                this.slash_command_filter = slashCommandFilter;
                this.customization_filter = customizationFilter;
                this.bot_filter = botFilter;
                return;
            }
            throw new IllegalArgumentException("at most one of user_filter, group_chat_filter, message_filter, doc_filter, wiki_filter, url_filter, department_filter, slash_command_filter, customization_filter, bot_filter may be non-null");
        }
    }

    public static final class SearchExtras extends Message<SearchExtras, C18957a> {
        public static final ProtoAdapter<SearchExtras> ADAPTER = new C18958b();
        public static final Integer DEFAULT_QUERY_INPUT_STATE = 0;
        private static final long serialVersionUID = 0;
        public final ChatterPermissionsRequest chatter_permissions;
        public final String impression_id;
        public final QueryCompositionInfo query_composition_info;
        public final Integer query_input_state;
        public final String search_extras_string;

        public static final class QueryCompositionInfo extends Message<QueryCompositionInfo, C18955a> {
            public static final ProtoAdapter<QueryCompositionInfo> ADAPTER = new C18956b();
            public static final Integer DEFAULT_END = 0;
            public static final Integer DEFAULT_START = 0;
            private static final long serialVersionUID = 0;
            public final Integer end;
            public final Integer start;

            /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SearchExtras$QueryCompositionInfo$b */
            private static final class C18956b extends ProtoAdapter<QueryCompositionInfo> {
                C18956b() {
                    super(FieldEncoding.LENGTH_DELIMITED, QueryCompositionInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(QueryCompositionInfo queryCompositionInfo) {
                    return ProtoAdapter.INT32.encodedSizeWithTag(1, queryCompositionInfo.start) + ProtoAdapter.INT32.encodedSizeWithTag(2, queryCompositionInfo.end) + queryCompositionInfo.unknownFields().size();
                }

                /* renamed from: a */
                public QueryCompositionInfo decode(ProtoReader protoReader) throws IOException {
                    C18955a aVar = new C18955a();
                    aVar.f46868a = 0;
                    aVar.f46869b = 0;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f46868a = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f46869b = ProtoAdapter.INT32.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, QueryCompositionInfo queryCompositionInfo) throws IOException {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, queryCompositionInfo.start);
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, queryCompositionInfo.end);
                    protoWriter.writeBytes(queryCompositionInfo.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C18955a newBuilder() {
                C18955a aVar = new C18955a();
                aVar.f46868a = this.start;
                aVar.f46869b = this.end;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SearchExtras$QueryCompositionInfo$a */
            public static final class C18955a extends Message.Builder<QueryCompositionInfo, C18955a> {

                /* renamed from: a */
                public Integer f46868a;

                /* renamed from: b */
                public Integer f46869b;

                /* renamed from: a */
                public QueryCompositionInfo build() {
                    Integer num;
                    Integer num2 = this.f46868a;
                    if (num2 != null && (num = this.f46869b) != null) {
                        return new QueryCompositionInfo(num2, num, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(num2, "start", this.f46869b, "end");
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("search", "QueryCompositionInfo");
                StringBuilder sb = new StringBuilder();
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                StringBuilder replace = sb.replace(0, 2, "QueryCompositionInfo{");
                replace.append('}');
                return replace.toString();
            }

            public QueryCompositionInfo(Integer num, Integer num2) {
                this(num, num2, ByteString.EMPTY);
            }

            public QueryCompositionInfo(Integer num, Integer num2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.start = num;
                this.end = num2;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SearchExtras$b */
        private static final class C18958b extends ProtoAdapter<SearchExtras> {
            C18958b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchExtras.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchExtras searchExtras) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (searchExtras.search_extras_string != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchExtras.search_extras_string);
                } else {
                    i = 0;
                }
                if (searchExtras.chatter_permissions != null) {
                    i2 = ChatterPermissionsRequest.ADAPTER.encodedSizeWithTag(2, searchExtras.chatter_permissions);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (searchExtras.query_input_state != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, searchExtras.query_input_state);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (searchExtras.query_composition_info != null) {
                    i4 = QueryCompositionInfo.ADAPTER.encodedSizeWithTag(4, searchExtras.query_composition_info);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (searchExtras.impression_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchExtras.impression_id);
                }
                return i8 + i5 + searchExtras.unknownFields().size();
            }

            /* renamed from: a */
            public SearchExtras decode(ProtoReader protoReader) throws IOException {
                C18957a aVar = new C18957a();
                aVar.f46870a = "";
                aVar.f46872c = 0;
                aVar.f46874e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46870a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f46871b = ChatterPermissionsRequest.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f46872c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f46873d = QueryCompositionInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46874e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SearchExtras searchExtras) throws IOException {
                if (searchExtras.search_extras_string != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchExtras.search_extras_string);
                }
                if (searchExtras.chatter_permissions != null) {
                    ChatterPermissionsRequest.ADAPTER.encodeWithTag(protoWriter, 2, searchExtras.chatter_permissions);
                }
                if (searchExtras.query_input_state != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, searchExtras.query_input_state);
                }
                if (searchExtras.query_composition_info != null) {
                    QueryCompositionInfo.ADAPTER.encodeWithTag(protoWriter, 4, searchExtras.query_composition_info);
                }
                if (searchExtras.impression_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchExtras.impression_id);
                }
                protoWriter.writeBytes(searchExtras.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SearchExtras$a */
        public static final class C18957a extends Message.Builder<SearchExtras, C18957a> {

            /* renamed from: a */
            public String f46870a;

            /* renamed from: b */
            public ChatterPermissionsRequest f46871b;

            /* renamed from: c */
            public Integer f46872c;

            /* renamed from: d */
            public QueryCompositionInfo f46873d;

            /* renamed from: e */
            public String f46874e;

            /* renamed from: a */
            public SearchExtras build() {
                return new SearchExtras(this.f46870a, this.f46871b, this.f46872c, this.f46873d, this.f46874e, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18957a mo64968a(ChatterPermissionsRequest chatterPermissionsRequest) {
                this.f46871b = chatterPermissionsRequest;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18957a newBuilder() {
            C18957a aVar = new C18957a();
            aVar.f46870a = this.search_extras_string;
            aVar.f46871b = this.chatter_permissions;
            aVar.f46872c = this.query_input_state;
            aVar.f46873d = this.query_composition_info;
            aVar.f46874e = this.impression_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SearchExtras");
            StringBuilder sb = new StringBuilder();
            if (this.search_extras_string != null) {
                sb.append(", search_extras_string=");
                sb.append(this.search_extras_string);
            }
            if (this.chatter_permissions != null) {
                sb.append(", chatter_permissions=");
                sb.append(this.chatter_permissions);
            }
            if (this.query_input_state != null) {
                sb.append(", query_input_state=");
                sb.append(this.query_input_state);
            }
            if (this.query_composition_info != null) {
                sb.append(", query_composition_info=");
                sb.append(this.query_composition_info);
            }
            if (this.impression_id != null) {
                sb.append(", impression_id=");
                sb.append(this.impression_id);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchExtras{");
            replace.append('}');
            return replace.toString();
        }

        public SearchExtras(String str, ChatterPermissionsRequest chatterPermissionsRequest, Integer num, QueryCompositionInfo queryCompositionInfo, String str2) {
            this(str, chatterPermissionsRequest, num, queryCompositionInfo, str2, ByteString.EMPTY);
        }

        public SearchExtras(String str, ChatterPermissionsRequest chatterPermissionsRequest, Integer num, QueryCompositionInfo queryCompositionInfo, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.search_extras_string = str;
            this.chatter_permissions = chatterPermissionsRequest;
            this.query_input_state = num;
            this.query_composition_info = queryCompositionInfo;
            this.impression_id = str2;
        }
    }

    public static final class EntityItem extends Message<EntityItem, C18949a> {
        public static final ProtoAdapter<EntityItem> ADAPTER = new C18950b();
        public static final BaseEnum.MergePolicy DEFAULT_MERGE_POLICY = BaseEnum.MergePolicy.COMBINE_LOCAL_AND_SERVER;
        public static final Integer DEFAULT_RANK_BOOSTING = 0;
        public static final SearchEntityType DEFAULT_TYPE = SearchEntityType.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final EntityFilter entity_filter;
        public final EntitySelector entity_selector;
        public final String local_pagination_token;
        public final BaseEnum.MergePolicy merge_policy;
        public final Integer rank_boosting;
        public final SpotlightStrategy spotlight_strategy;
        public final SearchEntityType type;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$EntityItem$b */
        private static final class C18950b extends ProtoAdapter<EntityItem> {
            C18950b() {
                super(FieldEncoding.LENGTH_DELIMITED, EntityItem.class);
            }

            /* renamed from: a */
            public int encodedSize(EntityItem entityItem) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int encodedSizeWithTag = SearchEntityType.ADAPTER.encodedSizeWithTag(1, entityItem.type);
                int i6 = 0;
                if (entityItem.rank_boosting != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, entityItem.rank_boosting);
                } else {
                    i = 0;
                }
                int i7 = encodedSizeWithTag + i;
                if (entityItem.merge_policy != null) {
                    i2 = BaseEnum.MergePolicy.ADAPTER.encodedSizeWithTag(3, entityItem.merge_policy);
                } else {
                    i2 = 0;
                }
                int i8 = i7 + i2;
                if (entityItem.entity_filter != null) {
                    i3 = EntityFilter.ADAPTER.encodedSizeWithTag(4, entityItem.entity_filter);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (entityItem.entity_selector != null) {
                    i4 = EntitySelector.ADAPTER.encodedSizeWithTag(5, entityItem.entity_selector);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (entityItem.spotlight_strategy != null) {
                    i5 = SpotlightStrategy.ADAPTER.encodedSizeWithTag(6, entityItem.spotlight_strategy);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (entityItem.local_pagination_token != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, entityItem.local_pagination_token);
                }
                return i11 + i6 + entityItem.unknownFields().size();
            }

            /* renamed from: a */
            public EntityItem decode(ProtoReader protoReader) throws IOException {
                C18949a aVar = new C18949a();
                aVar.f46852a = SearchEntityType.UNKNOWN;
                aVar.f46853b = 0;
                aVar.f46854c = BaseEnum.MergePolicy.COMBINE_LOCAL_AND_SERVER;
                aVar.f46858g = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f46852a = SearchEntityType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f46853b = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                try {
                                    aVar.f46854c = BaseEnum.MergePolicy.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 4:
                                aVar.f46855d = EntityFilter.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                aVar.f46856e = EntitySelector.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f46857f = SpotlightStrategy.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                aVar.f46858g = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, EntityItem entityItem) throws IOException {
                SearchEntityType.ADAPTER.encodeWithTag(protoWriter, 1, entityItem.type);
                if (entityItem.rank_boosting != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, entityItem.rank_boosting);
                }
                if (entityItem.merge_policy != null) {
                    BaseEnum.MergePolicy.ADAPTER.encodeWithTag(protoWriter, 3, entityItem.merge_policy);
                }
                if (entityItem.entity_filter != null) {
                    EntityFilter.ADAPTER.encodeWithTag(protoWriter, 4, entityItem.entity_filter);
                }
                if (entityItem.entity_selector != null) {
                    EntitySelector.ADAPTER.encodeWithTag(protoWriter, 5, entityItem.entity_selector);
                }
                if (entityItem.spotlight_strategy != null) {
                    SpotlightStrategy.ADAPTER.encodeWithTag(protoWriter, 6, entityItem.spotlight_strategy);
                }
                if (entityItem.local_pagination_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, entityItem.local_pagination_token);
                }
                protoWriter.writeBytes(entityItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$EntityItem$a */
        public static final class C18949a extends Message.Builder<EntityItem, C18949a> {

            /* renamed from: a */
            public SearchEntityType f46852a;

            /* renamed from: b */
            public Integer f46853b;

            /* renamed from: c */
            public BaseEnum.MergePolicy f46854c;

            /* renamed from: d */
            public EntityFilter f46855d;

            /* renamed from: e */
            public EntitySelector f46856e;

            /* renamed from: f */
            public SpotlightStrategy f46857f;

            /* renamed from: g */
            public String f46858g;

            /* renamed from: a */
            public EntityItem build() {
                SearchEntityType searchEntityType = this.f46852a;
                if (searchEntityType != null) {
                    return new EntityItem(searchEntityType, this.f46853b, this.f46854c, this.f46855d, this.f46856e, this.f46857f, this.f46858g, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(searchEntityType, ShareHitPoint.f121869d);
            }

            /* renamed from: a */
            public C18949a mo64940a(EntityFilter entityFilter) {
                this.f46855d = entityFilter;
                return this;
            }

            /* renamed from: a */
            public C18949a mo64941a(EntitySelector entitySelector) {
                this.f46856e = entitySelector;
                return this;
            }

            /* renamed from: a */
            public C18949a mo64942a(BaseEnum.MergePolicy mergePolicy) {
                this.f46854c = mergePolicy;
                return this;
            }

            /* renamed from: a */
            public C18949a mo64943a(SearchEntityType searchEntityType) {
                this.f46852a = searchEntityType;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18949a newBuilder() {
            C18949a aVar = new C18949a();
            aVar.f46852a = this.type;
            aVar.f46853b = this.rank_boosting;
            aVar.f46854c = this.merge_policy;
            aVar.f46855d = this.entity_filter;
            aVar.f46856e = this.entity_selector;
            aVar.f46857f = this.spotlight_strategy;
            aVar.f46858g = this.local_pagination_token;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "EntityItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.rank_boosting != null) {
                sb.append(", rank_boosting=");
                sb.append(this.rank_boosting);
            }
            if (this.merge_policy != null) {
                sb.append(", merge_policy=");
                sb.append(this.merge_policy);
            }
            if (this.entity_filter != null) {
                sb.append(", entity_filter=");
                sb.append(this.entity_filter);
            }
            if (this.entity_selector != null) {
                sb.append(", entity_selector=");
                sb.append(this.entity_selector);
            }
            if (this.spotlight_strategy != null) {
                sb.append(", spotlight_strategy=");
                sb.append(this.spotlight_strategy);
            }
            if (this.local_pagination_token != null) {
                sb.append(", local_pagination_token=");
                sb.append(this.local_pagination_token);
            }
            StringBuilder replace = sb.replace(0, 2, "EntityItem{");
            replace.append('}');
            return replace.toString();
        }

        public EntityItem(SearchEntityType searchEntityType, Integer num, BaseEnum.MergePolicy mergePolicy, EntityFilter entityFilter, EntitySelector entitySelector, SpotlightStrategy spotlightStrategy, String str) {
            this(searchEntityType, num, mergePolicy, entityFilter, entitySelector, spotlightStrategy, str, ByteString.EMPTY);
        }

        public EntityItem(SearchEntityType searchEntityType, Integer num, BaseEnum.MergePolicy mergePolicy, EntityFilter entityFilter, EntitySelector entitySelector, SpotlightStrategy spotlightStrategy, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = searchEntityType;
            this.rank_boosting = num;
            this.merge_policy = mergePolicy;
            this.entity_filter = entityFilter;
            this.entity_selector = entitySelector;
            this.spotlight_strategy = spotlightStrategy;
            this.local_pagination_token = str;
        }
    }

    public static final class EntitySelector extends Message<EntitySelector, C18951a> {
        public static final ProtoAdapter<EntitySelector> ADAPTER = new C18952b();
        private static final long serialVersionUID = 0;
        public final UniversalSelectors.CustomizationSelector customization_selector;
        public final UniversalSelectors.MessageSelector message_selector;
        public final UniversalSelectors.QaCardSelector qa_card_selector;
        public final UniversalSelectors.UserSelector user_selector;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$EntitySelector$b */
        private static final class C18952b extends ProtoAdapter<EntitySelector> {
            C18952b() {
                super(FieldEncoding.LENGTH_DELIMITED, EntitySelector.class);
            }

            /* renamed from: a */
            public int encodedSize(EntitySelector entitySelector) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (entitySelector.user_selector != null) {
                    i = UniversalSelectors.UserSelector.ADAPTER.encodedSizeWithTag(1, entitySelector.user_selector);
                } else {
                    i = 0;
                }
                if (entitySelector.qa_card_selector != null) {
                    i2 = UniversalSelectors.QaCardSelector.ADAPTER.encodedSizeWithTag(2, entitySelector.qa_card_selector);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (entitySelector.customization_selector != null) {
                    i3 = UniversalSelectors.CustomizationSelector.ADAPTER.encodedSizeWithTag(3, entitySelector.customization_selector);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (entitySelector.message_selector != null) {
                    i4 = UniversalSelectors.MessageSelector.ADAPTER.encodedSizeWithTag(4, entitySelector.message_selector);
                }
                return i6 + i4 + entitySelector.unknownFields().size();
            }

            /* renamed from: a */
            public EntitySelector decode(ProtoReader protoReader) throws IOException {
                C18951a aVar = new C18951a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo64951a(UniversalSelectors.UserSelector.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo64950a(UniversalSelectors.QaCardSelector.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.mo64948a(UniversalSelectors.CustomizationSelector.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo64949a(UniversalSelectors.MessageSelector.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EntitySelector entitySelector) throws IOException {
                if (entitySelector.user_selector != null) {
                    UniversalSelectors.UserSelector.ADAPTER.encodeWithTag(protoWriter, 1, entitySelector.user_selector);
                }
                if (entitySelector.qa_card_selector != null) {
                    UniversalSelectors.QaCardSelector.ADAPTER.encodeWithTag(protoWriter, 2, entitySelector.qa_card_selector);
                }
                if (entitySelector.customization_selector != null) {
                    UniversalSelectors.CustomizationSelector.ADAPTER.encodeWithTag(protoWriter, 3, entitySelector.customization_selector);
                }
                if (entitySelector.message_selector != null) {
                    UniversalSelectors.MessageSelector.ADAPTER.encodeWithTag(protoWriter, 4, entitySelector.message_selector);
                }
                protoWriter.writeBytes(entitySelector.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18951a newBuilder() {
            C18951a aVar = new C18951a();
            aVar.f46859a = this.user_selector;
            aVar.f46860b = this.qa_card_selector;
            aVar.f46861c = this.customization_selector;
            aVar.f46862d = this.message_selector;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "EntitySelector");
            StringBuilder sb = new StringBuilder();
            if (this.user_selector != null) {
                sb.append(", user_selector=");
                sb.append(this.user_selector);
            }
            if (this.qa_card_selector != null) {
                sb.append(", qa_card_selector=");
                sb.append(this.qa_card_selector);
            }
            if (this.customization_selector != null) {
                sb.append(", customization_selector=");
                sb.append(this.customization_selector);
            }
            if (this.message_selector != null) {
                sb.append(", message_selector=");
                sb.append(this.message_selector);
            }
            StringBuilder replace = sb.replace(0, 2, "EntitySelector{");
            replace.append('}');
            return replace.toString();
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$EntitySelector$a */
        public static final class C18951a extends Message.Builder<EntitySelector, C18951a> {

            /* renamed from: a */
            public UniversalSelectors.UserSelector f46859a;

            /* renamed from: b */
            public UniversalSelectors.QaCardSelector f46860b;

            /* renamed from: c */
            public UniversalSelectors.CustomizationSelector f46861c;

            /* renamed from: d */
            public UniversalSelectors.MessageSelector f46862d;

            /* renamed from: a */
            public EntitySelector build() {
                return new EntitySelector(this.f46859a, this.f46860b, this.f46861c, this.f46862d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18951a mo64948a(UniversalSelectors.CustomizationSelector customizationSelector) {
                this.f46861c = customizationSelector;
                this.f46859a = null;
                this.f46860b = null;
                this.f46862d = null;
                return this;
            }

            /* renamed from: a */
            public C18951a mo64949a(UniversalSelectors.MessageSelector messageSelector) {
                this.f46862d = messageSelector;
                this.f46859a = null;
                this.f46860b = null;
                this.f46861c = null;
                return this;
            }

            /* renamed from: a */
            public C18951a mo64950a(UniversalSelectors.QaCardSelector qaCardSelector) {
                this.f46860b = qaCardSelector;
                this.f46859a = null;
                this.f46861c = null;
                this.f46862d = null;
                return this;
            }

            /* renamed from: a */
            public C18951a mo64951a(UniversalSelectors.UserSelector userSelector) {
                this.f46859a = userSelector;
                this.f46860b = null;
                this.f46861c = null;
                this.f46862d = null;
                return this;
            }
        }

        public EntitySelector(UniversalSelectors.UserSelector userSelector, UniversalSelectors.QaCardSelector qaCardSelector, UniversalSelectors.CustomizationSelector customizationSelector, UniversalSelectors.MessageSelector messageSelector) {
            this(userSelector, qaCardSelector, customizationSelector, messageSelector, ByteString.EMPTY);
        }

        public EntitySelector(UniversalSelectors.UserSelector userSelector, UniversalSelectors.QaCardSelector qaCardSelector, UniversalSelectors.CustomizationSelector customizationSelector, UniversalSelectors.MessageSelector messageSelector, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(userSelector, qaCardSelector, customizationSelector, messageSelector, new Object[0]) <= 1) {
                this.user_selector = userSelector;
                this.qa_card_selector = qaCardSelector;
                this.customization_selector = customizationSelector;
                this.message_selector = messageSelector;
                return;
            }
            throw new IllegalArgumentException("at most one of user_selector, qa_card_selector, customization_selector, message_selector may be non-null");
        }
    }

    public static final class SearchContext extends Message<SearchContext, C18953a> {
        public static final ProtoAdapter<SearchContext> ADAPTER = new C18954b();
        private static final long serialVersionUID = 0;
        public final UniversalFilters.CommonFilter common_filter;
        public final List<EntityItem> entity_items;
        public final String source_key;
        public final List<SuggestionItem> suggestion_items;
        public final String tag_name;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SearchContext$b */
        private static final class C18954b extends ProtoAdapter<SearchContext> {
            C18954b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchContext.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchContext searchContext) {
                int i;
                int i2;
                int i3 = 0;
                if (searchContext.tag_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchContext.tag_name);
                } else {
                    i = 0;
                }
                if (searchContext.source_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchContext.source_key);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + EntityItem.ADAPTER.asRepeated().encodedSizeWithTag(2, searchContext.entity_items) + SuggestionItem.ADAPTER.asRepeated().encodedSizeWithTag(4, searchContext.suggestion_items);
                if (searchContext.common_filter != null) {
                    i3 = UniversalFilters.CommonFilter.ADAPTER.encodedSizeWithTag(3, searchContext.common_filter);
                }
                return encodedSizeWithTag + i3 + searchContext.unknownFields().size();
            }

            /* renamed from: a */
            public SearchContext decode(ProtoReader protoReader) throws IOException {
                C18953a aVar = new C18953a();
                aVar.f46863a = "";
                aVar.f46864b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46863a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f46865c.add(EntityItem.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f46867e = UniversalFilters.CommonFilter.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f46866d.add(SuggestionItem.ADAPTER.decode(protoReader));
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46864b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SearchContext searchContext) throws IOException {
                if (searchContext.tag_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchContext.tag_name);
                }
                if (searchContext.source_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchContext.source_key);
                }
                EntityItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, searchContext.entity_items);
                SuggestionItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, searchContext.suggestion_items);
                if (searchContext.common_filter != null) {
                    UniversalFilters.CommonFilter.ADAPTER.encodeWithTag(protoWriter, 3, searchContext.common_filter);
                }
                protoWriter.writeBytes(searchContext.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SearchContext$a */
        public static final class C18953a extends Message.Builder<SearchContext, C18953a> {

            /* renamed from: a */
            public String f46863a;

            /* renamed from: b */
            public String f46864b;

            /* renamed from: c */
            public List<EntityItem> f46865c = Internal.newMutableList();

            /* renamed from: d */
            public List<SuggestionItem> f46866d = Internal.newMutableList();

            /* renamed from: e */
            public UniversalFilters.CommonFilter f46867e;

            /* renamed from: a */
            public SearchContext build() {
                return new SearchContext(this.f46863a, this.f46864b, this.f46865c, this.f46866d, this.f46867e, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18953a mo64956a(UniversalFilters.CommonFilter commonFilter) {
                this.f46867e = commonFilter;
                return this;
            }

            /* renamed from: a */
            public C18953a mo64957a(String str) {
                this.f46863a = str;
                return this;
            }

            /* renamed from: b */
            public C18953a mo64960b(List<SuggestionItem> list) {
                Internal.checkElementsNotNull(list);
                this.f46866d = list;
                return this;
            }

            /* renamed from: a */
            public C18953a mo64958a(List<EntityItem> list) {
                Internal.checkElementsNotNull(list);
                this.f46865c = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18953a newBuilder() {
            C18953a aVar = new C18953a();
            aVar.f46863a = this.tag_name;
            aVar.f46864b = this.source_key;
            aVar.f46865c = Internal.copyOf("entity_items", this.entity_items);
            aVar.f46866d = Internal.copyOf("suggestion_items", this.suggestion_items);
            aVar.f46867e = this.common_filter;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SearchContext");
            StringBuilder sb = new StringBuilder();
            if (this.tag_name != null) {
                sb.append(", tag_name=");
                sb.append(this.tag_name);
            }
            if (this.source_key != null) {
                sb.append(", source_key=");
                sb.append(this.source_key);
            }
            if (!this.entity_items.isEmpty()) {
                sb.append(", entity_items=");
                sb.append(this.entity_items);
            }
            if (!this.suggestion_items.isEmpty()) {
                sb.append(", suggestion_items=");
                sb.append(this.suggestion_items);
            }
            if (this.common_filter != null) {
                sb.append(", common_filter=");
                sb.append(this.common_filter);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchContext{");
            replace.append('}');
            return replace.toString();
        }

        public SearchContext(String str, String str2, List<EntityItem> list, List<SuggestionItem> list2, UniversalFilters.CommonFilter commonFilter) {
            this(str, str2, list, list2, commonFilter, ByteString.EMPTY);
        }

        public SearchContext(String str, String str2, List<EntityItem> list, List<SuggestionItem> list2, UniversalFilters.CommonFilter commonFilter, ByteString byteString) {
            super(ADAPTER, byteString);
            this.tag_name = str;
            this.source_key = str2;
            this.entity_items = Internal.immutableCopyOf("entity_items", list);
            this.suggestion_items = Internal.immutableCopyOf("suggestion_items", list2);
            this.common_filter = commonFilter;
        }
    }

    public static final class SpotlightStrategy extends Message<SpotlightStrategy, C18959a> {
        public static final ProtoAdapter<SpotlightStrategy> ADAPTER = new C18960b();
        public static final Boolean DEFAULT_ENABLE_LMSG_POS_FILTERING = false;
        private static final long serialVersionUID = 0;
        public final Boolean enable_lmsg_pos_filtering;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SpotlightStrategy$b */
        private static final class C18960b extends ProtoAdapter<SpotlightStrategy> {
            C18960b() {
                super(FieldEncoding.LENGTH_DELIMITED, SpotlightStrategy.class);
            }

            /* renamed from: a */
            public int encodedSize(SpotlightStrategy spotlightStrategy) {
                int i;
                if (spotlightStrategy.enable_lmsg_pos_filtering != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, spotlightStrategy.enable_lmsg_pos_filtering);
                } else {
                    i = 0;
                }
                return i + spotlightStrategy.unknownFields().size();
            }

            /* renamed from: a */
            public SpotlightStrategy decode(ProtoReader protoReader) throws IOException {
                C18959a aVar = new C18959a();
                aVar.f46875a = false;
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
                        aVar.f46875a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SpotlightStrategy spotlightStrategy) throws IOException {
                if (spotlightStrategy.enable_lmsg_pos_filtering != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, spotlightStrategy.enable_lmsg_pos_filtering);
                }
                protoWriter.writeBytes(spotlightStrategy.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SpotlightStrategy$a */
        public static final class C18959a extends Message.Builder<SpotlightStrategy, C18959a> {

            /* renamed from: a */
            public Boolean f46875a;

            /* renamed from: a */
            public SpotlightStrategy build() {
                return new SpotlightStrategy(this.f46875a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18959a newBuilder() {
            C18959a aVar = new C18959a();
            aVar.f46875a = this.enable_lmsg_pos_filtering;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SpotlightStrategy");
            StringBuilder sb = new StringBuilder();
            if (this.enable_lmsg_pos_filtering != null) {
                sb.append(", enable_lmsg_pos_filtering=");
                sb.append(this.enable_lmsg_pos_filtering);
            }
            StringBuilder replace = sb.replace(0, 2, "SpotlightStrategy{");
            replace.append('}');
            return replace.toString();
        }

        public SpotlightStrategy(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public SpotlightStrategy(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.enable_lmsg_pos_filtering = bool;
        }
    }

    public static final class SuggestionItem extends Message<SuggestionItem, C18961a> {
        public static final ProtoAdapter<SuggestionItem> ADAPTER = new C18962b();
        public static final SuggestionType DEFAULT_TYPE = SuggestionType.UNKNOWN_SUGGESTION;
        private static final long serialVersionUID = 0;
        public final SuggestionSelector selector;
        public final SuggestionType type;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SuggestionItem$b */
        private static final class C18962b extends ProtoAdapter<SuggestionItem> {
            C18962b() {
                super(FieldEncoding.LENGTH_DELIMITED, SuggestionItem.class);
            }

            /* renamed from: a */
            public int encodedSize(SuggestionItem suggestionItem) {
                int i;
                int encodedSizeWithTag = SuggestionType.ADAPTER.encodedSizeWithTag(1, suggestionItem.type);
                if (suggestionItem.selector != null) {
                    i = SuggestionSelector.ADAPTER.encodedSizeWithTag(2, suggestionItem.selector);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + suggestionItem.unknownFields().size();
            }

            /* renamed from: a */
            public SuggestionItem decode(ProtoReader protoReader) throws IOException {
                C18961a aVar = new C18961a();
                aVar.f46876a = SuggestionType.UNKNOWN_SUGGESTION;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f46876a = SuggestionType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46877b = SuggestionSelector.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SuggestionItem suggestionItem) throws IOException {
                SuggestionType.ADAPTER.encodeWithTag(protoWriter, 1, suggestionItem.type);
                if (suggestionItem.selector != null) {
                    SuggestionSelector.ADAPTER.encodeWithTag(protoWriter, 2, suggestionItem.selector);
                }
                protoWriter.writeBytes(suggestionItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SuggestionItem$a */
        public static final class C18961a extends Message.Builder<SuggestionItem, C18961a> {

            /* renamed from: a */
            public SuggestionType f46876a;

            /* renamed from: b */
            public SuggestionSelector f46877b;

            /* renamed from: a */
            public SuggestionItem build() {
                SuggestionType suggestionType = this.f46876a;
                if (suggestionType != null) {
                    return new SuggestionItem(suggestionType, this.f46877b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(suggestionType, ShareHitPoint.f121869d);
            }

            /* renamed from: a */
            public C18961a mo64977a(SuggestionSelector suggestionSelector) {
                this.f46877b = suggestionSelector;
                return this;
            }

            /* renamed from: a */
            public C18961a mo64978a(SuggestionType suggestionType) {
                this.f46876a = suggestionType;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18961a newBuilder() {
            C18961a aVar = new C18961a();
            aVar.f46876a = this.type;
            aVar.f46877b = this.selector;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SuggestionItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.selector != null) {
                sb.append(", selector=");
                sb.append(this.selector);
            }
            StringBuilder replace = sb.replace(0, 2, "SuggestionItem{");
            replace.append('}');
            return replace.toString();
        }

        public SuggestionItem(SuggestionType suggestionType, SuggestionSelector suggestionSelector) {
            this(suggestionType, suggestionSelector, ByteString.EMPTY);
        }

        public SuggestionItem(SuggestionType suggestionType, SuggestionSelector suggestionSelector, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = suggestionType;
            this.selector = suggestionSelector;
        }
    }

    public static final class SuggestionSelector extends Message<SuggestionSelector, C18963a> {
        public static final ProtoAdapter<SuggestionSelector> ADAPTER = new C18964b();
        private static final long serialVersionUID = 0;
        public final UniversalSelectors.ServiceCardSelector service_card_selector;

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SuggestionSelector$b */
        private static final class C18964b extends ProtoAdapter<SuggestionSelector> {
            C18964b() {
                super(FieldEncoding.LENGTH_DELIMITED, SuggestionSelector.class);
            }

            /* renamed from: a */
            public int encodedSize(SuggestionSelector suggestionSelector) {
                int i;
                if (suggestionSelector.service_card_selector != null) {
                    i = UniversalSelectors.ServiceCardSelector.ADAPTER.encodedSizeWithTag(2, suggestionSelector.service_card_selector);
                } else {
                    i = 0;
                }
                return i + suggestionSelector.unknownFields().size();
            }

            /* renamed from: a */
            public SuggestionSelector decode(ProtoReader protoReader) throws IOException {
                C18963a aVar = new C18963a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo64983a(UniversalSelectors.ServiceCardSelector.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SuggestionSelector suggestionSelector) throws IOException {
                if (suggestionSelector.service_card_selector != null) {
                    UniversalSelectors.ServiceCardSelector.ADAPTER.encodeWithTag(protoWriter, 2, suggestionSelector.service_card_selector);
                }
                protoWriter.writeBytes(suggestionSelector.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$SuggestionSelector$a */
        public static final class C18963a extends Message.Builder<SuggestionSelector, C18963a> {

            /* renamed from: a */
            public UniversalSelectors.ServiceCardSelector f46878a;

            /* renamed from: a */
            public SuggestionSelector build() {
                return new SuggestionSelector(this.f46878a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18963a mo64983a(UniversalSelectors.ServiceCardSelector serviceCardSelector) {
                this.f46878a = serviceCardSelector;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18963a newBuilder() {
            C18963a aVar = new C18963a();
            aVar.f46878a = this.service_card_selector;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SuggestionSelector");
            StringBuilder sb = new StringBuilder();
            if (this.service_card_selector != null) {
                sb.append(", service_card_selector=");
                sb.append(this.service_card_selector);
            }
            StringBuilder replace = sb.replace(0, 2, "SuggestionSelector{");
            replace.append('}');
            return replace.toString();
        }

        public SuggestionSelector(UniversalSelectors.ServiceCardSelector serviceCardSelector) {
            this(serviceCardSelector, ByteString.EMPTY);
        }

        public SuggestionSelector(UniversalSelectors.ServiceCardSelector serviceCardSelector, ByteString byteString) {
            super(ADAPTER, byteString);
            this.service_card_selector = serviceCardSelector;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$b */
    private static final class C18966b extends ProtoAdapter<BaseEntity> {
        C18966b() {
            super(FieldEncoding.LENGTH_DELIMITED, BaseEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(BaseEntity baseEntity) {
            return baseEntity.unknownFields().size();
        }

        /* renamed from: a */
        public BaseEntity decode(ProtoReader protoReader) throws IOException {
            C18965a aVar = new C18965a();
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
        public void encode(ProtoWriter protoWriter, BaseEntity baseEntity) throws IOException {
            protoWriter.writeBytes(baseEntity.unknownFields());
        }
    }

    public BaseEntity() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.BaseEntity$a */
    public static final class C18965a extends Message.Builder<BaseEntity, C18965a> {
        /* renamed from: a */
        public BaseEntity build() {
            return new BaseEntity(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18965a newBuilder() {
        C18965a aVar = new C18965a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "BaseEntity");
        StringBuilder replace = new StringBuilder().replace(0, 2, "BaseEntity{");
        replace.append('}');
        return replace.toString();
    }

    public BaseEntity(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
