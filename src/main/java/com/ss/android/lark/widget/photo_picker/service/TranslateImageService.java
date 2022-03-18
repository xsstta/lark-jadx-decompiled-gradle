package com.ss.android.lark.widget.photo_picker.service;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.ImageTranslationAbility;
import com.bytedance.lark.pb.im.v1.DetectImagesLanguageRequest;
import com.bytedance.lark.pb.im.v1.DetectImagesLanguageResponse;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.widget.photo_picker.entity.C58639a;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.photo_picker.p2951f.C58661j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum TranslateImageService {
    INSTANCE;
    
    private Map<String, ImageTranslationAbility> imageKeyCanTranslateMap = new ConcurrentHashMap();
    private List<C58639a> imageSupportedLanguageList;
    private String targetLanguageKey;

    public String getTargetLanguageKey() {
        return this.targetLanguageKey;
    }

    public List<C58639a> getImageSupportedLanguageList() {
        List<C58639a> list = this.imageSupportedLanguageList;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public void detectCanTranslate(PhotoItem photoItem) {
        detectCanTranslate(Collections.singletonList(photoItem));
    }

    private void setTranslateAbility(PhotoItem photoItem) {
        boolean z;
        List<String> list;
        ImageTranslationAbility imageTranslationAbility = this.imageKeyCanTranslateMap.get(C58661j.m227532a(photoItem));
        if (imageTranslationAbility != null) {
            PhotoItem.TranslateProperty translateProperty = photoItem.getTranslateProperty();
            if (imageTranslationAbility.can_translate == null) {
                z = false;
            } else {
                z = imageTranslationAbility.can_translate.booleanValue();
            }
            translateProperty.setCanTranslate(z);
            PhotoItem.TranslateProperty translateProperty2 = photoItem.getTranslateProperty();
            if (imageTranslationAbility.src_language == null) {
                list = new ArrayList<>();
            } else {
                list = imageTranslationAbility.src_language;
            }
            translateProperty2.setSrcLanguages(list);
        }
    }

    public void detectCanTranslate(List<PhotoItem> list) {
        final ArrayList<PhotoItem> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PhotoItem photoItem : list) {
            if (photoItem.getTranslateProperty().isTranslated()) {
                C53241h.m205898b("TranslateImage", photoItem.getImageKey() + " is translated");
            } else if (photoItem.getType() != 2) {
                C53241h.m205898b("TranslateImage", photoItem.getImageKey() + " is " + photoItem.getType());
            } else if (photoItem.isVideo()) {
                C53241h.m205898b("TranslateImage", photoItem.getImageKey() + " is video");
            } else if (TextUtils.isEmpty(photoItem.getMessageId())) {
                C53241h.m205898b("TranslateImage", photoItem.getImageKey() + " entityId is empty");
            } else if (C58659h.m227518b(photoItem)) {
                C53241h.m205898b("TranslateImage", photoItem.getImageKey() + " is from PreMessage");
            } else {
                arrayList.add(photoItem);
                arrayList2.add(photoItem.getImageKey() + " : originKey: " + photoItem.getOriginPicInfo().key);
            }
        }
        C53241h.m205898b("TranslateImage", arrayList2.toString());
        final ArrayList arrayList3 = new ArrayList();
        for (PhotoItem photoItem2 : arrayList) {
            String a = C58661j.m227532a(photoItem2);
            if (!TextUtils.isEmpty(a)) {
                if (this.imageKeyCanTranslateMap.containsKey(a)) {
                    setTranslateAbility(photoItem2);
                } else {
                    arrayList3.add(a);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            SdkSender.asynSendRequestNonWrap(Command.DETECT_IMAGE_LANGUAGE, new DetectImagesLanguageRequest.C17438a().mo61157a(arrayList3), new IGetDataCallback<List<ImageTranslationAbility>>() {
                /* class com.ss.android.lark.widget.photo_picker.service.TranslateImageService.C588281 */

                /* renamed from: a */
                public void onSuccess(List<ImageTranslationAbility> list) {
                    TranslateImageService.this.updatePhotoItemTransProperty(list, arrayList3, arrayList);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C53241h.m205894a("TranslateImage", arrayList3 + "\n" + errorResult.getDebugMsg());
                }
            }, new SdkSender.IParser<List<ImageTranslationAbility>>() {
                /* class com.ss.android.lark.widget.photo_picker.service.TranslateImageService.C588292 */

                /* renamed from: a */
                public List<ImageTranslationAbility> parse(byte[] bArr) throws IOException {
                    return DetectImagesLanguageResponse.ADAPTER.decode(bArr).images_translation_ability;
                }
            });
        }
    }

    private TranslateImageService() {
    }

    public void updatePhotoItemTransProperty(List<ImageTranslationAbility> list, List<String> list2, List<PhotoItem> list3) {
        C53241h.m205898b("TranslateImage", list2.toString() + "\n" + list.toString());
        if (list.size() != list2.size()) {
            C53241h.m205900d("TranslateImage", "detectKeysSize: " + list2.size() + ", imageTranslationAbilitiesSize: " + list.size());
            return;
        }
        for (int i = 0; i < list2.size(); i++) {
            this.imageKeyCanTranslateMap.put(list2.get(i), list.get(i));
        }
        for (PhotoItem photoItem : list3) {
            setTranslateAbility(photoItem);
        }
    }

    public void setImageSupportedLanguageList(String str, List<String> list, Map<String, String> map, Map<String, SrcLanguageConfig> map2) {
        C53241h.m205898b("TranslateImage", "TranslateImageService: " + str);
        this.targetLanguageKey = str;
        if (!(list == null || map == null)) {
            this.imageSupportedLanguageList = new ArrayList();
            for (String str2 : list) {
                if (map.containsKey(str2)) {
                    C58639a aVar = new C58639a(str2, map.get(str2));
                    aVar.mo198833a(map2);
                    this.imageSupportedLanguageList.add(aVar);
                }
            }
        }
    }
}
