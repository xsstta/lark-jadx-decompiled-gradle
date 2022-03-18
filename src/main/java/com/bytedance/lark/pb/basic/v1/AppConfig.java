package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class AppConfig extends Message<AppConfig, C14678a> {
    public static final ProtoAdapter<AppConfig> ADAPTER = new C14679b();
    public static final CryptoChatState DEFAULT_CRYPTO_CHAT_STATE = CryptoChatState.UNKNOWN;
    public static final Integer DEFAULT_GUIDE_TO_RATE_DELAY_HOURS = -1;
    private static final long serialVersionUID = 0;
    public final List<String> android_app_stores;
    public final BannerConfig banner_config;
    public final BillingPackageConfig billing_package;
    public final ChatConfig chat_config;
    public final CryptoChatState crypto_chat_state;
    public final DocUrlRegex doc_url_regex;
    public final Integer guide_to_rate_delay_hours;
    public final MessageConfig message_config;
    public final Resource resource;
    public final SearchConfig search_config;
    public final URLConfig url_config;
    public final URLRegex url_regex;
    public final VoiceCallConfig voice_call_config;
    public final Zendesk zendesk;

    public enum CryptoChatState implements WireEnum {
        UNKNOWN(0),
        ALLOW(1),
        BLOCK(2),
        DEFAULT(3);
        
        public static final ProtoAdapter<CryptoChatState> ADAPTER = ProtoAdapter.newEnumAdapter(CryptoChatState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CryptoChatState fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALLOW;
            }
            if (i == 2) {
                return BLOCK;
            }
            if (i != 3) {
                return null;
            }
            return DEFAULT;
        }

        private CryptoChatState(int i) {
            this.value = i;
        }
    }

    public static final class ChatConfig extends Message<ChatConfig, C14658a> {
        public static final ProtoAdapter<ChatConfig> ADAPTER = new C14659b();
        public static final Integer DEFAULT_MAX_MEMBER_COUNT = 2000;
        public static final Integer DEFAULT_MAX_ORIGIN_GROUP_CHAT_USER_COUNT_4_CREATE_EXTERNAL_CHAT = 0;
        public static final Integer DEFAULT_WITHDRAW_CHATTER_EXPIRATION_BY_HOUR = 0;
        private static final long serialVersionUID = 0;
        public final Integer max_member_count;
        public final Integer max_origin_group_chat_user_count_4_create_external_chat;
        public final ChatPostPermission post_permission;
        public final Integer withdraw_chatter_expiration_by_hour;

        public static final class ChatPostPermission extends Message<ChatPostPermission, C14656a> {
            public static final ProtoAdapter<ChatPostPermission> ADAPTER = new C14657b();
            public static final Boolean DEFAULT_OPEN_TO_THREAD = false;
            private static final long serialVersionUID = 0;
            public final Boolean open_to_thread;

            /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$ChatConfig$ChatPostPermission$b */
            private static final class C14657b extends ProtoAdapter<ChatPostPermission> {
                C14657b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ChatPostPermission.class);
                }

                /* renamed from: a */
                public int encodedSize(ChatPostPermission chatPostPermission) {
                    int i;
                    if (chatPostPermission.open_to_thread != null) {
                        i = ProtoAdapter.BOOL.encodedSizeWithTag(1, chatPostPermission.open_to_thread);
                    } else {
                        i = 0;
                    }
                    return i + chatPostPermission.unknownFields().size();
                }

                /* renamed from: a */
                public ChatPostPermission decode(ProtoReader protoReader) throws IOException {
                    C14656a aVar = new C14656a();
                    aVar.f38776a = false;
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
                            aVar.f38776a = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, ChatPostPermission chatPostPermission) throws IOException {
                    if (chatPostPermission.open_to_thread != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, chatPostPermission.open_to_thread);
                    }
                    protoWriter.writeBytes(chatPostPermission.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$ChatConfig$ChatPostPermission$a */
            public static final class C14656a extends Message.Builder<ChatPostPermission, C14656a> {

                /* renamed from: a */
                public Boolean f38776a;

                /* renamed from: a */
                public ChatPostPermission build() {
                    return new ChatPostPermission(this.f38776a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14656a newBuilder() {
                C14656a aVar = new C14656a();
                aVar.f38776a = this.open_to_thread;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "ChatPostPermission");
                StringBuilder sb = new StringBuilder();
                if (this.open_to_thread != null) {
                    sb.append(", open_to_thread=");
                    sb.append(this.open_to_thread);
                }
                StringBuilder replace = sb.replace(0, 2, "ChatPostPermission{");
                replace.append('}');
                return replace.toString();
            }

            public ChatPostPermission(Boolean bool) {
                this(bool, ByteString.EMPTY);
            }

            public ChatPostPermission(Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                this.open_to_thread = bool;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$ChatConfig$b */
        private static final class C14659b extends ProtoAdapter<ChatConfig> {
            C14659b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatConfig chatConfig) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (chatConfig.max_member_count != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, chatConfig.max_member_count);
                } else {
                    i = 0;
                }
                if (chatConfig.post_permission != null) {
                    i2 = ChatPostPermission.ADAPTER.encodedSizeWithTag(2, chatConfig.post_permission);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (chatConfig.withdraw_chatter_expiration_by_hour != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, chatConfig.withdraw_chatter_expiration_by_hour);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (chatConfig.max_origin_group_chat_user_count_4_create_external_chat != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, chatConfig.max_origin_group_chat_user_count_4_create_external_chat);
                }
                return i6 + i4 + chatConfig.unknownFields().size();
            }

            /* renamed from: a */
            public ChatConfig decode(ProtoReader protoReader) throws IOException {
                C14658a aVar = new C14658a();
                aVar.f38777a = 2000;
                aVar.f38779c = 0;
                aVar.f38780d = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38777a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38778b = ChatPostPermission.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f38779c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38780d = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatConfig chatConfig) throws IOException {
                if (chatConfig.max_member_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, chatConfig.max_member_count);
                }
                if (chatConfig.post_permission != null) {
                    ChatPostPermission.ADAPTER.encodeWithTag(protoWriter, 2, chatConfig.post_permission);
                }
                if (chatConfig.withdraw_chatter_expiration_by_hour != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, chatConfig.withdraw_chatter_expiration_by_hour);
                }
                if (chatConfig.max_origin_group_chat_user_count_4_create_external_chat != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, chatConfig.max_origin_group_chat_user_count_4_create_external_chat);
                }
                protoWriter.writeBytes(chatConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$ChatConfig$a */
        public static final class C14658a extends Message.Builder<ChatConfig, C14658a> {

            /* renamed from: a */
            public Integer f38777a;

            /* renamed from: b */
            public ChatPostPermission f38778b;

            /* renamed from: c */
            public Integer f38779c;

            /* renamed from: d */
            public Integer f38780d;

            /* renamed from: a */
            public ChatConfig build() {
                return new ChatConfig(this.f38777a, this.f38778b, this.f38779c, this.f38780d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14658a newBuilder() {
            C14658a aVar = new C14658a();
            aVar.f38777a = this.max_member_count;
            aVar.f38778b = this.post_permission;
            aVar.f38779c = this.withdraw_chatter_expiration_by_hour;
            aVar.f38780d = this.max_origin_group_chat_user_count_4_create_external_chat;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ChatConfig");
            StringBuilder sb = new StringBuilder();
            if (this.max_member_count != null) {
                sb.append(", max_member_count=");
                sb.append(this.max_member_count);
            }
            if (this.post_permission != null) {
                sb.append(", post_permission=");
                sb.append(this.post_permission);
            }
            if (this.withdraw_chatter_expiration_by_hour != null) {
                sb.append(", withdraw_chatter_expiration_by_hour=");
                sb.append(this.withdraw_chatter_expiration_by_hour);
            }
            if (this.max_origin_group_chat_user_count_4_create_external_chat != null) {
                sb.append(", max_origin_group_chat_user_count_4_create_external_chat=");
                sb.append(this.max_origin_group_chat_user_count_4_create_external_chat);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatConfig{");
            replace.append('}');
            return replace.toString();
        }

        public ChatConfig(Integer num, ChatPostPermission chatPostPermission, Integer num2, Integer num3) {
            this(num, chatPostPermission, num2, num3, ByteString.EMPTY);
        }

        public ChatConfig(Integer num, ChatPostPermission chatPostPermission, Integer num2, Integer num3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.max_member_count = num;
            this.post_permission = chatPostPermission;
            this.withdraw_chatter_expiration_by_hour = num2;
            this.max_origin_group_chat_user_count_4_create_external_chat = num3;
        }
    }

    public static final class URLConfig extends Message<URLConfig, C14670a> {
        public static final ProtoAdapter<URLConfig> ADAPTER = new C14671b();
        private static final long serialVersionUID = 0;
        public final String create_doc_addr;
        public final List<Domain> doc_domains;
        public final Domain domain;

        public static final class Domain extends Message<Domain, C14668a> {
            public static final ProtoAdapter<Domain> ADAPTER = new C14669b();
            private static final long serialVersionUID = 0;
            public final String domain;

            /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$URLConfig$Domain$b */
            private static final class C14669b extends ProtoAdapter<Domain> {
                C14669b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Domain.class);
                }

                /* renamed from: a */
                public int encodedSize(Domain domain) {
                    int i;
                    if (domain.domain != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, domain.domain);
                    } else {
                        i = 0;
                    }
                    return i + domain.unknownFields().size();
                }

                /* renamed from: a */
                public Domain decode(ProtoReader protoReader) throws IOException {
                    C14668a aVar = new C14668a();
                    aVar.f38786a = "";
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
                            aVar.f38786a = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Domain domain) throws IOException {
                    if (domain.domain != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, domain.domain);
                    }
                    protoWriter.writeBytes(domain.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$URLConfig$Domain$a */
            public static final class C14668a extends Message.Builder<Domain, C14668a> {

                /* renamed from: a */
                public String f38786a;

                /* renamed from: a */
                public Domain build() {
                    return new Domain(this.f38786a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14668a newBuilder() {
                C14668a aVar = new C14668a();
                aVar.f38786a = this.domain;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "Domain");
                StringBuilder sb = new StringBuilder();
                if (this.domain != null) {
                    sb.append(", domain=");
                    sb.append(this.domain);
                }
                StringBuilder replace = sb.replace(0, 2, "Domain{");
                replace.append('}');
                return replace.toString();
            }

            public Domain(String str) {
                this(str, ByteString.EMPTY);
            }

            public Domain(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.domain = str;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$URLConfig$b */
        private static final class C14671b extends ProtoAdapter<URLConfig> {
            C14671b() {
                super(FieldEncoding.LENGTH_DELIMITED, URLConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(URLConfig uRLConfig) {
                int i;
                int i2 = 0;
                if (uRLConfig.domain != null) {
                    i = Domain.ADAPTER.encodedSizeWithTag(1, uRLConfig.domain);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + Domain.ADAPTER.asRepeated().encodedSizeWithTag(2, uRLConfig.doc_domains);
                if (uRLConfig.create_doc_addr != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, uRLConfig.create_doc_addr);
                }
                return encodedSizeWithTag + i2 + uRLConfig.unknownFields().size();
            }

            /* renamed from: a */
            public URLConfig decode(ProtoReader protoReader) throws IOException {
                C14670a aVar = new C14670a();
                aVar.f38789c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38787a = Domain.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38788b.add(Domain.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38789c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, URLConfig uRLConfig) throws IOException {
                if (uRLConfig.domain != null) {
                    Domain.ADAPTER.encodeWithTag(protoWriter, 1, uRLConfig.domain);
                }
                Domain.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, uRLConfig.doc_domains);
                if (uRLConfig.create_doc_addr != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uRLConfig.create_doc_addr);
                }
                protoWriter.writeBytes(uRLConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$URLConfig$a */
        public static final class C14670a extends Message.Builder<URLConfig, C14670a> {

            /* renamed from: a */
            public Domain f38787a;

            /* renamed from: b */
            public List<Domain> f38788b = Internal.newMutableList();

            /* renamed from: c */
            public String f38789c;

            /* renamed from: a */
            public URLConfig build() {
                return new URLConfig(this.f38787a, this.f38788b, this.f38789c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14670a newBuilder() {
            C14670a aVar = new C14670a();
            aVar.f38787a = this.domain;
            aVar.f38788b = Internal.copyOf("doc_domains", this.doc_domains);
            aVar.f38789c = this.create_doc_addr;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "URLConfig");
            StringBuilder sb = new StringBuilder();
            if (this.domain != null) {
                sb.append(", domain=");
                sb.append(this.domain);
            }
            if (!this.doc_domains.isEmpty()) {
                sb.append(", doc_domains=");
                sb.append(this.doc_domains);
            }
            if (this.create_doc_addr != null) {
                sb.append(", create_doc_addr=");
                sb.append(this.create_doc_addr);
            }
            StringBuilder replace = sb.replace(0, 2, "URLConfig{");
            replace.append('}');
            return replace.toString();
        }

        public URLConfig(Domain domain2, List<Domain> list, String str) {
            this(domain2, list, str, ByteString.EMPTY);
        }

        public URLConfig(Domain domain2, List<Domain> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.domain = domain2;
            this.doc_domains = Internal.immutableCopyOf("doc_domains", list);
            this.create_doc_addr = str;
        }
    }

    public static final class BannerConfig extends Message<BannerConfig, C14652a> {
        public static final ProtoAdapter<BannerConfig> ADAPTER = new C14653b();
        public static final Integer DEFAULT_NOTIFICATION_REFRESH_TIME = 0;
        private static final long serialVersionUID = 0;
        public final Integer notification_refresh_time;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$BannerConfig$b */
        private static final class C14653b extends ProtoAdapter<BannerConfig> {
            C14653b() {
                super(FieldEncoding.LENGTH_DELIMITED, BannerConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(BannerConfig bannerConfig) {
                int i;
                if (bannerConfig.notification_refresh_time != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, bannerConfig.notification_refresh_time);
                } else {
                    i = 0;
                }
                return i + bannerConfig.unknownFields().size();
            }

            /* renamed from: a */
            public BannerConfig decode(ProtoReader protoReader) throws IOException {
                C14652a aVar = new C14652a();
                aVar.f38766a = 0;
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
                        aVar.f38766a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BannerConfig bannerConfig) throws IOException {
                if (bannerConfig.notification_refresh_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, bannerConfig.notification_refresh_time);
                }
                protoWriter.writeBytes(bannerConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$BannerConfig$a */
        public static final class C14652a extends Message.Builder<BannerConfig, C14652a> {

            /* renamed from: a */
            public Integer f38766a;

            /* renamed from: a */
            public BannerConfig build() {
                return new BannerConfig(this.f38766a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14652a newBuilder() {
            C14652a aVar = new C14652a();
            aVar.f38766a = this.notification_refresh_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "BannerConfig");
            StringBuilder sb = new StringBuilder();
            if (this.notification_refresh_time != null) {
                sb.append(", notification_refresh_time=");
                sb.append(this.notification_refresh_time);
            }
            StringBuilder replace = sb.replace(0, 2, "BannerConfig{");
            replace.append('}');
            return replace.toString();
        }

        public BannerConfig(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public BannerConfig(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.notification_refresh_time = num;
        }
    }

    public static final class BillingPackageConfig extends Message<BillingPackageConfig, C14654a> {
        public static final ProtoAdapter<BillingPackageConfig> ADAPTER = new C14655b();
        public static final Long DEFAULT_BUZZ_LIMIT = -1L;
        public static final Long DEFAULT_CHAT_BOT_LIMIT = -1L;
        public static final Long DEFAULT_CHAT_NUMBER_LIMIT = -1L;
        public static final Long DEFAULT_DOC_NUMBER_LIMIT = -1L;
        public static final Boolean DEFAULT_HAS_SECRET_CHAT = true;
        public static final Boolean DEFAULT_IS_ENABLE_AUTO_TRANSLATION = true;
        public static final Boolean DEFAULT_IS_LARK_HONGBAO_ENABLE = true;
        public static final Long DEFAULT_VIDEOCHAT_DURATION_LIMIT = -1L;
        public static final Long DEFAULT_VIDEOCHAT_PARTICIPANT_LIMIT = -1L;
        private static final long serialVersionUID = 0;
        public final Long buzz_limit;
        public final Long chat_bot_limit;
        public final Long chat_number_limit;
        public final Long doc_number_limit;
        public final Boolean has_secret_chat;
        public final Boolean is_enable_auto_translation;
        public final Boolean is_lark_hongbao_enable;
        public final Long videochat_duration_limit;
        public final Long videochat_participant_limit;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$BillingPackageConfig$b */
        private static final class C14655b extends ProtoAdapter<BillingPackageConfig> {
            C14655b() {
                super(FieldEncoding.LENGTH_DELIMITED, BillingPackageConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(BillingPackageConfig billingPackageConfig) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9 = 0;
                if (billingPackageConfig.chat_number_limit != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, billingPackageConfig.chat_number_limit);
                } else {
                    i = 0;
                }
                if (billingPackageConfig.chat_bot_limit != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, billingPackageConfig.chat_bot_limit);
                } else {
                    i2 = 0;
                }
                int i10 = i + i2;
                if (billingPackageConfig.buzz_limit != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(20, billingPackageConfig.buzz_limit);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (billingPackageConfig.has_secret_chat != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(30, billingPackageConfig.has_secret_chat);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (billingPackageConfig.doc_number_limit != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(100, billingPackageConfig.doc_number_limit);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (billingPackageConfig.videochat_participant_limit != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, billingPackageConfig.videochat_participant_limit);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (billingPackageConfig.videochat_duration_limit != null) {
                    i7 = ProtoAdapter.INT64.encodedSizeWithTag(201, billingPackageConfig.videochat_duration_limit);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (billingPackageConfig.is_enable_auto_translation != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(LocationRequest.PRIORITY_INDOOR, billingPackageConfig.is_enable_auto_translation);
                } else {
                    i8 = 0;
                }
                int i16 = i15 + i8;
                if (billingPackageConfig.is_lark_hongbao_enable != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, billingPackageConfig.is_lark_hongbao_enable);
                }
                return i16 + i9 + billingPackageConfig.unknownFields().size();
            }

            /* renamed from: a */
            public BillingPackageConfig decode(ProtoReader protoReader) throws IOException {
                C14654a aVar = new C14654a();
                aVar.f38767a = -1L;
                aVar.f38768b = -1L;
                aVar.f38769c = -1L;
                aVar.f38770d = true;
                aVar.f38771e = -1L;
                aVar.f38772f = -1L;
                aVar.f38773g = -1L;
                aVar.f38774h = true;
                aVar.f38775i = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38767a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38768b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 20) {
                        aVar.f38769c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 30) {
                        aVar.f38770d = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 100) {
                        aVar.f38771e = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 300) {
                        aVar.f38774h = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 400) {
                        aVar.f38775i = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 200) {
                        aVar.f38772f = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 201) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38773g = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BillingPackageConfig billingPackageConfig) throws IOException {
                if (billingPackageConfig.chat_number_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, billingPackageConfig.chat_number_limit);
                }
                if (billingPackageConfig.chat_bot_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, billingPackageConfig.chat_bot_limit);
                }
                if (billingPackageConfig.buzz_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, billingPackageConfig.buzz_limit);
                }
                if (billingPackageConfig.has_secret_chat != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, billingPackageConfig.has_secret_chat);
                }
                if (billingPackageConfig.doc_number_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 100, billingPackageConfig.doc_number_limit);
                }
                if (billingPackageConfig.videochat_participant_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, billingPackageConfig.videochat_participant_limit);
                }
                if (billingPackageConfig.videochat_duration_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 201, billingPackageConfig.videochat_duration_limit);
                }
                if (billingPackageConfig.is_enable_auto_translation != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, LocationRequest.PRIORITY_INDOOR, billingPackageConfig.is_enable_auto_translation);
                }
                if (billingPackageConfig.is_lark_hongbao_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, billingPackageConfig.is_lark_hongbao_enable);
                }
                protoWriter.writeBytes(billingPackageConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$BillingPackageConfig$a */
        public static final class C14654a extends Message.Builder<BillingPackageConfig, C14654a> {

            /* renamed from: a */
            public Long f38767a;

            /* renamed from: b */
            public Long f38768b;

            /* renamed from: c */
            public Long f38769c;

            /* renamed from: d */
            public Boolean f38770d;

            /* renamed from: e */
            public Long f38771e;

            /* renamed from: f */
            public Long f38772f;

            /* renamed from: g */
            public Long f38773g;

            /* renamed from: h */
            public Boolean f38774h;

            /* renamed from: i */
            public Boolean f38775i;

            /* renamed from: a */
            public BillingPackageConfig build() {
                return new BillingPackageConfig(this.f38767a, this.f38768b, this.f38769c, this.f38770d, this.f38771e, this.f38772f, this.f38773g, this.f38774h, this.f38775i, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14654a newBuilder() {
            C14654a aVar = new C14654a();
            aVar.f38767a = this.chat_number_limit;
            aVar.f38768b = this.chat_bot_limit;
            aVar.f38769c = this.buzz_limit;
            aVar.f38770d = this.has_secret_chat;
            aVar.f38771e = this.doc_number_limit;
            aVar.f38772f = this.videochat_participant_limit;
            aVar.f38773g = this.videochat_duration_limit;
            aVar.f38774h = this.is_enable_auto_translation;
            aVar.f38775i = this.is_lark_hongbao_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "BillingPackageConfig");
            StringBuilder sb = new StringBuilder();
            if (this.chat_number_limit != null) {
                sb.append(", chat_number_limit=");
                sb.append(this.chat_number_limit);
            }
            if (this.chat_bot_limit != null) {
                sb.append(", chat_bot_limit=");
                sb.append(this.chat_bot_limit);
            }
            if (this.buzz_limit != null) {
                sb.append(", buzz_limit=");
                sb.append(this.buzz_limit);
            }
            if (this.has_secret_chat != null) {
                sb.append(", has_secret_chat=");
                sb.append(this.has_secret_chat);
            }
            if (this.doc_number_limit != null) {
                sb.append(", doc_number_limit=");
                sb.append(this.doc_number_limit);
            }
            if (this.videochat_participant_limit != null) {
                sb.append(", videochat_participant_limit=");
                sb.append(this.videochat_participant_limit);
            }
            if (this.videochat_duration_limit != null) {
                sb.append(", videochat_duration_limit=");
                sb.append(this.videochat_duration_limit);
            }
            if (this.is_enable_auto_translation != null) {
                sb.append(", is_enable_auto_translation=");
                sb.append(this.is_enable_auto_translation);
            }
            if (this.is_lark_hongbao_enable != null) {
                sb.append(", is_lark_hongbao_enable=");
                sb.append(this.is_lark_hongbao_enable);
            }
            StringBuilder replace = sb.replace(0, 2, "BillingPackageConfig{");
            replace.append('}');
            return replace.toString();
        }

        public BillingPackageConfig(Long l, Long l2, Long l3, Boolean bool, Long l4, Long l5, Long l6, Boolean bool2, Boolean bool3) {
            this(l, l2, l3, bool, l4, l5, l6, bool2, bool3, ByteString.EMPTY);
        }

        public BillingPackageConfig(Long l, Long l2, Long l3, Boolean bool, Long l4, Long l5, Long l6, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_number_limit = l;
            this.chat_bot_limit = l2;
            this.buzz_limit = l3;
            this.has_secret_chat = bool;
            this.doc_number_limit = l4;
            this.videochat_participant_limit = l5;
            this.videochat_duration_limit = l6;
            this.is_enable_auto_translation = bool2;
            this.is_lark_hongbao_enable = bool3;
        }
    }

    public static final class DocUrlRegex extends Message<DocUrlRegex, C14660a> {
        public static final ProtoAdapter<DocUrlRegex> ADAPTER = new C14661b();
        private static final long serialVersionUID = 0;
        public final List<String> regex;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$DocUrlRegex$b */
        private static final class C14661b extends ProtoAdapter<DocUrlRegex> {
            C14661b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocUrlRegex.class);
            }

            /* renamed from: a */
            public int encodedSize(DocUrlRegex docUrlRegex) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, docUrlRegex.regex) + docUrlRegex.unknownFields().size();
            }

            /* renamed from: a */
            public DocUrlRegex decode(ProtoReader protoReader) throws IOException {
                C14660a aVar = new C14660a();
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
                        aVar.f38781a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocUrlRegex docUrlRegex) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, docUrlRegex.regex);
                protoWriter.writeBytes(docUrlRegex.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$DocUrlRegex$a */
        public static final class C14660a extends Message.Builder<DocUrlRegex, C14660a> {

            /* renamed from: a */
            public List<String> f38781a = Internal.newMutableList();

            /* renamed from: a */
            public DocUrlRegex build() {
                return new DocUrlRegex(this.f38781a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14660a newBuilder() {
            C14660a aVar = new C14660a();
            aVar.f38781a = Internal.copyOf("regex", this.regex);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "DocUrlRegex");
            StringBuilder sb = new StringBuilder();
            if (!this.regex.isEmpty()) {
                sb.append(", regex=");
                sb.append(this.regex);
            }
            StringBuilder replace = sb.replace(0, 2, "DocUrlRegex{");
            replace.append('}');
            return replace.toString();
        }

        public DocUrlRegex(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public DocUrlRegex(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.regex = Internal.immutableCopyOf("regex", list);
        }
    }

    public static final class MessageConfig extends Message<MessageConfig, C14662a> {
        public static final ProtoAdapter<MessageConfig> ADAPTER = new C14663b();
        public static final Long DEFAULT_MAX_RECALL_TIME_LIMIT = 1440L;
        private static final long serialVersionUID = 0;
        public final Long max_recall_time_limit;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$MessageConfig$b */
        private static final class C14663b extends ProtoAdapter<MessageConfig> {
            C14663b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageConfig messageConfig) {
                int i;
                if (messageConfig.max_recall_time_limit != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, messageConfig.max_recall_time_limit);
                } else {
                    i = 0;
                }
                return i + messageConfig.unknownFields().size();
            }

            /* renamed from: a */
            public MessageConfig decode(ProtoReader protoReader) throws IOException {
                C14662a aVar = new C14662a();
                aVar.f38782a = 1440L;
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
                        aVar.f38782a = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageConfig messageConfig) throws IOException {
                if (messageConfig.max_recall_time_limit != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messageConfig.max_recall_time_limit);
                }
                protoWriter.writeBytes(messageConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$MessageConfig$a */
        public static final class C14662a extends Message.Builder<MessageConfig, C14662a> {

            /* renamed from: a */
            public Long f38782a;

            /* renamed from: a */
            public MessageConfig build() {
                return new MessageConfig(this.f38782a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14662a newBuilder() {
            C14662a aVar = new C14662a();
            aVar.f38782a = this.max_recall_time_limit;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MessageConfig");
            StringBuilder sb = new StringBuilder();
            if (this.max_recall_time_limit != null) {
                sb.append(", max_recall_time_limit=");
                sb.append(this.max_recall_time_limit);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageConfig{");
            replace.append('}');
            return replace.toString();
        }

        public MessageConfig(Long l) {
            this(l, ByteString.EMPTY);
        }

        public MessageConfig(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.max_recall_time_limit = l;
        }
    }

    public static final class SearchConfig extends Message<SearchConfig, C14666a> {
        public static final ProtoAdapter<SearchConfig> ADAPTER = new C14667b();
        private static final long serialVersionUID = 0;
        public final List<ExternalSearch> external_searches;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$SearchConfig$b */
        private static final class C14667b extends ProtoAdapter<SearchConfig> {
            C14667b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchConfig searchConfig) {
                return ExternalSearch.ADAPTER.asRepeated().encodedSizeWithTag(1, searchConfig.external_searches) + searchConfig.unknownFields().size();
            }

            /* renamed from: a */
            public SearchConfig decode(ProtoReader protoReader) throws IOException {
                C14666a aVar = new C14666a();
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
                        aVar.f38785a.add(ExternalSearch.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SearchConfig searchConfig) throws IOException {
                ExternalSearch.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchConfig.external_searches);
                protoWriter.writeBytes(searchConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$SearchConfig$a */
        public static final class C14666a extends Message.Builder<SearchConfig, C14666a> {

            /* renamed from: a */
            public List<ExternalSearch> f38785a = Internal.newMutableList();

            /* renamed from: a */
            public SearchConfig build() {
                return new SearchConfig(this.f38785a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14666a newBuilder() {
            C14666a aVar = new C14666a();
            aVar.f38785a = Internal.copyOf("external_searches", this.external_searches);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SearchConfig");
            StringBuilder sb = new StringBuilder();
            if (!this.external_searches.isEmpty()) {
                sb.append(", external_searches=");
                sb.append(this.external_searches);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchConfig{");
            replace.append('}');
            return replace.toString();
        }

        public SearchConfig(List<ExternalSearch> list) {
            this(list, ByteString.EMPTY);
        }

        public SearchConfig(List<ExternalSearch> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.external_searches = Internal.immutableCopyOf("external_searches", list);
        }
    }

    public static final class VoiceCallConfig extends Message<VoiceCallConfig, C14674a> {
        public static final ProtoAdapter<VoiceCallConfig> ADAPTER = new C14675b();
        public static final Integer DEFAULT_HEARTBEAT_CYCLE = 3;
        public static final Integer DEFAULT_HEARTBEAT_EXPIRED_TIME = 12;
        private static final long serialVersionUID = 0;
        public final Integer heartbeat_cycle;
        public final Integer heartbeat_expired_time;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$VoiceCallConfig$b */
        private static final class C14675b extends ProtoAdapter<VoiceCallConfig> {
            C14675b() {
                super(FieldEncoding.LENGTH_DELIMITED, VoiceCallConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(VoiceCallConfig voiceCallConfig) {
                int i;
                int i2 = 0;
                if (voiceCallConfig.heartbeat_cycle != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, voiceCallConfig.heartbeat_cycle);
                } else {
                    i = 0;
                }
                if (voiceCallConfig.heartbeat_expired_time != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, voiceCallConfig.heartbeat_expired_time);
                }
                return i + i2 + voiceCallConfig.unknownFields().size();
            }

            /* renamed from: a */
            public VoiceCallConfig decode(ProtoReader protoReader) throws IOException {
                C14674a aVar = new C14674a();
                aVar.f38793a = 3;
                aVar.f38794b = 12;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 2) {
                        aVar.f38793a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38794b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, VoiceCallConfig voiceCallConfig) throws IOException {
                if (voiceCallConfig.heartbeat_cycle != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, voiceCallConfig.heartbeat_cycle);
                }
                if (voiceCallConfig.heartbeat_expired_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, voiceCallConfig.heartbeat_expired_time);
                }
                protoWriter.writeBytes(voiceCallConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$VoiceCallConfig$a */
        public static final class C14674a extends Message.Builder<VoiceCallConfig, C14674a> {

            /* renamed from: a */
            public Integer f38793a;

            /* renamed from: b */
            public Integer f38794b;

            /* renamed from: a */
            public VoiceCallConfig build() {
                return new VoiceCallConfig(this.f38793a, this.f38794b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14674a newBuilder() {
            C14674a aVar = new C14674a();
            aVar.f38793a = this.heartbeat_cycle;
            aVar.f38794b = this.heartbeat_expired_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "VoiceCallConfig");
            StringBuilder sb = new StringBuilder();
            if (this.heartbeat_cycle != null) {
                sb.append(", heartbeat_cycle=");
                sb.append(this.heartbeat_cycle);
            }
            if (this.heartbeat_expired_time != null) {
                sb.append(", heartbeat_expired_time=");
                sb.append(this.heartbeat_expired_time);
            }
            StringBuilder replace = sb.replace(0, 2, "VoiceCallConfig{");
            replace.append('}');
            return replace.toString();
        }

        public VoiceCallConfig(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public VoiceCallConfig(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.heartbeat_cycle = num;
            this.heartbeat_expired_time = num2;
        }
    }

    public static final class Zendesk extends Message<Zendesk, C14676a> {
        public static final ProtoAdapter<Zendesk> ADAPTER = new C14677b();
        public static final Boolean DEFAULT_ONCALL_CHAT = false;
        private static final long serialVersionUID = 0;
        public final Boolean oncall_chat;
        public final String web_form_url;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$Zendesk$b */
        private static final class C14677b extends ProtoAdapter<Zendesk> {
            C14677b() {
                super(FieldEncoding.LENGTH_DELIMITED, Zendesk.class);
            }

            /* renamed from: a */
            public int encodedSize(Zendesk zendesk) {
                int i;
                int i2 = 0;
                if (zendesk.web_form_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, zendesk.web_form_url);
                } else {
                    i = 0;
                }
                if (zendesk.oncall_chat != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, zendesk.oncall_chat);
                }
                return i + i2 + zendesk.unknownFields().size();
            }

            /* renamed from: a */
            public Zendesk decode(ProtoReader protoReader) throws IOException {
                C14676a aVar = new C14676a();
                aVar.mo54072a("");
                aVar.mo54071a((Boolean) false);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo54072a(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo54071a(ProtoAdapter.BOOL.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Zendesk zendesk) throws IOException {
                if (zendesk.web_form_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, zendesk.web_form_url);
                }
                if (zendesk.oncall_chat != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, zendesk.oncall_chat);
                }
                protoWriter.writeBytes(zendesk.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$Zendesk$a */
        public static final class C14676a extends Message.Builder<Zendesk, C14676a> {

            /* renamed from: a */
            public String f38795a;

            /* renamed from: b */
            public Boolean f38796b;

            /* renamed from: a */
            public Zendesk build() {
                return new Zendesk(this.f38795a, this.f38796b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14676a mo54071a(Boolean bool) {
                this.f38796b = bool;
                this.f38795a = null;
                return this;
            }

            /* renamed from: a */
            public C14676a mo54072a(String str) {
                this.f38795a = str;
                this.f38796b = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14676a newBuilder() {
            C14676a aVar = new C14676a();
            aVar.f38795a = this.web_form_url;
            aVar.f38796b = this.oncall_chat;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Zendesk");
            StringBuilder sb = new StringBuilder();
            if (this.web_form_url != null) {
                sb.append(", web_form_url=");
                sb.append(this.web_form_url);
            }
            if (this.oncall_chat != null) {
                sb.append(", oncall_chat=");
                sb.append(this.oncall_chat);
            }
            StringBuilder replace = sb.replace(0, 2, "Zendesk{");
            replace.append('}');
            return replace.toString();
        }

        public Zendesk(String str, Boolean bool) {
            this(str, bool, ByteString.EMPTY);
        }

        public Zendesk(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(str, bool) <= 1) {
                this.web_form_url = str;
                this.oncall_chat = bool;
                return;
            }
            throw new IllegalArgumentException("at most one of web_form_url, oncall_chat may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$b */
    private static final class C14679b extends ProtoAdapter<AppConfig> {
        C14679b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(AppConfig appConfig) {
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
            int i13 = 0;
            if (appConfig.message_config != null) {
                i = MessageConfig.ADAPTER.encodedSizeWithTag(1, appConfig.message_config);
            } else {
                i = 0;
            }
            if (appConfig.chat_config != null) {
                i2 = ChatConfig.ADAPTER.encodedSizeWithTag(2, appConfig.chat_config);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (appConfig.voice_call_config != null) {
                i3 = VoiceCallConfig.ADAPTER.encodedSizeWithTag(3, appConfig.voice_call_config);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (appConfig.url_config != null) {
                i4 = URLConfig.ADAPTER.encodedSizeWithTag(4, appConfig.url_config);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (appConfig.resource != null) {
                i5 = Resource.ADAPTER.encodedSizeWithTag(5, appConfig.resource);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (appConfig.doc_url_regex != null) {
                i6 = DocUrlRegex.ADAPTER.encodedSizeWithTag(6, appConfig.doc_url_regex);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (appConfig.billing_package != null) {
                i7 = BillingPackageConfig.ADAPTER.encodedSizeWithTag(7, appConfig.billing_package);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (appConfig.url_regex != null) {
                i8 = URLRegex.ADAPTER.encodedSizeWithTag(8, appConfig.url_regex);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (appConfig.zendesk != null) {
                i9 = Zendesk.ADAPTER.encodedSizeWithTag(9, appConfig.zendesk);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag = i20 + i9 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, appConfig.android_app_stores);
            if (appConfig.guide_to_rate_delay_hours != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, appConfig.guide_to_rate_delay_hours);
            } else {
                i10 = 0;
            }
            int i21 = encodedSizeWithTag + i10;
            if (appConfig.search_config != null) {
                i11 = SearchConfig.ADAPTER.encodedSizeWithTag(12, appConfig.search_config);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (appConfig.banner_config != null) {
                i12 = BannerConfig.ADAPTER.encodedSizeWithTag(13, appConfig.banner_config);
            } else {
                i12 = 0;
            }
            int i23 = i22 + i12;
            if (appConfig.crypto_chat_state != null) {
                i13 = CryptoChatState.ADAPTER.encodedSizeWithTag(14, appConfig.crypto_chat_state);
            }
            return i23 + i13 + appConfig.unknownFields().size();
        }

        /* renamed from: a */
        public AppConfig decode(ProtoReader protoReader) throws IOException {
            C14678a aVar = new C14678a();
            aVar.f38807k = -1;
            aVar.f38810n = CryptoChatState.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38797a = MessageConfig.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38798b = ChatConfig.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38799c = VoiceCallConfig.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38800d = URLConfig.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38801e = Resource.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38802f = DocUrlRegex.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38803g = BillingPackageConfig.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38804h = URLRegex.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38805i = Zendesk.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f38806j.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            aVar.f38807k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f38808l = SearchConfig.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f38809m = BannerConfig.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f38810n = CryptoChatState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, AppConfig appConfig) throws IOException {
            if (appConfig.message_config != null) {
                MessageConfig.ADAPTER.encodeWithTag(protoWriter, 1, appConfig.message_config);
            }
            if (appConfig.chat_config != null) {
                ChatConfig.ADAPTER.encodeWithTag(protoWriter, 2, appConfig.chat_config);
            }
            if (appConfig.voice_call_config != null) {
                VoiceCallConfig.ADAPTER.encodeWithTag(protoWriter, 3, appConfig.voice_call_config);
            }
            if (appConfig.url_config != null) {
                URLConfig.ADAPTER.encodeWithTag(protoWriter, 4, appConfig.url_config);
            }
            if (appConfig.resource != null) {
                Resource.ADAPTER.encodeWithTag(protoWriter, 5, appConfig.resource);
            }
            if (appConfig.doc_url_regex != null) {
                DocUrlRegex.ADAPTER.encodeWithTag(protoWriter, 6, appConfig.doc_url_regex);
            }
            if (appConfig.billing_package != null) {
                BillingPackageConfig.ADAPTER.encodeWithTag(protoWriter, 7, appConfig.billing_package);
            }
            if (appConfig.url_regex != null) {
                URLRegex.ADAPTER.encodeWithTag(protoWriter, 8, appConfig.url_regex);
            }
            if (appConfig.zendesk != null) {
                Zendesk.ADAPTER.encodeWithTag(protoWriter, 9, appConfig.zendesk);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, appConfig.android_app_stores);
            if (appConfig.guide_to_rate_delay_hours != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, appConfig.guide_to_rate_delay_hours);
            }
            if (appConfig.search_config != null) {
                SearchConfig.ADAPTER.encodeWithTag(protoWriter, 12, appConfig.search_config);
            }
            if (appConfig.banner_config != null) {
                BannerConfig.ADAPTER.encodeWithTag(protoWriter, 13, appConfig.banner_config);
            }
            if (appConfig.crypto_chat_state != null) {
                CryptoChatState.ADAPTER.encodeWithTag(protoWriter, 14, appConfig.crypto_chat_state);
            }
            protoWriter.writeBytes(appConfig.unknownFields());
        }
    }

    public static final class Resource extends Message<Resource, C14664a> {
        public static final ProtoAdapter<Resource> ADAPTER = new C14665b();
        private static final long serialVersionUID = 0;
        public final Map<String, String> addrs;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$Resource$a */
        public static final class C14664a extends Message.Builder<Resource, C14664a> {

            /* renamed from: a */
            public Map<String, String> f38783a = Internal.newMutableMap();

            /* renamed from: a */
            public Resource build() {
                return new Resource(this.f38783a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$Resource$b */
        private static final class C14665b extends ProtoAdapter<Resource> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f38784a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C14665b() {
                super(FieldEncoding.LENGTH_DELIMITED, Resource.class);
            }

            /* renamed from: a */
            public int encodedSize(Resource resource) {
                return this.f38784a.encodedSizeWithTag(1, resource.addrs) + resource.unknownFields().size();
            }

            /* renamed from: a */
            public Resource decode(ProtoReader protoReader) throws IOException {
                C14664a aVar = new C14664a();
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
                        aVar.f38783a.putAll(this.f38784a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Resource resource) throws IOException {
                this.f38784a.encodeWithTag(protoWriter, 1, resource.addrs);
                protoWriter.writeBytes(resource.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14664a newBuilder() {
            C14664a aVar = new C14664a();
            aVar.f38783a = Internal.copyOf("addrs", this.addrs);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Resource");
            StringBuilder sb = new StringBuilder();
            if (!this.addrs.isEmpty()) {
                sb.append(", addrs=");
                sb.append(this.addrs);
            }
            StringBuilder replace = sb.replace(0, 2, "Resource{");
            replace.append('}');
            return replace.toString();
        }

        public Resource(Map<String, String> map) {
            this(map, ByteString.EMPTY);
        }

        public Resource(Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.addrs = Internal.immutableCopyOf("addrs", map);
        }
    }

    public static final class URLRegex extends Message<URLRegex, C14672a> {
        public static final ProtoAdapter<URLRegex> ADAPTER = new C14673b();
        public static final Integer DEFAULT_TIME_OUT = Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR);
        private static final long serialVersionUID = 0;
        public final Map<Integer, String> regexes;
        public final Integer time_out;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$URLRegex$a */
        public static final class C14672a extends Message.Builder<URLRegex, C14672a> {

            /* renamed from: a */
            public Map<Integer, String> f38790a = Internal.newMutableMap();

            /* renamed from: b */
            public Integer f38791b;

            /* renamed from: a */
            public URLRegex build() {
                return new URLRegex(this.f38790a, this.f38791b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$URLRegex$b */
        private static final class C14673b extends ProtoAdapter<URLRegex> {

            /* renamed from: a */
            private final ProtoAdapter<Map<Integer, String>> f38792a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRING);

            C14673b() {
                super(FieldEncoding.LENGTH_DELIMITED, URLRegex.class);
            }

            /* renamed from: a */
            public int encodedSize(URLRegex uRLRegex) {
                int i;
                int encodedSizeWithTag = this.f38792a.encodedSizeWithTag(1, uRLRegex.regexes);
                if (uRLRegex.time_out != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, uRLRegex.time_out);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + uRLRegex.unknownFields().size();
            }

            /* renamed from: a */
            public URLRegex decode(ProtoReader protoReader) throws IOException {
                C14672a aVar = new C14672a();
                aVar.f38791b = Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38790a.putAll(this.f38792a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38791b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, URLRegex uRLRegex) throws IOException {
                this.f38792a.encodeWithTag(protoWriter, 1, uRLRegex.regexes);
                if (uRLRegex.time_out != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uRLRegex.time_out);
                }
                protoWriter.writeBytes(uRLRegex.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14672a newBuilder() {
            C14672a aVar = new C14672a();
            aVar.f38790a = Internal.copyOf("regexes", this.regexes);
            aVar.f38791b = this.time_out;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "URLRegex");
            StringBuilder sb = new StringBuilder();
            if (!this.regexes.isEmpty()) {
                sb.append(", regexes=");
                sb.append(this.regexes);
            }
            if (this.time_out != null) {
                sb.append(", time_out=");
                sb.append(this.time_out);
            }
            StringBuilder replace = sb.replace(0, 2, "URLRegex{");
            replace.append('}');
            return replace.toString();
        }

        public URLRegex(Map<Integer, String> map, Integer num) {
            this(map, num, ByteString.EMPTY);
        }

        public URLRegex(Map<Integer, String> map, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.regexes = Internal.immutableCopyOf("regexes", map);
            this.time_out = num;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfig$a */
    public static final class C14678a extends Message.Builder<AppConfig, C14678a> {

        /* renamed from: a */
        public MessageConfig f38797a;

        /* renamed from: b */
        public ChatConfig f38798b;

        /* renamed from: c */
        public VoiceCallConfig f38799c;

        /* renamed from: d */
        public URLConfig f38800d;

        /* renamed from: e */
        public Resource f38801e;

        /* renamed from: f */
        public DocUrlRegex f38802f;

        /* renamed from: g */
        public BillingPackageConfig f38803g;

        /* renamed from: h */
        public URLRegex f38804h;

        /* renamed from: i */
        public Zendesk f38805i;

        /* renamed from: j */
        public List<String> f38806j = Internal.newMutableList();

        /* renamed from: k */
        public Integer f38807k;

        /* renamed from: l */
        public SearchConfig f38808l;

        /* renamed from: m */
        public BannerConfig f38809m;

        /* renamed from: n */
        public CryptoChatState f38810n;

        /* renamed from: a */
        public AppConfig build() {
            return new AppConfig(this.f38797a, this.f38798b, this.f38799c, this.f38800d, this.f38801e, this.f38802f, this.f38803g, this.f38804h, this.f38805i, this.f38806j, this.f38807k, this.f38808l, this.f38809m, this.f38810n, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14678a newBuilder() {
        C14678a aVar = new C14678a();
        aVar.f38797a = this.message_config;
        aVar.f38798b = this.chat_config;
        aVar.f38799c = this.voice_call_config;
        aVar.f38800d = this.url_config;
        aVar.f38801e = this.resource;
        aVar.f38802f = this.doc_url_regex;
        aVar.f38803g = this.billing_package;
        aVar.f38804h = this.url_regex;
        aVar.f38805i = this.zendesk;
        aVar.f38806j = Internal.copyOf("android_app_stores", this.android_app_stores);
        aVar.f38807k = this.guide_to_rate_delay_hours;
        aVar.f38808l = this.search_config;
        aVar.f38809m = this.banner_config;
        aVar.f38810n = this.crypto_chat_state;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AppConfig");
        StringBuilder sb = new StringBuilder();
        if (this.message_config != null) {
            sb.append(", message_config=");
            sb.append(this.message_config);
        }
        if (this.chat_config != null) {
            sb.append(", chat_config=");
            sb.append(this.chat_config);
        }
        if (this.voice_call_config != null) {
            sb.append(", voice_call_config=");
            sb.append(this.voice_call_config);
        }
        if (this.url_config != null) {
            sb.append(", url_config=");
            sb.append(this.url_config);
        }
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        if (this.doc_url_regex != null) {
            sb.append(", doc_url_regex=");
            sb.append(this.doc_url_regex);
        }
        if (this.billing_package != null) {
            sb.append(", billing_package=");
            sb.append(this.billing_package);
        }
        if (this.url_regex != null) {
            sb.append(", url_regex=");
            sb.append(this.url_regex);
        }
        if (this.zendesk != null) {
            sb.append(", zendesk=");
            sb.append(this.zendesk);
        }
        if (!this.android_app_stores.isEmpty()) {
            sb.append(", android_app_stores=");
            sb.append(this.android_app_stores);
        }
        if (this.guide_to_rate_delay_hours != null) {
            sb.append(", guide_to_rate_delay_hours=");
            sb.append(this.guide_to_rate_delay_hours);
        }
        if (this.search_config != null) {
            sb.append(", search_config=");
            sb.append(this.search_config);
        }
        if (this.banner_config != null) {
            sb.append(", banner_config=");
            sb.append(this.banner_config);
        }
        if (this.crypto_chat_state != null) {
            sb.append(", crypto_chat_state=");
            sb.append(this.crypto_chat_state);
        }
        StringBuilder replace = sb.replace(0, 2, "AppConfig{");
        replace.append('}');
        return replace.toString();
    }

    public AppConfig(MessageConfig messageConfig, ChatConfig chatConfig, VoiceCallConfig voiceCallConfig, URLConfig uRLConfig, Resource resource2, DocUrlRegex docUrlRegex, BillingPackageConfig billingPackageConfig, URLRegex uRLRegex, Zendesk zendesk2, List<String> list, Integer num, SearchConfig searchConfig, BannerConfig bannerConfig, CryptoChatState cryptoChatState) {
        this(messageConfig, chatConfig, voiceCallConfig, uRLConfig, resource2, docUrlRegex, billingPackageConfig, uRLRegex, zendesk2, list, num, searchConfig, bannerConfig, cryptoChatState, ByteString.EMPTY);
    }

    public AppConfig(MessageConfig messageConfig, ChatConfig chatConfig, VoiceCallConfig voiceCallConfig, URLConfig uRLConfig, Resource resource2, DocUrlRegex docUrlRegex, BillingPackageConfig billingPackageConfig, URLRegex uRLRegex, Zendesk zendesk2, List<String> list, Integer num, SearchConfig searchConfig, BannerConfig bannerConfig, CryptoChatState cryptoChatState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_config = messageConfig;
        this.chat_config = chatConfig;
        this.voice_call_config = voiceCallConfig;
        this.url_config = uRLConfig;
        this.resource = resource2;
        this.doc_url_regex = docUrlRegex;
        this.billing_package = billingPackageConfig;
        this.url_regex = uRLRegex;
        this.zendesk = zendesk2;
        this.android_app_stores = Internal.immutableCopyOf("android_app_stores", list);
        this.guide_to_rate_delay_hours = num;
        this.search_config = searchConfig;
        this.banner_config = bannerConfig;
        this.crypto_chat_state = cryptoChatState;
    }
}
