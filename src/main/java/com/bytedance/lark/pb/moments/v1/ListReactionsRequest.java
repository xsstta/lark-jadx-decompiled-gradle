package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListReactionsRequest extends Message<ListReactionsRequest, C18434a> {
    public static final ProtoAdapter<ListReactionsRequest> ADAPTER = new C18435b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String entity_id;
    public final String page_token;
    public final String reaction_type;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListReactionsRequest$b */
    private static final class C18435b extends ProtoAdapter<ListReactionsRequest> {
        C18435b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListReactionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListReactionsRequest listReactionsRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (listReactionsRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listReactionsRequest.page_token);
            } else {
                i = 0;
            }
            if (listReactionsRequest.entity_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, listReactionsRequest.entity_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (listReactionsRequest.reaction_type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, listReactionsRequest.reaction_type);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (listReactionsRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, listReactionsRequest.count);
            }
            return i6 + i4 + listReactionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListReactionsRequest decode(ProtoReader protoReader) throws IOException {
            C18434a aVar = new C18434a();
            aVar.f45824a = "";
            aVar.f45825b = "";
            aVar.f45826c = "";
            aVar.f45827d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45824a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45825b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45826c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45827d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListReactionsRequest listReactionsRequest) throws IOException {
            if (listReactionsRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listReactionsRequest.page_token);
            }
            if (listReactionsRequest.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listReactionsRequest.entity_id);
            }
            if (listReactionsRequest.reaction_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, listReactionsRequest.reaction_type);
            }
            if (listReactionsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, listReactionsRequest.count);
            }
            protoWriter.writeBytes(listReactionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListReactionsRequest$a */
    public static final class C18434a extends Message.Builder<ListReactionsRequest, C18434a> {

        /* renamed from: a */
        public String f45824a;

        /* renamed from: b */
        public String f45825b;

        /* renamed from: c */
        public String f45826c;

        /* renamed from: d */
        public Integer f45827d;

        /* renamed from: a */
        public ListReactionsRequest build() {
            return new ListReactionsRequest(this.f45824a, this.f45825b, this.f45826c, this.f45827d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18434a mo63706a(Integer num) {
            this.f45827d = num;
            return this;
        }

        /* renamed from: b */
        public C18434a mo63709b(String str) {
            this.f45825b = str;
            return this;
        }

        /* renamed from: c */
        public C18434a mo63710c(String str) {
            this.f45826c = str;
            return this;
        }

        /* renamed from: a */
        public C18434a mo63707a(String str) {
            this.f45824a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18434a newBuilder() {
        C18434a aVar = new C18434a();
        aVar.f45824a = this.page_token;
        aVar.f45825b = this.entity_id;
        aVar.f45826c = this.reaction_type;
        aVar.f45827d = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListReactionsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.reaction_type != null) {
            sb.append(", reaction_type=");
            sb.append(this.reaction_type);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "ListReactionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListReactionsRequest(String str, String str2, String str3, Integer num) {
        this(str, str2, str3, num, ByteString.EMPTY);
    }

    public ListReactionsRequest(String str, String str2, String str3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.entity_id = str2;
        this.reaction_type = str3;
        this.count = num;
    }
}
