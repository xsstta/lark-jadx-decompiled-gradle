package com.ss.android.lark.pb.usearch;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ResultMeta extends Message<ResultMeta, C50236a> {
    public static final ProtoAdapter<ResultMeta> ADAPTER = new C50237b();
    private static final long serialVersionUID = 0;
    public final AggregatedMessageMeta maggre_message_meta;
    public final AppMeta mapp_meta;
    public final BotMeta mbot_meta;
    public final CryptoP2PChatMeta mcrypto_p2p_chat_meta;
    public final CustomizationMeta mcustomization_meta;
    public final DepartmentMeta mdepartment_meta;
    public final DocMeta mdoc_meta;
    public final FacilityMeta mfacility_meta;
    public final GroupChatMeta mgroup_chat_meta;
    public final MailContactMeta mmail_contact_meta;
    public final MessageMeta mmessage_meta;
    public final OncallMeta moncall_meta;
    public final QACardMeta mqa_meta;
    public final ResourceMeta mresource_meta;
    public final SectionMeta msection_meta;
    public final SlashCommandMeta mslash_command_meta;
    public final ThreadMeta mthread_meta;
    public final URLMeta murl_meta;
    public final UserMeta muser_meta;
    public final WikiMeta mwiki_meta;

    /* renamed from: com.ss.android.lark.pb.usearch.ResultMeta$a */
    public static final class C50236a extends Message.Builder<ResultMeta, C50236a> {

        /* renamed from: a */
        public UserMeta f125515a;

        /* renamed from: b */
        public BotMeta f125516b;

        /* renamed from: c */
        public GroupChatMeta f125517c;

        /* renamed from: d */
        public CryptoP2PChatMeta f125518d;

        /* renamed from: e */
        public MessageMeta f125519e;

        /* renamed from: f */
        public OncallMeta f125520f;

        /* renamed from: g */
        public ThreadMeta f125521g;

        /* renamed from: h */
        public URLMeta f125522h;

        /* renamed from: i */
        public QACardMeta f125523i;

        /* renamed from: j */
        public DepartmentMeta f125524j;

        /* renamed from: k */
        public DocMeta f125525k;

        /* renamed from: l */
        public AppMeta f125526l;

        /* renamed from: m */
        public SlashCommandMeta f125527m;

        /* renamed from: n */
        public WikiMeta f125528n;

        /* renamed from: o */
        public SectionMeta f125529o;

        /* renamed from: p */
        public ResourceMeta f125530p;

        /* renamed from: q */
        public CustomizationMeta f125531q;

        /* renamed from: r */
        public FacilityMeta f125532r;

        /* renamed from: s */
        public MailContactMeta f125533s;

        /* renamed from: t */
        public AggregatedMessageMeta f125534t;

        /* renamed from: a */
        public C50236a mo174337a(UserMeta userMeta) {
            this.f125515a = userMeta;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174327a(GroupChatMeta groupChatMeta) {
            this.f125517c = groupChatMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174329a(MessageMeta messageMeta) {
            this.f125519e = messageMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174330a(OncallMeta oncallMeta) {
            this.f125520f = oncallMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174335a(ThreadMeta threadMeta) {
            this.f125521g = threadMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174336a(URLMeta uRLMeta) {
            this.f125522h = uRLMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174331a(QACardMeta qACardMeta) {
            this.f125523i = qACardMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174334a(SlashCommandMeta slashCommandMeta) {
            this.f125527m = slashCommandMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174338a(WikiMeta wikiMeta) {
            this.f125528n = wikiMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174333a(SectionMeta sectionMeta) {
            this.f125529o = sectionMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174332a(ResourceMeta resourceMeta) {
            this.f125530p = resourceMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174326a(FacilityMeta facilityMeta) {
            this.f125532r = facilityMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174328a(MailContactMeta mailContactMeta) {
            this.f125533s = mailContactMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            return this;
        }

        /* renamed from: a */
        public ResultMeta build() {
            return new ResultMeta(this.f125515a, this.f125516b, this.f125517c, this.f125518d, this.f125519e, this.f125520f, this.f125521g, this.f125522h, this.f125523i, this.f125524j, this.f125525k, this.f125526l, this.f125527m, this.f125528n, this.f125529o, this.f125530p, this.f125531q, this.f125532r, this.f125533s, this.f125534t, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50236a mo174319a(AggregatedMessageMeta aggregatedMessageMeta) {
            this.f125534t = aggregatedMessageMeta;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174320a(AppMeta appMeta) {
            this.f125526l = appMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174321a(BotMeta botMeta) {
            this.f125516b = botMeta;
            this.f125515a = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174322a(CryptoP2PChatMeta cryptoP2PChatMeta) {
            this.f125518d = cryptoP2PChatMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174323a(CustomizationMeta customizationMeta) {
            this.f125531q = customizationMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174324a(DepartmentMeta departmentMeta) {
            this.f125524j = departmentMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125525k = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }

        /* renamed from: a */
        public C50236a mo174325a(DocMeta docMeta) {
            this.f125525k = docMeta;
            this.f125515a = null;
            this.f125516b = null;
            this.f125517c = null;
            this.f125518d = null;
            this.f125519e = null;
            this.f125520f = null;
            this.f125521g = null;
            this.f125522h = null;
            this.f125523i = null;
            this.f125524j = null;
            this.f125526l = null;
            this.f125527m = null;
            this.f125528n = null;
            this.f125529o = null;
            this.f125530p = null;
            this.f125531q = null;
            this.f125532r = null;
            this.f125533s = null;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ResultMeta$b */
    private static final class C50237b extends ProtoAdapter<ResultMeta> {
        C50237b() {
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
            if (resultMeta.muser_meta != null) {
                i = UserMeta.ADAPTER.encodedSizeWithTag(1, resultMeta.muser_meta);
            } else {
                i = 0;
            }
            if (resultMeta.mbot_meta != null) {
                i2 = BotMeta.ADAPTER.encodedSizeWithTag(2, resultMeta.mbot_meta);
            } else {
                i2 = 0;
            }
            int i21 = i + i2;
            if (resultMeta.mgroup_chat_meta != null) {
                i3 = GroupChatMeta.ADAPTER.encodedSizeWithTag(3, resultMeta.mgroup_chat_meta);
            } else {
                i3 = 0;
            }
            int i22 = i21 + i3;
            if (resultMeta.mcrypto_p2p_chat_meta != null) {
                i4 = CryptoP2PChatMeta.ADAPTER.encodedSizeWithTag(4, resultMeta.mcrypto_p2p_chat_meta);
            } else {
                i4 = 0;
            }
            int i23 = i22 + i4;
            if (resultMeta.mmessage_meta != null) {
                i5 = MessageMeta.ADAPTER.encodedSizeWithTag(5, resultMeta.mmessage_meta);
            } else {
                i5 = 0;
            }
            int i24 = i23 + i5;
            if (resultMeta.moncall_meta != null) {
                i6 = OncallMeta.ADAPTER.encodedSizeWithTag(6, resultMeta.moncall_meta);
            } else {
                i6 = 0;
            }
            int i25 = i24 + i6;
            if (resultMeta.mthread_meta != null) {
                i7 = ThreadMeta.ADAPTER.encodedSizeWithTag(7, resultMeta.mthread_meta);
            } else {
                i7 = 0;
            }
            int i26 = i25 + i7;
            if (resultMeta.murl_meta != null) {
                i8 = URLMeta.ADAPTER.encodedSizeWithTag(8, resultMeta.murl_meta);
            } else {
                i8 = 0;
            }
            int i27 = i26 + i8;
            if (resultMeta.mqa_meta != null) {
                i9 = QACardMeta.ADAPTER.encodedSizeWithTag(9, resultMeta.mqa_meta);
            } else {
                i9 = 0;
            }
            int i28 = i27 + i9;
            if (resultMeta.mdepartment_meta != null) {
                i10 = DepartmentMeta.ADAPTER.encodedSizeWithTag(10, resultMeta.mdepartment_meta);
            } else {
                i10 = 0;
            }
            int i29 = i28 + i10;
            if (resultMeta.mdoc_meta != null) {
                i11 = DocMeta.ADAPTER.encodedSizeWithTag(11, resultMeta.mdoc_meta);
            } else {
                i11 = 0;
            }
            int i30 = i29 + i11;
            if (resultMeta.mapp_meta != null) {
                i12 = AppMeta.ADAPTER.encodedSizeWithTag(12, resultMeta.mapp_meta);
            } else {
                i12 = 0;
            }
            int i31 = i30 + i12;
            if (resultMeta.mslash_command_meta != null) {
                i13 = SlashCommandMeta.ADAPTER.encodedSizeWithTag(13, resultMeta.mslash_command_meta);
            } else {
                i13 = 0;
            }
            int i32 = i31 + i13;
            if (resultMeta.mwiki_meta != null) {
                i14 = WikiMeta.ADAPTER.encodedSizeWithTag(14, resultMeta.mwiki_meta);
            } else {
                i14 = 0;
            }
            int i33 = i32 + i14;
            if (resultMeta.msection_meta != null) {
                i15 = SectionMeta.ADAPTER.encodedSizeWithTag(15, resultMeta.msection_meta);
            } else {
                i15 = 0;
            }
            int i34 = i33 + i15;
            if (resultMeta.mresource_meta != null) {
                i16 = ResourceMeta.ADAPTER.encodedSizeWithTag(16, resultMeta.mresource_meta);
            } else {
                i16 = 0;
            }
            int i35 = i34 + i16;
            if (resultMeta.mcustomization_meta != null) {
                i17 = CustomizationMeta.ADAPTER.encodedSizeWithTag(17, resultMeta.mcustomization_meta);
            } else {
                i17 = 0;
            }
            int i36 = i35 + i17;
            if (resultMeta.mfacility_meta != null) {
                i18 = FacilityMeta.ADAPTER.encodedSizeWithTag(18, resultMeta.mfacility_meta);
            } else {
                i18 = 0;
            }
            int i37 = i36 + i18;
            if (resultMeta.mmail_contact_meta != null) {
                i19 = MailContactMeta.ADAPTER.encodedSizeWithTag(20, resultMeta.mmail_contact_meta);
            } else {
                i19 = 0;
            }
            int i38 = i37 + i19;
            if (resultMeta.maggre_message_meta != null) {
                i20 = AggregatedMessageMeta.ADAPTER.encodedSizeWithTag(19, resultMeta.maggre_message_meta);
            }
            return i38 + i20 + resultMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ResultMeta decode(ProtoReader protoReader) throws IOException {
            C50236a aVar = new C50236a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.mo174337a(UserMeta.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.mo174321a(BotMeta.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.mo174327a(GroupChatMeta.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.mo174322a(CryptoP2PChatMeta.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.mo174329a(MessageMeta.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo174330a(OncallMeta.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.mo174335a(ThreadMeta.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.mo174336a(URLMeta.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.mo174331a(QACardMeta.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.mo174324a(DepartmentMeta.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            aVar.mo174325a(DocMeta.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.mo174320a(AppMeta.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.mo174334a(SlashCommandMeta.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            aVar.mo174338a(WikiMeta.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            aVar.mo174333a(SectionMeta.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            aVar.mo174332a(ResourceMeta.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            aVar.mo174323a(CustomizationMeta.ADAPTER.decode(protoReader));
                            break;
                        case 18:
                            aVar.mo174326a(FacilityMeta.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            aVar.mo174319a(AggregatedMessageMeta.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            aVar.mo174328a(MailContactMeta.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, ResultMeta resultMeta) throws IOException {
            if (resultMeta.muser_meta != null) {
                UserMeta.ADAPTER.encodeWithTag(protoWriter, 1, resultMeta.muser_meta);
            }
            if (resultMeta.mbot_meta != null) {
                BotMeta.ADAPTER.encodeWithTag(protoWriter, 2, resultMeta.mbot_meta);
            }
            if (resultMeta.mgroup_chat_meta != null) {
                GroupChatMeta.ADAPTER.encodeWithTag(protoWriter, 3, resultMeta.mgroup_chat_meta);
            }
            if (resultMeta.mcrypto_p2p_chat_meta != null) {
                CryptoP2PChatMeta.ADAPTER.encodeWithTag(protoWriter, 4, resultMeta.mcrypto_p2p_chat_meta);
            }
            if (resultMeta.mmessage_meta != null) {
                MessageMeta.ADAPTER.encodeWithTag(protoWriter, 5, resultMeta.mmessage_meta);
            }
            if (resultMeta.moncall_meta != null) {
                OncallMeta.ADAPTER.encodeWithTag(protoWriter, 6, resultMeta.moncall_meta);
            }
            if (resultMeta.mthread_meta != null) {
                ThreadMeta.ADAPTER.encodeWithTag(protoWriter, 7, resultMeta.mthread_meta);
            }
            if (resultMeta.murl_meta != null) {
                URLMeta.ADAPTER.encodeWithTag(protoWriter, 8, resultMeta.murl_meta);
            }
            if (resultMeta.mqa_meta != null) {
                QACardMeta.ADAPTER.encodeWithTag(protoWriter, 9, resultMeta.mqa_meta);
            }
            if (resultMeta.mdepartment_meta != null) {
                DepartmentMeta.ADAPTER.encodeWithTag(protoWriter, 10, resultMeta.mdepartment_meta);
            }
            if (resultMeta.mdoc_meta != null) {
                DocMeta.ADAPTER.encodeWithTag(protoWriter, 11, resultMeta.mdoc_meta);
            }
            if (resultMeta.mapp_meta != null) {
                AppMeta.ADAPTER.encodeWithTag(protoWriter, 12, resultMeta.mapp_meta);
            }
            if (resultMeta.mslash_command_meta != null) {
                SlashCommandMeta.ADAPTER.encodeWithTag(protoWriter, 13, resultMeta.mslash_command_meta);
            }
            if (resultMeta.mwiki_meta != null) {
                WikiMeta.ADAPTER.encodeWithTag(protoWriter, 14, resultMeta.mwiki_meta);
            }
            if (resultMeta.msection_meta != null) {
                SectionMeta.ADAPTER.encodeWithTag(protoWriter, 15, resultMeta.msection_meta);
            }
            if (resultMeta.mresource_meta != null) {
                ResourceMeta.ADAPTER.encodeWithTag(protoWriter, 16, resultMeta.mresource_meta);
            }
            if (resultMeta.mcustomization_meta != null) {
                CustomizationMeta.ADAPTER.encodeWithTag(protoWriter, 17, resultMeta.mcustomization_meta);
            }
            if (resultMeta.mfacility_meta != null) {
                FacilityMeta.ADAPTER.encodeWithTag(protoWriter, 18, resultMeta.mfacility_meta);
            }
            if (resultMeta.mmail_contact_meta != null) {
                MailContactMeta.ADAPTER.encodeWithTag(protoWriter, 20, resultMeta.mmail_contact_meta);
            }
            if (resultMeta.maggre_message_meta != null) {
                AggregatedMessageMeta.ADAPTER.encodeWithTag(protoWriter, 19, resultMeta.maggre_message_meta);
            }
            protoWriter.writeBytes(resultMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50236a newBuilder() {
        C50236a aVar = new C50236a();
        aVar.f125515a = this.muser_meta;
        aVar.f125516b = this.mbot_meta;
        aVar.f125517c = this.mgroup_chat_meta;
        aVar.f125518d = this.mcrypto_p2p_chat_meta;
        aVar.f125519e = this.mmessage_meta;
        aVar.f125520f = this.moncall_meta;
        aVar.f125521g = this.mthread_meta;
        aVar.f125522h = this.murl_meta;
        aVar.f125523i = this.mqa_meta;
        aVar.f125524j = this.mdepartment_meta;
        aVar.f125525k = this.mdoc_meta;
        aVar.f125526l = this.mapp_meta;
        aVar.f125527m = this.mslash_command_meta;
        aVar.f125528n = this.mwiki_meta;
        aVar.f125529o = this.msection_meta;
        aVar.f125530p = this.mresource_meta;
        aVar.f125531q = this.mcustomization_meta;
        aVar.f125532r = this.mfacility_meta;
        aVar.f125533s = this.mmail_contact_meta;
        aVar.f125534t = this.maggre_message_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.muser_meta != null) {
            sb.append(", user_meta=");
            sb.append(this.muser_meta);
        }
        if (this.mbot_meta != null) {
            sb.append(", bot_meta=");
            sb.append(this.mbot_meta);
        }
        if (this.mgroup_chat_meta != null) {
            sb.append(", group_chat_meta=");
            sb.append(this.mgroup_chat_meta);
        }
        if (this.mcrypto_p2p_chat_meta != null) {
            sb.append(", crypto_p2p_chat_meta=");
            sb.append(this.mcrypto_p2p_chat_meta);
        }
        if (this.mmessage_meta != null) {
            sb.append(", message_meta=");
            sb.append(this.mmessage_meta);
        }
        if (this.moncall_meta != null) {
            sb.append(", oncall_meta=");
            sb.append(this.moncall_meta);
        }
        if (this.mthread_meta != null) {
            sb.append(", thread_meta=");
            sb.append(this.mthread_meta);
        }
        if (this.murl_meta != null) {
            sb.append(", url_meta=");
            sb.append(this.murl_meta);
        }
        if (this.mqa_meta != null) {
            sb.append(", qa_meta=");
            sb.append(this.mqa_meta);
        }
        if (this.mdepartment_meta != null) {
            sb.append(", department_meta=");
            sb.append(this.mdepartment_meta);
        }
        if (this.mdoc_meta != null) {
            sb.append(", doc_meta=");
            sb.append(this.mdoc_meta);
        }
        if (this.mapp_meta != null) {
            sb.append(", app_meta=");
            sb.append(this.mapp_meta);
        }
        if (this.mslash_command_meta != null) {
            sb.append(", slash_command_meta=");
            sb.append(this.mslash_command_meta);
        }
        if (this.mwiki_meta != null) {
            sb.append(", wiki_meta=");
            sb.append(this.mwiki_meta);
        }
        if (this.msection_meta != null) {
            sb.append(", section_meta=");
            sb.append(this.msection_meta);
        }
        if (this.mresource_meta != null) {
            sb.append(", resource_meta=");
            sb.append(this.mresource_meta);
        }
        if (this.mcustomization_meta != null) {
            sb.append(", customization_meta=");
            sb.append(this.mcustomization_meta);
        }
        if (this.mfacility_meta != null) {
            sb.append(", facility_meta=");
            sb.append(this.mfacility_meta);
        }
        if (this.mmail_contact_meta != null) {
            sb.append(", mail_contact_meta=");
            sb.append(this.mmail_contact_meta);
        }
        if (this.maggre_message_meta != null) {
            sb.append(", aggre_message_meta=");
            sb.append(this.maggre_message_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "ResultMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ResultMeta(UserMeta userMeta, BotMeta botMeta, GroupChatMeta groupChatMeta, CryptoP2PChatMeta cryptoP2PChatMeta, MessageMeta messageMeta, OncallMeta oncallMeta, ThreadMeta threadMeta, URLMeta uRLMeta, QACardMeta qACardMeta, DepartmentMeta departmentMeta, DocMeta docMeta, AppMeta appMeta, SlashCommandMeta slashCommandMeta, WikiMeta wikiMeta, SectionMeta sectionMeta, ResourceMeta resourceMeta, CustomizationMeta customizationMeta, FacilityMeta facilityMeta, MailContactMeta mailContactMeta, AggregatedMessageMeta aggregatedMessageMeta) {
        this(userMeta, botMeta, groupChatMeta, cryptoP2PChatMeta, messageMeta, oncallMeta, threadMeta, uRLMeta, qACardMeta, departmentMeta, docMeta, appMeta, slashCommandMeta, wikiMeta, sectionMeta, resourceMeta, customizationMeta, facilityMeta, mailContactMeta, aggregatedMessageMeta, ByteString.EMPTY);
    }

    public ResultMeta(UserMeta userMeta, BotMeta botMeta, GroupChatMeta groupChatMeta, CryptoP2PChatMeta cryptoP2PChatMeta, MessageMeta messageMeta, OncallMeta oncallMeta, ThreadMeta threadMeta, URLMeta uRLMeta, QACardMeta qACardMeta, DepartmentMeta departmentMeta, DocMeta docMeta, AppMeta appMeta, SlashCommandMeta slashCommandMeta, WikiMeta wikiMeta, SectionMeta sectionMeta, ResourceMeta resourceMeta, CustomizationMeta customizationMeta, FacilityMeta facilityMeta, MailContactMeta mailContactMeta, AggregatedMessageMeta aggregatedMessageMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(userMeta, botMeta, groupChatMeta, cryptoP2PChatMeta, messageMeta, oncallMeta, threadMeta, uRLMeta, qACardMeta, departmentMeta, docMeta, appMeta, slashCommandMeta, wikiMeta, sectionMeta, resourceMeta, customizationMeta, facilityMeta, mailContactMeta) <= 1) {
            this.muser_meta = userMeta;
            this.mbot_meta = botMeta;
            this.mgroup_chat_meta = groupChatMeta;
            this.mcrypto_p2p_chat_meta = cryptoP2PChatMeta;
            this.mmessage_meta = messageMeta;
            this.moncall_meta = oncallMeta;
            this.mthread_meta = threadMeta;
            this.murl_meta = uRLMeta;
            this.mqa_meta = qACardMeta;
            this.mdepartment_meta = departmentMeta;
            this.mdoc_meta = docMeta;
            this.mapp_meta = appMeta;
            this.mslash_command_meta = slashCommandMeta;
            this.mwiki_meta = wikiMeta;
            this.msection_meta = sectionMeta;
            this.mresource_meta = resourceMeta;
            this.mcustomization_meta = customizationMeta;
            this.mfacility_meta = facilityMeta;
            this.mmail_contact_meta = mailContactMeta;
            this.maggre_message_meta = aggregatedMessageMeta;
            return;
        }
        throw new IllegalArgumentException("at most one of muser_meta, mbot_meta, mgroup_chat_meta, mcrypto_p2p_chat_meta, mmessage_meta, moncall_meta, mthread_meta, murl_meta, mqa_meta, mdepartment_meta, mdoc_meta, mapp_meta, mslash_command_meta, mwiki_meta, msection_meta, mresource_meta, mcustomization_meta, mfacility_meta, mmail_contact_meta may be non-null");
    }
}
