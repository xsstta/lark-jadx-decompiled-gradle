package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CancelSubscribeRecentListReq extends Message<CancelSubscribeRecentListReq, C19319a> {
    public static final ProtoAdapter<CancelSubscribeRecentListReq> ADAPTER = new C19320b();
    private static final long serialVersionUID = 0;
    public final Context context;
    public final String subsc_sign;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelSubscribeRecentListReq$b */
    private static final class C19320b extends ProtoAdapter<CancelSubscribeRecentListReq> {
        C19320b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelSubscribeRecentListReq.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelSubscribeRecentListReq cancelSubscribeRecentListReq) {
            return Context.ADAPTER.encodedSizeWithTag(1, cancelSubscribeRecentListReq.context) + ProtoAdapter.STRING.encodedSizeWithTag(2, cancelSubscribeRecentListReq.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, cancelSubscribeRecentListReq.subsc_sign) + cancelSubscribeRecentListReq.unknownFields().size();
        }

        /* renamed from: a */
        public CancelSubscribeRecentListReq decode(ProtoReader protoReader) throws IOException {
            C19319a aVar = new C19319a();
            aVar.f47512b = "";
            aVar.f47513c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47511a = Context.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47512b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47513c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelSubscribeRecentListReq cancelSubscribeRecentListReq) throws IOException {
            Context.ADAPTER.encodeWithTag(protoWriter, 1, cancelSubscribeRecentListReq.context);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cancelSubscribeRecentListReq.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cancelSubscribeRecentListReq.subsc_sign);
            protoWriter.writeBytes(cancelSubscribeRecentListReq.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19319a newBuilder() {
        C19319a aVar = new C19319a();
        aVar.f47511a = this.context;
        aVar.f47512b = this.user_id;
        aVar.f47513c = this.subsc_sign;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelSubscribeRecentListReq$a */
    public static final class C19319a extends Message.Builder<CancelSubscribeRecentListReq, C19319a> {

        /* renamed from: a */
        public Context f47511a;

        /* renamed from: b */
        public String f47512b;

        /* renamed from: c */
        public String f47513c;

        /* renamed from: a */
        public CancelSubscribeRecentListReq build() {
            String str;
            String str2;
            Context context = this.f47511a;
            if (context != null && (str = this.f47512b) != null && (str2 = this.f47513c) != null) {
                return new CancelSubscribeRecentListReq(context, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(context, "context", this.f47512b, "user_id", this.f47513c, "subsc_sign");
        }

        /* renamed from: a */
        public C19319a mo65849a(Context context) {
            this.f47511a = context;
            return this;
        }

        /* renamed from: b */
        public C19319a mo65852b(String str) {
            this.f47513c = str;
            return this;
        }

        /* renamed from: a */
        public C19319a mo65850a(String str) {
            this.f47512b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelSubscribeRecentListReq");
        StringBuilder sb = new StringBuilder();
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", subsc_sign=");
        sb.append(this.subsc_sign);
        StringBuilder replace = sb.replace(0, 2, "CancelSubscribeRecentListReq{");
        replace.append('}');
        return replace.toString();
    }

    public CancelSubscribeRecentListReq(Context context2, String str, String str2) {
        this(context2, str, str2, ByteString.EMPTY);
    }

    public CancelSubscribeRecentListReq(Context context2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.context = context2;
        this.user_id = str;
        this.subsc_sign = str2;
    }
}
