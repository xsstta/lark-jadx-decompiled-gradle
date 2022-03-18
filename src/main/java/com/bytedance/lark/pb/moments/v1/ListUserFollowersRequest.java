package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListUserFollowersRequest extends Message<ListUserFollowersRequest, C18442a> {
    public static final ProtoAdapter<ListUserFollowersRequest> ADAPTER = new C18443b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String page_token;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowersRequest$b */
    private static final class C18443b extends ProtoAdapter<ListUserFollowersRequest> {
        C18443b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserFollowersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserFollowersRequest listUserFollowersRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (listUserFollowersRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listUserFollowersRequest.page_token);
            } else {
                i = 0;
            }
            if (listUserFollowersRequest.user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, listUserFollowersRequest.user_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (listUserFollowersRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, listUserFollowersRequest.count);
            }
            return i4 + i3 + listUserFollowersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserFollowersRequest decode(ProtoReader protoReader) throws IOException {
            C18442a aVar = new C18442a();
            aVar.f45832a = "";
            aVar.f45833b = "";
            aVar.f45834c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45832a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45833b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45834c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserFollowersRequest listUserFollowersRequest) throws IOException {
            if (listUserFollowersRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listUserFollowersRequest.page_token);
            }
            if (listUserFollowersRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listUserFollowersRequest.user_id);
            }
            if (listUserFollowersRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, listUserFollowersRequest.count);
            }
            protoWriter.writeBytes(listUserFollowersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowersRequest$a */
    public static final class C18442a extends Message.Builder<ListUserFollowersRequest, C18442a> {

        /* renamed from: a */
        public String f45832a;

        /* renamed from: b */
        public String f45833b;

        /* renamed from: c */
        public Integer f45834c;

        /* renamed from: a */
        public ListUserFollowersRequest build() {
            return new ListUserFollowersRequest(this.f45832a, this.f45833b, this.f45834c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18442a mo63726a(Integer num) {
            this.f45834c = num;
            return this;
        }

        /* renamed from: b */
        public C18442a mo63729b(String str) {
            this.f45833b = str;
            return this;
        }

        /* renamed from: a */
        public C18442a mo63727a(String str) {
            this.f45832a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18442a newBuilder() {
        C18442a aVar = new C18442a();
        aVar.f45832a = this.page_token;
        aVar.f45833b = this.user_id;
        aVar.f45834c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListUserFollowersRequest");
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
        StringBuilder replace = sb.replace(0, 2, "ListUserFollowersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserFollowersRequest(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public ListUserFollowersRequest(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.user_id = str2;
        this.count = num;
    }
}
