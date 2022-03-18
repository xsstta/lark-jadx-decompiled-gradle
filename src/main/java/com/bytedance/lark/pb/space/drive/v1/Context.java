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

public final class Context extends Message<Context, C19325a> {
    public static final ProtoAdapter<Context> ADAPTER = new C19326b();
    public static final Long DEFAULT_SENDTIMEMS = 0L;
    private static final long serialVersionUID = 0;
    public final Map<String, String> Extra;
    public final String LogID;
    public final Long SendTimeMS;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.Context$b */
    private static final class C19326b extends ProtoAdapter<Context> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47519a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19326b() {
            super(FieldEncoding.LENGTH_DELIMITED, Context.class);
        }

        /* renamed from: a */
        public int encodedSize(Context context) {
            return this.f47519a.encodedSizeWithTag(1, context.Extra) + ProtoAdapter.STRING.encodedSizeWithTag(2, context.LogID) + ProtoAdapter.INT64.encodedSizeWithTag(3, context.SendTimeMS) + context.unknownFields().size();
        }

        /* renamed from: a */
        public Context decode(ProtoReader protoReader) throws IOException {
            C19325a aVar = new C19325a();
            aVar.f47517b = "";
            aVar.f47518c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47516a.putAll(this.f47519a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47517b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47518c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Context context) throws IOException {
            this.f47519a.encodeWithTag(protoWriter, 1, context.Extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, context.LogID);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, context.SendTimeMS);
            protoWriter.writeBytes(context.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19325a newBuilder() {
        C19325a aVar = new C19325a();
        aVar.f47516a = Internal.copyOf("Extra", this.Extra);
        aVar.f47517b = this.LogID;
        aVar.f47518c = this.SendTimeMS;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.Context$a */
    public static final class C19325a extends Message.Builder<Context, C19325a> {

        /* renamed from: a */
        public Map<String, String> f47516a = Internal.newMutableMap();

        /* renamed from: b */
        public String f47517b;

        /* renamed from: c */
        public Long f47518c;

        /* renamed from: a */
        public Context build() {
            Long l;
            String str = this.f47517b;
            if (str != null && (l = this.f47518c) != null) {
                return new Context(this.f47516a, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "LogID", this.f47518c, "SendTimeMS");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "Context");
        StringBuilder sb = new StringBuilder();
        if (!this.Extra.isEmpty()) {
            sb.append(", Extra=");
            sb.append(this.Extra);
        }
        sb.append(", LogID=");
        sb.append(this.LogID);
        sb.append(", SendTimeMS=");
        sb.append(this.SendTimeMS);
        StringBuilder replace = sb.replace(0, 2, "Context{");
        replace.append('}');
        return replace.toString();
    }

    public Context(Map<String, String> map, String str, Long l) {
        this(map, str, l, ByteString.EMPTY);
    }

    public Context(Map<String, String> map, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Extra = Internal.immutableCopyOf("Extra", map);
        this.LogID = str;
        this.SendTimeMS = l;
    }
}
