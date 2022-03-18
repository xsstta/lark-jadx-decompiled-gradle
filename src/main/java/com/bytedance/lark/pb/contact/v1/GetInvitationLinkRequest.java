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

public final class GetInvitationLinkRequest extends Message<GetInvitationLinkRequest, C16252a> {
    public static final ProtoAdapter<GetInvitationLinkRequest> ADAPTER = new C16253b();
    public static final Long DEFAULT_DEPARTMENT_ID = 0L;
    public static final InvitationPlatformType DEFAULT_INVITATION_PLATFORM = InvitationPlatformType.PlatformIPhone;
    public static final Boolean DEFAULT_IS_REFRESH = false;
    public static final Boolean DEFAULT_IS_SAME_DEPARTMENT = false;
    private static final long serialVersionUID = 0;
    public final Long department_id;
    public final InvitationPlatformType invitation_platform;
    public final Boolean is_refresh;
    public final Boolean is_same_department;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInvitationLinkRequest$b */
    private static final class C16253b extends ProtoAdapter<GetInvitationLinkRequest> {
        C16253b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInvitationLinkRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInvitationLinkRequest getInvitationLinkRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = InvitationPlatformType.ADAPTER.encodedSizeWithTag(3, getInvitationLinkRequest.invitation_platform);
            int i3 = 0;
            if (getInvitationLinkRequest.is_refresh != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, getInvitationLinkRequest.is_refresh);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getInvitationLinkRequest.is_same_department != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getInvitationLinkRequest.is_same_department);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getInvitationLinkRequest.department_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(6, getInvitationLinkRequest.department_id);
            }
            return i5 + i3 + getInvitationLinkRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetInvitationLinkRequest decode(ProtoReader protoReader) throws IOException {
            C16252a aVar = new C16252a();
            aVar.f42449a = InvitationPlatformType.PlatformIPhone;
            aVar.f42450b = false;
            aVar.f42451c = false;
            aVar.f42452d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 3) {
                    try {
                        aVar.f42449a = InvitationPlatformType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f42450b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f42451c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42452d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInvitationLinkRequest getInvitationLinkRequest) throws IOException {
            InvitationPlatformType.ADAPTER.encodeWithTag(protoWriter, 3, getInvitationLinkRequest.invitation_platform);
            if (getInvitationLinkRequest.is_refresh != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getInvitationLinkRequest.is_refresh);
            }
            if (getInvitationLinkRequest.is_same_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getInvitationLinkRequest.is_same_department);
            }
            if (getInvitationLinkRequest.department_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, getInvitationLinkRequest.department_id);
            }
            protoWriter.writeBytes(getInvitationLinkRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16252a newBuilder() {
        C16252a aVar = new C16252a();
        aVar.f42449a = this.invitation_platform;
        aVar.f42450b = this.is_refresh;
        aVar.f42451c = this.is_same_department;
        aVar.f42452d = this.department_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInvitationLinkRequest$a */
    public static final class C16252a extends Message.Builder<GetInvitationLinkRequest, C16252a> {

        /* renamed from: a */
        public InvitationPlatformType f42449a;

        /* renamed from: b */
        public Boolean f42450b;

        /* renamed from: c */
        public Boolean f42451c;

        /* renamed from: d */
        public Long f42452d;

        /* renamed from: a */
        public GetInvitationLinkRequest build() {
            InvitationPlatformType invitationPlatformType = this.f42449a;
            if (invitationPlatformType != null) {
                return new GetInvitationLinkRequest(invitationPlatformType, this.f42450b, this.f42451c, this.f42452d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(invitationPlatformType, "invitation_platform");
        }

        /* renamed from: a */
        public C16252a mo58218a(Long l) {
            this.f42452d = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetInvitationLinkRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", invitation_platform=");
        sb.append(this.invitation_platform);
        if (this.is_refresh != null) {
            sb.append(", is_refresh=");
            sb.append(this.is_refresh);
        }
        if (this.is_same_department != null) {
            sb.append(", is_same_department=");
            sb.append(this.is_same_department);
        }
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInvitationLinkRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetInvitationLinkRequest(InvitationPlatformType invitationPlatformType, Boolean bool, Boolean bool2, Long l) {
        this(invitationPlatformType, bool, bool2, l, ByteString.EMPTY);
    }

    public GetInvitationLinkRequest(InvitationPlatformType invitationPlatformType, Boolean bool, Boolean bool2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitation_platform = invitationPlatformType;
        this.is_refresh = bool;
        this.is_same_department = bool2;
        this.department_id = l;
    }
}
