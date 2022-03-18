package com.ss.android.lark.share.impl.systemshare.mvp;

import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.framework.utils.UriCompatUtil;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.ShareChatDto;
import com.ss.android.lark.share.dto.SystemShareData;
import com.ss.android.lark.share.impl.C54745c;
import com.ss.android.lark.share.impl.systemshare.C54767d;
import com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.b */
public class C54778b extends BaseModel implements AbstractC54774a.AbstractC54775a {

    /* renamed from: a */
    public final SystemShareData f135255a;

    /* renamed from: b */
    public CommonShareData f135256b;

    /* renamed from: c */
    private final String f135257c;

    /* renamed from: d */
    private final Context f135258d;

    /* renamed from: e */
    private boolean f135259e = true;

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54775a
    /* renamed from: a */
    public boolean mo186944a() {
        return this.f135259e;
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54775a
    /* renamed from: a */
    public void mo186943a(boolean z) {
        this.f135259e = z;
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54775a
    /* renamed from: a */
    public void mo186941a(IGetDataCallback<CommonShareData> iGetDataCallback) {
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        CommonShareData commonShareData = this.f135256b;
        if (commonShareData != null) {
            wrapAndAddGetDataCallback.onSuccess(commonShareData);
        } else {
            C57865c.m224575a(new C57865c.AbstractC57873d<CommonShareData>() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54778b.C547791 */

                /* renamed from: a */
                public CommonShareData produce() {
                    CommonShareData commonShareData = new CommonShareData();
                    commonShareData.setContent(C54778b.this.f135255a.getContent());
                    commonShareData.setLocalShare(C54778b.this.f135255a.isLocalShare());
                    commonShareData.setSource(C54778b.this.f135255a.getSource());
                    commonShareData.setTitle(C54778b.this.f135255a.getTitle());
                    commonShareData.setShareFileScene(1);
                    if (CollectionUtils.isEmpty(C54778b.this.f135255a.getFileUris())) {
                        return commonShareData;
                    }
                    C54778b bVar = C54778b.this;
                    bVar.mo186948a(commonShareData, bVar.f135255a.getFileUris());
                    return commonShareData;
                }
            }, new C57865c.AbstractC57871b<CommonShareData>() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54778b.C547802 */

                /* renamed from: a */
                public void consume(CommonShareData commonShareData) {
                    C54778b.this.f135256b = commonShareData;
                    wrapAndAddGetDataCallback.onSuccess(commonShareData);
                }
            }, new C57865c.AbstractC57871b<Throwable>() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54778b.C547813 */

                /* renamed from: a */
                public void consume(Throwable th) {
                    wrapAndAddGetDataCallback.onError(new ErrorResult(new Exception(th)));
                }
            });
        }
    }

    public C54778b(SystemShareData systemShareData, Context context) {
        this.f135255a = systemShareData;
        this.f135258d = context;
        this.f135257c = C26308n.m95251a(context);
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54775a
    /* renamed from: a */
    public void mo186942a(final CommonShareData commonShareData, IGetDataCallback<Boolean> iGetDataCallback) {
        String b = C54713a.m212321a().mo178391d().mo178399b();
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        C54713a.m212321a().mo178392e().mo178401a(b, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.C54778b.C547824 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                wrapAndAddGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                ShareChatDto shareChatDto = new ShareChatDto();
                shareChatDto.setChatId(chat.getId());
                shareChatDto.setMessagePosition(chat.getLastMessagePosition());
                C54745c.m212409a(commonShareData, shareChatDto);
            }
        });
    }

    /* renamed from: a */
    public void mo186948a(CommonShareData commonShareData, List<Uri> list) {
        boolean z;
        String str;
        ArrayList arrayList = new ArrayList();
        Map<String, Long> hashMap = new HashMap<>();
        ArrayList arrayList2 = new ArrayList();
        for (Uri uri : list) {
            boolean a = C54767d.m212499a(this.f135258d, uri);
            if (a || !C54767d.m212500b(this.f135258d, uri)) {
                z = false;
            } else {
                z = true;
            }
            if (a || z) {
                File a2 = UriCompatUtil.m95041a(this.f135258d, uri, true);
                if (a2 == null || !a2.canRead()) {
                    str = C57788ai.m224261b(this.f135258d, uri);
                } else {
                    str = a2.getAbsolutePath();
                }
                if (str != null) {
                    if (a) {
                        arrayList.add(str);
                    } else {
                        hashMap.put(str, Long.valueOf(LarkUriUtil.m95302b(this.f135258d, uri)));
                    }
                }
            } else {
                arrayList2.add(uri.toString());
            }
        }
        commonShareData.setImages(arrayList);
        commonShareData.setVideos(hashMap);
        commonShareData.setFiles(arrayList2);
    }
}
