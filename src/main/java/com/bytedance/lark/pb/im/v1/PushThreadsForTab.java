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

public final class PushThreadsForTab extends Message<PushThreadsForTab, C17955a> {
    public static final ProtoAdapter<PushThreadsForTab> ADAPTER = new C17956b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<ThreadItem> thread_items;

    public static final class ThreadItem extends Message<ThreadItem, C17953a> {
        public static final ProtoAdapter<ThreadItem> ADAPTER = new C17954b();
        private static final long serialVersionUID = 0;
        public final String item_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.PushThreadsForTab$ThreadItem$b */
        private static final class C17954b extends ProtoAdapter<ThreadItem> {
            C17954b() {
                super(FieldEncoding.LENGTH_DELIMITED, ThreadItem.class);
            }

            /* renamed from: a */
            public int encodedSize(ThreadItem threadItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, threadItem.item_id) + threadItem.unknownFields().size();
            }

            /* renamed from: a */
            public ThreadItem decode(ProtoReader protoReader) throws IOException {
                C17953a aVar = new C17953a();
                aVar.f45045a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45045a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ThreadItem threadItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, threadItem.item_id);
                protoWriter.writeBytes(threadItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushThreadsForTab$ThreadItem$a */
        public static final class C17953a extends Message.Builder<ThreadItem, C17953a> {

            /* renamed from: a */
            public String f45045a;

            /* renamed from: a */
            public ThreadItem build() {
                String str = this.f45045a;
                if (str != null) {
                    return new ThreadItem(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C17953a newBuilder() {
            C17953a aVar = new C17953a();
            aVar.f45045a = this.item_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ThreadItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            StringBuilder replace = sb.replace(0, 2, "ThreadItem{");
            replace.append('}');
            return replace.toString();
        }

        public ThreadItem(String str) {
            this(str, ByteString.EMPTY);
        }

        public ThreadItem(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushThreadsForTab$b */
    private static final class C17956b extends ProtoAdapter<PushThreadsForTab> {
        C17956b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushThreadsForTab.class);
        }

        /* renamed from: a */
        public int encodedSize(PushThreadsForTab pushThreadsForTab) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, pushThreadsForTab.entity) + ThreadItem.ADAPTER.asRepeated().encodedSizeWithTag(2, pushThreadsForTab.thread_items) + pushThreadsForTab.unknownFields().size();
        }

        /* renamed from: a */
        public PushThreadsForTab decode(ProtoReader protoReader) throws IOException {
            C17955a aVar = new C17955a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45046a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45047b.add(ThreadItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushThreadsForTab pushThreadsForTab) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, pushThreadsForTab.entity);
            ThreadItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushThreadsForTab.thread_items);
            protoWriter.writeBytes(pushThreadsForTab.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushThreadsForTab$a */
    public static final class C17955a extends Message.Builder<PushThreadsForTab, C17955a> {

        /* renamed from: a */
        public C14928Entity f45046a;

        /* renamed from: b */
        public List<ThreadItem> f45047b = Internal.newMutableList();

        /* renamed from: a */
        public PushThreadsForTab build() {
            C14928Entity entity = this.f45046a;
            if (entity != null) {
                return new PushThreadsForTab(entity, this.f45047b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17955a newBuilder() {
        C17955a aVar = new C17955a();
        aVar.f45046a = this.entity;
        aVar.f45047b = Internal.copyOf("thread_items", this.thread_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushThreadsForTab");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.thread_items.isEmpty()) {
            sb.append(", thread_items=");
            sb.append(this.thread_items);
        }
        StringBuilder replace = sb.replace(0, 2, "PushThreadsForTab{");
        replace.append('}');
        return replace.toString();
    }

    public PushThreadsForTab(C14928Entity entity2, List<ThreadItem> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public PushThreadsForTab(C14928Entity entity2, List<ThreadItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.thread_items = Internal.immutableCopyOf("thread_items", list);
    }
}
