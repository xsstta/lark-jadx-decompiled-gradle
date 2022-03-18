package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.Message;
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

public final class SearchMessageMeta extends Message<SearchMessageMeta, C18895a> {
    public static final ProtoAdapter<SearchMessageMeta> ADAPTER = new C18896b();
    public static final Boolean DEFAULT_IS_IN_MY_NUT_STORE = false;
    public static final Boolean DEFAULT_IS_P2P_CHAT = false;
    public static final Long DEFAULT_P2P_CHATTER_ID = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String channel_id;
    public final String chat_id;
    public final List<DocExtraInfo> doc_extra_infos;
    public final File file_meta;
    public final String from_avatar_key;
    public final String from_id;
    public final String from_name;
    public final String id;
    public final Boolean is_in_my_nut_store;
    public final Boolean is_p2p_chat;
    public final String p2p_bot_id;
    public final Long p2p_chatter_id;
    public final String p2p_chatter_id_string;
    public final Integer position;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;
    public final Message.Type type;
    public final Long update_time;

    public static final class DocExtraInfo extends com.squareup.wire.Message<DocExtraInfo, C18893a> {
        public static final ProtoAdapter<DocExtraInfo> ADAPTER = new C18894b();
        public static final Doc.Type DEFAULT_TYPE = Doc.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String name;
        public final Doc.Type type;
        public final String url;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchMessageMeta$DocExtraInfo$b */
        private static final class C18894b extends ProtoAdapter<DocExtraInfo> {
            C18894b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocExtraInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(DocExtraInfo docExtraInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (docExtraInfo.type != null) {
                    i = Doc.Type.ADAPTER.encodedSizeWithTag(1, docExtraInfo.type);
                } else {
                    i = 0;
                }
                if (docExtraInfo.url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, docExtraInfo.url);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (docExtraInfo.name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, docExtraInfo.name);
                }
                return i4 + i3 + docExtraInfo.unknownFields().size();
            }

