package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DeleteChatChattersRequest extends Message<DeleteChatChattersRequest, C17396a> {
    public static final ProtoAdapter<DeleteChatChattersRequest> ADAPTER = new C17397b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> chatter_ids;
    public final String new_owner_id;
    public final DeleteChatChatterOption option;
    public final List<PickEntities> pick_entities;

    public static final class DeleteChatChatterOption extends Message<DeleteChatChatterOption, C17394a> {
        public static final ProtoAdapter<DeleteChatChatterOption> ADAPTER = new C17395b();
        public static final Boolean DEFAULT_WITHDRAW = false;
        private static final long serialVersionUID = 0;
        public final Boolean withdraw;

        /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatChattersRequest$DeleteChatChatterOption$b */
        private static final class C17395b extends ProtoAdapter<DeleteChatChatterOption> {
            C17395b() {
                super(FieldEncoding.LENGTH_DELIMITED, DeleteChatChatterOption.class);
            }

            /* renamed from: a */
            public int encodedSize(DeleteChatChatterOption deleteChatChatterOption) {
                int i;
                if (deleteChatChatterOption.withdraw != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, deleteChatChatterOption.withdraw);
                } else {
                    i = 0;
                }
                return i + deleteChatChatterOption.unknownFields().size();
            }

            /* renamed from: a */
            public DeleteChatChatterOption decode(ProtoReader protoReader) throws IOException {
                C17394a aVar = new C17394a();
                aVar.f44302a = false;
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
                        aVar.f44302a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DeleteChatChatterOption deleteChatChatterOption) throws IOException {
                if (deleteChatChatterOption.withdraw != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, deleteChatChatterOption.withdraw);
                }
                protoWriter.writeBytes(deleteChatChatterOption.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatChattersRequest$DeleteChatChatterOption$a */
        public static final class C17394a extends Message.Builder<DeleteChatChatterOption, C17394a> {

            /* renamed from: a */
            public Boolean f44302a;

            /* renamed from: a */
            public DeleteChatChatterOption build() {
                return new DeleteChatChatterOption(this.f44302a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17394a newBuilder() {
            C17394a aVar = new C17394a();
            aVar.f44302a = this.withdraw;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "DeleteChatChatterOption");
            StringBuilder sb = new StringBuilder();
            if (this.withdraw != null) {
                sb.append(", withdraw=");
                sb.append(this.withdraw);
            }
            StringBuilder replace = sb.replace(0, 2, "DeleteChatChatterOption{");
            replace.append('}');
            return replace.toString();
        }

        public DeleteChatChatterOption(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public DeleteChatChatterOption(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.withdraw = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatChattersRequest$b */
    private static final class C17397b extends ProtoAdapter<DeleteChatChattersRequest> {
        C17397b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteChatChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteChatChattersRequest deleteChatChattersRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteChatChattersRequest.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, deleteChatChattersRequest.chatter_ids);
            int i2 = 0;
            if (deleteChatChattersRequest.new_owner_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, deleteChatChattersRequest.new_owner_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (deleteChatChattersRequest.option != null) {
                i2 = DeleteChatChatterOption.ADAPTER.encodedSizeWithTag(4, deleteChatChattersRequest.option);
            }
            return i3 + i2 + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(5, deleteChatChattersRequest.pick_entities) + deleteChatChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteChatChattersRequest decode(ProtoReader protoReader) throws IOException {
            C17396a aVar = new C17396a();
            aVar.f44303a = "";
            aVar.f44305c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44303a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44304b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44305c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44306d = DeleteChatChatterOption.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44307e.add(PickEntities.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteChatChattersRequest deleteChatChattersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteChatChattersRequest.chat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, deleteChatChattersRequest.chatter_ids);
            if (deleteChatChattersRequest.new_owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, deleteChatChattersRequest.new_owner_id);
            }
            if (deleteChatChattersRequest.option != null) {
                DeleteChatChatterOption.ADAPTER.encodeWithTag(protoWriter, 4, deleteChatChattersRequest.option);
            }
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, deleteChatChattersRequest.pick_entities);
            protoWriter.writeBytes(deleteChatChattersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatChattersRequest$a */
    public static final class C17396a extends Message.Builder<DeleteChatChattersRequest, C17396a> {

        /* renamed from: a */
        public String f44303a;

        /* renamed from: b */
        public List<String> f44304b = Internal.newMutableList();

        /* renamed from: c */
        public String f44305c;

        /* renamed from: d */
        public DeleteChatChatterOption f44306d;

        /* renamed from: e */
        public List<PickEntities> f44307e = Internal.newMutableList();

        /* renamed from: a */
        public DeleteChatChattersRequest build() {
            String str = this.f44303a;
            if (str != null) {
                return new DeleteChatChattersRequest(str, this.f44304b, this.f44305c, this.f44306d, this.f44307e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17396a mo61052a(DeleteChatChatterOption deleteChatChatterOption) {
            this.f44306d = deleteChatChatterOption;
            return this;
        }

        /* renamed from: b */
        public C17396a mo61056b(String str) {
            this.f44305c = str;
            return this;
        }

        /* renamed from: a */
        public C17396a mo61053a(String str) {
            this.f44303a = str;
            return this;
        }

        /* renamed from: b */
        public C17396a mo61057b(List<PickEntities> list) {
            Internal.checkElementsNotNull(list);
            this.f44307e = list;
            return this;
        }

        /* renamed from: a */
        public C17396a mo61054a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44304b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17396a newBuilder() {
        C17396a aVar = new C17396a();
        aVar.f44303a = this.chat_id;
        aVar.f44304b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44305c = this.new_owner_id;
        aVar.f44306d = this.option;
        aVar.f44307e = Internal.copyOf("pick_entities", this.pick_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteChatChattersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.new_owner_id != null) {
            sb.append(", new_owner_id=");
            sb.append(this.new_owner_id);
        }
        if (this.option != null) {
            sb.append(", option=");
            sb.append(this.option);
        }
        if (!this.pick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.pick_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteChatChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteChatChattersRequest(String str, List<String> list, String str2, DeleteChatChatterOption deleteChatChatterOption, List<PickEntities> list2) {
        this(str, list, str2, deleteChatChatterOption, list2, ByteString.EMPTY);
    }

    public DeleteChatChattersRequest(String str, List<String> list, String str2, DeleteChatChatterOption deleteChatChatterOption, List<PickEntities> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.new_owner_id = str2;
        this.option = deleteChatChatterOption;
        this.pick_entities = Internal.immutableCopyOf("pick_entities", list2);
    }
}
