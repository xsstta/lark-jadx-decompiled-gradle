package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullBannerResponse extends Message<PullBannerResponse, C49788a> {
    public static final ProtoAdapter<PullBannerResponse> ADAPTER = new C49789b();
    private static final long serialVersionUID = 0;
    public final List<BannerInfo> mbanners;

    /* renamed from: com.ss.android.lark.pb.guide.PullBannerResponse$b */
    private static final class C49789b extends ProtoAdapter<PullBannerResponse> {
        C49789b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullBannerResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullBannerResponse pullBannerResponse) {
            return BannerInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, pullBannerResponse.mbanners) + pullBannerResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullBannerResponse decode(ProtoReader protoReader) throws IOException {
            C49788a aVar = new C49788a();
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
                    aVar.f124723a.add(BannerInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullBannerResponse pullBannerResponse) throws IOException {
            BannerInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullBannerResponse.mbanners);
            protoWriter.writeBytes(pullBannerResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.PullBannerResponse$a */
    public static final class C49788a extends Message.Builder<PullBannerResponse, C49788a> {

        /* renamed from: a */
        public List<BannerInfo> f124723a = Internal.newMutableList();

        /* renamed from: a */
        public PullBannerResponse build() {
            return new PullBannerResponse(this.f124723a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49788a newBuilder() {
        C49788a aVar = new C49788a();
        aVar.f124723a = Internal.copyOf("mbanners", this.mbanners);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mbanners.isEmpty()) {
            sb.append(", banners=");
            sb.append(this.mbanners);
        }
        StringBuilder replace = sb.replace(0, 2, "PullBannerResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullBannerResponse(List<BannerInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public PullBannerResponse(List<BannerInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbanners = Internal.immutableCopyOf("mbanners", list);
    }
}
