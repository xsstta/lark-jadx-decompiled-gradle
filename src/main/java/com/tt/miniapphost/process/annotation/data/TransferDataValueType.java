package com.tt.miniapphost.process.annotation.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface TransferDataValueType {
    Class valueType();
}
