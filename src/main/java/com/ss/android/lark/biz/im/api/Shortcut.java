package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.Channel;
import java.io.Serializable;

public class Shortcut implements Serializable {
    private Channel channel;
    private int position;

    public enum Operation {
        UNKNOWN_OPERATION(0),
        ADD(1),
        DELETE(2),
        MODIFY(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Operation valueOf(int i) {
            return forNumber(i);
        }

        public static Operation forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_OPERATION;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i != 3) {
                return null;
            }
            return MODIFY;
        }

        private Operation(int i) {
            this.value = i;
        }
    }

    public Channel getChannel() {
        return this.channel;
    }

    public int getPosition() {
        return this.position;
    }

    public void setChannel(Channel channel2) {
        this.channel = channel2;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public Shortcut(Channel channel2) {
        this.channel = channel2;
    }

    public Shortcut(int i, String str) {
        this.channel = new Channel(i, str);
    }

    public Shortcut(Channel.Type type, String str) {
        this.channel = new Channel(type, str);
    }
}
