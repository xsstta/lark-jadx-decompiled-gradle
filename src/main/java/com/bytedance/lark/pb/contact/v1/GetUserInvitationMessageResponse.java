package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserInvitationMessageResponse extends Message<GetUserInvitationMessageResponse, C16278a> {
    public static final ProtoAdapter<GetUserInvitationMessageResponse> ADAPTER = new C16279b();
    public static final BannerStatus DEFAULT_BANNER_STATUS = BannerStatus.MustShowBanner;
    public static final Boolean DEFAULT_ENABLE_SHOW = false;
    private static final long serialVersionUID = 0;
    public final BannerStatus banner_status;
    public final Boolean enable_show;

    public enum BannerStatus implements WireEnum {
        MustShowBanner(0),
        CanClosedBanner(1),
        ClosedBanner(2);
        
        public static final ProtoAdapter<BannerStatus> ADAPTER = ProtoAdapter.newEnumAdapter(BannerStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BannerStatus fromValue(int i) {
            if (i == 0) {
                return MustShowBanner;
            }
            if (i == 1) {
                return CanClosedBanner;
            }
            if (i != 2) {
                return null;
            }
            return ClosedBanner;
        }

        private BannerStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserInvitationMessageResponse$b */
    private static final class C16279b extends ProtoAdapter<GetUserInvitationMessageResponse> {
        C16279b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserInvitationMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserInvitationMessageResponse getUserInvitationMessageResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUserInvitationMessageResponse.enable_show);
            if (getUserInvitationMessageResponse.banner_status != null) {
                i = BannerStatus.ADAPTER.encodedSizeWithTag(2, getUserInvitationMessageResponse.banner_status);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getUserInvitationMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserInvitationMessageResponse decode(ProtoReader protoReader) throws IOException {
            C16278a aVar = new C16278a();
            aVar.f42473a = false;
            aVar.f42474b = BannerStatus.MustShowBanner;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42473a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42474b = BannerStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserInvitationMessageResponse getUserInvitationMessageResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUserInvitationMessageResponse.enable_show);
            if (getUserInvitationMessageResponse.banner_status != null) {
                BannerStatus.ADAPTER.encodeWithTag(protoWriter, 2, getUserInvitationMessageResponse.banner_status);
            }
            protoWriter.writeBytes(getUserInvitationMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserInvitationMessageResponse$a */
    public static final class C16278a extends Message.Builder<GetUserInvitationMessageResponse, C16278a> {

        /* renamed from: a */
        public Boolean f42473a;

        /* renamed from: b */
        public BannerStatus f42474b;

        /* renamed from: a */
        public GetUserInvitationMessageResponse build() {
            Boolean bool = this.f42473a;
            if (bool != null) {
                return new GetUserInvitationMessageResponse(bool, this.f42474b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "enable_show");
        }
    }

    @Override // com.squareup.wire.Message
    public C16278a newBuilder() {
        C16278a aVar = new C16278a();
        aVar.f42473a = this.enable_show;
        aVar.f42474b = this.banner_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserInvitationMessageResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", enable_show=");
        sb.append(this.enable_show);
        if (this.banner_status != null) {
            sb.append(", banner_status=");
            sb.append(this.banner_status);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserInvitationMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserInvitationMessageResponse(Boolean bool, BannerStatus bannerStatus) {
        this(bool, bannerStatus, ByteString.EMPTY);
    }

    public GetUserInvitationMessageResponse(Boolean bool, BannerStatus bannerStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_show = bool;
        this.banner_status = bannerStatus;
    }
}
