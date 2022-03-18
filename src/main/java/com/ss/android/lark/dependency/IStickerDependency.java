package com.ss.android.lark.dependency;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerSetListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface IStickerDependency {
    /* renamed from: a */
    Sticker mo134374a(String str);

    /* renamed from: a */
    List<Sticker> mo134375a();

    /* renamed from: a */
    void mo134376a(Activity activity);

    /* renamed from: a */
    void mo134377a(Context context, Message message);

    /* renamed from: a */
    void mo134378a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4);

    /* renamed from: a */
    void mo134379a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2);

    /* renamed from: a */
    void mo134380a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h hVar);

    /* renamed from: a */
    void mo134381a(IGetDataCallback<List<StickerSet>> iGetDataCallback);

    /* renamed from: a */
    void mo134382a(IPushStickerListener hVar);

    /* renamed from: a */
    void mo134383a(IPushStickerSetListener iVar);

    /* renamed from: a */
    void mo134384a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo134385a(List<Sticker> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo134386a(List<String> list, boolean z, IGetDataCallback<C36449a> iGetDataCallback);

    /* renamed from: b */
    StickerFileInfo mo134387b(String str);

    /* renamed from: b */
    List<Sticker> mo134388b();

    /* renamed from: b */
    void mo134389b(Activity activity);

    /* renamed from: b */
    void mo134390b(IPushStickerListener hVar);

    /* renamed from: b */
    void mo134391b(IPushStickerSetListener iVar);

    /* renamed from: c */
    void mo134392c();

    /* renamed from: com.ss.android.lark.dependency.IStickerDependency$a */
    public static class C36449a {

        /* renamed from: a */
        private List<Sticker> f94017a = new ArrayList();

        /* renamed from: b */
        private List<String> f94018b = new ArrayList();

        /* renamed from: a */
        public List<String> mo134393a() {
            return this.f94018b;
        }

        public C36449a(List<Sticker> list, List<String> list2) {
            this.f94017a = list;
            this.f94018b = list2;
        }
    }

    public static class UISticker implements Serializable {
        public final String filePath;
        public final int selected;
        public final Sticker sticker;

        public UISticker() {
            this.selected = -1;
            this.filePath = "";
        }

        public UISticker(Sticker sticker2) {
            this.sticker = sticker2;
            this.selected = -1;
            this.filePath = "";
        }

        public UISticker(Sticker sticker2, int i, String str) {
            this.sticker = sticker2;
            this.selected = i;
            this.filePath = str;
        }
    }

    public static class StickerFileInfo implements Serializable {
        public final String filePath;
        public final int height;
        public final String key;
        public String stickerId;
        public String stickerSetId;
        public final String url;
        public final int width;

        public StickerFileInfo(String str, String str2, String str3, int i, int i2, String str4, String str5) {
            this.key = str;
            this.url = str2;
            this.filePath = str3;
            this.width = i;
            this.height = i2;
            this.stickerSetId = str4;
            this.stickerId = str5;
        }
    }
}
