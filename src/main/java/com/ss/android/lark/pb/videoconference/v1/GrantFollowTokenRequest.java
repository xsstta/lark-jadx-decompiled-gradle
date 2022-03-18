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

public final class GrantFollowTokenRequest extends Message<GrantFollowTokenRequest, C50731a> {
    public static final ProtoAdapter<GrantFollowTokenRequest> ADAPTER = new C50732b();
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    public static final Long DEFAULT_TIMESTAMP_MS = 0L;
    private static final long serialVersionUID = 0;
    public final FollowAssociateType associate_type;
    public final String breakout_meeting_id;
    public final String meeting_id;
    public final Long timestamp_ms;
    public final String token;
    public final String url;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GrantFollowTokenRequest$b */
    private static final class C50732b extends ProtoAdapter<GrantFollowTokenRequest> {
        C50732b() {
            super(FieldEncoding.LENGTH_DELIMITED, GrantFollowTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GrantFollowTokenRequest grantFollowTokenRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, grantFollowTokenRequest.meeting_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, grantFollowTokenRequest.url) + ProtoAdapter.STRING.encodedSizeWithTag(3, grantFollowTokenRequest.token) + ProtoAdapter.INT64.encodedSizeWithTag(4, grantFollowTokenRequest.timestamp_ms);
            int i2 = 0;
            if (grantFollowTokenRequest.breakout_meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(21, grantFollowTokenRequest.breakout_meeting_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (grantFollowTokenRequest.associate_type != null) {
                i2 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, grantFollowTokenRequest.associate_type);
            }
            return i3 + i2 + grantFollowTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GrantFollowTokenRequest decode(ProtoReader protoReader) throws IOException {
            C50731a aVar = new C50731a();
            aVar.f126479a = "";
            aVar.f126480b = "";
            aVar.f126481c = "";
            aVar.f126482d = 0L;
            aVar.f126483e = "";
            aVar.f126484f = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126479a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126480b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126481c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f126482d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 21) {
                    aVar.f126483e = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126484f = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GrantFollowTokenRequest grantFollowTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, grantFollowTokenRequest.meeting_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, grantFollowTokenRequest.url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, grantFollowTokenRequest.token);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, grantFollowTokenRequest.timestamp_ms);
            if (grantFollowTokenRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, grantFollowTokenRequest.breakout_meeting_id);
            }
            if (grantFollowTokenRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, grantFollowTokenRequest.associate_type);
            }
            protoWriter.writeBytes(grantFollowTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50731a newBuilder() {
        C50731a aVar = new C50731a();
        aVar.f126479a = this.meeting_id;
        aVar.f126480b = this.url;
        aVar.f126481c = this.token;
        aVar.f126482d = this.timestamp_ms;
        aVar.f126483e = this.breakout_meeting_id;
        aVar.f126484f = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GrantFollowTokenRequest$a */
    public static final class C50731a extends Message.Builder<GrantFollowTokenRequest, C50731a> {

        /* renamed from: a */
        public String f126479a;

        /* renamed from: b */
        public String f126480b;

        /* renamed from: c */
        public String f126481c;

        /* renamed from: d */
        public Long f126482d;

        /* renamed from: e */
        public String f126483e;

        /* renamed from: f */
        public FollowAssociateType f126484f;

        /* renamed from: a */
        public GrantFollowTokenRequest build() {
            String str;
            String str2;
            Long l;
            String str3 = this.f126479a;
            if (str3 != null && (str = this.f126480b) != null && (str2 = this.f126481c) != null && (l = this.f126482d) != null) {
                return new GrantFollowTokenRequest(str3, str, str2, l, this.f126483e, this.f126484f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "meeting_id", this.f126480b, "url", this.f126481c, "token", this.f126482d, "timestamp_ms");
        }

        /* renamed from: a */
        public C50731a mo175451a(Long l) {
            this.f126482d = l;
            return this;
        }

        /* renamed from: b */
        public C50731a mo175454b(String str) {
            this.f126480b = str;
            return this;
        }

        /* renamed from: c */
        public C50731a mo175455c(String str) {
            this.f126481c = str;
            return this;
        }

        /* renamed from: a */
        public C50731a mo175452a(String str) {
            this.f126479a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GrantFollowTokenRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", timestamp_ms=");
        sb.append(this.timestamp_ms);
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GrantFollowTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GrantFollowTokenRequest(String str, String str2, String str3, Long l, String str4, FollowAssociateType followAssociateType) {
        this(str, str2, str3, l, str4, followAssociateType, ByteString.EMPTY);
    }

    public GrantFollowTokenRequest(String str, String str2, String str3, Long l, String str4, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.url = str2;
        this.token = str3;
        this.timestamp_ms = l;
        this.breakout_meeting_id = str4;
        this.associate_type = followAssociateType;
    }
}
