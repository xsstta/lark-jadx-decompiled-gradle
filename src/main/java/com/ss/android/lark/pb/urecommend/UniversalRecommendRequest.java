package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UniversalRecommendRequest extends Message<UniversalRecommendRequest, C50166a> {
    public static final ProtoAdapter<UniversalRecommendRequest> ADAPTER = new C50167b();
    private static final long serialVersionUID = 0;
    public final UniversalRecommendRequestHeader mheader;

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendRequest$b */
    private static final class C50167b extends ProtoAdapter<UniversalRecommendRequest> {
        C50167b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalRecommendRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalRecommendRequest universalRecommendRequest) {
            return UniversalRecommendRequestHeader.ADAPTER.encodedSizeWithTag(1, universalRecommendRequest.mheader) + universalRecommendRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalRecommendRequest decode(ProtoReader protoReader) throws IOException {
            C50166a aVar = new C50166a();
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
                    aVar.f125361a = UniversalRecommendRequestHeader.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalRecommendRequest universalRecommendRequest) throws IOException {
            UniversalRecommendRequestHeader.ADAPTER.encodeWithTag(protoWriter, 1, universalRecommendRequest.mheader);
            protoWriter.writeBytes(universalRecommendRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendRequest$a */
    public static final class C50166a extends Message.Builder<UniversalRecommendRequest, C50166a> {

        /* renamed from: a */
        public UniversalRecommendRequestHeader f125361a;

        /* renamed from: a */
        public UniversalRecommendRequest build() {
            UniversalRecommendRequestHeader universalRecommendRequestHeader = this.f125361a;
            if (universalRecommendRequestHeader != null) {
                return new UniversalRecommendRequest(universalRecommendRequestHeader, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(universalRecommendRequestHeader, "mheader");
        }

        /* renamed from: a */
        public C50166a mo174165a(UniversalRecommendRequestHeader universalRecommendRequestHeader) {
            this.f125361a = universalRecommendRequestHeader;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50166a newBuilder() {
        C50166a aVar = new C50166a();
        aVar.f125361a = this.mheader;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.mheader);
        StringBuilder replace = sb.replace(0, 2, "UniversalRecommendRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalRecommendRequest(UniversalRecommendRequestHeader universalRecommendRequestHeader) {
        this(universalRecommendRequestHeader, ByteString.EMPTY);
    }

    public UniversalRecommendRequest(UniversalRecommendRequestHeader universalRecommendRequestHeader, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mheader = universalRecommendRequestHeader;
    }
}
