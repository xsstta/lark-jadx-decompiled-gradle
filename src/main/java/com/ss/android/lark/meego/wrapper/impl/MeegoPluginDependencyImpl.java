package com.ss.android.lark.meego.wrapper.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.export.ChatGroupInfo;
import com.ss.android.lark.meego.export.IMeegoPluginDependency;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import com.ss.android.lark.meego.wrapper.debug.C44864a;
import com.ss.android.lark.meego.wrapper.manis.IMeegoProxy;
import ee.android.framework.manis.C68183b;

@ClaymoreImpl(IMeegoPluginDependency.class)
public class MeegoPluginDependencyImpl implements IMeegoPluginDependency {
    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getDeviceId() {
        return MeegoModule.m177824d().getDeviceId();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getLanguage() {
        return MeegoModule.m177824d().getLanguage();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getNetProxy() {
        return C44864a.m177875e().mo158753b();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getRpcPersistDyecpFd() {
        return C44864a.m177875e().mo158751a();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getSession() {
        return MeegoModule.m177824d().getSession();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getTTEnv() {
        return C44864a.m177875e().mo158757d();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getTenantId() {
        return MeegoModule.m177824d().getTenantId();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public String getUsePpe() {
        return C44864a.m177875e().mo158755c();
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public Boolean isBoeEnv() {
        return Boolean.valueOf(MeegoModule.m177824d().isBoeEnv());
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public void openWebUrl(String str) {
        IMeegoProxy iMeegoProxy;
        Context context = MeegoModule.m177824d().getContext();
        if (context != null && (iMeegoProxy = (IMeegoProxy) C68183b.m264839a().mo237086a(context, IMeegoProxy.class)) != null) {
            Log.m165389i("MeegoModule", "openWebUrl, url=" + str);
            iMeegoProxy.openWebUrl(str);
        }
    }

    @Override // com.ss.android.lark.meego.export.IMeegoPluginDependency
    public void selectMyGroup(final IGetDataCallback<ChatGroupInfo> iGetDataCallback) {
        Context context = MeegoModule.m177824d().getContext();
        if (context == null) {
            iGetDataCallback.onError(new ErrorResult("context is null"));
            return;
        }
        Message message = new Message();
        message.replyTo = new Messenger(new Handler() {
            /* class com.ss.android.lark.meego.wrapper.impl.MeegoPluginDependencyImpl.HandlerC448731 */

            public void handleMessage(Message message) {
                if (message.peekData() != null) {
                    Bundle data = message.getData();
                    data.setClassLoader(getClass().getClassLoader());
                    SelectedData fromBundle = SelectedData.getFromBundle(data);
                    if (fromBundle != null) {
                        iGetDataCallback.onSuccess(new ChatGroupInfo(fromBundle.id, fromBundle.name));
                        return;
                    }
                    iGetDataCallback.onSuccess(null);
                    return;
                }
                iGetDataCallback.onSuccess(null);
            }
        });
        MeegoModule.m177824d().getContactDependency().mo144526a(context, message);
    }
}
