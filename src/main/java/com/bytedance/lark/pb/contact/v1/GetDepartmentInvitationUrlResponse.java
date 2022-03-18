package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetDepartmentInvitationUrlResponse extends Message<GetDepartmentInvitationUrlResponse, C16234a> {
    public static final ProtoAdapter<GetDepartmentInvitationUrlResponse> ADAPTER = new C16235b();
    public static final Long DEFAULT_EXPIRED_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final ClassPathName class_path_name;
    public final Long expired_timestamp;
    public final String invitation_msg;
    public final String invitation_qr_url;
    public final String invitation_url;
    public final String inviter_avatar;
    public final String inviter_name;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse$b */
    private static final class C16235b extends ProtoAdapter<GetDepartmentInvitationUrlResponse> {
        C16235b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDepartmentInvitationUrlResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDepartmentInvitationUrlResponse getDepartmentInvitationUrlResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (getDepartmentInvitationUrlResponse.invitation_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getDepartmentInvitationUrlResponse.invitation_url);
            } else {
                i = 0;
            }
            if (getDepartmentInvitationUrlResponse.invitation_qr_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getDepartmentInvitationUrlResponse.invitation_qr_url);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (getDepartmentInvitationUrlResponse.expired_timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getDepartmentInvitationUrlResponse.expired_timestamp);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (getDepartmentInvitationUrlResponse.inviter_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getDepartmentInvitationUrlResponse.inviter_name);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (getDepartmentInvitationUrlResponse.inviter_avatar != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, getDepartmentInvitationUrlResponse.inviter_avatar);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (getDepartmentInvitationUrlResponse.class_path_name != null) {
                i6 = ClassPathName.ADAPTER.encodedSizeWithTag(6, getDepartmentInvitationUrlResponse.class_path_name);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (getDepartmentInvitationUrlResponse.invitation_msg != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, getDepartmentInvitationUrlResponse.invitation_msg);
            }
            return i12 + i7 + getDepartmentInvitationUrlResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDepartmentInvitationUrlResponse decode(ProtoReader protoReader) throws IOException {
            C16234a aVar = new C16234a();
            aVar.f42425a = "";
            aVar.f42426b = "";
            aVar.f42427c = 0L;
            aVar.f42428d = "";
            aVar.f42429e = "";
            aVar.f42431g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42425a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42426b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42427c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42428d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42429e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42430f = ClassPathName.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42431g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetDepartmentInvitationUrlResponse getDepartmentInvitationUrlResponse) throws IOException {
            if (getDepartmentInvitationUrlResponse.invitation_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getDepartmentInvitationUrlResponse.invitation_url);
            }
            if (getDepartmentInvitationUrlResponse.invitation_qr_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getDepartmentInvitationUrlResponse.invitation_qr_url);
            }
            if (getDepartmentInvitationUrlResponse.expired_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getDepartmentInvitationUrlResponse.expired_timestamp);
            }
            if (getDepartmentInvitationUrlResponse.inviter_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getDepartmentInvitationUrlResponse.inviter_name);
            }
            if (getDepartmentInvitationUrlResponse.inviter_avatar != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getDepartmentInvitationUrlResponse.inviter_avatar);
            }
            if (getDepartmentInvitationUrlResponse.class_path_name != null) {
                ClassPathName.ADAPTER.encodeWithTag(protoWriter, 6, getDepartmentInvitationUrlResponse.class_path_name);
            }
            if (getDepartmentInvitationUrlResponse.invitation_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getDepartmentInvitationUrlResponse.invitation_msg);
            }
            protoWriter.writeBytes(getDepartmentInvitationUrlResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse$a */
    public static final class C16234a extends Message.Builder<GetDepartmentInvitationUrlResponse, C16234a> {

        /* renamed from: a */
        public String f42425a;

        /* renamed from: b */
        public String f42426b;

        /* renamed from: c */
        public Long f42427c;

        /* renamed from: d */
        public String f42428d;

        /* renamed from: e */
        public String f42429e;

        /* renamed from: f */
        public ClassPathName f42430f;

        /* renamed from: g */
        public String f42431g;

        /* renamed from: a */
        public GetDepartmentInvitationUrlResponse build() {
            return new GetDepartmentInvitationUrlResponse(this.f42425a, this.f42426b, this.f42427c, this.f42428d, this.f42429e, this.f42430f, this.f42431g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16234a newBuilder() {
        C16234a aVar = new C16234a();
        aVar.f42425a = this.invitation_url;
        aVar.f42426b = this.invitation_qr_url;
        aVar.f42427c = this.expired_timestamp;
        aVar.f42428d = this.inviter_name;
        aVar.f42429e = this.inviter_avatar;
        aVar.f42430f = this.class_path_name;
        aVar.f42431g = this.invitation_msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDepartmentInvitationUrlResponse");
        StringBuilder sb = new StringBuilder();
        if (this.invitation_url != null) {
            sb.append(", invitation_url=");
            sb.append(this.invitation_url);
        }
        if (this.invitation_qr_url != null) {
            sb.append(", invitation_qr_url=");
            sb.append(this.invitation_qr_url);
        }
        if (this.expired_timestamp != null) {
            sb.append(", expired_timestamp=");
            sb.append(this.expired_timestamp);
        }
        if (this.inviter_name != null) {
            sb.append(", inviter_name=");
            sb.append(this.inviter_name);
        }
        if (this.inviter_avatar != null) {
            sb.append(", inviter_avatar=");
            sb.append(this.inviter_avatar);
        }
        if (this.class_path_name != null) {
            sb.append(", class_path_name=");
            sb.append(this.class_path_name);
        }
        if (this.invitation_msg != null) {
            sb.append(", invitation_msg=");
            sb.append(this.invitation_msg);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDepartmentInvitationUrlResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDepartmentInvitationUrlResponse(String str, String str2, Long l, String str3, String str4, ClassPathName classPathName, String str5) {
        this(str, str2, l, str3, str4, classPathName, str5, ByteString.EMPTY);
    }

    public GetDepartmentInvitationUrlResponse(String str, String str2, Long l, String str3, String str4, ClassPathName classPathName, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitation_url = str;
        this.invitation_qr_url = str2;
        this.expired_timestamp = l;
        this.inviter_name = str3;
        this.inviter_avatar = str4;
        this.class_path_name = classPathName;
        this.invitation_msg = str5;
    }
}
