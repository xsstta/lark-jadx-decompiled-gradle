package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FilterStatus extends Message<FilterStatus, C16616a> {
    public static final ProtoAdapter<FilterStatus> ADAPTER = new C16617b();
    public static final Boolean DEFAULT_IS_ARCHIVED = false;
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Boolean DEFAULT_IS_SPAM = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_archived;
    public final Boolean is_deleted;
    public final Boolean is_spam;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.FilterStatus$b */
    private static final class C16617b extends ProtoAdapter<FilterStatus> {
        C16617b() {
            super(FieldEncoding.LENGTH_DELIMITED, FilterStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(FilterStatus filterStatus) {
            int i;
            int i2;
            int i3 = 0;
            if (filterStatus.is_spam != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, filterStatus.is_spam);
            } else {
                i = 0;
            }
            if (filterStatus.is_archived != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, filterStatus.is_archived);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (filterStatus.is_deleted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, filterStatus.is_deleted);
            }
            return i4 + i3 + filterStatus.unknownFields().size();
        }

        /* renamed from: a */
        public FilterStatus decode(ProtoReader protoReader) throws IOException {
            C16616a aVar = new C16616a();
            aVar.f43030a = false;
            aVar.f43031b = false;
            aVar.f43032c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43030a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43031b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43032c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FilterStatus filterStatus) throws IOException {
            if (filterStatus.is_spam != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, filterStatus.is_spam);
            }
            if (filterStatus.is_archived != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, filterStatus.is_archived);
            }
            if (filterStatus.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, filterStatus.is_deleted);
            }
            protoWriter.writeBytes(filterStatus.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.FilterStatus$a */
    public static final class C16616a extends Message.Builder<FilterStatus, C16616a> {

        /* renamed from: a */
        public Boolean f43030a;

        /* renamed from: b */
        public Boolean f43031b;

        /* renamed from: c */
        public Boolean f43032c;

        /* renamed from: a */
        public FilterStatus build() {
            return new FilterStatus(this.f43030a, this.f43031b, this.f43032c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16616a newBuilder() {
        C16616a aVar = new C16616a();
        aVar.f43030a = this.is_spam;
        aVar.f43031b = this.is_archived;
        aVar.f43032c = this.is_deleted;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "FilterStatus");
        StringBuilder sb = new StringBuilder();
        if (this.is_spam != null) {
            sb.append(", is_spam=");
            sb.append(this.is_spam);
        }
        if (this.is_archived != null) {
            sb.append(", is_archived=");
            sb.append(this.is_archived);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        StringBuilder replace = sb.replace(0, 2, "FilterStatus{");
        replace.append('}');
        return replace.toString();
    }

    public FilterStatus(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public FilterStatus(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_spam = bool;
        this.is_archived = bool2;
        this.is_deleted = bool3;
    }
}
