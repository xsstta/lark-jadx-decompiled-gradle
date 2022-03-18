package com.ss.android.lark.ug.thirdshare.dependency;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.p2743a.AbstractC55729a;

@ClaymoreImpl(AbstractC55729a.class)
public class LarkShareContainerDepApiImpl implements AbstractC55729a {
    @Override // com.ss.android.lark.thirdshare.container.p2743a.AbstractC55729a
    public Fragment getShareContainerForwardPickFragment(LarkShareContainerConfig.InappConfig cVar) {
        return C51838a.m200992a().mo140393a(cVar);
    }

    @Override // com.ss.android.lark.thirdshare.container.p2743a.AbstractC55729a
    public Bitmap encodeQRCode(String str, int i, int i2, int i3) {
        return C51931a.m201432a().mo180837a(str, i, i2, i3);
    }
}
