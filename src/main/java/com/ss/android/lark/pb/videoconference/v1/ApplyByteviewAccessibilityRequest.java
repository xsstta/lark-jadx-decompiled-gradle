package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ApplyByteviewAccessibilityRequest extends Message<ApplyByteviewAccessibilityRequest, C50461a> {
    public static final ProtoAdapter<ApplyByteviewAccessibilityRequest> ADAPTER = new C50462b();
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final FollowAssociateType associate_type;
    public final String breakout_meeting_id;
    public final String meeting_id;
    public final String share_screen_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyByteviewAccessibilityRequest$b */
    private static final class C50462b extends ProtoAdapter<ApplyByteviewAccessibilityRequest> {
        C50462b() {
            super(FieldEncoding.LENGTH_DELIMITED, ApplyByteviewAccessibilityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ApplyByteviewAccessibilityRequest applyByteviewAccessibilityRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (applyByteviewAccessibilityRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, applyByteviewAccessibilityRequest.meeting_id);
            } else {
                i = 0;
            }
            if (applyByteviewAccessibilityRequest.share_screen_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, applyByteviewAccessibilityRequest.share_screen_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (applyByteviewAccessibilityRequest.breakout_meeting_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(21, applyByteviewAccessibilityRequest.breakout_meeting_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (applyByteviewAccessibilityRequest.associate_type != null) {
                i4 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, applyByteviewAccessibilityRequest.associate_type);
            }
            return i6 + i4 + applyByteviewAccessibilityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ApplyByteviewAccessibilityRequest decode(ProtoReader protoReader) throws IOException {
            C50461a aVar = new C50461a();
            aVar.f126000a = "";
            aVar.f126001b = "";
            aVar.f126002c = "";
            aVar.f126003d = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126000a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126001b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 21) {
                    aVar.f126002c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126003d = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ApplyByteviewAccessibilityRequest applyByteviewAccessibilityRequest) throws IOException {
            if (applyByteviewAccessibilityRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, applyByteviewAccessibilityRequest.meeting_id);
            }
            if (applyByteviewAccessibilityRequest.share_screen_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, applyByteviewAccessibilityRequest.share_screen_id);
            }
            if (applyByteviewAccessibilityRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, applyByteviewAccessibilityRequest.breakout_meeting_id);
            }
            if (applyByteviewAccessibilityRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, applyByteviewAccessibilityRequest.associate_type);
            }
            protoWriter.writeBytes(applyByteviewAccessibilityRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyByteviewAccessibilityRequest$a */
    public static final class C50461a extends Message.Builder<ApplyByteviewAccessibilityRequest, C50461a> {

        /* renamed from: a */
        public String f126000a;

        /* renamed from: b */
        public String f126001b;

        /* renamed from: c */
        public String f126002c;

        /* renamed from: d */
        public FollowAssociateType f126003d;

        /* renamed from: a */
        public ApplyByteviewAccessibilityRequest build() {
            return new ApplyByteviewAccessibilityRequest(this.f126000a, this.f126001b, this.f126002c, this.f126003d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50461a mo174821a(String str) {
            this.f126000a = str;
            return this;
        }

        /* renamed from: b */
        public C50461a mo174823b(String str) {
            this.f126001b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50461a newBuilder() {
        C50461a aVar = new C50461a();
        aVar.f126000a = this.meeting_id;
        aVar.f126001b = this.share_screen_id;
        aVar.f126002c = this.breakout_meeting_id;
        aVar.f126003d = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ApplyByteviewAccessibilityRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.share_screen_id != null) {
            sb.append(", share_screen_id=");
            sb.append(this.share_screen_id);
        }
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ApplyByteviewAccessibilityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ApplyByteviewAccessibilityRequest(String str, String str2, String str3, FollowAssociateType followAssociateType) {
        this(str, str2, str3, followAssociateType, ByteString.EMPTY);
    }

    public ApplyByteviewAccessibilityRequest(String str, String str2, String str3, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.share_screen_id = str2;
        this.breakout_meeting_id = str3;
        this.associate_type = followAssociateType;
    }
}
