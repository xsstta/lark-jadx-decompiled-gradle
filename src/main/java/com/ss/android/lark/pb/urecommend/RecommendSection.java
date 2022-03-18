package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.ai.ActionRecommends;
import com.ss.android.lark.pb.ai.SearchHistories;
import java.io.IOException;
import okio.ByteString;

public final class RecommendSection extends Message<RecommendSection, C50162a> {
    public static final ProtoAdapter<RecommendSection> ADAPTER = new C50163b();
    private static final long serialVersionUID = 0;
    public final RecommendContent mrecommend_content;
    public final SectionType msection_type;

    public enum SectionType implements WireEnum {
        UNKNOWN(0),
        ACTION_RECOMMEND(1),
        SEARCH_HISTORY(2),
        RECOMMEND_ENTITY(3);
        
        public static final ProtoAdapter<SectionType> ADAPTER = ProtoAdapter.newEnumAdapter(SectionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SectionType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTION_RECOMMEND;
            }
            if (i == 2) {
                return SEARCH_HISTORY;
            }
            if (i != 3) {
                return null;
            }
            return RECOMMEND_ENTITY;
        }

        private SectionType(int i) {
            this.value = i;
        }
    }

    public static final class RecommendContent extends Message<RecommendContent, C50158a> {
        public static final ProtoAdapter<RecommendContent> ADAPTER = new C50159b();
        private static final long serialVersionUID = 0;
        public final RecommendEntitySections mentity_recommend;
        public final SearchRelatedSections msearch_related_section;

        /* renamed from: com.ss.android.lark.pb.urecommend.RecommendSection$RecommendContent$b */
        private static final class C50159b extends ProtoAdapter<RecommendContent> {
            C50159b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecommendContent.class);
            }

            /* renamed from: a */
            public int encodedSize(RecommendContent recommendContent) {
                int i;
                int i2 = 0;
                if (recommendContent.mentity_recommend != null) {
                    i = RecommendEntitySections.ADAPTER.encodedSizeWithTag(1, recommendContent.mentity_recommend);
                } else {
                    i = 0;
                }
                if (recommendContent.msearch_related_section != null) {
                    i2 = SearchRelatedSections.ADAPTER.encodedSizeWithTag(2, recommendContent.msearch_related_section);
                }
                return i + i2 + recommendContent.unknownFields().size();
            }

            /* renamed from: a */
            public RecommendContent decode(ProtoReader protoReader) throws IOException {
                C50158a aVar = new C50158a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo174145a(RecommendEntitySections.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo174146a(SearchRelatedSections.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RecommendContent recommendContent) throws IOException {
                if (recommendContent.mentity_recommend != null) {
                    RecommendEntitySections.ADAPTER.encodeWithTag(protoWriter, 1, recommendContent.mentity_recommend);
                }
                if (recommendContent.msearch_related_section != null) {
                    SearchRelatedSections.ADAPTER.encodeWithTag(protoWriter, 2, recommendContent.msearch_related_section);
                }
                protoWriter.writeBytes(recommendContent.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.urecommend.RecommendSection$RecommendContent$a */
        public static final class C50158a extends Message.Builder<RecommendContent, C50158a> {

            /* renamed from: a */
            public RecommendEntitySections f125352a;

            /* renamed from: b */
            public SearchRelatedSections f125353b;

            /* renamed from: a */
            public RecommendContent build() {
                return new RecommendContent(this.f125352a, this.f125353b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C50158a mo174145a(RecommendEntitySections recommendEntitySections) {
                this.f125352a = recommendEntitySections;
                this.f125353b = null;
                return this;
            }

            /* renamed from: a */
            public C50158a mo174146a(SearchRelatedSections searchRelatedSections) {
                this.f125353b = searchRelatedSections;
                this.f125352a = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C50158a newBuilder() {
            C50158a aVar = new C50158a();
            aVar.f125352a = this.mentity_recommend;
            aVar.f125353b = this.msearch_related_section;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mentity_recommend != null) {
                sb.append(", entity_recommend=");
                sb.append(this.mentity_recommend);
            }
            if (this.msearch_related_section != null) {
                sb.append(", search_related_section=");
                sb.append(this.msearch_related_section);
            }
            StringBuilder replace = sb.replace(0, 2, "RecommendContent{");
            replace.append('}');
            return replace.toString();
        }

        public RecommendContent(RecommendEntitySections recommendEntitySections, SearchRelatedSections searchRelatedSections) {
            this(recommendEntitySections, searchRelatedSections, ByteString.EMPTY);
        }

        public RecommendContent(RecommendEntitySections recommendEntitySections, SearchRelatedSections searchRelatedSections, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(recommendEntitySections, searchRelatedSections) <= 1) {
                this.mentity_recommend = recommendEntitySections;
                this.msearch_related_section = searchRelatedSections;
                return;
            }
            throw new IllegalArgumentException("at most one of mentity_recommend, msearch_related_section may be non-null");
        }
    }

    public static final class SearchRelatedSections extends Message<SearchRelatedSections, C50160a> {
        public static final ProtoAdapter<SearchRelatedSections> ADAPTER = new C50161b();
        public static final Integer DEFAULT_MAX_ROWS = 0;
        private static final long serialVersionUID = 0;
        public final ActionRecommends maction_recommends;
        public final Integer mmax_rows;
        public final SearchHistories msearch_histories;
        public final String mtitle;

        /* renamed from: com.ss.android.lark.pb.urecommend.RecommendSection$SearchRelatedSections$b */
        private static final class C50161b extends ProtoAdapter<SearchRelatedSections> {
            C50161b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchRelatedSections.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchRelatedSections searchRelatedSections) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchRelatedSections.mtitle);
                int i3 = 0;
                if (searchRelatedSections.mmax_rows != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, searchRelatedSections.mmax_rows);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (searchRelatedSections.maction_recommends != null) {
                    i2 = ActionRecommends.ADAPTER.encodedSizeWithTag(3, searchRelatedSections.maction_recommends);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (searchRelatedSections.msearch_histories != null) {
                    i3 = SearchHistories.ADAPTER.encodedSizeWithTag(4, searchRelatedSections.msearch_histories);
                }
                return i5 + i3 + searchRelatedSections.unknownFields().size();
            }

            /* renamed from: a */
            public SearchRelatedSections decode(ProtoReader protoReader) throws IOException {
                C50160a aVar = new C50160a();
                aVar.f125354a = "";
                aVar.f125355b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125354a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125355b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.mo174151a(ActionRecommends.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo174152a(SearchHistories.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SearchRelatedSections searchRelatedSections) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchRelatedSections.mtitle);
                if (searchRelatedSections.mmax_rows != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchRelatedSections.mmax_rows);
                }
                if (searchRelatedSections.maction_recommends != null) {
                    ActionRecommends.ADAPTER.encodeWithTag(protoWriter, 3, searchRelatedSections.maction_recommends);
                }
                if (searchRelatedSections.msearch_histories != null) {
                    SearchHistories.ADAPTER.encodeWithTag(protoWriter, 4, searchRelatedSections.msearch_histories);
                }
                protoWriter.writeBytes(searchRelatedSections.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50160a newBuilder() {
            C50160a aVar = new C50160a();
            aVar.f125354a = this.mtitle;
            aVar.f125355b = this.mmax_rows;
            aVar.f125356c = this.maction_recommends;
            aVar.f125357d = this.msearch_histories;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.urecommend.RecommendSection$SearchRelatedSections$a */
        public static final class C50160a extends Message.Builder<SearchRelatedSections, C50160a> {

            /* renamed from: a */
            public String f125354a;

            /* renamed from: b */
            public Integer f125355b;

            /* renamed from: c */
            public ActionRecommends f125356c;

            /* renamed from: d */
            public SearchHistories f125357d;

            /* renamed from: a */
            public SearchRelatedSections build() {
                String str = this.f125354a;
                if (str != null) {
                    return new SearchRelatedSections(str, this.f125355b, this.f125356c, this.f125357d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "mtitle");
            }

            /* renamed from: a */
            public C50160a mo174151a(ActionRecommends actionRecommends) {
                this.f125356c = actionRecommends;
                this.f125357d = null;
                return this;
            }

            /* renamed from: a */
            public C50160a mo174152a(SearchHistories searchHistories) {
                this.f125357d = searchHistories;
                this.f125356c = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", title=");
            sb.append(this.mtitle);
            if (this.mmax_rows != null) {
                sb.append(", max_rows=");
                sb.append(this.mmax_rows);
            }
            if (this.maction_recommends != null) {
                sb.append(", action_recommends=");
                sb.append(this.maction_recommends);
            }
            if (this.msearch_histories != null) {
                sb.append(", search_histories=");
                sb.append(this.msearch_histories);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchRelatedSections{");
            replace.append('}');
            return replace.toString();
        }

        public SearchRelatedSections(String str, Integer num, ActionRecommends actionRecommends, SearchHistories searchHistories) {
            this(str, num, actionRecommends, searchHistories, ByteString.EMPTY);
        }

        public SearchRelatedSections(String str, Integer num, ActionRecommends actionRecommends, SearchHistories searchHistories, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(actionRecommends, searchHistories) <= 1) {
                this.mtitle = str;
                this.mmax_rows = num;
                this.maction_recommends = actionRecommends;
                this.msearch_histories = searchHistories;
                return;
            }
            throw new IllegalArgumentException("at most one of maction_recommends, msearch_histories may be non-null");
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.RecommendSection$b */
    private static final class C50163b extends ProtoAdapter<RecommendSection> {
        C50163b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecommendSection.class);
        }

        /* renamed from: a */
        public int encodedSize(RecommendSection recommendSection) {
            return SectionType.ADAPTER.encodedSizeWithTag(1, recommendSection.msection_type) + RecommendContent.ADAPTER.encodedSizeWithTag(2, recommendSection.mrecommend_content) + recommendSection.unknownFields().size();
        }

        /* renamed from: a */
        public RecommendSection decode(ProtoReader protoReader) throws IOException {
            C50162a aVar = new C50162a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f125358a = SectionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125359b = RecommendContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecommendSection recommendSection) throws IOException {
            SectionType.ADAPTER.encodeWithTag(protoWriter, 1, recommendSection.msection_type);
            RecommendContent.ADAPTER.encodeWithTag(protoWriter, 2, recommendSection.mrecommend_content);
            protoWriter.writeBytes(recommendSection.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50162a newBuilder() {
        C50162a aVar = new C50162a();
        aVar.f125358a = this.msection_type;
        aVar.f125359b = this.mrecommend_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.RecommendSection$a */
    public static final class C50162a extends Message.Builder<RecommendSection, C50162a> {

        /* renamed from: a */
        public SectionType f125358a;

        /* renamed from: b */
        public RecommendContent f125359b;

        /* renamed from: a */
        public RecommendSection build() {
            RecommendContent recommendContent;
            SectionType sectionType = this.f125358a;
            if (sectionType != null && (recommendContent = this.f125359b) != null) {
                return new RecommendSection(sectionType, recommendContent, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(sectionType, "msection_type", this.f125359b, "mrecommend_content");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", section_type=");
        sb.append(this.msection_type);
        sb.append(", recommend_content=");
        sb.append(this.mrecommend_content);
        StringBuilder replace = sb.replace(0, 2, "RecommendSection{");
        replace.append('}');
        return replace.toString();
    }

    public RecommendSection(SectionType sectionType, RecommendContent recommendContent) {
        this(sectionType, recommendContent, ByteString.EMPTY);
    }

    public RecommendSection(SectionType sectionType, RecommendContent recommendContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msection_type = sectionType;
        this.mrecommend_content = recommendContent;
    }
}
