package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.OpenApp;
import com.bytedance.lark.pb.basic.v1.Tag;
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

public final class SearchOpenAppMeta extends Message<SearchOpenAppMeta, C18907a> {
    public static final ProtoAdapter<SearchOpenAppMeta> ADAPTER = new C18908b();
    public static final Boolean DEFAULT_IS_AVAILABLE = false;
    public static final Boolean DEFAULT_IS_ISV = false;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NOTIFICATION_TYPE = 0;
    public static final OpenApp.State DEFAULT_STATE = OpenApp.State.USABLE;
    private static final long serialVersionUID = 0;
    public final List<OpenAppAbility> abilities;
    public final String app_id;
    public final String app_store_url;
    public final String avatar_key;
    public final List<ExtraHitField> extra_hit_fields;
    public final String id;
    public final Boolean is_available;
    public final Boolean is_isv;
    public final String localized_desc;
    public final String localized_name;
    public final Integer new_message_count;
    public final Integer notification_type;
    public final OpenApp.State state;
    public final List<Tag> tags;

    public static final class BotAbility extends Message<BotAbility, C18899a> {
        public static final ProtoAdapter<BotAbility> ADAPTER = new C18900b();
        private static final long serialVersionUID = 0;
        public final String bot_id;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$BotAbility$b */
        private static final class C18900b extends ProtoAdapter<BotAbility> {
            C18900b() {
                super(FieldEncoding.LENGTH_DELIMITED, BotAbility.class);
            }

            /* renamed from: a */
            public int encodedSize(BotAbility botAbility) {
                int i;
                if (botAbility.bot_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, botAbility.bot_id);
                } else {
                    i = 0;
                }
                return i + botAbility.unknownFields().size();
            }

