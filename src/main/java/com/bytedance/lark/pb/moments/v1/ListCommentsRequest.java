package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListCommentsRequest extends Message<ListCommentsRequest, C18422a> {
    public static final ProtoAdapter<ListCommentsRequest> ADAPTER = new C18423b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String entity_id;
    public final String page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCommentsRequest$b */
    private static final class C18423b extends ProtoAdapter<ListCommentsRequest> {
        C18423b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListCommentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListCommentsRequest listCommentsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (listCommentsRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listCommentsRequest.page_token);
            } else {
                i = 0;
            }
            if (listCommentsRequest.entity_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, listCommentsRequest.entity_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (listCommentsRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, listCommentsRequest.count);
            }
            return i4 + i3 + listCommentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListCommentsRequest decode(ProtoReader protoReader) throws IOException {
            C18422a aVar = new C18422a();
            aVar.f45805a = "";
            aVar.f45806b = "";
            aVar.f45807c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45805a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45806b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45807c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListCommentsRequest listCommentsRequest) throws IOException {
            if (listCommentsRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listCommentsRequest.page_token);
            }
            if (listCommentsRequest.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listCommentsRequest.entity_id);
            }
            if (listCommentsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, listCommentsRequest.count);
            }
            protoWriter.writeBytes(listCommentsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCommentsRequest$a */
    public static final class C18422a extends Message.Builder<ListCommentsRequest, C18422a> {

        /* renamed from: a */
        public String f45805a;

        /* renamed from: b */
        public String f45806b;

        /* renamed from: c */
        public Integer f45807c;

        /* renamed from: a */
        public ListCommentsRequest build() {
            return new ListCommentsRequest(this.f45805a, this.f45806b, this.f45807c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18422a mo63672a(Integer num) {
            this.f45807c = num;
            return this;
        }

        /* renamed from: b */
        public C18422a mo63675b(String str) {
            this.f45806b = str;
            return this;
        }

        /* renamed from: a */
        public C18422a mo63673a(String str) {
            this.f45805a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18422a newBuilder() {
        C18422a aVar = new C18422a();
        aVar.f45805a = this.page_token;
        aVar.f45806b = this.entity_id;
        aVar.f45807c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListCommentsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "ListCommentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListCommentsRequest(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public ListCommentsRequest(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.entity_id = str2;
        this.count = num;
    }
}
