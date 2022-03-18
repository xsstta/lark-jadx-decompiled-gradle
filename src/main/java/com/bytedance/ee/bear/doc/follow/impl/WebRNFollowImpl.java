package com.bytedance.ee.bear.doc.follow.impl;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.doc.follow.FollowInvokeResult;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;

public class WebRNFollowImpl extends BaseFollowImpl implements NonProguard {
    private AbstractC4931i web;

    public void unBindJSHandler() {
        this.web.mo19441c("biz.vcfollow.sendToNative");
    }

    private void bindJSHandler() {
        this.web.mo19431a("biz.vcfollow.sendToNative", (AbstractC7945d) new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.doc.follow.impl.WebRNFollowImpl.C54361 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                WebRNFollowImpl.this.parseVCFollowCallback(str);
            }
        });
    }

    private void onReceiveEvent(RNFollowEvent rNFollowEvent) {
        if (rNFollowEvent != null) {
            getFollowBridge().mo21768a(rNFollowEvent);
        }
    }

    private void onInvokeResult(FollowInvokeResult followInvokeResult) {
        if (TextUtils.isEmpty(followInvokeResult.callbackId)) {
            C13479a.m54775e("WebRNFollowImpl", "onInvokeResult no callbackId");
        } else {
            getFollowBridge().mo21767a(followInvokeResult);
        }
    }

    public void parseVCFollowCallback(String str) {
        if (str != null) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                String string = parseObject.getString("action");
                if ("vcfollow.onInvokeResult".equals(string)) {
                    onInvokeResult((FollowInvokeResult) parseObject.getObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, FollowInvokeResult.class));
                } else if ("vcfollow.onEvent".equals(string)) {
                    onReceiveEvent((RNFollowEvent) parseObject.getObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, RNFollowEvent.class));
                }
            } catch (Throwable th) {
                C13479a.m54759a("WebRNFollowImpl", "parseSelectionChangeData", th);
            }
        }
    }

    public WebRNFollowImpl(Fragment fragment, AbstractC4931i iVar, String str) {
        super(fragment, str, new WebFollowBridge(iVar));
        this.web = iVar;
        bindJSHandler();
    }
}
