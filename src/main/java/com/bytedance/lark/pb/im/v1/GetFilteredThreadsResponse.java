package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetFilteredThreadsResponse extends Message<GetFilteredThreadsResponse, C17584a> {
    public static final ProtoAdapter<GetFilteredThreadsResponse> ADAPTER = new C17585b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final String next_cursor;
    public final String next_filter_id;
    public final String prev_cursor;
    public final String prev_filter_id;
    public final List<ThreadItem> thread_items;

    public static final class ThreadItem extends Message<ThreadItem, C17582a> {
        public static final ProtoAdapter<ThreadItem> ADAPTER = new C17583b();
        private static final long serialVersionUID = 0;
        public final String filter_id;
        public final String item_id;
        public final String rank;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsResponse$ThreadItem$b */
        private static final class C17583b extends ProtoAdapter<ThreadItem> {
            C17583b() {
                super(FieldEncoding.LENGTH_DELIMITED, ThreadItem.class);
            }

            /* renamed from: a */
            public int encodedSize(ThreadItem threadItem) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, threadItem.item_id);
                int i2 = 0;
                if (threadItem.rank != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, threadItem.rank);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (threadItem.filter_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, threadItem.filter_id);
                }
                return i3 + i2 + threadItem.unknownFields().size();
            }

            /* renamed from: a */
            public ThreadItem decode(ProtoReader protoReader) throws IOException {
                C17582a aVar = new C17582a();
                aVar.f44545a = "";
                aVar.f44546b = "";
                aVar.f44547c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44545a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f44546b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f44547c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ThreadItem threadItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, threadItem.item_id);
                if (threadItem.rank != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, threadItem.rank);
                }
                if (threadItem.filter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, threadItem.filter_id);
                }
                protoWriter.writeBytes(threadItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17582a newBuilder() {
            C17582a aVar = new C17582a();
            aVar.f44545a = this.item_id;
            aVar.f44546b = this.rank;
            aVar.f44547c = this.filter_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsResponse$ThreadItem$a */
        public static final class C17582a extends Message.Builder<ThreadItem, C17582a> {

            /* renamed from: a */
            public String f44545a;

            /* renamed from: b */
            public String f44546b;

            /* renamed from: c */
            public String f44547c;

            /* renamed from: a */
            public ThreadItem build() {
                String str = this.f44545a;
                if (str != null) {
                    return new ThreadItem(str, this.f44546b, this.f44547c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ThreadItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            if (this.rank != null) {
                sb.append(", rank=");
                sb.append(this.rank);
            }
            if (this.filter_id != null) {
                sb.append(", filter_id=");
                sb.append(this.filter_id);
            }
            StringBuilder replace = sb.replace(0, 2, "ThreadItem{");
            replace.append('}');
            return replace.toString();
        }

        public ThreadItem(String str, String str2, String str3) {
            this(str, str2, str3, ByteString.EMPTY);
        }

        public ThreadItem(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
            this.rank = str2;
            this.filter_id = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsResponse$b */
    private static final class C17585b extends ProtoAdapter<GetFilteredThreadsResponse> {
        C17585b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFilteredThreadsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFilteredThreadsResponse getFilteredThreadsResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ThreadItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getFilteredThreadsResponse.thread_items);
            int i5 = 0;
            if (getFilteredThreadsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, getFilteredThreadsResponse.entity);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (getFilteredThreadsResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getFilteredThreadsResponse.next_cursor);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (getFilteredThreadsResponse.prev_cursor != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getFilteredThreadsResponse.prev_cursor);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getFilteredThreadsResponse.next_filter_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, getFilteredThreadsResponse.next_filter_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getFilteredThreadsResponse.prev_filter_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, getFilteredThreadsResponse.prev_filter_id);
            }
            return i9 + i5 + getFilteredThreadsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFilteredThreadsResponse decode(ProtoReader protoReader) throws IOException {
            C17584a aVar = new C17584a();
            aVar.f44550c = "";
            aVar.f44551d = "";
            aVar.f44552e = "";
            aVar.f44553f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44548a.add(ThreadItem.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f44549b = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44550c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44551d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44552e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44553f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFilteredThreadsResponse getFilteredThreadsResponse) throws IOException {
            ThreadItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFilteredThreadsResponse.thread_items);
            if (getFilteredThreadsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getFilteredThreadsResponse.entity);
            }
            if (getFilteredThreadsResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getFilteredThreadsResponse.next_cursor);
            }
            if (getFilteredThreadsResponse.prev_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getFilteredThreadsResponse.prev_cursor);
            }
            if (getFilteredThreadsResponse.next_filter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getFilteredThreadsResponse.next_filter_id);
            }
            if (getFilteredThreadsResponse.prev_filter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getFilteredThreadsResponse.prev_filter_id);
            }
            protoWriter.writeBytes(getFilteredThreadsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsResponse$a */
    public static final class C17584a extends Message.Builder<GetFilteredThreadsResponse, C17584a> {

        /* renamed from: a */
        public List<ThreadItem> f44548a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f44549b;

        /* renamed from: c */
        public String f44550c;

        /* renamed from: d */
        public String f44551d;

        /* renamed from: e */
        public String f44552e;

        /* renamed from: f */
        public String f44553f;

        /* renamed from: a */
        public GetFilteredThreadsResponse build() {
            return new GetFilteredThreadsResponse(this.f44548a, this.f44549b, this.f44550c, this.f44551d, this.f44552e, this.f44553f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17584a newBuilder() {
        C17584a aVar = new C17584a();
        aVar.f44548a = Internal.copyOf("thread_items", this.thread_items);
        aVar.f44549b = this.entity;
        aVar.f44550c = this.next_cursor;
        aVar.f44551d = this.prev_cursor;
        aVar.f44552e = this.next_filter_id;
        aVar.f44553f = this.prev_filter_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetFilteredThreadsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_items.isEmpty()) {
            sb.append(", thread_items=");
            sb.append(this.thread_items);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.prev_cursor != null) {
            sb.append(", prev_cursor=");
            sb.append(this.prev_cursor);
        }
        if (this.next_filter_id != null) {
            sb.append(", next_filter_id=");
            sb.append(this.next_filter_id);
        }
        if (this.prev_filter_id != null) {
            sb.append(", prev_filter_id=");
            sb.append(this.prev_filter_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFilteredThreadsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFilteredThreadsResponse(List<ThreadItem> list, C14928Entity entity2, String str, String str2, String str3, String str4) {
        this(list, entity2, str, str2, str3, str4, ByteString.EMPTY);
    }

    public GetFilteredThreadsResponse(List<ThreadItem> list, C14928Entity entity2, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_items = Internal.immutableCopyOf("thread_items", list);
        this.entity = entity2;
        this.next_cursor = str;
        this.prev_cursor = str2;
        this.next_filter_id = str3;
        this.prev_filter_id = str4;
    }
}
