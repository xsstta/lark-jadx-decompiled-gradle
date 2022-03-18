package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.pb.meeting_object.Entity */
public final class C49851Entity extends Message<C49851Entity, C49852a> {
    public static final ProtoAdapter<C49851Entity> ADAPTER = new C49853b();
    private static final long serialVersionUID = 0;
    public final Map<String, EntityUser> musers;

    /* renamed from: com.ss.android.lark.pb.meeting_object.Entity$a */
    public static final class C49852a extends Message.Builder<C49851Entity, C49852a> {

        /* renamed from: a */
        public Map<String, EntityUser> f124804a = Internal.newMutableMap();

        /* renamed from: a */
        public C49851Entity build() {
            return new C49851Entity(this.f124804a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.Entity$b */
    private static final class C49853b extends ProtoAdapter<C49851Entity> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, EntityUser>> f124805a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, EntityUser.ADAPTER);

        C49853b() {
            super(FieldEncoding.LENGTH_DELIMITED, C49851Entity.class);
        }

        /* renamed from: a */
        public int encodedSize(C49851Entity entity) {
            return this.f124805a.encodedSizeWithTag(1, entity.musers) + entity.unknownFields().size();
        }

        /* renamed from: a */
        public C49851Entity decode(ProtoReader protoReader) throws IOException {
            C49852a aVar = new C49852a();
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
                    aVar.f124804a.putAll(this.f124805a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, C49851Entity entity) throws IOException {
            this.f124805a.encodeWithTag(protoWriter, 1, entity.musers);
            protoWriter.writeBytes(entity.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49852a newBuilder() {
        C49852a aVar = new C49852a();
        aVar.f124804a = Internal.copyOf("musers", this.musers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.musers.isEmpty()) {
            sb.append(", users=");
            sb.append(this.musers);
        }
        StringBuilder replace = sb.replace(0, 2, "Entity{");
        replace.append('}');
        return replace.toString();
    }

    public C49851Entity(Map<String, EntityUser> map) {
        this(map, ByteString.EMPTY);
    }

    public C49851Entity(Map<String, EntityUser> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.musers = Internal.immutableCopyOf("musers", map);
    }
}
