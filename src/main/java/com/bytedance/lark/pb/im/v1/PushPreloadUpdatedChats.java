package com.bytedance.lark.pb.im.v1;

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

public final class PushPreloadUpdatedChats extends Message<PushPreloadUpdatedChats, C17943a> {
    public static final ProtoAdapter<PushPreloadUpdatedChats> ADAPTER = new C17944b();
    private static final long serialVersionUID = 0;
    public final List<UpdatedItem> updated_items;

    public static final class UpdatedItem extends Message<UpdatedItem, C17941a> {
        public static final ProtoAdapter<UpdatedItem> ADAPTER = new C17942b();
        private static final long serialVersionUID = 0;
        public final String item_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.PushPreloadUpdatedChats$UpdatedItem$b */
        private static final class C17942b extends ProtoAdapter<UpdatedItem> {
            C17942b() {
                super(FieldEncoding.LENGTH_DELIMITED, UpdatedItem.class);
            }

            /* renamed from: a */
            public int encodedSize(UpdatedItem updatedItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, updatedItem.item_id) + updatedItem.unknownFields().size();
            }

            /* renamed from: a */
            public UpdatedItem decode(ProtoReader protoReader) throws IOException {
                C17941a aVar = new C17941a();
                aVar.f45033a = "";
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
                        aVar.f45033a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UpdatedItem updatedItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updatedItem.item_id);
                protoWriter.writeBytes(updatedItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushPreloadUpdatedChats$UpdatedItem$a */
        public static final class C17941a extends Message.Builder<UpdatedItem, C17941a> {

            /* renamed from: a */
            public String f45033a;

            /* renamed from: a */
            public UpdatedItem build() {
                String str = this.f45033a;
                if (str != null) {
                    return new UpdatedItem(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C17941a newBuilder() {
            C17941a aVar = new C17941a();
            aVar.f45033a = this.item_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "UpdatedItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            StringBuilder replace = sb.replace(0, 2, "UpdatedItem{");
            replace.append('}');
            return replace.toString();
        }

        public UpdatedItem(String str) {
            this(str, ByteString.EMPTY);
        }

        public UpdatedItem(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushPreloadUpdatedChats$b */
    private static final class C17944b extends ProtoAdapter<PushPreloadUpdatedChats> {
        C17944b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPreloadUpdatedChats.class);
        }

        /* renamed from: a */
        public int encodedSize(PushPreloadUpdatedChats pushPreloadUpdatedChats) {
            return UpdatedItem.ADAPTER.asRepeated().encodedSizeWithTag(1, pushPreloadUpdatedChats.updated_items) + pushPreloadUpdatedChats.unknownFields().size();
        }

        /* renamed from: a */
        public PushPreloadUpdatedChats decode(ProtoReader protoReader) throws IOException {
            C17943a aVar = new C17943a();
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
                    aVar.f45034a.add(UpdatedItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushPreloadUpdatedChats pushPreloadUpdatedChats) throws IOException {
            UpdatedItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushPreloadUpdatedChats.updated_items);
            protoWriter.writeBytes(pushPreloadUpdatedChats.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushPreloadUpdatedChats$a */
    public static final class C17943a extends Message.Builder<PushPreloadUpdatedChats, C17943a> {

        /* renamed from: a */
        public List<UpdatedItem> f45034a = Internal.newMutableList();

        /* renamed from: a */
        public PushPreloadUpdatedChats build() {
            return new PushPreloadUpdatedChats(this.f45034a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17943a newBuilder() {
        C17943a aVar = new C17943a();
        aVar.f45034a = Internal.copyOf("updated_items", this.updated_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushPreloadUpdatedChats");
        StringBuilder sb = new StringBuilder();
        if (!this.updated_items.isEmpty()) {
            sb.append(", updated_items=");
            sb.append(this.updated_items);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPreloadUpdatedChats{");
        replace.append('}');
        return replace.toString();
    }

    public PushPreloadUpdatedChats(List<UpdatedItem> list) {
        this(list, ByteString.EMPTY);
    }

    public PushPreloadUpdatedChats(List<UpdatedItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updated_items = Internal.immutableCopyOf("updated_items", list);
    }
}
