package com.bytedance.lark.pb.space.drive.v1;

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

public final class SubscribeRecentListReq extends Message<SubscribeRecentListReq, C19395a> {
    public static final ProtoAdapter<SubscribeRecentListReq> ADAPTER = new C19396b();
    private static final long serialVersionUID = 0;
    public final String auth_extra;
    public final Context context;
    public final List<RecentListSubscItem> subsc_item;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.SubscribeRecentListReq$b */
    private static final class C19396b extends ProtoAdapter<SubscribeRecentListReq> {
        C19396b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeRecentListReq.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeRecentListReq subscribeRecentListReq) {
            int i;
            int encodedSizeWithTag = Context.ADAPTER.encodedSizeWithTag(1, subscribeRecentListReq.context) + ProtoAdapter.STRING.encodedSizeWithTag(2, subscribeRecentListReq.user_id) + RecentListSubscItem.ADAPTER.asRepeated().encodedSizeWithTag(3, subscribeRecentListReq.subsc_item);
            if (subscribeRecentListReq.auth_extra != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, subscribeRecentListReq.auth_extra);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + subscribeRecentListReq.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeRecentListReq decode(ProtoReader protoReader) throws IOException {
            C19395a aVar = new C19395a();
            aVar.f47692b = "";
            aVar.f47694d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47691a = Context.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47692b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47693c.add(RecentListSubscItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47694d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeRecentListReq subscribeRecentListReq) throws IOException {
            Context.ADAPTER.encodeWithTag(protoWriter, 1, subscribeRecentListReq.context);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subscribeRecentListReq.user_id);
            RecentListSubscItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, subscribeRecentListReq.subsc_item);
            if (subscribeRecentListReq.auth_extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, subscribeRecentListReq.auth_extra);
            }
            protoWriter.writeBytes(subscribeRecentListReq.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.SubscribeRecentListReq$a */
    public static final class C19395a extends Message.Builder<SubscribeRecentListReq, C19395a> {

        /* renamed from: a */
        public Context f47691a;

        /* renamed from: b */
        public String f47692b;

        /* renamed from: c */
        public List<RecentListSubscItem> f47693c = Internal.newMutableList();

        /* renamed from: d */
        public String f47694d;

        /* renamed from: a */
        public SubscribeRecentListReq build() {
            String str;
            Context context = this.f47691a;
            if (context != null && (str = this.f47692b) != null) {
                return new SubscribeRecentListReq(context, str, this.f47693c, this.f47694d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(context, "context", this.f47692b, "user_id");
        }

        /* renamed from: a */
        public C19395a mo66048a(Context context) {
            this.f47691a = context;
            return this;
        }

        /* renamed from: a */
        public C19395a mo66049a(String str) {
            this.f47692b = str;
            return this;
        }

        /* renamed from: a */
        public C19395a mo66050a(List<RecentListSubscItem> list) {
            Internal.checkElementsNotNull(list);
            this.f47693c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19395a newBuilder() {
        C19395a aVar = new C19395a();
        aVar.f47691a = this.context;
        aVar.f47692b = this.user_id;
        aVar.f47693c = Internal.copyOf("subsc_item", this.subsc_item);
        aVar.f47694d = this.auth_extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "SubscribeRecentListReq");
        StringBuilder sb = new StringBuilder();
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (!this.subsc_item.isEmpty()) {
            sb.append(", subsc_item=");
            sb.append(this.subsc_item);
        }
        if (this.auth_extra != null) {
            sb.append(", auth_extra=");
            sb.append(this.auth_extra);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeRecentListReq{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeRecentListReq(Context context2, String str, List<RecentListSubscItem> list, String str2) {
        this(context2, str, list, str2, ByteString.EMPTY);
    }

    public SubscribeRecentListReq(Context context2, String str, List<RecentListSubscItem> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.context = context2;
        this.user_id = str;
        this.subsc_item = Internal.immutableCopyOf("subsc_item", list);
        this.auth_extra = str2;
    }
}
