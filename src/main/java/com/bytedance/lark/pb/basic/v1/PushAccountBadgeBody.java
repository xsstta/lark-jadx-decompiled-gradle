package com.bytedance.lark.pb.basic.v1;

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

public final class PushAccountBadgeBody extends Message<PushAccountBadgeBody, C15125a> {
    public static final ProtoAdapter<PushAccountBadgeBody> ADAPTER = new C15126b();
    private static final long serialVersionUID = 0;
    public final Map<String, Integer> user_badge_map;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushAccountBadgeBody$a */
    public static final class C15125a extends Message.Builder<PushAccountBadgeBody, C15125a> {

        /* renamed from: a */
        public Map<String, Integer> f40098a = Internal.newMutableMap();

        /* renamed from: a */
        public PushAccountBadgeBody build() {
            return new PushAccountBadgeBody(this.f40098a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushAccountBadgeBody$b */
    private static final class C15126b extends ProtoAdapter<PushAccountBadgeBody> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f40099a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        C15126b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAccountBadgeBody.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAccountBadgeBody pushAccountBadgeBody) {
            return this.f40099a.encodedSizeWithTag(1, pushAccountBadgeBody.user_badge_map) + pushAccountBadgeBody.unknownFields().size();
        }

        /* renamed from: a */
        public PushAccountBadgeBody decode(ProtoReader protoReader) throws IOException {
            C15125a aVar = new C15125a();
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
                    aVar.f40098a.putAll(this.f40099a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAccountBadgeBody pushAccountBadgeBody) throws IOException {
            this.f40099a.encodeWithTag(protoWriter, 1, pushAccountBadgeBody.user_badge_map);
            protoWriter.writeBytes(pushAccountBadgeBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15125a newBuilder() {
        C15125a aVar = new C15125a();
        aVar.f40098a = Internal.copyOf("user_badge_map", this.user_badge_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PushAccountBadgeBody");
        StringBuilder sb = new StringBuilder();
        if (!this.user_badge_map.isEmpty()) {
            sb.append(", user_badge_map=");
            sb.append(this.user_badge_map);
        }
        StringBuilder replace = sb.replace(0, 2, "PushAccountBadgeBody{");
        replace.append('}');
        return replace.toString();
    }

    public PushAccountBadgeBody(Map<String, Integer> map) {
        this(map, ByteString.EMPTY);
    }

    public PushAccountBadgeBody(Map<String, Integer> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_badge_map = Internal.immutableCopyOf("user_badge_map", map);
    }
}
