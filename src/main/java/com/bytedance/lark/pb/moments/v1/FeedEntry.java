package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedEntry extends Message<FeedEntry, C18368a> {
    public static final ProtoAdapter<FeedEntry> ADAPTER = new C18369b();
    private static final long serialVersionUID = 0;
    public final String post_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.FeedEntry$b */
    private static final class C18369b extends ProtoAdapter<FeedEntry> {
        C18369b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedEntry.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedEntry feedEntry) {
            int i;
            if (feedEntry.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, feedEntry.post_id);
            } else {
                i = 0;
            }
            return i + feedEntry.unknownFields().size();
        }

        /* renamed from: a */
        public FeedEntry decode(ProtoReader protoReader) throws IOException {
            C18368a aVar = new C18368a();
            aVar.f45754a = "";
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
                    aVar.f45754a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedEntry feedEntry) throws IOException {
            if (feedEntry.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedEntry.post_id);
            }
            protoWriter.writeBytes(feedEntry.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.FeedEntry$a */
    public static final class C18368a extends Message.Builder<FeedEntry, C18368a> {

        /* renamed from: a */
        public String f45754a;

        /* renamed from: a */
        public FeedEntry build() {
            return new FeedEntry(this.f45754a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18368a newBuilder() {
        C18368a aVar = new C18368a();
        aVar.f45754a = this.post_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "FeedEntry");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedEntry{");
        replace.append('}');
        return replace.toString();
    }

    public FeedEntry(String str) {
        this(str, ByteString.EMPTY);
    }

    public FeedEntry(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
    }
}
