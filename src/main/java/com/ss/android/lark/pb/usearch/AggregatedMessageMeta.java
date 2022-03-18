package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AggregatedMessageMeta extends Message<AggregatedMessageMeta, C50180a> {
    public static final ProtoAdapter<AggregatedMessageMeta> ADAPTER = new C50181b();
    public static final Integer DEFAULT_ALL_NUMBER = 0;
    public static final Boolean DEFAULT_IS_FOLD = false;
    public static final Boolean DEFAULT_IS_P2P_CHAT = false;
    private static final long serialVersionUID = 0;
    public final Integer mall_number;
    public final String mchatter_id;
    public final String mid;
    public final Boolean mis_fold;
    public final Boolean mis_p2p_chat;
    public final List<SearchResult> mmessages;

    /* renamed from: com.ss.android.lark.pb.usearch.AggregatedMessageMeta$b */
    private static final class C50181b extends ProtoAdapter<AggregatedMessageMeta> {
        C50181b() {
            super(FieldEncoding.LENGTH_DELIMITED, AggregatedMessageMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(AggregatedMessageMeta aggregatedMessageMeta) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, aggregatedMessageMeta.mid);
            int i4 = 0;
            if (aggregatedMessageMeta.mall_number != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, aggregatedMessageMeta.mall_number);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(3, aggregatedMessageMeta.mmessages);
            if (aggregatedMessageMeta.mchatter_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, aggregatedMessageMeta.mchatter_id);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag2 + i2;
            if (aggregatedMessageMeta.mis_p2p_chat != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, aggregatedMessageMeta.mis_p2p_chat);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (aggregatedMessageMeta.mis_fold != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, aggregatedMessageMeta.mis_fold);
            }
            return i6 + i4 + aggregatedMessageMeta.unknownFields().size();
        }

        /* renamed from: a */
        public AggregatedMessageMeta decode(ProtoReader protoReader) throws IOException {
            C50180a aVar = new C50180a();
            aVar.f125375a = "";
            aVar.f125376b = 0;
            aVar.f125378d = "";
            aVar.f125379e = false;
            aVar.f125380f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125375a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125376b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125377c.add(SearchResult.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f125378d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125379e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125380f = ProtoAdapter.BOOL.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, aggregatedMessageMeta.mid);
            if (aggregatedMessageMeta.mall_number != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, aggregatedMessageMeta.mall_number);
            }
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, aggregatedMessageMeta.mmessages);
            if (aggregatedMessageMeta.mchatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, aggregatedMessageMeta.mchatter_id);
            }
            if (aggregatedMessageMeta.mis_p2p_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, aggregatedMessageMeta.mis_p2p_chat);
            }
            if (aggregatedMessageMeta.mis_fold != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, aggregatedMessageMeta.mis_fold);
            }
            protoWriter.writeBytes(aggregatedMessageMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.AggregatedMessageMeta$a */
    public static final class C50180a extends Message.Builder<AggregatedMessageMeta, C50180a> {

        /* renamed from: a */
        public String f125375a;

        /* renamed from: b */
        public Integer f125376b;

        /* renamed from: c */
        public List<SearchResult> f125377c = Internal.newMutableList();

        /* renamed from: d */
        public String f125378d;

        /* renamed from: e */
        public Boolean f125379e;

        /* renamed from: f */
        public Boolean f125380f;

        /* renamed from: a */
        public AggregatedMessageMeta build() {
            String str = this.f125375a;
            if (str != null) {
                return new AggregatedMessageMeta(str, this.f125376b, this.f125377c, this.f125378d, this.f125379e, this.f125380f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50180a newBuilder() {
        C50180a aVar = new C50180a();
        aVar.f125375a = this.mid;
        aVar.f125376b = this.mall_number;
        aVar.f125377c = Internal.copyOf("mmessages", this.mmessages);
        aVar.f125378d = this.mchatter_id;
        aVar.f125379e = this.mis_p2p_chat;
        aVar.f125380f = this.mis_fold;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mall_number != null) {
            sb.append(", all_number=");
            sb.append(this.mall_number);
        }
        if (!this.mmessages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.mmessages);
        }
        if (this.mchatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.mchatter_id);
        }
        if (this.mis_p2p_chat != null) {
            sb.append(", is_p2p_chat=");
            sb.append(this.mis_p2p_chat);
        }
        if (this.mis_fold != null) {
            sb.append(", is_fold=");
            sb.append(this.mis_fold);
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
        this.mid = str;
        this.mall_number = num;
        this.mmessages = Internal.immutableCopyOf("mmessages", list);
        this.mchatter_id = str2;
        this.mis_p2p_chat = bool;
        this.mis_fold = bool2;
    }
}
