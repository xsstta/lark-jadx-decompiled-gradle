package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.VcDocs;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FollowInfo extends Message<FollowInfo, C50571a> {
    public static final ProtoAdapter<FollowInfo> ADAPTER = new C50572b();
    public static final VcDocs.DocType DEFAULT_DOC_TYPE = VcDocs.DocType.UNKNOWN_DOC_TYPE;
    public static final InitSource DEFAULT_INIT_SOURCE = InitSource.UNKNOWN_INIT_SOURCE;
    public static final LifeTime DEFAULT_LIFE_TIME = LifeTime.UNKNOWN;
    public static final ShareSubType DEFAULT_SHARE_SUBTYPE = ShareSubType.UNKNOWN_SHARE_SUBTYPE;
    public static final ShareType DEFAULT_SHARE_TYPE = ShareType.UNKNOWN_SHARE_TYPE;
    public static final Integer DEFAULT_SUPPORT_LEVEL = 0;
    public static final ParticipantType DEFAULT_USER_TYPE = ParticipantType.UNKNOW;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<Characteristic> characteristics;
    public final String device_id;
    public final String doc_title;
    public final String doc_token;
    public final VcDocs.DocType doc_type;
    public final InitSource init_source;
    public final LifeTime life_time;
    public final String login_token;
    public final Options options;
    public final String raw_url;
    public final String share_id;
    public final ShareSubType share_subtype;
    public final ShareType share_type;
    public final List<FollowStrategy> strategies;
    public final Integer support_level;
    public final ThumbnailDetail thumbnail;
    public final String url;
    public final String user_id;
    public final ParticipantType user_type;
    public final Integer version;

    public enum Characteristic implements WireEnum {
        SEND_HACKY_ACTION(1),
        SEND_DOC_ACTION(2);
        
        public static final ProtoAdapter<Characteristic> ADAPTER = ProtoAdapter.newEnumAdapter(Characteristic.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Characteristic fromValue(int i) {
            if (i == 1) {
                return SEND_HACKY_ACTION;
            }
            if (i != 2) {
                return null;
            }
            return SEND_DOC_ACTION;
        }

        private Characteristic(int i) {
            this.value = i;
        }
    }

    public enum InitSource implements WireEnum {
        UNKNOWN_INIT_SOURCE(0),
        INIT_DIRECTLY(1),
        INIT_FROM_LINK(2),
        INIT_REACTIVATED(3);
        
        public static final ProtoAdapter<InitSource> ADAPTER = ProtoAdapter.newEnumAdapter(InitSource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InitSource fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_INIT_SOURCE;
            }
            if (i == 1) {
                return INIT_DIRECTLY;
            }
            if (i == 2) {
                return INIT_FROM_LINK;
            }
            if (i != 3) {
                return null;
            }
            return INIT_REACTIVATED;
        }

        private InitSource(int i) {
            this.value = i;
        }
    }

    public enum LifeTime implements WireEnum {
        UNKNOWN(0),
        EPHEMERAL(1),
        PERMANENT(2);
        
        public static final ProtoAdapter<LifeTime> ADAPTER = ProtoAdapter.newEnumAdapter(LifeTime.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LifeTime fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return EPHEMERAL;
            }
            if (i != 2) {
                return null;
            }
            return PERMANENT;
        }

        private LifeTime(int i) {
            this.value = i;
        }
    }

    public enum ShareSubType implements WireEnum {
        UNKNOWN_SHARE_SUBTYPE(0),
        CCM_DOC(1),
        CCM_SHEET(2),
        CCM_MINDNOTE(3),
        CCM_WORD(4),
        CCM_EXCEL(5),
        CCM_PPT(6),
        CCM_PDF(7),
        CCM_BITABLE(8),
        CCM_DEMONSTRATION(9),
        CCM_WIKI_DOC(10),
        CCM_WIKI_SHEET(11),
        CCM_WIKI_MINDNOTE(12),
        CCM_DOCX(22),
        GOOGLE_DOC(51),
        GOOGLE_SHEET(52),
        GOOGLE_SLIDE(53),
        GOOGLE_WORD(54),
        GOOGLE_EXCEL(55),
        GOOGLE_PPT(56),
        GOOGLE_PDF(57);
        
        public static final ProtoAdapter<ShareSubType> ADAPTER = ProtoAdapter.newEnumAdapter(ShareSubType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareSubType fromValue(int i) {
            if (i == 22) {
                return CCM_DOCX;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_SHARE_SUBTYPE;
                case 1:
                    return CCM_DOC;
                case 2:
                    return CCM_SHEET;
                case 3:
                    return CCM_MINDNOTE;
                case 4:
                    return CCM_WORD;
                case 5:
                    return CCM_EXCEL;
                case 6:
                    return CCM_PPT;
                case 7:
                    return CCM_PDF;
                case 8:
                    return CCM_BITABLE;
                case 9:
                    return CCM_DEMONSTRATION;
                case 10:
                    return CCM_WIKI_DOC;
                case 11:
                    return CCM_WIKI_SHEET;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CCM_WIKI_MINDNOTE;
                default:
                    switch (i) {
                        case 51:
                            return GOOGLE_DOC;
                        case 52:
                            return GOOGLE_SHEET;
                        case 53:
                            return GOOGLE_SLIDE;
                        case 54:
                            return GOOGLE_WORD;
                        case 55:
                            return GOOGLE_EXCEL;
                        case 56:
                            return GOOGLE_PPT;
                        case 57:
                            return GOOGLE_PDF;
                        default:
                            return null;
                    }
            }
        }

        private ShareSubType(int i) {
            this.value = i;
        }
    }

    public enum ShareType implements WireEnum {
        UNKNOWN_SHARE_TYPE(0),
        CCM(1),
        GOOGLE(2),
        UNIVERSAL(3);
        
        public static final ProtoAdapter<ShareType> ADAPTER = ProtoAdapter.newEnumAdapter(ShareType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SHARE_TYPE;
            }
            if (i == 1) {
                return CCM;
            }
            if (i == 2) {
                return GOOGLE;
            }
            if (i != 3) {
                return null;
            }
            return UNIVERSAL;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    public static final class Options extends Message<Options, C50569a> {
        public static final ProtoAdapter<Options> ADAPTER = new C50570b();
        public static final Boolean DEFAULT_DEFAULT_FOLLOW = false;
        public static final Boolean DEFAULT_FORCE_FOLLOW = false;
        private static final long serialVersionUID = 0;
        public final Boolean default_follow;
        public final Boolean force_follow;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowInfo$Options$b */
        private static final class C50570b extends ProtoAdapter<Options> {
            C50570b() {
                super(FieldEncoding.LENGTH_DELIMITED, Options.class);
            }

            /* renamed from: a */
            public int encodedSize(Options options) {
                int i;
                int i2 = 0;
                if (options.default_follow != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, options.default_follow);
                } else {
                    i = 0;
                }
                if (options.force_follow != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, options.force_follow);
                }
                return i + i2 + options.unknownFields().size();
            }

            /* renamed from: a */
            public Options decode(ProtoReader protoReader) throws IOException {
                C50569a aVar = new C50569a();
                aVar.f126227a = false;
                aVar.f126228b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126227a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126228b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Options options) throws IOException {
                if (options.default_follow != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, options.default_follow);
                }
                if (options.force_follow != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, options.force_follow);
                }
                protoWriter.writeBytes(options.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowInfo$Options$a */
        public static final class C50569a extends Message.Builder<Options, C50569a> {

            /* renamed from: a */
            public Boolean f126227a;

            /* renamed from: b */
            public Boolean f126228b;

            /* renamed from: a */
            public Options build() {
                return new Options(this.f126227a, this.f126228b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C50569a mo175090a(Boolean bool) {
                this.f126227a = bool;
                return this;
            }

            /* renamed from: b */
            public C50569a mo175092b(Boolean bool) {
                this.f126228b = bool;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C50569a newBuilder() {
            C50569a aVar = new C50569a();
            aVar.f126227a = this.default_follow;
            aVar.f126228b = this.force_follow;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Options");
            StringBuilder sb = new StringBuilder();
            if (this.default_follow != null) {
                sb.append(", default_follow=");
                sb.append(this.default_follow);
            }
            if (this.force_follow != null) {
                sb.append(", force_follow=");
                sb.append(this.force_follow);
            }
            StringBuilder replace = sb.replace(0, 2, "Options{");
            replace.append('}');
            return replace.toString();
        }

        public Options(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public Options(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.default_follow = bool;
            this.force_follow = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowInfo$b */
    private static final class C50572b extends ProtoAdapter<FollowInfo> {
        C50572b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowInfo followInfo) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, followInfo.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, followInfo.url) + ProtoAdapter.INT32.encodedSizeWithTag(3, followInfo.support_level);
            int i15 = 0;
            if (followInfo.options != null) {
                i = Options.ADAPTER.encodedSizeWithTag(4, followInfo.options);
            } else {
                i = 0;
            }
            int i16 = encodedSizeWithTag + i;
            if (followInfo.device_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, followInfo.device_id);
            } else {
                i2 = 0;
            }
            int i17 = i16 + i2;
            if (followInfo.life_time != null) {
                i3 = LifeTime.ADAPTER.encodedSizeWithTag(6, followInfo.life_time);
            } else {
                i3 = 0;
            }
            int i18 = i17 + i3;
            if (followInfo.login_token != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, followInfo.login_token);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i18 + i4 + Characteristic.ADAPTER.asRepeated().encodedSizeWithTag(9, followInfo.characteristics);
            if (followInfo.share_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(10, followInfo.share_id);
            } else {
                i5 = 0;
            }
            int i19 = encodedSizeWithTag2 + i5;
            if (followInfo.thumbnail != null) {
                i6 = ThumbnailDetail.ADAPTER.encodedSizeWithTag(11, followInfo.thumbnail);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (followInfo.doc_token != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(12, followInfo.doc_token);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (followInfo.doc_type != null) {
                i8 = VcDocs.DocType.ADAPTER.encodedSizeWithTag(13, followInfo.doc_type);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (followInfo.doc_title != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(14, followInfo.doc_title);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag3 = i22 + i9 + FollowStrategy.ADAPTER.asRepeated().encodedSizeWithTag(15, followInfo.strategies);
            if (followInfo.version != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(16, followInfo.version);
            } else {
                i10 = 0;
            }
            int i23 = encodedSizeWithTag3 + i10;
            if (followInfo.share_type != null) {
                i11 = ShareType.ADAPTER.encodedSizeWithTag(17, followInfo.share_type);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (followInfo.share_subtype != null) {
                i12 = ShareSubType.ADAPTER.encodedSizeWithTag(18, followInfo.share_subtype);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (followInfo.init_source != null) {
                i13 = InitSource.ADAPTER.encodedSizeWithTag(19, followInfo.init_source);
            } else {
                i13 = 0;
            }
            int i26 = i25 + i13;
            if (followInfo.user_type != null) {
                i14 = ParticipantType.ADAPTER.encodedSizeWithTag(20, followInfo.user_type);
            } else {
                i14 = 0;
            }
            int i27 = i26 + i14;
            if (followInfo.raw_url != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(21, followInfo.raw_url);
            }
            return i27 + i15 + followInfo.unknownFields().size();
        }

        /* renamed from: a */
        public FollowInfo decode(ProtoReader protoReader) throws IOException {
            C50571a aVar = new C50571a();
            aVar.f126229a = "";
            aVar.f126230b = "";
            aVar.f126231c = 0;
            aVar.f126233e = "";
            aVar.f126234f = LifeTime.UNKNOWN;
            aVar.f126235g = "";
            aVar.f126237i = "";
            aVar.f126239k = "";
            aVar.f126240l = VcDocs.DocType.UNKNOWN_DOC_TYPE;
            aVar.f126241m = "";
            aVar.f126243o = 0;
            aVar.f126244p = ShareType.UNKNOWN_SHARE_TYPE;
            aVar.f126245q = ShareSubType.UNKNOWN_SHARE_SUBTYPE;
            aVar.f126246r = InitSource.UNKNOWN_INIT_SOURCE;
            aVar.f126247s = ParticipantType.UNKNOW;
            aVar.f126248t = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126229a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126230b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126231c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126232d = Options.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126233e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f126234f = LifeTime.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f126235g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 9:
                            try {
                                aVar.f126236h.add(Characteristic.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 10:
                            aVar.f126237i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126238j = ThumbnailDetail.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126239k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f126240l = VcDocs.DocType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 14:
                            aVar.f126241m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f126242n.add(FollowStrategy.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            aVar.f126243o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            try {
                                aVar.f126244p = ShareType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 18:
                            try {
                                aVar.f126245q = ShareSubType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 19:
                            try {
                                aVar.f126246r = InitSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 20:
                            try {
                                aVar.f126247s = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case 21:
                            aVar.f126248t = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowInfo followInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followInfo.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followInfo.url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, followInfo.support_level);
            if (followInfo.options != null) {
                Options.ADAPTER.encodeWithTag(protoWriter, 4, followInfo.options);
            }
            if (followInfo.device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, followInfo.device_id);
            }
            if (followInfo.life_time != null) {
                LifeTime.ADAPTER.encodeWithTag(protoWriter, 6, followInfo.life_time);
            }
            if (followInfo.login_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, followInfo.login_token);
            }
            Characteristic.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, followInfo.characteristics);
            if (followInfo.share_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, followInfo.share_id);
            }
            if (followInfo.thumbnail != null) {
                ThumbnailDetail.ADAPTER.encodeWithTag(protoWriter, 11, followInfo.thumbnail);
            }
            if (followInfo.doc_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, followInfo.doc_token);
            }
            if (followInfo.doc_type != null) {
                VcDocs.DocType.ADAPTER.encodeWithTag(protoWriter, 13, followInfo.doc_type);
            }
            if (followInfo.doc_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, followInfo.doc_title);
            }
            FollowStrategy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, followInfo.strategies);
            if (followInfo.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, followInfo.version);
            }
            if (followInfo.share_type != null) {
                ShareType.ADAPTER.encodeWithTag(protoWriter, 17, followInfo.share_type);
            }
            if (followInfo.share_subtype != null) {
                ShareSubType.ADAPTER.encodeWithTag(protoWriter, 18, followInfo.share_subtype);
            }
            if (followInfo.init_source != null) {
                InitSource.ADAPTER.encodeWithTag(protoWriter, 19, followInfo.init_source);
            }
            if (followInfo.user_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 20, followInfo.user_type);
            }
            if (followInfo.raw_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, followInfo.raw_url);
            }
            protoWriter.writeBytes(followInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowInfo$a */
    public static final class C50571a extends Message.Builder<FollowInfo, C50571a> {

        /* renamed from: a */
        public String f126229a;

        /* renamed from: b */
        public String f126230b;

        /* renamed from: c */
        public Integer f126231c;

        /* renamed from: d */
        public Options f126232d;

        /* renamed from: e */
        public String f126233e;

        /* renamed from: f */
        public LifeTime f126234f;

        /* renamed from: g */
        public String f126235g;

        /* renamed from: h */
        public List<Characteristic> f126236h = Internal.newMutableList();

        /* renamed from: i */
        public String f126237i;

        /* renamed from: j */
        public ThumbnailDetail f126238j;

        /* renamed from: k */
        public String f126239k;

        /* renamed from: l */
        public VcDocs.DocType f126240l;

        /* renamed from: m */
        public String f126241m;

        /* renamed from: n */
        public List<FollowStrategy> f126242n = Internal.newMutableList();

        /* renamed from: o */
        public Integer f126243o;

        /* renamed from: p */
        public ShareType f126244p;

        /* renamed from: q */
        public ShareSubType f126245q;

        /* renamed from: r */
        public InitSource f126246r;

        /* renamed from: s */
        public ParticipantType f126247s;

        /* renamed from: t */
        public String f126248t;

        /* renamed from: a */
        public FollowInfo build() {
            String str;
            Integer num;
            String str2 = this.f126229a;
            if (str2 != null && (str = this.f126230b) != null && (num = this.f126231c) != null) {
                return new FollowInfo(str2, str, num, this.f126232d, this.f126233e, this.f126234f, this.f126235g, this.f126236h, this.f126237i, this.f126238j, this.f126239k, this.f126240l, this.f126241m, this.f126242n, this.f126243o, this.f126244p, this.f126245q, this.f126246r, this.f126247s, this.f126248t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "user_id", this.f126230b, "url", this.f126231c, "support_level");
        }
    }

    @Override // com.squareup.wire.Message
    public C50571a newBuilder() {
        C50571a aVar = new C50571a();
        aVar.f126229a = this.user_id;
        aVar.f126230b = this.url;
        aVar.f126231c = this.support_level;
        aVar.f126232d = this.options;
        aVar.f126233e = this.device_id;
        aVar.f126234f = this.life_time;
        aVar.f126235g = this.login_token;
        aVar.f126236h = Internal.copyOf("characteristics", this.characteristics);
        aVar.f126237i = this.share_id;
        aVar.f126238j = this.thumbnail;
        aVar.f126239k = this.doc_token;
        aVar.f126240l = this.doc_type;
        aVar.f126241m = this.doc_title;
        aVar.f126242n = Internal.copyOf("strategies", this.strategies);
        aVar.f126243o = this.version;
        aVar.f126244p = this.share_type;
        aVar.f126245q = this.share_subtype;
        aVar.f126246r = this.init_source;
        aVar.f126247s = this.user_type;
        aVar.f126248t = this.raw_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", support_level=");
        sb.append(this.support_level);
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.life_time != null) {
            sb.append(", life_time=");
            sb.append(this.life_time);
        }
        if (this.login_token != null) {
            sb.append(", login_token=");
            sb.append(this.login_token);
        }
        if (!this.characteristics.isEmpty()) {
            sb.append(", characteristics=");
            sb.append(this.characteristics);
        }
        if (this.share_id != null) {
            sb.append(", share_id=");
            sb.append(this.share_id);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.doc_token != null) {
            sb.append(", doc_token=");
            sb.append(this.doc_token);
        }
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        if (this.doc_title != null) {
            sb.append(", doc_title=");
            sb.append(this.doc_title);
        }
        if (!this.strategies.isEmpty()) {
            sb.append(", strategies=");
            sb.append(this.strategies);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.share_type != null) {
            sb.append(", share_type=");
            sb.append(this.share_type);
        }
        if (this.share_subtype != null) {
            sb.append(", share_subtype=");
            sb.append(this.share_subtype);
        }
        if (this.init_source != null) {
            sb.append(", init_source=");
            sb.append(this.init_source);
        }
        if (this.user_type != null) {
            sb.append(", user_type=");
            sb.append(this.user_type);
        }
        if (this.raw_url != null) {
            sb.append(", raw_url=");
            sb.append(this.raw_url);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowInfo{");
        replace.append('}');
        return replace.toString();
    }

    public FollowInfo(String str, String str2, Integer num, Options options2, String str3, LifeTime lifeTime, String str4, List<Characteristic> list, String str5, ThumbnailDetail thumbnailDetail, String str6, VcDocs.DocType docType, String str7, List<FollowStrategy> list2, Integer num2, ShareType shareType, ShareSubType shareSubType, InitSource initSource, ParticipantType participantType, String str8) {
        this(str, str2, num, options2, str3, lifeTime, str4, list, str5, thumbnailDetail, str6, docType, str7, list2, num2, shareType, shareSubType, initSource, participantType, str8, ByteString.EMPTY);
    }

    public FollowInfo(String str, String str2, Integer num, Options options2, String str3, LifeTime lifeTime, String str4, List<Characteristic> list, String str5, ThumbnailDetail thumbnailDetail, String str6, VcDocs.DocType docType, String str7, List<FollowStrategy> list2, Integer num2, ShareType shareType, ShareSubType shareSubType, InitSource initSource, ParticipantType participantType, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.url = str2;
        this.support_level = num;
        this.options = options2;
        this.device_id = str3;
        this.life_time = lifeTime;
        this.login_token = str4;
        this.characteristics = Internal.immutableCopyOf("characteristics", list);
        this.share_id = str5;
        this.thumbnail = thumbnailDetail;
        this.doc_token = str6;
        this.doc_type = docType;
        this.doc_title = str7;
        this.strategies = Internal.immutableCopyOf("strategies", list2);
        this.version = num2;
        this.share_type = shareType;
        this.share_subtype = shareSubType;
        this.init_source = initSource;
        this.user_type = participantType;
        this.raw_url = str8;
    }
}
