package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class DocMessage extends Message<DocMessage, C14884a> {
    public static final ProtoAdapter<DocMessage> ADAPTER = new C14885b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_I18N_MESSAGE = false;
    public static final Type DEFAULT_TYPE = Type.MENTION;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String content;
    public final Long create_time;
    public final String doc_feed_id;
    public final String from_id;
    public final I18nInfo i18n_info;
    public final String id;
    public final Boolean is_i18n_message;
    public final RichText rich_text;
    public final Type type;
    public final Long update_time;

    public enum TmplParamElemType implements WireEnum {
        UNKNOWN(0),
        USER_ID(1),
        TEXT(2);
        
        public static final ProtoAdapter<TmplParamElemType> ADAPTER = ProtoAdapter.newEnumAdapter(TmplParamElemType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TmplParamElemType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER_ID;
            }
            if (i != 2) {
                return null;
            }
            return TEXT;
        }

        private TmplParamElemType(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        MENTION(1),
        COMMENT(2),
        REPLY(3),
        SOLVE(4),
        SHARE(5),
        REOPEN(6),
        COMMENT_REACTION(7),
        TEMPLATE_CARD(8),
        WITHDRAW(9);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_TYPE;
                case 1:
                    return MENTION;
                case 2:
                    return COMMENT;
                case 3:
                    return REPLY;
                case 4:
                    return SOLVE;
                case 5:
                    return SHARE;
                case 6:
                    return REOPEN;
                case 7:
                    return COMMENT_REACTION;
                case 8:
                    return TEMPLATE_CARD;
                case 9:
                    return WITHDRAW;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class TmplParamElement extends Message<TmplParamElement, C14882a> {
        public static final ProtoAdapter<TmplParamElement> ADAPTER = new C14883b();
        public static final TmplParamElemType DEFAULT_TYPE = TmplParamElemType.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String content;
        public final TmplParamElemType type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocMessage$TmplParamElement$b */
        private static final class C14883b extends ProtoAdapter<TmplParamElement> {
            C14883b() {
                super(FieldEncoding.LENGTH_DELIMITED, TmplParamElement.class);
            }

            /* renamed from: a */
            public int encodedSize(TmplParamElement tmplParamElement) {
                int i;
                int i2 = 0;
                if (tmplParamElement.type != null) {
                    i = TmplParamElemType.ADAPTER.encodedSizeWithTag(1, tmplParamElement.type);
                } else {
                    i = 0;
                }
                if (tmplParamElement.content != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, tmplParamElement.content);
                }
                return i + i2 + tmplParamElement.unknownFields().size();
            }

            /* renamed from: a */
            public TmplParamElement decode(ProtoReader protoReader) throws IOException {
                C14882a aVar = new C14882a();
                aVar.f39372a = TmplParamElemType.UNKNOWN;
                aVar.f39373b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39372a = TmplParamElemType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39373b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TmplParamElement tmplParamElement) throws IOException {
                if (tmplParamElement.type != null) {
                    TmplParamElemType.ADAPTER.encodeWithTag(protoWriter, 1, tmplParamElement.type);
                }
                if (tmplParamElement.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, tmplParamElement.content);
                }
                protoWriter.writeBytes(tmplParamElement.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocMessage$TmplParamElement$a */
        public static final class C14882a extends Message.Builder<TmplParamElement, C14882a> {

            /* renamed from: a */
            public TmplParamElemType f39372a;

            /* renamed from: b */
            public String f39373b;

            /* renamed from: a */
            public TmplParamElement build() {
                return new TmplParamElement(this.f39372a, this.f39373b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14882a newBuilder() {
            C14882a aVar = new C14882a();
            aVar.f39372a = this.type;
            aVar.f39373b = this.content;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TmplParamElement");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            StringBuilder replace = sb.replace(0, 2, "TmplParamElement{");
            replace.append('}');
            return replace.toString();
        }

        public TmplParamElement(TmplParamElemType tmplParamElemType, String str) {
            this(tmplParamElemType, str, ByteString.EMPTY);
        }

        public TmplParamElement(TmplParamElemType tmplParamElemType, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = tmplParamElemType;
            this.content = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocMessage$b */
    private static final class C14885b extends ProtoAdapter<DocMessage> {
        C14885b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocMessage.class);
        }

        /* renamed from: a */
        public int encodedSize(DocMessage docMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docMessage.id);
            int i8 = 0;
            if (docMessage.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, docMessage.type);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (docMessage.create_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, docMessage.create_time);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (docMessage.update_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, docMessage.update_time);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (docMessage.content != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, docMessage.content);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i11 + i4 + ProtoAdapter.STRING.encodedSizeWithTag(6, docMessage.doc_feed_id);
            if (docMessage.from_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, docMessage.from_id);
            } else {
                i5 = 0;
            }
            int i12 = encodedSizeWithTag2 + i5;
            if (docMessage.rich_text != null) {
                i6 = RichText.ADAPTER.encodedSizeWithTag(8, docMessage.rich_text);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (docMessage.is_i18n_message != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, docMessage.is_i18n_message);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (docMessage.i18n_info != null) {
                i8 = I18nInfo.ADAPTER.encodedSizeWithTag(10, docMessage.i18n_info);
            }
            return i14 + i8 + docMessage.unknownFields().size();
        }

        /* renamed from: a */
        public DocMessage decode(ProtoReader protoReader) throws IOException {
            C14884a aVar = new C14884a();
            aVar.f39374a = "";
            aVar.f39375b = Type.MENTION;
            aVar.f39376c = 0L;
            aVar.f39377d = 0L;
            aVar.f39378e = "";
            aVar.f39379f = "";
            aVar.f39380g = "";
            aVar.f39382i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39374a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f39375b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f39376c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39377d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39378e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39379f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39380g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39381h = RichText.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39382i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39383j = I18nInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DocMessage docMessage) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMessage.id);
            if (docMessage.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, docMessage.type);
            }
            if (docMessage.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, docMessage.create_time);
            }
            if (docMessage.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, docMessage.update_time);
            }
            if (docMessage.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docMessage.content);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, docMessage.doc_feed_id);
            if (docMessage.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, docMessage.from_id);
            }
            if (docMessage.rich_text != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 8, docMessage.rich_text);
            }
            if (docMessage.is_i18n_message != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, docMessage.is_i18n_message);
            }
            if (docMessage.i18n_info != null) {
                I18nInfo.ADAPTER.encodeWithTag(protoWriter, 10, docMessage.i18n_info);
            }
            protoWriter.writeBytes(docMessage.unknownFields());
        }
    }

    public static final class I18nInfo extends Message<I18nInfo, C14880a> {
        public static final ProtoAdapter<I18nInfo> ADAPTER = new C14881b();
        public static final Long DEFAULT_TEXT_TMPL_CODE = 0L;
        public static final Long DEFAULT_TITLE_TMPL_CODE = 0L;
        private static final long serialVersionUID = 0;
        public final Map<String, RichText> i18n_richtexts;
        public final Map<String, String> i18n_titles;
        public final Long text_tmpl_code;
        public final String text_tmpl_key;
        public final Map<String, TmplParamElement> text_tmpl_params;
        public final Map<String, TmplParamElement> text_tmpl_params_v2;
        public final Long title_tmpl_code;
        public final String title_tmpl_key;
        public final Map<String, TmplParamElement> title_tmpl_params;

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocMessage$I18nInfo$a */
        public static final class C14880a extends Message.Builder<I18nInfo, C14880a> {

            /* renamed from: a */
            public Map<String, String> f39358a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, RichText> f39359b = Internal.newMutableMap();

            /* renamed from: c */
            public Long f39360c;

            /* renamed from: d */
            public Long f39361d;

            /* renamed from: e */
            public Map<String, TmplParamElement> f39362e = Internal.newMutableMap();

            /* renamed from: f */
            public Map<String, TmplParamElement> f39363f = Internal.newMutableMap();

            /* renamed from: g */
            public String f39364g;

            /* renamed from: h */
            public String f39365h;

            /* renamed from: i */
            public Map<String, TmplParamElement> f39366i = Internal.newMutableMap();

            /* renamed from: a */
            public I18nInfo build() {
                return new I18nInfo(this.f39358a, this.f39359b, this.f39360c, this.f39361d, this.f39362e, this.f39363f, this.f39364g, this.f39365h, this.f39366i, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocMessage$I18nInfo$b */
        private static final class C14881b extends ProtoAdapter<I18nInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f39367a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, RichText>> f39368b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, RichText.ADAPTER);

            /* renamed from: c */
            private final ProtoAdapter<Map<String, TmplParamElement>> f39369c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TmplParamElement.ADAPTER);

            /* renamed from: d */
            private final ProtoAdapter<Map<String, TmplParamElement>> f39370d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TmplParamElement.ADAPTER);

            /* renamed from: e */
            private final ProtoAdapter<Map<String, TmplParamElement>> f39371e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TmplParamElement.ADAPTER);

            C14881b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nInfo i18nInfo) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = this.f39367a.encodedSizeWithTag(1, i18nInfo.i18n_titles) + this.f39368b.encodedSizeWithTag(2, i18nInfo.i18n_richtexts);
                int i4 = 0;
                if (i18nInfo.title_tmpl_code != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(3, i18nInfo.title_tmpl_code);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (i18nInfo.text_tmpl_code != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, i18nInfo.text_tmpl_code);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag2 = i5 + i2 + this.f39369c.encodedSizeWithTag(5, i18nInfo.title_tmpl_params) + this.f39370d.encodedSizeWithTag(6, i18nInfo.text_tmpl_params);
                if (i18nInfo.title_tmpl_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, i18nInfo.title_tmpl_key);
                } else {
                    i3 = 0;
                }
                int i6 = encodedSizeWithTag2 + i3;
                if (i18nInfo.text_tmpl_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, i18nInfo.text_tmpl_key);
                }
                return i6 + i4 + this.f39371e.encodedSizeWithTag(9, i18nInfo.text_tmpl_params_v2) + i18nInfo.unknownFields().size();
            }

            /* renamed from: a */
            public I18nInfo decode(ProtoReader protoReader) throws IOException {
                C14880a aVar = new C14880a();
                aVar.f39360c = 0L;
                aVar.f39361d = 0L;
                aVar.f39364g = "";
                aVar.f39365h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f39358a.putAll(this.f39367a.decode(protoReader));
                                break;
                            case 2:
                                aVar.f39359b.putAll(this.f39368b.decode(protoReader));
                                break;
                            case 3:
                                aVar.f39360c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f39361d = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                aVar.f39362e.putAll(this.f39369c.decode(protoReader));
                                break;
                            case 6:
                                aVar.f39363f.putAll(this.f39370d.decode(protoReader));
                                break;
                            case 7:
                                aVar.f39364g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f39365h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f39366i.putAll(this.f39371e.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, I18nInfo i18nInfo) throws IOException {
                this.f39367a.encodeWithTag(protoWriter, 1, i18nInfo.i18n_titles);
                this.f39368b.encodeWithTag(protoWriter, 2, i18nInfo.i18n_richtexts);
                if (i18nInfo.title_tmpl_code != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, i18nInfo.title_tmpl_code);
                }
                if (i18nInfo.text_tmpl_code != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, i18nInfo.text_tmpl_code);
                }
                this.f39369c.encodeWithTag(protoWriter, 5, i18nInfo.title_tmpl_params);
                this.f39370d.encodeWithTag(protoWriter, 6, i18nInfo.text_tmpl_params);
                if (i18nInfo.title_tmpl_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, i18nInfo.title_tmpl_key);
                }
                if (i18nInfo.text_tmpl_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, i18nInfo.text_tmpl_key);
                }
                this.f39371e.encodeWithTag(protoWriter, 9, i18nInfo.text_tmpl_params_v2);
                protoWriter.writeBytes(i18nInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14880a newBuilder() {
            C14880a aVar = new C14880a();
            aVar.f39358a = Internal.copyOf("i18n_titles", this.i18n_titles);
            aVar.f39359b = Internal.copyOf("i18n_richtexts", this.i18n_richtexts);
            aVar.f39360c = this.title_tmpl_code;
            aVar.f39361d = this.text_tmpl_code;
            aVar.f39362e = Internal.copyOf("title_tmpl_params", this.title_tmpl_params);
            aVar.f39363f = Internal.copyOf("text_tmpl_params", this.text_tmpl_params);
            aVar.f39364g = this.title_tmpl_key;
            aVar.f39365h = this.text_tmpl_key;
            aVar.f39366i = Internal.copyOf("text_tmpl_params_v2", this.text_tmpl_params_v2);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "I18nInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.i18n_titles.isEmpty()) {
                sb.append(", i18n_titles=");
                sb.append(this.i18n_titles);
            }
            if (!this.i18n_richtexts.isEmpty()) {
                sb.append(", i18n_richtexts=");
                sb.append(this.i18n_richtexts);
            }
            if (this.title_tmpl_code != null) {
                sb.append(", title_tmpl_code=");
                sb.append(this.title_tmpl_code);
            }
            if (this.text_tmpl_code != null) {
                sb.append(", text_tmpl_code=");
                sb.append(this.text_tmpl_code);
            }
            if (!this.title_tmpl_params.isEmpty()) {
                sb.append(", title_tmpl_params=");
                sb.append(this.title_tmpl_params);
            }
            if (!this.text_tmpl_params.isEmpty()) {
                sb.append(", text_tmpl_params=");
                sb.append(this.text_tmpl_params);
            }
            if (this.title_tmpl_key != null) {
                sb.append(", title_tmpl_key=");
                sb.append(this.title_tmpl_key);
            }
            if (this.text_tmpl_key != null) {
                sb.append(", text_tmpl_key=");
                sb.append(this.text_tmpl_key);
            }
            if (!this.text_tmpl_params_v2.isEmpty()) {
                sb.append(", text_tmpl_params_v2=");
                sb.append(this.text_tmpl_params_v2);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nInfo{");
            replace.append('}');
            return replace.toString();
        }

        public I18nInfo(Map<String, String> map, Map<String, RichText> map2, Long l, Long l2, Map<String, TmplParamElement> map3, Map<String, TmplParamElement> map4, String str, String str2, Map<String, TmplParamElement> map5) {
            this(map, map2, l, l2, map3, map4, str, str2, map5, ByteString.EMPTY);
        }

        public I18nInfo(Map<String, String> map, Map<String, RichText> map2, Long l, Long l2, Map<String, TmplParamElement> map3, Map<String, TmplParamElement> map4, String str, String str2, Map<String, TmplParamElement> map5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.i18n_titles = Internal.immutableCopyOf("i18n_titles", map);
            this.i18n_richtexts = Internal.immutableCopyOf("i18n_richtexts", map2);
            this.title_tmpl_code = l;
            this.text_tmpl_code = l2;
            this.title_tmpl_params = Internal.immutableCopyOf("title_tmpl_params", map3);
            this.text_tmpl_params = Internal.immutableCopyOf("text_tmpl_params", map4);
            this.title_tmpl_key = str;
            this.text_tmpl_key = str2;
            this.text_tmpl_params_v2 = Internal.immutableCopyOf("text_tmpl_params_v2", map5);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocMessage$a */
    public static final class C14884a extends Message.Builder<DocMessage, C14884a> {

        /* renamed from: a */
        public String f39374a;

        /* renamed from: b */
        public Type f39375b;

        /* renamed from: c */
        public Long f39376c;

        /* renamed from: d */
        public Long f39377d;

        /* renamed from: e */
        public String f39378e;

        /* renamed from: f */
        public String f39379f;

        /* renamed from: g */
        public String f39380g;

        /* renamed from: h */
        public RichText f39381h;

        /* renamed from: i */
        public Boolean f39382i;

        /* renamed from: j */
        public I18nInfo f39383j;

        /* renamed from: a */
        public DocMessage build() {
            String str;
            String str2 = this.f39374a;
            if (str2 != null && (str = this.f39379f) != null) {
                return new DocMessage(str2, this.f39375b, this.f39376c, this.f39377d, this.f39378e, str, this.f39380g, this.f39381h, this.f39382i, this.f39383j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f39379f, "doc_feed_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14884a newBuilder() {
        C14884a aVar = new C14884a();
        aVar.f39374a = this.id;
        aVar.f39375b = this.type;
        aVar.f39376c = this.create_time;
        aVar.f39377d = this.update_time;
        aVar.f39378e = this.content;
        aVar.f39379f = this.doc_feed_id;
        aVar.f39380g = this.from_id;
        aVar.f39381h = this.rich_text;
        aVar.f39382i = this.is_i18n_message;
        aVar.f39383j = this.i18n_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DocMessage");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        sb.append(", doc_feed_id=");
        sb.append(this.doc_feed_id);
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.rich_text != null) {
            sb.append(", rich_text=");
            sb.append(this.rich_text);
        }
        if (this.is_i18n_message != null) {
            sb.append(", is_i18n_message=");
            sb.append(this.is_i18n_message);
        }
        if (this.i18n_info != null) {
            sb.append(", i18n_info=");
            sb.append(this.i18n_info);
        }
        StringBuilder replace = sb.replace(0, 2, "DocMessage{");
        replace.append('}');
        return replace.toString();
    }

    public DocMessage(String str, Type type2, Long l, Long l2, String str2, String str3, String str4, RichText richText, Boolean bool, I18nInfo i18nInfo) {
        this(str, type2, l, l2, str2, str3, str4, richText, bool, i18nInfo, ByteString.EMPTY);
    }

    public DocMessage(String str, Type type2, Long l, Long l2, String str2, String str3, String str4, RichText richText, Boolean bool, I18nInfo i18nInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.create_time = l;
        this.update_time = l2;
        this.content = str2;
        this.doc_feed_id = str3;
        this.from_id = str4;
        this.rich_text = richText;
        this.is_i18n_message = bool;
        this.i18n_info = i18nInfo;
    }
}
