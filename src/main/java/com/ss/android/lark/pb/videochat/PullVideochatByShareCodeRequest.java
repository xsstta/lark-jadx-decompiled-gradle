package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullVideochatByShareCodeRequest extends Message<PullVideochatByShareCodeRequest, C50405a> {
    public static final ProtoAdapter<PullVideochatByShareCodeRequest> ADAPTER = new C50406b();
    private static final long serialVersionUID = 0;
    public final String mshare_code;

    /* renamed from: com.ss.android.lark.pb.videochat.PullVideochatByShareCodeRequest$b */
    private static final class C50406b extends ProtoAdapter<PullVideochatByShareCodeRequest> {
        C50406b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVideochatByShareCodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVideochatByShareCodeRequest pullVideochatByShareCodeRequest) {
            int i;
            if (pullVideochatByShareCodeRequest.mshare_code != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullVideochatByShareCodeRequest.mshare_code);
            } else {
                i = 0;
            }
            return i + pullVideochatByShareCodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullVideochatByShareCodeRequest decode(ProtoReader protoReader) throws IOException {
            C50405a aVar = new C50405a();
            aVar.f125878a = "";
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
                    aVar.f125878a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVideochatByShareCodeRequest pullVideochatByShareCodeRequest) throws IOException {
            if (pullVideochatByShareCodeRequest.mshare_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullVideochatByShareCodeRequest.mshare_code);
            }
            protoWriter.writeBytes(pullVideochatByShareCodeRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.PullVideochatByShareCodeRequest$a */
    public static final class C50405a extends Message.Builder<PullVideochatByShareCodeRequest, C50405a> {

        /* renamed from: a */
        public String f125878a;

        /* renamed from: a */
        public PullVideochatByShareCodeRequest build() {
            return new PullVideochatByShareCodeRequest(this.f125878a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50405a mo174700a(String str) {
            this.f125878a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50405a newBuilder() {
        C50405a aVar = new C50405a();
        aVar.f125878a = this.mshare_code;
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
        StringBuilder replace = sb.replace(0, 2, "PullVideochatByShareCodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullVideochatByShareCodeRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public PullVideochatByShareCodeRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mshare_code = str;
    }
}
