package com.ss.android.lark.chatsetting.impl.group.avatar.mvp;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.search.v1.SegmentTextRequest;
import com.bytedance.lark.pb.search.v1.SegmentTextResponse;
import com.huawei.hms.site.ActivityC23764o;
import com.huawei.hms.site.C23766q;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import com.ss.android.lark.chatsetting.impl.group.avatar.p1703e.C34582a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.C64034n;
import com.ss.android.vesdk.p3188b.C63954b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.b */
public abstract class AbstractC34590b extends BaseModel implements AbstractC34597d.AbstractC34598a {

    /* renamed from: b */
    private static final int[] f89329b = {R.color.lkui_B500, R.color.lkui_P500, R.color.lkui_T600, R.color.lkui_G600, R.color.lkui_L600, R.color.lkui_Y600, R.color.lkui_O600, R.color.lkui_C500};

    /* renamed from: c */
    private static final String[] f89330c = {AbstractC60044a.f149675a, C63954b.f161494a, "i", "j", "m", C64034n.f161683a, "nd", "nh", "ni", "nl", "ns", "nt", "nz", ActivityC23764o.f58839a, C23766q.f58841a, "v", "ws"};

    /* renamed from: a */
    private AbstractC34597d.AbstractC34598a.AbstractC34599a f89331a;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.b$a */
    protected interface AbstractC34593a {
        /* renamed from: a */
        void mo127763a(String str);

        /* renamed from: b */
        void mo127764b(String str);
    }

    public String ax_() {
        return "";
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34598a
    /* renamed from: c */
    public int[] mo127815c() {
        return f89329b;
    }

    /* renamed from: a */
    public void mo127813a(AbstractC34597d.AbstractC34598a.AbstractC34599a aVar) {
        this.f89331a = aVar;
    }

    /* renamed from: a */
    private String m134413a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C34582a.m134367a(8, str).mo127743a();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34598a
    /* renamed from: a */
    public int mo127810a(int i) {
        int[] iArr = f89329b;
        for (int i2 : iArr) {
            if (UIHelper.getColor(i2) == i) {
                return i2;
            }
        }
        return 0;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34598a
    /* renamed from: b */
    public void mo127814b(IGetDataCallback<List<String>> iGetDataCallback) {
        String ax_ = ax_();
        SegmentTextRequest.C18921a aVar = new SegmentTextRequest.C18921a();
        if (!TextUtils.isEmpty(ax_)) {
            aVar.f46807a = Collections.singletonList(ax_);
        }
        SdkSender.asynSendRequestNonWrap(Command.SEGMENT_TEXT, aVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback), new SdkSender.IParser<List<String>>() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.C345911 */

            /* renamed from: a */
            public List<String> parse(byte[] bArr) throws IOException {
                return AbstractC34590b.this.mo127811a(SegmentTextResponse.ADAPTER.decode(bArr).sentences);
            }
        });
    }

    /* renamed from: a */
    public List<String> mo127811a(List<SegmentTextResponse.Sentence> list) {
        ArrayList arrayList = new ArrayList();
        for (SegmentTextResponse.Sentence sentence : list) {
            for (SegmentTextResponse.Word word : sentence.words) {
                if (!TextUtils.isEmpty(word.cont) && Arrays.binarySearch(f89330c, word.pos) >= 0) {
                    arrayList.add(m134413a(word.cont));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo127812a(final Bitmap bitmap, final String str, final AbstractC34593a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.RunnableC345922 */

            public void run() {
                Throwable th;
                Exception e;
                File file = new File(str);
                if (!file.exists()) {
                    FileOutputStream fileOutputStream = null;
                    try {
                        file.createNewFile();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            aVar.mo127763a(str);
                            C26266d.m95082a(fileOutputStream2);
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            try {
                                Log.m165383e("AvatarEditModel", e.toString());
                                aVar.mo127764b(e.toString());
                                C26266d.m95082a(fileOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                C26266d.m95082a(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            C26266d.m95082a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        Log.m165383e("AvatarEditModel", e.toString());
                        aVar.mo127764b(e.toString());
                        C26266d.m95082a(fileOutputStream);
                    }
                }
            }
        });
    }
}
