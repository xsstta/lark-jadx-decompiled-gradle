package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SharePostRequest extends Message<SharePostRequest, C18548a> {
    public static final ProtoAdapter<SharePostRequest> ADAPTER = new C18549b();
    public static final Integer DEFAULT_ORIGINAL_SHARE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;
    public final Integer original_share_count;
    public final String post_id;
    public final List<String> push_category_ids;
    public final String reply_message;

    /* renamed from: com.bytedance.lark.pb.moments.v1.SharePostRequest$b */
    private static final class C18549b extends ProtoAdapter<SharePostRequest> {
        C18549b() {
            super(FieldEncoding.LENGTH_DELIMITED, SharePostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SharePostRequest sharePostRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (sharePostRequest.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sharePostRequest.post_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, sharePostRequest.chat_ids);
            if (sharePostRequest.original_share_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, sharePostRequest.original_share_count);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (sharePostRequest.reply_message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, sharePostRequest.reply_message);
            }
            return i4 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, sharePostRequest.push_category_ids) + sharePostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SharePostRequest decode(ProtoReader protoReader) throws IOException {
            C18548a aVar = new C18548a();
            aVar.f46034a = "";
            aVar.f46036c = 0;
            aVar.f46037d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46034a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46035b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f46036c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46037d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46038e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SharePostRequest sharePostRequest) throws IOException {
            if (sharePostRequest.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sharePostRequest.post_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, sharePostRequest.chat_ids);
            if (sharePostRequest.original_share_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sharePostRequest.original_share_count);
            }
            if (sharePostRequest.reply_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sharePostRequest.reply_message);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, sharePostRequest.push_category_ids);
            protoWriter.writeBytes(sharePostRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.SharePostRequest$a */
    public static final class C18548a extends Message.Builder<SharePostRequest, C18548a> {

        /* renamed from: a */
        public String f46034a;

        /* renamed from: b */
        public List<String> f46035b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f46036c;

        /* renamed from: d */
        public String f46037d;

        /* renamed from: e */
        public List<String> f46038e = Internal.newMutableList();

        /* renamed from: a */
        public SharePostRequest build() {
            return new SharePostRequest(this.f46034a, this.f46035b, this.f46036c, this.f46037d, this.f46038e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18548a mo63978a(Integer num) {
            this.f46036c = num;
            return this;
        }

        /* renamed from: b */
        public C18548a mo63982b(String str) {
            this.f46037d = str;
            return this;
        }

        /* renamed from: a */
        public C18548a mo63979a(String str) {
            this.f46034a = str;
            return this;
        }

        /* renamed from: a */
        public C18548a mo63980a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f46035b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18548a newBuilder() {
        C18548a aVar = new C18548a();
        aVar.f46034a = this.post_id;
        aVar.f46035b = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f46036c = this.original_share_count;
        aVar.f46037d = this.reply_message;
        aVar.f46038e = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "SharePostRequest");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.original_share_count != null) {
            sb.append(", original_share_count=");
            sb.append(this.original_share_count);
        }
        if (this.reply_message != null) {
            sb.append(", reply_message=");
            sb.append(this.reply_message);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SharePostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SharePostRequest(String str, List<String> list, Integer num, String str2, List<String> list2) {
        this(str, list, num, str2, list2, ByteString.EMPTY);
    }

    public SharePostRequest(String str, List<String> list, Integer num, String str2, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.original_share_count = num;
        this.reply_message = str2;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list2);
    }
}
