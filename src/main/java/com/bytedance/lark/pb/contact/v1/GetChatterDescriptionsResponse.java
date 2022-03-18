package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatterDescriptionsResponse extends Message<GetChatterDescriptionsResponse, C16192a> {
    public static final ProtoAdapter<GetChatterDescriptionsResponse> ADAPTER = new C16193b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<Pair> pairs;

    public static final class Pair extends Message<Pair, C16190a> {
        public static final ProtoAdapter<Pair> ADAPTER = new C16191b();
        public static final Chatter.Description.Type DEFAULT_DESCRIPTION_TYPE = Chatter.Description.Type.ON_DEFAULT;
        private static final long serialVersionUID = 0;
        public final String description;
        public final Chatter.Description.Type description_type;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsResponse$Pair$b */
        private static final class C16191b extends ProtoAdapter<Pair> {
            C16191b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pair.class);
            }

            /* renamed from: a */
            public int encodedSize(Pair pair) {
                int i;
                int i2 = 0;
                if (pair.description != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, pair.description);
                } else {
                    i = 0;
                }
                if (pair.description_type != null) {
                    i2 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(2, pair.description_type);
                }
                return i + i2 + pair.unknownFields().size();
            }

            /* renamed from: a */
            public Pair decode(ProtoReader protoReader) throws IOException {
                C16190a aVar = new C16190a();
                aVar.f42348a = "";
                aVar.f42349b = Chatter.Description.Type.ON_DEFAULT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42348a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f42349b = Chatter.Description.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pair pair) throws IOException {
                if (pair.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pair.description);
                }
                if (pair.description_type != null) {
                    Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 2, pair.description_type);
                }
                protoWriter.writeBytes(pair.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsResponse$Pair$a */
        public static final class C16190a extends Message.Builder<Pair, C16190a> {

            /* renamed from: a */
            public String f42348a;

            /* renamed from: b */
            public Chatter.Description.Type f42349b;

            /* renamed from: a */
            public Pair build() {
                return new Pair(this.f42348a, this.f42349b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16190a newBuilder() {
            C16190a aVar = new C16190a();
            aVar.f42348a = this.description;
            aVar.f42349b = this.description_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Pair");
            StringBuilder sb = new StringBuilder();
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.description_type != null) {
                sb.append(", description_type=");
                sb.append(this.description_type);
            }
            StringBuilder replace = sb.replace(0, 2, "Pair{");
            replace.append('}');
            return replace.toString();
        }

        public Pair(String str, Chatter.Description.Type type) {
            this(str, type, ByteString.EMPTY);
        }

        public Pair(String str, Chatter.Description.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.description = str;
            this.description_type = type;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsResponse$b */
    private static final class C16193b extends ProtoAdapter<GetChatterDescriptionsResponse> {
        C16193b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterDescriptionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterDescriptionsResponse getChatterDescriptionsResponse) {
            int i;
            int encodedSizeWithTag = Pair.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatterDescriptionsResponse.pairs);
            if (getChatterDescriptionsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatterDescriptionsResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getChatterDescriptionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterDescriptionsResponse decode(ProtoReader protoReader) throws IOException {
            C16192a aVar = new C16192a();
            aVar.f42351b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42350a.add(Pair.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42351b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterDescriptionsResponse getChatterDescriptionsResponse) throws IOException {
            Pair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatterDescriptionsResponse.pairs);
            if (getChatterDescriptionsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatterDescriptionsResponse.has_more);
            }
            protoWriter.writeBytes(getChatterDescriptionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsResponse$a */
    public static final class C16192a extends Message.Builder<GetChatterDescriptionsResponse, C16192a> {

        /* renamed from: a */
        public List<Pair> f42350a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42351b;

        /* renamed from: a */
        public GetChatterDescriptionsResponse build() {
            return new GetChatterDescriptionsResponse(this.f42350a, this.f42351b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16192a newBuilder() {
        C16192a aVar = new C16192a();
        aVar.f42350a = Internal.copyOf("pairs", this.pairs);
        aVar.f42351b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterDescriptionsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.pairs.isEmpty()) {
            sb.append(", pairs=");
            sb.append(this.pairs);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterDescriptionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterDescriptionsResponse(List<Pair> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetChatterDescriptionsResponse(List<Pair> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pairs = Internal.immutableCopyOf("pairs", list);
        this.has_more = bool;
    }
}
