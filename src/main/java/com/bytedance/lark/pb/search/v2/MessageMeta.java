package com.bytedance.lark.pb.search.v2;

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

public final class MessageMeta extends Message<MessageMeta, C18997a> {
    public static final ProtoAdapter<MessageMeta> ADAPTER = new C18998b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_P2P_CHAT = false;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long create_time;
    public final List<DocExtraInfo> doc_extra_infos;
    public final File file_meta;
    public final String from_id;
    public final String id;
    public final Boolean is_p2p_chat;
    public final String p2p_chatter_id;
    public final Integer position;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;
    public final Message.Type type;
    public final Long update_time;

    public static final class DocExtraInfo extends com.squareup.wire.Message<DocExtraInfo, C18995a> {
        public static final ProtoAdapter<DocExtraInfo> ADAPTER = new C18996b();
        public static final Doc.Type DEFAULT_TYPE = Doc.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String name;
        public final Doc.Type type;
        public final String url;

        /* renamed from: com.bytedance.lark.pb.search.v2.MessageMeta$DocExtraInfo$b */
        private static final class C18996b extends ProtoAdapter<DocExtraInfo> {
            C18996b() {
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
                C18995a aVar = new C18995a();
                aVar.f46972a = Doc.Type.UNKNOWN;
                aVar.f46973b = "";
                aVar.f46974c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f46972a = Doc.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f46973b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46974c = ProtoAdapter.STRING.decode(protoReader);
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

        /* renamed from: com.bytedance.lark.pb.search.v2.MessageMeta$DocExtraInfo$a */
        public static final class C18995a extends Message.Builder<DocExtraInfo, C18995a> {

            /* renamed from: a */
            public Doc.Type f46972a;

            /* renamed from: b */
            public String f46973b;

            /* renamed from: c */
            public String f46974c;

            /* renamed from: a */
            public DocExtraInfo build() {
                return new DocExtraInfo(this.f46972a, this.f46973b, this.f46974c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18995a newBuilder() {
            C18995a aVar = new C18995a();
            aVar.f46972a = this.type;
            aVar.f46973b = this.url;
            aVar.f46974c = this.name;
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

    /* renamed from: com.bytedance.lark.pb.search.v2.MessageMeta$b */
    private static final class C18998b extends ProtoAdapter<MessageMeta> {
        C18998b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageMeta messageMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageMeta.id);
            int i12 = 0;
            if (messageMeta.type != null) {
                i = Message.Type.ADAPTER.encodedSizeWithTag(2, messageMeta.type);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (messageMeta.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, messageMeta.update_time);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (messageMeta.create_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, messageMeta.create_time);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (messageMeta.position != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, messageMeta.position);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (messageMeta.chat_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, messageMeta.chat_id);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (messageMeta.file_meta != null) {
                i6 = File.ADAPTER.encodedSizeWithTag(7, messageMeta.file_meta);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (messageMeta.from_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, messageMeta.from_id);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (messageMeta.thread_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, messageMeta.thread_id);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (messageMeta.thread_position != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, messageMeta.thread_position);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (messageMeta.thread_chat_position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, messageMeta.thread_chat_position);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag2 = i21 + i10 + DocExtraInfo.ADAPTER.asRepeated().encodedSizeWithTag(12, messageMeta.doc_extra_infos);
            if (messageMeta.p2p_chatter_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(13, messageMeta.p2p_chatter_id);
            } else {
                i11 = 0;
            }
            int i22 = encodedSizeWithTag2 + i11;
            if (messageMeta.is_p2p_chat != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, messageMeta.is_p2p_chat);
            }
            return i22 + i12 + messageMeta.unknownFields().size();
        }

        /* renamed from: a */
        public MessageMeta decode(ProtoReader protoReader) throws IOException {
            C18997a aVar = new C18997a();
            aVar.f46975a = "";
            aVar.f46976b = Message.Type.UNKNOWN;
            aVar.f46977c = 0L;
            aVar.f46978d = 0L;
            aVar.f46979e = 0;
            aVar.f46980f = "";
            aVar.f46982h = "";
            aVar.f46983i = "";
            aVar.f46984j = 0;
            aVar.f46985k = 0;
            aVar.f46987m = "";
            aVar.f46988n = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46975a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46976b = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46977c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46978d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46979e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46980f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46981g = File.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46982h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46983i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46984j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46985k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46986l.add(DocExtraInfo.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.f46987m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46988n = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MessageMeta messageMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageMeta.id);
            if (messageMeta.type != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 2, messageMeta.type);
            }
            if (messageMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageMeta.update_time);
            }
            if (messageMeta.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageMeta.create_time);
            }
            if (messageMeta.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, messageMeta.position);
            }
            if (messageMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, messageMeta.chat_id);
            }
            if (messageMeta.file_meta != null) {
                File.ADAPTER.encodeWithTag(protoWriter, 7, messageMeta.file_meta);
            }
            if (messageMeta.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, messageMeta.from_id);
            }
            if (messageMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, messageMeta.thread_id);
            }
            if (messageMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, messageMeta.thread_position);
            }
            if (messageMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, messageMeta.thread_chat_position);
            }
            DocExtraInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, messageMeta.doc_extra_infos);
            if (messageMeta.p2p_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, messageMeta.p2p_chatter_id);
            }
            if (messageMeta.is_p2p_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, messageMeta.is_p2p_chat);
            }
            protoWriter.writeBytes(messageMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.MessageMeta$a */
    public static final class C18997a extends Message.Builder<MessageMeta, C18997a> {

        /* renamed from: a */
        public String f46975a;

        /* renamed from: b */
        public Message.Type f46976b;

        /* renamed from: c */
        public Long f46977c;

        /* renamed from: d */
        public Long f46978d;

        /* renamed from: e */
        public Integer f46979e;

        /* renamed from: f */
        public String f46980f;

        /* renamed from: g */
        public File f46981g;

        /* renamed from: h */
        public String f46982h;

        /* renamed from: i */
        public String f46983i;

        /* renamed from: j */
        public Integer f46984j;

        /* renamed from: k */
        public Integer f46985k;

        /* renamed from: l */
        public List<DocExtraInfo> f46986l = Internal.newMutableList();

        /* renamed from: m */
        public String f46987m;

        /* renamed from: n */
        public Boolean f46988n;

        /* renamed from: a */
        public MessageMeta build() {
            String str = this.f46975a;
            if (str != null) {
                return new MessageMeta(str, this.f46976b, this.f46977c, this.f46978d, this.f46979e, this.f46980f, this.f46981g, this.f46982h, this.f46983i, this.f46984j, this.f46985k, this.f46986l, this.f46987m, this.f46988n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18997a newBuilder() {
        C18997a aVar = new C18997a();
        aVar.f46975a = this.id;
        aVar.f46976b = this.type;
        aVar.f46977c = this.update_time;
        aVar.f46978d = this.create_time;
        aVar.f46979e = this.position;
        aVar.f46980f = this.chat_id;
        aVar.f46981g = this.file_meta;
        aVar.f46982h = this.from_id;
        aVar.f46983i = this.thread_id;
        aVar.f46984j = this.thread_position;
        aVar.f46985k = this.thread_chat_position;
        aVar.f46986l = Internal.copyOf("doc_extra_infos", this.doc_extra_infos);
        aVar.f46987m = this.p2p_chatter_id;
        aVar.f46988n = this.is_p2p_chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "MessageMeta");
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
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.file_meta != null) {
            sb.append(", file_meta=");
            sb.append(this.file_meta);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.thread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.thread_chat_position);
        }
        if (!this.doc_extra_infos.isEmpty()) {
            sb.append(", doc_extra_infos=");
            sb.append(this.doc_extra_infos);
        }
        if (this.p2p_chatter_id != null) {
            sb.append(", p2p_chatter_id=");
            sb.append(this.p2p_chatter_id);
        }
        if (this.is_p2p_chat != null) {
            sb.append(", is_p2p_chat=");
            sb.append(this.is_p2p_chat);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageMeta{");
        replace.append('}');
        return replace.toString();
    }

    public MessageMeta(String str, Message.Type type2, Long l, Long l2, Integer num, String str2, File file, String str3, String str4, Integer num2, Integer num3, List<DocExtraInfo> list, String str5, Boolean bool) {
        this(str, type2, l, l2, num, str2, file, str3, str4, num2, num3, list, str5, bool, ByteString.EMPTY);
    }

    public MessageMeta(String str, Message.Type type2, Long l, Long l2, Integer num, String str2, File file, String str3, String str4, Integer num2, Integer num3, List<DocExtraInfo> list, String str5, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.update_time = l;
        this.create_time = l2;
        this.position = num;
        this.chat_id = str2;
        this.file_meta = file;
        this.from_id = str3;
        this.thread_id = str4;
        this.thread_position = num2;
        this.thread_chat_position = num3;
        this.doc_extra_infos = Internal.immutableCopyOf("doc_extra_infos", list);
        this.p2p_chatter_id = str5;
        this.is_p2p_chat = bool;
    }
}
