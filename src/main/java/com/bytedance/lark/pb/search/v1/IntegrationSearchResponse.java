package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.sidecard.SideCard;
import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class IntegrationSearchResponse extends Message<IntegrationSearchResponse, C18833a> {
    public static final ProtoAdapter<IntegrationSearchResponse> ADAPTER = new C18834b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, SearchBoxMeta> boxs;
    public final Map<String, SearchChatMeta> chats;
    public final Map<String, SearchChatterMeta> chatters;
    public final Map<String, SearchCryptoP2PChatMeta> crypto_p2p_chats;
    public final Map<String, SearchDepartmentMeta> departments;
    public final Map<String, SearchDocFeedMeta> doc_feeds;
    public final Map<String, SearchDocMeta> docs;
    public final Map<String, SearchEmailMeta> emails;
    public final Map<String, SearchExternalMeta> externals;
    public final String extras;
    public final Boolean has_more;
    public final String impr_id;
    public final Map<String, SearchLinkMeta> links;
    public final Map<String, SearchMailMeta> mails;
    public final String message_count;
    public final Map<String, SearchMessageMeta> messages;
    public final Map<String, SearchOncallMeta> oncalls;
    public final Map<String, SearchOpenAppMeta> open_apps;
    public final Map<String, SearchQaMeta> qa_card;
    public final List<SearchResult> result_with_sections;
    public final List<SearchResult> results;
    public final Map<String, SectionMeta> section_portions;
    public final SideCard side_card;
    public final Map<String, SlashCommandMeta> slash_commands;
    public final List<SuggestJumpTabInfo> suggest_jump_tab_infos;
    public final List<SearchTabName> suggest_jump_tabs;
    public final List<SearchResultSummary> summary;
    public final Map<String, SearchThreadMeta> threads;
    public final Integer total;
    public final Map<String, SearchWikiMeta> wikis;

    /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchResponse$a */
    public static final class C18833a extends Message.Builder<IntegrationSearchResponse, C18833a> {

        /* renamed from: A */
        public List<SearchResult> f46432A = Internal.newMutableList();

        /* renamed from: B */
        public Map<String, SectionMeta> f46433B = Internal.newMutableMap();

        /* renamed from: C */
        public SideCard f46434C;

        /* renamed from: D */
        public List<SuggestJumpTabInfo> f46435D = Internal.newMutableList();

        /* renamed from: a */
        public List<SearchResult> f46436a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f46437b;

        /* renamed from: c */
        public Boolean f46438c;

        /* renamed from: d */
        public Map<String, SearchChatterMeta> f46439d = Internal.newMutableMap();

        /* renamed from: e */
        public Map<String, SearchChatMeta> f46440e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, SearchMessageMeta> f46441f = Internal.newMutableMap();

        /* renamed from: g */
        public Map<String, SearchDocMeta> f46442g = Internal.newMutableMap();

        /* renamed from: h */
        public Map<String, SearchEmailMeta> f46443h = Internal.newMutableMap();

        /* renamed from: i */
        public Map<String, SearchThreadMeta> f46444i = Internal.newMutableMap();

        /* renamed from: j */
        public Map<String, SearchBoxMeta> f46445j = Internal.newMutableMap();

        /* renamed from: k */
        public Map<String, SearchOncallMeta> f46446k = Internal.newMutableMap();

        /* renamed from: l */
        public String f46447l;

        /* renamed from: m */
        public Map<String, SearchCryptoP2PChatMeta> f46448m = Internal.newMutableMap();

        /* renamed from: n */
        public Map<String, SearchOpenAppMeta> f46449n = Internal.newMutableMap();

        /* renamed from: o */
        public Map<String, SearchLinkMeta> f46450o = Internal.newMutableMap();

        /* renamed from: p */
        public String f46451p;

        /* renamed from: q */
        public Map<String, SearchExternalMeta> f46452q = Internal.newMutableMap();

        /* renamed from: r */
        public String f46453r;

        /* renamed from: s */
        public Map<String, SearchWikiMeta> f46454s = Internal.newMutableMap();

        /* renamed from: t */
        public Map<String, SearchMailMeta> f46455t = Internal.newMutableMap();

        /* renamed from: u */
        public Map<String, SearchDepartmentMeta> f46456u = Internal.newMutableMap();

        /* renamed from: v */
        public Map<String, SearchDocFeedMeta> f46457v = Internal.newMutableMap();

        /* renamed from: w */
        public List<SearchResultSummary> f46458w = Internal.newMutableList();

        /* renamed from: x */
        public Map<String, SearchQaMeta> f46459x = Internal.newMutableMap();

        /* renamed from: y */
        public List<SearchTabName> f46460y = Internal.newMutableList();

        /* renamed from: z */
        public Map<String, SlashCommandMeta> f46461z = Internal.newMutableMap();

        /* renamed from: a */
        public IntegrationSearchResponse build() {
            return new IntegrationSearchResponse(this.f46436a, this.f46437b, this.f46438c, this.f46439d, this.f46440e, this.f46441f, this.f46442g, this.f46443h, this.f46444i, this.f46445j, this.f46446k, this.f46447l, this.f46448m, this.f46449n, this.f46450o, this.f46451p, this.f46452q, this.f46453r, this.f46454s, this.f46455t, this.f46456u, this.f46457v, this.f46458w, this.f46459x, this.f46460y, this.f46461z, this.f46432A, this.f46433B, this.f46434C, this.f46435D, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchResponse$b */
    private static final class C18834b extends ProtoAdapter<IntegrationSearchResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SearchChatterMeta>> f46462a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchChatterMeta.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SearchChatMeta>> f46463b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchChatMeta.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, SearchMessageMeta>> f46464c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchMessageMeta.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, SearchDocMeta>> f46465d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchDocMeta.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, SearchEmailMeta>> f46466e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchEmailMeta.ADAPTER);

        /* renamed from: f */
        private final ProtoAdapter<Map<String, SearchThreadMeta>> f46467f = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchThreadMeta.ADAPTER);

        /* renamed from: g */
        private final ProtoAdapter<Map<String, SearchBoxMeta>> f46468g = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchBoxMeta.ADAPTER);

        /* renamed from: h */
        private final ProtoAdapter<Map<String, SearchOncallMeta>> f46469h = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchOncallMeta.ADAPTER);

        /* renamed from: i */
        private final ProtoAdapter<Map<String, SearchCryptoP2PChatMeta>> f46470i = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchCryptoP2PChatMeta.ADAPTER);

        /* renamed from: j */
        private final ProtoAdapter<Map<String, SearchOpenAppMeta>> f46471j = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchOpenAppMeta.ADAPTER);

        /* renamed from: k */
        private final ProtoAdapter<Map<String, SearchLinkMeta>> f46472k = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchLinkMeta.ADAPTER);

        /* renamed from: l */
        private final ProtoAdapter<Map<String, SearchExternalMeta>> f46473l = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchExternalMeta.ADAPTER);

        /* renamed from: m */
        private final ProtoAdapter<Map<String, SearchWikiMeta>> f46474m = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchWikiMeta.ADAPTER);

        /* renamed from: n */
        private final ProtoAdapter<Map<String, SearchMailMeta>> f46475n = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchMailMeta.ADAPTER);

        /* renamed from: o */
        private final ProtoAdapter<Map<String, SearchDepartmentMeta>> f46476o = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchDepartmentMeta.ADAPTER);

        /* renamed from: p */
        private final ProtoAdapter<Map<String, SearchDocFeedMeta>> f46477p = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchDocFeedMeta.ADAPTER);

        /* renamed from: q */
        private final ProtoAdapter<Map<String, SearchQaMeta>> f46478q = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchQaMeta.ADAPTER);

        /* renamed from: r */
        private final ProtoAdapter<Map<String, SlashCommandMeta>> f46479r = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SlashCommandMeta.ADAPTER);

        /* renamed from: s */
        private final ProtoAdapter<Map<String, SectionMeta>> f46480s = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SectionMeta.ADAPTER);

        C18834b() {
            super(FieldEncoding.LENGTH_DELIMITED, IntegrationSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(IntegrationSearchResponse integrationSearchResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(1, integrationSearchResponse.results);
            int i6 = 0;
            if (integrationSearchResponse.total != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, integrationSearchResponse.total);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (integrationSearchResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, integrationSearchResponse.has_more);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i7 + i2 + this.f46462a.encodedSizeWithTag(4, integrationSearchResponse.chatters) + this.f46463b.encodedSizeWithTag(5, integrationSearchResponse.chats) + this.f46464c.encodedSizeWithTag(6, integrationSearchResponse.messages) + this.f46465d.encodedSizeWithTag(7, integrationSearchResponse.docs) + this.f46466e.encodedSizeWithTag(8, integrationSearchResponse.emails) + this.f46467f.encodedSizeWithTag(9, integrationSearchResponse.threads) + this.f46468g.encodedSizeWithTag(10, integrationSearchResponse.boxs) + this.f46469h.encodedSizeWithTag(11, integrationSearchResponse.oncalls);
            if (integrationSearchResponse.message_count != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(12, integrationSearchResponse.message_count);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i3 + this.f46470i.encodedSizeWithTag(13, integrationSearchResponse.crypto_p2p_chats) + this.f46471j.encodedSizeWithTag(14, integrationSearchResponse.open_apps) + this.f46472k.encodedSizeWithTag(15, integrationSearchResponse.links);
            if (integrationSearchResponse.impr_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(16, integrationSearchResponse.impr_id);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i4 + this.f46473l.encodedSizeWithTag(17, integrationSearchResponse.externals);
            if (integrationSearchResponse.extras != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(18, integrationSearchResponse.extras);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag5 = encodedSizeWithTag4 + i5 + this.f46474m.encodedSizeWithTag(19, integrationSearchResponse.wikis) + this.f46475n.encodedSizeWithTag(20, integrationSearchResponse.mails) + this.f46476o.encodedSizeWithTag(21, integrationSearchResponse.departments) + this.f46477p.encodedSizeWithTag(100, integrationSearchResponse.doc_feeds) + SearchResultSummary.ADAPTER.asRepeated().encodedSizeWithTag(22, integrationSearchResponse.summary) + this.f46478q.encodedSizeWithTag(23, integrationSearchResponse.qa_card) + SearchTabName.ADAPTER.asRepeated().encodedSizeWithTag(24, integrationSearchResponse.suggest_jump_tabs) + this.f46479r.encodedSizeWithTag(27, integrationSearchResponse.slash_commands) + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(28, integrationSearchResponse.result_with_sections) + this.f46480s.encodedSizeWithTag(29, integrationSearchResponse.section_portions);
            if (integrationSearchResponse.side_card != null) {
                i6 = SideCard.ADAPTER.encodedSizeWithTag(31, integrationSearchResponse.side_card);
            }
            return encodedSizeWithTag5 + i6 + SuggestJumpTabInfo.ADAPTER.asRepeated().encodedSizeWithTag(32, integrationSearchResponse.suggest_jump_tab_infos) + integrationSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public IntegrationSearchResponse decode(ProtoReader protoReader) throws IOException {
            C18833a aVar = new C18833a();
            aVar.f46437b = 0;
            aVar.f46438c = false;
            aVar.f46447l = "";
            aVar.f46451p = "";
            aVar.f46453r = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 31) {
                    aVar.f46434C = SideCard.ADAPTER.decode(protoReader);
                } else if (nextTag == 32) {
                    aVar.f46435D.add(SuggestJumpTabInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46436a.add(SearchResult.ADAPTER.decode(protoReader));
                            continue;
                        case 2:
                            aVar.f46437b = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f46438c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f46439d.putAll(this.f46462a.decode(protoReader));
                            continue;
                        case 5:
                            aVar.f46440e.putAll(this.f46463b.decode(protoReader));
                            continue;
                        case 6:
                            aVar.f46441f.putAll(this.f46464c.decode(protoReader));
                            continue;
                        case 7:
                            aVar.f46442g.putAll(this.f46465d.decode(protoReader));
                            continue;
                        case 8:
                            aVar.f46443h.putAll(this.f46466e.decode(protoReader));
                            continue;
                        case 9:
                            aVar.f46444i.putAll(this.f46467f.decode(protoReader));
                            continue;
                        case 10:
                            aVar.f46445j.putAll(this.f46468g.decode(protoReader));
                            continue;
                        case 11:
                            aVar.f46446k.putAll(this.f46469h.decode(protoReader));
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46447l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f46448m.putAll(this.f46470i.decode(protoReader));
                            continue;
                        case 14:
                            aVar.f46449n.putAll(this.f46471j.decode(protoReader));
                            continue;
                        case 15:
                            aVar.f46450o.putAll(this.f46472k.decode(protoReader));
                            continue;
                        case 16:
                            aVar.f46451p = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 17:
                            aVar.f46452q.putAll(this.f46473l.decode(protoReader));
                            continue;
                        case 18:
                            aVar.f46453r = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 19:
                            aVar.f46454s.putAll(this.f46474m.decode(protoReader));
                            continue;
                        case 20:
                            aVar.f46455t.putAll(this.f46475n.decode(protoReader));
                            continue;
                        case 21:
                            aVar.f46456u.putAll(this.f46476o.decode(protoReader));
                            continue;
                        case 22:
                            aVar.f46458w.add(SearchResultSummary.ADAPTER.decode(protoReader));
                            continue;
                        case 23:
                            aVar.f46459x.putAll(this.f46478q.decode(protoReader));
                            continue;
                        case 24:
                            try {
                                aVar.f46460y.add(SearchTabName.ADAPTER.decode(protoReader));
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            switch (nextTag) {
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                    aVar.f46461z.putAll(this.f46479r.decode(protoReader));
                                    continue;
                                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                    aVar.f46432A.add(SearchResult.ADAPTER.decode(protoReader));
                                    continue;
                                case 29:
                                    aVar.f46433B.putAll(this.f46480s.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f46457v.putAll(this.f46477p.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, IntegrationSearchResponse integrationSearchResponse) throws IOException {
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, integrationSearchResponse.results);
            if (integrationSearchResponse.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, integrationSearchResponse.total);
            }
            if (integrationSearchResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, integrationSearchResponse.has_more);
            }
            this.f46462a.encodeWithTag(protoWriter, 4, integrationSearchResponse.chatters);
            this.f46463b.encodeWithTag(protoWriter, 5, integrationSearchResponse.chats);
            this.f46464c.encodeWithTag(protoWriter, 6, integrationSearchResponse.messages);
            this.f46465d.encodeWithTag(protoWriter, 7, integrationSearchResponse.docs);
            this.f46466e.encodeWithTag(protoWriter, 8, integrationSearchResponse.emails);
            this.f46467f.encodeWithTag(protoWriter, 9, integrationSearchResponse.threads);
            this.f46468g.encodeWithTag(protoWriter, 10, integrationSearchResponse.boxs);
            this.f46469h.encodeWithTag(protoWriter, 11, integrationSearchResponse.oncalls);
            if (integrationSearchResponse.message_count != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, integrationSearchResponse.message_count);
            }
            this.f46470i.encodeWithTag(protoWriter, 13, integrationSearchResponse.crypto_p2p_chats);
            this.f46471j.encodeWithTag(protoWriter, 14, integrationSearchResponse.open_apps);
            this.f46472k.encodeWithTag(protoWriter, 15, integrationSearchResponse.links);
            if (integrationSearchResponse.impr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, integrationSearchResponse.impr_id);
            }
            this.f46473l.encodeWithTag(protoWriter, 17, integrationSearchResponse.externals);
            if (integrationSearchResponse.extras != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, integrationSearchResponse.extras);
            }
            this.f46474m.encodeWithTag(protoWriter, 19, integrationSearchResponse.wikis);
            this.f46475n.encodeWithTag(protoWriter, 20, integrationSearchResponse.mails);
            this.f46476o.encodeWithTag(protoWriter, 21, integrationSearchResponse.departments);
            this.f46477p.encodeWithTag(protoWriter, 100, integrationSearchResponse.doc_feeds);
            SearchResultSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, integrationSearchResponse.summary);
            this.f46478q.encodeWithTag(protoWriter, 23, integrationSearchResponse.qa_card);
            SearchTabName.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, integrationSearchResponse.suggest_jump_tabs);
            this.f46479r.encodeWithTag(protoWriter, 27, integrationSearchResponse.slash_commands);
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 28, integrationSearchResponse.result_with_sections);
            this.f46480s.encodeWithTag(protoWriter, 29, integrationSearchResponse.section_portions);
            if (integrationSearchResponse.side_card != null) {
                SideCard.ADAPTER.encodeWithTag(protoWriter, 31, integrationSearchResponse.side_card);
            }
            SuggestJumpTabInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 32, integrationSearchResponse.suggest_jump_tab_infos);
            protoWriter.writeBytes(integrationSearchResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18833a newBuilder() {
        C18833a aVar = new C18833a();
        aVar.f46436a = Internal.copyOf("results", this.results);
        aVar.f46437b = this.total;
        aVar.f46438c = this.has_more;
        aVar.f46439d = Internal.copyOf("chatters", this.chatters);
        aVar.f46440e = Internal.copyOf("chats", this.chats);
        aVar.f46441f = Internal.copyOf("messages", this.messages);
        aVar.f46442g = Internal.copyOf("docs", this.docs);
        aVar.f46443h = Internal.copyOf("emails", this.emails);
        aVar.f46444i = Internal.copyOf("threads", this.threads);
        aVar.f46445j = Internal.copyOf("boxs", this.boxs);
        aVar.f46446k = Internal.copyOf("oncalls", this.oncalls);
        aVar.f46447l = this.message_count;
        aVar.f46448m = Internal.copyOf("crypto_p2p_chats", this.crypto_p2p_chats);
        aVar.f46449n = Internal.copyOf("open_apps", this.open_apps);
        aVar.f46450o = Internal.copyOf("links", this.links);
        aVar.f46451p = this.impr_id;
        aVar.f46452q = Internal.copyOf("externals", this.externals);
        aVar.f46453r = this.extras;
        aVar.f46454s = Internal.copyOf("wikis", this.wikis);
        aVar.f46455t = Internal.copyOf("mails", this.mails);
        aVar.f46456u = Internal.copyOf("departments", this.departments);
        aVar.f46457v = Internal.copyOf("doc_feeds", this.doc_feeds);
        aVar.f46458w = Internal.copyOf("summary", this.summary);
        aVar.f46459x = Internal.copyOf("qa_card", this.qa_card);
        aVar.f46460y = Internal.copyOf("suggest_jump_tabs", this.suggest_jump_tabs);
        aVar.f46461z = Internal.copyOf("slash_commands", this.slash_commands);
        aVar.f46432A = Internal.copyOf("result_with_sections", this.result_with_sections);
        aVar.f46433B = Internal.copyOf("section_portions", this.section_portions);
        aVar.f46434C = this.side_card;
        aVar.f46435D = Internal.copyOf("suggest_jump_tab_infos", this.suggest_jump_tab_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "IntegrationSearchResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (!this.chats.isEmpty()) {
            sb.append(", chats=");
            sb.append(this.chats);
        }
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        if (!this.emails.isEmpty()) {
            sb.append(", emails=");
            sb.append(this.emails);
        }
        if (!this.threads.isEmpty()) {
            sb.append(", threads=");
            sb.append(this.threads);
        }
        if (!this.boxs.isEmpty()) {
            sb.append(", boxs=");
            sb.append(this.boxs);
        }
        if (!this.oncalls.isEmpty()) {
            sb.append(", oncalls=");
            sb.append(this.oncalls);
        }
        if (this.message_count != null) {
            sb.append(", message_count=");
            sb.append(this.message_count);
        }
        if (!this.crypto_p2p_chats.isEmpty()) {
            sb.append(", crypto_p2p_chats=");
            sb.append(this.crypto_p2p_chats);
        }
        if (!this.open_apps.isEmpty()) {
            sb.append(", open_apps=");
            sb.append(this.open_apps);
        }
        if (!this.links.isEmpty()) {
            sb.append(", links=");
            sb.append(this.links);
        }
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        if (!this.externals.isEmpty()) {
            sb.append(", externals=");
            sb.append(this.externals);
        }
        if (this.extras != null) {
            sb.append(", extras=");
            sb.append(this.extras);
        }
        if (!this.wikis.isEmpty()) {
            sb.append(", wikis=");
            sb.append(this.wikis);
        }
        if (!this.mails.isEmpty()) {
            sb.append(", mails=");
            sb.append(this.mails);
        }
        if (!this.departments.isEmpty()) {
            sb.append(", departments=");
            sb.append(this.departments);
        }
        if (!this.doc_feeds.isEmpty()) {
            sb.append(", doc_feeds=");
            sb.append(this.doc_feeds);
        }
        if (!this.summary.isEmpty()) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (!this.qa_card.isEmpty()) {
            sb.append(", qa_card=");
            sb.append(this.qa_card);
        }
        if (!this.suggest_jump_tabs.isEmpty()) {
            sb.append(", suggest_jump_tabs=");
            sb.append(this.suggest_jump_tabs);
        }
        if (!this.slash_commands.isEmpty()) {
            sb.append(", slash_commands=");
            sb.append(this.slash_commands);
        }
        if (!this.result_with_sections.isEmpty()) {
            sb.append(", result_with_sections=");
            sb.append(this.result_with_sections);
        }
        if (!this.section_portions.isEmpty()) {
            sb.append(", section_portions=");
            sb.append(this.section_portions);
        }
        if (this.side_card != null) {
            sb.append(", side_card=");
            sb.append(this.side_card);
        }
        if (!this.suggest_jump_tab_infos.isEmpty()) {
            sb.append(", suggest_jump_tab_infos=");
            sb.append(this.suggest_jump_tab_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "IntegrationSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public IntegrationSearchResponse(List<SearchResult> list, Integer num, Boolean bool, Map<String, SearchChatterMeta> map, Map<String, SearchChatMeta> map2, Map<String, SearchMessageMeta> map3, Map<String, SearchDocMeta> map4, Map<String, SearchEmailMeta> map5, Map<String, SearchThreadMeta> map6, Map<String, SearchBoxMeta> map7, Map<String, SearchOncallMeta> map8, String str, Map<String, SearchCryptoP2PChatMeta> map9, Map<String, SearchOpenAppMeta> map10, Map<String, SearchLinkMeta> map11, String str2, Map<String, SearchExternalMeta> map12, String str3, Map<String, SearchWikiMeta> map13, Map<String, SearchMailMeta> map14, Map<String, SearchDepartmentMeta> map15, Map<String, SearchDocFeedMeta> map16, List<SearchResultSummary> list2, Map<String, SearchQaMeta> map17, List<SearchTabName> list3, Map<String, SlashCommandMeta> map18, List<SearchResult> list4, Map<String, SectionMeta> map19, SideCard sideCard, List<SuggestJumpTabInfo> list5) {
        this(list, num, bool, map, map2, map3, map4, map5, map6, map7, map8, str, map9, map10, map11, str2, map12, str3, map13, map14, map15, map16, list2, map17, list3, map18, list4, map19, sideCard, list5, ByteString.EMPTY);
    }

    public IntegrationSearchResponse(List<SearchResult> list, Integer num, Boolean bool, Map<String, SearchChatterMeta> map, Map<String, SearchChatMeta> map2, Map<String, SearchMessageMeta> map3, Map<String, SearchDocMeta> map4, Map<String, SearchEmailMeta> map5, Map<String, SearchThreadMeta> map6, Map<String, SearchBoxMeta> map7, Map<String, SearchOncallMeta> map8, String str, Map<String, SearchCryptoP2PChatMeta> map9, Map<String, SearchOpenAppMeta> map10, Map<String, SearchLinkMeta> map11, String str2, Map<String, SearchExternalMeta> map12, String str3, Map<String, SearchWikiMeta> map13, Map<String, SearchMailMeta> map14, Map<String, SearchDepartmentMeta> map15, Map<String, SearchDocFeedMeta> map16, List<SearchResultSummary> list2, Map<String, SearchQaMeta> map17, List<SearchTabName> list3, Map<String, SlashCommandMeta> map18, List<SearchResult> list4, Map<String, SectionMeta> map19, SideCard sideCard, List<SuggestJumpTabInfo> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.results = Internal.immutableCopyOf("results", list);
        this.total = num;
        this.has_more = bool;
        this.chatters = Internal.immutableCopyOf("chatters", map);
        this.chats = Internal.immutableCopyOf("chats", map2);
        this.messages = Internal.immutableCopyOf("messages", map3);
        this.docs = Internal.immutableCopyOf("docs", map4);
        this.emails = Internal.immutableCopyOf("emails", map5);
        this.threads = Internal.immutableCopyOf("threads", map6);
        this.boxs = Internal.immutableCopyOf("boxs", map7);
        this.oncalls = Internal.immutableCopyOf("oncalls", map8);
        this.message_count = str;
        this.crypto_p2p_chats = Internal.immutableCopyOf("crypto_p2p_chats", map9);
        this.open_apps = Internal.immutableCopyOf("open_apps", map10);
        this.links = Internal.immutableCopyOf("links", map11);
        this.impr_id = str2;
        this.externals = Internal.immutableCopyOf("externals", map12);
        this.extras = str3;
        this.wikis = Internal.immutableCopyOf("wikis", map13);
        this.mails = Internal.immutableCopyOf("mails", map14);
        this.departments = Internal.immutableCopyOf("departments", map15);
        this.doc_feeds = Internal.immutableCopyOf("doc_feeds", map16);
        this.summary = Internal.immutableCopyOf("summary", list2);
        this.qa_card = Internal.immutableCopyOf("qa_card", map17);
        this.suggest_jump_tabs = Internal.immutableCopyOf("suggest_jump_tabs", list3);
        this.slash_commands = Internal.immutableCopyOf("slash_commands", map18);
        this.result_with_sections = Internal.immutableCopyOf("result_with_sections", list4);
        this.section_portions = Internal.immutableCopyOf("section_portions", map19);
        this.side_card = sideCard;
        this.suggest_jump_tab_infos = Internal.immutableCopyOf("suggest_jump_tab_infos", list5);
    }
}
