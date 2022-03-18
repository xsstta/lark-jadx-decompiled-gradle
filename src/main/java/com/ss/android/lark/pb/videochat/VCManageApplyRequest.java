package com.ss.android.lark.pb.videochat;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VCManageApplyRequest extends Message<VCManageApplyRequest, C50413a> {
    public static final ProtoAdapter<VCManageApplyRequest> ADAPTER = new C50414b();
    public static final FieldOptions FIELD_OPTIONS_MMEETING_ID = new FieldOptions.C23155a().mo80350a("split,type=meeting").build();
    private static final long serialVersionUID = 0;
    public final ApplyType mapply_type;
    public final String mbreakout_room_id;
    public final String mmeeting_id;

    public enum ApplyType implements WireEnum {
        UNKNOWN(0),
        APPLY_FOR_HELP_FROM_BREAKOUT_ROOM(1);
        
        public static final ProtoAdapter<ApplyType> ADAPTER = ProtoAdapter.newEnumAdapter(ApplyType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ApplyType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return APPLY_FOR_HELP_FROM_BREAKOUT_ROOM;
        }

        private ApplyType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VCManageApplyRequest$b */
    private static final class C50414b extends ProtoAdapter<VCManageApplyRequest> {
        C50414b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageApplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageApplyRequest vCManageApplyRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, vCManageApplyRequest.mmeeting_id);
            int i2 = 0;
            if (vCManageApplyRequest.mbreakout_room_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, vCManageApplyRequest.mbreakout_room_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (vCManageApplyRequest.mapply_type != null) {
                i2 = ApplyType.ADAPTER.encodedSizeWithTag(3, vCManageApplyRequest.mapply_type);
            }
            return i3 + i2 + vCManageApplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageApplyRequest decode(ProtoReader protoReader) throws IOException {
            C50413a aVar = new C50413a();
            aVar.f125888a = "";
            aVar.f125889b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125888a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125889b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125890c = ApplyType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageApplyRequest vCManageApplyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCManageApplyRequest.mmeeting_id);
            if (vCManageApplyRequest.mbreakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCManageApplyRequest.mbreakout_room_id);
            }
            if (vCManageApplyRequest.mapply_type != null) {
                ApplyType.ADAPTER.encodeWithTag(protoWriter, 3, vCManageApplyRequest.mapply_type);
            }
            protoWriter.writeBytes(vCManageApplyRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50413a newBuilder() {
        C50413a aVar = new C50413a();
        aVar.f125888a = this.mmeeting_id;
        aVar.f125889b = this.mbreakout_room_id;
        aVar.f125890c = this.mapply_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VCManageApplyRequest$a */
    public static final class C50413a extends Message.Builder<VCManageApplyRequest, C50413a> {

        /* renamed from: a */
        public String f125888a;

        /* renamed from: b */
        public String f125889b;

        /* renamed from: c */
        public ApplyType f125890c;

        /* renamed from: a */
        public VCManageApplyRequest build() {
            String str = this.f125888a;
            if (str != null) {
                return new VCManageApplyRequest(str, this.f125889b, this.f125890c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmeeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.mmeeting_id);
        if (this.mbreakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.mbreakout_room_id);
        }
        if (this.mapply_type != null) {
            sb.append(", apply_type=");
            sb.append(this.mapply_type);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageApplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageApplyRequest(String str, String str2, ApplyType applyType) {
        this(str, str2, applyType, ByteString.EMPTY);
    }

    public VCManageApplyRequest(String str, String str2, ApplyType applyType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmeeting_id = str;
        this.mbreakout_room_id = str2;
        this.mapply_type = applyType;
    }
}
