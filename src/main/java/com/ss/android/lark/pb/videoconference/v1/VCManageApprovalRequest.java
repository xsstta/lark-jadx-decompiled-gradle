package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VCManageApprovalRequest extends Message<VCManageApprovalRequest, C51148a> {
    public static final ProtoAdapter<VCManageApprovalRequest> ADAPTER = new C51149b();
    public static final ApprovalAction DEFAULT_APPROVAL_ACTION = ApprovalAction.UNKNOWNACTION;
    public static final ApprovalType DEFAULT_APPROVAL_TYPE = ApprovalType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ApprovalAction approval_action;
    public final ApprovalType approval_type;
    public final String breakout_room_id;
    public final String meeting_id;
    public final List<ByteviewUser> users;

    public enum ApprovalAction implements WireEnum {
        UNKNOWNACTION(0),
        PASS(1),
        REJECT(2),
        ALL_PASS(3),
        ALL_REJECT(4),
        MEETING_NOT_SUPPORT(5);
        
        public static final ProtoAdapter<ApprovalAction> ADAPTER = ProtoAdapter.newEnumAdapter(ApprovalAction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ApprovalAction fromValue(int i) {
            if (i == 0) {
                return UNKNOWNACTION;
            }
            if (i == 1) {
                return PASS;
            }
            if (i == 2) {
                return REJECT;
            }
            if (i == 3) {
                return ALL_PASS;
            }
            if (i == 4) {
                return ALL_REJECT;
            }
            if (i != 5) {
                return null;
            }
            return MEETING_NOT_SUPPORT;
        }

        private ApprovalAction(int i) {
            this.value = i;
        }
    }

    public enum ApprovalType implements WireEnum {
        UNKNOWN(0),
        MEETINGLOBBY(1),
        PUT_UP_HANDS(2),
        BREAKOUT_ROOM_USER_NEED_HELP(3);
        
        public static final ProtoAdapter<ApprovalType> ADAPTER = ProtoAdapter.newEnumAdapter(ApprovalType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ApprovalType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MEETINGLOBBY;
            }
            if (i == 2) {
                return PUT_UP_HANDS;
            }
            if (i != 3) {
                return null;
            }
            return BREAKOUT_ROOM_USER_NEED_HELP;
        }

        private ApprovalType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageApprovalRequest$b */
    private static final class C51149b extends ProtoAdapter<VCManageApprovalRequest> {
        C51149b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageApprovalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageApprovalRequest vCManageApprovalRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (vCManageApprovalRequest.approval_type != null) {
                i = ApprovalType.ADAPTER.encodedSizeWithTag(1, vCManageApprovalRequest.approval_type);
            } else {
                i = 0;
            }
            if (vCManageApprovalRequest.approval_action != null) {
                i2 = ApprovalAction.ADAPTER.encodedSizeWithTag(2, vCManageApprovalRequest.approval_action);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(3, vCManageApprovalRequest.users);
            if (vCManageApprovalRequest.meeting_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, vCManageApprovalRequest.meeting_id);
            } else {
                i3 = 0;
            }
            int i5 = encodedSizeWithTag + i3;
            if (vCManageApprovalRequest.breakout_room_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, vCManageApprovalRequest.breakout_room_id);
            }
            return i5 + i4 + vCManageApprovalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageApprovalRequest decode(ProtoReader protoReader) throws IOException {
            C51148a aVar = new C51148a();
            aVar.f127289a = ApprovalType.UNKNOWN;
            aVar.f127290b = ApprovalAction.UNKNOWNACTION;
            aVar.f127292d = "";
            aVar.f127293e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127289a = ApprovalType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f127290b = ApprovalAction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f127291c.add(ByteviewUser.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f127292d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127293e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageApprovalRequest vCManageApprovalRequest) throws IOException {
            if (vCManageApprovalRequest.approval_type != null) {
                ApprovalType.ADAPTER.encodeWithTag(protoWriter, 1, vCManageApprovalRequest.approval_type);
            }
            if (vCManageApprovalRequest.approval_action != null) {
                ApprovalAction.ADAPTER.encodeWithTag(protoWriter, 2, vCManageApprovalRequest.approval_action);
            }
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, vCManageApprovalRequest.users);
            if (vCManageApprovalRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, vCManageApprovalRequest.meeting_id);
            }
            if (vCManageApprovalRequest.breakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, vCManageApprovalRequest.breakout_room_id);
            }
            protoWriter.writeBytes(vCManageApprovalRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageApprovalRequest$a */
    public static final class C51148a extends Message.Builder<VCManageApprovalRequest, C51148a> {

        /* renamed from: a */
        public ApprovalType f127289a;

        /* renamed from: b */
        public ApprovalAction f127290b;

        /* renamed from: c */
        public List<ByteviewUser> f127291c = Internal.newMutableList();

        /* renamed from: d */
        public String f127292d;

        /* renamed from: e */
        public String f127293e;

        /* renamed from: a */
        public VCManageApprovalRequest build() {
            return new VCManageApprovalRequest(this.f127289a, this.f127290b, this.f127291c, this.f127292d, this.f127293e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51148a mo176474a(ApprovalAction approvalAction) {
            this.f127290b = approvalAction;
            return this;
        }

        /* renamed from: a */
        public C51148a mo176475a(ApprovalType approvalType) {
            this.f127289a = approvalType;
            return this;
        }

        /* renamed from: a */
        public C51148a mo176476a(String str) {
            this.f127292d = str;
            return this;
        }

        /* renamed from: a */
        public C51148a mo176477a(List<ByteviewUser> list) {
            Internal.checkElementsNotNull(list);
            this.f127291c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51148a newBuilder() {
        C51148a aVar = new C51148a();
        aVar.f127289a = this.approval_type;
        aVar.f127290b = this.approval_action;
        aVar.f127291c = Internal.copyOf("users", this.users);
        aVar.f127292d = this.meeting_id;
        aVar.f127293e = this.breakout_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCManageApprovalRequest");
        StringBuilder sb = new StringBuilder();
        if (this.approval_type != null) {
            sb.append(", approval_type=");
            sb.append(this.approval_type);
        }
        if (this.approval_action != null) {
            sb.append(", approval_action=");
            sb.append(this.approval_action);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.breakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.breakout_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageApprovalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageApprovalRequest(ApprovalType approvalType, ApprovalAction approvalAction, List<ByteviewUser> list, String str, String str2) {
        this(approvalType, approvalAction, list, str, str2, ByteString.EMPTY);
    }

    public VCManageApprovalRequest(ApprovalType approvalType, ApprovalAction approvalAction, List<ByteviewUser> list, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.approval_type = approvalType;
        this.approval_action = approvalAction;
        this.users = Internal.immutableCopyOf("users", list);
        this.meeting_id = str;
        this.breakout_room_id = str2;
    }
}
