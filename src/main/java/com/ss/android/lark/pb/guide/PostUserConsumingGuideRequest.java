package com.ss.android.lark.pb.guide;

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

public final class PostUserConsumingGuideRequest extends Message<PostUserConsumingGuideRequest, C49784a> {
    public static final ProtoAdapter<PostUserConsumingGuideRequest> ADAPTER = new C49785b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> mcontext;
    public final Map<String, Integer> mkey_step;
    public final List<String> mkeys;
    public final List<String> mkeys_done;

    /* renamed from: com.ss.android.lark.pb.guide.PostUserConsumingGuideRequest$a */
    public static final class C49784a extends Message.Builder<PostUserConsumingGuideRequest, C49784a> {

        /* renamed from: a */
        public List<String> f124714a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, Integer> f124715b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, String> f124716c = Internal.newMutableMap();

        /* renamed from: d */
        public List<String> f124717d = Internal.newMutableList();

        /* renamed from: a */
        public PostUserConsumingGuideRequest build() {
            return new PostUserConsumingGuideRequest(this.f124714a, this.f124715b, this.f124716c, this.f124717d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49784a mo173308a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124714a = list;
            return this;
        }

        /* renamed from: b */
        public C49784a mo173310b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124717d = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.PostUserConsumingGuideRequest$b */
    private static final class C49785b extends ProtoAdapter<PostUserConsumingGuideRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f124718a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f124719b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49785b() {
            super(FieldEncoding.LENGTH_DELIMITED, PostUserConsumingGuideRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PostUserConsumingGuideRequest postUserConsumingGuideRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, postUserConsumingGuideRequest.mkeys) + this.f124718a.encodedSizeWithTag(2, postUserConsumingGuideRequest.mkey_step) + this.f124719b.encodedSizeWithTag(3, postUserConsumingGuideRequest.mcontext) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, postUserConsumingGuideRequest.mkeys_done) + postUserConsumingGuideRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PostUserConsumingGuideRequest decode(ProtoReader protoReader) throws IOException {
            C49784a aVar = new C49784a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124714a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f124715b.putAll(this.f124718a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f124716c.putAll(this.f124719b.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124717d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PostUserConsumingGuideRequest postUserConsumingGuideRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, postUserConsumingGuideRequest.mkeys);
            this.f124718a.encodeWithTag(protoWriter, 2, postUserConsumingGuideRequest.mkey_step);
            this.f124719b.encodeWithTag(protoWriter, 3, postUserConsumingGuideRequest.mcontext);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, postUserConsumingGuideRequest.mkeys_done);
            protoWriter.writeBytes(postUserConsumingGuideRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49784a newBuilder() {
        C49784a aVar = new C49784a();
        aVar.f124714a = Internal.copyOf("mkeys", this.mkeys);
        aVar.f124715b = Internal.copyOf("mkey_step", this.mkey_step);
        aVar.f124716c = Internal.copyOf("mcontext", this.mcontext);
        aVar.f124717d = Internal.copyOf("mkeys_done", this.mkeys_done);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mkeys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.mkeys);
        }
        if (!this.mkey_step.isEmpty()) {
            sb.append(", key_step=");
            sb.append(this.mkey_step);
        }
        if (!this.mcontext.isEmpty()) {
            sb.append(", context=");
            sb.append(this.mcontext);
        }
        if (!this.mkeys_done.isEmpty()) {
            sb.append(", keys_done=");
            sb.append(this.mkeys_done);
        }
        StringBuilder replace = sb.replace(0, 2, "PostUserConsumingGuideRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PostUserConsumingGuideRequest(List<String> list, Map<String, Integer> map, Map<String, String> map2, List<String> list2) {
        this(list, map, map2, list2, ByteString.EMPTY);
    }

    public PostUserConsumingGuideRequest(List<String> list, Map<String, Integer> map, Map<String, String> map2, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkeys = Internal.immutableCopyOf("mkeys", list);
        this.mkey_step = Internal.immutableCopyOf("mkey_step", map);
        this.mcontext = Internal.immutableCopyOf("mcontext", map2);
        this.mkeys_done = Internal.immutableCopyOf("mkeys_done", list2);
    }
}
