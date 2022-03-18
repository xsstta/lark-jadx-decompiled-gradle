package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRoomStatusByShareCodeRequest extends Message<GetRoomStatusByShareCodeRequest, C50346a> {
    public static final ProtoAdapter<GetRoomStatusByShareCodeRequest> ADAPTER = new C50347b();
    private static final long serialVersionUID = 0;
    public final String mshare_code;

    /* renamed from: com.ss.android.lark.pb.videochat.GetRoomStatusByShareCodeRequest$b */
    private static final class C50347b extends ProtoAdapter<GetRoomStatusByShareCodeRequest> {
        C50347b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRoomStatusByShareCodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRoomStatusByShareCodeRequest getRoomStatusByShareCodeRequest) {
            int i;
            if (getRoomStatusByShareCodeRequest.mshare_code != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getRoomStatusByShareCodeRequest.mshare_code);
            } else {
                i = 0;
            }
            return i + getRoomStatusByShareCodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRoomStatusByShareCodeRequest decode(ProtoReader protoReader) throws IOException {
            C50346a aVar = new C50346a();
            aVar.f125732a = "";
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
                    aVar.f125732a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRoomStatusByShareCodeRequest getRoomStatusByShareCodeRequest) throws IOException {
            if (getRoomStatusByShareCodeRequest.mshare_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getRoomStatusByShareCodeRequest.mshare_code);
            }
            protoWriter.writeBytes(getRoomStatusByShareCodeRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetRoomStatusByShareCodeRequest$a */
    public static final class C50346a extends Message.Builder<GetRoomStatusByShareCodeRequest, C50346a> {

        /* renamed from: a */
        public String f125732a;

        /* renamed from: a */
        public GetRoomStatusByShareCodeRequest build() {
            return new GetRoomStatusByShareCodeRequest(this.f125732a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50346a mo174580a(String str) {
            this.f125732a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50346a newBuilder() {
        C50346a aVar = new C50346a();
        aVar.f125732a = this.mshare_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mshare_code != null) {
            sb.append(", share_code=");
            sb.append(this.mshare_code);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRoomStatusByShareCodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRoomStatusByShareCodeRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetRoomStatusByShareCodeRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mshare_code = str;
    }
}
