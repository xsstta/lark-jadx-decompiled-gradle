package com.ss.android.lark.keyboard.plugin.input.postinput;

import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;", "", "onSendInterrupted", "", "onSendPost", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "keepOrigin", "", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.a */
public interface OnSendPostCallback {
    /* renamed from: a */
    Observable<IPhotoDependency.Image> mo123218a(List<String> list, boolean z, AbstractC25974h hVar);

    /* renamed from: a */
    void mo123219a();

    /* renamed from: a */
    void mo123220a(String str, String str2, RichText richText);
}
