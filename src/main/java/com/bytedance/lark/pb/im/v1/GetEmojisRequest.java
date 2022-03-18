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

public final class GetEmojisRequest extends Message<GetEmojisRequest, C17574a> {
    public static final ProtoAdapter<GetEmojisRequest> ADAPTER = new C17575b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<String> trigger_keys;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetEmojisRequest$b */
    private static final class C17575b extends ProtoAdapter<GetEmojisRequest> {
        C17575b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEmojisRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEmojisRequest getEmojisRequest) {
            int i;
            if (getEmojisRequest.version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getEmojisRequest.version);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getEmojisRequest.trigger_keys) + getEmojisRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEmojisRequest decode(ProtoReader protoReader) throws IOException {
            C17574a aVar = new C17574a();
            aVar.f44532a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44532a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44533b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEmojisRequest getEmojisRequest) throws IOException {
            if (getEmojisRequest.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getEmojisRequest.version);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getEmojisRequest.trigger_keys);
            protoWriter.writeBytes(getEmojisRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetEmojisRequest$a */
    public static final class C17574a extends Message.Builder<GetEmojisRequest, C17574a> {

        /* renamed from: a */
        public Integer f44532a;

        /* renamed from: b */
        public List<String> f44533b = Internal.newMutableList();

        /* renamed from: a */
        public GetEmojisRequest build() {
            return new GetEmojisRequest(this.f44532a, this.f44533b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17574a mo61500a(Integer num) {
            this.f44532a = num;
            return this;
        }

        /* renamed from: a */
        public C17574a mo61501a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44533b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17574a newBuilder() {
        C17574a aVar = new C17574a();
        aVar.f44532a = this.version;
        aVar.f44533b = Internal.copyOf("trigger_keys", this.trigger_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetEmojisRequest");
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.trigger_keys.isEmpty()) {
            sb.append(", trigger_keys=");
            sb.append(this.trigger_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEmojisRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEmojisRequest(Integer num, List<String> list) {
        this(num, list, ByteString.EMPTY);
    }

    public GetEmojisRequest(Integer num, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.trigger_keys = Internal.immutableCopyOf("trigger_keys", list);
    }
}
