package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.ImageTranslationInfo;
import com.bytedance.lark.pb.basic.v1.TranslatedImage;
import com.bytedance.lark.pb.im.v1.GetTranslateOriginImageRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateOriginImageResponse;
import com.bytedance.lark.pb.im.v1.ImageKeyInfo;
import com.bytedance.lark.pb.im.v1.TranslateImageKeysRequest;
import com.bytedance.lark.pb.im.v1.TranslateImageKeysResponse;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.dialog.C58423b;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.C58639a;
import com.ss.android.lark.widget.photo_picker.entity.C58640b;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.photo_picker.p2951f.C58661j;
import com.ss.android.lark.widget.photo_picker.service.TranslateImageService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.i */
public class C58782i implements AbstractC58768d {

    /* renamed from: a */
    public AbstractC58790a f145289a;

    /* renamed from: b */
    public String f145290b = C58661j.m227532a(this.f145294f);

    /* renamed from: c */
    public boolean f145291c;

    /* renamed from: d */
    private Context f145292d;

    /* renamed from: e */
    private boolean f145293e;

    /* renamed from: f */
    private PhotoItem f145294f;

    /* renamed from: g */
    private String f145295g;

    /* renamed from: h */
    private boolean f145296h = (!m228010g());

    /* renamed from: i */
    private C58791b f145297i;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.i$a */
    public interface AbstractC58790a {
        /* renamed from: a */
        void mo199218a(PhotoItem photoItem);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return -1;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.RunnableC587831 */

