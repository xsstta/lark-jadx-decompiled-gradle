package com.bytedance.lark.pb.url.v1;

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

public final class PushUrlPreviews extends Message<PushUrlPreviews, C19819a> {
    public static final ProtoAdapter<PushUrlPreviews> ADAPTER = new C19820b();
    private static final long serialVersionUID = 0;
    public final Map<String, UrlPreviewEntries> url_preview_entries;

    /* renamed from: com.bytedance.lark.pb.url.v1.PushUrlPreviews$a */
    public static final class C19819a extends Message.Builder<PushUrlPreviews, C19819a> {

        /* renamed from: a */
        public Map<String, UrlPreviewEntries> f48305a = Internal.newMutableMap();

        /* renamed from: a */
        public PushUrlPreviews build() {
            return new PushUrlPreviews(this.f48305a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.PushUrlPreviews$b */
    private static final class C19820b extends ProtoAdapter<PushUrlPreviews> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlPreviewEntries>> f48306a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewEntries.ADAPTER);

        C19820b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUrlPreviews.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUrlPreviews pushUrlPreviews) {
            return this.f48306a.encodedSizeWithTag(1, pushUrlPreviews.url_preview_entries) + pushUrlPreviews.unknownFields().size();
        }

        /* renamed from: a */
        public PushUrlPreviews decode(ProtoReader protoReader) throws IOException {
            C19819a aVar = new C19819a();
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
                    aVar.f48305a.putAll(this.f48306a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUrlPreviews pushUrlPreviews) throws IOException {
            this.f48306a.encodeWithTag(protoWriter, 1, pushUrlPreviews.url_preview_entries);
            protoWriter.writeBytes(pushUrlPreviews.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19819a newBuilder() {
        C19819a aVar = new C19819a();
        aVar.f48305a = Internal.copyOf("url_preview_entries", this.url_preview_entries);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "PushUrlPreviews");
        StringBuilder sb = new StringBuilder();
        if (!this.url_preview_entries.isEmpty()) {
            sb.append(", url_preview_entries=");
            sb.append(this.url_preview_entries);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUrlPreviews{");
        replace.append('}');
        return replace.toString();
    }

    public PushUrlPreviews(Map<String, UrlPreviewEntries> map) {
        this(map, ByteString.EMPTY);
    }

    public PushUrlPreviews(Map<String, UrlPreviewEntries> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url_preview_entries = Internal.immutableCopyOf("url_preview_entries", map);
    }
}
