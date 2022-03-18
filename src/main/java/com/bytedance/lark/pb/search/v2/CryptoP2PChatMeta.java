package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
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

public final class CryptoP2PChatMeta extends Message<CryptoP2PChatMeta, C18975a> {
    public static final ProtoAdapter<CryptoP2PChatMeta> ADAPTER = new C18976b();
    public static final Boolean DEFAULT_ACCEPT_SMS_PHONE_URGENT = false;
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_FLAG = Chatter.Description.Type.ON_DEFAULT;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    private static final long serialVersionUID = 0;
    public final Boolean accept_sms_phone_urgent;
    public final String chatter_id;
    public final List<Chatter.ChatterCustomStatus> custom_status;
    public final String description;
    public final Chatter.Description.Type description_flag;
    public final Long do_not_disturb_end_time;
    public final String id;
    public final Boolean is_registered;
    public final String mail_address;
    public final SimpleP2PChatInfo p2p_chat_info;
    public final String tenant_id;
    public final WorkStatus work_status;

    /* renamed from: com.bytedance.lark.pb.search.v2.CryptoP2PChatMeta$b */
    private static final class C18976b extends ProtoAdapter<CryptoP2PChatMeta> {
        C18976b() {
            super(FieldEncoding.LENGTH_DELIMITED, CryptoP2PChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(CryptoP2PChatMeta cryptoP2PChatMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, cryptoP2PChatMeta.id);
            int i10 = 0;
            if (cryptoP2PChatMeta.is_registered != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, cryptoP2PChatMeta.is_registered);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (cryptoP2PChatMeta.tenant_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, cryptoP2PChatMeta.tenant_id);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (cryptoP2PChatMeta.mail_address != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, cryptoP2PChatMeta.mail_address);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (cryptoP2PChatMeta.do_not_disturb_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, cryptoP2PChatMeta.do_not_disturb_end_time);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (cryptoP2PChatMeta.accept_sms_phone_urgent != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, cryptoP2PChatMeta.accept_sms_phone_urgent);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (cryptoP2PChatMeta.description != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, cryptoP2PChatMeta.description);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (cryptoP2PChatMeta.description_flag != null) {
                i7 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(8, cryptoP2PChatMeta.description_flag);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (cryptoP2PChatMeta.work_status != null) {
                i8 = WorkStatus.ADAPTER.encodedSizeWithTag(9, cryptoP2PChatMeta.work_status);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (cryptoP2PChatMeta.chatter_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, cryptoP2PChatMeta.chatter_id);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (cryptoP2PChatMeta.p2p_chat_info != null) {
                i10 = SimpleP2PChatInfo.ADAPTER.encodedSizeWithTag(11, cryptoP2PChatMeta.p2p_chat_info);
            }
            return i19 + i10 + Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(12, cryptoP2PChatMeta.custom_status) + cryptoP2PChatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public CryptoP2PChatMeta decode(ProtoReader protoReader) throws IOException {
            C18975a aVar = new C18975a();
            aVar.f46920a = "";
            aVar.f46921b = false;
            aVar.f46922c = "";
            aVar.f46923d = "";
            aVar.f46924e = 0L;
            aVar.f46925f = false;
            aVar.f46926g = "";
            aVar.f46927h = Chatter.Description.Type.ON_DEFAULT;
            aVar.f46929j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46920a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46921b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46922c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46923d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46924e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46925f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46926g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f46927h = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f46928i = WorkStatus.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46929j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46930k = SimpleP2PChatInfo.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46931l.add(Chatter.ChatterCustomStatus.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, CryptoP2PChatMeta cryptoP2PChatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cryptoP2PChatMeta.id);
            if (cryptoP2PChatMeta.is_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, cryptoP2PChatMeta.is_registered);
            }
            if (cryptoP2PChatMeta.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cryptoP2PChatMeta.tenant_id);
            }
            if (cryptoP2PChatMeta.mail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, cryptoP2PChatMeta.mail_address);
            }
            if (cryptoP2PChatMeta.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, cryptoP2PChatMeta.do_not_disturb_end_time);
            }
            if (cryptoP2PChatMeta.accept_sms_phone_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, cryptoP2PChatMeta.accept_sms_phone_urgent);
            }
            if (cryptoP2PChatMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, cryptoP2PChatMeta.description);
            }
            if (cryptoP2PChatMeta.description_flag != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 8, cryptoP2PChatMeta.description_flag);
            }
            if (cryptoP2PChatMeta.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 9, cryptoP2PChatMeta.work_status);
            }
            if (cryptoP2PChatMeta.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, cryptoP2PChatMeta.chatter_id);
            }
            if (cryptoP2PChatMeta.p2p_chat_info != null) {
                SimpleP2PChatInfo.ADAPTER.encodeWithTag(protoWriter, 11, cryptoP2PChatMeta.p2p_chat_info);
            }
            Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, cryptoP2PChatMeta.custom_status);
            protoWriter.writeBytes(cryptoP2PChatMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.CryptoP2PChatMeta$a */
    public static final class C18975a extends Message.Builder<CryptoP2PChatMeta, C18975a> {

        /* renamed from: a */
        public String f46920a;

        /* renamed from: b */
        public Boolean f46921b;

        /* renamed from: c */
        public String f46922c;

        /* renamed from: d */
        public String f46923d;

        /* renamed from: e */
        public Long f46924e;

        /* renamed from: f */
        public Boolean f46925f;

        /* renamed from: g */
        public String f46926g;

        /* renamed from: h */
        public Chatter.Description.Type f46927h;

        /* renamed from: i */
        public WorkStatus f46928i;

        /* renamed from: j */
        public String f46929j;

        /* renamed from: k */
        public SimpleP2PChatInfo f46930k;

        /* renamed from: l */
        public List<Chatter.ChatterCustomStatus> f46931l = Internal.newMutableList();

        /* renamed from: a */
        public CryptoP2PChatMeta build() {
            String str = this.f46920a;
            if (str != null) {
                return new CryptoP2PChatMeta(str, this.f46921b, this.f46922c, this.f46923d, this.f46924e, this.f46925f, this.f46926g, this.f46927h, this.f46928i, this.f46929j, this.f46930k, this.f46931l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18975a newBuilder() {
        C18975a aVar = new C18975a();
        aVar.f46920a = this.id;
        aVar.f46921b = this.is_registered;
        aVar.f46922c = this.tenant_id;
        aVar.f46923d = this.mail_address;
        aVar.f46924e = this.do_not_disturb_end_time;
        aVar.f46925f = this.accept_sms_phone_urgent;
        aVar.f46926g = this.description;
        aVar.f46927h = this.description_flag;
        aVar.f46928i = this.work_status;
        aVar.f46929j = this.chatter_id;
        aVar.f46930k = this.p2p_chat_info;
        aVar.f46931l = Internal.copyOf("custom_status", this.custom_status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "CryptoP2PChatMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.is_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.is_registered);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.mail_address != null) {
            sb.append(", mail_address=");
            sb.append(this.mail_address);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        if (this.accept_sms_phone_urgent != null) {
            sb.append(", accept_sms_phone_urgent=");
            sb.append(this.accept_sms_phone_urgent);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_flag != null) {
            sb.append(", description_flag=");
            sb.append(this.description_flag);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.p2p_chat_info != null) {
            sb.append(", p2p_chat_info=");
            sb.append(this.p2p_chat_info);
        }
        if (!this.custom_status.isEmpty()) {
            sb.append(", custom_status=");
            sb.append(this.custom_status);
        }
        StringBuilder replace = sb.replace(0, 2, "CryptoP2PChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public CryptoP2PChatMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, String str4, Chatter.Description.Type type, WorkStatus workStatus, String str5, SimpleP2PChatInfo simpleP2PChatInfo, List<Chatter.ChatterCustomStatus> list) {
        this(str, bool, str2, str3, l, bool2, str4, type, workStatus, str5, simpleP2PChatInfo, list, ByteString.EMPTY);
    }

    public CryptoP2PChatMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, String str4, Chatter.Description.Type type, WorkStatus workStatus, String str5, SimpleP2PChatInfo simpleP2PChatInfo, List<Chatter.ChatterCustomStatus> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.is_registered = bool;
        this.tenant_id = str2;
        this.mail_address = str3;
        this.do_not_disturb_end_time = l;
        this.accept_sms_phone_urgent = bool2;
        this.description = str4;
        this.description_flag = type;
        this.work_status = workStatus;
        this.chatter_id = str5;
        this.p2p_chat_info = simpleP2PChatInfo;
        this.custom_status = Internal.immutableCopyOf("custom_status", list);
    }
}
