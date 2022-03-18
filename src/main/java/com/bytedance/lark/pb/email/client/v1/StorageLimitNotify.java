package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class StorageLimitNotify extends Message<StorageLimitNotify, C16990a> {
    public static final ProtoAdapter<StorageLimitNotify> ADAPTER = new C16991b();
    public static final Boolean DEFAULT_ENABLE = false;
    public static final Boolean DEFAULT_ISADMIN = false;
    public static final Integer DEFAULT_LIMIT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean enable;
    public final Boolean isAdmin;
    public final Integer limit;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.StorageLimitNotify$b */
    private static final class C16991b extends ProtoAdapter<StorageLimitNotify> {
        C16991b() {
            super(FieldEncoding.LENGTH_DELIMITED, StorageLimitNotify.class);
        }

        /* renamed from: a */
        public int encodedSize(StorageLimitNotify storageLimitNotify) {
            int i;
            int i2;
            int i3 = 0;
            if (storageLimitNotify.limit != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, storageLimitNotify.limit);
            } else {
                i = 0;
            }
            if (storageLimitNotify.enable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, storageLimitNotify.enable);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (storageLimitNotify.isAdmin != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, storageLimitNotify.isAdmin);
            }
            return i4 + i3 + storageLimitNotify.unknownFields().size();
        }

        /* renamed from: a */
        public StorageLimitNotify decode(ProtoReader protoReader) throws IOException {
            C16990a aVar = new C16990a();
            aVar.f43595a = 0;
            aVar.f43596b = false;
            aVar.f43597c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43595a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43596b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43597c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StorageLimitNotify storageLimitNotify) throws IOException {
            if (storageLimitNotify.limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, storageLimitNotify.limit);
            }
            if (storageLimitNotify.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, storageLimitNotify.enable);
            }
            if (storageLimitNotify.isAdmin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, storageLimitNotify.isAdmin);
            }
            protoWriter.writeBytes(storageLimitNotify.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.StorageLimitNotify$a */
    public static final class C16990a extends Message.Builder<StorageLimitNotify, C16990a> {

        /* renamed from: a */
        public Integer f43595a;

        /* renamed from: b */
        public Boolean f43596b;

        /* renamed from: c */
        public Boolean f43597c;

        /* renamed from: a */
        public StorageLimitNotify build() {
            return new StorageLimitNotify(this.f43595a, this.f43596b, this.f43597c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16990a mo60020a(Boolean bool) {
            this.f43596b = bool;
            return this;
        }

        /* renamed from: b */
        public C16990a mo60023b(Boolean bool) {
            this.f43597c = bool;
            return this;
        }

        /* renamed from: a */
        public C16990a mo60021a(Integer num) {
            this.f43595a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16990a newBuilder() {
        C16990a aVar = new C16990a();
        aVar.f43595a = this.limit;
        aVar.f43596b = this.enable;
        aVar.f43597c = this.isAdmin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "StorageLimitNotify");
        StringBuilder sb = new StringBuilder();
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.isAdmin != null) {
            sb.append(", isAdmin=");
            sb.append(this.isAdmin);
        }
        StringBuilder replace = sb.replace(0, 2, "StorageLimitNotify{");
        replace.append('}');
        return replace.toString();
    }

    public StorageLimitNotify(Integer num, Boolean bool, Boolean bool2) {
        this(num, bool, bool2, ByteString.EMPTY);
    }

    public StorageLimitNotify(Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.limit = num;
        this.enable = bool;
        this.isAdmin = bool2;
    }
}
