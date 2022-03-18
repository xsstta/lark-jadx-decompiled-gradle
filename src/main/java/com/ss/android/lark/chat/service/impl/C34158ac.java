package com.ss.android.lark.chat.service.impl;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.base.p1400a.C29521b;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threaddetail.C55831i;
import com.ss.android.lark.threaddetail.ThreadDetailActivity;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.chat.service.impl.ac */
public class C34158ac implements AbstractC29524c {
    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: c */
    public int mo104617c() {
        return R.anim.hold;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: d */
    public int mo104618d() {
        return R.anim.hold;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: b */
    public String mo104616b() {
        return ThreadDetailActivity.class.getName();
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public int mo104613a() {
        return C29990c.m110930b().mo134592t().mo134414b();
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public C29520a mo104614a(Bundle bundle, C29521b bVar) {
        return new C29520a();
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public void mo104615a(Intent intent, final IGetDataCallback<Bundle> iGetDataCallback) {
        final ChatBundle chatBundle;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            chatBundle = ChatBundle.m109260a(extras);
        } else {
            chatBundle = null;
        }
        final C341591 r4 = new IGetDataCallback<Bundle>() {
            /* class com.ss.android.lark.chat.service.impl.C34158ac.C341591 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Bundle bundle) {
                if (bundle != null) {
                    bundle.putBoolean("key_need_redirect", false);
                }
                iGetDataCallback.onSuccess(bundle);
                if (bundle != null) {
                    C55831i.m216682a(C29990c.m110930b().mo134528a(), C29604ae.m109468a(bundle));
                }
            }
        };
        if (chatBundle == null) {
            Log.m165383e("ThreadFrame", "open thread failed，bundle is null");
            r4.onError(new ErrorResult("open thread failed，bundle is null"));
            return;
        }
        final String string = extras.getString("key_thread_id", "");
        final int i = extras.getInt("key_message_position", 0);
        if (TextUtils.isEmpty(string)) {
            Log.m165383e("ThreadFrame", "open thread failed，threadId is null");
            r4.onError(new ErrorResult("open thread failed，threadId is null"));
            return;
        }
        final AbstractC34230k a = C32881i.m126556a();
        final C32821b a2 = C32821b.m126120a();
        C57865c.m224574a(new C57865c.AbstractC57873d<ThreadTopic>() {
            /* class com.ss.android.lark.chat.service.impl.C34158ac.C341602 */

            /* renamed from: a */
            public ThreadTopic produce() {
                ThreadTopic a = a.mo106481a(string);
                if (a != null) {
                    return a;
                }
                return a.mo106486b(string);
            }
        }, new C57865c.AbstractC57871b<ThreadTopic>() {
            /* class com.ss.android.lark.chat.service.impl.C34158ac.C341613 */

            /* renamed from: a */
            public void consume(final ThreadTopic threadTopic) {
                if (threadTopic == null) {
                    String str = "open thread failed，failed to get thread,  id is" + string;
                    Log.m165383e("ThreadFrame", str);
                    r4.onError(new ErrorResult(str));
                    return;
                }
                C57865c.m224574a(new C57865c.AbstractC57873d<Chat>() {
                    /* class com.ss.android.lark.chat.service.impl.C34158ac.C341613.C341621 */

                    /* renamed from: a */
                    public Chat produce() {
                        return a2.mo120985a(threadTopic.getChannel().getId());
                    }
                }, new C57865c.AbstractC57871b<Chat>() {
                    /* class com.ss.android.lark.chat.service.impl.C34158ac.C341613.C341632 */

                    /* renamed from: a */
                    public void consume(final Chat chat) {
                        if (chat == null) {
                            String str = "open thread failed，get chat failed, chatId is:" + threadTopic.getChannel().getId();
                            Log.m165383e("ThreadFrame", str);
                            r4.onError(new ErrorResult(str));
                        } else if (chat.getChatMode() == Chat.ChatMode.THREAD_V2) {
                            C57865c.m224574a(new C57865c.AbstractC57873d<TopicGroup>() {
                                /* class com.ss.android.lark.chat.service.impl.C34158ac.C341613.C341632.C341641 */

                                /* renamed from: a */
                                public TopicGroup produce() {
                                    return a.mo106482a(threadTopic.getChannel().getId(), false);
                                }
                            }, new C57865c.AbstractC57871b<TopicGroup>() {
                                /* class com.ss.android.lark.chat.service.impl.C34158ac.C341613.C341632.C341652 */

                                /* renamed from: a */
                                public void consume(TopicGroup topicGroup) {
                                    C34158ac.this.mo126697a(threadTopic, chat, topicGroup, string, chatBundle, i, r4);
                                }
                            });
                        } else {
                            C34158ac.this.mo126697a(threadTopic, chat, null, string, chatBundle, i, r4);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo126697a(ThreadTopic threadTopic, Chat chat, TopicGroup topicGroup, String str, ChatBundle chatBundle, int i, IGetDataCallback<Bundle> iGetDataCallback) {
        Bundle bundle = new Bundle();
        bundle.putString("key_params_thread_id", str);
        bundle.putSerializable("key_params_thread", threadTopic);
        bundle.putSerializable("key_params_thread_chat", chat);
        bundle.putSerializable("key_params_thread_source", chat.getName());
        bundle.putSerializable("key_params_topic_group", topicGroup);
        if (!chatBundle.f74042p) {
            i = -100;
        }
        bundle.putInt("key_params_jump_position", i);
        iGetDataCallback.onSuccess(bundle);
    }
}
