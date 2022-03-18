package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AddChatChatterApply extends Message<AddChatChatterApply, C14650a> {
    public static final ProtoAdapter<AddChatChatterApply> ADAPTER = new C14651b();
    public static final Status DEFAULT_STATUS = Status.UNKNOWN_STATUS;
    public static final Long DEFAULT_TIME = 0L;
    public static final Ways DEFAULT_WAY = Ways.UNKNOWN_WAY;
    private static final long serialVersionUID = 0;
    public final String invitee_id;
    public final String inviter_id;
    public final String reason;
    public final Status status;
    public final Long time;
    public final Ways way;

    public enum Status implements WireEnum {
        UNKNOWN_STATUS(0),
        APPROVED(1),
        REFUSED(2),
        PROCESSING(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return APPROVED;
            }
            if (i == 2) {
                return REFUSED;
            }
            if (i != 3) {
                return null;
            }
            return PROCESSING;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Ways implements WireEnum {
        UNKNOWN_WAY(0),
        VIA_SHARE(1),
        VIA_INVITATION(2),
        VIA_QR_CODE(3),
        VIA_SEARCH(4),
        VIA_DEPARTMENT_STRUCTURE(5),
        VIA_LINK(6);
        
        public static final ProtoAdapter<Ways> ADAPTER = ProtoAdapter.newEnumAdapter(Ways.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Ways fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_WAY;
                case 1:
                    return VIA_SHARE;
                case 2:
                    return VIA_INVITATION;
                case 3:
                    return VIA_QR_CODE;
                case 4:
                    return VIA_SEARCH;
                case 5:
                    return VIA_DEPARTMENT_STRUCTURE;
                case 6:
                    return VIA_LINK;
                default:
                    return null;
            }
        }

        private Ways(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AddChatChatterApply$b */
    private static final class C14651b extends ProtoAdapter<AddChatChatterApply> {
        C14651b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddChatChatterApply.class);
        }

        /* renamed from: a */
        public int encodedSize(AddChatChatterApply addChatChatterApply) {
            int i;
            int i2 = 0;
            if (addChatChatterApply.reason != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, addChatChatterApply.reason);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Status.ADAPTER.encodedSizeWithTag(2, addChatChatterApply.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, addChatChatterApply.time) + Ways.ADAPTER.encodedSizeWithTag(4, addChatChatterApply.way);
            if (addChatChatterApply.inviter_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, addChatChatterApply.inviter_id);
            }
            return encodedSizeWithTag + i2 + ProtoAdapter.STRING.encodedSizeWithTag(6, addChatChatterApply.invitee_id) + addChatChatterApply.unknownFields().size();
        }

        /* renamed from: a */
        public AddChatChatterApply decode(ProtoReader protoReader) throws IOException {
            C14650a aVar = new C14650a();
            aVar.f38760a = "";
            aVar.f38761b = Status.UNKNOWN_STATUS;
            aVar.f38762c = 0L;
            aVar.f38763d = Ways.UNKNOWN_WAY;
            aVar.f38764e = "";
            aVar.f38765f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38760a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f38761b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f38762c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f38763d = Ways.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f38764e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38765f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, AddChatChatterApply addChatChatterApply) throws IOException {
            if (addChatChatterApply.reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addChatChatterApply.reason);
            }
            Status.ADAPTER.encodeWithTag(protoWriter, 2, addChatChatterApply.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, addChatChatterApply.time);
            Ways.ADAPTER.encodeWithTag(protoWriter, 4, addChatChatterApply.way);
            if (addChatChatterApply.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, addChatChatterApply.inviter_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, addChatChatterApply.invitee_id);
            protoWriter.writeBytes(addChatChatterApply.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14650a newBuilder() {
        C14650a aVar = new C14650a();
        aVar.f38760a = this.reason;
        aVar.f38761b = this.status;
        aVar.f38762c = this.time;
        aVar.f38763d = this.way;
        aVar.f38764e = this.inviter_id;
        aVar.f38765f = this.invitee_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AddChatChatterApply$a */
    public static final class C14650a extends Message.Builder<AddChatChatterApply, C14650a> {

        /* renamed from: a */
        public String f38760a;

        /* renamed from: b */
        public Status f38761b;

        /* renamed from: c */
        public Long f38762c;

        /* renamed from: d */
        public Ways f38763d;

        /* renamed from: e */
        public String f38764e;

        /* renamed from: f */
        public String f38765f;

        /* renamed from: a */
        public AddChatChatterApply build() {
            Long l;
            Ways ways;
            String str;
            Status status = this.f38761b;
            if (status != null && (l = this.f38762c) != null && (ways = this.f38763d) != null && (str = this.f38765f) != null) {
                return new AddChatChatterApply(this.f38760a, status, l, ways, this.f38764e, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(status, UpdateKey.STATUS, this.f38762c, "time", this.f38763d, "way", this.f38765f, "invitee_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AddChatChatterApply");
        StringBuilder sb = new StringBuilder();
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", way=");
        sb.append(this.way);
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        sb.append(", invitee_id=");
        sb.append(this.invitee_id);
        StringBuilder replace = sb.replace(0, 2, "AddChatChatterApply{");
        replace.append('}');
        return replace.toString();
    }

    public AddChatChatterApply(String str, Status status2, Long l, Ways ways, String str2, String str3) {
        this(str, status2, l, ways, str2, str3, ByteString.EMPTY);
    }

    public AddChatChatterApply(String str, Status status2, Long l, Ways ways, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reason = str;
        this.status = status2;
        this.time = l;
        this.way = ways;
        this.inviter_id = str2;
        this.invitee_id = str3;
    }
}
