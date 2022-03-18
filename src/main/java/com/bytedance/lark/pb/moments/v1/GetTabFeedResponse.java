package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetTabFeedResponse extends Message<GetTabFeedResponse, C18394a> {
    public static final ProtoAdapter<GetTabFeedResponse> ADAPTER = new C18395b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final List<FeedEntry> entry_list;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetTabFeedResponse$b */
    private static final class C18395b extends ProtoAdapter<GetTabFeedResponse> {
        C18395b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTabFeedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTabFeedResponse getTabFeedResponse) {
            int i;
            int i2 = 0;
            if (getTabFeedResponse.next_page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getTabFeedResponse.next_page_token);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FeedEntry.ADAPTER.asRepeated().encodedSizeWithTag(2, getTabFeedResponse.entry_list);
            if (getTabFeedResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(3, getTabFeedResponse.entities);
            }
            return encodedSizeWithTag + i2 + getTabFeedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTabFeedResponse decode(ProtoReader protoReader) throws IOException {
            C18394a aVar = new C18394a();
            aVar.f45774a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45774a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45775b.add(FeedEntry.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45776c = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTabFeedResponse getTabFeedResponse) throws IOException {
            if (getTabFeedResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTabFeedResponse.next_page_token);
            }
            FeedEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getTabFeedResponse.entry_list);
            if (getTabFeedResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 3, getTabFeedResponse.entities);
            }
            protoWriter.writeBytes(getTabFeedResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetTabFeedResponse$a */
    public static final class C18394a extends Message.Builder<GetTabFeedResponse, C18394a> {

        /* renamed from: a */
        public String f45774a;

        /* renamed from: b */
        public List<FeedEntry> f45775b = Internal.newMutableList();

        /* renamed from: c */
        public Entities f45776c;

        /* renamed from: a */
        public GetTabFeedResponse build() {
            return new GetTabFeedResponse(this.f45774a, this.f45775b, this.f45776c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18394a newBuilder() {
        C18394a aVar = new C18394a();
        aVar.f45774a = this.next_page_token;
        aVar.f45775b = Internal.copyOf("entry_list", this.entry_list);
        aVar.f45776c = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetTabFeedResponse");
        StringBuilder sb = new StringBuilder();
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        if (!this.entry_list.isEmpty()) {
            sb.append(", entry_list=");
            sb.append(this.entry_list);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTabFeedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTabFeedResponse(String str, List<FeedEntry> list, Entities entities2) {
        this(str, list, entities2, ByteString.EMPTY);
    }

    public GetTabFeedResponse(String str, List<FeedEntry> list, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_page_token = str;
        this.entry_list = Internal.immutableCopyOf("entry_list", list);
        this.entities = entities2;
    }
}
