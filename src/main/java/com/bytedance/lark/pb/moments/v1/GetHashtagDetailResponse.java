package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetHashtagDetailResponse extends Message<GetHashtagDetailResponse, C18382a> {
    public static final ProtoAdapter<GetHashtagDetailResponse> ADAPTER = new C18383b();
    private static final long serialVersionUID = 0;
    public final Hashtag hashtag;
    public final HashtagStats hashtag_stats;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetHashtagDetailResponse$b */
    private static final class C18383b extends ProtoAdapter<GetHashtagDetailResponse> {
        C18383b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHashtagDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHashtagDetailResponse getHashtagDetailResponse) {
            int i;
            int i2 = 0;
            if (getHashtagDetailResponse.hashtag != null) {
                i = Hashtag.ADAPTER.encodedSizeWithTag(1, getHashtagDetailResponse.hashtag);
            } else {
                i = 0;
            }
            if (getHashtagDetailResponse.hashtag_stats != null) {
                i2 = HashtagStats.ADAPTER.encodedSizeWithTag(2, getHashtagDetailResponse.hashtag_stats);
            }
            return i + i2 + getHashtagDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHashtagDetailResponse decode(ProtoReader protoReader) throws IOException {
            C18382a aVar = new C18382a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45764a = Hashtag.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45765b = HashtagStats.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHashtagDetailResponse getHashtagDetailResponse) throws IOException {
            if (getHashtagDetailResponse.hashtag != null) {
                Hashtag.ADAPTER.encodeWithTag(protoWriter, 1, getHashtagDetailResponse.hashtag);
            }
            if (getHashtagDetailResponse.hashtag_stats != null) {
                HashtagStats.ADAPTER.encodeWithTag(protoWriter, 2, getHashtagDetailResponse.hashtag_stats);
            }
            protoWriter.writeBytes(getHashtagDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetHashtagDetailResponse$a */
    public static final class C18382a extends Message.Builder<GetHashtagDetailResponse, C18382a> {

        /* renamed from: a */
        public Hashtag f45764a;

        /* renamed from: b */
        public HashtagStats f45765b;

        /* renamed from: a */
        public GetHashtagDetailResponse build() {
            return new GetHashtagDetailResponse(this.f45764a, this.f45765b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18382a newBuilder() {
        C18382a aVar = new C18382a();
        aVar.f45764a = this.hashtag;
        aVar.f45765b = this.hashtag_stats;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetHashtagDetailResponse");
        StringBuilder sb = new StringBuilder();
        if (this.hashtag != null) {
            sb.append(", hashtag=");
            sb.append(this.hashtag);
        }
        if (this.hashtag_stats != null) {
            sb.append(", hashtag_stats=");
            sb.append(this.hashtag_stats);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHashtagDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHashtagDetailResponse(Hashtag hashtag2, HashtagStats hashtagStats) {
        this(hashtag2, hashtagStats, ByteString.EMPTY);
    }

    public GetHashtagDetailResponse(Hashtag hashtag2, HashtagStats hashtagStats, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hashtag = hashtag2;
        this.hashtag_stats = hashtagStats;
    }
}
