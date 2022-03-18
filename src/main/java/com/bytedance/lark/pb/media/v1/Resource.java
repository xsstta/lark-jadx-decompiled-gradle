package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Resource extends Message<Resource, C18286a> {
    public static final ProtoAdapter<Resource> ADAPTER = new C18287b();
    private static final long serialVersionUID = 0;
    public final String key;
    public final String path;

    /* renamed from: com.bytedance.lark.pb.media.v1.Resource$b */
    private static final class C18287b extends ProtoAdapter<Resource> {
        C18287b() {
            super(FieldEncoding.LENGTH_DELIMITED, Resource.class);
        }

        /* renamed from: a */
        public int encodedSize(Resource resource) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, resource.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, resource.path) + resource.unknownFields().size();
        }

        /* renamed from: a */
        public Resource decode(ProtoReader protoReader) throws IOException {
            C18286a aVar = new C18286a();
            aVar.f45577a = "";
            aVar.f45578b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45577a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45578b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Resource resource) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resource.key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, resource.path);
            protoWriter.writeBytes(resource.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18286a newBuilder() {
        C18286a aVar = new C18286a();
        aVar.f45577a = this.key;
        aVar.f45578b = this.path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.Resource$a */
    public static final class C18286a extends Message.Builder<Resource, C18286a> {

        /* renamed from: a */
        public String f45577a;

        /* renamed from: b */
        public String f45578b;

        /* renamed from: a */
        public Resource build() {
            String str;
            String str2 = this.f45577a;
            if (str2 != null && (str = this.f45578b) != null) {
                return new Resource(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "key", this.f45578b, "path");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "Resource");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", path=");
        sb.append(this.path);
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }

    public Resource(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Resource(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.path = str2;
    }
}
