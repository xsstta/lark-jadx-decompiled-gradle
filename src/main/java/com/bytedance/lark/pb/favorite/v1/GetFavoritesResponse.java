package com.bytedance.lark.pb.favorite.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetFavoritesResponse extends Message<GetFavoritesResponse, C17086a> {
    public static final ProtoAdapter<GetFavoritesResponse> ADAPTER = new C17087b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_MIN_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<String> favorites_ids;
    public final Boolean has_more;
    public final Long min_time;

    /* renamed from: com.bytedance.lark.pb.favorite.v1.GetFavoritesResponse$b */
    private static final class C17087b extends ProtoAdapter<GetFavoritesResponse> {
        C17087b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFavoritesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFavoritesResponse getFavoritesResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getFavoritesResponse.favorites_ids) + C14928Entity.ADAPTER.encodedSizeWithTag(2, getFavoritesResponse.entity) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getFavoritesResponse.has_more);
            if (getFavoritesResponse.min_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, getFavoritesResponse.min_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getFavoritesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFavoritesResponse decode(ProtoReader protoReader) throws IOException {
            C17086a aVar = new C17086a();
            aVar.f43754c = false;
            aVar.f43755d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43752a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43753b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43754c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43755d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFavoritesResponse getFavoritesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getFavoritesResponse.favorites_ids);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getFavoritesResponse.entity);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getFavoritesResponse.has_more);
            if (getFavoritesResponse.min_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getFavoritesResponse.min_time);
            }
            protoWriter.writeBytes(getFavoritesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.favorite.v1.GetFavoritesResponse$a */
    public static final class C17086a extends Message.Builder<GetFavoritesResponse, C17086a> {

        /* renamed from: a */
        public List<String> f43752a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f43753b;

        /* renamed from: c */
        public Boolean f43754c;

        /* renamed from: d */
        public Long f43755d;

        /* renamed from: a */
        public GetFavoritesResponse build() {
            Boolean bool;
            C14928Entity entity = this.f43753b;
            if (entity != null && (bool = this.f43754c) != null) {
                return new GetFavoritesResponse(this.f43752a, entity, bool, this.f43755d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity", this.f43754c, "has_more");
        }
    }

    @Override // com.squareup.wire.Message
    public C17086a newBuilder() {
        C17086a aVar = new C17086a();
        aVar.f43752a = Internal.copyOf("favorites_ids", this.favorites_ids);
        aVar.f43753b = this.entity;
        aVar.f43754c = this.has_more;
        aVar.f43755d = this.min_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("favorite", "GetFavoritesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.favorites_ids.isEmpty()) {
            sb.append(", favorites_ids=");
            sb.append(this.favorites_ids);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        sb.append(", has_more=");
        sb.append(this.has_more);
        if (this.min_time != null) {
            sb.append(", min_time=");
            sb.append(this.min_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFavoritesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFavoritesResponse(List<String> list, C14928Entity entity2, Boolean bool, Long l) {
        this(list, entity2, bool, l, ByteString.EMPTY);
    }

    public GetFavoritesResponse(List<String> list, C14928Entity entity2, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.favorites_ids = Internal.immutableCopyOf("favorites_ids", list);
        this.entity = entity2;
        this.has_more = bool;
        this.min_time = l;
    }
}