            public void run() {
                C58782i.this.mo199209b();
            }
        };
    }

    /* renamed from: f */
    private boolean m228009f() {
        return this.f145294f.getTranslateProperty().canTranslate();
    }

    /* renamed from: g */
    private boolean m228010g() {
        return this.f145294f.getTranslateProperty().isTranslated();
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        int i;
        if (m228010g()) {
            i = R.string.Lark_Chat_ViewOriginalImage;
        } else {
            i = R.string.Lark_Chat_TranslateImageText;
        }
        return UIHelper.getString(i);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        if (!this.f145293e || DesktopUtil.m144301a(this.f145292d) || !m228009f()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m228011h() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject().put("position", "imgviewer").put("message_type", "other");
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (this.f145296h) {
            Statistics.sendEvent("translate_image", jSONObject);
        } else {
            Statistics.sendEvent("untranslate_image", jSONObject);
        }
    }

    /* renamed from: b */
    public void mo199209b() {
        String targetLanguageKey = TranslateImageService.INSTANCE.getTargetLanguageKey();
        List<String> srcLanguages = this.f145294f.getTranslateProperty().getSrcLanguages();
        if (srcLanguages == null || srcLanguages.size() != 1 || !srcLanguages.contains(targetLanguageKey)) {
            mo199207a((String) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        List<C58639a> imageSupportedLanguageList = TranslateImageService.INSTANCE.getImageSupportedLanguageList();
        int i = -1;
        for (int i2 = 0; i2 < imageSupportedLanguageList.size(); i2++) {
            C58639a aVar = imageSupportedLanguageList.get(i2);
            arrayList.add(aVar.mo198834b());
            arrayList2.add(aVar.mo198832a());
            if (i == -1 && targetLanguageKey.equals(aVar.mo198832a())) {
                i = i2;
            }
        }
        new C58423b(this.f145292d, UIHelper.getString(R.string.Lark_Chat_TranslateInto), i, arrayList, new C58423b.AbstractC58427b() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C587842 */

            @Override // com.ss.android.lark.widget.dialog.C58423b.AbstractC58427b
            /* renamed from: a */
            public void mo108011a(int i) {
                C58782i.this.mo199207a((String) arrayList2.get(i));
            }
        }).mo197765f();
    }

    public String toString() {
        if (!this.f145293e) {
            return "TranslateAction: disable";
        }
        return "TranslateAction: { msgId: " + this.f145294f.getMessageId() + ", imageKey: " + this.f145295g + ", originKey: " + this.f145290b + ", isOrigin: " + this.f145296h + " }";
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.i$b */
    public static class C58791b extends ViewUtils.AbstractC57752b {

        /* renamed from: j */
        public ValueAnimator f145309j = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(3000L);

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public int mo196033a() {
            return R.layout.translate_loading_dialog;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public void mo196038a(Window window) {
            super.mo196038a(window);
            window.addFlags(1024);
        }

        public C58791b(Context context) {
            super(context);
            mo196035a(0);
        }

        /* renamed from: a */
        public void mo199219a(final View view) {
            final int height = ((RelativeLayout) view.getParent()).getHeight() - view.getHeight();
            this.f145309j.setRepeatMode(1);
            this.f145309j.setRepeatCount(-1);
            this.f145309j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C58791b.C587954 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.topMargin = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) height));
                    view.setLayoutParams(layoutParams);
                }
            });
            this.f145309j.start();
        }

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public void mo196034a(final DialogC25637f fVar, CharSequence charSequence) {
            final View findViewById = fVar.findViewById(R.id.translateLoadingIv);
            View findViewById2 = fVar.findViewById(R.id.translateStopView);
            findViewById.post(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C58791b.RunnableC587921 */

                public void run() {
                    C58791b.this.mo199219a(findViewById);
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C58791b.View$OnClickListenerC587932 */

                public void onClick(View view) {
                    fVar.cancel();
                }
            });
            mo196037a(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C58791b.DialogInterface$OnDismissListenerC587943 */

                public void onDismiss(DialogInterface dialogInterface) {
                    if (C58791b.this.f145309j != null) {
                        C58791b.this.f145309j.removeAllUpdateListeners();
                        C58791b.this.f145309j.cancel();
                        C58791b.this.f145309j = null;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo199207a(final String str) {
        C587853 r0 = new C57768af.AbstractRunnableC57773c<PhotoItem>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C587853 */

            /* renamed from: a */
            public PhotoItem mo130916b() {
                return C58782i.this.mo199208b(str);
            }

            /* renamed from: a */
            public void mo130914a(PhotoItem photoItem) {
                if (photoItem != null && C58782i.this.f145289a != null) {
                    C58782i.this.f145289a.mo199218a(photoItem);
                }
            }
        };
        this.f145291c = false;
        r0.mo196075a((Runnable) new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.RunnableC587864 */

            public void run() {
                C58782i.this.f145291c = true;
                Log.m165389i("TranslateImage", "onCancel: " + C58782i.this.f145290b + " -> translate image cancel.");
            }
        });
        C58791b bVar = new C58791b(this.f145292d);
        this.f145297i = bVar;
        C57768af.m224219a(this.f145292d, r0, bVar);
        m228011h();
    }

    /* renamed from: a */
    private void m228005a(PhotoItem photoItem) {
        if (photoItem.getWidth() == 0 || photoItem.getHeight() == 0) {
            C58612c.m227290a().mo102829a(ImageLoader.with(this.f145292d), photoItem.getCurrentUrl(), photoItem.getImageKey(), photoItem.getEntityId(), C58659h.m227515a(photoItem), true, false, photoItem.getType(), false);
        } else {
            C58612c.m227290a().mo102828a(ImageLoader.with(this.f145292d), photoItem.getCurrentUrl(), photoItem.getImageKey(), photoItem.getEntityId(), C58659h.m227515a(photoItem), true, false, photoItem.getWidth(), photoItem.getHeight(), photoItem.getImageFormat(), photoItem.getType(), false);
        }
    }

    /* renamed from: c */
    private Pair<PhotoItem, Boolean> m228007c(String str) {
        ImageSet imageSet;
        TranslateImageKeysResponse a = mo199206a(str, this.f145290b);
        boolean z = false;
        if (a == null) {
            return Pair.create(null, false);
        }
        ImageTranslationInfo imageTranslationInfo = a.images_translation_info;
        if (imageTranslationInfo == null) {
            Log.m165389i("TranslateImage", "doTranslateReal: " + this.f145290b + " -> images_translation_info is null.");
            return Pair.create(null, false);
        }
        Map<String, TranslatedImage> map = imageTranslationInfo.translated_images;
        if (map == null || map.isEmpty()) {
            Log.m165389i("TranslateImage", "doTranslateReal: " + this.f145290b + " -> translated_images is empty.");
            return Pair.create(null, false);
        }
        Iterator<TranslatedImage> it = map.values().iterator();
        if (it.hasNext()) {
            imageSet = C58661j.m227527a(it.next().translated_image_set);
            imageSet.setMessageIdentity(this.f145294f.getMessageIdentity());
        } else {
            imageSet = null;
        }
        if (imageSet == null) {
            Log.m165389i("TranslateImage", "doTranslateReal: " + this.f145290b + " -> translatedImageSet is null.");
            return Pair.create(null, false);
        }
        PhotoItem a2 = C58661j.m227531a(imageSet, false);
        a2.getTranslateProperty().setTranslated(true);
        if (a.affect_entity_to_translate != null && a.affect_entity_to_translate.booleanValue()) {
            z = true;
        }
        return Pair.create(a2, Boolean.valueOf(z));
    }

    /* renamed from: d */
    private PhotoItem m228008d(final String str) {
        PhotoItem photoItem;
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_TRANSLATE_ORIGIN_IMAGE, new GetTranslateOriginImageRequest.C17733a().mo61906a(this.f145294f.getMessageId()).mo61905a(this.f145294f.getEntityType()).mo61908b(this.f145290b), new SdkSender.IParser<GetTranslateOriginImageResponse>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C587886 */

            /* renamed from: a */
            public GetTranslateOriginImageResponse parse(byte[] bArr) throws IOException {
                return GetTranslateOriginImageResponse.ADAPTER.decode(bArr);
            }
        });
        if (syncSendMayError.f131573b != null) {
            Log.m165383e("TranslateImage", "back2Origin: " + this.f145290b + " -> " + syncSendMayError.f131573b.getDebugMsg());
            ViewUtils.m224150a(syncSendMayError.f131573b.getDisplayMsg());
            return null;
        }
        T t = syncSendMayError.f131572a;
        Log.m165389i("TranslateImage", "back2Origin: " + this.f145290b + " GET_TRANSLATE_ORIGIN_IMAGE -> " + ((Object) t));
        com.bytedance.lark.pb.basic.v1.ImageSet imageSet = t.origin_image_set;
        if (imageSet == null || TextUtils.isEmpty(imageSet.key)) {
            photoItem = null;
        } else {
            ImageSet a = C58661j.m227527a(imageSet);
            a.setMessageIdentity(this.f145294f.getMessageIdentity());
            photoItem = C58661j.m227531a(a, true);
        }
        ImageSet a2 = C58661j.m227528a(t.origin_image_property);
        if (a2 != null) {
            a2.setMessageIdentity(this.f145294f.getMessageIdentity());
            photoItem = C58661j.m227531a(a2, true);
        }
        if (photoItem == null) {
            Log.m165389i("TranslateImage", "back2Origin: photoItem is null");
            return null;
        }
        final String a3 = C58661j.m227532a(photoItem);
        if (TextUtils.isEmpty(a3)) {
            Log.m165389i("TranslateImage", "back2Origin: originKey of photoItem is null");
            return null;
        }
        Log.m165389i("TranslateImage", "back2Origin: originKey -> " + a3);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.RunnableC587897 */

            public void run() {
                C58782i.this.mo199206a(str, a3);
            }
        });
        return photoItem;
    }

    /* renamed from: b */
    public PhotoItem mo199208b(String str) {
        PhotoItem photoItem;
        boolean z;
        if (this.f145296h) {
            Pair<PhotoItem, Boolean> c = m228007c(str);
            photoItem = (PhotoItem) c.first;
            z = ((Boolean) c.second).booleanValue();
        } else {
            photoItem = m228008d(str);
            z = false;
        }
        if (photoItem == null) {
            Log.m165389i("TranslateImage", "doTranslateSync: " + this.f145290b + " -> null");
            return null;
        }
        Log.m165389i("TranslateImage", "doTranslateSync: " + this.f145290b + " -> " + photoItem.getImageKey());
        m228005a(photoItem);
        if (this.f145297i == null || this.f145291c) {
            Log.m165389i("TranslateImage", "doTranslateSync: cancel");
            return null;
        }
        if (z) {
            Log.m165389i("TranslateImage", "notify translate msg");
            if (TextUtils.isEmpty(photoItem.getMessageId())) {
                Log.m165389i("TranslateImage", "msgId is null");
            } else {
                C57783ah.m224245a().mo196093a(-1, new C58640b(photoItem.getMessageId(), str));
            }
        }
        return photoItem;
    }

    /* renamed from: a */
    public TranslateImageKeysResponse mo199206a(String str, String str2) {
        TranslateImageKeysRequest.C18099a a = new TranslateImageKeysRequest.C18099a().mo62792a(this.f145294f.getMessageId()).mo62791a(this.f145294f.getEntityType()).mo62793a(Collections.singletonList(new ImageKeyInfo(str2, Boolean.valueOf(this.f145296h))));
        if (!TextUtils.isEmpty(str)) {
            a.mo62795b(str);
        }
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.TRANSLATE_IMAGE_KEYS, a, new SdkSender.IParser<TranslateImageKeysResponse>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.C587875 */

            /* renamed from: a */
            public TranslateImageKeysResponse parse(byte[] bArr) throws IOException {
                return TranslateImageKeysResponse.ADAPTER.decode(bArr);
            }
        });
        if (syncSendMayError.f131573b != null) {
            Log.m165383e("TranslateImage", "doTranslateRequest: " + str2 + " -> " + syncSendMayError.f131573b.getDebugMsg());
            ViewUtils.m224150a(syncSendMayError.f131573b.getDisplayMsg());
            return null;
        }
        T t = syncSendMayError.f131572a;
        Log.m165389i("TranslateImage", "doTranslateRequest: " + str2 + " -> TranslateImageKeysResponse: " + ((Object) t));
        return t;
    }

    public C58782i(Context context, boolean z, PhotoItem photoItem, AbstractC58790a aVar) {
        this.f145292d = context;
        this.f145293e = z;
        this.f145294f = photoItem;
        this.f145289a = aVar;
        this.f145295g = photoItem.getImageKey();
        Log.m165389i("TranslateImage", toString());
    }

    /* renamed from: a */
    public static void m228006a(List<AbstractC58768d> list, Context context, boolean z, PhotoItem photoItem, AbstractC58790a aVar) {
        if (photoItem != null) {
            list.add(new C58782i(context, z, photoItem, aVar));
        }
    }
}
