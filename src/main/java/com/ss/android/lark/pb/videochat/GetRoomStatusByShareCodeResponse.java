package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRoomStatusByShareCodeResponse extends Message<GetRoomStatusByShareCodeResponse, C50348a> {
    public static final ProtoAdapter<GetRoomStatusByShareCodeResponse> ADAPTER = new C50349b();
    private static final long serialVersionUID = 0;
    public final String mmeeting_id;
    public final String mroom_id;

    /* renamed from: com.ss.android.lark.pb.videochat.GetRoomStatusByShareCodeResponse$b */
    private static final class C50349b extends ProtoAdapter<GetRoomStatusByShareCodeResponse> {
        C50349b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRoomStatusByShareCodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRoomStatusByShareCodeResponse getRoomStatusByShareCodeResponse) {
            int i;
            int i2 = 0;
            if (getRoomStatusByShareCodeResponse.mroom_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getRoomStatusByShareCodeResponse.mroom_id);
            } else {
                i = 0;
            }
            if (getRoomStatusByShareCodeResponse.mmeeting_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getRoomStatusByShareCodeResponse.mmeeting_id);
            }
            return i + i2 + getRoomStatusByShareCodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRoomStatusByShareCodeResponse decode(ProtoReader protoReader) throws IOException {
            C50348a aVar = new C50348a();
            aVar.f125733a = "";
            aVar.f125734b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125733a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125734b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRoomStatusByShareCodeResponse getRoomStatusByShareCodeResponse) throws IOException {
            if (getRoomStatusByShareCodeResponse.mroom_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getRoomStatusByShareCodeResponse.mroom_id);
            }
            if (getRoomStatusByShareCodeResponse.mmeeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getRoomStatusByShareCodeResponse.mmeeting_id);
            }
            protoWriter.writeBytes(getRoomStatusByShareCodeResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetRoomStatusByShareCodeResponse$a */
    public static final class C50348a extends Message.Builder<GetRoomStatusByShareCodeResponse, C50348a> {

        /* renamed from: a */
        public String f125733a;

        /* renamed from: b */
        public String f125734b;

        /* renamed from: a */
        public GetRoomStatusByShareCodeResponse build() {
            return new GetRoomStatusByShareCodeResponse(this.f125733a, this.f125734b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50348a newBuilder() {
        C50348a aVar = new C50348a();
        aVar.f125733a = this.mroom_id;
        aVar.f125734b = this.mmeeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mroom_id != null) {
            sb.append(", room_id=");
            sb.append(this.mroom_id);
        }
        if (this.mmeeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.mmeeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRoomStatusByShareCodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRoomStatusByShareCodeResponse(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetRoomStatusByShareCodeResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mroom_id = str;
        this.mmeeting_id = str2;
    }
}
