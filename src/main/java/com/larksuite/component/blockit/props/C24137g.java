package com.larksuite.component.blockit.props;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.BatchGetItemTagsResponse;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.ItemTags;
import com.larksuite.component.blockit.entity.TagInstance;
import com.larksuite.component.blockit.hashtag.C24077a;
import com.larksuite.component.blockit.p1066a.C24048b;
import com.larksuite.component.blockit.sub_process.IP0SubProcess;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.blockit.props.g */
public class C24137g {

    /* renamed from: a */
    public C24134d f59695a = new C24134d();

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.blockit.props.g$a */
    public static final class C24140a {

        /* renamed from: a */
        public static final C24137g f59705a = new C24137g();
    }

    /* renamed from: a */
    public static C24137g m88164a() {
        return C24140a.f59705a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m88166a(Future future) {
        if (future != null && !future.isDone()) {
            future.cancel(true);
        }
    }

    /* renamed from: a */
    public void mo86647a(String str, AbstractC24131a aVar) {
        this.f59695a.mo86644a(str, aVar);
    }

    /* renamed from: a */
    private void m88165a(Context context, String str) {
        if (C26252ad.m94993b(context)) {
            CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable(CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(context, str) {
                /* class com.larksuite.component.blockit.props.$$Lambda$g$VTAvuE6crSJHPlUglBo8tPpsB4 */
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C24137g.this.m88168c(this.f$1, this.f$2);
                }
            })) {
                /* class com.larksuite.component.blockit.props.$$Lambda$g$54beDlSDpQP2NYBFSOK9X_bwLA */
                public final /* synthetic */ Future f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C24137g.m88166a(this.f$0);
                }
            }, 5000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m88168c(Context context, String str) {
        IP0SubProcess iP0SubProcess;
        try {
            if ("p0".equals(C26252ad.m94994c(context))) {
                iP0SubProcess = null;
            } else {
                iP0SubProcess = (IP0SubProcess) C68183b.m264839a().mo237086a(context, IP0SubProcess.class);
            }
            if (iP0SubProcess != null) {
                iP0SubProcess.triggerRefresh(str);
            }
        } catch (Exception e) {
            Log.m165397w("PropsViewManager", "executeTriggerRefresh" + e);
        }
    }

    /* renamed from: a */
    public void mo86648a(final String str, Map<String, ItemTags> map) {
        m88165a(C24062d.m87896a().f59478a, str);
        final ArrayList arrayList = new ArrayList();
        for (ItemTags itemTags : map.values()) {
            if (TextUtils.equals(str, itemTags.uniqId)) {
                for (TagInstance tagInstance : itemTags.tags) {
                    arrayList.add(new C24136f(tagInstance.tagInfo.name, tagInstance.appLink, tagInstance.tagInfo.tagId));
                }
            }
        }
        UICallbackExecutor.execute(new Runnable() {
            /* class com.larksuite.component.blockit.props.C24137g.RunnableC241392 */

            public void run() {
                boolean z;
                PropsView a = C24137g.this.f59695a.mo86642a(str);
                if (a != null) {
                    a.mo86631a(arrayList);
                }
                List<AbstractC24131a> b = C24137g.this.f59695a.mo86645b(str);
                if (!CollectionUtils.isEmpty(b)) {
                    for (AbstractC24131a aVar : b) {
                        if (arrayList.size() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.mo86639a(z);
                        aVar.mo86638a(C24133c.m88159a(arrayList));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo86646a(final String str, final ViewGroup viewGroup, C24135e eVar, BlockExtra blockExtra, final AbstractC24131a aVar) {
        final C24135e eVar2;
        BlockExtra blockExtra2;
        if (eVar == null) {
            eVar2 = new C24135e();
        } else {
            eVar2 = eVar;
        }
        if (blockExtra == null) {
            blockExtra2 = new BlockExtra();
        } else {
            blockExtra2 = blockExtra;
        }
        String str2 = eVar2.f59691e;
        if (TextUtils.isEmpty(str2)) {
            str2 = blockExtra2.contextJson;
            eVar2.f59691e = blockExtra2.contextJson;
        }
        final Map<String, Object> hitPointParams = blockExtra2.getHitPointParams();
        C24077a.m87926a().mo86429a(str, false, false, str2, (IGetDataCallback<BatchGetItemTagsResponse>) new UIGetDataCallback(new IGetDataCallback<BatchGetItemTagsResponse>() {
            /* class com.larksuite.component.blockit.props.C24137g.C241381 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(BatchGetItemTagsResponse batchGetItemTagsResponse) {
                boolean z;
                ArrayList arrayList = new ArrayList();
                for (ItemTags itemTags : batchGetItemTagsResponse.itemsTags.values()) {
                    if (TextUtils.equals(str, itemTags.uniqId)) {
                        for (TagInstance tagInstance : itemTags.tags) {
                            arrayList.add(new C24136f(tagInstance.tagInfo.name, tagInstance.appLink, tagInstance.tagInfo.tagId));
                        }
                    }
                }
                Log.m165389i("PropsViewManager", "tags:" + arrayList);
                if (viewGroup != null) {
                    PropsView propsView = new PropsView(viewGroup.getContext());
                    viewGroup.addView(propsView, new ViewGroup.LayoutParams(-1, -2));
                    propsView.mo86632a(arrayList, eVar2, hitPointParams);
                    if (!CollectionUtils.isEmpty(arrayList)) {
                        JSONObject jSONObject = new JSONObject(hitPointParams);
                        try {
                            jSONObject.put("tag_count", arrayList.size());
                        } catch (JSONException e) {
                            Log.m165399w("PropsViewManager", e);
                        }
                        C24048b.m87864a("pano_show_propsview", jSONObject);
                    }
                    C24137g.this.f59695a.mo86643a(str, propsView, aVar);
                } else {
                    C24137g.this.f59695a.mo86643a(str, null, aVar);
                }
                AbstractC24131a aVar = aVar;
                if (aVar != null) {
                    if (arrayList.size() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo86639a(z);
                    aVar.mo86638a(C24133c.m88159a(arrayList));
                }
            }
        }));
    }
}
