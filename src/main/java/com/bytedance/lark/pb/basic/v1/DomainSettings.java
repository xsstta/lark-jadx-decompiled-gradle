package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.CameraPosition;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DomainSettings extends Message<DomainSettings, C14892a> {
    public static final ProtoAdapter<DomainSettings> ADAPTER = new C14893b();
    private static final long serialVersionUID = 0;
    public final List<Pair> pairs;

    public enum Alias implements WireEnum {
        UNKNOWN(0),
        API(1),
        FILE(2),
        OAPI(3),
        DRIVE(4),
        DOCS(5),
        MINA(6),
        OPEN(7),
        DOCS_API(8),
        PASSPORT(9),
        INTERNAL_API(10),
        GROUP_QR_CODE(11),
        HELPDESK(12),
        CONTACT(13),
        PRIVACY(14),
        HELP_DOCUMENT(15),
        DOCS_LONG(16),
        CJ_HONGBAO(17),
        DEVICE(18),
        CDN(19),
        SENTRY(20),
        TTPUSH(21),
        LOG(22),
        DOCS_DRIVE(23),
        LONG(24),
        PEOPLE(25),
        VOD(26),
        SHORT_RTC(27),
        LONG_RTC(29),
        MP_APPLINK(30),
        MP_REFER(31),
        MP_CONFIG(32),
        MP_TT(33),
        OPEN_APP_FEED(34),
        OPEN_MSG_CARD(35),
        OPEN_APPCENTER1(36),
        OPEN_APPCENTER2(37),
        OPEN_MOMENT(38),
        OPEN_API_LOGIN(39),
        SUITE_IMAGE_CDN(40),
        TT_CDN(41),
        SUITE_REPORT(42),
        OPEN_APPCENTER_CARDJUMP(43),
        DOCS_HOME(44),
        SUITE_ANDROID_HOTFIX(45),
        TT_MUSICAL(46),
        DOCS_ACCOUNT_DELETE_NOTICE(47),
        SUITE_MAIN_DOMAIN(48),
        PASSPORT_CAPTCHA(49),
        OPEN_APPCENTER3(50),
        OPEN_JSSDK_CONFIG(51),
        SUITE_SAFETYNET(52),
        OPEN_APP_INTERFACE(53),
        SUITE_SECURITY_LINK(54),
        DOCS_MAIN_DOMAIN(55),
        DOCS_FE_RESOURCE_HOTFIX(56),
        SUITE_SECSDK(57),
        HELP_CENTER(58),
        TT_ET(59),
        SUITE_TKLOG(60),
        EMAIL(61),
        DOCS_PEER(62),
        APPLINK_PEER(63),
        DOCS_FEED(64),
        TT_GRAYLOG(65),
        SUITE_PAN_CDN(66),
        UG_ACTIVITY(67),
        TT_APPLOG(68),
        TT_NPTH(69),
        TT_SLARDAR_SETTING(70),
        TT_SLARDAR_REPORT(71),
        TT_SLARDAR_EXCEPTION(72),
        TT_ABTEST(73),
        VC_PRIVACY(74),
        SUITE_APPCONFIG(75),
        TT_SLARDAR_CRASH_HOST_IOS(76),
        TT_SLARDAR_EXCEPTION_HOST_IOS(77),
        OPEN_APPSTORE(78),
        TT_SLARDAR(79),
        OPEN_APPLINK_SCHEMA_ENABLE_HOST(80),
        VC_MM(81),
        DOCS_FRONTIER(82),
        PANO(83),
        SUITE_ADMIN(84),
        RTC_FRONTIER(85),
        RTC_DECISION(86),
        RTC_DEFAULTIPS(87),
        NTP(88),
        MOCK_GATEWAY(89),
        BASIC_MODE(90),
        EMAIL_BFF(91),
        EMAIL_SMTP(92),
        EMAIL_IMAP(93);
        
        public static final ProtoAdapter<Alias> ADAPTER = ProtoAdapter.newEnumAdapter(Alias.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Alias fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return API;
                case 2:
                    return FILE;
                case 3:
                    return OAPI;
                case 4:
                    return DRIVE;
                case 5:
                    return DOCS;
                case 6:
                    return MINA;
                case 7:
                    return OPEN;
                case 8:
                    return DOCS_API;
                case 9:
                    return PASSPORT;
                case 10:
                    return INTERNAL_API;
                case 11:
                    return GROUP_QR_CODE;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return HELPDESK;
                case 13:
                    return CONTACT;
                case 14:
                    return PRIVACY;
                case 15:
                    return HELP_DOCUMENT;
                case 16:
                    return DOCS_LONG;
                case 17:
                    return CJ_HONGBAO;
                case 18:
                    return DEVICE;
                case 19:
                    return CDN;
                case 20:
                    return SENTRY;
                case 21:
                    return TTPUSH;
                case 22:
                    return LOG;
                case 23:
                    return DOCS_DRIVE;
                case 24:
                    return LONG;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    return PEOPLE;
                case 26:
                    return VOD;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                    return SHORT_RTC;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                default:
                    return null;
                case 29:
                    return LONG_RTC;
                case 30:
                    return MP_APPLINK;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    return MP_REFER;
                case 32:
                    return MP_CONFIG;
                case 33:
                    return MP_TT;
                case 34:
                    return OPEN_APP_FEED;
                case 35:
                    return OPEN_MSG_CARD;
                case 36:
                    return OPEN_APPCENTER1;
                case 37:
                    return OPEN_APPCENTER2;
                case 38:
                    return OPEN_MOMENT;
                case 39:
                    return OPEN_API_LOGIN;
                case 40:
                    return SUITE_IMAGE_CDN;
                case 41:
                    return TT_CDN;
                case 42:
                    return SUITE_REPORT;
                case 43:
                    return OPEN_APPCENTER_CARDJUMP;
                case 44:
                    return DOCS_HOME;
                case 45:
                    return SUITE_ANDROID_HOTFIX;
                case 46:
                    return TT_MUSICAL;
                case 47:
                    return DOCS_ACCOUNT_DELETE_NOTICE;
                case 48:
                    return SUITE_MAIN_DOMAIN;
                case 49:
                    return PASSPORT_CAPTCHA;
                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                    return OPEN_APPCENTER3;
                case 51:
                    return OPEN_JSSDK_CONFIG;
                case 52:
                    return SUITE_SAFETYNET;
                case 53:
                    return OPEN_APP_INTERFACE;
                case 54:
                    return SUITE_SECURITY_LINK;
                case 55:
                    return DOCS_MAIN_DOMAIN;
                case 56:
                    return DOCS_FE_RESOURCE_HOTFIX;
                case 57:
                    return SUITE_SECSDK;
                case 58:
                    return HELP_CENTER;
                case 59:
                    return TT_ET;
                case 60:
                    return SUITE_TKLOG;
                case 61:
                    return EMAIL;
                case 62:
                    return DOCS_PEER;
                case 63:
                    return APPLINK_PEER;
                case 64:
                    return DOCS_FEED;
                case 65:
                    return TT_GRAYLOG;
                case 66:
                    return SUITE_PAN_CDN;
                case 67:
                    return UG_ACTIVITY;
                case 68:
                    return TT_APPLOG;
                case 69:
                    return TT_NPTH;
                case 70:
                    return TT_SLARDAR_SETTING;
                case 71:
                    return TT_SLARDAR_REPORT;
                case 72:
                    return TT_SLARDAR_EXCEPTION;
                case 73:
                    return TT_ABTEST;
                case 74:
                    return VC_PRIVACY;
                case 75:
                    return SUITE_APPCONFIG;
                case 76:
                    return TT_SLARDAR_CRASH_HOST_IOS;
                case 77:
                    return TT_SLARDAR_EXCEPTION_HOST_IOS;
                case 78:
                    return OPEN_APPSTORE;
                case 79:
                    return TT_SLARDAR;
                case CalendarSearchResultRv.f82651b /*{ENCODED_INT: 80}*/:
                    return OPEN_APPLINK_SCHEMA_ENABLE_HOST;
                case 81:
                    return VC_MM;
                case 82:
                    return DOCS_FRONTIER;
                case 83:
                    return PANO;
                case 84:
                    return SUITE_ADMIN;
                case 85:
                    return RTC_FRONTIER;
                case 86:
                    return RTC_DECISION;
                case 87:
                    return RTC_DEFAULTIPS;
                case 88:
                    return NTP;
                case 89:
                    return MOCK_GATEWAY;
                case CameraPosition.TILT_90 /*{ENCODED_INT: 90}*/:
                    return BASIC_MODE;
                case 91:
                    return EMAIL_BFF;
                case 92:
                    return EMAIL_SMTP;
                case 93:
                    return EMAIL_IMAP;
            }
        }

        private Alias(int i) {
            this.value = i;
        }
    }

    public static final class Pair extends Message<Pair, C14890a> {
        public static final ProtoAdapter<Pair> ADAPTER = new C14891b();
        public static final Alias DEFAULT_ALIAS = Alias.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Alias alias;
        public final String alias_str;
        public final String domain;
        public final List<String> domains;

        /* renamed from: com.bytedance.lark.pb.basic.v1.DomainSettings$Pair$b */
        private static final class C14891b extends ProtoAdapter<Pair> {
            C14891b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pair.class);
            }

            /* renamed from: a */
            public int encodedSize(Pair pair) {
                int i;
                int encodedSizeWithTag = Alias.ADAPTER.encodedSizeWithTag(1, pair.alias) + ProtoAdapter.STRING.encodedSizeWithTag(2, pair.domain) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, pair.domains);
                if (pair.alias_str != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(4, pair.alias_str);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + pair.unknownFields().size();
            }

            /* renamed from: a */
            public Pair decode(ProtoReader protoReader) throws IOException {
                C14890a aVar = new C14890a();
                aVar.f39405a = Alias.UNKNOWN;
                aVar.f39406b = "";
                aVar.f39408d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39405a = Alias.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f39406b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39407c.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39408d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pair pair) throws IOException {
                Alias.ADAPTER.encodeWithTag(protoWriter, 1, pair.alias);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pair.domain);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, pair.domains);
                if (pair.alias_str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pair.alias_str);
                }
                protoWriter.writeBytes(pair.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.DomainSettings$Pair$a */
        public static final class C14890a extends Message.Builder<Pair, C14890a> {

            /* renamed from: a */
            public Alias f39405a;

            /* renamed from: b */
            public String f39406b;

            /* renamed from: c */
            public List<String> f39407c = Internal.newMutableList();

            /* renamed from: d */
            public String f39408d;

            /* renamed from: a */
            public Pair build() {
                String str;
                Alias alias = this.f39405a;
                if (alias != null && (str = this.f39406b) != null) {
                    return new Pair(alias, str, this.f39407c, this.f39408d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(alias, "alias", this.f39406b, "domain");
            }

            /* renamed from: a */
            public C14890a mo54570a(Alias alias) {
                this.f39405a = alias;
                return this;
            }

            /* renamed from: b */
            public C14890a mo54574b(String str) {
                this.f39408d = str;
                return this;
            }

            /* renamed from: a */
            public C14890a mo54571a(String str) {
                this.f39406b = str;
                return this;
            }

            /* renamed from: a */
            public C14890a mo54572a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f39407c = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14890a newBuilder() {
            C14890a aVar = new C14890a();
            aVar.f39405a = this.alias;
            aVar.f39406b = this.domain;
            aVar.f39407c = Internal.copyOf("domains", this.domains);
            aVar.f39408d = this.alias_str;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Pair");
            StringBuilder sb = new StringBuilder();
            sb.append(", alias=");
            sb.append(this.alias);
            sb.append(", domain=");
            sb.append(this.domain);
            if (!this.domains.isEmpty()) {
                sb.append(", domains=");
                sb.append(this.domains);
            }
            if (this.alias_str != null) {
                sb.append(", alias_str=");
                sb.append(this.alias_str);
            }
            StringBuilder replace = sb.replace(0, 2, "Pair{");
            replace.append('}');
            return replace.toString();
        }

        public Pair(Alias alias2, String str, List<String> list, String str2) {
            this(alias2, str, list, str2, ByteString.EMPTY);
        }

        public Pair(Alias alias2, String str, List<String> list, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.alias = alias2;
            this.domain = str;
            this.domains = Internal.immutableCopyOf("domains", list);
            this.alias_str = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DomainSettings$b */
    private static final class C14893b extends ProtoAdapter<DomainSettings> {
        C14893b() {
            super(FieldEncoding.LENGTH_DELIMITED, DomainSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(DomainSettings domainSettings) {
            return Pair.ADAPTER.asRepeated().encodedSizeWithTag(1, domainSettings.pairs) + domainSettings.unknownFields().size();
        }

        /* renamed from: a */
        public DomainSettings decode(ProtoReader protoReader) throws IOException {
            C14892a aVar = new C14892a();
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
                    aVar.f39409a.add(Pair.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DomainSettings domainSettings) throws IOException {
            Pair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, domainSettings.pairs);
            protoWriter.writeBytes(domainSettings.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DomainSettings$a */
    public static final class C14892a extends Message.Builder<DomainSettings, C14892a> {

        /* renamed from: a */
        public List<Pair> f39409a = Internal.newMutableList();

        /* renamed from: a */
        public DomainSettings build() {
            return new DomainSettings(this.f39409a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14892a mo54578a(List<Pair> list) {
            Internal.checkElementsNotNull(list);
            this.f39409a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14892a newBuilder() {
        C14892a aVar = new C14892a();
        aVar.f39409a = Internal.copyOf("pairs", this.pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DomainSettings");
        StringBuilder sb = new StringBuilder();
        if (!this.pairs.isEmpty()) {
            sb.append(", pairs=");
            sb.append(this.pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "DomainSettings{");
        replace.append('}');
        return replace.toString();
    }

    public DomainSettings(List<Pair> list) {
        this(list, ByteString.EMPTY);
    }

    public DomainSettings(List<Pair> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pairs = Internal.immutableCopyOf("pairs", list);
    }
}
