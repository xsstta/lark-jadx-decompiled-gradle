package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetShareCodeInfoResponse extends Message<GetShareCodeInfoResponse, C50356a> {
    public static final ProtoAdapter<GetShareCodeInfoResponse> ADAPTER = new C50357b();
    private static final long serialVersionUID = 0;
    public final ByteviewUser muser;

    /* renamed from: com.ss.android.lark.pb.videochat.GetShareCodeInfoResponse$b */
    private static final class C50357b extends ProtoAdapter<GetShareCodeInfoResponse> {
        C50357b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetShareCodeInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetShareCodeInfoResponse getShareCodeInfoResponse) {
            int i;
            if (getShareCodeInfoResponse.muser != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, getShareCodeInfoResponse.muser);
            } else {
                i = 0;
            }
            return i + getShareCodeInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetShareCodeInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50356a aVar = new C50356a();
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
                    aVar.f125739a = ByteviewUser.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetShareCodeInfoResponse getShareCodeInfoResponse) throws IOException {
            if (getShareCodeInfoResponse.muser != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, getShareCodeInfoResponse.muser);
            }
            protoWriter.writeBytes(getShareCodeInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetShareCodeInfoResponse$a */
    public static final class C50356a extends Message.Builder<GetShareCodeInfoResponse, C50356a> {

        /* renamed from: a */
        public ByteviewUser f125739a;

        /* renamed from: a */
        public GetShareCodeInfoResponse build() {
            return new GetShareCodeInfoResponse(this.f125739a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50356a newBuilder() {
        C50356a aVar = new C50356a();
        aVar.f125739a = this.muser;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.muser != null) {
            sb.append(", user=");
            sb.append(this.muser);
        }
        StringBuilder replace = sb.replace(0, 2, "GetShareCodeInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetShareCodeInfoResponse(ByteviewUser byteviewUser) {
        this(byteviewUser, ByteString.EMPTY);
    }

    public GetShareCodeInfoResponse(ByteviewUser byteviewUser, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser = byteviewUser;
    }
}
