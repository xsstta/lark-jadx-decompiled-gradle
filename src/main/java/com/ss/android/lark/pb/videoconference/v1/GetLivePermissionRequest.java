package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetLivePermissionRequest extends Message<GetLivePermissionRequest, C50653a> {
    public static final ProtoAdapter<GetLivePermissionRequest> ADAPTER = new C50654b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetLivePermissionRequest$b */
    private static final class C50654b extends ProtoAdapter<GetLivePermissionRequest> {
        C50654b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLivePermissionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLivePermissionRequest getLivePermissionRequest) {
            return getLivePermissionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetLivePermissionRequest decode(ProtoReader protoReader) throws IOException {
            C50653a aVar = new C50653a();
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
        public void encode(ProtoWriter protoWriter, GetLivePermissionRequest getLivePermissionRequest) throws IOException {
            protoWriter.writeBytes(getLivePermissionRequest.unknownFields());
        }
    }

    public GetLivePermissionRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetLivePermissionRequest$a */
    public static final class C50653a extends Message.Builder<GetLivePermissionRequest, C50653a> {
        /* renamed from: a */
        public GetLivePermissionRequest build() {
            return new GetLivePermissionRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50653a newBuilder() {
        C50653a aVar = new C50653a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetLivePermissionRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetLivePermissionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetLivePermissionRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
