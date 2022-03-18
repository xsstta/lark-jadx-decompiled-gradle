package com.bytedance.lark.pb.email.client.v1;

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

public final class MailGetThreadListResponse extends Message<MailGetThreadListResponse, C16808a> {
    public static final ProtoAdapter<MailGetThreadListResponse> ADAPTER = new C16809b();
    public static final Boolean DEFAULT_IS_FROM_DB = false;
    public static final Boolean DEFAULT_IS_LAST_PAGE = false;
    public static final Integer DEFAULT_SOURCE = 0;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_db;
    public final Boolean is_last_page;
    public final Integer source;
    public final List<ThreadItem> thread_items;
    public final List<Thread> threads;

    public static final class ThreadItem extends Message<ThreadItem, C16806a> {
        public static final ProtoAdapter<ThreadItem> ADAPTER = new C16807b();
        public static final PermissionCode DEFAULT_CODE = PermissionCode.NONE;
        public static final Boolean DEFAULT_IS_EXTERNAL = false;
        private static final long serialVersionUID = 0;
        public final List<ThreadAction> actions;
        public final PermissionCode code;
        public final Boolean is_external;
        public final Thread thread;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse$ThreadItem$b */
        private static final class C16807b extends ProtoAdapter<ThreadItem> {
            C16807b() {
                super(FieldEncoding.LENGTH_DELIMITED, ThreadItem.class);
            }

            /* renamed from: a */
            public int encodedSize(ThreadItem threadItem) {
                int i;
                int i2;
                int i3 = 0;
                if (threadItem.thread != null) {
                    i = Thread.ADAPTER.encodedSizeWithTag(1, threadItem.thread);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + ThreadAction.ADAPTER.asRepeated().encodedSizeWithTag(2, threadItem.actions);
                if (threadItem.code != null) {
                    i2 = PermissionCode.ADAPTER.encodedSizeWithTag(3, threadItem.code);
                } else {
                    i2 = 0;
                }
                int i4 = encodedSizeWithTag + i2;
                if (threadItem.is_external != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, threadItem.is_external);
                }
                return i4 + i3 + threadItem.unknownFields().size();
            }

