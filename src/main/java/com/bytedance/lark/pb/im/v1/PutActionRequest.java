package com.bytedance.lark.pb.im.v1;

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

public final class PutActionRequest extends Message<PutActionRequest, C17969a> {
    public static final ProtoAdapter<PutActionRequest> ADAPTER = new C17970b();
    public static final Boolean DEFAULT_IS_EPHEMERAL = false;
    private static final long serialVersionUID = 0;
    public final String action_id;
    public final Boolean is_ephemeral;
    public final String message_id;
    public final Map<String, String> params;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutActionRequest$b */
    private static final class C17970b extends ProtoAdapter<PutActionRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45068a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17970b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutActionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutActionRequest putActionRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, putActionRequest.action_id) + this.f45068a.encodedSizeWithTag(2, putActionRequest.params) + ProtoAdapter.STRING.encodedSizeWithTag(3, putActionRequest.message_id);
            if (putActionRequest.is_ephemeral != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, putActionRequest.is_ephemeral);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + putActionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutActionRequest decode(ProtoReader protoReader) throws IOException {
            C17969a aVar = new C17969a();
            aVar.f45064a = "";
            aVar.f45066c = "";
            aVar.f45067d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45064a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45065b.putAll(this.f45068a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f45066c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45067d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutActionRequest putActionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, putActionRequest.action_id);
            this.f45068a.encodeWithTag(protoWriter, 2, putActionRequest.params);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, putActionRequest.message_id);
            if (putActionRequest.is_ephemeral != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, putActionRequest.is_ephemeral);
            }
            protoWriter.writeBytes(putActionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutActionRequest$a */
    public static final class C17969a extends Message.Builder<PutActionRequest, C17969a> {

        /* renamed from: a */
        public String f45064a;

        /* renamed from: b */
        public Map<String, String> f45065b = Internal.newMutableMap();

        /* renamed from: c */
        public String f45066c;

        /* renamed from: d */
        public Boolean f45067d;

        /* renamed from: a */
        public PutActionRequest build() {
            String str;
            String str2 = this.f45064a;
            if (str2 != null && (str = this.f45066c) != null) {
                return new PutActionRequest(str2, this.f45065b, str, this.f45067d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "action_id", this.f45066c, "message_id");
        }

        /* renamed from: a */
        public C17969a mo62454a(Boolean bool) {
            this.f45067d = bool;
            return this;
        }

        /* renamed from: b */
        public C17969a mo62458b(String str) {
            this.f45066c = str;
            return this;
        }

        /* renamed from: a */
        public C17969a mo62455a(String str) {
            this.f45064a = str;
            return this;
        }

        /* renamed from: a */
        public C17969a mo62456a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f45065b = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17969a newBuilder() {
        C17969a aVar = new C17969a();
        aVar.f45064a = this.action_id;
        aVar.f45065b = Internal.copyOf("params", this.params);
        aVar.f45066c = this.message_id;
        aVar.f45067d = this.is_ephemeral;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutActionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", action_id=");
        sb.append(this.action_id);
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.is_ephemeral != null) {
            sb.append(", is_ephemeral=");
            sb.append(this.is_ephemeral);
        }
        StringBuilder replace = sb.replace(0, 2, "PutActionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutActionRequest(String str, Map<String, String> map, String str2, Boolean bool) {
        this(str, map, str2, bool, ByteString.EMPTY);
    }

    public PutActionRequest(String str, Map<String, String> map, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_id = str;
        this.params = Internal.immutableCopyOf("params", map);
        this.message_id = str2;
        this.is_ephemeral = bool;
    }
}
