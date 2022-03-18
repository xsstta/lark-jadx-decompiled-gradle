package com.bytedance.ee.bear.middleground.calendar.pool;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.ee.bear.middleground.calendar.p440a.C8891a;
import com.bytedance.ee.log.C13479a;

public class DefaultWebEditorPool implements IWebEditorPool {
    public C8891a cacheWebView;
    private Context mApplicationContext;
    private boolean mHasInit;

    private C8891a getEditor() {
        C8891a aVar = this.cacheWebView;
        if (aVar != null) {
            this.cacheWebView = null;
        } else {
            aVar = newCalendarWebView();
        }
        checkCacheWebView();
        return aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.calendar.pool.IWebEditorPool
    public void clear() {
        C8891a aVar = this.cacheWebView;
        if (aVar != null) {
            aVar.destroy();
            this.cacheWebView = null;
        }
    }

    private void checkCacheWebView() {
        if (this.cacheWebView == null) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
                /* class com.bytedance.ee.bear.middleground.calendar.pool.DefaultWebEditorPool.C89281 */

                public boolean queueIdle() {
                    if (DefaultWebEditorPool.this.cacheWebView != null) {
                        return false;
                    }
                    DefaultWebEditorPool defaultWebEditorPool = DefaultWebEditorPool.this;
                    defaultWebEditorPool.cacheWebView = defaultWebEditorPool.newCalendarWebView();
                    return false;
                }
            });
        }
    }

    public C8891a newCalendarWebView() {
        C8891a aVar = new C8891a(this.mApplicationContext);
        C13479a.m54764b("DefaultWebEditorPool", "init(): calendarWebView:" + aVar.hashCode() + ",EditorPool:" + hashCode());
        aVar.mo19616a();
        return aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.calendar.pool.IWebEditorPool
    public WebEditorWrapper obtain() {
        if (!this.mHasInit) {
            C13479a.m54758a("DefaultWebEditorPool", "WebEditor hasn't init");
            return null;
        }
        WebEditorWrapper webEditorWrapper = new WebEditorWrapper(this.mApplicationContext);
        C8891a editor = getEditor();
        if (editor != null) {
            editor.resumeTimers();
        }
        webEditorWrapper.setEditor(editor);
        return webEditorWrapper;
    }

    @Override // com.bytedance.ee.bear.middleground.calendar.pool.IWebEditorPool
    public void init(Context context) {
        if (!this.mHasInit) {
            this.mApplicationContext = context.getApplicationContext();
            this.cacheWebView = newCalendarWebView();
            this.mHasInit = true;
        }
    }
}
