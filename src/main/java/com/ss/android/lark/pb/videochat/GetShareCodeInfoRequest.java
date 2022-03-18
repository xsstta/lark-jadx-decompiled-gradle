package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetShareCodeInfoRequest extends Message<GetShareCodeInfoRequest, C50354a> {
    public static final ProtoAdapter<GetShareCodeInfoRequest> ADAPTER = new C50355b();
    private static final long serialVersionUID = 0;
    public final String mshare_code;

    /* renamed from: com.ss.android.lark.pb.videochat.GetShareCodeInfoRequest$b */
    private static final class C50355b extends ProtoAdapter<GetShareCodeInfoRequest> {
        C50355b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetShareCodeInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetShareCodeInfoRequest getShareCodeInfoRequest) {
            int i;
            if (getShareCodeInfoRequest.mshare_code != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getShareCodeInfoRequest.mshare_code);
            } else {
                i = 0;
            }
            return i + getShareCodeInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetShareCodeInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50354a aVar = new C50354a();
            aVar.f125738a = "";
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
                    aVar.f125738a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetShareCodeInfoRequest getShareCodeInfoRequest) throws IOException {
            if (getShareCodeInfoRequest.mshare_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getShareCodeInfoRequest.mshare_code);
            }
            protoWriter.writeBytes(getShareCodeInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetShareCodeInfoRequest$a */
    public static final class C50354a extends Message.Builder<GetShareCodeInfoRequest, C50354a> {

        /* renamed from: a */
        public String f125738a;

        /* renamed from: a */
        public GetShareCodeInfoRequest build() {
            return new GetShareCodeInfoRequest(this.f125738a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50354a mo174598a(String str) {
            this.f125738a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50354a newBuilder() {
        C50354a aVar = new C50354a();
        aVar.f125738a = this.mshare_code;
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
        StringBuilder replace = sb.replace(0, 2, "GetShareCodeInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetShareCodeInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetShareCodeInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mshare_code = str;
    }
}
