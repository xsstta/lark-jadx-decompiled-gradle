package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FeedFilterList extends Message<FeedFilterList, C17132a> {
    public static final ProtoAdapter<FeedFilterList> ADAPTER = new C17133b();
    private static final long serialVersionUID = 0;
    public final List<FeedFilter> type;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilterList$b */
    private static final class C17133b extends ProtoAdapter<FeedFilterList> {
        C17133b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedFilterList.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedFilterList feedFilterList) {
            return FeedFilter.ADAPTER.asRepeated().encodedSizeWithTag(1, feedFilterList.type) + feedFilterList.unknownFields().size();
        }

        /* renamed from: a */
        public FeedFilterList decode(ProtoReader protoReader) throws IOException {
            C17132a aVar = new C17132a();
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
                    aVar.f43880a.add(FeedFilter.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedFilterList feedFilterList) throws IOException {
            FeedFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, feedFilterList.type);
            protoWriter.writeBytes(feedFilterList.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilterList$a */
    public static final class C17132a extends Message.Builder<FeedFilterList, C17132a> {

        /* renamed from: a */
        public List<FeedFilter> f43880a = Internal.newMutableList();

        /* renamed from: a */
        public FeedFilterList build() {
            return new FeedFilterList(this.f43880a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17132a newBuilder() {
        C17132a aVar = new C17132a();
        aVar.f43880a = Internal.copyOf(ShareHitPoint.f121869d, this.type);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedFilterList");
        StringBuilder sb = new StringBuilder();
        if (!this.type.isEmpty()) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedFilterList{");
        replace.append('}');
        return replace.toString();
    }

    public FeedFilterList(List<FeedFilter> list) {
        this(list, ByteString.EMPTY);
    }

    public FeedFilterList(List<FeedFilter> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = Internal.immutableCopyOf(ShareHitPoint.f121869d, list);
    }
}
