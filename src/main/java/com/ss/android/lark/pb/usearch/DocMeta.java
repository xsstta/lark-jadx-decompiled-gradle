package com.ss.android.lark.pb.usearch;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.DocType;
import com.ss.android.lark.pb.entities.Icon;
import java.io.IOException;
import okio.ByteString;

public final class DocMeta extends Message<DocMeta, C50198a> {
    public static final ProtoAdapter<DocMeta> ADAPTER = new C50199b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_LAST_OPEN_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Long mcreate_time;
    public final String medit_user_id;
    public final String medit_user_name;
    public final Icon micon;
    public final String mid;
    public final Boolean mis_cross_tenant;
    public final Long mlast_open_time;
    public final String mmessage_id;
    public final String mowner_id;
    public final String mowner_name;
    public final Integer mposition;
    public final Integer mthread_chat_position;
    public final String mthread_id;
    public final Integer mthread_position;
    public final DocType mtype;
    public final Long mupdate_time;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.usearch.DocMeta$b */
    private static final class C50199b extends ProtoAdapter<DocMeta> {
        C50199b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(DocMeta docMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docMeta.mid);
            int i17 = 0;
            if (docMeta.mtype != null) {
                i = DocType.ADAPTER.encodedSizeWithTag(2, docMeta.mtype);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (docMeta.mupdate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, docMeta.mupdate_time);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (docMeta.murl != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, docMeta.murl);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (docMeta.mowner_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, docMeta.mowner_name);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (docMeta.mowner_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, docMeta.mowner_id);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (docMeta.mmessage_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, docMeta.mmessage_id);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (docMeta.mposition != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, docMeta.mposition);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (docMeta.mis_cross_tenant != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, docMeta.mis_cross_tenant);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (docMeta.mcreate_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(10, docMeta.mcreate_time);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (docMeta.mlast_open_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, docMeta.mlast_open_time);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (docMeta.medit_user_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, docMeta.medit_user_id);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (docMeta.medit_user_name != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, docMeta.medit_user_name);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (docMeta.mchat_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, docMeta.mchat_id);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (docMeta.mthread_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, docMeta.mthread_id);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (docMeta.mthread_position != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, docMeta.mthread_position);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (docMeta.mthread_chat_position != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, docMeta.mthread_chat_position);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (docMeta.micon != null) {
                i17 = Icon.ADAPTER.encodedSizeWithTag(18, docMeta.micon);
            }
            return i33 + i17 + docMeta.unknownFields().size();
        }

        /* renamed from: a */
        public DocMeta decode(ProtoReader protoReader) throws IOException {
            C50198a aVar = new C50198a();
            aVar.f125414a = "";
            aVar.f125416c = 0L;
            aVar.f125417d = "";
            aVar.f125418e = "";
            aVar.f125419f = "";
            aVar.f125420g = "";
            aVar.f125421h = 0;
            aVar.f125422i = false;
            aVar.f125423j = 0L;
            aVar.f125424k = 0L;
            aVar.f125425l = "";
            aVar.f125426m = "";
            aVar.f125427n = "";
            aVar.f125428o = "";
            aVar.f125429p = 0;
            aVar.f125430q = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125414a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125415b = DocType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125416c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125417d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125418e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125419f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125420g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125421h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125422i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125423j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125424k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125425l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125426m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f125427n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f125428o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f125429p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f125430q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f125431r = Icon.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DocMeta docMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMeta.mid);
            if (docMeta.mtype != null) {
                DocType.ADAPTER.encodeWithTag(protoWriter, 2, docMeta.mtype);
            }
            if (docMeta.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, docMeta.mupdate_time);
            }
            if (docMeta.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, docMeta.murl);
            }
            if (docMeta.mowner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docMeta.mowner_name);
            }
            if (docMeta.mowner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, docMeta.mowner_id);
            }
            if (docMeta.mmessage_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, docMeta.mmessage_id);
            }
            if (docMeta.mposition != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, docMeta.mposition);
            }
            if (docMeta.mis_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, docMeta.mis_cross_tenant);
            }
            if (docMeta.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, docMeta.mcreate_time);
            }
            if (docMeta.mlast_open_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, docMeta.mlast_open_time);
            }
            if (docMeta.medit_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, docMeta.medit_user_id);
            }
            if (docMeta.medit_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, docMeta.medit_user_name);
            }
            if (docMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, docMeta.mchat_id);
            }
            if (docMeta.mthread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, docMeta.mthread_id);
            }
            if (docMeta.mthread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, docMeta.mthread_position);
            }
            if (docMeta.mthread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, docMeta.mthread_chat_position);
            }
            if (docMeta.micon != null) {
                Icon.ADAPTER.encodeWithTag(protoWriter, 18, docMeta.micon);
            }
            protoWriter.writeBytes(docMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.DocMeta$a */
    public static final class C50198a extends Message.Builder<DocMeta, C50198a> {

        /* renamed from: a */
        public String f125414a;

        /* renamed from: b */
        public DocType f125415b;

        /* renamed from: c */
        public Long f125416c;

        /* renamed from: d */
        public String f125417d;

        /* renamed from: e */
        public String f125418e;

        /* renamed from: f */
        public String f125419f;

        /* renamed from: g */
        public String f125420g;

        /* renamed from: h */
        public Integer f125421h;

        /* renamed from: i */
        public Boolean f125422i;

        /* renamed from: j */
        public Long f125423j;

        /* renamed from: k */
        public Long f125424k;

        /* renamed from: l */
        public String f125425l;

        /* renamed from: m */
        public String f125426m;

        /* renamed from: n */
        public String f125427n;

        /* renamed from: o */
        public String f125428o;

        /* renamed from: p */
        public Integer f125429p;

        /* renamed from: q */
        public Integer f125430q;

        /* renamed from: r */
        public Icon f125431r;

        /* renamed from: a */
        public DocMeta build() {
            String str = this.f125414a;
            if (str != null) {
                return new DocMeta(str, this.f125415b, this.f125416c, this.f125417d, this.f125418e, this.f125419f, this.f125420g, this.f125421h, this.f125422i, this.f125423j, this.f125424k, this.f125425l, this.f125426m, this.f125427n, this.f125428o, this.f125429p, this.f125430q, this.f125431r, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50198a newBuilder() {
        C50198a aVar = new C50198a();
        aVar.f125414a = this.mid;
        aVar.f125415b = this.mtype;
        aVar.f125416c = this.mupdate_time;
        aVar.f125417d = this.murl;
        aVar.f125418e = this.mowner_name;
        aVar.f125419f = this.mowner_id;
        aVar.f125420g = this.mmessage_id;
        aVar.f125421h = this.mposition;
        aVar.f125422i = this.mis_cross_tenant;
        aVar.f125423j = this.mcreate_time;
        aVar.f125424k = this.mlast_open_time;
        aVar.f125425l = this.medit_user_id;
        aVar.f125426m = this.medit_user_name;
        aVar.f125427n = this.mchat_id;
        aVar.f125428o = this.mthread_id;
        aVar.f125429p = this.mthread_position;
        aVar.f125430q = this.mthread_chat_position;
        aVar.f125431r = this.micon;
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
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.mowner_name != null) {
            sb.append(", owner_name=");
            sb.append(this.mowner_name);
        }
        if (this.mowner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.mowner_id);
        }
        if (this.mmessage_id != null) {
            sb.append(", message_id=");
            sb.append(this.mmessage_id);
        }
        if (this.mposition != null) {
            sb.append(", position=");
            sb.append(this.mposition);
        }
        if (this.mis_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.mis_cross_tenant);
        }
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mlast_open_time != null) {
            sb.append(", last_open_time=");
            sb.append(this.mlast_open_time);
        }
        if (this.medit_user_id != null) {
            sb.append(", edit_user_id=");
            sb.append(this.medit_user_id);
        }
        if (this.medit_user_name != null) {
            sb.append(", edit_user_name=");
            sb.append(this.medit_user_name);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
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
        if (this.micon != null) {
            sb.append(", icon=");
            sb.append(this.micon);
        }
        StringBuilder replace = sb.replace(0, 2, "DocMeta{");
        replace.append('}');
        return replace.toString();
    }

    public DocMeta(String str, DocType docType, Long l, String str2, String str3, String str4, String str5, Integer num, Boolean bool, Long l2, Long l3, String str6, String str7, String str8, String str9, Integer num2, Integer num3, Icon icon) {
        this(str, docType, l, str2, str3, str4, str5, num, bool, l2, l3, str6, str7, str8, str9, num2, num3, icon, ByteString.EMPTY);
    }

    public DocMeta(String str, DocType docType, Long l, String str2, String str3, String str4, String str5, Integer num, Boolean bool, Long l2, Long l3, String str6, String str7, String str8, String str9, Integer num2, Integer num3, Icon icon, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtype = docType;
        this.mupdate_time = l;
        this.murl = str2;
        this.mowner_name = str3;
        this.mowner_id = str4;
        this.mmessage_id = str5;
        this.mposition = num;
        this.mis_cross_tenant = bool;
        this.mcreate_time = l2;
        this.mlast_open_time = l3;
        this.medit_user_id = str6;
        this.medit_user_name = str7;
        this.mchat_id = str8;
        this.mthread_id = str9;
        this.mthread_position = num2;
        this.mthread_chat_position = num3;
        this.micon = icon;
    }
}
