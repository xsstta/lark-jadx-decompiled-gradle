package com.bytedance.ee.bear.lark.aidl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.contract.IAnnounceSendCallback;
import com.bytedance.ee.bear.dto.DocImagesForwardData;
import com.bytedance.ee.bear.dto.DocShareTextData;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7991d;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.lark.p414b.AbstractC7996i;
import com.bytedance.ee.bear.lark.p414b.AbstractC8000k;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.IDocCallback;
import com.ss.android.lark.doc.statistics.announce.AnnounceOpenDocHitPoint;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59030d;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class DocCallbackImpl extends IDocCallback.Stub {
    private static DuplicateEnterChecker sChecker = new DuplicateEnterChecker();

    private void goToMainWindow(String str) {
        ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo31002a(((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30986a(), str, null);
    }

    public static RichText generateRichText(AbstractC7996i.C7997a aVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(aVar.f21480a, options);
        return C59029c.m229157a(Collections.singletonList(C59030d.m229166a("", aVar.f21481b, options.outWidth, options.outHeight)));
    }

    public static File imageLimit(File file) {
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        int width = decodeFile.getWidth();
        int i = (width * 9) / 16;
        if (decodeFile.getHeight() > i) {
            C26311p.m95265a(Bitmap.createBitmap(decodeFile, 0, 0, width, i), file.getAbsolutePath());
        }
        return file;
    }

    private DocShareTextData parseShareTextData(Bundle bundle) {
        DocShareTextData docShareTextData = new DocShareTextData(bundle.getString("android.intent.extra.TITLE", ""), bundle.getString("android.intent.extra.TEXT", ""), bundle.getString("android.intent.extra.USER", "Docs"), bundle.getBoolean("android.intent.extra.LOCAL_ONLY", true));
        docShareTextData.setCanAddExtraInfo(bundle.getBoolean("support_addition_note", false));
        return docShareTextData;
    }

    private void goToShareForward(Bundle bundle) {
        String string = bundle.getString("android.intent.extra.MIME_TYPES", "");
        AbstractC8001l lVar = (AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class);
        Context a = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30986a();
        if (TextUtils.equals(string, "text/plain")) {
            lVar.mo31008a(a, parseShareTextData(bundle));
        } else if (TextUtils.equals(string, "image/*")) {
            lVar.mo31007a(a, parseDocImagesForwardData(a, bundle));
        } else {
            C13479a.m54764b("DocCallbackImpl", "goToShareForward()... not support type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.bytedance.ee.bear.lark.b.d */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.doc.IDocCallback
    public Bundle doCommand(Bundle bundle) throws RemoteException {
        boolean z;
        Map map;
        if (bundle == null) {
            new Bundle();
            C13479a.m54758a("DocCallbackImpl", "doCommand()... bundle is empty  ");
            return null;
        }
        String string = bundle.getString("command");
        Context a = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30986a();
        if ("tab_docs".equals(string)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_doc_tab_index", bundle.getInt("tab"));
            ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo31002a(a, "space", bundle2);
        } else if ("tab_wiki".equals(string)) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("key_wiki_tab_index", bundle.getInt("tab"));
            ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo31002a(a, "wiki", bundle3);
        } else if ("profile_main".equals(string)) {
            openProfile(bundle.getString("user_id"), bundle.getString("title"), a);
        } else if ("notify_announcement_change".equals(string)) {
            sendGroupAnnouncementMsg(bundle.getString("chat_id"), bundle.getString("thumbnail"), bundle.getBinder("announce_send_callback"));
            AnnounceOpenDocHitPoint.f94670a.mo135786a(bundle.getBoolean("is_edited"));
        } else if ("recognize_qr".equals(string)) {
            String string2 = bundle.getString("photo_qr");
            if (!TextUtils.isEmpty(string2)) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("command", "recognize_qr");
                bundle4.putString("result_qr", ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30987a(string2));
                return bundle4;
            }
        } else if ("handle_result_qr".equals(string)) {
            String string3 = bundle.getString("result_qr");
            if (!TextUtils.isEmpty(string3)) {
                ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30989b(string3);
            }
        } else if ("mine_about".equals(string)) {
            ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo31001a(a);
        } else if ("open_url".equals(string)) {
            String string4 = bundle.getString("url");
            Serializable serializable = bundle.getSerializable("extra");
            if (serializable == null || !(serializable instanceof Map)) {
                map = null;
            } else {
                map = (Map) serializable;
            }
            ((AbstractC7991d) KoinJavaComponent.m268610a(AbstractC7991d.class)).mo30983a(a, string4, map);
        } else if ("open_isv".equals(string)) {
            ((AbstractC7991d) KoinJavaComponent.m268610a(AbstractC7991d.class)).mo30982a(a, bundle.getString("url"));
        } else if ("share".equals(string)) {
            goToShareForward(bundle);
        } else if ("jump_to_feed".equals(string)) {
            goToMainWindow(bundle.getString("page_name", ""));
        } else if ("check_wiki_tab_exit".equals(string)) {
            boolean a2 = ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo31003a();
            TabType a3 = ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo31000a("wiki");
            Bundle bundle5 = new Bundle();
            if (!a2 || a3 == TabType.Others) {
                z = false;
            } else {
                z = true;
            }
            bundle5.putBoolean("exit", z);
            return bundle5;
        }
        return null;
    }

    @Override // com.ss.android.lark.doc.IDocCallback
    public void sendEvent(String str, String str2) throws RemoteException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception e) {
            C13479a.m54761a("DocCallbackImpl", e);
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null) {
            Statistics.sendEvent(str, jSONObject);
        }
    }

    private DocImagesForwardData parseDocImagesForwardData(Context context, Bundle bundle) {
        DocImagesForwardData docImagesForwardData = new DocImagesForwardData();
        docImagesForwardData.setTitle(bundle.getString("android.intent.extra.TITLE", ""));
        docImagesForwardData.setContent(bundle.getString("android.intent.extra.TEXT", ""));
        docImagesForwardData.setSource(bundle.getString("android.intent.extra.USER", "Docs"));
        docImagesForwardData.setLocalShare(bundle.getBoolean("android.intent.extra.LOCAL_ONLY", false));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("android.intent.extra.STREAM");
        if (parcelableArrayList == null || CollectionUtils.isEmpty(parcelableArrayList)) {
            C13479a.m54758a("DocCallbackImpl", "parseDocImagesForwardData()...uris is empty");
            return docImagesForwardData;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            String a = C57788ai.m224257a(context, (Uri) it.next());
            if (!TextUtils.isEmpty(a)) {
                if (C26311p.m95283c(a).contains("image/")) {
                    arrayList.add(a);
                } else {
                    arrayList2.add(a);
                }
            }
        }
        docImagesForwardData.setImages(arrayList);
        docImagesForwardData.setFiles(arrayList2);
        docImagesForwardData.setCanAddExtraInfo(bundle.getBoolean("support_addition_note", false));
        return docImagesForwardData;
    }

    public static void openProfile(String str, String str2, Context context) {
        if (sChecker.mo198450a()) {
            C13479a.m54764b("DocCallbackImpl", "openProfile()...isDuplicate");
        } else {
            ((AbstractC7988a) KoinJavaComponent.m268610a(AbstractC7988a.class)).mo30977a(context, str, str2, null);
        }
    }

    private static void sendGroupAnnouncementMsg(final String str, final String str2, IBinder iBinder) {
        C13479a.m54772d("sendGroupAnnouncementMsg ", "chat id = " + str + "， thumbnail = " + str2);
        final IAnnounceSendCallback asInterface = IAnnounceSendCallback.Stub.asInterface(iBinder);
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.bytedance.ee.bear.lark.aidl.DocCallbackImpl.RunnableC79631 */

            /* renamed from: a */
            File f21408a;

            public void run() {
                C13479a.m54772d("sendGroupAnnouncementMsg run()", "chat id = " + str + "， thumbnail = " + str2);
                try {
                    final Context a = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30986a();
                    File file = (File) ComponentCallbacks2C2115c.m9151c(a).mo10414a(new C13664a(str2)).mo10405b(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                    this.f21408a = file;
                    DocCallbackImpl.imageLimit(file);
                    ((AbstractC7996i) KoinJavaComponent.m268610a(AbstractC7996i.class)).mo30996a(a, this.f21408a.getAbsolutePath(), true, true, null, new UIGetDataCallback(new IGetDataCallback<AbstractC7996i.C7997a>() {
                        /* class com.bytedance.ee.bear.lark.aidl.DocCallbackImpl.RunnableC79631.C79641 */

                        /* renamed from: a */
                        public void onSuccess(AbstractC7996i.C7997a aVar) {
                            ((AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class)).mo31011a(str, true, UIHelper.getString(R.string.Lark_Legacy_Announcement), DocCallbackImpl.generateRichText(aVar), new IGetDataCallback<String>() {
                                /* class com.bytedance.ee.bear.lark.aidl.DocCallbackImpl.RunnableC79631.C79641.C79651 */

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    try {
                                        asInterface.onAnnounceSendFailed();
                                    } catch (RemoteException unused) {
                                        C13479a.m54758a("DocCallbackImpl", "call onAnnounceSendFailed failed");
                                    }
                                }

                                /* renamed from: a */
                                public void onSuccess(String str) {
                                    ((AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class)).mo31009a(a, str);
                                    try {
                                        asInterface.onAnnounceSendSuccess();
                                    } catch (RemoteException unused) {
                                        C13479a.m54758a("DocCallbackImpl", "call onAnnounceSendSuccess failed");
                                    }
                                    UICallbackExecutor.executeDelayed(new Runnable() {
                                        /* class com.bytedance.ee.bear.lark.aidl.DocCallbackImpl.RunnableC79631.C79641.C79651.RunnableC79661 */

                                        public void run() {
                                            LKUIToast.show(a, (int) R.string.Lark_Legacy_SendAnnouncementSuccess);
                                        }
                                    }, 100);
                                }
                            });
                            C13479a.m54772d("sendGroupAnnouncementMsg", "End of sending");
                            C26311p.m95291k(RunnableC79631.this.f21408a.getAbsolutePath());
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            byte[] a;
                            try {
                                asInterface.onAnnounceSendFailed();
                            } catch (RemoteException unused) {
                                C13479a.m54758a("DocCallbackImpl", "call onAnnounceSendFailed failed");
                            }
                            if (RunnableC79631.this.f21408a.length() < 1024 && (a = C26311p.m95276a(RunnableC79631.this.f21408a.getAbsolutePath())) != null) {
                                String str = new String(a);
                                C13479a.m54758a("sendGroupAnnouncementMsg", "upload image fail , file content : " + str);
                            }
                            C26311p.m95291k(RunnableC79631.this.f21408a.getAbsolutePath());
                        }
                    }));
                } catch (Exception e) {
                    File file2 = this.f21408a;
                    if (file2 != null) {
                        C26311p.m95291k(file2.getAbsolutePath());
                    }
                    try {
                        asInterface.onAnnounceSendFailed();
                    } catch (RemoteException unused) {
                        C13479a.m54758a("DocCallbackImpl", "call onAnnounceSendFailed failed");
                    }
                    C13479a.m54758a("sendGroupAnnouncementMsg", "send Announcement fail download :" + e.toString());
                }
            }
        });
    }
}
