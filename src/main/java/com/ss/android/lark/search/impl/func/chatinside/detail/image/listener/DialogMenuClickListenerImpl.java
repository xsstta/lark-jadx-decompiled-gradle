package com.ss.android.lark.search.impl.func.chatinside.detail.image.listener;

import android.app.Activity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.common.C53412a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.C53491a;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import java.util.Collections;
import java.util.Map;

public class DialogMenuClickListenerImpl implements OnDialogMenuClickListener {
    private final String mChatId;
    private final boolean mIsThread;
    private final String mThreadId;
    private final int mThreadPosition;

    private void addViewInChatInPicBrowserHitPoint(String str) {
        C53412a.m206845a(str, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.DialogMenuClickListenerImpl.C534951 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                SearchHitPoint.f131886a.mo182025e(str);
            }
        });
    }

    static /* synthetic */ Message lambda$onJumpToChatClicked$0(String str) {
        Map<String, Message> c = C53258a.m205939a().mo181756f().mo181798c(Collections.singletonList(str));
        if (CollectionUtils.isEmpty(c)) {
            return null;
        }
        return c.get(str);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
    public void onJumpToChatClicked(String str) {
        addViewInChatInPicBrowserHitPoint(this.mChatId);
        C57865c.m224574a(new C57865c.AbstractC57873d(str) {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.$$Lambda$DialogMenuClickListenerImpl$Cu_O8ROAuNhZRqnEVatiQAxBIEc */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return DialogMenuClickListenerImpl.lambda$onJumpToChatClicked$0(this.f$0);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.$$Lambda$DialogMenuClickListenerImpl$KZNRGOBu5MBSroBz5TXe4xQFpM */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                DialogMenuClickListenerImpl.this.lambda$onJumpToChatClicked$1$DialogMenuClickListenerImpl((Message) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onJumpToChatClicked$1$DialogMenuClickListenerImpl(Message message) {
        if (message != null) {
            if (this.mIsThread) {
                C53258a.m205939a().mo181756f().mo181782a(this.mThreadId, this.mThreadPosition);
            } else {
                C53258a.m205939a().mo181756f().mo181784a(this.mChatId, C53491a.class.getName(), message.getPosition());
            }
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
    public void onDecodeQRCodeClicked(String str, Activity activity) {
        C53258a.m205939a().mo181741a(str, activity);
    }

    public DialogMenuClickListenerImpl(String str, boolean z, String str2, int i) {
        this.mChatId = str;
        this.mThreadId = str2;
        this.mIsThread = z;
        this.mThreadPosition = i;
    }
}
