package com.ss.android.lark.keyboard.plugin.tool.preview;

import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenShotDependency;", "", "requestScreenshot", "", "iScreenshotCallBack", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenshotCallBack;", "sendImage", "", "paths", "", "", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.d */
public interface IScreenShotDependency {
    /* renamed from: a */
    Observable<IPhotoDependency.Image> mo122122a(List<String> list, AbstractC25974h hVar);

    /* renamed from: a */
    void mo122123a(IScreenshotCallBack eVar);

    /* renamed from: a */
    boolean mo122124a(List<String> list);
}
