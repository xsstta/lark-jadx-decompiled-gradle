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

public final class PullAllFollowStatesRequest extends Message<PullAllFollowStatesRequest, C50916a> {
    public static final ProtoAdapter<PullAllFollowStatesRequest> ADAPTER = new C50917b();
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final FollowAssociateType associate_type;
    public final String breakout_meeting_id;
    public final String meeting_id;
    public final String next_key;
    public final String share_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesRequest$b */
    private static final class C50917b extends ProtoAdapter<PullAllFollowStatesRequest> {
        C50917b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllFollowStatesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllFollowStatesRequest pullAllFollowStatesRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullAllFollowStatesRequest.share_id);
            int i4 = 0;
            if (pullAllFollowStatesRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pullAllFollowStatesRequest.meeting_id);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (pullAllFollowStatesRequest.next_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(10, pullAllFollowStatesRequest.next_key);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (pullAllFollowStatesRequest.breakout_meeting_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(21, pullAllFollowStatesRequest.breakout_meeting_id);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pullAllFollowStatesRequest.associate_type != null) {
                i4 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, pullAllFollowStatesRequest.associate_type);
            }
            return i7 + i4 + pullAllFollowStatesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllFollowStatesRequest decode(ProtoReader protoReader) throws IOException {
            C50916a aVar = new C50916a();
            aVar.f126908a = "";
            aVar.f126909b = "";
            aVar.f126910c = "";
            aVar.f126911d = "";
            aVar.f126912e = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126908a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126909b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 10) {
                    aVar.f126910c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 21) {
                    aVar.f126911d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126912e = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllFollowStatesRequest pullAllFollowStatesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullAllFollowStatesRequest.share_id);
            if (pullAllFollowStatesRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullAllFollowStatesRequest.meeting_id);
            }
            if (pullAllFollowStatesRequest.next_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, pullAllFollowStatesRequest.next_key);
            }
            if (pullAllFollowStatesRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, pullAllFollowStatesRequest.breakout_meeting_id);
            }
            if (pullAllFollowStatesRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, pullAllFollowStatesRequest.associate_type);
            }
            protoWriter.writeBytes(pullAllFollowStatesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesRequest$a */
    public static final class C50916a extends Message.Builder<PullAllFollowStatesRequest, C50916a> {

        /* renamed from: a */
        public String f126908a;

        /* renamed from: b */
        public String f126909b;

        /* renamed from: c */
        public String f126910c;

        /* renamed from: d */
        public String f126911d;

        /* renamed from: e */
        public FollowAssociateType f126912e;

        /* renamed from: a */
        public PullAllFollowStatesRequest build() {
            String str = this.f126908a;
            if (str != null) {
                return new PullAllFollowStatesRequest(str, this.f126909b, this.f126910c, this.f126911d, this.f126912e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "share_id");
        }

        /* renamed from: a */
        public C50916a mo175897a(String str) {
            this.f126908a = str;
            return this;
        }

        /* renamed from: b */
        public C50916a mo175899b(String str) {
            this.f126909b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50916a newBuilder() {
        C50916a aVar = new C50916a();
        aVar.f126908a = this.share_id;
        aVar.f126909b = this.meeting_id;
        aVar.f126910c = this.next_key;
        aVar.f126911d = this.breakout_meeting_id;
        aVar.f126912e = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullAllFollowStatesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", share_id=");
        sb.append(this.share_id);
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.next_key != null) {
            sb.append(", next_key=");
            sb.append(this.next_key);
        }
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAllFollowStatesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllFollowStatesRequest(String str, String str2, String str3, String str4, FollowAssociateType followAssociateType) {
        this(str, str2, str3, str4, followAssociateType, ByteString.EMPTY);
    }

    public PullAllFollowStatesRequest(String str, String str2, String str3, String str4, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_id = str;
        this.meeting_id = str2;
        this.next_key = str3;
        this.breakout_meeting_id = str4;
        this.associate_type = followAssociateType;
    }
}
