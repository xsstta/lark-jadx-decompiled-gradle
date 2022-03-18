package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class MailMultiThreadsChange extends Message<MailMultiThreadsChange, C17028a> {
    public static final ProtoAdapter<MailMultiThreadsChange> ADAPTER = new C17029b();
    public static final Boolean DEFAULT_HAS_FILTER_THREADS = false;
    public static final ThreadChangeSource DEFAULT_SOURCE = ThreadChangeSource.DEFAULT;
    private static final long serialVersionUID = 0;
    public final Boolean has_filter_threads;
    public final Map<String, AffectedThreads> label_2_threads;
    public final ThreadChangeSource source;

    public static final class AffectedThreads extends Message<AffectedThreads, C17026a> {
        public static final ProtoAdapter<AffectedThreads> ADAPTER = new C17027b();
        public static final Boolean DEFAULT_NEED_RELOAD = false;
        private static final long serialVersionUID = 0;
        public final Boolean need_reload;
        public final List<String> thread_ids;

        /* renamed from: com.bytedance.lark.pb.email.v1.MailMultiThreadsChange$AffectedThreads$b */
        private static final class C17027b extends ProtoAdapter<AffectedThreads> {
            C17027b() {
                super(FieldEncoding.LENGTH_DELIMITED, AffectedThreads.class);
            }

            /* renamed from: a */
            public int encodedSize(AffectedThreads affectedThreads) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, affectedThreads.thread_ids);
                if (affectedThreads.need_reload != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, affectedThreads.need_reload);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + affectedThreads.unknownFields().size();
            }

            /* renamed from: a */
            public AffectedThreads decode(ProtoReader protoReader) throws IOException {
                C17026a aVar = new C17026a();
                aVar.f43674b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43673a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43674b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AffectedThreads affectedThreads) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, affectedThreads.thread_ids);
                if (affectedThreads.need_reload != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, affectedThreads.need_reload);
                }
                protoWriter.writeBytes(affectedThreads.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailMultiThreadsChange$AffectedThreads$a */
        public static final class C17026a extends Message.Builder<AffectedThreads, C17026a> {

            /* renamed from: a */
            public List<String> f43673a = Internal.newMutableList();

            /* renamed from: b */
            public Boolean f43674b;

            /* renamed from: a */
            public AffectedThreads build() {
                return new AffectedThreads(this.f43673a, this.f43674b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17026a newBuilder() {
            C17026a aVar = new C17026a();
            aVar.f43673a = Internal.copyOf("thread_ids", this.thread_ids);
            aVar.f43674b = this.need_reload;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "AffectedThreads");
            StringBuilder sb = new StringBuilder();
            if (!this.thread_ids.isEmpty()) {
                sb.append(", thread_ids=");
                sb.append(this.thread_ids);
            }
            if (this.need_reload != null) {
                sb.append(", need_reload=");
                sb.append(this.need_reload);
            }
            StringBuilder replace = sb.replace(0, 2, "AffectedThreads{");
            replace.append('}');
            return replace.toString();
        }

        public AffectedThreads(List<String> list, Boolean bool) {
            this(list, bool, ByteString.EMPTY);
        }

        public AffectedThreads(List<String> list, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
            this.need_reload = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailMultiThreadsChange$a */
    public static final class C17028a extends Message.Builder<MailMultiThreadsChange, C17028a> {

        /* renamed from: a */
        public Map<String, AffectedThreads> f43675a = Internal.newMutableMap();

        /* renamed from: b */
        public ThreadChangeSource f43676b;

        /* renamed from: c */
        public Boolean f43677c;

        /* renamed from: a */
        public MailMultiThreadsChange build() {
            return new MailMultiThreadsChange(this.f43675a, this.f43676b, this.f43677c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailMultiThreadsChange$b */
    private static final class C17029b extends ProtoAdapter<MailMultiThreadsChange> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, AffectedThreads>> f43678a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, AffectedThreads.ADAPTER);

        C17029b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMultiThreadsChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMultiThreadsChange mailMultiThreadsChange) {
            int i;
            int encodedSizeWithTag = this.f43678a.encodedSizeWithTag(1, mailMultiThreadsChange.label_2_threads);
            int i2 = 0;
            if (mailMultiThreadsChange.source != null) {
                i = ThreadChangeSource.ADAPTER.encodedSizeWithTag(2, mailMultiThreadsChange.source);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailMultiThreadsChange.has_filter_threads != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailMultiThreadsChange.has_filter_threads);
            }
            return i3 + i2 + mailMultiThreadsChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailMultiThreadsChange decode(ProtoReader protoReader) throws IOException {
            C17028a aVar = new C17028a();
            aVar.f43676b = ThreadChangeSource.DEFAULT;
            aVar.f43677c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43675a.putAll(this.f43678a.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f43676b = ThreadChangeSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43677c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMultiThreadsChange mailMultiThreadsChange) throws IOException {
            this.f43678a.encodeWithTag(protoWriter, 1, mailMultiThreadsChange.label_2_threads);
            if (mailMultiThreadsChange.source != null) {
                ThreadChangeSource.ADAPTER.encodeWithTag(protoWriter, 2, mailMultiThreadsChange.source);
            }
            if (mailMultiThreadsChange.has_filter_threads != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailMultiThreadsChange.has_filter_threads);
            }
            protoWriter.writeBytes(mailMultiThreadsChange.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17028a newBuilder() {
        C17028a aVar = new C17028a();
        aVar.f43675a = Internal.copyOf("label_2_threads", this.label_2_threads);
        aVar.f43676b = this.source;
        aVar.f43677c = this.has_filter_threads;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMultiThreadsChange");
        StringBuilder sb = new StringBuilder();
        if (!this.label_2_threads.isEmpty()) {
            sb.append(", label_2_threads=");
            sb.append(this.label_2_threads);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.has_filter_threads != null) {
            sb.append(", has_filter_threads=");
            sb.append(this.has_filter_threads);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMultiThreadsChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailMultiThreadsChange(Map<String, AffectedThreads> map, ThreadChangeSource threadChangeSource, Boolean bool) {
        this(map, threadChangeSource, bool, ByteString.EMPTY);
    }

    public MailMultiThreadsChange(Map<String, AffectedThreads> map, ThreadChangeSource threadChangeSource, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_2_threads = Internal.immutableCopyOf("label_2_threads", map);
        this.source = threadChangeSource;
        this.has_filter_threads = bool;
    }
}
