package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ListHashtagPostsRequest extends Message<ListHashtagPostsRequest, C18426a> {
    public static final ProtoAdapter<ListHashtagPostsRequest> ADAPTER = new C18427b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final HashtagPostOrder DEFAULT_ORDER = HashtagPostOrder.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String hashtag_id;
    public final HashtagPostOrder order;
    public final String page_token;

    public enum HashtagPostOrder implements WireEnum {
        UNKNOWN(0),
        CREATE_TIME_DESC(1),
        PARTICIPATE_COUNT(2),
        RECOMMEND(3);
        
        public static final ProtoAdapter<HashtagPostOrder> ADAPTER = ProtoAdapter.newEnumAdapter(HashtagPostOrder.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static HashtagPostOrder fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CREATE_TIME_DESC;
            }
            if (i == 2) {
                return PARTICIPATE_COUNT;
            }
            if (i != 3) {
                return null;
            }
            return RECOMMEND;
        }

        private HashtagPostOrder(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest$b */
    private static final class C18427b extends ProtoAdapter<ListHashtagPostsRequest> {
        C18427b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListHashtagPostsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListHashtagPostsRequest listHashtagPostsRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (listHashtagPostsRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listHashtagPostsRequest.page_token);
            } else {
                i = 0;
            }
            if (listHashtagPostsRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, listHashtagPostsRequest.count);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (listHashtagPostsRequest.hashtag_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, listHashtagPostsRequest.hashtag_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (listHashtagPostsRequest.order != null) {
                i4 = HashtagPostOrder.ADAPTER.encodedSizeWithTag(4, listHashtagPostsRequest.order);
            }
            return i6 + i4 + listHashtagPostsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListHashtagPostsRequest decode(ProtoReader protoReader) throws IOException {
            C18426a aVar = new C18426a();
            aVar.f45811a = "";
            aVar.f45812b = 0;
            aVar.f45813c = "";
            aVar.f45814d = HashtagPostOrder.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45811a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45812b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45813c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45814d = HashtagPostOrder.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListHashtagPostsRequest listHashtagPostsRequest) throws IOException {
            if (listHashtagPostsRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listHashtagPostsRequest.page_token);
            }
            if (listHashtagPostsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, listHashtagPostsRequest.count);
            }
            if (listHashtagPostsRequest.hashtag_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, listHashtagPostsRequest.hashtag_id);
            }
            if (listHashtagPostsRequest.order != null) {
                HashtagPostOrder.ADAPTER.encodeWithTag(protoWriter, 4, listHashtagPostsRequest.order);
            }
            protoWriter.writeBytes(listHashtagPostsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest$a */
    public static final class C18426a extends Message.Builder<ListHashtagPostsRequest, C18426a> {

        /* renamed from: a */
        public String f45811a;

        /* renamed from: b */
        public Integer f45812b;

        /* renamed from: c */
        public String f45813c;

        /* renamed from: d */
        public HashtagPostOrder f45814d;

        /* renamed from: a */
        public ListHashtagPostsRequest build() {
            return new ListHashtagPostsRequest(this.f45811a, this.f45812b, this.f45813c, this.f45814d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18426a mo63683a(HashtagPostOrder hashtagPostOrder) {
            this.f45814d = hashtagPostOrder;
            return this;
        }

        /* renamed from: b */
        public C18426a mo63687b(String str) {
            this.f45813c = str;
            return this;
        }

        /* renamed from: a */
        public C18426a mo63684a(Integer num) {
            this.f45812b = num;
            return this;
        }

        /* renamed from: a */
        public C18426a mo63685a(String str) {
            this.f45811a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18426a newBuilder() {
        C18426a aVar = new C18426a();
        aVar.f45811a = this.page_token;
        aVar.f45812b = this.count;
        aVar.f45813c = this.hashtag_id;
        aVar.f45814d = this.order;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListHashtagPostsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.hashtag_id != null) {
            sb.append(", hashtag_id=");
            sb.append(this.hashtag_id);
        }
        if (this.order != null) {
            sb.append(", order=");
            sb.append(this.order);
        }
        StringBuilder replace = sb.replace(0, 2, "ListHashtagPostsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListHashtagPostsRequest(String str, Integer num, String str2, HashtagPostOrder hashtagPostOrder) {
        this(str, num, str2, hashtagPostOrder, ByteString.EMPTY);
    }

    public ListHashtagPostsRequest(String str, Integer num, String str2, HashtagPostOrder hashtagPostOrder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.count = num;
        this.hashtag_id = str2;
        this.order = hashtagPostOrder;
    }
}
