package com.larksuite.component.blockit.entity;

import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BlockExtra implements Serializable {
    public String contextJson;
    public Map<String, Object> hitPointParams;
    public MultiMessage multiMessage;
    public String parentMsgSenderId;
    public RichTextMessage richTextMessage;
    public SceneType sceneType;

    public Map<String, Object> getHitPointParams() {
        Map<String, Object> map = this.hitPointParams;
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public enum SceneType {
        THREAD_TOPIC(1),
        THREAD_REPLY(2),
        THREAD_MULTI(3),
        MESSAGE_TOOLBAR(4),
        INPUT_BOX(5),
        CHAT_MULTI(6);
        
        private final int value;

        private SceneType(int i) {
            this.value = i;
        }
    }
}
