package ai.v1;

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

public final class GetSmartComposeResponse extends Message<GetSmartComposeResponse, C0063a> {
    public static final ProtoAdapter<GetSmartComposeResponse> ADAPTER = new C0064b();
    public static final Boolean DEFAULT_FORCE_DISPLAY = false;
    public static final Integer DEFAULT_MIN_DISPLAY_CHAR_LEN = 0;
    public static final Integer DEFAULT_VID = 0;
    private static final long serialVersionUID = 0;
    public final Boolean force_display;
    public final String hidden_state;
    public final String language;
    public final Integer min_display_char_len;
    public final List<SuggestionItem> suggestion;
    public final Integer vid;

    /* renamed from: ai.v1.GetSmartComposeResponse$b */
    private static final class C0064b extends ProtoAdapter<GetSmartComposeResponse> {
        C0064b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartComposeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartComposeResponse getSmartComposeResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getSmartComposeResponse.hidden_state != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getSmartComposeResponse.hidden_state);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + SuggestionItem.ADAPTER.asRepeated().encodedSizeWithTag(2, getSmartComposeResponse.suggestion);
            if (getSmartComposeResponse.vid != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getSmartComposeResponse.vid);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag + i2;
            if (getSmartComposeResponse.language != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getSmartComposeResponse.language);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getSmartComposeResponse.force_display != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getSmartComposeResponse.force_display);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getSmartComposeResponse.min_display_char_len != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, getSmartComposeResponse.min_display_char_len);
            }
            return i8 + i5 + getSmartComposeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartComposeResponse decode(ProtoReader protoReader) throws IOException {
            C0063a aVar = new C0063a();
            aVar.f110a = "";
            aVar.f112c = 0;
            aVar.f113d = "";
            aVar.f114e = false;
            aVar.f115f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f110a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f111b.add(SuggestionItem.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f112c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f113d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f114e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f115f = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetSmartComposeResponse getSmartComposeResponse) throws IOException {
            if (getSmartComposeResponse.hidden_state != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSmartComposeResponse.hidden_state);
            }
            SuggestionItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getSmartComposeResponse.suggestion);
            if (getSmartComposeResponse.vid != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getSmartComposeResponse.vid);
            }
            if (getSmartComposeResponse.language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getSmartComposeResponse.language);
            }
            if (getSmartComposeResponse.force_display != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getSmartComposeResponse.force_display);
            }
            if (getSmartComposeResponse.min_display_char_len != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getSmartComposeResponse.min_display_char_len);
            }
            protoWriter.writeBytes(getSmartComposeResponse.unknownFields());
        }
    }

    /* renamed from: ai.v1.GetSmartComposeResponse$a */
    public static final class C0063a extends Message.Builder<GetSmartComposeResponse, C0063a> {

        /* renamed from: a */
        public String f110a;

        /* renamed from: b */
        public List<SuggestionItem> f111b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f112c;

        /* renamed from: d */
        public String f113d;

        /* renamed from: e */
        public Boolean f114e;

        /* renamed from: f */
        public Integer f115f;

        /* renamed from: a */
        public GetSmartComposeResponse build() {
            return new GetSmartComposeResponse(this.f110a, this.f111b, this.f112c, this.f113d, this.f114e, this.f115f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0063a newBuilder() {
        C0063a aVar = new C0063a();
        aVar.f110a = this.hidden_state;
        aVar.f111b = Internal.copyOf("suggestion", this.suggestion);
        aVar.f112c = this.vid;
        aVar.f113d = this.language;
        aVar.f114e = this.force_display;
        aVar.f115f = this.min_display_char_len;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetSmartComposeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.hidden_state != null) {
            sb.append(", hidden_state=");
            sb.append(this.hidden_state);
        }
        if (!this.suggestion.isEmpty()) {
            sb.append(", suggestion=");
            sb.append(this.suggestion);
        }
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.force_display != null) {
            sb.append(", force_display=");
            sb.append(this.force_display);
        }
        if (this.min_display_char_len != null) {
            sb.append(", min_display_char_len=");
            sb.append(this.min_display_char_len);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartComposeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartComposeResponse(String str, List<SuggestionItem> list, Integer num, String str2, Boolean bool, Integer num2) {
        this(str, list, num, str2, bool, num2, ByteString.EMPTY);
    }

    public GetSmartComposeResponse(String str, List<SuggestionItem> list, Integer num, String str2, Boolean bool, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hidden_state = str;
        this.suggestion = Internal.immutableCopyOf("suggestion", list);
        this.vid = num;
        this.language = str2;
        this.force_display = bool;
        this.min_display_char_len = num2;
    }
}
