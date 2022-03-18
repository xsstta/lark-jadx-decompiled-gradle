package com.ss.android.lark.audit.model;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable {
    public List<AuditEvent> events;
}
