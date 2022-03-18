package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailVacationResponder extends Message<MailVacationResponder, C16964a> {
    public static final ProtoAdapter<MailVacationResponder> ADAPTER = new C16965b();
    public static final Boolean DEFAULT_ENABLE = false;
    public static final Long DEFAULT_END_TIMESTAMP = 0L;
    public static final Boolean DEFAULT_ONLY_SEND_TO_TENANT = false;
    public static final Long DEFAULT_START_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final String auto_reply_body;
    public final String auto_reply_summary;
    public final Boolean enable;
    public final Long end_timestamp;
    public final List<DraftImage> images;
    public final Boolean only_send_to_tenant;
    public final Long start_timestamp;
    public final String tenant_name;
    public final String time_zone;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailVacationResponder$b */
    private static final class C16965b extends ProtoAdapter<MailVacationResponder> {
        C16965b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailVacationResponder.class);
        }

        /* renamed from: a */
        public int encodedSize(MailVacationResponder mailVacationResponder) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (mailVacationResponder.enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailVacationResponder.enable);
            } else {
                i = 0;
            }
            if (mailVacationResponder.start_timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, mailVacationResponder.start_timestamp);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (mailVacationResponder.end_timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailVacationResponder.end_timestamp);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (mailVacationResponder.time_zone != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailVacationResponder.time_zone);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (mailVacationResponder.only_send_to_tenant != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, mailVacationResponder.only_send_to_tenant);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (mailVacationResponder.tenant_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, mailVacationResponder.tenant_name);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i12 + i6 + DraftImage.ADAPTER.asRepeated().encodedSizeWithTag(8, mailVacationResponder.images);
            if (mailVacationResponder.auto_reply_summary != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, mailVacationResponder.auto_reply_summary);
            } else {
                i7 = 0;
            }
            int i13 = encodedSizeWithTag + i7;
            if (mailVacationResponder.auto_reply_body != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, mailVacationResponder.auto_reply_body);
            }
            return i13 + i8 + mailVacationResponder.unknownFields().size();
        }

        /* renamed from: a */
        public MailVacationResponder decode(ProtoReader protoReader) throws IOException {
            C16964a aVar = new C16964a();
            aVar.f43468a = false;
            aVar.f43469b = 0L;
            aVar.f43470c = 0L;
            aVar.f43471d = "";
            aVar.f43472e = false;
            aVar.f43473f = "";
            aVar.f43475h = "";
            aVar.f43476i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43468a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43469b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43470c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43471d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 6:
                            aVar.f43472e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43473f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43474g.add(DraftImage.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f43475h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43476i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailVacationResponder mailVacationResponder) throws IOException {
            if (mailVacationResponder.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailVacationResponder.enable);
            }
            if (mailVacationResponder.start_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mailVacationResponder.start_timestamp);
            }
            if (mailVacationResponder.end_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailVacationResponder.end_timestamp);
            }
            if (mailVacationResponder.time_zone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailVacationResponder.time_zone);
            }
            if (mailVacationResponder.only_send_to_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, mailVacationResponder.only_send_to_tenant);
            }
            if (mailVacationResponder.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mailVacationResponder.tenant_name);
            }
            DraftImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, mailVacationResponder.images);
            if (mailVacationResponder.auto_reply_summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, mailVacationResponder.auto_reply_summary);
            }
            if (mailVacationResponder.auto_reply_body != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, mailVacationResponder.auto_reply_body);
            }
            protoWriter.writeBytes(mailVacationResponder.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailVacationResponder$a */
    public static final class C16964a extends Message.Builder<MailVacationResponder, C16964a> {

        /* renamed from: a */
        public Boolean f43468a;

        /* renamed from: b */
        public Long f43469b;

        /* renamed from: c */
        public Long f43470c;

        /* renamed from: d */
        public String f43471d;

        /* renamed from: e */
        public Boolean f43472e;

        /* renamed from: f */
        public String f43473f;

        /* renamed from: g */
        public List<DraftImage> f43474g = Internal.newMutableList();

        /* renamed from: h */
        public String f43475h;

        /* renamed from: i */
        public String f43476i;

        /* renamed from: a */
        public MailVacationResponder build() {
            return new MailVacationResponder(this.f43468a, this.f43469b, this.f43470c, this.f43471d, this.f43472e, this.f43473f, this.f43474g, this.f43475h, this.f43476i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16964a newBuilder() {
        C16964a aVar = new C16964a();
        aVar.f43468a = this.enable;
        aVar.f43469b = this.start_timestamp;
        aVar.f43470c = this.end_timestamp;
        aVar.f43471d = this.time_zone;
        aVar.f43472e = this.only_send_to_tenant;
        aVar.f43473f = this.tenant_name;
        aVar.f43474g = Internal.copyOf("images", this.images);
        aVar.f43475h = this.auto_reply_summary;
        aVar.f43476i = this.auto_reply_body;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailVacationResponder");
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.start_timestamp != null) {
            sb.append(", start_timestamp=");
            sb.append(this.start_timestamp);
        }
        if (this.end_timestamp != null) {
            sb.append(", end_timestamp=");
            sb.append(this.end_timestamp);
        }
        if (this.time_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.time_zone);
        }
        if (this.only_send_to_tenant != null) {
            sb.append(", only_send_to_tenant=");
            sb.append(this.only_send_to_tenant);
        }
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        if (this.auto_reply_summary != null) {
            sb.append(", auto_reply_summary=");
            sb.append(this.auto_reply_summary);
        }
        if (this.auto_reply_body != null) {
            sb.append(", auto_reply_body=");
            sb.append(this.auto_reply_body);
        }
        StringBuilder replace = sb.replace(0, 2, "MailVacationResponder{");
        replace.append('}');
        return replace.toString();
    }

    public MailVacationResponder(Boolean bool, Long l, Long l2, String str, Boolean bool2, String str2, List<DraftImage> list, String str3, String str4) {
        this(bool, l, l2, str, bool2, str2, list, str3, str4, ByteString.EMPTY);
    }

    public MailVacationResponder(Boolean bool, Long l, Long l2, String str, Boolean bool2, String str2, List<DraftImage> list, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
        this.start_timestamp = l;
        this.end_timestamp = l2;
        this.time_zone = str;
        this.only_send_to_tenant = bool2;
        this.tenant_name = str2;
        this.images = Internal.immutableCopyOf("images", list);
        this.auto_reply_summary = str3;
        this.auto_reply_body = str4;
    }
}
