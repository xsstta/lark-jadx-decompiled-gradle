package com.ss.android.lark.sticker.p2714a;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.dependency.IStickerModuleDependency;
import com.ss.android.lark.sticker.dto.C55077c;
import com.ss.android.lark.sticker.dto.StickerFileInfo;
import com.ss.android.lark.sticker.p2715b.AbstractC55065a;
import com.ss.android.lark.sticker.p2715b.AbstractC55067c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.a.b */
public class C54997b implements AbstractC55065a {

    /* renamed from: a */
    boolean f135934a;

    /* renamed from: b */
    private String f135935b;

    /* renamed from: c */
    private IStickerModuleDependency.AbstractC55074e f135936c;

    /* renamed from: a */
    private String m213638a() {
        String a = C55049o.m213735a(C54996a.m213619a().mo144097a());
        if (!TextUtils.isEmpty(this.f135935b)) {
            return C55049o.m213736a(C54996a.m213619a().mo144097a(), this.f135935b);
        }
        return a;
    }

    public C54997b(boolean z) {
        this.f135934a = z;
        this.f135936c = C54996a.m213619a().mo144098b();
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55065a
    /* renamed from: a */
    public void mo187819a(List<String> list) {
        List<String>[] split = CollectionUtils.split(list, 8);
        for (List<String> list2 : split) {
            this.f135936c.mo144106a(m213638a(), list2, null);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }
    }

    public C54997b(boolean z, String str) {
        this(z);
        this.f135935b = str;
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55065a
    /* renamed from: a */
    public void mo187818a(String str, AbstractC55067c cVar) {
        ArrayList arrayList = new ArrayList();
        Log.m165379d("StickerDownloader", "start download sticker " + str);
        if (cVar != null) {
            cVar.mo187914a(str);
        }
        arrayList.add(str);
        C55077c cVar2 = this.f135936c.mo144107b(m213638a(), arrayList).get(str);
        if (cVar2 != null) {
            StickerFileInfo stickerFileInfo = new StickerFileInfo();
            String a = cVar2.mo187955a();
            stickerFileInfo.setKey(a);
            stickerFileInfo.setFilePath(cVar2.mo187956b());
            stickerFileInfo.setUrl(cVar2.mo187956b());
            Log.m165379d("StickerDownloader", "download sticker complete " + a);
            if (cVar != null) {
                cVar.mo187913a(stickerFileInfo);
                return;
            }
            return;
        }
        Log.m165379d("StickerDownloader", "download sticker fail " + str);
        if (cVar != null) {
            cVar.mo187915b(str);
        }
    }
}
