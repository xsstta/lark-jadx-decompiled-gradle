package com.bytedance.lark.pb.search.recommend.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.IntegrationSearchResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RecommendSection extends Message<RecommendSection, C18771a> {
    public static final ProtoAdapter<RecommendSection> ADAPTER = new C18772b();
    public static final Integer DEFAULT_MAX_ROWS = 0;
    public static final RecommendType DEFAULT_RECOMMEND_TYPE = RecommendType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer max_rows;
    public final RecommendContent recommend_content;
    public final RecommendType recommend_type;
    public final String title;

    public enum RecommendType implements WireEnum {
        UNKNOWN(0),
        ACTION_RECOMMEND(1),
        ENTITY_RECOMMEND(2),
        SEARCH_HISTORY(3);
        
        public static final ProtoAdapter<RecommendType> ADAPTER = ProtoAdapter.newEnumAdapter(RecommendType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecommendType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTION_RECOMMEND;
            }
            if (i == 2) {
                return ENTITY_RECOMMEND;
            }
            if (i != 3) {
                return null;
            }
            return SEARCH_HISTORY;
        }

        private RecommendType(int i) {
            this.value = i;
        }
    }

    public static final class RecommendContent extends Message<RecommendContent, C18769a> {
        public static final ProtoAdapter<RecommendContent> ADAPTER = new C18770b();
        private static final long serialVersionUID = 0;
        public final ActionRecommends action_recommends;
        public final IntegrationSearchResponse entity_recommend;
        public final SearchHistories search_histories;

        /* renamed from: com.bytedance.lark.pb.search.recommend.v1.RecommendSection$RecommendContent$b */
        private static final class C18770b extends ProtoAdapter<RecommendContent> {
            C18770b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecommendContent.class);
            }

            /* renamed from: a */
            public int encodedSize(RecommendContent recommendContent) {
                int i;
                int i2;
                int i3 = 0;
                if (recommendContent.action_recommends != null) {
                    i = ActionRecommends.ADAPTER.encodedSizeWithTag(1, recommendContent.action_recommends);
                } else {
                    i = 0;
                }
                if (recommendContent.entity_recommend != null) {
                    i2 = IntegrationSearchResponse.ADAPTER.encodedSizeWithTag(2, recommendContent.entity_recommend);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (recommendContent.search_histories != null) {
                    i3 = SearchHistories.ADAPTER.encodedSizeWithTag(3, recommendContent.search_histories);
                }
                return i4 + i3 + recommendContent.unknownFields().size();
            }

            /* renamed from: a */
            public RecommendContent decode(ProtoReader protoReader) throws IOException {
                C18769a aVar = new C18769a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo64501a(ActionRecommends.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo64503a(IntegrationSearchResponse.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo64502a(SearchHistories.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RecommendContent recommendContent) throws IOException {
                if (recommendContent.action_recommends != null) {
                    ActionRecommends.ADAPTER.encodeWithTag(protoWriter, 1, recommendContent.action_recommends);
                }
                if (recommendContent.entity_recommend != null) {
                    IntegrationSearchResponse.ADAPTER.encodeWithTag(protoWriter, 2, recommendContent.entity_recommend);
                }
                if (recommendContent.search_histories != null) {
                    SearchHistories.ADAPTER.encodeWithTag(protoWriter, 3, recommendContent.search_histories);
                }
                protoWriter.writeBytes(recommendContent.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18769a newBuilder() {
            C18769a aVar = new C18769a();
            aVar.f46324a = this.action_recommends;
            aVar.f46325b = this.entity_recommend;
            aVar.f46326c = this.search_histories;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.recommend.v1.RecommendSection$RecommendContent$a */
        public static final class C18769a extends Message.Builder<RecommendContent, C18769a> {

            /* renamed from: a */
            public ActionRecommends f46324a;

            /* renamed from: b */
            public IntegrationSearchResponse f46325b;

            /* renamed from: c */
            public SearchHistories f46326c;

            /* renamed from: a */
            public RecommendContent build() {
                return new RecommendContent(this.f46324a, this.f46325b, this.f46326c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18769a mo64501a(ActionRecommends actionRecommends) {
                this.f46324a = actionRecommends;
                this.f46325b = null;
                this.f46326c = null;
                return this;
            }

            /* renamed from: a */
            public C18769a mo64502a(SearchHistories searchHistories) {
                this.f46326c = searchHistories;
                this.f46324a = null;
                this.f46325b = null;
                return this;
            }

            /* renamed from: a */
            public C18769a mo64503a(IntegrationSearchResponse integrationSearchResponse) {
                this.f46325b = integrationSearchResponse;
                this.f46324a = null;
                this.f46326c = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "RecommendContent");
            StringBuilder sb = new StringBuilder();
            if (this.action_recommends != null) {
                sb.append(", action_recommends=");
                sb.append(this.action_recommends);
            }
            if (this.entity_recommend != null) {
                sb.append(", entity_recommend=");
                sb.append(this.entity_recommend);
            }
            if (this.search_histories != null) {
                sb.append(", search_histories=");
                sb.append(this.search_histories);
            }
            StringBuilder replace = sb.replace(0, 2, "RecommendContent{");
            replace.append('}');
            return replace.toString();
        }

        public RecommendContent(ActionRecommends actionRecommends, IntegrationSearchResponse integrationSearchResponse, SearchHistories searchHistories) {
            this(actionRecommends, integrationSearchResponse, searchHistories, ByteString.EMPTY);
        }

        public RecommendContent(ActionRecommends actionRecommends, IntegrationSearchResponse integrationSearchResponse, SearchHistories searchHistories, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(actionRecommends, integrationSearchResponse, searchHistories) <= 1) {
                this.action_recommends = actionRecommends;
                this.entity_recommend = integrationSearchResponse;
                this.search_histories = searchHistories;
                return;
            }
            throw new IllegalArgumentException("at most one of action_recommends, entity_recommend, search_histories may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.RecommendSection$b */
    private static final class C18772b extends ProtoAdapter<RecommendSection> {
        C18772b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecommendSection.class);
        }

        /* renamed from: a */
        public int encodedSize(RecommendSection recommendSection) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recommendSection.title) + ProtoAdapter.INT32.encodedSizeWithTag(2, recommendSection.max_rows) + RecommendType.ADAPTER.encodedSizeWithTag(3, recommendSection.recommend_type) + RecommendContent.ADAPTER.encodedSizeWithTag(4, recommendSection.recommend_content) + recommendSection.unknownFields().size();
        }

        /* renamed from: a */
        public RecommendSection decode(ProtoReader protoReader) throws IOException {
            C18771a aVar = new C18771a();
            aVar.f46327a = "";
            aVar.f46328b = 0;
            aVar.f46329c = RecommendType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46327a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46328b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46329c = RecommendType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46330d = RecommendContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecommendSection recommendSection) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendSection.title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, recommendSection.max_rows);
            RecommendType.ADAPTER.encodeWithTag(protoWriter, 3, recommendSection.recommend_type);
            RecommendContent.ADAPTER.encodeWithTag(protoWriter, 4, recommendSection.recommend_content);
            protoWriter.writeBytes(recommendSection.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18771a newBuilder() {
        C18771a aVar = new C18771a();
        aVar.f46327a = this.title;
        aVar.f46328b = this.max_rows;
        aVar.f46329c = this.recommend_type;
        aVar.f46330d = this.recommend_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.RecommendSection$a */
    public static final class C18771a extends Message.Builder<RecommendSection, C18771a> {

        /* renamed from: a */
        public String f46327a;

        /* renamed from: b */
        public Integer f46328b;

        /* renamed from: c */
        public RecommendType f46329c;

        /* renamed from: d */
        public RecommendContent f46330d;

        /* renamed from: a */
        public RecommendSection build() {
            Integer num;
            RecommendType recommendType;
            RecommendContent recommendContent;
            String str = this.f46327a;
            if (str != null && (num = this.f46328b) != null && (recommendType = this.f46329c) != null && (recommendContent = this.f46330d) != null) {
                return new RecommendSection(str, num, recommendType, recommendContent, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "title", this.f46328b, "max_rows", this.f46329c, "recommend_type", this.f46330d, "recommend_content");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "RecommendSection");
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", max_rows=");
        sb.append(this.max_rows);
        sb.append(", recommend_type=");
        sb.append(this.recommend_type);
        sb.append(", recommend_content=");
        sb.append(this.recommend_content);
        StringBuilder replace = sb.replace(0, 2, "RecommendSection{");
        replace.append('}');
        return replace.toString();
    }

    public RecommendSection(String str, Integer num, RecommendType recommendType, RecommendContent recommendContent) {
        this(str, num, recommendType, recommendContent, ByteString.EMPTY);
    }

    public RecommendSection(String str, Integer num, RecommendType recommendType, RecommendContent recommendContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.max_rows = num;
        this.recommend_type = recommendType;
        this.recommend_content = recommendContent;
    }
}
