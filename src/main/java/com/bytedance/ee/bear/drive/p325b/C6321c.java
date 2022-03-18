package com.bytedance.ee.bear.drive.p325b;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.mimetype.MimeTypeCategory;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.AbstractC10814b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.MutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.b.c */
public class C6321c {

    /* renamed from: a */
    private static ArrayMap<MimeTypeCategory, Boolean> f17524a;

    static {
        ArrayMap<MimeTypeCategory, Boolean> arrayMap = new ArrayMap<>(6);
        f17524a = arrayMap;
        arrayMap.put(MimeTypeCategory.DOCUMENT, false);
        f17524a.put(MimeTypeCategory.VIDEO, false);
        f17524a.put(MimeTypeCategory.AUDIO, false);
        f17524a.put(MimeTypeCategory.IMAGE, true);
    }

    /* renamed from: a */
    private static SpaceFileOpenEntity m25397a(Document document) {
        String str;
        SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(document.mo32472o(), ((AbstractC10814b) KoinJavaComponent.m268610a(AbstractC10814b.class)).mo40909a(document.mo32469n()));
        spaceFileOpenEntity.setFileExt(document.mo32377C());
        spaceFileOpenEntity.setUrl(document.mo32481s());
        spaceFileOpenEntity.setMountNodeToken(document.mo32393K());
        spaceFileOpenEntity.setMountPoint(document.mo32395L());
        spaceFileOpenEntity.setHasSpaceCache(document.mo32464l());
        if (TextUtils.isEmpty(document.mo32395L())) {
            str = "explorer";
        } else {
            str = document.mo32395L();
        }
        spaceFileOpenEntity.setMountPoint(str);
        return spaceFileOpenEntity;
    }

    /* renamed from: a */
    public static Triple<ArrayList<BaseOpenEntity>, SpaceFileOpenEntity, Integer> m25398a(List<Document> list, String str) {
        C13479a.m54764b("DriveComponent", "generateDriveFileItemEntity() routeIndexObjToken=" + C13598b.m55200g(str));
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = new ArrayList<>();
        }
        AbstractC7095c d = C6920b.m27342f().mo27169d();
        SpaceFileOpenEntity spaceFileOpenEntity = null;
        for (Document document : list) {
            if (TextUtils.equals(str, document.mo32472o())) {
                spaceFileOpenEntity = m25397a(document);
            }
        }
        if (spaceFileOpenEntity == null) {
            C13479a.m54775e("DriveComponent", "generateDriveFileItemEntity() can't find fileList item from route token， just add token to open");
            SpaceFileOpenEntity spaceFileOpenEntity2 = new SpaceFileOpenEntity(str, "");
            arrayList.add(spaceFileOpenEntity2);
            return new MutableTriple(arrayList, spaceFileOpenEntity2, 0);
        }
        Boolean bool = f17524a.get(d.mo27711a(spaceFileOpenEntity.getFileExt(), null).mo27726a());
        if (bool == null || !bool.booleanValue()) {
            C13479a.m54764b("DriveComponent", "generateDriveFileItemEntity() isMultiFile is false, ext=" + spaceFileOpenEntity.getFileExt());
            arrayList.add(spaceFileOpenEntity);
            return new MutableTriple(arrayList, spaceFileOpenEntity, 0);
        }
        int min = Math.min(list.size(), 1000);
        int i = -1;
        for (Document document2 : list) {
            if (d.mo27713b(spaceFileOpenEntity.getFileExt(), document2.mo32377C())) {
                arrayList.add(m25397a(document2));
                if (TextUtils.equals(spaceFileOpenEntity.getFileId(), document2.mo32472o())) {
                    i = arrayList.size() - 1;
                }
                if (arrayList.size() >= min) {
                    break;
                }
            }
        }
        return new MutableTriple(arrayList, spaceFileOpenEntity, Integer.valueOf(i));
    }
}
