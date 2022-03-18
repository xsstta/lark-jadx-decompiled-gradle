package com.ss.android.lark.post.plugin;

import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/post/plugin/IThreadInputDelegate;", "", "onPressBack", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "onSendInterrupted", "onSendPost", "content", "", "triggerBySendButton", "", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.post.a.c */
public interface IThreadInputDelegate {
    /* renamed from: a */
    Observable<IPhotoDependency.Image> mo178655a(List<String> list, boolean z, AbstractC25974h hVar);

    /* renamed from: a */
    void mo178656a();

    /* renamed from: a */
    void mo178657a(RichText richText);

    /* renamed from: a */
    void mo178658a(String str, RichText richText, boolean z);
}
