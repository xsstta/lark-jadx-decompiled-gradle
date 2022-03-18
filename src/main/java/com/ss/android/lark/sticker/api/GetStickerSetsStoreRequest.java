package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetStickerSetsStoreRequest;
import com.bytedance.lark.pb.im.v1.GetStickerSetsStoreResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

public class GetStickerSetsStoreRequest {

    /* renamed from: a */
    private FilterType f136006a;

    /* renamed from: b */
    private int f136007b;

    /* renamed from: c */
    private int f136008c;

    public enum FilterType {
        UNKNOWN(0),
        ALL(1),
        FREE(2);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static FilterType valueOf(int i) {
            return forNumber(i);
        }

        public static FilterType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FREE;
            }
            if (i != 2) {
                return null;
            }
            return ALL;
        }

        private FilterType(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: com.ss.android.lark.sticker.api.GetStickerSetsStoreRequest$a */
    public static class C55051a {

        /* renamed from: a */
        FilterType f136010a = FilterType.ALL;

        /* renamed from: b */
        int f136011b = 10;

        /* renamed from: c */
        int f136012c;

        /* renamed from: a */
        public GetStickerSetsStoreRequest mo187888a() {
            return new GetStickerSetsStoreRequest(this);
        }

        /* renamed from: a */
        public C55051a mo187887a(int i) {
            this.f136011b = i;
            return this;
        }

        /* renamed from: b */
        public C55051a mo187889b(int i) {
            this.f136012c = i;
            return this;
        }

        public C55051a(FilterType filterType) {
            this.f136010a = filterType;
        }
    }

    private GetStickerSetsStoreRequest(C55051a aVar) {
        this.f136006a = FilterType.ALL;
        this.f136007b = 10;
        this.f136006a = aVar.f136010a;
        this.f136007b = aVar.f136011b;
        this.f136008c = aVar.f136012c;
    }

    /* renamed from: a */
    public void mo187884a(IGetDataCallback<C55060f> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_STICKER_SETS_STORE, new GetStickerSetsStoreRequest.C17689a().mo61791a(GetStickerSetsStoreRequest.FilterType.fromValue(this.f136006a.getNumber())).mo61792a(Integer.valueOf(this.f136007b)).mo61794b(Integer.valueOf(this.f136008c)), iGetDataCallback, new SdkSender.IParser<C55060f>() {
            /* class com.ss.android.lark.sticker.api.GetStickerSetsStoreRequest.C550501 */

            /* renamed from: a */
            public C55060f parse(byte[] bArr) throws IOException {
                return new C55060f(GetStickerSetsStoreResponse.ADAPTER.decode(bArr));
            }
        });
    }
}
