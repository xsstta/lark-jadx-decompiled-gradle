package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetTopicGroupsRequest extends Message<GetTopicGroupsRequest, C17717a> {
    public static final ProtoAdapter<GetTopicGroupsRequest> ADAPTER = new C17718b();
    public static final Boolean DEFAULT_NEED_SYNC_UNSUBSCRIBE_GROUPS = true;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    public static final Boolean DEFAULT_SYNC_DATA = false;
    private static final long serialVersionUID = 0;
    public final List<String> group_ids;
    public final Boolean need_sync_unsubscribe_groups;
    public final SyncDataStrategy strategy;
    public final Boolean sync_data;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsRequest$b */
    private static final class C17718b extends ProtoAdapter<GetTopicGroupsRequest> {
        C17718b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTopicGroupsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTopicGroupsRequest getTopicGroupsRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getTopicGroupsRequest.group_ids);
            int i3 = 0;
            if (getTopicGroupsRequest.sync_data != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getTopicGroupsRequest.sync_data);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getTopicGroupsRequest.strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, getTopicGroupsRequest.strategy);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getTopicGroupsRequest.need_sync_unsubscribe_groups != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getTopicGroupsRequest.need_sync_unsubscribe_groups);
            }
            return i5 + i3 + getTopicGroupsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTopicGroupsRequest decode(ProtoReader protoReader) throws IOException {
            C17717a aVar = new C17717a();
            aVar.f44747b = false;
            aVar.f44748c = SyncDataStrategy.TRY_LOCAL;
            aVar.f44749d = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44746a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44747b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f44748c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44749d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTopicGroupsRequest getTopicGroupsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getTopicGroupsRequest.group_ids);
            if (getTopicGroupsRequest.sync_data != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getTopicGroupsRequest.sync_data);
            }
            if (getTopicGroupsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getTopicGroupsRequest.strategy);
            }
            if (getTopicGroupsRequest.need_sync_unsubscribe_groups != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getTopicGroupsRequest.need_sync_unsubscribe_groups);
            }
            protoWriter.writeBytes(getTopicGroupsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsRequest$a */
    public static final class C17717a extends Message.Builder<GetTopicGroupsRequest, C17717a> {

        /* renamed from: a */
        public List<String> f44746a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44747b;

        /* renamed from: c */
        public SyncDataStrategy f44748c;

        /* renamed from: d */
        public Boolean f44749d;

        /* renamed from: a */
        public GetTopicGroupsRequest build() {
            return new GetTopicGroupsRequest(this.f44746a, this.f44747b, this.f44748c, this.f44749d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17717a mo61866a(Boolean bool) {
            this.f44747b = bool;
            return this;
        }

        /* renamed from: b */
        public C17717a mo61869b(Boolean bool) {
            this.f44749d = bool;
            return this;
        }

        /* renamed from: a */
        public C17717a mo61867a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44746a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17717a newBuilder() {
        C17717a aVar = new C17717a();
        aVar.f44746a = Internal.copyOf("group_ids", this.group_ids);
        aVar.f44747b = this.sync_data;
        aVar.f44748c = this.strategy;
        aVar.f44749d = this.need_sync_unsubscribe_groups;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTopicGroupsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.group_ids.isEmpty()) {
            sb.append(", group_ids=");
            sb.append(this.group_ids);
        }
        if (this.sync_data != null) {
            sb.append(", sync_data=");
            sb.append(this.sync_data);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.need_sync_unsubscribe_groups != null) {
            sb.append(", need_sync_unsubscribe_groups=");
            sb.append(this.need_sync_unsubscribe_groups);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTopicGroupsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTopicGroupsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, Boolean bool2) {
        this(list, bool, syncDataStrategy, bool2, ByteString.EMPTY);
    }

    public GetTopicGroupsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_ids = Internal.immutableCopyOf("group_ids", list);
        this.sync_data = bool;
        this.strategy = syncDataStrategy;
        this.need_sync_unsubscribe_groups = bool2;
    }
}
