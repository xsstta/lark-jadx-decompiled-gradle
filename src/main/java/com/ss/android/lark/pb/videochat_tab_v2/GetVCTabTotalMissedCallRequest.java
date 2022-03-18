package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVCTabTotalMissedCallRequest extends Message<GetVCTabTotalMissedCallRequest, C50443a> {
    public static final ProtoAdapter<GetVCTabTotalMissedCallRequest> ADAPTER = new C50444b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallRequest$b */
    private static final class C50444b extends ProtoAdapter<GetVCTabTotalMissedCallRequest> {
        C50444b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCTabTotalMissedCallRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCTabTotalMissedCallRequest getVCTabTotalMissedCallRequest) {
            return getVCTabTotalMissedCallRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCTabTotalMissedCallRequest decode(ProtoReader protoReader) throws IOException {
            C50443a aVar = new C50443a();
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
        public void encode(ProtoWriter protoWriter, GetVCTabTotalMissedCallRequest getVCTabTotalMissedCallRequest) throws IOException {
            protoWriter.writeBytes(getVCTabTotalMissedCallRequest.unknownFields());
        }
    }

    public GetVCTabTotalMissedCallRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallRequest$a */
    public static final class C50443a extends Message.Builder<GetVCTabTotalMissedCallRequest, C50443a> {
        /* renamed from: a */
        public GetVCTabTotalMissedCallRequest build() {
            return new GetVCTabTotalMissedCallRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50443a newBuilder() {
        C50443a aVar = new C50443a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetVCTabTotalMissedCallRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCTabTotalMissedCallRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
