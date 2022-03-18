package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.MergeFowardMessageType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MergeForwardMessagesRequest extends Message<MergeForwardMessagesRequest, C17811a> {
    public static final ProtoAdapter<MergeForwardMessagesRequest> ADAPTER = new C17812b();
    public static final Boolean DEFAULT_LIMITED = false;
    public static final Boolean DEFAULT_NEED_COPY_REACTION = false;
    public static final Boolean DEFAULT_NEED_QUASI_MESSAGE = true;
    public static final MergeFowardMessageType DEFAULT_TYPE = MergeFowardMessageType.MERGE_MESSAGE;
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;
    public final Boolean limited;
    public final List<String> message_ids;
    public final Boolean need_copy_reaction;
    public final Boolean need_quasi_message;
    public final String origin_merge_forward_id;
    public final String quasi_title;
    public final String thread_id;
    public final List<Transmit2ThreadTarget> thread_targets;
    public final MergeFowardMessageType type;

    /* renamed from: com.bytedance.lark.pb.im.v1.MergeForwardMessagesRequest$b */
    private static final class C17812b extends ProtoAdapter<MergeForwardMessagesRequest> {
        C17812b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeForwardMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeForwardMessagesRequest mergeForwardMessagesRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mergeForwardMessagesRequest.chat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mergeForwardMessagesRequest.message_ids) + ProtoAdapter.STRING.encodedSizeWithTag(3, mergeForwardMessagesRequest.quasi_title);
            int i6 = 0;
            if (mergeForwardMessagesRequest.type != null) {
                i = MergeFowardMessageType.ADAPTER.encodedSizeWithTag(4, mergeForwardMessagesRequest.type);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (mergeForwardMessagesRequest.limited != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mergeForwardMessagesRequest.limited);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (mergeForwardMessagesRequest.thread_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, mergeForwardMessagesRequest.thread_id);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i8 + i3 + Transmit2ThreadTarget.ADAPTER.asRepeated().encodedSizeWithTag(7, mergeForwardMessagesRequest.thread_targets);
            if (mergeForwardMessagesRequest.need_quasi_message != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(8, mergeForwardMessagesRequest.need_quasi_message);
            } else {
                i4 = 0;
            }
            int i9 = encodedSizeWithTag2 + i4;
            if (mergeForwardMessagesRequest.need_copy_reaction != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(9, mergeForwardMessagesRequest.need_copy_reaction);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (mergeForwardMessagesRequest.origin_merge_forward_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(10, mergeForwardMessagesRequest.origin_merge_forward_id);
            }
            return i10 + i6 + mergeForwardMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MergeForwardMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C17811a aVar = new C17811a();
            aVar.f44856c = "";
            aVar.f44857d = MergeFowardMessageType.MERGE_MESSAGE;
            aVar.f44858e = false;
            aVar.f44859f = "";
            aVar.f44861h = true;
            aVar.f44862i = false;
            aVar.f44863j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44854a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f44855b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44856c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f44857d = MergeFowardMessageType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f44858e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44859f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44860g.add(Transmit2ThreadTarget.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f44861h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44862i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f44863j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MergeForwardMessagesRequest mergeForwardMessagesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mergeForwardMessagesRequest.chat_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mergeForwardMessagesRequest.message_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mergeForwardMessagesRequest.quasi_title);
            if (mergeForwardMessagesRequest.type != null) {
                MergeFowardMessageType.ADAPTER.encodeWithTag(protoWriter, 4, mergeForwardMessagesRequest.type);
            }
            if (mergeForwardMessagesRequest.limited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mergeForwardMessagesRequest.limited);
            }
            if (mergeForwardMessagesRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, mergeForwardMessagesRequest.thread_id);
            }
            Transmit2ThreadTarget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, mergeForwardMessagesRequest.thread_targets);
            if (mergeForwardMessagesRequest.need_quasi_message != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, mergeForwardMessagesRequest.need_quasi_message);
            }
            if (mergeForwardMessagesRequest.need_copy_reaction != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, mergeForwardMessagesRequest.need_copy_reaction);
            }
            if (mergeForwardMessagesRequest.origin_merge_forward_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, mergeForwardMessagesRequest.origin_merge_forward_id);
            }
            protoWriter.writeBytes(mergeForwardMessagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MergeForwardMessagesRequest$a */
    public static final class C17811a extends Message.Builder<MergeForwardMessagesRequest, C17811a> {

        /* renamed from: a */
        public List<String> f44854a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f44855b = Internal.newMutableList();

        /* renamed from: c */
        public String f44856c;

        /* renamed from: d */
        public MergeFowardMessageType f44857d;

        /* renamed from: e */
        public Boolean f44858e;

        /* renamed from: f */
        public String f44859f;

        /* renamed from: g */
        public List<Transmit2ThreadTarget> f44860g = Internal.newMutableList();

        /* renamed from: h */
        public Boolean f44861h;

        /* renamed from: i */
        public Boolean f44862i;

        /* renamed from: j */
        public String f44863j;

        /* renamed from: a */
        public MergeForwardMessagesRequest build() {
            String str = this.f44856c;
            if (str != null) {
                return new MergeForwardMessagesRequest(this.f44854a, this.f44855b, str, this.f44857d, this.f44858e, this.f44859f, this.f44860g, this.f44861h, this.f44862i, this.f44863j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "quasi_title");
        }

        /* renamed from: a */
        public C17811a mo62090a(MergeFowardMessageType mergeFowardMessageType) {
            this.f44857d = mergeFowardMessageType;
            return this;
        }

        /* renamed from: b */
        public C17811a mo62095b(Boolean bool) {
            this.f44862i = bool;
            return this;
        }

        /* renamed from: c */
        public C17811a mo62098c(String str) {
            this.f44863j = str;
            return this;
        }

        /* renamed from: a */
        public C17811a mo62091a(Boolean bool) {
            this.f44858e = bool;
            return this;
        }

        /* renamed from: b */
        public C17811a mo62096b(String str) {
            this.f44859f = str;
            return this;
        }

        /* renamed from: c */
        public C17811a mo62099c(List<Transmit2ThreadTarget> list) {
            Internal.checkElementsNotNull(list);
            this.f44860g = list;
            return this;
        }

        /* renamed from: a */
        public C17811a mo62092a(String str) {
            this.f44856c = str;
            return this;
        }

        /* renamed from: b */
        public C17811a mo62097b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44855b = list;
            return this;
        }

        /* renamed from: a */
        public C17811a mo62093a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44854a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17811a newBuilder() {
        C17811a aVar = new C17811a();
        aVar.f44854a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f44855b = Internal.copyOf("message_ids", this.message_ids);
        aVar.f44856c = this.quasi_title;
        aVar.f44857d = this.type;
        aVar.f44858e = this.limited;
        aVar.f44859f = this.thread_id;
        aVar.f44860g = Internal.copyOf("thread_targets", this.thread_targets);
        aVar.f44861h = this.need_quasi_message;
        aVar.f44862i = this.need_copy_reaction;
        aVar.f44863j = this.origin_merge_forward_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MergeForwardMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        sb.append(", quasi_title=");
        sb.append(this.quasi_title);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.limited != null) {
            sb.append(", limited=");
            sb.append(this.limited);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (!this.thread_targets.isEmpty()) {
            sb.append(", thread_targets=");
            sb.append(this.thread_targets);
        }
        if (this.need_quasi_message != null) {
            sb.append(", need_quasi_message=");
            sb.append(this.need_quasi_message);
        }
        if (this.need_copy_reaction != null) {
            sb.append(", need_copy_reaction=");
            sb.append(this.need_copy_reaction);
        }
        if (this.origin_merge_forward_id != null) {
            sb.append(", origin_merge_forward_id=");
            sb.append(this.origin_merge_forward_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeForwardMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MergeForwardMessagesRequest(List<String> list, List<String> list2, String str, MergeFowardMessageType mergeFowardMessageType, Boolean bool, String str2, List<Transmit2ThreadTarget> list3, Boolean bool2, Boolean bool3, String str3) {
        this(list, list2, str, mergeFowardMessageType, bool, str2, list3, bool2, bool3, str3, ByteString.EMPTY);
    }

    public MergeForwardMessagesRequest(List<String> list, List<String> list2, String str, MergeFowardMessageType mergeFowardMessageType, Boolean bool, String str2, List<Transmit2ThreadTarget> list3, Boolean bool2, Boolean bool3, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.message_ids = Internal.immutableCopyOf("message_ids", list2);
        this.quasi_title = str;
        this.type = mergeFowardMessageType;
        this.limited = bool;
        this.thread_id = str2;
        this.thread_targets = Internal.immutableCopyOf("thread_targets", list3);
        this.need_quasi_message = bool2;
        this.need_copy_reaction = bool3;
        this.origin_merge_forward_id = str3;
    }
}
