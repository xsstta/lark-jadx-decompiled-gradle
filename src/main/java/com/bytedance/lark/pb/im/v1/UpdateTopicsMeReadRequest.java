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

public final class UpdateTopicsMeReadRequest extends Message<UpdateTopicsMeReadRequest, C18166a> {
    public static final ProtoAdapter<UpdateTopicsMeReadRequest> ADAPTER = new C18167b();
    private static final long serialVersionUID = 0;
    public final List<ReadPair> read_pairs;

    public static final class ReadPair extends Message<ReadPair, C18164a> {
        public static final ProtoAdapter<ReadPair> ADAPTER = new C18165b();
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final List<String> message_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.UpdateTopicsMeReadRequest$ReadPair$b */
        private static final class C18165b extends ProtoAdapter<ReadPair> {
            C18165b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReadPair.class);
            }

            /* renamed from: a */
            public int encodedSize(ReadPair readPair) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, readPair.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, readPair.message_ids) + readPair.unknownFields().size();
            }

            /* renamed from: a */
            public ReadPair decode(ProtoReader protoReader) throws IOException {
                C18164a aVar = new C18164a();
                aVar.f45368a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45368a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45369b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReadPair readPair) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, readPair.chat_id);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, readPair.message_ids);
                protoWriter.writeBytes(readPair.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.UpdateTopicsMeReadRequest$ReadPair$a */
        public static final class C18164a extends Message.Builder<ReadPair, C18164a> {

            /* renamed from: a */
            public String f45368a;

            /* renamed from: b */
            public List<String> f45369b = Internal.newMutableList();

            /* renamed from: a */
            public ReadPair build() {
                String str = this.f45368a;
                if (str != null) {
                    return new ReadPair(str, this.f45369b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "chat_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C18164a newBuilder() {
            C18164a aVar = new C18164a();
            aVar.f45368a = this.chat_id;
            aVar.f45369b = Internal.copyOf("message_ids", this.message_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ReadPair");
            StringBuilder sb = new StringBuilder();
            sb.append(", chat_id=");
            sb.append(this.chat_id);
            if (!this.message_ids.isEmpty()) {
                sb.append(", message_ids=");
                sb.append(this.message_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "ReadPair{");
            replace.append('}');
            return replace.toString();
        }

        public ReadPair(String str, List<String> list) {
            this(str, list, ByteString.EMPTY);
        }

        public ReadPair(String str, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = str;
            this.message_ids = Internal.immutableCopyOf("message_ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateTopicsMeReadRequest$b */
    private static final class C18167b extends ProtoAdapter<UpdateTopicsMeReadRequest> {
        C18167b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateTopicsMeReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateTopicsMeReadRequest updateTopicsMeReadRequest) {
            return ReadPair.ADAPTER.asRepeated().encodedSizeWithTag(1, updateTopicsMeReadRequest.read_pairs) + updateTopicsMeReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateTopicsMeReadRequest decode(ProtoReader protoReader) throws IOException {
            C18166a aVar = new C18166a();
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
                    aVar.f45370a.add(ReadPair.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateTopicsMeReadRequest updateTopicsMeReadRequest) throws IOException {
            ReadPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateTopicsMeReadRequest.read_pairs);
            protoWriter.writeBytes(updateTopicsMeReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateTopicsMeReadRequest$a */
    public static final class C18166a extends Message.Builder<UpdateTopicsMeReadRequest, C18166a> {

        /* renamed from: a */
        public List<ReadPair> f45370a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateTopicsMeReadRequest build() {
            return new UpdateTopicsMeReadRequest(this.f45370a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18166a newBuilder() {
        C18166a aVar = new C18166a();
        aVar.f45370a = Internal.copyOf("read_pairs", this.read_pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateTopicsMeReadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.read_pairs.isEmpty()) {
            sb.append(", read_pairs=");
            sb.append(this.read_pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateTopicsMeReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateTopicsMeReadRequest(List<ReadPair> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateTopicsMeReadRequest(List<ReadPair> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.read_pairs = Internal.immutableCopyOf("read_pairs", list);
    }
}
