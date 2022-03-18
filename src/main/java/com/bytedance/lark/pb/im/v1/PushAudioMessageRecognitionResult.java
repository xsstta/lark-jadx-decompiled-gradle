package com.bytedance.lark.pb.im.v1;

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

public final class PushAudioMessageRecognitionResult extends Message<PushAudioMessageRecognitionResult, C17867a> {
    public static final ProtoAdapter<PushAudioMessageRecognitionResult> ADAPTER = new C17868b();
    public static final Boolean DEFAULT_IS_END = false;
    public static final Integer DEFAULT_SEQ_ID = 0;
    private static final long serialVersionUID = 0;
    public final List<Integer> diff_index_slice;
    public final Boolean is_end;
    public final String message_id;
    public final String result;
    public final Integer seq_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushAudioMessageRecognitionResult$b */
    private static final class C17868b extends ProtoAdapter<PushAudioMessageRecognitionResult> {
        C17868b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAudioMessageRecognitionResult.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAudioMessageRecognitionResult pushAudioMessageRecognitionResult) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushAudioMessageRecognitionResult.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushAudioMessageRecognitionResult.message_id);
            } else {
                i = 0;
            }
            if (pushAudioMessageRecognitionResult.seq_id != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pushAudioMessageRecognitionResult.seq_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pushAudioMessageRecognitionResult.result != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushAudioMessageRecognitionResult.result);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pushAudioMessageRecognitionResult.is_end != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pushAudioMessageRecognitionResult.is_end);
            }
            return i6 + i4 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(5, pushAudioMessageRecognitionResult.diff_index_slice) + pushAudioMessageRecognitionResult.unknownFields().size();
        }

        /* renamed from: a */
        public PushAudioMessageRecognitionResult decode(ProtoReader protoReader) throws IOException {
            C17867a aVar = new C17867a();
            aVar.f44936a = "";
            aVar.f44937b = 0;
            aVar.f44938c = "";
            aVar.f44939d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44936a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44937b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44938c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44939d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44940e.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAudioMessageRecognitionResult pushAudioMessageRecognitionResult) throws IOException {
            if (pushAudioMessageRecognitionResult.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushAudioMessageRecognitionResult.message_id);
            }
            if (pushAudioMessageRecognitionResult.seq_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushAudioMessageRecognitionResult.seq_id);
            }
            if (pushAudioMessageRecognitionResult.result != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushAudioMessageRecognitionResult.result);
            }
            if (pushAudioMessageRecognitionResult.is_end != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pushAudioMessageRecognitionResult.is_end);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 5, pushAudioMessageRecognitionResult.diff_index_slice);
            protoWriter.writeBytes(pushAudioMessageRecognitionResult.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushAudioMessageRecognitionResult$a */
    public static final class C17867a extends Message.Builder<PushAudioMessageRecognitionResult, C17867a> {

        /* renamed from: a */
        public String f44936a;

        /* renamed from: b */
        public Integer f44937b;

        /* renamed from: c */
        public String f44938c;

        /* renamed from: d */
        public Boolean f44939d;

        /* renamed from: e */
        public List<Integer> f44940e = Internal.newMutableList();

        /* renamed from: a */
        public PushAudioMessageRecognitionResult build() {
            return new PushAudioMessageRecognitionResult(this.f44936a, this.f44937b, this.f44938c, this.f44939d, this.f44940e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17867a newBuilder() {
        C17867a aVar = new C17867a();
        aVar.f44936a = this.message_id;
        aVar.f44937b = this.seq_id;
        aVar.f44938c = this.result;
        aVar.f44939d = this.is_end;
        aVar.f44940e = Internal.copyOf("diff_index_slice", this.diff_index_slice);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushAudioMessageRecognitionResult");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        if (this.result != null) {
            sb.append(", result=");
            sb.append(this.result);
        }
        if (this.is_end != null) {
            sb.append(", is_end=");
            sb.append(this.is_end);
        }
        if (!this.diff_index_slice.isEmpty()) {
            sb.append(", diff_index_slice=");
            sb.append(this.diff_index_slice);
        }
        StringBuilder replace = sb.replace(0, 2, "PushAudioMessageRecognitionResult{");
        replace.append('}');
        return replace.toString();
    }

    public PushAudioMessageRecognitionResult(String str, Integer num, String str2, Boolean bool, List<Integer> list) {
        this(str, num, str2, bool, list, ByteString.EMPTY);
    }

    public PushAudioMessageRecognitionResult(String str, Integer num, String str2, Boolean bool, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.seq_id = num;
        this.result = str2;
        this.is_end = bool;
        this.diff_index_slice = Internal.immutableCopyOf("diff_index_slice", list);
    }
}
