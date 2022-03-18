package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckGuestJoinVcRequest extends Message<CheckGuestJoinVcRequest, C50501a> {
    public static final ProtoAdapter<CheckGuestJoinVcRequest> ADAPTER = new C50502b();
    private static final long serialVersionUID = 0;
    public final String meeting_number;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcRequest$b */
    private static final class C50502b extends ProtoAdapter<CheckGuestJoinVcRequest> {
        C50502b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckGuestJoinVcRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckGuestJoinVcRequest checkGuestJoinVcRequest) {
            int i;
            if (checkGuestJoinVcRequest.meeting_number != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, checkGuestJoinVcRequest.meeting_number);
            } else {
                i = 0;
            }
            return i + checkGuestJoinVcRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckGuestJoinVcRequest decode(ProtoReader protoReader) throws IOException {
            C50501a aVar = new C50501a();
            aVar.f126093a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126093a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckGuestJoinVcRequest checkGuestJoinVcRequest) throws IOException {
            if (checkGuestJoinVcRequest.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkGuestJoinVcRequest.meeting_number);
            }
            protoWriter.writeBytes(checkGuestJoinVcRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcRequest$a */
    public static final class C50501a extends Message.Builder<CheckGuestJoinVcRequest, C50501a> {

        /* renamed from: a */
        public String f126093a;

        /* renamed from: a */
        public CheckGuestJoinVcRequest build() {
            return new CheckGuestJoinVcRequest(this.f126093a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50501a mo174916a(String str) {
            this.f126093a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50501a newBuilder() {
        C50501a aVar = new C50501a();
        aVar.f126093a = this.meeting_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CheckGuestJoinVcRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckGuestJoinVcRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckGuestJoinVcRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public CheckGuestJoinVcRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_number = str;
    }
}
