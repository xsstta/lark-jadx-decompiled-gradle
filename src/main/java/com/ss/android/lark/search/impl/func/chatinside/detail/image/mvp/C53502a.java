package com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.common.C53412a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.searchcommon.dto.SearchImageHistory;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.a */
public class C53502a extends BaseModel implements AbstractC53514c.AbstractC53515a {

    /* renamed from: a */
    private static int f132176a;

    /* renamed from: b */
    private String f132177b;

    /* renamed from: c */
    private List<ImageSet> f132178c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private boolean f132179d = true;

    /* renamed from: e */
    private int f132180e = -1;

    /* renamed from: f */
    private long f132181f = -1;

    /* renamed from: g */
    private int f132182g = 0;

    /* renamed from: h */
    private boolean f132183h;

    /* renamed from: i */
    private Context f132184i;

    /* renamed from: j */
    private boolean f132185j;

    /* renamed from: k */
    private boolean f132186k;

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: a */
    public boolean mo182664a() {
        return this.f132179d;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: b */
    public List<ImageSet> mo182665b() {
        return this.f132178c;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: c */
    public String mo182667c() {
        return this.f132177b;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: d */
    public boolean mo182668d() {
        return this.f132183h;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: b */
    public void mo182666b(final IGetDataCallback<String> iGetDataCallback) {
        C53412a.m206845a(this.f132177b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53502a.C535053 */

            /* renamed from: a */
            public void onSuccess(String str) {
                iGetDataCallback.onSuccess(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: a */
    public void mo182660a(final IGetDataCallback<List<ChatInsideSearchImageViewData>> iGetDataCallback) {
        String str;
        if (this.f132178c.size() == 0) {
            str = "";
        } else {
            List<ImageSet> list = this.f132178c;
            str = list.get(list.size() - 1).getMessageIdentity().getMessageId();
        }
        C53258a.m205939a().mo181756f().mo181785a(this.f132177b, str, f132176a, this.f132185j, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<SearchImageHistory>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53502a.C535031 */

            /* renamed from: a */
            public void onSuccess(SearchImageHistory searchImageHistory) {
                C53502a.this.mo182661a(searchImageHistory, iGetDataCallback);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    /* renamed from: a */
    private C53507a m207207a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(7, 1);
        long timeInMillis = instance.getTimeInMillis() / 1000;
        if (j >= timeInMillis) {
            return new C53507a(UIHelper.getString(R.string.Lark_Legacy_ThisWeek), timeInMillis);
        }
        instance.set(5, 1);
        long timeInMillis2 = instance.getTimeInMillis() / 1000;
        if (timeInMillis2 < timeInMillis && j >= timeInMillis2) {
            return new C53507a(UIHelper.getString(R.string.Lark_Legacy_ThisMonth), timeInMillis2);
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
        return new C53507a(TimeFormatUtils.m219289e(this.f132184i, new Date(instance.getTimeInMillis()), aVar), instance.getTimeInMillis() / 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ChatInsideSearchImageViewData> mo182659a(List<ImageSet> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ImageSet imageSet = list.get(i);
            long createTime = imageSet.getMessageIdentity().getCreateTime();
            long j = this.f132181f;
            if (j == -1 || createTime < j) {
                ChatInsideSearchImageViewData chatInsideSearchImageViewData = new ChatInsideSearchImageViewData();
                chatInsideSearchImageViewData.setThread(this.f132183h);
                chatInsideSearchImageViewData.setChatId(this.f132177b);
                chatInsideSearchImageViewData.setMessageId(imageSet.getMessageIdentity().getMessageId());
                chatInsideSearchImageViewData.setType(0);
                int i2 = this.f132182g;
                this.f132180e = this.f132178c.size() + i + i2;
                this.f132182g = i2 + 1;
                C53507a a = m207207a(createTime);
                this.f132181f = a.f132197b;
                chatInsideSearchImageViewData.setSectionFirstPosition(this.f132180e);
                chatInsideSearchImageViewData.setLabelText(a.f132196a);
                arrayList.add(chatInsideSearchImageViewData);
            }
            ChatInsideSearchImageViewData chatInsideSearchImageViewData2 = new ChatInsideSearchImageViewData();
            chatInsideSearchImageViewData2.setThread(this.f132183h);
            chatInsideSearchImageViewData2.setChatId(this.f132177b);
            chatInsideSearchImageViewData2.setMessageId(imageSet.getMessageIdentity().getMessageId());
            chatInsideSearchImageViewData2.setImageSet(list.get(i));
            if (list.get(i) instanceof MediaImageSet) {
                list.get(i).getMessageIdentity().setSourceType(Message.SourceType.TYPE_FROM_MESSAGE);
                chatInsideSearchImageViewData2.setType(2);
            } else {
                chatInsideSearchImageViewData2.setType(1);
            }
            chatInsideSearchImageViewData2.setSectionFirstPosition(this.f132180e);
            arrayList.add(chatInsideSearchImageViewData2);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.a$a */
    public static class C53507a {

        /* renamed from: a */
        public String f132196a;

        /* renamed from: b */
        public long f132197b;

        public C53507a(String str, long j) {
            this.f132196a = str;
            this.f132197b = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m207208a(IGetDataCallback iGetDataCallback, Message message) {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(message);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: a */
    public void mo182662a(final String str, IGetDataCallback<Message> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Message>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53502a.C535064 */

            /* renamed from: a */
            public Message produce() {
                Map<String, Message> c = C53258a.m205939a().mo181756f().mo181798c(Collections.singletonList(str));
                if (CollectionUtils.isEmpty(c)) {
                    return null;
                }
                return c.get(str);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.$$Lambda$a$o5GTRLr3gFYlJSB4GJgKz_UQek */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C53502a.m270951lambda$o5GTRLr3gFYlJSB4GJgKz_UQek(IGetDataCallback.this, (Message) obj);
            }
        });
    }

    /* renamed from: b */
    private void m207209b(final List<ChatInsideSearchImageViewData> list, final IGetDataCallback<List<ChatInsideSearchImageViewData>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : list) {
            arrayList.add(chatInsideSearchImageViewData.getMessageId());
        }
        C53258a.m205939a().mo181756f().mo181789a(arrayList, new IGetDataCallback<List<Message>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53502a.C535042 */

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
                        for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : list) {
                            if (TextUtils.equals(chatInsideSearchImageViewData.getMessageId(), message.getId())) {
                                if (message.getType() == Message.Type.POST) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                chatInsideSearchImageViewData.setFromPostMessage(z);
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
    public void mo182661a(SearchImageHistory searchImageHistory, IGetDataCallback<List<ChatInsideSearchImageViewData>> iGetDataCallback) {
        if (searchImageHistory != null) {
            this.f132179d = searchImageHistory.isHasMoreBefore();
            List<ImageSet> imageSetList = searchImageHistory.getImageSetList();
            List<ChatInsideSearchImageViewData> a = mo182659a(imageSetList);
            this.f132178c.addAll(imageSetList);
            if (this.f132186k) {
                m207209b(a, iGetDataCallback);
            } else {
                iGetDataCallback.onSuccess(a);
            }
        } else {
            iGetDataCallback.onSuccess(new ArrayList());
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53515a
    /* renamed from: a */
    public void mo182663a(List<String> list, IGetDataCallback<List<ChatInsideSearchImageViewData>> iGetDataCallback) {
        Iterator<ImageSet> it = this.f132178c.iterator();
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
                this.f132178c.remove(next);
            }
        }
        this.f132181f = -1;
        this.f132182g = 0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f132178c.size(); i++) {
            ImageSet imageSet = this.f132178c.get(i);
            long createTime = imageSet.getMessageIdentity().getCreateTime();
            long j = this.f132181f;
            if (j == -1 || createTime < j) {
                ChatInsideSearchImageViewData chatInsideSearchImageViewData = new ChatInsideSearchImageViewData();
                chatInsideSearchImageViewData.setThread(this.f132183h);
                chatInsideSearchImageViewData.setChatId(this.f132177b);
                chatInsideSearchImageViewData.setMessageId(imageSet.getMessageIdentity().getMessageId());
                chatInsideSearchImageViewData.setType(0);
                int i2 = this.f132182g;
                this.f132180e = i + i2;
                this.f132182g = i2 + 1;
                C53507a a = m207207a(createTime);
                this.f132181f = a.f132197b;
                chatInsideSearchImageViewData.setSectionFirstPosition(this.f132180e);
                chatInsideSearchImageViewData.setLabelText(a.f132196a);
                arrayList.add(chatInsideSearchImageViewData);
            }
            ChatInsideSearchImageViewData chatInsideSearchImageViewData2 = new ChatInsideSearchImageViewData();
            chatInsideSearchImageViewData2.setThread(this.f132183h);
            chatInsideSearchImageViewData2.setChatId(this.f132177b);
            chatInsideSearchImageViewData2.setMessageId(imageSet.getMessageIdentity().getMessageId());
            chatInsideSearchImageViewData2.setImageSet(this.f132178c.get(i));
            if (this.f132178c.get(i) instanceof MediaImageSet) {
                this.f132178c.get(i).getMessageIdentity().setSourceType(Message.SourceType.TYPE_FROM_MESSAGE);
                chatInsideSearchImageViewData2.setType(2);
            } else {
                chatInsideSearchImageViewData2.setType(1);
            }
            chatInsideSearchImageViewData2.setSectionFirstPosition(this.f132180e);
            arrayList.add(chatInsideSearchImageViewData2);
        }
        m207209b(arrayList, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    public C53502a(Context context, String str, boolean z, boolean z2, boolean z3) {
        int i;
        this.f132177b = str;
        this.f132183h = z;
        this.f132184i = context;
        if (DesktopUtil.m144301a(context)) {
            i = 60;
        } else {
            i = 25;
        }
        f132176a = i;
        this.f132185j = z2;
        this.f132186k = z3;
    }
}
