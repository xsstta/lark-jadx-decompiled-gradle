package com.bytedance.lark.pb.favorite.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetFavoritesRequest extends Message<GetFavoritesRequest, C17084a> {
    public static final ProtoAdapter<GetFavoritesRequest> ADAPTER = new C17085b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final Long DEFAULT_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Long time;

    /* renamed from: com.bytedance.lark.pb.favorite.v1.GetFavoritesRequest$b */
    private static final class C17085b extends ProtoAdapter<GetFavoritesRequest> {
        C17085b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFavoritesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFavoritesRequest getFavoritesRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getFavoritesRequest.time) + ProtoAdapter.INT32.encodedSizeWithTag(2, getFavoritesRequest.count) + getFavoritesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFavoritesRequest decode(ProtoReader protoReader) throws IOException {
            C17084a aVar = new C17084a();
            aVar.f43750a = 0L;
            aVar.f43751b = 10;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43750a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43751b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFavoritesRequest getFavoritesRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getFavoritesRequest.time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getFavoritesRequest.count);
            protoWriter.writeBytes(getFavoritesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17084a newBuilder() {
        C17084a aVar = new C17084a();
        aVar.f43750a = this.time;
        aVar.f43751b = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.favorite.v1.GetFavoritesRequest$a */
    public static final class C17084a extends Message.Builder<GetFavoritesRequest, C17084a> {

        /* renamed from: a */
        public Long f43750a;

        /* renamed from: b */
        public Integer f43751b;

        /* renamed from: a */
        public GetFavoritesRequest build() {
            Integer num;
            Long l = this.f43750a;
            if (l != null && (num = this.f43751b) != null) {
                return new GetFavoritesRequest(l, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "time", this.f43751b, "count");
        }

        /* renamed from: a */
        public C17084a mo60261a(Integer num) {
            this.f43751b = num;
            return this;
        }

        /* renamed from: a */
        public C17084a mo60262a(Long l) {
            this.f43750a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("favorite", "GetFavoritesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", count=");
        sb.append(this.count);
        StringBuilder replace = sb.replace(0, 2, "GetFavoritesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFavoritesRequest(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public GetFavoritesRequest(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time = l;
        this.count = num;
    }
}
