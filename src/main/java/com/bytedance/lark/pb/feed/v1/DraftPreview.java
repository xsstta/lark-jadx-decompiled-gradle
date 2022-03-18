package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DraftPreview extends Message<DraftPreview, C17118a> {
    public static final ProtoAdapter<DraftPreview> ADAPTER = new C17119b();
    private static final long serialVersionUID = 0;
    public final String content;

    /* renamed from: com.bytedance.lark.pb.feed.v1.DraftPreview$b */
    private static final class C17119b extends ProtoAdapter<DraftPreview> {
        C17119b() {
            super(FieldEncoding.LENGTH_DELIMITED, DraftPreview.class);
        }

        /* renamed from: a */
        public int encodedSize(DraftPreview draftPreview) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, draftPreview.content) + draftPreview.unknownFields().size();
        }

        /* renamed from: a */
        public DraftPreview decode(ProtoReader protoReader) throws IOException {
            C17118a aVar = new C17118a();
            aVar.f43858a = "";
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
                    aVar.f43858a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DraftPreview draftPreview) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, draftPreview.content);
            protoWriter.writeBytes(draftPreview.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.DraftPreview$a */
    public static final class C17118a extends Message.Builder<DraftPreview, C17118a> {

        /* renamed from: a */
        public String f43858a;

        /* renamed from: a */
        public DraftPreview build() {
            String str = this.f43858a;
            if (str != null) {
                return new DraftPreview(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "content");
        }
    }

    @Override // com.squareup.wire.Message
    public C17118a newBuilder() {
        C17118a aVar = new C17118a();
        aVar.f43858a = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "DraftPreview");
        StringBuilder sb = new StringBuilder();
        sb.append(", content=");
        sb.append(this.content);
        StringBuilder replace = sb.replace(0, 2, "DraftPreview{");
        replace.append('}');
        return replace.toString();
    }

    public DraftPreview(String str) {
        this(str, ByteString.EMPTY);
    }

    public DraftPreview(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = str;
    }
}
