package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListUserFollowingsRequest extends Message<ListUserFollowingsRequest, C18446a> {
    public static final ProtoAdapter<ListUserFollowingsRequest> ADAPTER = new C18447b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String page_token;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowingsRequest$b */
    private static final class C18447b extends ProtoAdapter<ListUserFollowingsRequest> {
        C18447b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserFollowingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserFollowingsRequest listUserFollowingsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (listUserFollowingsRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listUserFollowingsRequest.page_token);
            } else {
                i = 0;
            }
            if (listUserFollowingsRequest.user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, listUserFollowingsRequest.user_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (listUserFollowingsRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, listUserFollowingsRequest.count);
            }
            return i4 + i3 + listUserFollowingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserFollowingsRequest decode(ProtoReader protoReader) throws IOException {
            C18446a aVar = new C18446a();
            aVar.f45838a = "";
            aVar.f45839b = "";
            aVar.f45840c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45838a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45839b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45840c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserFollowingsRequest listUserFollowingsRequest) throws IOException {
            if (listUserFollowingsRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listUserFollowingsRequest.page_token);
            }
            if (listUserFollowingsRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listUserFollowingsRequest.user_id);
            }
            if (listUserFollowingsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, listUserFollowingsRequest.count);
            }
            protoWriter.writeBytes(listUserFollowingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowingsRequest$a */
    public static final class C18446a extends Message.Builder<ListUserFollowingsRequest, C18446a> {

        /* renamed from: a */
        public String f45838a;

        /* renamed from: b */
        public String f45839b;

        /* renamed from: c */
        public Integer f45840c;

        /* renamed from: a */
        public ListUserFollowingsRequest build() {
            return new ListUserFollowingsRequest(this.f45838a, this.f45839b, this.f45840c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18446a mo63737a(Integer num) {
            this.f45840c = num;
            return this;
        }

        /* renamed from: b */
        public C18446a mo63740b(String str) {
            this.f45839b = str;
            return this;
        }

        /* renamed from: a */
        public C18446a mo63738a(String str) {
            this.f45838a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18446a newBuilder() {
        C18446a aVar = new C18446a();
        aVar.f45838a = this.page_token;
        aVar.f45839b = this.user_id;
        aVar.f45840c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListUserFollowingsRequest");
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
        StringBuilder replace = sb.replace(0, 2, "ListUserFollowingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserFollowingsRequest(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public ListUserFollowingsRequest(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.user_id = str2;
        this.count = num;
    }
}
