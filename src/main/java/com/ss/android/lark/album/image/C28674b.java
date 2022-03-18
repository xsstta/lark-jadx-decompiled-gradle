package com.ss.android.lark.album.image;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.album.image.AbstractC28689e;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.album.image.b */
public class C28674b extends BaseModel implements AbstractC28689e.AbstractC28690a {

    /* renamed from: a */
    private static int f72144a;

    /* renamed from: b */
    private String f72145b;

    /* renamed from: c */
    private List<ImageSet> f72146c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private boolean f72147d = true;

    /* renamed from: e */
    private int f72148e = -1;

    /* renamed from: f */
    private long f72149f = -1;

    /* renamed from: g */
    private String f72150g = "";

    /* renamed from: h */
    private int f72151h = 0;

    /* renamed from: i */
    private boolean f72152i;

    /* renamed from: j */
    private Context f72153j;

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28690a
    /* renamed from: a */
    public boolean mo102022a() {
        return this.f72147d;
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28690a
    /* renamed from: b */
    public List<ImageSet> mo102023b() {
        return this.f72146c;
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28690a
    /* renamed from: c */
    public String mo102024c() {
        return this.f72145b;
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28690a
    /* renamed from: d */
    public boolean mo102025d() {
        return this.f72152i;
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28690a
    /* renamed from: a */
    public void mo102019a(final IGetDataCallback<List<ChatImageViewData>> iGetDataCallback) {
        String str;
        if (this.f72146c.size() == 0) {
            str = "";
        } else {
            List<ImageSet> list = this.f72146c;
            str = list.get(list.size() - 1).getMessageIdentity().getMessageId();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ImageHistoryResponse.ResourceType.IMAGE);
        arrayList.add(ImageHistoryResponse.ResourceType.VIDEO);
        C32821b.m126120a().mo121013a(this.f72145b, str, ImageHistoryResponse.Direction.BEFORE, arrayList, f72144a, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<ImageHistoryResponse>() {
            /* class com.ss.android.lark.album.image.C28674b.C286751 */

            /* renamed from: a */
            public void onSuccess(ImageHistoryResponse imageHistoryResponse) {
                C28674b.this.mo102020a(imageHistoryResponse, iGetDataCallback);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    /* renamed from: a */
    private C28677a m105130a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(7, 1);
        long timeInMillis = instance.getTimeInMillis() / 1000;
        if (j >= timeInMillis) {
            return new C28677a(UIHelper.getString(R.string.Lark_Legacy_ThisWeek), timeInMillis);
        }
        instance.set(5, 1);
        long timeInMillis2 = instance.getTimeInMillis() / 1000;
        if (timeInMillis2 < timeInMillis && j >= timeInMillis2) {
            return new C28677a(UIHelper.getString(R.string.Lark_Legacy_ThisMonth), timeInMillis2);
        }
        instance.setTimeInMillis(j * 1000);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191591a(DatePreciseness.MONTH);
        aVar.mo191593a(LengthType.LONG);
        return new C28677a(TimeFormatUtils.m219289e(this.f72153j, new Date(instance.getTimeInMillis()), aVar), instance.getTimeInMillis() / 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ChatImageViewData> mo102018a(List<ImageSet> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ImageSet imageSet = list.get(i);
            long createTime = imageSet.getMessageIdentity().getCreateTime();
            long j = this.f72149f;
            if (j == -1 || createTime < j) {
                ChatImageViewData chatImageViewData = new ChatImageViewData();
                chatImageViewData.setThread(this.f72152i);
                chatImageViewData.setChatId(this.f72145b);
                chatImageViewData.setMessageId(imageSet.getMessageIdentity().getMessageId());
                chatImageViewData.setType(0);
                int i2 = this.f72151h;
                this.f72148e = this.f72146c.size() + i + i2;
                this.f72151h = i2 + 1;
                C28677a a = m105130a(createTime);
                this.f72149f = a.f72160b;
                chatImageViewData.setSectionFirstPosition(this.f72148e);
                chatImageViewData.setLabelText(a.f72159a);
                arrayList.add(chatImageViewData);
            }
            ChatImageViewData chatImageViewData2 = new ChatImageViewData();
            chatImageViewData2.setThread(this.f72152i);
            chatImageViewData2.setChatId(this.f72145b);
            chatImageViewData2.setMessageId(imageSet.getMessageIdentity().getMessageId());
            chatImageViewData2.setImageSet(list.get(i));
            if (list.get(i) instanceof MediaImageSet) {
                list.get(i).getMessageIdentity().setSourceType(Message.SourceType.TYPE_FROM_MESSAGE);
                chatImageViewData2.setType(2);
            } else {
                chatImageViewData2.setType(1);
            }
            chatImageViewData2.setSectionFirstPosition(this.f72148e);
            arrayList.add(chatImageViewData2);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.album.image.b$a */
    public static class C28677a {

        /* renamed from: a */
        public String f72159a;

        /* renamed from: b */
        public long f72160b;

        public C28677a(String str, long j) {
            this.f72159a = str;
            this.f72160b = j;
        }
    }

    /* renamed from: b */
    private void m105131b(final List<ChatImageViewData> list, final IGetDataCallback<List<ChatImageViewData>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (ChatImageViewData chatImageViewData : list) {
            arrayList.add(chatImageViewData.getMessageId());
        }
        C32848e.m126401b().mo121102a(arrayList, new IGetDataCallback<List<Message>>() {
            /* class com.ss.android.lark.album.image.C28674b.C286762 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<Message> list) {
                boolean z;
                if (!CollectionUtils.isEmpty(list)) {
                    for (Message message : list) {
                        for (ChatImageViewData chatImageViewData : list) {
                            if (TextUtils.equals(chatImageViewData.getMessageId(), message.getId())) {
                                if (message.getType() == Message.Type.POST) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                chatImageViewData.setFromPostMessage(z);
                            }
                        }
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(list);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo102020a(ImageHistoryResponse imageHistoryResponse, IGetDataCallback<List<ChatImageViewData>> iGetDataCallback) {
        if (imageHistoryResponse != null) {
            this.f72147d = imageHistoryResponse.isHasMoreBefore();
            List<ImageSet> imageSetList = imageHistoryResponse.getImageSetList();
            List<ChatImageViewData> a = mo102018a(imageSetList);
            this.f72146c.addAll(imageSetList);
            m105131b(a, iGetDataCallback);
            return;
        }
        iGetDataCallback.onSuccess(new ArrayList());
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28690a
    /* renamed from: a */
    public void mo102021a(List<String> list, IGetDataCallback<List<ChatImageViewData>> iGetDataCallback) {
        Iterator<ImageSet> it = this.f72146c.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ImageSet next = it.next();
            String messageId = next.getMessageIdentity().getMessageId();
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (TextUtils.equals(messageId, it2.next())) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.f72146c.remove(next);
            }
        }
        this.f72149f = -1;
        this.f72151h = 0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f72146c.size(); i++) {
            ImageSet imageSet = this.f72146c.get(i);
            long createTime = imageSet.getMessageIdentity().getCreateTime();
            long j = this.f72149f;
            if (j == -1 || createTime < j) {
                ChatImageViewData chatImageViewData = new ChatImageViewData();
                chatImageViewData.setThread(this.f72152i);
                chatImageViewData.setChatId(this.f72145b);
                chatImageViewData.setMessageId(imageSet.getMessageIdentity().getMessageId());
                chatImageViewData.setType(0);
                int i2 = this.f72151h;
                this.f72148e = i + i2;
                this.f72151h = i2 + 1;
                C28677a a = m105130a(createTime);
                this.f72149f = a.f72160b;
                this.f72150g = a.f72159a;
                chatImageViewData.setSectionFirstPosition(this.f72148e);
                chatImageViewData.setLabelText(a.f72159a);
                arrayList.add(chatImageViewData);
            }
            ChatImageViewData chatImageViewData2 = new ChatImageViewData();
            chatImageViewData2.setThread(this.f72152i);
            chatImageViewData2.setChatId(this.f72145b);
            chatImageViewData2.setMessageId(imageSet.getMessageIdentity().getMessageId());
            chatImageViewData2.setImageSet(this.f72146c.get(i));
            if (this.f72146c.get(i) instanceof MediaImageSet) {
                this.f72146c.get(i).getMessageIdentity().setSourceType(Message.SourceType.TYPE_FROM_MESSAGE);
                chatImageViewData2.setType(2);
            } else {
                chatImageViewData2.setType(1);
            }
            chatImageViewData2.setLabelText(this.f72150g);
            chatImageViewData2.setLabelTime(this.f72149f);
            chatImageViewData2.setSectionFirstPosition(this.f72148e);
            arrayList.add(chatImageViewData2);
        }
        m105131b(arrayList, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    public C28674b(Context context, String str, boolean z) {
        int i;
        this.f72145b = str;
        this.f72152i = z;
        this.f72153j = context;
        if (DesktopUtil.m144301a(context)) {
            i = 60;
        } else {
            i = 25;
        }
        f72144a = i;
    }
}
