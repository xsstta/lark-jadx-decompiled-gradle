package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetInvitationLinkResponse extends Message<GetInvitationLinkResponse, C16254a> {
    public static final ProtoAdapter<GetInvitationLinkResponse> ADAPTER = new C16255b();
    public static final Long DEFAULT_EXPIRED_TIMESTAMP = 0L;
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final Long expired_timestamp;
    public final String invitation_qr_url;
    public final String invitation_url;
    public final String share_token;
    public final Boolean success;
    public final String team_code;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse$b */
    private static final class C16255b extends ProtoAdapter<GetInvitationLinkResponse> {
        C16255b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInvitationLinkResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInvitationLinkResponse getInvitationLinkResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getInvitationLinkResponse.success);
            int i5 = 0;
            if (getInvitationLinkResponse.invitation_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getInvitationLinkResponse.invitation_url);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (getInvitationLinkResponse.expired_timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, getInvitationLinkResponse.expired_timestamp);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (getInvitationLinkResponse.invitation_qr_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getInvitationLinkResponse.invitation_qr_url);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getInvitationLinkResponse.team_code != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, getInvitationLinkResponse.team_code);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getInvitationLinkResponse.share_token != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, getInvitationLinkResponse.share_token);
            }
            return i9 + i5 + getInvitationLinkResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetInvitationLinkResponse decode(ProtoReader protoReader) throws IOException {
            C16254a aVar = new C16254a();
            aVar.f42453a = false;
            aVar.f42454b = "";
            aVar.f42455c = 0L;
            aVar.f42456d = "";
            aVar.f42457e = "";
            aVar.f42458f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42453a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42454b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42455c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42456d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42457e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42458f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetInvitationLinkResponse getInvitationLinkResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getInvitationLinkResponse.success);
            if (getInvitationLinkResponse.invitation_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getInvitationLinkResponse.invitation_url);
            }
            if (getInvitationLinkResponse.expired_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getInvitationLinkResponse.expired_timestamp);
            }
            if (getInvitationLinkResponse.invitation_qr_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getInvitationLinkResponse.invitation_qr_url);
            }
            if (getInvitationLinkResponse.team_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getInvitationLinkResponse.team_code);
            }
            if (getInvitationLinkResponse.share_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getInvitationLinkResponse.share_token);
            }
            protoWriter.writeBytes(getInvitationLinkResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse$a */
    public static final class C16254a extends Message.Builder<GetInvitationLinkResponse, C16254a> {

        /* renamed from: a */
        public Boolean f42453a;

        /* renamed from: b */
        public String f42454b;

        /* renamed from: c */
        public Long f42455c;

        /* renamed from: d */
        public String f42456d;

        /* renamed from: e */
        public String f42457e;

        /* renamed from: f */
        public String f42458f;

        /* renamed from: a */
        public GetInvitationLinkResponse build() {
            Boolean bool = this.f42453a;
            if (bool != null) {
                return new GetInvitationLinkResponse(bool, this.f42454b, this.f42455c, this.f42456d, this.f42457e, this.f42458f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "success");
        }
    }

    @Override // com.squareup.wire.Message
    public C16254a newBuilder() {
        C16254a aVar = new C16254a();
        aVar.f42453a = this.success;
        aVar.f42454b = this.invitation_url;
        aVar.f42455c = this.expired_timestamp;
        aVar.f42456d = this.invitation_qr_url;
        aVar.f42457e = this.team_code;
        aVar.f42458f = this.share_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetInvitationLinkResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.success);
        if (this.invitation_url != null) {
            sb.append(", invitation_url=");
            sb.append(this.invitation_url);
        }
        if (this.expired_timestamp != null) {
            sb.append(", expired_timestamp=");
            sb.append(this.expired_timestamp);
        }
        if (this.invitation_qr_url != null) {
            sb.append(", invitation_qr_url=");
            sb.append(this.invitation_qr_url);
        }
        if (this.team_code != null) {
            sb.append(", team_code=");
            sb.append(this.team_code);
        }
        if (this.share_token != null) {
            sb.append(", share_token=");
            sb.append(this.share_token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInvitationLinkResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetInvitationLinkResponse(Boolean bool, String str, Long l, String str2, String str3, String str4) {
        this(bool, str, l, str2, str3, str4, ByteString.EMPTY);
    }

    public GetInvitationLinkResponse(Boolean bool, String str, Long l, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.invitation_url = str;
        this.expired_timestamp = l;
        this.invitation_qr_url = str2;
        this.team_code = str3;
        this.share_token = str4;
    }
}
