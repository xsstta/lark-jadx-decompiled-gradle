package com.ss.android.lark.share.impl.systemshare;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UriCompatUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.SystemShareData;
import com.ss.android.lark.share.impl.AbstractC54723a;
import com.ss.android.lark.share.p2681a.AbstractC54714a;
import com.ss.android.lark.utils.C57788ai;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.share.impl.systemshare.b */
public class C54762b extends AbstractC54723a {

    /* renamed from: d */
    private static final Context f135234d = C54713a.m212321a().mo178386a();

    /* renamed from: e */
    private final AbstractC54714a.AbstractC54719e f135235e = C54713a.m212321a().mo178393f();

    /* renamed from: f */
    private String f135236f;

    /* renamed from: d */
    private void m212483d() {
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.share.impl.systemshare.C54762b.RunnableC547631 */

            public void run() {
                LKUIToast.show(C54762b.this.f135145b, (int) R.string.Lark_Legacy_ShareUnsupportTypeError);
                C54762b.this.mo186861a();
            }
        });
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public boolean mo186868c() {
        if ("com.lark.android.action.SEND".equals(this.f135146c) || "com.lark.android.action.SEND_MULTIPLE".equals(this.f135146c) || "android.intent.action.SEND".equals(this.f135146c) || "android.intent.action.SEND_MULTIPLE".equals(this.f135146c) || ("android.intent.action.VIEW".equals(this.f135146c) && ("application/pdf".equals(this.f135236f) || "message/rfc822".equals(this.f135236f)))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m212485f(Intent intent) {
        m212477a(m212490k(intent));
    }

    /* renamed from: g */
    private void m212486g(Intent intent) {
        m212477a(m212490k(intent));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.share.impl.AbstractC54723a
    /* renamed from: b */
    public void mo186864b(Intent intent) {
        this.f135236f = intent.getType();
    }

    public C54762b(ShareActivity shareActivity) {
        super(shareActivity);
    }

    /* renamed from: b */
    private void m212481b(SystemShareData systemShareData) {
        Context context = (Context) this.f135144a.get();
        if (context == null) {
            context = f135234d;
        }
        ShareContentLauncher.m212463a(context, systemShareData);
    }

    /* renamed from: a */
    private void m212477a(CommonShareData commonShareData) {
        if (commonShareData != null) {
            Context context = (Context) this.f135144a.get();
            if (context == null) {
                context = f135234d;
            }
            C54713a.m212321a().mo178390c().mo178395a(context, commonShareData, !this.f135235e.mo178410a(context));
        }
    }

    /* renamed from: b */
    private boolean m212482b(List<Uri> list) {
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        for (Uri uri : list) {
            if (!C54767d.m212499a(f135234d, uri)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m212484e(Intent intent) {
        CommonShareData k = m212490k(intent);
        if (mo186863b() != null) {
            C54713a.m212321a().mo178390c().mo178397b(f135234d, k, !this.f135235e.mo178410a(mo186863b()));
        }
    }

    /* renamed from: i */
    private void m212488i(Intent intent) {
        Uri data;
        int indexOf;
        if (intent != null && (data = intent.getData()) != null) {
            String a = C57788ai.m224257a((Context) this.f135144a.get(), data);
            if (!TextUtils.isEmpty(a) && (indexOf = (a = Uri.decode(a)).indexOf("file:///")) >= 0) {
                a = a.substring(indexOf + 8);
            }
            C54713a.m212321a().mo178394g().mo178412a((Context) this.f135144a.get(), a);
        }
    }

    /* renamed from: j */
    private SystemShareData m212489j(Intent intent) {
        SystemShareData systemShareData = new SystemShareData();
        systemShareData.setTitle(intent.getStringExtra("android.intent.extra.TITLE"));
        systemShareData.setContent(intent.getStringExtra("android.intent.extra.TEXT"));
        systemShareData.setSource(intent.getStringExtra("android.intent.extra.USER"));
        systemShareData.setLocalShare(intent.getBooleanExtra("android.intent.extra.LOCAL_ONLY", false));
        ArrayList<Uri> l = m212491l(intent);
        systemShareData.setFileUris(l);
        if (!CollectionUtils.isEmpty(l)) {
            systemShareData.setContent("");
        }
        return systemShareData;
    }

    /* renamed from: l */
    private ArrayList<Uri> m212491l(Intent intent) {
        Uri data;
        ArrayList<Uri> arrayList = new ArrayList<>();
        if (intent == null) {
            return arrayList;
        }
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || (data = intent.getData()) == null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri == null) {
                return intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            arrayList.add(uri);
            return arrayList;
        }
        arrayList.add(data);
        return arrayList;
    }

    /* renamed from: a */
    private void m212478a(SystemShareData systemShareData) {
        if (!TextUtils.isEmpty(systemShareData.getContent())) {
            ShareHitPoint.f121870e.mo169313a("text");
        }
        if (m212480a(systemShareData.getFileUris())) {
            ShareHitPoint.f121870e.mo169313a("image");
        }
        if (m212482b(systemShareData.getFileUris())) {
            ShareHitPoint.f121870e.mo169313a("file");
        }
    }

    /* renamed from: a */
    private boolean m212479a(Uri uri) {
        Context context = f135234d;
        File a = UriCompatUtil.m95039a(context, uri);
        if (a == null) {
            return false;
        }
        try {
            String canonicalPath = a.getCanonicalPath();
            String packageName = context.getPackageName();
            if (canonicalPath.contains("/data/data/") || canonicalPath.contains("/data/user/")) {
                if (canonicalPath.contains("/" + packageName + "/")) {
                    return true;
                }
                if (canonicalPath.contains("/" + packageName + "-")) {
                    return true;
                }
            }
        } catch (Exception e) {
            Log.m165383e("LarkShareHandler", "An exception occurred while getCanonicalPath," + e.getMessage());
        }
        return false;
    }

    /* renamed from: h */
    private void m212487h(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.f135145b.getPackageManager().queryIntentActivities(intent, 65536);
        SystemShareData j = m212489j(intent);
        if (j.getFileUris() != null) {
            Iterator<Uri> it = j.getFileUris().iterator();
            while (it.hasNext()) {
                Uri next = it.next();
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        try {
                            this.f135145b.grantUriPermission(resolveInfo.activityInfo.packageName, next, 1);
                            if (this.f135145b.checkCallingUriPermission(next, 1) == -1) {
                                Log.m165383e("LarkShareHandler", "failed to grant failed for uri: " + next);
                            }
                        } catch (Exception e) {
                            Log.m165397w("LarkShareHandler", "grant uri permission failed by exception: " + e);
                        }
                    }
                }
                if (m212479a(next)) {
                    Toast.makeText(f135234d, (int) R.string.Lark_Legacy_ShareUnsupportTypeError, 0).show();
                    mo186861a();
                    return;
                }
            }
        }
        m212478a(j);
        m212481b(j);
    }

    /* renamed from: k */
    private CommonShareData m212490k(Intent intent) {
        CommonShareData commonShareData = new CommonShareData();
        if (intent == null) {
            return commonShareData;
        }
        commonShareData.setTitle(intent.getStringExtra("android.intent.extra.TITLE"));
        commonShareData.setContent(intent.getStringExtra("android.intent.extra.TEXT"));
        commonShareData.setSource(intent.getStringExtra("android.intent.extra.USER"));
        commonShareData.setLocalShare(intent.getBooleanExtra("android.intent.extra.LOCAL_ONLY", false));
        commonShareData.setShareFileScene(1);
        ArrayList<Uri> l = m212491l(intent);
        if (CollectionUtils.isEmpty(l)) {
            return commonShareData;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Uri> it = l.iterator();
        while (it.hasNext()) {
            Uri next = it.next();
            String uri = next.toString();
            if (C54767d.m212499a(f135234d, next)) {
                arrayList.add(uri);
            } else {
                arrayList2.add(uri);
            }
        }
        commonShareData.setImages(arrayList);
        commonShareData.setFiles(arrayList2);
        Log.m165389i("LarkShareHandler", "title:" + commonShareData.getTitle() + ", content:" + commonShareData.getContent() + ", source:" + commonShareData.getSource() + ", imageCount:" + commonShareData.getImages().size() + ", fileCount:" + commonShareData.getFiles().size());
        for (String str : commonShareData.getImages()) {
            Log.m165389i("LarkShareHandler", str);
        }
        for (String str2 : commonShareData.getFiles()) {
            Log.m165389i("LarkShareHandler", str2);
        }
        return commonShareData;
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public void mo186867c(Intent intent) {
        if (TextUtils.isEmpty(this.f135236f)) {
            mo186861a();
        } else if ("com.lark.android.action.SEND".equals(this.f135146c)) {
            if (this.f135236f.equalsIgnoreCase("text/plain")) {
                m212484e(intent);
            } else if (this.f135236f.startsWith("image/")) {
                m212485f(intent);
            }
        } else if ("com.lark.android.action.SEND_MULTIPLE".equals(this.f135146c)) {
            if (this.f135236f.startsWith("image/")) {
                m212486g(intent);
            }
        } else if ("android.intent.action.SEND".equals(this.f135146c) || "android.intent.action.SEND_MULTIPLE".equals(this.f135146c)) {
            m212487h(intent);
        } else if ("android.intent.action.VIEW".equals(this.f135146c) && "application/pdf".equalsIgnoreCase(this.f135236f)) {
            m212487h(intent);
        } else if (!"android.intent.action.VIEW".equals(this.f135146c) || !"message/rfc822".equalsIgnoreCase(this.f135236f)) {
            m212483d();
        } else {
            m212488i(intent);
        }
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: d */
    public void mo186869d(Intent intent) {
        if (TextUtils.isEmpty(this.f135236f)) {
            mo186861a();
        } else if ("com.lark.android.action.SEND".equals(this.f135146c)) {
            if (this.f135236f.equalsIgnoreCase("text/plain")) {
                m212484e(intent);
            } else if (this.f135236f.startsWith("image/")) {
                m212485f(intent);
            }
            mo186861a();
        } else if ("com.lark.android.action.SEND_MULTIPLE".equals(this.f135146c)) {
            if (this.f135236f.startsWith("image/")) {
                m212486g(intent);
            }
            mo186861a();
        } else if ("android.intent.action.SEND".equals(this.f135146c) || "android.intent.action.SEND_MULTIPLE".equals(this.f135146c)) {
            m212487h(intent);
            mo186861a();
        } else if ("android.intent.action.VIEW".equals(this.f135146c) && "application/pdf".equalsIgnoreCase(this.f135236f)) {
            m212487h(intent);
            mo186861a();
        } else if (!"android.intent.action.VIEW".equals(this.f135146c) || !"message/rfc822".equalsIgnoreCase(this.f135236f)) {
            m212483d();
        } else {
            m212488i(intent);
            mo186861a();
        }
    }

    /* renamed from: a */
    private boolean m212480a(List<Uri> list) {
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        for (Uri uri : list) {
            if (C54767d.m212499a(f135234d, uri)) {
                return true;
            }
        }
        return false;
    }
}
