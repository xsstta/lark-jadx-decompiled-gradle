package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetLivePermissionResponse extends Message<GetLivePermissionResponse, C50655a> {
    public static final ProtoAdapter<GetLivePermissionResponse> ADAPTER = new C50656b();
    public static final Boolean DEFAULT_NEED_VERIFICATION = false;
    private static final long serialVersionUID = 0;
    public final Boolean need_verification;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetLivePermissionResponse$b */
    private static final class C50656b extends ProtoAdapter<GetLivePermissionResponse> {
        C50656b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLivePermissionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLivePermissionResponse getLivePermissionResponse) {
            int i;
            if (getLivePermissionResponse.need_verification != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getLivePermissionResponse.need_verification);
            } else {
                i = 0;
            }
            return i + getLivePermissionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetLivePermissionResponse decode(ProtoReader protoReader) throws IOException {
            C50655a aVar = new C50655a();
            aVar.f126387a = false;
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
                    aVar.f126387a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetLivePermissionResponse getLivePermissionResponse) throws IOException {
            if (getLivePermissionResponse.need_verification != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getLivePermissionResponse.need_verification);
            }
            protoWriter.writeBytes(getLivePermissionResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetLivePermissionResponse$a */
    public static final class C50655a extends Message.Builder<GetLivePermissionResponse, C50655a> {

        /* renamed from: a */
        public Boolean f126387a;

        /* renamed from: a */
        public GetLivePermissionResponse build() {
            return new GetLivePermissionResponse(this.f126387a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50655a newBuilder() {
        C50655a aVar = new C50655a();
        aVar.f126387a = this.need_verification;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetLivePermissionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.need_verification != null) {
            sb.append(", need_verification=");
            sb.append(this.need_verification);
        }
        StringBuilder replace = sb.replace(0, 2, "GetLivePermissionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetLivePermissionResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetLivePermissionResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_verification = bool;
    }
}
