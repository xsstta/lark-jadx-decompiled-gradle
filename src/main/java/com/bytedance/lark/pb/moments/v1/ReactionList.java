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

public final class ReactionList extends Message<ReactionList, C18528a> {
    public static final ProtoAdapter<ReactionList> ADAPTER = new C18529b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Boolean DEFAULT_SELF_INVOLVED = false;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final List<String> first_page_user_ids;
    public final Boolean self_involved;
    public final String type;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ReactionList$b */
    private static final class C18529b extends ProtoAdapter<ReactionList> {
        C18529b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReactionList.class);
        }

        /* renamed from: a */
        public int encodedSize(ReactionList reactionList) {
            int i;
            int i2;
            int i3 = 0;
            if (reactionList.type != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, reactionList.type);
            } else {
                i = 0;
            }
            if (reactionList.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, reactionList.count);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, reactionList.first_page_user_ids);
            if (reactionList.self_involved != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, reactionList.self_involved);
            }
            return encodedSizeWithTag + i3 + reactionList.unknownFields().size();
        }

        /* renamed from: a */
        public ReactionList decode(ProtoReader protoReader) throws IOException {
            C18528a aVar = new C18528a();
            aVar.f46011a = "";
            aVar.f46012b = 0;
            aVar.f46014d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46011a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46012b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46013c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46014d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReactionList reactionList) throws IOException {
            if (reactionList.type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reactionList.type);
            }
            if (reactionList.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, reactionList.count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, reactionList.first_page_user_ids);
            if (reactionList.self_involved != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, reactionList.self_involved);
            }
            protoWriter.writeBytes(reactionList.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ReactionList$a */
    public static final class C18528a extends Message.Builder<ReactionList, C18528a> {

        /* renamed from: a */
        public String f46011a;

        /* renamed from: b */
        public Integer f46012b;

        /* renamed from: c */
        public List<String> f46013c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f46014d;

        /* renamed from: a */
        public ReactionList build() {
            return new ReactionList(this.f46011a, this.f46012b, this.f46013c, this.f46014d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18528a newBuilder() {
        C18528a aVar = new C18528a();
        aVar.f46011a = this.type;
        aVar.f46012b = this.count;
        aVar.f46013c = Internal.copyOf("first_page_user_ids", this.first_page_user_ids);
        aVar.f46014d = this.self_involved;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ReactionList");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (!this.first_page_user_ids.isEmpty()) {
            sb.append(", first_page_user_ids=");
            sb.append(this.first_page_user_ids);
        }
        if (this.self_involved != null) {
            sb.append(", self_involved=");
            sb.append(this.self_involved);
        }
        StringBuilder replace = sb.replace(0, 2, "ReactionList{");
        replace.append('}');
        return replace.toString();
    }

    public ReactionList(String str, Integer num, List<String> list, Boolean bool) {
        this(str, num, list, bool, ByteString.EMPTY);
    }

    public ReactionList(String str, Integer num, List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = str;
        this.count = num;
        this.first_page_user_ids = Internal.immutableCopyOf("first_page_user_ids", list);
        this.self_involved = bool;
    }
}
