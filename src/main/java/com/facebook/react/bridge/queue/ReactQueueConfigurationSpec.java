package com.facebook.react.bridge.queue;

import android.os.Build;
import com.facebook.infer.annotation.C21045a;

public class ReactQueueConfigurationSpec {
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) C21045a.m76676a(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) C21045a.m76676a(this.mJSQueueSpec));
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mJSQueueSpec == null) {
                z = true;
            } else {
                z = false;
            }
            C21045a.m76679a(z, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mNativeModulesQueueSpec == null) {
                z = true;
            } else {
                z = false;
            }
            C21045a.m76679a(z, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec messageQueueThreadSpec;
        if (Build.VERSION.SDK_INT < 21) {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", 2000000);
        } else {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(messageQueueThreadSpec).build();
    }

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }
}
