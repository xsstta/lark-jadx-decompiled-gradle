package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchBoxMeta extends Message<SearchBoxMeta, C18855a> {
    public static final ProtoAdapter<SearchBoxMeta> ADAPTER = new C18856b();
    public static final Integer DEFAULT_UNREAD_MESSAGE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Integer unread_message_count;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchBoxMeta$b */
    private static final class C18856b extends ProtoAdapter<SearchBoxMeta> {
        C18856b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchBoxMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchBoxMeta searchBoxMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, searchBoxMeta.id) + ProtoAdapter.INT32.encodedSizeWithTag(2, searchBoxMeta.unread_message_count) + searchBoxMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchBoxMeta decode(ProtoReader protoReader) throws IOException {
            C18855a aVar = new C18855a();
            aVar.f46543a = "";
            aVar.f46544b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46543a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46544b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchBoxMeta searchBoxMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchBoxMeta.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchBoxMeta.unread_message_count);
            protoWriter.writeBytes(searchBoxMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18855a newBuilder() {
        C18855a aVar = new C18855a();
        aVar.f46543a = this.id;
        aVar.f46544b = this.unread_message_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchBoxMeta$a */
    public static final class C18855a extends Message.Builder<SearchBoxMeta, C18855a> {

        /* renamed from: a */
        public String f46543a;

        /* renamed from: b */
        public Integer f46544b;

        /* renamed from: a */
        public SearchBoxMeta build() {
            Integer num;
            String str = this.f46543a;
            if (str != null && (num = this.f46544b) != null) {
                return new SearchBoxMeta(str, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f46544b, "unread_message_count");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchBoxMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", unread_message_count=");
        sb.append(this.unread_message_count);
        StringBuilder replace = sb.replace(0, 2, "SearchBoxMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchBoxMeta(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public SearchBoxMeta(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.unread_message_count = num;
    }
}
