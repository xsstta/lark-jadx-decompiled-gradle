package com.bytedance.lark.pb.search.v2;

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

public final class AggregatedMessageMeta extends Message<AggregatedMessageMeta, C18939a> {
    public static final ProtoAdapter<AggregatedMessageMeta> ADAPTER = new C18940b();
    public static final Integer DEFAULT_ALL_NUMBER = 0;
    public static final Boolean DEFAULT_IS_FOLD = false;
    public static final Boolean DEFAULT_IS_P2P_CHAT = false;
    private static final long serialVersionUID = 0;
    public final Integer all_number;
    public final String chatter_id;
    public final String id;
    public final Boolean is_fold;
    public final Boolean is_p2p_chat;
    public final List<SearchResult> messages;

    /* renamed from: com.bytedance.lark.pb.search.v2.AggregatedMessageMeta$b */
    private static final class C18940b extends ProtoAdapter<AggregatedMessageMeta> {
        C18940b() {
            super(FieldEncoding.LENGTH_DELIMITED, AggregatedMessageMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(AggregatedMessageMeta aggregatedMessageMeta) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, aggregatedMessageMeta.id);
            int i4 = 0;
            if (aggregatedMessageMeta.all_number != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, aggregatedMessageMeta.all_number);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(3, aggregatedMessageMeta.messages);
            if (aggregatedMessageMeta.chatter_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, aggregatedMessageMeta.chatter_id);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag2 + i2;
            if (aggregatedMessageMeta.is_p2p_chat != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, aggregatedMessageMeta.is_p2p_chat);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (aggregatedMessageMeta.is_fold != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, aggregatedMessageMeta.is_fold);
            }
            return i6 + i4 + aggregatedMessageMeta.unknownFields().size();
        }

        /* renamed from: a */
        public AggregatedMessageMeta decode(ProtoReader protoReader) throws IOException {
            C18939a aVar = new C18939a();
            aVar.f46822a = "";
            aVar.f46823b = 0;
            aVar.f46825d = "";
            aVar.f46826e = false;
            aVar.f46827f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46822a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46823b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46824c.add(SearchResult.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f46825d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46826e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46827f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AggregatedMessageMeta aggregatedMessageMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, aggregatedMessageMeta.id);
            if (aggregatedMessageMeta.all_number != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, aggregatedMessageMeta.all_number);
            }
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, aggregatedMessageMeta.messages);
            if (aggregatedMessageMeta.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, aggregatedMessageMeta.chatter_id);
            }
            if (aggregatedMessageMeta.is_p2p_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, aggregatedMessageMeta.is_p2p_chat);
            }
            if (aggregatedMessageMeta.is_fold != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, aggregatedMessageMeta.is_fold);
            }
            protoWriter.writeBytes(aggregatedMessageMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.AggregatedMessageMeta$a */
    public static final class C18939a extends Message.Builder<AggregatedMessageMeta, C18939a> {

        /* renamed from: a */
        public String f46822a;

        /* renamed from: b */
        public Integer f46823b;

        /* renamed from: c */
        public List<SearchResult> f46824c = Internal.newMutableList();

        /* renamed from: d */
        public String f46825d;

        /* renamed from: e */
        public Boolean f46826e;

        /* renamed from: f */
        public Boolean f46827f;

        /* renamed from: a */
        public AggregatedMessageMeta build() {
            String str = this.f46822a;
            if (str != null) {
                return new AggregatedMessageMeta(str, this.f46823b, this.f46824c, this.f46825d, this.f46826e, this.f46827f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18939a newBuilder() {
        C18939a aVar = new C18939a();
        aVar.f46822a = this.id;
        aVar.f46823b = this.all_number;
        aVar.f46824c = Internal.copyOf("messages", this.messages);
        aVar.f46825d = this.chatter_id;
        aVar.f46826e = this.is_p2p_chat;
        aVar.f46827f = this.is_fold;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "AggregatedMessageMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.all_number != null) {
            sb.append(", all_number=");
            sb.append(this.all_number);
        }
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.is_p2p_chat != null) {
            sb.append(", is_p2p_chat=");
            sb.append(this.is_p2p_chat);
        }
        if (this.is_fold != null) {
            sb.append(", is_fold=");
            sb.append(this.is_fold);
        }
        StringBuilder replace = sb.replace(0, 2, "AggregatedMessageMeta{");
        replace.append('}');
        return replace.toString();
    }

    public AggregatedMessageMeta(String str, Integer num, List<SearchResult> list, String str2, Boolean bool, Boolean bool2) {
        this(str, num, list, str2, bool, bool2, ByteString.EMPTY);
    }

    public AggregatedMessageMeta(String str, Integer num, List<SearchResult> list, String str2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.all_number = num;
        this.messages = Internal.immutableCopyOf("messages", list);
        this.chatter_id = str2;
        this.is_p2p_chat = bool;
        this.is_fold = bool2;
    }
}
