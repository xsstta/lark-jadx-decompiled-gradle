package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RequestFollowPermRequest extends Message<RequestFollowPermRequest, C50982a> {
    public static final ProtoAdapter<RequestFollowPermRequest> ADAPTER = new C50983b();
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    public static final Boolean DEFAULT_EXTERNAL_ACCESS = false;
    private static final long serialVersionUID = 0;
    public final FollowAssociateType associate_type;
    public final String breakout_meeting_id;
    public final Boolean external_access;
    public final String meeting_id;
    public final String url;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RequestFollowPermRequest$b */
    private static final class C50983b extends ProtoAdapter<RequestFollowPermRequest> {
        C50983b() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestFollowPermRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RequestFollowPermRequest requestFollowPermRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, requestFollowPermRequest.meeting_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, requestFollowPermRequest.url);
            int i3 = 0;
            if (requestFollowPermRequest.external_access != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, requestFollowPermRequest.external_access);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (requestFollowPermRequest.breakout_meeting_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(21, requestFollowPermRequest.breakout_meeting_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (requestFollowPermRequest.associate_type != null) {
                i3 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, requestFollowPermRequest.associate_type);
            }
            return i5 + i3 + requestFollowPermRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RequestFollowPermRequest decode(ProtoReader protoReader) throws IOException {
            C50982a aVar = new C50982a();
            aVar.f127011a = "";
            aVar.f127012b = "";
            aVar.f127013c = false;
            aVar.f127014d = "";
            aVar.f127015e = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127011a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127012b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127013c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 21) {
                    aVar.f127014d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f127015e = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RequestFollowPermRequest requestFollowPermRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, requestFollowPermRequest.meeting_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, requestFollowPermRequest.url);
            if (requestFollowPermRequest.external_access != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, requestFollowPermRequest.external_access);
            }
            if (requestFollowPermRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, requestFollowPermRequest.breakout_meeting_id);
            }
            if (requestFollowPermRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, requestFollowPermRequest.associate_type);
            }
            protoWriter.writeBytes(requestFollowPermRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RequestFollowPermRequest$a */
    public static final class C50982a extends Message.Builder<RequestFollowPermRequest, C50982a> {

        /* renamed from: a */
        public String f127011a;

        /* renamed from: b */
        public String f127012b;

        /* renamed from: c */
        public Boolean f127013c;

        /* renamed from: d */
        public String f127014d;

        /* renamed from: e */
        public FollowAssociateType f127015e;

        /* renamed from: a */
        public RequestFollowPermRequest build() {
            String str;
            String str2 = this.f127011a;
            if (str2 != null && (str = this.f127012b) != null) {
                return new RequestFollowPermRequest(str2, str, this.f127013c, this.f127014d, this.f127015e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "meeting_id", this.f127012b, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public C50982a newBuilder() {
        C50982a aVar = new C50982a();
        aVar.f127011a = this.meeting_id;
        aVar.f127012b = this.url;
        aVar.f127013c = this.external_access;
        aVar.f127014d = this.breakout_meeting_id;
        aVar.f127015e = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RequestFollowPermRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", url=");
        sb.append(this.url);
        if (this.external_access != null) {
            sb.append(", external_access=");
            sb.append(this.external_access);
        }
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "RequestFollowPermRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RequestFollowPermRequest(String str, String str2, Boolean bool, String str3, FollowAssociateType followAssociateType) {
        this(str, str2, bool, str3, followAssociateType, ByteString.EMPTY);
    }

    public RequestFollowPermRequest(String str, String str2, Boolean bool, String str3, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.url = str2;
        this.external_access = bool;
        this.breakout_meeting_id = str3;
        this.associate_type = followAssociateType;
    }
}
