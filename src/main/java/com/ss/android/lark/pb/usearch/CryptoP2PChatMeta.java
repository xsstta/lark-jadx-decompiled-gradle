package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CryptoP2PChatMeta extends Message<CryptoP2PChatMeta, C50192a> {
    public static final ProtoAdapter<CryptoP2PChatMeta> ADAPTER = new C50193b();
    public static final Boolean DEFAULT_ACCEPT_SMS_PHONE_URGENT = false;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    private static final long serialVersionUID = 0;
    public final Boolean maccept_sms_phone_urgent;
    public final Long mdo_not_disturb_end_time;
    public final String mid;
    public final Boolean mis_registered;
    public final String mmail_address;
    public final String mtenant_id;

    /* renamed from: com.ss.android.lark.pb.usearch.CryptoP2PChatMeta$b */
    private static final class C50193b extends ProtoAdapter<CryptoP2PChatMeta> {
        C50193b() {
            super(FieldEncoding.LENGTH_DELIMITED, CryptoP2PChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(CryptoP2PChatMeta cryptoP2PChatMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, cryptoP2PChatMeta.mid);
            int i5 = 0;
            if (cryptoP2PChatMeta.mis_registered != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, cryptoP2PChatMeta.mis_registered);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (cryptoP2PChatMeta.mtenant_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, cryptoP2PChatMeta.mtenant_id);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (cryptoP2PChatMeta.mmail_address != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, cryptoP2PChatMeta.mmail_address);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (cryptoP2PChatMeta.mdo_not_disturb_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, cryptoP2PChatMeta.mdo_not_disturb_end_time);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (cryptoP2PChatMeta.maccept_sms_phone_urgent != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, cryptoP2PChatMeta.maccept_sms_phone_urgent);
            }
            return i9 + i5 + cryptoP2PChatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public CryptoP2PChatMeta decode(ProtoReader protoReader) throws IOException {
            C50192a aVar = new C50192a();
            aVar.f125403a = "";
            aVar.f125404b = false;
            aVar.f125405c = "";
            aVar.f125406d = "";
            aVar.f125407e = 0L;
            aVar.f125408f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125403a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125404b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125405c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125406d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125407e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125408f = ProtoAdapter.BOOL.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cryptoP2PChatMeta.mid);
            if (cryptoP2PChatMeta.mis_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, cryptoP2PChatMeta.mis_registered);
            }
            if (cryptoP2PChatMeta.mtenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cryptoP2PChatMeta.mtenant_id);
            }
            if (cryptoP2PChatMeta.mmail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, cryptoP2PChatMeta.mmail_address);
            }
            if (cryptoP2PChatMeta.mdo_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, cryptoP2PChatMeta.mdo_not_disturb_end_time);
            }
            if (cryptoP2PChatMeta.maccept_sms_phone_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, cryptoP2PChatMeta.maccept_sms_phone_urgent);
            }
            protoWriter.writeBytes(cryptoP2PChatMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.CryptoP2PChatMeta$a */
    public static final class C50192a extends Message.Builder<CryptoP2PChatMeta, C50192a> {

        /* renamed from: a */
        public String f125403a;

        /* renamed from: b */
        public Boolean f125404b;

        /* renamed from: c */
        public String f125405c;

        /* renamed from: d */
        public String f125406d;

        /* renamed from: e */
        public Long f125407e;

        /* renamed from: f */
        public Boolean f125408f;

        /* renamed from: a */
        public CryptoP2PChatMeta build() {
            String str = this.f125403a;
            if (str != null) {
                return new CryptoP2PChatMeta(str, this.f125404b, this.f125405c, this.f125406d, this.f125407e, this.f125408f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50192a newBuilder() {
        C50192a aVar = new C50192a();
        aVar.f125403a = this.mid;
        aVar.f125404b = this.mis_registered;
        aVar.f125405c = this.mtenant_id;
        aVar.f125406d = this.mmail_address;
        aVar.f125407e = this.mdo_not_disturb_end_time;
        aVar.f125408f = this.maccept_sms_phone_urgent;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mis_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.mis_registered);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.mmail_address != null) {
            sb.append(", mail_address=");
            sb.append(this.mmail_address);
        }
        if (this.mdo_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.mdo_not_disturb_end_time);
        }
        if (this.maccept_sms_phone_urgent != null) {
            sb.append(", accept_sms_phone_urgent=");
            sb.append(this.maccept_sms_phone_urgent);
        }
        StringBuilder replace = sb.replace(0, 2, "CryptoP2PChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public CryptoP2PChatMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2) {
        this(str, bool, str2, str3, l, bool2, ByteString.EMPTY);
    }

    public CryptoP2PChatMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mis_registered = bool;
        this.mtenant_id = str2;
        this.mmail_address = str3;
        this.mdo_not_disturb_end_time = l;
        this.maccept_sms_phone_urgent = bool2;
    }
}
