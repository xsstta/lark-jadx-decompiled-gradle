package com.ss.android.lark.p1954i.p1956b.p1957a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.media.v1.GetNutStoreFilePreviewUrlRequest;
import com.bytedance.lark.pb.media.v1.GetNutStoreFilePreviewUrlResponse;
import com.bytedance.lark.pb.media.v1.SaveToNutStoreRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.p1954i.C38777a;
import com.ss.android.lark.p1954i.p1955a.AbstractC38780a;
import com.ss.android.lark.p1954i.p1956b.AbstractC38781a;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

/* renamed from: com.ss.android.lark.i.b.a.b */
public class C38788b implements AbstractC38781a {

    /* renamed from: a */
    private AbstractC38780a f99721a = C38777a.m153086a();

    @Override // com.ss.android.lark.p1954i.p1956b.AbstractC38781a
    /* renamed from: a */
    public void mo142140a(String str, String str2, int i, IGetDataCallback<String> iGetDataCallback) {
        GetNutStoreFilePreviewUrlRequest.C18246a a = new GetNutStoreFilePreviewUrlRequest.C18246a().mo63227a(str);
        if (!TextUtils.isEmpty(str2)) {
            a.mo63226a(Message.SourceType.fromValue(i)).mo63229b(str2);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_NUT_STORE_FILE_PREVIEW_URL, a, iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.p1954i.p1956b.p1957a.C38788b.C387891 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetNutStoreFilePreviewUrlResponse.ADAPTER.decode(bArr).url;
            }
        });
    }

    @Override // com.ss.android.lark.p1954i.p1956b.AbstractC38781a
    /* renamed from: a */
    public void mo142141a(String str, String str2, String str3, int i, IGetDataCallback<String> iGetDataCallback) {
        m153098b(str, str2, str3, i, iGetDataCallback);
    }

    /* renamed from: b */
    private void m153098b(String str, String str2, String str3, int i, IGetDataCallback<String> iGetDataCallback) {
        SaveToNutStoreRequest.C18288a c = new SaveToNutStoreRequest.C18288a().mo63334a(str2).mo63337c(str);
        if (!TextUtils.isEmpty(str3)) {
            c.mo63333a(Message.SourceType.fromValue(i)).mo63336b(str3);
        }
        SdkSender.asynSendRequestNonWrap(Command.SAVE_TO_NUT_STORE, c, iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.p1954i.p1956b.p1957a.C38788b.C387902 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "success";
            }
        });
    }
}