            /* renamed from: a */
            public DocExtraInfo decode(ProtoReader protoReader) throws IOException {
                C18893a aVar = new C18893a();
                aVar.f46699a = Doc.Type.UNKNOWN;
                aVar.f46700b = "";
                aVar.f46701c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f46699a = Doc.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f46700b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46701c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocExtraInfo docExtraInfo) throws IOException {
                if (docExtraInfo.type != null) {
                    Doc.Type.ADAPTER.encodeWithTag(protoWriter, 1, docExtraInfo.type);
                }
                if (docExtraInfo.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docExtraInfo.url);
                }
                if (docExtraInfo.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, docExtraInfo.name);
                }
                protoWriter.writeBytes(docExtraInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchMessageMeta$DocExtraInfo$a */
        public static final class C18893a extends Message.Builder<DocExtraInfo, C18893a> {

            /* renamed from: a */
            public Doc.Type f46699a;

            /* renamed from: b */
            public String f46700b;

            /* renamed from: c */
            public String f46701c;

            /* renamed from: a */
            public DocExtraInfo build() {
                return new DocExtraInfo(this.f46699a, this.f46700b, this.f46701c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18893a newBuilder() {
            C18893a aVar = new C18893a();
            aVar.f46699a = this.type;
            aVar.f46700b = this.url;
            aVar.f46701c = this.name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "DocExtraInfo");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            StringBuilder replace = sb.replace(0, 2, "DocExtraInfo{");
            replace.append('}');
            return replace.toString();
        }

        public DocExtraInfo(Doc.Type type2, String str, String str2) {
            this(type2, str, str2, ByteString.EMPTY);
        }

        public DocExtraInfo(Doc.Type type2, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.url = str;
            this.name = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchMessageMeta$b */
    private static final class C18896b extends ProtoAdapter<SearchMessageMeta> {
        C18896b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMessageMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMessageMeta searchMessageMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchMessageMeta.id);
            int i17 = 0;
            if (searchMessageMeta.type != null) {
                i = Message.Type.ADAPTER.encodedSizeWithTag(2, searchMessageMeta.type);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (searchMessageMeta.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, searchMessageMeta.update_time);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (searchMessageMeta.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchMessageMeta.position);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (searchMessageMeta.chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchMessageMeta.chat_id);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (searchMessageMeta.channel_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchMessageMeta.channel_id);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (searchMessageMeta.file_meta != null) {
                i6 = File.ADAPTER.encodedSizeWithTag(7, searchMessageMeta.file_meta);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (searchMessageMeta.from_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, searchMessageMeta.from_id);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (searchMessageMeta.is_in_my_nut_store != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, searchMessageMeta.is_in_my_nut_store);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (searchMessageMeta.from_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchMessageMeta.from_name);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (searchMessageMeta.thread_position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, searchMessageMeta.thread_position);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (searchMessageMeta.thread_chat_position != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(12, searchMessageMeta.thread_chat_position);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (searchMessageMeta.thread_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, searchMessageMeta.thread_id);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag2 = i28 + i12 + DocExtraInfo.ADAPTER.asRepeated().encodedSizeWithTag(14, searchMessageMeta.doc_extra_infos);
            if (searchMessageMeta.from_avatar_key != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(15, searchMessageMeta.from_avatar_key);
            } else {
                i13 = 0;
            }
            int i29 = encodedSizeWithTag2 + i13;
            if (searchMessageMeta.p2p_bot_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(16, searchMessageMeta.p2p_bot_id);
            } else {
                i14 = 0;
            }
            int i30 = i29 + i14;
            if (searchMessageMeta.p2p_chatter_id != null) {
                i15 = ProtoAdapter.INT64.encodedSizeWithTag(17, searchMessageMeta.p2p_chatter_id);
            } else {
                i15 = 0;
            }
            int i31 = i30 + i15;
            if (searchMessageMeta.is_p2p_chat != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(18, searchMessageMeta.is_p2p_chat);
            } else {
                i16 = 0;
            }
            int i32 = i31 + i16;
            if (searchMessageMeta.p2p_chatter_id_string != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(19, searchMessageMeta.p2p_chatter_id_string);
            }
            return i32 + i17 + searchMessageMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMessageMeta decode(ProtoReader protoReader) throws IOException {
            C18895a aVar = new C18895a();
            aVar.f46702a = "";
            aVar.f46703b = Message.Type.UNKNOWN;
            aVar.f46704c = 0L;
            aVar.f46705d = 0;
            aVar.f46706e = "";
            aVar.f46707f = "";
            aVar.f46709h = "";
            aVar.f46710i = false;
            aVar.f46711j = "";
            aVar.f46712k = 0;
            aVar.f46713l = 0;
            aVar.f46714m = "";
            aVar.f46716o = "";
            aVar.f46717p = "";
            aVar.f46718q = 0L;
            aVar.f46719r = false;
            aVar.f46720s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46702a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46703b = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46704c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46705d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46706e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46707f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46708g = File.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46709h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46710i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46711j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46712k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46713l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46714m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46715n.add(DocExtraInfo.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            aVar.f46716o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f46717p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f46718q = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 18:
                            aVar.f46719r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f46720s = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchMessageMeta searchMessageMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchMessageMeta.id);
            if (searchMessageMeta.type != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 2, searchMessageMeta.type);
            }
            if (searchMessageMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchMessageMeta.update_time);
            }
            if (searchMessageMeta.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchMessageMeta.position);
            }
            if (searchMessageMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchMessageMeta.chat_id);
            }
            if (searchMessageMeta.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchMessageMeta.channel_id);
            }
            if (searchMessageMeta.file_meta != null) {
                File.ADAPTER.encodeWithTag(protoWriter, 7, searchMessageMeta.file_meta);
            }
            if (searchMessageMeta.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, searchMessageMeta.from_id);
            }
            if (searchMessageMeta.is_in_my_nut_store != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, searchMessageMeta.is_in_my_nut_store);
            }
            if (searchMessageMeta.from_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchMessageMeta.from_name);
            }
            if (searchMessageMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, searchMessageMeta.thread_position);
            }
            if (searchMessageMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, searchMessageMeta.thread_chat_position);
            }
            if (searchMessageMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, searchMessageMeta.thread_id);
            }
            DocExtraInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, searchMessageMeta.doc_extra_infos);
            if (searchMessageMeta.from_avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, searchMessageMeta.from_avatar_key);
            }
            if (searchMessageMeta.p2p_bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, searchMessageMeta.p2p_bot_id);
            }
            if (searchMessageMeta.p2p_chatter_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, searchMessageMeta.p2p_chatter_id);
            }
            if (searchMessageMeta.is_p2p_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, searchMessageMeta.is_p2p_chat);
            }
            if (searchMessageMeta.p2p_chatter_id_string != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, searchMessageMeta.p2p_chatter_id_string);
            }
            protoWriter.writeBytes(searchMessageMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchMessageMeta$a */
    public static final class C18895a extends Message.Builder<SearchMessageMeta, C18895a> {

        /* renamed from: a */
        public String f46702a;

        /* renamed from: b */
        public Message.Type f46703b;

        /* renamed from: c */
        public Long f46704c;

        /* renamed from: d */
        public Integer f46705d;

        /* renamed from: e */
        public String f46706e;

        /* renamed from: f */
        public String f46707f;

        /* renamed from: g */
        public File f46708g;

        /* renamed from: h */
        public String f46709h;

        /* renamed from: i */
        public Boolean f46710i;

        /* renamed from: j */
        public String f46711j;

        /* renamed from: k */
        public Integer f46712k;

        /* renamed from: l */
        public Integer f46713l;

        /* renamed from: m */
        public String f46714m;

        /* renamed from: n */
        public List<DocExtraInfo> f46715n = Internal.newMutableList();

        /* renamed from: o */
        public String f46716o;

        /* renamed from: p */
        public String f46717p;

        /* renamed from: q */
        public Long f46718q;

        /* renamed from: r */
        public Boolean f46719r;

        /* renamed from: s */
        public String f46720s;

        /* renamed from: a */
        public SearchMessageMeta build() {
            String str = this.f46702a;
            if (str != null) {
                return new SearchMessageMeta(str, this.f46703b, this.f46704c, this.f46705d, this.f46706e, this.f46707f, this.f46708g, this.f46709h, this.f46710i, this.f46711j, this.f46712k, this.f46713l, this.f46714m, this.f46715n, this.f46716o, this.f46717p, this.f46718q, this.f46719r, this.f46720s, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18895a newBuilder() {
        C18895a aVar = new C18895a();
        aVar.f46702a = this.id;
        aVar.f46703b = this.type;
        aVar.f46704c = this.update_time;
        aVar.f46705d = this.position;
        aVar.f46706e = this.chat_id;
        aVar.f46707f = this.channel_id;
        aVar.f46708g = this.file_meta;
        aVar.f46709h = this.from_id;
        aVar.f46710i = this.is_in_my_nut_store;
        aVar.f46711j = this.from_name;
        aVar.f46712k = this.thread_position;
        aVar.f46713l = this.thread_chat_position;
        aVar.f46714m = this.thread_id;
        aVar.f46715n = Internal.copyOf("doc_extra_infos", this.doc_extra_infos);
        aVar.f46716o = this.from_avatar_key;
        aVar.f46717p = this.p2p_bot_id;
        aVar.f46718q = this.p2p_chatter_id;
        aVar.f46719r = this.is_p2p_chat;
        aVar.f46720s = this.p2p_chatter_id_string;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchMessageMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.file_meta != null) {
            sb.append(", file_meta=");
            sb.append(this.file_meta);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.is_in_my_nut_store != null) {
            sb.append(", is_in_my_nut_store=");
            sb.append(this.is_in_my_nut_store);
        }
        if (this.from_name != null) {
            sb.append(", from_name=");
            sb.append(this.from_name);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.thread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.thread_chat_position);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (!this.doc_extra_infos.isEmpty()) {
            sb.append(", doc_extra_infos=");
            sb.append(this.doc_extra_infos);
        }
        if (this.from_avatar_key != null) {
            sb.append(", from_avatar_key=");
            sb.append(this.from_avatar_key);
        }
        if (this.p2p_bot_id != null) {
            sb.append(", p2p_bot_id=");
            sb.append(this.p2p_bot_id);
        }
        if (this.p2p_chatter_id != null) {
            sb.append(", p2p_chatter_id=");
            sb.append(this.p2p_chatter_id);
        }
        if (this.is_p2p_chat != null) {
            sb.append(", is_p2p_chat=");
            sb.append(this.is_p2p_chat);
        }
        if (this.p2p_chatter_id_string != null) {
            sb.append(", p2p_chatter_id_string=");
            sb.append(this.p2p_chatter_id_string);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchMessageMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMessageMeta(String str, Message.Type type2, Long l, Integer num, String str2, String str3, File file, String str4, Boolean bool, String str5, Integer num2, Integer num3, String str6, List<DocExtraInfo> list, String str7, String str8, Long l2, Boolean bool2, String str9) {
        this(str, type2, l, num, str2, str3, file, str4, bool, str5, num2, num3, str6, list, str7, str8, l2, bool2, str9, ByteString.EMPTY);
    }

    public SearchMessageMeta(String str, Message.Type type2, Long l, Integer num, String str2, String str3, File file, String str4, Boolean bool, String str5, Integer num2, Integer num3, String str6, List<DocExtraInfo> list, String str7, String str8, Long l2, Boolean bool2, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.update_time = l;
        this.position = num;
        this.chat_id = str2;
        this.channel_id = str3;
        this.file_meta = file;
        this.from_id = str4;
        this.is_in_my_nut_store = bool;
        this.from_name = str5;
        this.thread_position = num2;
        this.thread_chat_position = num3;
        this.thread_id = str6;
        this.doc_extra_infos = Internal.immutableCopyOf("doc_extra_infos", list);
        this.from_avatar_key = str7;
        this.p2p_bot_id = str8;
        this.p2p_chatter_id = l2;
        this.is_p2p_chat = bool2;
        this.p2p_chatter_id_string = str9;
    }
}
