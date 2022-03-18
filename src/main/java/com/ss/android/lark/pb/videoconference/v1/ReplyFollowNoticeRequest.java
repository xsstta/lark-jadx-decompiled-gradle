package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ReplyFollowNoticeRequest extends Message<ReplyFollowNoticeRequest, C50970a> {
    public static final ProtoAdapter<ReplyFollowNoticeRequest> ADAPTER = new C50971b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN_ACTION;
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final FollowAssociateType associate_type;
    public final String breakout_meeting_id;
    public final String meeting_id;
    public final String message_id;

    public enum Action implements WireEnum {
        UNKNOWN_ACTION(0),
        AGREE(1),
        REJECT(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ACTION;
            }
            if (i == 1) {
                return AGREE;
            }
            if (i != 2) {
                return null;
            }
            return REJECT;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyFollowNoticeRequest$b */
    private static final class C50971b extends ProtoAdapter<ReplyFollowNoticeRequest> {
        C50971b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplyFollowNoticeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplyFollowNoticeRequest replyFollowNoticeRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (replyFollowNoticeRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, replyFollowNoticeRequest.meeting_id);
            } else {
                i = 0;
            }
            if (replyFollowNoticeRequest.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, replyFollowNoticeRequest.message_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (replyFollowNoticeRequest.action != null) {
                i3 = Action.ADAPTER.encodedSizeWithTag(3, replyFollowNoticeRequest.action);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (replyFollowNoticeRequest.breakout_meeting_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(21, replyFollowNoticeRequest.breakout_meeting_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (replyFollowNoticeRequest.associate_type != null) {
                i5 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, replyFollowNoticeRequest.associate_type);
            }
            return i8 + i5 + replyFollowNoticeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReplyFollowNoticeRequest decode(ProtoReader protoReader) throws IOException {
            C50970a aVar = new C50970a();
            aVar.f127001a = "";
            aVar.f127002b = "";
            aVar.f127003c = Action.UNKNOWN_ACTION;
            aVar.f127004d = "";
            aVar.f127005e = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127001a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127002b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f127003c = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 21) {
                    aVar.f127004d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f127005e = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReplyFollowNoticeRequest replyFollowNoticeRequest) throws IOException {
            if (replyFollowNoticeRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, replyFollowNoticeRequest.meeting_id);
            }
            if (replyFollowNoticeRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, replyFollowNoticeRequest.message_id);
            }
            if (replyFollowNoticeRequest.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 3, replyFollowNoticeRequest.action);
            }
            if (replyFollowNoticeRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, replyFollowNoticeRequest.breakout_meeting_id);
            }
            if (replyFollowNoticeRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, replyFollowNoticeRequest.associate_type);
            }
            protoWriter.writeBytes(replyFollowNoticeRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyFollowNoticeRequest$a */
    public static final class C50970a extends Message.Builder<ReplyFollowNoticeRequest, C50970a> {

        /* renamed from: a */
        public String f127001a;

        /* renamed from: b */
        public String f127002b;

        /* renamed from: c */
        public Action f127003c;

        /* renamed from: d */
        public String f127004d;

        /* renamed from: e */
        public FollowAssociateType f127005e;

        /* renamed from: a */
        public ReplyFollowNoticeRequest build() {
            return new ReplyFollowNoticeRequest(this.f127001a, this.f127002b, this.f127003c, this.f127004d, this.f127005e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50970a mo176030a(Action action) {
            this.f127003c = action;
            return this;
        }

        /* renamed from: b */
        public C50970a mo176033b(String str) {
            this.f127002b = str;
            return this;
        }

        /* renamed from: a */
        public C50970a mo176031a(String str) {
            this.f127001a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50970a newBuilder() {
        C50970a aVar = new C50970a();
        aVar.f127001a = this.meeting_id;
        aVar.f127002b = this.message_id;
        aVar.f127003c = this.action;
        aVar.f127004d = this.breakout_meeting_id;
        aVar.f127005e = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReplyFollowNoticeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ReplyFollowNoticeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReplyFollowNoticeRequest(String str, String str2, Action action2, String str3, FollowAssociateType followAssociateType) {
        this(str, str2, action2, str3, followAssociateType, ByteString.EMPTY);
    }

    public ReplyFollowNoticeRequest(String str, String str2, Action action2, String str3, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.message_id = str2;
        this.action = action2;
        this.breakout_meeting_id = str3;
        this.associate_type = followAssociateType;
    }
}