            /* renamed from: a */
            public BotAbility decode(ProtoReader protoReader) throws IOException {
                C18899a aVar = new C18899a();
                aVar.f46732a = "";
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
                        aVar.f46732a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BotAbility botAbility) throws IOException {
                if (botAbility.bot_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, botAbility.bot_id);
                }
                protoWriter.writeBytes(botAbility.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$BotAbility$a */
        public static final class C18899a extends Message.Builder<BotAbility, C18899a> {

            /* renamed from: a */
            public String f46732a;

            /* renamed from: a */
            public BotAbility build() {
                return new BotAbility(this.f46732a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18899a newBuilder() {
            C18899a aVar = new C18899a();
            aVar.f46732a = this.bot_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "BotAbility");
            StringBuilder sb = new StringBuilder();
            if (this.bot_id != null) {
                sb.append(", bot_id=");
                sb.append(this.bot_id);
            }
            StringBuilder replace = sb.replace(0, 2, "BotAbility{");
            replace.append('}');
            return replace.toString();
        }

        public BotAbility(String str) {
            this(str, ByteString.EMPTY);
        }

        public BotAbility(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.bot_id = str;
        }
    }

    public static final class H5Ability extends Message<H5Ability, C18901a> {
        public static final ProtoAdapter<H5Ability> ADAPTER = new C18902b();
        private static final long serialVersionUID = 0;
        public final String url;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$H5Ability$b */
        private static final class C18902b extends ProtoAdapter<H5Ability> {
            C18902b() {
                super(FieldEncoding.LENGTH_DELIMITED, H5Ability.class);
            }

            /* renamed from: a */
            public int encodedSize(H5Ability h5Ability) {
                int i;
                if (h5Ability.url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, h5Ability.url);
                } else {
                    i = 0;
                }
                return i + h5Ability.unknownFields().size();
            }

            /* renamed from: a */
            public H5Ability decode(ProtoReader protoReader) throws IOException {
                C18901a aVar = new C18901a();
                aVar.f46733a = "";
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
                        aVar.f46733a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, H5Ability h5Ability) throws IOException {
                if (h5Ability.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, h5Ability.url);
                }
                protoWriter.writeBytes(h5Ability.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$H5Ability$a */
        public static final class C18901a extends Message.Builder<H5Ability, C18901a> {

            /* renamed from: a */
            public String f46733a;

            /* renamed from: a */
            public H5Ability build() {
                return new H5Ability(this.f46733a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18901a newBuilder() {
            C18901a aVar = new C18901a();
            aVar.f46733a = this.url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "H5Ability");
            StringBuilder sb = new StringBuilder();
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            StringBuilder replace = sb.replace(0, 2, "H5Ability{");
            replace.append('}');
            return replace.toString();
        }

        public H5Ability(String str) {
            this(str, ByteString.EMPTY);
        }

        public H5Ability(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
        }
    }

    public static final class MicroAppAbility extends Message<MicroAppAbility, C18903a> {
        public static final ProtoAdapter<MicroAppAbility> ADAPTER = new C18904b();
        private static final long serialVersionUID = 0;
        public final String url;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$MicroAppAbility$b */
        private static final class C18904b extends ProtoAdapter<MicroAppAbility> {
            C18904b() {
                super(FieldEncoding.LENGTH_DELIMITED, MicroAppAbility.class);
            }

            /* renamed from: a */
            public int encodedSize(MicroAppAbility microAppAbility) {
                int i;
                if (microAppAbility.url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, microAppAbility.url);
                } else {
                    i = 0;
                }
                return i + microAppAbility.unknownFields().size();
            }

            /* renamed from: a */
            public MicroAppAbility decode(ProtoReader protoReader) throws IOException {
                C18903a aVar = new C18903a();
                aVar.f46734a = "";
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
                        aVar.f46734a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MicroAppAbility microAppAbility) throws IOException {
                if (microAppAbility.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, microAppAbility.url);
                }
                protoWriter.writeBytes(microAppAbility.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$MicroAppAbility$a */
        public static final class C18903a extends Message.Builder<MicroAppAbility, C18903a> {

            /* renamed from: a */
            public String f46734a;

            /* renamed from: a */
            public MicroAppAbility build() {
                return new MicroAppAbility(this.f46734a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18903a newBuilder() {
            C18903a aVar = new C18903a();
            aVar.f46734a = this.url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "MicroAppAbility");
            StringBuilder sb = new StringBuilder();
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            StringBuilder replace = sb.replace(0, 2, "MicroAppAbility{");
            replace.append('}');
            return replace.toString();
        }

        public MicroAppAbility(String str) {
            this(str, ByteString.EMPTY);
        }

        public MicroAppAbility(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
        }
    }

    public static final class OpenAppAbility extends Message<OpenAppAbility, C18905a> {
        public static final ProtoAdapter<OpenAppAbility> ADAPTER = new C18906b();
        private static final long serialVersionUID = 0;
        public final BotAbility bot;
        public final H5Ability h5;
        public final MicroAppAbility micro_app;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$OpenAppAbility$b */
        private static final class C18906b extends ProtoAdapter<OpenAppAbility> {
            C18906b() {
                super(FieldEncoding.LENGTH_DELIMITED, OpenAppAbility.class);
            }

            /* renamed from: a */
            public int encodedSize(OpenAppAbility openAppAbility) {
                int i;
                int i2;
                int i3 = 0;
                if (openAppAbility.bot != null) {
                    i = BotAbility.ADAPTER.encodedSizeWithTag(1, openAppAbility.bot);
                } else {
                    i = 0;
                }
                if (openAppAbility.h5 != null) {
                    i2 = H5Ability.ADAPTER.encodedSizeWithTag(2, openAppAbility.h5);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (openAppAbility.micro_app != null) {
                    i3 = MicroAppAbility.ADAPTER.encodedSizeWithTag(3, openAppAbility.micro_app);
                }
                return i4 + i3 + openAppAbility.unknownFields().size();
            }

            /* renamed from: a */
            public OpenAppAbility decode(ProtoReader protoReader) throws IOException {
                C18905a aVar = new C18905a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo64838a(BotAbility.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo64839a(H5Ability.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo64840a(MicroAppAbility.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OpenAppAbility openAppAbility) throws IOException {
                if (openAppAbility.bot != null) {
                    BotAbility.ADAPTER.encodeWithTag(protoWriter, 1, openAppAbility.bot);
                }
                if (openAppAbility.h5 != null) {
                    H5Ability.ADAPTER.encodeWithTag(protoWriter, 2, openAppAbility.h5);
                }
                if (openAppAbility.micro_app != null) {
                    MicroAppAbility.ADAPTER.encodeWithTag(protoWriter, 3, openAppAbility.micro_app);
                }
                protoWriter.writeBytes(openAppAbility.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18905a newBuilder() {
            C18905a aVar = new C18905a();
            aVar.f46735a = this.bot;
            aVar.f46736b = this.h5;
            aVar.f46737c = this.micro_app;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$OpenAppAbility$a */
        public static final class C18905a extends Message.Builder<OpenAppAbility, C18905a> {

            /* renamed from: a */
            public BotAbility f46735a;

            /* renamed from: b */
            public H5Ability f46736b;

            /* renamed from: c */
            public MicroAppAbility f46737c;

            /* renamed from: a */
            public OpenAppAbility build() {
                return new OpenAppAbility(this.f46735a, this.f46736b, this.f46737c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18905a mo64838a(BotAbility botAbility) {
                this.f46735a = botAbility;
                this.f46736b = null;
                this.f46737c = null;
                return this;
            }

            /* renamed from: a */
            public C18905a mo64839a(H5Ability h5Ability) {
                this.f46736b = h5Ability;
                this.f46735a = null;
                this.f46737c = null;
                return this;
            }

            /* renamed from: a */
            public C18905a mo64840a(MicroAppAbility microAppAbility) {
                this.f46737c = microAppAbility;
                this.f46735a = null;
                this.f46736b = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "OpenAppAbility");
            StringBuilder sb = new StringBuilder();
            if (this.bot != null) {
                sb.append(", bot=");
                sb.append(this.bot);
            }
            if (this.h5 != null) {
                sb.append(", h5=");
                sb.append(this.h5);
            }
            if (this.micro_app != null) {
                sb.append(", micro_app=");
                sb.append(this.micro_app);
            }
            StringBuilder replace = sb.replace(0, 2, "OpenAppAbility{");
            replace.append('}');
            return replace.toString();
        }

        public OpenAppAbility(BotAbility botAbility, H5Ability h5Ability, MicroAppAbility microAppAbility) {
            this(botAbility, h5Ability, microAppAbility, ByteString.EMPTY);
        }

        public OpenAppAbility(BotAbility botAbility, H5Ability h5Ability, MicroAppAbility microAppAbility, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(botAbility, h5Ability, microAppAbility) <= 1) {
                this.bot = botAbility;
                this.h5 = h5Ability;
                this.micro_app = microAppAbility;
                return;
            }
            throw new IllegalArgumentException("at most one of bot, h5, micro_app may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$b */
    private static final class C18908b extends ProtoAdapter<SearchOpenAppMeta> {
        C18908b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchOpenAppMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchOpenAppMeta searchOpenAppMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchOpenAppMeta.id);
            int i10 = 0;
            if (searchOpenAppMeta.localized_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, searchOpenAppMeta.localized_name);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + OpenAppAbility.ADAPTER.asRepeated().encodedSizeWithTag(3, searchOpenAppMeta.abilities);
            if (searchOpenAppMeta.state != null) {
                i2 = OpenApp.State.ADAPTER.encodedSizeWithTag(4, searchOpenAppMeta.state);
            } else {
                i2 = 0;
            }
            int i11 = encodedSizeWithTag2 + i2;
            if (searchOpenAppMeta.app_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchOpenAppMeta.app_id);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (searchOpenAppMeta.new_message_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, searchOpenAppMeta.new_message_count);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (searchOpenAppMeta.notification_type != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, searchOpenAppMeta.notification_type);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag3 = i13 + i5 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(8, searchOpenAppMeta.tags);
            if (searchOpenAppMeta.app_store_url != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, searchOpenAppMeta.app_store_url);
            } else {
                i6 = 0;
            }
            int i14 = encodedSizeWithTag3 + i6;
            if (searchOpenAppMeta.is_isv != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, searchOpenAppMeta.is_isv);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (searchOpenAppMeta.is_available != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(11, searchOpenAppMeta.is_available);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (searchOpenAppMeta.avatar_key != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, searchOpenAppMeta.avatar_key);
            } else {
                i9 = 0;
            }
            int i17 = i16 + i9;
            if (searchOpenAppMeta.localized_desc != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(13, searchOpenAppMeta.localized_desc);
            }
            return i17 + i10 + ExtraHitField.ADAPTER.asRepeated().encodedSizeWithTag(14, searchOpenAppMeta.extra_hit_fields) + searchOpenAppMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchOpenAppMeta decode(ProtoReader protoReader) throws IOException {
            C18907a aVar = new C18907a();
            aVar.f46738a = "";
            aVar.f46739b = "";
            aVar.f46741d = OpenApp.State.USABLE;
            aVar.f46742e = "";
            aVar.f46743f = 0;
            aVar.f46744g = 0;
            aVar.f46746i = "";
            aVar.f46747j = false;
            aVar.f46748k = false;
            aVar.f46749l = "";
            aVar.f46750m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46738a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46739b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46740c.add(OpenAppAbility.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f46741d = OpenApp.State.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f46742e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46743f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46744g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f46745h.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f46746i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46747j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46748k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46749l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46750m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46751n.add(ExtraHitField.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SearchOpenAppMeta searchOpenAppMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchOpenAppMeta.id);
            if (searchOpenAppMeta.localized_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchOpenAppMeta.localized_name);
            }
            OpenAppAbility.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, searchOpenAppMeta.abilities);
            if (searchOpenAppMeta.state != null) {
                OpenApp.State.ADAPTER.encodeWithTag(protoWriter, 4, searchOpenAppMeta.state);
            }
            if (searchOpenAppMeta.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchOpenAppMeta.app_id);
            }
            if (searchOpenAppMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, searchOpenAppMeta.new_message_count);
            }
            if (searchOpenAppMeta.notification_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, searchOpenAppMeta.notification_type);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, searchOpenAppMeta.tags);
            if (searchOpenAppMeta.app_store_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, searchOpenAppMeta.app_store_url);
            }
            if (searchOpenAppMeta.is_isv != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, searchOpenAppMeta.is_isv);
            }
            if (searchOpenAppMeta.is_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, searchOpenAppMeta.is_available);
            }
            if (searchOpenAppMeta.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, searchOpenAppMeta.avatar_key);
            }
            if (searchOpenAppMeta.localized_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, searchOpenAppMeta.localized_desc);
            }
            ExtraHitField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, searchOpenAppMeta.extra_hit_fields);
            protoWriter.writeBytes(searchOpenAppMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchOpenAppMeta$a */
    public static final class C18907a extends Message.Builder<SearchOpenAppMeta, C18907a> {

        /* renamed from: a */
        public String f46738a;

        /* renamed from: b */
        public String f46739b;

        /* renamed from: c */
        public List<OpenAppAbility> f46740c = Internal.newMutableList();

        /* renamed from: d */
        public OpenApp.State f46741d;

        /* renamed from: e */
        public String f46742e;

        /* renamed from: f */
        public Integer f46743f;

        /* renamed from: g */
        public Integer f46744g;

        /* renamed from: h */
        public List<Tag> f46745h = Internal.newMutableList();

        /* renamed from: i */
        public String f46746i;

        /* renamed from: j */
        public Boolean f46747j;

        /* renamed from: k */
        public Boolean f46748k;

        /* renamed from: l */
        public String f46749l;

        /* renamed from: m */
        public String f46750m;

        /* renamed from: n */
        public List<ExtraHitField> f46751n = Internal.newMutableList();

        /* renamed from: a */
        public SearchOpenAppMeta build() {
            String str = this.f46738a;
            if (str != null) {
                return new SearchOpenAppMeta(str, this.f46739b, this.f46740c, this.f46741d, this.f46742e, this.f46743f, this.f46744g, this.f46745h, this.f46746i, this.f46747j, this.f46748k, this.f46749l, this.f46750m, this.f46751n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18907a newBuilder() {
        C18907a aVar = new C18907a();
        aVar.f46738a = this.id;
        aVar.f46739b = this.localized_name;
        aVar.f46740c = Internal.copyOf("abilities", this.abilities);
        aVar.f46741d = this.state;
        aVar.f46742e = this.app_id;
        aVar.f46743f = this.new_message_count;
        aVar.f46744g = this.notification_type;
        aVar.f46745h = Internal.copyOf("tags", this.tags);
        aVar.f46746i = this.app_store_url;
        aVar.f46747j = this.is_isv;
        aVar.f46748k = this.is_available;
        aVar.f46749l = this.avatar_key;
        aVar.f46750m = this.localized_desc;
        aVar.f46751n = Internal.copyOf("extra_hit_fields", this.extra_hit_fields);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchOpenAppMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.localized_name != null) {
            sb.append(", localized_name=");
            sb.append(this.localized_name);
        }
        if (!this.abilities.isEmpty()) {
            sb.append(", abilities=");
            sb.append(this.abilities);
        }
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.notification_type != null) {
            sb.append(", notification_type=");
            sb.append(this.notification_type);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.app_store_url != null) {
            sb.append(", app_store_url=");
            sb.append(this.app_store_url);
        }
        if (this.is_isv != null) {
            sb.append(", is_isv=");
            sb.append(this.is_isv);
        }
        if (this.is_available != null) {
            sb.append(", is_available=");
            sb.append(this.is_available);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.localized_desc != null) {
            sb.append(", localized_desc=");
            sb.append(this.localized_desc);
        }
        if (!this.extra_hit_fields.isEmpty()) {
            sb.append(", extra_hit_fields=");
            sb.append(this.extra_hit_fields);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchOpenAppMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchOpenAppMeta(String str, String str2, List<OpenAppAbility> list, OpenApp.State state2, String str3, Integer num, Integer num2, List<Tag> list2, String str4, Boolean bool, Boolean bool2, String str5, String str6, List<ExtraHitField> list3) {
        this(str, str2, list, state2, str3, num, num2, list2, str4, bool, bool2, str5, str6, list3, ByteString.EMPTY);
    }

    public SearchOpenAppMeta(String str, String str2, List<OpenAppAbility> list, OpenApp.State state2, String str3, Integer num, Integer num2, List<Tag> list2, String str4, Boolean bool, Boolean bool2, String str5, String str6, List<ExtraHitField> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.localized_name = str2;
        this.abilities = Internal.immutableCopyOf("abilities", list);
        this.state = state2;
        this.app_id = str3;
        this.new_message_count = num;
        this.notification_type = num2;
        this.tags = Internal.immutableCopyOf("tags", list2);
        this.app_store_url = str4;
        this.is_isv = bool;
        this.is_available = bool2;
        this.avatar_key = str5;
        this.localized_desc = str6;
        this.extra_hit_fields = Internal.immutableCopyOf("extra_hit_fields", list3);
    }
}
