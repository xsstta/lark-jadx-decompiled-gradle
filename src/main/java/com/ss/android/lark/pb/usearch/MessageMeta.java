package com.ss.android.lark.pb.usearch;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.DocType;
import com.ss.android.lark.pb.entities.FileContent;
import com.ss.android.lark.pb.entities.Message;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MessageMeta extends Message<MessageMeta, C50214a> {
    public static final ProtoAdapter<MessageMeta> ADAPTER = new C50215b();
    public static final Long DEFAULT_AVATAR_KEY_CHATTER_ID = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_P2P_CHAT = false;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long mavatar_key_chatter_id;
    public final String mchat_id;
    public final Long mcreate_time;
    public final List<DocExtraInfo> mdoc_extra_infos;
    public final FileContent mfile_meta;
    public final String mfrom_id;
    public final String mid;
    public final Boolean mis_p2p_chat;
    public final Integer mposition;
    public final Integer mthread_chat_position;
    public final String mthread_id;
    public final Integer mthread_position;
    public final Message.Type mtype;
    public final Long mupdate_time;

    public static final class DocExtraInfo extends com.squareup.wire.Message<DocExtraInfo, C50212a> {
        public static final ProtoAdapter<DocExtraInfo> ADAPTER = new C50213b();
        private static final long serialVersionUID = 0;
        public final String mname;
        public final DocType mtype;
        public final String murl;

        /* renamed from: com.ss.android.lark.pb.usearch.MessageMeta$DocExtraInfo$b */
        private static final class C50213b extends ProtoAdapter<DocExtraInfo> {
            C50213b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocExtraInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(DocExtraInfo docExtraInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (docExtraInfo.mtype != null) {
                    i = DocType.ADAPTER.encodedSizeWithTag(1, docExtraInfo.mtype);
                } else {
                    i = 0;
                }
                if (docExtraInfo.murl != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, docExtraInfo.murl);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (docExtraInfo.mname != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, docExtraInfo.mname);
                }
                return i4 + i3 + docExtraInfo.unknownFields().size();
            }

            /* renamed from: a */
            public DocExtraInfo decode(ProtoReader protoReader) throws IOException {
                C50212a aVar = new C50212a();
                aVar.f125460b = "";
                aVar.f125461c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f125459a = DocType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f125460b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125461c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocExtraInfo docExtraInfo) throws IOException {
                if (docExtraInfo.mtype != null) {
                    DocType.ADAPTER.encodeWithTag(protoWriter, 1, docExtraInfo.mtype);
                }
                if (docExtraInfo.murl != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docExtraInfo.murl);
                }
                if (docExtraInfo.mname != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, docExtraInfo.mname);
                }
                protoWriter.writeBytes(docExtraInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.MessageMeta$DocExtraInfo$a */
        public static final class C50212a extends Message.Builder<DocExtraInfo, C50212a> {

            /* renamed from: a */
            public DocType f125459a;

            /* renamed from: b */
            public String f125460b;

            /* renamed from: c */
            public String f125461c;

            /* renamed from: a */
            public DocExtraInfo build() {
                return new DocExtraInfo(this.f125459a, this.f125460b, this.f125461c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50212a newBuilder() {
            C50212a aVar = new C50212a();
            aVar.f125459a = this.mtype;
            aVar.f125460b = this.murl;
            aVar.f125461c = this.mname;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mtype != null) {
                sb.append(", type=");
                sb.append(this.mtype);
            }
            if (this.murl != null) {
                sb.append(", url=");
                sb.append(this.murl);
            }
            if (this.mname != null) {
                sb.append(", name=");
                sb.append(this.mname);
            }
            StringBuilder replace = sb.replace(0, 2, "DocExtraInfo{");
            replace.append('}');
            return replace.toString();
        }

        public DocExtraInfo(DocType docType, String str, String str2) {
            this(docType, str, str2, ByteString.EMPTY);
        }

        public DocExtraInfo(DocType docType, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtype = docType;
            this.murl = str;
            this.mname = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.MessageMeta$b */
    private static final class C50215b extends ProtoAdapter<MessageMeta> {
        C50215b() {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageMeta.mid);
            int i12 = 0;
            if (messageMeta.mtype != null) {
                i = Message.Type.ADAPTER.encodedSizeWithTag(2, messageMeta.mtype);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (messageMeta.mupdate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, messageMeta.mupdate_time);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (messageMeta.mcreate_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, messageMeta.mcreate_time);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (messageMeta.mposition != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, messageMeta.mposition);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (messageMeta.mchat_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, messageMeta.mchat_id);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (messageMeta.mfile_meta != null) {
                i6 = FileContent.ADAPTER.encodedSizeWithTag(7, messageMeta.mfile_meta);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (messageMeta.mfrom_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, messageMeta.mfrom_id);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (messageMeta.mthread_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, messageMeta.mthread_id);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (messageMeta.mthread_position != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, messageMeta.mthread_position);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (messageMeta.mthread_chat_position != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, messageMeta.mthread_chat_position);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag2 = i21 + i10 + DocExtraInfo.ADAPTER.asRepeated().encodedSizeWithTag(12, messageMeta.mdoc_extra_infos);
            if (messageMeta.mavatar_key_chatter_id != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(13, messageMeta.mavatar_key_chatter_id);
            } else {
                i11 = 0;
            }
            int i22 = encodedSizeWithTag2 + i11;
            if (messageMeta.mis_p2p_chat != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, messageMeta.mis_p2p_chat);
            }
            return i22 + i12 + messageMeta.unknownFields().size();
        }

        /* renamed from: a */
        public MessageMeta decode(ProtoReader protoReader) throws IOException {
            C50214a aVar = new C50214a();
            aVar.f125462a = "";
            aVar.f125464c = 0L;
            aVar.f125465d = 0L;
            aVar.f125466e = 0;
            aVar.f125467f = "";
            aVar.f125469h = "";
            aVar.f125470i = "";
            aVar.f125471j = 0;
            aVar.f125472k = 0;
            aVar.f125474m = 0L;
            aVar.f125475n = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125462a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125463b = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125464c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125465d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125466e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125467f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125468g = FileContent.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125469h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125470i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125471j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125472k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125473l.add(DocExtraInfo.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.f125474m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f125475n = ProtoAdapter.BOOL.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageMeta.mid);
            if (messageMeta.mtype != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 2, messageMeta.mtype);
            }
            if (messageMeta.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageMeta.mupdate_time);
            }
            if (messageMeta.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageMeta.mcreate_time);
            }
            if (messageMeta.mposition != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, messageMeta.mposition);
            }
            if (messageMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, messageMeta.mchat_id);
            }
            if (messageMeta.mfile_meta != null) {
                FileContent.ADAPTER.encodeWithTag(protoWriter, 7, messageMeta.mfile_meta);
            }
            if (messageMeta.mfrom_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, messageMeta.mfrom_id);
            }
            if (messageMeta.mthread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, messageMeta.mthread_id);
            }
            if (messageMeta.mthread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, messageMeta.mthread_position);
            }
            if (messageMeta.mthread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, messageMeta.mthread_chat_position);
            }
            DocExtraInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, messageMeta.mdoc_extra_infos);
            if (messageMeta.mavatar_key_chatter_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, messageMeta.mavatar_key_chatter_id);
            }
            if (messageMeta.mis_p2p_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, messageMeta.mis_p2p_chat);
            }
            protoWriter.writeBytes(messageMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.MessageMeta$a */
    public static final class C50214a extends Message.Builder<MessageMeta, C50214a> {

        /* renamed from: a */
        public String f125462a;

        /* renamed from: b */
        public Message.Type f125463b;

        /* renamed from: c */
        public Long f125464c;

        /* renamed from: d */
        public Long f125465d;

        /* renamed from: e */
        public Integer f125466e;

        /* renamed from: f */
        public String f125467f;

        /* renamed from: g */
        public FileContent f125468g;

        /* renamed from: h */
        public String f125469h;

        /* renamed from: i */
        public String f125470i;

        /* renamed from: j */
        public Integer f125471j;

        /* renamed from: k */
        public Integer f125472k;

        /* renamed from: l */
        public List<DocExtraInfo> f125473l = Internal.newMutableList();

        /* renamed from: m */
        public Long f125474m;

        /* renamed from: n */
        public Boolean f125475n;

        /* renamed from: a */
        public MessageMeta build() {
            String str = this.f125462a;
            if (str != null) {
                return new MessageMeta(str, this.f125463b, this.f125464c, this.f125465d, this.f125466e, this.f125467f, this.f125468g, this.f125469h, this.f125470i, this.f125471j, this.f125472k, this.f125473l, this.f125474m, this.f125475n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50214a newBuilder() {
        C50214a aVar = new C50214a();
        aVar.f125462a = this.mid;
        aVar.f125463b = this.mtype;
        aVar.f125464c = this.mupdate_time;
        aVar.f125465d = this.mcreate_time;
        aVar.f125466e = this.mposition;
        aVar.f125467f = this.mchat_id;
        aVar.f125468g = this.mfile_meta;
        aVar.f125469h = this.mfrom_id;
        aVar.f125470i = this.mthread_id;
        aVar.f125471j = this.mthread_position;
        aVar.f125472k = this.mthread_chat_position;
        aVar.f125473l = Internal.copyOf("mdoc_extra_infos", this.mdoc_extra_infos);
        aVar.f125474m = this.mavatar_key_chatter_id;
        aVar.f125475n = this.mis_p2p_chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mposition != null) {
            sb.append(", position=");
            sb.append(this.mposition);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mfile_meta != null) {
            sb.append(", file_meta=");
            sb.append(this.mfile_meta);
        }
        if (this.mfrom_id != null) {
            sb.append(", from_id=");
            sb.append(this.mfrom_id);
        }
        if (this.mthread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.mthread_id);
        }
        if (this.mthread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.mthread_position);
        }
        if (this.mthread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.mthread_chat_position);
        }
        if (!this.mdoc_extra_infos.isEmpty()) {
            sb.append(", doc_extra_infos=");
            sb.append(this.mdoc_extra_infos);
        }
        if (this.mavatar_key_chatter_id != null) {
            sb.append(", avatar_key_chatter_id=");
            sb.append(this.mavatar_key_chatter_id);
        }
        if (this.mis_p2p_chat != null) {
            sb.append(", is_p2p_chat=");
            sb.append(this.mis_p2p_chat);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageMeta{");
        replace.append('}');
        return replace.toString();
    }

    public MessageMeta(String str, Message.Type type, Long l, Long l2, Integer num, String str2, FileContent fileContent, String str3, String str4, Integer num2, Integer num3, List<DocExtraInfo> list, Long l3, Boolean bool) {
        this(str, type, l, l2, num, str2, fileContent, str3, str4, num2, num3, list, l3, bool, ByteString.EMPTY);
    }

    public MessageMeta(String str, Message.Type type, Long l, Long l2, Integer num, String str2, FileContent fileContent, String str3, String str4, Integer num2, Integer num3, List<DocExtraInfo> list, Long l3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtype = type;
        this.mupdate_time = l;
        this.mcreate_time = l2;
        this.mposition = num;
        this.mchat_id = str2;
        this.mfile_meta = fileContent;
        this.mfrom_id = str3;
        this.mthread_id = str4;
        this.mthread_position = num2;
        this.mthread_chat_position = num3;
        this.mdoc_extra_infos = Internal.immutableCopyOf("mdoc_extra_infos", list);
        this.mavatar_key_chatter_id = l3;
        this.mis_p2p_chat = bool;
    }
}
