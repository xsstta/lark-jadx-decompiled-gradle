package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class UniversalSelectors extends Message<UniversalSelectors, C19105a> {
    public static final ProtoAdapter<UniversalSelectors> ADAPTER = new C19106b();
    private static final long serialVersionUID = 0;

    public enum RenderType implements WireEnum {
        AS_CARD(1),
        BLOCK(2),
        JSON_RAW(3);
        
        public static final ProtoAdapter<RenderType> ADAPTER = ProtoAdapter.newEnumAdapter(RenderType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RenderType fromValue(int i) {
            if (i == 1) {
                return AS_CARD;
            }
            if (i == 2) {
                return BLOCK;
            }
            if (i != 3) {
                return null;
            }
            return JSON_RAW;
        }

        private RenderType(int i) {
            this.value = i;
        }
    }

    public static final class CustomizationSelector extends Message<CustomizationSelector, C19095a> {
        public static final ProtoAdapter<CustomizationSelector> ADAPTER = new C19096b();
        public static final RenderType DEFAULT_RENDER_TYPE = RenderType.AS_CARD;
        private static final long serialVersionUID = 0;
        public final RenderType render_type;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$CustomizationSelector$b */
        private static final class C19096b extends ProtoAdapter<CustomizationSelector> {
            C19096b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomizationSelector.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomizationSelector customizationSelector) {
                int i;
                if (customizationSelector.render_type != null) {
                    i = RenderType.ADAPTER.encodedSizeWithTag(1, customizationSelector.render_type);
                } else {
                    i = 0;
                }
                return i + customizationSelector.unknownFields().size();
            }

            /* renamed from: a */
            public CustomizationSelector decode(ProtoReader protoReader) throws IOException {
                C19095a aVar = new C19095a();
                aVar.f47211a = RenderType.AS_CARD;
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
                        try {
                            aVar.f47211a = RenderType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CustomizationSelector customizationSelector) throws IOException {
                if (customizationSelector.render_type != null) {
                    RenderType.ADAPTER.encodeWithTag(protoWriter, 1, customizationSelector.render_type);
                }
                protoWriter.writeBytes(customizationSelector.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$CustomizationSelector$a */
        public static final class C19095a extends Message.Builder<CustomizationSelector, C19095a> {

            /* renamed from: a */
            public RenderType f47211a;

            /* renamed from: a */
            public CustomizationSelector build() {
                return new CustomizationSelector(this.f47211a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19095a mo65324a(RenderType renderType) {
                this.f47211a = renderType;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19095a newBuilder() {
            C19095a aVar = new C19095a();
            aVar.f47211a = this.render_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "CustomizationSelector");
            StringBuilder sb = new StringBuilder();
            if (this.render_type != null) {
                sb.append(", render_type=");
                sb.append(this.render_type);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomizationSelector{");
            replace.append('}');
            return replace.toString();
        }

        public CustomizationSelector(RenderType renderType) {
            this(renderType, ByteString.EMPTY);
        }

        public CustomizationSelector(RenderType renderType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.render_type = renderType;
        }
    }

    public static final class MessageSelector extends Message<MessageSelector, C19097a> {
        public static final ProtoAdapter<MessageSelector> ADAPTER = new C19098b();
        public static final Boolean DEFAULT_IS_AGGREGATED = false;
        public static final Long DEFAULT_LAST_CREATE_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Boolean is_aggregated;
        public final Long last_create_time;
        public final String last_id;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$MessageSelector$b */
        private static final class C19098b extends ProtoAdapter<MessageSelector> {
            C19098b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageSelector.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageSelector messageSelector) {
                int i;
                int i2;
                int i3 = 0;
                if (messageSelector.is_aggregated != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, messageSelector.is_aggregated);
                } else {
                    i = 0;
                }
                if (messageSelector.last_create_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, messageSelector.last_create_time);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (messageSelector.last_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, messageSelector.last_id);
                }
                return i4 + i3 + messageSelector.unknownFields().size();
            }

            /* renamed from: a */
            public MessageSelector decode(ProtoReader protoReader) throws IOException {
                C19097a aVar = new C19097a();
                aVar.f47212a = false;
                aVar.f47213b = 0L;
                aVar.f47214c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47212a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f47213b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47214c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageSelector messageSelector) throws IOException {
                if (messageSelector.is_aggregated != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, messageSelector.is_aggregated);
                }
                if (messageSelector.last_create_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messageSelector.last_create_time);
                }
                if (messageSelector.last_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, messageSelector.last_id);
                }
                protoWriter.writeBytes(messageSelector.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$MessageSelector$a */
        public static final class C19097a extends Message.Builder<MessageSelector, C19097a> {

            /* renamed from: a */
            public Boolean f47212a;

            /* renamed from: b */
            public Long f47213b;

            /* renamed from: c */
            public String f47214c;

            /* renamed from: a */
            public MessageSelector build() {
                return new MessageSelector(this.f47212a, this.f47213b, this.f47214c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19097a newBuilder() {
            C19097a aVar = new C19097a();
            aVar.f47212a = this.is_aggregated;
            aVar.f47213b = this.last_create_time;
            aVar.f47214c = this.last_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "MessageSelector");
            StringBuilder sb = new StringBuilder();
            if (this.is_aggregated != null) {
                sb.append(", is_aggregated=");
                sb.append(this.is_aggregated);
            }
            if (this.last_create_time != null) {
                sb.append(", last_create_time=");
                sb.append(this.last_create_time);
            }
            if (this.last_id != null) {
                sb.append(", last_id=");
                sb.append(this.last_id);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageSelector{");
            replace.append('}');
            return replace.toString();
        }

        public MessageSelector(Boolean bool, Long l, String str) {
            this(bool, l, str, ByteString.EMPTY);
        }

        public MessageSelector(Boolean bool, Long l, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_aggregated = bool;
            this.last_create_time = l;
            this.last_id = str;
        }
    }

    public static final class QaCardSelector extends Message<QaCardSelector, C19099a> {
        public static final ProtoAdapter<QaCardSelector> ADAPTER = new C19100b();
        public static final RenderType DEFAULT_RENDER_TYPE = RenderType.AS_CARD;
        private static final long serialVersionUID = 0;
        public final RenderType render_type;
        public final String template;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$QaCardSelector$b */
        private static final class C19100b extends ProtoAdapter<QaCardSelector> {
            C19100b() {
                super(FieldEncoding.LENGTH_DELIMITED, QaCardSelector.class);
            }

            /* renamed from: a */
            public int encodedSize(QaCardSelector qaCardSelector) {
                int i;
                int i2 = 0;
                if (qaCardSelector.template != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, qaCardSelector.template);
                } else {
                    i = 0;
                }
                if (qaCardSelector.render_type != null) {
                    i2 = RenderType.ADAPTER.encodedSizeWithTag(2, qaCardSelector.render_type);
                }
                return i + i2 + qaCardSelector.unknownFields().size();
            }

            /* renamed from: a */
            public QaCardSelector decode(ProtoReader protoReader) throws IOException {
                C19099a aVar = new C19099a();
                aVar.f47215a = "";
                aVar.f47216b = RenderType.AS_CARD;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47215a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f47216b = RenderType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, QaCardSelector qaCardSelector) throws IOException {
                if (qaCardSelector.template != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, qaCardSelector.template);
                }
                if (qaCardSelector.render_type != null) {
                    RenderType.ADAPTER.encodeWithTag(protoWriter, 2, qaCardSelector.render_type);
                }
                protoWriter.writeBytes(qaCardSelector.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$QaCardSelector$a */
        public static final class C19099a extends Message.Builder<QaCardSelector, C19099a> {

            /* renamed from: a */
            public String f47215a;

            /* renamed from: b */
            public RenderType f47216b;

            /* renamed from: a */
            public QaCardSelector build() {
                return new QaCardSelector(this.f47215a, this.f47216b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19099a mo65333a(RenderType renderType) {
                this.f47216b = renderType;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19099a newBuilder() {
            C19099a aVar = new C19099a();
            aVar.f47215a = this.template;
            aVar.f47216b = this.render_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "QaCardSelector");
            StringBuilder sb = new StringBuilder();
            if (this.template != null) {
                sb.append(", template=");
                sb.append(this.template);
            }
            if (this.render_type != null) {
                sb.append(", render_type=");
                sb.append(this.render_type);
            }
            StringBuilder replace = sb.replace(0, 2, "QaCardSelector{");
            replace.append('}');
            return replace.toString();
        }

        public QaCardSelector(String str, RenderType renderType) {
            this(str, renderType, ByteString.EMPTY);
        }

        public QaCardSelector(String str, RenderType renderType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.template = str;
            this.render_type = renderType;
        }
    }

    public static final class ServiceCardSelector extends Message<ServiceCardSelector, C19101a> {
        public static final ProtoAdapter<ServiceCardSelector> ADAPTER = new C19102b();
        public static final RenderType DEFAULT_RENDER_TYPE = RenderType.AS_CARD;
        private static final long serialVersionUID = 0;
        public final RenderType render_type;
        public final String template;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$ServiceCardSelector$b */
        private static final class C19102b extends ProtoAdapter<ServiceCardSelector> {
            C19102b() {
                super(FieldEncoding.LENGTH_DELIMITED, ServiceCardSelector.class);
            }

            /* renamed from: a */
            public int encodedSize(ServiceCardSelector serviceCardSelector) {
                int i;
                int i2 = 0;
                if (serviceCardSelector.template != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, serviceCardSelector.template);
                } else {
                    i = 0;
                }
                if (serviceCardSelector.render_type != null) {
                    i2 = RenderType.ADAPTER.encodedSizeWithTag(2, serviceCardSelector.render_type);
                }
                return i + i2 + serviceCardSelector.unknownFields().size();
            }

            /* renamed from: a */
            public ServiceCardSelector decode(ProtoReader protoReader) throws IOException {
                C19101a aVar = new C19101a();
                aVar.f47217a = "";
                aVar.f47218b = RenderType.AS_CARD;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47217a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f47218b = RenderType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ServiceCardSelector serviceCardSelector) throws IOException {
                if (serviceCardSelector.template != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serviceCardSelector.template);
                }
                if (serviceCardSelector.render_type != null) {
                    RenderType.ADAPTER.encodeWithTag(protoWriter, 2, serviceCardSelector.render_type);
                }
                protoWriter.writeBytes(serviceCardSelector.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$ServiceCardSelector$a */
        public static final class C19101a extends Message.Builder<ServiceCardSelector, C19101a> {

            /* renamed from: a */
            public String f47217a;

            /* renamed from: b */
            public RenderType f47218b;

            /* renamed from: a */
            public ServiceCardSelector build() {
                return new ServiceCardSelector(this.f47217a, this.f47218b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19101a mo65338a(RenderType renderType) {
                this.f47218b = renderType;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19101a newBuilder() {
            C19101a aVar = new C19101a();
            aVar.f47217a = this.template;
            aVar.f47218b = this.render_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ServiceCardSelector");
            StringBuilder sb = new StringBuilder();
            if (this.template != null) {
                sb.append(", template=");
                sb.append(this.template);
            }
            if (this.render_type != null) {
                sb.append(", render_type=");
                sb.append(this.render_type);
            }
            StringBuilder replace = sb.replace(0, 2, "ServiceCardSelector{");
            replace.append('}');
            return replace.toString();
        }

        public ServiceCardSelector(String str, RenderType renderType) {
            this(str, renderType, ByteString.EMPTY);
        }

        public ServiceCardSelector(String str, RenderType renderType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.template = str;
            this.render_type = renderType;
        }
    }

    public static final class UserSelector extends Message<UserSelector, C19103a> {
        public static final ProtoAdapter<UserSelector> ADAPTER = new C19104b();
        private static final long serialVersionUID = 0;
        public final String is_in_chat_id;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$UserSelector$b */
        private static final class C19104b extends ProtoAdapter<UserSelector> {
            C19104b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserSelector.class);
            }

            /* renamed from: a */
            public int encodedSize(UserSelector userSelector) {
                int i;
                if (userSelector.is_in_chat_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, userSelector.is_in_chat_id);
                } else {
                    i = 0;
                }
                return i + userSelector.unknownFields().size();
            }

            /* renamed from: a */
            public UserSelector decode(ProtoReader protoReader) throws IOException {
                C19103a aVar = new C19103a();
                aVar.f47219a = "";
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
                        aVar.f47219a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserSelector userSelector) throws IOException {
                if (userSelector.is_in_chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userSelector.is_in_chat_id);
                }
                protoWriter.writeBytes(userSelector.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$UserSelector$a */
        public static final class C19103a extends Message.Builder<UserSelector, C19103a> {

            /* renamed from: a */
            public String f47219a;

            /* renamed from: a */
            public UserSelector build() {
                return new UserSelector(this.f47219a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19103a mo65343a(String str) {
                this.f47219a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19103a newBuilder() {
            C19103a aVar = new C19103a();
            aVar.f47219a = this.is_in_chat_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "UserSelector");
            StringBuilder sb = new StringBuilder();
            if (this.is_in_chat_id != null) {
                sb.append(", is_in_chat_id=");
                sb.append(this.is_in_chat_id);
            }
            StringBuilder replace = sb.replace(0, 2, "UserSelector{");
            replace.append('}');
            return replace.toString();
        }

        public UserSelector(String str) {
            this(str, ByteString.EMPTY);
        }

        public UserSelector(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_in_chat_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$b */
    private static final class C19106b extends ProtoAdapter<UniversalSelectors> {
        C19106b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalSelectors.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalSelectors universalSelectors) {
            return universalSelectors.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalSelectors decode(ProtoReader protoReader) throws IOException {
            C19105a aVar = new C19105a();
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
        public void encode(ProtoWriter protoWriter, UniversalSelectors universalSelectors) throws IOException {
            protoWriter.writeBytes(universalSelectors.unknownFields());
        }
    }

    public UniversalSelectors() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSelectors$a */
    public static final class C19105a extends Message.Builder<UniversalSelectors, C19105a> {
        /* renamed from: a */
        public UniversalSelectors build() {
            return new UniversalSelectors(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19105a newBuilder() {
        C19105a aVar = new C19105a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UniversalSelectors");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UniversalSelectors{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalSelectors(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
