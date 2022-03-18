package com.ss.android.lark.biz.im.api;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.thread.TopicGroup;

public interface IThreadService {
    /* renamed from: a */
    ThreadTopic mo106481a(String str);

    /* renamed from: a */
    TopicGroup mo106482a(String str, boolean z);

    /* renamed from: a */
    void mo106483a(int i, String str, IGetDataCallback<TopicGroupsResponse> iGetDataCallback);

    /* renamed from: a */
    void mo106484a(IGetDataCallback<C29596a> iGetDataCallback);

    /* renamed from: a */
    void mo106485a(String str, IGetDataCallback<ThreadTopic> iGetDataCallback);

    /* renamed from: b */
    ThreadTopic mo106486b(String str);

    /* renamed from: b */
    void mo106487b(String str, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: c */
    void mo106488c(String str, IGetDataCallback<Object> iGetDataCallback);

    /* renamed from: d */
    void mo106489d(String str, IGetDataCallback<Object> iGetDataCallback);

    public enum FetchScene {
        FIRST_SCREEN(1, "First screen"),
        SPECIFIED_POSITION(2, "Specified position"),
        PREVIOUS_PAGE(3, "Previous page"),
        NEXT_PAGE(4, "Next page");
        
        private final String desc;
        private final int value;

        public String getDesc() {
            return this.desc;
        }

        public int getNumber() {
            return this.value;
        }

        public static FetchScene fromValue(int i) {
            if (i == 1) {
                return FIRST_SCREEN;
            }
            if (i == 2) {
                return SPECIFIED_POSITION;
            }
            if (i == 3) {
                return PREVIOUS_PAGE;
            }
            if (i != 4) {
                return FIRST_SCREEN;
            }
            return NEXT_PAGE;
        }

        private FetchScene(int i, String str) {
            this.value = i;
            this.desc = str;
        }
    }
}