            /* renamed from: a */
            public ThreadItem decode(ProtoReader protoReader) throws IOException {
                C16806a aVar = new C16806a();
                aVar.f43273c = PermissionCode.NONE;
                aVar.f43274d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43271a = Thread.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f43272b.add(ThreadAction.ADAPTER.decode(protoReader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 3) {
                        try {
                            aVar.f43273c = PermissionCode.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43274d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ThreadItem threadItem) throws IOException {
                if (threadItem.thread != null) {
                    Thread.ADAPTER.encodeWithTag(protoWriter, 1, threadItem.thread);
                }
                ThreadAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, threadItem.actions);
                if (threadItem.code != null) {
                    PermissionCode.ADAPTER.encodeWithTag(protoWriter, 3, threadItem.code);
                }
                if (threadItem.is_external != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, threadItem.is_external);
                }
                protoWriter.writeBytes(threadItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse$ThreadItem$a */
        public static final class C16806a extends Message.Builder<ThreadItem, C16806a> {

            /* renamed from: a */
            public Thread f43271a;

            /* renamed from: b */
            public List<ThreadAction> f43272b = Internal.newMutableList();

            /* renamed from: c */
            public PermissionCode f43273c;

            /* renamed from: d */
            public Boolean f43274d;

            /* renamed from: a */
            public ThreadItem build() {
                return new ThreadItem(this.f43271a, this.f43272b, this.f43273c, this.f43274d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16806a newBuilder() {
            C16806a aVar = new C16806a();
            aVar.f43271a = this.thread;
            aVar.f43272b = Internal.copyOf("actions", this.actions);
            aVar.f43273c = this.code;
            aVar.f43274d = this.is_external;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "ThreadItem");
            StringBuilder sb = new StringBuilder();
            if (this.thread != null) {
                sb.append(", thread=");
                sb.append(this.thread);
            }
            if (!this.actions.isEmpty()) {
                sb.append(", actions=");
                sb.append(this.actions);
            }
            if (this.code != null) {
                sb.append(", code=");
                sb.append(this.code);
            }
            if (this.is_external != null) {
                sb.append(", is_external=");
                sb.append(this.is_external);
            }
            StringBuilder replace = sb.replace(0, 2, "ThreadItem{");
            replace.append('}');
            return replace.toString();
        }

        public ThreadItem(Thread thread2, List<ThreadAction> list, PermissionCode permissionCode, Boolean bool) {
            this(thread2, list, permissionCode, bool, ByteString.EMPTY);
        }

        public ThreadItem(Thread thread2, List<ThreadAction> list, PermissionCode permissionCode, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.thread = thread2;
            this.actions = Internal.immutableCopyOf("actions", list);
            this.code = permissionCode;
            this.is_external = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse$b */
    private static final class C16809b extends ProtoAdapter<MailGetThreadListResponse> {
        C16809b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetThreadListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetThreadListResponse mailGetThreadListResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = Thread.ADAPTER.asRepeated().encodedSizeWithTag(1, mailGetThreadListResponse.threads);
            int i3 = 0;
            if (mailGetThreadListResponse.is_last_page != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailGetThreadListResponse.is_last_page);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ThreadItem.ADAPTER.asRepeated().encodedSizeWithTag(3, mailGetThreadListResponse.thread_items);
            if (mailGetThreadListResponse.is_from_db != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailGetThreadListResponse.is_from_db);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag2 + i2;
            if (mailGetThreadListResponse.source != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, mailGetThreadListResponse.source);
            }
            return i4 + i3 + mailGetThreadListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetThreadListResponse decode(ProtoReader protoReader) throws IOException {
            C16808a aVar = new C16808a();
            aVar.f43276b = false;
            aVar.f43278d = false;
            aVar.f43279e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43275a.add(Thread.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43276b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43277c.add(ThreadItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f43278d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43279e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetThreadListResponse mailGetThreadListResponse) throws IOException {
            Thread.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailGetThreadListResponse.threads);
            if (mailGetThreadListResponse.is_last_page != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailGetThreadListResponse.is_last_page);
            }
            ThreadItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mailGetThreadListResponse.thread_items);
            if (mailGetThreadListResponse.is_from_db != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailGetThreadListResponse.is_from_db);
            }
            if (mailGetThreadListResponse.source != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, mailGetThreadListResponse.source);
            }
            protoWriter.writeBytes(mailGetThreadListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse$a */
    public static final class C16808a extends Message.Builder<MailGetThreadListResponse, C16808a> {

        /* renamed from: a */
        public List<Thread> f43275a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f43276b;

        /* renamed from: c */
        public List<ThreadItem> f43277c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f43278d;

        /* renamed from: e */
        public Integer f43279e;

        /* renamed from: a */
        public MailGetThreadListResponse build() {
            return new MailGetThreadListResponse(this.f43275a, this.f43276b, this.f43277c, this.f43278d, this.f43279e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16808a newBuilder() {
        C16808a aVar = new C16808a();
        aVar.f43275a = Internal.copyOf("threads", this.threads);
        aVar.f43276b = this.is_last_page;
        aVar.f43277c = Internal.copyOf("thread_items", this.thread_items);
        aVar.f43278d = this.is_from_db;
        aVar.f43279e = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetThreadListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.threads.isEmpty()) {
            sb.append(", threads=");
            sb.append(this.threads);
        }
        if (this.is_last_page != null) {
            sb.append(", is_last_page=");
            sb.append(this.is_last_page);
        }
        if (!this.thread_items.isEmpty()) {
            sb.append(", thread_items=");
            sb.append(this.thread_items);
        }
        if (this.is_from_db != null) {
            sb.append(", is_from_db=");
            sb.append(this.is_from_db);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetThreadListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetThreadListResponse(List<Thread> list, Boolean bool, List<ThreadItem> list2, Boolean bool2, Integer num) {
        this(list, bool, list2, bool2, num, ByteString.EMPTY);
    }

    public MailGetThreadListResponse(List<Thread> list, Boolean bool, List<ThreadItem> list2, Boolean bool2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threads = Internal.immutableCopyOf("threads", list);
        this.is_last_page = bool;
        this.thread_items = Internal.immutableCopyOf("thread_items", list2);
        this.is_from_db = bool2;
        this.source = num;
    }
}
