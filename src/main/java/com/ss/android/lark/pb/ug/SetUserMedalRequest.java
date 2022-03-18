package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetUserMedalRequest extends Message<SetUserMedalRequest, C50104a> {
    public static final ProtoAdapter<SetUserMedalRequest> ADAPTER = new C50105b();
    private static final long serialVersionUID = 0;
    public final Action maction;
    public final String mgrant_id;
    public final String mmedal_id;
    public final String muser_id;

    public enum Action implements WireEnum {
        TAKE(1),
        TAKEOFF(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 1) {
                return TAKE;
            }
            if (i != 2) {
                return null;
            }
            return TAKEOFF;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.SetUserMedalRequest$b */
    private static final class C50105b extends ProtoAdapter<SetUserMedalRequest> {
        C50105b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserMedalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserMedalRequest setUserMedalRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, setUserMedalRequest.muser_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, setUserMedalRequest.mmedal_id) + Action.ADAPTER.encodedSizeWithTag(3, setUserMedalRequest.maction);
            if (setUserMedalRequest.mgrant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, setUserMedalRequest.mgrant_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setUserMedalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserMedalRequest decode(ProtoReader protoReader) throws IOException {
            C50104a aVar = new C50104a();
            aVar.f125236a = "";
            aVar.f125237b = "";
            aVar.f125239d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125236a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125237b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f125238c = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125239d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetUserMedalRequest setUserMedalRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setUserMedalRequest.muser_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setUserMedalRequest.mmedal_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 3, setUserMedalRequest.maction);
            if (setUserMedalRequest.mgrant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setUserMedalRequest.mgrant_id);
            }
            protoWriter.writeBytes(setUserMedalRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50104a newBuilder() {
        C50104a aVar = new C50104a();
        aVar.f125236a = this.muser_id;
        aVar.f125237b = this.mmedal_id;
        aVar.f125238c = this.maction;
        aVar.f125239d = this.mgrant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ug.SetUserMedalRequest$a */
    public static final class C50104a extends Message.Builder<SetUserMedalRequest, C50104a> {

        /* renamed from: a */
        public String f125236a;

        /* renamed from: b */
        public String f125237b;

        /* renamed from: c */
        public Action f125238c;

        /* renamed from: d */
        public String f125239d;

        /* renamed from: a */
        public SetUserMedalRequest build() {
            String str;
            Action action;
            String str2 = this.f125236a;
            if (str2 != null && (str = this.f125237b) != null && (action = this.f125238c) != null) {
                return new SetUserMedalRequest(str2, str, action, this.f125239d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "muser_id", this.f125237b, "mmedal_id", this.f125238c, "maction");
        }

        /* renamed from: a */
        public C50104a mo174024a(Action action) {
            this.f125238c = action;
            return this;
        }

        /* renamed from: b */
        public C50104a mo174027b(String str) {
            this.f125237b = str;
            return this;
        }

        /* renamed from: c */
        public C50104a mo174028c(String str) {
            this.f125239d = str;
            return this;
        }

        /* renamed from: a */
        public C50104a mo174025a(String str) {
            this.f125236a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        sb.append(", medal_id=");
        sb.append(this.mmedal_id);
        sb.append(", action=");
        sb.append(this.maction);
        if (this.mgrant_id != null) {
            sb.append(", grant_id=");
            sb.append(this.mgrant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SetUserMedalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserMedalRequest(String str, String str2, Action action, String str3) {
        this(str, str2, action, str3, ByteString.EMPTY);
    }

    public SetUserMedalRequest(String str, String str2, Action action, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
        this.mmedal_id = str2;
        this.maction = action;
        this.mgrant_id = str3;
    }
}
