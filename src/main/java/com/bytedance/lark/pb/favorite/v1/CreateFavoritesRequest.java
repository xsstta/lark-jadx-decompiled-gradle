package com.bytedance.lark.pb.favorite.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FavoritesType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateFavoritesRequest extends Message<CreateFavoritesRequest, C17080a> {
    public static final ProtoAdapter<CreateFavoritesRequest> ADAPTER = new C17081b();
    private static final long serialVersionUID = 0;
    public final List<FavoritesTarget> favs;

    public static final class FavoritesTarget extends Message<FavoritesTarget, C17078a> {
        public static final ProtoAdapter<FavoritesTarget> ADAPTER = new C17079b();
        public static final Long DEFAULT_CHAT_ID = 0L;
        public static final FavoritesType DEFAULT_TYPE = FavoritesType.FAVORITES_UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Long chat_id;
        public final String id;
        public final String origin_merge_forward_id;
        public final String translation_language;
        public final FavoritesType type;

        /* renamed from: com.bytedance.lark.pb.favorite.v1.CreateFavoritesRequest$FavoritesTarget$b */
        private static final class C17079b extends ProtoAdapter<FavoritesTarget> {
            C17079b() {
                super(FieldEncoding.LENGTH_DELIMITED, FavoritesTarget.class);
            }

            /* renamed from: a */
            public int encodedSize(FavoritesTarget favoritesTarget) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, favoritesTarget.id) + FavoritesType.ADAPTER.encodedSizeWithTag(2, favoritesTarget.type);
                int i3 = 0;
                if (favoritesTarget.chat_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(3, favoritesTarget.chat_id);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (favoritesTarget.translation_language != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, favoritesTarget.translation_language);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (favoritesTarget.origin_merge_forward_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, favoritesTarget.origin_merge_forward_id);
                }
                return i5 + i3 + favoritesTarget.unknownFields().size();
            }

            /* renamed from: a */
            public FavoritesTarget decode(ProtoReader protoReader) throws IOException {
                C17078a aVar = new C17078a();
                aVar.f43743a = "";
                aVar.f43744b = FavoritesType.FAVORITES_UNKNOWN;
                aVar.f43745c = 0L;
                aVar.f43746d = "";
                aVar.f43747e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43743a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f43744b = FavoritesType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 3) {
                        aVar.f43745c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f43746d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43747e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FavoritesTarget favoritesTarget) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, favoritesTarget.id);
                FavoritesType.ADAPTER.encodeWithTag(protoWriter, 2, favoritesTarget.type);
                if (favoritesTarget.chat_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, favoritesTarget.chat_id);
                }
                if (favoritesTarget.translation_language != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, favoritesTarget.translation_language);
                }
                if (favoritesTarget.origin_merge_forward_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, favoritesTarget.origin_merge_forward_id);
                }
                protoWriter.writeBytes(favoritesTarget.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.favorite.v1.CreateFavoritesRequest$FavoritesTarget$a */
        public static final class C17078a extends Message.Builder<FavoritesTarget, C17078a> {

            /* renamed from: a */
            public String f43743a;

            /* renamed from: b */
            public FavoritesType f43744b;

            /* renamed from: c */
            public Long f43745c;

            /* renamed from: d */
            public String f43746d;

            /* renamed from: e */
            public String f43747e;

            /* renamed from: a */
            public FavoritesTarget build() {
                FavoritesType favoritesType;
                String str = this.f43743a;
                if (str != null && (favoritesType = this.f43744b) != null) {
                    return new FavoritesTarget(str, favoritesType, this.f43745c, this.f43746d, this.f43747e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "id", this.f43744b, ShareHitPoint.f121869d);
            }

            /* renamed from: a */
            public C17078a mo60244a(FavoritesType favoritesType) {
                this.f43744b = favoritesType;
                return this;
            }

            /* renamed from: b */
            public C17078a mo60247b(String str) {
                this.f43747e = str;
                return this;
            }

            /* renamed from: a */
            public C17078a mo60245a(String str) {
                this.f43743a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17078a newBuilder() {
            C17078a aVar = new C17078a();
            aVar.f43743a = this.id;
            aVar.f43744b = this.type;
            aVar.f43745c = this.chat_id;
            aVar.f43746d = this.translation_language;
            aVar.f43747e = this.origin_merge_forward_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("favorite", "FavoritesTarget");
            StringBuilder sb = new StringBuilder();
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", type=");
            sb.append(this.type);
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.translation_language != null) {
                sb.append(", translation_language=");
                sb.append(this.translation_language);
            }
            if (this.origin_merge_forward_id != null) {
                sb.append(", origin_merge_forward_id=");
                sb.append(this.origin_merge_forward_id);
            }
            StringBuilder replace = sb.replace(0, 2, "FavoritesTarget{");
            replace.append('}');
            return replace.toString();
        }

        public FavoritesTarget(String str, FavoritesType favoritesType, Long l, String str2, String str3) {
            this(str, favoritesType, l, str2, str3, ByteString.EMPTY);
        }

        public FavoritesTarget(String str, FavoritesType favoritesType, Long l, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.type = favoritesType;
            this.chat_id = l;
            this.translation_language = str2;
            this.origin_merge_forward_id = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.favorite.v1.CreateFavoritesRequest$b */
    private static final class C17081b extends ProtoAdapter<CreateFavoritesRequest> {
        C17081b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateFavoritesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateFavoritesRequest createFavoritesRequest) {
            return FavoritesTarget.ADAPTER.asRepeated().encodedSizeWithTag(1, createFavoritesRequest.favs) + createFavoritesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateFavoritesRequest decode(ProtoReader protoReader) throws IOException {
            C17080a aVar = new C17080a();
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
                    aVar.f43748a.add(FavoritesTarget.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateFavoritesRequest createFavoritesRequest) throws IOException {
            FavoritesTarget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, createFavoritesRequest.favs);
            protoWriter.writeBytes(createFavoritesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.favorite.v1.CreateFavoritesRequest$a */
    public static final class C17080a extends Message.Builder<CreateFavoritesRequest, C17080a> {

        /* renamed from: a */
        public List<FavoritesTarget> f43748a = Internal.newMutableList();

        /* renamed from: a */
        public CreateFavoritesRequest build() {
            return new CreateFavoritesRequest(this.f43748a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17080a mo60251a(List<FavoritesTarget> list) {
            Internal.checkElementsNotNull(list);
            this.f43748a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17080a newBuilder() {
        C17080a aVar = new C17080a();
        aVar.f43748a = Internal.copyOf("favs", this.favs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("favorite", "CreateFavoritesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.favs.isEmpty()) {
            sb.append(", favs=");
            sb.append(this.favs);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateFavoritesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateFavoritesRequest(List<FavoritesTarget> list) {
        this(list, ByteString.EMPTY);
    }

    public CreateFavoritesRequest(List<FavoritesTarget> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.favs = Internal.immutableCopyOf("favs", list);
    }
}
