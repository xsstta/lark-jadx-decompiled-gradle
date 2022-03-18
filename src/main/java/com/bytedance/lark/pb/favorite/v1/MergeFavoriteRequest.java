package com.bytedance.lark.pb.favorite.v1;

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

public final class MergeFavoriteRequest extends Message<MergeFavoriteRequest, C17088a> {
    public static final ProtoAdapter<MergeFavoriteRequest> ADAPTER = new C17089b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> message_ids;
    public final String origin_merge_forward_id;

    /* renamed from: com.bytedance.lark.pb.favorite.v1.MergeFavoriteRequest$b */
    private static final class C17089b extends ProtoAdapter<MergeFavoriteRequest> {
        C17089b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeFavoriteRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeFavoriteRequest mergeFavoriteRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mergeFavoriteRequest.message_ids);
            int i2 = 0;
            if (mergeFavoriteRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mergeFavoriteRequest.chat_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mergeFavoriteRequest.origin_merge_forward_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mergeFavoriteRequest.origin_merge_forward_id);
            }
            return i3 + i2 + mergeFavoriteRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MergeFavoriteRequest decode(ProtoReader protoReader) throws IOException {
            C17088a aVar = new C17088a();
            aVar.f43757b = "";
            aVar.f43758c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43756a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43757b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43758c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeFavoriteRequest mergeFavoriteRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mergeFavoriteRequest.message_ids);
            if (mergeFavoriteRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mergeFavoriteRequest.chat_id);
            }
            if (mergeFavoriteRequest.origin_merge_forward_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mergeFavoriteRequest.origin_merge_forward_id);
            }
            protoWriter.writeBytes(mergeFavoriteRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.favorite.v1.MergeFavoriteRequest$a */
    public static final class C17088a extends Message.Builder<MergeFavoriteRequest, C17088a> {

        /* renamed from: a */
        public List<String> f43756a = Internal.newMutableList();

        /* renamed from: b */
        public String f43757b;

        /* renamed from: c */
        public String f43758c;

        /* renamed from: a */
        public MergeFavoriteRequest build() {
            return new MergeFavoriteRequest(this.f43756a, this.f43757b, this.f43758c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17088a mo60271a(String str) {
            this.f43757b = str;
            return this;
        }

        /* renamed from: b */
        public C17088a mo60274b(String str) {
            this.f43758c = str;
            return this;
        }

        /* renamed from: a */
        public C17088a mo60272a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43756a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17088a newBuilder() {
        C17088a aVar = new C17088a();
        aVar.f43756a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f43757b = this.chat_id;
        aVar.f43758c = this.origin_merge_forward_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("favorite", "MergeFavoriteRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.origin_merge_forward_id != null) {
            sb.append(", origin_merge_forward_id=");
            sb.append(this.origin_merge_forward_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeFavoriteRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MergeFavoriteRequest(List<String> list, String str, String str2) {
        this(list, str, str2, ByteString.EMPTY);
    }

    public MergeFavoriteRequest(List<String> list, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.chat_id = str;
        this.origin_merge_forward_id = str2;
    }
}
