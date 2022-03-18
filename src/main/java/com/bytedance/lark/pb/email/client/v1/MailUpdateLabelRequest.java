package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateLabelRequest extends Message<MailUpdateLabelRequest, C16952a> {
    public static final ProtoAdapter<MailUpdateLabelRequest> ADAPTER = new C16953b();
    public static final Boolean DEFAULT_APPLY_TO_ALL_DESCENDANTS = false;
    public static final Boolean DEFAULT_SHOW_IN_LABEL_LIST = false;
    public static final Long DEFAULT_USER_ORDERED_INDEX = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean apply_to_all_descendants;
    public final String bg_color;
    public final String font_color;
    public final String label_id;
    public final String label_name;
    public final String parent_id;
    public final Boolean show_in_label_list;
    public final Long user_ordered_index;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateLabelRequest$b */
    private static final class C16953b extends ProtoAdapter<MailUpdateLabelRequest> {
        C16953b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateLabelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateLabelRequest mailUpdateLabelRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (mailUpdateLabelRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateLabelRequest.label_id);
            } else {
                i = 0;
            }
            if (mailUpdateLabelRequest.label_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailUpdateLabelRequest.label_name);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (mailUpdateLabelRequest.bg_color != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailUpdateLabelRequest.bg_color);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (mailUpdateLabelRequest.font_color != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailUpdateLabelRequest.font_color);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (mailUpdateLabelRequest.show_in_label_list != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mailUpdateLabelRequest.show_in_label_list);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (mailUpdateLabelRequest.user_ordered_index != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, mailUpdateLabelRequest.user_ordered_index);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (mailUpdateLabelRequest.parent_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, mailUpdateLabelRequest.parent_id);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (mailUpdateLabelRequest.apply_to_all_descendants != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, mailUpdateLabelRequest.apply_to_all_descendants);
            }
            return i14 + i8 + mailUpdateLabelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateLabelRequest decode(ProtoReader protoReader) throws IOException {
            C16952a aVar = new C16952a();
            aVar.f43452a = "";
            aVar.f43453b = "";
            aVar.f43454c = "";
            aVar.f43455d = "";
            aVar.f43456e = false;
            aVar.f43457f = 0L;
            aVar.f43458g = "";
            aVar.f43459h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43452a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43453b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43454c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43455d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43456e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43457f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43458g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43459h = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MailUpdateLabelRequest mailUpdateLabelRequest) throws IOException {
            if (mailUpdateLabelRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateLabelRequest.label_id);
            }
            if (mailUpdateLabelRequest.label_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUpdateLabelRequest.label_name);
            }
            if (mailUpdateLabelRequest.bg_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailUpdateLabelRequest.bg_color);
            }
            if (mailUpdateLabelRequest.font_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailUpdateLabelRequest.font_color);
            }
            if (mailUpdateLabelRequest.show_in_label_list != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mailUpdateLabelRequest.show_in_label_list);
            }
            if (mailUpdateLabelRequest.user_ordered_index != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, mailUpdateLabelRequest.user_ordered_index);
            }
            if (mailUpdateLabelRequest.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mailUpdateLabelRequest.parent_id);
            }
            if (mailUpdateLabelRequest.apply_to_all_descendants != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, mailUpdateLabelRequest.apply_to_all_descendants);
            }
            protoWriter.writeBytes(mailUpdateLabelRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateLabelRequest$a */
    public static final class C16952a extends Message.Builder<MailUpdateLabelRequest, C16952a> {

        /* renamed from: a */
        public String f43452a;

        /* renamed from: b */
        public String f43453b;

        /* renamed from: c */
        public String f43454c;

        /* renamed from: d */
        public String f43455d;

        /* renamed from: e */
        public Boolean f43456e;

        /* renamed from: f */
        public Long f43457f;

        /* renamed from: g */
        public String f43458g;

        /* renamed from: h */
        public Boolean f43459h;

        /* renamed from: a */
        public MailUpdateLabelRequest build() {
            return new MailUpdateLabelRequest(this.f43452a, this.f43453b, this.f43454c, this.f43455d, this.f43456e, this.f43457f, this.f43458g, this.f43459h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16952a newBuilder() {
        C16952a aVar = new C16952a();
        aVar.f43452a = this.label_id;
        aVar.f43453b = this.label_name;
        aVar.f43454c = this.bg_color;
        aVar.f43455d = this.font_color;
        aVar.f43456e = this.show_in_label_list;
        aVar.f43457f = this.user_ordered_index;
        aVar.f43458g = this.parent_id;
        aVar.f43459h = this.apply_to_all_descendants;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateLabelRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.label_name != null) {
            sb.append(", label_name=");
            sb.append(this.label_name);
        }
        if (this.bg_color != null) {
            sb.append(", bg_color=");
            sb.append(this.bg_color);
        }
        if (this.font_color != null) {
            sb.append(", font_color=");
            sb.append(this.font_color);
        }
        if (this.show_in_label_list != null) {
            sb.append(", show_in_label_list=");
            sb.append(this.show_in_label_list);
        }
        if (this.user_ordered_index != null) {
            sb.append(", user_ordered_index=");
            sb.append(this.user_ordered_index);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.apply_to_all_descendants != null) {
            sb.append(", apply_to_all_descendants=");
            sb.append(this.apply_to_all_descendants);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateLabelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateLabelRequest(String str, String str2, String str3, String str4, Boolean bool, Long l, String str5, Boolean bool2) {
        this(str, str2, str3, str4, bool, l, str5, bool2, ByteString.EMPTY);
    }

    public MailUpdateLabelRequest(String str, String str2, String str3, String str4, Boolean bool, Long l, String str5, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.label_name = str2;
        this.bg_color = str3;
        this.font_color = str4;
        this.show_in_label_list = bool;
        this.user_ordered_index = l;
        this.parent_id = str5;
        this.apply_to_all_descendants = bool2;
    }
}
