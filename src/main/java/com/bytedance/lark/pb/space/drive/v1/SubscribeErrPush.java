package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SubscribeErrPush extends Message<SubscribeErrPush, C19391a> {
    public static final ProtoAdapter<SubscribeErrPush> ADAPTER = new C19392b();
    private static final long serialVersionUID = 0;
    public final Map<String, ResultType> fail_sign;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.SubscribeErrPush$a */
    public static final class C19391a extends Message.Builder<SubscribeErrPush, C19391a> {

        /* renamed from: a */
        public Map<String, ResultType> f47685a = Internal.newMutableMap();

        /* renamed from: a */
        public SubscribeErrPush build() {
            return new SubscribeErrPush(this.f47685a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.SubscribeErrPush$b */
    private static final class C19392b extends ProtoAdapter<SubscribeErrPush> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ResultType>> f47686a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ResultType.ADAPTER);

        C19392b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeErrPush.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeErrPush subscribeErrPush) {
            return this.f47686a.encodedSizeWithTag(1, subscribeErrPush.fail_sign) + subscribeErrPush.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeErrPush decode(ProtoReader protoReader) throws IOException {
            C19391a aVar = new C19391a();
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
                    aVar.f47685a.putAll(this.f47686a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeErrPush subscribeErrPush) throws IOException {
            this.f47686a.encodeWithTag(protoWriter, 1, subscribeErrPush.fail_sign);
            protoWriter.writeBytes(subscribeErrPush.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19391a newBuilder() {
        C19391a aVar = new C19391a();
        aVar.f47685a = Internal.copyOf("fail_sign", this.fail_sign);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "SubscribeErrPush");
        StringBuilder sb = new StringBuilder();
        if (!this.fail_sign.isEmpty()) {
            sb.append(", fail_sign=");
            sb.append(this.fail_sign);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeErrPush{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeErrPush(Map<String, ResultType> map) {
        this(map, ByteString.EMPTY);
    }

    public SubscribeErrPush(Map<String, ResultType> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fail_sign = Internal.immutableCopyOf("fail_sign", map);
    }
}
