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

public final class AddSubscribeRecentListReq extends Message<AddSubscribeRecentListReq, C19297a> {
    public static final ProtoAdapter<AddSubscribeRecentListReq> ADAPTER = new C19298b();
    private static final long serialVersionUID = 0;
    public final String auth_extra;
    public final Context context;
    public final List<RecentListSubscItem> subsc_item;
    public final String subsc_sign;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.AddSubscribeRecentListReq$b */
    private static final class C19298b extends ProtoAdapter<AddSubscribeRecentListReq> {
        C19298b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddSubscribeRecentListReq.class);
        }

        /* renamed from: a */
        public int encodedSize(AddSubscribeRecentListReq addSubscribeRecentListReq) {
            int i;
            int encodedSizeWithTag = Context.ADAPTER.encodedSizeWithTag(1, addSubscribeRecentListReq.context) + ProtoAdapter.STRING.encodedSizeWithTag(2, addSubscribeRecentListReq.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, addSubscribeRecentListReq.subsc_sign) + RecentListSubscItem.ADAPTER.asRepeated().encodedSizeWithTag(4, addSubscribeRecentListReq.subsc_item);
            if (addSubscribeRecentListReq.auth_extra != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, addSubscribeRecentListReq.auth_extra);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + addSubscribeRecentListReq.unknownFields().size();
        }

        /* renamed from: a */
        public AddSubscribeRecentListReq decode(ProtoReader protoReader) throws IOException {
            C19297a aVar = new C19297a();
            aVar.f47486b = "";
            aVar.f47487c = "";
            aVar.f47489e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47485a = Context.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47486b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47487c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f47488d.add(RecentListSubscItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47489e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AddSubscribeRecentListReq addSubscribeRecentListReq) throws IOException {
            Context.ADAPTER.encodeWithTag(protoWriter, 1, addSubscribeRecentListReq.context);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, addSubscribeRecentListReq.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, addSubscribeRecentListReq.subsc_sign);
            RecentListSubscItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, addSubscribeRecentListReq.subsc_item);
            if (addSubscribeRecentListReq.auth_extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, addSubscribeRecentListReq.auth_extra);
            }
            protoWriter.writeBytes(addSubscribeRecentListReq.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.AddSubscribeRecentListReq$a */
    public static final class C19297a extends Message.Builder<AddSubscribeRecentListReq, C19297a> {

        /* renamed from: a */
        public Context f47485a;

        /* renamed from: b */
        public String f47486b;

        /* renamed from: c */
        public String f47487c;

        /* renamed from: d */
        public List<RecentListSubscItem> f47488d = Internal.newMutableList();

        /* renamed from: e */
        public String f47489e;

        /* renamed from: a */
        public AddSubscribeRecentListReq build() {
            String str;
            String str2;
            Context context = this.f47485a;
            if (context != null && (str = this.f47486b) != null && (str2 = this.f47487c) != null) {
                return new AddSubscribeRecentListReq(context, str, str2, this.f47488d, this.f47489e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(context, "context", this.f47486b, "user_id", this.f47487c, "subsc_sign");
        }
    }

    @Override // com.squareup.wire.Message
    public C19297a newBuilder() {
        C19297a aVar = new C19297a();
        aVar.f47485a = this.context;
        aVar.f47486b = this.user_id;
        aVar.f47487c = this.subsc_sign;
        aVar.f47488d = Internal.copyOf("subsc_item", this.subsc_item);
        aVar.f47489e = this.auth_extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "AddSubscribeRecentListReq");
        StringBuilder sb = new StringBuilder();
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", subsc_sign=");
        sb.append(this.subsc_sign);
        if (!this.subsc_item.isEmpty()) {
            sb.append(", subsc_item=");
            sb.append(this.subsc_item);
        }
        if (this.auth_extra != null) {
            sb.append(", auth_extra=");
            sb.append(this.auth_extra);
        }
        StringBuilder replace = sb.replace(0, 2, "AddSubscribeRecentListReq{");
        replace.append('}');
        return replace.toString();
    }

    public AddSubscribeRecentListReq(Context context2, String str, String str2, List<RecentListSubscItem> list, String str3) {
        this(context2, str, str2, list, str3, ByteString.EMPTY);
    }

    public AddSubscribeRecentListReq(Context context2, String str, String str2, List<RecentListSubscItem> list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.context = context2;
        this.user_id = str;
        this.subsc_sign = str2;
        this.subsc_item = Internal.immutableCopyOf("subsc_item", list);
        this.auth_extra = str3;
    }
}
