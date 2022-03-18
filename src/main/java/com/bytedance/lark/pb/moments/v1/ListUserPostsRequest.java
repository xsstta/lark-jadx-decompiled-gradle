package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListUserPostsRequest extends Message<ListUserPostsRequest, C18450a> {
    public static final ProtoAdapter<ListUserPostsRequest> ADAPTER = new C18451b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String page_token;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserPostsRequest$b */
    private static final class C18451b extends ProtoAdapter<ListUserPostsRequest> {
        C18451b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserPostsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserPostsRequest listUserPostsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (listUserPostsRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listUserPostsRequest.page_token);
            } else {
                i = 0;
            }
            if (listUserPostsRequest.user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, listUserPostsRequest.user_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (listUserPostsRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, listUserPostsRequest.count);
            }
            return i4 + i3 + listUserPostsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserPostsRequest decode(ProtoReader protoReader) throws IOException {
            C18450a aVar = new C18450a();
            aVar.f45844a = "";
            aVar.f45845b = "";
            aVar.f45846c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45844a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45845b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45846c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserPostsRequest listUserPostsRequest) throws IOException {
            if (listUserPostsRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listUserPostsRequest.page_token);
            }
            if (listUserPostsRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listUserPostsRequest.user_id);
            }
            if (listUserPostsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, listUserPostsRequest.count);
            }
            protoWriter.writeBytes(listUserPostsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserPostsRequest$a */
    public static final class C18450a extends Message.Builder<ListUserPostsRequest, C18450a> {

        /* renamed from: a */
        public String f45844a;

        /* renamed from: b */
        public String f45845b;

        /* renamed from: c */
        public Integer f45846c;

        /* renamed from: a */
        public ListUserPostsRequest build() {
            return new ListUserPostsRequest(this.f45844a, this.f45845b, this.f45846c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18450a mo63748a(Integer num) {
            this.f45846c = num;
            return this;
        }

        /* renamed from: b */
        public C18450a mo63751b(String str) {
            this.f45845b = str;
            return this;
        }

        /* renamed from: a */
        public C18450a mo63749a(String str) {
            this.f45844a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18450a newBuilder() {
        C18450a aVar = new C18450a();
        aVar.f45844a = this.page_token;
        aVar.f45845b = this.user_id;
        aVar.f45846c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListUserPostsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "ListUserPostsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserPostsRequest(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public ListUserPostsRequest(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.user_id = str2;
        this.count = num;
    }
}
