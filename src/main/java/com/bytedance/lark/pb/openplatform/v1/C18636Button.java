package com.bytedance.lark.pb.openplatform.v1;

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

/* renamed from: com.bytedance.lark.pb.openplatform.v1.Button */
public final class C18636Button extends Message<C18636Button, C18637a> {
    public static final ProtoAdapter<C18636Button> ADAPTER = new C18638b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> extras;
    public final String local_content;
    public final String schema;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.Button$b */
    private static final class C18638b extends ProtoAdapter<C18636Button> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f46160a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18638b() {
            super(FieldEncoding.LENGTH_DELIMITED, C18636Button.class);
        }

        /* renamed from: a */
        public int encodedSize(C18636Button button) {
            int i;
            if (button.local_content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, button.local_content);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.encodedSizeWithTag(2, button.schema) + this.f46160a.encodedSizeWithTag(3, button.extras) + button.unknownFields().size();
        }

        /* renamed from: a */
        public C18636Button decode(ProtoReader protoReader) throws IOException {
            C18637a aVar = new C18637a();
            aVar.f46157a = "";
            aVar.f46158b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46157a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46158b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46159c.putAll(this.f46160a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, C18636Button button) throws IOException {
            if (button.local_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button.local_content);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, button.schema);
            this.f46160a.encodeWithTag(protoWriter, 3, button.extras);
            protoWriter.writeBytes(button.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18637a newBuilder() {
        C18637a aVar = new C18637a();
        aVar.f46157a = this.local_content;
        aVar.f46158b = this.schema;
        aVar.f46159c = Internal.copyOf("extras", this.extras);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.Button$a */
    public static final class C18637a extends Message.Builder<C18636Button, C18637a> {

        /* renamed from: a */
        public String f46157a;

        /* renamed from: b */
        public String f46158b;

        /* renamed from: c */
        public Map<String, String> f46159c = Internal.newMutableMap();

        /* renamed from: a */
        public C18636Button build() {
            String str = this.f46158b;
            if (str != null) {
                return new C18636Button(this.f46157a, str, this.f46159c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "schema");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "Button");
        StringBuilder sb = new StringBuilder();
        if (this.local_content != null) {
            sb.append(", local_content=");
            sb.append(this.local_content);
        }
        sb.append(", schema=");
        sb.append(this.schema);
        if (!this.extras.isEmpty()) {
            sb.append(", extras=");
            sb.append(this.extras);
        }
        StringBuilder replace = sb.replace(0, 2, "Button{");
        replace.append('}');
        return replace.toString();
    }

    public C18636Button(String str, String str2, Map<String, String> map) {
        this(str, str2, map, ByteString.EMPTY);
    }

    public C18636Button(String str, String str2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_content = str;
        this.schema = str2;
        this.extras = Internal.immutableCopyOf("extras", map);
    }
}
