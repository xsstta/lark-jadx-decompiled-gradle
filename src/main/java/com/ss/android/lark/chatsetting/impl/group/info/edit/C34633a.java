package com.ss.android.lark.chatsetting.impl.group.info.edit;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.a */
public class C34633a {

    /* renamed from: a */
    static AbstractC34461c.AbstractC34466e f89408a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: a */
    public static void m134588a(final String str, final IGetDataCallback iGetDataCallback) {
        Observable.create(new ObservableOnSubscribe<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34633a.C346363 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Chat> observableEmitter) throws Exception {
                observableEmitter.onNext(C34633a.f89408a.mo127312a(str));
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34633a.C346341 */

            /* renamed from: a */
            public void accept(Chat chat) throws Exception {
                iGetDataCallback.onSuccess(chat);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34633a.C346352 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                Log.m165382e("Get the initialized GroupInfo failed: " + th.getMessage());
            }
        });
    }
}
