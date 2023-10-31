/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.connector.oracle.logminer.processor.infinispan.marshalling;

import java.time.Instant;

import org.infinispan.protostream.annotations.ProtoAdapter;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import io.debezium.connector.oracle.logminer.processor.infinispan.TransactionInfo;

@ProtoAdapter(TransactionInfo.class)
public class TransactionInfoAdapter {

    @ProtoFactory
    public TransactionInfo factory(String scn, String ts) {
        return new TransactionInfo(scn, Instant.parse(ts));
    }

    @ProtoField(number = 1, required = true)
    public String getScn(TransactionInfo transaction) {
        return transaction.getScn();
    }

    @ProtoField(number = 2, required = true)
    public String getTs(TransactionInfo transaction) {
        return transaction.getTs().toString();
    }
}
