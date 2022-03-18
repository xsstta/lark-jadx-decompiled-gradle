package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.resource.ResourceMeta;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchResult extends Message<SearchResult, C19025a> {
    public static final ProtoAdapter<SearchResult> ADAPTER = new C19026b();
    public static final Double DEFAULT_RANK_SCORE = Double.valueOf(0.0d);
    public static final ResultSourceType DEFAULT_SOURCE_TYPE = ResultSourceType.DEFAULT;
    public static final SearchEntityType DEFAULT_TYPE = SearchEntityType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final List<ExplanationTag> explanation_tags;
    public final String extra_info_separator;
    public final List<ExtraInfoBlock> extra_infos;
    public final String extras_highlighted;
    public final String id;
    public final Double rank_score;
    public final ResultMeta result_meta;
    public final ResultSourceType source_type;
    public final String summary_highlighted;
    public final String title_highlighted;
    public final SearchEntityType type;

    public static final class ResultMeta extends Message<ResultMeta, C19023a> {
        public static final ProtoAdapter<ResultMeta> ADAPTER = new C19024b();
        private static final long serialVersionUID = 0;
        public final AggregatedMessageMeta aggre_message_meta;
        public final AppMeta app_meta;
        public final BotMeta bot_meta;
        public final CryptoP2PChatMeta crypto_p2p_chat_meta;
        public final CustomizationMeta customization_meta;
        public final DepartmentMeta department_meta;
        public final DocMeta doc_meta;
        public final FacilityMeta facility_meta;
        public final ChatMeta group_chat_meta;
        public final MailContactMeta mail_contact_meta;
        public final MessageMeta message_meta;
        public final OncallMeta oncall_meta;
        public final QaCardMeta qa_card_meta;
        public final ResourceMeta resource_meta;
        public final SectionMeta section_meta;
        public final SlashCommandMeta slash_command_meta;
        public final ThreadMeta thread_meta;
        public final URLMeta url_meta;
        public final UserMeta user_meta;
        public final WikiMeta wiki_meta;

        /* renamed from: com.bytedance.lark.pb.search.v2.SearchResult$ResultMeta$a */
        public static final class C19023a extends Message.Builder<ResultMeta, C19023a> {

            /* renamed from: a */
            public UserMeta f47043a;

            /* renamed from: b */
            public BotMeta f47044b;

            /* renamed from: c */
            public ChatMeta f47045c;

            /* renamed from: d */
            public CryptoP2PChatMeta f47046d;

            /* renamed from: e */
            public MessageMeta f47047e;

            /* renamed from: f */
            public OncallMeta f47048f;

            /* renamed from: g */
            public ThreadMeta f47049g;

            /* renamed from: h */
            public URLMeta f47050h;

            /* renamed from: i */
            public QaCardMeta f47051i;

            /* renamed from: j */
            public AppMeta f47052j;

            /* renamed from: k */
            public DepartmentMeta f47053k;

            /* renamed from: l */
            public DocMeta f47054l;

            /* renamed from: m */
            public WikiMeta f47055m;

            /* renamed from: n */
            public SlashCommandMeta f47056n;

            /* renamed from: o */
            public SectionMeta f47057o;

            /* renamed from: p */
            public ResourceMeta f47058p;

            /* renamed from: q */
            public CustomizationMeta f47059q;

            /* renamed from: r */
            public FacilityMeta f47060r;

            /* renamed from: s */
            public MailContactMeta f47061s;

            /* renamed from: t */
            public AggregatedMessageMeta f47062t;

            /* renamed from: a */
            public C19023a mo65137a(UserMeta userMeta) {
                this.f47043a = userMeta;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65130a(MessageMeta messageMeta) {
                this.f47047e = messageMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65131a(OncallMeta oncallMeta) {
                this.f47048f = oncallMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65135a(ThreadMeta threadMeta) {
                this.f47049g = threadMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65136a(URLMeta uRLMeta) {
                this.f47050h = uRLMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65132a(QaCardMeta qaCardMeta) {
                this.f47051i = qaCardMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65127a(DocMeta docMeta) {
                this.f47054l = docMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65138a(WikiMeta wikiMeta) {
                this.f47055m = wikiMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65134a(SlashCommandMeta slashCommandMeta) {
                this.f47056n = slashCommandMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65133a(SectionMeta sectionMeta) {
                this.f47057o = sectionMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65128a(FacilityMeta facilityMeta) {
                this.f47060r = facilityMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65129a(MailContactMeta mailContactMeta) {
                this.f47061s = mailContactMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                return this;
            }

            /* renamed from: a */
            public ResultMeta build() {
                return new ResultMeta(this.f47043a, this.f47044b, this.f47045c, this.f47046d, this.f47047e, this.f47048f, this.f47049g, this.f47050h, this.f47051i, this.f47052j, this.f47053k, this.f47054l, this.f47055m, this.f47056n, this.f47057o, this.f47058p, this.f47059q, this.f47060r, this.f47061s, this.f47062t, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19023a mo65120a(AggregatedMessageMeta aggregatedMessageMeta) {
                this.f47062t = aggregatedMessageMeta;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65119a(ResourceMeta resourceMeta) {
                this.f47058p = resourceMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65121a(AppMeta appMeta) {
                this.f47052j = appMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65122a(BotMeta botMeta) {
                this.f47044b = botMeta;
                this.f47043a = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65123a(ChatMeta chatMeta) {
                this.f47045c = chatMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65124a(CryptoP2PChatMeta cryptoP2PChatMeta) {
                this.f47046d = cryptoP2PChatMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65125a(CustomizationMeta customizationMeta) {
                this.f47059q = customizationMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47053k = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }

            /* renamed from: a */
            public C19023a mo65126a(DepartmentMeta departmentMeta) {
                this.f47053k = departmentMeta;
                this.f47043a = null;
                this.f47044b = null;
                this.f47045c = null;
                this.f47046d = null;
                this.f47047e = null;
                this.f47048f = null;
                this.f47049g = null;
                this.f47050h = null;
                this.f47051i = null;
                this.f47052j = null;
                this.f47054l = null;
                this.f47055m = null;
                this.f47056n = null;
                this.f47057o = null;
                this.f47058p = null;
                this.f47059q = null;
                this.f47060r = null;
                this.f47061s = null;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.SearchResult$ResultMeta$b */
        private static final class C19024b extends ProtoAdapter<ResultMeta> {
            C19024b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResultMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(ResultMeta resultMeta) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20 = 0;
                if (resultMeta.user_meta != null) {
                    i = UserMeta.ADAPTER.encodedSizeWithTag(1, resultMeta.user_meta);
                } else {
                    i = 0;
                }
                if (resultMeta.bot_meta != null) {
                    i2 = BotMeta.ADAPTER.encodedSizeWithTag(2, resultMeta.bot_meta);
                } else {
                    i2 = 0;
                }
                int i21 = i + i2;
                if (resultMeta.group_chat_meta != null) {
                    i3 = ChatMeta.ADAPTER.encodedSizeWithTag(19, resultMeta.group_chat_meta);
                } else {
                    i3 = 0;
                }
                int i22 = i21 + i3;
                if (resultMeta.crypto_p2p_chat_meta != null) {
                    i4 = CryptoP2PChatMeta.ADAPTER.encodedSizeWithTag(20, resultMeta.crypto_p2p_chat_meta);
                } else {
                    i4 = 0;
                }
                int i23 = i22 + i4;
                if (resultMeta.message_meta != null) {
                    i5 = MessageMeta.ADAPTER.encodedSizeWithTag(4, resultMeta.message_meta);
                } else {
                    i5 = 0;
                }
                int i24 = i23 + i5;
                if (resultMeta.oncall_meta != null) {
                    i6 = OncallMeta.ADAPTER.encodedSizeWithTag(5, resultMeta.oncall_meta);
                } else {
                    i6 = 0;
                }
                int i25 = i24 + i6;
                if (resultMeta.thread_meta != null) {
                    i7 = ThreadMeta.ADAPTER.encodedSizeWithTag(6, resultMeta.thread_meta);
                } else {
                    i7 = 0;
                }
                int i26 = i25 + i7;
                if (resultMeta.url_meta != null) {
                    i8 = URLMeta.ADAPTER.encodedSizeWithTag(7, resultMeta.url_meta);
                } else {
                    i8 = 0;
                }
                int i27 = i26 + i8;
                if (resultMeta.qa_card_meta != null) {
                    i9 = QaCardMeta.ADAPTER.encodedSizeWithTag(8, resultMeta.qa_card_meta);
                } else {
                    i9 = 0;
                }
                int i28 = i27 + i9;
                if (resultMeta.app_meta != null) {
                    i10 = AppMeta.ADAPTER.encodedSizeWithTag(9, resultMeta.app_meta);
                } else {
                    i10 = 0;
                }
                int i29 = i28 + i10;
                if (resultMeta.department_meta != null) {
                    i11 = DepartmentMeta.ADAPTER.encodedSizeWithTag(21, resultMeta.department_meta);
                } else {
                    i11 = 0;
                }
                int i30 = i29 + i11;
                if (resultMeta.doc_meta != null) {
                    i12 = DocMeta.ADAPTER.encodedSizeWithTag(10, resultMeta.doc_meta);
                } else {
                    i12 = 0;
                }
                int i31 = i30 + i12;
                if (resultMeta.wiki_meta != null) {
                    i13 = WikiMeta.ADAPTER.encodedSizeWithTag(12, resultMeta.wiki_meta);
                } else {
                    i13 = 0;
                }
                int i32 = i31 + i13;
                if (resultMeta.slash_command_meta != null) {
                    i14 = SlashCommandMeta.ADAPTER.encodedSizeWithTag(13, resultMeta.slash_command_meta);
                } else {
                    i14 = 0;
                }
                int i33 = i32 + i14;
                if (resultMeta.section_meta != null) {
                    i15 = SectionMeta.ADAPTER.encodedSizeWithTag(22, resultMeta.section_meta);
                } else {
                    i15 = 0;
                }
                int i34 = i33 + i15;
                if (resultMeta.resource_meta != null) {
                    i16 = ResourceMeta.ADAPTER.encodedSizeWithTag(23, resultMeta.resource_meta);
                } else {
                    i16 = 0;
                }
                int i35 = i34 + i16;
                if (resultMeta.customization_meta != null) {
                    i17 = CustomizationMeta.ADAPTER.encodedSizeWithTag(14, resultMeta.customization_meta);
                } else {
                    i17 = 0;
                }
                int i36 = i35 + i17;
                if (resultMeta.facility_meta != null) {
                    i18 = FacilityMeta.ADAPTER.encodedSizeWithTag(24, resultMeta.facility_meta);
                } else {
                    i18 = 0;
                }
                int i37 = i36 + i18;
                if (resultMeta.mail_contact_meta != null) {
                    i19 = MailContactMeta.ADAPTER.encodedSizeWithTag(26, resultMeta.mail_contact_meta);
                } else {
                    i19 = 0;
                }
                int i38 = i37 + i19;
                if (resultMeta.aggre_message_meta != null) {
                    i20 = AggregatedMessageMeta.ADAPTER.encodedSizeWithTag(25, resultMeta.aggre_message_meta);
                }
                return i38 + i20 + resultMeta.unknownFields().size();
            }

            /* renamed from: a */
            public ResultMeta decode(ProtoReader protoReader) throws IOException {
                C19023a aVar = new C19023a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.mo65137a(UserMeta.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                aVar.mo65122a(BotMeta.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                            case 11:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 4:
                                aVar.mo65130a(MessageMeta.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                aVar.mo65131a(OncallMeta.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                aVar.mo65135a(ThreadMeta.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                aVar.mo65136a(URLMeta.ADAPTER.decode(protoReader));
                                break;
                            case 8:
                                aVar.mo65132a(QaCardMeta.ADAPTER.decode(protoReader));
                                break;
                            case 9:
                                aVar.mo65121a(AppMeta.ADAPTER.decode(protoReader));
                                break;
                            case 10:
                                aVar.mo65127a(DocMeta.ADAPTER.decode(protoReader));
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.mo65138a(WikiMeta.ADAPTER.decode(protoReader));
                                break;
                            case 13:
                                aVar.mo65134a(SlashCommandMeta.ADAPTER.decode(protoReader));
                                break;
                            case 14:
                                aVar.mo65125a(CustomizationMeta.ADAPTER.decode(protoReader));
                                break;
                            case 19:
                                aVar.mo65123a(ChatMeta.ADAPTER.decode(protoReader));
                                break;
                            case 20:
                                aVar.mo65124a(CryptoP2PChatMeta.ADAPTER.decode(protoReader));
                                break;
                            case 21:
                                aVar.mo65126a(DepartmentMeta.ADAPTER.decode(protoReader));
                                break;
                            case 22:
                                aVar.mo65133a(SectionMeta.ADAPTER.decode(protoReader));
                                break;
                            case 23:
                                aVar.mo65119a(ResourceMeta.ADAPTER.decode(protoReader));
                                break;
                            case 24:
                                aVar.mo65128a(FacilityMeta.ADAPTER.decode(protoReader));
                                break;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                aVar.mo65120a(AggregatedMessageMeta.ADAPTER.decode(protoReader));
                                break;
                            case 26:
                                aVar.mo65129a(MailContactMeta.ADAPTER.decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResultMeta resultMeta) throws IOException {
                if (resultMeta.user_meta != null) {
                    UserMeta.ADAPTER.encodeWithTag(protoWriter, 1, resultMeta.user_meta);
                }
                if (resultMeta.bot_meta != null) {
                    BotMeta.ADAPTER.encodeWithTag(protoWriter, 2, resultMeta.bot_meta);
                }
                if (resultMeta.group_chat_meta != null) {
                    ChatMeta.ADAPTER.encodeWithTag(protoWriter, 19, resultMeta.group_chat_meta);
                }
                if (resultMeta.crypto_p2p_chat_meta != null) {
                    CryptoP2PChatMeta.ADAPTER.encodeWithTag(protoWriter, 20, resultMeta.crypto_p2p_chat_meta);
                }
                if (resultMeta.message_meta != null) {
                    MessageMeta.ADAPTER.encodeWithTag(protoWriter, 4, resultMeta.message_meta);
                }
                if (resultMeta.oncall_meta != null) {
                    OncallMeta.ADAPTER.encodeWithTag(protoWriter, 5, resultMeta.oncall_meta);
                }
                if (resultMeta.thread_meta != null) {
                    ThreadMeta.ADAPTER.encodeWithTag(protoWriter, 6, resultMeta.thread_meta);
                }
                if (resultMeta.url_meta != null) {
                    URLMeta.ADAPTER.encodeWithTag(protoWriter, 7, resultMeta.url_meta);
                }
                if (resultMeta.qa_card_meta != null) {
                    QaCardMeta.ADAPTER.encodeWithTag(protoWriter, 8, resultMeta.qa_card_meta);
                }
                if (resultMeta.app_meta != null) {
                    AppMeta.ADAPTER.encodeWithTag(protoWriter, 9, resultMeta.app_meta);
                }
                if (resultMeta.department_meta != null) {
                    DepartmentMeta.ADAPTER.encodeWithTag(protoWriter, 21, resultMeta.department_meta);
                }
                if (resultMeta.doc_meta != null) {
                    DocMeta.ADAPTER.encodeWithTag(protoWriter, 10, resultMeta.doc_meta);
                }
                if (resultMeta.wiki_meta != null) {
                    WikiMeta.ADAPTER.encodeWithTag(protoWriter, 12, resultMeta.wiki_meta);
                }
                if (resultMeta.slash_command_meta != null) {
                    SlashCommandMeta.ADAPTER.encodeWithTag(protoWriter, 13, resultMeta.slash_command_meta);
                }
                if (resultMeta.section_meta != null) {
                    SectionMeta.ADAPTER.encodeWithTag(protoWriter, 22, resultMeta.section_meta);
                }
                if (resultMeta.resource_meta != null) {
                    ResourceMeta.ADAPTER.encodeWithTag(protoWriter, 23, resultMeta.resource_meta);
                }
                if (resultMeta.customization_meta != null) {
                    CustomizationMeta.ADAPTER.encodeWithTag(protoWriter, 14, resultMeta.customization_meta);
                }
                if (resultMeta.facility_meta != null) {
                    FacilityMeta.ADAPTER.encodeWithTag(protoWriter, 24, resultMeta.facility_meta);
                }
                if (resultMeta.mail_contact_meta != null) {
                    MailContactMeta.ADAPTER.encodeWithTag(protoWriter, 26, resultMeta.mail_contact_meta);
                }
                if (resultMeta.aggre_message_meta != null) {
                    AggregatedMessageMeta.ADAPTER.encodeWithTag(protoWriter, 25, resultMeta.aggre_message_meta);
                }
                protoWriter.writeBytes(resultMeta.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19023a newBuilder() {
            C19023a aVar = new C19023a();
            aVar.f47043a = this.user_meta;
            aVar.f47044b = this.bot_meta;
            aVar.f47045c = this.group_chat_meta;
            aVar.f47046d = this.crypto_p2p_chat_meta;
            aVar.f47047e = this.message_meta;
            aVar.f47048f = this.oncall_meta;
            aVar.f47049g = this.thread_meta;
            aVar.f47050h = this.url_meta;
            aVar.f47051i = this.qa_card_meta;
            aVar.f47052j = this.app_meta;
            aVar.f47053k = this.department_meta;
            aVar.f47054l = this.doc_meta;
            aVar.f47055m = this.wiki_meta;
            aVar.f47056n = this.slash_command_meta;
            aVar.f47057o = this.section_meta;
            aVar.f47058p = this.resource_meta;
            aVar.f47059q = this.customization_meta;
            aVar.f47060r = this.facility_meta;
            aVar.f47061s = this.mail_contact_meta;
            aVar.f47062t = this.aggre_message_meta;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ResultMeta");
            StringBuilder sb = new StringBuilder();
            if (this.user_meta != null) {
                sb.append(", user_meta=");
                sb.append(this.user_meta);
            }
            if (this.bot_meta != null) {
                sb.append(", bot_meta=");
                sb.append(this.bot_meta);
            }
            if (this.group_chat_meta != null) {
                sb.append(", group_chat_meta=");
                sb.append(this.group_chat_meta);
            }
            if (this.crypto_p2p_chat_meta != null) {
                sb.append(", crypto_p2p_chat_meta=");
                sb.append(this.crypto_p2p_chat_meta);
            }
            if (this.message_meta != null) {
                sb.append(", message_meta=");
                sb.append(this.message_meta);
            }
            if (this.oncall_meta != null) {
                sb.append(", oncall_meta=");
                sb.append(this.oncall_meta);
            }
            if (this.thread_meta != null) {
                sb.append(", thread_meta=");
                sb.append(this.thread_meta);
            }
            if (this.url_meta != null) {
                sb.append(", url_meta=");
                sb.append(this.url_meta);
            }
            if (this.qa_card_meta != null) {
                sb.append(", qa_card_meta=");
                sb.append(this.qa_card_meta);
            }
            if (this.app_meta != null) {
                sb.append(", app_meta=");
                sb.append(this.app_meta);
            }
            if (this.department_meta != null) {
                sb.append(", department_meta=");
                sb.append(this.department_meta);
            }
            if (this.doc_meta != null) {
                sb.append(", doc_meta=");
                sb.append(this.doc_meta);
            }
            if (this.wiki_meta != null) {
                sb.append(", wiki_meta=");
                sb.append(this.wiki_meta);
            }
            if (this.slash_command_meta != null) {
                sb.append(", slash_command_meta=");
                sb.append(this.slash_command_meta);
            }
            if (this.section_meta != null) {
                sb.append(", section_meta=");
                sb.append(this.section_meta);
            }
            if (this.resource_meta != null) {
                sb.append(", resource_meta=");
                sb.append(this.resource_meta);
            }
            if (this.customization_meta != null) {
                sb.append(", customization_meta=");
                sb.append(this.customization_meta);
            }
            if (this.facility_meta != null) {
                sb.append(", facility_meta=");
                sb.append(this.facility_meta);
            }
            if (this.mail_contact_meta != null) {
                sb.append(", mail_contact_meta=");
                sb.append(this.mail_contact_meta);
            }
            if (this.aggre_message_meta != null) {
                sb.append(", aggre_message_meta=");
                sb.append(this.aggre_message_meta);
            }
            StringBuilder replace = sb.replace(0, 2, "ResultMeta{");
            replace.append('}');
            return replace.toString();
        }

        public ResultMeta(UserMeta userMeta, BotMeta botMeta, ChatMeta chatMeta, CryptoP2PChatMeta cryptoP2PChatMeta, MessageMeta messageMeta, OncallMeta oncallMeta, ThreadMeta threadMeta, URLMeta uRLMeta, QaCardMeta qaCardMeta, AppMeta appMeta, DepartmentMeta departmentMeta, DocMeta docMeta, WikiMeta wikiMeta, SlashCommandMeta slashCommandMeta, SectionMeta sectionMeta, ResourceMeta resourceMeta, CustomizationMeta customizationMeta, FacilityMeta facilityMeta, MailContactMeta mailContactMeta, AggregatedMessageMeta aggregatedMessageMeta) {
            this(userMeta, botMeta, chatMeta, cryptoP2PChatMeta, messageMeta, oncallMeta, threadMeta, uRLMeta, qaCardMeta, appMeta, departmentMeta, docMeta, wikiMeta, slashCommandMeta, sectionMeta, resourceMeta, customizationMeta, facilityMeta, mailContactMeta, aggregatedMessageMeta, ByteString.EMPTY);
        }

        public ResultMeta(UserMeta userMeta, BotMeta botMeta, ChatMeta chatMeta, CryptoP2PChatMeta cryptoP2PChatMeta, MessageMeta messageMeta, OncallMeta oncallMeta, ThreadMeta threadMeta, URLMeta uRLMeta, QaCardMeta qaCardMeta, AppMeta appMeta, DepartmentMeta departmentMeta, DocMeta docMeta, WikiMeta wikiMeta, SlashCommandMeta slashCommandMeta, SectionMeta sectionMeta, ResourceMeta resourceMeta, CustomizationMeta customizationMeta, FacilityMeta facilityMeta, MailContactMeta mailContactMeta, AggregatedMessageMeta aggregatedMessageMeta, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(userMeta, botMeta, chatMeta, cryptoP2PChatMeta, messageMeta, oncallMeta, threadMeta, uRLMeta, qaCardMeta, appMeta, departmentMeta, docMeta, wikiMeta, slashCommandMeta, sectionMeta, resourceMeta, customizationMeta, facilityMeta, mailContactMeta) <= 1) {
                this.user_meta = userMeta;
                this.bot_meta = botMeta;
                this.group_chat_meta = chatMeta;
                this.crypto_p2p_chat_meta = cryptoP2PChatMeta;
                this.message_meta = messageMeta;
                this.oncall_meta = oncallMeta;
                this.thread_meta = threadMeta;
                this.url_meta = uRLMeta;
                this.qa_card_meta = qaCardMeta;
                this.app_meta = appMeta;
                this.department_meta = departmentMeta;
                this.doc_meta = docMeta;
                this.wiki_meta = wikiMeta;
                this.slash_command_meta = slashCommandMeta;
                this.section_meta = sectionMeta;
                this.resource_meta = resourceMeta;
                this.customization_meta = customizationMeta;
                this.facility_meta = facilityMeta;
                this.mail_contact_meta = mailContactMeta;
                this.aggre_message_meta = aggregatedMessageMeta;
                return;
            }
            throw new IllegalArgumentException("at most one of user_meta, bot_meta, group_chat_meta, crypto_p2p_chat_meta, message_meta, oncall_meta, thread_meta, url_meta, qa_card_meta, app_meta, department_meta, doc_meta, wiki_meta, slash_command_meta, section_meta, resource_meta, customization_meta, facility_meta, mail_contact_meta may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchResult$b */
    private static final class C19026b extends ProtoAdapter<SearchResult> {
        C19026b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchResult.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchResult searchResult) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ResultSourceType.ADAPTER.encodedSizeWithTag(100, searchResult.source_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, searchResult.id);
            int i8 = 0;
            if (searchResult.type != null) {
                i = SearchEntityType.ADAPTER.encodedSizeWithTag(2, searchResult.type);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (searchResult.rank_score != null) {
                i2 = ProtoAdapter.DOUBLE.encodedSizeWithTag(3, searchResult.rank_score);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (searchResult.title_highlighted != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchResult.title_highlighted);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (searchResult.summary_highlighted != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchResult.summary_highlighted);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (searchResult.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchResult.avatar_key);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (searchResult.result_meta != null) {
                i6 = ResultMeta.ADAPTER.encodedSizeWithTag(7, searchResult.result_meta);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (searchResult.extras_highlighted != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, searchResult.extras_highlighted);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag2 = i14 + i7 + ExplanationTag.ADAPTER.asRepeated().encodedSizeWithTag(9, searchResult.explanation_tags) + ExtraInfoBlock.ADAPTER.asRepeated().encodedSizeWithTag(10, searchResult.extra_infos);
            if (searchResult.extra_info_separator != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchResult.extra_info_separator);
            }
            return encodedSizeWithTag2 + i8 + searchResult.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResult decode(ProtoReader protoReader) throws IOException {
            C19025a aVar = new C19025a();
            aVar.f47063a = ResultSourceType.DEFAULT;
            aVar.f47064b = "";
            aVar.f47065c = SearchEntityType.UNKNOWN;
            aVar.f47066d = Double.valueOf(0.0d);
            aVar.f47067e = "";
            aVar.f47068f = "";
            aVar.f47069g = "";
            aVar.f47071i = "";
            aVar.f47074l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47064b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f47065c = SearchEntityType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47066d = ProtoAdapter.DOUBLE.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f47067e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f47068f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f47069g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f47070h = ResultMeta.ADAPTER.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f47071i = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f47072j.add(ExplanationTag.ADAPTER.decode(protoReader));
                            continue;
                        case 10:
                            aVar.f47073k.add(ExtraInfoBlock.ADAPTER.decode(protoReader));
                            continue;
                        case 11:
                            aVar.f47074l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    try {
                        aVar.f47063a = ResultSourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchResult searchResult) throws IOException {
            ResultSourceType.ADAPTER.encodeWithTag(protoWriter, 100, searchResult.source_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchResult.id);
            if (searchResult.type != null) {
                SearchEntityType.ADAPTER.encodeWithTag(protoWriter, 2, searchResult.type);
            }
            if (searchResult.rank_score != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, searchResult.rank_score);
            }
            if (searchResult.title_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchResult.title_highlighted);
            }
            if (searchResult.summary_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchResult.summary_highlighted);
            }
            if (searchResult.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchResult.avatar_key);
            }
            if (searchResult.result_meta != null) {
                ResultMeta.ADAPTER.encodeWithTag(protoWriter, 7, searchResult.result_meta);
            }
            if (searchResult.extras_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, searchResult.extras_highlighted);
            }
            ExplanationTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, searchResult.explanation_tags);
            ExtraInfoBlock.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, searchResult.extra_infos);
            if (searchResult.extra_info_separator != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchResult.extra_info_separator);
            }
            protoWriter.writeBytes(searchResult.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchResult$a */
    public static final class C19025a extends Message.Builder<SearchResult, C19025a> {

        /* renamed from: a */
        public ResultSourceType f47063a;

        /* renamed from: b */
        public String f47064b;

        /* renamed from: c */
        public SearchEntityType f47065c;

        /* renamed from: d */
        public Double f47066d;

        /* renamed from: e */
        public String f47067e;

        /* renamed from: f */
        public String f47068f;

        /* renamed from: g */
        public String f47069g;

        /* renamed from: h */
        public ResultMeta f47070h;

        /* renamed from: i */
        public String f47071i;

        /* renamed from: j */
        public List<ExplanationTag> f47072j = Internal.newMutableList();

        /* renamed from: k */
        public List<ExtraInfoBlock> f47073k = Internal.newMutableList();

        /* renamed from: l */
        public String f47074l;

        /* renamed from: a */
        public SearchResult build() {
            String str;
            ResultSourceType resultSourceType = this.f47063a;
            if (resultSourceType != null && (str = this.f47064b) != null) {
                return new SearchResult(resultSourceType, str, this.f47065c, this.f47066d, this.f47067e, this.f47068f, this.f47069g, this.f47070h, this.f47071i, this.f47072j, this.f47073k, this.f47074l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(resultSourceType, "source_type", this.f47064b, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C19025a newBuilder() {
        C19025a aVar = new C19025a();
        aVar.f47063a = this.source_type;
        aVar.f47064b = this.id;
        aVar.f47065c = this.type;
        aVar.f47066d = this.rank_score;
        aVar.f47067e = this.title_highlighted;
        aVar.f47068f = this.summary_highlighted;
        aVar.f47069g = this.avatar_key;
        aVar.f47070h = this.result_meta;
        aVar.f47071i = this.extras_highlighted;
        aVar.f47072j = Internal.copyOf("explanation_tags", this.explanation_tags);
        aVar.f47073k = Internal.copyOf("extra_infos", this.extra_infos);
        aVar.f47074l = this.extra_info_separator;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchResult");
        StringBuilder sb = new StringBuilder();
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.rank_score != null) {
            sb.append(", rank_score=");
            sb.append(this.rank_score);
        }
        if (this.title_highlighted != null) {
            sb.append(", title_highlighted=");
            sb.append(this.title_highlighted);
        }
        if (this.summary_highlighted != null) {
            sb.append(", summary_highlighted=");
            sb.append(this.summary_highlighted);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.result_meta != null) {
            sb.append(", result_meta=");
            sb.append(this.result_meta);
        }
        if (this.extras_highlighted != null) {
            sb.append(", extras_highlighted=");
            sb.append(this.extras_highlighted);
        }
        if (!this.explanation_tags.isEmpty()) {
            sb.append(", explanation_tags=");
            sb.append(this.explanation_tags);
        }
        if (!this.extra_infos.isEmpty()) {
            sb.append(", extra_infos=");
            sb.append(this.extra_infos);
        }
        if (this.extra_info_separator != null) {
            sb.append(", extra_info_separator=");
            sb.append(this.extra_info_separator);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchResult{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResult(ResultSourceType resultSourceType, String str, SearchEntityType searchEntityType, Double d, String str2, String str3, String str4, ResultMeta resultMeta, String str5, List<ExplanationTag> list, List<ExtraInfoBlock> list2, String str6) {
        this(resultSourceType, str, searchEntityType, d, str2, str3, str4, resultMeta, str5, list, list2, str6, ByteString.EMPTY);
    }

    public SearchResult(ResultSourceType resultSourceType, String str, SearchEntityType searchEntityType, Double d, String str2, String str3, String str4, ResultMeta resultMeta, String str5, List<ExplanationTag> list, List<ExtraInfoBlock> list2, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_type = resultSourceType;
        this.id = str;
        this.type = searchEntityType;
        this.rank_score = d;
        this.title_highlighted = str2;
        this.summary_highlighted = str3;
        this.avatar_key = str4;
        this.result_meta = resultMeta;
        this.extras_highlighted = str5;
        this.explanation_tags = Internal.immutableCopyOf("explanation_tags", list);
        this.extra_infos = Internal.immutableCopyOf("extra_infos", list2);
        this.extra_info_separator = str6;
    }
}
