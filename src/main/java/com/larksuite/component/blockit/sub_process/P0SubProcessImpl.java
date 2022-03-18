package com.larksuite.component.blockit.sub_process;

import android.content.Context;
import com.larksuite.component.blockit.entity.BatchGetItemTagsResponse;
import com.larksuite.component.blockit.hashtag.C24077a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IP0SubProcess.class)
public class P0SubProcessImpl implements IP0SubProcess {
    public P0SubProcessImpl(Context context) {
    }

    @Override // com.larksuite.component.blockit.sub_process.IP0SubProcess
    public void triggerRefresh(String str) {
        Log.m165389i("P0SubProcessImpl", "triggerRefresh START");
        C24077a.m87926a().mo86429a(str, false, false, (String) null, (IGetDataCallback<BatchGetItemTagsResponse>) null);
        Log.m165389i("P0SubProcessImpl", "triggerRefresh END");
    }
}
