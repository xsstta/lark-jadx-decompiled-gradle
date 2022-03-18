package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVcMeetingJoinStatusRequest extends Message<GetVcMeetingJoinStatusRequest, C50705a> {
    public static final ProtoAdapter<GetVcMeetingJoinStatusRequest> ADAPTER = new C50706b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusRequest$b */
    private static final class C50706b extends ProtoAdapter<GetVcMeetingJoinStatusRequest> {
        C50706b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVcMeetingJoinStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVcMeetingJoinStatusRequest getVcMeetingJoinStatusRequest) {
            return getVcMeetingJoinStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVcMeetingJoinStatusRequest decode(ProtoReader protoReader) throws IOException {
            C50705a aVar = new C50705a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVcMeetingJoinStatusRequest getVcMeetingJoinStatusRequest) throws IOException {
            protoWriter.writeBytes(getVcMeetingJoinStatusRequest.unknownFields());
        }
    }

    public GetVcMeetingJoinStatusRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusRequest$a */
    public static final class C50705a extends Message.Builder<GetVcMeetingJoinStatusRequest, C50705a> {
        /* renamed from: a */
        public GetVcMeetingJoinStatusRequest build() {
            return new GetVcMeetingJoinStatusRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50705a newBuilder() {
        C50705a aVar = new C50705a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVcMeetingJoinStatusRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetVcMeetingJoinStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVcMeetingJoinStatusRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
